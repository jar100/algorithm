package codility.kmtest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test1 {
    private static final String DOMAIN_SUFFIX = ".com";
    private static final String NAME_SEPARATOR = ", ";
    private static final String EMAIL_PREFIX = "<";
    private static final String EMAIL_SUFFIX = ">";
    private static final String HYPHEN = "-";
    private static final String EMPTY_STRING = "";
    private static final String SPACE = " ";
    private static final String AT_SYMBOL = "@";
    private static final int MAX_LAST_NAME_LENGTH = 8;

    public String solution(String S, String C) {
        String[] names = S.split(NAME_SEPARATOR);
        String domain = C.toLowerCase() + DOMAIN_SUFFIX;

        Map<String, Integer> duplicateCountMap = new HashMap<>();
        Map<String, String> resultList = new LinkedHashMap<>();

        for (String name : names) {
            String email = generateEmail(name, domain, duplicateCountMap);
            resultList.put(name, email);
        }

        return formatResultList(resultList);
    }

    private String generateEmail(String name, String domain, Map<String, Integer> duplicateCountMap) {
        String[] parts = name.split(SPACE);
        String firstName = parts[0].toLowerCase();
        String middleName = parts.length > 2 ? parts[1].toLowerCase() : null;
        String lastName = parts[parts.length - 1].toLowerCase();

        StringBuilder emailBuilder = new StringBuilder();
        emailBuilder.append(makeInitials(firstName));
        if (middleName != null) {
            emailBuilder.append(makeInitials(middleName));
        }
        emailBuilder.append(makeLastName(lastName));

        String baseEmail = emailBuilder.toString();
        String email = baseEmail + AT_SYMBOL + domain;

        if (duplicateCountMap.containsKey(email)) {
            int count = duplicateCountMap.get(email) + 1;
            duplicateCountMap.put(email, count);
            email = baseEmail + count + AT_SYMBOL + domain;
        } else {
            duplicateCountMap.put(email, 1);
        }

        return email;
    }

    private String makeLastName(String lastName) {
        String sanitizedLastName = lastName.replace(HYPHEN, EMPTY_STRING);
        return sanitizedLastName.length() > MAX_LAST_NAME_LENGTH
            ? sanitizedLastName.substring(0, MAX_LAST_NAME_LENGTH)
            : sanitizedLastName;
    }

    private String makeInitials(String name) {
        return String.valueOf(name.charAt(0));
    }

    private String formatResultList(Map<String, String> resultList) {
        StringBuilder formattedResult = new StringBuilder();
        for (Map.Entry<String, String> entry : resultList.entrySet()) {
            if (formattedResult.length() > 0) {
                formattedResult.append(NAME_SEPARATOR);
            }
            formattedResult.append(entry.getKey()).append(SPACE).append(EMAIL_PREFIX).append(entry.getValue()).append(EMAIL_SUFFIX);
        }
        return formattedResult.toString();
    }
}