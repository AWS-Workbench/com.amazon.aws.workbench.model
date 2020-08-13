/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.Mfa;
import com.amazon.aws.workbench.model.awsworkbench.UserPoolPropsBuilder_cognito;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Pool Props Builder cognito</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserPoolPropsBuilder_cognitoImpl#getAutoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReference <em>Auto Verify With Auto Verified Attrs software amazon awscdk services cognito Auto Verified Attrs As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserPoolPropsBuilder_cognitoImpl#getCustomAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMap <em>Custom Attributes java lang String software amazon awscdk services cognito ICustom Attribute As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserPoolPropsBuilder_cognitoImpl#getEmailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReference <em>Email Settings With Email Settings software amazon awscdk services cognito Email Settings As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserPoolPropsBuilder_cognitoImpl#getLambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReference <em>Lambda Triggers With User Pool Triggers software amazon awscdk services cognito User Pool Triggers As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserPoolPropsBuilder_cognitoImpl#getMfa_software_amazon_awscdk_services_cognito_Mfa_ <em>Mfa software amazon awscdk services cognito Mfa </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserPoolPropsBuilder_cognitoImpl#getMfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReference <em>Mfa Second Factor With Mfa Second Factor software amazon awscdk services cognito Mfa Second Factor As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserPoolPropsBuilder_cognitoImpl#getPasswordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReference <em>Password Policy With Password Policy software amazon awscdk services cognito Password Policy As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserPoolPropsBuilder_cognitoImpl#getRequiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReference <em>Required Attributes With Required Attributes software amazon awscdk services cognito Required Attributes As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserPoolPropsBuilder_cognitoImpl#getSelfSignUpEnabled_java_lang_Boolean_ <em>Self Sign Up Enabled java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserPoolPropsBuilder_cognitoImpl#getSignInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReference <em>Sign In Aliases With Sign In Aliases software amazon awscdk services cognito Sign In Aliases As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserPoolPropsBuilder_cognitoImpl#getSignInCaseSensitive_java_lang_Boolean_ <em>Sign In Case Sensitive java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserPoolPropsBuilder_cognitoImpl#getSmsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Sms Role With IRole software amazon awscdk services iam IRole As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserPoolPropsBuilder_cognitoImpl#getSmsRoleExternalId_java_lang_String_ <em>Sms Role External Id java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserPoolPropsBuilder_cognitoImpl#getUserInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReference <em>User Invitation With User Invitation Config software amazon awscdk services cognito User Invitation Config As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserPoolPropsBuilder_cognitoImpl#getUserPoolName_java_lang_String_ <em>User Pool Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserPoolPropsBuilder_cognitoImpl#getUserVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReference <em>User Verification With User Verification Config software amazon awscdk services cognito User Verification Config As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserPoolPropsBuilder_cognitoImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserPoolPropsBuilder_cognitoImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserPoolPropsBuilder_cognitoImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserPoolPropsBuilder_cognitoImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserPoolPropsBuilder_cognitoImpl extends ServiceResourcesImpl implements UserPoolPropsBuilder_cognito {
	/**
	 * The default value of the '{@link #getAutoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReference() <em>Auto Verify With Auto Verified Attrs software amazon awscdk services cognito Auto Verified Attrs As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTO_VERIFY_WITH_AUTO_VERIFIED_ATTRS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_AUTO_VERIFIED_ATTRS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReference() <em>Auto Verify With Auto Verified Attrs software amazon awscdk services cognito Auto Verified Attrs As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String autoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReference = AUTO_VERIFY_WITH_AUTO_VERIFIED_ATTRS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_AUTO_VERIFIED_ATTRS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMap() <em>Custom Attributes java lang String software amazon awscdk services cognito ICustom Attribute As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_ATTRIBUTES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_ICUSTOM_ATTRIBUTE_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMap() <em>Custom Attributes java lang String software amazon awscdk services cognito ICustom Attribute As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String customAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMap = CUSTOM_ATTRIBUTES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_ICUSTOM_ATTRIBUTE_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReference() <em>Email Settings With Email Settings software amazon awscdk services cognito Email Settings As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_SETTINGS_WITH_EMAIL_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_EMAIL_SETTINGS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReference() <em>Email Settings With Email Settings software amazon awscdk services cognito Email Settings As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String emailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReference = EMAIL_SETTINGS_WITH_EMAIL_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_EMAIL_SETTINGS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReference() <em>Lambda Triggers With User Pool Triggers software amazon awscdk services cognito User Pool Triggers As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String LAMBDA_TRIGGERS_WITH_USER_POOL_TRIGGERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_TRIGGERS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReference() <em>Lambda Triggers With User Pool Triggers software amazon awscdk services cognito User Pool Triggers As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String lambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReference = LAMBDA_TRIGGERS_WITH_USER_POOL_TRIGGERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_TRIGGERS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMfa_software_amazon_awscdk_services_cognito_Mfa_() <em>Mfa software amazon awscdk services cognito Mfa </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMfa_software_amazon_awscdk_services_cognito_Mfa_()
	 * @generated
	 * @ordered
	 */
	protected static final Mfa MFA_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_MFA__EDEFAULT = Mfa.OFF;

	/**
	 * The cached value of the '{@link #getMfa_software_amazon_awscdk_services_cognito_Mfa_() <em>Mfa software amazon awscdk services cognito Mfa </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMfa_software_amazon_awscdk_services_cognito_Mfa_()
	 * @generated
	 * @ordered
	 */
	protected Mfa mfa_software_amazon_awscdk_services_cognito_Mfa_ = MFA_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_MFA__EDEFAULT;

	/**
	 * The default value of the '{@link #getMfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReference() <em>Mfa Second Factor With Mfa Second Factor software amazon awscdk services cognito Mfa Second Factor As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String MFA_SECOND_FACTOR_WITH_MFA_SECOND_FACTOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_MFA_SECOND_FACTOR_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReference() <em>Mfa Second Factor With Mfa Second Factor software amazon awscdk services cognito Mfa Second Factor As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String mfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReference = MFA_SECOND_FACTOR_WITH_MFA_SECOND_FACTOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_MFA_SECOND_FACTOR_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPasswordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReference() <em>Password Policy With Password Policy software amazon awscdk services cognito Password Policy As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_POLICY_WITH_PASSWORD_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_PASSWORD_POLICY_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPasswordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReference() <em>Password Policy With Password Policy software amazon awscdk services cognito Password Policy As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String passwordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReference = PASSWORD_POLICY_WITH_PASSWORD_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_PASSWORD_POLICY_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReference() <em>Required Attributes With Required Attributes software amazon awscdk services cognito Required Attributes As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRED_ATTRIBUTES_WITH_REQUIRED_ATTRIBUTES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_REQUIRED_ATTRIBUTES_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReference() <em>Required Attributes With Required Attributes software amazon awscdk services cognito Required Attributes As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String requiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReference = REQUIRED_ATTRIBUTES_WITH_REQUIRED_ATTRIBUTES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_REQUIRED_ATTRIBUTES_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelfSignUpEnabled_java_lang_Boolean_() <em>Self Sign Up Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfSignUpEnabled_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SELF_SIGN_UP_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelfSignUpEnabled_java_lang_Boolean_() <em>Self Sign Up Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfSignUpEnabled_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean selfSignUpEnabled_java_lang_Boolean_ = SELF_SIGN_UP_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getSignInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReference() <em>Sign In Aliases With Sign In Aliases software amazon awscdk services cognito Sign In Aliases As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGN_IN_ALIASES_WITH_SIGN_IN_ALIASES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_SIGN_IN_ALIASES_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReference() <em>Sign In Aliases With Sign In Aliases software amazon awscdk services cognito Sign In Aliases As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String signInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReference = SIGN_IN_ALIASES_WITH_SIGN_IN_ALIASES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_SIGN_IN_ALIASES_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignInCaseSensitive_java_lang_Boolean_() <em>Sign In Case Sensitive java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignInCaseSensitive_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SIGN_IN_CASE_SENSITIVE_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignInCaseSensitive_java_lang_Boolean_() <em>Sign In Case Sensitive java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignInCaseSensitive_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean signInCaseSensitive_java_lang_Boolean_ = SIGN_IN_CASE_SENSITIVE_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getSmsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() <em>Sms Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String SMS_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSmsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() <em>Sms Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String smsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference = SMS_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSmsRoleExternalId_java_lang_String_() <em>Sms Role External Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmsRoleExternalId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String SMS_ROLE_EXTERNAL_ID_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSmsRoleExternalId_java_lang_String_() <em>Sms Role External Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmsRoleExternalId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String smsRoleExternalId_java_lang_String_ = SMS_ROLE_EXTERNAL_ID_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getUserInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReference() <em>User Invitation With User Invitation Config software amazon awscdk services cognito User Invitation Config As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_INVITATION_WITH_USER_INVITATION_CONFIG_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_INVITATION_CONFIG_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReference() <em>User Invitation With User Invitation Config software amazon awscdk services cognito User Invitation Config As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String userInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReference = USER_INVITATION_WITH_USER_INVITATION_CONFIG_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_INVITATION_CONFIG_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserPoolName_java_lang_String_() <em>User Pool Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPoolName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_POOL_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserPoolName_java_lang_String_() <em>User Pool Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPoolName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String userPoolName_java_lang_String_ = USER_POOL_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getUserVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReference() <em>User Verification With User Verification Config software amazon awscdk services cognito User Verification Config As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_VERIFICATION_WITH_USER_VERIFICATION_CONFIG_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_VERIFICATION_CONFIG_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReference() <em>User Verification With User Verification Config software amazon awscdk services cognito User Verification Config As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String userVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReference = USER_VERIFICATION_WITH_USER_VERIFICATION_CONFIG_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_VERIFICATION_CONFIG_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.cognito.UserPoolProps";

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
	protected UserPoolPropsBuilder_cognitoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.USER_POOL_PROPS_BUILDER_COGNITO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAutoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReference() {
		return autoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReference(
			String newAutoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReference) {
		String oldAutoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReference = autoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReference;
		autoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReference = newAutoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__AUTO_VERIFY_WITH_AUTO_VERIFIED_ATTRS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_AUTO_VERIFIED_ATTRS_AS_REFERENCE,
					oldAutoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReference,
					autoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMap() {
		return customAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMap(
			String newCustomAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMap) {
		String oldCustomAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMap = customAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMap;
		customAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMap = newCustomAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__CUSTOM_ATTRIBUTES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_ICUSTOM_ATTRIBUTE_AS_MAP,
					oldCustomAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMap,
					customAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReference() {
		return emailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReference(
			String newEmailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReference) {
		String oldEmailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReference = emailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReference;
		emailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReference = newEmailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__EMAIL_SETTINGS_WITH_EMAIL_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_EMAIL_SETTINGS_AS_REFERENCE,
					oldEmailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReference,
					emailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReference() {
		return lambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReference(
			String newLambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReference) {
		String oldLambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReference = lambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReference;
		lambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReference = newLambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__LAMBDA_TRIGGERS_WITH_USER_POOL_TRIGGERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_TRIGGERS_AS_REFERENCE,
					oldLambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReference,
					lambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mfa getMfa_software_amazon_awscdk_services_cognito_Mfa_() {
		return mfa_software_amazon_awscdk_services_cognito_Mfa_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMfa_software_amazon_awscdk_services_cognito_Mfa_(
			Mfa newMfa_software_amazon_awscdk_services_cognito_Mfa_) {
		Mfa oldMfa_software_amazon_awscdk_services_cognito_Mfa_ = mfa_software_amazon_awscdk_services_cognito_Mfa_;
		mfa_software_amazon_awscdk_services_cognito_Mfa_ = newMfa_software_amazon_awscdk_services_cognito_Mfa_ == null
				? MFA_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_MFA__EDEFAULT
				: newMfa_software_amazon_awscdk_services_cognito_Mfa_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__MFA_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_MFA_,
					oldMfa_software_amazon_awscdk_services_cognito_Mfa_,
					mfa_software_amazon_awscdk_services_cognito_Mfa_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReference() {
		return mfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReference(
			String newMfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReference) {
		String oldMfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReference = mfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReference;
		mfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReference = newMfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__MFA_SECOND_FACTOR_WITH_MFA_SECOND_FACTOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_MFA_SECOND_FACTOR_AS_REFERENCE,
					oldMfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReference,
					mfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPasswordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReference() {
		return passwordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPasswordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReference(
			String newPasswordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReference) {
		String oldPasswordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReference = passwordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReference;
		passwordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReference = newPasswordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__PASSWORD_POLICY_WITH_PASSWORD_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_PASSWORD_POLICY_AS_REFERENCE,
					oldPasswordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReference,
					passwordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReference() {
		return requiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReference(
			String newRequiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReference) {
		String oldRequiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReference = requiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReference;
		requiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReference = newRequiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__REQUIRED_ATTRIBUTES_WITH_REQUIRED_ATTRIBUTES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_REQUIRED_ATTRIBUTES_AS_REFERENCE,
					oldRequiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReference,
					requiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSelfSignUpEnabled_java_lang_Boolean_() {
		return selfSignUpEnabled_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelfSignUpEnabled_java_lang_Boolean_(Boolean newSelfSignUpEnabled_java_lang_Boolean_) {
		Boolean oldSelfSignUpEnabled_java_lang_Boolean_ = selfSignUpEnabled_java_lang_Boolean_;
		selfSignUpEnabled_java_lang_Boolean_ = newSelfSignUpEnabled_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__SELF_SIGN_UP_ENABLED_JAVA_LANG_BOOLEAN_,
					oldSelfSignUpEnabled_java_lang_Boolean_, selfSignUpEnabled_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSignInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReference() {
		return signInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReference(
			String newSignInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReference) {
		String oldSignInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReference = signInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReference;
		signInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReference = newSignInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__SIGN_IN_ALIASES_WITH_SIGN_IN_ALIASES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_SIGN_IN_ALIASES_AS_REFERENCE,
					oldSignInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReference,
					signInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSignInCaseSensitive_java_lang_Boolean_() {
		return signInCaseSensitive_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignInCaseSensitive_java_lang_Boolean_(Boolean newSignInCaseSensitive_java_lang_Boolean_) {
		Boolean oldSignInCaseSensitive_java_lang_Boolean_ = signInCaseSensitive_java_lang_Boolean_;
		signInCaseSensitive_java_lang_Boolean_ = newSignInCaseSensitive_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__SIGN_IN_CASE_SENSITIVE_JAVA_LANG_BOOLEAN_,
					oldSignInCaseSensitive_java_lang_Boolean_, signInCaseSensitive_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSmsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() {
		return smsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSmsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(
			String newSmsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference) {
		String oldSmsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference = smsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference;
		smsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference = newSmsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__SMS_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE,
					oldSmsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference,
					smsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSmsRoleExternalId_java_lang_String_() {
		return smsRoleExternalId_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSmsRoleExternalId_java_lang_String_(String newSmsRoleExternalId_java_lang_String_) {
		String oldSmsRoleExternalId_java_lang_String_ = smsRoleExternalId_java_lang_String_;
		smsRoleExternalId_java_lang_String_ = newSmsRoleExternalId_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__SMS_ROLE_EXTERNAL_ID_JAVA_LANG_STRING_,
					oldSmsRoleExternalId_java_lang_String_, smsRoleExternalId_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReference() {
		return userInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReference(
			String newUserInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReference) {
		String oldUserInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReference = userInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReference;
		userInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReference = newUserInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__USER_INVITATION_WITH_USER_INVITATION_CONFIG_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_INVITATION_CONFIG_AS_REFERENCE,
					oldUserInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReference,
					userInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserPoolName_java_lang_String_() {
		return userPoolName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserPoolName_java_lang_String_(String newUserPoolName_java_lang_String_) {
		String oldUserPoolName_java_lang_String_ = userPoolName_java_lang_String_;
		userPoolName_java_lang_String_ = newUserPoolName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__USER_POOL_NAME_JAVA_LANG_STRING_,
					oldUserPoolName_java_lang_String_, userPoolName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReference() {
		return userVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReference(
			String newUserVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReference) {
		String oldUserVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReference = userVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReference;
		userVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReference = newUserVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__USER_VERIFICATION_WITH_USER_VERIFICATION_CONFIG_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_VERIFICATION_CONFIG_AS_REFERENCE,
					oldUserVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReference,
					userVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReference));
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
					AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__AUTO_VERIFY_WITH_AUTO_VERIFIED_ATTRS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_AUTO_VERIFIED_ATTRS_AS_REFERENCE:
			return getAutoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReference();
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__CUSTOM_ATTRIBUTES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_ICUSTOM_ATTRIBUTE_AS_MAP:
			return getCustomAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMap();
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__EMAIL_SETTINGS_WITH_EMAIL_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_EMAIL_SETTINGS_AS_REFERENCE:
			return getEmailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReference();
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__LAMBDA_TRIGGERS_WITH_USER_POOL_TRIGGERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_TRIGGERS_AS_REFERENCE:
			return getLambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReference();
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__MFA_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_MFA_:
			return getMfa_software_amazon_awscdk_services_cognito_Mfa_();
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__MFA_SECOND_FACTOR_WITH_MFA_SECOND_FACTOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_MFA_SECOND_FACTOR_AS_REFERENCE:
			return getMfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReference();
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__PASSWORD_POLICY_WITH_PASSWORD_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_PASSWORD_POLICY_AS_REFERENCE:
			return getPasswordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReference();
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__REQUIRED_ATTRIBUTES_WITH_REQUIRED_ATTRIBUTES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_REQUIRED_ATTRIBUTES_AS_REFERENCE:
			return getRequiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReference();
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__SELF_SIGN_UP_ENABLED_JAVA_LANG_BOOLEAN_:
			return getSelfSignUpEnabled_java_lang_Boolean_();
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__SIGN_IN_ALIASES_WITH_SIGN_IN_ALIASES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_SIGN_IN_ALIASES_AS_REFERENCE:
			return getSignInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReference();
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__SIGN_IN_CASE_SENSITIVE_JAVA_LANG_BOOLEAN_:
			return getSignInCaseSensitive_java_lang_Boolean_();
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__SMS_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			return getSmsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__SMS_ROLE_EXTERNAL_ID_JAVA_LANG_STRING_:
			return getSmsRoleExternalId_java_lang_String_();
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__USER_INVITATION_WITH_USER_INVITATION_CONFIG_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_INVITATION_CONFIG_AS_REFERENCE:
			return getUserInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReference();
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__USER_POOL_NAME_JAVA_LANG_STRING_:
			return getUserPoolName_java_lang_String_();
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__USER_VERIFICATION_WITH_USER_VERIFICATION_CONFIG_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_VERIFICATION_CONFIG_AS_REFERENCE:
			return getUserVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReference();
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__AUTO_VERIFY_WITH_AUTO_VERIFIED_ATTRS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_AUTO_VERIFIED_ATTRS_AS_REFERENCE:
			setAutoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__CUSTOM_ATTRIBUTES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_ICUSTOM_ATTRIBUTE_AS_MAP:
			setCustomAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMap(
					(String) newValue);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__EMAIL_SETTINGS_WITH_EMAIL_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_EMAIL_SETTINGS_AS_REFERENCE:
			setEmailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__LAMBDA_TRIGGERS_WITH_USER_POOL_TRIGGERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_TRIGGERS_AS_REFERENCE:
			setLambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__MFA_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_MFA_:
			setMfa_software_amazon_awscdk_services_cognito_Mfa_((Mfa) newValue);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__MFA_SECOND_FACTOR_WITH_MFA_SECOND_FACTOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_MFA_SECOND_FACTOR_AS_REFERENCE:
			setMfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__PASSWORD_POLICY_WITH_PASSWORD_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_PASSWORD_POLICY_AS_REFERENCE:
			setPasswordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__REQUIRED_ATTRIBUTES_WITH_REQUIRED_ATTRIBUTES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_REQUIRED_ATTRIBUTES_AS_REFERENCE:
			setRequiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__SELF_SIGN_UP_ENABLED_JAVA_LANG_BOOLEAN_:
			setSelfSignUpEnabled_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__SIGN_IN_ALIASES_WITH_SIGN_IN_ALIASES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_SIGN_IN_ALIASES_AS_REFERENCE:
			setSignInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__SIGN_IN_CASE_SENSITIVE_JAVA_LANG_BOOLEAN_:
			setSignInCaseSensitive_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__SMS_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			setSmsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__SMS_ROLE_EXTERNAL_ID_JAVA_LANG_STRING_:
			setSmsRoleExternalId_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__USER_INVITATION_WITH_USER_INVITATION_CONFIG_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_INVITATION_CONFIG_AS_REFERENCE:
			setUserInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__USER_POOL_NAME_JAVA_LANG_STRING_:
			setUserPoolName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__USER_VERIFICATION_WITH_USER_VERIFICATION_CONFIG_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_VERIFICATION_CONFIG_AS_REFERENCE:
			setUserVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__AUTO_VERIFY_WITH_AUTO_VERIFIED_ATTRS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_AUTO_VERIFIED_ATTRS_AS_REFERENCE:
			setAutoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReference(
					AUTO_VERIFY_WITH_AUTO_VERIFIED_ATTRS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_AUTO_VERIFIED_ATTRS_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__CUSTOM_ATTRIBUTES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_ICUSTOM_ATTRIBUTE_AS_MAP:
			setCustomAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMap(
					CUSTOM_ATTRIBUTES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_ICUSTOM_ATTRIBUTE_AS_MAP_EDEFAULT);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__EMAIL_SETTINGS_WITH_EMAIL_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_EMAIL_SETTINGS_AS_REFERENCE:
			setEmailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReference(
					EMAIL_SETTINGS_WITH_EMAIL_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_EMAIL_SETTINGS_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__LAMBDA_TRIGGERS_WITH_USER_POOL_TRIGGERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_TRIGGERS_AS_REFERENCE:
			setLambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReference(
					LAMBDA_TRIGGERS_WITH_USER_POOL_TRIGGERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_TRIGGERS_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__MFA_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_MFA_:
			setMfa_software_amazon_awscdk_services_cognito_Mfa_(
					MFA_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_MFA__EDEFAULT);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__MFA_SECOND_FACTOR_WITH_MFA_SECOND_FACTOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_MFA_SECOND_FACTOR_AS_REFERENCE:
			setMfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReference(
					MFA_SECOND_FACTOR_WITH_MFA_SECOND_FACTOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_MFA_SECOND_FACTOR_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__PASSWORD_POLICY_WITH_PASSWORD_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_PASSWORD_POLICY_AS_REFERENCE:
			setPasswordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReference(
					PASSWORD_POLICY_WITH_PASSWORD_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_PASSWORD_POLICY_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__REQUIRED_ATTRIBUTES_WITH_REQUIRED_ATTRIBUTES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_REQUIRED_ATTRIBUTES_AS_REFERENCE:
			setRequiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReference(
					REQUIRED_ATTRIBUTES_WITH_REQUIRED_ATTRIBUTES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_REQUIRED_ATTRIBUTES_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__SELF_SIGN_UP_ENABLED_JAVA_LANG_BOOLEAN_:
			setSelfSignUpEnabled_java_lang_Boolean_(SELF_SIGN_UP_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__SIGN_IN_ALIASES_WITH_SIGN_IN_ALIASES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_SIGN_IN_ALIASES_AS_REFERENCE:
			setSignInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReference(
					SIGN_IN_ALIASES_WITH_SIGN_IN_ALIASES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_SIGN_IN_ALIASES_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__SIGN_IN_CASE_SENSITIVE_JAVA_LANG_BOOLEAN_:
			setSignInCaseSensitive_java_lang_Boolean_(SIGN_IN_CASE_SENSITIVE_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__SMS_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			setSmsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(
					SMS_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__SMS_ROLE_EXTERNAL_ID_JAVA_LANG_STRING_:
			setSmsRoleExternalId_java_lang_String_(SMS_ROLE_EXTERNAL_ID_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__USER_INVITATION_WITH_USER_INVITATION_CONFIG_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_INVITATION_CONFIG_AS_REFERENCE:
			setUserInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReference(
					USER_INVITATION_WITH_USER_INVITATION_CONFIG_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_INVITATION_CONFIG_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__USER_POOL_NAME_JAVA_LANG_STRING_:
			setUserPoolName_java_lang_String_(USER_POOL_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__USER_VERIFICATION_WITH_USER_VERIFICATION_CONFIG_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_VERIFICATION_CONFIG_AS_REFERENCE:
			setUserVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReference(
					USER_VERIFICATION_WITH_USER_VERIFICATION_CONFIG_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_VERIFICATION_CONFIG_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__AUTO_VERIFY_WITH_AUTO_VERIFIED_ATTRS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_AUTO_VERIFIED_ATTRS_AS_REFERENCE:
			return AUTO_VERIFY_WITH_AUTO_VERIFIED_ATTRS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_AUTO_VERIFIED_ATTRS_AS_REFERENCE_EDEFAULT == null
					? autoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReference != null
					: !AUTO_VERIFY_WITH_AUTO_VERIFIED_ATTRS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_AUTO_VERIFIED_ATTRS_AS_REFERENCE_EDEFAULT
							.equals(autoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReference);
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__CUSTOM_ATTRIBUTES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_ICUSTOM_ATTRIBUTE_AS_MAP:
			return CUSTOM_ATTRIBUTES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_ICUSTOM_ATTRIBUTE_AS_MAP_EDEFAULT == null
					? customAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMap != null
					: !CUSTOM_ATTRIBUTES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_ICUSTOM_ATTRIBUTE_AS_MAP_EDEFAULT
							.equals(customAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMap);
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__EMAIL_SETTINGS_WITH_EMAIL_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_EMAIL_SETTINGS_AS_REFERENCE:
			return EMAIL_SETTINGS_WITH_EMAIL_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_EMAIL_SETTINGS_AS_REFERENCE_EDEFAULT == null
					? emailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReference != null
					: !EMAIL_SETTINGS_WITH_EMAIL_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_EMAIL_SETTINGS_AS_REFERENCE_EDEFAULT
							.equals(emailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReference);
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__LAMBDA_TRIGGERS_WITH_USER_POOL_TRIGGERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_TRIGGERS_AS_REFERENCE:
			return LAMBDA_TRIGGERS_WITH_USER_POOL_TRIGGERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_TRIGGERS_AS_REFERENCE_EDEFAULT == null
					? lambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReference != null
					: !LAMBDA_TRIGGERS_WITH_USER_POOL_TRIGGERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_TRIGGERS_AS_REFERENCE_EDEFAULT
							.equals(lambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReference);
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__MFA_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_MFA_:
			return mfa_software_amazon_awscdk_services_cognito_Mfa_ != MFA_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_MFA__EDEFAULT;
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__MFA_SECOND_FACTOR_WITH_MFA_SECOND_FACTOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_MFA_SECOND_FACTOR_AS_REFERENCE:
			return MFA_SECOND_FACTOR_WITH_MFA_SECOND_FACTOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_MFA_SECOND_FACTOR_AS_REFERENCE_EDEFAULT == null
					? mfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReference != null
					: !MFA_SECOND_FACTOR_WITH_MFA_SECOND_FACTOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_MFA_SECOND_FACTOR_AS_REFERENCE_EDEFAULT
							.equals(mfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReference);
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__PASSWORD_POLICY_WITH_PASSWORD_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_PASSWORD_POLICY_AS_REFERENCE:
			return PASSWORD_POLICY_WITH_PASSWORD_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_PASSWORD_POLICY_AS_REFERENCE_EDEFAULT == null
					? passwordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReference != null
					: !PASSWORD_POLICY_WITH_PASSWORD_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_PASSWORD_POLICY_AS_REFERENCE_EDEFAULT
							.equals(passwordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReference);
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__REQUIRED_ATTRIBUTES_WITH_REQUIRED_ATTRIBUTES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_REQUIRED_ATTRIBUTES_AS_REFERENCE:
			return REQUIRED_ATTRIBUTES_WITH_REQUIRED_ATTRIBUTES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_REQUIRED_ATTRIBUTES_AS_REFERENCE_EDEFAULT == null
					? requiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReference != null
					: !REQUIRED_ATTRIBUTES_WITH_REQUIRED_ATTRIBUTES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_REQUIRED_ATTRIBUTES_AS_REFERENCE_EDEFAULT
							.equals(requiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReference);
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__SELF_SIGN_UP_ENABLED_JAVA_LANG_BOOLEAN_:
			return SELF_SIGN_UP_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? selfSignUpEnabled_java_lang_Boolean_ != null
					: !SELF_SIGN_UP_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT.equals(selfSignUpEnabled_java_lang_Boolean_);
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__SIGN_IN_ALIASES_WITH_SIGN_IN_ALIASES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_SIGN_IN_ALIASES_AS_REFERENCE:
			return SIGN_IN_ALIASES_WITH_SIGN_IN_ALIASES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_SIGN_IN_ALIASES_AS_REFERENCE_EDEFAULT == null
					? signInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReference != null
					: !SIGN_IN_ALIASES_WITH_SIGN_IN_ALIASES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_SIGN_IN_ALIASES_AS_REFERENCE_EDEFAULT
							.equals(signInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReference);
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__SIGN_IN_CASE_SENSITIVE_JAVA_LANG_BOOLEAN_:
			return SIGN_IN_CASE_SENSITIVE_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? signInCaseSensitive_java_lang_Boolean_ != null
					: !SIGN_IN_CASE_SENSITIVE_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(signInCaseSensitive_java_lang_Boolean_);
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__SMS_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			return SMS_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT == null
					? smsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference != null
					: !SMS_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT
							.equals(smsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference);
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__SMS_ROLE_EXTERNAL_ID_JAVA_LANG_STRING_:
			return SMS_ROLE_EXTERNAL_ID_JAVA_LANG_STRING__EDEFAULT == null ? smsRoleExternalId_java_lang_String_ != null
					: !SMS_ROLE_EXTERNAL_ID_JAVA_LANG_STRING__EDEFAULT.equals(smsRoleExternalId_java_lang_String_);
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__USER_INVITATION_WITH_USER_INVITATION_CONFIG_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_INVITATION_CONFIG_AS_REFERENCE:
			return USER_INVITATION_WITH_USER_INVITATION_CONFIG_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_INVITATION_CONFIG_AS_REFERENCE_EDEFAULT == null
					? userInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReference != null
					: !USER_INVITATION_WITH_USER_INVITATION_CONFIG_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_INVITATION_CONFIG_AS_REFERENCE_EDEFAULT
							.equals(userInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReference);
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__USER_POOL_NAME_JAVA_LANG_STRING_:
			return USER_POOL_NAME_JAVA_LANG_STRING__EDEFAULT == null ? userPoolName_java_lang_String_ != null
					: !USER_POOL_NAME_JAVA_LANG_STRING__EDEFAULT.equals(userPoolName_java_lang_String_);
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__USER_VERIFICATION_WITH_USER_VERIFICATION_CONFIG_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_VERIFICATION_CONFIG_AS_REFERENCE:
			return USER_VERIFICATION_WITH_USER_VERIFICATION_CONFIG_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_VERIFICATION_CONFIG_AS_REFERENCE_EDEFAULT == null
					? userVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReference != null
					: !USER_VERIFICATION_WITH_USER_VERIFICATION_CONFIG_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_VERIFICATION_CONFIG_AS_REFERENCE_EDEFAULT
							.equals(userVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReference);
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO__ADDITIONAL_CODE:
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
				" (autoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReference: ");
		result.append(
				autoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReference);
		result.append(
				", customAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMap: ");
		result.append(
				customAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMap);
		result.append(
				", emailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReference: ");
		result.append(emailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReference);
		result.append(
				", lambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReference: ");
		result.append(
				lambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReference);
		result.append(", mfa_software_amazon_awscdk_services_cognito_Mfa_: ");
		result.append(mfa_software_amazon_awscdk_services_cognito_Mfa_);
		result.append(
				", mfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReference: ");
		result.append(
				mfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReference);
		result.append(
				", passwordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReference: ");
		result.append(
				passwordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReference);
		result.append(
				", requiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReference: ");
		result.append(
				requiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReference);
		result.append(", selfSignUpEnabled_java_lang_Boolean_: ");
		result.append(selfSignUpEnabled_java_lang_Boolean_);
		result.append(
				", signInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReference: ");
		result.append(signInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReference);
		result.append(", signInCaseSensitive_java_lang_Boolean_: ");
		result.append(signInCaseSensitive_java_lang_Boolean_);
		result.append(", smsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference: ");
		result.append(smsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference);
		result.append(", smsRoleExternalId_java_lang_String_: ");
		result.append(smsRoleExternalId_java_lang_String_);
		result.append(
				", userInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReference: ");
		result.append(
				userInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReference);
		result.append(", userPoolName_java_lang_String_: ");
		result.append(userPoolName_java_lang_String_);
		result.append(
				", userVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReference: ");
		result.append(
				userVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReference);
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

} //UserPoolPropsBuilder_cognitoImpl
