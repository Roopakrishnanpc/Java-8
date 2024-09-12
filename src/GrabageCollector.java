
public class GrabageCollector {
	GrabageCollector gc2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrabageCollector gc=new GrabageCollector();
		GrabageCollector gc1=new GrabageCollector();
		//gc=null;//norml way
		//gc=gc1;//reference of gc is created in another memory of gc1 object
		//island of isolation
		gc.gc2=gc1;
		gc1.gc2=gc;
		gc=null;
		gc1=null;
		gc=gc1;
		System.gc();
		
		Runtime.getRuntime().gc();
		System.out.println("Main method is done");
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("finalize method is done");
	}

}
