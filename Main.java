import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Patient patient=new Patient("milan", "male",12345,"9849966022","kathmandu",LocalDate.of(2006,5,15),"milanparajuli0322@gmail.com","o-");
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
    }
}
