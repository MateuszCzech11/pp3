public class Person {
    private String name;
    private int age;

    Person(String name, int age){
        this.age = age;
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public boolean isAdult(){
        if(age>=18){
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        return name + ","+age;
    }

}
