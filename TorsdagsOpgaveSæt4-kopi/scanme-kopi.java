import java.util.Scanner;
import java.util.ArrayList;

public class scanme{
	
public static void main (String [] args){
	Scanner scanner = new Scanner (System.in);

	System.out.println (" Please type your name ");

	String input = scanner.nextLine();

	System.out.println (" Hello " + input);

	System.out.println ("Please type your age");

	int age = scanner.nextInt();

	System.out.println ("Ahh nice this is your age: " + age );


	//

	int currentYear = 2023;

	int bornYear = currentYear - age;

	int retirementYear = bornYear + 67;


	int untilRetirement = retirementYear - currentYear;


	if (untilRetirement >=67){
	System.out.println (" Tilykke, Du kan gå på pension! ");
}
else {

	System.out.println(" Du mangler " +untilRetirement+ " for at gå på pension " );
}
}

//
}