package Control3;

public class E04 {

	public static void main(String[] args) {

		String [] k1 = {"20","23","29","27","30"};
		int [] k = {20,23,29,27,30};
		int imsi;
		for(int i=0;i<k.length-1;i++) {
			int sw=0;
			for(int j=0;j<k.length-1-i;j++) {
				if(k[j]<k[j+1]) {
					imsi=k[j];
					k[j]=k[j+1];
					k[j+1]=imsi;
					sw=1;
				}
			}//for-j-end
			if(sw==0)
				break;
		}//for-i-end
		for(int i=0;i<k.length;i++) {
			System.out.println(k[i]);
		}
		
	}

}