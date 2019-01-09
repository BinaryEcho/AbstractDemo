import java.util.Scanner;

abstract public class Man{
    private String wife;
    private String child;
    private String husband;

    public String setHusband(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello. What is your name?");
        husband = scan.nextLine();
        System.out.println("Hi " + husband + "!");
        return husband;
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

    public void family(){
        System.out.println(husband + "'s family:");
        System.out.println("-----------------");
        System.out.println("Wife - " + getWife());
        System.out.println("Child - " + getChild());
        System.out.println("-----------------");
    }
    abstract public void customMessage();
    public Man(){
    }
}

