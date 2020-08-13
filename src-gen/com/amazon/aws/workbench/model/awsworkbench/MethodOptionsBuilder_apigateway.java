/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Options Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.MethodOptionsBuilder_apigateway#getApiKeyRequired_java_lang_Boolean_ <em>Api Key Required java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.MethodOptionsBuilder_apigateway#getAuthorizationScopes_java_lang_String_AsList <em>Authorization Scopes java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.MethodOptionsBuilder_apigateway#getAuthorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_ <em>Authorization Type software amazon awscdk services apigateway Authorization Type </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.MethodOptionsBuilder_apigateway#getAuthorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference <em>Authorizer With IAuthorizer software amazon awscdk services apigateway IAuthorizer As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.MethodOptionsBuilder_apigateway#getMethodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList <em>Method Responses software amazon awscdk services apigateway Method Response As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.MethodOptionsBuilder_apigateway#getOperationName_java_lang_String_ <em>Operation Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.MethodOptionsBuilder_apigateway#getRequestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap <em>Request Models java lang String software amazon awscdk services apigateway IModel As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.MethodOptionsBuilder_apigateway#getRequestParameters_java_lang_String__java_lang_Boolean_AsMap <em>Request Parameters java lang String java lang Boolean As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.MethodOptionsBuilder_apigateway#getRequestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference <em>Request Validator With IRequest Validator software amazon awscdk services apigateway IRequest Validator As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.MethodOptionsBuilder_apigateway#getRequestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference <em>Request Validator Options With Request Validator Options software amazon awscdk services apigateway Request Validator Options As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.MethodOptionsBuilder_apigateway#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.MethodOptionsBuilder_apigateway#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.MethodOptionsBuilder_apigateway#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.MethodOptionsBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getMethodOptionsBuilder_apigateway()
 * @model
 * @generated
 */
