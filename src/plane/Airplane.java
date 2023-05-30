package plane;

abstract  class Airplane extends Vehicle {
    private double maxFuel;
    private double fuelDrop;

    public Airplane(String model, int year, double maxFuel, double fuelDrop) {
       super(model,year);
        this.maxFuel = maxFuel;
        this.fuelDrop = fuelDrop;
}

    public double getMaxFuel() {
        return maxFuel;
    }

    public void setMaxFuel(double maxFuel) {
        this.maxFuel = maxFuel;
    }

    public double getFuelDrop() {
        return fuelDrop;
    }

    public void setFuelDrop(double fuelDrop) {
        this.fuelDrop = fuelDrop;
    }

    // метод, який визначає максимальну дистанцію польоту
    public void showMaxFlyDistance(){
        System.out.println(" Max distance is "+ (maxFuel/fuelDrop));
    }

}
