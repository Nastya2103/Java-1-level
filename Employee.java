package Lesson5;

public class Employee {
    private String name;
    private String positon;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public Employee (String name, String positon, String email, int phone, int salary, int age) {
        this.name = name;
        this.positon = positon;
        this.email = email;
        this.salary = salary;
        this.phone = phone;
        this.age = age;
    }
   // public Employee(String name) {
   //     this.name = "Екатерина";
   //     this.positon = "Уборщица";
  //      this.email = "jfgfgfh@djjhjg";
   //     this.salary = Integer.parseInt("15000");
   //     this.phone = Integer.parseInt("89999999999");
  //      this.age = Integer.parseInt("45");
 //   }


    public void printInfo () {
        System.out.println("ФИО: " + name + "Должность: " + positon + "E-mail: " + email + "Телефон: " + phone + "Зарплата: " + salary + "Возраст: " + age);
    }


    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Введен некорректный возраст");
        }
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    }
