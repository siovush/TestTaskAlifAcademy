package java_test_task;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class TestTaskAlifAcademy {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String line = "";
        StringBuilder negBuilder = new StringBuilder();
        StringBuilder posBuilder = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            String[] words = line.split(" ");
            Integer result = 0;
            Integer first = Integer.valueOf(words[0]);
            Integer second = Integer.valueOf(words[1]);
            switch (args[1]) {
                case "*":
                    result = first * second;
                    break;
                case "/":
                    result = first / second;
                    break;
                case "+":
                    result = first + second;
                case "-":
                    result = first - second;
                    break;
            }
            if (result < 0) negBuilder.append(result.toString()).append('\n');
            else posBuilder.append(result.toString()).append('\n');
        }
        reader.close();
        String negativeFileName = "neg_output.txt";
        String positiveFileName = "pos_output.txt";
        BufferedWriter negWriter = new BufferedWriter(new FileWriter(negativeFileName));
        BufferedWriter posWriter = new BufferedWriter(new FileWriter(positiveFileName));
        negWriter.write(negBuilder.toString().trim());
        posWriter.write(posBuilder.toString().trim());
        negWriter.close();
        posWriter.close();

    }
}
