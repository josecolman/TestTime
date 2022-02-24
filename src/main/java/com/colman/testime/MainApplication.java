package com.colman.testime;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;

public class MainApplication {

    public static void main(String[] args) {

        System.out.println("\n\n*********************************************************\n");

        ZoneId zid = ZoneId.systemDefault();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.getDefault());
        LocalDateTime localDateTime = LocalDateTime.now();
        Date now = Date.from(localDateTime.atZone(zid).toInstant());
        System.out.println("Current LO Date/time: " + df.format(now) + ", ZoneId: " + zid);

        ZoneId zidPY = ZoneId.of("America/Asuncion");

        SimpleDateFormat dfPY = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", new Locale("es", "PY"));
        LocalDateTime localDateTimePY = LocalDateTime.now();
        Date nowPY = Date.from(localDateTimePY.atZone(zidPY).toInstant());
        System.out.println("Current PY Date/time: " + dfPY.format(nowPY) + ", ZoneId: " + zidPY);

        System.out.println("\n*********************************************************");

    }

}
