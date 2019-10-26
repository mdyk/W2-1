package w2;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class MyCalendarTest {


    @Test
    public void getTimeOfDayTest() {
         MyCalendar calendar = new MyCalendar();

         LocalTime morningHour = LocalTime.of(10,0);

         String timeOfDay = calendar.getTimeOfDay(morningHour);

         assertEquals("Night", timeOfDay);
         assertNotEquals("foo",timeOfDay);

         

    }

}