package HomeWork7;

public class BonApetit {
    private static int TIME = 1;

    public static void main(String[] args) {
        Cats cat1 = new Cats("Мурлыка", 35, 4);
        Cats cat2 = new Cats("Барсик", 28, 3);
        Cats cat3 = new Cats("Комок шерсти", 30, 5);

        Plate plate = new Plate(100);

        Cats[] cats= {cat1, cat2, cat3};

        System.out.println("Перед нами три кота: " + cats[0].getName() + ", " + cats[1].getName() + " и " + cats[2].getName() + ", и они хотят есть каждые " + cats[0].getFullnessTime() + ", " + cats[1].getFullnessTime() + " и " + cats[2].getFullnessTime() + " час(а) соответственно.");
        System.out.println("У котов разный аппетит. В данный момент в миске " + plate.getFood() + " грамм корма.\nКоты голодны и отправляются к миске.\n");
        do {
            for (Cats i : cats) {
                if (i.getFullness() == 0) {
                    if (!plate.checkFood(i.getAppetite())) {
                        plate.increaseFood();
                    }
                    i.eat(plate);
                    System.out.println("Кот " + i.getName() + " съел " + i.getAppetite() + " граммов корма и снова проголодается через " + (i.getFullness()) + " часа(ов).");
                }
                i.setFullness(i.getFullness() - 1);
            }
            System.out.println("\nПрошел(ло) " + TIME + " час(а/ов). В миске осталось " + plate.getFood() + " граммов корма.\n");
            TIME++;
        } while (TIME <= 24);
    }
}

