/**
 */
package iam;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>From Role Arn Options Builder iam</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iam.FromRoleArnOptionsBuilder_iam#getMutable_java_lang_Boolean_ <em>Mutable java lang Boolean </em>}</li>
 *   <li>{@link iam.FromRoleArnOptionsBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link iam.FromRoleArnOptionsBuilder_iam#getVarName <em>Var Name</em>}</li>
 *   <li>{@link iam.FromRoleArnOptionsBuilder_iam#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link iam.FromRoleArnOptionsBuilder_iam#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see iam.IamPackage#getFromRoleArnOptionsBuilder_iam()
 * @model
 * @generated
 */
public interface FromRoleArnOptionsBuilder_iam extends EObject {
	/**
	 * Returns the value of the '<em><b>Mutable java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mutable java lang Boolean </em>' attribute.
	 * @see #setMutable_java_lang_Boolean_(Boolean)
	 * @see iam.IamPackage#getFromRoleArnOptionsBuilder_iam_Mutable_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getMutable_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link iam.FromRoleArnOptionsBuilder_iam#getMutable_java_lang_Boolean_ <em>Mutable java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mutable java lang Boolean </em>' attribute.
	 * @see #getMutable_java_lang_Boolean_()
	 * @generated
	 */
	void setMutable_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.iam.FromRoleArnOptions"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see iam.IamPackage#getFromRoleArnOptionsBuilder_iam_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.iam.FromRoleArnOptions" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see iam.IamPackage#getFromRoleArnOptionsBuilder_iam_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link iam.FromRoleArnOptionsBuilder_iam#getVarName <em>Var Name</em>}' attribute.
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
	 * @see iam.IamPackage#getFromRoleArnOptionsBuilder_iam_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link iam.FromRoleArnOptionsBuilder_iam#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see iam.IamPackage#getFromRoleArnOptionsBuilder_iam_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link iam.FromRoleArnOptionsBuilder_iam#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // FromRoleArnOptionsBuilder_iam
