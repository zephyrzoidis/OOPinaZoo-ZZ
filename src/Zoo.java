public class Zoo {

    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger ", " meat");
        tigger.eat(" meat");

        Bear pooh = new Bear("Pooh ", " fish");
        pooh.eat(" fish");
        pooh.eat(" meat");

        Unicorn rarity = new Unicorn("Rarity ", " marshmallows");
        rarity.eat(" marshmallows");
        rarity.eat(" candy");

        Giraffe gemma = new Giraffe("Gemma ", "leaves");
        gemma.eat(" meat");
        gemma.eat(" leaves");

        Bee stinger = new Bee("Stinger ", " pollen");
        stinger.eat(" ice cream");
        stinger.eat(" pollen");

        Zookeeper zoebot = new Zookeeper("Zooman");
        Animal[] array = {tigger, pooh, rarity, gemma, stinger};
                zoebot.feedAnimals(array, " chicken");

    }
}
