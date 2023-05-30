package plants;


abstract  public class Flower extends Herb {
    //Додав вік квітки та період цвітіння
    private int age;
    private boolean florescence;

    public Flower(String name, String classification,int age,boolean florescence) {
        super(name, classification);
        this.florescence=florescence;
        this.age=age;
    }
    // гет і сет


    public double getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public boolean isFlorescence() {
        return florescence;
    }

    public void setFlorescence(boolean florescence) {
        this.florescence = florescence;
    }

    public abstract void showInfo();

    public  void growHerb(){
            if (florescence){
                System.out.println(" Now the "+this.getName()+" is blooming");
            }else {
                System.out.println(" Now the "+this.getName() +" is growing");
                }
        }
    }

