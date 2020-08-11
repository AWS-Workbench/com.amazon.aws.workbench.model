/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logging Configuration Builder cloudfront</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LoggingConfigurationBuilder_cloudfront#getBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference <em>Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LoggingConfigurationBuilder_cloudfront#getIncludeCookies_java_lang_Boolean_ <em>Include Cookies java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LoggingConfigurationBuilder_cloudfront#getPrefix_java_lang_String_ <em>Prefix java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LoggingConfigurationBuilder_cloudfront#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LoggingConfigurationBuilder_cloudfront#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LoggingConfigurationBuilder_cloudfront#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LoggingConfigurationBuilder_cloudfront#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLoggingConfigurationBuilder_cloudfront()
 * @model
 * @generated
 */
public interface LoggingConfigurationBuilder_cloudfront extends EObject {
	/**
	 * Returns the value of the '<em><b>Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</em>' attribute.
	 * @see #setBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLoggingConfigurationBuilder_cloudfront_BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference()
	 * @model
	 * @generated
	 */
	String getBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LoggingConfigurationBuilder_cloudfront#getBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference <em>Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</em>' attribute.
	 * @see #getBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference()
	 * @generated
	 */
	void setBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Include Cookies java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Cookies java lang Boolean </em>' attribute.
	 * @see #setIncludeCookies_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLoggingConfigurationBuilder_cloudfront_IncludeCookies_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getIncludeCookies_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LoggingConfigurationBuilder_cloudfront#getIncludeCookies_java_lang_Boolean_ <em>Include Cookies java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Cookies java lang Boolean </em>' attribute.
	 * @see #getIncludeCookies_java_lang_Boolean_()
	 * @generated
	 */
	void setIncludeCookies_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Prefix java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix java lang String </em>' attribute.
	 * @see #setPrefix_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLoggingConfigurationBuilder_cloudfront_Prefix_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getPrefix_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LoggingConfigurationBuilder_cloudfront#getPrefix_java_lang_String_ <em>Prefix java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix java lang String </em>' attribute.
	 * @see #getPrefix_java_lang_String_()
	 * @generated
	 */
	void setPrefix_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.cloudfront.LoggingConfiguration"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLoggingConfigurationBuilder_cloudfront_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.cloudfront.LoggingConfiguration" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLoggingConfigurationBuilder_cloudfront_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LoggingConfigurationBuilder_cloudfront#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLoggingConfigurationBuilder_cloudfront_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LoggingConfigurationBuilder_cloudfront#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLoggingConfigurationBuilder_cloudfront_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LoggingConfigurationBuilder_cloudfront#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // LoggingConfigurationBuilder_cloudfront
