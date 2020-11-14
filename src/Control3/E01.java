package Control3;

public class E01 {

	public static void main(String[] args) {

//		heap memory
		String ppp=null;
		String qqq="";

		
		String yy="ondal";
		System.out.println(yy);
		System.out.println(yy.length()>0); //true
		
//		System.out.println(ppp.length()>0); //null pointer error
		System.out.println(qqq.length()>0); //false
		
		String aa="ondal";
		String bb="ondal";
			if(aa==bb)
				System.out.println(aa+"\t"+bb);

			
			String cc=new String("ondal");
			String dd=new String("ondal");
			
			if(cc==dd) {
				System.out.println("맞다");
			}
			if(cc.equals(dd)) {
				System.out.println("아니다");
			}

	}

}
