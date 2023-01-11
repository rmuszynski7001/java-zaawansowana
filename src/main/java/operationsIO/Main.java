package operationsIO;

import java.io.*;
import java.nio.CharBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        //      fileReader();
        //     fileInputStream();
//        bufferedReader();
//        buffer();
        path();
    }

    private static void path() throws IOException {
        Path path = Paths.get("src/main/resources/channelFile");
        if(!Files.exists(path))
            Files.createFile(path);
            Files.write(path, "Tomek".getBytes(), StandardOpenOption.WRITE);
    }
    private static void buffer(){
        CharBuffer charBuffer = CharBuffer.allocate(6);
        String name = "Tomek";
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            charBuffer.put(c);
        }

        System.out.println(Arrays.toString(charBuffer.array()));

    }

    private static void bufferedReader() throws IOException {
        var fileReader = new FileReader("src/main/resources/input");
        var fileWriter = new FileWriter("src/main/resources/output");
        var bufferedReader = new BufferedReader(fileReader);
        var bufferedWriter = new BufferedWriter(fileWriter);

        String line;

        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
            bufferedWriter.write("\r");
            System.out.println(line);
        }
//        bufferedWriter.close();
        bufferedWriter.flush();
    }

    private static void fileReader() throws IOException {
        var fileReader = new FileReader("src/main/resources/input");
        var fileWriter = new FileWriter("src/main/resources/output");

        System.out.println((char) fileReader.read());
        int i;
        while ((i = fileReader.read()) != -1) {
            fileWriter.write(i);
            System.out.println((char) i);
        }
    }

    private static void fileInputStream() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src/main/resources/input");
        FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/output");

//        System.out.println(fileInputStream.available());

//        int i = fileInputStream.read();
//        int i1 = fileInputStream.read();
//        fileOutputStream.write(i);
//        char c = (char) i;
//        char c1 = (char) i1;
//
//        System.out.println(c);
//        System.out.println(c1);
//
//        int i2 = fileInputStream.read();
//        System.out.println(i2);
        int i;
        while ((i = fileInputStream.read()) != -1) {
            fileOutputStream.write(i);
            System.out.println(i);
        }

    }
}
