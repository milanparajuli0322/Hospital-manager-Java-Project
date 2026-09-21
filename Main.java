import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // First patient object
        Patient patient=new Patient("milan",12345,"9849966002","kathmandu",LocalDate.of(2005,5,15),"milanparajuli0322@gmail.com","O-","megha","9843733855");

        // Second patient object
        Patient patient2 = new Patient("Ram",12341,"9811111111","Pokhara",LocalDate.of(2005, 3, 10),"ram@gmail.com","A+","raju","1234567899");
        
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
        patient.removeMedicalConditions("ASthma");
        System.out.println("Patient Medicalconditions :"+patient.getMedicalConditions());
        patient.setEmergencyContact("manju", "9802302345");
        System.out.print("Patient Emergencycontact :"+patient.getEmergencyContactName());
        System.out.println("-"+patient.getEmergencyContactPhone());


        // Patient adding
        PatientManager patientmanager=new PatientManager();
        patientmanager.addPatient(patient);
        patientmanager.addPatient(patient2);
        System.out.println("Patient registered sucessfully");
        

        // Patient searching
        Patient foundPatient=patientmanager.findPatientById(12345);
        if(foundPatient==null)
        {
            System.out.println("Patient not found");
        }
        else
        {
            System.out.println("Patient found :"+foundPatient.getName());
        }


        // Patients showing
        ArrayList<Patient>AllPatients=patientmanager.getAllPatients();
        System.out.println("Total patients :"+AllPatients.size());
        for(Patient patients:AllPatients)
        {
            System.out.println(patients.getName()+"-"+patients.getPatientId());
        }


        // Patient removing
        boolean removed=patientmanager.removePatientById(12341);
        if(removed==true)
        {
            System.out.println("Patient removed sucessfully");
        }
        else
        {
            System.out.println("Unable to remove patient");
        }


        // Patient phone updating
        boolean updatedPhone=patientmanager.updatePatientPhone(12345, "9802159918");
        if(updatedPhone==true)
        {
            System.out.println("Phone number updated sucessfully");
        }
        else
        {
            System.out.println("Patient not found");
        }


        // Patient email updating
        boolean updatedEmail=patientmanager.updatePatientEmail(12345, "xyz@gmail.com");
        if(updatedEmail==true)
        {
            System.out.println("Email updated sucessfully");
        }
        else
        {
            System.out.println("Patient not found");
        }


        // Patient address updating
        boolean updatedAddress=patientmanager.updatePatientAddress(12345, "bhaktapur");
        if(updatedAddress==true)
        {
            System.out.println("Address updated sucessfully");
        }
        else
        {
            System.out.println("Patient not found");
        }


        // Patient emergency contact updating
        boolean updatedEmergencyContact=patientmanager.updatePatientEmergencycontact(12345,"lila","9812121212");
        if(updatedEmergencyContact==true)
        {
            System.out.println("Emergency contact updated sucessfully");
        }
        else
        {
            System.out.println("Patient not found");
        }


        // Patient name searching
        ArrayList<Patient> resultName=patientmanager.findPatientByName("mil");
        for(Patient patients:resultName)
        {
            System.out.println(patients.getPatientId()+"-"+patients.getName());
        }


        // Patient phone seaching
        ArrayList<Patient> resultPhone=patientmanager.findPatientByPhone("98021");
        for(Patient patients:resultPhone)
        {
            System.out.println(patients.getPatientId()+"-"+patients.getName());
        }


        // Patient email searching
        ArrayList<Patient> resultEmail=patientmanager.findPatientByEmail("xyz@gmail.com");
        for(Patient patients:resultEmail)
        {
            System.out.println(patients.getPatientId()+"-"+patient.getName());
        }


        // Patient bloodgroup searching
        ArrayList<Patient> resultBloodgroup=patientmanager.findPatientByBloodgroup("O-");
        for(Patient patients:resultBloodgroup)
        {
            System.out.println(patients.getPatientId()+"-"+patients.getName());
        }


        // Patient status filtering
        ArrayList<Patient>resultFilterByStatus=patientmanager.filterByStatus(Patient.Status.ACTIVE);
        for(Patient patients:resultFilterByStatus)
        {
            System.out.println(patients.getPatientId()+"-"+patients.getName());
        }


        // Patient counting by status
        int activeCount=patientmanager.countPatientByStatus(Patient.Status.ACTIVE);
        System.out.println("Active patients :"+activeCount);


        // Patient counting by registered
        System.out.println("Total registered patients :"+patientmanager.countRegisteredPatients());


        // Patient gender filtering
        ArrayList<Patient> resultFilterByGender=patientmanager.filterPatientByGender(Patient.Gender.MALE);
        for(Patient patients:resultFilterByGender)
        {
            System.out.println(patients.getPatientId()+"-"+patients.getName());
        }


        // Patient searching by registration date
        ArrayList<Patient> resultRegistrationdate=patientmanager.findPatientByRegistrationdate(LocalDate.of(2007,02,03));
        for(Patient patients:resultRegistrationdate)
        {
            System.out.println(patients.getPatientId()+"-"+patients.getName());
        }


        // Patient sorting by name
        ArrayList<Patient> resultSortedPatientByName=patientmanager.sortPatientByName();
        for(Patient patients:resultSortedPatientByName)
        {
            System.out.println(patients.getPatientId()+"-"+patients.getName());
        }


        // Patient sorting by id
        ArrayList<Patient> resultSortedPatientById=patientmanager.sortPatientById();
        for(Patient patients:resultSortedPatientById)
        {
            System.out.println(patients.getPatientId()+"-"+patients.getName());
        }


        // Patient filtering by age
        ArrayList<Patient> resultFilterPatientByAge=patientmanager.filterPatentByAge(10, 25);
        for(Patient patients:resultFilterPatientByAge)
        {
            System.out.println(patients.getPatientId()+"-"+patients.getName());
        }


        // Patient searching by medical condition
        ArrayList<Patient> resultFindPatientByMedicalconditions=patientmanager.findPatientByMedicalconditions("vomit");
        for(Patient patients:resultFindPatientByMedicalconditions)
        {
            System.out.println(patients.getPatientId()+"-"+patients.getName());
        }


        // Patient counting by bloodgroup
        System.out.println("o- patients :"+patientmanager.countPatientByBloodgroup("o+"));


        // Patient counting by gender
        System.out.println("Male patients :"+patientmanager.countPatientByGender(Patient.Gender.MALE));


        // Patient counting by status
        System.out.println("Active patients :"+patientmanager.countPatientByStatus(Patient.Status.ACTIVE));


        // First doctor object
        Doctor doctor=new Doctor(1234,"john",Doctor.Specialization.CARDIOLOGY,"9800000000","john@gmail.com");

        System.out.println("Doctor name :"+doctor.getName());
        System.out.println("Doctor Id :"+doctor.getDoctorId());
        DoctorManager doctormanager=new DoctorManager();
        System.out.println("Total doctors :"+doctormanager.getAllDoctors().size());
    }
}
