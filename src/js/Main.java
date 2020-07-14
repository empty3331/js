package js;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x,y;
		
		for (x = 2; x < 10; x++) {
			for (y = 1; y < 10; y++) {

				System.out.println(x + "*" + y + "=" + x * y+"\t");

			}
			System.out.println();
		}
		
		
		
		for(int i = 1; i <= 5; i++){
			for (int q = 0; q != i ; q++) {

				System.out.print("*");
				

			}
			System.out.println(" ");
		}

	}

}
