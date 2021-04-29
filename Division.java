import java.util.*;

class Division{
	private static Integer divide(Integer numerator, Integer denominator){
		Integer quotient = 0;
		System.out.println(numerator +" "+ denominator);
		if(denominator != 0){
			while(numerator >= denominator){
				numerator -= denominator;
				quotient++;
			}
		}
		else{
			System.out.println("Division is not possible.");
		}
		System.out.println("Remainder is " + numerator);
		return quotient;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		Integer d = sc.nextInt();
		System.out.println("Quotient is " + divide(n,d));
		sc.close();
	}
}