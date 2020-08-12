/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsLogDriverBuilder_ecs;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.RetentionDays;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aws Log Driver Builder ecs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AwsLogDriverBuilder_ecsImpl#getStreamPrefix_java_lang_String_ <em>Stream Prefix java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AwsLogDriverBuilder_ecsImpl#getDatetimeFormat_java_lang_String_ <em>Datetime Format java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AwsLogDriverBuilder_ecsImpl#getLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference <em>Log Group With ILog Group software amazon awscdk services logs ILog Group As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AwsLogDriverBuilder_ecsImpl#getLogRetention_software_amazon_awscdk_services_logs_RetentionDays_ <em>Log Retention software amazon awscdk services logs Retention Days </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AwsLogDriverBuilder_ecsImpl#getMultilinePattern_java_lang_String_ <em>Multiline Pattern java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AwsLogDriverBuilder_ecsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AwsLogDriverBuilder_ecsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AwsLogDriverBuilder_ecsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AwsLogDriverBuilder_ecsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AwsLogDriverBuilder_ecsImpl extends MinimalEObjectImpl.Container implements AwsLogDriverBuilder_ecs {
	/**
	 * The default value of the '{@link #getStreamPrefix_java_lang_String_() <em>Stream Prefix java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreamPrefix_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String STREAM_PREFIX_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreamPrefix_java_lang_String_() <em>Stream Prefix java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreamPrefix_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String streamPrefix_java_lang_String_ = STREAM_PREFIX_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getDatetimeFormat_java_lang_String_() <em>Datetime Format java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatetimeFormat_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String DATETIME_FORMAT_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatetimeFormat_java_lang_String_() <em>Datetime Format java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatetimeFormat_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String datetimeFormat_java_lang_String_ = DATETIME_FORMAT_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference() <em>Log Group With ILog Group software amazon awscdk services logs ILog Group As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_GROUP_WITH_ILOG_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_ILOG_GROUP_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference() <em>Log Group With ILog Group software amazon awscdk services logs ILog Group As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String logGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference = LOG_GROUP_WITH_ILOG_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_ILOG_GROUP_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogRetention_software_amazon_awscdk_services_logs_RetentionDays_() <em>Log Retention software amazon awscdk services logs Retention Days </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogRetention_software_amazon_awscdk_services_logs_RetentionDays_()
	 * @generated
	 * @ordered
	 */
	protected static final RetentionDays LOG_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS__EDEFAULT = RetentionDays.ONE_DAY;

	/**
	 * The cached value of the '{@link #getLogRetention_software_amazon_awscdk_services_logs_RetentionDays_() <em>Log Retention software amazon awscdk services logs Retention Days </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogRetention_software_amazon_awscdk_services_logs_RetentionDays_()
	 * @generated
	 * @ordered
	 */
	protected RetentionDays logRetention_software_amazon_awscdk_services_logs_RetentionDays_ = LOG_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS__EDEFAULT;

	/**
	 * The default value of the '{@link #getMultilinePattern_java_lang_String_() <em>Multiline Pattern java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultilinePattern_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTILINE_PATTERN_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultilinePattern_java_lang_String_() <em>Multiline Pattern java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultilinePattern_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String multilinePattern_java_lang_String_ = MULTILINE_PATTERN_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ecs.AwsLogDriver";

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
	protected AwsLogDriverBuilder_ecsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.AWS_LOG_DRIVER_BUILDER_ECS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStreamPrefix_java_lang_String_() {
		return streamPrefix_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStreamPrefix_java_lang_String_(String newStreamPrefix_java_lang_String_) {
		String oldStreamPrefix_java_lang_String_ = streamPrefix_java_lang_String_;
		streamPrefix_java_lang_String_ = newStreamPrefix_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__STREAM_PREFIX_JAVA_LANG_STRING_,
					oldStreamPrefix_java_lang_String_, streamPrefix_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDatetimeFormat_java_lang_String_() {
		return datetimeFormat_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatetimeFormat_java_lang_String_(String newDatetimeFormat_java_lang_String_) {
		String oldDatetimeFormat_java_lang_String_ = datetimeFormat_java_lang_String_;
		datetimeFormat_java_lang_String_ = newDatetimeFormat_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__DATETIME_FORMAT_JAVA_LANG_STRING_,
					oldDatetimeFormat_java_lang_String_, datetimeFormat_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference() {
		return logGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference(
			String newLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference) {
		String oldLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference = logGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference;
		logGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference = newLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__LOG_GROUP_WITH_ILOG_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_ILOG_GROUP_AS_REFERENCE,
					oldLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference,
					logGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RetentionDays getLogRetention_software_amazon_awscdk_services_logs_RetentionDays_() {
		return logRetention_software_amazon_awscdk_services_logs_RetentionDays_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogRetention_software_amazon_awscdk_services_logs_RetentionDays_(
			RetentionDays newLogRetention_software_amazon_awscdk_services_logs_RetentionDays_) {
		RetentionDays oldLogRetention_software_amazon_awscdk_services_logs_RetentionDays_ = logRetention_software_amazon_awscdk_services_logs_RetentionDays_;
		logRetention_software_amazon_awscdk_services_logs_RetentionDays_ = newLogRetention_software_amazon_awscdk_services_logs_RetentionDays_ == null
				? LOG_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS__EDEFAULT
				: newLogRetention_software_amazon_awscdk_services_logs_RetentionDays_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__LOG_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS_,
					oldLogRetention_software_amazon_awscdk_services_logs_RetentionDays_,
					logRetention_software_amazon_awscdk_services_logs_RetentionDays_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMultilinePattern_java_lang_String_() {
		return multilinePattern_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultilinePattern_java_lang_String_(String newMultilinePattern_java_lang_String_) {
		String oldMultilinePattern_java_lang_String_ = multilinePattern_java_lang_String_;
		multilinePattern_java_lang_String_ = newMultilinePattern_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__MULTILINE_PATTERN_JAVA_LANG_STRING_,
					oldMultilinePattern_java_lang_String_, multilinePattern_java_lang_String_));
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
					AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__STREAM_PREFIX_JAVA_LANG_STRING_:
			return getStreamPrefix_java_lang_String_();
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__DATETIME_FORMAT_JAVA_LANG_STRING_:
			return getDatetimeFormat_java_lang_String_();
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__LOG_GROUP_WITH_ILOG_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_ILOG_GROUP_AS_REFERENCE:
			return getLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference();
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__LOG_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS_:
			return getLogRetention_software_amazon_awscdk_services_logs_RetentionDays_();
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__MULTILINE_PATTERN_JAVA_LANG_STRING_:
			return getMultilinePattern_java_lang_String_();
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__STREAM_PREFIX_JAVA_LANG_STRING_:
			setStreamPrefix_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__DATETIME_FORMAT_JAVA_LANG_STRING_:
			setDatetimeFormat_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__LOG_GROUP_WITH_ILOG_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_ILOG_GROUP_AS_REFERENCE:
			setLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__LOG_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS_:
			setLogRetention_software_amazon_awscdk_services_logs_RetentionDays_((RetentionDays) newValue);
			return;
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__MULTILINE_PATTERN_JAVA_LANG_STRING_:
			setMultilinePattern_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__STREAM_PREFIX_JAVA_LANG_STRING_:
			setStreamPrefix_java_lang_String_(STREAM_PREFIX_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__DATETIME_FORMAT_JAVA_LANG_STRING_:
			setDatetimeFormat_java_lang_String_(DATETIME_FORMAT_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__LOG_GROUP_WITH_ILOG_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_ILOG_GROUP_AS_REFERENCE:
			setLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference(
					LOG_GROUP_WITH_ILOG_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_ILOG_GROUP_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__LOG_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS_:
			setLogRetention_software_amazon_awscdk_services_logs_RetentionDays_(
					LOG_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS__EDEFAULT);
			return;
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__MULTILINE_PATTERN_JAVA_LANG_STRING_:
			setMultilinePattern_java_lang_String_(MULTILINE_PATTERN_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__STREAM_PREFIX_JAVA_LANG_STRING_:
			return STREAM_PREFIX_JAVA_LANG_STRING__EDEFAULT == null ? streamPrefix_java_lang_String_ != null
					: !STREAM_PREFIX_JAVA_LANG_STRING__EDEFAULT.equals(streamPrefix_java_lang_String_);
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__DATETIME_FORMAT_JAVA_LANG_STRING_:
			return DATETIME_FORMAT_JAVA_LANG_STRING__EDEFAULT == null ? datetimeFormat_java_lang_String_ != null
					: !DATETIME_FORMAT_JAVA_LANG_STRING__EDEFAULT.equals(datetimeFormat_java_lang_String_);
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__LOG_GROUP_WITH_ILOG_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_ILOG_GROUP_AS_REFERENCE:
			return LOG_GROUP_WITH_ILOG_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_ILOG_GROUP_AS_REFERENCE_EDEFAULT == null
					? logGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference != null
					: !LOG_GROUP_WITH_ILOG_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_ILOG_GROUP_AS_REFERENCE_EDEFAULT
							.equals(logGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference);
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__LOG_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS_:
			return logRetention_software_amazon_awscdk_services_logs_RetentionDays_ != LOG_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS__EDEFAULT;
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__MULTILINE_PATTERN_JAVA_LANG_STRING_:
			return MULTILINE_PATTERN_JAVA_LANG_STRING__EDEFAULT == null ? multilinePattern_java_lang_String_ != null
					: !MULTILINE_PATTERN_JAVA_LANG_STRING__EDEFAULT.equals(multilinePattern_java_lang_String_);
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__ADDITIONAL_CODE:
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
		result.append(" (streamPrefix_java_lang_String_: ");
		result.append(streamPrefix_java_lang_String_);
		result.append(", datetimeFormat_java_lang_String_: ");
		result.append(datetimeFormat_java_lang_String_);
		result.append(", logGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference: ");
		result.append(logGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference);
		result.append(", logRetention_software_amazon_awscdk_services_logs_RetentionDays_: ");
		result.append(logRetention_software_amazon_awscdk_services_logs_RetentionDays_);
		result.append(", multilinePattern_java_lang_String_: ");
		result.append(multilinePattern_java_lang_String_);
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

} //AwsLogDriverBuilder_ecsImpl
