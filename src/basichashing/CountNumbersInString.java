package basichashing;

import java.util.HashMap;
import java.util.Map;

public class CountNumbersInString {
    Map<Character, Integer> precompute(String str){
        Map<Character, Integer> freqMap = new HashMap<>();
        for ( char ch : str.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        return freqMap;
    }

    int findFreq(char ch, Map<Character, Integer> freqMap){
        return freqMap.getOrDefault(ch, 0 );
    }

    void findHighestandLowestFreqChar(Map<Character, Integer> freqMap){
        char minChar = ' ';
        char maxChar = ' ' ;
        int minFreq = Integer.MAX_VALUE;
        int max_freq = Integer.MIN_VALUE;
        //using entryset
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()){
            if(entry.getValue() > max_freq){
                maxChar = entry.getKey();
                max_freq = entry.getValue();
            }
            if (entry.getValue() < minFreq){
                minChar = entry.getKey();
                minFreq = entry.getValue();
            }
        }

        System.out.println("Max char: " + maxChar + " with freq: " + max_freq);
        System.out.println("Min char: " + minChar + " with freq: " + minFreq);
    }

    public static void main(String[] args) {
        String name = "siddharth";
        CountNumbersInString obj = new CountNumbersInString();
        System.out.println(obj.findFreq('d', obj.precompute(name)));
        obj.findHighestandLowestFreqChar(obj.precompute(name));
    }
}
