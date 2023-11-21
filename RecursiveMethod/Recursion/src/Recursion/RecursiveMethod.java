package Recursion;
import java.util.Scanner;

public class RecursiveMethod {

	static int num1,num2=1,count;
	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length for series");
		int cnt=sc.nextInt();
		 int count=cnt-2;		
		System.out.print(num1+" "+num2);
		fibo(num1,num2,count);				
	}
	public static void fibo(int num1,int num2,int count) {
		 int num3 = 0;		
		if(count!=0) { 
			num3=num1+num2;
			count--;
			System.out.print(" "+num3);		
			num1=num2;
			num2=num3;
			 fibo(num1,num2,count);
		}			
	}
}
