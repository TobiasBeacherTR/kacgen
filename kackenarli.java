package kacgen;
import java.util.Scanner;
public class kackenarli {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("Cokgenin bir ic acisi kac derece ? : ");
	double x=scanner.nextDouble();
	
	double y=180-x;
	double n=360/y;
	
	System.out.println("Cokgen " + n + " kenarlidir. ");
	}

}
