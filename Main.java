import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Patient patient=new Patient("milan",12345,"9849966002","kathmandu",LocalDate.of(2006,5,15),
        "milanparajuli0322@gmail.com","o-","megha","9843733855",Patient.Gender.MALE);
        System.out.println("---Hospital manager---"); 

        System.out.println("Patient Id :"+patient.getPatientId());
        System.out.println("Patient Name :"+patient.getName());
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
        System.out.println("Patient Medicalconditions :"+patient.getMedicalConditions());
        System.out.print("Patient Emergencycontact :"+patient.getEmergencyContactName());
        System.out.println("-"+patient.getEmergencyContactPhone());
    }
}
