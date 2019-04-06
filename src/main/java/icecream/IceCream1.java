package icecream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
                items.add(new Item(thisId,array));
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

        public int average() {
            return Arrays.stream(array).sum()/array.length;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "id=" + id +
                    ", 합" + this.sum() +
                    ", 평균" + this.average() +
                    " }";
        }
    }

}
