import com.qantium.uisteps.allure.tests.BaseTest;
import org.junit.Test;
import pages.start.StartPage;

/**
 * Created by Alexander Silaev on 25.05.2016.
 */
public class TemporaryResidence extends BaseTest {

    @Test
    public void temporaryResidence() {
        open(StartPage.class)
                .confirm()
                .then().makeAppointment("УФМС России по г. Москве", "Гражданство", "Подача документов", "ул. Новослободская д. 45Б");

    }
}