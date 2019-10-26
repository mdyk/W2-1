package w2;

import java.util.LinkedList;
import java.util.List;

public class Schedule {

    private List<Term> terms;
    private MyCalendar calendar;

    public Schedule(MyCalendar calendar) {
        terms = new LinkedList<>();
        this.calendar = calendar;
    }

    public boolean addTerm(Term term) {

        boolean added = false;

        if(!calendar.isHoliday(term.getTermDate())) {
            terms.add(term);
            added = true;
        }

        return added;
    }

    public List<Term> getTerms() {
        return terms;
    }
}
