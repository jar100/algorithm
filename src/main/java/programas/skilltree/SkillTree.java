package programas.skilltree;

public class SkillTree {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        boolean[] user_skilltrees = new boolean[skill.length()];
        for (String skill_tree : skill_trees) {
            for (int i = 0; i < skill_tree.length(); i++) {
                String nowSkill = String.valueOf(skill_tree.charAt(i));
                if (skill.contains(nowSkill)) {
                    int index = skill.indexOf(nowSkill);
                    if (index == 0) {
                        user_skilltrees[index] = true;
                    }

                    if (index > 0 && user_skilltrees[index - 1]) {
                        user_skilltrees[index] = true;
                    }

                    if (index > 0 && !user_skilltrees[index - 1]) {
                        break;
                    }
                }
                if (i == skill_tree.length() -1 ){
                    answer ++;
                }

            }
            user_skilltrees = new boolean[skill.length()];
        }

        return answer;
    }
}
