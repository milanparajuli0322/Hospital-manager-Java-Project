public class Doctor
{
    private int doctorId;
    private String name;
    private String specialization;
    private String phone;
    private String email;

    public Doctor(int doctorId, String name, String specialization,String phone, String email)
    {
        if (doctorId <= 0)
        {
            throw new IllegalArgumentException("Doctor ID must be positive");
        }
        this.doctorId = doctorId;

        if (name == null || name.trim().isEmpty())
        {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name.trim();

        if (specialization == null || specialization.trim().isEmpty())
        {
            throw new IllegalArgumentException("Specialization cannot be empty");
        }
        this.specialization = specialization.trim().toUpperCase();

        if (phone == null || !phone.matches("\\d{10}"))
        {
            throw new IllegalArgumentException("Phone must contain 10 digits");
        }
        this.phone = phone;

        if (email == null || !email.matches(
                "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"))
        {
            throw new IllegalArgumentException("Invalid email");
        }
        this.email = email.trim();
    }

    public int getDoctorId()
    {
        return doctorId;
    }

    public String getName()
    {
        return name;
    }

    public String getSpecialization()
    {
        return specialization;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getEmail()
    {
        return email;
    }
}
