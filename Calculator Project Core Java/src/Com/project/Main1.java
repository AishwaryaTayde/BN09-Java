package Com.project;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
    int X, Y, Z;
    char ch;
	opration_1 op=new opration_1();
	System.out.println("Select below one choice");
	System.out.println(" 1. for Addition \n 2. for Substraction \n 3. for Multiplication \n 4. for Division");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	switch(a)
	{
	case 1:
		System.out.println("Please select below choice");
		System.out.println(" a) Addition of Two Numbers  \n b) Addition of Three numbers");
		ch=sc.next().charAt(0);
		if(ch=='a')
		{
			System.out.println("Enter first X integer value ");
		    X=sc.nextInt();
		    System.out.println("Enter second Y integer value");
		  	Y=sc.nextInt();
			op.add(X, Y);
		}
		else if(ch=='b')
		{
			System.out.println("Enter first X integer value ");
		    X=sc.nextInt();
		    System.out.println("Enter second Y integer value");
		  	Y=sc.nextInt();
		  	System.out.println("Enter Third Z integer value");
		    Z=sc.nextInt();
			op.add(X, Y, Z);
		}
		else
		{
			System.out.println("This is not valid input");
		}
	break;
	
	case 2:
		System.out.println("Please select below choice");
		System.out.println(" a) Substraction of Two Numbers  \n b) Substraction of Three numbers");
		ch=sc.next().charAt(0);
		if(ch=='a')
		{
			System.out.println("Enter first X integer value ");
		    X=sc.nextInt();
		    System.out.println("Enter second Y integer value");
		  	Y=sc.nextInt();
			op.sub(X, Y);
		}
		else if(ch=='b')
		{
			System.out.println("Enter first X integer value ");
		    X=sc.nextInt();
		    System.out.println("Enter second Y integer value");
		  	Y=sc.nextInt();
		  	System.out.println("Enter Third Z integer value");
		    Z=sc.nextInt();
			op.sub(X, Y, Z);
		}
		else
		{
			System.out.println("This is not valid input");
		}
	break;
		
	case 3:
		System.out.println("Please select below choice");
		System.out.println(" a) Multiplication of Two Numbers  \n b) Multiplication of Three numbers");
		ch=sc.next().charAt(0);
		if(ch=='a')
		{
			System.out.println("Enter first X integer value ");
		    X=sc.nextInt();
		    System.out.println("Enter second Y integer value");
		  	Y=sc.nextInt();
			op.Mul(X, Y);
		}
		else if(ch=='b')
		{
			System.out.println("Enter first X integer value ");
		    X=sc.nextInt();
		    System.out.println("Enter second Y integer value");
		  	Y=sc.nextInt();
		  	System.out.println("Enter Third Z integer value");
		    Z=sc.nextInt();
			op.Mul(X, Y, Z);
		}
		else
		{
			System.out.println("This is not valid input");
		}
	break;
		
	case 4:
		System.out.println("Please select below choice");
		System.out.println(" a) Division of Two Numbers  \n b) Division of Three numbers");
		ch=sc.next().charAt(0);
		if(ch=='a')
		{
			System.out.println("Enter first X integer value ");
		    X=sc.nextInt();
		    System.out.println("Enter second Y integer value");
		  	Y=sc.nextInt();
			op.Div(X, Y);
		}
		else if(ch=='b')
		{
			System.out.println("Enter first X integer value ");
		    X=sc.nextInt();
		    System.out.println("Enter second Y integer value");
		  	Y=sc.nextInt();
		  	System.out.println("Enter Third Z integer value");
		    Z=sc.nextInt();
			op.Div(X, Y, Z);
		}
		else
		{
			System.out.println("This is not valid input");
		}
	break;
	}

}
}