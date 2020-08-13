/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.S3ToStepFunctionBuilder_s3stepfunction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>S3 To Step Function Builder s3stepfunction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.S3ToStepFunctionBuilder_s3stepfunctionImpl#getStateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference <em>State Machine Props With State Machine Props software amazon awscdk services stepfunctions State Machine Props As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.S3ToStepFunctionBuilder_s3stepfunctionImpl#getBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference <em>Bucket Props With Bucket Props software amazon awscdk services s3 Bucket Props As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.S3ToStepFunctionBuilder_s3stepfunctionImpl#getDeployCloudTrail_java_lang_Boolean_ <em>Deploy Cloud Trail java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.S3ToStepFunctionBuilder_s3stepfunctionImpl#getEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference <em>Event Rule Props With Rule Props software amazon awscdk services events Rule Props As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.S3ToStepFunctionBuilder_s3stepfunctionImpl#getExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference <em>Existing Bucket Obj With Bucket software amazon awscdk services s3 Bucket As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.S3ToStepFunctionBuilder_s3stepfunctionImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.S3ToStepFunctionBuilder_s3stepfunctionImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.S3ToStepFunctionBuilder_s3stepfunctionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.S3ToStepFunctionBuilder_s3stepfunctionImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class S3ToStepFunctionBuilder_s3stepfunctionImpl extends ServiceResourcesImpl
		implements S3ToStepFunctionBuilder_s3stepfunction {
	/**
	 * The default value of the '{@link #getStateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference() <em>State Machine Props With State Machine Props software amazon awscdk services stepfunctions State Machine Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_MACHINE_PROPS_WITH_STATE_MACHINE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_STATE_MACHINE_PROPS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference() <em>State Machine Props With State Machine Props software amazon awscdk services stepfunctions State Machine Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String stateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference = STATE_MACHINE_PROPS_WITH_STATE_MACHINE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_STATE_MACHINE_PROPS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference() <em>Bucket Props With Bucket Props software amazon awscdk services s3 Bucket Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference() <em>Bucket Props With Bucket Props software amazon awscdk services s3 Bucket Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference = BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeployCloudTrail_java_lang_Boolean_() <em>Deploy Cloud Trail java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployCloudTrail_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DEPLOY_CLOUD_TRAIL_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeployCloudTrail_java_lang_Boolean_() <em>Deploy Cloud Trail java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployCloudTrail_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean deployCloudTrail_java_lang_Boolean_ = DEPLOY_CLOUD_TRAIL_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference() <em>Event Rule Props With Rule Props software amazon awscdk services events Rule Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_RULE_PROPS_WITH_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_RULE_PROPS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference() <em>Event Rule Props With Rule Props software amazon awscdk services events Rule Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String eventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference = EVENT_RULE_PROPS_WITH_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_RULE_PROPS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference() <em>Existing Bucket Obj With Bucket software amazon awscdk services s3 Bucket As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference() <em>Existing Bucket Obj With Bucket software amazon awscdk services s3 Bucket As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference = EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.awsconstructs.services.s3stepfunction.S3ToStepFunction";

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
	protected S3ToStepFunctionBuilder_s3stepfunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference() {
		return stateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference(
			String newStateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference) {
		String oldStateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference = stateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference;
		stateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference = newStateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__STATE_MACHINE_PROPS_WITH_STATE_MACHINE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_STATE_MACHINE_PROPS_AS_REFERENCE,
					oldStateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference,
					stateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference() {
		return bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference(
			String newBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference) {
		String oldBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference = bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference;
		bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference = newBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE,
					oldBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference,
					bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDeployCloudTrail_java_lang_Boolean_() {
		return deployCloudTrail_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeployCloudTrail_java_lang_Boolean_(Boolean newDeployCloudTrail_java_lang_Boolean_) {
		Boolean oldDeployCloudTrail_java_lang_Boolean_ = deployCloudTrail_java_lang_Boolean_;
		deployCloudTrail_java_lang_Boolean_ = newDeployCloudTrail_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__DEPLOY_CLOUD_TRAIL_JAVA_LANG_BOOLEAN_,
					oldDeployCloudTrail_java_lang_Boolean_, deployCloudTrail_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference() {
		return eventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference(
			String newEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference) {
		String oldEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference = eventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference;
		eventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference = newEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__EVENT_RULE_PROPS_WITH_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_RULE_PROPS_AS_REFERENCE,
					oldEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference,
					eventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference() {
		return existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference(
			String newExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference) {
		String oldExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference = existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference;
		existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference = newExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE,
					oldExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference,
					existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference));
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
					AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__IDENTIFIER, oldIdentifier,
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
					AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__STATE_MACHINE_PROPS_WITH_STATE_MACHINE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_STATE_MACHINE_PROPS_AS_REFERENCE:
			return getStateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference();
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE:
			return getBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference();
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__DEPLOY_CLOUD_TRAIL_JAVA_LANG_BOOLEAN_:
			return getDeployCloudTrail_java_lang_Boolean_();
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__EVENT_RULE_PROPS_WITH_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_RULE_PROPS_AS_REFERENCE:
			return getEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference();
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE:
			return getExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference();
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__STATE_MACHINE_PROPS_WITH_STATE_MACHINE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_STATE_MACHINE_PROPS_AS_REFERENCE:
			setStateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE:
			setBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__DEPLOY_CLOUD_TRAIL_JAVA_LANG_BOOLEAN_:
			setDeployCloudTrail_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__EVENT_RULE_PROPS_WITH_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_RULE_PROPS_AS_REFERENCE:
			setEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE:
			setExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__STATE_MACHINE_PROPS_WITH_STATE_MACHINE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_STATE_MACHINE_PROPS_AS_REFERENCE:
			setStateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference(
					STATE_MACHINE_PROPS_WITH_STATE_MACHINE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_STATE_MACHINE_PROPS_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE:
			setBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference(
					BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__DEPLOY_CLOUD_TRAIL_JAVA_LANG_BOOLEAN_:
			setDeployCloudTrail_java_lang_Boolean_(DEPLOY_CLOUD_TRAIL_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__EVENT_RULE_PROPS_WITH_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_RULE_PROPS_AS_REFERENCE:
			setEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference(
					EVENT_RULE_PROPS_WITH_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_RULE_PROPS_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE:
			setExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference(
					EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__STATE_MACHINE_PROPS_WITH_STATE_MACHINE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_STATE_MACHINE_PROPS_AS_REFERENCE:
			return STATE_MACHINE_PROPS_WITH_STATE_MACHINE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_STATE_MACHINE_PROPS_AS_REFERENCE_EDEFAULT == null
					? stateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference != null
					: !STATE_MACHINE_PROPS_WITH_STATE_MACHINE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_STATE_MACHINE_PROPS_AS_REFERENCE_EDEFAULT
							.equals(stateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference);
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE:
			return BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE_EDEFAULT == null
					? bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference != null
					: !BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE_EDEFAULT
							.equals(bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference);
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__DEPLOY_CLOUD_TRAIL_JAVA_LANG_BOOLEAN_:
			return DEPLOY_CLOUD_TRAIL_JAVA_LANG_BOOLEAN__EDEFAULT == null ? deployCloudTrail_java_lang_Boolean_ != null
					: !DEPLOY_CLOUD_TRAIL_JAVA_LANG_BOOLEAN__EDEFAULT.equals(deployCloudTrail_java_lang_Boolean_);
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__EVENT_RULE_PROPS_WITH_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_RULE_PROPS_AS_REFERENCE:
			return EVENT_RULE_PROPS_WITH_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_RULE_PROPS_AS_REFERENCE_EDEFAULT == null
					? eventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference != null
					: !EVENT_RULE_PROPS_WITH_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_RULE_PROPS_AS_REFERENCE_EDEFAULT
							.equals(eventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference);
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE:
			return EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE_EDEFAULT == null
					? existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference != null
					: !EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE_EDEFAULT
							.equals(existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference);
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__ADDITIONAL_CODE:
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
				" (stateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference: ");
		result.append(
				stateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference);
		result.append(", bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference: ");
		result.append(bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference);
		result.append(", deployCloudTrail_java_lang_Boolean_: ");
		result.append(deployCloudTrail_java_lang_Boolean_);
		result.append(", eventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference: ");
		result.append(eventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference);
		result.append(", existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference: ");
		result.append(existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference);
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

} //S3ToStepFunctionBuilder_s3stepfunctionImpl
