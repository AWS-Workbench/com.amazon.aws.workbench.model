/**
 */
package certificatemanager.impl;

import certificatemanager.CertificatePropsBuilder_certificatemanager;
import certificatemanager.CertificatemanagerPackage;
import certificatemanager.ValidationMethod;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Certificate Props Builder certificatemanager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link certificatemanager.impl.CertificatePropsBuilder_certificatemanagerImpl#getDomainName_java_lang_String_ <em>Domain Name java lang String </em>}</li>
 *   <li>{@link certificatemanager.impl.CertificatePropsBuilder_certificatemanagerImpl#getSubjectAlternativeNames_java_lang_String_AsList <em>Subject Alternative Names java lang String As List</em>}</li>
 *   <li>{@link certificatemanager.impl.CertificatePropsBuilder_certificatemanagerImpl#getValidationDomains_java_lang_String__java_lang_String_AsMap <em>Validation Domains java lang String java lang String As Map</em>}</li>
 *   <li>{@link certificatemanager.impl.CertificatePropsBuilder_certificatemanagerImpl#getValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_ <em>Validation Method software amazon awscdk services certificatemanager Validation Method </em>}</li>
 *   <li>{@link certificatemanager.impl.CertificatePropsBuilder_certificatemanagerImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link certificatemanager.impl.CertificatePropsBuilder_certificatemanagerImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link certificatemanager.impl.CertificatePropsBuilder_certificatemanagerImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link certificatemanager.impl.CertificatePropsBuilder_certificatemanagerImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CertificatePropsBuilder_certificatemanagerImpl extends MinimalEObjectImpl.Container
		implements CertificatePropsBuilder_certificatemanager {
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
	 * The default value of the '{@link #getSubjectAlternativeNames_java_lang_String_AsList() <em>Subject Alternative Names java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectAlternativeNames_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_ALTERNATIVE_NAMES_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubjectAlternativeNames_java_lang_String_AsList() <em>Subject Alternative Names java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectAlternativeNames_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String subjectAlternativeNames_java_lang_String_AsList = SUBJECT_ALTERNATIVE_NAMES_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidationDomains_java_lang_String__java_lang_String_AsMap() <em>Validation Domains java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationDomains_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATION_DOMAINS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidationDomains_java_lang_String__java_lang_String_AsMap() <em>Validation Domains java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationDomains_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String validationDomains_java_lang_String__java_lang_String_AsMap = VALIDATION_DOMAINS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_() <em>Validation Method software amazon awscdk services certificatemanager Validation Method </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_()
	 * @generated
	 * @ordered
	 */
	protected static final ValidationMethod VALIDATION_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_VALIDATION_METHOD__EDEFAULT = ValidationMethod.EMAIL;

	/**
	 * The cached value of the '{@link #getValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_() <em>Validation Method software amazon awscdk services certificatemanager Validation Method </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_()
	 * @generated
	 * @ordered
	 */
	protected ValidationMethod validationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_ = VALIDATION_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_VALIDATION_METHOD__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.certificatemanager.CertificateProps";

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
	protected CertificatePropsBuilder_certificatemanagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CertificatemanagerPackage.Literals.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER;
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
					CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__DOMAIN_NAME_JAVA_LANG_STRING_,
					oldDomainName_java_lang_String_, domainName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubjectAlternativeNames_java_lang_String_AsList() {
		return subjectAlternativeNames_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubjectAlternativeNames_java_lang_String_AsList(
			String newSubjectAlternativeNames_java_lang_String_AsList) {
		String oldSubjectAlternativeNames_java_lang_String_AsList = subjectAlternativeNames_java_lang_String_AsList;
		subjectAlternativeNames_java_lang_String_AsList = newSubjectAlternativeNames_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__SUBJECT_ALTERNATIVE_NAMES_JAVA_LANG_STRING_AS_LIST,
					oldSubjectAlternativeNames_java_lang_String_AsList,
					subjectAlternativeNames_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValidationDomains_java_lang_String__java_lang_String_AsMap() {
		return validationDomains_java_lang_String__java_lang_String_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidationDomains_java_lang_String__java_lang_String_AsMap(
			String newValidationDomains_java_lang_String__java_lang_String_AsMap) {
		String oldValidationDomains_java_lang_String__java_lang_String_AsMap = validationDomains_java_lang_String__java_lang_String_AsMap;
		validationDomains_java_lang_String__java_lang_String_AsMap = newValidationDomains_java_lang_String__java_lang_String_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__VALIDATION_DOMAINS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
					oldValidationDomains_java_lang_String__java_lang_String_AsMap,
					validationDomains_java_lang_String__java_lang_String_AsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidationMethod getValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_() {
		return validationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_(
			ValidationMethod newValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_) {
		ValidationMethod oldValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_ = validationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_;
		validationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_ = newValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_ == null
				? VALIDATION_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_VALIDATION_METHOD__EDEFAULT
				: newValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__VALIDATION_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_VALIDATION_METHOD_,
					oldValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_,
					validationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_));
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
					CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__VAR_NAME, oldVarName,
					varName));
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
					CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__IDENTIFIER, oldIdentifier,
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
					CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__ADDITIONAL_CODE,
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
		case CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__DOMAIN_NAME_JAVA_LANG_STRING_:
			return getDomainName_java_lang_String_();
		case CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__SUBJECT_ALTERNATIVE_NAMES_JAVA_LANG_STRING_AS_LIST:
			return getSubjectAlternativeNames_java_lang_String_AsList();
		case CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__VALIDATION_DOMAINS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return getValidationDomains_java_lang_String__java_lang_String_AsMap();
		case CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__VALIDATION_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_VALIDATION_METHOD_:
			return getValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_();
		case CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__VAR_NAME:
			return getVarName();
		case CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__IDENTIFIER:
			return getIdentifier();
		case CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__ADDITIONAL_CODE:
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
		case CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__DOMAIN_NAME_JAVA_LANG_STRING_:
			setDomainName_java_lang_String_((String) newValue);
			return;
		case CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__SUBJECT_ALTERNATIVE_NAMES_JAVA_LANG_STRING_AS_LIST:
			setSubjectAlternativeNames_java_lang_String_AsList((String) newValue);
			return;
		case CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__VALIDATION_DOMAINS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setValidationDomains_java_lang_String__java_lang_String_AsMap((String) newValue);
			return;
		case CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__VALIDATION_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_VALIDATION_METHOD_:
			setValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_(
					(ValidationMethod) newValue);
			return;
		case CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__VAR_NAME:
			setVarName((String) newValue);
			return;
		case CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__ADDITIONAL_CODE:
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
		case CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__DOMAIN_NAME_JAVA_LANG_STRING_:
			setDomainName_java_lang_String_(DOMAIN_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__SUBJECT_ALTERNATIVE_NAMES_JAVA_LANG_STRING_AS_LIST:
			setSubjectAlternativeNames_java_lang_String_AsList(
					SUBJECT_ALTERNATIVE_NAMES_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__VALIDATION_DOMAINS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setValidationDomains_java_lang_String__java_lang_String_AsMap(
					VALIDATION_DOMAINS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT);
			return;
		case CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__VALIDATION_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_VALIDATION_METHOD_:
			setValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_(
					VALIDATION_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_VALIDATION_METHOD__EDEFAULT);
			return;
		case CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__ADDITIONAL_CODE:
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
		case CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__DOMAIN_NAME_JAVA_LANG_STRING_:
			return DOMAIN_NAME_JAVA_LANG_STRING__EDEFAULT == null ? domainName_java_lang_String_ != null
					: !DOMAIN_NAME_JAVA_LANG_STRING__EDEFAULT.equals(domainName_java_lang_String_);
		case CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__SUBJECT_ALTERNATIVE_NAMES_JAVA_LANG_STRING_AS_LIST:
			return SUBJECT_ALTERNATIVE_NAMES_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? subjectAlternativeNames_java_lang_String_AsList != null
					: !SUBJECT_ALTERNATIVE_NAMES_JAVA_LANG_STRING_AS_LIST_EDEFAULT
							.equals(subjectAlternativeNames_java_lang_String_AsList);
		case CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__VALIDATION_DOMAINS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return VALIDATION_DOMAINS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT == null
					? validationDomains_java_lang_String__java_lang_String_AsMap != null
					: !VALIDATION_DOMAINS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT
							.equals(validationDomains_java_lang_String__java_lang_String_AsMap);
		case CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__VALIDATION_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_VALIDATION_METHOD_:
			return validationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_ != VALIDATION_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_VALIDATION_METHOD__EDEFAULT;
		case CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER__ADDITIONAL_CODE:
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
		result.append(", subjectAlternativeNames_java_lang_String_AsList: ");
		result.append(subjectAlternativeNames_java_lang_String_AsList);
		result.append(", validationDomains_java_lang_String__java_lang_String_AsMap: ");
		result.append(validationDomains_java_lang_String__java_lang_String_AsMap);
		result.append(", validationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_: ");
		result.append(validationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_);
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

} //CertificatePropsBuilder_certificatemanagerImpl
