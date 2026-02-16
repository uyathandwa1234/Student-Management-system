package za.ac.cput.domain;

public class UndergraduateStudent extends Student {

    private int creditHours;
    private double scholarshipAmount;

    private UndergraduateStudent(Builder builder) {
        this.studentId = builder.studentId;
        this.name = builder.name;
        this.email =builder.email;
        this.department = builder.department;
        this.creditHours = builder.creditHours;
        this.scholarshipAmount = builder.scholarshipAmount;
    }

    @Override
    public double calculateTuition() {
        double costPerCredit = 300;
        return (creditHours * costPerCredit) - scholarshipAmount;
    }

    @Override
    public String getStudentType() {
        return "Undergraduate Student";
    }

    @Override
    public void displayStudentDetails() {
        System.out.println("----- Undergraduate Student -----");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Department: " + department);
        System.out.println("Credit Hours: " + creditHours);
        System.out.println("Scholarship: " + scholarshipAmount);
        System.out.println("Tuition: " + calculateTuition());
        System.out.println();
    }

    // Builder Class
    public static class Builder {
        private String studentId;
        private String name;
        private String email;
        private String department;
        private int creditHours;
        private double scholarshipAmount;

        public Builder(String studentId, String name, String email, String department) {
            this.studentId = studentId;
            this.name = name;
            this.email = email;
            this.department = department;
        }

        public Builder creditHours(int creditHours) {
            this.creditHours = creditHours;
            return this;
        }

        public Builder scholarshipAmount(double scholarshipAmount) {
            this.scholarshipAmount = scholarshipAmount;
            return this;
        }

        public UndergraduateStudent build() {
            return new UndergraduateStudent(this);
        }
    }
}