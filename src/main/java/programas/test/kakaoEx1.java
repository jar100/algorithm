package programas.test;

public class kakaoEx1 {
    public int solution(String phone_num) {
        int answer = findCase(phone_num);
        return answer;
    }

    public int findCase(String phone_num) {
        if (phone_num.substring(0,4).equals("010-")) {
            String splitDash = phone_num.substring(4);
            return dashParse(splitDash,1);
        }

        if (phone_num.substring(0,3).equals("010")  && phone_num.length() == 11) {
            return 2;
        }

        if (phone_num.contains("+82-10-")) {
            String spritDash1 = phone_num.substring(7);
            return dashParse(spritDash1,3);
        }
        return -1;
    }

    private int dashParse(String spritDash1,int caseint) {
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
