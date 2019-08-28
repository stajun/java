package day11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam07 {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat format = 
			new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(format.format(date));
	}
}
