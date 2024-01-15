package LeetCodeProblems;

import java.util.ArrayList;
import java.util.List;

public class Problem2942 {

    public static void main(String[] args) {
        Problem2942 obiect = new Problem2942();

        String[] words = new String[2];
        words[0] = "leet";
        words[1] = "code";

        List<Integer> result = obiect.findWordsContaining(words, 'e');
        System.out.println(result);

    }
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> elements = new ArrayList<>();
        int wordsLen = words.length - 1;
        int index = 0;
        while (index <= wordsLen){
            if (words[index].contains(String.valueOf(x))){
                elements.add(index);
                index++;
            }else{
                index++;
            }
        }
        return elements;
    }
}