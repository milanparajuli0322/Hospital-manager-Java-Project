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
    private String bloodGroup;

    public Patient(String name,String gender,int patientId,String phone,String address,LocalDate dateOfBirth,String email,String bloodGroup)
    {
        this.name=name;
        this.gender=gender;
        this.patientId=patientId;
        this.phone=phone;
        this.address=address;
        this.dateOfBirth=dateOfBirth;
        this.email=email;
        this.bloodGroup=bloodGroup;
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
    public String getBloodGroup()
    {
        return bloodGroup;
    }
}
