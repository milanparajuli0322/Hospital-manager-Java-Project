import java.util.ArrayList;

public class DoctorManager {
    final private ArrayList<Doctor> doctors;

    public DoctorManager()
    {
        doctors=new ArrayList<>();
    }


    public void addDoctor(Doctor doctor)
    {
        if(doctor==null)
        {
            throw new IllegalArgumentException();
        }
        else
        {
            doctors.add(doctor);
        }
    }


    public ArrayList<Doctor> getAllDoctors()
    {
        return new ArrayList<>(doctors);
    }
}

