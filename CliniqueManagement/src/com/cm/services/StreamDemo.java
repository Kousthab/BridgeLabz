package com.cm.services;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("abc","defdgfhdzs");
		List<String> longnames=names.stream().filter(str->str.length()>6).collect(Collectors.toList());
		longnames.forEach(System.out::println);
	}

}
