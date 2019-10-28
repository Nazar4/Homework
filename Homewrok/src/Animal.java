public class Animal {
    private String name;
    private int speed;
    private int age;

    public Animal(int age,int speed) {
        this.age = age;
        this.speed = speed;
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {

    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        return speed;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }


}
