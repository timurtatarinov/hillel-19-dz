package lesson35;

/* (2)
class Animal {
    public void eat() {
        System.out.println("Animal is eating...");
    }
}
*/

/* (1)
class OtherAnimal extends Animal{
    @Override
    public void eat() {
        System.out.println("Other animal is eating...");
    }
}
*/

interface AbleToEat {
    public void eat();
}

/* (3)
class Animal implements AbleToEat {
    @Override
    public void eat() {
        System.out.println("asdfasfd");
    }
}
*/

public class Test {
    public static void main(String[] args) {

        //Animal animal = new Animal(); (2)
        //animal.eat(); (2)

        //OtherAnimal otherAnimal = new OtherAnimal(); (1)
        //otherAnimal.eat(); (1)

        /* (2)
        Animal animal2 = new Animal() {
            @Override
            public void eat() {
                System.out.println("Other animal is eating...");
            }
        };
        */
        //animal2.eat(); (2)

        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating...");
            }
        };
        ableToEat.eat();

    }
}