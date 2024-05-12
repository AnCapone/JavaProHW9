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
}
