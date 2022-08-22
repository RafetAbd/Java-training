// import Scanner
import java.util.Scanner;

import javax.sound.sampled.BooleanControl;

import java.util.ArrayList;
// import javax.swing.JOptionPane;
import java.util.Random;
import java.util.*;

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
        // Scanner scanner = new Scanner(System.in);
        // String name = "";
        //     while( name.isBlank()) {
        //         System.out.println("Enter your name: ");
        //         name = scanner.nextLine();
        //     }
        //     System.out.println("Hello "+name);

        // for ( int i = 0 ; i <= 10 ; i ++  ) {
        //     System.out.println(i);
        // }

        // Scanner scanner = new Scanner(System.in);
        // int rows;
        // int col;
        // String symbol = "";
        // System.out.println("enter # of rows");
        // rows = scanner.nextInt();
        // System.out.println("enter # of columns");
        // col = scanner.nextInt();
        // System.out.println("enter symbol to use");
        // symbol = scanner.next();
        // for ( int i  = 0 ; i < rows ; i ++ ) {
        //     for ( int j = 0 ; j< col ; j ++ ) {
        //         System.out.print(symbol);
        //     }
        //     System.out.println();
        // }

        // String[] cars = {"Tesla", "Ford", "Toyota"};
        // cars[0] = "BMW";
        // for ( int i = 0 ; i < cars.length ; i ++  ) {
        //     System.out.println(cars[i]);
        // }
        
        // these are two ways to decalre array in java.
        // String[][] houses = new String[4][4];        
        // String[][] cars = {
        //     {"BMW", "Ford"},
        //     {"Tesla", "Volvo"},
        //     {"VW", "kia"}
        // };
        // for ( int i = 0 ; i < cars.length ; i ++ ) {
        //     System.out.println();
        //     for ( int j = 0 ; j < cars[i].length ; j ++ ) {
        //         System.out.print(cars[i][j]+" ");
        //     }
        // }

        // String name = "rafet";
        // Boolean result = name.equals("rafet");
        // int result = name.length();
        // char result = name.charAt(1);
        // int result = name.indexOf("f");
        // boolean result = name.isEmpty();
        // String result = name.toUpperCase();
        // System.out.println(result);

        // ArrayList<String> food = new ArrayList<String>();
        // food.add("pizza");
        // food.add("hotdog");
        // food.add("burger");
        // change value at certain index
        // food.set(0, "sushi");
        // remove element from certain index
        // food.remove(1);
        // pay attension to the for loop and how to access the element in the next two lines
        // for ( int i = 0 ; i < food.size() ; i ++ ) {
        //     System.out.println(food.get(i));
        // }

            // ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
            // ArrayList<String> bakeryList = new ArrayList();
            // bakeryList.add("pasta");
            // bakeryList.add("bread");
            // bakeryList.add("cake");
            // groceryList.add(bakeryList);
            // ArrayList<String> produceList = new ArrayList();
            // produceList.add("tomatoes");
            // produceList.add("peppers");
            // produceList.add("apples");
            // groceryList.add(produceList);
            // ArrayList<String> drinkList = new ArrayList();
            // drinkList.add("peppsi");
            // drinkList.add("water");
            // groceryList.add(drinkList);
            // System.out.println(groceryList);
            // System.out.println(groceryList.get(0).get(2));

            // String[] animals = {"cat", "dog", "bird"};
            // ArrayList<String> animals = new ArrayList<String>();
            // animals.add("cat");
            // animals.add("dog");
            // animals.add("bird");
            // for ( String i : animals ) {
            //     System.out.println(i);
            // }

            // String name = "Rafet";
            // int age = 21;
            // hello(name, age);
            // int x = 3;
            // int y = 4;
            // int d = add(x, y);
            // System.out.println(d);
            // System.out.println(add(3,4,2,5));
            
            // final means that the variable vaalue cannot be updated
            // final double pi = 3.14;
            // System.out.println(pi);

            // this is how to create an object from another class in different file
            Car myCar = new Car();
            Car myCarTwo = new Car();
            System.out.println(myCar.make);
            System.out.println(myCarTwo.model);
            myCar.drive();
            myCarTwo.brake();

    }

    

    // static void hello(String x, int y) {
    //     System.out.println("Hello "+x+" and you are "+y+" years old");
    // }
    // static int add(int x, int y) {
    //     int z = x+y;
    //     return z;
    // }

    // overloaded method: methods that have the same name but have different parameters.
    // static int add(int a, int b) {
    //     System.out.println("this is overloaded method 1");
    //     return a + b;
    // }
    // static int add(int a, int b, int c) {
    //     System.out.println("this is overloaded method 2");
    //     return a + b + c;
    // }
    // static int add(int a, int b, int c, int d) {
    //     System.out.println("this is overloaded method 3");
    //     return a + b + c + d;
    // }

}