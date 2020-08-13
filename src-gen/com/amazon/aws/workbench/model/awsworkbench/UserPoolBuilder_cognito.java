/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Pool Builder cognito</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getAutoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReference <em>Auto Verify With Auto Verified Attrs software amazon awscdk services cognito Auto Verified Attrs As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getCustomAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMap <em>Custom Attributes java lang String software amazon awscdk services cognito ICustom Attribute As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getEmailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReference <em>Email Settings With Email Settings software amazon awscdk services cognito Email Settings As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getLambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReference <em>Lambda Triggers With User Pool Triggers software amazon awscdk services cognito User Pool Triggers As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getMfa_software_amazon_awscdk_services_cognito_Mfa_ <em>Mfa software amazon awscdk services cognito Mfa </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getMfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReference <em>Mfa Second Factor With Mfa Second Factor software amazon awscdk services cognito Mfa Second Factor As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getPasswordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReference <em>Password Policy With Password Policy software amazon awscdk services cognito Password Policy As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getRequiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReference <em>Required Attributes With Required Attributes software amazon awscdk services cognito Required Attributes As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getSelfSignUpEnabled_java_lang_Boolean_ <em>Self Sign Up Enabled java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getSignInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReference <em>Sign In Aliases With Sign In Aliases software amazon awscdk services cognito Sign In Aliases As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getSignInCaseSensitive_java_lang_Boolean_ <em>Sign In Case Sensitive java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getSmsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Sms Role With IRole software amazon awscdk services iam IRole As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getSmsRoleExternalId_java_lang_String_ <em>Sms Role External Id java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getUserInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReference <em>User Invitation With User Invitation Config software amazon awscdk services cognito User Invitation Config As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getUserPoolName_java_lang_String_ <em>User Pool Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getUserVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReference <em>User Verification With User Verification Config software amazon awscdk services cognito User Verification Config As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getUserPoolBuilder_cognito()
 * @model
 * @generated
 */
