class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            steps += (num & 1) == 1 ? 2 : 1;
            num >>= 1;
        }
        return steps == 0 ? 0 : steps - 1;
    }
}
