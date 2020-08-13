/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ServiceResources#getDependsON <em>Depends ON</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getServiceResources()
 * @model abstract="true"
 * @generated
 */
public interface ServiceResources extends EObject {
	/**
	 * Returns the value of the '<em><b>Depends ON</b></em>' reference list.
	 * The list contents are of type {@link com.amazon.aws.workbench.model.awsworkbench.ServiceResources}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends ON</em>' reference list.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getServiceResources_DependsON()
	 * @model
	 * @generated
	 */
	EList<ServiceResources> getDependsON();

} // ServiceResources
