/**
 * Представляет студента, обущающегося на платной основе, который не получает стипендию.
 */
public class PaidStudent extends Student {
    public PaidStudent(String name, double averageGrade) {
        super(name, averageGrade);
    }

    @Override
    public String toString() {
        return "Обучающийся на платной основе: " + super.toString() + "; Стипедия отсутствует";
    }
}