package Day1;

import java.io.*;
import java.util.ArrayList;

/**
 * {class description}
 * <p>
 * Created by (name) for (project).
 *
 * @version 1.0
 */
public class Main {

    private static File inputFile = new File("in/day1.txt");

    public static void main(String[] args) {
        System.out.println("Starting AOC2017 with data input \'" + inputFile + "\'\n");
        long startTime = System.currentTimeMillis();
        new Main().partOne();
        new Main().partTwo();
        long endTime = System.currentTimeMillis();
        System.out.println("\nCompleted after " + (endTime - startTime) + " millis");
    }

    public void partOne() {
        String data = readFile().get(0);
        int sum = 0;

        // Handle main loop
        for (int i = 0; i < data.length() - 1; i++) {
            if (data.charAt(i) == data.charAt(i + 1)) {
                sum += Integer.parseInt("" + data.charAt(i));
            }
        }

        // Handle circular
        if (data.charAt(data.length() - 1) == data.charAt(0)) {
            sum += Integer.parseInt("" + data.charAt(0));
        }

        System.out.println("Sum: "  + sum);
    }

    public void partTwo() {
        String data = readFile().get(0);
        int sum = 0;
        int step = data.length() / 2;

        // Handle main loop
        for (int i = 0; i < data.length() - 1; i++) {
            if (data.charAt(i) == data.charAt((i + step) % data.length())) {
                sum += Integer.parseInt("" + data.charAt(i));
            }
        }

        // Handle circular
        if (data.charAt(data.length() - 1) == data.charAt(step - 1)) {
            sum += Integer.parseInt("" + data.charAt(0));
        }

        System.out.println("Sum2: " + sum);
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
