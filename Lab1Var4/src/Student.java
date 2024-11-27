/**
 * Представляет студента с указанием имени, среднего балла и информации о стипендии.
 */
public class Student {
    private String name;
    private double averageGrade;
    private double scholarship;

    public Student(String name, double averageGrade) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.scholarship = 0; // по умолчанию стипендия равна 0
    }

    public String getName() {
        return name;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public double getScholarship() {
        return scholarship;
    }

    protected void setScholarship(double scholarship) {
        this.scholarship = scholarship;
    }
    protected void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }
    @Override
    public String toString() {
        return "Фамилия: " + name + "; Средний балл: " + averageGrade;
    }
}