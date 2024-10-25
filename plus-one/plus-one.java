class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1] <= 8){
            digits[digits.length-1]+=1;
            return digits;
        }
        int[] res = new int[digits.length+1];
        int carry = 1;
        for(int i = digits.length-1;i>=0; i--){
            int sum = digits[i]+carry;
            digits[i] = sum%10;
            carry = sum/10;
        }
        if(carry != 0){
            res[0] = carry;
            for(int i = 0; i < digits.length; i++){
                res[i+1] = digits[i];
            }
            return res;
        }
        else return digits;
    }
}