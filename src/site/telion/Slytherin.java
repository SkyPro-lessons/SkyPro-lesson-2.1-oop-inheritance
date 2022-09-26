package site.telion;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = checkValue(cunning);
        this.determination = checkValue(determination);
        this.ambition = checkValue(ambition);
        this.resourcefulness = checkValue(resourcefulness);
        this.lustForPower = checkValue(lustForPower);
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public void printStudent() {
        System.out.println("Студент. Имя: " + getName());
        printMain();
        System.out.println("Хитрость: " + cunning
                + ", Решительность: " + determination
                + ", Амбициозность: " + ambition
                + ", Находчивость: " + resourcefulness
                + ", Жажда власти: " + lustForPower
        );
    }

    @Override
    public int calculationSumPoints() {
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }

    public void printStudentComparison(Slytherin enemy) {
        System.out.println();
        if (!isSameFaculty(enemy)) {
            return;
        }
        int pointsStudent1 = this.calculationSumPoints();
        int pointsStudent2 = enemy.calculationSumPoints();
        if (pointsStudent1 > pointsStudent2) {
            System.out.println(this.getName() + " лучший Слизеринец, чем " + enemy.getName());
        } else if (pointsStudent1 < pointsStudent2) {
            System.out.println(enemy.getName() + " лучший Слизеринец, чем " + this.getName());
        } else {
            System.out.println("Силы " + this.getName() + " и " + enemy.getName() + " оказались равны");
        }
    }
}
