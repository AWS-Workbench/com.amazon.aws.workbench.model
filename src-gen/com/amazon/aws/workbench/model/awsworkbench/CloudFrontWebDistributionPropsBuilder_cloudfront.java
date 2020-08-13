/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Front Web Distribution Props Builder cloudfront</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront#getOriginConfigs_software_amazon_awscdk_services_cloudfront_SourceConfiguration_AsList <em>Origin Configs software amazon awscdk services cloudfront Source Configuration As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront#getAliasConfigurationWithAliasConfiguration_software_amazon_awscdk_services_cloudfront_AliasConfiguration_AsReference <em>Alias Configuration With Alias Configuration software amazon awscdk services cloudfront Alias Configuration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront#getComment_java_lang_String_ <em>Comment java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront#getDefaultRootObject_java_lang_String_ <em>Default Root Object java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront#getEnableIpV6_java_lang_Boolean_ <em>Enable Ip V6 java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront#getErrorConfigurations_software_amazon_awscdk_services_cloudfront_CfnDistribution_CustomErrorResponseProperty_AsList <em>Error Configurations software amazon awscdk services cloudfront Cfn Distribution Custom Error Response Property As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront#getGeoRestrictionWithGeoRestriction_software_amazon_awscdk_services_cloudfront_GeoRestriction_AsReference <em>Geo Restriction With Geo Restriction software amazon awscdk services cloudfront Geo Restriction As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront#getHttpVersion_software_amazon_awscdk_services_cloudfront_HttpVersion_ <em>Http Version software amazon awscdk services cloudfront Http Version </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront#getLoggingConfigWithLoggingConfiguration_software_amazon_awscdk_services_cloudfront_LoggingConfiguration_AsReference <em>Logging Config With Logging Configuration software amazon awscdk services cloudfront Logging Configuration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront#getPriceClass_software_amazon_awscdk_services_cloudfront_PriceClass_ <em>Price Class software amazon awscdk services cloudfront Price Class </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront#getViewerCertificateWithViewerCertificate_software_amazon_awscdk_services_cloudfront_ViewerCertificate_AsReference <em>Viewer Certificate With Viewer Certificate software amazon awscdk services cloudfront Viewer Certificate As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront#getViewerProtocolPolicy_software_amazon_awscdk_services_cloudfront_ViewerProtocolPolicy_ <em>Viewer Protocol Policy software amazon awscdk services cloudfront Viewer Protocol Policy </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront#getWebAclId_java_lang_String_ <em>Web Acl Id java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCloudFrontWebDistributionPropsBuilder_cloudfront()
 * @model
 * @generated
 */
