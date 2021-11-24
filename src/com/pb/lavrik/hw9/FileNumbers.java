package com.pb.lavrik.hw9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileNumbers {
    public static void main(String[] args) {
        creatNumderFile();
        createOddNumbersFile();
    }

    
    private static void creatNumderFile() {
        int i, j;

        Path path = Paths.get("numbers.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (j = 0; j < 10; j++) {
                for (i = 0; i < 10; i++) {
                    double foundDobl = (Math.random() * 99);
                    int found = 1 + (int) foundDobl;
                    writer.write(found + " ");
                }
                writer.newLine();
            }
        } catch (Exception ex) {
            System.out.println("Ошибка при записи файла:" + ex);
        }
        System.out.println("Записать в файл \"" + path.toAbsolutePath() + "\" произведена!");
    }

    public static void createOddNumbersFile() {

        String S1 = "";
        int i, j;
        int[][] resultMas = new int[10][10];
        Path path = Paths.get("numbers.txt");
        System.out.println("Чтение из файла \"" + path.toAbsolutePath() + "\" произведено!");


        try (BufferedReader reader = Files.newBufferedReader(path)) {

            System.out.println("----------------------------------");
            String line;
            i = j = 0;
            while ((line = reader.readLine()) != null) {

                Pattern pattern = Pattern.compile("\\d+");
                Matcher matcher = pattern.matcher(line);
                int start = 0;

                while (matcher.find(start)) {

                    String value = line.substring(matcher.start(), matcher.end());
                    int result = Integer.parseInt(value);
                    if (result % 2 == 0) {
                        result = 0;
                    }
                    System.out.println(result);
                    if (j < 10) {
                        if (i < 10) {
                            resultMas[i][j] = result;
                            i = i + 1;
                        } else {
                            i = 0;
                            j = j + 1;
                            resultMas[i][j] = result;
                        }
                    }
                    start = matcher.end();
                }
            }


        } catch (Exception ex) {
            System.out.println("Ошибка чтения файла: " + ex);
        }
        System.out.println("Чтение из файла выполнено!");


        Path path1 = Paths.get("odd-numbers.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(path1)) {
            for (j = 0; j < 10; j++) {
                for (i = 0; i < 10; i++) {
                    writer.write(resultMas[i][j] + " ");
                }
                writer.newLine();
            }
        } catch (Exception ex) {
            System.out.println("Ошибка при записи файла:" + ex);
        }
        System.out.println("Записать в файл \"" + path1.toAbsolutePath() + "\" произведена!");
    }
}


