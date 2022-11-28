public class Maximus{

    static int chooseMax(int[] array){
        int maximum = -9999;
        for (int i: array){
            if(i>maximum){
                maximum = i;
            }
        }
        return maximum;
    }
}