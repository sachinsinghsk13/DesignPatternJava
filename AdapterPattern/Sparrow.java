class Sparrow implements Bird {

    @Override
    public void fly() {
       System.out.println("Flying..");
    }

    @Override
    public void makeSound() {
        System.out.println("chirip chirp");
    }

}