/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lambda To Sns Builder lambdasns</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToSnsBuilder_lambdasns#getEnableEncryption_java_lang_Boolean_ <em>Enable Encryption java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToSnsBuilder_lambdasns#getEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference <em>Encryption Key With Key software amazon awscdk services kms Key As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToSnsBuilder_lambdasns#getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference <em>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToSnsBuilder_lambdasns#getLambdaFunctionProps_java_lang_Object_ <em>Lambda Function Props java lang Object </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToSnsBuilder_lambdasns#getTopicProps_java_lang_Object_ <em>Topic Props java lang Object </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToSnsBuilder_lambdasns#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToSnsBuilder_lambdasns#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToSnsBuilder_lambdasns#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToSnsBuilder_lambdasns#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaToSnsBuilder_lambdasns()
 * @model
 * @generated
 */
public interface LambdaToSnsBuilder_lambdasns extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Enable Encryption java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Encryption java lang Boolean </em>' attribute.
	 * @see #setEnableEncryption_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaToSnsBuilder_lambdasns_EnableEncryption_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getEnableEncryption_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToSnsBuilder_lambdasns#getEnableEncryption_java_lang_Boolean_ <em>Enable Encryption java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Encryption java lang Boolean </em>' attribute.
	 * @see #getEnableEncryption_java_lang_Boolean_()
	 * @generated
	 */
	void setEnableEncryption_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Encryption Key With Key software amazon awscdk services kms Key As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encryption Key With Key software amazon awscdk services kms Key As Reference</em>' attribute.
	 * @see #setEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaToSnsBuilder_lambdasns_EncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference()
	 * @model
	 * @generated
	 */
	String getEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToSnsBuilder_lambdasns#getEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference <em>Encryption Key With Key software amazon awscdk services kms Key As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption Key With Key software amazon awscdk services kms Key As Reference</em>' attribute.
	 * @see #getEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference()
	 * @generated
	 */
	void setEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</em>' attribute.
	 * @see #setExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaToSnsBuilder_lambdasns_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference()
	 * @model
	 * @generated
	 */
	String getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToSnsBuilder_lambdasns#getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference <em>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</em>' attribute.
	 * @see #getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference()
	 * @generated
	 */
	void setExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Lambda Function Props java lang Object </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lambda Function Props java lang Object </em>' attribute.
	 * @see #setLambdaFunctionProps_java_lang_Object_(Object)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaToSnsBuilder_lambdasns_LambdaFunctionProps_java_lang_Object_()
	 * @model
	 * @generated
	 */
	Object getLambdaFunctionProps_java_lang_Object_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToSnsBuilder_lambdasns#getLambdaFunctionProps_java_lang_Object_ <em>Lambda Function Props java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lambda Function Props java lang Object </em>' attribute.
	 * @see #getLambdaFunctionProps_java_lang_Object_()
	 * @generated
	 */
	void setLambdaFunctionProps_java_lang_Object_(Object value);

	/**
	 * Returns the value of the '<em><b>Topic Props java lang Object </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic Props java lang Object </em>' attribute.
	 * @see #setTopicProps_java_lang_Object_(Object)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaToSnsBuilder_lambdasns_TopicProps_java_lang_Object_()
	 * @model
	 * @generated
	 */
	Object getTopicProps_java_lang_Object_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToSnsBuilder_lambdasns#getTopicProps_java_lang_Object_ <em>Topic Props java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic Props java lang Object </em>' attribute.
	 * @see #getTopicProps_java_lang_Object_()
	 * @generated
	 */
	void setTopicProps_java_lang_Object_(Object value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.awsconstructs.services.lambdasns.LambdaToSns"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaToSnsBuilder_lambdasns_GeneratedClassName()
	 * @model default="software.amazon.awscdk.awsconstructs.services.lambdasns.LambdaToSns" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaToSnsBuilder_lambdasns_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToSnsBuilder_lambdasns#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaToSnsBuilder_lambdasns_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToSnsBuilder_lambdasns#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaToSnsBuilder_lambdasns_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToSnsBuilder_lambdasns#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // LambdaToSnsBuilder_lambdasns
