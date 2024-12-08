package _15_InterviewQuestions2.Filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndWrite {
    public static void main(String[] args) {
        try {
            //Reading file
            File myObj = new File("C:/Users/ADMIN/Desktop/practice/java/practice/src/input");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
            // writing to a file
            StringBuilder fileContent = new StringBuilder("new text");
            try (FileWriter myWriter = new FileWriter(myObj)) {
                myWriter.write(fileContent.toString()); // Write collected content to file
                System.out.println("Successfully written to the file: " + myObj);
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
