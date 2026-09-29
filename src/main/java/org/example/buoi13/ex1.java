package org.example.buoi13;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ex1 {
    public static void main(String[] args) {

        // NumberFormat
        Double d = 1234556.343434;
        NumberFormat nf = NumberFormat.getInstance(Locale.CANADA);
        System.out.println(nf.format(d));

        System.out.println("----------------------");

        // DateFormat
        DateFormat df = DateFormat.getDateInstance(0, Locale.CANADA);
        System.out.println(df.format(new Date()));

        System.out.println("------------------------");

        // SingleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdf.format(new Date()));
    }
}
