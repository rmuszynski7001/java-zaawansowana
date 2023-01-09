package day0901;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileUtil {

    public String readFile(String path) throws IOException {

        var fileReader = new FileReader(path);
        var bufferedReader = new BufferedReader(fileReader);

        var stringBuilder = new StringBuilder();

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line);
        }
        return stringBuilder.toString();
    }
    public void writeFile(String path, String content) {

    }
}
