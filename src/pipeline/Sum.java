package pipeline;

public class Sum implements Handler<Integer, Integer> {
    @Override
    public Integer process(Integer input) {
        var resultSum = input + input;
        System.out.printf("Result of summing %s is %s; \n", input, resultSum);
        return resultSum;
    }
}
