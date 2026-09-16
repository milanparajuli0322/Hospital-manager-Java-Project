import java.util.ArrayList;


public class PatientManager {
    final private ArrayList<Patient> patients;

    
    public PatientManager()
    {
        patients=new ArrayList<>();
    }


    public void addPatient(Patient patient)
    {
        if(patient==null)
        {
            throw new IllegalArgumentException("Patient cannot be null");
        }
        patients.add(patient);
    }
}
