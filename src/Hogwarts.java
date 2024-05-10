public class Hogwarts {
    private String name;
    private int magicPower;
    private int transgression;

    public Hogwarts(String name, int magicPower, int transgression) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }
public static void compareAnyStudents(Hogwarts first, Hogwarts second){
         int firstsum = first.getMagicPower() + first.getTransgression();
         int secondsum = second.getMagicPower() + second.getTransgression();
    if (firstsum>secondsum){
        System.out.println(first.getName() + " обладает большей мощностью магии, чем " + second.getName());
    } else if (firstsum == secondsum) {
        System.out.println(first.getName() + " и " + second.getName() + " равны по силе");
    }
    else {
        System.out.println(second.getName() + " обладает большей мощностью магии, чем " + first.getName());
    }


    }
    @Override
    public String toString() {
        return "Имя = '" + name + '\'' +
                ", Сила магии=" + magicPower +
                ", Трансгрессия=" + transgression ;
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

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
}

