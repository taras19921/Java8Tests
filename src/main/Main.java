package main;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main
{

    public static void main(String[] args)
    {
	double h = 56322/10000;
	System.out.println("double = " + h);
	String str = "1986-04-08 12:30";
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	LocalDateTime localDateTime = LocalDateTime.parse(str, formatter);
	Date out = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
	System.out.println(out);
	new Thread(new SingletonTest()).start();
//	new Thread(new SingletonTest()).start();

    }

}
