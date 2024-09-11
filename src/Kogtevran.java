public class Kogtevran extends Hogwards {
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Kogtevran(String name, String surname, int magicPower, int transgrassionDistanse, int mind, int wisdom, int wit, int creativity) {
        super(name, surname, magicPower, transgrassionDistanse);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }
    private void printKogParam(){
        super.printHogwardsParam();
        System.out.println("Mind "+ mind+", Wisdom "+ wisdom+", Creativity "+ creativity);
    }
    public static void compareStudents(Kogtevran student1, Kogtevran student2) {
        int total1 = student1.mind + student1.wisdom + student1.wit + student1.creativity;
        int total2 = student2.mind + student2.wisdom + student2.wit + student2.creativity;
        if (total1 > total2) {
            System.out.println(student1.name + " better, then " + student2.name);
        } else if (total2 > total1) {
            System.out.println(student2.name + " better, then " + student1.name);
        } else {
            System.out.println(student1.name + " and " + student2.name + " equals.");
        }
    }

}
