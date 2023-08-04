import java.util.Scanner;
class Main{

	public static void main (String[]args){
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		System.out.println(factorial(x));
	}
	public static int factorial(int x){
		int hasil = 1;
		for (int i=x; i>0; i--){
			hasil *= i;
		}
		return hasil;
	}
	
}