import java.io.FileWriter;
import java.io.IOException;

class FileManager {

    public static void saveData(User user, double emission) {
        try {
            FileWriter writer = new FileWriter("data.txt", true);
            writer.write("User: " + user.getName() + "\n");
            writer.write("Emission: " + emission + " kg CO2\n");
            writer.write("--------------------------\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }
}
