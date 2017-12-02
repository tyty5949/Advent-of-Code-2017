package Day3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    private static File inputFile = new File("in/day3.txt");

    public static void main(String[] args) {
        System.out.println("Starting AOC2017 with data input \'" + inputFile + "\'\n");
        long startTime = System.nanoTime();

        Main m = new Main();
        System.out.println("PART 1");
        m.partOne();
        System.out.println("\nPART 2");
        m.partTwo();

        long endTime = System.nanoTime();
        double timeTaken = ((endTime - startTime) / 1000000.0);
        if (timeTaken >= 1000) {
            timeTaken /= 1000.0;
            System.out.println("\nCompleted after " + timeTaken + " millis");
        } else {
            System.out.println("\nCompleted after " + timeTaken + " millis");
        }
    }

    public void partOne() {
        ArrayList<String> lines = readFile();
        int sum = 0;

        for (String line : lines) {

        }

        System.out.println("Sum: " + sum);
    }

    public void partTwo() {
        ArrayList<String> lines = readFile();
        int sum = 0;

        for (String line : lines) {

        }

        System.out.println("Sum: " + sum);
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
