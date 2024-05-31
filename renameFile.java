import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class renameFile {
    public static void main(String[] args) {
        String oldFilePath = "NewF.txt";
        String newFilePath = "King.txt";
        Path oldPath = Paths.get(oldFilePath);
        Path newPath = Paths.get(newFilePath);
        try {
            Files.move(oldPath, newPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File rename :" + newFilePath);
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
