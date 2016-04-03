package Lv03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex_1924 {
	//date = '2007-10-20', pattern= 'yyyy-MM-dd'
	public static void disResult(String date, String pattern) throws Exception{
		String day = "";

		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		Date nDate = dateFormat.parse(date);

		Calendar cal = Calendar.getInstance();
		cal.setTime(nDate);

		int dayNum = cal.get(Calendar.DAY_OF_WEEK);

		// SUN, MON, TUE, WED, THU, FRI, SAT
		switch(dayNum){
		case 1:
			day = "SUN";
			break ;
		case 2:
			day = "MON";
			break ;
		case 3:
			day = "TUE";
			break ;
		case 4:
			day = "WED";
			break ;
		case 5:
			day = "THU";
			break ;
		case 6:
			day = "FRI";
			break ;
		case 7:
			day = "SAT";
			break ;
		}
		System.out.println(day);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String pattern = "yyyy-MM-dd";
		String date = "2007-";
		String mm,dd;
		
		try {
			mm = s.next();
			dd = s.next();

			// 월 저장
			if(mm.length() == 1){
				date = date + "0" + mm; 
			}else{
				date += mm;
			}

			// 일 저장
			date += "-" + dd;

			disResult(date, pattern);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
