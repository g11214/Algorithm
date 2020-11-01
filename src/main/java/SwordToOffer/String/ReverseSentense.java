package SwordToOffer.String;

/**
 * @description:
 * @author: Tong
 * @date: 2020-03-25 16:16
 */
public class ReverseSentense {
    public String solution(String str) {
        if (str == null || str.trim().equals("")) {
            return str;
        }
        String[] words = str.split(" ");
        String setense = "";
        for (String word :
                words) {
            setense = word + " " + setense;
        }
        return setense.substring(0, setense.length() - 1);
    }
}
