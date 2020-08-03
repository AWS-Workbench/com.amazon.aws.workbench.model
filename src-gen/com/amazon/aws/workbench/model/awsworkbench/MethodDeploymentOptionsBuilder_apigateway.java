/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Deployment Options Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.MethodDeploymentOptionsBuilder_apigateway#getCacheDataEncrypted_java_lang_Boolean_ <em>Cache Data Encrypted java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.MethodDeploymentOptionsBuilder_apigateway#getCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Cache Ttl With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.MethodDeploymentOptionsBuilder_apigateway#getCachingEnabled_java_lang_Boolean_ <em>Caching Enabled java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.MethodDeploymentOptionsBuilder_apigateway#getDataTraceEnabled_java_lang_Boolean_ <em>Data Trace Enabled java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.MethodDeploymentOptionsBuilder_apigateway#getLoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_ <em>Logging Level software amazon awscdk services apigateway Method Logging Level </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.MethodDeploymentOptionsBuilder_apigateway#getMetricsEnabled_java_lang_Boolean_ <em>Metrics Enabled java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.MethodDeploymentOptionsBuilder_apigateway#getThrottlingBurstLimit_java_lang_Number_ <em>Throttling Burst Limit java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.MethodDeploymentOptionsBuilder_apigateway#getThrottlingRateLimit_java_lang_Number_ <em>Throttling Rate Limit java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.MethodDeploymentOptionsBuilder_apigateway#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.MethodDeploymentOptionsBuilder_apigateway#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.MethodDeploymentOptionsBuilder_apigateway#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.MethodDeploymentOptionsBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getMethodDeploymentOptionsBuilder_apigateway()
 * @model
 * @generated
 */
public interface MethodDeploymentOptionsBuilder_apigateway extends EObject {
	/**
	 * Returns the value of the '<em><b>Cache Data Encrypted java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Data Encrypted java lang Boolean </em>' attribute.
	 * @see #setCacheDataEncrypted_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getMethodDeploymentOptionsBuilder_apigateway_CacheDataEncrypted_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getCacheDataEncrypted_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.MethodDeploymentOptionsBuilder_apigateway#getCacheDataEncrypted_java_lang_Boolean_ <em>Cache Data Encrypted java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Data Encrypted java lang Boolean </em>' attribute.
	 * @see #getCacheDataEncrypted_java_lang_Boolean_()
	 * @generated
	 */
	void setCacheDataEncrypted_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Cache Ttl With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Ttl With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getMethodDeploymentOptionsBuilder_apigateway_CacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.MethodDeploymentOptionsBuilder_apigateway#getCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Cache Ttl With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Ttl With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Caching Enabled java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caching Enabled java lang Boolean </em>' attribute.
	 * @see #setCachingEnabled_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getMethodDeploymentOptionsBuilder_apigateway_CachingEnabled_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getCachingEnabled_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.MethodDeploymentOptionsBuilder_apigateway#getCachingEnabled_java_lang_Boolean_ <em>Caching Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caching Enabled java lang Boolean </em>' attribute.
	 * @see #getCachingEnabled_java_lang_Boolean_()
	 * @generated
	 */
	void setCachingEnabled_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Data Trace Enabled java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Trace Enabled java lang Boolean </em>' attribute.
	 * @see #setDataTraceEnabled_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getMethodDeploymentOptionsBuilder_apigateway_DataTraceEnabled_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getDataTraceEnabled_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.MethodDeploymentOptionsBuilder_apigateway#getDataTraceEnabled_java_lang_Boolean_ <em>Data Trace Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Trace Enabled java lang Boolean </em>' attribute.
	 * @see #getDataTraceEnabled_java_lang_Boolean_()
	 * @generated
	 */
	void setDataTraceEnabled_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Logging Level software amazon awscdk services apigateway Method Logging Level </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.MethodLoggingLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logging Level software amazon awscdk services apigateway Method Logging Level </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.MethodLoggingLevel
	 * @see #setLoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_(MethodLoggingLevel)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getMethodDeploymentOptionsBuilder_apigateway_LoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.MethodLoggingLevel"
	 * @generated
	 */
	MethodLoggingLevel getLoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.MethodDeploymentOptionsBuilder_apigateway#getLoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_ <em>Logging Level software amazon awscdk services apigateway Method Logging Level </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logging Level software amazon awscdk services apigateway Method Logging Level </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.MethodLoggingLevel
	 * @see #getLoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_()
	 * @generated
	 */
	void setLoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_(MethodLoggingLevel value);

	/**
	 * Returns the value of the '<em><b>Metrics Enabled java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics Enabled java lang Boolean </em>' attribute.
	 * @see #setMetricsEnabled_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getMethodDeploymentOptionsBuilder_apigateway_MetricsEnabled_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getMetricsEnabled_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.MethodDeploymentOptionsBuilder_apigateway#getMetricsEnabled_java_lang_Boolean_ <em>Metrics Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metrics Enabled java lang Boolean </em>' attribute.
	 * @see #getMetricsEnabled_java_lang_Boolean_()
	 * @generated
	 */
	void setMetricsEnabled_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Throttling Burst Limit java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throttling Burst Limit java lang Number </em>' attribute.
	 * @see #setThrottlingBurstLimit_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getMethodDeploymentOptionsBuilder_apigateway_ThrottlingBurstLimit_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getThrottlingBurstLimit_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.MethodDeploymentOptionsBuilder_apigateway#getThrottlingBurstLimit_java_lang_Number_ <em>Throttling Burst Limit java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throttling Burst Limit java lang Number </em>' attribute.
	 * @see #getThrottlingBurstLimit_java_lang_Number_()
	 * @generated
	 */
	void setThrottlingBurstLimit_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Throttling Rate Limit java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throttling Rate Limit java lang Number </em>' attribute.
	 * @see #setThrottlingRateLimit_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getMethodDeploymentOptionsBuilder_apigateway_ThrottlingRateLimit_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getThrottlingRateLimit_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.MethodDeploymentOptionsBuilder_apigateway#getThrottlingRateLimit_java_lang_Number_ <em>Throttling Rate Limit java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throttling Rate Limit java lang Number </em>' attribute.
	 * @see #getThrottlingRateLimit_java_lang_Number_()
	 * @generated
	 */
	void setThrottlingRateLimit_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.apigateway.MethodDeploymentOptions"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getMethodDeploymentOptionsBuilder_apigateway_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.apigateway.MethodDeploymentOptions" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getMethodDeploymentOptionsBuilder_apigateway_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.MethodDeploymentOptionsBuilder_apigateway#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getMethodDeploymentOptionsBuilder_apigateway_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.MethodDeploymentOptionsBuilder_apigateway#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getMethodDeploymentOptionsBuilder_apigateway_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.MethodDeploymentOptionsBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // MethodDeploymentOptionsBuilder_apigateway
