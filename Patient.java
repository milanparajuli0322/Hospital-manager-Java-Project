import java.time.LocalDate;
import java.time.Period;

public class Patient {
    private String name;
    private String gender;
    private int patientId;
    private String phone;
    private String address;
    private LocalDate dateOfBirth;
    private String email;

    public Patient(String name,String gender,int patientId,String phone,String address,LocalDate dateOfBirth,String email)
    {
        this.name=name;
        this.gender=gender;
        this.patientId=patientId;
        this.phone=phone;
        this.address=address;
        this.dateOfBirth=dateOfBirth;
        this.email=email;
    }
    public int getPatientId()
    {
        return patientId;
    }
    public String getName()
    {
        return name;
    }
    public String getGender()
    {
        return gender;
    }
    public String getPhone()
    {
        return phone;
    }
    public String getAddress()
    {
        return address;
    }
    public LocalDate getDateOfBirth()
    {
        return dateOfBirth;
    }
    public int getAge()
    {
        return Period.between(dateOfBirth,LocalDate.now()).getYears();
    }
    public String getEmail()
    {
        return email;
    }
}
