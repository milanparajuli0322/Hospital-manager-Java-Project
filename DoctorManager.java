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


    public Doctor findDoctorById(int doctorId)
    {
        if(doctorId<=0)
        {
            throw new IllegalArgumentException("Doctor id search cannot be empty");
        }
        for(Doctor doctor:doctors)
        {
            if(doctor.getDoctorId()==doctorId)
            {
                return doctor;
            }        
        }
        return null;
    }
}