public interface CloudFrontWebDistributionPropsBuilder_cloudfront extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Origin Configs software amazon awscdk services cloudfront Source Configuration As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Configs software amazon awscdk services cloudfront Source Configuration As List</em>' attribute.
	 * @see #setOriginConfigs_software_amazon_awscdk_services_cloudfront_SourceConfiguration_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCloudFrontWebDistributionPropsBuilder_cloudfront_OriginConfigs_software_amazon_awscdk_services_cloudfront_SourceConfiguration_AsList()
	 * @model
	 * @generated
	 */
	String getOriginConfigs_software_amazon_awscdk_services_cloudfront_SourceConfiguration_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront#getOriginConfigs_software_amazon_awscdk_services_cloudfront_SourceConfiguration_AsList <em>Origin Configs software amazon awscdk services cloudfront Source Configuration As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Configs software amazon awscdk services cloudfront Source Configuration As List</em>' attribute.
	 * @see #getOriginConfigs_software_amazon_awscdk_services_cloudfront_SourceConfiguration_AsList()
	 * @generated
	 */
	void setOriginConfigs_software_amazon_awscdk_services_cloudfront_SourceConfiguration_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Alias Configuration With Alias Configuration software amazon awscdk services cloudfront Alias Configuration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias Configuration With Alias Configuration software amazon awscdk services cloudfront Alias Configuration As Reference</em>' attribute.
	 * @see #setAliasConfigurationWithAliasConfiguration_software_amazon_awscdk_services_cloudfront_AliasConfiguration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCloudFrontWebDistributionPropsBuilder_cloudfront_AliasConfigurationWithAliasConfiguration_software_amazon_awscdk_services_cloudfront_AliasConfiguration_AsReference()
	 * @model
	 * @generated
	 */
	String getAliasConfigurationWithAliasConfiguration_software_amazon_awscdk_services_cloudfront_AliasConfiguration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront#getAliasConfigurationWithAliasConfiguration_software_amazon_awscdk_services_cloudfront_AliasConfiguration_AsReference <em>Alias Configuration With Alias Configuration software amazon awscdk services cloudfront Alias Configuration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias Configuration With Alias Configuration software amazon awscdk services cloudfront Alias Configuration As Reference</em>' attribute.
	 * @see #getAliasConfigurationWithAliasConfiguration_software_amazon_awscdk_services_cloudfront_AliasConfiguration_AsReference()
	 * @generated
	 */
	void setAliasConfigurationWithAliasConfiguration_software_amazon_awscdk_services_cloudfront_AliasConfiguration_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Comment java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment java lang String </em>' attribute.
	 * @see #setComment_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCloudFrontWebDistributionPropsBuilder_cloudfront_Comment_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getComment_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront#getComment_java_lang_String_ <em>Comment java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment java lang String </em>' attribute.
	 * @see #getComment_java_lang_String_()
	 * @generated
	 */
	void setComment_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Default Root Object java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Root Object java lang String </em>' attribute.
	 * @see #setDefaultRootObject_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCloudFrontWebDistributionPropsBuilder_cloudfront_DefaultRootObject_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDefaultRootObject_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront#getDefaultRootObject_java_lang_String_ <em>Default Root Object java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Root Object java lang String </em>' attribute.
	 * @see #getDefaultRootObject_java_lang_String_()
	 * @generated
	 */
	void setDefaultRootObject_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Enable Ip V6 java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Ip V6 java lang Boolean </em>' attribute.
	 * @see #setEnableIpV6_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCloudFrontWebDistributionPropsBuilder_cloudfront_EnableIpV6_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getEnableIpV6_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront#getEnableIpV6_java_lang_Boolean_ <em>Enable Ip V6 java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Ip V6 java lang Boolean </em>' attribute.
	 * @see #getEnableIpV6_java_lang_Boolean_()
	 * @generated
	 */
	void setEnableIpV6_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Error Configurations software amazon awscdk services cloudfront Cfn Distribution Custom Error Response Property As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Configurations software amazon awscdk services cloudfront Cfn Distribution Custom Error Response Property As List</em>' attribute.
	 * @see #setErrorConfigurations_software_amazon_awscdk_services_cloudfront_CfnDistribution_CustomErrorResponseProperty_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCloudFrontWebDistributionPropsBuilder_cloudfront_ErrorConfigurations_software_amazon_awscdk_services_cloudfront_CfnDistribution_CustomErrorResponseProperty_AsList()
	 * @model
	 * @generated
	 */
	String getErrorConfigurations_software_amazon_awscdk_services_cloudfront_CfnDistribution_CustomErrorResponseProperty_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront#getErrorConfigurations_software_amazon_awscdk_services_cloudfront_CfnDistribution_CustomErrorResponseProperty_AsList <em>Error Configurations software amazon awscdk services cloudfront Cfn Distribution Custom Error Response Property As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Configurations software amazon awscdk services cloudfront Cfn Distribution Custom Error Response Property As List</em>' attribute.
	 * @see #getErrorConfigurations_software_amazon_awscdk_services_cloudfront_CfnDistribution_CustomErrorResponseProperty_AsList()
	 * @generated
	 */
	void setErrorConfigurations_software_amazon_awscdk_services_cloudfront_CfnDistribution_CustomErrorResponseProperty_AsList(
			String value);

	/**
	 * Returns the value of the '<em><b>Geo Restriction With Geo Restriction software amazon awscdk services cloudfront Geo Restriction As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Restriction With Geo Restriction software amazon awscdk services cloudfront Geo Restriction As Reference</em>' attribute.
	 * @see #setGeoRestrictionWithGeoRestriction_software_amazon_awscdk_services_cloudfront_GeoRestriction_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCloudFrontWebDistributionPropsBuilder_cloudfront_GeoRestrictionWithGeoRestriction_software_amazon_awscdk_services_cloudfront_GeoRestriction_AsReference()
	 * @model
	 * @generated
	 */
	String getGeoRestrictionWithGeoRestriction_software_amazon_awscdk_services_cloudfront_GeoRestriction_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront#getGeoRestrictionWithGeoRestriction_software_amazon_awscdk_services_cloudfront_GeoRestriction_AsReference <em>Geo Restriction With Geo Restriction software amazon awscdk services cloudfront Geo Restriction As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Restriction With Geo Restriction software amazon awscdk services cloudfront Geo Restriction As Reference</em>' attribute.
	 * @see #getGeoRestrictionWithGeoRestriction_software_amazon_awscdk_services_cloudfront_GeoRestriction_AsReference()
	 * @generated
	 */
	void setGeoRestrictionWithGeoRestriction_software_amazon_awscdk_services_cloudfront_GeoRestriction_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Http Version software amazon awscdk services cloudfront Http Version </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.HttpVersion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Version software amazon awscdk services cloudfront Http Version </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.HttpVersion
	 * @see #setHttpVersion_software_amazon_awscdk_services_cloudfront_HttpVersion_(HttpVersion)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCloudFrontWebDistributionPropsBuilder_cloudfront_HttpVersion_software_amazon_awscdk_services_cloudfront_HttpVersion_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.HttpVersion"
	 * @generated
	 */
	HttpVersion getHttpVersion_software_amazon_awscdk_services_cloudfront_HttpVersion_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront#getHttpVersion_software_amazon_awscdk_services_cloudfront_HttpVersion_ <em>Http Version software amazon awscdk services cloudfront Http Version </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Version software amazon awscdk services cloudfront Http Version </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.HttpVersion
	 * @see #getHttpVersion_software_amazon_awscdk_services_cloudfront_HttpVersion_()
	 * @generated
	 */
	void setHttpVersion_software_amazon_awscdk_services_cloudfront_HttpVersion_(HttpVersion value);

	/**
	 * Returns the value of the '<em><b>Logging Config With Logging Configuration software amazon awscdk services cloudfront Logging Configuration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logging Config With Logging Configuration software amazon awscdk services cloudfront Logging Configuration As Reference</em>' attribute.
	 * @see #setLoggingConfigWithLoggingConfiguration_software_amazon_awscdk_services_cloudfront_LoggingConfiguration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCloudFrontWebDistributionPropsBuilder_cloudfront_LoggingConfigWithLoggingConfiguration_software_amazon_awscdk_services_cloudfront_LoggingConfiguration_AsReference()
	 * @model
	 * @generated
	 */
	String getLoggingConfigWithLoggingConfiguration_software_amazon_awscdk_services_cloudfront_LoggingConfiguration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront#getLoggingConfigWithLoggingConfiguration_software_amazon_awscdk_services_cloudfront_LoggingConfiguration_AsReference <em>Logging Config With Logging Configuration software amazon awscdk services cloudfront Logging Configuration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logging Config With Logging Configuration software amazon awscdk services cloudfront Logging Configuration As Reference</em>' attribute.
	 * @see #getLoggingConfigWithLoggingConfiguration_software_amazon_awscdk_services_cloudfront_LoggingConfiguration_AsReference()
	 * @generated
	 */
	void setLoggingConfigWithLoggingConfiguration_software_amazon_awscdk_services_cloudfront_LoggingConfiguration_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Price Class software amazon awscdk services cloudfront Price Class </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.PriceClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price Class software amazon awscdk services cloudfront Price Class </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PriceClass
	 * @see #setPriceClass_software_amazon_awscdk_services_cloudfront_PriceClass_(PriceClass)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCloudFrontWebDistributionPropsBuilder_cloudfront_PriceClass_software_amazon_awscdk_services_cloudfront_PriceClass_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.PriceClass"
	 * @generated
	 */
	PriceClass getPriceClass_software_amazon_awscdk_services_cloudfront_PriceClass_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront#getPriceClass_software_amazon_awscdk_services_cloudfront_PriceClass_ <em>Price Class software amazon awscdk services cloudfront Price Class </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price Class software amazon awscdk services cloudfront Price Class </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PriceClass
	 * @see #getPriceClass_software_amazon_awscdk_services_cloudfront_PriceClass_()
	 * @generated
	 */
	void setPriceClass_software_amazon_awscdk_services_cloudfront_PriceClass_(PriceClass value);

	/**
	 * Returns the value of the '<em><b>Viewer Certificate With Viewer Certificate software amazon awscdk services cloudfront Viewer Certificate As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewer Certificate With Viewer Certificate software amazon awscdk services cloudfront Viewer Certificate As Reference</em>' attribute.
	 * @see #setViewerCertificateWithViewerCertificate_software_amazon_awscdk_services_cloudfront_ViewerCertificate_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCloudFrontWebDistributionPropsBuilder_cloudfront_ViewerCertificateWithViewerCertificate_software_amazon_awscdk_services_cloudfront_ViewerCertificate_AsReference()
	 * @model
	 * @generated
	 */
	String getViewerCertificateWithViewerCertificate_software_amazon_awscdk_services_cloudfront_ViewerCertificate_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront#getViewerCertificateWithViewerCertificate_software_amazon_awscdk_services_cloudfront_ViewerCertificate_AsReference <em>Viewer Certificate With Viewer Certificate software amazon awscdk services cloudfront Viewer Certificate As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Viewer Certificate With Viewer Certificate software amazon awscdk services cloudfront Viewer Certificate As Reference</em>' attribute.
	 * @see #getViewerCertificateWithViewerCertificate_software_amazon_awscdk_services_cloudfront_ViewerCertificate_AsReference()
	 * @generated
	 */
	void setViewerCertificateWithViewerCertificate_software_amazon_awscdk_services_cloudfront_ViewerCertificate_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Viewer Protocol Policy software amazon awscdk services cloudfront Viewer Protocol Policy </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.ViewerProtocolPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewer Protocol Policy software amazon awscdk services cloudfront Viewer Protocol Policy </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ViewerProtocolPolicy
	 * @see #setViewerProtocolPolicy_software_amazon_awscdk_services_cloudfront_ViewerProtocolPolicy_(ViewerProtocolPolicy)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCloudFrontWebDistributionPropsBuilder_cloudfront_ViewerProtocolPolicy_software_amazon_awscdk_services_cloudfront_ViewerProtocolPolicy_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.ViewerProtocolPolicy"
	 * @generated
	 */
	ViewerProtocolPolicy getViewerProtocolPolicy_software_amazon_awscdk_services_cloudfront_ViewerProtocolPolicy_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront#getViewerProtocolPolicy_software_amazon_awscdk_services_cloudfront_ViewerProtocolPolicy_ <em>Viewer Protocol Policy software amazon awscdk services cloudfront Viewer Protocol Policy </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Viewer Protocol Policy software amazon awscdk services cloudfront Viewer Protocol Policy </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ViewerProtocolPolicy
	 * @see #getViewerProtocolPolicy_software_amazon_awscdk_services_cloudfront_ViewerProtocolPolicy_()
	 * @generated
	 */
	void setViewerProtocolPolicy_software_amazon_awscdk_services_cloudfront_ViewerProtocolPolicy_(
			ViewerProtocolPolicy value);

	/**
	 * Returns the value of the '<em><b>Web Acl Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Acl Id java lang String </em>' attribute.
	 * @see #setWebAclId_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCloudFrontWebDistributionPropsBuilder_cloudfront_WebAclId_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getWebAclId_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront#getWebAclId_java_lang_String_ <em>Web Acl Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Acl Id java lang String </em>' attribute.
	 * @see #getWebAclId_java_lang_String_()
	 * @generated
	 */
	void setWebAclId_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCloudFrontWebDistributionPropsBuilder_cloudfront_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCloudFrontWebDistributionPropsBuilder_cloudfront_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCloudFrontWebDistributionPropsBuilder_cloudfront_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCloudFrontWebDistributionPropsBuilder_cloudfront_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // CloudFrontWebDistributionPropsBuilder_cloudfront
