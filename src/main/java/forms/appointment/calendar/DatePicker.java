package forms.appointment.calendar;

import com.qantium.uisteps.core.browser.pages.UIElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander Silaev on 25.05.2016.
 */
@FindBy(css = "#ui-datepicker-div")
public class DatePicker extends UIElement {

    private DatePickerHeader header;
    private DatePickerCalendar calendar;

    public List<FreeDate> getFreeDates() {
        List<FreeDate> freeDates = new ArrayList();
        boolean notFirst = false;

        int monthCount = header.monthSelect.getOptions().size();

        for(int i = 0; i < monthCount; i++) {
            if(i > 0) {
                header.monthSelect.selectByIndex(i);
            }
            for(String day: calendar.getFreeDays()) {
                freeDates.add(new FreeDate(day, header.getMonth(), header.getYear()));
            }
        }
        return freeDates;
    }
}
