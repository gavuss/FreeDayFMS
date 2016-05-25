package forms.appointment.calendar;

import com.qantium.uisteps.core.browser.pages.UIElements;
import com.qantium.uisteps.core.browser.pages.elements.Link;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Александр on 25.05.2016.
 */


public class FreeDate {

    private final String day, month, year;

    public FreeDate(String day, String month, String year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return day + " " + month + " " + year;
    }
}
