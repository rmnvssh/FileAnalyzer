package com.company;
import java.io.*;

public class FileName {
    private String filename;
    private FileReader file;

    public FileName(String filename){
        this.filename = filename;
    }

    public void openFile() throws IOException{
        File fileHandler = new File(this.filename);

        if (!fileHandler.exists())
            throw new IOException("File does not exist!");

        this.file = new FileReader(fileHandler);
    }

    public String dataFromFile() throws IOException{
        BufferedReader reader = new BufferedReader(this.file);
        String line;
        StringBuilder stringBuilder = new StringBuilder();

        while ((line = reader.readLine()) != null ) {
            stringBuilder.append(line);
        }

        try {
            assert reader != null;
            reader.close();
        } catch (Exception e){
            System.out.println("Error occurred while closing buffer writer");
        }
        return stringBuilder.toString();
    }

}
