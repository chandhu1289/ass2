import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        double distanceInFeet, yards, miles;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        distanceInFeet = input.nextDouble();

        // Convert feet to yards and miles
        yards = distanceInFeet / 3;
        miles = yards / 1760;

        System.out.println("Your distance in feet is " + distanceInFeet +" which is " + yards + " yards" +" and " + miles + " miles.");

        input.close();
    }
}
