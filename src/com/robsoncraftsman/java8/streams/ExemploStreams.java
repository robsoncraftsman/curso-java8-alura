package com.robsoncraftsman.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreams {

	public static void main(final String[] args) {
		final List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Java", 1350));
		cursos.add(new Curso("Python", 2500));
		cursos.add(new Curso("TypeScript", 1700));
		cursos.add(new Curso("JavaScript", 5700));

		// Ordenação com method reference
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		cursos.forEach(System.out::println);

		// Filtro e ordenação com streams
		cursos.stream()
			.filter(c -> c.getAlunos() >= 2000)
			.sorted(Comparator.comparing(Curso::getNome, String.CASE_INSENSITIVE_ORDER))
			.forEach(System.out::println);

		// Map com streams
		cursos.stream()
			.map(Curso::getAlunos)
			.forEach(System.out::println);

		// Map para um IntStream
		final int totalAlunos = cursos.stream()
			.mapToInt(Curso::getAlunos)
			.sum();
		System.out.println(totalAlunos);

		// Map para um List<String>
		final List<String> nomesCurso = cursos.stream()
			.map(Curso::getNome)
			.collect(Collectors.toList());
		System.out.println(nomesCurso);
	}

}
