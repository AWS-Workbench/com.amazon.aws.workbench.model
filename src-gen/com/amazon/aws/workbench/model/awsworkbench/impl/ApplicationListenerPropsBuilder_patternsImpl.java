/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.ApplicationListenerPropsBuilder_patterns;
import com.amazon.aws.workbench.model.awsworkbench.ApplicationProtocol;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Listener Props Builder patterns</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationListenerPropsBuilder_patternsImpl#getName_java_lang_String_ <em>Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationListenerPropsBuilder_patternsImpl#getCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference <em>Certificate With ICertificate software amazon awscdk services certificatemanager ICertificate As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationListenerPropsBuilder_patternsImpl#getPort_java_lang_Number_ <em>Port java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationListenerPropsBuilder_patternsImpl#getProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_ <em>Protocol software amazon awscdk services elasticloadbalancingv2 Application Protocol </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationListenerPropsBuilder_patternsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationListenerPropsBuilder_patternsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationListenerPropsBuilder_patternsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationListenerPropsBuilder_patternsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationListenerPropsBuilder_patternsImpl extends ServiceResourcesImpl
		implements ApplicationListenerPropsBuilder_patterns {
	/**
	 * The default value of the '{@link #getName_java_lang_String_() <em>Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName_java_lang_String_() <em>Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String name_java_lang_String_ = NAME_JAVA_LANG_STRING__EDEFAULT;

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
	 * The default value of the '{@link #getPort_java_lang_Number_() <em>Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPort_java_lang_Number_() <em>Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int port_java_lang_Number_ = PORT_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_() <em>Protocol software amazon awscdk services elasticloadbalancingv2 Application Protocol </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_()
	 * @generated
	 * @ordered
	 */
	protected static final ApplicationProtocol PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_APPLICATION_PROTOCOL__EDEFAULT = ApplicationProtocol.HTTP;

	/**
	 * The cached value of the '{@link #getProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_() <em>Protocol software amazon awscdk services elasticloadbalancingv2 Application Protocol </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_()
	 * @generated
	 * @ordered
	 */
	protected ApplicationProtocol protocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_ = PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_APPLICATION_PROTOCOL__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ecs.patterns.ApplicationListenerProps";

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
	protected ApplicationListenerPropsBuilder_patternsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName_java_lang_String_() {
		return name_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName_java_lang_String_(String newName_java_lang_String_) {
		String oldName_java_lang_String_ = name_java_lang_String_;
		name_java_lang_String_ = newName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__NAME_JAVA_LANG_STRING_,
					oldName_java_lang_String_, name_java_lang_String_));
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
					AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__CERTIFICATE_WITH_ICERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_ICERTIFICATE_AS_REFERENCE,
					oldCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference,
					certificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPort_java_lang_Number_() {
		return port_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPort_java_lang_Number_(int newPort_java_lang_Number_) {
		int oldPort_java_lang_Number_ = port_java_lang_Number_;
		port_java_lang_Number_ = newPort_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__PORT_JAVA_LANG_NUMBER_,
					oldPort_java_lang_Number_, port_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationProtocol getProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_() {
		return protocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_(
			ApplicationProtocol newProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_) {
		ApplicationProtocol oldProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_ = protocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_;
		protocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_ = newProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_ == null
				? PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_APPLICATION_PROTOCOL__EDEFAULT
				: newProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_APPLICATION_PROTOCOL_,
					oldProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_,
					protocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_));
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
					AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__IDENTIFIER, oldIdentifier,
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
					AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__NAME_JAVA_LANG_STRING_:
			return getName_java_lang_String_();
		case AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__CERTIFICATE_WITH_ICERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_ICERTIFICATE_AS_REFERENCE:
			return getCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference();
		case AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__PORT_JAVA_LANG_NUMBER_:
			return getPort_java_lang_Number_();
		case AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_APPLICATION_PROTOCOL_:
			return getProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_();
		case AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__NAME_JAVA_LANG_STRING_:
			setName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__CERTIFICATE_WITH_ICERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_ICERTIFICATE_AS_REFERENCE:
			setCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__PORT_JAVA_LANG_NUMBER_:
			setPort_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_APPLICATION_PROTOCOL_:
			setProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_(
					(ApplicationProtocol) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__NAME_JAVA_LANG_STRING_:
			setName_java_lang_String_(NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__CERTIFICATE_WITH_ICERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_ICERTIFICATE_AS_REFERENCE:
			setCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference(
					CERTIFICATE_WITH_ICERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_ICERTIFICATE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__PORT_JAVA_LANG_NUMBER_:
			setPort_java_lang_Number_(PORT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_APPLICATION_PROTOCOL_:
			setProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_(
					PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_APPLICATION_PROTOCOL__EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__NAME_JAVA_LANG_STRING_:
			return NAME_JAVA_LANG_STRING__EDEFAULT == null ? name_java_lang_String_ != null
					: !NAME_JAVA_LANG_STRING__EDEFAULT.equals(name_java_lang_String_);
		case AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__CERTIFICATE_WITH_ICERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_ICERTIFICATE_AS_REFERENCE:
			return CERTIFICATE_WITH_ICERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_ICERTIFICATE_AS_REFERENCE_EDEFAULT == null
					? certificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference != null
					: !CERTIFICATE_WITH_ICERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_ICERTIFICATE_AS_REFERENCE_EDEFAULT
							.equals(certificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference);
		case AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__PORT_JAVA_LANG_NUMBER_:
			return port_java_lang_Number_ != PORT_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_APPLICATION_PROTOCOL_:
			return protocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_ != PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_APPLICATION_PROTOCOL__EDEFAULT;
		case AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
		result.append(" (name_java_lang_String_: ");
		result.append(name_java_lang_String_);
		result.append(
				", certificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference: ");
		result.append(
				certificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference);
		result.append(", port_java_lang_Number_: ");
		result.append(port_java_lang_Number_);
		result.append(", protocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_: ");
		result.append(protocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_);
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

} //ApplicationListenerPropsBuilder_patternsImpl
