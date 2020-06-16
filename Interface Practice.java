package practice;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Md Redwanuzzaman
 */
 
public interface SummationService {

    void addNew(int num);

    int findSum();
}



public class SimpleSum implements SummationService {

    private int sum;

    SimpleSum() {
        sum = 0;
    }

    @Override
    public void addNew(final int num) {
        sum = sum + num;
    }

    @Override
    public int findSum() {
        return sum;
    }
}



public class UniqueSum implements SummationService {

  private Set<Integer> uniqueNumbers;
  private int sum;

  UniqueSum() {
    this.uniqueNumbers = new HashSet<>();
    sum = 0;
  }

  @Override
  public void addNew(final int num) {
    if (!uniqueNumbers.contains(num)) {
      uniqueNumbers.add(num);
      sum += num;
    }
  }

  @Override
  public int findSum() {
    return sum;
  }
}



public class ExampleUsage {

  public static void main(String[] args) {
    final SummationService simpleSummationService = new SimpleSum();
    final SummationService uniqueSummationService = new UniqueSum();

    simpleSummationService.addNew(10);
    simpleSummationService.addNew(10);
    simpleSummationService.addNew(20);
    System.out.println(simpleSummationService.findSum());

    uniqueSummationService.addNew(10);
    uniqueSummationService.addNew(10);
    uniqueSummationService.addNew(20);
    System.out.println(uniqueSummationService.findSum());
  }
}

// Simple Sum = 40
// Unique Sum = 30
