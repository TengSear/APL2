import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
// import java.nio.file.*;
// import java.util.List;
public class appendToFile {
    public static void main(String[] args) {
        String filePath = "New.txt";
        String content = "Hello world , my name is Zemmmmm";
        Path path = Paths.get(filePath);
        try {
            Files.write(path, content.getBytes(), StandardOpenOption.APPEND);
            System.out.println("Content: " + content);
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
