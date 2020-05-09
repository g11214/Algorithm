package Hot100;

/**
 * @description:
 * @author: Tong
 * @date: 2020-04-20 20:25
 */
public class Top_208Trie {
    private boolean is_string = false;
    private Top_208Trie[] next = new Top_208Trie[26];

    public Top_208Trie() {
    }

    public void insert(String word) {//插入单词
        Top_208Trie root = this;
        char w[] = word.toCharArray();
        for (int i = 0; i < w.length; ++i) {
            if (root.next[w[i] - 'a'] == null) root.next[w[i] - 'a'] = new Top_208Trie();
            root = root.next[w[i] - 'a'];
        }
        root.is_string = true;
    }

    public boolean search(String word) {//查找单词
        Top_208Trie root = this;
        char w[] = word.toCharArray();
        for (int i = 0; i < w.length; ++i) {
            if (root.next[w[i] - 'a'] == null) return false;
            root = root.next[w[i] - 'a'];
        }
        return root.is_string;
    }

    public boolean startsWith(String prefix) {//查找前缀
        Top_208Trie root = this;
        char p[] = prefix.toCharArray();
        for (int i = 0; i < p.length; ++i) {
            if (root.next[p[i] - 'a'] == null) return false;
            root = root.next[p[i] - 'a'];
        }
        return true;
    }
}
