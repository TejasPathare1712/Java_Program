import java.util.*;
class MenuApplicationAtharva
{
public static void main(String[]args)
{
int a,b,c;
int choice;
Scanner sc = new Scanner(System.in);
  do
  {
   System.out.println("1. Addition");
   System.out.println("2. Subtraction");
   System.out.println("3. Multiplication");
   System.out.println("4. Division");
   System.out.println("5. Remainder");
   System.out.println("6. Exit");
   System.out.println("Please enter your choice");
   choice=sc.nextInt();
   
 switch(choice)
 	    {
   case 1 : System.out.println("Enter first number");
            a=sc.nextInt();
            System.out.println("Enter second number");
	    b=sc.nextInt();
	    c=a+b;
	    System.out.println("Addition of two nos = " +c);
	    break;
   case 2 : System.out.println("Enter first number");
            a=sc.nextInt();
            System.out.println("Enter second number");
	    b=sc.nextInt();
	    c=a-b;
	    System.out.println("Subtraction of two nos = " +c);
	    break;
   case 3 : System.out.println("Enter first number");
            a=sc.nextInt();
            System.out.println("Enter second number");
	    b=sc.nextInt();
	    c=a*b;
	    System.out.println("Multiplication of two nos = " +c);
	    break;
   case 4 : System.out.println("Enter Dividend");
            a=sc.nextInt();
            System.out.println("Enter Diviser");
	    b=sc.nextInt();
	    c=a/b;
	    System.out.println("Division(Quotient) is = " +c);
	    break;
   case 5 : System.out.println("Enter Dividend");
            a=sc.nextInt();
            System.out.println("Enter Diviser");
	    b=sc.nextInt();
	    c=a%b;
	    System.out.println("Division(Remainder) = " +c);
	    break;
   default: System.out.println("Invalid Choice");
            break;
  	    }
}
while(choice!=6);
  System.out.println("Succesful Execution");

   
}
}






     