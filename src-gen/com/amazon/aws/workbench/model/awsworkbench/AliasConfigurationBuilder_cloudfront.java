/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alias Configuration Builder cloudfront</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AliasConfigurationBuilder_cloudfront#getAcmCertRef_java_lang_String_ <em>Acm Cert Ref java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AliasConfigurationBuilder_cloudfront#getNames_java_lang_String_AsList <em>Names java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AliasConfigurationBuilder_cloudfront#getSecurityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol_ <em>Security Policy software amazon awscdk services cloudfront Security Policy Protocol </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AliasConfigurationBuilder_cloudfront#getSslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod_ <em>Ssl Method software amazon awscdk services cloudfront SSL Method </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AliasConfigurationBuilder_cloudfront#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AliasConfigurationBuilder_cloudfront#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AliasConfigurationBuilder_cloudfront#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AliasConfigurationBuilder_cloudfront#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAliasConfigurationBuilder_cloudfront()
 * @model
 * @generated
 */
public interface AliasConfigurationBuilder_cloudfront extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Acm Cert Ref java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acm Cert Ref java lang String </em>' attribute.
	 * @see #setAcmCertRef_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAliasConfigurationBuilder_cloudfront_AcmCertRef_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getAcmCertRef_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AliasConfigurationBuilder_cloudfront#getAcmCertRef_java_lang_String_ <em>Acm Cert Ref java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acm Cert Ref java lang String </em>' attribute.
	 * @see #getAcmCertRef_java_lang_String_()
	 * @generated
	 */
	void setAcmCertRef_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Names java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Names java lang String As List</em>' attribute.
	 * @see #setNames_java_lang_String_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAliasConfigurationBuilder_cloudfront_Names_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getNames_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AliasConfigurationBuilder_cloudfront#getNames_java_lang_String_AsList <em>Names java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Names java lang String As List</em>' attribute.
	 * @see #getNames_java_lang_String_AsList()
	 * @generated
	 */
	void setNames_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Security Policy software amazon awscdk services cloudfront Security Policy Protocol </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.SecurityPolicyProtocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Policy software amazon awscdk services cloudfront Security Policy Protocol </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SecurityPolicyProtocol
	 * @see #setSecurityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol_(SecurityPolicyProtocol)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAliasConfigurationBuilder_cloudfront_SecurityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.SecurityPolicyProtocol"
	 * @generated
	 */
	SecurityPolicyProtocol getSecurityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AliasConfigurationBuilder_cloudfront#getSecurityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol_ <em>Security Policy software amazon awscdk services cloudfront Security Policy Protocol </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Policy software amazon awscdk services cloudfront Security Policy Protocol </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SecurityPolicyProtocol
	 * @see #getSecurityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol_()
	 * @generated
	 */
	void setSecurityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol_(
			SecurityPolicyProtocol value);

	/**
	 * Returns the value of the '<em><b>Ssl Method software amazon awscdk services cloudfront SSL Method </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.SSLMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssl Method software amazon awscdk services cloudfront SSL Method </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SSLMethod
	 * @see #setSslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod_(SSLMethod)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAliasConfigurationBuilder_cloudfront_SslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.SSLMethod"
	 * @generated
	 */
	SSLMethod getSslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AliasConfigurationBuilder_cloudfront#getSslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod_ <em>Ssl Method software amazon awscdk services cloudfront SSL Method </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssl Method software amazon awscdk services cloudfront SSL Method </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SSLMethod
	 * @see #getSslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod_()
	 * @generated
	 */
	void setSslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod_(SSLMethod value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.cloudfront.AliasConfiguration"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAliasConfigurationBuilder_cloudfront_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.cloudfront.AliasConfiguration" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAliasConfigurationBuilder_cloudfront_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AliasConfigurationBuilder_cloudfront#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAliasConfigurationBuilder_cloudfront_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AliasConfigurationBuilder_cloudfront#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAliasConfigurationBuilder_cloudfront_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AliasConfigurationBuilder_cloudfront#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // AliasConfigurationBuilder_cloudfront
