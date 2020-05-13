public class Main {
    public static void main(String[]args){
        Dog d = new Dog();
        Lion l = new Lion();
        Cat c = new Cat();
        Wolf w = new Wolf();



        d.makeNoise();
        l.makeNoise();
        c.makeNoise();
        l.makeNoise();
        w.roam();
        l.roam();
        w.sleep();


    }
}
