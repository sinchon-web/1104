package loops;

public class WhileTest04 {

	public static void main(String[] args) {
		int i;
		int dan=2;
		
		while(dan<=9){
			System.out.println(dan+"단");
			i=1;
			
			while(i<=9){
				System.out.printf("%d*%d=%d\n", dan, i, dan*i);
				
				i++;
				
			}
			System.out.println();//줄바꿈
			dan++;
		}
		
		
		
		

	}

}
