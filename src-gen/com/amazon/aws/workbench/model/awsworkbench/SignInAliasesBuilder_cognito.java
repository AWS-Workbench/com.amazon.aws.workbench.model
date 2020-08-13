/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sign In Aliases Builder cognito</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SignInAliasesBuilder_cognito#getEmail_java_lang_Boolean_ <em>Email java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SignInAliasesBuilder_cognito#getPhone_java_lang_Boolean_ <em>Phone java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SignInAliasesBuilder_cognito#getPreferredUsername_java_lang_Boolean_ <em>Preferred Username java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SignInAliasesBuilder_cognito#getUsername_java_lang_Boolean_ <em>Username java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SignInAliasesBuilder_cognito#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SignInAliasesBuilder_cognito#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SignInAliasesBuilder_cognito#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SignInAliasesBuilder_cognito#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSignInAliasesBuilder_cognito()
 * @model
 * @generated
 */
public interface SignInAliasesBuilder_cognito extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Email java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email java lang Boolean </em>' attribute.
	 * @see #setEmail_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSignInAliasesBuilder_cognito_Email_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getEmail_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SignInAliasesBuilder_cognito#getEmail_java_lang_Boolean_ <em>Email java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email java lang Boolean </em>' attribute.
	 * @see #getEmail_java_lang_Boolean_()
	 * @generated
	 */
	void setEmail_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Phone java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone java lang Boolean </em>' attribute.
	 * @see #setPhone_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSignInAliasesBuilder_cognito_Phone_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getPhone_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SignInAliasesBuilder_cognito#getPhone_java_lang_Boolean_ <em>Phone java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone java lang Boolean </em>' attribute.
	 * @see #getPhone_java_lang_Boolean_()
	 * @generated
	 */
	void setPhone_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Preferred Username java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Username java lang Boolean </em>' attribute.
	 * @see #setPreferredUsername_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSignInAliasesBuilder_cognito_PreferredUsername_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getPreferredUsername_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SignInAliasesBuilder_cognito#getPreferredUsername_java_lang_Boolean_ <em>Preferred Username java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Username java lang Boolean </em>' attribute.
	 * @see #getPreferredUsername_java_lang_Boolean_()
	 * @generated
	 */
	void setPreferredUsername_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Username java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username java lang Boolean </em>' attribute.
	 * @see #setUsername_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSignInAliasesBuilder_cognito_Username_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getUsername_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SignInAliasesBuilder_cognito#getUsername_java_lang_Boolean_ <em>Username java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username java lang Boolean </em>' attribute.
	 * @see #getUsername_java_lang_Boolean_()
	 * @generated
	 */
	void setUsername_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.cognito.SignInAliases"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSignInAliasesBuilder_cognito_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.cognito.SignInAliases" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSignInAliasesBuilder_cognito_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SignInAliasesBuilder_cognito#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSignInAliasesBuilder_cognito_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SignInAliasesBuilder_cognito#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSignInAliasesBuilder_cognito_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SignInAliasesBuilder_cognito#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // SignInAliasesBuilder_cognito
