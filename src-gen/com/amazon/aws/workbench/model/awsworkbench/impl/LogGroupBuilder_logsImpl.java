/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.LogGroupBuilder_logs;
import com.amazon.aws.workbench.model.awsworkbench.RemovalPolicy;
import com.amazon.aws.workbench.model.awsworkbench.RetentionDays;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log Group Builder logs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LogGroupBuilder_logsImpl#getLogGroupName_java_lang_String_ <em>Log Group Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LogGroupBuilder_logsImpl#getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ <em>Removal Policy software amazon awscdk core Removal Policy </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LogGroupBuilder_logsImpl#getRetention_software_amazon_awscdk_services_logs_RetentionDays_ <em>Retention software amazon awscdk services logs Retention Days </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LogGroupBuilder_logsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LogGroupBuilder_logsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LogGroupBuilder_logsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LogGroupBuilder_logsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogGroupBuilder_logsImpl extends MinimalEObjectImpl.Container implements LogGroupBuilder_logs {
	/**
	 * The default value of the '{@link #getLogGroupName_java_lang_String_() <em>Log Group Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogGroupName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_GROUP_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogGroupName_java_lang_String_() <em>Log Group Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogGroupName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String logGroupName_java_lang_String_ = LOG_GROUP_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_() <em>Removal Policy software amazon awscdk core Removal Policy </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_()
	 * @generated
	 * @ordered
	 */
	protected static final RemovalPolicy REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY__EDEFAULT = RemovalPolicy.DESTROY;

	/**
	 * The cached value of the '{@link #getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_() <em>Removal Policy software amazon awscdk core Removal Policy </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_()
	 * @generated
	 * @ordered
	 */
	protected RemovalPolicy removalPolicy_software_amazon_awscdk_core_RemovalPolicy_ = REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY__EDEFAULT;

	/**
	 * The default value of the '{@link #getRetention_software_amazon_awscdk_services_logs_RetentionDays_() <em>Retention software amazon awscdk services logs Retention Days </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetention_software_amazon_awscdk_services_logs_RetentionDays_()
	 * @generated
	 * @ordered
	 */
	protected static final RetentionDays RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS__EDEFAULT = RetentionDays.ONE_DAY;

	/**
	 * The cached value of the '{@link #getRetention_software_amazon_awscdk_services_logs_RetentionDays_() <em>Retention software amazon awscdk services logs Retention Days </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetention_software_amazon_awscdk_services_logs_RetentionDays_()
	 * @generated
	 * @ordered
	 */
	protected RetentionDays retention_software_amazon_awscdk_services_logs_RetentionDays_ = RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.logs.LogGroup";

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
	protected LogGroupBuilder_logsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.LOG_GROUP_BUILDER_LOGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogGroupName_java_lang_String_() {
		return logGroupName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogGroupName_java_lang_String_(String newLogGroupName_java_lang_String_) {
		String oldLogGroupName_java_lang_String_ = logGroupName_java_lang_String_;
		logGroupName_java_lang_String_ = newLogGroupName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__LOG_GROUP_NAME_JAVA_LANG_STRING_,
					oldLogGroupName_java_lang_String_, logGroupName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemovalPolicy getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_() {
		return removalPolicy_software_amazon_awscdk_core_RemovalPolicy_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_(
			RemovalPolicy newRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_) {
		RemovalPolicy oldRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ = removalPolicy_software_amazon_awscdk_core_RemovalPolicy_;
		removalPolicy_software_amazon_awscdk_core_RemovalPolicy_ = newRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ == null
				? REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY__EDEFAULT
				: newRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_,
					oldRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_,
					removalPolicy_software_amazon_awscdk_core_RemovalPolicy_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RetentionDays getRetention_software_amazon_awscdk_services_logs_RetentionDays_() {
		return retention_software_amazon_awscdk_services_logs_RetentionDays_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetention_software_amazon_awscdk_services_logs_RetentionDays_(
			RetentionDays newRetention_software_amazon_awscdk_services_logs_RetentionDays_) {
		RetentionDays oldRetention_software_amazon_awscdk_services_logs_RetentionDays_ = retention_software_amazon_awscdk_services_logs_RetentionDays_;
		retention_software_amazon_awscdk_services_logs_RetentionDays_ = newRetention_software_amazon_awscdk_services_logs_RetentionDays_ == null
				? RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS__EDEFAULT
				: newRetention_software_amazon_awscdk_services_logs_RetentionDays_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS_,
					oldRetention_software_amazon_awscdk_services_logs_RetentionDays_,
					retention_software_amazon_awscdk_services_logs_RetentionDays_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__VAR_NAME,
					oldVarName, varName));
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
					AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__LOG_GROUP_NAME_JAVA_LANG_STRING_:
			return getLogGroupName_java_lang_String_();
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
			return getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_();
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS_:
			return getRetention_software_amazon_awscdk_services_logs_RetentionDays_();
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__LOG_GROUP_NAME_JAVA_LANG_STRING_:
			setLogGroupName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
			setRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_((RemovalPolicy) newValue);
			return;
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS_:
			setRetention_software_amazon_awscdk_services_logs_RetentionDays_((RetentionDays) newValue);
			return;
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__LOG_GROUP_NAME_JAVA_LANG_STRING_:
			setLogGroupName_java_lang_String_(LOG_GROUP_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
			setRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_(
					REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY__EDEFAULT);
			return;
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS_:
			setRetention_software_amazon_awscdk_services_logs_RetentionDays_(
					RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS__EDEFAULT);
			return;
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__LOG_GROUP_NAME_JAVA_LANG_STRING_:
			return LOG_GROUP_NAME_JAVA_LANG_STRING__EDEFAULT == null ? logGroupName_java_lang_String_ != null
					: !LOG_GROUP_NAME_JAVA_LANG_STRING__EDEFAULT.equals(logGroupName_java_lang_String_);
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
			return removalPolicy_software_amazon_awscdk_core_RemovalPolicy_ != REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY__EDEFAULT;
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS_:
			return retention_software_amazon_awscdk_services_logs_RetentionDays_ != RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS__EDEFAULT;
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__ADDITIONAL_CODE:
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
		result.append(" (logGroupName_java_lang_String_: ");
		result.append(logGroupName_java_lang_String_);
		result.append(", removalPolicy_software_amazon_awscdk_core_RemovalPolicy_: ");
		result.append(removalPolicy_software_amazon_awscdk_core_RemovalPolicy_);
		result.append(", retention_software_amazon_awscdk_services_logs_RetentionDays_: ");
		result.append(retention_software_amazon_awscdk_services_logs_RetentionDays_);
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

} //LogGroupBuilder_logsImpl
