public class Slytherin extends Hogwarts {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int power;

    public Slytherin(String name, int magicPower, int transgression, int cunning, int determination, int ambition, int resourcefulness, int power) {
        super(name, magicPower, transgression);

        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

    @Override
    public String toString() {
        return super.toString() +  " Слизерин" +
                " cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", power=" + power ;
    }
    public static void compareSlytherin(Slytherin first, Slytherin second){
        int firstsum = first.getCunning() + first.getDetermination()+ first.getAmbition() + first.getResourcefulness() + first.getPower();
        int secondsum = second.getDetermination() + second.getAmbition() + first.getResourcefulness() + second.getCunning() + second.getPower();
        if (firstsum>secondsum){
            System.out.println(first.getName() + " лушче, Слизерицен, чем " + second.getName());
        } else if (firstsum == secondsum) {
            System.out.println(first.getName() + " и " + second.getName() + " равны по силе");
        }
        else {
            System.out.println(second.getName() + " лушче, Слизеринец, чем " + first.getName());
        }
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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}

