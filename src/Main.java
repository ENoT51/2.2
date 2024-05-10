import javax.print.PrintService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Gryffindor garry = new Gryffindor("Гарри Поттер", 96, 93, 85, 90, 100);
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер", 92, 90, 90, 94, 90);
        Gryffindor ron = new Gryffindor("Роналд Уизли", 80, 80, 94, 85, 90);
        Hufflepuff zaharia = new Hufflepuff("Захария Смит", 85, 71, 65, 40, 70);
        Hufflepuff sedrik = new Hufflepuff("Седрик Диггори", 84, 84, 84, 84, 84);
        Hufflepuff jastin = new Hufflepuff("Джастин Финч-Флетчли", 75, 76, 81, 72, 78);
        Ravenclaw choy = new Ravenclaw("Чжоу Чанг", 73, 81, 64, 81, 74, 98);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 74, 81, 94, 35, 41, 85);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 64, 74, 70, 82, 61, 75);
        Slytherin drako = new Slytherin("Драко Малфой", 89, 91, 71, 84, 84, 84, 84);
        Slytherin graham = new Slytherin(" Грэхэм Монтегю", 84, 74, 85, 96, 47, 81, 70);
        Slytherin gregory = new Slytherin("Грегори Гойл", 84, 74, 85, 95, 76, 79, 89);

        System.out.println();
        System.out.println(garry);
        System.out.println(sedrik);
        System.out.println(drako);
        System.out.println(padma);
        System.out.println();
        Gryffindor.compareGryffindor(garry, ron);
        Hufflepuff.compareHufflepuff(zaharia, jastin);
        Ravenclaw.compareRavenclaw(marcus, choy);
        Slytherin.compareSlytherin(graham, gregory);
        System.out.println();
        Hogwarts.compareAnyStudents(garry, drako);
    }

}