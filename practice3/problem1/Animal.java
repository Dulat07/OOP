package practice3;

public class Animal {
    private String animname;

    public Animal(){}
    public  Animal(String animname){
        this.animname = animname;
    }

    public String voice(){
        return "Not defined";
    }

    public String voice(int times){
        String result = "";
        for(int i = 0; i < times; i++){
            result += voice() + " ";
        }
        return result;
    }
}

