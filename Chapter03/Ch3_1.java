import io.reactivex.Observable;

public class Ch3_1 {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma")
                .filter(s -> s.length() != 5)
                .subscribe(s -> System.out.println("RECEIVED: " + s));
    }
}