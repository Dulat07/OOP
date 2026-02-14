package problem5;

import java.util.Vector;

public class DragonLaunch {

    private Vector<Person> people = new Vector<>();

    public void kidnap(Person p) {
        people.add(p);
    }

    public boolean willDragonEatOrNot() {

        int k = 0;

        for (int i = 0; i < people.size(); i++) {

            Person cur = people.get(i);

            if (k > 0 &&
                    people.get(k - 1).getGender() == Gender.BOY &&
                    cur.getGender() == Gender.GIRL) {

                k--;
            } else {
                people.set(k, cur);
                k++;
            }
        }

        people.setSize(k);

        return k != 0;
    }

    public String toString() {
        return people.toString();
    }
}
