package encapsulationchapter;

import java.io.Serializable;

public class Appla implements Serializable{
    private int applebrand_no;
    private String applename;
    public void setApplebrand_no(int applebrand_no){
        this.applebrand_no=applebrand_no;
    }
    public int getApplebrand_no(){
        return applebrand_no;
    }
    public void setApplename(String applename){
        this.applename=applename;
    }
    public String getApplename(){
        return applename;
    }
    
    
}
