package test;

import ch.unige.ng.fitness.Fitness;
import ch.unige.ng.species.Evaluable;

/**
 * Created by aldazj on 26.12.14.
 */
public class MaxOneFit implements Fitness<Boolean>{

    @Override
    public double compute(Evaluable<Boolean> individual) {
        double falsePositions=0;
        for( Boolean b: individual ) {
            if (!b) {
                falsePositions++;
            }
        }
        return falsePositions / individual.size();
    }
}
