package com.techelevator;

import com.techelevator.util.TELogException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;

public class TELog extends RuntimeException {
    public static void log(String message) {

        //PrintWriter dataOut = null;
        String fileName = "logs/search.log";
        File dataFile = new File(fileName);
        try (PrintWriter dataOutput = new PrintWriter(dataFile)){
            dataOutput.println(message);
        } catch (Exception e) {
           throw new TELogException("An error has occurred.");
        }
//            dataOut.close();


    }

}
