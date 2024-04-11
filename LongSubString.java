import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class LongSubString {

    public static void main(String[] args) {
        String str="pwwkew";
        int start  = 0;
        int maxLength = 0;
        HashMap<Character,Integer> charIndexMap = new HashMap<>();
        for(int i=0;i<str.length();i++){
          if(charIndexMap.containsKey(str.charAt(i))){
              if(charIndexMap.get(str.charAt(i))>= start){
                  start = i - start;
                  maxLength = Math.max(start,maxLength);
                  start = charIndexMap.get(str.charAt(i)) +1;
              }
              charIndexMap.replace(str.charAt(i),i);
          } else {
              charIndexMap.put(str.charAt(i),i);
          }

        }
        System.out.println(maxLength);


    }
}
