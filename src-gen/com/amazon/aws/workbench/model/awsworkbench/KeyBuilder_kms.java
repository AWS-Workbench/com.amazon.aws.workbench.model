/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Builder kms</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.KeyBuilder_kms#getAlias_java_lang_String_ <em>Alias java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.KeyBuilder_kms#getDescription_java_lang_String_ <em>Description java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.KeyBuilder_kms#getEnabled_java_lang_Boolean_ <em>Enabled java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.KeyBuilder_kms#getEnableKeyRotation_java_lang_Boolean_ <em>Enable Key Rotation java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.KeyBuilder_kms#getPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference <em>Policy With Policy Document software amazon awscdk services iam Policy Document As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.KeyBuilder_kms#getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ <em>Removal Policy software amazon awscdk core Removal Policy </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.KeyBuilder_kms#getTrustAccountIdentities_java_lang_Boolean_ <em>Trust Account Identities java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.KeyBuilder_kms#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.KeyBuilder_kms#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.KeyBuilder_kms#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.KeyBuilder_kms#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getKeyBuilder_kms()
 * @model
 * @generated
 */
public interface KeyBuilder_kms extends EObject {
	/**
	 * Returns the value of the '<em><b>Alias java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias java lang String </em>' attribute.
	 * @see #setAlias_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getKeyBuilder_kms_Alias_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getAlias_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.KeyBuilder_kms#getAlias_java_lang_String_ <em>Alias java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias java lang String </em>' attribute.
	 * @see #getAlias_java_lang_String_()
	 * @generated
	 */
	void setAlias_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Description java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description java lang String </em>' attribute.
	 * @see #setDescription_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getKeyBuilder_kms_Description_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDescription_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.KeyBuilder_kms#getDescription_java_lang_String_ <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description java lang String </em>' attribute.
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 */
	void setDescription_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Enabled java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled java lang Boolean </em>' attribute.
	 * @see #setEnabled_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getKeyBuilder_kms_Enabled_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getEnabled_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.KeyBuilder_kms#getEnabled_java_lang_Boolean_ <em>Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled java lang Boolean </em>' attribute.
	 * @see #getEnabled_java_lang_Boolean_()
	 * @generated
	 */
	void setEnabled_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Enable Key Rotation java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Key Rotation java lang Boolean </em>' attribute.
	 * @see #setEnableKeyRotation_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getKeyBuilder_kms_EnableKeyRotation_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getEnableKeyRotation_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.KeyBuilder_kms#getEnableKeyRotation_java_lang_Boolean_ <em>Enable Key Rotation java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Key Rotation java lang Boolean </em>' attribute.
	 * @see #getEnableKeyRotation_java_lang_Boolean_()
	 * @generated
	 */
	void setEnableKeyRotation_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Policy With Policy Document software amazon awscdk services iam Policy Document As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy With Policy Document software amazon awscdk services iam Policy Document As Reference</em>' attribute.
	 * @see #setPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getKeyBuilder_kms_PolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference()
	 * @model
	 * @generated
	 */
	String getPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.KeyBuilder_kms#getPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference <em>Policy With Policy Document software amazon awscdk services iam Policy Document As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy With Policy Document software amazon awscdk services iam Policy Document As Reference</em>' attribute.
	 * @see #getPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference()
	 * @generated
	 */
	void setPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Removal Policy software amazon awscdk core Removal Policy </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.RemovalPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removal Policy software amazon awscdk core Removal Policy </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RemovalPolicy
	 * @see #setRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_(RemovalPolicy)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getKeyBuilder_kms_RemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.RemovalPolicy"
	 * @generated
	 */
	RemovalPolicy getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.KeyBuilder_kms#getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ <em>Removal Policy software amazon awscdk core Removal Policy </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removal Policy software amazon awscdk core Removal Policy </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RemovalPolicy
	 * @see #getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_()
	 * @generated
	 */
	void setRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_(RemovalPolicy value);

	/**
	 * Returns the value of the '<em><b>Trust Account Identities java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trust Account Identities java lang Boolean </em>' attribute.
	 * @see #setTrustAccountIdentities_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getKeyBuilder_kms_TrustAccountIdentities_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getTrustAccountIdentities_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.KeyBuilder_kms#getTrustAccountIdentities_java_lang_Boolean_ <em>Trust Account Identities java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trust Account Identities java lang Boolean </em>' attribute.
	 * @see #getTrustAccountIdentities_java_lang_Boolean_()
	 * @generated
	 */
	void setTrustAccountIdentities_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.kms.Key"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getKeyBuilder_kms_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.kms.Key" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getKeyBuilder_kms_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.KeyBuilder_kms#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getKeyBuilder_kms_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.KeyBuilder_kms#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getKeyBuilder_kms_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.KeyBuilder_kms#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // KeyBuilder_kms
