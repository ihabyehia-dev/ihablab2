package solutionlab1;

		import java.util.Scanner;
	
		public class Main {
		    public static void main(String[] args) {
		        Scanner c = new Scanner(System.in);
		        System.out.print("Enter array capacity: ");
		       int size = c.nextInt();
		              ArrayyInt a = new ArrayyInt(size);
               System.out.println("Is array empty? " + a.isEmpty());
                 System.out.print("How many values do you want to insert? ");
		        int n = c.nextInt();
		      for (int i = 0; i < n; i++) {
		            System.out.print("Enter value " + (i + 1) + ": ");
		            int value = c.nextInt();
	            a.InsertElementAtBack(value);
		       }   
		       System.out.print("Enter a value to insert at front: ");
		      int frontValue = c.nextInt();
		        a.InsertElementAtFront(frontValue);
		      a.InsertElementAtPosition(3, 5);    
		        a.Display();   
		      int index = a.SearchValue(10);
		     if (index != -1) {
		            System.out.println("10 was found at index " + index);
		        } else {
		            System.out.println("10 was not found.");
		        }
    System.out.print("Enter a value to delete: ");
		        int deleteValue = c.nextInt();

		    boolean deleted = a.DeleteElement(deleteValue);

		     if (deleted) {
		            System.out.println("Deletion successful.");
		       } else {
		           System.out.println("Value was not found.");
		     }
		        a.Display(); 
		        System.out.println(
		            "Average of even numbers: " + a.AverageofEvenNb()
		        );
		        a.MultiplesOfEvenThree(); 
		        System.out.println(
		            "Occurrence of 7 is " + a.OccurrenceNb(7)
		        );
		        if (a.Palindrome()) {
		            System.out.println("The array is a palindrome.");
		        } else {
		            System.out.println("The array is not a palindrome.");
		        }
		       
		        }
		}
		

	


