/**
 */
package iam;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Common Grant Options Builder iam</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iam.CommonGrantOptionsBuilder_iam#getActions_java_lang_String_AsList <em>Actions java lang String As List</em>}</li>
 *   <li>{@link iam.CommonGrantOptionsBuilder_iam#getGranteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference <em>Grantee With IGrantable software amazon awscdk services iam IGrantable As Reference</em>}</li>
 *   <li>{@link iam.CommonGrantOptionsBuilder_iam#getResourceArns_java_lang_String_AsList <em>Resource Arns java lang String As List</em>}</li>
 *   <li>{@link iam.CommonGrantOptionsBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link iam.CommonGrantOptionsBuilder_iam#getVarName <em>Var Name</em>}</li>
 *   <li>{@link iam.CommonGrantOptionsBuilder_iam#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link iam.CommonGrantOptionsBuilder_iam#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see iam.IamPackage#getCommonGrantOptionsBuilder_iam()
 * @model
 * @generated
 */
public interface CommonGrantOptionsBuilder_iam extends EObject {
	/**
	 * Returns the value of the '<em><b>Actions java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions java lang String As List</em>' attribute.
	 * @see #setActions_java_lang_String_AsList(String)
	 * @see iam.IamPackage#getCommonGrantOptionsBuilder_iam_Actions_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getActions_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link iam.CommonGrantOptionsBuilder_iam#getActions_java_lang_String_AsList <em>Actions java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actions java lang String As List</em>' attribute.
	 * @see #getActions_java_lang_String_AsList()
	 * @generated
	 */
	void setActions_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Grantee With IGrantable software amazon awscdk services iam IGrantable As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grantee With IGrantable software amazon awscdk services iam IGrantable As Reference</em>' attribute.
	 * @see #setGranteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference(String)
	 * @see iam.IamPackage#getCommonGrantOptionsBuilder_iam_GranteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference()
	 * @model
	 * @generated
	 */
	String getGranteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference();

	/**
	 * Sets the value of the '{@link iam.CommonGrantOptionsBuilder_iam#getGranteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference <em>Grantee With IGrantable software amazon awscdk services iam IGrantable As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grantee With IGrantable software amazon awscdk services iam IGrantable As Reference</em>' attribute.
	 * @see #getGranteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference()
	 * @generated
	 */
	void setGranteeWithIGrantable_software_amazon_awscdk_services_iam_IGrantable_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Resource Arns java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Arns java lang String As List</em>' attribute.
	 * @see #setResourceArns_java_lang_String_AsList(String)
	 * @see iam.IamPackage#getCommonGrantOptionsBuilder_iam_ResourceArns_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getResourceArns_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link iam.CommonGrantOptionsBuilder_iam#getResourceArns_java_lang_String_AsList <em>Resource Arns java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Arns java lang String As List</em>' attribute.
	 * @see #getResourceArns_java_lang_String_AsList()
	 * @generated
	 */
	void setResourceArns_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.iam.CommonGrantOptions"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see iam.IamPackage#getCommonGrantOptionsBuilder_iam_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.iam.CommonGrantOptions" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see iam.IamPackage#getCommonGrantOptionsBuilder_iam_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link iam.CommonGrantOptionsBuilder_iam#getVarName <em>Var Name</em>}' attribute.
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
	 * @see iam.IamPackage#getCommonGrantOptionsBuilder_iam_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link iam.CommonGrantOptionsBuilder_iam#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see iam.IamPackage#getCommonGrantOptionsBuilder_iam_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link iam.CommonGrantOptionsBuilder_iam#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // CommonGrantOptionsBuilder_iam
