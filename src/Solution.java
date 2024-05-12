public class Solution {
    public boolean isPalindrome(String checkingString) {
        String cleanString = checkingString.replaceAll("\\W", "");
        String reversedString = new StringBuilder(cleanString).reverse().toString();
        return cleanString.equalsIgnoreCase(reversedString);

    }
}
