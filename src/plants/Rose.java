package plants;
public final class Rose extends Flower {
    private int height;
    private String colorOfFlower;
    private int petalCount;

    public Rose(String name, String classification, int age, boolean florescence, String colorOfFlower, int petalCount) {
        super(name, classification, age, florescence);
        this.colorOfFlower = colorOfFlower;
        this.petalCount = petalCount;
    }

    public int getPetalCount() {
        return petalCount;
    }

    public void setPetalCount(int petalCount) {
        this.petalCount = petalCount;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height>0){
        this.height = height;}
    }

    public String getColorOfFlower() {
        return colorOfFlower;
    }

    public void setColorOfFlower(String colorOfFlower) {
        this.colorOfFlower = colorOfFlower;
    }

    @Override
    public void showInfo() {
        System.out.println("\nThis flower is " + super.getName() + " classification of this flower is " + super.getClassification() +
                "\n Age of this plant is " + super.getAge() + " months"+ "\n Has a height " + height + " сm \n Petal color is " + colorOfFlower + " petals quantity " + petalCount);

    }

    @Override
    public void growHerb() {
        height += 1; // квітка росте на 1 см
        System.out.println("Flower is growing by "+height+" cm");

    }

    // приклад методу, який дозволяє визначити стан людини від кількості пелюсток на квітці
    public void pluckPetals() {
        if ((petalCount % 2) == 0) {
            System.out.println("Likes to write Java code ");

        } else {
            System.out.println("Doesn't like writing Java code");

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
