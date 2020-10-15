package com.robsoncraftsman.alura.java8.lambdas;

import java.util.ArrayList;
import java.util.List;

public class OrdenaStrings {

	public static void main(final String[] args) {
		final List<String> palavras = new ArrayList<>();
		palavras.add("João");
		palavras.add("Vitória");
		palavras.add("Maria");

		// Lista ordenada com lambda
		palavras.sort((s1, s2) -> {
			if (s1.length() < s2.length()) {
				return -1;
			} else if (s1.length() > s2.length()) {
				return 1;
			} else {
				return 0;
			}
		});
		System.out.println(palavras);

		// Lista ordenada com lambda e sintaxe reduzida
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		System.out.println(palavras);
	}
}
