package switchCase;

public class SwitchTest {

	public static void main(String[] args) {
		/*
		switch(정수){
		case 10:
			처리문;
		case 20:
		 	처리문;
		default:
			처리문;
		}
		*/
		
		int num=95;
		switch(num/10) {
		case 10:
		case 9://90번대 숫자
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
		

	}

}
