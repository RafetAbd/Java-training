public class Pizza {
    
    String bread;
    String sause;
    String cheese;
    String topping;


    Pizza(String bread, String sause, String cheese, String topping) {
        this.bread = bread;
        this.sause = sause;
        this.cheese = cheese;
        this.topping =  topping;
    }

    Pizza(String bread, String sause, String cheese) {
        this.bread = bread;
        this.sause = sause;
        this.cheese = cheese;
    }

    Pizza(String bread, String sause) {
        this.bread = bread;
        this.sause = sause;
    }

}
