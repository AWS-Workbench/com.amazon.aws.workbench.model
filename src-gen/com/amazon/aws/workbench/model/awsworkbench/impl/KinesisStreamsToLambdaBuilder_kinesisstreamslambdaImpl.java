/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.KinesisStreamsToLambdaBuilder_kinesisstreamslambda;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kinesis Streams To Lambda Builder kinesisstreamslambda</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.KinesisStreamsToLambdaBuilder_kinesisstreamslambdaImpl#getEventSourceProps_java_lang_Object_ <em>Event Source Props java lang Object </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.KinesisStreamsToLambdaBuilder_kinesisstreamslambdaImpl#getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference <em>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.KinesisStreamsToLambdaBuilder_kinesisstreamslambdaImpl#getKinesisStreamProps_java_lang_Object_ <em>Kinesis Stream Props java lang Object </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.KinesisStreamsToLambdaBuilder_kinesisstreamslambdaImpl#getLambdaFunctionProps_java_lang_Object_ <em>Lambda Function Props java lang Object </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.KinesisStreamsToLambdaBuilder_kinesisstreamslambdaImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.KinesisStreamsToLambdaBuilder_kinesisstreamslambdaImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.KinesisStreamsToLambdaBuilder_kinesisstreamslambdaImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.KinesisStreamsToLambdaBuilder_kinesisstreamslambdaImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KinesisStreamsToLambdaBuilder_kinesisstreamslambdaImpl extends ServiceResourcesImpl
		implements KinesisStreamsToLambdaBuilder_kinesisstreamslambda {
	/**
	 * The default value of the '{@link #getEventSourceProps_java_lang_Object_() <em>Event Source Props java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventSourceProps_java_lang_Object_()
	 * @generated
	 * @ordered
	 */
	protected static final Object EVENT_SOURCE_PROPS_JAVA_LANG_OBJECT__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventSourceProps_java_lang_Object_() <em>Event Source Props java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventSourceProps_java_lang_Object_()
	 * @generated
	 * @ordered
	 */
	protected Object eventSourceProps_java_lang_Object_ = EVENT_SOURCE_PROPS_JAVA_LANG_OBJECT__EDEFAULT;

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
	 * The default value of the '{@link #getKinesisStreamProps_java_lang_Object_() <em>Kinesis Stream Props java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKinesisStreamProps_java_lang_Object_()
	 * @generated
	 * @ordered
	 */
	protected static final Object KINESIS_STREAM_PROPS_JAVA_LANG_OBJECT__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKinesisStreamProps_java_lang_Object_() <em>Kinesis Stream Props java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKinesisStreamProps_java_lang_Object_()
	 * @generated
	 * @ordered
	 */
	protected Object kinesisStreamProps_java_lang_Object_ = KINESIS_STREAM_PROPS_JAVA_LANG_OBJECT__EDEFAULT;

	/**
	 * The default value of the '{@link #getLambdaFunctionProps_java_lang_Object_() <em>Lambda Function Props java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLambdaFunctionProps_java_lang_Object_()
	 * @generated
	 * @ordered
	 */
	protected static final Object LAMBDA_FUNCTION_PROPS_JAVA_LANG_OBJECT__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLambdaFunctionProps_java_lang_Object_() <em>Lambda Function Props java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLambdaFunctionProps_java_lang_Object_()
	 * @generated
	 * @ordered
	 */
	protected Object lambdaFunctionProps_java_lang_Object_ = LAMBDA_FUNCTION_PROPS_JAVA_LANG_OBJECT__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awsconstructs.services.kinesisstreamslambda.KinesisStreamsToLambda";

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
	protected KinesisStreamsToLambdaBuilder_kinesisstreamslambdaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getEventSourceProps_java_lang_Object_() {
		return eventSourceProps_java_lang_Object_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventSourceProps_java_lang_Object_(Object newEventSourceProps_java_lang_Object_) {
		Object oldEventSourceProps_java_lang_Object_ = eventSourceProps_java_lang_Object_;
		eventSourceProps_java_lang_Object_ = newEventSourceProps_java_lang_Object_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__EVENT_SOURCE_PROPS_JAVA_LANG_OBJECT_,
					oldEventSourceProps_java_lang_Object_, eventSourceProps_java_lang_Object_));
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
					AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE,
					oldExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference,
					existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getKinesisStreamProps_java_lang_Object_() {
		return kinesisStreamProps_java_lang_Object_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKinesisStreamProps_java_lang_Object_(Object newKinesisStreamProps_java_lang_Object_) {
		Object oldKinesisStreamProps_java_lang_Object_ = kinesisStreamProps_java_lang_Object_;
		kinesisStreamProps_java_lang_Object_ = newKinesisStreamProps_java_lang_Object_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__KINESIS_STREAM_PROPS_JAVA_LANG_OBJECT_,
					oldKinesisStreamProps_java_lang_Object_, kinesisStreamProps_java_lang_Object_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getLambdaFunctionProps_java_lang_Object_() {
		return lambdaFunctionProps_java_lang_Object_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLambdaFunctionProps_java_lang_Object_(Object newLambdaFunctionProps_java_lang_Object_) {
		Object oldLambdaFunctionProps_java_lang_Object_ = lambdaFunctionProps_java_lang_Object_;
		lambdaFunctionProps_java_lang_Object_ = newLambdaFunctionProps_java_lang_Object_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__LAMBDA_FUNCTION_PROPS_JAVA_LANG_OBJECT_,
					oldLambdaFunctionProps_java_lang_Object_, lambdaFunctionProps_java_lang_Object_));
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
					AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__VAR_NAME, oldVarName,
					varName));
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
					AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__IDENTIFIER,
					oldIdentifier, identifier));
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
					AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__ADDITIONAL_CODE,
					oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__EVENT_SOURCE_PROPS_JAVA_LANG_OBJECT_:
			return getEventSourceProps_java_lang_Object_();
		case AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE:
			return getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference();
		case AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__KINESIS_STREAM_PROPS_JAVA_LANG_OBJECT_:
			return getKinesisStreamProps_java_lang_Object_();
		case AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__LAMBDA_FUNCTION_PROPS_JAVA_LANG_OBJECT_:
			return getLambdaFunctionProps_java_lang_Object_();
		case AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__EVENT_SOURCE_PROPS_JAVA_LANG_OBJECT_:
			setEventSourceProps_java_lang_Object_(newValue);
			return;
		case AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE:
			setExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__KINESIS_STREAM_PROPS_JAVA_LANG_OBJECT_:
			setKinesisStreamProps_java_lang_Object_(newValue);
			return;
		case AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__LAMBDA_FUNCTION_PROPS_JAVA_LANG_OBJECT_:
			setLambdaFunctionProps_java_lang_Object_(newValue);
			return;
		case AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__EVENT_SOURCE_PROPS_JAVA_LANG_OBJECT_:
			setEventSourceProps_java_lang_Object_(EVENT_SOURCE_PROPS_JAVA_LANG_OBJECT__EDEFAULT);
			return;
		case AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE:
			setExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(
					EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__KINESIS_STREAM_PROPS_JAVA_LANG_OBJECT_:
			setKinesisStreamProps_java_lang_Object_(KINESIS_STREAM_PROPS_JAVA_LANG_OBJECT__EDEFAULT);
			return;
		case AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__LAMBDA_FUNCTION_PROPS_JAVA_LANG_OBJECT_:
			setLambdaFunctionProps_java_lang_Object_(LAMBDA_FUNCTION_PROPS_JAVA_LANG_OBJECT__EDEFAULT);
			return;
		case AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__EVENT_SOURCE_PROPS_JAVA_LANG_OBJECT_:
			return EVENT_SOURCE_PROPS_JAVA_LANG_OBJECT__EDEFAULT == null ? eventSourceProps_java_lang_Object_ != null
					: !EVENT_SOURCE_PROPS_JAVA_LANG_OBJECT__EDEFAULT.equals(eventSourceProps_java_lang_Object_);
		case AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE:
			return EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE_EDEFAULT == null
					? existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference != null
					: !EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE_EDEFAULT
							.equals(existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference);
		case AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__KINESIS_STREAM_PROPS_JAVA_LANG_OBJECT_:
			return KINESIS_STREAM_PROPS_JAVA_LANG_OBJECT__EDEFAULT == null
					? kinesisStreamProps_java_lang_Object_ != null
					: !KINESIS_STREAM_PROPS_JAVA_LANG_OBJECT__EDEFAULT.equals(kinesisStreamProps_java_lang_Object_);
		case AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__LAMBDA_FUNCTION_PROPS_JAVA_LANG_OBJECT_:
			return LAMBDA_FUNCTION_PROPS_JAVA_LANG_OBJECT__EDEFAULT == null
					? lambdaFunctionProps_java_lang_Object_ != null
					: !LAMBDA_FUNCTION_PROPS_JAVA_LANG_OBJECT__EDEFAULT.equals(lambdaFunctionProps_java_lang_Object_);
		case AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__ADDITIONAL_CODE:
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
		result.append(" (eventSourceProps_java_lang_Object_: ");
		result.append(eventSourceProps_java_lang_Object_);
		result.append(", existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference: ");
		result.append(existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference);
		result.append(", kinesisStreamProps_java_lang_Object_: ");
		result.append(kinesisStreamProps_java_lang_Object_);
		result.append(", lambdaFunctionProps_java_lang_Object_: ");
		result.append(lambdaFunctionProps_java_lang_Object_);
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

} //KinesisStreamsToLambdaBuilder_kinesisstreamslambdaImpl
