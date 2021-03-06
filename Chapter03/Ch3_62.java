import io.reactivex.Observable;
import java.util.concurrent.TimeUnit;
public class Ch3_62 {
    public static void main(String[] args) {
        Observable.just("One", "Two", "Three")
                .timestamp(TimeUnit.SECONDS)
                .subscribe(i -> System.out.println("Received: " + i.time() + " " + i.unit() + " " + i.value()));
    }
}