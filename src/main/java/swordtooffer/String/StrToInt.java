package swordtooffer.String;

/**
 * @description:
 * @author: Tong
 * @date: 2020-03-23 21:44
 */
public class StrToInt {
    public int solution(String str) {
        if (str.equals("") || str.length() == 0)
            return 0;
        char[] a = str.toCharArray();
        int fuhao = 0;
        if (a[0] == '-')
            fuhao = 1;
        long sum = 0;
        for (int i = fuhao; i < a.length; i++) {
            if (a[i] == '+')
                continue;
            if (a[i] < 48 || a[i] > 57)
                return 0;
            sum = sum * 10 + a[i] - 48;

        }
        sum = (fuhao == 0 ? sum : sum * -1);
        if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) sum;
        }

    }

    public static void main(String[] args) {
        StrToInt strToInt = new StrToInt();
        strToInt.solution("-2147483648");
    }
}
