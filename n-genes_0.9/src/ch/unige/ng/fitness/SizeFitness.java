/*************************************************************************
*
* Copyright (C) 2005 University of Geneva, Switzerland.
*
* This file is part of n-genes
*
* n-genes is free software; you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation; either version 2 of the License, or
* (at your option) any later version.
* 
* n-genes is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with n-genes; if not, write to the Free Software
* Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301  USA
*
* http://cui.unige.ch/spc/tools/n-genes
* n-genes@cui.unige.ch
*
******************************************************************************/


package ch.unige.ng.fitness;

import ch.unige.ng.species.Evaluable;
import ch.unige.ng.tools.Forced;

/**
 * n-genes
 * <p/>
 * This fitness lower the quality of a Fitness depending on the size of the individual
 *
 * @author Jacques Fontignie
 * @version 4 janv. 2005
 */
public class SizeFitness<T> implements Fitness<T> {
    
    private Fitness<T> fitness;

    @Forced public void setFitness(Fitness<T> fitness) {
        this.fitness = fitness;
    }

    public double compute(Evaluable<T> ind) {
        return fitness.compute(ind) + ind.size();
    }

}
