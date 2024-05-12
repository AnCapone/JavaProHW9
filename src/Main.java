import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(solution.isPalindrome("race a car"));
        System.out.println(solution.isPalindrome(" "));
        System.out.println(solution.isPalindrome("ab_a"));

        System.out.println(solution.isContainsDuplicate(new int[]{1, 2, 3, 1}));
        System.out.println(solution.isContainsDuplicate(new int[]{1, 2, 3, 4}));
        System.out.println(solution.isContainsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));

        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{3, 2, 5}, 6)));
    }
}