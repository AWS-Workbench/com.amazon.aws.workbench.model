/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version Builder lambda</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VersionBuilder_lambda#getMaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Max Event Age With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VersionBuilder_lambda#getOnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference <em>On Failure With IDestination software amazon awscdk services lambda IDestination As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VersionBuilder_lambda#getOnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference <em>On Success With IDestination software amazon awscdk services lambda IDestination As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VersionBuilder_lambda#getRetryAttempts_java_lang_Number_ <em>Retry Attempts java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VersionBuilder_lambda#getCodeSha256_java_lang_String_ <em>Code Sha256 java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VersionBuilder_lambda#getDescription_java_lang_String_ <em>Description java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VersionBuilder_lambda#getProvisionedConcurrentExecutions_java_lang_Number_ <em>Provisioned Concurrent Executions java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VersionBuilder_lambda#getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ <em>Removal Policy software amazon awscdk core Removal Policy </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VersionBuilder_lambda#getLambdaWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference <em>Lambda With IFunction software amazon awscdk services lambda IFunction As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VersionBuilder_lambda#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VersionBuilder_lambda#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VersionBuilder_lambda#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VersionBuilder_lambda#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVersionBuilder_lambda()
 * @model
 * @generated
 */
public interface VersionBuilder_lambda extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Max Event Age With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Event Age With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setMaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVersionBuilder_lambda_MaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getMaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VersionBuilder_lambda#getMaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Max Event Age With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Event Age With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getMaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setMaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>On Failure With IDestination software amazon awscdk services lambda IDestination As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Failure With IDestination software amazon awscdk services lambda IDestination As Reference</em>' attribute.
	 * @see #setOnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVersionBuilder_lambda_OnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference()
	 * @model
	 * @generated
	 */
	String getOnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VersionBuilder_lambda#getOnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference <em>On Failure With IDestination software amazon awscdk services lambda IDestination As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Failure With IDestination software amazon awscdk services lambda IDestination As Reference</em>' attribute.
	 * @see #getOnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference()
	 * @generated
	 */
	void setOnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>On Success With IDestination software amazon awscdk services lambda IDestination As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Success With IDestination software amazon awscdk services lambda IDestination As Reference</em>' attribute.
	 * @see #setOnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVersionBuilder_lambda_OnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference()
	 * @model
	 * @generated
	 */
	String getOnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VersionBuilder_lambda#getOnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference <em>On Success With IDestination software amazon awscdk services lambda IDestination As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Success With IDestination software amazon awscdk services lambda IDestination As Reference</em>' attribute.
	 * @see #getOnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference()
	 * @generated
	 */
	void setOnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Retry Attempts java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retry Attempts java lang Number </em>' attribute.
	 * @see #setRetryAttempts_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVersionBuilder_lambda_RetryAttempts_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getRetryAttempts_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VersionBuilder_lambda#getRetryAttempts_java_lang_Number_ <em>Retry Attempts java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry Attempts java lang Number </em>' attribute.
	 * @see #getRetryAttempts_java_lang_Number_()
	 * @generated
	 */
	void setRetryAttempts_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Code Sha256 java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Sha256 java lang String </em>' attribute.
	 * @see #setCodeSha256_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVersionBuilder_lambda_CodeSha256_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getCodeSha256_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VersionBuilder_lambda#getCodeSha256_java_lang_String_ <em>Code Sha256 java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Sha256 java lang String </em>' attribute.
	 * @see #getCodeSha256_java_lang_String_()
	 * @generated
	 */
	void setCodeSha256_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Description java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description java lang String </em>' attribute.
	 * @see #setDescription_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVersionBuilder_lambda_Description_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDescription_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VersionBuilder_lambda#getDescription_java_lang_String_ <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description java lang String </em>' attribute.
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 */
	void setDescription_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Provisioned Concurrent Executions java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provisioned Concurrent Executions java lang Number </em>' attribute.
	 * @see #setProvisionedConcurrentExecutions_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVersionBuilder_lambda_ProvisionedConcurrentExecutions_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getProvisionedConcurrentExecutions_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VersionBuilder_lambda#getProvisionedConcurrentExecutions_java_lang_Number_ <em>Provisioned Concurrent Executions java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provisioned Concurrent Executions java lang Number </em>' attribute.
	 * @see #getProvisionedConcurrentExecutions_java_lang_Number_()
	 * @generated
	 */
	void setProvisionedConcurrentExecutions_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Removal Policy software amazon awscdk core Removal Policy </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.RemovalPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removal Policy software amazon awscdk core Removal Policy </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RemovalPolicy
	 * @see #setRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_(RemovalPolicy)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVersionBuilder_lambda_RemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.RemovalPolicy"
	 * @generated
	 */
	RemovalPolicy getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VersionBuilder_lambda#getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ <em>Removal Policy software amazon awscdk core Removal Policy </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removal Policy software amazon awscdk core Removal Policy </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RemovalPolicy
	 * @see #getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_()
	 * @generated
	 */
	void setRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_(RemovalPolicy value);

	/**
	 * Returns the value of the '<em><b>Lambda With IFunction software amazon awscdk services lambda IFunction As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lambda With IFunction software amazon awscdk services lambda IFunction As Reference</em>' attribute.
	 * @see #setLambdaWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVersionBuilder_lambda_LambdaWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference()
	 * @model
	 * @generated
	 */
	String getLambdaWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VersionBuilder_lambda#getLambdaWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference <em>Lambda With IFunction software amazon awscdk services lambda IFunction As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lambda With IFunction software amazon awscdk services lambda IFunction As Reference</em>' attribute.
	 * @see #getLambdaWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference()
	 * @generated
	 */
	void setLambdaWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.lambda.Version"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVersionBuilder_lambda_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.lambda.Version" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVersionBuilder_lambda_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VersionBuilder_lambda#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVersionBuilder_lambda_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VersionBuilder_lambda#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVersionBuilder_lambda_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VersionBuilder_lambda#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // VersionBuilder_lambda
