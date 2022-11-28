public class MyArrays{

    static int even(int[] array){
        int counter=0;
        for (int i: array){
            if (i %2==0){
                counter+=1;
            }
        }
        return counter;
    }

    static int positiveOdd(int[] array){
        int counter=0;
        for (int i: array){
            if (i%2!=0 && i>0){
                counter+=1;
            }
        }
        return counter;
    }

    
}