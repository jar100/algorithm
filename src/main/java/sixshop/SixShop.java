package sixshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SixShop {

    public static String isPangram(List<String> a) {
        StringBuilder answer = new StringBuilder();


        for (String s : a) {
            List<Character> checkList = new ArrayList<>();
            for (int i = 97; i < 123; i++) {
                checkList.add((char) i);
            }
            for (int i = 0; i < s.length(); i++) {
                if (checkList.size() > 0) {
                    if (checkList.contains(s.charAt(i))) {
                        checkList.remove(checkList.indexOf(s.charAt(i)));
                    }
                }
            }
            if (checkList.size() > 0) {
                answer.append("0");
            } else {
                answer.append("1");
            }
        }

        return answer.toString();
    }

    static String[] braces2(String[] values) {
        String[] answer = new String[values.length];
        answer[0].split(" ",-1);
        int count = 0;
        for (String value : values) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < value.length(); i++) {
                if (value.charAt(i) == '(') {
                    stack.add(value.charAt(i));
                }

                if (value.charAt(i) == '{') {
                    stack.add(value.charAt(i));

                }

                if (value.charAt(i) == '[') {
                    stack.add(value.charAt(i));

                }

                if (value.charAt(i) == ')') {
                    if (stack.isEmpty()) {
                        answer[count] = "NO";
                        break;
                    }
                    if (stack.peek() == '(') {
                        stack.pop();
                    }

                }

                if (value.charAt(i) == '}') {
                    if (stack.isEmpty()) {
                        answer[count] = "NO";
                        count++;
                        break;
                    }
                    if (stack.peek() == '{') {
                        stack.pop();
                    }
                }

                if (value.charAt(i) == ']') {
                    if (stack.isEmpty()) {
                        answer[count] = "NO";
                        break;
                    }
                    if (stack.peek() == '[') {
                        stack.pop();
                    }
                }
                if (i == value.length() - 1 && stack.isEmpty()) {
                    answer[count] = "YES";
                } else if (i == value.length() - 1) {
                    answer[count] = "NO";
                }
            }
            count++;
        }

        return answer;

    }

    static String[] braces(String[] values) {
        String[] answer = new String[values.length];
        int count = 0;

        for (String value : values) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < value.length(); i++) {
                if (value.charAt(i) == '(') {
                    stack.add(value.charAt(i));
                }

                if (value.charAt(i) == '{') {
                    stack.add(value.charAt(i));

                }

                if (value.charAt(i) == '[') {
                    stack.add(value.charAt(i));

                }

                if (value.charAt(i) == ')') {
                    if (stack.isEmpty()) {
                        answer[count] = "NO";
                        break;
                    }
                    if (stack.peek() == '(') {
                        stack.pop();
                    }

                }

                if (value.charAt(i) == '}') {
                    if (stack.isEmpty()) {
                        answer[count] = "NO";
                        break;
                    }
                    if (stack.peek() == '{') {
                        stack.pop();
                    }
                }

                if (value.charAt(i) == ']') {
                    if (stack.isEmpty()) {
                        answer[count] = "NO";
                        break;
                    }
                    if (stack.peek() == '[') {
                        stack.pop();
                    }
                }
                if (i == value.length() - 1 && stack.isEmpty()) {
                    answer[count] = "YES";
                } else if (i == value.length() - 1) {
                    answer[count] = "NO";
                }

            }
            count++;
        }


        return answer;
    }


    public static int minPower(List<Integer> p) {
        // Write your code here
        int answer = 0;
        boolean isFinnish = false;
        boolean no = false;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {

            int temp = answer;
            no = true;
            for (Integer integer : p) {
                temp += integer;
                if (temp <= 0) {
                    answer++;
                    no = false;
                    break;
                }
            }
            if (no == true && temp >= 0) {
                break;
            }
        }


        return answer;
    }

//    String[] getMovieTitles(String substr) {
//        String response;
//        int startPage = 1;
//        int totalPages = Integer.MAX_VALUE;
//        List<String> titles = new ArrayList<>();
//        while (startPage <= totalPages) {
//            try {
//                URL obj = new URL("https://jsonmock.hackerrank.com/api/movies/search/?Title=" + substr + "&page=" + startPage);
//                HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//                con.setRequestMethod("GET");
//                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//                while ((response = in.readLine()) != null) {
//                    JsonObject convertedObject = new Gson().fromJson(response, JsonObject.class);
//                    totalPages = convertedObject.get("total_pages").getAsInt();
//                    JsonArray data = convertedObject.getAsJsonArray("data");
//                    for (int i = 0; i < data.size(); i++) {
//                        String title = data.get(i).getAsJsonObject().get("Title").getAsString();
//                        titles.add(title);
//                    }
//                }
//                in.close();
//                startPage++;
//            } catch (Exception ex) {
//                ex.printStackTrace();
//            }
//        }
//        Collections.sort(titles);
//        return titles.toArray(new String[0]);
//    }


    public static long angryAnimals(int n, List<Integer> a, List<Integer> b) {
        // Write your code here

        // a { 1 ,2}
        // b { 2, 3}
        List<Long> answerList = new ArrayList<>();
        answerList.add(0L);
        int[] arr = new int[n];
        long answer = 0L;
        int temp = 1;
        int comIndex = 0;
        /// 기준점 i 하나하나 증가시키면서 answer 증가
        for (int i = 1; i <= n ; i++) {
            if (i == 1) {
                comIndex = a.lastIndexOf(i);
                if (i +1 == b.indexOf(comIndex)) {

                } else {
                    answer ++;
                }
            }
        }

        return answerList.get(0);
    }



}


