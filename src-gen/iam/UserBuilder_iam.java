/**
 */
package iam;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Builder iam</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iam.UserBuilder_iam#getGroups_software_amazon_awscdk_services_iam_IGroup_AsList <em>Groups software amazon awscdk services iam IGroup As List</em>}</li>
 *   <li>{@link iam.UserBuilder_iam#getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList <em>Managed Policies software amazon awscdk services iam IManaged Policy As List</em>}</li>
 *   <li>{@link iam.UserBuilder_iam#getPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference <em>Password With Secret Value software amazon awscdk core Secret Value As Reference</em>}</li>
 *   <li>{@link iam.UserBuilder_iam#getPasswordResetRequired_java_lang_Boolean_ <em>Password Reset Required java lang Boolean </em>}</li>
 *   <li>{@link iam.UserBuilder_iam#getPath_java_lang_String_ <em>Path java lang String </em>}</li>
 *   <li>{@link iam.UserBuilder_iam#getPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference <em>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</em>}</li>
 *   <li>{@link iam.UserBuilder_iam#getUserName_java_lang_String_ <em>User Name java lang String </em>}</li>
 *   <li>{@link iam.UserBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link iam.UserBuilder_iam#getVarName <em>Var Name</em>}</li>
 *   <li>{@link iam.UserBuilder_iam#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link iam.UserBuilder_iam#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see iam.IamPackage#getUserBuilder_iam()
 * @model
 * @generated
 */
public interface UserBuilder_iam extends EObject {
	/**
	 * Returns the value of the '<em><b>Groups software amazon awscdk services iam IGroup As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups software amazon awscdk services iam IGroup As List</em>' attribute.
	 * @see #setGroups_software_amazon_awscdk_services_iam_IGroup_AsList(String)
	 * @see iam.IamPackage#getUserBuilder_iam_Groups_software_amazon_awscdk_services_iam_IGroup_AsList()
	 * @model
	 * @generated
	 */
	String getGroups_software_amazon_awscdk_services_iam_IGroup_AsList();

	/**
	 * Sets the value of the '{@link iam.UserBuilder_iam#getGroups_software_amazon_awscdk_services_iam_IGroup_AsList <em>Groups software amazon awscdk services iam IGroup As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Groups software amazon awscdk services iam IGroup As List</em>' attribute.
	 * @see #getGroups_software_amazon_awscdk_services_iam_IGroup_AsList()
	 * @generated
	 */
	void setGroups_software_amazon_awscdk_services_iam_IGroup_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Managed Policies software amazon awscdk services iam IManaged Policy As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managed Policies software amazon awscdk services iam IManaged Policy As List</em>' attribute.
	 * @see #setManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList(String)
	 * @see iam.IamPackage#getUserBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList()
	 * @model
	 * @generated
	 */
	String getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList();

	/**
	 * Sets the value of the '{@link iam.UserBuilder_iam#getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList <em>Managed Policies software amazon awscdk services iam IManaged Policy As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managed Policies software amazon awscdk services iam IManaged Policy As List</em>' attribute.
	 * @see #getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList()
	 * @generated
	 */
	void setManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Password With Secret Value software amazon awscdk core Secret Value As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password With Secret Value software amazon awscdk core Secret Value As Reference</em>' attribute.
	 * @see #setPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference(String)
	 * @see iam.IamPackage#getUserBuilder_iam_PasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference()
	 * @model
	 * @generated
	 */
	String getPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference();

	/**
	 * Sets the value of the '{@link iam.UserBuilder_iam#getPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference <em>Password With Secret Value software amazon awscdk core Secret Value As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password With Secret Value software amazon awscdk core Secret Value As Reference</em>' attribute.
	 * @see #getPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference()
	 * @generated
	 */
	void setPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Password Reset Required java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password Reset Required java lang Boolean </em>' attribute.
	 * @see #setPasswordResetRequired_java_lang_Boolean_(Boolean)
	 * @see iam.IamPackage#getUserBuilder_iam_PasswordResetRequired_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getPasswordResetRequired_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link iam.UserBuilder_iam#getPasswordResetRequired_java_lang_Boolean_ <em>Password Reset Required java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password Reset Required java lang Boolean </em>' attribute.
	 * @see #getPasswordResetRequired_java_lang_Boolean_()
	 * @generated
	 */
	void setPasswordResetRequired_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Path java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path java lang String </em>' attribute.
	 * @see #setPath_java_lang_String_(String)
	 * @see iam.IamPackage#getUserBuilder_iam_Path_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getPath_java_lang_String_();

	/**
	 * Sets the value of the '{@link iam.UserBuilder_iam#getPath_java_lang_String_ <em>Path java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path java lang String </em>' attribute.
	 * @see #getPath_java_lang_String_()
	 * @generated
	 */
	void setPath_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</em>' attribute.
	 * @see #setPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference(String)
	 * @see iam.IamPackage#getUserBuilder_iam_PermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference()
	 * @model
	 * @generated
	 */
	String getPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference();

	/**
	 * Sets the value of the '{@link iam.UserBuilder_iam#getPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference <em>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</em>' attribute.
	 * @see #getPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference()
	 * @generated
	 */
	void setPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>User Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Name java lang String </em>' attribute.
	 * @see #setUserName_java_lang_String_(String)
	 * @see iam.IamPackage#getUserBuilder_iam_UserName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getUserName_java_lang_String_();

	/**
	 * Sets the value of the '{@link iam.UserBuilder_iam#getUserName_java_lang_String_ <em>User Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name java lang String </em>' attribute.
	 * @see #getUserName_java_lang_String_()
	 * @generated
	 */
	void setUserName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.iam.User"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see iam.IamPackage#getUserBuilder_iam_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.iam.User" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see iam.IamPackage#getUserBuilder_iam_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link iam.UserBuilder_iam#getVarName <em>Var Name</em>}' attribute.
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
	 * @see iam.IamPackage#getUserBuilder_iam_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link iam.UserBuilder_iam#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see iam.IamPackage#getUserBuilder_iam_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link iam.UserBuilder_iam#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // UserBuilder_iam
