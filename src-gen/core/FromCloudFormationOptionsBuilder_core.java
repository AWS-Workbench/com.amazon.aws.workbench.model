/**
 */
package core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>From Cloud Formation Options Builder core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.FromCloudFormationOptionsBuilder_core#getFinderWithICfnFinder_software_amazon_awscdk_core_ICfnFinder_AsReference <em>Finder With ICfn Finder software amazon awscdk core ICfn Finder As Reference</em>}</li>
 *   <li>{@link core.FromCloudFormationOptionsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.FromCloudFormationOptionsBuilder_core#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.FromCloudFormationOptionsBuilder_core#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.FromCloudFormationOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see core.CorePackage#getFromCloudFormationOptionsBuilder_core()
 * @model
 * @generated
 */
public interface FromCloudFormationOptionsBuilder_core extends EObject {
	/**
	 * Returns the value of the '<em><b>Finder With ICfn Finder software amazon awscdk core ICfn Finder As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finder With ICfn Finder software amazon awscdk core ICfn Finder As Reference</em>' attribute.
	 * @see #setFinderWithICfnFinder_software_amazon_awscdk_core_ICfnFinder_AsReference(String)
	 * @see core.CorePackage#getFromCloudFormationOptionsBuilder_core_FinderWithICfnFinder_software_amazon_awscdk_core_ICfnFinder_AsReference()
	 * @model
	 * @generated
	 */
	String getFinderWithICfnFinder_software_amazon_awscdk_core_ICfnFinder_AsReference();

	/**
	 * Sets the value of the '{@link core.FromCloudFormationOptionsBuilder_core#getFinderWithICfnFinder_software_amazon_awscdk_core_ICfnFinder_AsReference <em>Finder With ICfn Finder software amazon awscdk core ICfn Finder As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finder With ICfn Finder software amazon awscdk core ICfn Finder As Reference</em>' attribute.
	 * @see #getFinderWithICfnFinder_software_amazon_awscdk_core_ICfnFinder_AsReference()
	 * @generated
	 */
	void setFinderWithICfnFinder_software_amazon_awscdk_core_ICfnFinder_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.core.FromCloudFormationOptions"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see core.CorePackage#getFromCloudFormationOptionsBuilder_core_GeneratedClassName()
	 * @model default="software.amazon.awscdk.core.FromCloudFormationOptions" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see core.CorePackage#getFromCloudFormationOptionsBuilder_core_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link core.FromCloudFormationOptionsBuilder_core#getVarName <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Name</em>' attribute.
	 * @see #getVarName()
	 * @generated
	 */
	void setVarName(String value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see core.CorePackage#getFromCloudFormationOptionsBuilder_core_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link core.FromCloudFormationOptionsBuilder_core#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Code</em>' attribute.
	 * @see #setAdditionalCode(String)
	 * @see core.CorePackage#getFromCloudFormationOptionsBuilder_core_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link core.FromCloudFormationOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // FromCloudFormationOptionsBuilder_core
