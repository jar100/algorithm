package study.javainaction;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.function.Supplier;

public class CompletableFutureTest {

    @Test
    void name() {

        Supplier<String> A = () -> {
            try {
                System.out.println("A 스레드 작업 시작");
                Thread.sleep(2000);
                System.out.println("A 스레드 작업 완료");
                return "A 실행";
            } catch (InterruptedException e){
                e.printStackTrace();
                return "실패";
            }
        };

        Supplier<String> C = () -> {
            try {
                System.out.println("C 스레드 작업 시작");
                Thread.sleep(500);
                System.out.println("C 스레드 작업 완료");
                return "C 실행";
            } catch (InterruptedException e){
                e.printStackTrace();
                return "실패";
            }
        };

        CompletableFuture<String> result2 = CompletableFuture.
                supplyAsync(A).
                thenApply(aResult -> aResult + " A 성공 -> ").
                thenCombine(CompletableFuture.supplyAsync(C), (a, c) -> a + c);

        System.out.println("결과");
        System.out.println(result2.join());

    }

    @Test
    void name2() {

        Supplier<String> A = () -> {
            try {
                System.out.println("A 스레드 작업 시작");
                Thread.sleep(2000);
                System.out.println("A 스레드 작업 완료");
                return "A 실행";
            } catch (InterruptedException e){
                e.printStackTrace();
                return "실패";
            }
        };

        Supplier<String> C = () -> {
            try {
                System.out.println("C 스레드 작업 시작");
                Thread.sleep(500);
                System.out.println("C 스레드 작업 완료");
                return "C 실행";
            } catch (InterruptedException e){
                e.printStackTrace();
                return "실패";
            }
        };

        CompletableFuture<String> result2 = CompletableFuture.
                supplyAsync(A).
                thenCompose(result -> CompletableFuture.supplyAsync( () -> {
                    try {
                        System.out.println(result +"2 스레드 작업 시작");
                        Thread.sleep(5000);
                        System.out.println(result + "2 스레드 작업 완료");
                        return result + " 2실행!!    ";
                    } catch (InterruptedException e){
                        e.printStackTrace();
                        return "실패";
                    }
                }
                )).
                thenCombine(CompletableFuture.supplyAsync(C), (a, c) -> a + c);

        System.out.println("결과");
        System.out.println(result2.join());

    }

}
