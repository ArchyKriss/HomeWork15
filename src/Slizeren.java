public class Slizeren extends Hogwards{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustOfPower;

    public Slizeren(String name, String surname, int magicPower, int transgrassionDistanse, int cunning, int determination, int ambition, int resourcefulness, int lustOfPower) {
        super(name, surname, magicPower, transgrassionDistanse);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustOfPower = lustOfPower;
    }
    private void printSlizParam(){
        super.printHogwardsParam();
        System.out.println("Cunning "+ cunning+", Determination "+ determination+", Ambition "+ambition+", LustOfPower "+ lustOfPower);

    }
    public static void compareStudents(Slizeren student1, Slizeren student2) {
        int total1 = student1.cunning + student1.determination + student1.ambition + student1.resourcefulness + student1.lustOfPower;
        int total2 = student2.cunning + student2.determination + student2.ambition + student2.resourcefulness + student2.lustOfPower;
        if (total1 > total2) {
            System.out.println(student1.name + " better, then " + student2.name);
        } else if (total2 > total1) {
            System.out.println(student2.name + " better, then " + student1.name);
        } else {
            System.out.println(student1.name + " and " + student2.name + " equals.");
        }
    }

}
