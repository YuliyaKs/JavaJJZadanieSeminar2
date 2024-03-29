package homework1;

public class Cat extends Animal {

    private int mouseAmount; // Количество пойманных мышей
    private final boolean treeClimbing; // Умение лазать по деревьям

    public Cat(String name, int age, int mouseAmount, boolean treeClimbing) {
        super(name, age);
        this.mouseAmount = mouseAmount;
        this.treeClimbing = treeClimbing;
    }

    @Override
    public void makeSound(){
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", amount of mice caught =" + mouseAmount +
                ", tree climbing cat=" + treeClimbing +
                '}';
    }

    // Метод для мурлыканья
    public String makePurrs(){
        return "Purr, purr";
    }

    // Метод для поимки мышей
    public String catchMouse(){
        mouseAmount++;
        return "The cat caught the mouse";
    }

}
