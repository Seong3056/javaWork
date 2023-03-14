package etc.api.util.date;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		System.out.println("----------------------");
		//현재 날짜 정보 얻기 (연, 월, 일)
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		//현재 시간 정보 얻기 (시, 분, 초)
		LocalTime nowTime = LocalTime.now();
		System.out.println(nowTime);
		
		//현재 날짜와 시간 정보 얻기 (연, 월, 일, 시, 분, 초)
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		//특정 날짜와 시간 정보 얻기
		LocalDateTime beginDate = LocalDateTime.of(2022, 7, 1, 9, 0,0);
		System.out.println(beginDate);
		
		//연도 추출
		int year = localDateTime.getYear();
		System.out.println(year);

		Month month1 = localDateTime.getMonth();
		System.out.println(month1);
		int monthValue = localDateTime.getMonthValue();
		System.out.println(monthValue);
		
		System.out.println("--------------------------------------");
		
		//3일뒤
		LocalDateTime d = localDateTime.plusDays(3);
		System.out.println(d);

		//1년 2개월 7일 뒤
		LocalDateTime d1 = localDateTime.plusYears(1).plusMonths(2).plusDays(7);
		System.out.println(d1);
		
		//사이날짜 연산
		LocalDate b = LocalDate.of(2020,12,30);
		LocalDate f = LocalDate.of(2022,9,14);
		long bt = ChronoUnit.WEEKS.between(b, f);
		System.out.println(bt);
		
		System.out.println("--------------------------");
		
		//날짜 포맷변경
		System.out.println(localDateTime);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");
		System.out.println(localDateTime.format(dtf));
		
		
		
		
		
		
	}

}
