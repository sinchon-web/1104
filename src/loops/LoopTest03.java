package loops;

import java.util.Scanner;

public class LoopTest03 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		int num;
		
		do {
			System.out.println("1. 입력 2.계산 3.출력 4.종료");
			System.out.print("선택 > ");
			num=in.nextInt();
			if(num<=0 || 5<=num)
				System.out.println("1~4까지중 선택하세요");
		}while(num<=0 || 5<=num);
	
		
		switch (num) {
		case 1:
			System.out.println("입력처리 합니다.");
			break;
		case 2:
			System.out.println("계산처리 합니다.");
			break;
		case 3:
			System.out.println("출력처리 합니다.");
			break;
		case 4:
			System.out.println("프로그램을 종료합니다.");
			
		}

	}

}
