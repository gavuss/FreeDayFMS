package forms.appointment;

import com.qantium.uisteps.core.browser.pages.UIElement;
import com.qantium.uisteps.core.browser.pages.UIElements;
import com.qantium.uisteps.core.browser.pages.elements.Button;
import com.qantium.uisteps.core.then.Then;
import forms.appointment.calendar.DatePicker;
import forms.appointment.calendar.FreeDate;
import forms.appointment.calendar.DatePickerCalendar;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.List;

import static forms.appointment.Item.*;


/**
 * Created by Alexander Silaev on 24.05.2016.
 */
@FindBy(css = "#appointment_form")
public class OnlineAppointmentsForm extends UIElement {

    public void makeAppointment(String office, String service, String operation, String adress) {
        search(OFFICE, office);
        search(SERVICE, service);
        search(OPERATION, operation);
        chooseOffice(adress);
        List<FreeDate> freeDates = getDatePicker().then().getFreeDates();

        for (FreeDate freeDate : freeDates) {
            System.out.println(freeDate);
        }
    }

    @Step("В разделе \"{0}\" найти \"{1}\"")
    private void search(Item item, String name) {
        getSelect(item.toString()).click();
        onDisplayed(SearchPopup.class).search(name);
    }

    private void chooseOffice(String adress) {
        UIElements<Button> items = findAll(Button.class, By.cssSelector(".cf-item-input .radio"));
        for (Button item : items.getElements()) {
            if (item.getText().replace("\u00A0", " ").contains(adress)) {
                item.click();
                return;
            }
        }
        throw new RuntimeException("Не найдено подразделение с адресом: " + adress);
    }

    private Button getSelect(String name) {
        return find(Button.class, By.xpath("//*[contains(text(), '" + name + "')]/../*[@class='select-input']"));
    }

    private Then<DatePicker> getDatePicker() {
        find(Button.class, By.cssSelector("input.e-datepicker")).click();
        return then(DatePicker.class);
    }
}
