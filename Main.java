// we start off by building our scan object as we want to have inputs in this question from the user
package main;
//importing it from the library 
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
				// making a scan object
				Scanner check = new Scanner(System.in); 
				// define our variables and declare their type: 
				double x1;
				double y1;
				double x2;
				double y2;
				double a;
				double b;
	
				// asking user for the input with a message and defining our objects which are x1,x2,y1,y2 in here 
				System.out.print("Enter your coordinate x point1: "); 
				x1 = check.nextDouble();
				System.out.print("Enter your coordinate y point1: ");
				y1 = check.nextDouble();
				System.out.print("Enter your coordinate x point2: ");
				x2 = check.nextDouble();
				System.out.print("Enter your coordinate y point2: ");
				y2 = check.nextDouble();
				// now we define our slope (of the equation mentioned in the question)
				a = (y2 - y1)/(x2 - x1);
				// as mentioned in the question, we should not define slope and slope-intercept manually(not the formula in the print method). thus, we define them one line before the print , using String concatenation:
				// Also, blank lines using \n just like the output shown in the question so we put it first for it to get to the next line.
				System.out.println("\nThe slope of the line is: " + a );
				// and also for our slope-intercept, note that i am not printing these manually on the print method :(a, instead of what it is equal to , just same as of b), using String concatenation:
				b = (y2 - (y2 - y1)/(x2 - x1) * x2);
				System.out.println("the slope-intercept of the line is: " + b);
				// now the equation of the line using String concatenation:
				System.out.println("\nThe line equation is: " + "Y = "+ a +"X + " + b + "!!");
				// now changing the double to integer so we would get the integer model of the equation using m & n values(Data conversion-casting-):
				int m = (int)a;
				int n = (int)b;
				System.out.println("\nHere is the line equation with integer format: " + "Y = "+ m +"X + " + n + "!!");
				
				// Let's call this new line of ours Z.
				
				// now, we define a point called A, which is not on our original line and also, we want to calculate it's distance from the line using the perpendicular line to Z's slope and slope-intercept
				//First, let's start with the point A's coordinates:
				double x3;
				double y3;
				System.out.print("\nEnter the x coordinate of point A: ");
				x3 = check.nextDouble();
				System.out.print("Enter the y coordinate of point A: ");
				y3 = check.nextDouble();
				
				// now, we calculate the slope and the slope-intercept of the line that passes through A.
				// Ap: our new line's slope
				double Ap;
				Ap = -1/a;
				System.out.println("\nThe slope of the perpendecular is: " + Ap);
				// Bp: our new line's slope-intercept
				double Bp;
				Bp = y3 - Ap * x3;
				System.out.println("The slope-intercept of the perpendecular is: " + Bp);
				
				// Let's call the perpendicular line of ours T 
				// here below , we want to print the intersection coordinates between lines Z and T.
				// we start by defining the intersection coordinates : x4 and y4.
				double x4;
				double y4;
				x4 = (Bp - b)/(a- Ap);
				//now, if we put the x4 to the line Z's equation, we will get the intersection coordinates:
				y4 = (a * x4 + b);
				System.out.println("\nthe coordinates of the intersection point are " + "X = " + x4 + " and " + "Y = "  + y4 );
				
				// and lastly, the distance of this intersection point from point A using Math.sqrt() for getting the square root and Math.pow(base, exponent) for getting the power of the number:
				double distance;
				distance = Math.sqrt((Math.pow(x3 - x4, 2)) + (Math.pow(y3 - y4, 2)));
				System.out.println("\nThe distance from point A to the line is: " + distance +"!!");
				

		
	



			
					

	}

	
	
}
