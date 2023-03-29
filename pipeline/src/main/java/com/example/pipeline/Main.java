package com.example.pipeline;

/**
 * The Pipeline pattern uses ordered stages to process a sequence of input values. Each implemented
 * task is represented by a stage of the pipeline. You can think of pipelines as similar to assembly
 * lines in a factory, where each item in the assembly line is constructed in stages. The partially
 * assembled item is passed from one assembly stage to another. The outputs of the assembly line
 * occur in the same order as that of the inputs.
 *
 * <p>Classes used in this example are suffixed with "Handlers", and synonymously refers to the
 * "stage".
 */
public class Main {
    /**
     * Specify the initial input type for the first stage handler and the expected output type of the
     * last stage handler as type parameters for Pipeline. Use the fluent builder by calling
     * addHandler to add more stage handlers on the pipeline.
     */
    public static void main(String[] args) {
        var filters = new Pipeline<>(new Sum())
                .addHandler(new Multiply())
                .addHandler(new Divide());
        filters.execute(100);
    }
}
