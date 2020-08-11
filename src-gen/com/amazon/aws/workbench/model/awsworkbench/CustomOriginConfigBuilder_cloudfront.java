/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Origin Config Builder cloudfront</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CustomOriginConfigBuilder_cloudfront#getDomainName_java_lang_String_ <em>Domain Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CustomOriginConfigBuilder_cloudfront#getAllowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsList <em>Allowed Origin Ssl Versions software amazon awscdk services cloudfront Origin Ssl Policy As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CustomOriginConfigBuilder_cloudfront#getHttpPort_java_lang_Number_ <em>Http Port java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CustomOriginConfigBuilder_cloudfront#getHttpsPort_java_lang_Number_ <em>Https Port java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CustomOriginConfigBuilder_cloudfront#getOriginKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Origin Keepalive Timeout With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CustomOriginConfigBuilder_cloudfront#getOriginProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy_ <em>Origin Protocol Policy software amazon awscdk services cloudfront Origin Protocol Policy </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CustomOriginConfigBuilder_cloudfront#getOriginReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Origin Read Timeout With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CustomOriginConfigBuilder_cloudfront#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CustomOriginConfigBuilder_cloudfront#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CustomOriginConfigBuilder_cloudfront#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CustomOriginConfigBuilder_cloudfront#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCustomOriginConfigBuilder_cloudfront()
 * @model
 * @generated
 */
public interface CustomOriginConfigBuilder_cloudfront extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Name java lang String </em>' attribute.
	 * @see #setDomainName_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCustomOriginConfigBuilder_cloudfront_DomainName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDomainName_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CustomOriginConfigBuilder_cloudfront#getDomainName_java_lang_String_ <em>Domain Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name java lang String </em>' attribute.
	 * @see #getDomainName_java_lang_String_()
	 * @generated
	 */
	void setDomainName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Allowed Origin Ssl Versions software amazon awscdk services cloudfront Origin Ssl Policy As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Origin Ssl Versions software amazon awscdk services cloudfront Origin Ssl Policy As List</em>' attribute.
	 * @see #setAllowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCustomOriginConfigBuilder_cloudfront_AllowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsList()
	 * @model
	 * @generated
	 */
	String getAllowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CustomOriginConfigBuilder_cloudfront#getAllowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsList <em>Allowed Origin Ssl Versions software amazon awscdk services cloudfront Origin Ssl Policy As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Origin Ssl Versions software amazon awscdk services cloudfront Origin Ssl Policy As List</em>' attribute.
	 * @see #getAllowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsList()
	 * @generated
	 */
	void setAllowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Http Port java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Port java lang Number </em>' attribute.
	 * @see #setHttpPort_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCustomOriginConfigBuilder_cloudfront_HttpPort_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getHttpPort_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CustomOriginConfigBuilder_cloudfront#getHttpPort_java_lang_Number_ <em>Http Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Port java lang Number </em>' attribute.
	 * @see #getHttpPort_java_lang_Number_()
	 * @generated
	 */
	void setHttpPort_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Https Port java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Https Port java lang Number </em>' attribute.
	 * @see #setHttpsPort_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCustomOriginConfigBuilder_cloudfront_HttpsPort_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getHttpsPort_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CustomOriginConfigBuilder_cloudfront#getHttpsPort_java_lang_Number_ <em>Https Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Https Port java lang Number </em>' attribute.
	 * @see #getHttpsPort_java_lang_Number_()
	 * @generated
	 */
	void setHttpsPort_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Origin Keepalive Timeout With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Keepalive Timeout With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setOriginKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCustomOriginConfigBuilder_cloudfront_OriginKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getOriginKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CustomOriginConfigBuilder_cloudfront#getOriginKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Origin Keepalive Timeout With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Keepalive Timeout With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getOriginKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setOriginKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Origin Protocol Policy software amazon awscdk services cloudfront Origin Protocol Policy </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.OriginProtocolPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Protocol Policy software amazon awscdk services cloudfront Origin Protocol Policy </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.OriginProtocolPolicy
	 * @see #setOriginProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy_(OriginProtocolPolicy)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCustomOriginConfigBuilder_cloudfront_OriginProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.OriginProtocolPolicy"
	 * @generated
	 */
	OriginProtocolPolicy getOriginProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CustomOriginConfigBuilder_cloudfront#getOriginProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy_ <em>Origin Protocol Policy software amazon awscdk services cloudfront Origin Protocol Policy </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Protocol Policy software amazon awscdk services cloudfront Origin Protocol Policy </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.OriginProtocolPolicy
	 * @see #getOriginProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy_()
	 * @generated
	 */
	void setOriginProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy_(
			OriginProtocolPolicy value);

	/**
	 * Returns the value of the '<em><b>Origin Read Timeout With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Read Timeout With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setOriginReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCustomOriginConfigBuilder_cloudfront_OriginReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getOriginReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CustomOriginConfigBuilder_cloudfront#getOriginReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Origin Read Timeout With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Read Timeout With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getOriginReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setOriginReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.cloudfront.CustomOriginConfig"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCustomOriginConfigBuilder_cloudfront_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.cloudfront.CustomOriginConfig" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCustomOriginConfigBuilder_cloudfront_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CustomOriginConfigBuilder_cloudfront#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCustomOriginConfigBuilder_cloudfront_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CustomOriginConfigBuilder_cloudfront#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCustomOriginConfigBuilder_cloudfront_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CustomOriginConfigBuilder_cloudfront#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // CustomOriginConfigBuilder_cloudfront
