import java.util.Scanner;
import java.text.DecimalFormat;

public class TripPlanner {
    static DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        // TODO: Get user input for trip details
        // - Distance (miles)
        // - Average speed (mph)
        // - Fuel efficiency (miles per gallon)
        // - Fuel price per gallon
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter trip distance (miles): ");
        double distance = sc.nextDouble();
        System.out.print("Enter average speed (mph): ");
        double speed = sc.nextDouble();
        System.out.print("Enter fuel efficiency (miles per gallon): ");
        double mpg = sc.nextDouble();
        System.out.print("Enter fuel price per gallon ($): ");
        double price = sc.nextDouble();
        // TODO: Calculate travel time using a return method
        double travelTime = calculateTravelTime(distance, speed);
        // TODO: Calculate fuel needed using a return method
        double fuelNeeded= calculateFuelNeeded(distance, mpg);
        // TODO: Calculate trip cost using a return method
        double tripCost = calculateTripCost(calculateFuelNeeded(distance, mpg), price);
        // TODO: Display results using a void method
        displayResults(travelTime, fuelNeeded, tripCost);
        
    }
    
    // TODO: Implement calculateTravelTime method
    public static double calculateTravelTime(double distance, double speed){
        return distance/speed;
    }
    // TODO: Implement calculateFuelNeeded method
    public static  double calculateFuelNeeded(double distance, double mpg){
        double gallons;
        gallons = distance/mpg;
        return gallons;
    }
    // TODO: Implement calculateTripCost method
    public static double calculateTripCost(double gallons, double price){
        return gallons * price;
    }
    // TODO: Implement displayResults method
    public static void displayResults(double travelTime, double fuelNeeded, double tripCost){
        System.out.println("Travel Time: " + df.format(travelTime) + " hours");
        System.out.println("Fuel Needed: " + df.format(fuelNeeded) + " gallons");
        System.out.println("Trip Cost: $" + df.format(tripCost));

    }
    
}
