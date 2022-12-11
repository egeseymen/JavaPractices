
package trainingprogram;

/**
 *
 * @author egese
 */
public class Training {
   private int burpee;
   private int pushup;
   private int situp;
   private int squat;

    public Training(int burpee, int pushup, int situp, int squat) {
        this.burpee = burpee;
        this.pushup = pushup;
        this.situp = situp;
        this.squat = squat;
    }
    public void Dosport(String sporttype,int num){
       switch (sporttype.toLowerCase()) {
           case "burpee":
               Doburpee(num);
               break;
           case "pushup":
               Dopushup(num);
               break;
           case "situp":
               Dositup(num);
               break;
           case "squat":
               Dosquat(num);
               break;
           default: 
               System.out.println("You entered an invalid sport move");
               break;
       }
        
    }
    public void Doburpee(int num){
        if(burpee==0){
            System.out.println("No more burpees to do");
        }
        if (burpee-num<0) {
            System.out.println("You've exceeded your target number of burpees.Congratulations!!!");
            burpee=0;
            System.out.println("Remaining burpee:"+burpee);
        }else{
            burpee-=num;
            System.out.println("Remaining burpee:"+burpee);
        }
    }
    public void Dopushup(int num){
        if(pushup==0){
            System.out.println("No more pushup to do");
        }
        if (pushup-num<0) {
            System.out.println("You've exceeded your target number of pushup.Congratulations!!!");
            pushup=0;
            System.out.println("Remaining pushup:"+pushup);
        }else{
            pushup-=num;
            System.out.println("Remaining pushup:"+pushup);
        }
    }
    public void Dositup(int num){
        if(situp==0){
            System.out.println("No more situp to do");
        }
        if (situp-num<0) {
            System.out.println("You've exceeded your target number of situp.Congratulations!!!");
            situp=0;
            System.out.println("Remaining situp:"+situp);
        }else{
            situp-=num;
            System.out.println("Remaining situp:"+situp);
        }
    }
    public void Dosquat(int num){
        if(squat==0){
            System.out.println("No more squat to do");
        }
        if (squat-num<0) {
            System.out.println("You've exceeded your target number of squat.Congratulations!!!");
            squat=0;
            System.out.println("Remaining squat:"+squat);
        }else{
            squat-=num;
            System.out.println("Remaining squat:"+squat);
        }
    }
    public boolean istrainingfinished(){
        return !((burpee==0)&&(pushup==0)&&(situp==0)&&(squat==0));
    }
    public int getBurpet() {
        return burpee;
    }

    public void setBurpet(int burpet) {
        this.burpee = burpet;
    }

    public int getPushup() {
        return pushup;
    }

    public void setPushup(int pushup) {
        this.pushup = pushup;
    }

    public int getSitup() {
        return situp;
    }

    public void setSitup(int situp) {
        this.situp = situp;
    }

    public int getSquat() {
        return squat;
    }

    public void setSquat(int squat) {
        this.squat = squat;
    }
   
}
