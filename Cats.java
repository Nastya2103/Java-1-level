package HomeWork7;

public class Cats {
    private String name;
    private int appetite;
    private int fullness;
    private int fullnessTime;


    public Cats(String name, int appetite, int fullnessTime) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = 0;
        this.fullnessTime = fullnessTime;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }
    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public int getFullness() {
        return fullness;
    }
    public void setFullness(int fullness) {
        this.fullness = fullness;
    }

    public int getFullnessTime() {
        return fullnessTime;
    }
    public void setFullnessTime(int fullnessTime) {
        this.fullnessTime = fullnessTime;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
        fullness += fullnessTime;
    }
}
