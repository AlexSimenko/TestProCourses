package plane;


 final public class CombatAircraft extends Airplane {
    private int rocketLauncher;
    private int bombCount;


    public CombatAircraft(String model, int year, double maxFuel, double fuelDrop) {
        super(model, year, maxFuel, fuelDrop);
    }

    public int getRocketLauncher() {
        return rocketLauncher;
    }

    public void setRocketLauncher(int rocketLauncher) {
        if(rocketLauncher<=4&&rocketLauncher>=0){
        this.rocketLauncher = rocketLauncher;}
    }

    public int getBombCount() {
        return bombCount;
    }

    public void setBombCount(int bombCount) {
        if (bombCount>=0&&bombCount<=2){
        this.bombCount = bombCount;}
    }
    public void dropBomb(){
        System.out.println("plane.Airplane "+super.getModel()+" drop"+bombCount+" bomb");
    }
    public void useRocketLauncher(){
        System.out.println("plane.Airplane"+super.getModel()+"use "+rocketLauncher+" rocket launch");
    }
// методи, які реалізують стани літака
     @Override
     public void land() {
         System.out.println("The plane is landing");
     }

     @Override
     public void fly() {
         System.out.println("The plane is flying");
     }

     @Override
     public void takeOff() {
         System.out.println("Airplane takes off");
     }

     @Override
     public void haveEngine(boolean a) {
         if (a){System.out.println("an aircraft uses a jet engine to fly");}
         else {
             System.out.println("The aircraft does not have a jet engine.");
         }
     }

     @Override
     public void topUp() {
         System.out.println("Raise fuel reserves th the maximum ");
     }

     @Override
     public void refueling() {
         System.out.println("Aircraft preparing and refueling to the next stop");
     }}
