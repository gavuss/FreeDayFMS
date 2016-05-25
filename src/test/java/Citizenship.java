import com.qantium.uisteps.allure.tests.BaseTest;
import forms.appointment.OnlineAppointmentsForm;
import org.junit.Test;
import pages.start.StartPage;

/**
 * Created by Alexander Silaev on 25.05.2016.
 */
public class Citizenship extends BaseTest implements Runnable {

    @Test
    @Override
    public void run() {
        open(StartPage.class).confirm()
                .then().makeAppointment("УФМС России по г. Москве", "Гражданство", "Подача документов", "ул. Новослободская д. 45Б");

    }
}
