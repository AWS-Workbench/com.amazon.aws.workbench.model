/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cors Options Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CorsOptionsBuilder_apigateway#getAllowOrigins_java_lang_String_AsList <em>Allow Origins java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CorsOptionsBuilder_apigateway#getAllowCredentials_java_lang_Boolean_ <em>Allow Credentials java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CorsOptionsBuilder_apigateway#getAllowHeaders_java_lang_String_AsList <em>Allow Headers java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CorsOptionsBuilder_apigateway#getAllowMethods_java_lang_String_AsList <em>Allow Methods java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CorsOptionsBuilder_apigateway#getDisableCache_java_lang_Boolean_ <em>Disable Cache java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CorsOptionsBuilder_apigateway#getExposeHeaders_java_lang_String_AsList <em>Expose Headers java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CorsOptionsBuilder_apigateway#getMaxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Max Age With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CorsOptionsBuilder_apigateway#getStatusCode_java_lang_Number_ <em>Status Code java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CorsOptionsBuilder_apigateway#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CorsOptionsBuilder_apigateway#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CorsOptionsBuilder_apigateway#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CorsOptionsBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCorsOptionsBuilder_apigateway()
 * @model
 * @generated
 */
public interface CorsOptionsBuilder_apigateway extends EObject {
	/**
	 * Returns the value of the '<em><b>Allow Origins java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Origins java lang String As List</em>' attribute.
	 * @see #setAllowOrigins_java_lang_String_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCorsOptionsBuilder_apigateway_AllowOrigins_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getAllowOrigins_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CorsOptionsBuilder_apigateway#getAllowOrigins_java_lang_String_AsList <em>Allow Origins java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Origins java lang String As List</em>' attribute.
	 * @see #getAllowOrigins_java_lang_String_AsList()
	 * @generated
	 */
	void setAllowOrigins_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Allow Credentials java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Credentials java lang Boolean </em>' attribute.
	 * @see #setAllowCredentials_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCorsOptionsBuilder_apigateway_AllowCredentials_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getAllowCredentials_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CorsOptionsBuilder_apigateway#getAllowCredentials_java_lang_Boolean_ <em>Allow Credentials java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Credentials java lang Boolean </em>' attribute.
	 * @see #getAllowCredentials_java_lang_Boolean_()
	 * @generated
	 */
	void setAllowCredentials_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Headers java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Headers java lang String As List</em>' attribute.
	 * @see #setAllowHeaders_java_lang_String_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCorsOptionsBuilder_apigateway_AllowHeaders_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getAllowHeaders_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CorsOptionsBuilder_apigateway#getAllowHeaders_java_lang_String_AsList <em>Allow Headers java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Headers java lang String As List</em>' attribute.
	 * @see #getAllowHeaders_java_lang_String_AsList()
	 * @generated
	 */
	void setAllowHeaders_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Allow Methods java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Methods java lang String As List</em>' attribute.
	 * @see #setAllowMethods_java_lang_String_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCorsOptionsBuilder_apigateway_AllowMethods_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getAllowMethods_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CorsOptionsBuilder_apigateway#getAllowMethods_java_lang_String_AsList <em>Allow Methods java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Methods java lang String As List</em>' attribute.
	 * @see #getAllowMethods_java_lang_String_AsList()
	 * @generated
	 */
	void setAllowMethods_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Disable Cache java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable Cache java lang Boolean </em>' attribute.
	 * @see #setDisableCache_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCorsOptionsBuilder_apigateway_DisableCache_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getDisableCache_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CorsOptionsBuilder_apigateway#getDisableCache_java_lang_Boolean_ <em>Disable Cache java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable Cache java lang Boolean </em>' attribute.
	 * @see #getDisableCache_java_lang_Boolean_()
	 * @generated
	 */
	void setDisableCache_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Expose Headers java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expose Headers java lang String As List</em>' attribute.
	 * @see #setExposeHeaders_java_lang_String_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCorsOptionsBuilder_apigateway_ExposeHeaders_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getExposeHeaders_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CorsOptionsBuilder_apigateway#getExposeHeaders_java_lang_String_AsList <em>Expose Headers java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expose Headers java lang String As List</em>' attribute.
	 * @see #getExposeHeaders_java_lang_String_AsList()
	 * @generated
	 */
	void setExposeHeaders_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Max Age With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Age With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setMaxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCorsOptionsBuilder_apigateway_MaxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getMaxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CorsOptionsBuilder_apigateway#getMaxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Max Age With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Age With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getMaxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setMaxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Status Code java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Code java lang Number </em>' attribute.
	 * @see #setStatusCode_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCorsOptionsBuilder_apigateway_StatusCode_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getStatusCode_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CorsOptionsBuilder_apigateway#getStatusCode_java_lang_Number_ <em>Status Code java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Code java lang Number </em>' attribute.
	 * @see #getStatusCode_java_lang_Number_()
	 * @generated
	 */
	void setStatusCode_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.apigateway.CorsOptions"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCorsOptionsBuilder_apigateway_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.apigateway.CorsOptions" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCorsOptionsBuilder_apigateway_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CorsOptionsBuilder_apigateway#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCorsOptionsBuilder_apigateway_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CorsOptionsBuilder_apigateway#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCorsOptionsBuilder_apigateway_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CorsOptionsBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // CorsOptionsBuilder_apigateway
