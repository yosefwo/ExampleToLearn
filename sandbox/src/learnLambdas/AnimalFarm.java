package learnLambdas;

public class AnimalFarm {

    public String sayHello(Animal animal, String sound) {
        return animal.cry(sound);
    }

    public static void main(String[] args) throws Exception {


        Animal tiger = (sound) -> "Hi, Tiger " + sound;
        System.out.println(new AnimalFarm().sayHello(tiger, "ROARR"));

    }

}

interface Animal {
    public String cry(String sound);
}