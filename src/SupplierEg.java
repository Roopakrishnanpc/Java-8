import java.util.Date;
import java.util.function.Supplier;

public class SupplierEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Supplier<Date> currentDate=() -> new Date();
//no ip just return time is Date
System.out.println(currentDate.get());

//No Chaning
//No BiSupplier
	}

}
