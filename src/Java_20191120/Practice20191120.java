package Java_20191120;

public class Practice20191120 {
	public static void main(String[] args){
		for (int first = 1; first <= 9; first++) {
			for (int second = 2; second <=9; second++) {
				System.out.printf("%d * %d = %d%n",first ,second,first*second);
			}
		}
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
		    System.out.println();
		}
	}
	

}
