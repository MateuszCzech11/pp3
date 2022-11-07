public class CalcBMI{
    double bmi;
    
    
    public CalcBMI(double bmi){
        this.bmi = bmi;
    }
    
    public void bmiRecord(){
        if(bmi<=18.5){
            System.out.println("BMI too low");
        } else if (bmi >=24.9){
            System.out.println("BMI too high");
        } else {
            System.out.println("BMI ok");
        }
    }
    
    public static void main(String[] args){
        CalcBMI c1 = new CalcBMI(18.1);
        c1.bmiRecord();
        CalcBMI c2 = new CalcBMI(22.5);
        c2.bmiRecord();
        CalcBMI c3 = new CalcBMI(30);
        c3.bmiRecord();
    }
}