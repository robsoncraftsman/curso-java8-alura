package com.robsoncraftsman.alura.java8.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class ExemploOptional {

	public static void main(final String[] args) {
		final List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Java", 1350));
		cursos.add(new Curso("Python", 2500));
		cursos.add(new Curso("TypeScript", 1700));
		cursos.add(new Curso("JavaScript", 5700));

		// Ao pegar um elemento qualquer de um Stream
		// é retornado um Optional
		final Optional<Curso> cursoOpcional = cursos.stream()
			.filter(c -> c.getAlunos() > 2000)
			.findFirst();

		// Testar se existe um valor dentro do Optional
		if (cursoOpcional.isPresent()) {
			System.out.println(cursoOpcional.get());
		}

		// Pegar um valor ou um default case ele não exista
		final Curso cursoOrElse = cursoOpcional.orElse(null);
		System.out.println(cursoOrElse);

		// Executar algo case o valor exista
		cursoOpcional.ifPresent(System.out::println);

		// O métdo average do stream, por exemplo, retorna um OptionalDouble
		final OptionalDouble mediaAlunos = cursos.stream().mapToInt(Curso::getAlunos).average();
		mediaAlunos.ifPresent(System.out::println);
	}

}
