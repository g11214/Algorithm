package leetcode;

import java.util.*;

//Top_127LadderLength
class Top_127LadderLength {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord))
            return 0;
        Queue<String> beginQueue = new LinkedList<>();
        Queue<String> endQueue = new LinkedList<>();
        Set<String> beginSet = new HashSet<>();
        Set<String> endSet = new HashSet<>();
        beginQueue.offer(beginWord);
        endQueue.offer(endWord);
        beginSet.add(beginWord);
        endSet.add(endWord);
        int res = 2;
        while (!beginQueue.isEmpty() && !endQueue.isEmpty()) {
            if (beginQueue.size() > endQueue.size()) {
                Queue<String> tmp = beginQueue;
                beginQueue = endQueue;
                endQueue = tmp;
                Set<String> t = beginSet;
                beginSet = endSet;
                endSet = t;
            }
            int len = beginQueue.size();
            while (len-- > 0) {
                String currStr = beginQueue.poll();
                if (endSet.contains(currStr))
                    return res;
                for (String compStr : wordList) {
                    if (beginSet.contains(compStr))
                        continue;
                    if (compare(currStr, compStr)) {
                        beginSet.add(compStr);
                        beginQueue.offer(compStr);
                    }
                }
            }
            res++;
        }
        return 0;
    }

    public boolean compare(String currWord, String cmpWord) {
        int dif = 0;
        for (int i = 0; i < currWord.length(); i++) {
            if (currWord.charAt(i) != cmpWord.charAt(i))
                dif++;
            if (dif > 1) {
                return false;
            }
        }
        return dif == 1;
    }
}
