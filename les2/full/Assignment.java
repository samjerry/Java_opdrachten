import java.util.Scanner;


public class Assignment{
  public void showAssignment(){
    Scanner input = new Scanner(System.in);
    System.out.println("Assignment 1: Jay you just completed your first assignment");
    System.out.println("Assignment 2: create 3 variables here, one for your name, age and one for your postal code. Print the values to the commandline!");


    System.out.println("Assignment 3: Use the Scanner datatype to allow a user to enter the values for name, age, and postal code. ");
    System.out.println("Assignment 4: Parse the Scanner output to an int when entering the age value. This way the user will get an error if numbers arent used. ");
    System.out.println("Note: Find out about datatypes at the Application Programming Interface(API) reference https://docs.oracle.com/javase/7/docs/api/allclasses-noframe.html. Select the Scanner link.");







    System.out.print("Wat is je voornaam? ");
    String jeVoornaam = input.nextLine();

    System.out.print("Wat is je leeftijd? ");
    Integer jeLeeftijd = input.nextInt();
input.nextLine();
    System.out.print("Wat is je postcode? ");
    String jePostcode = input.nextLine();

    System.out.println("Je voornaam: " + jeVoornaam + " Je leeftijd: " + jeLeeftijd + " Je postcode: " + jePostcode);
  }
}
