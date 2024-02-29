package Com.project;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    int X, Y, Z;
	    char ch;
		Operation op=new Operation();
		System.out.println("Select below one choice");
		System.out.println(" 1. for Addition \n 2. for Substraction \n 3. for Multiplication \n 4. for Division");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
			  System.out.println("Enter first X integer value ");
		      X=sc.nextInt();
		     
		      System.out.println("Choose char +");
		      ch = sc.next().charAt(0);
		      if(ch=='+')
		      {
		    	System.out.println("Enter second Y integer value");
		  		Y=sc.nextInt();
		  		
		  	    System.out.println("Choose char + or =");
		        ch = sc.next().charAt(0);
		        if(ch=='=')
		        {
		    	  op.add(X, Y);
		        }
		      
		        else if(ch=='+')
		        {
		    	  System.out.println("Enter Third Z integer value");
		  		  Z=sc.nextInt();
		  		  op.add(X, Y, Z);
		        }
		        else
		        {
		    	  System.out.println("This is not valid input");
		        }
		      }
		      break;
			    
		case 2:
			  System.out.println("Enter first X integer value ");
			  X=sc.nextInt();
			  
			  System.out.println("Choose char -");
			  ch=sc.next().charAt(0);
			  if(ch=='-')
			  {
				  System.out.println("Enter second Y integer value");
				  Y=sc.nextInt();
					
				  System.out.println("Choose char - or =");
				  ch=sc.next().charAt(0);
				  if(ch=='=')
				  {
					  op.sub(X, Y);
				  }
				  else if(ch=='-')
				  {
					  System.out.println("Enter Third Z integer value");
					  Z=sc.nextInt();
					  op.sub(X, Y, Z);
				  }
				  else
			        {
			    	  System.out.println("This is not valid input");
			        }
			}
			break;
			
		case 3:
			 System.out.println("Enter first X integer value ");
			 X=sc.nextInt();
			  
			 System.out.println("Choose char *");
			 ch=sc.next().charAt(0);
			 if(ch=='*')
			 {
				 System.out.println("Enter second Y integer value");
				 Y=sc.nextInt();
					
				 System.out.println("Choose char * or =");
				 ch=sc.next().charAt(0);
				 if(ch=='=')
				 {
					 op.Mul(X, Y);
				 }
				 else if(ch=='*')
				  {
					  System.out.println("Enter Third Z integer value");
					  Z=sc.nextInt();
					  op.Mul(X, Y, Z);
				  }
				 else
			        {
			    	  System.out.println("This is not valid input");
			        }
		     }
			 break;
			 
		case 4:
			 System.out.println("Enter first X integer value ");
			 X=sc.nextInt();
			  
			 System.out.println("Choose char /");
			 ch=sc.next().charAt(0);
			 if(ch=='/')
			 {
				 System.out.println("Enter second Y integer value");
				 Y=sc.nextInt();
					
				 System.out.println("Choose char / or =");
				 ch=sc.next().charAt(0);
				 if(ch=='=')
				 {
			       op.Div(X, Y);
				 }
				 else if(ch=='/')
				  {
					  System.out.println("Enter Third Z integer value");
					  Z=sc.nextInt();
				      op.Div(X, Y, Z);
				  }
				 else
			        {
			    	  System.out.println("This is not valid input");
			        }
			 }
			break;
			
		}
	}

}
