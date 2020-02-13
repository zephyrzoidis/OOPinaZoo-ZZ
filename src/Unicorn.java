public class Unicorn extends Animal {

    public Unicorn(String name, String favoriteFood) {
        super(name, " marshmallows");
    }

    public void sleep() {
        System.out.println(name + " sleeps in a cloud");
    }

    public void eat(String food){
        if (favoriteFood == food){
            System.out.println(name + "eats" + food);
            System.out.println("YUM!! " + name + " wants more " + food);
        }else{
            sleep();
        }
    }
}
