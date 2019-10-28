package test;
import solution.GetNumberOfK;
/**
 * @author ：Tong
 * @date ：Created in 2019/9/5 10:42
 * @description：
 * @version: $
 */
public class getNumberTest {
    public static void main(String[] args) {
        GetNumberOfK getNumberOfK = new GetNumberOfK();
        int k = 3;
        int []arr = {1,2,3,3,3,3,4,5};
        System.out.println(getNumberOfK.getNumberOfK(arr,k));;
    }
}
