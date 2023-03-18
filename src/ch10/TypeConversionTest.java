package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {
//		int iNum =255;
//		byte bnum = (byte) iNum; // int 4바이트 byte는 1바이트 이기떄문에 타입 형변환을 해야한다.
//		
//		System.out.println(iNum);
//		
//		double dnum = 3.14;
//		int inum =(int) dnum;
//		System.out.println(inum);
//	
		double dnum =1.2;
		float fnum =0.9F;
		int inum1 = (int) (dnum +fnum);
		int inum2 = (int) dnum + (int)fnum;
		
		// inum1 =dnum+fnum 실수 먼저 더해지고 나서 1.2 +0.9 가 더해서 2.1  int로 형변환되면 2가되며
		// inum2 = 형변환 되고 나서 더해지기 때문에  1.2 ->1 로 0.9는 0으로 형변환이먼저 되서 더해지면 1로 된다.
		System.out.println(inum1);
		System.out.println(inum2);
	}
}
