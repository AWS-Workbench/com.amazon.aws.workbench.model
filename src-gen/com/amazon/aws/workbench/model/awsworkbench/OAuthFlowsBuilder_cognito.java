/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OAuth Flows Builder cognito</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OAuthFlowsBuilder_cognito#getAuthorizationCodeGrant_java_lang_Boolean_ <em>Authorization Code Grant java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OAuthFlowsBuilder_cognito#getClientCredentials_java_lang_Boolean_ <em>Client Credentials java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OAuthFlowsBuilder_cognito#getImplicitCodeGrant_java_lang_Boolean_ <em>Implicit Code Grant java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OAuthFlowsBuilder_cognito#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OAuthFlowsBuilder_cognito#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OAuthFlowsBuilder_cognito#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OAuthFlowsBuilder_cognito#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOAuthFlowsBuilder_cognito()
 * @model
 * @generated
 */
public interface OAuthFlowsBuilder_cognito extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Authorization Code Grant java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization Code Grant java lang Boolean </em>' attribute.
	 * @see #setAuthorizationCodeGrant_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOAuthFlowsBuilder_cognito_AuthorizationCodeGrant_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getAuthorizationCodeGrant_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.OAuthFlowsBuilder_cognito#getAuthorizationCodeGrant_java_lang_Boolean_ <em>Authorization Code Grant java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorization Code Grant java lang Boolean </em>' attribute.
	 * @see #getAuthorizationCodeGrant_java_lang_Boolean_()
	 * @generated
	 */
	void setAuthorizationCodeGrant_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Client Credentials java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Credentials java lang Boolean </em>' attribute.
	 * @see #setClientCredentials_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOAuthFlowsBuilder_cognito_ClientCredentials_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getClientCredentials_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.OAuthFlowsBuilder_cognito#getClientCredentials_java_lang_Boolean_ <em>Client Credentials java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Credentials java lang Boolean </em>' attribute.
	 * @see #getClientCredentials_java_lang_Boolean_()
	 * @generated
	 */
	void setClientCredentials_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Implicit Code Grant java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Code Grant java lang Boolean </em>' attribute.
	 * @see #setImplicitCodeGrant_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOAuthFlowsBuilder_cognito_ImplicitCodeGrant_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getImplicitCodeGrant_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.OAuthFlowsBuilder_cognito#getImplicitCodeGrant_java_lang_Boolean_ <em>Implicit Code Grant java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Code Grant java lang Boolean </em>' attribute.
	 * @see #getImplicitCodeGrant_java_lang_Boolean_()
	 * @generated
	 */
	void setImplicitCodeGrant_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.cognito.OAuthFlows"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOAuthFlowsBuilder_cognito_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.cognito.OAuthFlows" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOAuthFlowsBuilder_cognito_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.OAuthFlowsBuilder_cognito#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOAuthFlowsBuilder_cognito_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.OAuthFlowsBuilder_cognito#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOAuthFlowsBuilder_cognito_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.OAuthFlowsBuilder_cognito#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // OAuthFlowsBuilder_cognito
