import java.util.HashMap;
import java.util.HashSet;


public class Solution {
    public boolean isPalindrome(String s) {
        String cleanString = s.replaceAll("\\W|_", "");
        String reversedString = new StringBuilder(cleanString).reverse().toString();
        return cleanString.equalsIgnoreCase(reversedString);

    }

    public boolean isContainsDuplicate(int[] numbers) {
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        for (int number : numbers) {
            if (!uniqueNumbers.add(number)) {
                return true;
            }
        }
        return false;
    }

    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> numberIndexes = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int difference = target - numbers[i];
            if (numberIndexes.containsKey(difference)) {
                return new int[]{numberIndexes.get(difference), i};
            }
            numberIndexes.put(numbers[i], i);
        }
        throw new IllegalArgumentException("No solution found!");
    }
}
