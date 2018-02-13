package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy \n HH:mm:ss");


    public static void main(String[] args) {

        Main main = new Main();
        main.getDate();



	// write your code here
    }

    private void getDate() {

        Calendar calendar = Calendar.getInstance();
        System.out.println();
        System.out.println(dateFormat.format(calendar.getTime()));

        calendar.add(Calendar.DAY_OF_YEAR, 7);









    }


}
