package com.robsoncraftsman.alura.java8.default_methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {

	public static void main(final String[] args) {
		final List<String> palavras = new ArrayList<>();
		palavras.add("João");
		palavras.add("Vitória");
		palavras.add("Maria");

		final ComparadorDeStringPorTamanho comparadorDeStringPorTamanho = new ComparadorDeStringPorTamanho();

		// Lista ordenada de forma antiga
		Collections.sort(palavras, comparadorDeStringPorTamanho);
		System.out.println(palavras);

		// Lista ordenada com o novo método sort da interface Collection
		palavras.sort(comparadorDeStringPorTamanho);
		System.out.println(palavras);
	}
}

class ComparadorDeStringPorTamanho implements Comparator<String> {

	@Override
	public int compare(final String s1, final String s2) {
		if (s1.length() < s2.length()) {
			return -1;
		} else if (s1.length() > s2.length()) {
			return 1;
		} else {
			return 0;
		}
	}

}
