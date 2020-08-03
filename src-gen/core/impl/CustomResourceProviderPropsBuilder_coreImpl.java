/**
 */
package core.impl;

import core.CorePackage;
import core.CustomResourceProviderPropsBuilder_core;
import core.CustomResourceProviderRuntime;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Resource Provider Props Builder core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link core.impl.CustomResourceProviderPropsBuilder_coreImpl#getCodeDirectory_java_lang_String_ <em>Code Directory java lang String </em>}</li>
 *   <li>{@link core.impl.CustomResourceProviderPropsBuilder_coreImpl#getRuntime_software_amazon_awscdk_core_CustomResourceProviderRuntime_ <em>Runtime software amazon awscdk core Custom Resource Provider Runtime </em>}</li>
 *   <li>{@link core.impl.CustomResourceProviderPropsBuilder_coreImpl#getMemorySizeWithSize_software_amazon_awscdk_core_Size_AsReference <em>Memory Size With Size software amazon awscdk core Size As Reference</em>}</li>
 *   <li>{@link core.impl.CustomResourceProviderPropsBuilder_coreImpl#getPolicyStatements_java_lang_Object_AsList <em>Policy Statements java lang Object As List</em>}</li>
 *   <li>{@link core.impl.CustomResourceProviderPropsBuilder_coreImpl#getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Timeout With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link core.impl.CustomResourceProviderPropsBuilder_coreImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.impl.CustomResourceProviderPropsBuilder_coreImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.impl.CustomResourceProviderPropsBuilder_coreImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.impl.CustomResourceProviderPropsBuilder_coreImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomResourceProviderPropsBuilder_coreImpl extends MinimalEObjectImpl.Container
		implements CustomResourceProviderPropsBuilder_core {
	/**
	 * The default value of the '{@link #getCodeDirectory_java_lang_String_() <em>Code Directory java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeDirectory_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_DIRECTORY_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeDirectory_java_lang_String_() <em>Code Directory java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeDirectory_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String codeDirectory_java_lang_String_ = CODE_DIRECTORY_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getRuntime_software_amazon_awscdk_core_CustomResourceProviderRuntime_() <em>Runtime software amazon awscdk core Custom Resource Provider Runtime </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntime_software_amazon_awscdk_core_CustomResourceProviderRuntime_()
	 * @generated
	 * @ordered
	 */
	protected static final CustomResourceProviderRuntime RUNTIME_SOFTWARE_AMAZON_AWSCDK_CORE_CUSTOM_RESOURCE_PROVIDER_RUNTIME__EDEFAULT = CustomResourceProviderRuntime.NODEJS_12;

	/**
	 * The cached value of the '{@link #getRuntime_software_amazon_awscdk_core_CustomResourceProviderRuntime_() <em>Runtime software amazon awscdk core Custom Resource Provider Runtime </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntime_software_amazon_awscdk_core_CustomResourceProviderRuntime_()
	 * @generated
	 * @ordered
	 */
	protected CustomResourceProviderRuntime runtime_software_amazon_awscdk_core_CustomResourceProviderRuntime_ = RUNTIME_SOFTWARE_AMAZON_AWSCDK_CORE_CUSTOM_RESOURCE_PROVIDER_RUNTIME__EDEFAULT;

	/**
	 * The default value of the '{@link #getMemorySizeWithSize_software_amazon_awscdk_core_Size_AsReference() <em>Memory Size With Size software amazon awscdk core Size As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySizeWithSize_software_amazon_awscdk_core_Size_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String MEMORY_SIZE_WITH_SIZE_SOFTWARE_AMAZON_AWSCDK_CORE_SIZE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemorySizeWithSize_software_amazon_awscdk_core_Size_AsReference() <em>Memory Size With Size software amazon awscdk core Size As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySizeWithSize_software_amazon_awscdk_core_Size_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String memorySizeWithSize_software_amazon_awscdk_core_Size_AsReference = MEMORY_SIZE_WITH_SIZE_SOFTWARE_AMAZON_AWSCDK_CORE_SIZE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPolicyStatements_java_lang_Object_AsList() <em>Policy Statements java lang Object As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyStatements_java_lang_Object_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_STATEMENTS_JAVA_LANG_OBJECT_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicyStatements_java_lang_Object_AsList() <em>Policy Statements java lang Object As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyStatements_java_lang_Object_AsList()
	 * @generated
	 * @ordered
	 */
	protected String policyStatements_java_lang_Object_AsList = POLICY_STATEMENTS_JAVA_LANG_OBJECT_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Timeout With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Timeout With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference = TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.core.CustomResourceProviderProps";

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
	protected CustomResourceProviderPropsBuilder_coreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCodeDirectory_java_lang_String_() {
		return codeDirectory_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCodeDirectory_java_lang_String_(String newCodeDirectory_java_lang_String_) {
		String oldCodeDirectory_java_lang_String_ = codeDirectory_java_lang_String_;
		codeDirectory_java_lang_String_ = newCodeDirectory_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__CODE_DIRECTORY_JAVA_LANG_STRING_,
					oldCodeDirectory_java_lang_String_, codeDirectory_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomResourceProviderRuntime getRuntime_software_amazon_awscdk_core_CustomResourceProviderRuntime_() {
		return runtime_software_amazon_awscdk_core_CustomResourceProviderRuntime_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuntime_software_amazon_awscdk_core_CustomResourceProviderRuntime_(
			CustomResourceProviderRuntime newRuntime_software_amazon_awscdk_core_CustomResourceProviderRuntime_) {
		CustomResourceProviderRuntime oldRuntime_software_amazon_awscdk_core_CustomResourceProviderRuntime_ = runtime_software_amazon_awscdk_core_CustomResourceProviderRuntime_;
		runtime_software_amazon_awscdk_core_CustomResourceProviderRuntime_ = newRuntime_software_amazon_awscdk_core_CustomResourceProviderRuntime_ == null
				? RUNTIME_SOFTWARE_AMAZON_AWSCDK_CORE_CUSTOM_RESOURCE_PROVIDER_RUNTIME__EDEFAULT
				: newRuntime_software_amazon_awscdk_core_CustomResourceProviderRuntime_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__RUNTIME_SOFTWARE_AMAZON_AWSCDK_CORE_CUSTOM_RESOURCE_PROVIDER_RUNTIME_,
					oldRuntime_software_amazon_awscdk_core_CustomResourceProviderRuntime_,
					runtime_software_amazon_awscdk_core_CustomResourceProviderRuntime_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMemorySizeWithSize_software_amazon_awscdk_core_Size_AsReference() {
		return memorySizeWithSize_software_amazon_awscdk_core_Size_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemorySizeWithSize_software_amazon_awscdk_core_Size_AsReference(
			String newMemorySizeWithSize_software_amazon_awscdk_core_Size_AsReference) {
		String oldMemorySizeWithSize_software_amazon_awscdk_core_Size_AsReference = memorySizeWithSize_software_amazon_awscdk_core_Size_AsReference;
		memorySizeWithSize_software_amazon_awscdk_core_Size_AsReference = newMemorySizeWithSize_software_amazon_awscdk_core_Size_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__MEMORY_SIZE_WITH_SIZE_SOFTWARE_AMAZON_AWSCDK_CORE_SIZE_AS_REFERENCE,
					oldMemorySizeWithSize_software_amazon_awscdk_core_Size_AsReference,
					memorySizeWithSize_software_amazon_awscdk_core_Size_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPolicyStatements_java_lang_Object_AsList() {
		return policyStatements_java_lang_Object_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolicyStatements_java_lang_Object_AsList(String newPolicyStatements_java_lang_Object_AsList) {
		String oldPolicyStatements_java_lang_Object_AsList = policyStatements_java_lang_Object_AsList;
		policyStatements_java_lang_Object_AsList = newPolicyStatements_java_lang_Object_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__POLICY_STATEMENTS_JAVA_LANG_OBJECT_AS_LIST,
					oldPolicyStatements_java_lang_Object_AsList, policyStatements_java_lang_Object_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference = timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference = newTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference));
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
					CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__VAR_NAME, oldVarName, varName));
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
					CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__IDENTIFIER, oldIdentifier, identifier));
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
					CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__ADDITIONAL_CODE, oldAdditionalCode,
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
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__CODE_DIRECTORY_JAVA_LANG_STRING_:
			return getCodeDirectory_java_lang_String_();
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__RUNTIME_SOFTWARE_AMAZON_AWSCDK_CORE_CUSTOM_RESOURCE_PROVIDER_RUNTIME_:
			return getRuntime_software_amazon_awscdk_core_CustomResourceProviderRuntime_();
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__MEMORY_SIZE_WITH_SIZE_SOFTWARE_AMAZON_AWSCDK_CORE_SIZE_AS_REFERENCE:
			return getMemorySizeWithSize_software_amazon_awscdk_core_Size_AsReference();
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__POLICY_STATEMENTS_JAVA_LANG_OBJECT_AS_LIST:
			return getPolicyStatements_java_lang_Object_AsList();
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__VAR_NAME:
			return getVarName();
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__IDENTIFIER:
			return getIdentifier();
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__CODE_DIRECTORY_JAVA_LANG_STRING_:
			setCodeDirectory_java_lang_String_((String) newValue);
			return;
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__RUNTIME_SOFTWARE_AMAZON_AWSCDK_CORE_CUSTOM_RESOURCE_PROVIDER_RUNTIME_:
			setRuntime_software_amazon_awscdk_core_CustomResourceProviderRuntime_(
					(CustomResourceProviderRuntime) newValue);
			return;
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__MEMORY_SIZE_WITH_SIZE_SOFTWARE_AMAZON_AWSCDK_CORE_SIZE_AS_REFERENCE:
			setMemorySizeWithSize_software_amazon_awscdk_core_Size_AsReference((String) newValue);
			return;
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__POLICY_STATEMENTS_JAVA_LANG_OBJECT_AS_LIST:
			setPolicyStatements_java_lang_Object_AsList((String) newValue);
			return;
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__VAR_NAME:
			setVarName((String) newValue);
			return;
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__CODE_DIRECTORY_JAVA_LANG_STRING_:
			setCodeDirectory_java_lang_String_(CODE_DIRECTORY_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__RUNTIME_SOFTWARE_AMAZON_AWSCDK_CORE_CUSTOM_RESOURCE_PROVIDER_RUNTIME_:
			setRuntime_software_amazon_awscdk_core_CustomResourceProviderRuntime_(
					RUNTIME_SOFTWARE_AMAZON_AWSCDK_CORE_CUSTOM_RESOURCE_PROVIDER_RUNTIME__EDEFAULT);
			return;
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__MEMORY_SIZE_WITH_SIZE_SOFTWARE_AMAZON_AWSCDK_CORE_SIZE_AS_REFERENCE:
			setMemorySizeWithSize_software_amazon_awscdk_core_Size_AsReference(
					MEMORY_SIZE_WITH_SIZE_SOFTWARE_AMAZON_AWSCDK_CORE_SIZE_AS_REFERENCE_EDEFAULT);
			return;
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__POLICY_STATEMENTS_JAVA_LANG_OBJECT_AS_LIST:
			setPolicyStatements_java_lang_Object_AsList(POLICY_STATEMENTS_JAVA_LANG_OBJECT_AS_LIST_EDEFAULT);
			return;
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__CODE_DIRECTORY_JAVA_LANG_STRING_:
			return CODE_DIRECTORY_JAVA_LANG_STRING__EDEFAULT == null ? codeDirectory_java_lang_String_ != null
					: !CODE_DIRECTORY_JAVA_LANG_STRING__EDEFAULT.equals(codeDirectory_java_lang_String_);
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__RUNTIME_SOFTWARE_AMAZON_AWSCDK_CORE_CUSTOM_RESOURCE_PROVIDER_RUNTIME_:
			return runtime_software_amazon_awscdk_core_CustomResourceProviderRuntime_ != RUNTIME_SOFTWARE_AMAZON_AWSCDK_CORE_CUSTOM_RESOURCE_PROVIDER_RUNTIME__EDEFAULT;
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__MEMORY_SIZE_WITH_SIZE_SOFTWARE_AMAZON_AWSCDK_CORE_SIZE_AS_REFERENCE:
			return MEMORY_SIZE_WITH_SIZE_SOFTWARE_AMAZON_AWSCDK_CORE_SIZE_AS_REFERENCE_EDEFAULT == null
					? memorySizeWithSize_software_amazon_awscdk_core_Size_AsReference != null
					: !MEMORY_SIZE_WITH_SIZE_SOFTWARE_AMAZON_AWSCDK_CORE_SIZE_AS_REFERENCE_EDEFAULT
							.equals(memorySizeWithSize_software_amazon_awscdk_core_Size_AsReference);
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__POLICY_STATEMENTS_JAVA_LANG_OBJECT_AS_LIST:
			return POLICY_STATEMENTS_JAVA_LANG_OBJECT_AS_LIST_EDEFAULT == null
					? policyStatements_java_lang_Object_AsList != null
					: !POLICY_STATEMENTS_JAVA_LANG_OBJECT_AS_LIST_EDEFAULT
							.equals(policyStatements_java_lang_Object_AsList);
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__ADDITIONAL_CODE:
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
		result.append(" (codeDirectory_java_lang_String_: ");
		result.append(codeDirectory_java_lang_String_);
		result.append(", runtime_software_amazon_awscdk_core_CustomResourceProviderRuntime_: ");
		result.append(runtime_software_amazon_awscdk_core_CustomResourceProviderRuntime_);
		result.append(", memorySizeWithSize_software_amazon_awscdk_core_Size_AsReference: ");
		result.append(memorySizeWithSize_software_amazon_awscdk_core_Size_AsReference);
		result.append(", policyStatements_java_lang_Object_AsList: ");
		result.append(policyStatements_java_lang_Object_AsList);
		result.append(", timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference);
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

} //CustomResourceProviderPropsBuilder_coreImpl
