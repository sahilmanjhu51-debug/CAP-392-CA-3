
class Solution {
    public int subtractProductAndSum(int num) {

        int product = 1;
        int sum = 0;

        while (num > 0) {

            int digit = num % 10;

            product = product * digit;
            sum = sum + digit;

            num = num / 10;
        }

        return product - sum;
    }
}
