import java.util.*;

public class InputCalendar {
	static char[] weeks = {'일','월','화','수','목','금','토'};
	static int[] lastDay  = {31,28,31,30,31,30,31,31,30,31,30,31};
	private static int getMonth(int year, int month) {
		if(month < 1 || month > 12) {
			System.out.println("월을 잘못입력하였습니다. ");			
		}else {
			System.out.println(month + "월");
		}
		return month;
	}
	
	private static int getFirstDay(int year, int month) {
		int firstDay = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		for(int i = 0; i < month - 1; i++) {
			firstDay += lastDay[i];
		}
		return firstDay;
	}
	
	private static int[] getLastDay(int year, int month) {
		// TODO Auto-generated method stub
		//윤년체크 포함
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			lastDay[1] = 29;
		}else {
			lastDay[1] = 28;
		}
		return lastDay;
	}
	
	static void makeCalendar(int year, int month) {
		// TODO Auto-generated method stub
		System.out.println(year + "년 " + month + "월");
		
		int firstDay = getFirstDay(year, month);
		lastDay = getLastDay(year, month);
		month = getMonth(year, month);
		int week = firstDay % 7;
		
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t\n","월","화","수","목","금","토","일");
		
		for(int i = 0; i < week; i++) {
			System.out.print("\t");
		}
		for(int i = 1; i <= lastDay[month-1]; i++) {
			System.out.printf("%d\t",i);
			week++;
			if(week % 7 == 0)
				System.out.println();
		}
		if(week % 7 != 0) {
			System.out.println();
		}		
	
	}
}
