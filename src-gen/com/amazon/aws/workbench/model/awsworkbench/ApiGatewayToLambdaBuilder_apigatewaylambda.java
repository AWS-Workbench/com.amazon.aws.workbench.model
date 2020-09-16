/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Api Gateway To Lambda Builder apigatewaylambda</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToLambdaBuilder_apigatewaylambda#getApiGatewayProps_java_lang_Object_ <em>Api Gateway Props java lang Object </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToLambdaBuilder_apigatewaylambda#getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference <em>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToLambdaBuilder_apigatewaylambda#getLambdaFunctionProps_java_lang_Object_ <em>Lambda Function Props java lang Object </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToLambdaBuilder_apigatewaylambda#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToLambdaBuilder_apigatewaylambda#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToLambdaBuilder_apigatewaylambda#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToLambdaBuilder_apigatewaylambda#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToLambdaBuilder_apigatewaylambda()
 * @model
 * @generated
 */
public interface ApiGatewayToLambdaBuilder_apigatewaylambda extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Api Gateway Props java lang Object </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Gateway Props java lang Object </em>' attribute.
	 * @see #setApiGatewayProps_java_lang_Object_(Object)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToLambdaBuilder_apigatewaylambda_ApiGatewayProps_java_lang_Object_()
	 * @model
	 * @generated
	 */
	Object getApiGatewayProps_java_lang_Object_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToLambdaBuilder_apigatewaylambda#getApiGatewayProps_java_lang_Object_ <em>Api Gateway Props java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Gateway Props java lang Object </em>' attribute.
	 * @see #getApiGatewayProps_java_lang_Object_()
	 * @generated
	 */
	void setApiGatewayProps_java_lang_Object_(Object value);

	/**
	 * Returns the value of the '<em><b>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</em>' attribute.
	 * @see #setExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToLambdaBuilder_apigatewaylambda_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference()
	 * @model
	 * @generated
	 */
	String getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToLambdaBuilder_apigatewaylambda#getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference <em>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToLambdaBuilder_apigatewaylambda_LambdaFunctionProps_java_lang_Object_()
	 * @model
	 * @generated
	 */
	Object getLambdaFunctionProps_java_lang_Object_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToLambdaBuilder_apigatewaylambda#getLambdaFunctionProps_java_lang_Object_ <em>Lambda Function Props java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lambda Function Props java lang Object </em>' attribute.
	 * @see #getLambdaFunctionProps_java_lang_Object_()
	 * @generated
	 */
	void setLambdaFunctionProps_java_lang_Object_(Object value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awsconstructs.services.apigatewaylambda.ApiGatewayToLambda"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToLambdaBuilder_apigatewaylambda_GeneratedClassName()
	 * @model default="software.amazon.awsconstructs.services.apigatewaylambda.ApiGatewayToLambda" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToLambdaBuilder_apigatewaylambda_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToLambdaBuilder_apigatewaylambda#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToLambdaBuilder_apigatewaylambda_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToLambdaBuilder_apigatewaylambda#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToLambdaBuilder_apigatewaylambda_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToLambdaBuilder_apigatewaylambda#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // ApiGatewayToLambdaBuilder_apigatewaylambda
