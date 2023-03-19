package pipeline;

public class Divide implements Handler<Integer, Integer> {

    @Override
    public Integer process(Integer input) {
        var resultDividing = input / 2;
        System.out.printf("Result of dividing %s to 2 is %s; \n", input, resultDividing);
        return resultDividing;
    }
}
