package plane;

 final public class CargoPlane extends Airplane {
    private double maxWeight;
    private double cargoVolume;


    public CargoPlane(String model, int year, double maxFuel, double fuelDrop, double maxWeight, double cargoVolume) {
        super(model, year, maxFuel, fuelDrop);
        this.cargoVolume=cargoVolume;
        this.maxWeight=maxWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public double getCargoVolume() {
        return cargoVolume;
    }

    public void setCargoVolume(double cargoVolume) {
        this.cargoVolume = cargoVolume;
    }
    public void showCargoLoad(double weight,double volume){
        if ((weight<=maxWeight&&volume<=cargoVolume)){
        System.out.println(" Loading cargo: " + weight + " kg");
    }
    else {
            System.out.println(" The plane won't fly");}
    }
    //расход топлива для грузового самолета
    public void showMaxDistance(double weight,double volume){
        if (((weight<=maxWeight&&volume<=cargoVolume))){
            double cargo =((weight/maxWeight)*(volume/cargoVolume))*super.getFuelDrop();
        System.out.println("fuel consumption for cargo aircraft and his max distance is "+
                super.getMaxFuel()/(super.getFuelDrop()+cargo));}
        else {
                System.out.println("The plane won't fly");
    }}

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
     }
 }


