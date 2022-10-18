public class Student{
    // atrybuty
    
    String name;
    int age;
    String id;
    boolean idValid;
    int semester;
    double averageGrade;
    
    
    
    // metody
    
    public void sayHello(){
        
        System.out.println("Czesc");
        
    }
    
    public void displayName(){
        
        System.out.println(name);
        
    }

    public void displayAge(){
        
        System.out.println(age);
        
    }
    
    public void displayStudentInfo(){
        
        System.out.println("Imie: "+ age);
        System.out.println("Semestr: " + semester);
        System.out.println("Srednia ocen: "+ averageGrade);
    }
    
    public void changeIdValidation(){
        
        idValid = !idValid;
        System.out.println("Zmieniono status karty albumu na: " + idValid);
        
    }
    
    public void displayStudentCardInfo(){
        
        System.out.println("Imie: "+ age);
        System.out.println("Numer albumu: " + id);
        System.out.println("Czy karta albumu jest aktywna: "+ idValid);
    }
    
    
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Mateusz";
        s1.age = 20;
        s1.id = "333222";
        s1.idValid = true;
        s1.semester = 3;
        s1.averageGrade = 4.123;
        s1.sayHello();
        s1.displayStudentInfo();
        s1.changeIdValidation();
        s1.displayStudentCardInfo();
    }
    
}