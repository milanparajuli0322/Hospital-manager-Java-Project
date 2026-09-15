public class Main {
    public static void main(String[] args) {
        Patient patient=new Patient("milan", 20,"male",12345,"9849966022","kathmandu");
        System.out.println("Hospital manager"); 

        System.out.println("Patient Id :"+patient.getPatientId());
        System.out.println("Patient Name :"+patient.getName());
        System.out.println("Patient Age :"+patient.getAge());
        System.out.println("Patient Gender :"+patient.getGender());
        System.out.println("Patient Contact :"+patient.getPhone());
        System.out.println("Patient Address :"+patient.getAddress());
    }
}
