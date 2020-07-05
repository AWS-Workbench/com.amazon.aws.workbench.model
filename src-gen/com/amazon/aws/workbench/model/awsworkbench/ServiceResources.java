/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import java.util.Map;
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
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ServiceResources#getMapstype <em>Mapstype</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getServiceResources()
 * @model abstract="true"
 * @generated
 */
public interface ServiceResources extends EObject {

	/**
	 * Returns the value of the '<em><b>Mapstype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapstype</em>' attribute.
	 * @see #setMapstype(Map)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getServiceResources_Mapstype()
	 * @model transient="true"
	 * @generated
	 */
	Map<String, String> getMapstype();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ServiceResources#getMapstype <em>Mapstype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapstype</em>' attribute.
	 * @see #getMapstype()
	 * @generated
	 */
	void setMapstype(Map<String, String> value);

} // ServiceResources
