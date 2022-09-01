package site.telion;

public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int industriousness, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.industriousness = checkValue(industriousness);
        this.loyalty = checkValue(loyalty);
        this.honesty = checkValue(honesty);
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public void printStudent() {
        System.out.println("Студент. Имя: " + getName());
        printMain();
        System.out.println("" +
                "Трудолюбие: " + industriousness
                + ", Верность: " + loyalty
                + ", Честность: " + honesty
        );
    }

    @Override
    public int calculationSumPoints() {
        return industriousness + loyalty + honesty;
    }

    public void printStudentComparison(Hufflepuff enemy) {
        System.out.println();
        if (!isSameFaculty(enemy)) {
            return;
        }
        int pointsStudent1 = this.calculationSumPoints();
        int pointsStudent2 = enemy.calculationSumPoints();
        if (pointsStudent1 > pointsStudent2) {
            System.out.println(this.getName() + " лучший Пуффендуец, чем " + enemy.getName());
        } else if (pointsStudent1 < pointsStudent2) {
            System.out.println(enemy.getName() + " лучший Пуффендуец, чем " + this.getName());
        } else {
            System.out.println("Силы " + this.getName() + " и " + enemy.getName() + " оказались равны");
        }
    }
}
