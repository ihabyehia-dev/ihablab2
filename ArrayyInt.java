package solutionlab1;

public class ArrayyInt {
	 private static int[] a;
	    private static int currentNb;
	    
	    public ArrayyInt(int size) {
	        a = new int[size];
	        currentNb = 0;
	    }
	    public boolean isEmpty() {
	        return currentNb == 0;
	    }
	    public boolean isFull() {
	        return currentNb == a.length;
	    }
	     void InsertElementAtFront(int value) {
	        if (isFull()) {
	            System.out.println("Array is full.");
	        }
	        for (int i=currentNb; i>0;i--) {
	            a[i] = a[i-1];
	        }
	        a[0] = value;
	        currentNb++;
	    }
	     void InsertElementAtBack(int value) {
	        if (isFull()) {
	            System.out.println("Cannot insert.");
	        }
	        a[currentNb] = value;
	        currentNb++;
	     }
	     void InsertElementAtPosition(int position, int value) {
	        if (isFull()) {
	            System.out.println("Array is full. Cannot insert.");
	            return;
	        }
	        if (position<1 || position>currentNb+1) {
	            System.out.println("Invalid position.");
	            return;
	        }
	        for (int i =currentNb;i>=position;i--) {
	            a[i] = a[i-1];
	        }
	        a[position-1] = value;
	        currentNb++;
	    } 
	     void Display() {
	        System.out.print("Array: ");

	        for (int i=0;i<currentNb;i++) {
	            System.out.print(a[i] +" ");
	        }
	    }
	    public int SearchValue(int value) {
	        for (int i =0;i<currentNb;i++) {
	            if (a[i]==value) {
	                return i;
	            }
	        }
	        return -1;
	    }   
	    public boolean DeleteElement(int value) {
	        int index = SearchValue(value);
	        if (index==-1) {
	            return false;
	        } 
	        for (int i=index;i<currentNb-1; i++) {
	            a[i]=a[i+1];
	        }
	        currentNb--;
	        return true;
	    }
	    public double AverageofEvenNb() {
	        int sum = 0;
	        int count = 0;
	        for (int i =0; i<currentNb;i++) {
	            if (a[i]%2==0) {
	                sum +=a[i];
	                count++;
	            }
	        }
	        return sum/count;
	    }
	    void MultiplesOfEvenThree() {
	        System.out.print("Even multiples of 3: ");

	        boolean found=false;

	        for (int i =0;i<currentNb; i++) {
	            if (a[i] %2==0 &&  a[i]%3==0) {
	                System.out.print(a[i] +" ");
	                found= true;
	            }
	        }
	        if (!found) {
	            System.out.println("there is no even multiples of 3");
	        }
	    }
	   public int OccurrenceNb(int number) {
	        int count = 0;

	        for (int i =0;i<currentNb; i++) {
	            if (a[i]==number) {
	                count++;
	            }
	        }
	        return count;
	    }

	    public boolean Palindrome() {
	        for (int i =0; i<currentNb/2;i++) {
	            if (a[i]!= a[currentNb-1- i]) {
	                return false;
	            }
	        }
	        return true;
	    }
	    public int FindSecondMaximum() {
	        int max = -1;
	        int secondMax =-1;

	        for (int i=0;i<currentNb; i++) {
	            if (a[i]> max) {
	                secondMax=max;
	                max=a[i];
	            } else if (a[i]>secondMax && a[i]<max) {
	                secondMax=a[i];
	            }
	        }
	          return secondMax;
	    }
	    static void EvenOrOdd() {
	        int even=0;
	        int odd=0;
       boolean evenok=false;
	        for (int i =0; i<currentNb;i++) {
	            if (a[i]%2==0) {
	                even++;
	            } else {
	                odd++;
	            }
	        }
	       if(even>odd) {
	    	   System.out.println("Even is greater than odd");
	       }
	       else {
	    	   System.out.println("odd is greater than even");
	       }
	    }
	void DeleteMultipleOfOddThree() {
		for(int i=0;i<currentNb;i++) {
			if(a[i]%2==1&&a[i]%3==0) {
				System.out.println("the deleted value at index "+i+" is "+a[i]);
				a[i]=0;
			}
		}
	}
public boolean linearsearch(int searched) {
	   boolean ok= false;
	   for(int i=0;i<currentNb;i++) {
		   if(searched== currentNb) {
			   ok = true;
		   }
	   }
	   if(!ok) {
		   ok = false;
	   }
	   return ok;
}

void SelectionSort(){
	 	   
	   for(int i =0;i<currentNb;i++) {
		   
	   }
}

}
