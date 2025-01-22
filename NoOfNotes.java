import java.util.*;
class NoOfNotes{
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount");
        int amt=sc.nextInt();
        int n = amt/1000;
        System.out.println("1000 * "+ n);
        amt=amt%1000;
        n= amt/500;
        System.out.println("500 * "+n);
        amt=amt%500;
        n=amt/100;
        System.out.println("100 * "+n);
        amt=amt%100;
        n=amt/50;
        System.out.println("50 * "+n);
        amt=amt%50;
        n=amt/10;
        System.out.println("10 * "+ n);
        amt=amt%10;
        n=amt % 5;
        System.out.println("5 * "+ n);
        amt = amt%5;
        n=amt/1;
        System.out.println("1 * "+ n);

        }
}       