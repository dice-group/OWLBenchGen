package org.dice_group.LPBenchGen.lp;

import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataProperty;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * The type Lp problem.
 *
 * @author Lixi Alié Conrads
 */
public class LPProblem {
    /**
     * The Negatives.
     */
    public Collection<String> negatives = new HashSet<String>();
    /**
     * The Positives.
     */
    public Collection<String> positives = new HashSet<String>();
    /**
     * The Gold standard concept.
     */
    public String goldStandardConcept = "";
    /**
     * The Gold standard concept expr.
     */
    public OWLClassExpression goldStandardConceptExpr;

    /**
     * The Rules.
     */
    public Collection<String> rules;
    /**
     * The Data rules.
     */
    public Collection<OWLDataProperty> dataRules = new HashSet<OWLDataProperty>();
    /**
     * The Negative map.
     */
    public Map<String, OWLClassExpression> negativeMap = new HashMap<String, OWLClassExpression>();
    /**
     * The Negative generated.
     */
    public boolean negativeGenerated=false;

    /**
     * Gold standard concept as expr owl class expression.
     *
     * @return the owl class expression
     */
    public OWLClassExpression goldStandardConceptAsExpr() {
        return goldStandardConceptExpr;
    }

    /**
     * Gets expr.
     *
     * @param nes the nes
     * @return the expr
     */
    public OWLClassExpression getExpr(String nes) {
        return negativeMap.get(nes);
    }
}
