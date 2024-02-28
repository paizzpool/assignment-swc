import java.util.InputMismatchException;
import java.util.Scanner;

public class DentalBookingSystem {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        Appointment[] schedule = new Appointment[20];

        for (int i = 0; i < schedule.length; i++) {
            System.out.println("Enter details for Appointment " + (i + 1));
            Appointment appointment = new Appointment();
            appointment.takeUserInput();
            schedule[i] = appointment;
        }

        // Display all appointment details
        System.out.println("All Appointments:");
        for (Appointment appointment : schedule) {
            if (appointment != null) {
                System.out.println(appointment.toString());
            }
        }

        // Search for appointments by date
        System.out.print("Enter a date to search for appointments (MM/DD/YYYY): ");
        String searchDate = inputScanner.nextLine();
        searchAndDisplayAppointments(schedule, searchDate);

        // Cancel
        try {
            System.out.print("Enter the index of the appointment to cancel: ");
            int cancelIndex = Integer.parseInt(inputScanner.nextLine());
            cancelAppointment(schedule, cancelIndex);

            // Display updated appointment details after cancel
            System.out.println("Appointments after cancellation:");
            for (Appointment appointment : schedule) {
                if (appointment != null) {
                    System.out.println(appointment.toString());
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid index.");
        }
    }

    private static void searchAndDisplayAppointments(Appointment[] schedule, String searchDate) {
        System.out.println("Appointments for " + searchDate + ":");
        for (Appointment appointment : schedule) {
            if (appointment != null && appointment.getApptDate().equals(searchDate)) {
                System.out.println(appointment.toString());
            }
        }
    }

    private static void cancelAppointment(Appointment[] schedule, int cancelIndex) {
        if (cancelIndex >= 0 && cancelIndex < schedule.length && schedule[cancelIndex] != null) {
            System.out.println("Appointment at index " + cancelIndex + " canceled.");
            schedule[cancelIndex] = null;
        } else {
            System.out.println("Invalid index. No appointment canceled.");
        }
    }
}
