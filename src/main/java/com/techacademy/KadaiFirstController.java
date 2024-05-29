package com.techacademy;

import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("/dayofweek/{val1}")
    public String dispDayOfWeek(@PathVariable int val1) {
        Integer i = val1;
        String s = i.toString();
        String year = s.substring(0,4); int y = Integer.parseInt(year);
        String month = s.substring(4,6); int m = Integer.parseInt(month) - 1;
        String day = s.substring(6,8); int d = Integer.parseInt(day);
        String dayofweek;
        dayofweek = Calendar(y,m,d);

        // webページ上に表示
        return dayofweek;
    }

    public String Calendar(int y,int m,int d) {
        Calendar cl = Calendar.getInstance();
        cl.set(Calendar.YEAR,y);
        cl.set(Calendar.MONTH,m);
        cl.set(Calendar.DATE,d);
        switch (cl.get(Calendar.DAY_OF_WEEK)) {
        case Calendar.SUNDAY: return "日曜日";
        case Calendar.MONDAY: return "月曜日";
        case Calendar.TUESDAY: return "火曜日";
        case Calendar.WEDNESDAY: return "水曜日";
        case Calendar.THURSDAY: return "木曜日";
        case Calendar.FRIDAY: return "金曜日";
        case Calendar.SATURDAY: return "土曜日";
        }
          throw new IllegalStateException();

    }

    @GetMapping("/plus/{val1}/{val2}")
    public int calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        return res;
    }

    @GetMapping("/minus/{val1}/{val2}")
        public int calcMinus(@PathVariable int val1, @PathVariable int val2) {
            int res = 0;
            res = val1 - val2;
            return res;
    }

    @GetMapping("/times/{val1}/{val2}")
    public int calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 * val2;
        return res;
}
    @GetMapping("/divide/{val1}/{val2}")
    public int calcDivide(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 / val2;
        return res;
}
}