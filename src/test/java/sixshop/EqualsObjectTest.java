package sixshop;

import org.junit.Test;

import java.util.Objects;

import static org.assertj.core.api.Java6Assertions.assertThat;


public class EqualsObjectTest {
    class EqualsObject {
        private int a;

        public EqualsObject(int a) {
            this.a = a;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            EqualsObject that = (EqualsObject) o;
            return a == that.a;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a);
        }
    }

    @Test
    public void 동일성() {
        int a = 7;
        int b = 7;
        System.out.println(Objects.hash(a));
        System.out.println(Objects.hash(b));
        assertThat(a == b).isTrue();
    }

    @Test
    public void 객체동일성비교() {
        EqualsObject a = new EqualsObject(1);
        EqualsObject b = new EqualsObject(1);
        System.out.println(a);
        System.out.println(b);
        assertThat(a == b).isFalse();
    }

    @Test
    public void 동등성() {
        EqualsObject a = new EqualsObject(1);
        EqualsObject b = new EqualsObject(1);
        assertThat(a.equals(b)).isTrue();
    }
}