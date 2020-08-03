/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.MethodDeploymentOptionsBuilder_apigateway;
import com.amazon.aws.workbench.model.awsworkbench.MethodLoggingLevel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Deployment Options Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.MethodDeploymentOptionsBuilder_apigatewayImpl#getCacheDataEncrypted_java_lang_Boolean_ <em>Cache Data Encrypted java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.MethodDeploymentOptionsBuilder_apigatewayImpl#getCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Cache Ttl With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.MethodDeploymentOptionsBuilder_apigatewayImpl#getCachingEnabled_java_lang_Boolean_ <em>Caching Enabled java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.MethodDeploymentOptionsBuilder_apigatewayImpl#getDataTraceEnabled_java_lang_Boolean_ <em>Data Trace Enabled java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.MethodDeploymentOptionsBuilder_apigatewayImpl#getLoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_ <em>Logging Level software amazon awscdk services apigateway Method Logging Level </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.MethodDeploymentOptionsBuilder_apigatewayImpl#getMetricsEnabled_java_lang_Boolean_ <em>Metrics Enabled java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.MethodDeploymentOptionsBuilder_apigatewayImpl#getThrottlingBurstLimit_java_lang_Number_ <em>Throttling Burst Limit java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.MethodDeploymentOptionsBuilder_apigatewayImpl#getThrottlingRateLimit_java_lang_Number_ <em>Throttling Rate Limit java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.MethodDeploymentOptionsBuilder_apigatewayImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.MethodDeploymentOptionsBuilder_apigatewayImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.MethodDeploymentOptionsBuilder_apigatewayImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.MethodDeploymentOptionsBuilder_apigatewayImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodDeploymentOptionsBuilder_apigatewayImpl extends MinimalEObjectImpl.Container
		implements MethodDeploymentOptionsBuilder_apigateway {
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
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.apigateway.MethodDeploymentOptions";

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
	protected MethodDeploymentOptionsBuilder_apigatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY;
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
					AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__CACHE_DATA_ENCRYPTED_JAVA_LANG_BOOLEAN_,
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
					AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
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
					AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__CACHING_ENABLED_JAVA_LANG_BOOLEAN_,
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
					AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__DATA_TRACE_ENABLED_JAVA_LANG_BOOLEAN_,
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
					AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__LOGGING_LEVEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_LOGGING_LEVEL_,
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
					AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__METRICS_ENABLED_JAVA_LANG_BOOLEAN_,
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
					AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__THROTTLING_BURST_LIMIT_JAVA_LANG_NUMBER_,
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
					AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__THROTTLING_RATE_LIMIT_JAVA_LANG_NUMBER_,
					oldThrottlingRateLimit_java_lang_Number_, throttlingRateLimit_java_lang_Number_));
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
					AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER, oldIdentifier,
					identifier));
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
					AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE,
					oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__CACHE_DATA_ENCRYPTED_JAVA_LANG_BOOLEAN_:
			return getCacheDataEncrypted_java_lang_Boolean_();
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__CACHING_ENABLED_JAVA_LANG_BOOLEAN_:
			return getCachingEnabled_java_lang_Boolean_();
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__DATA_TRACE_ENABLED_JAVA_LANG_BOOLEAN_:
			return getDataTraceEnabled_java_lang_Boolean_();
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__LOGGING_LEVEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_LOGGING_LEVEL_:
			return getLoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_();
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__METRICS_ENABLED_JAVA_LANG_BOOLEAN_:
			return getMetricsEnabled_java_lang_Boolean_();
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__THROTTLING_BURST_LIMIT_JAVA_LANG_NUMBER_:
			return getThrottlingBurstLimit_java_lang_Number_();
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__THROTTLING_RATE_LIMIT_JAVA_LANG_NUMBER_:
			return getThrottlingRateLimit_java_lang_Number_();
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__CACHE_DATA_ENCRYPTED_JAVA_LANG_BOOLEAN_:
			setCacheDataEncrypted_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__CACHING_ENABLED_JAVA_LANG_BOOLEAN_:
			setCachingEnabled_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__DATA_TRACE_ENABLED_JAVA_LANG_BOOLEAN_:
			setDataTraceEnabled_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__LOGGING_LEVEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_LOGGING_LEVEL_:
			setLoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_(
					(MethodLoggingLevel) newValue);
			return;
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__METRICS_ENABLED_JAVA_LANG_BOOLEAN_:
			setMetricsEnabled_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__THROTTLING_BURST_LIMIT_JAVA_LANG_NUMBER_:
			setThrottlingBurstLimit_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__THROTTLING_RATE_LIMIT_JAVA_LANG_NUMBER_:
			setThrottlingRateLimit_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__CACHE_DATA_ENCRYPTED_JAVA_LANG_BOOLEAN_:
			setCacheDataEncrypted_java_lang_Boolean_(CACHE_DATA_ENCRYPTED_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__CACHING_ENABLED_JAVA_LANG_BOOLEAN_:
			setCachingEnabled_java_lang_Boolean_(CACHING_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__DATA_TRACE_ENABLED_JAVA_LANG_BOOLEAN_:
			setDataTraceEnabled_java_lang_Boolean_(DATA_TRACE_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__LOGGING_LEVEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_LOGGING_LEVEL_:
			setLoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_(
					LOGGING_LEVEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_LOGGING_LEVEL__EDEFAULT);
			return;
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__METRICS_ENABLED_JAVA_LANG_BOOLEAN_:
			setMetricsEnabled_java_lang_Boolean_(METRICS_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__THROTTLING_BURST_LIMIT_JAVA_LANG_NUMBER_:
			setThrottlingBurstLimit_java_lang_Number_(THROTTLING_BURST_LIMIT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__THROTTLING_RATE_LIMIT_JAVA_LANG_NUMBER_:
			setThrottlingRateLimit_java_lang_Number_(THROTTLING_RATE_LIMIT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__CACHE_DATA_ENCRYPTED_JAVA_LANG_BOOLEAN_:
			return CACHE_DATA_ENCRYPTED_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? cacheDataEncrypted_java_lang_Boolean_ != null
					: !CACHE_DATA_ENCRYPTED_JAVA_LANG_BOOLEAN__EDEFAULT.equals(cacheDataEncrypted_java_lang_Boolean_);
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? cacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(cacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__CACHING_ENABLED_JAVA_LANG_BOOLEAN_:
			return CACHING_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT == null ? cachingEnabled_java_lang_Boolean_ != null
					: !CACHING_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT.equals(cachingEnabled_java_lang_Boolean_);
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__DATA_TRACE_ENABLED_JAVA_LANG_BOOLEAN_:
			return DATA_TRACE_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT == null ? dataTraceEnabled_java_lang_Boolean_ != null
					: !DATA_TRACE_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT.equals(dataTraceEnabled_java_lang_Boolean_);
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__LOGGING_LEVEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_LOGGING_LEVEL_:
			return loggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_ != LOGGING_LEVEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_LOGGING_LEVEL__EDEFAULT;
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__METRICS_ENABLED_JAVA_LANG_BOOLEAN_:
			return METRICS_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT == null ? metricsEnabled_java_lang_Boolean_ != null
					: !METRICS_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT.equals(metricsEnabled_java_lang_Boolean_);
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__THROTTLING_BURST_LIMIT_JAVA_LANG_NUMBER_:
			return throttlingBurstLimit_java_lang_Number_ != THROTTLING_BURST_LIMIT_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__THROTTLING_RATE_LIMIT_JAVA_LANG_NUMBER_:
			return throttlingRateLimit_java_lang_Number_ != THROTTLING_RATE_LIMIT_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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

} //MethodDeploymentOptionsBuilder_apigatewayImpl
