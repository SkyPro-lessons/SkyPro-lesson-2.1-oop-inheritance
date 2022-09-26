package site.telion;

public abstract class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = checkValue(magicPower);
        this.transgressionDistance = checkValue(transgressionDistance);
    }

    protected int checkValue(int value) {
        if (value < 0 || value > 100) {
            System.out.println("Введено недопустимое значение " + value);
            throw new IllegalArgumentException();
        }
        return value;
    }

    public abstract void printStudent();

    public int calculationSumMagicPoints() {
        return magicPower + transgressionDistance;
    }

    public abstract int calculationSumPoints();

    public boolean isSameFaculty(Hogwarts enemy) {
        if (this.getClass() != enemy.getClass()) {
            System.out.println(this.getName() + " и " + enemy.getName() + " - это студенты разных факультетов");
            return false;
        }
        return true;
    }

    public void printStudentComparison(Hogwarts enemy) {
        System.out.println();
        int pointsStudent1 = this.calculationSumMagicPoints();
        int pointsStudent2 = enemy.calculationSumMagicPoints();
        if (pointsStudent1 > pointsStudent2) {
            System.out.println(this.getName() + " обладает большей мощностью магии, чем " + enemy.getName());
        } else if (pointsStudent1 < pointsStudent2) {
            System.out.println(enemy.getName() + " обладает большей мощностью магии, чем " + this.getName());
        } else {
            System.out.println("Силы " + this.getName() + " и " + enemy.getName() + " оказались равны");
        }
    }

    public void printMain() {
        System.out.println("Магическая сила: " + magicPower + ", Трансгрессивность: " + transgressionDistance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }
}
