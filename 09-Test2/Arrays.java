public class Arrays {
    public static boolean arr(int[] arr1,int[] arr2){
        int counter1=0;
        int counter2=0;
        for(int i: arr1){
            if(i>=10 && i<=99){
                counter1++;
            }
        }
        for(int i: arr2){
            if(i>=10 && i<=99){
                counter2++;
            }
        }
        if(counter1 == counter2){
            return true;
        } else {
            return false;
        }
    }
}
