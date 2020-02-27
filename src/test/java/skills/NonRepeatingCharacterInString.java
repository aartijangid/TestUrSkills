package test.java.skills;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NonRepeatingCharacterInString {
    public static void main (String[] args){
        String name = "efficient";
        Map<Character, Integer> orderedCharCount = new LinkedHashMap<Character, Integer>();

        for(int i = 0; i < name.length(); i++){
            char letter = name.charAt(i);
            if(orderedCharCount.containsKey(letter)){
                orderedCharCount.put(letter, orderedCharCount.get(letter) + 1); // increment the count
            } else
                orderedCharCount.put(letter, 1);
        }

        for(Entry<Character, Integer> entry : orderedCharCount.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
                break;
            }

        }
    }
}
