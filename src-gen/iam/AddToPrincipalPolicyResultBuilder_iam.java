/**
 */
package iam;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add To Principal Policy Result Builder iam</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iam.AddToPrincipalPolicyResultBuilder_iam#getStatementAdded_java_lang_Boolean_ <em>Statement Added java lang Boolean </em>}</li>
 *   <li>{@link iam.AddToPrincipalPolicyResultBuilder_iam#getPolicyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference <em>Policy Dependable With IDependable software amazon awscdk core IDependable As Reference</em>}</li>
 *   <li>{@link iam.AddToPrincipalPolicyResultBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link iam.AddToPrincipalPolicyResultBuilder_iam#getVarName <em>Var Name</em>}</li>
 *   <li>{@link iam.AddToPrincipalPolicyResultBuilder_iam#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link iam.AddToPrincipalPolicyResultBuilder_iam#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see iam.IamPackage#getAddToPrincipalPolicyResultBuilder_iam()
 * @model
 * @generated
 */
public interface AddToPrincipalPolicyResultBuilder_iam extends EObject {
	/**
	 * Returns the value of the '<em><b>Statement Added java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement Added java lang Boolean </em>' attribute.
	 * @see #setStatementAdded_java_lang_Boolean_(Boolean)
	 * @see iam.IamPackage#getAddToPrincipalPolicyResultBuilder_iam_StatementAdded_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getStatementAdded_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link iam.AddToPrincipalPolicyResultBuilder_iam#getStatementAdded_java_lang_Boolean_ <em>Statement Added java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement Added java lang Boolean </em>' attribute.
	 * @see #getStatementAdded_java_lang_Boolean_()
	 * @generated
	 */
	void setStatementAdded_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Policy Dependable With IDependable software amazon awscdk core IDependable As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Dependable With IDependable software amazon awscdk core IDependable As Reference</em>' attribute.
	 * @see #setPolicyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference(String)
	 * @see iam.IamPackage#getAddToPrincipalPolicyResultBuilder_iam_PolicyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference()
	 * @model
	 * @generated
	 */
	String getPolicyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference();

	/**
	 * Sets the value of the '{@link iam.AddToPrincipalPolicyResultBuilder_iam#getPolicyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference <em>Policy Dependable With IDependable software amazon awscdk core IDependable As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Dependable With IDependable software amazon awscdk core IDependable As Reference</em>' attribute.
	 * @see #getPolicyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference()
	 * @generated
	 */
	void setPolicyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.iam.AddToPrincipalPolicyResult"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see iam.IamPackage#getAddToPrincipalPolicyResultBuilder_iam_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.iam.AddToPrincipalPolicyResult" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see iam.IamPackage#getAddToPrincipalPolicyResultBuilder_iam_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link iam.AddToPrincipalPolicyResultBuilder_iam#getVarName <em>Var Name</em>}' attribute.
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
	 * @see iam.IamPackage#getAddToPrincipalPolicyResultBuilder_iam_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link iam.AddToPrincipalPolicyResultBuilder_iam#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see iam.IamPackage#getAddToPrincipalPolicyResultBuilder_iam_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link iam.AddToPrincipalPolicyResultBuilder_iam#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // AddToPrincipalPolicyResultBuilder_iam
