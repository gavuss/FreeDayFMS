package pages.appointment;

import forms.appointment.OnlineAppointmentsForm;
import pages.GuvmPage;

/**
 * Created by Alexander Silaev on 25.05.2016.
 */
public class AppointmentPage extends GuvmPage {

    public void makeAppointment(String office, String service, String operation, String adress) {
        onDisplayed(OnlineAppointmentsForm.class).makeAppointment(office, service, operation, adress);
    }
}
