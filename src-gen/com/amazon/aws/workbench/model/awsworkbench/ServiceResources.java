/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Resources</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ServiceResources#getParentStack <em>Parent Stack</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getServiceResources()
 * @model abstract="true"
 * @generated
 */
public interface ServiceResources extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Stack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Stack</em>' attribute.
	 * @see #setParentStack(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getServiceResources_ParentStack()
	 * @model
	 * @generated
	 */
	String getParentStack();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ServiceResources#getParentStack <em>Parent Stack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Stack</em>' attribute.
	 * @see #getParentStack()
	 * @generated
	 */
	void setParentStack(String value);

} // ServiceResources
