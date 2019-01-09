abstract public class Man {
    private String husband;
    private String wife;
    private String child;

    public Man(String iHusband){
        husband = iHusband;
    }
    public String getHusband(){
        return husband;
    }
    public void setWife(String iWife){
        wife = iWife;
    }
    public String getWife(){
        return wife;
    }
    public void setChild(String iChild){
        child = iChild;
    }
    public String getChild(){
        return child;
    }
    abstract public void setFamily();
    abstract public void customMessage();
}
