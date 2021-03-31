class Solution {
    public String reverseOnlyLetters(String S) {
        Stack<Character> let=new Stack();
        for(char c: S.toCharArray()){
            if(Character.isLetter(c)){
                let.push(c);
            }
        }

        StringBuilder ans = new StringBuilder();
        for (char c: S.toCharArray()) {
            if (Character.isLetter(c))
                ans.append(let.pop());
            else
                ans.append(c);
        }
        return ans.toString();
    }
}