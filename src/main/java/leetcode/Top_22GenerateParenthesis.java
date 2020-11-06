package leetcode;


import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Tong
 * @date: 2020-04-18 21:24
 */
public class Top_22GenerateParenthesis {
    int count = 0;
    List<String> list = new ArrayList<>();

    public List<String> solution(int n) {
        count = n;
        helper(0, 0, "");
        return list;
    }

    public void helper(int left, int right, String result) {
        if (left == count && right == count) {
            list.add(result);
        }
        if (left < count) {
            helper(left + 1, right, result + "(");
        }
        if (left > right && right < count) {
            helper(left, right + 1, result + ")");
        }
    }

    public static void main(String[] args) {
        Top_22GenerateParenthesis n = new Top_22GenerateParenthesis();
        for (Object s :
                n.solution(3).toArray()) {
            System.out.println(s);
        }
    }
}
