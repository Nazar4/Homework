public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setAge(7);
        animal.setSpeed(20);
        animal.setName("Леопард");
        System.out.print("Назва тварини = " + animal.getName());
        System.out.print(", Швидкість тварини = " + animal.getSpeed());
        System.out.print(", Вік тварини = " + animal.getAge());




    }
}
