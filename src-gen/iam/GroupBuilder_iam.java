/**
 */
package iam;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Builder iam</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iam.GroupBuilder_iam#getGroupName_java_lang_String_ <em>Group Name java lang String </em>}</li>
 *   <li>{@link iam.GroupBuilder_iam#getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList <em>Managed Policies software amazon awscdk services iam IManaged Policy As List</em>}</li>
 *   <li>{@link iam.GroupBuilder_iam#getPath_java_lang_String_ <em>Path java lang String </em>}</li>
 *   <li>{@link iam.GroupBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link iam.GroupBuilder_iam#getVarName <em>Var Name</em>}</li>
 *   <li>{@link iam.GroupBuilder_iam#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link iam.GroupBuilder_iam#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see iam.IamPackage#getGroupBuilder_iam()
 * @model
 * @generated
 */
public interface GroupBuilder_iam extends EObject {
	/**
	 * Returns the value of the '<em><b>Group Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Name java lang String </em>' attribute.
	 * @see #setGroupName_java_lang_String_(String)
	 * @see iam.IamPackage#getGroupBuilder_iam_GroupName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getGroupName_java_lang_String_();

	/**
	 * Sets the value of the '{@link iam.GroupBuilder_iam#getGroupName_java_lang_String_ <em>Group Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Name java lang String </em>' attribute.
	 * @see #getGroupName_java_lang_String_()
	 * @generated
	 */
	void setGroupName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Managed Policies software amazon awscdk services iam IManaged Policy As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managed Policies software amazon awscdk services iam IManaged Policy As List</em>' attribute.
	 * @see #setManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList(String)
	 * @see iam.IamPackage#getGroupBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList()
	 * @model
	 * @generated
	 */
	String getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList();

	/**
	 * Sets the value of the '{@link iam.GroupBuilder_iam#getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList <em>Managed Policies software amazon awscdk services iam IManaged Policy As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managed Policies software amazon awscdk services iam IManaged Policy As List</em>' attribute.
	 * @see #getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList()
	 * @generated
	 */
	void setManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Path java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path java lang String </em>' attribute.
	 * @see #setPath_java_lang_String_(String)
	 * @see iam.IamPackage#getGroupBuilder_iam_Path_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getPath_java_lang_String_();

	/**
	 * Sets the value of the '{@link iam.GroupBuilder_iam#getPath_java_lang_String_ <em>Path java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path java lang String </em>' attribute.
	 * @see #getPath_java_lang_String_()
	 * @generated
	 */
	void setPath_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.iam.Group"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see iam.IamPackage#getGroupBuilder_iam_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.iam.Group" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see iam.IamPackage#getGroupBuilder_iam_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link iam.GroupBuilder_iam#getVarName <em>Var Name</em>}' attribute.
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
	 * @see iam.IamPackage#getGroupBuilder_iam_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link iam.GroupBuilder_iam#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see iam.IamPackage#getGroupBuilder_iam_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link iam.GroupBuilder_iam#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // GroupBuilder_iam
