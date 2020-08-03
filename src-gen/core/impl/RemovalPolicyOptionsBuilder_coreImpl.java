/**
 */
package core.impl;

import core.CorePackage;
import core.RemovalPolicy;
import core.RemovalPolicyOptionsBuilder_core;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Removal Policy Options Builder core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link core.impl.RemovalPolicyOptionsBuilder_coreImpl#getApplyToUpdateReplacePolicy_java_lang_Boolean_ <em>Apply To Update Replace Policy java lang Boolean </em>}</li>
 *   <li>{@link core.impl.RemovalPolicyOptionsBuilder_coreImpl#getDefaultValue_software_amazon_awscdk_core_RemovalPolicy_ <em>Default Value software amazon awscdk core Removal Policy </em>}</li>
 *   <li>{@link core.impl.RemovalPolicyOptionsBuilder_coreImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.impl.RemovalPolicyOptionsBuilder_coreImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.impl.RemovalPolicyOptionsBuilder_coreImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.impl.RemovalPolicyOptionsBuilder_coreImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemovalPolicyOptionsBuilder_coreImpl extends MinimalEObjectImpl.Container
		implements RemovalPolicyOptionsBuilder_core {
	/**
	 * The default value of the '{@link #getApplyToUpdateReplacePolicy_java_lang_Boolean_() <em>Apply To Update Replace Policy java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplyToUpdateReplacePolicy_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean APPLY_TO_UPDATE_REPLACE_POLICY_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplyToUpdateReplacePolicy_java_lang_Boolean_() <em>Apply To Update Replace Policy java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplyToUpdateReplacePolicy_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean applyToUpdateReplacePolicy_java_lang_Boolean_ = APPLY_TO_UPDATE_REPLACE_POLICY_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue_software_amazon_awscdk_core_RemovalPolicy_() <em>Default Value software amazon awscdk core Removal Policy </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue_software_amazon_awscdk_core_RemovalPolicy_()
	 * @generated
	 * @ordered
	 */
	protected static final RemovalPolicy DEFAULT_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY__EDEFAULT = RemovalPolicy.DESTROY;

	/**
	 * The cached value of the '{@link #getDefaultValue_software_amazon_awscdk_core_RemovalPolicy_() <em>Default Value software amazon awscdk core Removal Policy </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue_software_amazon_awscdk_core_RemovalPolicy_()
	 * @generated
	 * @ordered
	 */
	protected RemovalPolicy defaultValue_software_amazon_awscdk_core_RemovalPolicy_ = DEFAULT_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.core.RemovalPolicyOptions";

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
	protected RemovalPolicyOptionsBuilder_coreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.REMOVAL_POLICY_OPTIONS_BUILDER_CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getApplyToUpdateReplacePolicy_java_lang_Boolean_() {
		return applyToUpdateReplacePolicy_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplyToUpdateReplacePolicy_java_lang_Boolean_(
			Boolean newApplyToUpdateReplacePolicy_java_lang_Boolean_) {
		Boolean oldApplyToUpdateReplacePolicy_java_lang_Boolean_ = applyToUpdateReplacePolicy_java_lang_Boolean_;
		applyToUpdateReplacePolicy_java_lang_Boolean_ = newApplyToUpdateReplacePolicy_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.REMOVAL_POLICY_OPTIONS_BUILDER_CORE__APPLY_TO_UPDATE_REPLACE_POLICY_JAVA_LANG_BOOLEAN_,
					oldApplyToUpdateReplacePolicy_java_lang_Boolean_, applyToUpdateReplacePolicy_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemovalPolicy getDefaultValue_software_amazon_awscdk_core_RemovalPolicy_() {
		return defaultValue_software_amazon_awscdk_core_RemovalPolicy_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValue_software_amazon_awscdk_core_RemovalPolicy_(
			RemovalPolicy newDefaultValue_software_amazon_awscdk_core_RemovalPolicy_) {
		RemovalPolicy oldDefaultValue_software_amazon_awscdk_core_RemovalPolicy_ = defaultValue_software_amazon_awscdk_core_RemovalPolicy_;
		defaultValue_software_amazon_awscdk_core_RemovalPolicy_ = newDefaultValue_software_amazon_awscdk_core_RemovalPolicy_ == null
				? DEFAULT_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY__EDEFAULT
				: newDefaultValue_software_amazon_awscdk_core_RemovalPolicy_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.REMOVAL_POLICY_OPTIONS_BUILDER_CORE__DEFAULT_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_,
					oldDefaultValue_software_amazon_awscdk_core_RemovalPolicy_,
					defaultValue_software_amazon_awscdk_core_RemovalPolicy_));
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
					CorePackage.REMOVAL_POLICY_OPTIONS_BUILDER_CORE__VAR_NAME, oldVarName, varName));
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
					CorePackage.REMOVAL_POLICY_OPTIONS_BUILDER_CORE__IDENTIFIER, oldIdentifier, identifier));
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
					CorePackage.REMOVAL_POLICY_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE, oldAdditionalCode,
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
		case CorePackage.REMOVAL_POLICY_OPTIONS_BUILDER_CORE__APPLY_TO_UPDATE_REPLACE_POLICY_JAVA_LANG_BOOLEAN_:
			return getApplyToUpdateReplacePolicy_java_lang_Boolean_();
		case CorePackage.REMOVAL_POLICY_OPTIONS_BUILDER_CORE__DEFAULT_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
			return getDefaultValue_software_amazon_awscdk_core_RemovalPolicy_();
		case CorePackage.REMOVAL_POLICY_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case CorePackage.REMOVAL_POLICY_OPTIONS_BUILDER_CORE__VAR_NAME:
			return getVarName();
		case CorePackage.REMOVAL_POLICY_OPTIONS_BUILDER_CORE__IDENTIFIER:
			return getIdentifier();
		case CorePackage.REMOVAL_POLICY_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.REMOVAL_POLICY_OPTIONS_BUILDER_CORE__APPLY_TO_UPDATE_REPLACE_POLICY_JAVA_LANG_BOOLEAN_:
			setApplyToUpdateReplacePolicy_java_lang_Boolean_((Boolean) newValue);
			return;
		case CorePackage.REMOVAL_POLICY_OPTIONS_BUILDER_CORE__DEFAULT_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
			setDefaultValue_software_amazon_awscdk_core_RemovalPolicy_((RemovalPolicy) newValue);
			return;
		case CorePackage.REMOVAL_POLICY_OPTIONS_BUILDER_CORE__VAR_NAME:
			setVarName((String) newValue);
			return;
		case CorePackage.REMOVAL_POLICY_OPTIONS_BUILDER_CORE__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case CorePackage.REMOVAL_POLICY_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.REMOVAL_POLICY_OPTIONS_BUILDER_CORE__APPLY_TO_UPDATE_REPLACE_POLICY_JAVA_LANG_BOOLEAN_:
			setApplyToUpdateReplacePolicy_java_lang_Boolean_(
					APPLY_TO_UPDATE_REPLACE_POLICY_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case CorePackage.REMOVAL_POLICY_OPTIONS_BUILDER_CORE__DEFAULT_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
			setDefaultValue_software_amazon_awscdk_core_RemovalPolicy_(
					DEFAULT_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY__EDEFAULT);
			return;
		case CorePackage.REMOVAL_POLICY_OPTIONS_BUILDER_CORE__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case CorePackage.REMOVAL_POLICY_OPTIONS_BUILDER_CORE__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case CorePackage.REMOVAL_POLICY_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.REMOVAL_POLICY_OPTIONS_BUILDER_CORE__APPLY_TO_UPDATE_REPLACE_POLICY_JAVA_LANG_BOOLEAN_:
			return APPLY_TO_UPDATE_REPLACE_POLICY_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? applyToUpdateReplacePolicy_java_lang_Boolean_ != null
					: !APPLY_TO_UPDATE_REPLACE_POLICY_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(applyToUpdateReplacePolicy_java_lang_Boolean_);
		case CorePackage.REMOVAL_POLICY_OPTIONS_BUILDER_CORE__DEFAULT_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
			return defaultValue_software_amazon_awscdk_core_RemovalPolicy_ != DEFAULT_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY__EDEFAULT;
		case CorePackage.REMOVAL_POLICY_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case CorePackage.REMOVAL_POLICY_OPTIONS_BUILDER_CORE__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case CorePackage.REMOVAL_POLICY_OPTIONS_BUILDER_CORE__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case CorePackage.REMOVAL_POLICY_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
		result.append(" (applyToUpdateReplacePolicy_java_lang_Boolean_: ");
		result.append(applyToUpdateReplacePolicy_java_lang_Boolean_);
		result.append(", defaultValue_software_amazon_awscdk_core_RemovalPolicy_: ");
		result.append(defaultValue_software_amazon_awscdk_core_RemovalPolicy_);
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

} //RemovalPolicyOptionsBuilder_coreImpl
