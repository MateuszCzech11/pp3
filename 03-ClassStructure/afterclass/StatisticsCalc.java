public class StatisticsCalc{
    
    public static int itemCount(int x,int y){
        return y-x;
    }
    
    public static int itemSum(int x, int y){
        int sum=0;
        for (int i=x;i<=y;i++){
            sum+=i;
        }
        return sum;
    }
    
    public static int itemMean(int x, int y){
        int sum=0;
        for (int i=x;i<=y;i++){
            sum+=i;
        }
        return sum / (y-x);
    }
    
    public static void main(String[] args){
        System.out.println(itemCount(5,10));
        System.out.println(itemSum(5,10));
        System.out.println(itemMean(5,10));
    }
}