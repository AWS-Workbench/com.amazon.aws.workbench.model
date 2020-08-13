/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Password Policy Builder cognito</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PasswordPolicyBuilder_cognito#getMinLength_java_lang_Number_ <em>Min Length java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PasswordPolicyBuilder_cognito#getRequireDigits_java_lang_Boolean_ <em>Require Digits java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PasswordPolicyBuilder_cognito#getRequireLowercase_java_lang_Boolean_ <em>Require Lowercase java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PasswordPolicyBuilder_cognito#getRequireSymbols_java_lang_Boolean_ <em>Require Symbols java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PasswordPolicyBuilder_cognito#getRequireUppercase_java_lang_Boolean_ <em>Require Uppercase java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PasswordPolicyBuilder_cognito#getTempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Temp Password Validity With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PasswordPolicyBuilder_cognito#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PasswordPolicyBuilder_cognito#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PasswordPolicyBuilder_cognito#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PasswordPolicyBuilder_cognito#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPasswordPolicyBuilder_cognito()
 * @model
 * @generated
 */
public interface PasswordPolicyBuilder_cognito extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Min Length java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Length java lang Number </em>' attribute.
	 * @see #setMinLength_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPasswordPolicyBuilder_cognito_MinLength_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getMinLength_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PasswordPolicyBuilder_cognito#getMinLength_java_lang_Number_ <em>Min Length java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Length java lang Number </em>' attribute.
	 * @see #getMinLength_java_lang_Number_()
	 * @generated
	 */
	void setMinLength_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Require Digits java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Digits java lang Boolean </em>' attribute.
	 * @see #setRequireDigits_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPasswordPolicyBuilder_cognito_RequireDigits_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getRequireDigits_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PasswordPolicyBuilder_cognito#getRequireDigits_java_lang_Boolean_ <em>Require Digits java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Digits java lang Boolean </em>' attribute.
	 * @see #getRequireDigits_java_lang_Boolean_()
	 * @generated
	 */
	void setRequireDigits_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Require Lowercase java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Lowercase java lang Boolean </em>' attribute.
	 * @see #setRequireLowercase_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPasswordPolicyBuilder_cognito_RequireLowercase_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getRequireLowercase_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PasswordPolicyBuilder_cognito#getRequireLowercase_java_lang_Boolean_ <em>Require Lowercase java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Lowercase java lang Boolean </em>' attribute.
	 * @see #getRequireLowercase_java_lang_Boolean_()
	 * @generated
	 */
	void setRequireLowercase_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Require Symbols java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Symbols java lang Boolean </em>' attribute.
	 * @see #setRequireSymbols_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPasswordPolicyBuilder_cognito_RequireSymbols_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getRequireSymbols_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PasswordPolicyBuilder_cognito#getRequireSymbols_java_lang_Boolean_ <em>Require Symbols java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Symbols java lang Boolean </em>' attribute.
	 * @see #getRequireSymbols_java_lang_Boolean_()
	 * @generated
	 */
	void setRequireSymbols_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Require Uppercase java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Uppercase java lang Boolean </em>' attribute.
	 * @see #setRequireUppercase_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPasswordPolicyBuilder_cognito_RequireUppercase_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getRequireUppercase_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PasswordPolicyBuilder_cognito#getRequireUppercase_java_lang_Boolean_ <em>Require Uppercase java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Uppercase java lang Boolean </em>' attribute.
	 * @see #getRequireUppercase_java_lang_Boolean_()
	 * @generated
	 */
	void setRequireUppercase_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Temp Password Validity With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temp Password Validity With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setTempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPasswordPolicyBuilder_cognito_TempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getTempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PasswordPolicyBuilder_cognito#getTempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Temp Password Validity With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temp Password Validity With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getTempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setTempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.cognito.PasswordPolicy"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPasswordPolicyBuilder_cognito_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.cognito.PasswordPolicy" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPasswordPolicyBuilder_cognito_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PasswordPolicyBuilder_cognito#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPasswordPolicyBuilder_cognito_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PasswordPolicyBuilder_cognito#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPasswordPolicyBuilder_cognito_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PasswordPolicyBuilder_cognito#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // PasswordPolicyBuilder_cognito
