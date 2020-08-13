/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.SignInAliasesBuilder_cognito;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sign In Aliases Builder cognito</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SignInAliasesBuilder_cognitoImpl#getEmail_java_lang_Boolean_ <em>Email java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SignInAliasesBuilder_cognitoImpl#getPhone_java_lang_Boolean_ <em>Phone java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SignInAliasesBuilder_cognitoImpl#getPreferredUsername_java_lang_Boolean_ <em>Preferred Username java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SignInAliasesBuilder_cognitoImpl#getUsername_java_lang_Boolean_ <em>Username java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SignInAliasesBuilder_cognitoImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SignInAliasesBuilder_cognitoImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SignInAliasesBuilder_cognitoImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SignInAliasesBuilder_cognitoImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignInAliasesBuilder_cognitoImpl extends ServiceResourcesImpl implements SignInAliasesBuilder_cognito {
	/**
	 * The default value of the '{@link #getEmail_java_lang_Boolean_() <em>Email java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EMAIL_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail_java_lang_Boolean_() <em>Email java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean email_java_lang_Boolean_ = EMAIL_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getPhone_java_lang_Boolean_() <em>Phone java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PHONE_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhone_java_lang_Boolean_() <em>Phone java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean phone_java_lang_Boolean_ = PHONE_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getPreferredUsername_java_lang_Boolean_() <em>Preferred Username java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredUsername_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PREFERRED_USERNAME_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreferredUsername_java_lang_Boolean_() <em>Preferred Username java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredUsername_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean preferredUsername_java_lang_Boolean_ = PREFERRED_USERNAME_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getUsername_java_lang_Boolean_() <em>Username java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean USERNAME_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername_java_lang_Boolean_() <em>Username java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean username_java_lang_Boolean_ = USERNAME_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.cognito.SignInAliases";

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
	protected SignInAliasesBuilder_cognitoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.SIGN_IN_ALIASES_BUILDER_COGNITO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getEmail_java_lang_Boolean_() {
		return email_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmail_java_lang_Boolean_(Boolean newEmail_java_lang_Boolean_) {
		Boolean oldEmail_java_lang_Boolean_ = email_java_lang_Boolean_;
		email_java_lang_Boolean_ = newEmail_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__EMAIL_JAVA_LANG_BOOLEAN_,
					oldEmail_java_lang_Boolean_, email_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPhone_java_lang_Boolean_() {
		return phone_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhone_java_lang_Boolean_(Boolean newPhone_java_lang_Boolean_) {
		Boolean oldPhone_java_lang_Boolean_ = phone_java_lang_Boolean_;
		phone_java_lang_Boolean_ = newPhone_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__PHONE_JAVA_LANG_BOOLEAN_,
					oldPhone_java_lang_Boolean_, phone_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPreferredUsername_java_lang_Boolean_() {
		return preferredUsername_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreferredUsername_java_lang_Boolean_(Boolean newPreferredUsername_java_lang_Boolean_) {
		Boolean oldPreferredUsername_java_lang_Boolean_ = preferredUsername_java_lang_Boolean_;
		preferredUsername_java_lang_Boolean_ = newPreferredUsername_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__PREFERRED_USERNAME_JAVA_LANG_BOOLEAN_,
					oldPreferredUsername_java_lang_Boolean_, preferredUsername_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getUsername_java_lang_Boolean_() {
		return username_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsername_java_lang_Boolean_(Boolean newUsername_java_lang_Boolean_) {
		Boolean oldUsername_java_lang_Boolean_ = username_java_lang_Boolean_;
		username_java_lang_Boolean_ = newUsername_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__USERNAME_JAVA_LANG_BOOLEAN_,
					oldUsername_java_lang_Boolean_, username_java_lang_Boolean_));
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
					AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__EMAIL_JAVA_LANG_BOOLEAN_:
			return getEmail_java_lang_Boolean_();
		case AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__PHONE_JAVA_LANG_BOOLEAN_:
			return getPhone_java_lang_Boolean_();
		case AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__PREFERRED_USERNAME_JAVA_LANG_BOOLEAN_:
			return getPreferredUsername_java_lang_Boolean_();
		case AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__USERNAME_JAVA_LANG_BOOLEAN_:
			return getUsername_java_lang_Boolean_();
		case AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__EMAIL_JAVA_LANG_BOOLEAN_:
			setEmail_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__PHONE_JAVA_LANG_BOOLEAN_:
			setPhone_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__PREFERRED_USERNAME_JAVA_LANG_BOOLEAN_:
			setPreferredUsername_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__USERNAME_JAVA_LANG_BOOLEAN_:
			setUsername_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__EMAIL_JAVA_LANG_BOOLEAN_:
			setEmail_java_lang_Boolean_(EMAIL_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__PHONE_JAVA_LANG_BOOLEAN_:
			setPhone_java_lang_Boolean_(PHONE_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__PREFERRED_USERNAME_JAVA_LANG_BOOLEAN_:
			setPreferredUsername_java_lang_Boolean_(PREFERRED_USERNAME_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__USERNAME_JAVA_LANG_BOOLEAN_:
			setUsername_java_lang_Boolean_(USERNAME_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__EMAIL_JAVA_LANG_BOOLEAN_:
			return EMAIL_JAVA_LANG_BOOLEAN__EDEFAULT == null ? email_java_lang_Boolean_ != null
					: !EMAIL_JAVA_LANG_BOOLEAN__EDEFAULT.equals(email_java_lang_Boolean_);
		case AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__PHONE_JAVA_LANG_BOOLEAN_:
			return PHONE_JAVA_LANG_BOOLEAN__EDEFAULT == null ? phone_java_lang_Boolean_ != null
					: !PHONE_JAVA_LANG_BOOLEAN__EDEFAULT.equals(phone_java_lang_Boolean_);
		case AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__PREFERRED_USERNAME_JAVA_LANG_BOOLEAN_:
			return PREFERRED_USERNAME_JAVA_LANG_BOOLEAN__EDEFAULT == null ? preferredUsername_java_lang_Boolean_ != null
					: !PREFERRED_USERNAME_JAVA_LANG_BOOLEAN__EDEFAULT.equals(preferredUsername_java_lang_Boolean_);
		case AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__USERNAME_JAVA_LANG_BOOLEAN_:
			return USERNAME_JAVA_LANG_BOOLEAN__EDEFAULT == null ? username_java_lang_Boolean_ != null
					: !USERNAME_JAVA_LANG_BOOLEAN__EDEFAULT.equals(username_java_lang_Boolean_);
		case AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO__ADDITIONAL_CODE:
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
		result.append(" (email_java_lang_Boolean_: ");
		result.append(email_java_lang_Boolean_);
		result.append(", phone_java_lang_Boolean_: ");
		result.append(phone_java_lang_Boolean_);
		result.append(", preferredUsername_java_lang_Boolean_: ");
		result.append(preferredUsername_java_lang_Boolean_);
		result.append(", username_java_lang_Boolean_: ");
		result.append(username_java_lang_Boolean_);
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

} //SignInAliasesBuilder_cognitoImpl
