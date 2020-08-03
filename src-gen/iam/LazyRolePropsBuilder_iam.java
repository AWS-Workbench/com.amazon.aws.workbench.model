/**
 */
package iam;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lazy Role Props Builder iam</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iam.LazyRolePropsBuilder_iam#getAssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference <em>Assumed By With IPrincipal software amazon awscdk services iam IPrincipal As Reference</em>}</li>
 *   <li>{@link iam.LazyRolePropsBuilder_iam#getDescription_java_lang_String_ <em>Description java lang String </em>}</li>
 *   <li>{@link iam.LazyRolePropsBuilder_iam#getExternalId_java_lang_String_ <em>External Id java lang String </em>}</li>
 *   <li>{@link iam.LazyRolePropsBuilder_iam#getExternalIds_java_lang_String_AsList <em>External Ids java lang String As List</em>}</li>
 *   <li>{@link iam.LazyRolePropsBuilder_iam#getInlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap <em>Inline Policies java lang String software amazon awscdk services iam Policy Document As Map</em>}</li>
 *   <li>{@link iam.LazyRolePropsBuilder_iam#getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList <em>Managed Policies software amazon awscdk services iam IManaged Policy As List</em>}</li>
 *   <li>{@link iam.LazyRolePropsBuilder_iam#getMaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Max Session Duration With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link iam.LazyRolePropsBuilder_iam#getPath_java_lang_String_ <em>Path java lang String </em>}</li>
 *   <li>{@link iam.LazyRolePropsBuilder_iam#getPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference <em>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</em>}</li>
 *   <li>{@link iam.LazyRolePropsBuilder_iam#getRoleName_java_lang_String_ <em>Role Name java lang String </em>}</li>
 *   <li>{@link iam.LazyRolePropsBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link iam.LazyRolePropsBuilder_iam#getVarName <em>Var Name</em>}</li>
 *   <li>{@link iam.LazyRolePropsBuilder_iam#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link iam.LazyRolePropsBuilder_iam#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see iam.IamPackage#getLazyRolePropsBuilder_iam()
 * @model
 * @generated
 */
public interface LazyRolePropsBuilder_iam extends EObject {
	/**
	 * Returns the value of the '<em><b>Assumed By With IPrincipal software amazon awscdk services iam IPrincipal As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumed By With IPrincipal software amazon awscdk services iam IPrincipal As Reference</em>' attribute.
	 * @see #setAssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference(String)
	 * @see iam.IamPackage#getLazyRolePropsBuilder_iam_AssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference()
	 * @model
	 * @generated
	 */
	String getAssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference();

	/**
	 * Sets the value of the '{@link iam.LazyRolePropsBuilder_iam#getAssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference <em>Assumed By With IPrincipal software amazon awscdk services iam IPrincipal As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assumed By With IPrincipal software amazon awscdk services iam IPrincipal As Reference</em>' attribute.
	 * @see #getAssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference()
	 * @generated
	 */
	void setAssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Description java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description java lang String </em>' attribute.
	 * @see #setDescription_java_lang_String_(String)
	 * @see iam.IamPackage#getLazyRolePropsBuilder_iam_Description_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDescription_java_lang_String_();

	/**
	 * Sets the value of the '{@link iam.LazyRolePropsBuilder_iam#getDescription_java_lang_String_ <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description java lang String </em>' attribute.
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 */
	void setDescription_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>External Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Id java lang String </em>' attribute.
	 * @see #setExternalId_java_lang_String_(String)
	 * @see iam.IamPackage#getLazyRolePropsBuilder_iam_ExternalId_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getExternalId_java_lang_String_();

	/**
	 * Sets the value of the '{@link iam.LazyRolePropsBuilder_iam#getExternalId_java_lang_String_ <em>External Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Id java lang String </em>' attribute.
	 * @see #getExternalId_java_lang_String_()
	 * @generated
	 */
	void setExternalId_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>External Ids java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Ids java lang String As List</em>' attribute.
	 * @see #setExternalIds_java_lang_String_AsList(String)
	 * @see iam.IamPackage#getLazyRolePropsBuilder_iam_ExternalIds_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getExternalIds_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link iam.LazyRolePropsBuilder_iam#getExternalIds_java_lang_String_AsList <em>External Ids java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Ids java lang String As List</em>' attribute.
	 * @see #getExternalIds_java_lang_String_AsList()
	 * @generated
	 */
	void setExternalIds_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Inline Policies java lang String software amazon awscdk services iam Policy Document As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inline Policies java lang String software amazon awscdk services iam Policy Document As Map</em>' attribute.
	 * @see #setInlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap(String)
	 * @see iam.IamPackage#getLazyRolePropsBuilder_iam_InlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap()
	 * @model
	 * @generated
	 */
	String getInlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap();

	/**
	 * Sets the value of the '{@link iam.LazyRolePropsBuilder_iam#getInlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap <em>Inline Policies java lang String software amazon awscdk services iam Policy Document As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inline Policies java lang String software amazon awscdk services iam Policy Document As Map</em>' attribute.
	 * @see #getInlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap()
	 * @generated
	 */
	void setInlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap(String value);

	/**
	 * Returns the value of the '<em><b>Managed Policies software amazon awscdk services iam IManaged Policy As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managed Policies software amazon awscdk services iam IManaged Policy As List</em>' attribute.
	 * @see #setManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList(String)
	 * @see iam.IamPackage#getLazyRolePropsBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList()
	 * @model
	 * @generated
	 */
	String getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList();

	/**
	 * Sets the value of the '{@link iam.LazyRolePropsBuilder_iam#getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList <em>Managed Policies software amazon awscdk services iam IManaged Policy As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managed Policies software amazon awscdk services iam IManaged Policy As List</em>' attribute.
	 * @see #getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList()
	 * @generated
	 */
	void setManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Max Session Duration With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Session Duration With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setMaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see iam.IamPackage#getLazyRolePropsBuilder_iam_MaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getMaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link iam.LazyRolePropsBuilder_iam#getMaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Max Session Duration With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Session Duration With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getMaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setMaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Path java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path java lang String </em>' attribute.
	 * @see #setPath_java_lang_String_(String)
	 * @see iam.IamPackage#getLazyRolePropsBuilder_iam_Path_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getPath_java_lang_String_();

	/**
	 * Sets the value of the '{@link iam.LazyRolePropsBuilder_iam#getPath_java_lang_String_ <em>Path java lang String </em>}' attribute.
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
	 * @see iam.IamPackage#getLazyRolePropsBuilder_iam_PermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference()
	 * @model
	 * @generated
	 */
	String getPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference();

	/**
	 * Sets the value of the '{@link iam.LazyRolePropsBuilder_iam#getPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference <em>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</em>' attribute.
	 * @see #getPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference()
	 * @generated
	 */
	void setPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Role Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Name java lang String </em>' attribute.
	 * @see #setRoleName_java_lang_String_(String)
	 * @see iam.IamPackage#getLazyRolePropsBuilder_iam_RoleName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getRoleName_java_lang_String_();

	/**
	 * Sets the value of the '{@link iam.LazyRolePropsBuilder_iam#getRoleName_java_lang_String_ <em>Role Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Name java lang String </em>' attribute.
	 * @see #getRoleName_java_lang_String_()
	 * @generated
	 */
	void setRoleName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.iam.LazyRoleProps"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see iam.IamPackage#getLazyRolePropsBuilder_iam_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.iam.LazyRoleProps" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see iam.IamPackage#getLazyRolePropsBuilder_iam_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link iam.LazyRolePropsBuilder_iam#getVarName <em>Var Name</em>}' attribute.
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
	 * @see iam.IamPackage#getLazyRolePropsBuilder_iam_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link iam.LazyRolePropsBuilder_iam#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see iam.IamPackage#getLazyRolePropsBuilder_iam_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link iam.LazyRolePropsBuilder_iam#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // LazyRolePropsBuilder_iam
