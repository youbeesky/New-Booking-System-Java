//QA Cinema System
//By Rijin Raju
//Java 1.7 on Eclipse

import java.util.Scanner;


public abstract class Main { //using abstraction
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Days newObject = new Days(); //calls the class named Days
		newObject.getDayss(); //Executes the getDayss function
		System.out.println(""); //leave a empty space
		
		int wed = 0; 
		System.out.println("Select Wednesday?: 1) Yes, 2) No"); //Select Wednesday or not option after day select
		wed = s.nextInt();
		if(wed==1){ //Executes the Wednesday sub class if Wednesday is selected
		Wednesday wedObje[] = new Wednesday[1]; //Polymorphism
		wedObje[0] = new Wednesday();
		for (int y=0;y<1;++y){
			wedObje[y].ticket();
		}
		}else { //Executes the Monday sub class, if All other days are selected
		Week Obj[] = new Week[1]; //Polymorphism 
		Obj[0] = new Monday();
		for (int x=0;x<1;++x){
			Obj[x].ticket();
			s.close();
			}	
		}
	}
}