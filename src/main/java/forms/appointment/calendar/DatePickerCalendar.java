package forms.appointment.calendar;

import com.qantium.uisteps.core.browser.pages.UIElement;
import com.qantium.uisteps.core.browser.pages.UIElements;
import com.qantium.uisteps.core.browser.pages.elements.TextBlock;
import com.qantium.uisteps.core.browser.pages.elements.lists.TextBlocks;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Александр on 24.05.2016.
 */
@FindBy(css = ".ui-datepicker-calendar")
public class DatePickerCalendar extends UIElement {

    @FindBy(xpath = "//td[contains(@title, 'Время доступно для записи')]")
    private TextBlocks freeDates;

    public List<String> getFreeDays() {
        List<String> freeDates = new ArrayList();
        boolean notFirst = false;
//        do {
//            if(notFirst) {
//                inOpenedBrowser().find(DatePickerHeader.class).clickNextButton();
//                notFirst = true;
//            }

            for (TextBlock element : this.freeDates.getElements()) {
                freeDates.add(element.getText());
            }
//        } while (inOpenedBrowser().find(DatePickerHeader.class).nextButton.isEnabled());


        return freeDates;
    }

}
