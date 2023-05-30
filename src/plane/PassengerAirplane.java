package plane;

 public final class PassengerAirplane extends Airplane {
    private int maxPassengers;
    private int maxAltitude;


    public PassengerAirplane(String model, int year, double maxFuel, double fuelDrop,int maxAltitude) {
        super(model, year, maxFuel, fuelDrop);
        this.maxAltitude=maxAltitude;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        if (maxPassengers>0&&maxPassengers<301){
        this.maxPassengers = maxPassengers;}
        else {
            System.out.println("wrong parameters");
        }
    }

    public int getMaxAltitude() {
        return maxAltitude;
    }

    public void setMaxAltitude(int maxAltitude) {
        this.maxAltitude = maxAltitude;
    }
    //метод, який визначає тип пасажирського літака
    public void getTypeOfAircraft(){
        if (maxPassengers<=30){
            System.out.println("This is Light Aviation.\n " +
                    "This category includes planes with a small passenger capacity, usually up to 20-30 people.\n " +
                    "They are used for regional and local flights, often over short distances.");
        } else if (maxPassengers<=100 ) {
            System.out.println("This is Regional Aviation\n"+"" +
                    "This category includes aircraft of medium capacity, capable of transporting from 30 to about 100 passengers.\n" +
                    "They are intended for regional transportation and often perform flights between cities within the same country or region.");
            
        } else if (maxPassengers<=300) {
            System.out.println("This is Narrow-body Aircraft\n" +
                    " This category includes medium-range aircraft such as the Boeing 737 and Airbus A320, which can carry between 100 and about 200 passengers.\n" +
                    " They are widely used for medium and long distance flights, both domestically and internationally.");
        } else if (maxPassengers<=700) {
            System.out.println("This category includes large passenger aircraft such as the Boeing 747, Airbus A380 and Boeing 777.\n" +
                    " They are capable of carrying from a few hundred to more than 800 passengers, depending on cabin configuration.\n " +
                    "Wide-body aircraft are used for long-haul flights and intercontinental flights.");
            
        }
    }

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
