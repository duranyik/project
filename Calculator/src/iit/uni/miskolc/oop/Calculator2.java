package iit.uni.miskolc.oop;


import java.util.Scanner;

public class Calculator2 {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		String calculation;
		Double firstNumber;
		Double secondNumber;
		String operator;
		while (true){
			System.out.println("Enter the first number: ");
			firstNumber = scanner.nextDouble();
			System.out.println("Enter the second number: ");
			secondNumber = scanner.nextDouble();
			System.out.println("Enter operator: ");
			operator = scanner.next();
			Util.Calculate(operator, firstNumber, secondNumber);
		}
	}
}
