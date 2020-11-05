package loops;

import java.util.Scanner;

public class LoopTest04 {

	public static void main(String[] args) {
		
		//정수를 하나 입력받아서...
		//해당개수만큼 '*' 출력하세요..
		
		int data;
		Scanner in=new Scanner(System.in);
		//키보드에 입력된 문자를int로 읽어서 data변수로 저장
		data = in.nextInt();
		
		for(int i=0; i<data; i++) {
			System.out.print("* ");
		}
		System.out.println();
		for(; data>0; data--) {
			System.out.print("* ");
		}
	}

}
