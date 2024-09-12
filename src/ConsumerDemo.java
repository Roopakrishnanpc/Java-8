import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> consumer=s -> System.out.println( s*s);
		consumer.accept(10);//return type void
		Consumer<Integer> consumer1=s -> System.out.println( s*2);
		consumer1.accept(10);//return type void
		consumer.andThen(consumer1).accept(30);
		//compose is there in consumer compile time error
		BiConsumer<String,Integer> biConsumer=(s,i) -> System.out.println(s.length()*i);
		biConsumer.accept("hey", 10);
	}

}
