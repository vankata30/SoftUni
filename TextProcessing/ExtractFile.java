package TextProcessing;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filePath = scanner.nextLine();
        String[] fullPath = filePath.split("\\\\");


        String fullFileName = fullPath[fullPath.length-1];
        String fileName = fullFileName.split("\\.")[0];
        String fileExtension = fullFileName.split("\\.")[1];


        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + fileExtension);

    }
}
