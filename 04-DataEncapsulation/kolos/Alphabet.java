import java.util.Arrays;
public class Alphabet{


    static boolean isAlphabet(String letters){
        int leng= letters.length();
        char[] letterarr = new char[leng];
        for (int i=0;i<leng;i++){
            letterarr[i]=letters.charAt(i);
        }
        Arrays.sort(letterarr);
        for(int i=0;i<leng;i++){
            if(letters.charAt(i)!=letterarr[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Alphabet.isAlphabet("abcmhsw"));
    }
}