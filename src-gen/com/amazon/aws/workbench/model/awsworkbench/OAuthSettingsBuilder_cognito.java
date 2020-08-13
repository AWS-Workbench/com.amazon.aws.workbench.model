/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OAuth Settings Builder cognito</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OAuthSettingsBuilder_cognito#getCallbackUrls_java_lang_String_AsList <em>Callback Urls java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OAuthSettingsBuilder_cognito#getFlowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReference <em>Flows With OAuth Flows software amazon awscdk services cognito OAuth Flows As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OAuthSettingsBuilder_cognito#getScopes_software_amazon_awscdk_services_cognito_OAuthScope_AsList <em>Scopes software amazon awscdk services cognito OAuth Scope As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OAuthSettingsBuilder_cognito#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OAuthSettingsBuilder_cognito#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OAuthSettingsBuilder_cognito#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OAuthSettingsBuilder_cognito#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOAuthSettingsBuilder_cognito()
 * @model
 * @generated
 */
public interface OAuthSettingsBuilder_cognito extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Callback Urls java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callback Urls java lang String As List</em>' attribute.
	 * @see #setCallbackUrls_java_lang_String_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOAuthSettingsBuilder_cognito_CallbackUrls_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getCallbackUrls_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.OAuthSettingsBuilder_cognito#getCallbackUrls_java_lang_String_AsList <em>Callback Urls java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callback Urls java lang String As List</em>' attribute.
	 * @see #getCallbackUrls_java_lang_String_AsList()
	 * @generated
	 */
	void setCallbackUrls_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Flows With OAuth Flows software amazon awscdk services cognito OAuth Flows As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flows With OAuth Flows software amazon awscdk services cognito OAuth Flows As Reference</em>' attribute.
	 * @see #setFlowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOAuthSettingsBuilder_cognito_FlowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReference()
	 * @model
	 * @generated
	 */
	String getFlowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.OAuthSettingsBuilder_cognito#getFlowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReference <em>Flows With OAuth Flows software amazon awscdk services cognito OAuth Flows As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flows With OAuth Flows software amazon awscdk services cognito OAuth Flows As Reference</em>' attribute.
	 * @see #getFlowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReference()
	 * @generated
	 */
	void setFlowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Scopes software amazon awscdk services cognito OAuth Scope As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scopes software amazon awscdk services cognito OAuth Scope As List</em>' attribute.
	 * @see #setScopes_software_amazon_awscdk_services_cognito_OAuthScope_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOAuthSettingsBuilder_cognito_Scopes_software_amazon_awscdk_services_cognito_OAuthScope_AsList()
	 * @model
	 * @generated
	 */
	String getScopes_software_amazon_awscdk_services_cognito_OAuthScope_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.OAuthSettingsBuilder_cognito#getScopes_software_amazon_awscdk_services_cognito_OAuthScope_AsList <em>Scopes software amazon awscdk services cognito OAuth Scope As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scopes software amazon awscdk services cognito OAuth Scope As List</em>' attribute.
	 * @see #getScopes_software_amazon_awscdk_services_cognito_OAuthScope_AsList()
	 * @generated
	 */
	void setScopes_software_amazon_awscdk_services_cognito_OAuthScope_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.cognito.OAuthSettings"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOAuthSettingsBuilder_cognito_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.cognito.OAuthSettings" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOAuthSettingsBuilder_cognito_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.OAuthSettingsBuilder_cognito#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOAuthSettingsBuilder_cognito_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.OAuthSettingsBuilder_cognito#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOAuthSettingsBuilder_cognito_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.OAuthSettingsBuilder_cognito#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // OAuthSettingsBuilder_cognito
