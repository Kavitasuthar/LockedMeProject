package com.lockedme;

import java.util.Scanner;

public class BusinessValidation {

 static void inputFromUser() {
		
		BusinessLevelOperations operation=new BusinessLevelOperations();
		

		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		
	
	
		int choice=0;
		
		
do {
		System.out.println("Enter your choice which you want to select: \n");
		System.out.println("\t1. Retrieve current filenames in ascending order \n");
		System.out.println("\t2. Business-level operation menu \n");
		System.out.println("\t3. Exit from the application \n");
		
		System.out.println("Enter your choice from 1-3");
		
		
		//choice=sc.nextInt();
		
		try { choice = Integer.parseInt(sc.nextLine());
	       
	        }catch(IllegalArgumentException e){
	            System.out.println("Please enter an Integer");
	            continue;
	        }
		
		switch(choice) {
		case 1:
		
			operation.showAllFiles();
			break;
			
		case 2:
			int option=0;
			
			do {
				System.out.println("\t1.Add a file to the existing directory list \n");
				System.out.println("\t2.Delete a user specified file from the existing directory list\n");
				System.out.println("\t3.Search a user specified file from the main directory\n");
				System.out.println("\t4.Option to navigate back to the main context\n");
				
				try { option = Integer.parseInt(sc.nextLine());
				}catch(IllegalArgumentException e){
		            System.out.println("Please enter an Integer");
		            continue;
		        }
				
				
				switch(option) {
				case 1:
					operation.addFile();
					
					break;
				case 2:
					System.out.println("deleting the file");
					operation.deleteFile();
					break;
				case 3:
					System.out.println("searching the file");
					operation.searchFile();
					break;
				case 4:
					System.out.println("Out of the Business Level Operation Menu");
					System.out.println("=======================================");
					break;
				default:
						System.out.println("Invalid Entry.Please try again!");
						break;
					
				}
				
			}while(option!=4);
			break;
			
			
		case 3:
			System.out.println(" Out of the applicaton Bye!");
			break;
			
		default:
			System.out.println("Invalid Entry:Please choose a number between 1-3");
		}
		
		
}while(choice!=3);	
	
		
	}

	 static void welcomeScreen() {

		System.out.println("Application Name : LOCKED ME \n");	
		System.out.println("Developer Name : Kavita Suthar\n ");
	
		}

}

	

