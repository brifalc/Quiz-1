import java.util.Scanner;
public class Question1 {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Touchdowns:");
		double touchdowns = input.nextDouble();
		
		System.out.print("Total yards:");
		double totalYards = input.nextDouble();
		
		System.out.print("Interceptions:");
		double interceptions = input.nextDouble();
		
		System.out.print("Completions:");
		double completions = input.nextDouble();
		
		System.out.print("Passes Attempted:");
		double passesAttempted = input.nextDouble();
		
	double a = ((completions/passesAttempted-.3)*5);
	double b = ((totalYards/passesAttempted-3)*.25);
	double c = ((touchdowns/passesAttempted)*20);
	double d = (2.375-(interceptions/passesAttempted)*25);
	

	double passerRating = (((a+b+c+d)/6)*100);
	System.out.println("Rating:"+passerRating);
	
	}
}
