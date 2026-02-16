package za.ac.cput;

import za.ac.cput.domain.GraduateStudent;
import za.ac.cput.domain.Student;
import za.ac.cput.domain.UndergraduateStudent;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student undergrad = new UndergraduateStudent.Builder(
                "U001",
                "Uyathandwa Ngomana",
                "231173229@mycput.ac.za",
                "ICT"
        )
                .creditHours(15)
                .scholarshipAmount(1000)
                .build();

        Student graduate = new GraduateStudent.Builder(
                "G001",
                "Tlou Masebe",
                "234567588@mycput.ac.za",
                "Engineering"
        )
                .researchAssistant(true)
                .stipend(2000)
                .build();

        undergrad.displayStudentDetails();
        graduate.displayStudentDetails();    }
}
