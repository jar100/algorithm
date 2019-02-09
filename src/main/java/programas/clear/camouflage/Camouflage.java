package programas.clear.camouflage;

import java.util.*;

public class Camouflage {
    public int solution(String[][] clothes) {
        int answer = 1;
        Set<Category> category = new HashSet<>();
        for (String[] clothe : clothes) {
            //카태고리가 없으면 카태고리 생성
            if (!category.contains(new Category(clothe[1]))) {
                category.add(new Category(clothe[1]));
            } else {
                // 있으면 그 카태고리를 찾아 값 증가
                for (Category category1 : category) {
                    category1.add(clothe[1]);
                }
            }
        }

        // 안뽑는 경우의 수를 생각해 +1
        for (Category category1 : category) {
            answer *= (category1.getSize() + 1);
        }
        // 아무것도 안뽑은 경우가 포함된 것 이므로 -1;
        return answer - 1;
    }

    public int solution2(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> list = new HashMap<>();
        for (String[] clothe : clothes) {
            if (!list.containsKey(clothe[1])) {
                list.put(clothe[1],1);
            } else {
                list.put(clothe[1],list.get(clothe[1])+1);
            }
        }

        for (Integer value : list.values()) {
            answer *= (value + 1);
        }
        return answer - 1;
    }

    public class Category {
        private String caegory;
        private int size = 1;

        public Category(String caegory) {
            this.caegory = caegory;
        }

        public void add(String caegory) {
            if (this.caegory.equals(caegory)) {
                size++;
            }
        }

        public int getSize() {
            return size;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Category category = (Category) o;
            return Objects.equals(caegory, category.caegory);
        }

        @Override
        public int hashCode() {
            return Objects.hash(caegory);
        }
    }
}
