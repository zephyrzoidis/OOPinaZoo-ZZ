public class Bee extends Animal {

    public Bee(String name, String favoriteFood) {
        super(name, " pollen");
    }

    public void sleep() {
        System.out.println(name + " never sleeps");
    }

    public void eat(String food){
        if (favoriteFood == food){
            System.out.println(name + "eats" + food);
            System.out.println("YUM!! " + name + " wants more " + food);
        }if (favoriteFood != food){
            System.out.println("YUCK!! " + name + " will not eat " + food);
        }else{
            sleep();
        }
    }
}