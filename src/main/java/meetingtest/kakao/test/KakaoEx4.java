package meetingtest.kakao.test;

import java.util.*;

public class KakaoEx4 {
    public int solution(int K, String[] user_scores) {
        Stack<User> rank = new Stack<>();
        List<User> oldRank = new ArrayList<>();
        int answer = 0;

        for (String user_score : user_scores) {
            String[] parseBlank = user_score.split(" ");

            makeNewRanking(K, rank, new User(parseBlank[0],Integer.parseInt(parseBlank[1])));

            if (!oldRank.equals(rank)) {
                answer++;
            }
            oldRank = new ArrayList<>(rank);
        }
        return answer;
    }

    private void makeNewRanking(int K, Stack<User> rank, User target) {
        if (rank.contains(target)) {
            rank.get(rank.indexOf(target)).newScore(target);
        } else if (rank.size() < K) {
            rank.add(target);
        } else if (rank.peek().score < target.score) {
            rank.pop();
            rank.add(target);
        }
        compareUser(rank);
    }

    private void compareUser(List<User> rank) {
        rank.sort((o1, o2) -> {
            if (o1.score > o2.score) {
                return -1;
            } else if (o1.score < o2.score) {
                return 1;
            } else {
                return 0;
            }});
    }

    class User {
        private String name;
        private int score;


        public User(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public void newScore(User newUser) {
            this.score = this.score > newUser.score ? this.score : newUser.score;
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
