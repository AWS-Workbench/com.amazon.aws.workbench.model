/**
 */
package iam;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Managed Policy Props Builder iam</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iam.ManagedPolicyPropsBuilder_iam#getDescription_java_lang_String_ <em>Description java lang String </em>}</li>
 *   <li>{@link iam.ManagedPolicyPropsBuilder_iam#getDocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference <em>Document With Policy Document software amazon awscdk services iam Policy Document As Reference</em>}</li>
 *   <li>{@link iam.ManagedPolicyPropsBuilder_iam#getGroups_software_amazon_awscdk_services_iam_IGroup_AsList <em>Groups software amazon awscdk services iam IGroup As List</em>}</li>
 *   <li>{@link iam.ManagedPolicyPropsBuilder_iam#getManagedPolicyName_java_lang_String_ <em>Managed Policy Name java lang String </em>}</li>
 *   <li>{@link iam.ManagedPolicyPropsBuilder_iam#getPath_java_lang_String_ <em>Path java lang String </em>}</li>
 *   <li>{@link iam.ManagedPolicyPropsBuilder_iam#getRoles_software_amazon_awscdk_services_iam_IRole_AsList <em>Roles software amazon awscdk services iam IRole As List</em>}</li>
 *   <li>{@link iam.ManagedPolicyPropsBuilder_iam#getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList <em>Statements software amazon awscdk services iam Policy Statement As List</em>}</li>
 *   <li>{@link iam.ManagedPolicyPropsBuilder_iam#getUsers_software_amazon_awscdk_services_iam_IUser_AsList <em>Users software amazon awscdk services iam IUser As List</em>}</li>
 *   <li>{@link iam.ManagedPolicyPropsBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link iam.ManagedPolicyPropsBuilder_iam#getVarName <em>Var Name</em>}</li>
 *   <li>{@link iam.ManagedPolicyPropsBuilder_iam#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link iam.ManagedPolicyPropsBuilder_iam#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see iam.IamPackage#getManagedPolicyPropsBuilder_iam()
 * @model
 * @generated
 */
public interface ManagedPolicyPropsBuilder_iam extends EObject {
	/**
	 * Returns the value of the '<em><b>Description java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description java lang String </em>' attribute.
	 * @see #setDescription_java_lang_String_(String)
	 * @see iam.IamPackage#getManagedPolicyPropsBuilder_iam_Description_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDescription_java_lang_String_();

	/**
	 * Sets the value of the '{@link iam.ManagedPolicyPropsBuilder_iam#getDescription_java_lang_String_ <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description java lang String </em>' attribute.
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 */
	void setDescription_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Document With Policy Document software amazon awscdk services iam Policy Document As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document With Policy Document software amazon awscdk services iam Policy Document As Reference</em>' attribute.
	 * @see #setDocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference(String)
	 * @see iam.IamPackage#getManagedPolicyPropsBuilder_iam_DocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference()
	 * @model
	 * @generated
	 */
	String getDocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference();

	/**
	 * Sets the value of the '{@link iam.ManagedPolicyPropsBuilder_iam#getDocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference <em>Document With Policy Document software amazon awscdk services iam Policy Document As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document With Policy Document software amazon awscdk services iam Policy Document As Reference</em>' attribute.
	 * @see #getDocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference()
	 * @generated
	 */
	void setDocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Groups software amazon awscdk services iam IGroup As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups software amazon awscdk services iam IGroup As List</em>' attribute.
	 * @see #setGroups_software_amazon_awscdk_services_iam_IGroup_AsList(String)
	 * @see iam.IamPackage#getManagedPolicyPropsBuilder_iam_Groups_software_amazon_awscdk_services_iam_IGroup_AsList()
	 * @model
	 * @generated
	 */
	String getGroups_software_amazon_awscdk_services_iam_IGroup_AsList();

	/**
	 * Sets the value of the '{@link iam.ManagedPolicyPropsBuilder_iam#getGroups_software_amazon_awscdk_services_iam_IGroup_AsList <em>Groups software amazon awscdk services iam IGroup As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Groups software amazon awscdk services iam IGroup As List</em>' attribute.
	 * @see #getGroups_software_amazon_awscdk_services_iam_IGroup_AsList()
	 * @generated
	 */
	void setGroups_software_amazon_awscdk_services_iam_IGroup_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Managed Policy Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managed Policy Name java lang String </em>' attribute.
	 * @see #setManagedPolicyName_java_lang_String_(String)
	 * @see iam.IamPackage#getManagedPolicyPropsBuilder_iam_ManagedPolicyName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getManagedPolicyName_java_lang_String_();

	/**
	 * Sets the value of the '{@link iam.ManagedPolicyPropsBuilder_iam#getManagedPolicyName_java_lang_String_ <em>Managed Policy Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managed Policy Name java lang String </em>' attribute.
	 * @see #getManagedPolicyName_java_lang_String_()
	 * @generated
	 */
	void setManagedPolicyName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Path java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path java lang String </em>' attribute.
	 * @see #setPath_java_lang_String_(String)
	 * @see iam.IamPackage#getManagedPolicyPropsBuilder_iam_Path_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getPath_java_lang_String_();

	/**
	 * Sets the value of the '{@link iam.ManagedPolicyPropsBuilder_iam#getPath_java_lang_String_ <em>Path java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path java lang String </em>' attribute.
	 * @see #getPath_java_lang_String_()
	 * @generated
	 */
	void setPath_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Roles software amazon awscdk services iam IRole As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles software amazon awscdk services iam IRole As List</em>' attribute.
	 * @see #setRoles_software_amazon_awscdk_services_iam_IRole_AsList(String)
	 * @see iam.IamPackage#getManagedPolicyPropsBuilder_iam_Roles_software_amazon_awscdk_services_iam_IRole_AsList()
	 * @model
	 * @generated
	 */
	String getRoles_software_amazon_awscdk_services_iam_IRole_AsList();

	/**
	 * Sets the value of the '{@link iam.ManagedPolicyPropsBuilder_iam#getRoles_software_amazon_awscdk_services_iam_IRole_AsList <em>Roles software amazon awscdk services iam IRole As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roles software amazon awscdk services iam IRole As List</em>' attribute.
	 * @see #getRoles_software_amazon_awscdk_services_iam_IRole_AsList()
	 * @generated
	 */
	void setRoles_software_amazon_awscdk_services_iam_IRole_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Statements software amazon awscdk services iam Policy Statement As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements software amazon awscdk services iam Policy Statement As List</em>' attribute.
	 * @see #setStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList(String)
	 * @see iam.IamPackage#getManagedPolicyPropsBuilder_iam_Statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList()
	 * @model
	 * @generated
	 */
	String getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList();

	/**
	 * Sets the value of the '{@link iam.ManagedPolicyPropsBuilder_iam#getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList <em>Statements software amazon awscdk services iam Policy Statement As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statements software amazon awscdk services iam Policy Statement As List</em>' attribute.
	 * @see #getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList()
	 * @generated
	 */
	void setStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Users software amazon awscdk services iam IUser As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users software amazon awscdk services iam IUser As List</em>' attribute.
	 * @see #setUsers_software_amazon_awscdk_services_iam_IUser_AsList(String)
	 * @see iam.IamPackage#getManagedPolicyPropsBuilder_iam_Users_software_amazon_awscdk_services_iam_IUser_AsList()
	 * @model
	 * @generated
	 */
	String getUsers_software_amazon_awscdk_services_iam_IUser_AsList();

	/**
	 * Sets the value of the '{@link iam.ManagedPolicyPropsBuilder_iam#getUsers_software_amazon_awscdk_services_iam_IUser_AsList <em>Users software amazon awscdk services iam IUser As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Users software amazon awscdk services iam IUser As List</em>' attribute.
	 * @see #getUsers_software_amazon_awscdk_services_iam_IUser_AsList()
	 * @generated
	 */
	void setUsers_software_amazon_awscdk_services_iam_IUser_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.iam.ManagedPolicyProps"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see iam.IamPackage#getManagedPolicyPropsBuilder_iam_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.iam.ManagedPolicyProps" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see iam.IamPackage#getManagedPolicyPropsBuilder_iam_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link iam.ManagedPolicyPropsBuilder_iam#getVarName <em>Var Name</em>}' attribute.
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
	 * @see iam.IamPackage#getManagedPolicyPropsBuilder_iam_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link iam.ManagedPolicyPropsBuilder_iam#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see iam.IamPackage#getManagedPolicyPropsBuilder_iam_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link iam.ManagedPolicyPropsBuilder_iam#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // ManagedPolicyPropsBuilder_iam
