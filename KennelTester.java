public class KennelTester {
    public static void main(String[] args) {
        Kennel test = new Kennel();
        test.addPet(new Cat("Mr. Fiddles"));
        test.addPet(new Cat("Snowball IV"));
        test.addPet(new Dog("Santa's Little Helper"));
        test.addPet(new LoudDog("Fido"));
        test.addPet(new Dog("Air Bud"));
        test.allSpeak();
    }
}
