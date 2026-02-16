package za.ac.cput.domain;

public class GraduateStudent extends Student {

    private boolean researchAssistant;
    private double stipend;

    private GraduateStudent(Builder builder) {
        this.studentId = builder.studentId;
        this.name = builder.name;
        this.email =builder.email;
        this.department = builder.department;
        this.researchAssistant = builder.researchAssistant;
        this.stipend = builder.stipend;
    }

    @Override
    public double calculateTuition() {
        double baseTuition = 5000;
        if (researchAssistant) {
            return baseTuition - stipend;
        }
        return baseTuition;
    }

    @Override
    public String getStudentType() {
        return "Graduate Student";
    }

    @Override
    public void displayStudentDetails() {
        System.out.println("----- Graduate Student -----");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Department: " + department);
        System.out.println("Research Assistant: " + researchAssistant);
        System.out.println("Stipend: " + stipend);
        System.out.println("Tuition: " + calculateTuition());
        System.out.println();
    }

    // Builder Class
    public static class Builder {
        private String studentId;
        private String name;
        private String email;
        private String department;
        private boolean researchAssistant;
        private double stipend;

        public Builder(String studentId, String name, String email, String department) {
            this.studentId = studentId;
            this.name = name;
            this.email = email;
            this.department = department;
        }

        public Builder researchAssistant(boolean researchAssistant) {
            this.researchAssistant = researchAssistant;
            return this;
        }

        public Builder stipend(double stipend) {
            this.stipend = stipend;
            return this;
        }

        public GraduateStudent build() {
            return new GraduateStudent(this);
        }
    }
}