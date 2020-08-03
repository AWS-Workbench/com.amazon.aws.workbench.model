/**
 */
package core.impl;

import core.CorePackage;
import core.StackPropsBuilder_core;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stack Props Builder core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link core.impl.StackPropsBuilder_coreImpl#getDescription_java_lang_String_ <em>Description java lang String </em>}</li>
 *   <li>{@link core.impl.StackPropsBuilder_coreImpl#getEnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference <em>Env With Environment software amazon awscdk core Environment As Reference</em>}</li>
 *   <li>{@link core.impl.StackPropsBuilder_coreImpl#getStackName_java_lang_String_ <em>Stack Name java lang String </em>}</li>
 *   <li>{@link core.impl.StackPropsBuilder_coreImpl#getSynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference <em>Synthesizer With IStack Synthesizer software amazon awscdk core IStack Synthesizer As Reference</em>}</li>
 *   <li>{@link core.impl.StackPropsBuilder_coreImpl#getTags_java_lang_String__java_lang_String_AsMap <em>Tags java lang String java lang String As Map</em>}</li>
 *   <li>{@link core.impl.StackPropsBuilder_coreImpl#getTerminationProtection_java_lang_Boolean_ <em>Termination Protection java lang Boolean </em>}</li>
 *   <li>{@link core.impl.StackPropsBuilder_coreImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.impl.StackPropsBuilder_coreImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.impl.StackPropsBuilder_coreImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.impl.StackPropsBuilder_coreImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StackPropsBuilder_coreImpl extends MinimalEObjectImpl.Container implements StackPropsBuilder_core {
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
	 * The default value of the '{@link #getEnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference() <em>Env With Environment software amazon awscdk core Environment As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String ENV_WITH_ENVIRONMENT_SOFTWARE_AMAZON_AWSCDK_CORE_ENVIRONMENT_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference() <em>Env With Environment software amazon awscdk core Environment As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String envWithEnvironment_software_amazon_awscdk_core_Environment_AsReference = ENV_WITH_ENVIRONMENT_SOFTWARE_AMAZON_AWSCDK_CORE_ENVIRONMENT_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStackName_java_lang_String_() <em>Stack Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String STACK_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStackName_java_lang_String_() <em>Stack Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String stackName_java_lang_String_ = STACK_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getSynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference() <em>Synthesizer With IStack Synthesizer software amazon awscdk core IStack Synthesizer As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_SOFTWARE_AMAZON_AWSCDK_CORE_ISTACK_SYNTHESIZER_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference() <em>Synthesizer With IStack Synthesizer software amazon awscdk core IStack Synthesizer As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String synthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference = SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_SOFTWARE_AMAZON_AWSCDK_CORE_ISTACK_SYNTHESIZER_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTags_java_lang_String__java_lang_String_AsMap() <em>Tags java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTags_java_lang_String__java_lang_String_AsMap() <em>Tags java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String tags_java_lang_String__java_lang_String_AsMap = TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getTerminationProtection_java_lang_Boolean_() <em>Termination Protection java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminationProtection_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TERMINATION_PROTECTION_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTerminationProtection_java_lang_Boolean_() <em>Termination Protection java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminationProtection_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean terminationProtection_java_lang_Boolean_ = TERMINATION_PROTECTION_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.core.StackProps";

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
	protected StackPropsBuilder_coreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.STACK_PROPS_BUILDER_CORE;
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
					CorePackage.STACK_PROPS_BUILDER_CORE__DESCRIPTION_JAVA_LANG_STRING_,
					oldDescription_java_lang_String_, description_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference() {
		return envWithEnvironment_software_amazon_awscdk_core_Environment_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference(
			String newEnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference) {
		String oldEnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference = envWithEnvironment_software_amazon_awscdk_core_Environment_AsReference;
		envWithEnvironment_software_amazon_awscdk_core_Environment_AsReference = newEnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.STACK_PROPS_BUILDER_CORE__ENV_WITH_ENVIRONMENT_SOFTWARE_AMAZON_AWSCDK_CORE_ENVIRONMENT_AS_REFERENCE,
					oldEnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference,
					envWithEnvironment_software_amazon_awscdk_core_Environment_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStackName_java_lang_String_() {
		return stackName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStackName_java_lang_String_(String newStackName_java_lang_String_) {
		String oldStackName_java_lang_String_ = stackName_java_lang_String_;
		stackName_java_lang_String_ = newStackName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.STACK_PROPS_BUILDER_CORE__STACK_NAME_JAVA_LANG_STRING_, oldStackName_java_lang_String_,
					stackName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference() {
		return synthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference(
			String newSynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference) {
		String oldSynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference = synthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference;
		synthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference = newSynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.STACK_PROPS_BUILDER_CORE__SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_SOFTWARE_AMAZON_AWSCDK_CORE_ISTACK_SYNTHESIZER_AS_REFERENCE,
					oldSynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference,
					synthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTags_java_lang_String__java_lang_String_AsMap() {
		return tags_java_lang_String__java_lang_String_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTags_java_lang_String__java_lang_String_AsMap(
			String newTags_java_lang_String__java_lang_String_AsMap) {
		String oldTags_java_lang_String__java_lang_String_AsMap = tags_java_lang_String__java_lang_String_AsMap;
		tags_java_lang_String__java_lang_String_AsMap = newTags_java_lang_String__java_lang_String_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.STACK_PROPS_BUILDER_CORE__TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
					oldTags_java_lang_String__java_lang_String_AsMap, tags_java_lang_String__java_lang_String_AsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getTerminationProtection_java_lang_Boolean_() {
		return terminationProtection_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTerminationProtection_java_lang_Boolean_(Boolean newTerminationProtection_java_lang_Boolean_) {
		Boolean oldTerminationProtection_java_lang_Boolean_ = terminationProtection_java_lang_Boolean_;
		terminationProtection_java_lang_Boolean_ = newTerminationProtection_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.STACK_PROPS_BUILDER_CORE__TERMINATION_PROTECTION_JAVA_LANG_BOOLEAN_,
					oldTerminationProtection_java_lang_Boolean_, terminationProtection_java_lang_Boolean_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.STACK_PROPS_BUILDER_CORE__VAR_NAME,
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.STACK_PROPS_BUILDER_CORE__IDENTIFIER,
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.STACK_PROPS_BUILDER_CORE__ADDITIONAL_CODE,
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
		case CorePackage.STACK_PROPS_BUILDER_CORE__DESCRIPTION_JAVA_LANG_STRING_:
			return getDescription_java_lang_String_();
		case CorePackage.STACK_PROPS_BUILDER_CORE__ENV_WITH_ENVIRONMENT_SOFTWARE_AMAZON_AWSCDK_CORE_ENVIRONMENT_AS_REFERENCE:
			return getEnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference();
		case CorePackage.STACK_PROPS_BUILDER_CORE__STACK_NAME_JAVA_LANG_STRING_:
			return getStackName_java_lang_String_();
		case CorePackage.STACK_PROPS_BUILDER_CORE__SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_SOFTWARE_AMAZON_AWSCDK_CORE_ISTACK_SYNTHESIZER_AS_REFERENCE:
			return getSynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference();
		case CorePackage.STACK_PROPS_BUILDER_CORE__TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return getTags_java_lang_String__java_lang_String_AsMap();
		case CorePackage.STACK_PROPS_BUILDER_CORE__TERMINATION_PROTECTION_JAVA_LANG_BOOLEAN_:
			return getTerminationProtection_java_lang_Boolean_();
		case CorePackage.STACK_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case CorePackage.STACK_PROPS_BUILDER_CORE__VAR_NAME:
			return getVarName();
		case CorePackage.STACK_PROPS_BUILDER_CORE__IDENTIFIER:
			return getIdentifier();
		case CorePackage.STACK_PROPS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.STACK_PROPS_BUILDER_CORE__DESCRIPTION_JAVA_LANG_STRING_:
			setDescription_java_lang_String_((String) newValue);
			return;
		case CorePackage.STACK_PROPS_BUILDER_CORE__ENV_WITH_ENVIRONMENT_SOFTWARE_AMAZON_AWSCDK_CORE_ENVIRONMENT_AS_REFERENCE:
			setEnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference((String) newValue);
			return;
		case CorePackage.STACK_PROPS_BUILDER_CORE__STACK_NAME_JAVA_LANG_STRING_:
			setStackName_java_lang_String_((String) newValue);
			return;
		case CorePackage.STACK_PROPS_BUILDER_CORE__SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_SOFTWARE_AMAZON_AWSCDK_CORE_ISTACK_SYNTHESIZER_AS_REFERENCE:
			setSynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference(
					(String) newValue);
			return;
		case CorePackage.STACK_PROPS_BUILDER_CORE__TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setTags_java_lang_String__java_lang_String_AsMap((String) newValue);
			return;
		case CorePackage.STACK_PROPS_BUILDER_CORE__TERMINATION_PROTECTION_JAVA_LANG_BOOLEAN_:
			setTerminationProtection_java_lang_Boolean_((Boolean) newValue);
			return;
		case CorePackage.STACK_PROPS_BUILDER_CORE__VAR_NAME:
			setVarName((String) newValue);
			return;
		case CorePackage.STACK_PROPS_BUILDER_CORE__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case CorePackage.STACK_PROPS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.STACK_PROPS_BUILDER_CORE__DESCRIPTION_JAVA_LANG_STRING_:
			setDescription_java_lang_String_(DESCRIPTION_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.STACK_PROPS_BUILDER_CORE__ENV_WITH_ENVIRONMENT_SOFTWARE_AMAZON_AWSCDK_CORE_ENVIRONMENT_AS_REFERENCE:
			setEnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference(
					ENV_WITH_ENVIRONMENT_SOFTWARE_AMAZON_AWSCDK_CORE_ENVIRONMENT_AS_REFERENCE_EDEFAULT);
			return;
		case CorePackage.STACK_PROPS_BUILDER_CORE__STACK_NAME_JAVA_LANG_STRING_:
			setStackName_java_lang_String_(STACK_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.STACK_PROPS_BUILDER_CORE__SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_SOFTWARE_AMAZON_AWSCDK_CORE_ISTACK_SYNTHESIZER_AS_REFERENCE:
			setSynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference(
					SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_SOFTWARE_AMAZON_AWSCDK_CORE_ISTACK_SYNTHESIZER_AS_REFERENCE_EDEFAULT);
			return;
		case CorePackage.STACK_PROPS_BUILDER_CORE__TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setTags_java_lang_String__java_lang_String_AsMap(TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT);
			return;
		case CorePackage.STACK_PROPS_BUILDER_CORE__TERMINATION_PROTECTION_JAVA_LANG_BOOLEAN_:
			setTerminationProtection_java_lang_Boolean_(TERMINATION_PROTECTION_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case CorePackage.STACK_PROPS_BUILDER_CORE__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case CorePackage.STACK_PROPS_BUILDER_CORE__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case CorePackage.STACK_PROPS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.STACK_PROPS_BUILDER_CORE__DESCRIPTION_JAVA_LANG_STRING_:
			return DESCRIPTION_JAVA_LANG_STRING__EDEFAULT == null ? description_java_lang_String_ != null
					: !DESCRIPTION_JAVA_LANG_STRING__EDEFAULT.equals(description_java_lang_String_);
		case CorePackage.STACK_PROPS_BUILDER_CORE__ENV_WITH_ENVIRONMENT_SOFTWARE_AMAZON_AWSCDK_CORE_ENVIRONMENT_AS_REFERENCE:
			return ENV_WITH_ENVIRONMENT_SOFTWARE_AMAZON_AWSCDK_CORE_ENVIRONMENT_AS_REFERENCE_EDEFAULT == null
					? envWithEnvironment_software_amazon_awscdk_core_Environment_AsReference != null
					: !ENV_WITH_ENVIRONMENT_SOFTWARE_AMAZON_AWSCDK_CORE_ENVIRONMENT_AS_REFERENCE_EDEFAULT
							.equals(envWithEnvironment_software_amazon_awscdk_core_Environment_AsReference);
		case CorePackage.STACK_PROPS_BUILDER_CORE__STACK_NAME_JAVA_LANG_STRING_:
			return STACK_NAME_JAVA_LANG_STRING__EDEFAULT == null ? stackName_java_lang_String_ != null
					: !STACK_NAME_JAVA_LANG_STRING__EDEFAULT.equals(stackName_java_lang_String_);
		case CorePackage.STACK_PROPS_BUILDER_CORE__SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_SOFTWARE_AMAZON_AWSCDK_CORE_ISTACK_SYNTHESIZER_AS_REFERENCE:
			return SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_SOFTWARE_AMAZON_AWSCDK_CORE_ISTACK_SYNTHESIZER_AS_REFERENCE_EDEFAULT == null
					? synthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference != null
					: !SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_SOFTWARE_AMAZON_AWSCDK_CORE_ISTACK_SYNTHESIZER_AS_REFERENCE_EDEFAULT
							.equals(synthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference);
		case CorePackage.STACK_PROPS_BUILDER_CORE__TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT == null
					? tags_java_lang_String__java_lang_String_AsMap != null
					: !TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT
							.equals(tags_java_lang_String__java_lang_String_AsMap);
		case CorePackage.STACK_PROPS_BUILDER_CORE__TERMINATION_PROTECTION_JAVA_LANG_BOOLEAN_:
			return TERMINATION_PROTECTION_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? terminationProtection_java_lang_Boolean_ != null
					: !TERMINATION_PROTECTION_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(terminationProtection_java_lang_Boolean_);
		case CorePackage.STACK_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case CorePackage.STACK_PROPS_BUILDER_CORE__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case CorePackage.STACK_PROPS_BUILDER_CORE__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case CorePackage.STACK_PROPS_BUILDER_CORE__ADDITIONAL_CODE:
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
		result.append(" (description_java_lang_String_: ");
		result.append(description_java_lang_String_);
		result.append(", envWithEnvironment_software_amazon_awscdk_core_Environment_AsReference: ");
		result.append(envWithEnvironment_software_amazon_awscdk_core_Environment_AsReference);
		result.append(", stackName_java_lang_String_: ");
		result.append(stackName_java_lang_String_);
		result.append(", synthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference: ");
		result.append(synthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference);
		result.append(", tags_java_lang_String__java_lang_String_AsMap: ");
		result.append(tags_java_lang_String__java_lang_String_AsMap);
		result.append(", terminationProtection_java_lang_Boolean_: ");
		result.append(terminationProtection_java_lang_Boolean_);
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

} //StackPropsBuilder_coreImpl
