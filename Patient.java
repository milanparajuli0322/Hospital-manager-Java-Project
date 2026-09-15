public class Patient {
    private String name;
    private int age;
    private String gender;
    private int patientId;
    private String phone;

    public Patient(String name,int age,String gender,int patientId,String phone)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.patientId=patientId;
        this.phone=phone;
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
    public String getPhone()
    {
        return phone;
    }
}
