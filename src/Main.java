public class Main {
    public static void main(String[] args){
        Griffindor harry = new Griffindor("Harry", "Potter", 89, 78, 96, 99, 100);
        Griffindor hermiona = new Griffindor("Hermiona", "Greyngeer", 99, 76, 65, 78, 99);
        Griffindor ron = new Griffindor("Ron", "Yizzly", 55, 43, 34, 73, 22);
        Slizeren draco = new Slizeren("Draco", "Malfoy", 101, 98, 95, 68, 74, 71, 63);
        Slizeren grehem = new Slizeren("Grehem", "Montegu", 44, 26, 11, 58, 93, 29, 48);
        Slizeren gregory = new Slizeren("Gregory", "Goil", 24, 64, 50, 31, 70, 64, 38);
        Puffenduy zaharia = new Puffenduy("Zaharia", "Smit", 75, 76, 92, 54, 24);
        Puffenduy sedric = new Puffenduy("Sedric", "Diggory", 89, 75, 90, 55, 38);
        Puffenduy dzastin = new Puffenduy("Dzhastin", "Finch-Fletchy", 85, 45, 43, 63, 78);
        Kogtevran chzoy = new Kogtevran("Chzoy", "Chang", 76, 39, 78, 56, 71, 66);
        Kogtevran padma = new Kogtevran("Padma", "Patil", 86, 99, 34, 65, 64, 68);
        Kogtevran markus = new Kogtevran("Markus", "Belby", 67, 56, 98, 76, 34, 55);
        Griffindor.compareStudents(harry, hermiona);
        Puffenduy.compareStudents(sedric, dzastin);
        Kogtevran.compareStudents(padma, markus);
        Slizeren.compareStudents(draco,gregory);
        Hogwards.compareMagic(harry, draco);

    }

}