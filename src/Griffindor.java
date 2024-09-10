public class Griffindor extends Hogwards {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, String surname, int magicPower, int transgrassionDistanse, int nobility, int honor, int bravery) {
        super(name, surname, magicPower, transgrassionDistanse);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    private void printGriffParam() {
        super.printHogwardsParam();
        System.out.println("Nobility " + nobility + ", Honor " + honor + ", Bravery " + bravery);
    }

    public static void compareStudents(Griffindor student1, Griffindor student2) {
        int total1 = student1.bravery + student1.honor + student1.nobility;
        int total2 = student2.bravery + student2.honor + student2.nobility;
        if (total1 > total2) {
            System.out.println(student1.name + " better, then " + student2.name);
        } else if (total2 > total1) {
            System.out.println(student2.name + " better, then " + student1.name);
        } else {
            System.out.println(student1.name + " and " + student2.name + " equals.");
        }
    }
}
