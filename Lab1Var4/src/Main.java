import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        StudentRepository repository = new StudentRepository();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nКонсольное меню:");
            System.out.println("1. Добавить студента");
            System.out.println("2. Удалить студента");
            System.out.println("3. Обновить средний балл студента");
            System.out.println("4. Показать всех студентов");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Очищаем буфер

            switch (choice) {
                case 1:
                    System.out.print("Введите имя студента: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите средний балл: ");
                    double averageGrade = scanner.nextDouble();
                    System.out.print("Выберите тип студента (1 - бюджетный, 2 - платный): ");
                    int type = scanner.nextInt();

                    if (type == 1) {
                        repository.addStudent(new BudgetStudent(name, averageGrade));
                    } else {
                        repository.addStudent(new PaidStudent(name, averageGrade));
                    }
                    System.out.println("Студент успешно добавлен!");
                    break;

                case 2:
                    System.out.print("Введите имя студента для удаления: ");
                    String nameToRemove = scanner.nextLine();
                    if (repository.removeStudent(nameToRemove)) {
                        System.out.println("Студент успешно удалён!");
                    } else {
                        System.out.println("Студент не найден.");
                    }
                    break;

                case 3:
                    System.out.print("Введите имя студента для обновления: ");
                    String nameToUpdate = scanner.nextLine();
                    System.out.print("Введите новый средний балл: ");
                    double newAverageGrade = scanner.nextDouble();
                    if (repository.updateAverageGrade(nameToUpdate, newAverageGrade)) {
                        System.out.println("Средний балл обновлён!");
                    } else {
                        System.out.println("Студент не найден.");
                    }
                    break;

                case 4:
                    System.out.println("Список студентов:");
                    for (Student student : repository.getAllStudents()) {
                        System.out.println(student);
                    }
                    break;

                case 0:
                    System.out.println("Выход из программы.");
                    break;

                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
