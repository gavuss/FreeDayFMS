package forms.appointment;

/**
 * Created by Alexander Silaev on 25.05.2016.
 */
public enum Item {
    OFFICE("Выберите территориальный орган"),
    SERVICE("Выберите вид услуги"),
    OPERATION("Выберите тип операции");

    private final String name;

    Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
