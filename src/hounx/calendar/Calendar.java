package hounx.calendar;

import java.util.Scanner;

public class Calendar {
    
	private static final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month-1];
	}
	public static void main(String[] args) {
	
		//숫자를 입력받아 해당하는 월의 최대일수를 출력하는 프로그램
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		System.out .println("달을 입력하세요");
		int month = scanner.nextInt();
		 
		System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal. getMaxDaysOfMonth(month) );
		scanner.close();
	}

}
