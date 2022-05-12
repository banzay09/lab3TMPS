public class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    public void swim () {
        System.out.println("Swiming");
    }

    public void display() {
        System.out.println("duck is displayed");
    }

    public void fly(){
        flyBehaviour.fly();
    }

    public void quack(){
        quackBehaviour.quack();
    }
}

