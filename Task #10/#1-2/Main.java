package com.gmail.t.bisyk;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<String> text = endlishText(new File("English.in"));
		List<String> word = new ArrayList<>();
		for (String line : text) {
			for (String wrd : line.split(" ")) {
				word.add(wrd);
			}
		}
		System.out.print("Do you want to a add word to the vocabulary (y/n): ");
		Scanner sc = new Scanner(System.in);
		for(;;) {
			String out = sc.nextLine();
			if (out.equals("n")) break;
			if (out.equals("y")) {
				saveWordToFile();
				break;
			}
			System.out.println("try egain");	
		}

		List<String> vcbText = endlishText(new File("vocabulary.txt"));
		Map<String, String> voc = maps(vcbText);
		
		StringBuilder sb = new StringBuilder();
		for (String wrd : word) {
			sb.append(voc.get(wrd));
			sb.append(" ");
		}
		
		try {
			FileWriter fw = new FileWriter(new File("Ukrainian.out"));
			fw.write(sb.toString());
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("----------------------------");
		System.out.println(sb.toString());

	}

	private static void saveWordToFile() {
		Scanner sc = new Scanner(System.in);
		boolean out = true;
		for(;out;) {
		try {
			FileWriter fw = new FileWriter(new File("vocabulary.txt"),true);
			System.out.print("English word: ");
			String en = sc.nextLine();
			System.out.print("Translate to Ukranian: ");
			String ua = sc.nextLine();
			String nword = en+" "+ua;
			fw.write(nword.toUpperCase()+"\n");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.print("do you want to repeat (y/n): ");
			for(;;) {
				String ot = sc.nextLine();
				if(ot.equals("y")) {
					break;
				}
				if(ot.equals("n")) {
					out = false;
					break;
				}
				System.out.println("try egain");	
			}
		}
	}

	public static List<String> endlishText(File file) {
		List<String> lines = new ArrayList<>();
		Stream<String> st;
		try {
			st = Files.newBufferedReader(Paths.get(file.getAbsolutePath()),Charset.forName("windows-1251"))
								 .lines()
								 .map(n -> n.toUpperCase());
		lines = st.collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}

	public static Map<String, String> maps(List<String> lines) {
		Map<String, String> voc = new HashMap<>();
		for (String line : lines) {
			boolean keyBool = true;
			String key = "";
			String valve = "";
			for (String wrd : line.split(" ")) {
				if (keyBool) {
					key = wrd;
					keyBool = false;
				}else {
					valve = wrd;
				}
			}
			voc.put(key, valve);
		}
		return voc;
	}
}
