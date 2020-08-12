/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topic Props Builder sns</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.TopicPropsBuilder_sns#getDisplayName_java_lang_String_ <em>Display Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.TopicPropsBuilder_sns#getMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference <em>Master Key With IKey software amazon awscdk services kms IKey As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.TopicPropsBuilder_sns#getTopicName_java_lang_String_ <em>Topic Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.TopicPropsBuilder_sns#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.TopicPropsBuilder_sns#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.TopicPropsBuilder_sns#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.TopicPropsBuilder_sns#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getTopicPropsBuilder_sns()
 * @model
 * @generated
 */
public interface TopicPropsBuilder_sns extends EObject {
	/**
	 * Returns the value of the '<em><b>Display Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name java lang String </em>' attribute.
	 * @see #setDisplayName_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getTopicPropsBuilder_sns_DisplayName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDisplayName_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.TopicPropsBuilder_sns#getDisplayName_java_lang_String_ <em>Display Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name java lang String </em>' attribute.
	 * @see #getDisplayName_java_lang_String_()
	 * @generated
	 */
	void setDisplayName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Master Key With IKey software amazon awscdk services kms IKey As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Key With IKey software amazon awscdk services kms IKey As Reference</em>' attribute.
	 * @see #setMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getTopicPropsBuilder_sns_MasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @model
	 * @generated
	 */
	String getMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.TopicPropsBuilder_sns#getMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference <em>Master Key With IKey software amazon awscdk services kms IKey As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Key With IKey software amazon awscdk services kms IKey As Reference</em>' attribute.
	 * @see #getMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @generated
	 */
	void setMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Topic Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic Name java lang String </em>' attribute.
	 * @see #setTopicName_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getTopicPropsBuilder_sns_TopicName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getTopicName_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.TopicPropsBuilder_sns#getTopicName_java_lang_String_ <em>Topic Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic Name java lang String </em>' attribute.
	 * @see #getTopicName_java_lang_String_()
	 * @generated
	 */
	void setTopicName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.sns.TopicProps"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getTopicPropsBuilder_sns_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.sns.TopicProps" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getTopicPropsBuilder_sns_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.TopicPropsBuilder_sns#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getTopicPropsBuilder_sns_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.TopicPropsBuilder_sns#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getTopicPropsBuilder_sns_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.TopicPropsBuilder_sns#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // TopicPropsBuilder_sns
