package com.example.hessel.facharbeit.Utils;

/**
 * Created by hessel on 25.03.2018.
 */

public class Month {

    public static String getMonth(int month_number){
        switch (month_number){
            case 1:
                return "Januar";
            case 2:
                return "Februar";
            case 3:
                return "März";
            case 4:
                return "April";
            case 5:
                return "Mai";
            case 6:
                return "Juni";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "Oktober";
            case 11:
                return "November";
            case 12:
                return "Dezemeber";
        }
        return "";
    }
}
