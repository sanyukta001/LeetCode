class Solution {
    public boolean isPalindrome(String s) {
        StringBuffer w = new StringBuffer();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if((ch >= 'a' && ch <= 'z')||(ch >= 'A' && ch <= 'Z')||(ch >= '0' && ch <= '9')){
                w.append(Character.toLowerCase(ch));
            }
        }
        w.toString();
        int i = 0, j = w.length()-1;
        while(i < j){
            if(w.charAt(i) != w.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}