class demo {
     private int cId;
     private String cName;
     void setcId(int cId){
         this.cId=cId;
     }
     void setcName(String cName){
         this.cName=cName;
     }

    public int getcId() {
        return cId;
    }

    public String getcName() {
        return cName;
    }
}
 public class enc{
    public static void main(String [] args){
         demo d=new demo();
         d.setcId(4);
         d.setcName("bhoomika m");
        System.out.println(d.getcId());
        System.out.println(d.getcName());
    }
}