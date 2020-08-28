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
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ServiceResources#isExportResource <em>Export Resource</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ServiceResources#getImportExistingResource <em>Import Existing Resource</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Export Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Export Resource</em>' attribute.
	 * @see #setExportResource(boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getServiceResources_ExportResource()
	 * @model
	 * @generated
	 */
	boolean isExportResource();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ServiceResources#isExportResource <em>Export Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Export Resource</em>' attribute.
	 * @see #isExportResource()
	 * @generated
	 */
	void setExportResource(boolean value);

	/**
	 * Returns the value of the '<em><b>Import Existing Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Existing Resource</em>' attribute.
	 * @see #setImportExistingResource(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getServiceResources_ImportExistingResource()
	 * @model
	 * @generated
	 */
	String getImportExistingResource();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ServiceResources#getImportExistingResource <em>Import Existing Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Existing Resource</em>' attribute.
	 * @see #getImportExistingResource()
	 * @generated
	 */
	void setImportExistingResource(String value);

} // ServiceResources
