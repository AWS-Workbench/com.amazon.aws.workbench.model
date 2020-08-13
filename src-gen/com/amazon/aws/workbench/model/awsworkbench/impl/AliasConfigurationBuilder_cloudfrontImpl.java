/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AliasConfigurationBuilder_cloudfront;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.SSLMethod;
import com.amazon.aws.workbench.model.awsworkbench.SecurityPolicyProtocol;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alias Configuration Builder cloudfront</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AliasConfigurationBuilder_cloudfrontImpl#getAcmCertRef_java_lang_String_ <em>Acm Cert Ref java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AliasConfigurationBuilder_cloudfrontImpl#getNames_java_lang_String_AsList <em>Names java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AliasConfigurationBuilder_cloudfrontImpl#getSecurityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol_ <em>Security Policy software amazon awscdk services cloudfront Security Policy Protocol </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AliasConfigurationBuilder_cloudfrontImpl#getSslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod_ <em>Ssl Method software amazon awscdk services cloudfront SSL Method </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AliasConfigurationBuilder_cloudfrontImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AliasConfigurationBuilder_cloudfrontImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AliasConfigurationBuilder_cloudfrontImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AliasConfigurationBuilder_cloudfrontImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AliasConfigurationBuilder_cloudfrontImpl extends ServiceResourcesImpl
		implements AliasConfigurationBuilder_cloudfront {
	/**
	 * The default value of the '{@link #getAcmCertRef_java_lang_String_() <em>Acm Cert Ref java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcmCertRef_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String ACM_CERT_REF_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAcmCertRef_java_lang_String_() <em>Acm Cert Ref java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcmCertRef_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String acmCertRef_java_lang_String_ = ACM_CERT_REF_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getNames_java_lang_String_AsList() <em>Names java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNames_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMES_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNames_java_lang_String_AsList() <em>Names java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNames_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String names_java_lang_String_AsList = NAMES_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol_() <em>Security Policy software amazon awscdk services cloudfront Security Policy Protocol </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol_()
	 * @generated
	 * @ordered
	 */
	protected static final SecurityPolicyProtocol SECURITY_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_SECURITY_POLICY_PROTOCOL__EDEFAULT = SecurityPolicyProtocol.SSL_V3;

	/**
	 * The cached value of the '{@link #getSecurityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol_() <em>Security Policy software amazon awscdk services cloudfront Security Policy Protocol </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol_()
	 * @generated
	 * @ordered
	 */
	protected SecurityPolicyProtocol securityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol_ = SECURITY_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_SECURITY_POLICY_PROTOCOL__EDEFAULT;

	/**
	 * The default value of the '{@link #getSslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod_() <em>Ssl Method software amazon awscdk services cloudfront SSL Method </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod_()
	 * @generated
	 * @ordered
	 */
	protected static final SSLMethod SSL_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_SSL_METHOD__EDEFAULT = SSLMethod.SNI;

	/**
	 * The cached value of the '{@link #getSslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod_() <em>Ssl Method software amazon awscdk services cloudfront SSL Method </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod_()
	 * @generated
	 * @ordered
	 */
	protected SSLMethod sslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod_ = SSL_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_SSL_METHOD__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.cloudfront.AliasConfiguration";

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
	protected AliasConfigurationBuilder_cloudfrontImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAcmCertRef_java_lang_String_() {
		return acmCertRef_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcmCertRef_java_lang_String_(String newAcmCertRef_java_lang_String_) {
		String oldAcmCertRef_java_lang_String_ = acmCertRef_java_lang_String_;
		acmCertRef_java_lang_String_ = newAcmCertRef_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__ACM_CERT_REF_JAVA_LANG_STRING_,
					oldAcmCertRef_java_lang_String_, acmCertRef_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNames_java_lang_String_AsList() {
		return names_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNames_java_lang_String_AsList(String newNames_java_lang_String_AsList) {
		String oldNames_java_lang_String_AsList = names_java_lang_String_AsList;
		names_java_lang_String_AsList = newNames_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__NAMES_JAVA_LANG_STRING_AS_LIST,
					oldNames_java_lang_String_AsList, names_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityPolicyProtocol getSecurityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol_() {
		return securityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol_(
			SecurityPolicyProtocol newSecurityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol_) {
		SecurityPolicyProtocol oldSecurityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol_ = securityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol_;
		securityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol_ = newSecurityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol_ == null
				? SECURITY_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_SECURITY_POLICY_PROTOCOL__EDEFAULT
				: newSecurityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__SECURITY_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_SECURITY_POLICY_PROTOCOL_,
					oldSecurityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol_,
					securityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SSLMethod getSslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod_() {
		return sslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod_(
			SSLMethod newSslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod_) {
		SSLMethod oldSslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod_ = sslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod_;
		sslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod_ = newSslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod_ == null
				? SSL_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_SSL_METHOD__EDEFAULT
				: newSslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__SSL_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_SSL_METHOD_,
					oldSslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod_,
					sslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod_));
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
					AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__ACM_CERT_REF_JAVA_LANG_STRING_:
			return getAcmCertRef_java_lang_String_();
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__NAMES_JAVA_LANG_STRING_AS_LIST:
			return getNames_java_lang_String_AsList();
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__SECURITY_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_SECURITY_POLICY_PROTOCOL_:
			return getSecurityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol_();
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__SSL_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_SSL_METHOD_:
			return getSslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod_();
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__ACM_CERT_REF_JAVA_LANG_STRING_:
			setAcmCertRef_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__NAMES_JAVA_LANG_STRING_AS_LIST:
			setNames_java_lang_String_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__SECURITY_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_SECURITY_POLICY_PROTOCOL_:
			setSecurityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol_(
					(SecurityPolicyProtocol) newValue);
			return;
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__SSL_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_SSL_METHOD_:
			setSslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod_((SSLMethod) newValue);
			return;
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__ACM_CERT_REF_JAVA_LANG_STRING_:
			setAcmCertRef_java_lang_String_(ACM_CERT_REF_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__NAMES_JAVA_LANG_STRING_AS_LIST:
			setNames_java_lang_String_AsList(NAMES_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__SECURITY_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_SECURITY_POLICY_PROTOCOL_:
			setSecurityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol_(
					SECURITY_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_SECURITY_POLICY_PROTOCOL__EDEFAULT);
			return;
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__SSL_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_SSL_METHOD_:
			setSslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod_(
					SSL_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_SSL_METHOD__EDEFAULT);
			return;
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__ACM_CERT_REF_JAVA_LANG_STRING_:
			return ACM_CERT_REF_JAVA_LANG_STRING__EDEFAULT == null ? acmCertRef_java_lang_String_ != null
					: !ACM_CERT_REF_JAVA_LANG_STRING__EDEFAULT.equals(acmCertRef_java_lang_String_);
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__NAMES_JAVA_LANG_STRING_AS_LIST:
			return NAMES_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null ? names_java_lang_String_AsList != null
					: !NAMES_JAVA_LANG_STRING_AS_LIST_EDEFAULT.equals(names_java_lang_String_AsList);
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__SECURITY_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_SECURITY_POLICY_PROTOCOL_:
			return securityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol_ != SECURITY_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_SECURITY_POLICY_PROTOCOL__EDEFAULT;
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__SSL_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_SSL_METHOD_:
			return sslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod_ != SSL_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_SSL_METHOD__EDEFAULT;
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__ADDITIONAL_CODE:
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
		result.append(" (acmCertRef_java_lang_String_: ");
		result.append(acmCertRef_java_lang_String_);
		result.append(", names_java_lang_String_AsList: ");
		result.append(names_java_lang_String_AsList);
		result.append(", securityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol_: ");
		result.append(securityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol_);
		result.append(", sslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod_: ");
		result.append(sslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod_);
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

} //AliasConfigurationBuilder_cloudfrontImpl
