import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.*;

public class deleteFile {
    public static void main(String[] args) {

        String filePath = "King.txt";
        Path path = Paths.get(filePath);
        try {
            Files.delete(path);
            System.out.println("Deleted : " + filePath);
        } catch ( NoSuchFileException e) {
            System.out.println("Error : " + filePath);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("An error occurred " );
            e.printStackTrace();
        }
    }
}
