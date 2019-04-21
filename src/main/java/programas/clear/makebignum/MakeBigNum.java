package programas.clear.makebignum;

public class MakeBigNum {
    public String solution(String number, int k) {
        StringBuilder splitNum = new StringBuilder(number);
        for (int j = 0; j < k; j++) {

            boolean isDeleted = false;
            for (int i = 0; i < splitNum.length() - 1; i++) {
                if (splitNum.charAt(i) < splitNum.charAt(i + 1)) {
                    splitNum.deleteCharAt(i);
                    isDeleted = true;
                    break;
                }
            }
            if (!isDeleted) {
                splitNum.deleteCharAt(splitNum.length() -1);
            }


        }
        return splitNum.toString();
    }

    private String getString(String num) {
        StringBuilder splitNum = new StringBuilder(num);
        boolean isDeleted = false;
        for (int i = 0; i < splitNum.length() - 1; i++) {
            if (splitNum.charAt(i) < splitNum.charAt(i + 1)) {
                splitNum.deleteCharAt(i);
                isDeleted = true;
                break;
            }
        }
        if (!isDeleted) {
            splitNum.deleteCharAt(splitNum.length() -1);
        }

        return splitNum.toString();
    }
}