public interface UserPoolBuilder_cognito extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Auto Verify With Auto Verified Attrs software amazon awscdk services cognito Auto Verified Attrs As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Verify With Auto Verified Attrs software amazon awscdk services cognito Auto Verified Attrs As Reference</em>' attribute.
	 * @see #setAutoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getUserPoolBuilder_cognito_AutoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReference()
	 * @model
	 * @generated
	 */
	String getAutoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getAutoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReference <em>Auto Verify With Auto Verified Attrs software amazon awscdk services cognito Auto Verified Attrs As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Verify With Auto Verified Attrs software amazon awscdk services cognito Auto Verified Attrs As Reference</em>' attribute.
	 * @see #getAutoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReference()
	 * @generated
	 */
	void setAutoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Custom Attributes java lang String software amazon awscdk services cognito ICustom Attribute As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Attributes java lang String software amazon awscdk services cognito ICustom Attribute As Map</em>' attribute.
	 * @see #setCustomAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMap(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getUserPoolBuilder_cognito_CustomAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMap()
	 * @model
	 * @generated
	 */
	String getCustomAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMap();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getCustomAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMap <em>Custom Attributes java lang String software amazon awscdk services cognito ICustom Attribute As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Attributes java lang String software amazon awscdk services cognito ICustom Attribute As Map</em>' attribute.
	 * @see #getCustomAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMap()
	 * @generated
	 */
	void setCustomAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMap(
			String value);

	/**
	 * Returns the value of the '<em><b>Email Settings With Email Settings software amazon awscdk services cognito Email Settings As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Settings With Email Settings software amazon awscdk services cognito Email Settings As Reference</em>' attribute.
	 * @see #setEmailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getUserPoolBuilder_cognito_EmailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReference()
	 * @model
	 * @generated
	 */
	String getEmailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getEmailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReference <em>Email Settings With Email Settings software amazon awscdk services cognito Email Settings As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Settings With Email Settings software amazon awscdk services cognito Email Settings As Reference</em>' attribute.
	 * @see #getEmailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReference()
	 * @generated
	 */
	void setEmailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Lambda Triggers With User Pool Triggers software amazon awscdk services cognito User Pool Triggers As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lambda Triggers With User Pool Triggers software amazon awscdk services cognito User Pool Triggers As Reference</em>' attribute.
	 * @see #setLambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getUserPoolBuilder_cognito_LambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReference()
	 * @model
	 * @generated
	 */
	String getLambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getLambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReference <em>Lambda Triggers With User Pool Triggers software amazon awscdk services cognito User Pool Triggers As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lambda Triggers With User Pool Triggers software amazon awscdk services cognito User Pool Triggers As Reference</em>' attribute.
	 * @see #getLambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReference()
	 * @generated
	 */
	void setLambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Mfa software amazon awscdk services cognito Mfa </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.Mfa}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mfa software amazon awscdk services cognito Mfa </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.Mfa
	 * @see #setMfa_software_amazon_awscdk_services_cognito_Mfa_(Mfa)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getUserPoolBuilder_cognito_Mfa_software_amazon_awscdk_services_cognito_Mfa_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.Mfa"
	 * @generated
	 */
	Mfa getMfa_software_amazon_awscdk_services_cognito_Mfa_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getMfa_software_amazon_awscdk_services_cognito_Mfa_ <em>Mfa software amazon awscdk services cognito Mfa </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mfa software amazon awscdk services cognito Mfa </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.Mfa
	 * @see #getMfa_software_amazon_awscdk_services_cognito_Mfa_()
	 * @generated
	 */
	void setMfa_software_amazon_awscdk_services_cognito_Mfa_(Mfa value);

	/**
	 * Returns the value of the '<em><b>Mfa Second Factor With Mfa Second Factor software amazon awscdk services cognito Mfa Second Factor As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mfa Second Factor With Mfa Second Factor software amazon awscdk services cognito Mfa Second Factor As Reference</em>' attribute.
	 * @see #setMfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getUserPoolBuilder_cognito_MfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReference()
	 * @model
	 * @generated
	 */
	String getMfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getMfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReference <em>Mfa Second Factor With Mfa Second Factor software amazon awscdk services cognito Mfa Second Factor As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mfa Second Factor With Mfa Second Factor software amazon awscdk services cognito Mfa Second Factor As Reference</em>' attribute.
	 * @see #getMfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReference()
	 * @generated
	 */
	void setMfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Password Policy With Password Policy software amazon awscdk services cognito Password Policy As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password Policy With Password Policy software amazon awscdk services cognito Password Policy As Reference</em>' attribute.
	 * @see #setPasswordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getUserPoolBuilder_cognito_PasswordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReference()
	 * @model
	 * @generated
	 */
	String getPasswordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getPasswordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReference <em>Password Policy With Password Policy software amazon awscdk services cognito Password Policy As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password Policy With Password Policy software amazon awscdk services cognito Password Policy As Reference</em>' attribute.
	 * @see #getPasswordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReference()
	 * @generated
	 */
	void setPasswordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Required Attributes With Required Attributes software amazon awscdk services cognito Required Attributes As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Attributes With Required Attributes software amazon awscdk services cognito Required Attributes As Reference</em>' attribute.
	 * @see #setRequiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getUserPoolBuilder_cognito_RequiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReference()
	 * @model
	 * @generated
	 */
	String getRequiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getRequiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReference <em>Required Attributes With Required Attributes software amazon awscdk services cognito Required Attributes As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Attributes With Required Attributes software amazon awscdk services cognito Required Attributes As Reference</em>' attribute.
	 * @see #getRequiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReference()
	 * @generated
	 */
	void setRequiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Self Sign Up Enabled java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Self Sign Up Enabled java lang Boolean </em>' attribute.
	 * @see #setSelfSignUpEnabled_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getUserPoolBuilder_cognito_SelfSignUpEnabled_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getSelfSignUpEnabled_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getSelfSignUpEnabled_java_lang_Boolean_ <em>Self Sign Up Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self Sign Up Enabled java lang Boolean </em>' attribute.
	 * @see #getSelfSignUpEnabled_java_lang_Boolean_()
	 * @generated
	 */
	void setSelfSignUpEnabled_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Sign In Aliases With Sign In Aliases software amazon awscdk services cognito Sign In Aliases As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sign In Aliases With Sign In Aliases software amazon awscdk services cognito Sign In Aliases As Reference</em>' attribute.
	 * @see #setSignInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getUserPoolBuilder_cognito_SignInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReference()
	 * @model
	 * @generated
	 */
	String getSignInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getSignInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReference <em>Sign In Aliases With Sign In Aliases software amazon awscdk services cognito Sign In Aliases As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sign In Aliases With Sign In Aliases software amazon awscdk services cognito Sign In Aliases As Reference</em>' attribute.
	 * @see #getSignInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReference()
	 * @generated
	 */
	void setSignInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Sign In Case Sensitive java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sign In Case Sensitive java lang Boolean </em>' attribute.
	 * @see #setSignInCaseSensitive_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getUserPoolBuilder_cognito_SignInCaseSensitive_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getSignInCaseSensitive_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getSignInCaseSensitive_java_lang_Boolean_ <em>Sign In Case Sensitive java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sign In Case Sensitive java lang Boolean </em>' attribute.
	 * @see #getSignInCaseSensitive_java_lang_Boolean_()
	 * @generated
	 */
	void setSignInCaseSensitive_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Sms Role With IRole software amazon awscdk services iam IRole As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sms Role With IRole software amazon awscdk services iam IRole As Reference</em>' attribute.
	 * @see #setSmsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getUserPoolBuilder_cognito_SmsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @model
	 * @generated
	 */
	String getSmsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getSmsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Sms Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sms Role With IRole software amazon awscdk services iam IRole As Reference</em>' attribute.
	 * @see #getSmsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 */
	void setSmsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Sms Role External Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sms Role External Id java lang String </em>' attribute.
	 * @see #setSmsRoleExternalId_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getUserPoolBuilder_cognito_SmsRoleExternalId_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getSmsRoleExternalId_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getSmsRoleExternalId_java_lang_String_ <em>Sms Role External Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sms Role External Id java lang String </em>' attribute.
	 * @see #getSmsRoleExternalId_java_lang_String_()
	 * @generated
	 */
	void setSmsRoleExternalId_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>User Invitation With User Invitation Config software amazon awscdk services cognito User Invitation Config As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Invitation With User Invitation Config software amazon awscdk services cognito User Invitation Config As Reference</em>' attribute.
	 * @see #setUserInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getUserPoolBuilder_cognito_UserInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReference()
	 * @model
	 * @generated
	 */
	String getUserInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getUserInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReference <em>User Invitation With User Invitation Config software amazon awscdk services cognito User Invitation Config As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Invitation With User Invitation Config software amazon awscdk services cognito User Invitation Config As Reference</em>' attribute.
	 * @see #getUserInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReference()
	 * @generated
	 */
	void setUserInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>User Pool Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Pool Name java lang String </em>' attribute.
	 * @see #setUserPoolName_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getUserPoolBuilder_cognito_UserPoolName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getUserPoolName_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getUserPoolName_java_lang_String_ <em>User Pool Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Pool Name java lang String </em>' attribute.
	 * @see #getUserPoolName_java_lang_String_()
	 * @generated
	 */
	void setUserPoolName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>User Verification With User Verification Config software amazon awscdk services cognito User Verification Config As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Verification With User Verification Config software amazon awscdk services cognito User Verification Config As Reference</em>' attribute.
	 * @see #setUserVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getUserPoolBuilder_cognito_UserVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReference()
	 * @model
	 * @generated
	 */
	String getUserVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getUserVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReference <em>User Verification With User Verification Config software amazon awscdk services cognito User Verification Config As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Verification With User Verification Config software amazon awscdk services cognito User Verification Config As Reference</em>' attribute.
	 * @see #getUserVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReference()
	 * @generated
	 */
	void setUserVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.cognito.UserPool"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getUserPoolBuilder_cognito_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.cognito.UserPool" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getUserPoolBuilder_cognito_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getVarName <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Name</em>' attribute.
	 * @see #getVarName()
	 * @generated
	 */
	void setVarName(String value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getUserPoolBuilder_cognito_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Code</em>' attribute.
	 * @see #setAdditionalCode(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getUserPoolBuilder_cognito_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // UserPoolBuilder_cognito
