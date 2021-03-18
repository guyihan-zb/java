class Solution {
    public int findJudge(int N, int[][] trust) {
        int[] degree = new int[N + 1];    // 总票数
        
        for (int[] relation : trust) {
            degree[relation[1]]++;          // 获得投票
            degree[relation[0]]--;          // 投出一票
        }
        
        int judge = -1; 
        for (int i = 1; i <= N; i++) {
            // 为了成为全镇最靓的仔，他没有给其他人投过票
            if (degree[i] == N - 1) {    
                judge = i;
                break;
            }
        }
        return judge;   // C位出道
    }
}