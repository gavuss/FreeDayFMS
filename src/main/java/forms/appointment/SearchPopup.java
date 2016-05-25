package forms.appointment;

import com.qantium.uisteps.core.browser.pages.UIElement;
import com.qantium.uisteps.core.browser.pages.elements.Link;
import com.qantium.uisteps.core.browser.pages.elements.TextField;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.htmlelements.annotations.Name;

/**
 * Created by Alexander Silaev on 24.05.2016.
 */
@Name("Всплывающее окно поиска")
@FindBy(css = ".f-placeholder.active")
public class SearchPopup extends UIElement {

    @FindBy(css = "input[class*='select-search']")
    public TextField searchRow;

    @Step("Найти '{0}'")
    public void search(String item) {
        searchRow.enter(item);
        find(Link.class, By.xpath("//span[contains(text(),'" + item + "')]")).click();
    }

}
