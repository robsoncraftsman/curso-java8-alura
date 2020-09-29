package com.robsoncraftsman.java8.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumidorDeStrings {

	public static void main(final String[] args) {
		final List<String> palavras = new ArrayList<>();
		palavras.add("João");
		palavras.add("Vitória");
		palavras.add("Maria");

		// ForEach com classe anônima
		palavras.forEach(new Consumer<String>() {
			@Override
			public void accept(final String value) {
				System.out.println(value);
			}
		});

		// ForEach com lambda
		palavras.forEach((final String nome) -> {
			System.out.println(nome);
		});

		// ForEach com lambda omitindo o tipos do parâmetro
		palavras.forEach(nome -> {
			System.out.println(nome);
		});

		// ForEach com lambda omitindo o corpo da função
		palavras.forEach(nome -> System.out.println(nome));

		// Atribuir uma expressão lambda para uma variável
		// (referente a uma Interface Funcional)
		final Consumer<String> impressoraNomes = nome -> System.out.println(nome);
		palavras.forEach(impressoraNomes);
	}
}
