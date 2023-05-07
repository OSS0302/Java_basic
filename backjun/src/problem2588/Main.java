package problem2588;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    
        Scanner in = new Scanner(System.in);
        int C,D,E;
        int A = in.nextInt();
        int B = in.nextInt();
        
        C = A * (B%10);
        D = A * (B%100-B%10);
        E = A * (B - B%100);
        
        System.out.println(C);
        System.out.println(D/10);
        System.out.println(E/100);
        System.out.println(C+D+E);
 
        
    } 
}
 

