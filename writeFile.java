// import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.*;
// import java.util.List;
public class writeFile {
    public static void main(String[] args) {
        String filePath = "New.txt";
        String content = "Hello world";
        Path path = Paths.get(filePath);
        try {
            Files.write(path, content.getBytes(),
             StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("Content: " + content);
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
