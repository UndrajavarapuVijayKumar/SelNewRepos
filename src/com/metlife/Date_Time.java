package com.metlife;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class Date_Time {
    public static void main(String[] args) {
        /*Date d = new Date();
        System.out.println(d.getTime());
*/
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/mm/dd HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(dtf.format(ldt));
    }
   /* Date_Time(){

    }*/
}
