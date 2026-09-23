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

    public void addAppointment(Appointment appointment)
    {
        if(appointment==null)
        {
            throw new IllegalArgumentException("Appointment cannot be empty");
        }
        else
        {
            for(Appointment val:appointments)
            {
                if(val.getAppointmentId()==appointment.getAppointmentId())
                {
                    throw new IllegalArgumentException("Appointment Id already taken");
                }
            }
            appointments.add(appointment);
        }
    }
}
