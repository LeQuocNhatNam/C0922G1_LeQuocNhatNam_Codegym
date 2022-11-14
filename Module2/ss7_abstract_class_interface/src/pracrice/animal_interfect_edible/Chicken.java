package pracrice.animal_interfect_edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "Chicken: cluck-cluck";
    }
    @Override
    public String howToEat(){
        return "could be fried";
    }

}
