public class Alphabet{
    static String alph = "abcdefghijklmnoprstuwxyz";

    public static boolean isAlphabet(String t){
        for (int i=0; i<=23;i++){
            if(!alph.indexOf(charAt(i))){
                return false;
            }
            alph.substring(0,i);
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(Alphabet.isAlphabet("abegsw"));
        System.out.println(Alphabet.isAlphabet("abcmhsw"));
    }
}