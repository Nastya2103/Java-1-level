package HomeWork6;

public class HomeWorkApp_6{
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурлыка", 90, 10);
        Cat cat2 = new Cat("Гав", 250, 0);
        Dog dog1 = new Dog("Бобик", 480, 12);
        Dog dog2 = new Dog("Джерри", 530, 6);
        Dog dog3 = new Dog("Комок шерсти", 500, 10);


        Animals[] animals = {cat1, cat2, dog1, dog2, dog3};

        for (Animals animal : animals) {
            animal.printInfo();
        }

        System.out.printf("Создано собак: %s%nСоздано кошек: %s%nВсего создано животных: %s%n", Dog.getDogCount(), Cat.getCatCount(), (Dog.getDogCount() + Cat.getCatCount()));
    }
}