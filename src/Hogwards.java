public class Hogwards {
    protected String name;
    private String surname;
    private int magicPower;
    private int transgrassionDistanse;

    public Hogwards(String name, String surname, int magicPower, int transgrassionDistanse) {
        this.name = name;
        this.surname = surname;
        this.magicPower = magicPower;
        this.transgrassionDistanse = transgrassionDistanse;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgrassionDistanse() {
        return transgrassionDistanse;
    }
    public void printHogwardsParam(){
        System.out.println("Name "+ name+ ", Surname "+ surname+ ", MagicPower "+ magicPower+", TrangrassionDistanse "+transgrassionDistanse);
    }
    public static void compareMagic(Hogwards student1, Hogwards student2) {
        if (student1.magicPower > student2.magicPower && student1.transgrassionDistanse > student2.transgrassionDistanse) {
            System.out.println(student1.name + " better in magic, and have more transgresion, then " + student2.name);
        } else if (student1.magicPower < student2.magicPower && student1.transgrassionDistanse < student2.transgrassionDistanse) {
            System.out.println(student2.name + " better in magic, and have more transgresion, then " + student1.name);
        } else {
            System.out.println("Equals " + student1.name + " and " + student2.name + " not clear.");
        }
    }
}
