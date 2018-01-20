package drools.pathTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class PathTest {

    public static void main(String[] args) {
        String path = PathTest.class.getClassLoader().getResource("IOReadWriteTest.txt").getPath();
        writeFile(path);
        System.out.println(readFile(path));
    }

    private static String readFile(String path) {
        StringBuilder result = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(path)));
            String s = null;
            while ((s = br.readLine()) != null) {
                result.append(s + "\n");
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }

    private static void writeFile(String path) {
        BufferedWriter writer = null;
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            } else {
                writer = new BufferedWriter(new FileWriter(file, true));
                writer.write(readFile(path));
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.flush();
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
