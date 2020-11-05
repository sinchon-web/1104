package loops;

import java.util.Scanner;

public class LoopTest02 {

	public static void main(String[] args) {
		
		//키보드로부터 입력처리하기위한 Object
		Scanner in=new Scanner(System.in);
		
		int num;
		System.out.printf("정수입력 : ");
		num=in.nextInt();//키보드에 입력된데이터를 int형으로 읽어들인다.
		
		int i=1;
		while(i<=num) {
			System.out.println("num : "+i);
			i++;
		}

	}

}
