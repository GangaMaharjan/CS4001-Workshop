import java.util.Scanner;

public class RickshawFare {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    
        double baseFare = 50;        
        double perKmRate = 15;         
        double perMinuteRate = 2;      
        double localDiscountRate = 0.10;  
        double nightSurchargeRate = 0.20; 

       
        System.out.print("Enter distance traveled (km): ");
        double distance = scanner.nextDouble();

        System.out.print("Enter travel time (minutes): ");
        double time = scanner.nextDouble();

        System.out.print("Is the customer a local? (yes/no): ");
        String localInput = scanner.next().toLowerCase();
        boolean isLocal = localInput.equals("yes") ? true : false;

        System.out.print("Is the travel during night? (yes/no): ");
        String nightInput = scanner.next().toLowerCase();
        boolean isNight = nightInput.equals("yes") ? true : false;

        double fare = baseFare + (distance * perKmRate) + (time * perMinuteRate);

    
        fare = (isLocal && distance > 10) ? fare * (1 - localDiscountRate) : fare;

        fare = (isNight) ? fare * (1 + nightSurchargeRate) : fare;

        System.out.printf("\nFinal Rickshaw Fare: Rs. %.2f\n", fare);

        scanner.close();
    }
}