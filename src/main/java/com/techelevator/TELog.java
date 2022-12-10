package com.techelevator;

import com.techelevator.util.TELogException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TELog extends RuntimeException {
    public static void log(String message) {
        PrintWriter dataOut = null;
        try {
            dataOut = new PrintWriter("log/search.log");
        } catch (Exception e) {
           throw new TELogException("An error has occurred.");
        }
        dataOut.println(message);
            dataOut.close();


    }

}
