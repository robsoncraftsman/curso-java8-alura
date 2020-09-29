package com.robsoncraftsman.java8.default_methods;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumidorDeStrings {

	public static void main(final String[] args) {
		final List<String> palavras = new ArrayList<>();
		palavras.add("João");
		palavras.add("Vitória");
		palavras.add("Maria");

		palavras.forEach(new ImpressorNomes());

	}
}

class ImpressorNomes implements Consumer<String> {

	@Override
	public void accept(final String value) {
		System.out.println(value);
	}

}
