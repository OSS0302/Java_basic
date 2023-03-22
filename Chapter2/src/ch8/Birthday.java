package ch8;

public class Birthday {
	private int day;
	private int month;
	private int year;
	// getter and setter 는 데이터 가져오고 집어넣을 때쓴다. 수정할떄도 쓴다 .
	private boolean isValid; 
	
	public int getDay() {
		 return day;
	 }
	public void setDay(int day) {
		this.day =day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if (month <1 || month >12) {
			
			isValid= false;
		
		}else {
			isValid= true;
			this.month =month;
		}
		
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void showDate() 
	{
		if(isValid) {
			System.out.println(year+"년 "+month+"월 "+day+"입니다.");
		}else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}
	
}
