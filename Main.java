import java.util.Scanner;
/**
 * tells the user what fibbonacci number that asked for
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner for user input
    Scanner input = new Scanner(System.in);

    //initialize variables
    int fibNum;//the fibbonacci number requsted by the user

    //ask user for fibbonacci number
    System.out.println("What Fibonacci number would you like to find");
    fibNum = input.nextInt();

    //create the array
    int[] fibbonacci = new int[(fibNum + 1)]; //set it to one more than the requested number, because arrays start counting at 0

    //set the first 2 values
    fibbonacci[0] = 0;
    fibbonacci[1] = 1;

    //populate the array with the fibbonacci sequence
    for(int i = 2; i < fibbonacci.length; i++){ //"i" starts at 2 because we already filled index 0 and 1
      //set the current number to the sum of the two previous numbers
      fibbonacci[i] = fibbonacci[(i - 2)] + fibbonacci[(i - 1)];
    }

    //tell the user their fibbonacci number
    System.out.println("The " + fibNum + " Fibonacci number is " + fibbonacci[fibNum]);
    
  }
}
