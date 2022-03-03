package com.company;

import java.io.*;
import java.util.Scanner;


public class Data {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write file to read");
        String inputFile = scanner.nextLine();
        FileName inFile = new FileName(inputFile);
        try {
            inFile.openFile();
            String data = inFile.dataFromFile();
            System.out.println("Write file path to write");
            FileAnalyzer analysis = new FileAnalyzer(data);
            analysis.setCountSymbolMap();
            String outputFile = analysis.getCountSymbolAsString();
            FileWriter writer = new FileWriter(scanner.nextLine()+"output.txt");
            writer.write(outputFile);
            writer.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}