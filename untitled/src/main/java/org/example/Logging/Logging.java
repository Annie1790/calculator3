package org.example.Logging;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Logging {
    FileWriter writer = new FileWriter("result.txt");

    public Logging() throws IOException {
    }

    private String getCurrentTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public void writeToFile(String result) throws IOException {
        writer.write(getCurrentTime() + " Calculation result is: " + result);
        System.out.println("logging was succesfull");
        writer.close();
    }

}
