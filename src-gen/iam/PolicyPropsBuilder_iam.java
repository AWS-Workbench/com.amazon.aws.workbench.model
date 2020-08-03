/**
 */
package iam;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy Props Builder iam</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iam.PolicyPropsBuilder_iam#getForce_java_lang_Boolean_ <em>Force java lang Boolean </em>}</li>
 *   <li>{@link iam.PolicyPropsBuilder_iam#getGroups_software_amazon_awscdk_services_iam_IGroup_AsList <em>Groups software amazon awscdk services iam IGroup As List</em>}</li>
 *   <li>{@link iam.PolicyPropsBuilder_iam#getPolicyName_java_lang_String_ <em>Policy Name java lang String </em>}</li>
 *   <li>{@link iam.PolicyPropsBuilder_iam#getRoles_software_amazon_awscdk_services_iam_IRole_AsList <em>Roles software amazon awscdk services iam IRole As List</em>}</li>
 *   <li>{@link iam.PolicyPropsBuilder_iam#getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList <em>Statements software amazon awscdk services iam Policy Statement As List</em>}</li>
 *   <li>{@link iam.PolicyPropsBuilder_iam#getUsers_software_amazon_awscdk_services_iam_IUser_AsList <em>Users software amazon awscdk services iam IUser As List</em>}</li>
 *   <li>{@link iam.PolicyPropsBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link iam.PolicyPropsBuilder_iam#getVarName <em>Var Name</em>}</li>
 *   <li>{@link iam.PolicyPropsBuilder_iam#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link iam.PolicyPropsBuilder_iam#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see iam.IamPackage#getPolicyPropsBuilder_iam()
 * @model
 * @generated
 */
public interface PolicyPropsBuilder_iam extends EObject {
	/**
	 * Returns the value of the '<em><b>Force java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force java lang Boolean </em>' attribute.
	 * @see #setForce_java_lang_Boolean_(Boolean)
	 * @see iam.IamPackage#getPolicyPropsBuilder_iam_Force_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getForce_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link iam.PolicyPropsBuilder_iam#getForce_java_lang_Boolean_ <em>Force java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force java lang Boolean </em>' attribute.
	 * @see #getForce_java_lang_Boolean_()
	 * @generated
	 */
	void setForce_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Groups software amazon awscdk services iam IGroup As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups software amazon awscdk services iam IGroup As List</em>' attribute.
	 * @see #setGroups_software_amazon_awscdk_services_iam_IGroup_AsList(String)
	 * @see iam.IamPackage#getPolicyPropsBuilder_iam_Groups_software_amazon_awscdk_services_iam_IGroup_AsList()
	 * @model
	 * @generated
	 */
	String getGroups_software_amazon_awscdk_services_iam_IGroup_AsList();

	/**
	 * Sets the value of the '{@link iam.PolicyPropsBuilder_iam#getGroups_software_amazon_awscdk_services_iam_IGroup_AsList <em>Groups software amazon awscdk services iam IGroup As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Groups software amazon awscdk services iam IGroup As List</em>' attribute.
	 * @see #getGroups_software_amazon_awscdk_services_iam_IGroup_AsList()
	 * @generated
	 */
	void setGroups_software_amazon_awscdk_services_iam_IGroup_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Policy Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Name java lang String </em>' attribute.
	 * @see #setPolicyName_java_lang_String_(String)
	 * @see iam.IamPackage#getPolicyPropsBuilder_iam_PolicyName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getPolicyName_java_lang_String_();

	/**
	 * Sets the value of the '{@link iam.PolicyPropsBuilder_iam#getPolicyName_java_lang_String_ <em>Policy Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Name java lang String </em>' attribute.
	 * @see #getPolicyName_java_lang_String_()
	 * @generated
	 */
	void setPolicyName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Roles software amazon awscdk services iam IRole As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles software amazon awscdk services iam IRole As List</em>' attribute.
	 * @see #setRoles_software_amazon_awscdk_services_iam_IRole_AsList(String)
	 * @see iam.IamPackage#getPolicyPropsBuilder_iam_Roles_software_amazon_awscdk_services_iam_IRole_AsList()
	 * @model
	 * @generated
	 */
	String getRoles_software_amazon_awscdk_services_iam_IRole_AsList();

	/**
	 * Sets the value of the '{@link iam.PolicyPropsBuilder_iam#getRoles_software_amazon_awscdk_services_iam_IRole_AsList <em>Roles software amazon awscdk services iam IRole As List</em>}' attribute.
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
	 * @see iam.IamPackage#getPolicyPropsBuilder_iam_Statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList()
	 * @model
	 * @generated
	 */
	String getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList();

	/**
	 * Sets the value of the '{@link iam.PolicyPropsBuilder_iam#getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList <em>Statements software amazon awscdk services iam Policy Statement As List</em>}' attribute.
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
	 * @see iam.IamPackage#getPolicyPropsBuilder_iam_Users_software_amazon_awscdk_services_iam_IUser_AsList()
	 * @model
	 * @generated
	 */
	String getUsers_software_amazon_awscdk_services_iam_IUser_AsList();

	/**
	 * Sets the value of the '{@link iam.PolicyPropsBuilder_iam#getUsers_software_amazon_awscdk_services_iam_IUser_AsList <em>Users software amazon awscdk services iam IUser As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Users software amazon awscdk services iam IUser As List</em>' attribute.
	 * @see #getUsers_software_amazon_awscdk_services_iam_IUser_AsList()
	 * @generated
	 */
	void setUsers_software_amazon_awscdk_services_iam_IUser_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.iam.PolicyProps"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see iam.IamPackage#getPolicyPropsBuilder_iam_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.iam.PolicyProps" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see iam.IamPackage#getPolicyPropsBuilder_iam_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link iam.PolicyPropsBuilder_iam#getVarName <em>Var Name</em>}' attribute.
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
	 * @see iam.IamPackage#getPolicyPropsBuilder_iam_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link iam.PolicyPropsBuilder_iam#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see iam.IamPackage#getPolicyPropsBuilder_iam_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link iam.PolicyPropsBuilder_iam#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // PolicyPropsBuilder_iam
