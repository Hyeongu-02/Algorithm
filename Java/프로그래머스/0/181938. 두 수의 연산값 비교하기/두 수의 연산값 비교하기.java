class Solution {
    public int solution(int a, int b) {
        int ab=Integer.valueOf((String.valueOf(a)+String.valueOf(b)));
        return (ab>2*a*b)?ab:2*a*b;
    }
}