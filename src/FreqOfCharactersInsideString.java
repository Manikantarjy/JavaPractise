import java.util.HashMap;
import java.util.Map;

public class FreqOfCharactersInsideString {
    public static void main(String[] args) {

        String str = "automation";
       Map<Character, Integer> map = new HashMap();
        char[] ch = str.toCharArray();
        for(char c:ch){
          if(!map.containsKey(c)){
            map.put(c,1);
          }
          else{
              int cnt;
              cnt = map.get(c);
              map.put(c,cnt+1);
          }
        }
        System.out.println(map);
    }
}
