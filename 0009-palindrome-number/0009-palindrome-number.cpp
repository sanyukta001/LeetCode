class Solution {
public:
    bool isPalindrome(int x) {
    if(x<0)
    return false;
    int num = x; // Assign x to num at the beginning
        int digit;
        long rev = 0;

        do {
            digit = num % 10;
            rev = (rev * 10) + digit;
            num = num / 10;
        } while (num != 0);

        return x == (int)rev;
    }
};