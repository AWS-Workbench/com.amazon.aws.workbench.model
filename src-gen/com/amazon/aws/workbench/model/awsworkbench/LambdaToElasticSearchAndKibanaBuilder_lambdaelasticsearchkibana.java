/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lambda To Elastic Search And Kibana Builder lambdaelasticsearchkibana</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana#getDomainName_java_lang_String_ <em>Domain Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana#getEsDomainPropsWithCfnDomainProps_software_amazon_awscdk_services_elasticsearch_CfnDomainProps_AsReference <em>Es Domain Props With Cfn Domain Props software amazon awscdk services elasticsearch Cfn Domain Props As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana#getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference <em>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana#getLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference <em>Lambda Function Props With Function Props software amazon awscdk services lambda Function Props As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana()
 * @model
 * @generated
 */
public interface LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Domain Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Name java lang String </em>' attribute.
	 * @see #setDomainName_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana_DomainName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDomainName_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana#getDomainName_java_lang_String_ <em>Domain Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name java lang String </em>' attribute.
	 * @see #getDomainName_java_lang_String_()
	 * @generated
	 */
	void setDomainName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Es Domain Props With Cfn Domain Props software amazon awscdk services elasticsearch Cfn Domain Props As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Domain Props With Cfn Domain Props software amazon awscdk services elasticsearch Cfn Domain Props As Reference</em>' attribute.
	 * @see #setEsDomainPropsWithCfnDomainProps_software_amazon_awscdk_services_elasticsearch_CfnDomainProps_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana_EsDomainPropsWithCfnDomainProps_software_amazon_awscdk_services_elasticsearch_CfnDomainProps_AsReference()
	 * @model
	 * @generated
	 */
	String getEsDomainPropsWithCfnDomainProps_software_amazon_awscdk_services_elasticsearch_CfnDomainProps_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana#getEsDomainPropsWithCfnDomainProps_software_amazon_awscdk_services_elasticsearch_CfnDomainProps_AsReference <em>Es Domain Props With Cfn Domain Props software amazon awscdk services elasticsearch Cfn Domain Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Domain Props With Cfn Domain Props software amazon awscdk services elasticsearch Cfn Domain Props As Reference</em>' attribute.
	 * @see #getEsDomainPropsWithCfnDomainProps_software_amazon_awscdk_services_elasticsearch_CfnDomainProps_AsReference()
	 * @generated
	 */
	void setEsDomainPropsWithCfnDomainProps_software_amazon_awscdk_services_elasticsearch_CfnDomainProps_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</em>' attribute.
	 * @see #setExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference()
	 * @model
	 * @generated
	 */
	String getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana#getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference <em>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</em>' attribute.
	 * @see #getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference()
	 * @generated
	 */
	void setExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Lambda Function Props With Function Props software amazon awscdk services lambda Function Props As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lambda Function Props With Function Props software amazon awscdk services lambda Function Props As Reference</em>' attribute.
	 * @see #setLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana_LambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference()
	 * @model
	 * @generated
	 */
	String getLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana#getLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference <em>Lambda Function Props With Function Props software amazon awscdk services lambda Function Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lambda Function Props With Function Props software amazon awscdk services lambda Function Props As Reference</em>' attribute.
	 * @see #getLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference()
	 * @generated
	 */
	void setLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awsconstructs.services.lambdaelasticsearchkibana.LambdaToElasticSearchAndKibana"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana_GeneratedClassName()
	 * @model default="software.amazon.awsconstructs.services.lambdaelasticsearchkibana.LambdaToElasticSearchAndKibana" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana
