package study.javainaction;

@FunctionalInterface
public interface MyInterface {
    int add();
    default int delete(Integer a) {
     return 3;
    }
}
