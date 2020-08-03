/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqs To Lambda Builder sqslambda</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SqsToLambdaBuilder_sqslambda#getDeadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference <em>Dead Letter Queue Props With Queue Props software amazon awscdk services sqs Queue Props As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SqsToLambdaBuilder_sqslambda#getDeployDeadLetterQueue_java_lang_Boolean_ <em>Deploy Dead Letter Queue java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SqsToLambdaBuilder_sqslambda#getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference <em>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SqsToLambdaBuilder_sqslambda#getExistingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference <em>Existing Queue Obj With Queue software amazon awscdk services sqs Queue As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SqsToLambdaBuilder_sqslambda#getLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference <em>Lambda Function Props With Function Props software amazon awscdk services lambda Function Props As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SqsToLambdaBuilder_sqslambda#getMaxReceiveCount_java_lang_Number_ <em>Max Receive Count java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SqsToLambdaBuilder_sqslambda#getQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference <em>Queue Props With Queue Props software amazon awscdk services sqs Queue Props As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SqsToLambdaBuilder_sqslambda#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SqsToLambdaBuilder_sqslambda#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SqsToLambdaBuilder_sqslambda#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SqsToLambdaBuilder_sqslambda#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSqsToLambdaBuilder_sqslambda()
 * @model
 * @generated
 */
public interface SqsToLambdaBuilder_sqslambda extends EObject {
	/**
	 * Returns the value of the '<em><b>Dead Letter Queue Props With Queue Props software amazon awscdk services sqs Queue Props As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dead Letter Queue Props With Queue Props software amazon awscdk services sqs Queue Props As Reference</em>' attribute.
	 * @see #setDeadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSqsToLambdaBuilder_sqslambda_DeadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference()
	 * @model
	 * @generated
	 */
	String getDeadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SqsToLambdaBuilder_sqslambda#getDeadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference <em>Dead Letter Queue Props With Queue Props software amazon awscdk services sqs Queue Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dead Letter Queue Props With Queue Props software amazon awscdk services sqs Queue Props As Reference</em>' attribute.
	 * @see #getDeadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference()
	 * @generated
	 */
	void setDeadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Deploy Dead Letter Queue java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deploy Dead Letter Queue java lang Boolean </em>' attribute.
	 * @see #setDeployDeadLetterQueue_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSqsToLambdaBuilder_sqslambda_DeployDeadLetterQueue_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getDeployDeadLetterQueue_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SqsToLambdaBuilder_sqslambda#getDeployDeadLetterQueue_java_lang_Boolean_ <em>Deploy Dead Letter Queue java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deploy Dead Letter Queue java lang Boolean </em>' attribute.
	 * @see #getDeployDeadLetterQueue_java_lang_Boolean_()
	 * @generated
	 */
	void setDeployDeadLetterQueue_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</em>' attribute.
	 * @see #setExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSqsToLambdaBuilder_sqslambda_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference()
	 * @model
	 * @generated
	 */
	String getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SqsToLambdaBuilder_sqslambda#getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference <em>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</em>' attribute.
	 * @see #getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference()
	 * @generated
	 */
	void setExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Existing Queue Obj With Queue software amazon awscdk services sqs Queue As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Existing Queue Obj With Queue software amazon awscdk services sqs Queue As Reference</em>' attribute.
	 * @see #setExistingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSqsToLambdaBuilder_sqslambda_ExistingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference()
	 * @model
	 * @generated
	 */
	String getExistingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SqsToLambdaBuilder_sqslambda#getExistingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference <em>Existing Queue Obj With Queue software amazon awscdk services sqs Queue As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Existing Queue Obj With Queue software amazon awscdk services sqs Queue As Reference</em>' attribute.
	 * @see #getExistingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference()
	 * @generated
	 */
	void setExistingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Lambda Function Props With Function Props software amazon awscdk services lambda Function Props As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lambda Function Props With Function Props software amazon awscdk services lambda Function Props As Reference</em>' attribute.
	 * @see #setLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSqsToLambdaBuilder_sqslambda_LambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference()
	 * @model
	 * @generated
	 */
	String getLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SqsToLambdaBuilder_sqslambda#getLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference <em>Lambda Function Props With Function Props software amazon awscdk services lambda Function Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lambda Function Props With Function Props software amazon awscdk services lambda Function Props As Reference</em>' attribute.
	 * @see #getLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference()
	 * @generated
	 */
	void setLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Max Receive Count java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Receive Count java lang Number </em>' attribute.
	 * @see #setMaxReceiveCount_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSqsToLambdaBuilder_sqslambda_MaxReceiveCount_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getMaxReceiveCount_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SqsToLambdaBuilder_sqslambda#getMaxReceiveCount_java_lang_Number_ <em>Max Receive Count java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Receive Count java lang Number </em>' attribute.
	 * @see #getMaxReceiveCount_java_lang_Number_()
	 * @generated
	 */
	void setMaxReceiveCount_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Queue Props With Queue Props software amazon awscdk services sqs Queue Props As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue Props With Queue Props software amazon awscdk services sqs Queue Props As Reference</em>' attribute.
	 * @see #setQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSqsToLambdaBuilder_sqslambda_QueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference()
	 * @model
	 * @generated
	 */
	String getQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SqsToLambdaBuilder_sqslambda#getQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference <em>Queue Props With Queue Props software amazon awscdk services sqs Queue Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Props With Queue Props software amazon awscdk services sqs Queue Props As Reference</em>' attribute.
	 * @see #getQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference()
	 * @generated
	 */
	void setQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.awsconstructs.services.sqslambda.SqsToLambda"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSqsToLambdaBuilder_sqslambda_GeneratedClassName()
	 * @model default="software.amazon.awscdk.awsconstructs.services.sqslambda.SqsToLambda" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSqsToLambdaBuilder_sqslambda_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SqsToLambdaBuilder_sqslambda#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSqsToLambdaBuilder_sqslambda_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SqsToLambdaBuilder_sqslambda#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSqsToLambdaBuilder_sqslambda_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SqsToLambdaBuilder_sqslambda#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // SqsToLambdaBuilder_sqslambda
