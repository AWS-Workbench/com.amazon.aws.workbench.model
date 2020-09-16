/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lambda To Dynamo DB Builder lambdadynamodb</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToDynamoDBBuilder_lambdadynamodb#getDynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference <em>Dynamo Table Props With Table Props software amazon awscdk services dynamodb Table Props As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToDynamoDBBuilder_lambdadynamodb#getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference <em>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToDynamoDBBuilder_lambdadynamodb#getExistingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference <em>Existing Table Obj With Table software amazon awscdk services dynamodb Table As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToDynamoDBBuilder_lambdadynamodb#getLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference <em>Lambda Function Props With Function Props software amazon awscdk services lambda Function Props As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToDynamoDBBuilder_lambdadynamodb#getTablePermissions_java_lang_String_ <em>Table Permissions java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToDynamoDBBuilder_lambdadynamodb#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToDynamoDBBuilder_lambdadynamodb#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToDynamoDBBuilder_lambdadynamodb#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToDynamoDBBuilder_lambdadynamodb#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaToDynamoDBBuilder_lambdadynamodb()
 * @model
 * @generated
 */
public interface LambdaToDynamoDBBuilder_lambdadynamodb extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Dynamo Table Props With Table Props software amazon awscdk services dynamodb Table Props As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamo Table Props With Table Props software amazon awscdk services dynamodb Table Props As Reference</em>' attribute.
	 * @see #setDynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaToDynamoDBBuilder_lambdadynamodb_DynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference()
	 * @model
	 * @generated
	 */
	String getDynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToDynamoDBBuilder_lambdadynamodb#getDynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference <em>Dynamo Table Props With Table Props software amazon awscdk services dynamodb Table Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamo Table Props With Table Props software amazon awscdk services dynamodb Table Props As Reference</em>' attribute.
	 * @see #getDynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference()
	 * @generated
	 */
	void setDynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</em>' attribute.
	 * @see #setExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaToDynamoDBBuilder_lambdadynamodb_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference()
	 * @model
	 * @generated
	 */
	String getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToDynamoDBBuilder_lambdadynamodb#getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference <em>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</em>' attribute.
	 * @see #getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference()
	 * @generated
	 */
	void setExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Existing Table Obj With Table software amazon awscdk services dynamodb Table As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Existing Table Obj With Table software amazon awscdk services dynamodb Table As Reference</em>' attribute.
	 * @see #setExistingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaToDynamoDBBuilder_lambdadynamodb_ExistingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference()
	 * @model
	 * @generated
	 */
	String getExistingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToDynamoDBBuilder_lambdadynamodb#getExistingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference <em>Existing Table Obj With Table software amazon awscdk services dynamodb Table As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Existing Table Obj With Table software amazon awscdk services dynamodb Table As Reference</em>' attribute.
	 * @see #getExistingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference()
	 * @generated
	 */
	void setExistingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Lambda Function Props With Function Props software amazon awscdk services lambda Function Props As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lambda Function Props With Function Props software amazon awscdk services lambda Function Props As Reference</em>' attribute.
	 * @see #setLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaToDynamoDBBuilder_lambdadynamodb_LambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference()
	 * @model
	 * @generated
	 */
	String getLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToDynamoDBBuilder_lambdadynamodb#getLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference <em>Lambda Function Props With Function Props software amazon awscdk services lambda Function Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lambda Function Props With Function Props software amazon awscdk services lambda Function Props As Reference</em>' attribute.
	 * @see #getLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference()
	 * @generated
	 */
	void setLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Table Permissions java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Permissions java lang String </em>' attribute.
	 * @see #setTablePermissions_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaToDynamoDBBuilder_lambdadynamodb_TablePermissions_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getTablePermissions_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToDynamoDBBuilder_lambdadynamodb#getTablePermissions_java_lang_String_ <em>Table Permissions java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Permissions java lang String </em>' attribute.
	 * @see #getTablePermissions_java_lang_String_()
	 * @generated
	 */
	void setTablePermissions_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awsconstructs.services.lambdadynamodb.LambdaToDynamoDB"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaToDynamoDBBuilder_lambdadynamodb_GeneratedClassName()
	 * @model default="software.amazon.awsconstructs.services.lambdadynamodb.LambdaToDynamoDB" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaToDynamoDBBuilder_lambdadynamodb_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToDynamoDBBuilder_lambdadynamodb#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaToDynamoDBBuilder_lambdadynamodb_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToDynamoDBBuilder_lambdadynamodb#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLambdaToDynamoDBBuilder_lambdadynamodb_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToDynamoDBBuilder_lambdadynamodb#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // LambdaToDynamoDBBuilder_lambdadynamodb
