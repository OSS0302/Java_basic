package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {
		int iNum =255;
		byte bnum = (byte) iNum; // int 4바이트 byte는 1바이트 이기떄문에 타입 형변환을 해야한다.
		
		System.out.println(iNum);
		
		double dnum = 3.14;
		int inum =(int) dnum;
		System.out.println(inum);
	}

}
