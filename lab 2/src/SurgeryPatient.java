import java.util.Random;

public class SurgeryPatient extends Patient {
    int room;
    int bed;

    public void readIn() {
        // write random ned and room number using class Random
        Random rand = new Random();
        room = rand.nextInt(50);
        bed = rand.nextInt(100);

        this.patientCount++;
    }

    public void planSurgery() {
        // write out the room and bed number
        System.out.println("Room: " + room + " Bed: " + bed);
    }
}
