package programas.bestalbum;

import java.util.*;

public class BestAlbum {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        Map<String, Genres> rank = new HashMap<>();
/*
        List<Genres> genresList = new ArrayList<>();
        for (int i = 0; i < genres.length; i++) {
            if (!genresList.contains(new Genres(genres[i]))) {
                genresList.add(new Genres(genres[i]));
            }
        }*/




        //맵을 사용 프라이머리벨류를 사용
        //클래스를 만드는게 날듯
        for (int i = 0; i < genres.length; i++) {
            if (!rank.containsKey(genres[i])) {
                rank.put(genres[i],new Genres());
                rank.get(genres[i]).add(new Song(i,plays[i]));
            } else {
                rank.get(genres[i]).add(new Song(i,plays[i]));
            }
        }

        
        return answer;
    }

    public class Genres implements Comparable<Genres> {
        private String genres;

        private PriorityQueue<Song> list = new PriorityQueue<>(Song::compareTo);

        public Genres() {
        }

        public Genres(String genres) {
            this.genres = genres;
        }

        public void add(Song song) {
            list.offer(song);
        }

        public int sumAll() {
           return list.stream().mapToInt(value -> value.plays).sum();
        }

        @Override
        public int compareTo(Genres o) {
            if (this.sumAll() > o.sumAll()) {
                return 1;
            } else if (this.sumAll() < o.sumAll()) {
                return -1;
            }
            return 0;
        }
    }

    public class Song implements Comparable<Song>{
        private int index;
        private int plays;

        public Song(int index, int plays) {
            this.index = index;
            this.plays = plays;
        }

        @Override
        public int compareTo(Song o) {
            if (this.plays > o.plays) {
                return 1;
            } else if (this.plays < o.plays) {
                return -1;
            }
            return 0;
        }
    }
}
