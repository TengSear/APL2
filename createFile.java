// import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.*;
// import java.util.List;

public class createFile {
    public static void main(String[] args) {
        String filePath = "New.txt";
        Path path = Paths.get(filePath);
        try {
            Files.createFile(path);
            System.out.println("File created " + filePath);
        }catch (FileAlreadyExistsException e) {
            System.out.println("File already exists " + filePath);
        }catch (IOException e) {
            System.out.println("An error occurred while creating the file ");
            e.printStackTrace();
        }
    }
}
