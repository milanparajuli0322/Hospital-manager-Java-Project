import java.util.ArrayList;

public class DoctorManager {
    final private ArrayList<Doctor> doctors;

    public DoctorManager()
    {
        doctors=new ArrayList<>();
    }

    public ArrayList<Doctor> getAllDoctors()
    {
        return new ArrayList<>(doctors);
    }
}

