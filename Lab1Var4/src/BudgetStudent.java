/**
 * Представляет студента, обучающегося на бюджетной основе, который может получить стипендию по результатам экзамена
 */
public class BudgetStudent extends Student {
    public BudgetStudent(String name, double averageGrade) {
        super(name, averageGrade);
        calculateScholarship();
    }

    public void calculateScholarship()
    {
        double baseScholarship = 100;
        if (getAverageGrade() >= 6 && getAverageGrade() < 7)
            setScholarship(baseScholarship); // установить базовую стипендию
        else if (getAverageGrade() >= 7 && getAverageGrade() < 8)
            setScholarship(baseScholarship* 1.25); // увеличить стипендию на 25%
        else if (getAverageGrade() >= 8 && getAverageGrade() <= 10)
            setScholarship(baseScholarship * 1.5); // увеличить стипендию на 50%
    }

    @Override
    public String toString() {
        return "Обучающийся на бюджете: " + super.toString() + "; Размер стипендии " + getScholarship();
    }
}