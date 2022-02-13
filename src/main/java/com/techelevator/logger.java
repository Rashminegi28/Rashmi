package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


    public class Log {
        private String text;

        public void main(String args[]) throws FileNotFoundException {
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM.dd.yyyy; HH:mm:ss a");


            File loggedInfo = new File("C:\\Users\\Student\\workspace\\java-capstone-module-1-team-3\\target\\Log.txt");

            try {
                loggedInfo.createNewFile();
            } catch (IOException e) {
                System.out.println("file does not exist" + e.getMessage());
            }
            PrintWriter writer = new PrintWriter("Log.txt");
            public void writeToLog(PrintWriter writer){
                text = "";
                writer.println(dateFormat + text);
            }
        }
    }

