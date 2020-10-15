package com.robsoncraftsman.alura.java8.lambdas;

public class ExercicioThread {

	public static void main(final String[] args) {
		// Executando uma thread no modo convencional
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Executando um Runnable");
			}
		}).start();

		// Executando thread usando lambda
		new Thread(() -> System.out.println("Executando um Runnable com lambda")).start();
	}
}
