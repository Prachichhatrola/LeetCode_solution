class Solution {
     public int minimumOneBitOperations(int n) {
        return minimumOneBitOperations(n, 0);
    }

    public int minimumOneBitOperations(int n, int res) {
        if (n == 0) return res;
        int b = 1;
        while ((b << 1) <= n)
            b = b << 1;
        return minimumOneBitOperations((b >> 1) ^ b ^ n, res + b);
    }
}
