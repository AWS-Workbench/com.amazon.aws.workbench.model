/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.CustomOriginConfigBuilder_cloudfront;
import com.amazon.aws.workbench.model.awsworkbench.OriginProtocolPolicy;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Origin Config Builder cloudfront</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CustomOriginConfigBuilder_cloudfrontImpl#getDomainName_java_lang_String_ <em>Domain Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CustomOriginConfigBuilder_cloudfrontImpl#getAllowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsList <em>Allowed Origin Ssl Versions software amazon awscdk services cloudfront Origin Ssl Policy As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CustomOriginConfigBuilder_cloudfrontImpl#getHttpPort_java_lang_Number_ <em>Http Port java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CustomOriginConfigBuilder_cloudfrontImpl#getHttpsPort_java_lang_Number_ <em>Https Port java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CustomOriginConfigBuilder_cloudfrontImpl#getOriginKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Origin Keepalive Timeout With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CustomOriginConfigBuilder_cloudfrontImpl#getOriginProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy_ <em>Origin Protocol Policy software amazon awscdk services cloudfront Origin Protocol Policy </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CustomOriginConfigBuilder_cloudfrontImpl#getOriginReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Origin Read Timeout With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CustomOriginConfigBuilder_cloudfrontImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CustomOriginConfigBuilder_cloudfrontImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CustomOriginConfigBuilder_cloudfrontImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CustomOriginConfigBuilder_cloudfrontImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomOriginConfigBuilder_cloudfrontImpl extends ServiceResourcesImpl
		implements CustomOriginConfigBuilder_cloudfront {
	/**
	 * The default value of the '{@link #getDomainName_java_lang_String_() <em>Domain Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainName_java_lang_String_() <em>Domain Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String domainName_java_lang_String_ = DOMAIN_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsList() <em>Allowed Origin Ssl Versions software amazon awscdk services cloudfront Origin Ssl Policy As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOWED_ORIGIN_SSL_VERSIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_ORIGIN_SSL_POLICY_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsList() <em>Allowed Origin Ssl Versions software amazon awscdk services cloudfront Origin Ssl Policy As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsList()
	 * @generated
	 * @ordered
	 */
	protected String allowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsList = ALLOWED_ORIGIN_SSL_VERSIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_ORIGIN_SSL_POLICY_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getHttpPort_java_lang_Number_() <em>Http Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpPort_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int HTTP_PORT_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHttpPort_java_lang_Number_() <em>Http Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpPort_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int httpPort_java_lang_Number_ = HTTP_PORT_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getHttpsPort_java_lang_Number_() <em>Https Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpsPort_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int HTTPS_PORT_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHttpsPort_java_lang_Number_() <em>Https Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpsPort_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int httpsPort_java_lang_Number_ = HTTPS_PORT_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Origin Keepalive Timeout With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGIN_KEEPALIVE_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Origin Keepalive Timeout With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String originKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference = ORIGIN_KEEPALIVE_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy_() <em>Origin Protocol Policy software amazon awscdk services cloudfront Origin Protocol Policy </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy_()
	 * @generated
	 * @ordered
	 */
	protected static final OriginProtocolPolicy ORIGIN_PROTOCOL_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_ORIGIN_PROTOCOL_POLICY__EDEFAULT = OriginProtocolPolicy.HTTP_ONLY;

	/**
	 * The cached value of the '{@link #getOriginProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy_() <em>Origin Protocol Policy software amazon awscdk services cloudfront Origin Protocol Policy </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy_()
	 * @generated
	 * @ordered
	 */
	protected OriginProtocolPolicy originProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy_ = ORIGIN_PROTOCOL_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_ORIGIN_PROTOCOL_POLICY__EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Origin Read Timeout With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGIN_READ_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Origin Read Timeout With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String originReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference = ORIGIN_READ_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.cloudfront.CustomOriginConfig";

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
	protected CustomOriginConfigBuilder_cloudfrontImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDomainName_java_lang_String_() {
		return domainName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainName_java_lang_String_(String newDomainName_java_lang_String_) {
		String oldDomainName_java_lang_String_ = domainName_java_lang_String_;
		domainName_java_lang_String_ = newDomainName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__DOMAIN_NAME_JAVA_LANG_STRING_,
					oldDomainName_java_lang_String_, domainName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsList() {
		return allowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsList(
			String newAllowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsList) {
		String oldAllowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsList = allowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsList;
		allowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsList = newAllowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ALLOWED_ORIGIN_SSL_VERSIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_ORIGIN_SSL_POLICY_AS_LIST,
					oldAllowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsList,
					allowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHttpPort_java_lang_Number_() {
		return httpPort_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHttpPort_java_lang_Number_(int newHttpPort_java_lang_Number_) {
		int oldHttpPort_java_lang_Number_ = httpPort_java_lang_Number_;
		httpPort_java_lang_Number_ = newHttpPort_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__HTTP_PORT_JAVA_LANG_NUMBER_,
					oldHttpPort_java_lang_Number_, httpPort_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHttpsPort_java_lang_Number_() {
		return httpsPort_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHttpsPort_java_lang_Number_(int newHttpsPort_java_lang_Number_) {
		int oldHttpsPort_java_lang_Number_ = httpsPort_java_lang_Number_;
		httpsPort_java_lang_Number_ = newHttpsPort_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__HTTPS_PORT_JAVA_LANG_NUMBER_,
					oldHttpsPort_java_lang_Number_, httpsPort_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOriginKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return originKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newOriginKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldOriginKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference = originKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		originKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference = newOriginKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ORIGIN_KEEPALIVE_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldOriginKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					originKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OriginProtocolPolicy getOriginProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy_() {
		return originProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy_(
			OriginProtocolPolicy newOriginProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy_) {
		OriginProtocolPolicy oldOriginProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy_ = originProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy_;
		originProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy_ = newOriginProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy_ == null
				? ORIGIN_PROTOCOL_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_ORIGIN_PROTOCOL_POLICY__EDEFAULT
				: newOriginProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ORIGIN_PROTOCOL_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_ORIGIN_PROTOCOL_POLICY_,
					oldOriginProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy_,
					originProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOriginReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return originReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newOriginReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldOriginReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference = originReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		originReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference = newOriginReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ORIGIN_READ_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldOriginReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					originReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference));
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
					AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__IDENTIFIER, oldIdentifier,
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
					AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__DOMAIN_NAME_JAVA_LANG_STRING_:
			return getDomainName_java_lang_String_();
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ALLOWED_ORIGIN_SSL_VERSIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_ORIGIN_SSL_POLICY_AS_LIST:
			return getAllowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsList();
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__HTTP_PORT_JAVA_LANG_NUMBER_:
			return getHttpPort_java_lang_Number_();
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__HTTPS_PORT_JAVA_LANG_NUMBER_:
			return getHttpsPort_java_lang_Number_();
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ORIGIN_KEEPALIVE_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getOriginKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ORIGIN_PROTOCOL_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_ORIGIN_PROTOCOL_POLICY_:
			return getOriginProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy_();
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ORIGIN_READ_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getOriginReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__DOMAIN_NAME_JAVA_LANG_STRING_:
			setDomainName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ALLOWED_ORIGIN_SSL_VERSIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_ORIGIN_SSL_POLICY_AS_LIST:
			setAllowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsList(
					(String) newValue);
			return;
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__HTTP_PORT_JAVA_LANG_NUMBER_:
			setHttpPort_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__HTTPS_PORT_JAVA_LANG_NUMBER_:
			setHttpsPort_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ORIGIN_KEEPALIVE_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setOriginKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ORIGIN_PROTOCOL_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_ORIGIN_PROTOCOL_POLICY_:
			setOriginProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy_(
					(OriginProtocolPolicy) newValue);
			return;
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ORIGIN_READ_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setOriginReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__DOMAIN_NAME_JAVA_LANG_STRING_:
			setDomainName_java_lang_String_(DOMAIN_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ALLOWED_ORIGIN_SSL_VERSIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_ORIGIN_SSL_POLICY_AS_LIST:
			setAllowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsList(
					ALLOWED_ORIGIN_SSL_VERSIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_ORIGIN_SSL_POLICY_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__HTTP_PORT_JAVA_LANG_NUMBER_:
			setHttpPort_java_lang_Number_(HTTP_PORT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__HTTPS_PORT_JAVA_LANG_NUMBER_:
			setHttpsPort_java_lang_Number_(HTTPS_PORT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ORIGIN_KEEPALIVE_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setOriginKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					ORIGIN_KEEPALIVE_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ORIGIN_PROTOCOL_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_ORIGIN_PROTOCOL_POLICY_:
			setOriginProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy_(
					ORIGIN_PROTOCOL_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_ORIGIN_PROTOCOL_POLICY__EDEFAULT);
			return;
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ORIGIN_READ_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setOriginReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					ORIGIN_READ_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__DOMAIN_NAME_JAVA_LANG_STRING_:
			return DOMAIN_NAME_JAVA_LANG_STRING__EDEFAULT == null ? domainName_java_lang_String_ != null
					: !DOMAIN_NAME_JAVA_LANG_STRING__EDEFAULT.equals(domainName_java_lang_String_);
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ALLOWED_ORIGIN_SSL_VERSIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_ORIGIN_SSL_POLICY_AS_LIST:
			return ALLOWED_ORIGIN_SSL_VERSIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_ORIGIN_SSL_POLICY_AS_LIST_EDEFAULT == null
					? allowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsList != null
					: !ALLOWED_ORIGIN_SSL_VERSIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_ORIGIN_SSL_POLICY_AS_LIST_EDEFAULT
							.equals(allowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsList);
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__HTTP_PORT_JAVA_LANG_NUMBER_:
			return httpPort_java_lang_Number_ != HTTP_PORT_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__HTTPS_PORT_JAVA_LANG_NUMBER_:
			return httpsPort_java_lang_Number_ != HTTPS_PORT_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ORIGIN_KEEPALIVE_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return ORIGIN_KEEPALIVE_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? originKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !ORIGIN_KEEPALIVE_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(originKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ORIGIN_PROTOCOL_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_ORIGIN_PROTOCOL_POLICY_:
			return originProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy_ != ORIGIN_PROTOCOL_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_ORIGIN_PROTOCOL_POLICY__EDEFAULT;
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ORIGIN_READ_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return ORIGIN_READ_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? originReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !ORIGIN_READ_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(originReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ADDITIONAL_CODE:
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
		result.append(" (domainName_java_lang_String_: ");
		result.append(domainName_java_lang_String_);
		result.append(", allowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsList: ");
		result.append(allowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsList);
		result.append(", httpPort_java_lang_Number_: ");
		result.append(httpPort_java_lang_Number_);
		result.append(", httpsPort_java_lang_Number_: ");
		result.append(httpsPort_java_lang_Number_);
		result.append(", originKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(originKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		result.append(", originProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy_: ");
		result.append(originProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy_);
		result.append(", originReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(originReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference);
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

} //CustomOriginConfigBuilder_cloudfrontImpl
