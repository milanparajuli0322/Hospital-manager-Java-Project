import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Patient patient=new Patient("milan",12345,"9849966002","kathmandu",LocalDate.of(2005,5,15),"milanparajuli0322@gmail.com","O-","megha","9843733855");
        PatientManager patientmanager=new PatientManager();

        System.out.println("---Hospital manager---"); 

        System.out.println("Patient Id :"+patient.getPatientId());
        System.out.println("Patient Name :"+patient.getName());
        patient.makeGenderMale();
        System.out.println("Patient Gender :"+patient.getGender());
        System.out.println("Patient Contact :"+patient.getPhone());
        System.out.println("Patient Address :"+patient.getAddress());
        System.out.println("Patient Dateofbirth :"+patient.getDateOfBirth());
        System.out.println("Patient Age :"+patient.getAge());
        System.out.println("Patient Email :"+patient.getEmail());
        System.out.println("Patient Bloodgroup :"+patient.getBloodGroup());
        System.out.println("Patient Registrationdate :"+patient.getRegistrationDate());
        System.out.println("Patient Status :"+patient.getStatus());
        patient.discharge();
        System.out.println("Patient Status :"+patient.getStatus());
        patient.activate();
        System.out.println("Patient Status :"+patient.getStatus());
        patient.addMedicalConditions("asthma");
        patient.addMedicalConditions("jaundice");
        System.out.println("Patient Medicalconditions :"+patient.getMedicalConditions());
        patient.removeMedicalConditions("asthma");
        patient.setEmergencyContact("manju", "9802302345");
        System.out.print("Patient Emergencycontact :"+patient.getEmergencyContactName());
        System.out.println("-"+patient.getEmergencyContactPhone());
        patientmanager.addPatient(patient);
        
        Patient patient2 = new Patient("Ram",12341,"9811111111","Pokhara",LocalDate.of(2005, 3, 10),"ram@gmail.com","A+","raju","1234567899");
        patientmanager.addPatient(patient2);
        System.out.println("Patient registered sucessfully");
        Patient foundPatient=patientmanager.findPatientById(12345);

        if(foundPatient==null)
        {
            System.out.println("Patient not found");
        }
        else
        {
            System.out.println("Patient found :"+foundPatient.getName());
        }

        ArrayList<Patient>AllPatients=patientmanager.getAllPatients();
        System.out.println("Total patients :"+AllPatients.size());
        for(Patient patients:AllPatients)
        {
            System.out.println(patients.getName()+"-"+patients.getPatientId());
        }
    }
}
