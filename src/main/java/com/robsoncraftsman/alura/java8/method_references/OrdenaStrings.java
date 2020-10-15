package com.robsoncraftsman.alura.java8.method_references;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {

	public static void main(final String[] args) {
		final List<String> palavras = new ArrayList<>();
		palavras.add("João");
		palavras.add("Vitória");
		palavras.add("Maria");
		palavras.add("Antônio");

		// Método utilitário do comparator
		palavras.sort(Comparator.comparing(s -> s.length()));
		System.out.println(palavras);

		// Usando a nova interface Function
		final Function<String, Integer> funcaoComparacao = new Function<String, Integer>() {
			@Override
			public Integer apply(final String nome) {
				return nome.length();
			}
		};
		final Comparator<String> comparador = Comparator.comparing(funcaoComparacao);
		palavras.sort(comparador);
		System.out.println(palavras);

		// Atribuindo um lambda a uma função
		final Function<String, Integer> funcaoComparacaoLambda = s -> s.length();
		palavras.sort(Comparator.comparing(funcaoComparacaoLambda));
		System.out.println(palavras);

		// Atribuindo a referência de um método para uma função
		final Function<String, Integer> referenciaFuncaoComparacao = String::length;
		palavras.sort(Comparator.comparing(referenciaFuncaoComparacao));
		System.out.println(palavras);

		// Passando diretamente a referência do método para o comparador
		palavras.sort(Comparator.comparing(String::length));
		System.out.println(palavras);

		// Atribuindo uma referência a um método para uma interface funcional
		final Consumer<String> impressor = System.out::println;
		palavras.forEach(impressor);

		// Passando uma referência a um método direto como um parâmetro
		// onde é esperado uma interface funcional
		palavras.forEach(System.out::println);

		// Usando comparador direto da classe String
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		palavras.forEach(System.out::println);
	}

}
