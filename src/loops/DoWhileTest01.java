package loops;

public class DoWhileTest01 {

	public static void main(String[] args) {
		
		/*
		do {
			반복영역
		}while(조건문);
		*/
		
		do {
			System.out.println("반복영역");
		}while(false);
		
		int num;
		do {
			System.out.println("메뉴입력");
			num=10;
		}while(num<0 || num>3);
		
		int num1=0;
		while(num1<0 || num1>3) {
			System.out.println("메뉴입력");
			num=10;
		}
	}

}
