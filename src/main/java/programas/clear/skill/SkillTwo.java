package programas.clear.skill;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
/*
*
* 문제 요구조건
* 마라톤 참가자 배열과, 완주자 배열이 주워진다.
* 한명만 탈락했다.
* 탈락자 한명을 구하세요.
*
*
* */
public class SkillTwo {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        List<Runner> runners = new ArrayList<>();

        for (String s : participant) {
            runners.add(new Runner(s));
        }

        for (String s : completion) {
            runners.remove(new Runner(s));
        }
        System.out.println(runners.size());
        answer = runners.get(0).getName();
        return answer;
    }

    public String solution2(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!completion[i].equals(participant[i])) {
                return participant[i];
            }
        }

        return participant[participant.length -1];
    }

    public class Runner {
        private String name;

        public Runner(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Runner runner = (Runner) o;
            return Objects.equals(name, runner.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }


    }
}
