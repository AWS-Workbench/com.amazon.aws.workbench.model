/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.StateMachinePropsBuilder_stepfunctions;
import com.amazon.aws.workbench.model.awsworkbench.StateMachineType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine Props Builder stepfunctions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.StateMachinePropsBuilder_stepfunctionsImpl#getDefinitionWithIChainable_software_amazon_awscdk_services_stepfunctions_IChainable_AsReference <em>Definition With IChainable software amazon awscdk services stepfunctions IChainable As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.StateMachinePropsBuilder_stepfunctionsImpl#getLogsWithLogOptions_software_amazon_awscdk_services_stepfunctions_LogOptions_AsReference <em>Logs With Log Options software amazon awscdk services stepfunctions Log Options As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.StateMachinePropsBuilder_stepfunctionsImpl#getRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Role With IRole software amazon awscdk services iam IRole As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.StateMachinePropsBuilder_stepfunctionsImpl#getStateMachineName_java_lang_String_ <em>State Machine Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.StateMachinePropsBuilder_stepfunctionsImpl#getStateMachineType_software_amazon_awscdk_services_stepfunctions_StateMachineType_ <em>State Machine Type software amazon awscdk services stepfunctions State Machine Type </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.StateMachinePropsBuilder_stepfunctionsImpl#getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Timeout With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.StateMachinePropsBuilder_stepfunctionsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.StateMachinePropsBuilder_stepfunctionsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.StateMachinePropsBuilder_stepfunctionsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.StateMachinePropsBuilder_stepfunctionsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachinePropsBuilder_stepfunctionsImpl extends MinimalEObjectImpl.Container
		implements StateMachinePropsBuilder_stepfunctions {
	/**
	 * The default value of the '{@link #getDefinitionWithIChainable_software_amazon_awscdk_services_stepfunctions_IChainable_AsReference() <em>Definition With IChainable software amazon awscdk services stepfunctions IChainable As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionWithIChainable_software_amazon_awscdk_services_stepfunctions_IChainable_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFINITION_WITH_ICHAINABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_ICHAINABLE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefinitionWithIChainable_software_amazon_awscdk_services_stepfunctions_IChainable_AsReference() <em>Definition With IChainable software amazon awscdk services stepfunctions IChainable As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionWithIChainable_software_amazon_awscdk_services_stepfunctions_IChainable_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String definitionWithIChainable_software_amazon_awscdk_services_stepfunctions_IChainable_AsReference = DEFINITION_WITH_ICHAINABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_ICHAINABLE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogsWithLogOptions_software_amazon_awscdk_services_stepfunctions_LogOptions_AsReference() <em>Logs With Log Options software amazon awscdk services stepfunctions Log Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogsWithLogOptions_software_amazon_awscdk_services_stepfunctions_LogOptions_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGS_WITH_LOG_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_LOG_OPTIONS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogsWithLogOptions_software_amazon_awscdk_services_stepfunctions_LogOptions_AsReference() <em>Logs With Log Options software amazon awscdk services stepfunctions Log Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogsWithLogOptions_software_amazon_awscdk_services_stepfunctions_LogOptions_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String logsWithLogOptions_software_amazon_awscdk_services_stepfunctions_LogOptions_AsReference = LOGS_WITH_LOG_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_LOG_OPTIONS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() <em>Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() <em>Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String roleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference = ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStateMachineName_java_lang_String_() <em>State Machine Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachineName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_MACHINE_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStateMachineName_java_lang_String_() <em>State Machine Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachineName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String stateMachineName_java_lang_String_ = STATE_MACHINE_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getStateMachineType_software_amazon_awscdk_services_stepfunctions_StateMachineType_() <em>State Machine Type software amazon awscdk services stepfunctions State Machine Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachineType_software_amazon_awscdk_services_stepfunctions_StateMachineType_()
	 * @generated
	 * @ordered
	 */
	protected static final StateMachineType STATE_MACHINE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_STATE_MACHINE_TYPE__EDEFAULT = StateMachineType.EXPRESS;

	/**
	 * The cached value of the '{@link #getStateMachineType_software_amazon_awscdk_services_stepfunctions_StateMachineType_() <em>State Machine Type software amazon awscdk services stepfunctions State Machine Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachineType_software_amazon_awscdk_services_stepfunctions_StateMachineType_()
	 * @generated
	 * @ordered
	 */
	protected StateMachineType stateMachineType_software_amazon_awscdk_services_stepfunctions_StateMachineType_ = STATE_MACHINE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_STATE_MACHINE_TYPE__EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Timeout With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Timeout With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference = TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.stepfunctions.StateMachineProps";

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
	protected StateMachinePropsBuilder_stepfunctionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefinitionWithIChainable_software_amazon_awscdk_services_stepfunctions_IChainable_AsReference() {
		return definitionWithIChainable_software_amazon_awscdk_services_stepfunctions_IChainable_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinitionWithIChainable_software_amazon_awscdk_services_stepfunctions_IChainable_AsReference(
			String newDefinitionWithIChainable_software_amazon_awscdk_services_stepfunctions_IChainable_AsReference) {
		String oldDefinitionWithIChainable_software_amazon_awscdk_services_stepfunctions_IChainable_AsReference = definitionWithIChainable_software_amazon_awscdk_services_stepfunctions_IChainable_AsReference;
		definitionWithIChainable_software_amazon_awscdk_services_stepfunctions_IChainable_AsReference = newDefinitionWithIChainable_software_amazon_awscdk_services_stepfunctions_IChainable_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__DEFINITION_WITH_ICHAINABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_ICHAINABLE_AS_REFERENCE,
					oldDefinitionWithIChainable_software_amazon_awscdk_services_stepfunctions_IChainable_AsReference,
					definitionWithIChainable_software_amazon_awscdk_services_stepfunctions_IChainable_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogsWithLogOptions_software_amazon_awscdk_services_stepfunctions_LogOptions_AsReference() {
		return logsWithLogOptions_software_amazon_awscdk_services_stepfunctions_LogOptions_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogsWithLogOptions_software_amazon_awscdk_services_stepfunctions_LogOptions_AsReference(
			String newLogsWithLogOptions_software_amazon_awscdk_services_stepfunctions_LogOptions_AsReference) {
		String oldLogsWithLogOptions_software_amazon_awscdk_services_stepfunctions_LogOptions_AsReference = logsWithLogOptions_software_amazon_awscdk_services_stepfunctions_LogOptions_AsReference;
		logsWithLogOptions_software_amazon_awscdk_services_stepfunctions_LogOptions_AsReference = newLogsWithLogOptions_software_amazon_awscdk_services_stepfunctions_LogOptions_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__LOGS_WITH_LOG_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_LOG_OPTIONS_AS_REFERENCE,
					oldLogsWithLogOptions_software_amazon_awscdk_services_stepfunctions_LogOptions_AsReference,
					logsWithLogOptions_software_amazon_awscdk_services_stepfunctions_LogOptions_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() {
		return roleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(
			String newRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference) {
		String oldRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference = roleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference;
		roleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference = newRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE,
					oldRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference,
					roleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStateMachineName_java_lang_String_() {
		return stateMachineName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStateMachineName_java_lang_String_(String newStateMachineName_java_lang_String_) {
		String oldStateMachineName_java_lang_String_ = stateMachineName_java_lang_String_;
		stateMachineName_java_lang_String_ = newStateMachineName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__STATE_MACHINE_NAME_JAVA_LANG_STRING_,
					oldStateMachineName_java_lang_String_, stateMachineName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateMachineType getStateMachineType_software_amazon_awscdk_services_stepfunctions_StateMachineType_() {
		return stateMachineType_software_amazon_awscdk_services_stepfunctions_StateMachineType_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStateMachineType_software_amazon_awscdk_services_stepfunctions_StateMachineType_(
			StateMachineType newStateMachineType_software_amazon_awscdk_services_stepfunctions_StateMachineType_) {
		StateMachineType oldStateMachineType_software_amazon_awscdk_services_stepfunctions_StateMachineType_ = stateMachineType_software_amazon_awscdk_services_stepfunctions_StateMachineType_;
		stateMachineType_software_amazon_awscdk_services_stepfunctions_StateMachineType_ = newStateMachineType_software_amazon_awscdk_services_stepfunctions_StateMachineType_ == null
				? STATE_MACHINE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_STATE_MACHINE_TYPE__EDEFAULT
				: newStateMachineType_software_amazon_awscdk_services_stepfunctions_StateMachineType_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__STATE_MACHINE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_STATE_MACHINE_TYPE_,
					oldStateMachineType_software_amazon_awscdk_services_stepfunctions_StateMachineType_,
					stateMachineType_software_amazon_awscdk_services_stepfunctions_StateMachineType_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference = timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference = newTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference));
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
					AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__IDENTIFIER, oldIdentifier,
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
					AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__DEFINITION_WITH_ICHAINABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_ICHAINABLE_AS_REFERENCE:
			return getDefinitionWithIChainable_software_amazon_awscdk_services_stepfunctions_IChainable_AsReference();
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__LOGS_WITH_LOG_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_LOG_OPTIONS_AS_REFERENCE:
			return getLogsWithLogOptions_software_amazon_awscdk_services_stepfunctions_LogOptions_AsReference();
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			return getRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__STATE_MACHINE_NAME_JAVA_LANG_STRING_:
			return getStateMachineName_java_lang_String_();
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__STATE_MACHINE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_STATE_MACHINE_TYPE_:
			return getStateMachineType_software_amazon_awscdk_services_stepfunctions_StateMachineType_();
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__DEFINITION_WITH_ICHAINABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_ICHAINABLE_AS_REFERENCE:
			setDefinitionWithIChainable_software_amazon_awscdk_services_stepfunctions_IChainable_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__LOGS_WITH_LOG_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_LOG_OPTIONS_AS_REFERENCE:
			setLogsWithLogOptions_software_amazon_awscdk_services_stepfunctions_LogOptions_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			setRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__STATE_MACHINE_NAME_JAVA_LANG_STRING_:
			setStateMachineName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__STATE_MACHINE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_STATE_MACHINE_TYPE_:
			setStateMachineType_software_amazon_awscdk_services_stepfunctions_StateMachineType_(
					(StateMachineType) newValue);
			return;
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__DEFINITION_WITH_ICHAINABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_ICHAINABLE_AS_REFERENCE:
			setDefinitionWithIChainable_software_amazon_awscdk_services_stepfunctions_IChainable_AsReference(
					DEFINITION_WITH_ICHAINABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_ICHAINABLE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__LOGS_WITH_LOG_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_LOG_OPTIONS_AS_REFERENCE:
			setLogsWithLogOptions_software_amazon_awscdk_services_stepfunctions_LogOptions_AsReference(
					LOGS_WITH_LOG_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_LOG_OPTIONS_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			setRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(
					ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__STATE_MACHINE_NAME_JAVA_LANG_STRING_:
			setStateMachineName_java_lang_String_(STATE_MACHINE_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__STATE_MACHINE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_STATE_MACHINE_TYPE_:
			setStateMachineType_software_amazon_awscdk_services_stepfunctions_StateMachineType_(
					STATE_MACHINE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_STATE_MACHINE_TYPE__EDEFAULT);
			return;
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__DEFINITION_WITH_ICHAINABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_ICHAINABLE_AS_REFERENCE:
			return DEFINITION_WITH_ICHAINABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_ICHAINABLE_AS_REFERENCE_EDEFAULT == null
					? definitionWithIChainable_software_amazon_awscdk_services_stepfunctions_IChainable_AsReference != null
					: !DEFINITION_WITH_ICHAINABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_ICHAINABLE_AS_REFERENCE_EDEFAULT
							.equals(definitionWithIChainable_software_amazon_awscdk_services_stepfunctions_IChainable_AsReference);
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__LOGS_WITH_LOG_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_LOG_OPTIONS_AS_REFERENCE:
			return LOGS_WITH_LOG_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_LOG_OPTIONS_AS_REFERENCE_EDEFAULT == null
					? logsWithLogOptions_software_amazon_awscdk_services_stepfunctions_LogOptions_AsReference != null
					: !LOGS_WITH_LOG_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_LOG_OPTIONS_AS_REFERENCE_EDEFAULT
							.equals(logsWithLogOptions_software_amazon_awscdk_services_stepfunctions_LogOptions_AsReference);
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			return ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT == null
					? roleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference != null
					: !ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT
							.equals(roleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference);
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__STATE_MACHINE_NAME_JAVA_LANG_STRING_:
			return STATE_MACHINE_NAME_JAVA_LANG_STRING__EDEFAULT == null ? stateMachineName_java_lang_String_ != null
					: !STATE_MACHINE_NAME_JAVA_LANG_STRING__EDEFAULT.equals(stateMachineName_java_lang_String_);
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__STATE_MACHINE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_STATE_MACHINE_TYPE_:
			return stateMachineType_software_amazon_awscdk_services_stepfunctions_StateMachineType_ != STATE_MACHINE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_STATE_MACHINE_TYPE__EDEFAULT;
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__ADDITIONAL_CODE:
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
				" (definitionWithIChainable_software_amazon_awscdk_services_stepfunctions_IChainable_AsReference: ");
		result.append(definitionWithIChainable_software_amazon_awscdk_services_stepfunctions_IChainable_AsReference);
		result.append(", logsWithLogOptions_software_amazon_awscdk_services_stepfunctions_LogOptions_AsReference: ");
		result.append(logsWithLogOptions_software_amazon_awscdk_services_stepfunctions_LogOptions_AsReference);
		result.append(", roleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference: ");
		result.append(roleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference);
		result.append(", stateMachineName_java_lang_String_: ");
		result.append(stateMachineName_java_lang_String_);
		result.append(", stateMachineType_software_amazon_awscdk_services_stepfunctions_StateMachineType_: ");
		result.append(stateMachineType_software_amazon_awscdk_services_stepfunctions_StateMachineType_);
		result.append(", timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference);
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

} //StateMachinePropsBuilder_stepfunctionsImpl
