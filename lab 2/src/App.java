public class App {
    private static int surgaryPatientPay= 1000;
    private static int clinicPatientPay= 500;
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Hospital hospital = new Hospital();
        hospital.addPatient();
        hospital.addPatient();
         
        calcPay(hospital.patients);

        for (Patient p : hospital.patients) {
            if (p instanceof SurgeryPatient) {
                SurgeryPatient sp = (SurgeryPatient) p;
                sp.planSurgery();
            }
        }
    }

    public static void calcPay( Patient[] patients) {
        // calculate the pay for each patient in the array
        for (Patient p : patients) {
            if (p instanceof ClinicPatient) {
                System.out.println("ClinicPatient pay is " + clinicPatientPay + "zł");
            }
            if (p instanceof SurgeryPatient) {
                System.out.println("SurgeryPatient pay is " + surgaryPatientPay + "zł");
            }
        }
    }
}
