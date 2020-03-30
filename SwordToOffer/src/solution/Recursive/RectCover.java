package solution.Recursive;

/**
 * @description:
 * @author: Tong
 * @date: 2020-03-23 21:14
 */
public class RectCover {
    public int solution(int target) {
        if(target ==1){
            return 1;
        }
        else if(target ==2){
            return 2;
        }
        else if(target>2){
            return solution(target-1)+solution(target-2);
        }else {
            return -1;
        }
    }
}
