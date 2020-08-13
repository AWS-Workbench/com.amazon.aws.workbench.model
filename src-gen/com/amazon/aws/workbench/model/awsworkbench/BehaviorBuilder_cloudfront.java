/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Builder cloudfront</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront#getAllowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods_ <em>Allowed Methods software amazon awscdk services cloudfront Cloud Front Allowed Methods </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront#getCachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods_ <em>Cached Methods software amazon awscdk services cloudfront Cloud Front Allowed Cached Methods </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront#getCompress_java_lang_Boolean_ <em>Compress java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront#getDefaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Default Ttl With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront#getForwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReference <em>Forwarded Values With Forwarded Values Property software amazon awscdk services cloudfront Cfn Distribution Forwarded Values Property As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront#getIsDefaultBehavior_java_lang_Boolean_ <em>Is Default Behavior java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront#getLambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsList <em>Lambda Function Associations software amazon awscdk services cloudfront Lambda Function Association As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront#getMaxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Max Ttl With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront#getMinTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Min Ttl With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront#getPathPattern_java_lang_String_ <em>Path Pattern java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront#getTrustedSigners_java_lang_String_AsList <em>Trusted Signers java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBehaviorBuilder_cloudfront()
 * @model
 * @generated
 */
public interface BehaviorBuilder_cloudfront extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Allowed Methods software amazon awscdk services cloudfront Cloud Front Allowed Methods </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontAllowedMethods}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Methods software amazon awscdk services cloudfront Cloud Front Allowed Methods </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.CloudFrontAllowedMethods
	 * @see #setAllowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods_(CloudFrontAllowedMethods)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBehaviorBuilder_cloudfront_AllowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.CloudFrontAllowedMethods"
	 * @generated
	 */
	CloudFrontAllowedMethods getAllowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront#getAllowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods_ <em>Allowed Methods software amazon awscdk services cloudfront Cloud Front Allowed Methods </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Methods software amazon awscdk services cloudfront Cloud Front Allowed Methods </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.CloudFrontAllowedMethods
	 * @see #getAllowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods_()
	 * @generated
	 */
	void setAllowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods_(
			CloudFrontAllowedMethods value);

	/**
	 * Returns the value of the '<em><b>Cached Methods software amazon awscdk services cloudfront Cloud Front Allowed Cached Methods </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontAllowedCachedMethods}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cached Methods software amazon awscdk services cloudfront Cloud Front Allowed Cached Methods </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.CloudFrontAllowedCachedMethods
	 * @see #setCachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods_(CloudFrontAllowedCachedMethods)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBehaviorBuilder_cloudfront_CachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.CloudFrontAllowedCachedMethods"
	 * @generated
	 */
	CloudFrontAllowedCachedMethods getCachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront#getCachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods_ <em>Cached Methods software amazon awscdk services cloudfront Cloud Front Allowed Cached Methods </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cached Methods software amazon awscdk services cloudfront Cloud Front Allowed Cached Methods </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.CloudFrontAllowedCachedMethods
	 * @see #getCachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods_()
	 * @generated
	 */
	void setCachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods_(
			CloudFrontAllowedCachedMethods value);

	/**
	 * Returns the value of the '<em><b>Compress java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compress java lang Boolean </em>' attribute.
	 * @see #setCompress_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBehaviorBuilder_cloudfront_Compress_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getCompress_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront#getCompress_java_lang_Boolean_ <em>Compress java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compress java lang Boolean </em>' attribute.
	 * @see #getCompress_java_lang_Boolean_()
	 * @generated
	 */
	void setCompress_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Default Ttl With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Ttl With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setDefaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBehaviorBuilder_cloudfront_DefaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getDefaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront#getDefaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Default Ttl With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Ttl With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getDefaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setDefaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Forwarded Values With Forwarded Values Property software amazon awscdk services cloudfront Cfn Distribution Forwarded Values Property As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forwarded Values With Forwarded Values Property software amazon awscdk services cloudfront Cfn Distribution Forwarded Values Property As Reference</em>' attribute.
	 * @see #setForwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBehaviorBuilder_cloudfront_ForwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReference()
	 * @model
	 * @generated
	 */
	String getForwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront#getForwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReference <em>Forwarded Values With Forwarded Values Property software amazon awscdk services cloudfront Cfn Distribution Forwarded Values Property As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forwarded Values With Forwarded Values Property software amazon awscdk services cloudfront Cfn Distribution Forwarded Values Property As Reference</em>' attribute.
	 * @see #getForwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReference()
	 * @generated
	 */
	void setForwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Is Default Behavior java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Default Behavior java lang Boolean </em>' attribute.
	 * @see #setIsDefaultBehavior_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBehaviorBuilder_cloudfront_IsDefaultBehavior_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getIsDefaultBehavior_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront#getIsDefaultBehavior_java_lang_Boolean_ <em>Is Default Behavior java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default Behavior java lang Boolean </em>' attribute.
	 * @see #getIsDefaultBehavior_java_lang_Boolean_()
	 * @generated
	 */
	void setIsDefaultBehavior_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Lambda Function Associations software amazon awscdk services cloudfront Lambda Function Association As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lambda Function Associations software amazon awscdk services cloudfront Lambda Function Association As List</em>' attribute.
	 * @see #setLambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBehaviorBuilder_cloudfront_LambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsList()
	 * @model
	 * @generated
	 */
	String getLambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront#getLambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsList <em>Lambda Function Associations software amazon awscdk services cloudfront Lambda Function Association As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lambda Function Associations software amazon awscdk services cloudfront Lambda Function Association As List</em>' attribute.
	 * @see #getLambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsList()
	 * @generated
	 */
	void setLambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsList(
			String value);

	/**
	 * Returns the value of the '<em><b>Max Ttl With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Ttl With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setMaxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBehaviorBuilder_cloudfront_MaxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getMaxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront#getMaxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Max Ttl With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Ttl With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getMaxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setMaxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Min Ttl With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Ttl With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setMinTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBehaviorBuilder_cloudfront_MinTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getMinTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront#getMinTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Min Ttl With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Ttl With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getMinTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setMinTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Path Pattern java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Pattern java lang String </em>' attribute.
	 * @see #setPathPattern_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBehaviorBuilder_cloudfront_PathPattern_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getPathPattern_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront#getPathPattern_java_lang_String_ <em>Path Pattern java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Pattern java lang String </em>' attribute.
	 * @see #getPathPattern_java_lang_String_()
	 * @generated
	 */
	void setPathPattern_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Trusted Signers java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trusted Signers java lang String As List</em>' attribute.
	 * @see #setTrustedSigners_java_lang_String_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBehaviorBuilder_cloudfront_TrustedSigners_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getTrustedSigners_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront#getTrustedSigners_java_lang_String_AsList <em>Trusted Signers java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trusted Signers java lang String As List</em>' attribute.
	 * @see #getTrustedSigners_java_lang_String_AsList()
	 * @generated
	 */
	void setTrustedSigners_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.cloudfront.Behavior"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBehaviorBuilder_cloudfront_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.cloudfront.Behavior" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBehaviorBuilder_cloudfront_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBehaviorBuilder_cloudfront_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBehaviorBuilder_cloudfront_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // BehaviorBuilder_cloudfront
