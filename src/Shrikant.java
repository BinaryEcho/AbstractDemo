public class Shrikant extends Man {
    public Shrikant(String iHusband){
        super(iHusband);
    }
    public void setFamily(){
        setWife("Preeti");
        setChild("Shreyas");
    }
    public void customMessage(){
        System.out.println("Welcome " + getHusband() + "! Hope " + getWife() + " and " + getChild() + " are doing well. Let's setup another lunch outing soon!");
    }
}
