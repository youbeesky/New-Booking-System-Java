import java.util.Scanner;


public class Days { //encapsulation
	Scanner scan = new Scanner(System.in); //for input
	//day selection
	String[] daylist = {"1) Monday","2) Tuesday","3) Wednesday","4) Thursday","5) Friday","6) Saturday","7) Sunday"};
	int number;
	
	public void getDayss(){ //getter
		System.out.println("Select a Day:");
		System.out.println("For example, Enter 1 for Monday or 7 for Sunday");
		for(int k=0;k<daylist.length;k++){
			System.out.println(daylist[k]); //displays days
		}
		number = scan.nextInt();
		System.out.println("You selected: "+daylist[number-1].substring(3, daylist[number-1].length())); //prints the day that corresponds to the number inputed
		
	}

}
