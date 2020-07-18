/**
 */
package ec2.impl;

import ec2.Ec2Package;
import ec2.FlowLogDestinationConfigBuilder_ec2;
import ec2.FlowLogDestinationType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Log Destination Config Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ec2.impl.FlowLogDestinationConfigBuilder_ec2Impl#getLogDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_ <em>Log Destination Type software amazon awscdk services ec2 Flow Log Destination Type </em>}</li>
 *   <li>{@link ec2.impl.FlowLogDestinationConfigBuilder_ec2Impl#getIamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Iam Role With IRole software amazon awscdk services iam IRole As Reference</em>}</li>
 *   <li>{@link ec2.impl.FlowLogDestinationConfigBuilder_ec2Impl#getLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference <em>Log Group With ILog Group software amazon awscdk services logs ILog Group As Reference</em>}</li>
 *   <li>{@link ec2.impl.FlowLogDestinationConfigBuilder_ec2Impl#getS3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference <em>S3 Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</em>}</li>
 *   <li>{@link ec2.impl.FlowLogDestinationConfigBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.impl.FlowLogDestinationConfigBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.impl.FlowLogDestinationConfigBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.impl.FlowLogDestinationConfigBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowLogDestinationConfigBuilder_ec2Impl extends MinimalEObjectImpl.Container
		implements FlowLogDestinationConfigBuilder_ec2 {
	/**
	 * The default value of the '{@link #getLogDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_() <em>Log Destination Type software amazon awscdk services ec2 Flow Log Destination Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_()
	 * @generated
	 * @ordered
	 */
	protected static final FlowLogDestinationType LOG_DESTINATION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_TYPE__EDEFAULT = FlowLogDestinationType.CLOUD_WATCH_LOGS;

	/**
	 * The cached value of the '{@link #getLogDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_() <em>Log Destination Type software amazon awscdk services ec2 Flow Log Destination Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_()
	 * @generated
	 * @ordered
	 */
	protected FlowLogDestinationType logDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_ = LOG_DESTINATION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_TYPE__EDEFAULT;

	/**
	 * The default value of the '{@link #getIamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() <em>Iam Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String IAM_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() <em>Iam Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String iamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference = IAM_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT;

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
	 * The default value of the '{@link #getS3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference() <em>S3 Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String S3_BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getS3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference() <em>S3 Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String s3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference = S3_BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.FlowLogDestinationConfig";

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
	protected FlowLogDestinationConfigBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.Literals.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlowLogDestinationType getLogDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_() {
		return logDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_(
			FlowLogDestinationType newLogDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_) {
		FlowLogDestinationType oldLogDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_ = logDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_;
		logDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_ = newLogDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_ == null
				? LOG_DESTINATION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_TYPE__EDEFAULT
				: newLogDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__LOG_DESTINATION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_TYPE_,
					oldLogDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_,
					logDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() {
		return iamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(
			String newIamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference) {
		String oldIamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference = iamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference;
		iamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference = newIamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__IAM_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE,
					oldIamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference,
					iamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference));
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
					Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__LOG_GROUP_WITH_ILOG_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_ILOG_GROUP_AS_REFERENCE,
					oldLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference,
					logGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getS3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference() {
		return s3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setS3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference(
			String newS3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference) {
		String oldS3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference = s3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference;
		s3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference = newS3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__S3_BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE,
					oldS3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference,
					s3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference));
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
					Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__VAR_NAME, oldVarName, varName));
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
					Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__IDENTIFIER, oldIdentifier, identifier));
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
					Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__ADDITIONAL_CODE, oldAdditionalCode,
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
		case Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__LOG_DESTINATION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_TYPE_:
			return getLogDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_();
		case Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__IAM_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			return getIamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();
		case Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__LOG_GROUP_WITH_ILOG_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_ILOG_GROUP_AS_REFERENCE:
			return getLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference();
		case Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__S3_BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE:
			return getS3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference();
		case Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__LOG_DESTINATION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_TYPE_:
			setLogDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_(
					(FlowLogDestinationType) newValue);
			return;
		case Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__IAM_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			setIamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference((String) newValue);
			return;
		case Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__LOG_GROUP_WITH_ILOG_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_ILOG_GROUP_AS_REFERENCE:
			setLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference((String) newValue);
			return;
		case Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__S3_BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE:
			setS3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference((String) newValue);
			return;
		case Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__LOG_DESTINATION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_TYPE_:
			setLogDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_(
					LOG_DESTINATION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_TYPE__EDEFAULT);
			return;
		case Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__IAM_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			setIamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(
					IAM_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT);
			return;
		case Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__LOG_GROUP_WITH_ILOG_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_ILOG_GROUP_AS_REFERENCE:
			setLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference(
					LOG_GROUP_WITH_ILOG_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_ILOG_GROUP_AS_REFERENCE_EDEFAULT);
			return;
		case Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__S3_BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE:
			setS3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference(
					S3_BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE_EDEFAULT);
			return;
		case Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__LOG_DESTINATION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_TYPE_:
			return logDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_ != LOG_DESTINATION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_TYPE__EDEFAULT;
		case Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__IAM_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			return IAM_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT == null
					? iamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference != null
					: !IAM_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT
							.equals(iamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference);
		case Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__LOG_GROUP_WITH_ILOG_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_ILOG_GROUP_AS_REFERENCE:
			return LOG_GROUP_WITH_ILOG_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_ILOG_GROUP_AS_REFERENCE_EDEFAULT == null
					? logGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference != null
					: !LOG_GROUP_WITH_ILOG_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_ILOG_GROUP_AS_REFERENCE_EDEFAULT
							.equals(logGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference);
		case Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__S3_BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE:
			return S3_BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE_EDEFAULT == null
					? s3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference != null
					: !S3_BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE_EDEFAULT
							.equals(s3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference);
		case Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__ADDITIONAL_CODE:
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
		result.append(" (logDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_: ");
		result.append(logDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_);
		result.append(", iamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference: ");
		result.append(iamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference);
		result.append(", logGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference: ");
		result.append(logGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference);
		result.append(", s3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference: ");
		result.append(s3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference);
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

} //FlowLogDestinationConfigBuilder_ec2Impl
