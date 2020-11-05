package loops;

public class LoopTest01 {

	public static void main(String[] args) {
		
		
		for(int i=0; i<10; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		System.out.println();
		
		for(int i=0; i<10; i++) {
			if(i%2==1) //{
				continue;
			//}
			System.out.println(i);
			
		}
		
		int i=0;
		while(true) {
			
			if(i==10) {
				break;
			}
			System.out.println(i);
			i++;
		}
		
		System.out.println("-------");
		
		for(i=0;;i++) {
			if(i==10) {
				break;
			}
			System.out.println(i);
			
		}

	}

}
