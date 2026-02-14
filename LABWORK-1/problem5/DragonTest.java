package problem5;

public class DragonTest {

    public static void main(String[] args) {

        DragonLaunch dl = new DragonLaunch();

        dl.kidnap(new Person(Gender.BOY));
        dl.kidnap(new Person(Gender.BOY));
        dl.kidnap(new Person(Gender.GIRL));
        dl.kidnap(new Person(Gender.GIRL));

        System.out.println("Before: " + dl);
        boolean result = dl.willDragonEatOrNot();
        System.out.println("After: " + dl);
        System.out.println("Dragon eats? " + result);
    }
}
