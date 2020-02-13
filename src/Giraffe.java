public class Giraffe extends Animal {

    public Giraffe(String name, String favoriteFood) {
        super(name, " leaves");
    }


    public void eat(String food){
        if (favoriteFood == food){
            System.out.println(name + "eats" + food);
            System.out.println("YUM!! " + name + " wants more " + food);
        }if(favoriteFood != food){
            System.out.println("YUCK!! " + name + " will not eat " + food);
        }else{
            sleep();
        }
    }
}

