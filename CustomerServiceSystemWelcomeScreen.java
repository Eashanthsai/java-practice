import java.util.*;
public class CustomerServiceSystemWelcomeScreen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Customer Care .Please Enter your name :");
        String name = sc.nextLine();
        System.out.println("Hello! \t" + name +"\nHow can I assist you ?" );
    }
    
    
}