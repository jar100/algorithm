package programas.kakao.test;

public class KakaoEx1 {
    public int solution(String phone_num) {
        int answer = findCase(phone_num);
        return answer;
    }

    public int findCase(String phone_num) {
        if (phone_num.startsWith("010-")) {
            String splitDash = phone_num.substring(4);
            return dashParse(splitDash, 1);
        }

        if (phone_num.startsWith("010")) {
            try {
                Integer.parseInt(phone_num);
                return 2;
            } catch (NumberFormatException e) {
                return -1;
            }
        }

        if (phone_num.startsWith("+82-10-")) {
            String spritDash1 = phone_num.substring(7);
            return dashParse(spritDash1, 3);
        }
        return -1;
    }

    private int dashParse(String spritDash1, int caseint) {
        String[] splitDash = spritDash1.split("-");
        if (splitDash.length != 2) {
            return -1;
        }
        for (String dash : splitDash) {
            if (dash.length() != 4) {
                return -1;
            }
        }
        return caseint;
    }

}
