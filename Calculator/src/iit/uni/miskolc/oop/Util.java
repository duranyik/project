package iit.uni.miskolc.oop;

public class Util {
	public static void Calculate(String operator, Double firstnumber, Double secondnumber){
		System.out.print("Result:");
		switch(operator){
		case "-":
			System.out.println(firstnumber - secondnumber);
			break;
		case "+":
			System.out.println(firstnumber+secondnumber);
			break;
		case "/":
			if(!secondnumber.equals(0.0))
				System.out.println(firstnumber/secondnumber);
			else
				System.out.println("Cannot divide with 0");
			break;
		case "*":
			System.out.println(firstnumber*secondnumber);
			break;
		default:
			System.out.println("unknown operator");
			break;
			
		}
	}

}
