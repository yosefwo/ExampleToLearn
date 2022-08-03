package files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MoveFileToDirByContainFile {

    private static int count;
    private static final String src = "C:\\Users\\USER\\OneDrive - Herzog College\\נריה\\הורדות מגוגל תמונות זונדל\\Photos from 2020\\";

    public static void main(String[] args) throws IOException {
        File folder = new File(src);
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
//                System.out.println("File " + listOfFiles[i].getName());
                if (listOfFiles[i].getName().endsWith(".json")){
                    String name = getNameFromeFile(listOfFiles[i]);
                    name = name.replaceAll("\"name\": \"","");
                    name = name.replaceAll("\"","");
                    System.out.println(name + " " + listOfFiles[i].getName().
                            substring(0,listOfFiles[i].getName().length()-5));
                    movToDir(listOfFiles[i].getName(),name);
                    reNamefile(listOfFiles[i].getName());
                }
            } else if (listOfFiles[i].isDirectory()) {
                System.out.println("Directory " + listOfFiles[i].getName());
            }
        }
        System.out.println(count);

    }

    private static void reNamefile(String name) {
        // Create an object of the File class
        // Replace the file path with path of the directory
        File file = new File("/home/mayur/Folder/GFG.java");

        // Create an object of the File class
        // Replace the file path with path of the directory
        File rename = new File("/home/mayur/Folder/HelloWorld.java");

        // store the return value of renameTo() method in
        // flag
        boolean flag = file.renameTo(rename);

        // if renameTo() return true then if block is
        // executed
        if (flag == true) {
            System.out.println("File Successfully Rename");
        }
        // if renameTo() return false then else block is
        // executed
        else {
            System.out.println("Operation Failed");

        }
    }

    private static void movToDir(String nameFile, String name) {

        String srcPlsFile = src + nameFile;
        String newDirPlsfile = src + name +"\\" + nameFile;
        Path result = null;
        try {
            result = Files.move(Paths.get(srcPlsFile), Paths.get(newDirPlsfile));
        } catch (IOException e) {
            System.out.println("Exception while moving file: " + e.getMessage());
        }
        if(result != null) {
            System.out.println("File moved successfully.");
        }else{
            System.out.println("File movement failed.");
        }

    }



    private static String getNameFromeFile(File listOfFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(listOfFile));
        String line;

        while ((line = br.readLine()) != null)
            if (line.contains("name")){
                counter();
                return line;
            }

        return "not contain name";
    }

    private static void counter() {
        count++;
    }
}
