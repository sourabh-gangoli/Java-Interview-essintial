import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaStreamExamples
{
	public void testReduce(){
		List<String> words = Arrays.asList("GFG", "Geeks", "for",
		                                   "SpringBoot", "HelloWorldOfJava");
		Optional<String> reduce = words.stream().reduce((s, s2) -> s.equals(s2) ? s : s2);
		reduce.ifPresent(System.out::println);
	}
	public void testReduce2(){
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Optional<Integer> reduce = integers.stream().reduce((s, s2) -> s * s2);
		reduce.ifPresent(System.out::println);
	}
	public void testIntRange(){

	}
	public  void testGroupBy(){
		List<String> countryName=Arrays.asList("India","USA","USA","India");
		Map<String, Long> collect = countryName.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		collect.forEach((s, aLong) -> System.out.println(s+"-"+aLong));
	}

	public static void main(String[] args)
	{
		JavaStreamExamples javaStreamExamples=new JavaStreamExamples();
		javaStreamExamples.testReduce();
		javaStreamExamples.testReduce2();
		javaStreamExamples.testGroupBy();
	}
}
