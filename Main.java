import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner scnr= new Scanner(System.in);
        int mpgRating;
        double tankCapacity;
        double percentageGas;
        int rawRange;

        System.out.print("Enter your car's MPG rating (miles/gallon) as a positive integer: ");
            mpgRating = scnr.nextInt();
                if (mpgRating <= 0) {
                    System.out.println("\nERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
                    System.exit(0);
                }

        System.out.println("\nEnter your car's tank capacity (gallons) as a positive decimal number: ");
            tankCapacity = scnr.nextDouble();
                if (tankCapacity <= 0) {
                    System.out.print("ERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED FOR TANK CAPACITY!!!");
                    System.exit(0);
                }
        System.out.print("Enter the percentage of the gas tank that is currently filled (from 0-100%): ");
            percentageGas = scnr.nextDouble();
                if (percentageGas < 0) {
                    System.out.print("\nERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100(INCLUSIVE)!!!");
                    System.exit(0);
                }
                if (percentageGas > 100) {
                    System.out.print("\nERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100(INCLUSIVE)!!!");
                    System.exit(0);
                }
                rawRange = (int) Math.floor(mpgRating * tankCapacity * (percentageGas * 0.01));

                if (rawRange <= 25) {
                    System.out.print("\nAttention! Your current estimated range is running low: " + rawRange + " miles left!!!");

                }
                if (rawRange > 25) {
                    System.out.print("\nKeep driving! Your current estimated range is: " + rawRange + " miles!");
                }
                }




    }


