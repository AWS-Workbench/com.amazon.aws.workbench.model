/**
 */
package core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency Builder core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.DependencyBuilder_core#getSourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference <em>Source With IConstruct software amazon awscdk core IConstruct As Reference</em>}</li>
 *   <li>{@link core.DependencyBuilder_core#getTargetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference <em>Target With IConstruct software amazon awscdk core IConstruct As Reference</em>}</li>
 *   <li>{@link core.DependencyBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.DependencyBuilder_core#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.DependencyBuilder_core#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.DependencyBuilder_core#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see core.CorePackage#getDependencyBuilder_core()
 * @model
 * @generated
 */
public interface DependencyBuilder_core extends EObject {
	/**
	 * Returns the value of the '<em><b>Source With IConstruct software amazon awscdk core IConstruct As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source With IConstruct software amazon awscdk core IConstruct As Reference</em>' attribute.
	 * @see #setSourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference(String)
	 * @see core.CorePackage#getDependencyBuilder_core_SourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference()
	 * @model
	 * @generated
	 */
	String getSourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference();

	/**
	 * Sets the value of the '{@link core.DependencyBuilder_core#getSourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference <em>Source With IConstruct software amazon awscdk core IConstruct As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source With IConstruct software amazon awscdk core IConstruct As Reference</em>' attribute.
	 * @see #getSourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference()
	 * @generated
	 */
	void setSourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Target With IConstruct software amazon awscdk core IConstruct As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target With IConstruct software amazon awscdk core IConstruct As Reference</em>' attribute.
	 * @see #setTargetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference(String)
	 * @see core.CorePackage#getDependencyBuilder_core_TargetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference()
	 * @model
	 * @generated
	 */
	String getTargetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference();

	/**
	 * Sets the value of the '{@link core.DependencyBuilder_core#getTargetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference <em>Target With IConstruct software amazon awscdk core IConstruct As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target With IConstruct software amazon awscdk core IConstruct As Reference</em>' attribute.
	 * @see #getTargetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference()
	 * @generated
	 */
	void setTargetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.core.Dependency"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see core.CorePackage#getDependencyBuilder_core_GeneratedClassName()
	 * @model default="software.amazon.awscdk.core.Dependency" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see core.CorePackage#getDependencyBuilder_core_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link core.DependencyBuilder_core#getVarName <em>Var Name</em>}' attribute.
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
	 * @see core.CorePackage#getDependencyBuilder_core_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link core.DependencyBuilder_core#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see core.CorePackage#getDependencyBuilder_core_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link core.DependencyBuilder_core#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // DependencyBuilder_core
