package application;

import java.text.SimpleDateFormat;
import java.util.Date;

public class program {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		
		System.out.println(sdf.format(date));

	}

}
