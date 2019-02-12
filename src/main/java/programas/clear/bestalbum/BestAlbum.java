package programas.clear.bestalbum;

import java.util.*;

public class BestAlbum {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<>();

        List<Genres> genresList = new ArrayList<>();
        for (int i = 0; i < genres.length; i++) {
            if (!genresList.contains(new Genres(genres[i]))) {
                genresList.add(new Genres(genres[i]));
                genresList.get(genresList.indexOf(new Genres(genres[i]))).add(new Song(i,plays[i]));
            } else {
                genresList.get(genresList.indexOf(new Genres(genres[i]))).add(new Song(i,plays[i]));
            }
        }
        genresList.sort(Genres::compareTo);

        for (Genres genres1 : genresList) {
            genres1.answerAdd(answerList);
        }

        answer = answerList.stream().mapToInt(i->i).toArray();
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

        public void answerAdd(List<Integer> answers) {
            if (list.size() == 1) {
                answers.add(list.poll().index);
            } else {
                answers.add(list.poll().index);
                answers.add(list.poll().index);
            }
        }

        @Override
        public int compareTo(Genres o) {
            if (this.sumAll() < o.sumAll()) {
                return 1;
            } else if (this.sumAll() > o.sumAll()) {
                return -1;
            }
            return 0;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Genres genres1 = (Genres) o;
            return Objects.equals(genres, genres1.genres);
        }

        @Override
        public int hashCode() {
            return Objects.hash(genres);
        }

        @Override
        public String toString() {
            return "Genres{" +
                    "genres='" + genres + '\'' +
                    '}';
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
            if (this.plays < o.plays) {
                return 1;
            } else if (this.plays > o.plays) {
                return -1;
            }
            return 0;
        }
    }
}
