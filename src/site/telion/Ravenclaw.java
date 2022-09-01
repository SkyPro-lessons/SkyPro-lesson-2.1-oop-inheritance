package site.telion;

public class Ravenclaw extends Hogwarts {

    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int mind, int wisdom, int wit, int creation) {
        super(name, magicPower, transgressionDistance);
        this.mind = checkValue(mind);
        this.wisdom = checkValue(wisdom);
        this.wit = checkValue(wit);
        this.creation = checkValue(creation);
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    @Override
    public void printStudent() {
        System.out.println("Студент. Имя: " + getName());
        printMain();
        System.out.println("" +
                "Ум: " + mind
                + ", Мудрость: " + wisdom
                + ", Остроумие: " + wit
                + ", Творчество: " + creation
        );
    }

    @Override
    public int calculationSumPoints() {
        return mind + wisdom + wit + creation;
    }

    public void printStudentComparison(Ravenclaw enemy) {
        System.out.println();
        if (!isSameFaculty(enemy)) {
            return;
        }
        int pointsStudent1 = this.calculationSumPoints();
        int pointsStudent2 = enemy.calculationSumPoints();
        if (pointsStudent1 > pointsStudent2) {
            System.out.println(this.getName() + " лучший Когтевранец, чем " + enemy.getName());
        } else if (pointsStudent1 < pointsStudent2) {
            System.out.println(enemy.getName() + " лучший Когтевранец, чем " + this.getName());
        } else {
            System.out.println("Силы " + this.getName() + " и " + enemy.getName() + " оказались равны");
        }
    }
}
