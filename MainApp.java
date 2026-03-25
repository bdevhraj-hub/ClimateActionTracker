import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        User user = new User(name);

        System.out.print("Enter distance traveled (km): ");
        double distance = sc.nextDouble();
        user.addActivity(new TransportActivity(distance));

        System.out.print("Enter electricity usage (units): ");
        double units = sc.nextDouble();
        user.addActivity(new ElectricityUsage(units));

        System.out.print("Enter waste produced (kg): ");
        double waste = sc.nextDouble();
        user.addActivity(new WasteManagement(waste));

        double totalEmission = CarbonCalculator.calculateTotal(user);

        System.out.println("\nTotal Carbon Emission: " + totalEmission + " kg CO2");

        if (totalEmission > 15) {
            System.out.println("Status: HIGH");
        } else if (totalEmission > 8) {
            System.out.println("Status: MEDIUM");
        } else {
            System.out.println("Status: LOW");
        }

        RecommendationEngine.giveSuggestions(totalEmission);

        FileManager.saveData(user, totalEmission);

        sc.close();
    }
}
