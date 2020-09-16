/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToSqsBuilder_apigatewaysqs;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Api Gateway To Sqs Builder apigatewaysqs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApiGatewayToSqsBuilder_apigatewaysqsImpl#getAllowCreateOperation_java_lang_Boolean_ <em>Allow Create Operation java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApiGatewayToSqsBuilder_apigatewaysqsImpl#getAllowDeleteOperation_java_lang_Boolean_ <em>Allow Delete Operation java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApiGatewayToSqsBuilder_apigatewaysqsImpl#getAllowReadOperation_java_lang_Boolean_ <em>Allow Read Operation java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApiGatewayToSqsBuilder_apigatewaysqsImpl#getApiGatewayProps_java_lang_Object_ <em>Api Gateway Props java lang Object </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApiGatewayToSqsBuilder_apigatewaysqsImpl#getCreateRequestTemplate_java_lang_String_ <em>Create Request Template java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApiGatewayToSqsBuilder_apigatewaysqsImpl#getDeployDeadLetterQueue_java_lang_Boolean_ <em>Deploy Dead Letter Queue java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApiGatewayToSqsBuilder_apigatewaysqsImpl#getMaxReceiveCount_java_lang_Number_ <em>Max Receive Count java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApiGatewayToSqsBuilder_apigatewaysqsImpl#getQueueProps_java_lang_Object_ <em>Queue Props java lang Object </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApiGatewayToSqsBuilder_apigatewaysqsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApiGatewayToSqsBuilder_apigatewaysqsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApiGatewayToSqsBuilder_apigatewaysqsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApiGatewayToSqsBuilder_apigatewaysqsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApiGatewayToSqsBuilder_apigatewaysqsImpl extends ServiceResourcesImpl
		implements ApiGatewayToSqsBuilder_apigatewaysqs {
	/**
	 * The default value of the '{@link #getAllowCreateOperation_java_lang_Boolean_() <em>Allow Create Operation java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowCreateOperation_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_CREATE_OPERATION_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowCreateOperation_java_lang_Boolean_() <em>Allow Create Operation java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowCreateOperation_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowCreateOperation_java_lang_Boolean_ = ALLOW_CREATE_OPERATION_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowDeleteOperation_java_lang_Boolean_() <em>Allow Delete Operation java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowDeleteOperation_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_DELETE_OPERATION_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowDeleteOperation_java_lang_Boolean_() <em>Allow Delete Operation java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowDeleteOperation_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowDeleteOperation_java_lang_Boolean_ = ALLOW_DELETE_OPERATION_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowReadOperation_java_lang_Boolean_() <em>Allow Read Operation java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowReadOperation_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_READ_OPERATION_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowReadOperation_java_lang_Boolean_() <em>Allow Read Operation java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowReadOperation_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowReadOperation_java_lang_Boolean_ = ALLOW_READ_OPERATION_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getApiGatewayProps_java_lang_Object_() <em>Api Gateway Props java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiGatewayProps_java_lang_Object_()
	 * @generated
	 * @ordered
	 */
	protected static final Object API_GATEWAY_PROPS_JAVA_LANG_OBJECT__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApiGatewayProps_java_lang_Object_() <em>Api Gateway Props java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiGatewayProps_java_lang_Object_()
	 * @generated
	 * @ordered
	 */
	protected Object apiGatewayProps_java_lang_Object_ = API_GATEWAY_PROPS_JAVA_LANG_OBJECT__EDEFAULT;

	/**
	 * The default value of the '{@link #getCreateRequestTemplate_java_lang_String_() <em>Create Request Template java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateRequestTemplate_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATE_REQUEST_TEMPLATE_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreateRequestTemplate_java_lang_String_() <em>Create Request Template java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateRequestTemplate_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String createRequestTemplate_java_lang_String_ = CREATE_REQUEST_TEMPLATE_JAVA_LANG_STRING__EDEFAULT;

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
	 * The default value of the '{@link #getQueueProps_java_lang_Object_() <em>Queue Props java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueProps_java_lang_Object_()
	 * @generated
	 * @ordered
	 */
	protected static final Object QUEUE_PROPS_JAVA_LANG_OBJECT__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueueProps_java_lang_Object_() <em>Queue Props java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueProps_java_lang_Object_()
	 * @generated
	 * @ordered
	 */
	protected Object queueProps_java_lang_Object_ = QUEUE_PROPS_JAVA_LANG_OBJECT__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awsconstructs.services.apigatewaysqs.ApiGatewayToSqs";

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
	protected ApiGatewayToSqsBuilder_apigatewaysqsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAllowCreateOperation_java_lang_Boolean_() {
		return allowCreateOperation_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowCreateOperation_java_lang_Boolean_(Boolean newAllowCreateOperation_java_lang_Boolean_) {
		Boolean oldAllowCreateOperation_java_lang_Boolean_ = allowCreateOperation_java_lang_Boolean_;
		allowCreateOperation_java_lang_Boolean_ = newAllowCreateOperation_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__ALLOW_CREATE_OPERATION_JAVA_LANG_BOOLEAN_,
					oldAllowCreateOperation_java_lang_Boolean_, allowCreateOperation_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAllowDeleteOperation_java_lang_Boolean_() {
		return allowDeleteOperation_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowDeleteOperation_java_lang_Boolean_(Boolean newAllowDeleteOperation_java_lang_Boolean_) {
		Boolean oldAllowDeleteOperation_java_lang_Boolean_ = allowDeleteOperation_java_lang_Boolean_;
		allowDeleteOperation_java_lang_Boolean_ = newAllowDeleteOperation_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__ALLOW_DELETE_OPERATION_JAVA_LANG_BOOLEAN_,
					oldAllowDeleteOperation_java_lang_Boolean_, allowDeleteOperation_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAllowReadOperation_java_lang_Boolean_() {
		return allowReadOperation_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowReadOperation_java_lang_Boolean_(Boolean newAllowReadOperation_java_lang_Boolean_) {
		Boolean oldAllowReadOperation_java_lang_Boolean_ = allowReadOperation_java_lang_Boolean_;
		allowReadOperation_java_lang_Boolean_ = newAllowReadOperation_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__ALLOW_READ_OPERATION_JAVA_LANG_BOOLEAN_,
					oldAllowReadOperation_java_lang_Boolean_, allowReadOperation_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getApiGatewayProps_java_lang_Object_() {
		return apiGatewayProps_java_lang_Object_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiGatewayProps_java_lang_Object_(Object newApiGatewayProps_java_lang_Object_) {
		Object oldApiGatewayProps_java_lang_Object_ = apiGatewayProps_java_lang_Object_;
		apiGatewayProps_java_lang_Object_ = newApiGatewayProps_java_lang_Object_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__API_GATEWAY_PROPS_JAVA_LANG_OBJECT_,
					oldApiGatewayProps_java_lang_Object_, apiGatewayProps_java_lang_Object_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateRequestTemplate_java_lang_String_() {
		return createRequestTemplate_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreateRequestTemplate_java_lang_String_(String newCreateRequestTemplate_java_lang_String_) {
		String oldCreateRequestTemplate_java_lang_String_ = createRequestTemplate_java_lang_String_;
		createRequestTemplate_java_lang_String_ = newCreateRequestTemplate_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__CREATE_REQUEST_TEMPLATE_JAVA_LANG_STRING_,
					oldCreateRequestTemplate_java_lang_String_, createRequestTemplate_java_lang_String_));
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
					AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__DEPLOY_DEAD_LETTER_QUEUE_JAVA_LANG_BOOLEAN_,
					oldDeployDeadLetterQueue_java_lang_Boolean_, deployDeadLetterQueue_java_lang_Boolean_));
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
					AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_,
					oldMaxReceiveCount_java_lang_Number_, maxReceiveCount_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getQueueProps_java_lang_Object_() {
		return queueProps_java_lang_Object_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueueProps_java_lang_Object_(Object newQueueProps_java_lang_Object_) {
		Object oldQueueProps_java_lang_Object_ = queueProps_java_lang_Object_;
		queueProps_java_lang_Object_ = newQueueProps_java_lang_Object_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__QUEUE_PROPS_JAVA_LANG_OBJECT_,
					oldQueueProps_java_lang_Object_, queueProps_java_lang_Object_));
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
					AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__IDENTIFIER, oldIdentifier,
					identifier));
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
					AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__ALLOW_CREATE_OPERATION_JAVA_LANG_BOOLEAN_:
			return getAllowCreateOperation_java_lang_Boolean_();
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__ALLOW_DELETE_OPERATION_JAVA_LANG_BOOLEAN_:
			return getAllowDeleteOperation_java_lang_Boolean_();
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__ALLOW_READ_OPERATION_JAVA_LANG_BOOLEAN_:
			return getAllowReadOperation_java_lang_Boolean_();
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__API_GATEWAY_PROPS_JAVA_LANG_OBJECT_:
			return getApiGatewayProps_java_lang_Object_();
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__CREATE_REQUEST_TEMPLATE_JAVA_LANG_STRING_:
			return getCreateRequestTemplate_java_lang_String_();
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__DEPLOY_DEAD_LETTER_QUEUE_JAVA_LANG_BOOLEAN_:
			return getDeployDeadLetterQueue_java_lang_Boolean_();
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_:
			return getMaxReceiveCount_java_lang_Number_();
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__QUEUE_PROPS_JAVA_LANG_OBJECT_:
			return getQueueProps_java_lang_Object_();
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__ALLOW_CREATE_OPERATION_JAVA_LANG_BOOLEAN_:
			setAllowCreateOperation_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__ALLOW_DELETE_OPERATION_JAVA_LANG_BOOLEAN_:
			setAllowDeleteOperation_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__ALLOW_READ_OPERATION_JAVA_LANG_BOOLEAN_:
			setAllowReadOperation_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__API_GATEWAY_PROPS_JAVA_LANG_OBJECT_:
			setApiGatewayProps_java_lang_Object_(newValue);
			return;
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__CREATE_REQUEST_TEMPLATE_JAVA_LANG_STRING_:
			setCreateRequestTemplate_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__DEPLOY_DEAD_LETTER_QUEUE_JAVA_LANG_BOOLEAN_:
			setDeployDeadLetterQueue_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_:
			setMaxReceiveCount_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__QUEUE_PROPS_JAVA_LANG_OBJECT_:
			setQueueProps_java_lang_Object_(newValue);
			return;
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__ALLOW_CREATE_OPERATION_JAVA_LANG_BOOLEAN_:
			setAllowCreateOperation_java_lang_Boolean_(ALLOW_CREATE_OPERATION_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__ALLOW_DELETE_OPERATION_JAVA_LANG_BOOLEAN_:
			setAllowDeleteOperation_java_lang_Boolean_(ALLOW_DELETE_OPERATION_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__ALLOW_READ_OPERATION_JAVA_LANG_BOOLEAN_:
			setAllowReadOperation_java_lang_Boolean_(ALLOW_READ_OPERATION_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__API_GATEWAY_PROPS_JAVA_LANG_OBJECT_:
			setApiGatewayProps_java_lang_Object_(API_GATEWAY_PROPS_JAVA_LANG_OBJECT__EDEFAULT);
			return;
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__CREATE_REQUEST_TEMPLATE_JAVA_LANG_STRING_:
			setCreateRequestTemplate_java_lang_String_(CREATE_REQUEST_TEMPLATE_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__DEPLOY_DEAD_LETTER_QUEUE_JAVA_LANG_BOOLEAN_:
			setDeployDeadLetterQueue_java_lang_Boolean_(DEPLOY_DEAD_LETTER_QUEUE_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_:
			setMaxReceiveCount_java_lang_Number_(MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__QUEUE_PROPS_JAVA_LANG_OBJECT_:
			setQueueProps_java_lang_Object_(QUEUE_PROPS_JAVA_LANG_OBJECT__EDEFAULT);
			return;
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__ALLOW_CREATE_OPERATION_JAVA_LANG_BOOLEAN_:
			return ALLOW_CREATE_OPERATION_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? allowCreateOperation_java_lang_Boolean_ != null
					: !ALLOW_CREATE_OPERATION_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(allowCreateOperation_java_lang_Boolean_);
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__ALLOW_DELETE_OPERATION_JAVA_LANG_BOOLEAN_:
			return ALLOW_DELETE_OPERATION_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? allowDeleteOperation_java_lang_Boolean_ != null
					: !ALLOW_DELETE_OPERATION_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(allowDeleteOperation_java_lang_Boolean_);
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__ALLOW_READ_OPERATION_JAVA_LANG_BOOLEAN_:
			return ALLOW_READ_OPERATION_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? allowReadOperation_java_lang_Boolean_ != null
					: !ALLOW_READ_OPERATION_JAVA_LANG_BOOLEAN__EDEFAULT.equals(allowReadOperation_java_lang_Boolean_);
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__API_GATEWAY_PROPS_JAVA_LANG_OBJECT_:
			return API_GATEWAY_PROPS_JAVA_LANG_OBJECT__EDEFAULT == null ? apiGatewayProps_java_lang_Object_ != null
					: !API_GATEWAY_PROPS_JAVA_LANG_OBJECT__EDEFAULT.equals(apiGatewayProps_java_lang_Object_);
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__CREATE_REQUEST_TEMPLATE_JAVA_LANG_STRING_:
			return CREATE_REQUEST_TEMPLATE_JAVA_LANG_STRING__EDEFAULT == null
					? createRequestTemplate_java_lang_String_ != null
					: !CREATE_REQUEST_TEMPLATE_JAVA_LANG_STRING__EDEFAULT
							.equals(createRequestTemplate_java_lang_String_);
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__DEPLOY_DEAD_LETTER_QUEUE_JAVA_LANG_BOOLEAN_:
			return DEPLOY_DEAD_LETTER_QUEUE_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? deployDeadLetterQueue_java_lang_Boolean_ != null
					: !DEPLOY_DEAD_LETTER_QUEUE_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(deployDeadLetterQueue_java_lang_Boolean_);
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_:
			return maxReceiveCount_java_lang_Number_ != MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__QUEUE_PROPS_JAVA_LANG_OBJECT_:
			return QUEUE_PROPS_JAVA_LANG_OBJECT__EDEFAULT == null ? queueProps_java_lang_Object_ != null
					: !QUEUE_PROPS_JAVA_LANG_OBJECT__EDEFAULT.equals(queueProps_java_lang_Object_);
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__ADDITIONAL_CODE:
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
		result.append(" (allowCreateOperation_java_lang_Boolean_: ");
		result.append(allowCreateOperation_java_lang_Boolean_);
		result.append(", allowDeleteOperation_java_lang_Boolean_: ");
		result.append(allowDeleteOperation_java_lang_Boolean_);
		result.append(", allowReadOperation_java_lang_Boolean_: ");
		result.append(allowReadOperation_java_lang_Boolean_);
		result.append(", apiGatewayProps_java_lang_Object_: ");
		result.append(apiGatewayProps_java_lang_Object_);
		result.append(", createRequestTemplate_java_lang_String_: ");
		result.append(createRequestTemplate_java_lang_String_);
		result.append(", deployDeadLetterQueue_java_lang_Boolean_: ");
		result.append(deployDeadLetterQueue_java_lang_Boolean_);
		result.append(", maxReceiveCount_java_lang_Number_: ");
		result.append(maxReceiveCount_java_lang_Number_);
		result.append(", queueProps_java_lang_Object_: ");
		result.append(queueProps_java_lang_Object_);
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

} //ApiGatewayToSqsBuilder_apigatewaysqsImpl
