public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;


    public Gryffindor(String name, int magicPower, int transgression, int nobility, int honor, int bravery) {
        super(name, magicPower, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString() + " Грифиндор" +
                " nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery ;
    }
    public static void compareGryffindor(Gryffindor first, Gryffindor second){
        int firstsum = first.getNobility() + first.getBravery()+ first.getHonor();
        int secondsum = second.getBravery() + second.getHonor() + second.getNobility();
        if (firstsum>secondsum){
            System.out.println(first.getName() + " лушче, Гриффинорец, чем " + second.getName());
        } else if (firstsum == secondsum) {
            System.out.println(first.getName() + " и " + second.getName() + " равны по силе");
        }
        else {
            System.out.println(second.getName() + " лушче, Гриффинорец, чем " + first.getName());
        }
    }
    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}
