public class SuperCounter extends Counter {

    public SuperCounter(int c) {
        super(c);
    }

    public void addN(int n){
        int i=0;
        while(i<n){
            add1();
            i++;
        }
    }
    
}
