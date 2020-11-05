package loops;

import java.util.Scanner;

public class LoopTest07 {

	public static void main(String[] args) {
		
		
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		for(int j=0 ; j<num ; j++){//j : 0, 1, 2
			// 3,2,1 : (3-j), (3-j), (3-j)
			for(int i=0; i<(num-j) ; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		

	}

}
