/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront;
import com.amazon.aws.workbench.model.awsworkbench.CloudFrontAllowedCachedMethods;
import com.amazon.aws.workbench.model.awsworkbench.CloudFrontAllowedMethods;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Builder cloudfront</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BehaviorBuilder_cloudfrontImpl#getAllowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods_ <em>Allowed Methods software amazon awscdk services cloudfront Cloud Front Allowed Methods </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BehaviorBuilder_cloudfrontImpl#getCachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods_ <em>Cached Methods software amazon awscdk services cloudfront Cloud Front Allowed Cached Methods </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BehaviorBuilder_cloudfrontImpl#getCompress_java_lang_Boolean_ <em>Compress java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BehaviorBuilder_cloudfrontImpl#getDefaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Default Ttl With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BehaviorBuilder_cloudfrontImpl#getForwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReference <em>Forwarded Values With Forwarded Values Property software amazon awscdk services cloudfront Cfn Distribution Forwarded Values Property As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BehaviorBuilder_cloudfrontImpl#getIsDefaultBehavior_java_lang_Boolean_ <em>Is Default Behavior java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BehaviorBuilder_cloudfrontImpl#getLambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsList <em>Lambda Function Associations software amazon awscdk services cloudfront Lambda Function Association As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BehaviorBuilder_cloudfrontImpl#getMaxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Max Ttl With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BehaviorBuilder_cloudfrontImpl#getMinTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Min Ttl With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BehaviorBuilder_cloudfrontImpl#getPathPattern_java_lang_String_ <em>Path Pattern java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BehaviorBuilder_cloudfrontImpl#getTrustedSigners_java_lang_String_AsList <em>Trusted Signers java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BehaviorBuilder_cloudfrontImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BehaviorBuilder_cloudfrontImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BehaviorBuilder_cloudfrontImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BehaviorBuilder_cloudfrontImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorBuilder_cloudfrontImpl extends ServiceResourcesImpl implements BehaviorBuilder_cloudfront {
	/**
	 * The default value of the '{@link #getAllowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods_() <em>Allowed Methods software amazon awscdk services cloudfront Cloud Front Allowed Methods </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods_()
	 * @generated
	 * @ordered
	 */
	protected static final CloudFrontAllowedMethods ALLOWED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CLOUD_FRONT_ALLOWED_METHODS__EDEFAULT = CloudFrontAllowedMethods.GET_HEAD;

	/**
	 * The cached value of the '{@link #getAllowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods_() <em>Allowed Methods software amazon awscdk services cloudfront Cloud Front Allowed Methods </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods_()
	 * @generated
	 * @ordered
	 */
	protected CloudFrontAllowedMethods allowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods_ = ALLOWED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CLOUD_FRONT_ALLOWED_METHODS__EDEFAULT;

	/**
	 * The default value of the '{@link #getCachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods_() <em>Cached Methods software amazon awscdk services cloudfront Cloud Front Allowed Cached Methods </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods_()
	 * @generated
	 * @ordered
	 */
	protected static final CloudFrontAllowedCachedMethods CACHED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CLOUD_FRONT_ALLOWED_CACHED_METHODS__EDEFAULT = CloudFrontAllowedCachedMethods.GET_HEAD;

	/**
	 * The cached value of the '{@link #getCachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods_() <em>Cached Methods software amazon awscdk services cloudfront Cloud Front Allowed Cached Methods </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods_()
	 * @generated
	 * @ordered
	 */
	protected CloudFrontAllowedCachedMethods cachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods_ = CACHED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CLOUD_FRONT_ALLOWED_CACHED_METHODS__EDEFAULT;

	/**
	 * The default value of the '{@link #getCompress_java_lang_Boolean_() <em>Compress java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompress_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean COMPRESS_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompress_java_lang_Boolean_() <em>Compress java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompress_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean compress_java_lang_Boolean_ = COMPRESS_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Default Ttl With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Default Ttl With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String defaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference = DEFAULT_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getForwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReference() <em>Forwarded Values With Forwarded Values Property software amazon awscdk services cloudfront Cfn Distribution Forwarded Values Property As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String FORWARDED_VALUES_WITH_FORWARDED_VALUES_PROPERTY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CFN_DISTRIBUTION_FORWARDED_VALUES_PROPERTY_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReference() <em>Forwarded Values With Forwarded Values Property software amazon awscdk services cloudfront Cfn Distribution Forwarded Values Property As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String forwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReference = FORWARDED_VALUES_WITH_FORWARDED_VALUES_PROPERTY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CFN_DISTRIBUTION_FORWARDED_VALUES_PROPERTY_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsDefaultBehavior_java_lang_Boolean_() <em>Is Default Behavior java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefaultBehavior_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_DEFAULT_BEHAVIOR_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsDefaultBehavior_java_lang_Boolean_() <em>Is Default Behavior java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefaultBehavior_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean isDefaultBehavior_java_lang_Boolean_ = IS_DEFAULT_BEHAVIOR_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getLambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsList() <em>Lambda Function Associations software amazon awscdk services cloudfront Lambda Function Association As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String LAMBDA_FUNCTION_ASSOCIATIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_LAMBDA_FUNCTION_ASSOCIATION_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsList() <em>Lambda Function Associations software amazon awscdk services cloudfront Lambda Function Association As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsList()
	 * @generated
	 * @ordered
	 */
	protected String lambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsList = LAMBDA_FUNCTION_ASSOCIATIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_LAMBDA_FUNCTION_ASSOCIATION_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Max Ttl With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Max Ttl With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String maxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference = MAX_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Min Ttl With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Min Ttl With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String minTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference = MIN_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathPattern_java_lang_String_() <em>Path Pattern java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathPattern_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_PATTERN_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathPattern_java_lang_String_() <em>Path Pattern java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathPattern_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String pathPattern_java_lang_String_ = PATH_PATTERN_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getTrustedSigners_java_lang_String_AsList() <em>Trusted Signers java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustedSigners_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String TRUSTED_SIGNERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrustedSigners_java_lang_String_AsList() <em>Trusted Signers java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustedSigners_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String trustedSigners_java_lang_String_AsList = TRUSTED_SIGNERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.cloudfront.Behavior";

	/**
	 * The cached value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected String generatedClassName = GENERATED_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected String varName = VAR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalCode() <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalCode() <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCode()
	 * @generated
	 * @ordered
	 */
	protected String additionalCode = ADDITIONAL_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorBuilder_cloudfrontImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.BEHAVIOR_BUILDER_CLOUDFRONT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CloudFrontAllowedMethods getAllowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods_() {
		return allowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods_(
			CloudFrontAllowedMethods newAllowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods_) {
		CloudFrontAllowedMethods oldAllowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods_ = allowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods_;
		allowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods_ = newAllowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods_ == null
				? ALLOWED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CLOUD_FRONT_ALLOWED_METHODS__EDEFAULT
				: newAllowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__ALLOWED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CLOUD_FRONT_ALLOWED_METHODS_,
					oldAllowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods_,
					allowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CloudFrontAllowedCachedMethods getCachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods_() {
		return cachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods_(
			CloudFrontAllowedCachedMethods newCachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods_) {
		CloudFrontAllowedCachedMethods oldCachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods_ = cachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods_;
		cachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods_ = newCachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods_ == null
				? CACHED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CLOUD_FRONT_ALLOWED_CACHED_METHODS__EDEFAULT
				: newCachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__CACHED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CLOUD_FRONT_ALLOWED_CACHED_METHODS_,
					oldCachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods_,
					cachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCompress_java_lang_Boolean_() {
		return compress_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompress_java_lang_Boolean_(Boolean newCompress_java_lang_Boolean_) {
		Boolean oldCompress_java_lang_Boolean_ = compress_java_lang_Boolean_;
		compress_java_lang_Boolean_ = newCompress_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__COMPRESS_JAVA_LANG_BOOLEAN_,
					oldCompress_java_lang_Boolean_, compress_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return defaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newDefaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldDefaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference = defaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		defaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference = newDefaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__DEFAULT_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldDefaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					defaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getForwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReference() {
		return forwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReference(
			String newForwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReference) {
		String oldForwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReference = forwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReference;
		forwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReference = newForwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__FORWARDED_VALUES_WITH_FORWARDED_VALUES_PROPERTY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CFN_DISTRIBUTION_FORWARDED_VALUES_PROPERTY_AS_REFERENCE,
					oldForwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReference,
					forwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsDefaultBehavior_java_lang_Boolean_() {
		return isDefaultBehavior_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsDefaultBehavior_java_lang_Boolean_(Boolean newIsDefaultBehavior_java_lang_Boolean_) {
		Boolean oldIsDefaultBehavior_java_lang_Boolean_ = isDefaultBehavior_java_lang_Boolean_;
		isDefaultBehavior_java_lang_Boolean_ = newIsDefaultBehavior_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__IS_DEFAULT_BEHAVIOR_JAVA_LANG_BOOLEAN_,
					oldIsDefaultBehavior_java_lang_Boolean_, isDefaultBehavior_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsList() {
		return lambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsList(
			String newLambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsList) {
		String oldLambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsList = lambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsList;
		lambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsList = newLambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__LAMBDA_FUNCTION_ASSOCIATIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_LAMBDA_FUNCTION_ASSOCIATION_AS_LIST,
					oldLambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsList,
					lambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return maxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newMaxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldMaxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference = maxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		maxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference = newMaxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__MAX_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldMaxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					maxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMinTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return minTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newMinTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldMinTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference = minTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		minTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference = newMinTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__MIN_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldMinTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					minTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPathPattern_java_lang_String_() {
		return pathPattern_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathPattern_java_lang_String_(String newPathPattern_java_lang_String_) {
		String oldPathPattern_java_lang_String_ = pathPattern_java_lang_String_;
		pathPattern_java_lang_String_ = newPathPattern_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__PATH_PATTERN_JAVA_LANG_STRING_,
					oldPathPattern_java_lang_String_, pathPattern_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrustedSigners_java_lang_String_AsList() {
		return trustedSigners_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrustedSigners_java_lang_String_AsList(String newTrustedSigners_java_lang_String_AsList) {
		String oldTrustedSigners_java_lang_String_AsList = trustedSigners_java_lang_String_AsList;
		trustedSigners_java_lang_String_AsList = newTrustedSigners_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__TRUSTED_SIGNERS_JAVA_LANG_STRING_AS_LIST,
					oldTrustedSigners_java_lang_String_AsList, trustedSigners_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeneratedClassName() {
		return generatedClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVarName() {
		return varName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVarName(String newVarName) {
		String oldVarName = varName;
		varName = newVarName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__VAR_NAME, oldVarName, varName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdditionalCode() {
		return additionalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalCode(String newAdditionalCode) {
		String oldAdditionalCode = additionalCode;
		additionalCode = newAdditionalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__ADDITIONAL_CODE, oldAdditionalCode,
					additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__ALLOWED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CLOUD_FRONT_ALLOWED_METHODS_:
			return getAllowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods_();
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__CACHED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CLOUD_FRONT_ALLOWED_CACHED_METHODS_:
			return getCachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods_();
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__COMPRESS_JAVA_LANG_BOOLEAN_:
			return getCompress_java_lang_Boolean_();
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__DEFAULT_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getDefaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__FORWARDED_VALUES_WITH_FORWARDED_VALUES_PROPERTY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CFN_DISTRIBUTION_FORWARDED_VALUES_PROPERTY_AS_REFERENCE:
			return getForwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReference();
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__IS_DEFAULT_BEHAVIOR_JAVA_LANG_BOOLEAN_:
			return getIsDefaultBehavior_java_lang_Boolean_();
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__LAMBDA_FUNCTION_ASSOCIATIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_LAMBDA_FUNCTION_ASSOCIATION_AS_LIST:
			return getLambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsList();
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__MAX_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getMaxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__MIN_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getMinTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__PATH_PATTERN_JAVA_LANG_STRING_:
			return getPathPattern_java_lang_String_();
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__TRUSTED_SIGNERS_JAVA_LANG_STRING_AS_LIST:
			return getTrustedSigners_java_lang_String_AsList();
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__ADDITIONAL_CODE:
			return getAdditionalCode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__ALLOWED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CLOUD_FRONT_ALLOWED_METHODS_:
			setAllowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods_(
					(CloudFrontAllowedMethods) newValue);
			return;
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__CACHED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CLOUD_FRONT_ALLOWED_CACHED_METHODS_:
			setCachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods_(
					(CloudFrontAllowedCachedMethods) newValue);
			return;
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__COMPRESS_JAVA_LANG_BOOLEAN_:
			setCompress_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__DEFAULT_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setDefaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__FORWARDED_VALUES_WITH_FORWARDED_VALUES_PROPERTY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CFN_DISTRIBUTION_FORWARDED_VALUES_PROPERTY_AS_REFERENCE:
			setForwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__IS_DEFAULT_BEHAVIOR_JAVA_LANG_BOOLEAN_:
			setIsDefaultBehavior_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__LAMBDA_FUNCTION_ASSOCIATIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_LAMBDA_FUNCTION_ASSOCIATION_AS_LIST:
			setLambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsList(
					(String) newValue);
			return;
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__MAX_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setMaxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__MIN_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setMinTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__PATH_PATTERN_JAVA_LANG_STRING_:
			setPathPattern_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__TRUSTED_SIGNERS_JAVA_LANG_STRING_AS_LIST:
			setTrustedSigners_java_lang_String_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__ADDITIONAL_CODE:
			setAdditionalCode((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__ALLOWED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CLOUD_FRONT_ALLOWED_METHODS_:
			setAllowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods_(
					ALLOWED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CLOUD_FRONT_ALLOWED_METHODS__EDEFAULT);
			return;
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__CACHED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CLOUD_FRONT_ALLOWED_CACHED_METHODS_:
			setCachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods_(
					CACHED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CLOUD_FRONT_ALLOWED_CACHED_METHODS__EDEFAULT);
			return;
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__COMPRESS_JAVA_LANG_BOOLEAN_:
			setCompress_java_lang_Boolean_(COMPRESS_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__DEFAULT_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setDefaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					DEFAULT_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__FORWARDED_VALUES_WITH_FORWARDED_VALUES_PROPERTY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CFN_DISTRIBUTION_FORWARDED_VALUES_PROPERTY_AS_REFERENCE:
			setForwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReference(
					FORWARDED_VALUES_WITH_FORWARDED_VALUES_PROPERTY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CFN_DISTRIBUTION_FORWARDED_VALUES_PROPERTY_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__IS_DEFAULT_BEHAVIOR_JAVA_LANG_BOOLEAN_:
			setIsDefaultBehavior_java_lang_Boolean_(IS_DEFAULT_BEHAVIOR_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__LAMBDA_FUNCTION_ASSOCIATIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_LAMBDA_FUNCTION_ASSOCIATION_AS_LIST:
			setLambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsList(
					LAMBDA_FUNCTION_ASSOCIATIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_LAMBDA_FUNCTION_ASSOCIATION_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__MAX_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setMaxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					MAX_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__MIN_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setMinTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					MIN_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__PATH_PATTERN_JAVA_LANG_STRING_:
			setPathPattern_java_lang_String_(PATH_PATTERN_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__TRUSTED_SIGNERS_JAVA_LANG_STRING_AS_LIST:
			setTrustedSigners_java_lang_String_AsList(TRUSTED_SIGNERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__ADDITIONAL_CODE:
			setAdditionalCode(ADDITIONAL_CODE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__ALLOWED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CLOUD_FRONT_ALLOWED_METHODS_:
			return allowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods_ != ALLOWED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CLOUD_FRONT_ALLOWED_METHODS__EDEFAULT;
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__CACHED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CLOUD_FRONT_ALLOWED_CACHED_METHODS_:
			return cachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods_ != CACHED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CLOUD_FRONT_ALLOWED_CACHED_METHODS__EDEFAULT;
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__COMPRESS_JAVA_LANG_BOOLEAN_:
			return COMPRESS_JAVA_LANG_BOOLEAN__EDEFAULT == null ? compress_java_lang_Boolean_ != null
					: !COMPRESS_JAVA_LANG_BOOLEAN__EDEFAULT.equals(compress_java_lang_Boolean_);
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__DEFAULT_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return DEFAULT_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? defaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !DEFAULT_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(defaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__FORWARDED_VALUES_WITH_FORWARDED_VALUES_PROPERTY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CFN_DISTRIBUTION_FORWARDED_VALUES_PROPERTY_AS_REFERENCE:
			return FORWARDED_VALUES_WITH_FORWARDED_VALUES_PROPERTY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CFN_DISTRIBUTION_FORWARDED_VALUES_PROPERTY_AS_REFERENCE_EDEFAULT == null
					? forwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReference != null
					: !FORWARDED_VALUES_WITH_FORWARDED_VALUES_PROPERTY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CFN_DISTRIBUTION_FORWARDED_VALUES_PROPERTY_AS_REFERENCE_EDEFAULT
							.equals(forwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReference);
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__IS_DEFAULT_BEHAVIOR_JAVA_LANG_BOOLEAN_:
			return IS_DEFAULT_BEHAVIOR_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? isDefaultBehavior_java_lang_Boolean_ != null
					: !IS_DEFAULT_BEHAVIOR_JAVA_LANG_BOOLEAN__EDEFAULT.equals(isDefaultBehavior_java_lang_Boolean_);
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__LAMBDA_FUNCTION_ASSOCIATIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_LAMBDA_FUNCTION_ASSOCIATION_AS_LIST:
			return LAMBDA_FUNCTION_ASSOCIATIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_LAMBDA_FUNCTION_ASSOCIATION_AS_LIST_EDEFAULT == null
					? lambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsList != null
					: !LAMBDA_FUNCTION_ASSOCIATIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_LAMBDA_FUNCTION_ASSOCIATION_AS_LIST_EDEFAULT
							.equals(lambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsList);
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__MAX_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return MAX_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? maxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !MAX_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(maxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__MIN_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return MIN_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? minTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !MIN_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(minTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__PATH_PATTERN_JAVA_LANG_STRING_:
			return PATH_PATTERN_JAVA_LANG_STRING__EDEFAULT == null ? pathPattern_java_lang_String_ != null
					: !PATH_PATTERN_JAVA_LANG_STRING__EDEFAULT.equals(pathPattern_java_lang_String_);
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__TRUSTED_SIGNERS_JAVA_LANG_STRING_AS_LIST:
			return TRUSTED_SIGNERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? trustedSigners_java_lang_String_AsList != null
					: !TRUSTED_SIGNERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT.equals(trustedSigners_java_lang_String_AsList);
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__ADDITIONAL_CODE:
			return ADDITIONAL_CODE_EDEFAULT == null ? additionalCode != null
					: !ADDITIONAL_CODE_EDEFAULT.equals(additionalCode);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (allowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods_: ");
		result.append(allowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods_);
		result.append(", cachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods_: ");
		result.append(cachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods_);
		result.append(", compress_java_lang_Boolean_: ");
		result.append(compress_java_lang_Boolean_);
		result.append(", defaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(defaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		result.append(
				", forwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReference: ");
		result.append(
				forwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReference);
		result.append(", isDefaultBehavior_java_lang_Boolean_: ");
		result.append(isDefaultBehavior_java_lang_Boolean_);
		result.append(
				", lambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsList: ");
		result.append(
				lambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsList);
		result.append(", maxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(maxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		result.append(", minTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(minTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		result.append(", pathPattern_java_lang_String_: ");
		result.append(pathPattern_java_lang_String_);
		result.append(", trustedSigners_java_lang_String_AsList: ");
		result.append(trustedSigners_java_lang_String_AsList);
		result.append(", generatedClassName: ");
		result.append(generatedClassName);
		result.append(", varName: ");
		result.append(varName);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", additionalCode: ");
		result.append(additionalCode);
		result.append(')');
		return result.toString();
	}

} //BehaviorBuilder_cloudfrontImpl
