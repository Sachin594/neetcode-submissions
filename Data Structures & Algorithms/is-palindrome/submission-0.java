class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        int len = s.length();
        int left = 0;
        int right = len - 1;
        while (left < right) {
            char chL= Character.toLowerCase(s.charAt(left));
            char chR= Character.toLowerCase(s.charAt(right));
            System.out.println(chL+" "+chR);
            if(chL != chR)
                return false;
            left++;
            right--;
        }
        return true;
    }
}
