import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilterStudents {
    public static void main(String[] args) {
        try (
                BufferedReader reader = new BufferedReader(new FileReader("studentsEN.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("students5.txt"))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().endsWith("5")) {
                    writer.write(line);
                    writer.newLine();
                }
            }
            System.out.println("Done! File students5.txt created.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}