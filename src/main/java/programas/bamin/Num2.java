package programas.bamin;

import javafx.scene.control.Separator;

import java.util.*;

public class Num2 {
    public static String solution(String s) {
        List<String[]> inputlist = new ArrayList<>();
        List<String[]> outputlist = new ArrayList<>();
        Map<String,Integer> city = new HashMap<>();
        String[] input = s.split("\n");
        StringBuilder output = new StringBuilder();
        for (String s1 : input) {
            String[] index = s1.split("\\.|,");
            if (!city.containsKey(index[2])) {
                city.put(index[2],1);
            } else {
                city.put(index[2],city.get(index[2]) + 1);

            }
            inputlist.add(index);
        }
        for (String[] strings : inputlist) {
            String[] outString = new String[3];
            outString[0] = strings[2];
            outString[2] = strings[1];
            outputlist.add(outString);
        }

        for (String s1 : city.keySet()) {
            int count = city.get(s1);
            int nums = String.valueOf(count).length();
            for (String[] strings : outputlist) {
                if (strings[0].equals(s1) ) {
                    String format = "%0"+ nums +"d";
                    strings[1] = String.format(format, count);
                    count --;
                }
            }
        }
        String separator = "";
        for (String[] strings : outputlist) {
            output.append(separator).append(strings[0] + strings[1] + "." + strings[2]);
            separator = "\n";
        }
        

        System.out.println(output);
        return String.valueOf(output);
    }
}
