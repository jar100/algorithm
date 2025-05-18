package codility.kmtest;

public class Test2 {

    public int solution(int[] T, int[] A) {
        boolean[] visited = new boolean[T.length];
        int count = 0;

        for (int skill : A) {
            int currSkill = skill;
            // 아직 방문(학습)이 안 된 스킬이면 부모로 계속 올라가며
            while (!visited[currSkill]) {
                visited[currSkill] = true;
                count++;
                // 루트(0)에 도달했으면 더 이상 부모가 없으므로 중단
                if (currSkill == 0) {
                    break;
                }
                currSkill = T[currSkill];
            }
        }
        return count;
    }
}
