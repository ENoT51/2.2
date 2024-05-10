public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int magicPower, int transgression, int mind, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return super.toString() + " Когтевран" +
                " mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity;
    }
    public static void compareRavenclaw(Ravenclaw first, Ravenclaw second){
        int firstsum = first.getMind() + first.getWisdom()+ first.getWit() + first.getCreativity();
        int secondsum = second.getWisdom() + second.getWit() + first.getCreativity() + second.getMind();
        if (firstsum>secondsum){
            System.out.println(first.getName() + " лушче, Когтевранец, чем " + second.getName());
        } else if (firstsum == secondsum) {
            System.out.println(first.getName() + " и " + second.getName() + " равны по силе");
        }
        else {
            System.out.println(second.getName() + " лушче, Когтевранец, чем " + first.getName());
        }
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

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
}
