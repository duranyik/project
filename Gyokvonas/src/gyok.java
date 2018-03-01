import java.util.Scanner;

public class gyok {
	public static void main(String[] args){
		int size=10;
		double[] array = new double[size];
		double szorzat=1.0;
		Scanner scanner=new Scanner(System.in);		
		for(int i=0;i<array.length;i++){
			array[i]=scanner.nextDouble();
		}
		for(double d:array){
			System.out.println(d);
		}
		for(double d:array){
			szorzat*=d;
		}
		
		for	(int i=0;i<array.length;i++){
			szorzat=szorzat*array[i];
		}
		System.out.println(Math.pow(szorzat, 1.0/size));
		scanner.close();
	}

}
