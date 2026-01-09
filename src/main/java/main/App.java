package main;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Animal animal = new Animal("Pikseli", "Hedgehog", 13);
        System.out.println(animal.getName());
        System.out.println(animal.getSpecies());
        System.out.println(animal.getAge());
    }
    
    public void printName(Animal animal){
        System.out.println(animal.getName());
    }

    public void printSpecies(Animal animal){
        System.out.println(animal.getSpecies());
    }

    public void printAge(Animal animal){
        System.out.println(animal.getAge());
    }
}
