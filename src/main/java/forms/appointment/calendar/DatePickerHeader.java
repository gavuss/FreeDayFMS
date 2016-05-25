package forms.appointment.calendar;

import com.qantium.uisteps.core.browser.pages.UIElement;
import com.qantium.uisteps.core.browser.pages.elements.Button;
import com.qantium.uisteps.core.browser.pages.elements.Select;
import com.qantium.uisteps.core.browser.pages.elements.TextBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

/**
 * Created by Александр on 25.05.2016.
 */

@FindBy(css = ".ui-datepicker-header")
public class DatePickerHeader extends UIElement {

    @FindBy(css = ".ui-datepicker-month")
    public Select monthSelect;

    @FindBy(css = ".ui-datepicker-year")
    public Select yearSelect;

    public String getMonth() {
        return monthSelect.getFirstSelectedOption().getText();
    }

    public String getYear() {
        return yearSelect.getFirstSelectedOption().getText();
    }

}
