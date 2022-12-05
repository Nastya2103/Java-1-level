package Lesson5;

public class Main {
    public static void main(String[] args) {

          //  Employee employee1 = new Employee();
        Employee employee1 = new Employee("Анастасия", "Бухгалтер", "mail", "999", "45000");
        Employee employee2 = new Employee("Алиса", "Менеджер", "25565", "29500", "25");
        Employee employee3 = new Employee("Иванов Иван", "Инженер", "ivivan@mailbox.com", "892312312", 30000);
        Employee employee4 = new Employee("Иванов Василий", "Управляющий", "ivivas@mailbox.com", "892312312", 25000);
        Employee employee5 = new Employee("Петрова Василиса", "Гардеробщица", "petrova@mailbox.com", "892312312", 25000);

      //     employee1.printInfo();
     //   employee2.printInfo();
     //   employee3.printInfo();
     //   employee4.printInfo();
     //   employee5.printInfo();

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};
        for (Employee employee : employees) {
            employee.printInfo();
        }

        public static void older (int age) {
            for (int age = 0; age > 40; age++) {
                System.out.println("Cотрудники старше 40 лет: " + age);
        }
    }
}

