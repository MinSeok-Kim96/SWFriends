package minseokroom;

public class lotto {

	public static void main(String[] args) {

		  int[] ball = new int[45];
		  

		  for(int i=0; i<ball.length;i++)
		  {
		   ball[i] = i+1; 
		  }
		  int num = 0;
		  int temp = 0;
		  
		  for(int i=0;i<7777777;i++)
		  {
		  num = (int)(Math.random()*45);
		  temp = ball[0];
		  ball[0] = ball[num];
		  ball[num] = temp;
		  }
		  for(int i=0;i<6;i++)
		  {
		   System.out.println(ball[i]);
		  }

	}

}
