/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.UserVerificationConfigBuilder_cognito;
import com.amazon.aws.workbench.model.awsworkbench.VerificationEmailStyle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Verification Config Builder cognito</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserVerificationConfigBuilder_cognitoImpl#getEmailBody_java_lang_String_ <em>Email Body java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserVerificationConfigBuilder_cognitoImpl#getEmailStyle_software_amazon_awscdk_services_cognito_VerificationEmailStyle_ <em>Email Style software amazon awscdk services cognito Verification Email Style </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserVerificationConfigBuilder_cognitoImpl#getEmailSubject_java_lang_String_ <em>Email Subject java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserVerificationConfigBuilder_cognitoImpl#getSmsMessage_java_lang_String_ <em>Sms Message java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserVerificationConfigBuilder_cognitoImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserVerificationConfigBuilder_cognitoImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserVerificationConfigBuilder_cognitoImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserVerificationConfigBuilder_cognitoImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserVerificationConfigBuilder_cognitoImpl extends ServiceResourcesImpl
		implements UserVerificationConfigBuilder_cognito {
	/**
	 * The default value of the '{@link #getEmailBody_java_lang_String_() <em>Email Body java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailBody_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_BODY_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmailBody_java_lang_String_() <em>Email Body java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailBody_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String emailBody_java_lang_String_ = EMAIL_BODY_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getEmailStyle_software_amazon_awscdk_services_cognito_VerificationEmailStyle_() <em>Email Style software amazon awscdk services cognito Verification Email Style </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailStyle_software_amazon_awscdk_services_cognito_VerificationEmailStyle_()
	 * @generated
	 * @ordered
	 */
	protected static final VerificationEmailStyle EMAIL_STYLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_VERIFICATION_EMAIL_STYLE__EDEFAULT = VerificationEmailStyle.CODE;

	/**
	 * The cached value of the '{@link #getEmailStyle_software_amazon_awscdk_services_cognito_VerificationEmailStyle_() <em>Email Style software amazon awscdk services cognito Verification Email Style </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailStyle_software_amazon_awscdk_services_cognito_VerificationEmailStyle_()
	 * @generated
	 * @ordered
	 */
	protected VerificationEmailStyle emailStyle_software_amazon_awscdk_services_cognito_VerificationEmailStyle_ = EMAIL_STYLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_VERIFICATION_EMAIL_STYLE__EDEFAULT;

	/**
	 * The default value of the '{@link #getEmailSubject_java_lang_String_() <em>Email Subject java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailSubject_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_SUBJECT_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmailSubject_java_lang_String_() <em>Email Subject java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailSubject_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String emailSubject_java_lang_String_ = EMAIL_SUBJECT_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getSmsMessage_java_lang_String_() <em>Sms Message java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmsMessage_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String SMS_MESSAGE_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSmsMessage_java_lang_String_() <em>Sms Message java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmsMessage_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String smsMessage_java_lang_String_ = SMS_MESSAGE_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.cognito.UserVerificationConfig";

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
	protected UserVerificationConfigBuilder_cognitoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.USER_VERIFICATION_CONFIG_BUILDER_COGNITO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmailBody_java_lang_String_() {
		return emailBody_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmailBody_java_lang_String_(String newEmailBody_java_lang_String_) {
		String oldEmailBody_java_lang_String_ = emailBody_java_lang_String_;
		emailBody_java_lang_String_ = newEmailBody_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__EMAIL_BODY_JAVA_LANG_STRING_,
					oldEmailBody_java_lang_String_, emailBody_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerificationEmailStyle getEmailStyle_software_amazon_awscdk_services_cognito_VerificationEmailStyle_() {
		return emailStyle_software_amazon_awscdk_services_cognito_VerificationEmailStyle_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmailStyle_software_amazon_awscdk_services_cognito_VerificationEmailStyle_(
			VerificationEmailStyle newEmailStyle_software_amazon_awscdk_services_cognito_VerificationEmailStyle_) {
		VerificationEmailStyle oldEmailStyle_software_amazon_awscdk_services_cognito_VerificationEmailStyle_ = emailStyle_software_amazon_awscdk_services_cognito_VerificationEmailStyle_;
		emailStyle_software_amazon_awscdk_services_cognito_VerificationEmailStyle_ = newEmailStyle_software_amazon_awscdk_services_cognito_VerificationEmailStyle_ == null
				? EMAIL_STYLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_VERIFICATION_EMAIL_STYLE__EDEFAULT
				: newEmailStyle_software_amazon_awscdk_services_cognito_VerificationEmailStyle_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__EMAIL_STYLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_VERIFICATION_EMAIL_STYLE_,
					oldEmailStyle_software_amazon_awscdk_services_cognito_VerificationEmailStyle_,
					emailStyle_software_amazon_awscdk_services_cognito_VerificationEmailStyle_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmailSubject_java_lang_String_() {
		return emailSubject_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmailSubject_java_lang_String_(String newEmailSubject_java_lang_String_) {
		String oldEmailSubject_java_lang_String_ = emailSubject_java_lang_String_;
		emailSubject_java_lang_String_ = newEmailSubject_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__EMAIL_SUBJECT_JAVA_LANG_STRING_,
					oldEmailSubject_java_lang_String_, emailSubject_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSmsMessage_java_lang_String_() {
		return smsMessage_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSmsMessage_java_lang_String_(String newSmsMessage_java_lang_String_) {
		String oldSmsMessage_java_lang_String_ = smsMessage_java_lang_String_;
		smsMessage_java_lang_String_ = newSmsMessage_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__SMS_MESSAGE_JAVA_LANG_STRING_,
					oldSmsMessage_java_lang_String_, smsMessage_java_lang_String_));
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
					AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__IDENTIFIER, oldIdentifier,
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
					AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__EMAIL_BODY_JAVA_LANG_STRING_:
			return getEmailBody_java_lang_String_();
		case AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__EMAIL_STYLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_VERIFICATION_EMAIL_STYLE_:
			return getEmailStyle_software_amazon_awscdk_services_cognito_VerificationEmailStyle_();
		case AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__EMAIL_SUBJECT_JAVA_LANG_STRING_:
			return getEmailSubject_java_lang_String_();
		case AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__SMS_MESSAGE_JAVA_LANG_STRING_:
			return getSmsMessage_java_lang_String_();
		case AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__EMAIL_BODY_JAVA_LANG_STRING_:
			setEmailBody_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__EMAIL_STYLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_VERIFICATION_EMAIL_STYLE_:
			setEmailStyle_software_amazon_awscdk_services_cognito_VerificationEmailStyle_(
					(VerificationEmailStyle) newValue);
			return;
		case AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__EMAIL_SUBJECT_JAVA_LANG_STRING_:
			setEmailSubject_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__SMS_MESSAGE_JAVA_LANG_STRING_:
			setSmsMessage_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__EMAIL_BODY_JAVA_LANG_STRING_:
			setEmailBody_java_lang_String_(EMAIL_BODY_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__EMAIL_STYLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_VERIFICATION_EMAIL_STYLE_:
			setEmailStyle_software_amazon_awscdk_services_cognito_VerificationEmailStyle_(
					EMAIL_STYLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_VERIFICATION_EMAIL_STYLE__EDEFAULT);
			return;
		case AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__EMAIL_SUBJECT_JAVA_LANG_STRING_:
			setEmailSubject_java_lang_String_(EMAIL_SUBJECT_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__SMS_MESSAGE_JAVA_LANG_STRING_:
			setSmsMessage_java_lang_String_(SMS_MESSAGE_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__EMAIL_BODY_JAVA_LANG_STRING_:
			return EMAIL_BODY_JAVA_LANG_STRING__EDEFAULT == null ? emailBody_java_lang_String_ != null
					: !EMAIL_BODY_JAVA_LANG_STRING__EDEFAULT.equals(emailBody_java_lang_String_);
		case AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__EMAIL_STYLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_VERIFICATION_EMAIL_STYLE_:
			return emailStyle_software_amazon_awscdk_services_cognito_VerificationEmailStyle_ != EMAIL_STYLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_VERIFICATION_EMAIL_STYLE__EDEFAULT;
		case AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__EMAIL_SUBJECT_JAVA_LANG_STRING_:
			return EMAIL_SUBJECT_JAVA_LANG_STRING__EDEFAULT == null ? emailSubject_java_lang_String_ != null
					: !EMAIL_SUBJECT_JAVA_LANG_STRING__EDEFAULT.equals(emailSubject_java_lang_String_);
		case AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__SMS_MESSAGE_JAVA_LANG_STRING_:
			return SMS_MESSAGE_JAVA_LANG_STRING__EDEFAULT == null ? smsMessage_java_lang_String_ != null
					: !SMS_MESSAGE_JAVA_LANG_STRING__EDEFAULT.equals(smsMessage_java_lang_String_);
		case AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO__ADDITIONAL_CODE:
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
		result.append(" (emailBody_java_lang_String_: ");
		result.append(emailBody_java_lang_String_);
		result.append(", emailStyle_software_amazon_awscdk_services_cognito_VerificationEmailStyle_: ");
		result.append(emailStyle_software_amazon_awscdk_services_cognito_VerificationEmailStyle_);
		result.append(", emailSubject_java_lang_String_: ");
		result.append(emailSubject_java_lang_String_);
		result.append(", smsMessage_java_lang_String_: ");
		result.append(smsMessage_java_lang_String_);
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

} //UserVerificationConfigBuilder_cognitoImpl
