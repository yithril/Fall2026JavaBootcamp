package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PoemReader {
    public static void readFile(){

        try{
            FileReader fileReader = new FileReader("src/main/resources/yeats-poem.txt");

            //defensive coding: What if the file is huge?
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String input;

            //loop through the file row by row
            while((input = bufferedReader.readLine()) != null){
                System.out.println(input);
            }

            bufferedReader.close();
        }
        catch(IOException ex){
            System.out.println("Could not read file.");
            ex.printStackTrace();
        }
    }
}
