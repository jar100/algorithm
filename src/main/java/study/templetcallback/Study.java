package study.templetcallback;

public class Study {
    public void runContext(String subject) {
        System.out.println("공부하자.");
        // 템플릿 패턴으로 틀을 먼저 만들어 둔다.
        runSubject(subject).runStrategy();
        System.out.println("집에가자.");
    }


    // 콜백 패턴 부분
    private Strategy runSubject(String subject) {
        return new Strategy(){
            @Override
            public void runStrategy() {
                System.out.println(subject + "공부해하자.");
            }
        };
    }
}
