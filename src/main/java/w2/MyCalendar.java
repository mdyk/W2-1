package w2;

import java.time.LocalDate;
import java.time.LocalTime;

public class MyCalendar {

    public boolean isHoliday(LocalDate date) {

        boolean isHoliday;

        if(date.getMonthValue() == 11 && date.getDayOfMonth() == 1) {
            isHoliday = false;
        }
        else {
            isHoliday = true;
        }

        return isHoliday;
    }

    public String getTimeOfDay(LocalTime time) {

        if (time.getHour() >= 0 && time.getHour() < 6) {
            return "Night";
        }
        if (time.getHour() >= 6 && time.getHour() < 12){
            return "Night";
        }
        if (time.getHour() >= 12 && time.getHour() < 18) {
            return "Afternoon";
        }
        return "Evening";
    }


}
