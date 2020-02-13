public class Bear extends Animal{

    public Bear(String name, String favoriteFood) {
        super(name," fish");
    }

    public void hibernates() {
        System.out.println(name + " hibernates for 4 months");
    }

    public void eat(String food) {
        System.out.println(name + "eats" + food);
        if (favoriteFood == food){
            System.out.println("YUM!! " + name + " wants more " + food);
        }else{
            hibernates();
        }
    }
}

