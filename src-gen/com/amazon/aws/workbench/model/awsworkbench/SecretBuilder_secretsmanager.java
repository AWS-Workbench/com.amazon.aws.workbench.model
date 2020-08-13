/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Secret Builder secretsmanager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SecretBuilder_secretsmanager#getDescription_java_lang_String_ <em>Description java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SecretBuilder_secretsmanager#getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference <em>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SecretBuilder_secretsmanager#getGenerateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReference <em>Generate Secret String With Secret String Generator software amazon awscdk services secretsmanager Secret String Generator As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SecretBuilder_secretsmanager#getSecretName_java_lang_String_ <em>Secret Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SecretBuilder_secretsmanager#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SecretBuilder_secretsmanager#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SecretBuilder_secretsmanager#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SecretBuilder_secretsmanager#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSecretBuilder_secretsmanager()
 * @model
 * @generated
 */
public interface SecretBuilder_secretsmanager extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Description java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description java lang String </em>' attribute.
	 * @see #setDescription_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSecretBuilder_secretsmanager_Description_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDescription_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SecretBuilder_secretsmanager#getDescription_java_lang_String_ <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description java lang String </em>' attribute.
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 */
	void setDescription_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>' attribute.
	 * @see #setEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSecretBuilder_secretsmanager_EncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @model
	 * @generated
	 */
	String getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SecretBuilder_secretsmanager#getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference <em>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>' attribute.
	 * @see #getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @generated
	 */
	void setEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generate Secret String With Secret String Generator software amazon awscdk services secretsmanager Secret String Generator As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Secret String With Secret String Generator software amazon awscdk services secretsmanager Secret String Generator As Reference</em>' attribute.
	 * @see #setGenerateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSecretBuilder_secretsmanager_GenerateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReference()
	 * @model
	 * @generated
	 */
	String getGenerateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SecretBuilder_secretsmanager#getGenerateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReference <em>Generate Secret String With Secret String Generator software amazon awscdk services secretsmanager Secret String Generator As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Secret String With Secret String Generator software amazon awscdk services secretsmanager Secret String Generator As Reference</em>' attribute.
	 * @see #getGenerateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReference()
	 * @generated
	 */
	void setGenerateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Secret Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secret Name java lang String </em>' attribute.
	 * @see #setSecretName_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSecretBuilder_secretsmanager_SecretName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getSecretName_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SecretBuilder_secretsmanager#getSecretName_java_lang_String_ <em>Secret Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secret Name java lang String </em>' attribute.
	 * @see #getSecretName_java_lang_String_()
	 * @generated
	 */
	void setSecretName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.secretsmanager.Secret"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSecretBuilder_secretsmanager_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.secretsmanager.Secret" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSecretBuilder_secretsmanager_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SecretBuilder_secretsmanager#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSecretBuilder_secretsmanager_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SecretBuilder_secretsmanager#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSecretBuilder_secretsmanager_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SecretBuilder_secretsmanager#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // SecretBuilder_secretsmanager
