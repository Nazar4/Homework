
public class Human {
    private String name;
    private int age;
    private String sex;

    public Human(String name){

        this.name = name;
    }

    public void setName(String name){

        this.name = name;
    }

    public String getName(){

        return name;
    }

    public String getSex(){

        return sex;
    }

    public void setSex(String sex){

        this.sex = sex;
    }

    public void setAge(int age){

        this.age = age;
    }

    public int getAge(){

        return age;
    }

    public Human(){

        this.sex = "female";
    }


}
