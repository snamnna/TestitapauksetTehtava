package org.example;

public class TimeUtils {
    public static int timeToSec(String time) {
        String[] part = time.split(":");
        int hh = Integer.parseInt(part[0]);
        int mm = Integer.parseInt(part[1]);
        int ss = Integer.parseInt(part[2]);

        return 3600 * hh + 60 * mm + ss;
    }

    public static String secToTime(int a) {
        int hh, mm, ss;

        if (a < 0) {
            return "Negative input not accepted";
        }

        hh = a / 3600;
        a = a - (3600 * hh);
        mm = a / 60;
        ss = a - (60 * mm);

        String res = "";

        if(hh < 10) {
            res = "0" + hh + ":";
        } else if(hh > 10) {
            res = hh + ":";
        }
        if (mm <= 10) {
            res = res + "0" + mm + ":";
        } else {
            res = res + mm + ":";
        }
        if (ss <= 10) {
            res = res + "0" + ss;
        } else {
            res = res + ss;
        }

        return res;
    }
}