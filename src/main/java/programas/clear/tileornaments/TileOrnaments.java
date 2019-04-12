package programas.clear.tileornaments;

public class TileOrnaments {
    public long solution(int N) {
        long answer = 0;
        long[] memorization = memorization(N);

        answer = (memorization[N] * 2) + ((memorization[N - 1] + memorization[N]) * 2);
        return answer;
    }

    private long[] memorization(int N) {
        long[] memorization = new long[N + 1];
        for (int i = 2; i <= N; i++) {
            memorization[i] = memorization[i - 1] + memorization[i - 2];
        }
        return memorization;
    }
}
