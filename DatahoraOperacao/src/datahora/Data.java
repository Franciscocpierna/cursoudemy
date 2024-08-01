package datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Data {

	public static void main(String[] args) {
		LocalDate d01 =LocalDate.now();
		LocalDateTime d02 =LocalDateTime.now();
	/*	Instant d03=Instant.now();
		LocalDate d04 = LocalDate.parse("2024-07-31");
		LocalDateTime d05 = LocalDateTime.parse("2024-07-31T01:30:26");
		Instant d06 = Instant.parse("2024-07-31T01:30:26Z");
		Instant d07 = Instant.parse("2024-07-31T01:30:26-03:00");
		DateTimeFormatter fmt1=DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); 
		LocalDate d08 = LocalDate.parse("31/07/2024",fmt1);
		LocalDateTime d09 = LocalDateTime.parse("31/07/2024 01:30",fmt2);
		LocalDate d10 = LocalDate.of(2024, 7, 31);
		LocalDateTime d11 = LocalDateTime.of(2024, 7, 31, 01, 30);
		*/
		/*System.out.println("d01 = "+d01.toString());//implicitamente nos outros poderia usar toString() dando mesmo resultado
		System.out.println("d02 = "+d02);
		System.out.println("d03 = "+d03);
		System.out.println("d05 = "+d05);
		System.out.println("d06 = "+d06);
		System.out.println("d07 = "+d07);
		System.out.println("d08 = "+d08.toString());
		System.out.println("d09 = "+d09.toString());
		System.out.println("d10 = "+d10.toString());
		System.out.println("d11 = "+d11.toString());
		*/
		DateTimeFormatter fmt1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d04 = LocalDate.parse("2024-07-31");
		System.out.println("d04 = "+d04.format(fmt1));// ou
		System.out.println("d04 = "+fmt1.format(d04)); //ou
		System.out.println("d04 = "+d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); 
		LocalDateTime d09 = LocalDateTime.parse("31/07/2024 01:30",fmt2);
		System.out.println("d09 = "+fmt2.format(d09)); 
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		Instant d06 = Instant.parse("2024-07-31T01:30:26Z");
		System.out.println("d06 = "+fmt3.format(d06)); 
		DateTimeFormatter fmt5= DateTimeFormatter.ISO_INSTANT;
		DateTimeFormatter fmt4= DateTimeFormatter.ISO_DATE_TIME;
		LocalDateTime d05 = LocalDateTime.parse("2024-07-31T01:30:26");
		System.out.println("d05 = "+fmt4.format(d05)); //OU
		System.out.println("d05 = "+d05.format(fmt4));// 
		System.out.println("d06 = "+fmt5.format(d06));//ou
		System.out.println("d06 = "+d06.toString());
	}    
}
