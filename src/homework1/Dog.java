package homework1;

public class Dog extends Animal{

    private final int commandsAmount; // Количество команд, которое знает собака
    private final boolean huntingBreed; // Принадлежность к охотничьей породе

    public Dog(String name, int age, int commandsAmount, boolean huntingBreed) {
        super(name, age);
        this.commandsAmount = commandsAmount;
        this.huntingBreed = huntingBreed;
    }

    @Override
    public void makeSound(){
        System.out.println("Woof");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", amount of commands learned=" + commandsAmount +
                ", hunting dog=" + huntingBreed +
                '}';
    }

    // Метод для виляния хвостом
    public String wagTail(){
        return "The dog wags its tail";
    }

    // Метод для поимки добычи на охоте
    public String  huntTrophy(String trophy){
        if(huntingBreed){
            return "The dog caught a " + trophy + " from hunting";
        }
        return "This dog is not a hunting breed";
    }

}
