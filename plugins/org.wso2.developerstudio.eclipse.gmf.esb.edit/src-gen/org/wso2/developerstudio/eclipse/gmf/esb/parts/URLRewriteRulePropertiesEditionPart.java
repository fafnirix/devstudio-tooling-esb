/**
 * Generated with Acceleo
 */
package org.wso2.developerstudio.eclipse.gmf.esb.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface URLRewriteRulePropertiesEditionPart {



	/**
	 * Init the rewriteRuleAction
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initRewriteRuleAction(ReferencesTableSettings settings);

	/**
	 * Update the rewriteRuleAction
	 * @param newValue the rewriteRuleAction to update
	 * 
	 */
	public void updateRewriteRuleAction();

	/**
	 * Adds the given filter to the rewriteRuleAction edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRewriteRuleAction(ViewerFilter filter);

	/**
	 * Adds the given filter to the rewriteRuleAction edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRewriteRuleAction(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the rewriteRuleAction table
	 * 
	 */
	public boolean isContainedInRewriteRuleActionTable(EObject element);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
