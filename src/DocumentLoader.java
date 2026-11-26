import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class DocumentLoader {

    public static void main(String[] args) {

        File folder = new File("docs");

        File[] files = folder.listFiles();

        if (files == null) {
            System.out.println("Cannot find data folder!");
            return;
        }

        for (File file : files) {

            if (file.isFile() && file.getName().endsWith(".txt")) {

                try {

                    String content = Files.readString(file.toPath());

                    System.out.println("Document: " + file.getName());

                    System.out.println(content);

                    System.out.println("--------------------");

                } catch (IOException e) {

                    System.out.println("Error reading file!");

                }
            }
        }
    }
}