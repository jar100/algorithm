package programas.clear.phonebook;

public class PhoneBook {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        for (int i = 0; i < phone_book.length; i++) {
            String a = phone_book[i];
            int count = 0;
            for (String s : phone_book) {
                if (s.startsWith(a)) {
                    count++;
                }
            }
            if (count > 1) {
                return false;
            }
        }
        return answer;
    }
}

