import java.util.Scanner;

public class Appointment {
    // Attributes
    private String patientName;
    private String apptDate;
    private String apptTime;
    private String dentistName;

    // Default Constructor
    public Appointment() {
        // Initialize the object with default values or leave them null
    }

    // Parameterized Constructor
    public Appointment(String patientName, String apptDate, String apptTime, String dentistName) {
        this.patientName = patientName;
        this.apptDate = apptDate;
        this.apptTime = apptTime;
        this.dentistName = dentistName;
    }

    // Accessor methods
    public String getPatientName() {
        return patientName;
    }

    public String getApptDate() {
        return apptDate;
    }

    public String getApptTime() {
        return apptTime;
    }

    public String getDentistName() {
        return dentistName;
    }

    // Mutator methods
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setApptDate(String apptDate) {
        this.apptDate = apptDate;
    }

    public void setApptTime(String apptTime) {
        this.apptTime = apptTime;
    }

    public void setDentistName(String dentistName) {
        this.dentistName = dentistName;
    }

    // toString() method
    @Override
    public String toString() {
        return String.format("Appointment Details:\n" +
                             "Patient Name: %s\n" +
                             "Appointment Date: %s\n" +
                             "Appointment Time: %s\n" +
                             "Dentist Name: %s",
                             patientName, apptDate, apptTime, dentistName);
  
}


public void takeUserInput() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Patient Name: ");
    setPatientName(scanner.nextLine());

    System.out.print("Enter Appointment Date: ");
    setApptDate(scanner.nextLine());

    System.out.print("Enter Appointment Time: ");
    setApptTime(scanner.nextLine());

    System.out.print("Enter Dentist Name: ");
    setDentistName(scanner.nextLine());
}





}


