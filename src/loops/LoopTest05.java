package loops;

import java.util.Scanner;

public class LoopTest05 {

	public static void main(String[] args) {
		
		
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		for(int j=0 ; j<num ; j++){
			for(int i=0; i<num ; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		

	}

}
