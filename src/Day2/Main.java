package Day2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * {class description}
 * <p>
 * Created by (name) for (project).
 *
 * @version 1.0
 */
public class Main {

    private static File inputFile = new File("in/day2.txt");

    public static void main(String[] args) {
        System.out.println("Starting AOC2017 with data input \'" + inputFile + "\'\n");
        long startTime = System.currentTimeMillis();

        Main m = new Main();
        m.partOne();
        m.partTwo();

        long endTime = System.currentTimeMillis();
        System.out.println("\nCompleted after " + (endTime - startTime) + " millis");
    }

    public void partOne() {

    }

    public void partTwo() {

    }

    private ArrayList<String> readFile() {
        ArrayList<String> lines = new ArrayList<String>();
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(inputFile);
            br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                lines.add(new String(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return lines;
    }
}
