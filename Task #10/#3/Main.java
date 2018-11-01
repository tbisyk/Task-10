package com.gmail.t.bisyk;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Object[] rnd = new Object[10];
		List<Object> list = new ArrayList<>();
		System.out.println("-------------------------");

		rnd[0] = "aa";
		rnd[1] = "aa";
		rnd[2] = 1;
		rnd[3] = 1;
		rnd[4] = "a";
		rnd[5] = true;
		rnd[6] = "g";
		rnd[7] = "h";
		rnd[8] = true;
		rnd[9] = new File(".");
		
		Map<Object, Integer> number = cout(rnd);
		System.out.println(number);
	}

	public static <T>Map<T, Integer> cout(T[] rnd) {
		Map<T, Integer> number = new HashMap<>();
		for (T obj : rnd) {
			Integer val = number.get(obj);
			if (val == null) {
				number.put(obj, 1);
			}else {
				number.put(obj, val+1);
			}
		}
		return number;
	}
//  *************************************************************
//	public static Map<Object, Integer> cout(Object[] rnd) {
//		Map<Object, Integer> number = new HashMap<>();
//		for (Object obj : rnd) {
//			Integer val = number.get(obj);
//			if (val == null) {
//				number.put(obj, 1);
//			}else {
//				number.put(obj, val+1);
//			}
//		}
//		return number;
//	}

}
