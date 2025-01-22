import java.util.Scanner;
class WeekDays{
	public static void main(String args[]){
	int no;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any Number");
	no=sc.nextInt();
	switch(no){
		case 1:System.out.println("Monday");
		break;
		case 2:System.out.println("Tuesday");
		break;
		case 3:System.out.println("Wednesday");
		break;
		case 4:System.out.println("Thursday");
		break;
		case 5:System.out.println("Friday");
		break;
		case 6:System.out.println("Satarday");
		break;
		case 7:System.out.println("Sunday");
		break;
		default:System.out.println("Invalid Number");
                break;

		
        }
}
}