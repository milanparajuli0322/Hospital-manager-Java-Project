import java.util.ArrayList;


public class AppointmentManager {
    
    private final ArrayList<Appointment> appointments;

    public AppointmentManager()
    {
        appointments=new ArrayList<>();
    }

    public ArrayList<Appointment> getAllAppointments()
    {
        return new ArrayList<>(appointments);
    }
}
