package study.collections.maps;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MapsTest {


    @Test
    public void linkedHashMap() {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();


    }


    @Test
    public void hashMap() {
        HashMap<Integer, String> map = new HashMap<>();

    }


    @Test
    public void weakHashMap() {
        WeakHashMap<Integer, String> map = new WeakHashMap<>();
        // 메모리가 남아도 gc 의 대상이 된다.
        HashMap<Integer, String> map1 = new HashMap<>();

        Integer key1 = 1000;
        Integer key2 = 2000;
        Integer key3 = 3000;
        Integer key4 = 4000;

        map.put(key1, "test a");
        map.put(key2, "test b");


        map1.put(key3, "test a");
        map1.put(key4, "test b");

        key1 = null;
        key3 = null;
        key4 = null;
        System.gc();  //강제 Garbage Collection
        System.out.println(map1.toString());
        System.out.println(map.toString());
    }

    @Test
    public void weakHashMapWithString() {
        WeakHashMap<String, String> map = new WeakHashMap<>();
        // 메모리가 남아도 gc 의 대상이 된다.

        // 힙영역에 존
        String key1 = new String("1000");
        // 리터럴에의해 생성
        String key2 = "2000";

        map.put(key1, "test a");
        map.put(key2, "test b");

        key1 = null;
        key2 = null;
        System.gc();  //강제 Garbage Collection
        System.out.println(map.toString());
    }

    @Test
    public void identityHashMap() {

        CreditCard visa = new CreditCard("VISA", "04/12/2019");
        CreditCard master = new CreditCard("Master", "04/11/2020");
        CreditCard amex = new CreditCard("American Express", "04/10/2021");

        Map<CreditCard, String> cardToExpiry = new HashMap<>();
        Map<CreditCard, String> cardToExpiryIdentity = new IdentityHashMap<>();

        // inserting objects to HashMap
        cardToExpiry.put(visa, visa.getExpiryDate());
        cardToExpiry.put(master, master.getExpiryDate());
        cardToExpiry.put(amex, amex.getExpiryDate());

        // inserting objects to IdentityHashMap
        cardToExpiryIdentity.put(visa, visa.getExpiryDate());
        cardToExpiryIdentity.put(master, master.getExpiryDate());
        cardToExpiryIdentity.put(amex, amex.getExpiryDate());

        //before modifying keys;
        System.out.println(cardToExpiry);
        assertThat(cardToExpiry.get(visa)).isNotNull();

        System.out.println(cardToExpiryIdentity);
        assertThat(cardToExpiryIdentity.get(visa)).isNotNull();

        // modifying value object
        visa.setExpiryDate("02/11/2030");
        System.out.println(visa.toString());


        //after modifying keys
        System.out.println(cardToExpiry);
        assertThat(cardToExpiry.get(visa)).isNull();

        System.out.println(cardToExpiryIdentity);
        assertThat(cardToExpiryIdentity.get(visa)).isNotNull();
    }

    @Test
    public void name33() {
        Set<Integer> b = new HashSet<>(Arrays.asList(1,2,3,4));
        Set<Integer> a = Collections.singleton(3);


        List<Integer> c = Collections.singletonList(3);
        //c.set(0,5);
       // a.add(3);

        System.out.println(a);
    }

}

class CreditCard {
    private String issuer;
    private String expiryDate;


    public CreditCard(String issuer, String expiryDate) {
        this.issuer = issuer;
        this.expiryDate = expiryDate;
    }


    public String getIssuer() {
        return issuer;
    }


    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiry) {
        this.expiryDate = expiry;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((expiryDate == null) ? 0 : expiryDate.hashCode());
        result = prime * result + ((issuer == null) ? 0 : issuer.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CreditCard other = (CreditCard) obj;
        if (expiryDate == null) {
            if (other.expiryDate != null)
                return false;
        } else if (!expiryDate.equals(other.expiryDate))
            return false;
        if (issuer == null) {
            if (other.issuer != null)
                return false;
        } else if (!issuer.equals(other.issuer))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "issuer='" + issuer + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                '}';
    }


}
