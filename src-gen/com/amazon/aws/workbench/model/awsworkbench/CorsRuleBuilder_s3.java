/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cors Rule Builder s3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CorsRuleBuilder_s3#getAllowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsList <em>Allowed Methods software amazon awscdk services s3 Http Methods As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CorsRuleBuilder_s3#getAllowedOrigins_java_lang_String_AsList <em>Allowed Origins java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CorsRuleBuilder_s3#getAllowedHeaders_java_lang_String_AsList <em>Allowed Headers java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CorsRuleBuilder_s3#getExposedHeaders_java_lang_String_AsList <em>Exposed Headers java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CorsRuleBuilder_s3#getId_java_lang_String_ <em>Id java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CorsRuleBuilder_s3#getMaxAge_java_lang_Number_ <em>Max Age java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CorsRuleBuilder_s3#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CorsRuleBuilder_s3#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CorsRuleBuilder_s3#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CorsRuleBuilder_s3#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCorsRuleBuilder_s3()
 * @model
 * @generated
 */
public interface CorsRuleBuilder_s3 extends EObject {
	/**
	 * Returns the value of the '<em><b>Allowed Methods software amazon awscdk services s3 Http Methods As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Methods software amazon awscdk services s3 Http Methods As List</em>' attribute.
	 * @see #setAllowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCorsRuleBuilder_s3_AllowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsList()
	 * @model
	 * @generated
	 */
	String getAllowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CorsRuleBuilder_s3#getAllowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsList <em>Allowed Methods software amazon awscdk services s3 Http Methods As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Methods software amazon awscdk services s3 Http Methods As List</em>' attribute.
	 * @see #getAllowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsList()
	 * @generated
	 */
	void setAllowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Allowed Origins java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Origins java lang String As List</em>' attribute.
	 * @see #setAllowedOrigins_java_lang_String_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCorsRuleBuilder_s3_AllowedOrigins_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getAllowedOrigins_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CorsRuleBuilder_s3#getAllowedOrigins_java_lang_String_AsList <em>Allowed Origins java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Origins java lang String As List</em>' attribute.
	 * @see #getAllowedOrigins_java_lang_String_AsList()
	 * @generated
	 */
	void setAllowedOrigins_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Allowed Headers java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Headers java lang String As List</em>' attribute.
	 * @see #setAllowedHeaders_java_lang_String_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCorsRuleBuilder_s3_AllowedHeaders_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getAllowedHeaders_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CorsRuleBuilder_s3#getAllowedHeaders_java_lang_String_AsList <em>Allowed Headers java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Headers java lang String As List</em>' attribute.
	 * @see #getAllowedHeaders_java_lang_String_AsList()
	 * @generated
	 */
	void setAllowedHeaders_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Exposed Headers java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposed Headers java lang String As List</em>' attribute.
	 * @see #setExposedHeaders_java_lang_String_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCorsRuleBuilder_s3_ExposedHeaders_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getExposedHeaders_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CorsRuleBuilder_s3#getExposedHeaders_java_lang_String_AsList <em>Exposed Headers java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposed Headers java lang String As List</em>' attribute.
	 * @see #getExposedHeaders_java_lang_String_AsList()
	 * @generated
	 */
	void setExposedHeaders_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id java lang String </em>' attribute.
	 * @see #setId_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCorsRuleBuilder_s3_Id_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getId_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CorsRuleBuilder_s3#getId_java_lang_String_ <em>Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id java lang String </em>' attribute.
	 * @see #getId_java_lang_String_()
	 * @generated
	 */
	void setId_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Max Age java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Age java lang Number </em>' attribute.
	 * @see #setMaxAge_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCorsRuleBuilder_s3_MaxAge_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getMaxAge_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CorsRuleBuilder_s3#getMaxAge_java_lang_Number_ <em>Max Age java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Age java lang Number </em>' attribute.
	 * @see #getMaxAge_java_lang_Number_()
	 * @generated
	 */
	void setMaxAge_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.s3.CorsRule"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCorsRuleBuilder_s3_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.s3.CorsRule" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCorsRuleBuilder_s3_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CorsRuleBuilder_s3#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCorsRuleBuilder_s3_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CorsRuleBuilder_s3#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCorsRuleBuilder_s3_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CorsRuleBuilder_s3#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // CorsRuleBuilder_s3
