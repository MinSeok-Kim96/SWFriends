package Control3;

public class E06 {

	public static void main(String[] args) {

		int num = 1;
		int [][] soo = new int[3][3];
		for(int i=0;i<soo.length;i++) {
			for(int j=0;j<soo[1].length;j++) {
				soo[j][i]=num++;
			}
		}
		for (int i = 0; i < soo.length; i++) {
			for (int j = 0; j < soo[i].length; j++) {
				System.out.print(soo[i][j]);
			}
			System.out.println();
		}
		double [] k=new double[3];
		double [] k2= {3.13,5.7,4.8};
		char [] ch=new char[5];
		char [] ch2={'A','가','나','B'};
		String [] str=new String[5];
		String [] str2={"babo","ondal"};
		
		int [][][] k3=new int[3][2][3];

	}

}
