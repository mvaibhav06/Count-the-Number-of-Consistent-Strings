import java.util.HashSet;

public class ConsistentString {
    public static int countConsistentString(String allowed, String[] words){
        HashSet<Character> temp = new HashSet<>();
        int out = 0;
        for (int i=0; i<allowed.length(); i++){
            temp.add(allowed.charAt(i));
        }
        for (int i=0; i<words.length; i++){
            int j = 0;
            for (j=0; j<words[i].length(); j++){
                if (!temp.contains(words[i].charAt(j))){
                    break;
                }
            }
            if (j == words[i].length()){
                out++;
            }
        }
        return out;
    }

    public static void main(String[] args) {
        String[] words = {"cc","acd","b","ba","bac","bad","ac","d"};
        System.out.println(countConsistentString("cad",words));
    }
}
