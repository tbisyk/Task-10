package com.gmail.t.bisyk;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// http://patorjk.com/software/taag/#p=display&c=c&f=4Max&t=V%20W%20X%20Y%20Z
		String text = "Hello word";

		Map<Character, StringBuilder> l = new HashMap<>();
		ShifrOne so = new ShifrOne();
		for (int i = 65; i < 91; i++) {
			l.put((char) i, so.shifrA(i));
		}
		l.put(' ', so.shifrA(91));
		int s = text.length();
		char[] w = text.toUpperCase().toCharArray();
		StringBuilder[] lo = new StringBuilder[s];
		String temp = "";
		for (int i = 0; i < s; i++) {
			lo[i] = new StringBuilder("");
			temp = l.get(w[i]).toString();
			lo[i].append(temp);
		}
		int row = temp.split("\n").length;
		int n = 0;
		char[] litter = temp.toCharArray();
		for(;litter[n]!='\n';) {
			n++;
		}
		StringBuilder out = new StringBuilder();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < s; j++) {
				out.append(lo[j].subSequence(0, (n-1))).append(" ");
				lo[j].delete(0, n+1);
			}
			out.append(System.lineSeparator());
		}
		System.out.println(out.toString());
	}

}
