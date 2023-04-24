public class Zoo {
    public static void main(String args[]) {
        Animal zebra = new Animal("Marty", "zebra", "Male", 5, 160);
        Animal lion = new Animal("Alex", "lion", "Male", 5, 200);
        Animal penguin = new Animal("Rico", "penguin", "Male", 7, 130);
        Solution_Bird bird1 = new Solution_Bird();

        zebra.sign();
        lion.sign();
        penguin.sign();

        System.out.println();

        zebra.sleep();
        lion.eat();
        penguin.swim();
        penguin.fly();

        bird1.fly2();
    }
}