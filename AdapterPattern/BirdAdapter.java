public class BirdAdapter implements ToyDuck {
    Bird bird;
    
    BirdAdapter(Bird bird) {
        this.bird = bird;
    }
    @Override
    public void squeak() {
        this.bird.makeSound();
    }
}