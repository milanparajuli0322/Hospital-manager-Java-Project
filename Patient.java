import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Patient {
    private String name;
    private int patientId;
    private String phone;
    private String address;
    private LocalDate dateOfBirth;
    private String email;
    private String bloodGroup;
    private LocalDate registrationDate;
    private Status status;
    private ArrayList<String> medicalConditions;
    private String emergencyContactName;
    private String emergencyContactPhone;
    private Gender gender;

    public enum Status
    {
        ACTIVE,
        DISCHARGED,
        INACTIVE
    }

    public enum Gender
    {
        MALE,
        FEMALE,
        OTHER,
        NULL
    }

    public Patient(String name,int patientId,String phone,String address,LocalDate dateOfBirth,
        String email,String bloodGroup,String emergencyContactNAme,String emergencyContactPhone)
    {

        if(name==null || name.trim().isEmpty())
        {
            throw new IllegalArgumentException("Patient name cannot be empty");
        }
        this.name=name;

        if(patientId<=0)
        {
            throw new IllegalArgumentException("Patient Id must be positive");
        }
        this.patientId=patientId;

        if(phone==null || !phone.matches("\\d{10}"))
        {
            throw new IllegalArgumentException("Phone number must contain 10 digits");
        }
        this.phone=phone;

        if(address==null || address.trim().isEmpty())
        {
            throw new IllegalArgumentException("Patient address cannot be empty");
        }
        this.address=address;

        if(dateOfBirth.isAfter(LocalDate.now()))
        {
            throw new IllegalArgumentException("Dateofbirth cannot be in future");
        }
        if(Period.between(dateOfBirth,LocalDate.now()).getYears()>120)
        {
            throw new IllegalArgumentException("Patient age cannot extend 120 years");
        }
        this.dateOfBirth=dateOfBirth;

        if(email==null || !email.matches("^[A-Za-z0-9+_.-]+@gmail\\.com$"))
        {
            throw new IllegalArgumentException("Invalid email address");   
        }
        this.email=email;

        if(bloodGroup==null || !bloodGroup.matches("^(A+|B+|AB+|O+|A-|B-|AB-|O-)$"))
        {
            throw new IllegalArgumentException("Invalid blood group");
        }
        this.bloodGroup=bloodGroup;

        if(emergencyContactNAme==null || emergencyContactNAme.trim().isEmpty())
        {
            throw new IllegalArgumentException("Emergency contact name cannot be empty");
        }
        this.emergencyContactName=emergencyContactNAme;

        if(emergencyContactPhone==null || !emergencyContactPhone.matches("\\d{10}"))
        {
            throw new IllegalArgumentException("Emergency contact number must contain 10 digits");
        }
        this.emergencyContactPhone=emergencyContactPhone;

        this.registrationDate=LocalDate.now();
        this.status=Status.ACTIVE;
        this.medicalConditions=new ArrayList<>();
        this.gender=Gender.NULL;
    }

    public int getPatientId()
    {
        return patientId;
    }

    public String getName()
    {
        return name;
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

    public LocalDate getRegistrationDate()
    {
        return registrationDate;
    }

    public Status getStatus()
    {
        return status;
    }

    public void discharge()
    {
        this.status=Status.DISCHARGED;
    }

    public void activate()
    {
        this.status=Status.ACTIVE;
    }

    public void deactivate()
    {
        this.status=Status.INACTIVE;
    }

    public ArrayList<String> getMedicalConditions()
    {
        return medicalConditions;
    }

    public void addMedicalConditions(String condition)
    {
        if(condition==null || condition.trim().isEmpty())
        {
            throw new IllegalArgumentException("Medical condition cannot be empty");
        }
        
        for(String existingCondition : medicalConditions)
        {
            if(existingCondition.equalsIgnoreCase(condition.trim()))
            {
                throw new IllegalArgumentException("Medical condition "+condition+" already exists");
            }
        }
        medicalConditions.add(condition);
    }

    public void removeMedicalConditions(String condition)
    {
        boolean found=true;
        if(condition==null || condition.trim().isEmpty())
        {
            throw new IllegalArgumentException("Medical condition cannot be empty");
        }
        for(String existingCondition : medicalConditions)
        {
            if(!(existingCondition.equalsIgnoreCase(condition.trim())))
            {
                found=false;
            }
            else
            {
                found=true;
                break;
            }
        }
        if(found==false)
        {
            throw new IllegalArgumentException("Medical condition doesn't exist");
        }
        medicalConditions.remove(condition);
    }

    public String getEmergencyContactName()
    {
        return emergencyContactName;
    }

    public String getEmergencyContactPhone()
    {
        return emergencyContactPhone;
    }

    public void setEmergencyContact(String emergencyContactName,String emergencyContactPhone)
    {
        if (emergencyContactName == null || emergencyContactName.trim().isEmpty())
        {
            throw new IllegalArgumentException("Emergency contact name cannot be empty");
        }

        if (emergencyContactPhone == null || !emergencyContactPhone.matches("\\d{10}"))
        {
            throw new IllegalArgumentException("Emergency contact phone must contain exactly 10 digits");
        }

        this.emergencyContactName=emergencyContactName;
        this.emergencyContactPhone=emergencyContactPhone;
    }

    public Gender getGender()
    {
        return gender;
    }

    public void makeGenderFemale()
    {
        this.gender=Gender.FEMALE;
    }

    public void makeGenderMale()
    {
        this.gender=Gender.MALE;
    }

    public void makeGenderOther()
    {
        this.gender=Gender.OTHER;
    }
}
