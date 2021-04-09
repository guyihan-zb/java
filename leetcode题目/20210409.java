class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int sum=0;
        int top=0;
        int tmp=0;
        for(int i=0;i<ops.length;i++){
            switch(ops[i]){
                case "+":
                    top=stack.pop();
                    tmp=top+stack.peek();
                    stack.push(top);
                    sum+=stack.push(tmp);
                    break;
                 case "D":
                    // 前一次得分的两倍
                    sum += stack.push( 2 * stack.peek());
                    break;
                case "C" :  
                    // 前一次得分无效
                    sum -= stack.pop();
                    break;
                default:
                    // 加数字
                    stack.push(Integer.parseInt(ops[i]));
                    sum += Integer.parseInt(ops[i]);
            }
        }
        return sum;
    }
}