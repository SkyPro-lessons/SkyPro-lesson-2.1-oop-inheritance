package site.telion;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honour;
    private int bravery;

    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobility, int honour, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = checkValue(nobility);
        this.honour = checkValue(honour);
        this.bravery = checkValue(bravery);
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public void printStudent() {
        System.out.println("Студент. Имя: " + getName());
        printMain();
        System.out.println("" +
                "Благородство: " + nobility
                + ", Честь: " + honour
                + ", Храбрость: " + bravery
        );
    }

    @Override
    public int calculationSumPoints() {
        return nobility + honour + bravery;
    }

    @Override
    public void printStudentComparisonByFaculty(Hogwarts enemy) {
        System.out.println();
        if (!isSameFaculty(enemy)) {
            return;
        }
        int pointsStudent1 = this.calculationSumPoints();
        int pointsStudent2 = enemy.calculationSumPoints();
        if (pointsStudent1 > pointsStudent2) {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + enemy.getName());
        } else if (pointsStudent1 < pointsStudent2) {
            System.out.println(enemy.getName() + " лучший Гриффиндорец, чем " + this.getName());
        } else {
            System.out.println("Силы " + this.getName() + " и " + enemy.getName() + " оказались равны");
        }
    }
}
