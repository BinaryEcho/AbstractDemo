public class Kumar extends Man {
    public Kumar(String iHusband){
        super(iHusband);
    }
    public void setFamily(){
        setWife("Madhu");
        setChild("Taashvi");
    }
    public void customMessage(){
        System.out.println("Welcome " + getHusband() + "! Hope " + getWife() + " and " + getChild() + " are doing well. Let's setup another lunch outing soon!");
    }
}
