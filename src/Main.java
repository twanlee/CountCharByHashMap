import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String string = "i alone decide my fate";
        final int value = 1;
        int sum = 0;
        HashMap myHashMap = new HashMap<String, Integer>();
        for (int i=0; i<string.length(); i++){
            if(myHashMap.containsKey(string.charAt(i))){
                myHashMap.put(string.charAt(i),sum+=value);
            }else
                myHashMap.put(string.charAt(i),value);
        }
        System.out.println(myHashMap);
    }
}
