class Solution {
    public int solution(int a, int b) {
        int answer = 0;
		int ab=Integer.valueOf(String.valueOf(a)+String.valueOf(b));
		int ba=Integer.valueOf(String.valueOf(b)+String.valueOf(a));
        
        return (ab>ba)?ab:ba;
    }
}