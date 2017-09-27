import java.util.Scanner;


public class Week {
	
	public void ticket(){
		Scanner movie = new Scanner(System.in);			//Allows user to input text or a number
		int Type;										//different types defined (standard, student etc)
		int Amount; 									//cost
		//All other days, except Wednesday Rates
		double Standard = 8.00;		//Number of Standard tickets input
		double OAP = 6.00;			
		double Student = 6.00;
		double Child = 4.00;

		double NormalTotal = 0;			//Total Amount
		// Select number of tickets
		double [] CostArray = new double [4];  
		String [] ClassArray = new String [4];
		ClassArray [0] = "Standard";
		ClassArray [1] = "OAP";
		ClassArray [2] = "Student";
		ClassArray [3] = "Child";
	
	do
	{
//Displays the title and class types, with their price. This is price set for normal days
//...therefore, Monday to Sunday, except Wednesday
	    System.out.println ("  Welcome to QA Cinemas    ");
	    System.out.println ("****************************");
	    System.out.println ("   Type        \tPrice     ");
	    System.out.println ("***********    \t**********");
	    System.out.println ("1. Standard    \t£8.00");
	    System.out.println ("2. OAP         \t£6.00");
	    System.out.println ("3. Student     \t£6.00");
	    System.out.println ("4. Child       \t£4.00");
	    System.out.println ();

//This option appear again after selecting a ticket type, if more purchase to be made
//...or simply go to the checkout
	    System.out.println ("Add Tickets to Basket");
	    System.out.println ("Enter a Ticket Type from 1 to 4:");
	    System.out.println ("Enter 5 to go to the Checkout:");
	    Type = movie.nextInt(); //After adding move to next line

//Another option appears. Enter the number of Standard tickets a customer wishes to purchase
	    if (Type == 1)
	    {
	    System.out.println ();
	    System.out.println ("Enter the Number of Standard Class Tickets:");
	    Amount = movie.nextInt();
	    NormalTotal = NormalTotal + (Amount * Standard);
	    CostArray [0] = NormalTotal;
	    }
//Enter the number of OAP tickets
	    if (Type == 2)
	    {
	    System.out.println ();
	    System.out.println ("Enter the Number of OAP Class Tickets:");
	    Amount = movie.nextInt();
	    NormalTotal = NormalTotal + (Amount * OAP);
	    CostArray [1] = NormalTotal;
	    }
//Enter the number of Student tickets
	    if (Type == 3)
	    {
	    System.out.println ();
	    System.out.println ("Enter the Number of Student Class Tickets:");
	    Amount = movie.nextInt();
	    NormalTotal = NormalTotal + (Amount * Student);
	    CostArray [2] = NormalTotal;
	    }
//Enter the number of Child tickets
	    if (Type == 4)
	    {
	    System.out.println ();
	    System.out.println ("Enter the Number of Child Class Tickets:");
	    Amount = movie.nextInt();
	    NormalTotal = NormalTotal + (Amount * Child);
	    CostArray [3] = NormalTotal;
	    }
	}
//Go to Purchase, after adding tickets to the basket
	while (Type <= 4);
	System.out.println("           Checkout              ");
	System.out.println("*********************************");
	System.out.println();
	System.out.println("      \tPrice");
	System.out.println("Total: £" + NormalTotal);
	movie.close();
		
	}

}
