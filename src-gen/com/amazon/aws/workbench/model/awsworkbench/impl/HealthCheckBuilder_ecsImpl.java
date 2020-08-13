/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.HealthCheckBuilder_ecs;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Health Check Builder ecs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.HealthCheckBuilder_ecsImpl#getCommand_java_lang_String_AsList <em>Command java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.HealthCheckBuilder_ecsImpl#getIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Interval With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.HealthCheckBuilder_ecsImpl#getRetries_java_lang_Number_ <em>Retries java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.HealthCheckBuilder_ecsImpl#getStartPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Start Period With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.HealthCheckBuilder_ecsImpl#getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Timeout With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.HealthCheckBuilder_ecsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.HealthCheckBuilder_ecsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.HealthCheckBuilder_ecsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.HealthCheckBuilder_ecsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HealthCheckBuilder_ecsImpl extends ServiceResourcesImpl implements HealthCheckBuilder_ecs {
	/**
	 * The default value of the '{@link #getCommand_java_lang_String_AsList() <em>Command java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommand_java_lang_String_AsList() <em>Command java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String command_java_lang_String_AsList = COMMAND_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Interval With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERVAL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Interval With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String intervalWithDuration_software_amazon_awscdk_core_Duration_AsReference = INTERVAL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetries_java_lang_Number_() <em>Retries java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetries_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int RETRIES_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRetries_java_lang_Number_() <em>Retries java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetries_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int retries_java_lang_Number_ = RETRIES_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getStartPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Start Period With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String START_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Start Period With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String startPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference = START_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

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
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ecs.HealthCheck";

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
	protected HealthCheckBuilder_ecsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.HEALTH_CHECK_BUILDER_ECS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommand_java_lang_String_AsList() {
		return command_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommand_java_lang_String_AsList(String newCommand_java_lang_String_AsList) {
		String oldCommand_java_lang_String_AsList = command_java_lang_String_AsList;
		command_java_lang_String_AsList = newCommand_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__COMMAND_JAVA_LANG_STRING_AS_LIST,
					oldCommand_java_lang_String_AsList, command_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return intervalWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference = intervalWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		intervalWithDuration_software_amazon_awscdk_core_Duration_AsReference = newIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__INTERVAL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					intervalWithDuration_software_amazon_awscdk_core_Duration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRetries_java_lang_Number_() {
		return retries_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetries_java_lang_Number_(int newRetries_java_lang_Number_) {
		int oldRetries_java_lang_Number_ = retries_java_lang_Number_;
		retries_java_lang_Number_ = newRetries_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__RETRIES_JAVA_LANG_NUMBER_,
					oldRetries_java_lang_Number_, retries_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStartPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return startPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newStartPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldStartPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference = startPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		startPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference = newStartPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__START_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldStartPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					startPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference));
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
					AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
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
					AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__COMMAND_JAVA_LANG_STRING_AS_LIST:
			return getCommand_java_lang_String_AsList();
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__INTERVAL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__RETRIES_JAVA_LANG_NUMBER_:
			return getRetries_java_lang_Number_();
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__START_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getStartPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__COMMAND_JAVA_LANG_STRING_AS_LIST:
			setCommand_java_lang_String_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__INTERVAL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__RETRIES_JAVA_LANG_NUMBER_:
			setRetries_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__START_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setStartPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__COMMAND_JAVA_LANG_STRING_AS_LIST:
			setCommand_java_lang_String_AsList(COMMAND_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__INTERVAL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					INTERVAL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__RETRIES_JAVA_LANG_NUMBER_:
			setRetries_java_lang_Number_(RETRIES_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__START_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setStartPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					START_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__COMMAND_JAVA_LANG_STRING_AS_LIST:
			return COMMAND_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null ? command_java_lang_String_AsList != null
					: !COMMAND_JAVA_LANG_STRING_AS_LIST_EDEFAULT.equals(command_java_lang_String_AsList);
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__INTERVAL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return INTERVAL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? intervalWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !INTERVAL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(intervalWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__RETRIES_JAVA_LANG_NUMBER_:
			return retries_java_lang_Number_ != RETRIES_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__START_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return START_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? startPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !START_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(startPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__ADDITIONAL_CODE:
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
		result.append(" (command_java_lang_String_AsList: ");
		result.append(command_java_lang_String_AsList);
		result.append(", intervalWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(intervalWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		result.append(", retries_java_lang_Number_: ");
		result.append(retries_java_lang_Number_);
		result.append(", startPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(startPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference);
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

} //HealthCheckBuilder_ecsImpl
