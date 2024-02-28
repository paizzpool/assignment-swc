import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for appointment details
        System.out.print("Enter Patient Name: ");
        String patientName = scanner.nextLine();

        System.out.print("Enter Appointment Date: ");
        String apptDate = scanner.nextLine();

        System.out.print("Enter Appointment Time: ");
        String apptTime = scanner.nextLine();

        System.out.print("Enter Dentist Name: ");
        String dentistName = scanner.nextLine();

        
        Appointment appointment = new Appointment(patientName, apptDate, apptTime, dentistName);

        // display details user masukkan
        System.out.println(appointment.toString());
    }
}
