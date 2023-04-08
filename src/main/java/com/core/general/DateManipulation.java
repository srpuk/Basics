package com.core.general;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateManipulation {
    public static void main(String[] args) {
        String d = "2020-03-16 05:55:00";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(d, formatter);
//LocalDateTime dateTime2=dateTime.minusHours(1);
        LocalDateTime dateTime3 = dateTime.plusMinutes(570);
        LocalTime open = LocalTime.of(9, 30);
        LocalTime close = LocalTime.of(15, 30);

        for (int i = 0; i < 20; i++) {
            LocalTime time = dateTime3.toLocalTime();
            if (time.isBefore(open) || time.isAfter(close)) {
                dateTime3 = dateTime3.minusMinutes(1020);
                System.out.println(dateTime3);
                dateTime3 = dateTime3.minusMinutes(60);
            } else {
                System.out.println(dateTime3);
                dateTime3 = dateTime3.minusMinutes(60);
            }
        }
    }
}
