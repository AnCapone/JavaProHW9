public class Solution {
    public boolean isPalindrome(String s) {
        String cleanString = s.replaceAll("\\W|_", "");
        String reversedString = new StringBuilder(cleanString).reverse().toString();
        return cleanString.equalsIgnoreCase(reversedString);

    }
}
