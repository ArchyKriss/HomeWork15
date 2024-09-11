public class Puffenduy extends Hogwards{
    private int diligence;
    private int fidelity;
    private int honesty;

    public Puffenduy(String name, String surname, int magicPower, int transgrassionDistanse, int diligence, int fidelity, int honesty) {
        super(name, surname, magicPower, transgrassionDistanse);
        this.diligence = diligence;
        this.fidelity = fidelity;
        this.honesty = honesty;
    }
    private void printPuffParam(){
        super.printHogwardsParam();
        System.out.println("Diligence "+ diligence+ ", Fidelity "+ fidelity+ ", Honesty"+ honesty);
    }
    public static void compareStudents(Puffenduy student1, Puffenduy student2) {
        int total1 = student1.diligence + student1.fidelity + student1.honesty;
        int total2 = student2.diligence + student2.fidelity + student2.honesty;
        if (total1 > total2) {
            System.out.println(student1.name + " better, then " + student2.name);
        } else if (total2 > total1) {
            System.out.println(student2.name + " better, then " + student1.name);
        } else {
            System.out.println(student1.name + " and " + student2.name + " equals.");
        }
    }

}
