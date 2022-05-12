public class Main {
    public static void main(String[] args) {
        WoodenDuck wd = new WoodenDuck(new NoFly(),new Squeal());
        wd.display();
        wd.swim();
        wd.fly();
        wd.quack();
    }
}