public interface MethodOptionsBuilder_apigateway extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Api Key Required java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Key Required java lang Boolean </em>' attribute.
	 * @see #setApiKeyRequired_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getMethodOptionsBuilder_apigateway_ApiKeyRequired_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getApiKeyRequired_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.MethodOptionsBuilder_apigateway#getApiKeyRequired_java_lang_Boolean_ <em>Api Key Required java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Key Required java lang Boolean </em>' attribute.
	 * @see #getApiKeyRequired_java_lang_Boolean_()
	 * @generated
	 */
	void setApiKeyRequired_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Authorization Scopes java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization Scopes java lang String As List</em>' attribute.
	 * @see #setAuthorizationScopes_java_lang_String_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getMethodOptionsBuilder_apigateway_AuthorizationScopes_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getAuthorizationScopes_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.MethodOptionsBuilder_apigateway#getAuthorizationScopes_java_lang_String_AsList <em>Authorization Scopes java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorization Scopes java lang String As List</em>' attribute.
	 * @see #getAuthorizationScopes_java_lang_String_AsList()
	 * @generated
	 */
	void setAuthorizationScopes_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Authorization Type software amazon awscdk services apigateway Authorization Type </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.AuthorizationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization Type software amazon awscdk services apigateway Authorization Type </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AuthorizationType
	 * @see #setAuthorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_(AuthorizationType)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getMethodOptionsBuilder_apigateway_AuthorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.AuthorizationType"
	 * @generated
	 */
	AuthorizationType getAuthorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.MethodOptionsBuilder_apigateway#getAuthorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_ <em>Authorization Type software amazon awscdk services apigateway Authorization Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorization Type software amazon awscdk services apigateway Authorization Type </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AuthorizationType
	 * @see #getAuthorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_()
	 * @generated
	 */
	void setAuthorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_(AuthorizationType value);

	/**
	 * Returns the value of the '<em><b>Authorizer With IAuthorizer software amazon awscdk services apigateway IAuthorizer As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorizer With IAuthorizer software amazon awscdk services apigateway IAuthorizer As Reference</em>' attribute.
	 * @see #setAuthorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getMethodOptionsBuilder_apigateway_AuthorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference()
	 * @model
	 * @generated
	 */
	String getAuthorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.MethodOptionsBuilder_apigateway#getAuthorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference <em>Authorizer With IAuthorizer software amazon awscdk services apigateway IAuthorizer As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorizer With IAuthorizer software amazon awscdk services apigateway IAuthorizer As Reference</em>' attribute.
	 * @see #getAuthorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference()
	 * @generated
	 */
	void setAuthorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Method Responses software amazon awscdk services apigateway Method Response As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Responses software amazon awscdk services apigateway Method Response As List</em>' attribute.
	 * @see #setMethodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getMethodOptionsBuilder_apigateway_MethodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList()
	 * @model
	 * @generated
	 */
	String getMethodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.MethodOptionsBuilder_apigateway#getMethodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList <em>Method Responses software amazon awscdk services apigateway Method Response As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Responses software amazon awscdk services apigateway Method Response As List</em>' attribute.
	 * @see #getMethodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList()
	 * @generated
	 */
	void setMethodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Operation Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Name java lang String </em>' attribute.
	 * @see #setOperationName_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getMethodOptionsBuilder_apigateway_OperationName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getOperationName_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.MethodOptionsBuilder_apigateway#getOperationName_java_lang_String_ <em>Operation Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Name java lang String </em>' attribute.
	 * @see #getOperationName_java_lang_String_()
	 * @generated
	 */
	void setOperationName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Request Models java lang String software amazon awscdk services apigateway IModel As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Models java lang String software amazon awscdk services apigateway IModel As Map</em>' attribute.
	 * @see #setRequestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getMethodOptionsBuilder_apigateway_RequestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap()
	 * @model
	 * @generated
	 */
	String getRequestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.MethodOptionsBuilder_apigateway#getRequestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap <em>Request Models java lang String software amazon awscdk services apigateway IModel As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Models java lang String software amazon awscdk services apigateway IModel As Map</em>' attribute.
	 * @see #getRequestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap()
	 * @generated
	 */
	void setRequestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap(String value);

	/**
	 * Returns the value of the '<em><b>Request Parameters java lang String java lang Boolean As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Parameters java lang String java lang Boolean As Map</em>' attribute.
	 * @see #setRequestParameters_java_lang_String__java_lang_Boolean_AsMap(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getMethodOptionsBuilder_apigateway_RequestParameters_java_lang_String__java_lang_Boolean_AsMap()
	 * @model
	 * @generated
	 */
	String getRequestParameters_java_lang_String__java_lang_Boolean_AsMap();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.MethodOptionsBuilder_apigateway#getRequestParameters_java_lang_String__java_lang_Boolean_AsMap <em>Request Parameters java lang String java lang Boolean As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Parameters java lang String java lang Boolean As Map</em>' attribute.
	 * @see #getRequestParameters_java_lang_String__java_lang_Boolean_AsMap()
	 * @generated
	 */
	void setRequestParameters_java_lang_String__java_lang_Boolean_AsMap(String value);

	/**
	 * Returns the value of the '<em><b>Request Validator With IRequest Validator software amazon awscdk services apigateway IRequest Validator As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Validator With IRequest Validator software amazon awscdk services apigateway IRequest Validator As Reference</em>' attribute.
	 * @see #setRequestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getMethodOptionsBuilder_apigateway_RequestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference()
	 * @model
	 * @generated
	 */
	String getRequestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.MethodOptionsBuilder_apigateway#getRequestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference <em>Request Validator With IRequest Validator software amazon awscdk services apigateway IRequest Validator As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Validator With IRequest Validator software amazon awscdk services apigateway IRequest Validator As Reference</em>' attribute.
	 * @see #getRequestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference()
	 * @generated
	 */
	void setRequestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Request Validator Options With Request Validator Options software amazon awscdk services apigateway Request Validator Options As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Validator Options With Request Validator Options software amazon awscdk services apigateway Request Validator Options As Reference</em>' attribute.
	 * @see #setRequestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getMethodOptionsBuilder_apigateway_RequestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference()
	 * @model
	 * @generated
	 */
	String getRequestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.MethodOptionsBuilder_apigateway#getRequestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference <em>Request Validator Options With Request Validator Options software amazon awscdk services apigateway Request Validator Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Validator Options With Request Validator Options software amazon awscdk services apigateway Request Validator Options As Reference</em>' attribute.
	 * @see #getRequestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference()
	 * @generated
	 */
	void setRequestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.apigateway.MethodOptions"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getMethodOptionsBuilder_apigateway_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.apigateway.MethodOptions" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getMethodOptionsBuilder_apigateway_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.MethodOptionsBuilder_apigateway#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getMethodOptionsBuilder_apigateway_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.MethodOptionsBuilder_apigateway#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getMethodOptionsBuilder_apigateway_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.MethodOptionsBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // MethodOptionsBuilder_apigateway
