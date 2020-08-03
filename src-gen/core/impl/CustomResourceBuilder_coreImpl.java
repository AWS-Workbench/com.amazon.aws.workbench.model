/**
 */
package core.impl;

import core.CorePackage;
import core.CustomResourceBuilder_core;
import core.RemovalPolicy;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Resource Builder core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link core.impl.CustomResourceBuilder_coreImpl#getServiceToken_java_lang_String_ <em>Service Token java lang String </em>}</li>
 *   <li>{@link core.impl.CustomResourceBuilder_coreImpl#getPascalCaseProperties_java_lang_Boolean_ <em>Pascal Case Properties java lang Boolean </em>}</li>
 *   <li>{@link core.impl.CustomResourceBuilder_coreImpl#getProperties_java_lang_String__java_lang_Object_AsMap <em>Properties java lang String java lang Object As Map</em>}</li>
 *   <li>{@link core.impl.CustomResourceBuilder_coreImpl#getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ <em>Removal Policy software amazon awscdk core Removal Policy </em>}</li>
 *   <li>{@link core.impl.CustomResourceBuilder_coreImpl#getResourceType_java_lang_String_ <em>Resource Type java lang String </em>}</li>
 *   <li>{@link core.impl.CustomResourceBuilder_coreImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.impl.CustomResourceBuilder_coreImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.impl.CustomResourceBuilder_coreImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.impl.CustomResourceBuilder_coreImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomResourceBuilder_coreImpl extends MinimalEObjectImpl.Container implements CustomResourceBuilder_core {
	/**
	 * The default value of the '{@link #getServiceToken_java_lang_String_() <em>Service Token java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceToken_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_TOKEN_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceToken_java_lang_String_() <em>Service Token java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceToken_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String serviceToken_java_lang_String_ = SERVICE_TOKEN_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getPascalCaseProperties_java_lang_Boolean_() <em>Pascal Case Properties java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPascalCaseProperties_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PASCAL_CASE_PROPERTIES_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPascalCaseProperties_java_lang_Boolean_() <em>Pascal Case Properties java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPascalCaseProperties_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean pascalCaseProperties_java_lang_Boolean_ = PASCAL_CASE_PROPERTIES_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getProperties_java_lang_String__java_lang_Object_AsMap() <em>Properties java lang String java lang Object As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties_java_lang_String__java_lang_Object_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTIES_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProperties_java_lang_String__java_lang_Object_AsMap() <em>Properties java lang String java lang Object As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties_java_lang_String__java_lang_Object_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String properties_java_lang_String__java_lang_Object_AsMap = PROPERTIES_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP_EDEFAULT;

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
	 * The default value of the '{@link #getResourceType_java_lang_String_() <em>Resource Type java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceType_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_TYPE_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceType_java_lang_String_() <em>Resource Type java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceType_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String resourceType_java_lang_String_ = RESOURCE_TYPE_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.core.CustomResource";

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
	protected CustomResourceBuilder_coreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CUSTOM_RESOURCE_BUILDER_CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceToken_java_lang_String_() {
		return serviceToken_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceToken_java_lang_String_(String newServiceToken_java_lang_String_) {
		String oldServiceToken_java_lang_String_ = serviceToken_java_lang_String_;
		serviceToken_java_lang_String_ = newServiceToken_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__SERVICE_TOKEN_JAVA_LANG_STRING_,
					oldServiceToken_java_lang_String_, serviceToken_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPascalCaseProperties_java_lang_Boolean_() {
		return pascalCaseProperties_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPascalCaseProperties_java_lang_Boolean_(Boolean newPascalCaseProperties_java_lang_Boolean_) {
		Boolean oldPascalCaseProperties_java_lang_Boolean_ = pascalCaseProperties_java_lang_Boolean_;
		pascalCaseProperties_java_lang_Boolean_ = newPascalCaseProperties_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__PASCAL_CASE_PROPERTIES_JAVA_LANG_BOOLEAN_,
					oldPascalCaseProperties_java_lang_Boolean_, pascalCaseProperties_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProperties_java_lang_String__java_lang_Object_AsMap() {
		return properties_java_lang_String__java_lang_Object_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProperties_java_lang_String__java_lang_Object_AsMap(
			String newProperties_java_lang_String__java_lang_Object_AsMap) {
		String oldProperties_java_lang_String__java_lang_Object_AsMap = properties_java_lang_String__java_lang_Object_AsMap;
		properties_java_lang_String__java_lang_Object_AsMap = newProperties_java_lang_String__java_lang_Object_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__PROPERTIES_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP,
					oldProperties_java_lang_String__java_lang_Object_AsMap,
					properties_java_lang_String__java_lang_Object_AsMap));
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
					CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_,
					oldRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_,
					removalPolicy_software_amazon_awscdk_core_RemovalPolicy_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResourceType_java_lang_String_() {
		return resourceType_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceType_java_lang_String_(String newResourceType_java_lang_String_) {
		String oldResourceType_java_lang_String_ = resourceType_java_lang_String_;
		resourceType_java_lang_String_ = newResourceType_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__RESOURCE_TYPE_JAVA_LANG_STRING_,
					oldResourceType_java_lang_String_, resourceType_java_lang_String_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__VAR_NAME,
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__IDENTIFIER,
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
					CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__SERVICE_TOKEN_JAVA_LANG_STRING_:
			return getServiceToken_java_lang_String_();
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__PASCAL_CASE_PROPERTIES_JAVA_LANG_BOOLEAN_:
			return getPascalCaseProperties_java_lang_Boolean_();
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__PROPERTIES_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
			return getProperties_java_lang_String__java_lang_Object_AsMap();
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
			return getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_();
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__RESOURCE_TYPE_JAVA_LANG_STRING_:
			return getResourceType_java_lang_String_();
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__VAR_NAME:
			return getVarName();
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__IDENTIFIER:
			return getIdentifier();
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__SERVICE_TOKEN_JAVA_LANG_STRING_:
			setServiceToken_java_lang_String_((String) newValue);
			return;
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__PASCAL_CASE_PROPERTIES_JAVA_LANG_BOOLEAN_:
			setPascalCaseProperties_java_lang_Boolean_((Boolean) newValue);
			return;
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__PROPERTIES_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
			setProperties_java_lang_String__java_lang_Object_AsMap((String) newValue);
			return;
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
			setRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_((RemovalPolicy) newValue);
			return;
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__RESOURCE_TYPE_JAVA_LANG_STRING_:
			setResourceType_java_lang_String_((String) newValue);
			return;
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__VAR_NAME:
			setVarName((String) newValue);
			return;
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__SERVICE_TOKEN_JAVA_LANG_STRING_:
			setServiceToken_java_lang_String_(SERVICE_TOKEN_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__PASCAL_CASE_PROPERTIES_JAVA_LANG_BOOLEAN_:
			setPascalCaseProperties_java_lang_Boolean_(PASCAL_CASE_PROPERTIES_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__PROPERTIES_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
			setProperties_java_lang_String__java_lang_Object_AsMap(
					PROPERTIES_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP_EDEFAULT);
			return;
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
			setRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_(
					REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY__EDEFAULT);
			return;
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__RESOURCE_TYPE_JAVA_LANG_STRING_:
			setResourceType_java_lang_String_(RESOURCE_TYPE_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__SERVICE_TOKEN_JAVA_LANG_STRING_:
			return SERVICE_TOKEN_JAVA_LANG_STRING__EDEFAULT == null ? serviceToken_java_lang_String_ != null
					: !SERVICE_TOKEN_JAVA_LANG_STRING__EDEFAULT.equals(serviceToken_java_lang_String_);
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__PASCAL_CASE_PROPERTIES_JAVA_LANG_BOOLEAN_:
			return PASCAL_CASE_PROPERTIES_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? pascalCaseProperties_java_lang_Boolean_ != null
					: !PASCAL_CASE_PROPERTIES_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(pascalCaseProperties_java_lang_Boolean_);
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__PROPERTIES_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
			return PROPERTIES_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP_EDEFAULT == null
					? properties_java_lang_String__java_lang_Object_AsMap != null
					: !PROPERTIES_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP_EDEFAULT
							.equals(properties_java_lang_String__java_lang_Object_AsMap);
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
			return removalPolicy_software_amazon_awscdk_core_RemovalPolicy_ != REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY__EDEFAULT;
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__RESOURCE_TYPE_JAVA_LANG_STRING_:
			return RESOURCE_TYPE_JAVA_LANG_STRING__EDEFAULT == null ? resourceType_java_lang_String_ != null
					: !RESOURCE_TYPE_JAVA_LANG_STRING__EDEFAULT.equals(resourceType_java_lang_String_);
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE__ADDITIONAL_CODE:
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
		result.append(" (serviceToken_java_lang_String_: ");
		result.append(serviceToken_java_lang_String_);
		result.append(", pascalCaseProperties_java_lang_Boolean_: ");
		result.append(pascalCaseProperties_java_lang_Boolean_);
		result.append(", properties_java_lang_String__java_lang_Object_AsMap: ");
		result.append(properties_java_lang_String__java_lang_Object_AsMap);
		result.append(", removalPolicy_software_amazon_awscdk_core_RemovalPolicy_: ");
		result.append(removalPolicy_software_amazon_awscdk_core_RemovalPolicy_);
		result.append(", resourceType_java_lang_String_: ");
		result.append(resourceType_java_lang_String_);
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

} //CustomResourceBuilder_coreImpl
