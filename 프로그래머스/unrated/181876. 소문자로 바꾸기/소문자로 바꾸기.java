class Solution {
    public String solution(String str) {
        String answer = "";
        
        char[] chArr = str.toCharArray();
        for(char ch : chArr) {
            answer += Character.toLowerCase(ch);
        }
        return answer;
    }
}