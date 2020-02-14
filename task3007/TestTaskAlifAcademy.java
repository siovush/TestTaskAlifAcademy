package com.javarush.task.task30.task3007;

import java.io.*;

public class TestTaskAlifAcademy {
    public static void main(String[] args) throws Exception {
        String fileName = "C:/input.txt";
        String negativeFileName = "C:/noutput.txt";
        String positiveFileName = "C:/poutput.txt";
        String operation[] = new String[]{"*", "/", "+", "-"};
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = "";
        StringBuilder negBuilder = new StringBuilder();
        StringBuilder posBuilder = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            String[] words = line.split(" ");
            Integer result = 0;
            Integer first = Integer.valueOf(words[0]);
            Integer second = Integer.valueOf(words[1]);
            switch (operation[0]) {
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
        BufferedWriter negWriter = new BufferedWriter(new FileWriter(negativeFileName));
        BufferedWriter posWriter = new BufferedWriter(new FileWriter(positiveFileName));
        negWriter.write(negBuilder.toString().trim());
        posWriter.write(posBuilder.toString().trim());
        negWriter.close();
        posWriter.close();

    }
}
