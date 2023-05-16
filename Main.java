/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter any no:");
		int M=s.nextInt();
		if(M%3==0 && M%5==0)
		       System.out.println("Good Number");
		else if(M%3==0 && M%5!=0)
		       System.out.println("Bad Number");
		else if(M%3!=0 && M%5==0)
		       System.out.println("Poor Number");
		else
		    System.out.println("-1");
	}
}
