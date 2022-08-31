package site.telion;

public class Main {
    public static void main(String[] args) {

        try {
            Hogwarts harryPotter = new Gryffindor("Гарри Поттер", 100, 100, 100, 100, 100);
            Hogwarts hermioneGranger = new Gryffindor("Гермиона Грейнджер", 100, 80, 70, 40, 50);
            Hogwarts ronWeasley = new Gryffindor("Рон Уизли", 50, 30, 50, 50, 40);

            Hogwarts dracoMalfoy = new Slytherin("Драко Малфой", 80, 30, 90, 70, 100, 40, 100);
            Hogwarts grahamMontague = new Slytherin("Грэхэм Монтегю", 60, 40, 70, 80, 70, 50, 40);
            Hogwarts gregoryGoyle = new Slytherin("Грегори Гойл", 70, 90, 40, 40, 40, 30, 70);

            Hogwarts zachariasSmith = new Hufflepuff("Захария Смит", 70, 80, 90, 40, 60);
            Hogwarts cedricDiggory = new Hufflepuff("Седрик Диггори", 100, 20, 70, 50, 20);
            Hogwarts justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 50, 70, 40, 70, 50);

            Hogwarts choChang = new Ravenclaw("Чжоу Чанг", 70, 20, 70, 50, 90, 40);
            Hogwarts padmaPatil = new Ravenclaw("Падма Патил", 50, 40, 50, 60, 70, 50);
            Hogwarts marcusBelby = new Ravenclaw("Маркус Белби", 60, 60, 60, 40, 50, 70);

            harryPotter.printStudent();

            harryPotter.printStudentComparisonByFaculty(ronWeasley);
            dracoMalfoy.printStudentComparisonByFaculty(grahamMontague);
            justinFinchFletchley.printStudentComparisonByFaculty(marcusBelby);

            harryPotter.printStudentComparison(dracoMalfoy);

        } catch (IllegalArgumentException e) {
            System.out.println("Аварийное завершение программы");
        }

    }
}
