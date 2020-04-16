package Hot100;

/**
 * @author ：Tong
 * @date ：Created in 2020/3/31 10:46
 * @description：
 * @version: $
 */
public class Top_5LongestPalindrome {

    public boolean isHuiString(String s) {
        return new StringBuffer(s).reverse().toString().equals(s);
    }
}
