package org.dice_group.LPBenchGen.cleaner;

import org.semanticweb.owlapi.model.OWLClass;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Tree node.
 *
 * @author Lixi Alié Conrads
 */
public class TreeNode {

    /**
     * The Children.
     */
    public List<TreeNode> children = new ArrayList<TreeNode>();
    /**
     * The Repr class.
     */
    public String reprClass;

}
