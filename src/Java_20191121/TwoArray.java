package Java_20191121;

public class TwoArray {
	public static void main(String[] args){
		int[][] a = new int [3][2];
		a[0][0] = 10;
		a[0][1] = 20;
		a[1][0] = 30;
		a[1][1] = 40;
		a[2][0] = 50;
		a[2][1] = 60;
		
		int[][] b = {{10,20},{30,40},{50,60}};
		
		for(int i=0;i<a.length;i++){ //바깥은 3번 돌아감
			for(int j=0;j<a[i].length;j++){ //안은 2번 돌아감
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		int[][] c = {{1},{2,3},{4,5,6}};
		
		//이차원 배열의 동적생성
		int[][] d = new int[3][];
		d[0] = new int[1];
		d[1] = new int[2];
		d[2] = new int[3];
		d[0][0] = 1;
		d[1][0] = 2;
		d[1][1] = 3;
		d[2][0] = 4;
		d[2][1] = 5;
		d[2][2] = 6;
		
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) { //이제 크기가 동적이라 무조건 d[i].length로 해주어야 함
				System.out.print(d[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
