import plants.*;
import plane.*;
public class Main {
    public static void main(String[] args) {
        Chamomile chamomile = new Chamomile("Chamomile", "grass", 6, false,
                "peculiar, slightly reminiscent of the smell of apples", "white");

        chamomile.showInfo();
        chamomile.defineTheView();
        chamomile.growHerb();

        chamomile.hasMedicinalProperties(true);
        chamomile.absorb();
        chamomile.pollinate();
        chamomile.photosynthesize();

        Peony peony = new Peony("Peony", "Treelike", 25, true, "single", "white");

        peony.showInfo();
        peony.determinePeony();
        peony.growHerb();
        peony.pollinate();
        peony.photosynthesize();
        peony.hasMedicinalProperties(true);
        peony.absorb();

        Rose rose = new Rose("Rose", "grass", 5, true, "blue", 12);
        rose.setHeight(1);
        rose.showInfo();
        rose.growHerb();
        rose.pluckPetals();
        rose.pollinate();
        rose.photosynthesize();
        rose.hasMedicinalProperties(true);
        rose.absorb();

        CargoPlane cargo = new CargoPlane("AH-125", 40, 365, 15, 254, 25);
        System.out.println();
        cargo.showAge();
        cargo.startEngine();
        cargo.showCargoLoad(30, 20);
        cargo.showMaxDistance(20, 15);
        cargo.showMaxFlyDistance();

        cargo.fly();
        cargo.topUp();
        cargo.land();
        cargo.refueling();
        cargo.haveEngine(true);
        cargo.takeOff();

        CombatAircraft f16 = new CombatAircraft("F-16",40,100,4);
        System.out.println();
        f16.showAge();
        f16.startEngine();
        f16.setBombCount(2);
        f16.setRocketLauncher(2);
        f16.dropBomb();
        f16.useRocketLauncher();
        f16.showMaxFlyDistance();

        f16.fly();
        f16.topUp();
        f16.land();
        f16.refueling();
        f16.haveEngine(true);
        f16.takeOff();
        PassengerAirplane boeing = new PassengerAirplane("Boeing 747",50,624,24,13000);
        System.out.println();
        boeing.setMaxPassengers(310);
        boeing.showAge();
        boeing.startEngine();
        boeing.showMaxFlyDistance();
        boeing.getTypeOfAircraft();

        boeing.fly();
        boeing.topUp();
        boeing.land();
        boeing.refueling();
        boeing.haveEngine(true);
        boeing.takeOff();

        Herb asta = new Chamomile("Asta","grass",4,true,"light","blue");
        Vehicle su27 = new CombatAircraft("SU-27",30,100,5);
        su27.showAge();

    }
//Це були мої кращі 60 годин життя
}