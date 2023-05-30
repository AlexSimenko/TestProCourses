package plants;
public final class Chamomile extends Flower {
    private String smell;
    private String colorOfFlower;


    public Chamomile(String name, String classification, int age, boolean florescence, String smell, String colorOfFlower) {
        super(name, classification, age, florescence);
        this.smell = smell;
        this.colorOfFlower = colorOfFlower;
    }


    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public String getColorOfFlower() {
        return colorOfFlower;
    }

    public void setColorOfFlower(String colorOfFlower) {
        this.colorOfFlower = colorOfFlower;
    }

    //метод для описування квітки
    @Override
    public void showInfo() {
        System.out.println("\nThis flower is " + super.getName() + "\n Classification is " + super.getClassification()
                + "\n Age of this plant is " + super.getAge() + " months" + " \n Smell has " + smell + "\n Petals is " + colorOfFlower + " colour");
    }


    // метод, який допомагає визначити вид ромашки або схожої на неї квітки
    public void defineTheView() {
        if (colorOfFlower.equalsIgnoreCase("white")) {
            System.out.println("This if pharmaceutical camomile");

        } else if (colorOfFlower.equalsIgnoreCase("yellow")) {
            System.out.println("Yellow daisies are usually pyrethrums");

        } else if (colorOfFlower.equalsIgnoreCase("blue")) {
            System.out.println("blue daisies are usually cineraria");

        } else if (colorOfFlower.equalsIgnoreCase("purple")) {
            System.out.println("purple daisies are usually aster");

        }
        else {
            System.out.println("unknown flower");
        }


    }

    @Override
    public void pollinate() {
        System.out.println(super.getName()+ " is pollinate");
    }

    @Override
    public void hasMedicinalProperties(boolean answer) {
        if (answer) {
            System.out.println("Yes, this flower has medicinal properties");
        }
        else {
            System.out.println("has no medicinal properties");
        }
    }
    @Override
    public void photosynthesize() {
        System.out.println("The plant photosynthesizes");
    }

    @Override
    public void absorb() {
        System.out.println("the plant absorb water");
    }
}


