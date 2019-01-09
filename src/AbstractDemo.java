public class AbstractDemo{
    public static void main(String... args){

        Varun man1 = new Varun();
        Shrikant man2 = new Shrikant();
        Kumar man3 = new Kumar();

        if (man1.setHusband() == "Varun"){
            man1.setFamily();
            man1.family();
            man1.customMessage();
        } else if (man2.setHusband() == "Shrikant"){
            man1.setFamily();
            man2.family();
            man2.customMessage();
        } else if (man3.setHusband() == "Kumar"){
            man1.setFamily();
            man3.family();
            man3.customMessage();
        } else
            return;
    }
}