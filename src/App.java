// import Scanner
import java.util.Scanner;
// import javax.swing.JOptionPane;
import java.util.Random;

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
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("What is your name?");
        // String name = scanner.nextLine();
        // System.out.println("How old are you ?");
        // int age = scanner.nextInt();
        // the next line is importnat to clear the scanner after scan the int;
        // scanner.nextLine();
        // System.out.println("What is your favorite food ?");
        // String food = scanner.nextLine();
        // System.out.println("Hello "+name);
        // System.out.println("you are "+age+" years old");
        // System.out.println("And your favorite food is "+food);

        // double friends = 10;
        // friends = friends/3;
        // System.out.println(friends);

        // String name = JOptionPane.showInputDialog("Enter your name");
        // JOptionPane.showMessageDialog(null, "Hello "+name);
        // adding parseInt to convert the input from string to int
        // int age = Integer.parseInt(JOptionPane.showInputDialog("and your age ?"));
        // JOptionPane.showMessageDialog(null, "and your are "+age+" years old!");
        // double height = Double.parseDouble(JOptionPane.showInputDialog("and your height ?"));
        // JOptionPane.showMessageDialog(null, "and your height is "+height);
                
        // double x;
        // double y;
        // double z;
        // Scanner scanner= new Scanner(System.in);
        // System.out.println("enter side x");
        // x = scanner.nextDouble();
        // System.out.println("enter side y");
        // y = scanner.nextDouble();
        // z = Math.sqrt((x*x)+(y*y));
        // System.out.println("Hypotenuse is: "+z);
        // scanner.close();

        // Random random = new Random();
        // in the next line we put the limit between (), so the random number will be between 1-5 then we added 1 to include the six
        // without that the random number will be too large.
        // int x = random.nextInt(6)+1;
        // the next one willl generate a random value between 0 to 1
        // double y = random.nextDouble();
        // generate random boolean value.
        // boolean z = random.nextBoolean();
        // System.out.println(z);
        // int age = 43;
        // if ( age >= 75 ) {
        //     System.out.println("you are too old");
        // } else if ( age >= 18 ) {
        //     System.out.println("you are old enough");
        // } else {
        //     System.out.println("you are minor");
        // }

        // String day = "Monday";
        // switch(day) {
        //     case "Sunday": System.out.println("it is Sunday");
            // break is so important so it out excute everthing after the matching case
        //     break;
        //     case "Monday": System.out.println("it is Monday");
        //     break;
        //     case "Tuesday": System.out.println("it is Tuesday");
        //     break;
        //     case "Wednesday": System.out.println("it is Wednesday");
        //     break;
        //     case "Thuresday": System.out.println("it is Thuresday");
        //     break;
        //     case "Friday": System.out.println("it is Friday");
        //     break;
        //     case "Saturday": System.out.println("it is Saturday");
        //     break;
        //     default: System.out.println("that is not a day");
        // }

        // int temp = 90;
        // if ( temp > 100 ) {
        //     System.out.println("it is hot");
        // } else if ( temp <= 100 && temp >= 40 ) {
        //     System.out.println("it is warm");
        // } else {
        //     System.out.println("it is cold");
        // }
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("you are playing a game! press q or Q to quit");
        // String response = scanner.next();
        // if ( response.equals("q") || response.equals("Q")) {
        //     System.out.println("you quit the game");
        // } else {
        //     System.out.println("you are still playing the game");
        // }
        Scanner scanner = new Scanner(System.in);
        String name = "";
            while( name.isBlank()) {
                System.out.println("Enter your name: ");
                name = scanner.nextLine();
            }
            
            System.out.println("Hello "+name);


    }
}