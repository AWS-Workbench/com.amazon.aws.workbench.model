/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy Statement Builder iam</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PolicyStatementBuilder_iam#getActions_java_lang_String_AsList <em>Actions java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PolicyStatementBuilder_iam#getConditions_java_lang_String__java_lang_Object_AsMap <em>Conditions java lang String java lang Object As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PolicyStatementBuilder_iam#getEffect_software_amazon_awscdk_services_iam_Effect_ <em>Effect software amazon awscdk services iam Effect </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PolicyStatementBuilder_iam#getNotActions_java_lang_String_AsList <em>Not Actions java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PolicyStatementBuilder_iam#getNotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList <em>Not Principals software amazon awscdk services iam IPrincipal As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PolicyStatementBuilder_iam#getNotResources_java_lang_String_AsList <em>Not Resources java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PolicyStatementBuilder_iam#getPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList <em>Principals software amazon awscdk services iam IPrincipal As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PolicyStatementBuilder_iam#getResources_java_lang_String_AsList <em>Resources java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PolicyStatementBuilder_iam#getSid_java_lang_String_ <em>Sid java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PolicyStatementBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PolicyStatementBuilder_iam#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PolicyStatementBuilder_iam#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PolicyStatementBuilder_iam#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPolicyStatementBuilder_iam()
 * @model
 * @generated
 */
public interface PolicyStatementBuilder_iam extends EObject {
	/**
	 * Returns the value of the '<em><b>Actions java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions java lang String As List</em>' attribute.
	 * @see #setActions_java_lang_String_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPolicyStatementBuilder_iam_Actions_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getActions_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PolicyStatementBuilder_iam#getActions_java_lang_String_AsList <em>Actions java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actions java lang String As List</em>' attribute.
	 * @see #getActions_java_lang_String_AsList()
	 * @generated
	 */
	void setActions_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Conditions java lang String java lang Object As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions java lang String java lang Object As Map</em>' attribute.
	 * @see #setConditions_java_lang_String__java_lang_Object_AsMap(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPolicyStatementBuilder_iam_Conditions_java_lang_String__java_lang_Object_AsMap()
	 * @model
	 * @generated
	 */
	String getConditions_java_lang_String__java_lang_Object_AsMap();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PolicyStatementBuilder_iam#getConditions_java_lang_String__java_lang_Object_AsMap <em>Conditions java lang String java lang Object As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditions java lang String java lang Object As Map</em>' attribute.
	 * @see #getConditions_java_lang_String__java_lang_Object_AsMap()
	 * @generated
	 */
	void setConditions_java_lang_String__java_lang_Object_AsMap(String value);

	/**
	 * Returns the value of the '<em><b>Effect software amazon awscdk services iam Effect </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.Effect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect software amazon awscdk services iam Effect </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.Effect
	 * @see #setEffect_software_amazon_awscdk_services_iam_Effect_(Effect)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPolicyStatementBuilder_iam_Effect_software_amazon_awscdk_services_iam_Effect_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.Effect"
	 * @generated
	 */
	Effect getEffect_software_amazon_awscdk_services_iam_Effect_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PolicyStatementBuilder_iam#getEffect_software_amazon_awscdk_services_iam_Effect_ <em>Effect software amazon awscdk services iam Effect </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect software amazon awscdk services iam Effect </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.Effect
	 * @see #getEffect_software_amazon_awscdk_services_iam_Effect_()
	 * @generated
	 */
	void setEffect_software_amazon_awscdk_services_iam_Effect_(Effect value);

	/**
	 * Returns the value of the '<em><b>Not Actions java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Actions java lang String As List</em>' attribute.
	 * @see #setNotActions_java_lang_String_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPolicyStatementBuilder_iam_NotActions_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getNotActions_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PolicyStatementBuilder_iam#getNotActions_java_lang_String_AsList <em>Not Actions java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Actions java lang String As List</em>' attribute.
	 * @see #getNotActions_java_lang_String_AsList()
	 * @generated
	 */
	void setNotActions_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Not Principals software amazon awscdk services iam IPrincipal As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Principals software amazon awscdk services iam IPrincipal As List</em>' attribute.
	 * @see #setNotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPolicyStatementBuilder_iam_NotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList()
	 * @model
	 * @generated
	 */
	String getNotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PolicyStatementBuilder_iam#getNotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList <em>Not Principals software amazon awscdk services iam IPrincipal As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Principals software amazon awscdk services iam IPrincipal As List</em>' attribute.
	 * @see #getNotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList()
	 * @generated
	 */
	void setNotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Not Resources java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Resources java lang String As List</em>' attribute.
	 * @see #setNotResources_java_lang_String_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPolicyStatementBuilder_iam_NotResources_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getNotResources_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PolicyStatementBuilder_iam#getNotResources_java_lang_String_AsList <em>Not Resources java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Resources java lang String As List</em>' attribute.
	 * @see #getNotResources_java_lang_String_AsList()
	 * @generated
	 */
	void setNotResources_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Principals software amazon awscdk services iam IPrincipal As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Principals software amazon awscdk services iam IPrincipal As List</em>' attribute.
	 * @see #setPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPolicyStatementBuilder_iam_Principals_software_amazon_awscdk_services_iam_IPrincipal_AsList()
	 * @model
	 * @generated
	 */
	String getPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PolicyStatementBuilder_iam#getPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList <em>Principals software amazon awscdk services iam IPrincipal As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Principals software amazon awscdk services iam IPrincipal As List</em>' attribute.
	 * @see #getPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList()
	 * @generated
	 */
	void setPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Resources java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources java lang String As List</em>' attribute.
	 * @see #setResources_java_lang_String_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPolicyStatementBuilder_iam_Resources_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getResources_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PolicyStatementBuilder_iam#getResources_java_lang_String_AsList <em>Resources java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resources java lang String As List</em>' attribute.
	 * @see #getResources_java_lang_String_AsList()
	 * @generated
	 */
	void setResources_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Sid java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sid java lang String </em>' attribute.
	 * @see #setSid_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPolicyStatementBuilder_iam_Sid_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getSid_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PolicyStatementBuilder_iam#getSid_java_lang_String_ <em>Sid java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sid java lang String </em>' attribute.
	 * @see #getSid_java_lang_String_()
	 * @generated
	 */
	void setSid_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.iam.PolicyStatement"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPolicyStatementBuilder_iam_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.iam.PolicyStatement" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPolicyStatementBuilder_iam_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PolicyStatementBuilder_iam#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPolicyStatementBuilder_iam_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PolicyStatementBuilder_iam#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPolicyStatementBuilder_iam_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PolicyStatementBuilder_iam#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // PolicyStatementBuilder_iam
