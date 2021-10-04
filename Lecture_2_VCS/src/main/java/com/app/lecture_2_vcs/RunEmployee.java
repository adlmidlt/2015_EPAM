package main.java.com.app.lecture_2_vcs;

public class RunEmployee {

    public static void main(String[] args) {

        Doctor doctor = new Doctor("Ivan", 45);
        System.out.println(doctor.toString());

        Doctor doctor1 = new Doctor("Redm", 67);
        System.out.println(doctor1.toString());

        Patient patient = new Patient("Greg", 34);
        System.out.println(patient.toString());

        Patient patient1 = new Patient("Gred", 14);
        System.out.println(patient1.toString());

        HeadPhysician headPhysician = new HeadPhysician("Irl", 34);
        System.out.println(headPhysician.toString());

        HeadPhysician headPhysician1 = new HeadPhysician("Itl", 34);
        System.out.println(headPhysician1.toString());

        HeadPhysician headPhysician3 = new HeadPhysician("Itl", 34);
        System.out.println(headPhysician3.toString());

        Doctor doctor2 = new Doctor("Gret", 46);
        System.out.println(doctor2.toString());

        Nurse nurse = new Nurse();
        System.out.println(nurse.toString());

        Nurse nurse1 = new Nurse();
        System.out.println(nurse1.toString());

        Nurse nurse3 = new Nurse();
        System.out.println(nurse3.toString());
    }
}
