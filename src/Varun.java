public class Varun extends Man {
    public Varun(){
        setHusband();
    }
    public void setFamily(){
        setWife("Kruthi");
        setChild("");
    }
    public void customMessage(){
        System.out.println("Welcome " + getHusband() + "! No custom message for you. Sorry (Your wife is " + getWife() + ", by the way");
    }
}
