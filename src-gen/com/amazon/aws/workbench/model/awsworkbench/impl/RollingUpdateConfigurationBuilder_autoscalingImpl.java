/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.RollingUpdateConfigurationBuilder_autoscaling;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rolling Update Configuration Builder autoscaling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RollingUpdateConfigurationBuilder_autoscalingImpl#getMaxBatchSize_java_lang_Number_ <em>Max Batch Size java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RollingUpdateConfigurationBuilder_autoscalingImpl#getMinInstancesInService_java_lang_Number_ <em>Min Instances In Service java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RollingUpdateConfigurationBuilder_autoscalingImpl#getMinSuccessfulInstancesPercent_java_lang_Number_ <em>Min Successful Instances Percent java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RollingUpdateConfigurationBuilder_autoscalingImpl#getPauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Pause Time With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RollingUpdateConfigurationBuilder_autoscalingImpl#getSuspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsList <em>Suspend Processes software amazon awscdk services autoscaling Scaling Process As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RollingUpdateConfigurationBuilder_autoscalingImpl#getWaitOnResourceSignals_java_lang_Boolean_ <em>Wait On Resource Signals java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RollingUpdateConfigurationBuilder_autoscalingImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RollingUpdateConfigurationBuilder_autoscalingImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RollingUpdateConfigurationBuilder_autoscalingImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RollingUpdateConfigurationBuilder_autoscalingImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RollingUpdateConfigurationBuilder_autoscalingImpl extends MinimalEObjectImpl.Container
		implements RollingUpdateConfigurationBuilder_autoscaling {
	/**
	 * The default value of the '{@link #getMaxBatchSize_java_lang_Number_() <em>Max Batch Size java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBatchSize_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_BATCH_SIZE_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxBatchSize_java_lang_Number_() <em>Max Batch Size java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBatchSize_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int maxBatchSize_java_lang_Number_ = MAX_BATCH_SIZE_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getMinInstancesInService_java_lang_Number_() <em>Min Instances In Service java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInstancesInService_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_INSTANCES_IN_SERVICE_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinInstancesInService_java_lang_Number_() <em>Min Instances In Service java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInstancesInService_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int minInstancesInService_java_lang_Number_ = MIN_INSTANCES_IN_SERVICE_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getMinSuccessfulInstancesPercent_java_lang_Number_() <em>Min Successful Instances Percent java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSuccessfulInstancesPercent_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_SUCCESSFUL_INSTANCES_PERCENT_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinSuccessfulInstancesPercent_java_lang_Number_() <em>Min Successful Instances Percent java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSuccessfulInstancesPercent_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int minSuccessfulInstancesPercent_java_lang_Number_ = MIN_SUCCESSFUL_INSTANCES_PERCENT_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getPauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Pause Time With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String PAUSE_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Pause Time With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String pauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference = PAUSE_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsList() <em>Suspend Processes software amazon awscdk services autoscaling Scaling Process As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String SUSPEND_PROCESSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_SCALING_PROCESS_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsList() <em>Suspend Processes software amazon awscdk services autoscaling Scaling Process As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsList()
	 * @generated
	 * @ordered
	 */
	protected String suspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsList = SUSPEND_PROCESSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_SCALING_PROCESS_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getWaitOnResourceSignals_java_lang_Boolean_() <em>Wait On Resource Signals java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitOnResourceSignals_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean WAIT_ON_RESOURCE_SIGNALS_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWaitOnResourceSignals_java_lang_Boolean_() <em>Wait On Resource Signals java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitOnResourceSignals_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean waitOnResourceSignals_java_lang_Boolean_ = WAIT_ON_RESOURCE_SIGNALS_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.autoscaling.RollingUpdateConfiguration";

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
	protected RollingUpdateConfigurationBuilder_autoscalingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxBatchSize_java_lang_Number_() {
		return maxBatchSize_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxBatchSize_java_lang_Number_(int newMaxBatchSize_java_lang_Number_) {
		int oldMaxBatchSize_java_lang_Number_ = maxBatchSize_java_lang_Number_;
		maxBatchSize_java_lang_Number_ = newMaxBatchSize_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__MAX_BATCH_SIZE_JAVA_LANG_NUMBER_,
					oldMaxBatchSize_java_lang_Number_, maxBatchSize_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinInstancesInService_java_lang_Number_() {
		return minInstancesInService_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinInstancesInService_java_lang_Number_(int newMinInstancesInService_java_lang_Number_) {
		int oldMinInstancesInService_java_lang_Number_ = minInstancesInService_java_lang_Number_;
		minInstancesInService_java_lang_Number_ = newMinInstancesInService_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__MIN_INSTANCES_IN_SERVICE_JAVA_LANG_NUMBER_,
					oldMinInstancesInService_java_lang_Number_, minInstancesInService_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinSuccessfulInstancesPercent_java_lang_Number_() {
		return minSuccessfulInstancesPercent_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinSuccessfulInstancesPercent_java_lang_Number_(
			int newMinSuccessfulInstancesPercent_java_lang_Number_) {
		int oldMinSuccessfulInstancesPercent_java_lang_Number_ = minSuccessfulInstancesPercent_java_lang_Number_;
		minSuccessfulInstancesPercent_java_lang_Number_ = newMinSuccessfulInstancesPercent_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__MIN_SUCCESSFUL_INSTANCES_PERCENT_JAVA_LANG_NUMBER_,
					oldMinSuccessfulInstancesPercent_java_lang_Number_,
					minSuccessfulInstancesPercent_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return pauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newPauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldPauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference = pauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		pauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference = newPauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__PAUSE_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldPauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					pauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSuspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsList() {
		return suspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsList(
			String newSuspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsList) {
		String oldSuspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsList = suspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsList;
		suspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsList = newSuspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__SUSPEND_PROCESSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_SCALING_PROCESS_AS_LIST,
					oldSuspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsList,
					suspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getWaitOnResourceSignals_java_lang_Boolean_() {
		return waitOnResourceSignals_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWaitOnResourceSignals_java_lang_Boolean_(Boolean newWaitOnResourceSignals_java_lang_Boolean_) {
		Boolean oldWaitOnResourceSignals_java_lang_Boolean_ = waitOnResourceSignals_java_lang_Boolean_;
		waitOnResourceSignals_java_lang_Boolean_ = newWaitOnResourceSignals_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__WAIT_ON_RESOURCE_SIGNALS_JAVA_LANG_BOOLEAN_,
					oldWaitOnResourceSignals_java_lang_Boolean_, waitOnResourceSignals_java_lang_Boolean_));
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
					AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__VAR_NAME, oldVarName,
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
					AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__IDENTIFIER, oldIdentifier,
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
					AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__ADDITIONAL_CODE,
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
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__MAX_BATCH_SIZE_JAVA_LANG_NUMBER_:
			return getMaxBatchSize_java_lang_Number_();
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__MIN_INSTANCES_IN_SERVICE_JAVA_LANG_NUMBER_:
			return getMinInstancesInService_java_lang_Number_();
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__MIN_SUCCESSFUL_INSTANCES_PERCENT_JAVA_LANG_NUMBER_:
			return getMinSuccessfulInstancesPercent_java_lang_Number_();
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__PAUSE_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getPauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__SUSPEND_PROCESSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_SCALING_PROCESS_AS_LIST:
			return getSuspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsList();
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__WAIT_ON_RESOURCE_SIGNALS_JAVA_LANG_BOOLEAN_:
			return getWaitOnResourceSignals_java_lang_Boolean_();
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__MAX_BATCH_SIZE_JAVA_LANG_NUMBER_:
			setMaxBatchSize_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__MIN_INSTANCES_IN_SERVICE_JAVA_LANG_NUMBER_:
			setMinInstancesInService_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__MIN_SUCCESSFUL_INSTANCES_PERCENT_JAVA_LANG_NUMBER_:
			setMinSuccessfulInstancesPercent_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__PAUSE_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setPauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__SUSPEND_PROCESSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_SCALING_PROCESS_AS_LIST:
			setSuspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__WAIT_ON_RESOURCE_SIGNALS_JAVA_LANG_BOOLEAN_:
			setWaitOnResourceSignals_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__MAX_BATCH_SIZE_JAVA_LANG_NUMBER_:
			setMaxBatchSize_java_lang_Number_(MAX_BATCH_SIZE_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__MIN_INSTANCES_IN_SERVICE_JAVA_LANG_NUMBER_:
			setMinInstancesInService_java_lang_Number_(MIN_INSTANCES_IN_SERVICE_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__MIN_SUCCESSFUL_INSTANCES_PERCENT_JAVA_LANG_NUMBER_:
			setMinSuccessfulInstancesPercent_java_lang_Number_(
					MIN_SUCCESSFUL_INSTANCES_PERCENT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__PAUSE_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setPauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					PAUSE_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__SUSPEND_PROCESSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_SCALING_PROCESS_AS_LIST:
			setSuspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsList(
					SUSPEND_PROCESSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_SCALING_PROCESS_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__WAIT_ON_RESOURCE_SIGNALS_JAVA_LANG_BOOLEAN_:
			setWaitOnResourceSignals_java_lang_Boolean_(WAIT_ON_RESOURCE_SIGNALS_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__MAX_BATCH_SIZE_JAVA_LANG_NUMBER_:
			return maxBatchSize_java_lang_Number_ != MAX_BATCH_SIZE_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__MIN_INSTANCES_IN_SERVICE_JAVA_LANG_NUMBER_:
			return minInstancesInService_java_lang_Number_ != MIN_INSTANCES_IN_SERVICE_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__MIN_SUCCESSFUL_INSTANCES_PERCENT_JAVA_LANG_NUMBER_:
			return minSuccessfulInstancesPercent_java_lang_Number_ != MIN_SUCCESSFUL_INSTANCES_PERCENT_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__PAUSE_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return PAUSE_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? pauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !PAUSE_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(pauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__SUSPEND_PROCESSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_SCALING_PROCESS_AS_LIST:
			return SUSPEND_PROCESSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_SCALING_PROCESS_AS_LIST_EDEFAULT == null
					? suspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsList != null
					: !SUSPEND_PROCESSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_SCALING_PROCESS_AS_LIST_EDEFAULT
							.equals(suspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsList);
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__WAIT_ON_RESOURCE_SIGNALS_JAVA_LANG_BOOLEAN_:
			return WAIT_ON_RESOURCE_SIGNALS_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? waitOnResourceSignals_java_lang_Boolean_ != null
					: !WAIT_ON_RESOURCE_SIGNALS_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(waitOnResourceSignals_java_lang_Boolean_);
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__ADDITIONAL_CODE:
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
		result.append(" (maxBatchSize_java_lang_Number_: ");
		result.append(maxBatchSize_java_lang_Number_);
		result.append(", minInstancesInService_java_lang_Number_: ");
		result.append(minInstancesInService_java_lang_Number_);
		result.append(", minSuccessfulInstancesPercent_java_lang_Number_: ");
		result.append(minSuccessfulInstancesPercent_java_lang_Number_);
		result.append(", pauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(pauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		result.append(", suspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsList: ");
		result.append(suspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsList);
		result.append(", waitOnResourceSignals_java_lang_Boolean_: ");
		result.append(waitOnResourceSignals_java_lang_Boolean_);
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

} //RollingUpdateConfigurationBuilder_autoscalingImpl
