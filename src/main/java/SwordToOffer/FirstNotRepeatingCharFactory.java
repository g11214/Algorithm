package SwordToOffer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * @description:
 * @author: Tong
 * @date: 2020-04-06 21:52
 */
public class FirstNotRepeatingCharFactory {

    HashSet<Character> repSet = new HashSet<>();
    HashSet<Character> singleSet = new LinkedHashSet<>();

    //Insert one char from stringstream
    public void Insert(char currChar) {
        if (repSet.contains(currChar)) {

        } else {
            if (!singleSet.add(currChar)) {
                singleSet.remove(currChar);
                repSet.add(currChar);
            }
        }
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        if (!singleSet.isEmpty()) {
            return singleSet.iterator().next();
        }
        return '#';
    }
}
