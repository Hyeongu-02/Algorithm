class Solution {
    public int[] solution(long n) {
		int[] answer = new int[(Long.toString(n)).length()];
		for(int i=0;i<answer.length;i++) {
			answer[i]=(int)(n%10);
			n=(long)n/10;
		}
        return answer;
    }
}