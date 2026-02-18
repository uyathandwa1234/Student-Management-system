Single Responsibility Principle (SRP)

Each class has a single responsibility:

Student → Defines common structure and behavior.

UndergraduateStudent → Handles undergraduate-specific data and tuition calculation.

GraduateStudent → Handles graduate-specific logic.

Builder classes → Responsible only for object construction.

Example:

public double calculateTuition() {
    double costPerCredit = 300;
    return (creditHours * costPerCredit) - scholarshipAmount;
}
The tuition logic is contained within the specific student class and is not mixed elsewhere, keeping responsibilities separate.

Liskov Substitution Principle (LSP)

Objects of UndergraduateStudent and GraduateStudent can be used wherever Student is expected.

Example:

Student undergrad = new UndergraduateStudent.Builder()
        .studentId("U001")
        .name("Uyathandwa Ngomana")
        .email("uyathandwa@gmail.com")
        .department("ICT")
        .creditHours(120)
        .scholarshipAmount(5000)
        .build();

Student graduate = new GraduateStudent.Builder()
        .studentId("G001")
        .name("Tlou Masebe")
        .email("tlou@gmail.com")
        .department("Engineering")
        .researchAssistant(true)
        .stipend(2000)
        .build();
        
Both objects work through polymorphism and can be treated as a Student, demonstrating proper LSP usage.
