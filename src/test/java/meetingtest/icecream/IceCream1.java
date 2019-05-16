package meetingtest.icecream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class IceCream1 {
    public List<Item> solution(int[] vals) {
        List<Item> items = new ArrayList<>();
        int thisId = -1;
        int itemsLenth = 0;
        int[] array = null;

        for (int val : vals) {
            if (thisId == -1) {
                thisId = val;
            } else if (itemsLenth == 0) {
                itemsLenth = val;
                array = new int[itemsLenth];
            }
            else {
                array[itemsLenth -1] = val;
                itemsLenth --;
            }

            if (array != null && itemsLenth == 0) {
                Item temp;
                if (items.contains(new Item(thisId,array))) {
                   temp = items.get(items.indexOf(new Item(thisId,array)));
                   temp.add(array);
                }else {
                    items.add(new Item(thisId,array));
                }
                thisId = -1;
                array = null;
            }
        }

        System.out.println(items);
        return items;
    }

    private class Item {
        private int id;
        private int[] array;

        public Item(int id, int[] array) {
            this.id = id;
            this.array = array;
        }

        public int sum() {
            return Arrays.stream(array).sum();
        }

        public double average() {
            return (double) Arrays.stream(array).sum()/array.length;
        }

        public void add(int[] array) {
            int[] newArray = new int[this.array.length + array.length + 1];
            int count = 0;
            for (int i : this.array) {
                newArray[count] = i;
                count ++;
            }
            for (int i : array) {
                newArray[count] =i;
                count ++;
            }
            this.array = newArray;
        }


        @Override
        public String toString() {
            return "Item{" +
                    "id=" + id +
                    ", 합" + this.sum() +
                    ", 평균" + this.average() +
                    " }";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Item item = (Item) o;
            return id == item.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }

}
