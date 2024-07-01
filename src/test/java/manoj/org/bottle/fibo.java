package manoj.org.bottle;

public class fibo {
	
	public class Fibonacci {
		
		
		public  static void fibo (int N) {
			int num1=0,num2=1;
			
			for(int i=0;i<N;i++) {
				System.out.println(num1+" ");
				
				int num3=num2+num1;
				   num1=num2;
				   num2=num3;
			}
			
		}
		
		public static void main(String[] args) {
			int N=7;
			fibo(N);
		}


}
