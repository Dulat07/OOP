package practice3;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        System.out.println(animal.voice());
        System.out.println(dog.voice());
        System.out.println(dog.voice(5));
    }
}
