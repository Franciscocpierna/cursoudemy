package datahora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class Calculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d04 = LocalDate.parse("2024-07-31");
		LocalDateTime d05 = LocalDateTime.parse("2024-07-31T01:30:26");
		Instant d06 = Instant.parse("2024-07-31T01:30:26Z");
		LocalDate semanapassada = d04.minusDays(7);
		LocalDate semanaproximasemana = d04.plusDays(7);
		LocalDate mais7anos =d04.plusYears(7);
        System.out.println("a semana passada dessa data "+d04+ " é "+semanapassada); 
        System.out.println("a semana passada dessa data "+d04+ " é "+semanaproximasemana);
        System.out.println("mais 7 anos data "+d04+ " é "+mais7anos);
        LocalDateTime semanapassadaDatetime = d05.minusDays(7);
		LocalDateTime semanaproximasemanaDatetime = d05.plusDays(7);
		System.out.println("a semana passada dessa data "+d05+ " é "+semanapassadaDatetime); 
	    System.out.println("a semana proxima t dessa data "+d05+ " é "+semanaproximasemanaDatetime);
	    Instant semanapassadainstant = d06.minus(7, ChronoUnit.DAYS);
		Instant semanaproximasemanainstant = d06.plus(7,ChronoUnit.DAYS);
		System.out.println("a semana passada uso Instant dessa data "+d05+ " é "+semanapassadainstant); 
	    System.out.println("a semana proxima uso Instant dessa data "+d05+ " é "+semanaproximasemanainstant);
	    
	    // duração entre duas datas
	    //Duration t1 = Duration.between(semanapassadaDatetime,d05);
	    Duration t1 = Duration.between(semanapassada.atStartOfDay(),d04.atTime(0,0));//atTime(0,0));ou d04.atStartOfDay()
	    Duration t2 = Duration.between(d05,semanaproximasemanaDatetime);// d05 primeiro para não dar negativo
	    Duration t3 = Duration.between(semanapassadainstant,d06);
	    Duration t4 = Duration.between(d06,semanaproximasemanainstant);
	    System.out.println("--------------------------------------------");
	    System.out.println("a semana passada d05 data "+d05+ " é "+t1.toDays()); 
	    System.out.println("a semana proxima sem e d05 dessa data "+d05+ " é "+t2.toDays());
	    System.out.println("--------------------------------------------");
	    System.out.println("a semana passada d05 data "+d06+ " é "+t3.toDays()); 
	    System.out.println("a semana passada d05 data "+d06+ " é "+t4.toDays());
	}

}
