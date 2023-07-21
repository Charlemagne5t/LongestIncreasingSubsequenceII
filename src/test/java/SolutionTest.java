import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void lengthOfLISTest1(){
        int[] nums = {4,2,1,4,3,4,5,8,15};
        int k = 3;
        int expected = 5;
        int actual = new Solution().lengthOfLIS(nums, k);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lengthOfLISTest2(){
        int[] nums = {7,4,5,1,8,12,4,7};
        int k = 5;
        int expected = 4;
        int actual = new Solution().lengthOfLIS(nums, k);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lengthOfLISTest3(){
        int[] nums = {1,5};
        int k = 1;
        int expected = 1;
        int actual = new Solution().lengthOfLIS(nums, k);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lengthOfLISTest4(){
        int[] nums = {5,4,7,4,10,17,14};
        int k = 7;
        int expected = 4;
        int actual = new Solution().lengthOfLIS(nums, k);

        Assert.assertEquals(expected, actual);
    }
}
