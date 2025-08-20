import java.util.Scanner;

public class StudentFee {
    public static void main(String[] args) {
        double fee, discountPercent, discount, finalFee;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Student Fee (INR): ");
        fee = input.nextDouble();

        System.out.print("Enter the University Discount Percent: ");
        discountPercent = input.nextDouble();

        discount = (fee * discountPercent) / 100;
        finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);

        input.close();
    }
}
