package pages.start;

import com.qantium.uisteps.core.browser.pages.BaseUrl;
import com.qantium.uisteps.core.browser.pages.Page;
import com.qantium.uisteps.core.browser.pages.elements.Button;
import com.qantium.uisteps.core.then.Then;
import org.openqa.selenium.support.FindBy;
import pages.GuvmPage;
import pages.appointment.AppointmentPage;

/**
 * Created by Alexander Silaev on 24.05.2016.
 */
@BaseUrl("/services/appointment")
public class StartPage extends GuvmPage {

    @FindBy(css = "#confirm")
    public Button confirmButton;

    public Then<AppointmentPage> confirm() {
        confirmButton.click();
        return then(AppointmentPage.class);
    }

}


