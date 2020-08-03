/**
 */
package apigateway.impl;

import apigateway.ApigatewayPackage;
import apigateway.MethodLoggingLevel;
import apigateway.StageBuilder_apigateway;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stage Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apigateway.impl.StageBuilder_apigatewayImpl#getCacheDataEncrypted_java_lang_Boolean_ <em>Cache Data Encrypted java lang Boolean </em>}</li>
 *   <li>{@link apigateway.impl.StageBuilder_apigatewayImpl#getCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Cache Ttl With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link apigateway.impl.StageBuilder_apigatewayImpl#getCachingEnabled_java_lang_Boolean_ <em>Caching Enabled java lang Boolean </em>}</li>
 *   <li>{@link apigateway.impl.StageBuilder_apigatewayImpl#getDataTraceEnabled_java_lang_Boolean_ <em>Data Trace Enabled java lang Boolean </em>}</li>
 *   <li>{@link apigateway.impl.StageBuilder_apigatewayImpl#getLoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_ <em>Logging Level software amazon awscdk services apigateway Method Logging Level </em>}</li>
 *   <li>{@link apigateway.impl.StageBuilder_apigatewayImpl#getMetricsEnabled_java_lang_Boolean_ <em>Metrics Enabled java lang Boolean </em>}</li>
 *   <li>{@link apigateway.impl.StageBuilder_apigatewayImpl#getThrottlingBurstLimit_java_lang_Number_ <em>Throttling Burst Limit java lang Number </em>}</li>
 *   <li>{@link apigateway.impl.StageBuilder_apigatewayImpl#getThrottlingRateLimit_java_lang_Number_ <em>Throttling Rate Limit java lang Number </em>}</li>
 *   <li>{@link apigateway.impl.StageBuilder_apigatewayImpl#getAccessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference <em>Access Log Destination With IAccess Log Destination software amazon awscdk services apigateway IAccess Log Destination As Reference</em>}</li>
 *   <li>{@link apigateway.impl.StageBuilder_apigatewayImpl#getAccessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference <em>Access Log Format With Access Log Format software amazon awscdk services apigateway Access Log Format As Reference</em>}</li>
 *   <li>{@link apigateway.impl.StageBuilder_apigatewayImpl#getCacheClusterEnabled_java_lang_Boolean_ <em>Cache Cluster Enabled java lang Boolean </em>}</li>
 *   <li>{@link apigateway.impl.StageBuilder_apigatewayImpl#getCacheClusterSize_java_lang_String_ <em>Cache Cluster Size java lang String </em>}</li>
 *   <li>{@link apigateway.impl.StageBuilder_apigatewayImpl#getClientCertificateId_java_lang_String_ <em>Client Certificate Id java lang String </em>}</li>
 *   <li>{@link apigateway.impl.StageBuilder_apigatewayImpl#getDescription_java_lang_String_ <em>Description java lang String </em>}</li>
 *   <li>{@link apigateway.impl.StageBuilder_apigatewayImpl#getDocumentationVersion_java_lang_String_ <em>Documentation Version java lang String </em>}</li>
 *   <li>{@link apigateway.impl.StageBuilder_apigatewayImpl#getMethodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap <em>Method Options java lang String software amazon awscdk services apigateway Method Deployment Options As Map</em>}</li>
 *   <li>{@link apigateway.impl.StageBuilder_apigatewayImpl#getStageName_java_lang_String_ <em>Stage Name java lang String </em>}</li>
 *   <li>{@link apigateway.impl.StageBuilder_apigatewayImpl#getTracingEnabled_java_lang_Boolean_ <em>Tracing Enabled java lang Boolean </em>}</li>
 *   <li>{@link apigateway.impl.StageBuilder_apigatewayImpl#getVariables_java_lang_String__java_lang_String_AsMap <em>Variables java lang String java lang String As Map</em>}</li>
 *   <li>{@link apigateway.impl.StageBuilder_apigatewayImpl#getDeploymentWithDeployment_software_amazon_awscdk_services_apigateway_Deployment_AsReference <em>Deployment With Deployment software amazon awscdk services apigateway Deployment As Reference</em>}</li>
 *   <li>{@link apigateway.impl.StageBuilder_apigatewayImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.impl.StageBuilder_apigatewayImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.impl.StageBuilder_apigatewayImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.impl.StageBuilder_apigatewayImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StageBuilder_apigatewayImpl extends MinimalEObjectImpl.Container implements StageBuilder_apigateway {
	/**
	 * The default value of the '{@link #getCacheDataEncrypted_java_lang_Boolean_() <em>Cache Data Encrypted java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheDataEncrypted_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CACHE_DATA_ENCRYPTED_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCacheDataEncrypted_java_lang_Boolean_() <em>Cache Data Encrypted java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheDataEncrypted_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean cacheDataEncrypted_java_lang_Boolean_ = CACHE_DATA_ENCRYPTED_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Cache Ttl With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Cache Ttl With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String cacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference = CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCachingEnabled_java_lang_Boolean_() <em>Caching Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCachingEnabled_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CACHING_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCachingEnabled_java_lang_Boolean_() <em>Caching Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCachingEnabled_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean cachingEnabled_java_lang_Boolean_ = CACHING_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getDataTraceEnabled_java_lang_Boolean_() <em>Data Trace Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTraceEnabled_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DATA_TRACE_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataTraceEnabled_java_lang_Boolean_() <em>Data Trace Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTraceEnabled_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean dataTraceEnabled_java_lang_Boolean_ = DATA_TRACE_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getLoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_() <em>Logging Level software amazon awscdk services apigateway Method Logging Level </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_()
	 * @generated
	 * @ordered
	 */
	protected static final MethodLoggingLevel LOGGING_LEVEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_LOGGING_LEVEL__EDEFAULT = MethodLoggingLevel.OFF;

	/**
	 * The cached value of the '{@link #getLoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_() <em>Logging Level software amazon awscdk services apigateway Method Logging Level </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_()
	 * @generated
	 * @ordered
	 */
	protected MethodLoggingLevel loggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_ = LOGGING_LEVEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_LOGGING_LEVEL__EDEFAULT;

	/**
	 * The default value of the '{@link #getMetricsEnabled_java_lang_Boolean_() <em>Metrics Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetricsEnabled_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean METRICS_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetricsEnabled_java_lang_Boolean_() <em>Metrics Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetricsEnabled_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean metricsEnabled_java_lang_Boolean_ = METRICS_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getThrottlingBurstLimit_java_lang_Number_() <em>Throttling Burst Limit java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrottlingBurstLimit_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int THROTTLING_BURST_LIMIT_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getThrottlingBurstLimit_java_lang_Number_() <em>Throttling Burst Limit java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrottlingBurstLimit_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int throttlingBurstLimit_java_lang_Number_ = THROTTLING_BURST_LIMIT_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getThrottlingRateLimit_java_lang_Number_() <em>Throttling Rate Limit java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrottlingRateLimit_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int THROTTLING_RATE_LIMIT_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getThrottlingRateLimit_java_lang_Number_() <em>Throttling Rate Limit java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrottlingRateLimit_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int throttlingRateLimit_java_lang_Number_ = THROTTLING_RATE_LIMIT_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference() <em>Access Log Destination With IAccess Log Destination software amazon awscdk services apigateway IAccess Log Destination As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_LOG_DESTINATION_WITH_IACCESS_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IACCESS_LOG_DESTINATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference() <em>Access Log Destination With IAccess Log Destination software amazon awscdk services apigateway IAccess Log Destination As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String accessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference = ACCESS_LOG_DESTINATION_WITH_IACCESS_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IACCESS_LOG_DESTINATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference() <em>Access Log Format With Access Log Format software amazon awscdk services apigateway Access Log Format As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_LOG_FORMAT_WITH_ACCESS_LOG_FORMAT_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ACCESS_LOG_FORMAT_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference() <em>Access Log Format With Access Log Format software amazon awscdk services apigateway Access Log Format As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String accessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference = ACCESS_LOG_FORMAT_WITH_ACCESS_LOG_FORMAT_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ACCESS_LOG_FORMAT_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCacheClusterEnabled_java_lang_Boolean_() <em>Cache Cluster Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheClusterEnabled_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CACHE_CLUSTER_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCacheClusterEnabled_java_lang_Boolean_() <em>Cache Cluster Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheClusterEnabled_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean cacheClusterEnabled_java_lang_Boolean_ = CACHE_CLUSTER_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getCacheClusterSize_java_lang_String_() <em>Cache Cluster Size java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheClusterSize_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String CACHE_CLUSTER_SIZE_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCacheClusterSize_java_lang_String_() <em>Cache Cluster Size java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheClusterSize_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String cacheClusterSize_java_lang_String_ = CACHE_CLUSTER_SIZE_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getClientCertificateId_java_lang_String_() <em>Client Certificate Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientCertificateId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_CERTIFICATE_ID_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientCertificateId_java_lang_String_() <em>Client Certificate Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientCertificateId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String clientCertificateId_java_lang_String_ = CLIENT_CERTIFICATE_ID_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription_java_lang_String_() <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription_java_lang_String_() <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String description_java_lang_String_ = DESCRIPTION_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentationVersion_java_lang_String_() <em>Documentation Version java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentationVersion_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_VERSION_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentationVersion_java_lang_String_() <em>Documentation Version java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentationVersion_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String documentationVersion_java_lang_String_ = DOCUMENTATION_VERSION_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getMethodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap() <em>Method Options java lang String software amazon awscdk services apigateway Method Deployment Options As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_OPTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_DEPLOYMENT_OPTIONS_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap() <em>Method Options java lang String software amazon awscdk services apigateway Method Deployment Options As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String methodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap = METHOD_OPTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_DEPLOYMENT_OPTIONS_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getStageName_java_lang_String_() <em>Stage Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStageName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String STAGE_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStageName_java_lang_String_() <em>Stage Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStageName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String stageName_java_lang_String_ = STAGE_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getTracingEnabled_java_lang_Boolean_() <em>Tracing Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracingEnabled_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TRACING_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTracingEnabled_java_lang_Boolean_() <em>Tracing Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracingEnabled_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean tracingEnabled_java_lang_Boolean_ = TRACING_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getVariables_java_lang_String__java_lang_String_AsMap() <em>Variables java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariables_java_lang_String__java_lang_String_AsMap() <em>Variables java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String variables_java_lang_String__java_lang_String_AsMap = VARIABLES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeploymentWithDeployment_software_amazon_awscdk_services_apigateway_Deployment_AsReference() <em>Deployment With Deployment software amazon awscdk services apigateway Deployment As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentWithDeployment_software_amazon_awscdk_services_apigateway_Deployment_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPLOYMENT_WITH_DEPLOYMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_DEPLOYMENT_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeploymentWithDeployment_software_amazon_awscdk_services_apigateway_Deployment_AsReference() <em>Deployment With Deployment software amazon awscdk services apigateway Deployment As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentWithDeployment_software_amazon_awscdk_services_apigateway_Deployment_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String deploymentWithDeployment_software_amazon_awscdk_services_apigateway_Deployment_AsReference = DEPLOYMENT_WITH_DEPLOYMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_DEPLOYMENT_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.apigateway.Stage";

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
	protected StageBuilder_apigatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApigatewayPackage.Literals.STAGE_BUILDER_APIGATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCacheDataEncrypted_java_lang_Boolean_() {
		return cacheDataEncrypted_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCacheDataEncrypted_java_lang_Boolean_(Boolean newCacheDataEncrypted_java_lang_Boolean_) {
		Boolean oldCacheDataEncrypted_java_lang_Boolean_ = cacheDataEncrypted_java_lang_Boolean_;
		cacheDataEncrypted_java_lang_Boolean_ = newCacheDataEncrypted_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__CACHE_DATA_ENCRYPTED_JAVA_LANG_BOOLEAN_,
					oldCacheDataEncrypted_java_lang_Boolean_, cacheDataEncrypted_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return cacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference = cacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		cacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference = newCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					cacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCachingEnabled_java_lang_Boolean_() {
		return cachingEnabled_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCachingEnabled_java_lang_Boolean_(Boolean newCachingEnabled_java_lang_Boolean_) {
		Boolean oldCachingEnabled_java_lang_Boolean_ = cachingEnabled_java_lang_Boolean_;
		cachingEnabled_java_lang_Boolean_ = newCachingEnabled_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__CACHING_ENABLED_JAVA_LANG_BOOLEAN_,
					oldCachingEnabled_java_lang_Boolean_, cachingEnabled_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDataTraceEnabled_java_lang_Boolean_() {
		return dataTraceEnabled_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataTraceEnabled_java_lang_Boolean_(Boolean newDataTraceEnabled_java_lang_Boolean_) {
		Boolean oldDataTraceEnabled_java_lang_Boolean_ = dataTraceEnabled_java_lang_Boolean_;
		dataTraceEnabled_java_lang_Boolean_ = newDataTraceEnabled_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__DATA_TRACE_ENABLED_JAVA_LANG_BOOLEAN_,
					oldDataTraceEnabled_java_lang_Boolean_, dataTraceEnabled_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodLoggingLevel getLoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_() {
		return loggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_(
			MethodLoggingLevel newLoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_) {
		MethodLoggingLevel oldLoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_ = loggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_;
		loggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_ = newLoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_ == null
				? LOGGING_LEVEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_LOGGING_LEVEL__EDEFAULT
				: newLoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__LOGGING_LEVEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_LOGGING_LEVEL_,
					oldLoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_,
					loggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getMetricsEnabled_java_lang_Boolean_() {
		return metricsEnabled_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetricsEnabled_java_lang_Boolean_(Boolean newMetricsEnabled_java_lang_Boolean_) {
		Boolean oldMetricsEnabled_java_lang_Boolean_ = metricsEnabled_java_lang_Boolean_;
		metricsEnabled_java_lang_Boolean_ = newMetricsEnabled_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__METRICS_ENABLED_JAVA_LANG_BOOLEAN_,
					oldMetricsEnabled_java_lang_Boolean_, metricsEnabled_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getThrottlingBurstLimit_java_lang_Number_() {
		return throttlingBurstLimit_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThrottlingBurstLimit_java_lang_Number_(int newThrottlingBurstLimit_java_lang_Number_) {
		int oldThrottlingBurstLimit_java_lang_Number_ = throttlingBurstLimit_java_lang_Number_;
		throttlingBurstLimit_java_lang_Number_ = newThrottlingBurstLimit_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__THROTTLING_BURST_LIMIT_JAVA_LANG_NUMBER_,
					oldThrottlingBurstLimit_java_lang_Number_, throttlingBurstLimit_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getThrottlingRateLimit_java_lang_Number_() {
		return throttlingRateLimit_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThrottlingRateLimit_java_lang_Number_(int newThrottlingRateLimit_java_lang_Number_) {
		int oldThrottlingRateLimit_java_lang_Number_ = throttlingRateLimit_java_lang_Number_;
		throttlingRateLimit_java_lang_Number_ = newThrottlingRateLimit_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__THROTTLING_RATE_LIMIT_JAVA_LANG_NUMBER_,
					oldThrottlingRateLimit_java_lang_Number_, throttlingRateLimit_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference() {
		return accessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference(
			String newAccessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference) {
		String oldAccessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference = accessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference;
		accessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference = newAccessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__ACCESS_LOG_DESTINATION_WITH_IACCESS_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IACCESS_LOG_DESTINATION_AS_REFERENCE,
					oldAccessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference,
					accessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference() {
		return accessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference(
			String newAccessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference) {
		String oldAccessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference = accessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference;
		accessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference = newAccessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__ACCESS_LOG_FORMAT_WITH_ACCESS_LOG_FORMAT_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ACCESS_LOG_FORMAT_AS_REFERENCE,
					oldAccessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference,
					accessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCacheClusterEnabled_java_lang_Boolean_() {
		return cacheClusterEnabled_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCacheClusterEnabled_java_lang_Boolean_(Boolean newCacheClusterEnabled_java_lang_Boolean_) {
		Boolean oldCacheClusterEnabled_java_lang_Boolean_ = cacheClusterEnabled_java_lang_Boolean_;
		cacheClusterEnabled_java_lang_Boolean_ = newCacheClusterEnabled_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__CACHE_CLUSTER_ENABLED_JAVA_LANG_BOOLEAN_,
					oldCacheClusterEnabled_java_lang_Boolean_, cacheClusterEnabled_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCacheClusterSize_java_lang_String_() {
		return cacheClusterSize_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCacheClusterSize_java_lang_String_(String newCacheClusterSize_java_lang_String_) {
		String oldCacheClusterSize_java_lang_String_ = cacheClusterSize_java_lang_String_;
		cacheClusterSize_java_lang_String_ = newCacheClusterSize_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__CACHE_CLUSTER_SIZE_JAVA_LANG_STRING_,
					oldCacheClusterSize_java_lang_String_, cacheClusterSize_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientCertificateId_java_lang_String_() {
		return clientCertificateId_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientCertificateId_java_lang_String_(String newClientCertificateId_java_lang_String_) {
		String oldClientCertificateId_java_lang_String_ = clientCertificateId_java_lang_String_;
		clientCertificateId_java_lang_String_ = newClientCertificateId_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__CLIENT_CERTIFICATE_ID_JAVA_LANG_STRING_,
					oldClientCertificateId_java_lang_String_, clientCertificateId_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription_java_lang_String_() {
		return description_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription_java_lang_String_(String newDescription_java_lang_String_) {
		String oldDescription_java_lang_String_ = description_java_lang_String_;
		description_java_lang_String_ = newDescription_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_,
					oldDescription_java_lang_String_, description_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocumentationVersion_java_lang_String_() {
		return documentationVersion_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentationVersion_java_lang_String_(String newDocumentationVersion_java_lang_String_) {
		String oldDocumentationVersion_java_lang_String_ = documentationVersion_java_lang_String_;
		documentationVersion_java_lang_String_ = newDocumentationVersion_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__DOCUMENTATION_VERSION_JAVA_LANG_STRING_,
					oldDocumentationVersion_java_lang_String_, documentationVersion_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMethodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap() {
		return methodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap(
			String newMethodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap) {
		String oldMethodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap = methodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap;
		methodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap = newMethodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__METHOD_OPTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_DEPLOYMENT_OPTIONS_AS_MAP,
					oldMethodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap,
					methodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStageName_java_lang_String_() {
		return stageName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStageName_java_lang_String_(String newStageName_java_lang_String_) {
		String oldStageName_java_lang_String_ = stageName_java_lang_String_;
		stageName_java_lang_String_ = newStageName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__STAGE_NAME_JAVA_LANG_STRING_,
					oldStageName_java_lang_String_, stageName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getTracingEnabled_java_lang_Boolean_() {
		return tracingEnabled_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTracingEnabled_java_lang_Boolean_(Boolean newTracingEnabled_java_lang_Boolean_) {
		Boolean oldTracingEnabled_java_lang_Boolean_ = tracingEnabled_java_lang_Boolean_;
		tracingEnabled_java_lang_Boolean_ = newTracingEnabled_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__TRACING_ENABLED_JAVA_LANG_BOOLEAN_,
					oldTracingEnabled_java_lang_Boolean_, tracingEnabled_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVariables_java_lang_String__java_lang_String_AsMap() {
		return variables_java_lang_String__java_lang_String_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariables_java_lang_String__java_lang_String_AsMap(
			String newVariables_java_lang_String__java_lang_String_AsMap) {
		String oldVariables_java_lang_String__java_lang_String_AsMap = variables_java_lang_String__java_lang_String_AsMap;
		variables_java_lang_String__java_lang_String_AsMap = newVariables_java_lang_String__java_lang_String_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__VARIABLES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
					oldVariables_java_lang_String__java_lang_String_AsMap,
					variables_java_lang_String__java_lang_String_AsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeploymentWithDeployment_software_amazon_awscdk_services_apigateway_Deployment_AsReference() {
		return deploymentWithDeployment_software_amazon_awscdk_services_apigateway_Deployment_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeploymentWithDeployment_software_amazon_awscdk_services_apigateway_Deployment_AsReference(
			String newDeploymentWithDeployment_software_amazon_awscdk_services_apigateway_Deployment_AsReference) {
		String oldDeploymentWithDeployment_software_amazon_awscdk_services_apigateway_Deployment_AsReference = deploymentWithDeployment_software_amazon_awscdk_services_apigateway_Deployment_AsReference;
		deploymentWithDeployment_software_amazon_awscdk_services_apigateway_Deployment_AsReference = newDeploymentWithDeployment_software_amazon_awscdk_services_apigateway_Deployment_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__DEPLOYMENT_WITH_DEPLOYMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_DEPLOYMENT_AS_REFERENCE,
					oldDeploymentWithDeployment_software_amazon_awscdk_services_apigateway_Deployment_AsReference,
					deploymentWithDeployment_software_amazon_awscdk_services_apigateway_Deployment_AsReference));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__VAR_NAME,
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__IDENTIFIER, oldIdentifier, identifier));
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
					ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__CACHE_DATA_ENCRYPTED_JAVA_LANG_BOOLEAN_:
			return getCacheDataEncrypted_java_lang_Boolean_();
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__CACHING_ENABLED_JAVA_LANG_BOOLEAN_:
			return getCachingEnabled_java_lang_Boolean_();
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__DATA_TRACE_ENABLED_JAVA_LANG_BOOLEAN_:
			return getDataTraceEnabled_java_lang_Boolean_();
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__LOGGING_LEVEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_LOGGING_LEVEL_:
			return getLoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_();
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__METRICS_ENABLED_JAVA_LANG_BOOLEAN_:
			return getMetricsEnabled_java_lang_Boolean_();
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__THROTTLING_BURST_LIMIT_JAVA_LANG_NUMBER_:
			return getThrottlingBurstLimit_java_lang_Number_();
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__THROTTLING_RATE_LIMIT_JAVA_LANG_NUMBER_:
			return getThrottlingRateLimit_java_lang_Number_();
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__ACCESS_LOG_DESTINATION_WITH_IACCESS_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IACCESS_LOG_DESTINATION_AS_REFERENCE:
			return getAccessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference();
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__ACCESS_LOG_FORMAT_WITH_ACCESS_LOG_FORMAT_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ACCESS_LOG_FORMAT_AS_REFERENCE:
			return getAccessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference();
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__CACHE_CLUSTER_ENABLED_JAVA_LANG_BOOLEAN_:
			return getCacheClusterEnabled_java_lang_Boolean_();
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__CACHE_CLUSTER_SIZE_JAVA_LANG_STRING_:
			return getCacheClusterSize_java_lang_String_();
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__CLIENT_CERTIFICATE_ID_JAVA_LANG_STRING_:
			return getClientCertificateId_java_lang_String_();
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_:
			return getDescription_java_lang_String_();
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__DOCUMENTATION_VERSION_JAVA_LANG_STRING_:
			return getDocumentationVersion_java_lang_String_();
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__METHOD_OPTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_DEPLOYMENT_OPTIONS_AS_MAP:
			return getMethodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap();
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__STAGE_NAME_JAVA_LANG_STRING_:
			return getStageName_java_lang_String_();
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__TRACING_ENABLED_JAVA_LANG_BOOLEAN_:
			return getTracingEnabled_java_lang_Boolean_();
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__VARIABLES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return getVariables_java_lang_String__java_lang_String_AsMap();
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__DEPLOYMENT_WITH_DEPLOYMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_DEPLOYMENT_AS_REFERENCE:
			return getDeploymentWithDeployment_software_amazon_awscdk_services_apigateway_Deployment_AsReference();
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__VAR_NAME:
			return getVarName();
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__IDENTIFIER:
			return getIdentifier();
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__CACHE_DATA_ENCRYPTED_JAVA_LANG_BOOLEAN_:
			setCacheDataEncrypted_java_lang_Boolean_((Boolean) newValue);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__CACHING_ENABLED_JAVA_LANG_BOOLEAN_:
			setCachingEnabled_java_lang_Boolean_((Boolean) newValue);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__DATA_TRACE_ENABLED_JAVA_LANG_BOOLEAN_:
			setDataTraceEnabled_java_lang_Boolean_((Boolean) newValue);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__LOGGING_LEVEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_LOGGING_LEVEL_:
			setLoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_(
					(MethodLoggingLevel) newValue);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__METRICS_ENABLED_JAVA_LANG_BOOLEAN_:
			setMetricsEnabled_java_lang_Boolean_((Boolean) newValue);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__THROTTLING_BURST_LIMIT_JAVA_LANG_NUMBER_:
			setThrottlingBurstLimit_java_lang_Number_((Integer) newValue);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__THROTTLING_RATE_LIMIT_JAVA_LANG_NUMBER_:
			setThrottlingRateLimit_java_lang_Number_((Integer) newValue);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__ACCESS_LOG_DESTINATION_WITH_IACCESS_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IACCESS_LOG_DESTINATION_AS_REFERENCE:
			setAccessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference(
					(String) newValue);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__ACCESS_LOG_FORMAT_WITH_ACCESS_LOG_FORMAT_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ACCESS_LOG_FORMAT_AS_REFERENCE:
			setAccessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference(
					(String) newValue);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__CACHE_CLUSTER_ENABLED_JAVA_LANG_BOOLEAN_:
			setCacheClusterEnabled_java_lang_Boolean_((Boolean) newValue);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__CACHE_CLUSTER_SIZE_JAVA_LANG_STRING_:
			setCacheClusterSize_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__CLIENT_CERTIFICATE_ID_JAVA_LANG_STRING_:
			setClientCertificateId_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_:
			setDescription_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__DOCUMENTATION_VERSION_JAVA_LANG_STRING_:
			setDocumentationVersion_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__METHOD_OPTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_DEPLOYMENT_OPTIONS_AS_MAP:
			setMethodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap(
					(String) newValue);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__STAGE_NAME_JAVA_LANG_STRING_:
			setStageName_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__TRACING_ENABLED_JAVA_LANG_BOOLEAN_:
			setTracingEnabled_java_lang_Boolean_((Boolean) newValue);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__VARIABLES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setVariables_java_lang_String__java_lang_String_AsMap((String) newValue);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__DEPLOYMENT_WITH_DEPLOYMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_DEPLOYMENT_AS_REFERENCE:
			setDeploymentWithDeployment_software_amazon_awscdk_services_apigateway_Deployment_AsReference(
					(String) newValue);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName((String) newValue);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__CACHE_DATA_ENCRYPTED_JAVA_LANG_BOOLEAN_:
			setCacheDataEncrypted_java_lang_Boolean_(CACHE_DATA_ENCRYPTED_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__CACHING_ENABLED_JAVA_LANG_BOOLEAN_:
			setCachingEnabled_java_lang_Boolean_(CACHING_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__DATA_TRACE_ENABLED_JAVA_LANG_BOOLEAN_:
			setDataTraceEnabled_java_lang_Boolean_(DATA_TRACE_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__LOGGING_LEVEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_LOGGING_LEVEL_:
			setLoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_(
					LOGGING_LEVEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_LOGGING_LEVEL__EDEFAULT);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__METRICS_ENABLED_JAVA_LANG_BOOLEAN_:
			setMetricsEnabled_java_lang_Boolean_(METRICS_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__THROTTLING_BURST_LIMIT_JAVA_LANG_NUMBER_:
			setThrottlingBurstLimit_java_lang_Number_(THROTTLING_BURST_LIMIT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__THROTTLING_RATE_LIMIT_JAVA_LANG_NUMBER_:
			setThrottlingRateLimit_java_lang_Number_(THROTTLING_RATE_LIMIT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__ACCESS_LOG_DESTINATION_WITH_IACCESS_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IACCESS_LOG_DESTINATION_AS_REFERENCE:
			setAccessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference(
					ACCESS_LOG_DESTINATION_WITH_IACCESS_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IACCESS_LOG_DESTINATION_AS_REFERENCE_EDEFAULT);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__ACCESS_LOG_FORMAT_WITH_ACCESS_LOG_FORMAT_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ACCESS_LOG_FORMAT_AS_REFERENCE:
			setAccessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference(
					ACCESS_LOG_FORMAT_WITH_ACCESS_LOG_FORMAT_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ACCESS_LOG_FORMAT_AS_REFERENCE_EDEFAULT);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__CACHE_CLUSTER_ENABLED_JAVA_LANG_BOOLEAN_:
			setCacheClusterEnabled_java_lang_Boolean_(CACHE_CLUSTER_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__CACHE_CLUSTER_SIZE_JAVA_LANG_STRING_:
			setCacheClusterSize_java_lang_String_(CACHE_CLUSTER_SIZE_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__CLIENT_CERTIFICATE_ID_JAVA_LANG_STRING_:
			setClientCertificateId_java_lang_String_(CLIENT_CERTIFICATE_ID_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_:
			setDescription_java_lang_String_(DESCRIPTION_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__DOCUMENTATION_VERSION_JAVA_LANG_STRING_:
			setDocumentationVersion_java_lang_String_(DOCUMENTATION_VERSION_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__METHOD_OPTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_DEPLOYMENT_OPTIONS_AS_MAP:
			setMethodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap(
					METHOD_OPTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_DEPLOYMENT_OPTIONS_AS_MAP_EDEFAULT);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__STAGE_NAME_JAVA_LANG_STRING_:
			setStageName_java_lang_String_(STAGE_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__TRACING_ENABLED_JAVA_LANG_BOOLEAN_:
			setTracingEnabled_java_lang_Boolean_(TRACING_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__VARIABLES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setVariables_java_lang_String__java_lang_String_AsMap(
					VARIABLES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__DEPLOYMENT_WITH_DEPLOYMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_DEPLOYMENT_AS_REFERENCE:
			setDeploymentWithDeployment_software_amazon_awscdk_services_apigateway_Deployment_AsReference(
					DEPLOYMENT_WITH_DEPLOYMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_DEPLOYMENT_AS_REFERENCE_EDEFAULT);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__CACHE_DATA_ENCRYPTED_JAVA_LANG_BOOLEAN_:
			return CACHE_DATA_ENCRYPTED_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? cacheDataEncrypted_java_lang_Boolean_ != null
					: !CACHE_DATA_ENCRYPTED_JAVA_LANG_BOOLEAN__EDEFAULT.equals(cacheDataEncrypted_java_lang_Boolean_);
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? cacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(cacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__CACHING_ENABLED_JAVA_LANG_BOOLEAN_:
			return CACHING_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT == null ? cachingEnabled_java_lang_Boolean_ != null
					: !CACHING_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT.equals(cachingEnabled_java_lang_Boolean_);
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__DATA_TRACE_ENABLED_JAVA_LANG_BOOLEAN_:
			return DATA_TRACE_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT == null ? dataTraceEnabled_java_lang_Boolean_ != null
					: !DATA_TRACE_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT.equals(dataTraceEnabled_java_lang_Boolean_);
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__LOGGING_LEVEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_LOGGING_LEVEL_:
			return loggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_ != LOGGING_LEVEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_LOGGING_LEVEL__EDEFAULT;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__METRICS_ENABLED_JAVA_LANG_BOOLEAN_:
			return METRICS_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT == null ? metricsEnabled_java_lang_Boolean_ != null
					: !METRICS_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT.equals(metricsEnabled_java_lang_Boolean_);
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__THROTTLING_BURST_LIMIT_JAVA_LANG_NUMBER_:
			return throttlingBurstLimit_java_lang_Number_ != THROTTLING_BURST_LIMIT_JAVA_LANG_NUMBER__EDEFAULT;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__THROTTLING_RATE_LIMIT_JAVA_LANG_NUMBER_:
			return throttlingRateLimit_java_lang_Number_ != THROTTLING_RATE_LIMIT_JAVA_LANG_NUMBER__EDEFAULT;
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__ACCESS_LOG_DESTINATION_WITH_IACCESS_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IACCESS_LOG_DESTINATION_AS_REFERENCE:
			return ACCESS_LOG_DESTINATION_WITH_IACCESS_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IACCESS_LOG_DESTINATION_AS_REFERENCE_EDEFAULT == null
					? accessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference != null
					: !ACCESS_LOG_DESTINATION_WITH_IACCESS_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IACCESS_LOG_DESTINATION_AS_REFERENCE_EDEFAULT
							.equals(accessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference);
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__ACCESS_LOG_FORMAT_WITH_ACCESS_LOG_FORMAT_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ACCESS_LOG_FORMAT_AS_REFERENCE:
			return ACCESS_LOG_FORMAT_WITH_ACCESS_LOG_FORMAT_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ACCESS_LOG_FORMAT_AS_REFERENCE_EDEFAULT == null
					? accessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference != null
					: !ACCESS_LOG_FORMAT_WITH_ACCESS_LOG_FORMAT_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ACCESS_LOG_FORMAT_AS_REFERENCE_EDEFAULT
							.equals(accessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference);
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__CACHE_CLUSTER_ENABLED_JAVA_LANG_BOOLEAN_:
			return CACHE_CLUSTER_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? cacheClusterEnabled_java_lang_Boolean_ != null
					: !CACHE_CLUSTER_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT.equals(cacheClusterEnabled_java_lang_Boolean_);
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__CACHE_CLUSTER_SIZE_JAVA_LANG_STRING_:
			return CACHE_CLUSTER_SIZE_JAVA_LANG_STRING__EDEFAULT == null ? cacheClusterSize_java_lang_String_ != null
					: !CACHE_CLUSTER_SIZE_JAVA_LANG_STRING__EDEFAULT.equals(cacheClusterSize_java_lang_String_);
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__CLIENT_CERTIFICATE_ID_JAVA_LANG_STRING_:
			return CLIENT_CERTIFICATE_ID_JAVA_LANG_STRING__EDEFAULT == null
					? clientCertificateId_java_lang_String_ != null
					: !CLIENT_CERTIFICATE_ID_JAVA_LANG_STRING__EDEFAULT.equals(clientCertificateId_java_lang_String_);
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_:
			return DESCRIPTION_JAVA_LANG_STRING__EDEFAULT == null ? description_java_lang_String_ != null
					: !DESCRIPTION_JAVA_LANG_STRING__EDEFAULT.equals(description_java_lang_String_);
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__DOCUMENTATION_VERSION_JAVA_LANG_STRING_:
			return DOCUMENTATION_VERSION_JAVA_LANG_STRING__EDEFAULT == null
					? documentationVersion_java_lang_String_ != null
					: !DOCUMENTATION_VERSION_JAVA_LANG_STRING__EDEFAULT.equals(documentationVersion_java_lang_String_);
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__METHOD_OPTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_DEPLOYMENT_OPTIONS_AS_MAP:
			return METHOD_OPTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_DEPLOYMENT_OPTIONS_AS_MAP_EDEFAULT == null
					? methodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap != null
					: !METHOD_OPTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_DEPLOYMENT_OPTIONS_AS_MAP_EDEFAULT
							.equals(methodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap);
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__STAGE_NAME_JAVA_LANG_STRING_:
			return STAGE_NAME_JAVA_LANG_STRING__EDEFAULT == null ? stageName_java_lang_String_ != null
					: !STAGE_NAME_JAVA_LANG_STRING__EDEFAULT.equals(stageName_java_lang_String_);
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__TRACING_ENABLED_JAVA_LANG_BOOLEAN_:
			return TRACING_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT == null ? tracingEnabled_java_lang_Boolean_ != null
					: !TRACING_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT.equals(tracingEnabled_java_lang_Boolean_);
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__VARIABLES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return VARIABLES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT == null
					? variables_java_lang_String__java_lang_String_AsMap != null
					: !VARIABLES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT
							.equals(variables_java_lang_String__java_lang_String_AsMap);
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__DEPLOYMENT_WITH_DEPLOYMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_DEPLOYMENT_AS_REFERENCE:
			return DEPLOYMENT_WITH_DEPLOYMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_DEPLOYMENT_AS_REFERENCE_EDEFAULT == null
					? deploymentWithDeployment_software_amazon_awscdk_services_apigateway_Deployment_AsReference != null
					: !DEPLOYMENT_WITH_DEPLOYMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_DEPLOYMENT_AS_REFERENCE_EDEFAULT
							.equals(deploymentWithDeployment_software_amazon_awscdk_services_apigateway_Deployment_AsReference);
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		result.append(" (cacheDataEncrypted_java_lang_Boolean_: ");
		result.append(cacheDataEncrypted_java_lang_Boolean_);
		result.append(", cacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(cacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		result.append(", cachingEnabled_java_lang_Boolean_: ");
		result.append(cachingEnabled_java_lang_Boolean_);
		result.append(", dataTraceEnabled_java_lang_Boolean_: ");
		result.append(dataTraceEnabled_java_lang_Boolean_);
		result.append(", loggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_: ");
		result.append(loggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_);
		result.append(", metricsEnabled_java_lang_Boolean_: ");
		result.append(metricsEnabled_java_lang_Boolean_);
		result.append(", throttlingBurstLimit_java_lang_Number_: ");
		result.append(throttlingBurstLimit_java_lang_Number_);
		result.append(", throttlingRateLimit_java_lang_Number_: ");
		result.append(throttlingRateLimit_java_lang_Number_);
		result.append(
				", accessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference: ");
		result.append(
				accessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference);
		result.append(
				", accessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference: ");
		result.append(
				accessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference);
		result.append(", cacheClusterEnabled_java_lang_Boolean_: ");
		result.append(cacheClusterEnabled_java_lang_Boolean_);
		result.append(", cacheClusterSize_java_lang_String_: ");
		result.append(cacheClusterSize_java_lang_String_);
		result.append(", clientCertificateId_java_lang_String_: ");
		result.append(clientCertificateId_java_lang_String_);
		result.append(", description_java_lang_String_: ");
		result.append(description_java_lang_String_);
		result.append(", documentationVersion_java_lang_String_: ");
		result.append(documentationVersion_java_lang_String_);
		result.append(
				", methodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap: ");
		result.append(
				methodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap);
		result.append(", stageName_java_lang_String_: ");
		result.append(stageName_java_lang_String_);
		result.append(", tracingEnabled_java_lang_Boolean_: ");
		result.append(tracingEnabled_java_lang_Boolean_);
		result.append(", variables_java_lang_String__java_lang_String_AsMap: ");
		result.append(variables_java_lang_String__java_lang_String_AsMap);
		result.append(", deploymentWithDeployment_software_amazon_awscdk_services_apigateway_Deployment_AsReference: ");
		result.append(deploymentWithDeployment_software_amazon_awscdk_services_apigateway_Deployment_AsReference);
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

} //StageBuilder_apigatewayImpl
