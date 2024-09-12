import java.util.Optional;

public class Java8Optional {
	public static void main(String[] args) {
		
	
String name=null;
Optional<String> nullableame=Optional.ofNullable(name);
String[] words=new String[10];
Optional<String> checkNull=Optional.ofNullable(words[5]);

//@GetMapping("id/{id}")
//public ResponseEntity<?> getallEmployee(@PathVariable int id)
//{
//Optional<Employee> e=employeerepo.finById(id);
//if(e.isPresent())//e.isEmpty()
//{
//	return new ResponseEntity<>(e.get(),HttpStatus.ok);}
//	else
//	{
//		return new ResponseEntity<>("Sorry ot found",HttpStatus.ok);
//	}

//	employeerepo.finById(id).get();
//Optional<String> name=Optional.of(e.get().getName()); will still give nullpointerexception so use ofNullable0
//if(name.isPresent())
//{
//	return new ResponseEntity<>(name.get().toUpperCase(),HttpStatus.ok);}
//}
//	else
//	{
//		return new ResponseEntity<>("Sorry, not found",HttpStatus.NOT_FOUND);}
//	
////name.ifPresent(n -> System.out.println("name is present"+n);
//name.ifPresentOrElse(n -> System.out.println("name is present"+n), () -> System.out.println("Sorry name is not present"+n));
//	}

//}
}
}