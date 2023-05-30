package plants;

import interF.FlowerPlanting;
import interF.FuelCombustion;

public abstract class Herb implements FlowerPlanting {
    // Найпростіше, що можно придумати) Ім'я та класифікація
    private String name;

    private String classification;

    public Herb(String name,  String classification) {
        this.name = name;

        this.classification = classification;
    }
    // гет і сет

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getClassification() {

        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    abstract void growHerb();

}
