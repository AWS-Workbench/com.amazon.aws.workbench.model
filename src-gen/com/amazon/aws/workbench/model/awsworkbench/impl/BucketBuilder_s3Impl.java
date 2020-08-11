/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.BucketAccessControl;
import com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3;
import com.amazon.aws.workbench.model.awsworkbench.BucketEncryption;
import com.amazon.aws.workbench.model.awsworkbench.RemovalPolicy;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bucket Builder s3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BucketBuilder_s3Impl#getAccessControl_software_amazon_awscdk_services_s3_BucketAccessControl_ <em>Access Control software amazon awscdk services s3 Bucket Access Control </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BucketBuilder_s3Impl#getBlockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReference <em>Block Public Access With Block Public Access software amazon awscdk services s3 Block Public Access As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BucketBuilder_s3Impl#getBucketName_java_lang_String_ <em>Bucket Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BucketBuilder_s3Impl#getCors_software_amazon_awscdk_services_s3_CorsRule_AsList <em>Cors software amazon awscdk services s3 Cors Rule As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BucketBuilder_s3Impl#getEncryption_software_amazon_awscdk_services_s3_BucketEncryption_ <em>Encryption software amazon awscdk services s3 Bucket Encryption </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BucketBuilder_s3Impl#getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference <em>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BucketBuilder_s3Impl#getLifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsList <em>Lifecycle Rules software amazon awscdk services s3 Lifecycle Rule As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BucketBuilder_s3Impl#getMetrics_software_amazon_awscdk_services_s3_BucketMetrics_AsList <em>Metrics software amazon awscdk services s3 Bucket Metrics As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BucketBuilder_s3Impl#getPublicReadAccess_java_lang_Boolean_ <em>Public Read Access java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BucketBuilder_s3Impl#getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ <em>Removal Policy software amazon awscdk core Removal Policy </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BucketBuilder_s3Impl#getServerAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference <em>Server Access Logs Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BucketBuilder_s3Impl#getServerAccessLogsPrefix_java_lang_String_ <em>Server Access Logs Prefix java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BucketBuilder_s3Impl#getVersioned_java_lang_Boolean_ <em>Versioned java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BucketBuilder_s3Impl#getWebsiteErrorDocument_java_lang_String_ <em>Website Error Document java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BucketBuilder_s3Impl#getWebsiteIndexDocument_java_lang_String_ <em>Website Index Document java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BucketBuilder_s3Impl#getWebsiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReference <em>Website Redirect With Redirect Target software amazon awscdk services s3 Redirect Target As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BucketBuilder_s3Impl#getWebsiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsList <em>Website Routing Rules software amazon awscdk services s3 Routing Rule As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BucketBuilder_s3Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BucketBuilder_s3Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BucketBuilder_s3Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BucketBuilder_s3Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BucketBuilder_s3Impl extends MinimalEObjectImpl.Container implements BucketBuilder_s3 {
	/**
	 * The default value of the '{@link #getAccessControl_software_amazon_awscdk_services_s3_BucketAccessControl_() <em>Access Control software amazon awscdk services s3 Bucket Access Control </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessControl_software_amazon_awscdk_services_s3_BucketAccessControl_()
	 * @generated
	 * @ordered
	 */
	protected static final BucketAccessControl ACCESS_CONTROL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_ACCESS_CONTROL__EDEFAULT = BucketAccessControl.PRIVATE;

	/**
	 * The cached value of the '{@link #getAccessControl_software_amazon_awscdk_services_s3_BucketAccessControl_() <em>Access Control software amazon awscdk services s3 Bucket Access Control </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessControl_software_amazon_awscdk_services_s3_BucketAccessControl_()
	 * @generated
	 * @ordered
	 */
	protected BucketAccessControl accessControl_software_amazon_awscdk_services_s3_BucketAccessControl_ = ACCESS_CONTROL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_ACCESS_CONTROL__EDEFAULT;

	/**
	 * The default value of the '{@link #getBlockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReference() <em>Block Public Access With Block Public Access software amazon awscdk services s3 Block Public Access As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOCK_PUBLIC_ACCESS_WITH_BLOCK_PUBLIC_ACCESS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BLOCK_PUBLIC_ACCESS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReference() <em>Block Public Access With Block Public Access software amazon awscdk services s3 Block Public Access As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String blockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReference = BLOCK_PUBLIC_ACCESS_WITH_BLOCK_PUBLIC_ACCESS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BLOCK_PUBLIC_ACCESS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBucketName_java_lang_String_() <em>Bucket Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String BUCKET_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBucketName_java_lang_String_() <em>Bucket Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String bucketName_java_lang_String_ = BUCKET_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getCors_software_amazon_awscdk_services_s3_CorsRule_AsList() <em>Cors software amazon awscdk services s3 Cors Rule As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCors_software_amazon_awscdk_services_s3_CorsRule_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String CORS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_CORS_RULE_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCors_software_amazon_awscdk_services_s3_CorsRule_AsList() <em>Cors software amazon awscdk services s3 Cors Rule As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCors_software_amazon_awscdk_services_s3_CorsRule_AsList()
	 * @generated
	 * @ordered
	 */
	protected String cors_software_amazon_awscdk_services_s3_CorsRule_AsList = CORS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_CORS_RULE_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncryption_software_amazon_awscdk_services_s3_BucketEncryption_() <em>Encryption software amazon awscdk services s3 Bucket Encryption </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryption_software_amazon_awscdk_services_s3_BucketEncryption_()
	 * @generated
	 * @ordered
	 */
	protected static final BucketEncryption ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_ENCRYPTION__EDEFAULT = BucketEncryption.UNENCRYPTED;

	/**
	 * The cached value of the '{@link #getEncryption_software_amazon_awscdk_services_s3_BucketEncryption_() <em>Encryption software amazon awscdk services s3 Bucket Encryption </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryption_software_amazon_awscdk_services_s3_BucketEncryption_()
	 * @generated
	 * @ordered
	 */
	protected BucketEncryption encryption_software_amazon_awscdk_services_s3_BucketEncryption_ = ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_ENCRYPTION__EDEFAULT;

	/**
	 * The default value of the '{@link #getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference() <em>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference() <em>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference = ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsList() <em>Lifecycle Rules software amazon awscdk services s3 Lifecycle Rule As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String LIFECYCLE_RULES_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_LIFECYCLE_RULE_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsList() <em>Lifecycle Rules software amazon awscdk services s3 Lifecycle Rule As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsList()
	 * @generated
	 * @ordered
	 */
	protected String lifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsList = LIFECYCLE_RULES_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_LIFECYCLE_RULE_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetrics_software_amazon_awscdk_services_s3_BucketMetrics_AsList() <em>Metrics software amazon awscdk services s3 Bucket Metrics As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrics_software_amazon_awscdk_services_s3_BucketMetrics_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String METRICS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_METRICS_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetrics_software_amazon_awscdk_services_s3_BucketMetrics_AsList() <em>Metrics software amazon awscdk services s3 Bucket Metrics As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrics_software_amazon_awscdk_services_s3_BucketMetrics_AsList()
	 * @generated
	 * @ordered
	 */
	protected String metrics_software_amazon_awscdk_services_s3_BucketMetrics_AsList = METRICS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_METRICS_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublicReadAccess_java_lang_Boolean_() <em>Public Read Access java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicReadAccess_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PUBLIC_READ_ACCESS_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicReadAccess_java_lang_Boolean_() <em>Public Read Access java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicReadAccess_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean publicReadAccess_java_lang_Boolean_ = PUBLIC_READ_ACCESS_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_() <em>Removal Policy software amazon awscdk core Removal Policy </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_()
	 * @generated
	 * @ordered
	 */
	protected static final RemovalPolicy REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY__EDEFAULT = RemovalPolicy.DESTROY;

	/**
	 * The cached value of the '{@link #getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_() <em>Removal Policy software amazon awscdk core Removal Policy </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_()
	 * @generated
	 * @ordered
	 */
	protected RemovalPolicy removalPolicy_software_amazon_awscdk_core_RemovalPolicy_ = REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY__EDEFAULT;

	/**
	 * The default value of the '{@link #getServerAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference() <em>Server Access Logs Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_ACCESS_LOGS_BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference() <em>Server Access Logs Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String serverAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference = SERVER_ACCESS_LOGS_BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerAccessLogsPrefix_java_lang_String_() <em>Server Access Logs Prefix java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerAccessLogsPrefix_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_ACCESS_LOGS_PREFIX_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerAccessLogsPrefix_java_lang_String_() <em>Server Access Logs Prefix java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerAccessLogsPrefix_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String serverAccessLogsPrefix_java_lang_String_ = SERVER_ACCESS_LOGS_PREFIX_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getVersioned_java_lang_Boolean_() <em>Versioned java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersioned_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean VERSIONED_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersioned_java_lang_Boolean_() <em>Versioned java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersioned_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean versioned_java_lang_Boolean_ = VERSIONED_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getWebsiteErrorDocument_java_lang_String_() <em>Website Error Document java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsiteErrorDocument_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String WEBSITE_ERROR_DOCUMENT_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebsiteErrorDocument_java_lang_String_() <em>Website Error Document java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsiteErrorDocument_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String websiteErrorDocument_java_lang_String_ = WEBSITE_ERROR_DOCUMENT_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getWebsiteIndexDocument_java_lang_String_() <em>Website Index Document java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsiteIndexDocument_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String WEBSITE_INDEX_DOCUMENT_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebsiteIndexDocument_java_lang_String_() <em>Website Index Document java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsiteIndexDocument_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String websiteIndexDocument_java_lang_String_ = WEBSITE_INDEX_DOCUMENT_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getWebsiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReference() <em>Website Redirect With Redirect Target software amazon awscdk services s3 Redirect Target As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String WEBSITE_REDIRECT_WITH_REDIRECT_TARGET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_TARGET_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebsiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReference() <em>Website Redirect With Redirect Target software amazon awscdk services s3 Redirect Target As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String websiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReference = WEBSITE_REDIRECT_WITH_REDIRECT_TARGET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_TARGET_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebsiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsList() <em>Website Routing Rules software amazon awscdk services s3 Routing Rule As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String WEBSITE_ROUTING_RULES_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_ROUTING_RULE_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebsiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsList() <em>Website Routing Rules software amazon awscdk services s3 Routing Rule As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsList()
	 * @generated
	 * @ordered
	 */
	protected String websiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsList = WEBSITE_ROUTING_RULES_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_ROUTING_RULE_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.s3.Bucket";

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
	protected BucketBuilder_s3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.BUCKET_BUILDER_S3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BucketAccessControl getAccessControl_software_amazon_awscdk_services_s3_BucketAccessControl_() {
		return accessControl_software_amazon_awscdk_services_s3_BucketAccessControl_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessControl_software_amazon_awscdk_services_s3_BucketAccessControl_(
			BucketAccessControl newAccessControl_software_amazon_awscdk_services_s3_BucketAccessControl_) {
		BucketAccessControl oldAccessControl_software_amazon_awscdk_services_s3_BucketAccessControl_ = accessControl_software_amazon_awscdk_services_s3_BucketAccessControl_;
		accessControl_software_amazon_awscdk_services_s3_BucketAccessControl_ = newAccessControl_software_amazon_awscdk_services_s3_BucketAccessControl_ == null
				? ACCESS_CONTROL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_ACCESS_CONTROL__EDEFAULT
				: newAccessControl_software_amazon_awscdk_services_s3_BucketAccessControl_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BUCKET_BUILDER_S3__ACCESS_CONTROL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_ACCESS_CONTROL_,
					oldAccessControl_software_amazon_awscdk_services_s3_BucketAccessControl_,
					accessControl_software_amazon_awscdk_services_s3_BucketAccessControl_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBlockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReference() {
		return blockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReference(
			String newBlockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReference) {
		String oldBlockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReference = blockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReference;
		blockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReference = newBlockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BUCKET_BUILDER_S3__BLOCK_PUBLIC_ACCESS_WITH_BLOCK_PUBLIC_ACCESS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BLOCK_PUBLIC_ACCESS_AS_REFERENCE,
					oldBlockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReference,
					blockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBucketName_java_lang_String_() {
		return bucketName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBucketName_java_lang_String_(String newBucketName_java_lang_String_) {
		String oldBucketName_java_lang_String_ = bucketName_java_lang_String_;
		bucketName_java_lang_String_ = newBucketName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BUCKET_BUILDER_S3__BUCKET_NAME_JAVA_LANG_STRING_,
					oldBucketName_java_lang_String_, bucketName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCors_software_amazon_awscdk_services_s3_CorsRule_AsList() {
		return cors_software_amazon_awscdk_services_s3_CorsRule_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCors_software_amazon_awscdk_services_s3_CorsRule_AsList(
			String newCors_software_amazon_awscdk_services_s3_CorsRule_AsList) {
		String oldCors_software_amazon_awscdk_services_s3_CorsRule_AsList = cors_software_amazon_awscdk_services_s3_CorsRule_AsList;
		cors_software_amazon_awscdk_services_s3_CorsRule_AsList = newCors_software_amazon_awscdk_services_s3_CorsRule_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BUCKET_BUILDER_S3__CORS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_CORS_RULE_AS_LIST,
					oldCors_software_amazon_awscdk_services_s3_CorsRule_AsList,
					cors_software_amazon_awscdk_services_s3_CorsRule_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BucketEncryption getEncryption_software_amazon_awscdk_services_s3_BucketEncryption_() {
		return encryption_software_amazon_awscdk_services_s3_BucketEncryption_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncryption_software_amazon_awscdk_services_s3_BucketEncryption_(
			BucketEncryption newEncryption_software_amazon_awscdk_services_s3_BucketEncryption_) {
		BucketEncryption oldEncryption_software_amazon_awscdk_services_s3_BucketEncryption_ = encryption_software_amazon_awscdk_services_s3_BucketEncryption_;
		encryption_software_amazon_awscdk_services_s3_BucketEncryption_ = newEncryption_software_amazon_awscdk_services_s3_BucketEncryption_ == null
				? ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_ENCRYPTION__EDEFAULT
				: newEncryption_software_amazon_awscdk_services_s3_BucketEncryption_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BUCKET_BUILDER_S3__ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_ENCRYPTION_,
					oldEncryption_software_amazon_awscdk_services_s3_BucketEncryption_,
					encryption_software_amazon_awscdk_services_s3_BucketEncryption_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference() {
		return encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(
			String newEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference) {
		String oldEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference = encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference;
		encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference = newEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BUCKET_BUILDER_S3__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE,
					oldEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference,
					encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsList() {
		return lifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsList(
			String newLifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsList) {
		String oldLifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsList = lifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsList;
		lifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsList = newLifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BUCKET_BUILDER_S3__LIFECYCLE_RULES_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_LIFECYCLE_RULE_AS_LIST,
					oldLifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsList,
					lifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMetrics_software_amazon_awscdk_services_s3_BucketMetrics_AsList() {
		return metrics_software_amazon_awscdk_services_s3_BucketMetrics_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetrics_software_amazon_awscdk_services_s3_BucketMetrics_AsList(
			String newMetrics_software_amazon_awscdk_services_s3_BucketMetrics_AsList) {
		String oldMetrics_software_amazon_awscdk_services_s3_BucketMetrics_AsList = metrics_software_amazon_awscdk_services_s3_BucketMetrics_AsList;
		metrics_software_amazon_awscdk_services_s3_BucketMetrics_AsList = newMetrics_software_amazon_awscdk_services_s3_BucketMetrics_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BUCKET_BUILDER_S3__METRICS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_METRICS_AS_LIST,
					oldMetrics_software_amazon_awscdk_services_s3_BucketMetrics_AsList,
					metrics_software_amazon_awscdk_services_s3_BucketMetrics_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPublicReadAccess_java_lang_Boolean_() {
		return publicReadAccess_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicReadAccess_java_lang_Boolean_(Boolean newPublicReadAccess_java_lang_Boolean_) {
		Boolean oldPublicReadAccess_java_lang_Boolean_ = publicReadAccess_java_lang_Boolean_;
		publicReadAccess_java_lang_Boolean_ = newPublicReadAccess_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BUCKET_BUILDER_S3__PUBLIC_READ_ACCESS_JAVA_LANG_BOOLEAN_,
					oldPublicReadAccess_java_lang_Boolean_, publicReadAccess_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemovalPolicy getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_() {
		return removalPolicy_software_amazon_awscdk_core_RemovalPolicy_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_(
			RemovalPolicy newRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_) {
		RemovalPolicy oldRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ = removalPolicy_software_amazon_awscdk_core_RemovalPolicy_;
		removalPolicy_software_amazon_awscdk_core_RemovalPolicy_ = newRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ == null
				? REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY__EDEFAULT
				: newRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BUCKET_BUILDER_S3__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_,
					oldRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_,
					removalPolicy_software_amazon_awscdk_core_RemovalPolicy_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServerAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference() {
		return serverAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference(
			String newServerAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference) {
		String oldServerAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference = serverAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference;
		serverAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference = newServerAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BUCKET_BUILDER_S3__SERVER_ACCESS_LOGS_BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE,
					oldServerAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference,
					serverAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServerAccessLogsPrefix_java_lang_String_() {
		return serverAccessLogsPrefix_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerAccessLogsPrefix_java_lang_String_(String newServerAccessLogsPrefix_java_lang_String_) {
		String oldServerAccessLogsPrefix_java_lang_String_ = serverAccessLogsPrefix_java_lang_String_;
		serverAccessLogsPrefix_java_lang_String_ = newServerAccessLogsPrefix_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BUCKET_BUILDER_S3__SERVER_ACCESS_LOGS_PREFIX_JAVA_LANG_STRING_,
					oldServerAccessLogsPrefix_java_lang_String_, serverAccessLogsPrefix_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getVersioned_java_lang_Boolean_() {
		return versioned_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersioned_java_lang_Boolean_(Boolean newVersioned_java_lang_Boolean_) {
		Boolean oldVersioned_java_lang_Boolean_ = versioned_java_lang_Boolean_;
		versioned_java_lang_Boolean_ = newVersioned_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BUCKET_BUILDER_S3__VERSIONED_JAVA_LANG_BOOLEAN_,
					oldVersioned_java_lang_Boolean_, versioned_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebsiteErrorDocument_java_lang_String_() {
		return websiteErrorDocument_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebsiteErrorDocument_java_lang_String_(String newWebsiteErrorDocument_java_lang_String_) {
		String oldWebsiteErrorDocument_java_lang_String_ = websiteErrorDocument_java_lang_String_;
		websiteErrorDocument_java_lang_String_ = newWebsiteErrorDocument_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BUCKET_BUILDER_S3__WEBSITE_ERROR_DOCUMENT_JAVA_LANG_STRING_,
					oldWebsiteErrorDocument_java_lang_String_, websiteErrorDocument_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebsiteIndexDocument_java_lang_String_() {
		return websiteIndexDocument_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebsiteIndexDocument_java_lang_String_(String newWebsiteIndexDocument_java_lang_String_) {
		String oldWebsiteIndexDocument_java_lang_String_ = websiteIndexDocument_java_lang_String_;
		websiteIndexDocument_java_lang_String_ = newWebsiteIndexDocument_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BUCKET_BUILDER_S3__WEBSITE_INDEX_DOCUMENT_JAVA_LANG_STRING_,
					oldWebsiteIndexDocument_java_lang_String_, websiteIndexDocument_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebsiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReference() {
		return websiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebsiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReference(
			String newWebsiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReference) {
		String oldWebsiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReference = websiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReference;
		websiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReference = newWebsiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BUCKET_BUILDER_S3__WEBSITE_REDIRECT_WITH_REDIRECT_TARGET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_TARGET_AS_REFERENCE,
					oldWebsiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReference,
					websiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebsiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsList() {
		return websiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebsiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsList(
			String newWebsiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsList) {
		String oldWebsiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsList = websiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsList;
		websiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsList = newWebsiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BUCKET_BUILDER_S3__WEBSITE_ROUTING_RULES_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_ROUTING_RULE_AS_LIST,
					oldWebsiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsList,
					websiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsList));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.BUCKET_BUILDER_S3__VAR_NAME,
					oldVarName, varName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.BUCKET_BUILDER_S3__IDENTIFIER,
					oldIdentifier, identifier));
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
					AwsworkbenchPackage.BUCKET_BUILDER_S3__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__ACCESS_CONTROL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_ACCESS_CONTROL_:
			return getAccessControl_software_amazon_awscdk_services_s3_BucketAccessControl_();
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__BLOCK_PUBLIC_ACCESS_WITH_BLOCK_PUBLIC_ACCESS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BLOCK_PUBLIC_ACCESS_AS_REFERENCE:
			return getBlockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReference();
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__BUCKET_NAME_JAVA_LANG_STRING_:
			return getBucketName_java_lang_String_();
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__CORS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_CORS_RULE_AS_LIST:
			return getCors_software_amazon_awscdk_services_s3_CorsRule_AsList();
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_ENCRYPTION_:
			return getEncryption_software_amazon_awscdk_services_s3_BucketEncryption_();
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			return getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference();
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__LIFECYCLE_RULES_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_LIFECYCLE_RULE_AS_LIST:
			return getLifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsList();
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__METRICS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_METRICS_AS_LIST:
			return getMetrics_software_amazon_awscdk_services_s3_BucketMetrics_AsList();
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__PUBLIC_READ_ACCESS_JAVA_LANG_BOOLEAN_:
			return getPublicReadAccess_java_lang_Boolean_();
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
			return getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_();
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__SERVER_ACCESS_LOGS_BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE:
			return getServerAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference();
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__SERVER_ACCESS_LOGS_PREFIX_JAVA_LANG_STRING_:
			return getServerAccessLogsPrefix_java_lang_String_();
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__VERSIONED_JAVA_LANG_BOOLEAN_:
			return getVersioned_java_lang_Boolean_();
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__WEBSITE_ERROR_DOCUMENT_JAVA_LANG_STRING_:
			return getWebsiteErrorDocument_java_lang_String_();
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__WEBSITE_INDEX_DOCUMENT_JAVA_LANG_STRING_:
			return getWebsiteIndexDocument_java_lang_String_();
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__WEBSITE_REDIRECT_WITH_REDIRECT_TARGET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_TARGET_AS_REFERENCE:
			return getWebsiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReference();
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__WEBSITE_ROUTING_RULES_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_ROUTING_RULE_AS_LIST:
			return getWebsiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsList();
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__ACCESS_CONTROL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_ACCESS_CONTROL_:
			setAccessControl_software_amazon_awscdk_services_s3_BucketAccessControl_((BucketAccessControl) newValue);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__BLOCK_PUBLIC_ACCESS_WITH_BLOCK_PUBLIC_ACCESS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BLOCK_PUBLIC_ACCESS_AS_REFERENCE:
			setBlockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__BUCKET_NAME_JAVA_LANG_STRING_:
			setBucketName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__CORS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_CORS_RULE_AS_LIST:
			setCors_software_amazon_awscdk_services_s3_CorsRule_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_ENCRYPTION_:
			setEncryption_software_amazon_awscdk_services_s3_BucketEncryption_((BucketEncryption) newValue);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			setEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__LIFECYCLE_RULES_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_LIFECYCLE_RULE_AS_LIST:
			setLifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__METRICS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_METRICS_AS_LIST:
			setMetrics_software_amazon_awscdk_services_s3_BucketMetrics_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__PUBLIC_READ_ACCESS_JAVA_LANG_BOOLEAN_:
			setPublicReadAccess_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
			setRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_((RemovalPolicy) newValue);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__SERVER_ACCESS_LOGS_BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE:
			setServerAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__SERVER_ACCESS_LOGS_PREFIX_JAVA_LANG_STRING_:
			setServerAccessLogsPrefix_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__VERSIONED_JAVA_LANG_BOOLEAN_:
			setVersioned_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__WEBSITE_ERROR_DOCUMENT_JAVA_LANG_STRING_:
			setWebsiteErrorDocument_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__WEBSITE_INDEX_DOCUMENT_JAVA_LANG_STRING_:
			setWebsiteIndexDocument_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__WEBSITE_REDIRECT_WITH_REDIRECT_TARGET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_TARGET_AS_REFERENCE:
			setWebsiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__WEBSITE_ROUTING_RULES_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_ROUTING_RULE_AS_LIST:
			setWebsiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__ACCESS_CONTROL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_ACCESS_CONTROL_:
			setAccessControl_software_amazon_awscdk_services_s3_BucketAccessControl_(
					ACCESS_CONTROL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_ACCESS_CONTROL__EDEFAULT);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__BLOCK_PUBLIC_ACCESS_WITH_BLOCK_PUBLIC_ACCESS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BLOCK_PUBLIC_ACCESS_AS_REFERENCE:
			setBlockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReference(
					BLOCK_PUBLIC_ACCESS_WITH_BLOCK_PUBLIC_ACCESS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BLOCK_PUBLIC_ACCESS_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__BUCKET_NAME_JAVA_LANG_STRING_:
			setBucketName_java_lang_String_(BUCKET_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__CORS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_CORS_RULE_AS_LIST:
			setCors_software_amazon_awscdk_services_s3_CorsRule_AsList(
					CORS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_CORS_RULE_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_ENCRYPTION_:
			setEncryption_software_amazon_awscdk_services_s3_BucketEncryption_(
					ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_ENCRYPTION__EDEFAULT);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			setEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(
					ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__LIFECYCLE_RULES_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_LIFECYCLE_RULE_AS_LIST:
			setLifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsList(
					LIFECYCLE_RULES_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_LIFECYCLE_RULE_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__METRICS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_METRICS_AS_LIST:
			setMetrics_software_amazon_awscdk_services_s3_BucketMetrics_AsList(
					METRICS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_METRICS_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__PUBLIC_READ_ACCESS_JAVA_LANG_BOOLEAN_:
			setPublicReadAccess_java_lang_Boolean_(PUBLIC_READ_ACCESS_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
			setRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_(
					REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY__EDEFAULT);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__SERVER_ACCESS_LOGS_BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE:
			setServerAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference(
					SERVER_ACCESS_LOGS_BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__SERVER_ACCESS_LOGS_PREFIX_JAVA_LANG_STRING_:
			setServerAccessLogsPrefix_java_lang_String_(SERVER_ACCESS_LOGS_PREFIX_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__VERSIONED_JAVA_LANG_BOOLEAN_:
			setVersioned_java_lang_Boolean_(VERSIONED_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__WEBSITE_ERROR_DOCUMENT_JAVA_LANG_STRING_:
			setWebsiteErrorDocument_java_lang_String_(WEBSITE_ERROR_DOCUMENT_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__WEBSITE_INDEX_DOCUMENT_JAVA_LANG_STRING_:
			setWebsiteIndexDocument_java_lang_String_(WEBSITE_INDEX_DOCUMENT_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__WEBSITE_REDIRECT_WITH_REDIRECT_TARGET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_TARGET_AS_REFERENCE:
			setWebsiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReference(
					WEBSITE_REDIRECT_WITH_REDIRECT_TARGET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_TARGET_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__WEBSITE_ROUTING_RULES_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_ROUTING_RULE_AS_LIST:
			setWebsiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsList(
					WEBSITE_ROUTING_RULES_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_ROUTING_RULE_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__ACCESS_CONTROL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_ACCESS_CONTROL_:
			return accessControl_software_amazon_awscdk_services_s3_BucketAccessControl_ != ACCESS_CONTROL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_ACCESS_CONTROL__EDEFAULT;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__BLOCK_PUBLIC_ACCESS_WITH_BLOCK_PUBLIC_ACCESS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BLOCK_PUBLIC_ACCESS_AS_REFERENCE:
			return BLOCK_PUBLIC_ACCESS_WITH_BLOCK_PUBLIC_ACCESS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BLOCK_PUBLIC_ACCESS_AS_REFERENCE_EDEFAULT == null
					? blockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReference != null
					: !BLOCK_PUBLIC_ACCESS_WITH_BLOCK_PUBLIC_ACCESS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BLOCK_PUBLIC_ACCESS_AS_REFERENCE_EDEFAULT
							.equals(blockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReference);
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__BUCKET_NAME_JAVA_LANG_STRING_:
			return BUCKET_NAME_JAVA_LANG_STRING__EDEFAULT == null ? bucketName_java_lang_String_ != null
					: !BUCKET_NAME_JAVA_LANG_STRING__EDEFAULT.equals(bucketName_java_lang_String_);
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__CORS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_CORS_RULE_AS_LIST:
			return CORS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_CORS_RULE_AS_LIST_EDEFAULT == null
					? cors_software_amazon_awscdk_services_s3_CorsRule_AsList != null
					: !CORS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_CORS_RULE_AS_LIST_EDEFAULT
							.equals(cors_software_amazon_awscdk_services_s3_CorsRule_AsList);
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_ENCRYPTION_:
			return encryption_software_amazon_awscdk_services_s3_BucketEncryption_ != ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_ENCRYPTION__EDEFAULT;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			return ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT == null
					? encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference != null
					: !ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT
							.equals(encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference);
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__LIFECYCLE_RULES_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_LIFECYCLE_RULE_AS_LIST:
			return LIFECYCLE_RULES_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_LIFECYCLE_RULE_AS_LIST_EDEFAULT == null
					? lifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsList != null
					: !LIFECYCLE_RULES_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_LIFECYCLE_RULE_AS_LIST_EDEFAULT
							.equals(lifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsList);
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__METRICS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_METRICS_AS_LIST:
			return METRICS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_METRICS_AS_LIST_EDEFAULT == null
					? metrics_software_amazon_awscdk_services_s3_BucketMetrics_AsList != null
					: !METRICS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_METRICS_AS_LIST_EDEFAULT
							.equals(metrics_software_amazon_awscdk_services_s3_BucketMetrics_AsList);
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__PUBLIC_READ_ACCESS_JAVA_LANG_BOOLEAN_:
			return PUBLIC_READ_ACCESS_JAVA_LANG_BOOLEAN__EDEFAULT == null ? publicReadAccess_java_lang_Boolean_ != null
					: !PUBLIC_READ_ACCESS_JAVA_LANG_BOOLEAN__EDEFAULT.equals(publicReadAccess_java_lang_Boolean_);
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
			return removalPolicy_software_amazon_awscdk_core_RemovalPolicy_ != REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY__EDEFAULT;
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__SERVER_ACCESS_LOGS_BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE:
			return SERVER_ACCESS_LOGS_BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE_EDEFAULT == null
					? serverAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference != null
					: !SERVER_ACCESS_LOGS_BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE_EDEFAULT
							.equals(serverAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference);
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__SERVER_ACCESS_LOGS_PREFIX_JAVA_LANG_STRING_:
			return SERVER_ACCESS_LOGS_PREFIX_JAVA_LANG_STRING__EDEFAULT == null
					? serverAccessLogsPrefix_java_lang_String_ != null
					: !SERVER_ACCESS_LOGS_PREFIX_JAVA_LANG_STRING__EDEFAULT
							.equals(serverAccessLogsPrefix_java_lang_String_);
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__VERSIONED_JAVA_LANG_BOOLEAN_:
			return VERSIONED_JAVA_LANG_BOOLEAN__EDEFAULT == null ? versioned_java_lang_Boolean_ != null
					: !VERSIONED_JAVA_LANG_BOOLEAN__EDEFAULT.equals(versioned_java_lang_Boolean_);
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__WEBSITE_ERROR_DOCUMENT_JAVA_LANG_STRING_:
			return WEBSITE_ERROR_DOCUMENT_JAVA_LANG_STRING__EDEFAULT == null
					? websiteErrorDocument_java_lang_String_ != null
					: !WEBSITE_ERROR_DOCUMENT_JAVA_LANG_STRING__EDEFAULT.equals(websiteErrorDocument_java_lang_String_);
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__WEBSITE_INDEX_DOCUMENT_JAVA_LANG_STRING_:
			return WEBSITE_INDEX_DOCUMENT_JAVA_LANG_STRING__EDEFAULT == null
					? websiteIndexDocument_java_lang_String_ != null
					: !WEBSITE_INDEX_DOCUMENT_JAVA_LANG_STRING__EDEFAULT.equals(websiteIndexDocument_java_lang_String_);
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__WEBSITE_REDIRECT_WITH_REDIRECT_TARGET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_TARGET_AS_REFERENCE:
			return WEBSITE_REDIRECT_WITH_REDIRECT_TARGET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_TARGET_AS_REFERENCE_EDEFAULT == null
					? websiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReference != null
					: !WEBSITE_REDIRECT_WITH_REDIRECT_TARGET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_TARGET_AS_REFERENCE_EDEFAULT
							.equals(websiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReference);
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__WEBSITE_ROUTING_RULES_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_ROUTING_RULE_AS_LIST:
			return WEBSITE_ROUTING_RULES_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_ROUTING_RULE_AS_LIST_EDEFAULT == null
					? websiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsList != null
					: !WEBSITE_ROUTING_RULES_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_ROUTING_RULE_AS_LIST_EDEFAULT
							.equals(websiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsList);
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.BUCKET_BUILDER_S3__ADDITIONAL_CODE:
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
		result.append(" (accessControl_software_amazon_awscdk_services_s3_BucketAccessControl_: ");
		result.append(accessControl_software_amazon_awscdk_services_s3_BucketAccessControl_);
		result.append(
				", blockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReference: ");
		result.append(
				blockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReference);
		result.append(", bucketName_java_lang_String_: ");
		result.append(bucketName_java_lang_String_);
		result.append(", cors_software_amazon_awscdk_services_s3_CorsRule_AsList: ");
		result.append(cors_software_amazon_awscdk_services_s3_CorsRule_AsList);
		result.append(", encryption_software_amazon_awscdk_services_s3_BucketEncryption_: ");
		result.append(encryption_software_amazon_awscdk_services_s3_BucketEncryption_);
		result.append(", encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference: ");
		result.append(encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference);
		result.append(", lifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsList: ");
		result.append(lifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsList);
		result.append(", metrics_software_amazon_awscdk_services_s3_BucketMetrics_AsList: ");
		result.append(metrics_software_amazon_awscdk_services_s3_BucketMetrics_AsList);
		result.append(", publicReadAccess_java_lang_Boolean_: ");
		result.append(publicReadAccess_java_lang_Boolean_);
		result.append(", removalPolicy_software_amazon_awscdk_core_RemovalPolicy_: ");
		result.append(removalPolicy_software_amazon_awscdk_core_RemovalPolicy_);
		result.append(", serverAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference: ");
		result.append(serverAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference);
		result.append(", serverAccessLogsPrefix_java_lang_String_: ");
		result.append(serverAccessLogsPrefix_java_lang_String_);
		result.append(", versioned_java_lang_Boolean_: ");
		result.append(versioned_java_lang_Boolean_);
		result.append(", websiteErrorDocument_java_lang_String_: ");
		result.append(websiteErrorDocument_java_lang_String_);
		result.append(", websiteIndexDocument_java_lang_String_: ");
		result.append(websiteIndexDocument_java_lang_String_);
		result.append(
				", websiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReference: ");
		result.append(websiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReference);
		result.append(", websiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsList: ");
		result.append(websiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsList);
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

} //BucketBuilder_s3Impl
