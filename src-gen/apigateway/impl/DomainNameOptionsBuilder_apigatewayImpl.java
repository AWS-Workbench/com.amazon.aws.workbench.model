/**
 */
package apigateway.impl;

import apigateway.ApigatewayPackage;
import apigateway.DomainNameOptionsBuilder_apigateway;
import apigateway.EndpointType;
import apigateway.SecurityPolicy;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Name Options Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apigateway.impl.DomainNameOptionsBuilder_apigatewayImpl#getCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference <em>Certificate With ICertificate software amazon awscdk services certificatemanager ICertificate As Reference</em>}</li>
 *   <li>{@link apigateway.impl.DomainNameOptionsBuilder_apigatewayImpl#getDomainName_java_lang_String_ <em>Domain Name java lang String </em>}</li>
 *   <li>{@link apigateway.impl.DomainNameOptionsBuilder_apigatewayImpl#getEndpointType_software_amazon_awscdk_services_apigateway_EndpointType_ <em>Endpoint Type software amazon awscdk services apigateway Endpoint Type </em>}</li>
 *   <li>{@link apigateway.impl.DomainNameOptionsBuilder_apigatewayImpl#getSecurityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_ <em>Security Policy software amazon awscdk services apigateway Security Policy </em>}</li>
 *   <li>{@link apigateway.impl.DomainNameOptionsBuilder_apigatewayImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.impl.DomainNameOptionsBuilder_apigatewayImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.impl.DomainNameOptionsBuilder_apigatewayImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.impl.DomainNameOptionsBuilder_apigatewayImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainNameOptionsBuilder_apigatewayImpl extends MinimalEObjectImpl.Container
		implements DomainNameOptionsBuilder_apigateway {
	/**
	 * The default value of the '{@link #getCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference() <em>Certificate With ICertificate software amazon awscdk services certificatemanager ICertificate As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String CERTIFICATE_WITH_ICERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_ICERTIFICATE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference() <em>Certificate With ICertificate software amazon awscdk services certificatemanager ICertificate As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String certificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference = CERTIFICATE_WITH_ICERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_ICERTIFICATE_AS_REFERENCE_EDEFAULT;

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
	 * The default value of the '{@link #getEndpointType_software_amazon_awscdk_services_apigateway_EndpointType_() <em>Endpoint Type software amazon awscdk services apigateway Endpoint Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointType_software_amazon_awscdk_services_apigateway_EndpointType_()
	 * @generated
	 * @ordered
	 */
	protected static final EndpointType ENDPOINT_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE__EDEFAULT = EndpointType.EDGE;

	/**
	 * The cached value of the '{@link #getEndpointType_software_amazon_awscdk_services_apigateway_EndpointType_() <em>Endpoint Type software amazon awscdk services apigateway Endpoint Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointType_software_amazon_awscdk_services_apigateway_EndpointType_()
	 * @generated
	 * @ordered
	 */
	protected EndpointType endpointType_software_amazon_awscdk_services_apigateway_EndpointType_ = ENDPOINT_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE__EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_() <em>Security Policy software amazon awscdk services apigateway Security Policy </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_()
	 * @generated
	 * @ordered
	 */
	protected static final SecurityPolicy SECURITY_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_SECURITY_POLICY__EDEFAULT = SecurityPolicy.TLS_10;

	/**
	 * The cached value of the '{@link #getSecurityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_() <em>Security Policy software amazon awscdk services apigateway Security Policy </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_()
	 * @generated
	 * @ordered
	 */
	protected SecurityPolicy securityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_ = SECURITY_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_SECURITY_POLICY__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.apigateway.DomainNameOptions";

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
	protected DomainNameOptionsBuilder_apigatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApigatewayPackage.Literals.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference() {
		return certificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference(
			String newCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference) {
		String oldCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference = certificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference;
		certificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference = newCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__CERTIFICATE_WITH_ICERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_ICERTIFICATE_AS_REFERENCE,
					oldCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference,
					certificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference));
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
					ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__DOMAIN_NAME_JAVA_LANG_STRING_,
					oldDomainName_java_lang_String_, domainName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndpointType getEndpointType_software_amazon_awscdk_services_apigateway_EndpointType_() {
		return endpointType_software_amazon_awscdk_services_apigateway_EndpointType_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndpointType_software_amazon_awscdk_services_apigateway_EndpointType_(
			EndpointType newEndpointType_software_amazon_awscdk_services_apigateway_EndpointType_) {
		EndpointType oldEndpointType_software_amazon_awscdk_services_apigateway_EndpointType_ = endpointType_software_amazon_awscdk_services_apigateway_EndpointType_;
		endpointType_software_amazon_awscdk_services_apigateway_EndpointType_ = newEndpointType_software_amazon_awscdk_services_apigateway_EndpointType_ == null
				? ENDPOINT_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE__EDEFAULT
				: newEndpointType_software_amazon_awscdk_services_apigateway_EndpointType_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__ENDPOINT_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_,
					oldEndpointType_software_amazon_awscdk_services_apigateway_EndpointType_,
					endpointType_software_amazon_awscdk_services_apigateway_EndpointType_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityPolicy getSecurityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_() {
		return securityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_(
			SecurityPolicy newSecurityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_) {
		SecurityPolicy oldSecurityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_ = securityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_;
		securityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_ = newSecurityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_ == null
				? SECURITY_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_SECURITY_POLICY__EDEFAULT
				: newSecurityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__SECURITY_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_SECURITY_POLICY_,
					oldSecurityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_,
					securityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_));
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
					ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME, oldVarName, varName));
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
					ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER, oldIdentifier, identifier));
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
					ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE, oldAdditionalCode,
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
		case ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__CERTIFICATE_WITH_ICERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_ICERTIFICATE_AS_REFERENCE:
			return getCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference();
		case ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__DOMAIN_NAME_JAVA_LANG_STRING_:
			return getDomainName_java_lang_String_();
		case ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__ENDPOINT_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_:
			return getEndpointType_software_amazon_awscdk_services_apigateway_EndpointType_();
		case ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__SECURITY_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_SECURITY_POLICY_:
			return getSecurityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_();
		case ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
			return getVarName();
		case ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
			return getIdentifier();
		case ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__CERTIFICATE_WITH_ICERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_ICERTIFICATE_AS_REFERENCE:
			setCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference(
					(String) newValue);
			return;
		case ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__DOMAIN_NAME_JAVA_LANG_STRING_:
			setDomainName_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__ENDPOINT_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_:
			setEndpointType_software_amazon_awscdk_services_apigateway_EndpointType_((EndpointType) newValue);
			return;
		case ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__SECURITY_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_SECURITY_POLICY_:
			setSecurityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_((SecurityPolicy) newValue);
			return;
		case ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName((String) newValue);
			return;
		case ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__CERTIFICATE_WITH_ICERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_ICERTIFICATE_AS_REFERENCE:
			setCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference(
					CERTIFICATE_WITH_ICERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_ICERTIFICATE_AS_REFERENCE_EDEFAULT);
			return;
		case ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__DOMAIN_NAME_JAVA_LANG_STRING_:
			setDomainName_java_lang_String_(DOMAIN_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__ENDPOINT_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_:
			setEndpointType_software_amazon_awscdk_services_apigateway_EndpointType_(
					ENDPOINT_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE__EDEFAULT);
			return;
		case ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__SECURITY_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_SECURITY_POLICY_:
			setSecurityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_(
					SECURITY_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_SECURITY_POLICY__EDEFAULT);
			return;
		case ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__CERTIFICATE_WITH_ICERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_ICERTIFICATE_AS_REFERENCE:
			return CERTIFICATE_WITH_ICERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_ICERTIFICATE_AS_REFERENCE_EDEFAULT == null
					? certificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference != null
					: !CERTIFICATE_WITH_ICERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_ICERTIFICATE_AS_REFERENCE_EDEFAULT
							.equals(certificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference);
		case ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__DOMAIN_NAME_JAVA_LANG_STRING_:
			return DOMAIN_NAME_JAVA_LANG_STRING__EDEFAULT == null ? domainName_java_lang_String_ != null
					: !DOMAIN_NAME_JAVA_LANG_STRING__EDEFAULT.equals(domainName_java_lang_String_);
		case ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__ENDPOINT_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_:
			return endpointType_software_amazon_awscdk_services_apigateway_EndpointType_ != ENDPOINT_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE__EDEFAULT;
		case ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__SECURITY_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_SECURITY_POLICY_:
			return securityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_ != SECURITY_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_SECURITY_POLICY__EDEFAULT;
		case ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		result.append(
				" (certificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference: ");
		result.append(
				certificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference);
		result.append(", domainName_java_lang_String_: ");
		result.append(domainName_java_lang_String_);
		result.append(", endpointType_software_amazon_awscdk_services_apigateway_EndpointType_: ");
		result.append(endpointType_software_amazon_awscdk_services_apigateway_EndpointType_);
		result.append(", securityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_: ");
		result.append(securityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_);
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

} //DomainNameOptionsBuilder_apigatewayImpl
