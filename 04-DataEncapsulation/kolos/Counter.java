public class Counter{
    static int counter=0;

    static void increase(){
        counter+=1;
    }

    static void decrease(){
        counter-=1;
    }

    static void increase(int n){
        counter+=n;
    }

    static void decrease(int n){
        counter-=n;
    }

    public static int value(){
        return counter;
    }

}