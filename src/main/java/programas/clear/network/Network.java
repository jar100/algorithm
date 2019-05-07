package programas.clear.network;

public class Network {
    boolean[] visited;

    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                answer++;
                dfs(i, computers, n);
            }
        }
        return answer;
    }

    void dfs(int start, int[][] computers, int n) {
        visited[start] = true;
        for (int i = 0; i < n; i++) {
            if (!visited[i] && computers[start][i] == 1)
                dfs(i, computers, n);
        }

    }
}
