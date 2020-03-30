package solution.String;

/**
 * @author ：Tong
 * @date ：Created in 2019/9/5 15:33
 * @description：汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
 * @version: $
 */
public class LeftRotateString {
    /**
    * @Description:
     * abcXYZdef
     * 左移3位
     * XYZdefabc
     * 等同于
     * cba			前反转
     * fedZYX		后反转
     * XYZdefabc	一起反转
    * @Param: [str, n]
    * @Return: java.lang.String
    * @Date: 2019/9/5
    **/
    public String leftRotateString(String str,int n) {
        if(str.isEmpty()){
            return str;
        }
        return new StringBuffer(new StringBuffer(str.substring(0,n)).reverse().toString()+new StringBuffer(str.substring(n)).reverse().toString()).reverse().toString();
    }
}
