package w2;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ScheduleTest {

    @Test
    void addTerm() {

        MyCalendar calendar = mock(MyCalendar.class);

        when(calendar.isHoliday(any(LocalDate.class))).thenReturn(false);

        Schedule schedule = new Schedule(calendar);

        Term t = new Term(LocalDate.of(2019, 10,28), "Spotkanie");

        boolean added =  schedule.addTerm(t);

        assertTrue(added);

    }
}



/*

MyCalendar calendar = mock(MyCalendar.class);

        when(calendar.isHoliday(any(LocalDate.class))).thenReturn(false);

        Schedule s = new Schedule(calendar);

        Term t = new Term(LocalDate.now(),"Term1");

        boolean termAdded = s.addTerm(t);

        assertTrue(termAdded);

 */