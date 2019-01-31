package programas.test;

import java.util.*;

public class kakaoEx4 {
    public int solution(int K, String[] user_scores) {
        int answer = 0;

        List<User> rank = new ArrayList<>();
        Queue<User> userScores = new LinkedList<>();
        List<User> oldRank = new ArrayList<>();
        List<User> newRank = new ArrayList<>();

        for (String user_score : user_scores) {
            String[] parseBlank = user_score.split(" ");
            userScores.add(new User(parseBlank[0], Integer.parseInt(parseBlank[1])));
        }

        for (int i = 0; i < K; i++) {
            rank.add(userScores.poll());
        }
        compareUser(rank);

        while (!userScores.isEmpty()) {
            oldRank.clear();
            for (int i = 0; i < K; i++) {
                oldRank.add(rank.get(i));
            }
            User target = userScores.poll();
            if (rank.get(K-1).score < target.score) {
                if (rank.indexOf(target) > -1) {
                    rank.set(rank.indexOf(target),target);
                } else {
                    rank.set(K-1,target);
                }
                compareUser(rank);
            }

            newRank.clear();
            for (int i = 0; i < K; i++) {
                newRank.add(rank.get(i));
            }

            if (!oldRank.equals(rank)) {
                answer ++;
            }

        }
        return answer;
    }

    private void compareUser(List<User> rank) {
        Collections.sort(rank, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if (o1.score > o2.score) {
                    return -1;
                } else if (o1.score < o2.score) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }

    class User {
        private String name;
        private int score;


        public User(String name, int score) {
            this.name = name;
            this.score = score;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
