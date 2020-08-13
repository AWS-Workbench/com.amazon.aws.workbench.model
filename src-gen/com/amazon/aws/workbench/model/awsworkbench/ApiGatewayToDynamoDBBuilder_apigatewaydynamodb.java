/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Api Gateway To Dynamo DB Builder apigatewaydynamodb</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToDynamoDBBuilder_apigatewaydynamodb#getAllowCreateOperation_java_lang_Boolean_ <em>Allow Create Operation java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToDynamoDBBuilder_apigatewaydynamodb#getAllowDeleteOperation_java_lang_Boolean_ <em>Allow Delete Operation java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToDynamoDBBuilder_apigatewaydynamodb#getAllowReadOperation_java_lang_Boolean_ <em>Allow Read Operation java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToDynamoDBBuilder_apigatewaydynamodb#getAllowUpdateOperation_java_lang_Boolean_ <em>Allow Update Operation java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToDynamoDBBuilder_apigatewaydynamodb#getApiGatewayProps_java_lang_Object_ <em>Api Gateway Props java lang Object </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToDynamoDBBuilder_apigatewaydynamodb#getCreateRequestTemplate_java_lang_String_ <em>Create Request Template java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToDynamoDBBuilder_apigatewaydynamodb#getDynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference <em>Dynamo Table Props With Table Props software amazon awscdk services dynamodb Table Props As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToDynamoDBBuilder_apigatewaydynamodb#getUpdateRequestTemplate_java_lang_String_ <em>Update Request Template java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToDynamoDBBuilder_apigatewaydynamodb#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToDynamoDBBuilder_apigatewaydynamodb#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToDynamoDBBuilder_apigatewaydynamodb#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToDynamoDBBuilder_apigatewaydynamodb#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToDynamoDBBuilder_apigatewaydynamodb()
 * @model
 * @generated
 */
public interface ApiGatewayToDynamoDBBuilder_apigatewaydynamodb extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Allow Create Operation java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Create Operation java lang Boolean </em>' attribute.
	 * @see #setAllowCreateOperation_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_AllowCreateOperation_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getAllowCreateOperation_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToDynamoDBBuilder_apigatewaydynamodb#getAllowCreateOperation_java_lang_Boolean_ <em>Allow Create Operation java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Create Operation java lang Boolean </em>' attribute.
	 * @see #getAllowCreateOperation_java_lang_Boolean_()
	 * @generated
	 */
	void setAllowCreateOperation_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Delete Operation java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Delete Operation java lang Boolean </em>' attribute.
	 * @see #setAllowDeleteOperation_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_AllowDeleteOperation_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getAllowDeleteOperation_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToDynamoDBBuilder_apigatewaydynamodb#getAllowDeleteOperation_java_lang_Boolean_ <em>Allow Delete Operation java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Delete Operation java lang Boolean </em>' attribute.
	 * @see #getAllowDeleteOperation_java_lang_Boolean_()
	 * @generated
	 */
	void setAllowDeleteOperation_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Read Operation java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Read Operation java lang Boolean </em>' attribute.
	 * @see #setAllowReadOperation_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_AllowReadOperation_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getAllowReadOperation_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToDynamoDBBuilder_apigatewaydynamodb#getAllowReadOperation_java_lang_Boolean_ <em>Allow Read Operation java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Read Operation java lang Boolean </em>' attribute.
	 * @see #getAllowReadOperation_java_lang_Boolean_()
	 * @generated
	 */
	void setAllowReadOperation_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Update Operation java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Update Operation java lang Boolean </em>' attribute.
	 * @see #setAllowUpdateOperation_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_AllowUpdateOperation_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getAllowUpdateOperation_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToDynamoDBBuilder_apigatewaydynamodb#getAllowUpdateOperation_java_lang_Boolean_ <em>Allow Update Operation java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Update Operation java lang Boolean </em>' attribute.
	 * @see #getAllowUpdateOperation_java_lang_Boolean_()
	 * @generated
	 */
	void setAllowUpdateOperation_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Api Gateway Props java lang Object </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Gateway Props java lang Object </em>' attribute.
	 * @see #setApiGatewayProps_java_lang_Object_(Object)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_ApiGatewayProps_java_lang_Object_()
	 * @model
	 * @generated
	 */
	Object getApiGatewayProps_java_lang_Object_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToDynamoDBBuilder_apigatewaydynamodb#getApiGatewayProps_java_lang_Object_ <em>Api Gateway Props java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Gateway Props java lang Object </em>' attribute.
	 * @see #getApiGatewayProps_java_lang_Object_()
	 * @generated
	 */
	void setApiGatewayProps_java_lang_Object_(Object value);

	/**
	 * Returns the value of the '<em><b>Create Request Template java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Request Template java lang String </em>' attribute.
	 * @see #setCreateRequestTemplate_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_CreateRequestTemplate_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getCreateRequestTemplate_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToDynamoDBBuilder_apigatewaydynamodb#getCreateRequestTemplate_java_lang_String_ <em>Create Request Template java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Request Template java lang String </em>' attribute.
	 * @see #getCreateRequestTemplate_java_lang_String_()
	 * @generated
	 */
	void setCreateRequestTemplate_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Dynamo Table Props With Table Props software amazon awscdk services dynamodb Table Props As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamo Table Props With Table Props software amazon awscdk services dynamodb Table Props As Reference</em>' attribute.
	 * @see #setDynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_DynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference()
	 * @model
	 * @generated
	 */
	String getDynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToDynamoDBBuilder_apigatewaydynamodb#getDynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference <em>Dynamo Table Props With Table Props software amazon awscdk services dynamodb Table Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamo Table Props With Table Props software amazon awscdk services dynamodb Table Props As Reference</em>' attribute.
	 * @see #getDynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference()
	 * @generated
	 */
	void setDynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Update Request Template java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Request Template java lang String </em>' attribute.
	 * @see #setUpdateRequestTemplate_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_UpdateRequestTemplate_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getUpdateRequestTemplate_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToDynamoDBBuilder_apigatewaydynamodb#getUpdateRequestTemplate_java_lang_String_ <em>Update Request Template java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Request Template java lang String </em>' attribute.
	 * @see #getUpdateRequestTemplate_java_lang_String_()
	 * @generated
	 */
	void setUpdateRequestTemplate_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.awsconstructs.services.apigatewaydynamodb.ApiGatewayToDynamoDB"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_GeneratedClassName()
	 * @model default="software.amazon.awscdk.awsconstructs.services.apigatewaydynamodb.ApiGatewayToDynamoDB" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToDynamoDBBuilder_apigatewaydynamodb#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToDynamoDBBuilder_apigatewaydynamodb#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToDynamoDBBuilder_apigatewaydynamodb#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // ApiGatewayToDynamoDBBuilder_apigatewaydynamodb
