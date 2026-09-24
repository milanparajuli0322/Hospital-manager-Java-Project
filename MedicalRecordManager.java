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


    public void addMedicalRecord(MedicalRecord record)
    {
        if(record==null)
        {
            throw new IllegalArgumentException("Medical record cannot be empty");
        }
        for(MedicalRecord medicalRecord:medicalRecords)
        {
            if(medicalRecord.getRecordId()==record.getRecordId())
            {
                throw new IllegalArgumentException("Medical record Id already exists");
            }
        }
        medicalRecords.add(record);
    }

}
