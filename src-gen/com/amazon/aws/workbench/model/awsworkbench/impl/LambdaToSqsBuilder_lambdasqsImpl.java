/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.LambdaToSqsBuilder_lambdasqs;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lambda To Sqs Builder lambdasqs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaToSqsBuilder_lambdasqsImpl#getDeadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference <em>Dead Letter Queue Props With Queue Props software amazon awscdk services sqs Queue Props As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaToSqsBuilder_lambdasqsImpl#getDeployDeadLetterQueue_java_lang_Boolean_ <em>Deploy Dead Letter Queue java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaToSqsBuilder_lambdasqsImpl#getEnableQueuePurging_java_lang_Boolean_ <em>Enable Queue Purging java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaToSqsBuilder_lambdasqsImpl#getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference <em>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaToSqsBuilder_lambdasqsImpl#getExistingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference <em>Existing Queue Obj With Queue software amazon awscdk services sqs Queue As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaToSqsBuilder_lambdasqsImpl#getLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference <em>Lambda Function Props With Function Props software amazon awscdk services lambda Function Props As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaToSqsBuilder_lambdasqsImpl#getMaxReceiveCount_java_lang_Number_ <em>Max Receive Count java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaToSqsBuilder_lambdasqsImpl#getQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference <em>Queue Props With Queue Props software amazon awscdk services sqs Queue Props As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaToSqsBuilder_lambdasqsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaToSqsBuilder_lambdasqsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaToSqsBuilder_lambdasqsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaToSqsBuilder_lambdasqsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LambdaToSqsBuilder_lambdasqsImpl extends MinimalEObjectImpl.Container
		implements LambdaToSqsBuilder_lambdasqs {
	/**
	 * The default value of the '{@link #getDeadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference() <em>Dead Letter Queue Props With Queue Props software amazon awscdk services sqs Queue Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String DEAD_LETTER_QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference() <em>Dead Letter Queue Props With Queue Props software amazon awscdk services sqs Queue Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String deadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference = DEAD_LETTER_QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeployDeadLetterQueue_java_lang_Boolean_() <em>Deploy Dead Letter Queue java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployDeadLetterQueue_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DEPLOY_DEAD_LETTER_QUEUE_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeployDeadLetterQueue_java_lang_Boolean_() <em>Deploy Dead Letter Queue java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployDeadLetterQueue_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean deployDeadLetterQueue_java_lang_Boolean_ = DEPLOY_DEAD_LETTER_QUEUE_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getEnableQueuePurging_java_lang_Boolean_() <em>Enable Queue Purging java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableQueuePurging_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ENABLE_QUEUE_PURGING_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnableQueuePurging_java_lang_Boolean_() <em>Enable Queue Purging java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableQueuePurging_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean enableQueuePurging_java_lang_Boolean_ = ENABLE_QUEUE_PURGING_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference() <em>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference() <em>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference = EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExistingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference() <em>Existing Queue Obj With Queue software amazon awscdk services sqs Queue As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String EXISTING_QUEUE_OBJ_WITH_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExistingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference() <em>Existing Queue Obj With Queue software amazon awscdk services sqs Queue As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String existingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference = EXISTING_QUEUE_OBJ_WITH_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference() <em>Lambda Function Props With Function Props software amazon awscdk services lambda Function Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference() <em>Lambda Function Props With Function Props software amazon awscdk services lambda Function Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference = LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxReceiveCount_java_lang_Number_() <em>Max Receive Count java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxReceiveCount_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxReceiveCount_java_lang_Number_() <em>Max Receive Count java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxReceiveCount_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int maxReceiveCount_java_lang_Number_ = MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference() <em>Queue Props With Queue Props software amazon awscdk services sqs Queue Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference() <em>Queue Props With Queue Props software amazon awscdk services sqs Queue Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String queuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference = QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.awsconstructs.services.lambdasqs.LambdaToSqs";

	/**
	 * The cached value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected String generatedClassName = GENERATED_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected String varName = VAR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalCode() <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalCode() <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCode()
	 * @generated
	 * @ordered
	 */
	protected String additionalCode = ADDITIONAL_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LambdaToSqsBuilder_lambdasqsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.LAMBDA_TO_SQS_BUILDER_LAMBDASQS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference() {
		return deadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference(
			String newDeadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference) {
		String oldDeadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference = deadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference;
		deadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference = newDeadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__DEAD_LETTER_QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE,
					oldDeadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference,
					deadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDeployDeadLetterQueue_java_lang_Boolean_() {
		return deployDeadLetterQueue_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeployDeadLetterQueue_java_lang_Boolean_(Boolean newDeployDeadLetterQueue_java_lang_Boolean_) {
		Boolean oldDeployDeadLetterQueue_java_lang_Boolean_ = deployDeadLetterQueue_java_lang_Boolean_;
		deployDeadLetterQueue_java_lang_Boolean_ = newDeployDeadLetterQueue_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__DEPLOY_DEAD_LETTER_QUEUE_JAVA_LANG_BOOLEAN_,
					oldDeployDeadLetterQueue_java_lang_Boolean_, deployDeadLetterQueue_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getEnableQueuePurging_java_lang_Boolean_() {
		return enableQueuePurging_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableQueuePurging_java_lang_Boolean_(Boolean newEnableQueuePurging_java_lang_Boolean_) {
		Boolean oldEnableQueuePurging_java_lang_Boolean_ = enableQueuePurging_java_lang_Boolean_;
		enableQueuePurging_java_lang_Boolean_ = newEnableQueuePurging_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__ENABLE_QUEUE_PURGING_JAVA_LANG_BOOLEAN_,
					oldEnableQueuePurging_java_lang_Boolean_, enableQueuePurging_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference() {
		return existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(
			String newExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference) {
		String oldExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference = existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference;
		existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference = newExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE,
					oldExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference,
					existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExistingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference() {
		return existingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExistingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference(
			String newExistingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference) {
		String oldExistingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference = existingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference;
		existingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference = newExistingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__EXISTING_QUEUE_OBJ_WITH_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_AS_REFERENCE,
					oldExistingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference,
					existingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference() {
		return lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference(
			String newLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference) {
		String oldLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference = lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference;
		lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference = newLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE,
					oldLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference,
					lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxReceiveCount_java_lang_Number_() {
		return maxReceiveCount_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxReceiveCount_java_lang_Number_(int newMaxReceiveCount_java_lang_Number_) {
		int oldMaxReceiveCount_java_lang_Number_ = maxReceiveCount_java_lang_Number_;
		maxReceiveCount_java_lang_Number_ = newMaxReceiveCount_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_,
					oldMaxReceiveCount_java_lang_Number_, maxReceiveCount_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference() {
		return queuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference(
			String newQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference) {
		String oldQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference = queuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference;
		queuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference = newQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE,
					oldQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference,
					queuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeneratedClassName() {
		return generatedClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVarName() {
		return varName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVarName(String newVarName) {
		String oldVarName = varName;
		varName = newVarName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__VAR_NAME, oldVarName, varName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdditionalCode() {
		return additionalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalCode(String newAdditionalCode) {
		String oldAdditionalCode = additionalCode;
		additionalCode = newAdditionalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__ADDITIONAL_CODE, oldAdditionalCode,
					additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__DEAD_LETTER_QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE:
			return getDeadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference();
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__DEPLOY_DEAD_LETTER_QUEUE_JAVA_LANG_BOOLEAN_:
			return getDeployDeadLetterQueue_java_lang_Boolean_();
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__ENABLE_QUEUE_PURGING_JAVA_LANG_BOOLEAN_:
			return getEnableQueuePurging_java_lang_Boolean_();
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE:
			return getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference();
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__EXISTING_QUEUE_OBJ_WITH_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_AS_REFERENCE:
			return getExistingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference();
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE:
			return getLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference();
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_:
			return getMaxReceiveCount_java_lang_Number_();
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE:
			return getQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference();
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__ADDITIONAL_CODE:
			return getAdditionalCode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__DEAD_LETTER_QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE:
			setDeadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__DEPLOY_DEAD_LETTER_QUEUE_JAVA_LANG_BOOLEAN_:
			setDeployDeadLetterQueue_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__ENABLE_QUEUE_PURGING_JAVA_LANG_BOOLEAN_:
			setEnableQueuePurging_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE:
			setExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__EXISTING_QUEUE_OBJ_WITH_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_AS_REFERENCE:
			setExistingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE:
			setLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_:
			setMaxReceiveCount_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE:
			setQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__ADDITIONAL_CODE:
			setAdditionalCode((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__DEAD_LETTER_QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE:
			setDeadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference(
					DEAD_LETTER_QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__DEPLOY_DEAD_LETTER_QUEUE_JAVA_LANG_BOOLEAN_:
			setDeployDeadLetterQueue_java_lang_Boolean_(DEPLOY_DEAD_LETTER_QUEUE_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__ENABLE_QUEUE_PURGING_JAVA_LANG_BOOLEAN_:
			setEnableQueuePurging_java_lang_Boolean_(ENABLE_QUEUE_PURGING_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE:
			setExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(
					EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__EXISTING_QUEUE_OBJ_WITH_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_AS_REFERENCE:
			setExistingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference(
					EXISTING_QUEUE_OBJ_WITH_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE:
			setLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference(
					LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_:
			setMaxReceiveCount_java_lang_Number_(MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE:
			setQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference(
					QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__ADDITIONAL_CODE:
			setAdditionalCode(ADDITIONAL_CODE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__DEAD_LETTER_QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE:
			return DEAD_LETTER_QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE_EDEFAULT == null
					? deadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference != null
					: !DEAD_LETTER_QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE_EDEFAULT
							.equals(deadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference);
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__DEPLOY_DEAD_LETTER_QUEUE_JAVA_LANG_BOOLEAN_:
			return DEPLOY_DEAD_LETTER_QUEUE_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? deployDeadLetterQueue_java_lang_Boolean_ != null
					: !DEPLOY_DEAD_LETTER_QUEUE_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(deployDeadLetterQueue_java_lang_Boolean_);
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__ENABLE_QUEUE_PURGING_JAVA_LANG_BOOLEAN_:
			return ENABLE_QUEUE_PURGING_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? enableQueuePurging_java_lang_Boolean_ != null
					: !ENABLE_QUEUE_PURGING_JAVA_LANG_BOOLEAN__EDEFAULT.equals(enableQueuePurging_java_lang_Boolean_);
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE:
			return EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE_EDEFAULT == null
					? existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference != null
					: !EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE_EDEFAULT
							.equals(existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference);
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__EXISTING_QUEUE_OBJ_WITH_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_AS_REFERENCE:
			return EXISTING_QUEUE_OBJ_WITH_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_AS_REFERENCE_EDEFAULT == null
					? existingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference != null
					: !EXISTING_QUEUE_OBJ_WITH_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_AS_REFERENCE_EDEFAULT
							.equals(existingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference);
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE:
			return LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE_EDEFAULT == null
					? lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference != null
					: !LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE_EDEFAULT
							.equals(lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference);
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_:
			return maxReceiveCount_java_lang_Number_ != MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE:
			return QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE_EDEFAULT == null
					? queuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference != null
					: !QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE_EDEFAULT
							.equals(queuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference);
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__ADDITIONAL_CODE:
			return ADDITIONAL_CODE_EDEFAULT == null ? additionalCode != null
					: !ADDITIONAL_CODE_EDEFAULT.equals(additionalCode);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(
				" (deadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference: ");
		result.append(deadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference);
		result.append(", deployDeadLetterQueue_java_lang_Boolean_: ");
		result.append(deployDeadLetterQueue_java_lang_Boolean_);
		result.append(", enableQueuePurging_java_lang_Boolean_: ");
		result.append(enableQueuePurging_java_lang_Boolean_);
		result.append(", existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference: ");
		result.append(existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference);
		result.append(", existingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference: ");
		result.append(existingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference);
		result.append(
				", lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference: ");
		result.append(
				lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference);
		result.append(", maxReceiveCount_java_lang_Number_: ");
		result.append(maxReceiveCount_java_lang_Number_);
		result.append(", queuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference: ");
		result.append(queuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference);
		result.append(", generatedClassName: ");
		result.append(generatedClassName);
		result.append(", varName: ");
		result.append(varName);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", additionalCode: ");
		result.append(additionalCode);
		result.append(')');
		return result.toString();
	}

} //LambdaToSqsBuilder_lambdasqsImpl
