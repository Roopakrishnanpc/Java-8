
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class EmployerrProcess {
    private int id;
    private String name;

    // Constructor
    public EmployerrProcess(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployerrProcess that = (EmployerrProcess) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
    @Override
    public String toString() {
        return "EmployerrProcess{id=" + id + ", name='" + name + "'}";
    }
}

public class StreamProcessTwoListEg {

    public static void main(String[] args) {
        // Creating two lists of EmployerrProcess objects
        List<EmployerrProcess> emp = new ArrayList<>();
        emp.add(new EmployerrProcess(1, "Roopa"));
        emp.add(new EmployerrProcess(2, "John"));
        emp.add(new EmployerrProcess(3, "Alice"));
        emp.add(new EmployerrProcess(4, "Roopa"));

        List<EmployerrProcess> emp1 = new ArrayList<>();
        emp1.add(new EmployerrProcess(1, "Roopa"));
        emp1.add(new EmployerrProcess(2, "John"));
        emp1.add(new EmployerrProcess(3, "Alice"));
        emp1.add(new EmployerrProcess(4, "Sam"));
        Stream<EmployerrProcess> combinedStream = Stream.concat(emp.stream(), emp1.stream());

        // Find the minimum element by ID in the combined stream
        Optional<EmployerrProcess> minCombined = combinedStream
            .min(Comparator.comparingInt(EmployerrProcess::getId));

        // Find the maximum element by ID in the combined stream
        combinedStream = Stream.concat(emp.stream(), emp1.stream()); // Recreate the stream since streams are finite
        Optional<EmployerrProcess> maxCombined = combinedStream
            .max(Comparator.comparingInt(EmployerrProcess::getId));

        // Print the results
        System.out.println("Minimum in combined stream: " + minCombined.orElse(null));
        System.out.println("Maximum in combined stream: " + maxCombined.orElse(null));

        // Sorted combined stream
        System.out.println("Sorted combined stream by name:");
        Stream.concat(emp.stream(), emp1.stream())
            .sorted(Comparator.comparing(EmployerrProcess::getName))
            .forEach(System.out::println);

        // Count elements in the combined stream
        long countCombined = Stream.concat(emp.stream(), emp1.stream()).count();
        System.out.println("Count of elements in the combined stream: " + countCombined);

        // Collect names from the combined stream into a list
        List<String> combinedNames = Stream.concat(emp.stream(), emp1.stream())
            .map(EmployerrProcess::getName)
            .collect(Collectors.toList());
        System.out.println("Names in combined stream:");
        combinedNames.forEach(System.out::println);
        
        Optional<EmployerrProcess> minEmp = emp.stream()
                .min(Comparator.comparingInt(EmployerrProcess::getId));
            Optional<EmployerrProcess> maxEmp = emp.stream()
                .max(Comparator.comparingInt(EmployerrProcess::getId));

            // Print min and max
            System.out.println("Minimum in emp: " + minEmp.orElse(null));
            System.out.println("Maximum in emp: " + maxEmp.orElse(null));

            // sorted
            System.out.println("Sorted emp by name:");
            emp.stream()
                .sorted(Comparator.comparing(EmployerrProcess::getName))
                .forEach(System.out::println);

            // forEach and count
            System.out.println("Count of elements in emp:");
            long countEmp = emp.stream().count();
            System.out.println(countEmp);

            System.out.println("Elements in emp:");
            emp.stream().forEach(System.out::println);

            // of() (creating a stream from specific elements)
            System.out.println("Stream created with Stream.of:");
            Stream.of(new EmployerrProcess(5, "Mike"), new EmployerrProcess(6, "Sara"))
                .forEach(System.out::println);

            // toArray
            System.out.println("Array from emp:");
            EmployerrProcess[] empArray = emp.stream().toArray(EmployerrProcess[]::new);
            for (EmployerrProcess e : empArray) {
                System.out.println(e);
            }

            // collect
            System.out.println("Collect emp into a list of names:");
            List<String> names = emp.stream()
                .map(EmployerrProcess::getName)
                .collect(Collectors.toList());
            names.forEach(System.out::println);

            // Examples for emp1
            System.out.println("Processing emp1:");

            // min and max
            Optional<EmployerrProcess> minEmp1 = emp1.stream()
                .min(Comparator.comparingInt(EmployerrProcess::getId));
            Optional<EmployerrProcess> maxEmp1 = emp1.stream()
                .max(Comparator.comparingInt(EmployerrProcess::getId));

            // Print min and max
            System.out.println("Minimum in emp1: " + minEmp1.orElse(null));
            System.out.println("Maximum in emp1: " + maxEmp1.orElse(null));

            // sorted
            System.out.println("Sorted emp1 by name:");
            emp1.stream()
                .sorted(Comparator.comparing(EmployerrProcess::getName))
                .forEach(System.out::println);

            // forEach and count
            System.out.println("Count of elements in emp1:");
            long countEmp1 = emp1.stream().count();
            System.out.println(countEmp1);

            System.out.println("Elements in emp1:");
            emp1.stream().forEach(System.out::println);

            // of() (creating a stream from specific elements)
            System.out.println("Stream created with Stream.of for emp1:");
            Stream.of(new EmployerrProcess(7, "Leo"), new EmployerrProcess(8, "Nina"))
                .forEach(System.out::println);

            // toArray
            System.out.println("Array from emp1:");
            EmployerrProcess[] emp1Array = emp1.stream().toArray(EmployerrProcess[]::new);
            for (EmployerrProcess e : emp1Array) {
                System.out.println(e);
            }

            // collect
            System.out.println("Collect emp1 into a list of names:");
            List<String> names1 = emp1.stream()
                .map(EmployerrProcess::getName)
                .collect(Collectors.toList());
            names1.forEach(System.out::println);
            boolean listsEqual = areListsEqual(emp, emp1);

            System.out.println("Lists equal: " + listsEqual);
        }

        public static boolean areListsEqual(List<EmployerrProcess> emp, List<EmployerrProcess> emp1) {
            if (emp.size() != emp1.size()) {
                return false;
            }

            // Check for differences using streams


            boolean listsEqual = !IntStream.range(0, emp.size())
                    .anyMatch(i -> !emp.get(i).equals(emp1.get(i)));

if (!listsEqual) {
// Find and print differences
IntStream.range(0, emp.size())
  .filter(i -> !emp.get(i).equals(emp1.get(i)))
  .forEach(i -> {
      System.out.println("Difference at index " + i + ":");
      System.out.println("List 1: " + emp.get(i));
      System.out.println("List 2: " + emp1.get(i));
  });
}
            boolean listsEqual1 = !IntStream.range(0, emp.size())
                    .anyMatch(i -> {
                        boolean isEqual = emp.get(i).equals(emp1.get(i));
                        if (!isEqual) {
                            System.out.println("Difference at index " + i + ":");
                            System.out.println("List 1: " + emp.get(i));
                            System.out.println("List 2: " + emp1.get(i));
                        }
                        return !isEqual;
                    });

            

            return listsEqual;
            
            
        }
        // min and max
        
    }

