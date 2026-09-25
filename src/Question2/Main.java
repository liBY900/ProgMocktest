package Question2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current estate agent name: ");
        String agentName = scanner.nextLine();

        System.out.print("Enter the property price: ");
        double propertyPrice = scanner.nextDouble();

        EstateAgentSales estateAgent =
                new EstateAgentSales(agentName, propertyPrice);

        estateAgent.printPropertyReport();
    }
}
