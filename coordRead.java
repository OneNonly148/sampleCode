import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class coordRead {
    public static List<String> x = new ArrayList<>();
    public static List<String> y = new ArrayList<>();
    public static List<String> prop = new ArrayList<>();

    public static void readLine(String filePath) {
        try {
            List <String> lines = Files.readAllLines(Paths.get(filePath));
            for (int i = 0; i < lines.size(); i++) {
                String[] parts = lines.get(i).split(" "); // assuming the file content is comma-separated
                if (parts.length >= 3) {
                    x.add(parts[0]);
                    y.add(parts[1]);
                    prop.add(parts[2]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}