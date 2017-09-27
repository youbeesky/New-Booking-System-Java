import java.util.Scanner;

//subclass Wednesday
public class Wednesday extends Week{ //inheritance from parent class called Week
	//Overriding parent class (Week)
	public void ticket(){
		Scanner movie = new Scanner(System.in);			//Allows user to input text or a number
		int Type;										//different types defined (standard, student etc)
		int Amount; 									//cost
		//For Wednesday
		double Standards = 6.00;		//Number of Standard tickets input
		double OAPs = 4.00;
		double Students = 4.00;
		double Childs = 2.00;
		double Wednesdaytotal = 0;		//Total of Wednesday Amount
		// Select number of tickets
		double [] CostArray = new double [4];  
		String [] ClassArray = new String [4];
		ClassArray [0] = "Standard";
		ClassArray [1] = "OAP";
		ClassArray [2] = "Student";
		ClassArray [3] = "Child";
	
do
	{
		//Displays the title and class types, with their price.
		  System.out.println ("          Welcome to QA Cinemas           ");
		  System.out.println ("******************************************");
		  System.out.println ("   Type        \tWednesday Only Offer");
		  System.out.println ("************   \t*************************");
		  System.out.println ("1. Standard    \t£6.00");
		  System.out.println ("2. OAP         \t£4.00");
		  System.out.println ("3. Student     \t£4.00");
		  System.out.println ("4. Child       \t£2.00");
		  System.out.println ();

//Wednesday offer
		  System.out.println ("Wednesday Offer");
		  System.out.println ("Enter a Ticket Type Number 1 to 4:");
		  System.out.println ("Enter 5 to go to the Checkout:");
		  Type = movie.nextInt();

//Another option appears. Enter the number of Standard tickets
		    if (Type == 1)
		    {
		    System.out.println ();
		    System.out.println ("Enter the Number of Standard Class Tickets:");
		    Amount = movie.nextInt();
		    Wednesdaytotal = Wednesdaytotal + (Amount * Standards);
		    CostArray [0] = Wednesdaytotal;
		    }
//Enter the number of OAP tickets
		    if (Type == 2)
		    {
		    System.out.println ();
		    System.out.println ("Enter the Number of OAP Class Tickets:");
		    Amount = movie.nextInt();
		    Wednesdaytotal = Wednesdaytotal + (Amount * OAPs);
		    CostArray [1] = Wednesdaytotal;
		    }
//Enter the number of Student tickets
		    if (Type == 3)
		    {
		    System.out.println ();
		    System.out.println ("Enter the Number of Student Class Tickets:");
		    Amount = movie.nextInt();
		    Wednesdaytotal = Wednesdaytotal + (Amount * Students);
		    CostArray [2] = Wednesdaytotal;
		    }
//Enter the number of Child tickets
		    if (Type == 4)
		    {
		    System.out.println ();
		    System.out.println ("Enter the Number of Child Class Tickets:");
		    Amount = movie.nextInt();
		    Wednesdaytotal = Wednesdaytotal + (Amount * Childs);
		    CostArray [3] = Wednesdaytotal;
		    }
			}
//Go to Purchase, after adding tickets to the basket
		while (Type <= 4);
		System.out.println("                Checkout                 ");
		System.out.println("*****************************************");
		System.out.println();
		System.out.println("                      \tPrice");
		//System.out.println("Total: " + NormalTotal);
		System.out.println("Total of Wednesday Deal: £" + Wednesdaytotal);
		movie.close();
		
	}

}

