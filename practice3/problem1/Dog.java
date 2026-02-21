package practice3;

public class Dog extends Animal {
    private String breed;

    public Dog(){
        super();
    }

    public Dog(String animname){
        super(animname);
    }

    @Override
    public String voice(){
        return "Gav";
    }

}
