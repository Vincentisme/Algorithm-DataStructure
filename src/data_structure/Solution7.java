package data_structure;

public class Solution7 {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i>=0; i--){
            digits[i]++;
            digits[i]%=10;
            if(digits[i]!=0) return digits;
        }
        int[] t_digits = new int[digits.length+1];
        t_digits[0] = 1;
        return t_digits;
    }
}
