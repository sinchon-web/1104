package loops;

import java.util.Scanner;

public class LoopTest08 {

	public static void main(String[] args) {
		
		
		//Scanner in=new Scanner(System.in);
		//int num=in.nextInt();
		int num=5;
		int c=num*2-1;//5
		for(int j=0 ; j< c ; j++){//j: 0, 1, 2,3 4
			
			if(j<num) {///j: 0, 1, 2
				// 1 ,2,3 : 0+1, 1+1, 2+1
				for(int i=0; i<j+1 ; i++) {
					System.out.print("* ");
				}
			}else {//j: 3,4
				//2,1  : 5-3, 5-4
				for(int i=0; i<c-j ; i++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
		

	}

}
