package dataHoraTestes;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate d01 = LocalDate.now(); //gerando uma data pegando a atual
		LocalDateTime d02 = LocalDateTime.now(); // gerando a data atual com horas
		Instant d03 = Instant.now(); //gerando uma data atual, porém no fuso horário utc padrão de londres
		
		LocalDate d04 = LocalDate.parse("2022-07-20"); //Gerando uma data no padrão iso
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26.433"); //Gerando uma data no padrão iso com horas
		
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");//gerando um instant no padrão iso
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");//gerando um instant no padrão iso em utc calculando o fuso de são paulo
		
		LocalDate d08 = LocalDate.parse("20/07/2022",fmt1); //gerando uma data usando o date formatter
		LocalDateTime d09 = LocalDateTime.parse("11/07/2022 01:30",DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")); //chamando o dateformatter logo na função sem instanciar
		
		LocalDate d10 = LocalDate.of(2022, 10, 7);//instanciando com os valores separados
		LocalDateTime d11 = LocalDateTime.of(2022, 10, 07, 01, 30);//instanciando com os valores separados
		
		
		System.out.println("d01: "+d01);
		System.out.println("d02: "+d02);
		System.out.println("d03: "+d03);
		System.out.println("d04: "+d04);
		System.out.println("d05: "+d05);
		System.out.println("d06: "+d06);
		System.out.println("d07: "+d07);
		System.out.println("d08: "+d08);//
		System.out.println("d09: "+d09);
		System.out.println("d10: "+d10);
		System.out.println("d11: "+d11);
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("d04: "+d04.format(fmt2)); //imprimindo de forma formatada com fmt2
		System.out.println("d04: "+fmt2.format(d04)); //outra forma de usar
		System.out.println("d04: "+d04.format(DateTimeFormatter.ofPattern("dd/MM/yyy"))); //usando sem precisar instanciar
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println("d05: "+d05.format(fmt3));
		
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); //para formatar o tipo instant 
		//deve-se informar o local da data, com default ele pega do computador do usuário
		System.out.println("d06: "+fmt4.format(d06)); //imprimindo a data e hora na data atual e fuso do computador
		
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_DATE_TIME; //imprimindo no formato iso sem precisar especificar o formato
		System.out.println("d05: "+d05.format(fmt5));
		
		DateTimeFormatter fmt6 = DateTimeFormatter.ISO_INSTANT; //imprimindo para instante ele usa o padrão de utc se não especificar o fuso
		System.out.println("d06: "+fmt6.format(d06));

		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());//Transforma um instant em local com o fuso padrão da máquina do usuário
		System.out.println("r1: "+r1);
		
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));//usando um fuso de portugal
		System.out.println("r2: "+r2);
		
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());//Transforma um instant em local com o fuso padrão da máquina do usuário
		System.out.println("r3: "+r3);
		
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));//usando um fuso de portugal
		System.out.println("r4: "+r4);
		
		System.out.println("d04 dia: "+d04.getDayOfMonth()); //pegando somente o mês de uma data
		System.out.println("d05 horas: "+d05.getHour()); //pegando as horas de um datetime
		
		System.out.println("d04 in 7 days: "+d04.plusDays(7)); //adicionando 7 dias a variavel
		System.out.println("d04 before 20 weeks: "+d04.minusMonths(20));// tirando 20 meses
		System.out.println("d05 in 10 minutes: "+d05.plusMinutes(20)); //adicionando 20 minutos a d05
		System.out.println("d06 in 7 days: "+d06.plus(7, ChronoUnit.DAYS)); //adicionando 7 dias para variáveis instant
		
		Duration t1 = Duration.between(d05,d05.plusMinutes(20)); //calculando a diferença em minutos de d5 com d5 daqui a 20 minutos
		Duration t2 = Duration.between(d04.atStartOfDay(),d04.plusMonths(20).atStartOfDay()); //quando é date tem que informar os minutos
		Duration t3 = Duration.between(d06,d06.plus(7, ChronoUnit.DAYS)); //trabalhando com a diferença para instant
		Duration t4 = Duration.between(d06.plus(7, ChronoUnit.DAYS),d06);//calculando ao contrário, dá negativo - 7 dias
		
		System.out.println("t1 minutos: "+t1.toMinutes());
		System.out.println("t2 minutos: "+t2.toMinutes());
		System.out.println("t3 minutos: "+t3.toDays());
		System.out.println("t4 minutos: "+t4.toDays());
		
		DateTimeFormatter fmt7 = DateTimeFormatter.ofPattern("MM/yyyy");
		System.out.println("d04 mes ano: "+fmt7.format(d04));
	}

}
