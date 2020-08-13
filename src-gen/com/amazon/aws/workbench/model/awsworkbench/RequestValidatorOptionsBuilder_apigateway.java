/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Validator Options Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.RequestValidatorOptionsBuilder_apigateway#getRequestValidatorName_java_lang_String_ <em>Request Validator Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.RequestValidatorOptionsBuilder_apigateway#getValidateRequestBody_java_lang_Boolean_ <em>Validate Request Body java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.RequestValidatorOptionsBuilder_apigateway#getValidateRequestParameters_java_lang_Boolean_ <em>Validate Request Parameters java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.RequestValidatorOptionsBuilder_apigateway#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.RequestValidatorOptionsBuilder_apigateway#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.RequestValidatorOptionsBuilder_apigateway#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.RequestValidatorOptionsBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRequestValidatorOptionsBuilder_apigateway()
 * @model
 * @generated
 */
public interface RequestValidatorOptionsBuilder_apigateway extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Request Validator Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Validator Name java lang String </em>' attribute.
	 * @see #setRequestValidatorName_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRequestValidatorOptionsBuilder_apigateway_RequestValidatorName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getRequestValidatorName_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.RequestValidatorOptionsBuilder_apigateway#getRequestValidatorName_java_lang_String_ <em>Request Validator Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Validator Name java lang String </em>' attribute.
	 * @see #getRequestValidatorName_java_lang_String_()
	 * @generated
	 */
	void setRequestValidatorName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Validate Request Body java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate Request Body java lang Boolean </em>' attribute.
	 * @see #setValidateRequestBody_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRequestValidatorOptionsBuilder_apigateway_ValidateRequestBody_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getValidateRequestBody_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.RequestValidatorOptionsBuilder_apigateway#getValidateRequestBody_java_lang_Boolean_ <em>Validate Request Body java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate Request Body java lang Boolean </em>' attribute.
	 * @see #getValidateRequestBody_java_lang_Boolean_()
	 * @generated
	 */
	void setValidateRequestBody_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Validate Request Parameters java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate Request Parameters java lang Boolean </em>' attribute.
	 * @see #setValidateRequestParameters_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRequestValidatorOptionsBuilder_apigateway_ValidateRequestParameters_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getValidateRequestParameters_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.RequestValidatorOptionsBuilder_apigateway#getValidateRequestParameters_java_lang_Boolean_ <em>Validate Request Parameters java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate Request Parameters java lang Boolean </em>' attribute.
	 * @see #getValidateRequestParameters_java_lang_Boolean_()
	 * @generated
	 */
	void setValidateRequestParameters_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.apigateway.RequestValidatorOptions"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRequestValidatorOptionsBuilder_apigateway_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.apigateway.RequestValidatorOptions" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRequestValidatorOptionsBuilder_apigateway_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.RequestValidatorOptionsBuilder_apigateway#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRequestValidatorOptionsBuilder_apigateway_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.RequestValidatorOptionsBuilder_apigateway#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRequestValidatorOptionsBuilder_apigateway_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.RequestValidatorOptionsBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // RequestValidatorOptionsBuilder_apigateway
