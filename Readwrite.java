import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Readwrite {
    public static void main(String[] args) {

        String filename = "sample.txt";

        try {
            // STEP 1: Create & write initial content
            try (FileWriter fw = new FileWriter(filename)) {
                fw.write("This is the original content.\n");
            }

            // STEP 2: Read BEFORE update
            System.out.println("Before Update:");
            try (FileReader fr1 = new FileReader(filename)) {
                int ch;
                while ((ch = fr1.read()) != -1) {
                    System.out.print((char) ch);
                }
            }

            // STEP 3: Update file (overwrite with new content)
            try (FileWriter fw2 = new FileWriter(filename)) {
                fw2.write("This content is UPDATED.\nJava File Handling Demo.");
            }

            // STEP 4: Read AFTER update
            System.out.println("\n\nAfter Update:");
            try (FileReader fr2 = new FileReader(filename)) {
                int ch;
                while ((ch = fr2.read()) != -1) {
                    System.out.print((char) ch);
                }
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

