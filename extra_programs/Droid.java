public class Droid{
  
    String name;
    int batteryLevel;
  
    // constructor 
    public Droid(String droidName){
      name = droidName;
      batteryLevel = 100;
    }
  
    public String toString(){
      return "Hello, I’m the droid: " + name;
    }
  
      public void performTask(String task){
       System.out.println(name+" is performing task: " + task);
       batteryLevel -= 10;
    }
    public static void main(String[] args){
      Droid dk = new Droid("Codey");
      System.out.println(dk);
      dk.performTask("Coding");
      
    }
    
  }
