package com.robsoncraftsman.alura.java8.date_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ExercicioDateAPI {

	public static void main(final String[] args) {
		// Pegar a data atual (apenas data sem horas, segundos, etc
		final LocalDate agora = LocalDate.now();
		System.out.println(agora);

		// Adicionar um tempo a uma data
		final LocalDate agoraMaisNDias = agora.plusDays(30);
		System.out.println(agoraMaisNDias);

		// Criar uma data específica
		final LocalDate ultimoDiaAno = LocalDate.of(agora.getYear(), Month.DECEMBER, 31);
		System.out.println(ultimoDiaAno);

		// Calcular o período até o fim do ano
		final Period periodoAteFimDoAno = Period.between(agora, ultimoDiaAno);
		System.out.println(periodoAteFimDoAno);

		// Calcular quantos dias falta para o fim do ano
		final long diasAteFimDoAno = ChronoUnit.DAYS.between(agora, ultimoDiaAno);
		System.out.println(diasAteFimDoAno);

		// Calcular quantos dias falta para o fim do ano - Opção 2
		final long diasAteFimDoAnoOpcao2 = agora.until(ultimoDiaAno, ChronoUnit.DAYS);
		System.out.println(diasAteFimDoAnoOpcao2);

		// Formatar uma data
		final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		final String agoraString = dateFormatter.format(agora);
		System.out.println(agoraString);

		// Formatar uma data - Opção 2
		final String agoraStringOpcao2 = agora.format(dateFormatter);
		System.out.println(agoraStringOpcao2);

		// Para trabalhar com horas além da data
		final LocalDateTime agoraComHoras = LocalDateTime.now();
		System.out.println(agoraComHoras);

		// Formatar data com horas
		final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		System.out.println(agoraComHoras.format(dateTimeFormatter));

		// Pegar apenas o ano e mes corrente
		final YearMonth anoMesAtual = YearMonth.now();
		System.out.println(anoMesAtual);

		// Criar um horário específico
		final LocalTime horaEspecifica = LocalTime.of(15, 30);
		System.out.println(horaEspecifica);

		// Exercício
		final LocalDate dataExercicio = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(dataExercicio);
		final Period periodoExercicio = Period.between(LocalDate.now(), dataExercicio);
		System.out.println(periodoExercicio);

	}

}
