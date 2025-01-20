import java.util.Scanner;

// Created public class.
public class AverageTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Created input for user to enter number of days. 
        System.out.print("Enter number of days: ");
        int numOfDays = scanner.nextInt();

        //Created input for user to enter temperatures.
        double[] temps = new double[numOfDays];
        System.out.println("Enter the temperature for " + numOfDays + " days: ");
        for (int i = 0; i < numOfDays; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            temps[i] = scanner.nextDouble();
        }

        //Created average temperature calculations. 
        double totalTemps = 0;
        for (double temp : temps) {
            totalTemps += temp;
        }
        double average = totalTemps / numOfDays;
        System.out.printf("\nThe average temperature is: %.2f\n", average);

        //Created number of days above average calculations.
        int aboveAverage = 0;
        for (double temp : temps){
            if (temp > average) {
                aboveAverage++;
            }

        }

        System.out.println("Number of days above average: " + aboveAverage);

        scanner.close();

    }
}
