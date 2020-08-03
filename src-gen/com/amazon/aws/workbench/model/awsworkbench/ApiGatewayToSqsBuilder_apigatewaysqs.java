/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Api Gateway To Sqs Builder apigatewaysqs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToSqsBuilder_apigatewaysqs#getAllowCreateOperation_java_lang_Boolean_ <em>Allow Create Operation java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToSqsBuilder_apigatewaysqs#getAllowDeleteOperation_java_lang_Boolean_ <em>Allow Delete Operation java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToSqsBuilder_apigatewaysqs#getAllowReadOperation_java_lang_Boolean_ <em>Allow Read Operation java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToSqsBuilder_apigatewaysqs#getApiGatewayProps_java_lang_Object_ <em>Api Gateway Props java lang Object </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToSqsBuilder_apigatewaysqs#getCreateRequestTemplate_java_lang_String_ <em>Create Request Template java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToSqsBuilder_apigatewaysqs#getDeployDeadLetterQueue_java_lang_Boolean_ <em>Deploy Dead Letter Queue java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToSqsBuilder_apigatewaysqs#getMaxReceiveCount_java_lang_Number_ <em>Max Receive Count java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToSqsBuilder_apigatewaysqs#getQueueProps_java_lang_Object_ <em>Queue Props java lang Object </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToSqsBuilder_apigatewaysqs#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToSqsBuilder_apigatewaysqs#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToSqsBuilder_apigatewaysqs#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToSqsBuilder_apigatewaysqs#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToSqsBuilder_apigatewaysqs()
 * @model
 * @generated
 */
public interface ApiGatewayToSqsBuilder_apigatewaysqs extends EObject {
	/**
	 * Returns the value of the '<em><b>Allow Create Operation java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Create Operation java lang Boolean </em>' attribute.
	 * @see #setAllowCreateOperation_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToSqsBuilder_apigatewaysqs_AllowCreateOperation_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getAllowCreateOperation_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToSqsBuilder_apigatewaysqs#getAllowCreateOperation_java_lang_Boolean_ <em>Allow Create Operation java lang Boolean </em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToSqsBuilder_apigatewaysqs_AllowDeleteOperation_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getAllowDeleteOperation_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToSqsBuilder_apigatewaysqs#getAllowDeleteOperation_java_lang_Boolean_ <em>Allow Delete Operation java lang Boolean </em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToSqsBuilder_apigatewaysqs_AllowReadOperation_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getAllowReadOperation_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToSqsBuilder_apigatewaysqs#getAllowReadOperation_java_lang_Boolean_ <em>Allow Read Operation java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Read Operation java lang Boolean </em>' attribute.
	 * @see #getAllowReadOperation_java_lang_Boolean_()
	 * @generated
	 */
	void setAllowReadOperation_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Api Gateway Props java lang Object </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Gateway Props java lang Object </em>' attribute.
	 * @see #setApiGatewayProps_java_lang_Object_(Object)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToSqsBuilder_apigatewaysqs_ApiGatewayProps_java_lang_Object_()
	 * @model
	 * @generated
	 */
	Object getApiGatewayProps_java_lang_Object_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToSqsBuilder_apigatewaysqs#getApiGatewayProps_java_lang_Object_ <em>Api Gateway Props java lang Object </em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToSqsBuilder_apigatewaysqs_CreateRequestTemplate_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getCreateRequestTemplate_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToSqsBuilder_apigatewaysqs#getCreateRequestTemplate_java_lang_String_ <em>Create Request Template java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Request Template java lang String </em>' attribute.
	 * @see #getCreateRequestTemplate_java_lang_String_()
	 * @generated
	 */
	void setCreateRequestTemplate_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Deploy Dead Letter Queue java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deploy Dead Letter Queue java lang Boolean </em>' attribute.
	 * @see #setDeployDeadLetterQueue_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToSqsBuilder_apigatewaysqs_DeployDeadLetterQueue_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getDeployDeadLetterQueue_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToSqsBuilder_apigatewaysqs#getDeployDeadLetterQueue_java_lang_Boolean_ <em>Deploy Dead Letter Queue java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deploy Dead Letter Queue java lang Boolean </em>' attribute.
	 * @see #getDeployDeadLetterQueue_java_lang_Boolean_()
	 * @generated
	 */
	void setDeployDeadLetterQueue_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Max Receive Count java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Receive Count java lang Number </em>' attribute.
	 * @see #setMaxReceiveCount_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToSqsBuilder_apigatewaysqs_MaxReceiveCount_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getMaxReceiveCount_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToSqsBuilder_apigatewaysqs#getMaxReceiveCount_java_lang_Number_ <em>Max Receive Count java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Receive Count java lang Number </em>' attribute.
	 * @see #getMaxReceiveCount_java_lang_Number_()
	 * @generated
	 */
	void setMaxReceiveCount_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Queue Props java lang Object </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue Props java lang Object </em>' attribute.
	 * @see #setQueueProps_java_lang_Object_(Object)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToSqsBuilder_apigatewaysqs_QueueProps_java_lang_Object_()
	 * @model
	 * @generated
	 */
	Object getQueueProps_java_lang_Object_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToSqsBuilder_apigatewaysqs#getQueueProps_java_lang_Object_ <em>Queue Props java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Props java lang Object </em>' attribute.
	 * @see #getQueueProps_java_lang_Object_()
	 * @generated
	 */
	void setQueueProps_java_lang_Object_(Object value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.awsconstructs.services.apigatewaysqs.ApiGatewayToSqs"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToSqsBuilder_apigatewaysqs_GeneratedClassName()
	 * @model default="software.amazon.awscdk.awsconstructs.services.apigatewaysqs.ApiGatewayToSqs" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToSqsBuilder_apigatewaysqs_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToSqsBuilder_apigatewaysqs#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToSqsBuilder_apigatewaysqs_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToSqsBuilder_apigatewaysqs#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getApiGatewayToSqsBuilder_apigatewaysqs_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToSqsBuilder_apigatewaysqs#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // ApiGatewayToSqsBuilder_apigatewaysqs
