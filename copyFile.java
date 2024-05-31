import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
// import java.nio.file.StandardOpenOption;

public class copyFile {
    public static void main(String[] args) {
        String sourceFilePath = "New.txt";
        String destinationFilePath = "NewF.txt";
        Path sourcePath = Paths.get(sourceFilePath);
        Path destinationPath = Paths.get(destinationFilePath);
        try {
            Files.copy(sourcePath, destinationPath,
             StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied from " + sourcePath + " to " + destinationPath);
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
