package com.robsoncraftsman.java8.optional;

public class Curso {

	private final String nome;
	private final int alunos;

	public Curso(final String nome, final int alunos) {
		super();
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return this.nome;
	}

	public int getAlunos() {
		return this.alunos;
	}

	@Override
	public String toString() {
		return "Curso [nome=" + this.nome + "]";
	}

}
