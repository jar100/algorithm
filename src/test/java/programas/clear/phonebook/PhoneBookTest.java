package programas.clear.phonebook;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PhoneBookTest {
    @Test
    public void solution() {
        PhoneBook phoneBook = new PhoneBook();
        assertThat(phoneBook.solution(new String[]{"12232332", "12", "222222"})).isEqualTo(false);
    }

    @Test
    public void solution1() {
        PhoneBook phoneBook = new PhoneBook();
        assertThat(phoneBook.solution(new String[]{"911", "97625999", "91125426"})).isEqualTo(false);
    }
    @Test
    public void solution2() {
        PhoneBook phoneBook = new PhoneBook();
        assertThat(phoneBook.solution(new String[]{"113", "12340", "123440", "12345", "98346"})).isEqualTo(true);
    }

    @Test
    public void solution3() {
        PhoneBook phoneBook = new PhoneBook();
        assertThat(phoneBook.solution(new String[]{"12232332", "12", "222222"})).isEqualTo(false);
    }
}