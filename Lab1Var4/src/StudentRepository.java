import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private List<Student> students;

    public StudentRepository() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public boolean removeStudent(String name) {
        return students.removeIf(student -> student.getName().equals(name));
    }

    public boolean updateAverageGrade(String name, double newAverageGrade) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                student.setAverageGrade(newAverageGrade);
                if (student instanceof BudgetStudent) {
                    ((BudgetStudent) student).calculateScholarship();
                }
                return true;
            }
        }
        return false;
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }
}