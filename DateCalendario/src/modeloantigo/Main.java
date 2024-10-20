package modeloantigo;

import java.util.Date;
import java.util.TimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
         
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date y1 = sdf1.parse("25/06/2018");
        Date y2 = sdf2.parse("25/06/2018 15:42:07");
        System.out.println(sdf2.format(y1));
        System.out.println(sdf2.format(y2));
        Date x1=new Date();
        System.out.println(sdf2.format(x1));
        Date x2 = new Date(System.currentTimeMillis());
        System.out.println(sdf2.format(x2));
        Date x3=new Date(0L);
        System.out.println(sdf2.format(x3));
        Date x4=new Date(1000L * 60 *60L * 5L);
        System.out.println(sdf2.format(x4));
        Date y3 =Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(sdf2.format(y3));
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
       // System.out.println(sdf2.format(sdf3.format()));
        System.out.println("-------------------------------");
        System.out.println(sdf3.format(y3));
        System.out.println(sdf3.format(x1));
        System.out.println(sdf3.format(x2));
        System.out.println(sdf3.format(x3));
	}

}
