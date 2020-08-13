/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Verification Config Builder cognito</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.UserVerificationConfigBuilder_cognito#getEmailBody_java_lang_String_ <em>Email Body java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.UserVerificationConfigBuilder_cognito#getEmailStyle_software_amazon_awscdk_services_cognito_VerificationEmailStyle_ <em>Email Style software amazon awscdk services cognito Verification Email Style </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.UserVerificationConfigBuilder_cognito#getEmailSubject_java_lang_String_ <em>Email Subject java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.UserVerificationConfigBuilder_cognito#getSmsMessage_java_lang_String_ <em>Sms Message java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.UserVerificationConfigBuilder_cognito#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.UserVerificationConfigBuilder_cognito#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.UserVerificationConfigBuilder_cognito#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.UserVerificationConfigBuilder_cognito#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getUserVerificationConfigBuilder_cognito()
 * @model
 * @generated
 */
public interface UserVerificationConfigBuilder_cognito extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Email Body java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Body java lang String </em>' attribute.
	 * @see #setEmailBody_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getUserVerificationConfigBuilder_cognito_EmailBody_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getEmailBody_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.UserVerificationConfigBuilder_cognito#getEmailBody_java_lang_String_ <em>Email Body java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Body java lang String </em>' attribute.
	 * @see #getEmailBody_java_lang_String_()
	 * @generated
	 */
	void setEmailBody_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Email Style software amazon awscdk services cognito Verification Email Style </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.VerificationEmailStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Style software amazon awscdk services cognito Verification Email Style </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VerificationEmailStyle
	 * @see #setEmailStyle_software_amazon_awscdk_services_cognito_VerificationEmailStyle_(VerificationEmailStyle)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getUserVerificationConfigBuilder_cognito_EmailStyle_software_amazon_awscdk_services_cognito_VerificationEmailStyle_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.VerificationEmailStyle"
	 * @generated
	 */
	VerificationEmailStyle getEmailStyle_software_amazon_awscdk_services_cognito_VerificationEmailStyle_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.UserVerificationConfigBuilder_cognito#getEmailStyle_software_amazon_awscdk_services_cognito_VerificationEmailStyle_ <em>Email Style software amazon awscdk services cognito Verification Email Style </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Style software amazon awscdk services cognito Verification Email Style </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VerificationEmailStyle
	 * @see #getEmailStyle_software_amazon_awscdk_services_cognito_VerificationEmailStyle_()
	 * @generated
	 */
	void setEmailStyle_software_amazon_awscdk_services_cognito_VerificationEmailStyle_(VerificationEmailStyle value);

	/**
	 * Returns the value of the '<em><b>Email Subject java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Subject java lang String </em>' attribute.
	 * @see #setEmailSubject_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getUserVerificationConfigBuilder_cognito_EmailSubject_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getEmailSubject_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.UserVerificationConfigBuilder_cognito#getEmailSubject_java_lang_String_ <em>Email Subject java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Subject java lang String </em>' attribute.
	 * @see #getEmailSubject_java_lang_String_()
	 * @generated
	 */
	void setEmailSubject_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Sms Message java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sms Message java lang String </em>' attribute.
	 * @see #setSmsMessage_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getUserVerificationConfigBuilder_cognito_SmsMessage_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getSmsMessage_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.UserVerificationConfigBuilder_cognito#getSmsMessage_java_lang_String_ <em>Sms Message java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sms Message java lang String </em>' attribute.
	 * @see #getSmsMessage_java_lang_String_()
	 * @generated
	 */
	void setSmsMessage_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.cognito.UserVerificationConfig"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getUserVerificationConfigBuilder_cognito_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.cognito.UserVerificationConfig" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getUserVerificationConfigBuilder_cognito_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.UserVerificationConfigBuilder_cognito#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getUserVerificationConfigBuilder_cognito_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.UserVerificationConfigBuilder_cognito#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getUserVerificationConfigBuilder_cognito_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.UserVerificationConfigBuilder_cognito#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // UserVerificationConfigBuilder_cognito
