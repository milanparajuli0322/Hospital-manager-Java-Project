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
        for (Patient existingPatient:patients)
        {
            if(patient.getPatientId()==existingPatient.getPatientId())
            {
                throw new IllegalArgumentException("Patient Id already exists");
            }
        }
        patients.add(patient);
    }


    public Patient findPatientById(int patientId)
    {
        for(Patient patient:patients)
        {
            if(patient.getPatientId()==patientId)
            {
                return patient;
            }
        }
        return null;
    }


    public ArrayList<Patient> getAllPatients()
    {
        return new ArrayList<>(patients);
    }


    public boolean removePatientById(int patientId)
    {
        for(Patient patient:patients)
        {
            if(patient.getPatientId()==patientId)
            {
                patients.remove(patient);
                return true;
            }
        }
        return false;
    }


    public boolean updatePatientPhone(int patientId,String newPhone)
    {
        Patient patient=findPatientById(patientId);
        if(patient==null)
        {
            return false;
        }
        else
        {
            patient.setPhone(newPhone);
            return true;
        }
    }


    public boolean updatePatientEmail(int patientId,String newEmail)
    {
        Patient patient=findPatientById(patientId);
        if(patient==null)
        {
            return false;
        }
        else
        {
            patient.setEmail(newEmail);
            return true;
        }
    }


    public boolean updatePatientAddress(int patientId,String newAddress)
    {
        Patient patient=findPatientById(patientId);
        if(patient==null)
        {
            return false;
        }
        else
        {
            patient.setAddress(newAddress);
            return true;
        }
    }


    public boolean updatePatientEmergencycontact(int patientId,String newEmergencyContactName,String newEmergencyContactPhone)
    {
        Patient patient=findPatientById(patientId);
        if(patient==null)
        {
            return false;
        }
        else
        {
            patient.setEmergencyContact(newEmergencyContactName, newEmergencyContactPhone);
            return true;
        }
    }
}
