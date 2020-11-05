package loops;

import java.util.Scanner;

public class LoopTest06 {

	public static void main(String[] args) {
		
		
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		
		int count=1;
		
		for(int j=0 ; j<num ; j++){
			for(int i=0; i<num ; i++) {
				//System.out.print(i+1+(num*j)+" ");
				System.out.print(count +" ");
				count++;
			}
			System.out.println();
		}
		
		

	}

}
