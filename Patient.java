public class Patient {
    private String name;
    private int age;
    private String gender;
    private int patientId;

    public Patient(String name,int age,String gender,int patientId)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.patientId=patientId;
    }
    public int getPatientId()
    {
        return patientId;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
    public String getGender()
    {
        return gender;
    }
}
