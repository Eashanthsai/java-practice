import java.util.*;
public class StudentInformationManagementSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the Name of the Student : ");
        String name = sc.nextLine();
        System.out.println("Please Enter the Age of the Student : ");
        int age = sc.nextInt();
        System.out.println("Enter the CGPA of the Student : ");
        double cgpa = sc.nextDouble();
        cgpa = (int)(cgpa*100)/100.0 ;
        System.out.println("Enter the Grade  of the Student : ");
        char grade = sc.next().charAt(0);
        System.out.println("\nStudent Information : \nStudent Name : "+ name + "\nStudent's age : " + age + "\nStudent's CGPA : " + cgpa + "\nStudent's Grade : " + grade) ;
        System.out.println("Thank you for the Information.");
    }
}