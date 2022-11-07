public class StudentGrades {

    String studentName;
    double[] grades;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }
    
    public double lowestGrade(){
        double lowest_grade=6.0;
        for (double grade : grades){
            if(grade <= lowest_grade){
                lowest_grade = grade;
            }
        }
        return lowest_grade;
    }
    
    public double highestGrade(){
        double highest_grade=0.0;
        for (double grade : grades){
            if(grade <= highest_grade){
                highest_grade = grade;
            }
        }
        return highest_grade;
    }
    
    public int gradesCount(){
        int grade_count=0;
        for (double grade : grades){
            grade_count+=1;
        }
        return grade_count;
    }
    
    public double gpaCounter(){
        double grade_sum=0;
        for (double grade : grades){
            grade_sum+=grade;
        }
        int grade_count=0;
        for (double grade : grades){
            grade_count+=1;
        }
        return grade_sum/grade_count;
    }
 
    public static void main(String[] args){
     StudentGrades a = new StudentGrades("Amanda",new double[]{3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5});
     StudentGrades j= new StudentGrades("James", new double[]{2.0, 3.0, 2.0, 4.5, 4.5});
    }
}
