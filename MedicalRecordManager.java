import java.util.ArrayList;

public class MedicalRecordManager
{
    private final ArrayList<MedicalRecord> medicalRecords;

    public MedicalRecordManager()
    {
        medicalRecords = new ArrayList<>();
    }

    public ArrayList<MedicalRecord> getAllMedicalRecords()
    {
        return new ArrayList<>(medicalRecords);
    }
}
