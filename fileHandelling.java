import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class fileHandelling {
    public static void main(String[] args) {
        // creating a new file in java

        File newFile = new File("file.txt");

        try {
            newFile.createNewFile();
        } catch (Exception e) {
            System.out.println("Error occurred while creating new file");
        }


        // writing some contents in the file in java

        try {
            FileWriter fileWriter = new FileWriter("file.txt");
            fileWriter.write("Hello there I am Aashish Moktan");
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("Error occurred while writing in the file");
        }

        // reading the contents of the file in java

        try {
            Scanner inpFile = new Scanner(newFile);
            while (inpFile.hasNextLine()) {
                String str = inpFile.nextLine();
                System.out.println(str);
            }
            inpFile.close();
        } catch (Exception e) {
            System.out.println("Error occurred while reading the file");
        }

        // deleting the file

        try {
            newFile.delete();
            System.out.println("File deleted successfully");
        } catch (Exception e) {
            System.out.println("Error occurred while deleting the file");
        }
    }
}
