package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: Tong
 * @date: 2020-05-13 21:17
 */
public class Top_17LetterCombinations {
    Map<Integer, Character[]> map = new HashMap<>();

    public Top_17LetterCombinations() {
        map.put(2, new Character[]{'a', 'b', 'c'});
        map.put(3, new Character[]{'d', 'e', 'f'});
        map.put(4, new Character[]{'g', 'h', 'i'});
        map.put(5, new Character[]{'j', 'k', 'l'});
        map.put(6, new Character[]{'m', 'n', 'o'});
        map.put(7, new Character[]{'p', 'q', 'r', 's'});
        map.put(8, new Character[]{'t', 'u', 'v'});
        map.put(9, new Character[]{'w', 'x', 'y', 'z'});

    }

    List<String> resList = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        helper(digits, 0, "");
        return resList;
    }

    public void helper(String digits, int startIndex, String currStr) {
        if (digits.length() == currStr.length()) {
            resList.add(currStr);
            return;
        }
        //当前数字
        int currNum = Integer.parseInt(digits.charAt(startIndex) + "");
        //获取数字对应的字符数组
        if (currNum >= 2 && currNum <= 9) {
            Character[] currChar = map.get(currNum);
            for (int j = 0; j < currChar.length; j++) {
                helper(digits, startIndex + 1, currStr + currChar[j]);
            }
        }
    }

}
