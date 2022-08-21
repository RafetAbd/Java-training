// import Scanner
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // prinln will print each argument on a separate line
        // System.out.println("Hello, World!");
        // \n will print each argument on a separate line
        // System.out.print("Hello, World!\n");
        // System.out.print("Hello, World!\n");
        // \t will print each argument with a tab
        // System.out.print("\tHello, World!\n");

        // int x = 123;
        // boolean z =false;
        // char d = '%';
        // String e = "Rafet";
        // System.out.println("My number is : "+ x);
        // System.out.println(z);
        // System.out.println(d);
        // System.out.println("Hello "+ e);
        // MainFrame myFrame = new MainFrame();
        // myFrame.init();
        // String x = "water";
        // String y = "kool-aid";
        // System.out.println(x);
        // System.out.println(y);
        
        // scanner used to accept some user input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you ?");
        int age = scanner.nextInt();
        // the next line is importnat to clear the scanner after scan the int;
        scanner.nextLine();
        System.out.println("What is your favorite food ?");
        String food = scanner.nextLine();
        System.out.println("Hello "+name);
        System.out.println("you are "+age+" years old");
        System.out.println("And your favorite food is "+food);
    }
}