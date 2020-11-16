import java.util.Scanner;

public class Main 
{
  public static void printNumbers(){
    for (int i = 48; i < 58; i++) { //48 - 57 = 0-9 from ASCII
      String a = Character.toString ((char) i); //converts i to ASCII characters and stores in a
      System.out.println(a); //prints out corresponding characters of i!
    }
  }

  public static void printLowerCase(){
    for (int i = 97; i < 123; i++) { //97 - 123 = a - z from ASCII
      String b = Character.toString ((char) i);
      System.out.println(b);
    }
  }

  public static void printUpperCase(){
    for (int i = 65; i < 91; i++) { //65 - 91 = A - Z from ASCII
      String c = Character.toString ((char) i);
      System.out.println(c);
    }
  }

  public static void questions(){
    Scanner input = new Scanner(System.in);

    System.out.println("What is the name of your favorite pet?");
    String petName = input.nextLine();
    System.out.println(petName);

    System.out.println("What is the age of your favorite pet?");
    int petAge = Integer.parseInt(input.nextLine());
    System.out.println(petAge);

    System.out.println("What is your lucky number?");
    int luckyNumber = Integer.parseInt(input.nextLine());
    System.out.println(luckyNumber);

    System.out.println("Do you have a favorite quarterback?");
    String quarterback = input.nextLine();
    System.out.println(quarterback);

    if (quarterback.equals("yes")) {      
        System.out.println("What is your favorite quarterback's jersey number?");
        int jerseyNumber = Integer.parseInt(input.nextLine());
        System.out.println(jerseyNumber);
    } else {
        System.out.println("Onto the next question!");
    }

    System.out.println("What is the 2 digit model year of your car?");
    int carYear = Integer.parseInt(input.nextLine());
    System.out.println(carYear);

    System.out.println("What is the first name of your favorite actor or actress?");
    String actor = input.nextLine();
    System.out.println(actor);

    System.out.println("Enter a random number between 1 and 50.");
    int randomNumber = Integer.parseInt(input.nextLine());
    System.out.println(randomNumber);
  }

  public static void numGenerator() {
    
    if (quarterback.equals("yes")) {
      int magicBall = (jerseyNumber * randomNumber);
    } else {
      int magicBall = (luckyNumber * randomNumber);
    }
    System.out.println(magicBall);

    int lot1 = 
  }

  public static void main(String [] args) {
    printNumbers();
    printLowerCase();
    printUpperCase();
    Scanner Input = new Scanner(System.in);
    System.out.println("Please Enter Your Name ");
    String name = Input.nextLine();
    System.out.println("Hello " + name);

    System.out.println("Would you like to proceed to the interactive portion?");
    String x = Input.nextLine();

    switch (x) {
      case "yes":
      case "y":
        questions();
        numGenerator();
        break;
      case "no":
      case "n":
        System.out.println("Please come back later to complete the survey");
        break;
    }
  }
}
