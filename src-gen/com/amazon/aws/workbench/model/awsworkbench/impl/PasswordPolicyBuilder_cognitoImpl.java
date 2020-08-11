/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.PasswordPolicyBuilder_cognito;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Password Policy Builder cognito</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.PasswordPolicyBuilder_cognitoImpl#getMinLength_java_lang_Number_ <em>Min Length java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.PasswordPolicyBuilder_cognitoImpl#getRequireDigits_java_lang_Boolean_ <em>Require Digits java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.PasswordPolicyBuilder_cognitoImpl#getRequireLowercase_java_lang_Boolean_ <em>Require Lowercase java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.PasswordPolicyBuilder_cognitoImpl#getRequireSymbols_java_lang_Boolean_ <em>Require Symbols java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.PasswordPolicyBuilder_cognitoImpl#getRequireUppercase_java_lang_Boolean_ <em>Require Uppercase java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.PasswordPolicyBuilder_cognitoImpl#getTempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Temp Password Validity With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.PasswordPolicyBuilder_cognitoImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.PasswordPolicyBuilder_cognitoImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.PasswordPolicyBuilder_cognitoImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.PasswordPolicyBuilder_cognitoImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PasswordPolicyBuilder_cognitoImpl extends MinimalEObjectImpl.Container
		implements PasswordPolicyBuilder_cognito {
	/**
	 * The default value of the '{@link #getMinLength_java_lang_Number_() <em>Min Length java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_LENGTH_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinLength_java_lang_Number_() <em>Min Length java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int minLength_java_lang_Number_ = MIN_LENGTH_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getRequireDigits_java_lang_Boolean_() <em>Require Digits java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequireDigits_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REQUIRE_DIGITS_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequireDigits_java_lang_Boolean_() <em>Require Digits java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequireDigits_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean requireDigits_java_lang_Boolean_ = REQUIRE_DIGITS_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getRequireLowercase_java_lang_Boolean_() <em>Require Lowercase java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequireLowercase_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REQUIRE_LOWERCASE_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequireLowercase_java_lang_Boolean_() <em>Require Lowercase java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequireLowercase_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean requireLowercase_java_lang_Boolean_ = REQUIRE_LOWERCASE_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getRequireSymbols_java_lang_Boolean_() <em>Require Symbols java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequireSymbols_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REQUIRE_SYMBOLS_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequireSymbols_java_lang_Boolean_() <em>Require Symbols java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequireSymbols_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean requireSymbols_java_lang_Boolean_ = REQUIRE_SYMBOLS_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getRequireUppercase_java_lang_Boolean_() <em>Require Uppercase java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequireUppercase_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REQUIRE_UPPERCASE_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequireUppercase_java_lang_Boolean_() <em>Require Uppercase java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequireUppercase_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean requireUppercase_java_lang_Boolean_ = REQUIRE_UPPERCASE_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getTempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Temp Password Validity With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMP_PASSWORD_VALIDITY_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Temp Password Validity With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String tempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReference = TEMP_PASSWORD_VALIDITY_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.cognito.PasswordPolicy";

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
	protected PasswordPolicyBuilder_cognitoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.PASSWORD_POLICY_BUILDER_COGNITO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinLength_java_lang_Number_() {
		return minLength_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinLength_java_lang_Number_(int newMinLength_java_lang_Number_) {
		int oldMinLength_java_lang_Number_ = minLength_java_lang_Number_;
		minLength_java_lang_Number_ = newMinLength_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__MIN_LENGTH_JAVA_LANG_NUMBER_,
					oldMinLength_java_lang_Number_, minLength_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRequireDigits_java_lang_Boolean_() {
		return requireDigits_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequireDigits_java_lang_Boolean_(Boolean newRequireDigits_java_lang_Boolean_) {
		Boolean oldRequireDigits_java_lang_Boolean_ = requireDigits_java_lang_Boolean_;
		requireDigits_java_lang_Boolean_ = newRequireDigits_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__REQUIRE_DIGITS_JAVA_LANG_BOOLEAN_,
					oldRequireDigits_java_lang_Boolean_, requireDigits_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRequireLowercase_java_lang_Boolean_() {
		return requireLowercase_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequireLowercase_java_lang_Boolean_(Boolean newRequireLowercase_java_lang_Boolean_) {
		Boolean oldRequireLowercase_java_lang_Boolean_ = requireLowercase_java_lang_Boolean_;
		requireLowercase_java_lang_Boolean_ = newRequireLowercase_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__REQUIRE_LOWERCASE_JAVA_LANG_BOOLEAN_,
					oldRequireLowercase_java_lang_Boolean_, requireLowercase_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRequireSymbols_java_lang_Boolean_() {
		return requireSymbols_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequireSymbols_java_lang_Boolean_(Boolean newRequireSymbols_java_lang_Boolean_) {
		Boolean oldRequireSymbols_java_lang_Boolean_ = requireSymbols_java_lang_Boolean_;
		requireSymbols_java_lang_Boolean_ = newRequireSymbols_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__REQUIRE_SYMBOLS_JAVA_LANG_BOOLEAN_,
					oldRequireSymbols_java_lang_Boolean_, requireSymbols_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRequireUppercase_java_lang_Boolean_() {
		return requireUppercase_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequireUppercase_java_lang_Boolean_(Boolean newRequireUppercase_java_lang_Boolean_) {
		Boolean oldRequireUppercase_java_lang_Boolean_ = requireUppercase_java_lang_Boolean_;
		requireUppercase_java_lang_Boolean_ = newRequireUppercase_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__REQUIRE_UPPERCASE_JAVA_LANG_BOOLEAN_,
					oldRequireUppercase_java_lang_Boolean_, requireUppercase_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return tempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newTempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldTempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReference = tempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		tempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReference = newTempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__TEMP_PASSWORD_VALIDITY_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldTempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					tempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReference));
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
					AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__MIN_LENGTH_JAVA_LANG_NUMBER_:
			return getMinLength_java_lang_Number_();
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__REQUIRE_DIGITS_JAVA_LANG_BOOLEAN_:
			return getRequireDigits_java_lang_Boolean_();
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__REQUIRE_LOWERCASE_JAVA_LANG_BOOLEAN_:
			return getRequireLowercase_java_lang_Boolean_();
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__REQUIRE_SYMBOLS_JAVA_LANG_BOOLEAN_:
			return getRequireSymbols_java_lang_Boolean_();
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__REQUIRE_UPPERCASE_JAVA_LANG_BOOLEAN_:
			return getRequireUppercase_java_lang_Boolean_();
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__TEMP_PASSWORD_VALIDITY_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getTempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__MIN_LENGTH_JAVA_LANG_NUMBER_:
			setMinLength_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__REQUIRE_DIGITS_JAVA_LANG_BOOLEAN_:
			setRequireDigits_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__REQUIRE_LOWERCASE_JAVA_LANG_BOOLEAN_:
			setRequireLowercase_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__REQUIRE_SYMBOLS_JAVA_LANG_BOOLEAN_:
			setRequireSymbols_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__REQUIRE_UPPERCASE_JAVA_LANG_BOOLEAN_:
			setRequireUppercase_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__TEMP_PASSWORD_VALIDITY_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setTempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__MIN_LENGTH_JAVA_LANG_NUMBER_:
			setMinLength_java_lang_Number_(MIN_LENGTH_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__REQUIRE_DIGITS_JAVA_LANG_BOOLEAN_:
			setRequireDigits_java_lang_Boolean_(REQUIRE_DIGITS_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__REQUIRE_LOWERCASE_JAVA_LANG_BOOLEAN_:
			setRequireLowercase_java_lang_Boolean_(REQUIRE_LOWERCASE_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__REQUIRE_SYMBOLS_JAVA_LANG_BOOLEAN_:
			setRequireSymbols_java_lang_Boolean_(REQUIRE_SYMBOLS_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__REQUIRE_UPPERCASE_JAVA_LANG_BOOLEAN_:
			setRequireUppercase_java_lang_Boolean_(REQUIRE_UPPERCASE_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__TEMP_PASSWORD_VALIDITY_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setTempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					TEMP_PASSWORD_VALIDITY_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__MIN_LENGTH_JAVA_LANG_NUMBER_:
			return minLength_java_lang_Number_ != MIN_LENGTH_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__REQUIRE_DIGITS_JAVA_LANG_BOOLEAN_:
			return REQUIRE_DIGITS_JAVA_LANG_BOOLEAN__EDEFAULT == null ? requireDigits_java_lang_Boolean_ != null
					: !REQUIRE_DIGITS_JAVA_LANG_BOOLEAN__EDEFAULT.equals(requireDigits_java_lang_Boolean_);
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__REQUIRE_LOWERCASE_JAVA_LANG_BOOLEAN_:
			return REQUIRE_LOWERCASE_JAVA_LANG_BOOLEAN__EDEFAULT == null ? requireLowercase_java_lang_Boolean_ != null
					: !REQUIRE_LOWERCASE_JAVA_LANG_BOOLEAN__EDEFAULT.equals(requireLowercase_java_lang_Boolean_);
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__REQUIRE_SYMBOLS_JAVA_LANG_BOOLEAN_:
			return REQUIRE_SYMBOLS_JAVA_LANG_BOOLEAN__EDEFAULT == null ? requireSymbols_java_lang_Boolean_ != null
					: !REQUIRE_SYMBOLS_JAVA_LANG_BOOLEAN__EDEFAULT.equals(requireSymbols_java_lang_Boolean_);
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__REQUIRE_UPPERCASE_JAVA_LANG_BOOLEAN_:
			return REQUIRE_UPPERCASE_JAVA_LANG_BOOLEAN__EDEFAULT == null ? requireUppercase_java_lang_Boolean_ != null
					: !REQUIRE_UPPERCASE_JAVA_LANG_BOOLEAN__EDEFAULT.equals(requireUppercase_java_lang_Boolean_);
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__TEMP_PASSWORD_VALIDITY_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return TEMP_PASSWORD_VALIDITY_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? tempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !TEMP_PASSWORD_VALIDITY_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(tempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__ADDITIONAL_CODE:
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
		result.append(" (minLength_java_lang_Number_: ");
		result.append(minLength_java_lang_Number_);
		result.append(", requireDigits_java_lang_Boolean_: ");
		result.append(requireDigits_java_lang_Boolean_);
		result.append(", requireLowercase_java_lang_Boolean_: ");
		result.append(requireLowercase_java_lang_Boolean_);
		result.append(", requireSymbols_java_lang_Boolean_: ");
		result.append(requireSymbols_java_lang_Boolean_);
		result.append(", requireUppercase_java_lang_Boolean_: ");
		result.append(requireUppercase_java_lang_Boolean_);
		result.append(", tempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(tempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReference);
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

} //PasswordPolicyBuilder_cognitoImpl
