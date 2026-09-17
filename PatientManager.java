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


    public ArrayList<Patient> findPatientByName(String name)
    {
        ArrayList<Patient> results=new ArrayList<>();
        if(name==null || name.trim().isEmpty())
        {
            throw new IllegalArgumentException("Search name cannot be empty");
        }
        else
        {
            for(Patient patient:patients)
            {
                if((patient.getName().toLowerCase()).contains(name.toLowerCase().trim()))
                {
                    results.add(patient);
                }
            }
            return results;
        }
    }


    public ArrayList<Patient> findPatientByPhone(String phone)
    {
        ArrayList<Patient> results=new ArrayList<>();
        if(phone==null || phone.trim().isEmpty())
        {
            throw new IllegalArgumentException("Search phone cannot be empty");
        }
        else
        {
            for(Patient patient:patients)
            {
                if(patient.getPhone().contains(phone.trim()))
                {
                    results.add(patient);
                }
            }
            return results;
        }
    }


    public ArrayList<Patient> findPatientByEmail(String email)
    {
        ArrayList<Patient> results=new ArrayList<>();
        if(email==null || email.trim().isEmpty())
        {
            throw new IllegalArgumentException("Search email cannot be empty");
        }
        else
        {
            for(Patient patient:patients)
            {
                if(patient.getEmail().contains(email.trim()))
                {
                    results.add(patient);
                }
            }
            return results;
        }
    }


    public ArrayList<Patient> findPatientByBloodgroup(String bloodgroup)
    {
        ArrayList<Patient> results=new ArrayList<>();
        if(bloodgroup==null || bloodgroup.trim().isEmpty())
        {
            throw new IllegalArgumentException("Blood group cannot be empty");
        }
        else
        {
            for(Patient patient:patients)
            {
                if(patient.getBloodGroup().trim().contains(bloodgroup))
                    results.add(patient);
            }
            return results;
        }
    }


    public ArrayList<Patient> filterByStatus(Patient.Status status)
    {
        ArrayList<Patient> results=new ArrayList<>();
        if(status==null)
        {
            throw new IllegalArgumentException("Status cannot be empty");
        }
        else
        {
            for(Patient patient:patients)
            {
                if(patient.getStatus()==status)
                {
                    results.add(patient);
                }
            }
            return results;
        }
    }


    public int countPatientByStatus(Patient.Status status)
    {
        int count=0;
        if(status==null)
        {
            throw new IllegalArgumentException("Status cannot be empty");
        }
        else
        {
            for(Patient patient:patients)
            {
                if(patient.getStatus()==status)
                {
                    count++;
                }
            }
            return count;
        }
    }


    public int countRegisteredPatients()
    {
        return patients.size();
    }
}
