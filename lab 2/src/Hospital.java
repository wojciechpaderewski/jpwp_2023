import java.util.Scanner;

public class Hospital {
    Patient[] patients = new Patient[10];

    public void addPatient() {
        // in case 1 add a ClinicPatient to the array and case 2 add a SurgeryPatient from user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 'c' for ClinicPatient or 's' for SurgeryPatient");
        String choice = scan.nextLine();
        if (choice == "cp") {
            ClinicPatient cp = new ClinicPatient();
            patients[cp.patientCount] = cp;
            cp.readIn();
        } else if (choice == "sp") {
            SurgeryPatient sp = new SurgeryPatient();
            patients[sp.patientCount] = sp;
            sp.readIn();
        } else {
            System.out.println("Invalid choice no patient added");
        }
        System.out.println(choice);
    }
}