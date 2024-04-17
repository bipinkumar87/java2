package encapsulationchapter;

import java.io.Serializable;

public class GetterAndSetter implements Serializable {
    private int roll;
    private String name;
    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        GetterAndSetter gt=new GetterAndSetter();
        gt.setName("bipin");
        gt.setRoll(2);
        System.out.println(gt.getName());
        System.out.println(gt.getRoll());
    }

    
}
