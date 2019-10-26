package w2;

import java.time.LocalDate;

public class Term {

    private LocalDate termTime;
    private String name;

    public Term(LocalDate termTime, String name) {
        this.termTime = termTime;
        this.name = name;
    }

    public LocalDate getTermDate() {
        return termTime;
    }

    public String getName() {
        return name;
    }
}
