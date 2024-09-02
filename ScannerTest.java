import java.util.Scanner;

public class ScannerTest {

    public static void main(String args[]){
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter smth, but make it a number:");
        int a = scanner.nextInt();
        System.out.println("value = " + a);

        System.out.println("enter smth else, char:");
        char c =scanner.next().charAt(0);
        System.out.println("value = " + c);

        System.out.println("enter smth else, string:");
        String s =scanner.next(); // nu ia spatiile
        System.out.println("value = " + s);


    }
}