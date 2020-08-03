/**
 */
package core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Removal Policy Options Builder core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.RemovalPolicyOptionsBuilder_core#getApplyToUpdateReplacePolicy_java_lang_Boolean_ <em>Apply To Update Replace Policy java lang Boolean </em>}</li>
 *   <li>{@link core.RemovalPolicyOptionsBuilder_core#getDefaultValue_software_amazon_awscdk_core_RemovalPolicy_ <em>Default Value software amazon awscdk core Removal Policy </em>}</li>
 *   <li>{@link core.RemovalPolicyOptionsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.RemovalPolicyOptionsBuilder_core#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.RemovalPolicyOptionsBuilder_core#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.RemovalPolicyOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see core.CorePackage#getRemovalPolicyOptionsBuilder_core()
 * @model
 * @generated
 */
public interface RemovalPolicyOptionsBuilder_core extends EObject {
	/**
	 * Returns the value of the '<em><b>Apply To Update Replace Policy java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply To Update Replace Policy java lang Boolean </em>' attribute.
	 * @see #setApplyToUpdateReplacePolicy_java_lang_Boolean_(Boolean)
	 * @see core.CorePackage#getRemovalPolicyOptionsBuilder_core_ApplyToUpdateReplacePolicy_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getApplyToUpdateReplacePolicy_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link core.RemovalPolicyOptionsBuilder_core#getApplyToUpdateReplacePolicy_java_lang_Boolean_ <em>Apply To Update Replace Policy java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply To Update Replace Policy java lang Boolean </em>' attribute.
	 * @see #getApplyToUpdateReplacePolicy_java_lang_Boolean_()
	 * @generated
	 */
	void setApplyToUpdateReplacePolicy_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Default Value software amazon awscdk core Removal Policy </b></em>' attribute.
	 * The literals are from the enumeration {@link core.RemovalPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value software amazon awscdk core Removal Policy </em>' attribute.
	 * @see core.RemovalPolicy
	 * @see #setDefaultValue_software_amazon_awscdk_core_RemovalPolicy_(RemovalPolicy)
	 * @see core.CorePackage#getRemovalPolicyOptionsBuilder_core_DefaultValue_software_amazon_awscdk_core_RemovalPolicy_()
	 * @model dataType="core.RemovalPolicy"
	 * @generated
	 */
	RemovalPolicy getDefaultValue_software_amazon_awscdk_core_RemovalPolicy_();

	/**
	 * Sets the value of the '{@link core.RemovalPolicyOptionsBuilder_core#getDefaultValue_software_amazon_awscdk_core_RemovalPolicy_ <em>Default Value software amazon awscdk core Removal Policy </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value software amazon awscdk core Removal Policy </em>' attribute.
	 * @see core.RemovalPolicy
	 * @see #getDefaultValue_software_amazon_awscdk_core_RemovalPolicy_()
	 * @generated
	 */
	void setDefaultValue_software_amazon_awscdk_core_RemovalPolicy_(RemovalPolicy value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.core.RemovalPolicyOptions"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see core.CorePackage#getRemovalPolicyOptionsBuilder_core_GeneratedClassName()
	 * @model default="software.amazon.awscdk.core.RemovalPolicyOptions" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see core.CorePackage#getRemovalPolicyOptionsBuilder_core_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link core.RemovalPolicyOptionsBuilder_core#getVarName <em>Var Name</em>}' attribute.
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
	 * @see core.CorePackage#getRemovalPolicyOptionsBuilder_core_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link core.RemovalPolicyOptionsBuilder_core#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see core.CorePackage#getRemovalPolicyOptionsBuilder_core_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link core.RemovalPolicyOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // RemovalPolicyOptionsBuilder_core
