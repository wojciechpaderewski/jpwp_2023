public abstract class Patient {
    String Surname;
    int id;
    String doctor;
    int patientCount = 0;

    public abstract void readIn();
    public void writeOut() {
        System.out.println("Surname: " + Surname + " id: " + id + " doctor: " + doctor);
    }
}
