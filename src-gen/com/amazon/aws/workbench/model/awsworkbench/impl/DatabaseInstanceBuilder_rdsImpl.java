/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds;
import com.amazon.aws.workbench.model.awsworkbench.LicenseModel;
import com.amazon.aws.workbench.model.awsworkbench.PerformanceInsightRetention;
import com.amazon.aws.workbench.model.awsworkbench.RemovalPolicy;
import com.amazon.aws.workbench.model.awsworkbench.RetentionDays;
import com.amazon.aws.workbench.model.awsworkbench.StorageType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Instance Builder rds</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getAutoMinorVersionUpgrade_java_lang_Boolean_ <em>Auto Minor Version Upgrade java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getAvailabilityZone_java_lang_String_ <em>Availability Zone java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getBackupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Backup Retention With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getCloudwatchLogsExports_java_lang_String_AsList <em>Cloudwatch Logs Exports java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getCloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays_ <em>Cloudwatch Logs Retention software amazon awscdk services logs Retention Days </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getCloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Cloudwatch Logs Retention Role With IRole software amazon awscdk services iam IRole As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getCopyTagsToSnapshot_java_lang_Boolean_ <em>Copy Tags To Snapshot java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getDeleteAutomatedBackups_java_lang_Boolean_ <em>Delete Automated Backups java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getDeletionProtection_java_lang_Boolean_ <em>Deletion Protection java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getEnablePerformanceInsights_java_lang_Boolean_ <em>Enable Performance Insights java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getIamAuthentication_java_lang_Boolean_ <em>Iam Authentication java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getInstanceIdentifier_java_lang_String_ <em>Instance Identifier java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getIops_java_lang_Number_ <em>Iops java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getMaxAllocatedStorage_java_lang_Number_ <em>Max Allocated Storage java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getMonitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Monitoring Interval With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getMonitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Monitoring Role With IRole software amazon awscdk services iam IRole As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getMultiAz_java_lang_Boolean_ <em>Multi Az java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getOptionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReference <em>Option Group With IOption Group software amazon awscdk services rds IOption Group As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getPerformanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference <em>Performance Insight Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getPerformanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention_ <em>Performance Insight Retention software amazon awscdk services rds Performance Insight Retention </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getPort_java_lang_Number_ <em>Port java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getPreferredBackupWindow_java_lang_String_ <em>Preferred Backup Window java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getPreferredMaintenanceWindow_java_lang_String_ <em>Preferred Maintenance Window java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getProcessorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReference <em>Processor Features With Processor Features software amazon awscdk services rds Processor Features As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ <em>Removal Policy software amazon awscdk core Removal Policy </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList <em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getStorageType_software_amazon_awscdk_services_rds_StorageType_ <em>Storage Type software amazon awscdk services rds Storage Type </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getVpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Vpc Placement With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference <em>Engine With IInstance Engine software amazon awscdk services rds IInstance Engine As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getAllocatedStorage_java_lang_Number_ <em>Allocated Storage java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getAllowMajorVersionUpgrade_java_lang_Boolean_ <em>Allow Major Version Upgrade java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getDatabaseName_java_lang_String_ <em>Database Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference <em>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getLicenseModel_software_amazon_awscdk_services_rds_LicenseModel_ <em>License Model software amazon awscdk services rds License Model </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getMasterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference <em>Master User Password With Secret Value software amazon awscdk core Secret Value As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getMasterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference <em>Master User Password Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getParameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReference <em>Parameter Group With IParameter Group software amazon awscdk services rds IParameter Group As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getTimezone_java_lang_String_ <em>Timezone java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getMasterUsername_java_lang_String_ <em>Master Username java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getCharacterSetName_java_lang_String_ <em>Character Set Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getStorageEncrypted_java_lang_Boolean_ <em>Storage Encrypted java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getStorageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference <em>Storage Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DatabaseInstanceBuilder_rdsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabaseInstanceBuilder_rdsImpl extends ServiceResourcesImpl implements DatabaseInstanceBuilder_rds {
	/**
	 * The default value of the '{@link #getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference = VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutoMinorVersionUpgrade_java_lang_Boolean_() <em>Auto Minor Version Upgrade java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoMinorVersionUpgrade_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AUTO_MINOR_VERSION_UPGRADE_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutoMinorVersionUpgrade_java_lang_Boolean_() <em>Auto Minor Version Upgrade java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoMinorVersionUpgrade_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean autoMinorVersionUpgrade_java_lang_Boolean_ = AUTO_MINOR_VERSION_UPGRADE_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailabilityZone_java_lang_String_() <em>Availability Zone java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityZone_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String AVAILABILITY_ZONE_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailabilityZone_java_lang_String_() <em>Availability Zone java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityZone_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String availabilityZone_java_lang_String_ = AVAILABILITY_ZONE_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getBackupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Backup Retention With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKUP_RETENTION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Backup Retention With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String backupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReference = BACKUP_RETENTION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloudwatchLogsExports_java_lang_String_AsList() <em>Cloudwatch Logs Exports java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudwatchLogsExports_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOUDWATCH_LOGS_EXPORTS_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCloudwatchLogsExports_java_lang_String_AsList() <em>Cloudwatch Logs Exports java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudwatchLogsExports_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String cloudwatchLogsExports_java_lang_String_AsList = CLOUDWATCH_LOGS_EXPORTS_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays_() <em>Cloudwatch Logs Retention software amazon awscdk services logs Retention Days </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays_()
	 * @generated
	 * @ordered
	 */
	protected static final RetentionDays CLOUDWATCH_LOGS_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS__EDEFAULT = RetentionDays.ONE_DAY;

	/**
	 * The cached value of the '{@link #getCloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays_() <em>Cloudwatch Logs Retention software amazon awscdk services logs Retention Days </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays_()
	 * @generated
	 * @ordered
	 */
	protected RetentionDays cloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays_ = CLOUDWATCH_LOGS_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS__EDEFAULT;

	/**
	 * The default value of the '{@link #getCloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() <em>Cloudwatch Logs Retention Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOUDWATCH_LOGS_RETENTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() <em>Cloudwatch Logs Retention Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String cloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference = CLOUDWATCH_LOGS_RETENTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopyTagsToSnapshot_java_lang_Boolean_() <em>Copy Tags To Snapshot java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyTagsToSnapshot_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean COPY_TAGS_TO_SNAPSHOT_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopyTagsToSnapshot_java_lang_Boolean_() <em>Copy Tags To Snapshot java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyTagsToSnapshot_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean copyTagsToSnapshot_java_lang_Boolean_ = COPY_TAGS_TO_SNAPSHOT_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getDeleteAutomatedBackups_java_lang_Boolean_() <em>Delete Automated Backups java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteAutomatedBackups_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DELETE_AUTOMATED_BACKUPS_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeleteAutomatedBackups_java_lang_Boolean_() <em>Delete Automated Backups java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteAutomatedBackups_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean deleteAutomatedBackups_java_lang_Boolean_ = DELETE_AUTOMATED_BACKUPS_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getDeletionProtection_java_lang_Boolean_() <em>Deletion Protection java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletionProtection_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DELETION_PROTECTION_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeletionProtection_java_lang_Boolean_() <em>Deletion Protection java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletionProtection_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean deletionProtection_java_lang_Boolean_ = DELETION_PROTECTION_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getEnablePerformanceInsights_java_lang_Boolean_() <em>Enable Performance Insights java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnablePerformanceInsights_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ENABLE_PERFORMANCE_INSIGHTS_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnablePerformanceInsights_java_lang_Boolean_() <em>Enable Performance Insights java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnablePerformanceInsights_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean enablePerformanceInsights_java_lang_Boolean_ = ENABLE_PERFORMANCE_INSIGHTS_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getIamAuthentication_java_lang_Boolean_() <em>Iam Authentication java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIamAuthentication_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IAM_AUTHENTICATION_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIamAuthentication_java_lang_Boolean_() <em>Iam Authentication java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIamAuthentication_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean iamAuthentication_java_lang_Boolean_ = IAM_AUTHENTICATION_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceIdentifier_java_lang_String_() <em>Instance Identifier java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceIdentifier_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_IDENTIFIER_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceIdentifier_java_lang_String_() <em>Instance Identifier java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceIdentifier_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String instanceIdentifier_java_lang_String_ = INSTANCE_IDENTIFIER_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getIops_java_lang_Number_() <em>Iops java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIops_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int IOPS_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIops_java_lang_Number_() <em>Iops java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIops_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int iops_java_lang_Number_ = IOPS_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxAllocatedStorage_java_lang_Number_() <em>Max Allocated Storage java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAllocatedStorage_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ALLOCATED_STORAGE_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxAllocatedStorage_java_lang_Number_() <em>Max Allocated Storage java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAllocatedStorage_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int maxAllocatedStorage_java_lang_Number_ = MAX_ALLOCATED_STORAGE_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getMonitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Monitoring Interval With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String MONITORING_INTERVAL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMonitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Monitoring Interval With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String monitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference = MONITORING_INTERVAL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() <em>Monitoring Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String MONITORING_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMonitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() <em>Monitoring Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String monitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference = MONITORING_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiAz_java_lang_Boolean_() <em>Multi Az java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiAz_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MULTI_AZ_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiAz_java_lang_Boolean_() <em>Multi Az java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiAz_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean multiAz_java_lang_Boolean_ = MULTI_AZ_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getOptionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReference() <em>Option Group With IOption Group software amazon awscdk services rds IOption Group As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String OPTION_GROUP_WITH_IOPTION_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IOPTION_GROUP_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOptionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReference() <em>Option Group With IOption Group software amazon awscdk services rds IOption Group As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String optionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReference = OPTION_GROUP_WITH_IOPTION_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IOPTION_GROUP_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerformanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference() <em>Performance Insight Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String PERFORMANCE_INSIGHT_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerformanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference() <em>Performance Insight Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String performanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference = PERFORMANCE_INSIGHT_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerformanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention_() <em>Performance Insight Retention software amazon awscdk services rds Performance Insight Retention </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention_()
	 * @generated
	 * @ordered
	 */
	protected static final PerformanceInsightRetention PERFORMANCE_INSIGHT_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_PERFORMANCE_INSIGHT_RETENTION__EDEFAULT = PerformanceInsightRetention.DEFAULT;

	/**
	 * The cached value of the '{@link #getPerformanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention_() <em>Performance Insight Retention software amazon awscdk services rds Performance Insight Retention </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention_()
	 * @generated
	 * @ordered
	 */
	protected PerformanceInsightRetention performanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention_ = PERFORMANCE_INSIGHT_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_PERFORMANCE_INSIGHT_RETENTION__EDEFAULT;

	/**
	 * The default value of the '{@link #getPort_java_lang_Number_() <em>Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPort_java_lang_Number_() <em>Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int port_java_lang_Number_ = PORT_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getPreferredBackupWindow_java_lang_String_() <em>Preferred Backup Window java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredBackupWindow_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFERRED_BACKUP_WINDOW_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreferredBackupWindow_java_lang_String_() <em>Preferred Backup Window java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredBackupWindow_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String preferredBackupWindow_java_lang_String_ = PREFERRED_BACKUP_WINDOW_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getPreferredMaintenanceWindow_java_lang_String_() <em>Preferred Maintenance Window java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredMaintenanceWindow_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFERRED_MAINTENANCE_WINDOW_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreferredMaintenanceWindow_java_lang_String_() <em>Preferred Maintenance Window java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredMaintenanceWindow_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String preferredMaintenanceWindow_java_lang_String_ = PREFERRED_MAINTENANCE_WINDOW_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReference() <em>Processor Features With Processor Features software amazon awscdk services rds Processor Features As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESSOR_FEATURES_WITH_PROCESSOR_FEATURES_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_PROCESSOR_FEATURES_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReference() <em>Processor Features With Processor Features software amazon awscdk services rds Processor Features As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String processorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReference = PROCESSOR_FEATURES_WITH_PROCESSOR_FEATURES_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_PROCESSOR_FEATURES_AS_REFERENCE_EDEFAULT;

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
	 * The default value of the '{@link #getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList() <em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList() <em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList()
	 * @generated
	 * @ordered
	 */
	protected String securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList = SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getStorageType_software_amazon_awscdk_services_rds_StorageType_() <em>Storage Type software amazon awscdk services rds Storage Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageType_software_amazon_awscdk_services_rds_StorageType_()
	 * @generated
	 * @ordered
	 */
	protected static final StorageType STORAGE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_STORAGE_TYPE__EDEFAULT = StorageType.STANDARD;

	/**
	 * The cached value of the '{@link #getStorageType_software_amazon_awscdk_services_rds_StorageType_() <em>Storage Type software amazon awscdk services rds Storage Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageType_software_amazon_awscdk_services_rds_StorageType_()
	 * @generated
	 * @ordered
	 */
	protected StorageType storageType_software_amazon_awscdk_services_rds_StorageType_ = STORAGE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_STORAGE_TYPE__EDEFAULT;

	/**
	 * The default value of the '{@link #getVpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() <em>Vpc Placement With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String VPC_PLACEMENT_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() <em>Vpc Placement With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String vpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference = VPC_PLACEMENT_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference() <em>Engine With IInstance Engine software amazon awscdk services rds IInstance Engine As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String ENGINE_WITH_IINSTANCE_ENGINE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IINSTANCE_ENGINE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference() <em>Engine With IInstance Engine software amazon awscdk services rds IInstance Engine As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String engineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference = ENGINE_WITH_IINSTANCE_ENGINE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IINSTANCE_ENGINE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllocatedStorage_java_lang_Number_() <em>Allocated Storage java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedStorage_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int ALLOCATED_STORAGE_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAllocatedStorage_java_lang_Number_() <em>Allocated Storage java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedStorage_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int allocatedStorage_java_lang_Number_ = ALLOCATED_STORAGE_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowMajorVersionUpgrade_java_lang_Boolean_() <em>Allow Major Version Upgrade java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowMajorVersionUpgrade_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_MAJOR_VERSION_UPGRADE_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowMajorVersionUpgrade_java_lang_Boolean_() <em>Allow Major Version Upgrade java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowMajorVersionUpgrade_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowMajorVersionUpgrade_java_lang_Boolean_ = ALLOW_MAJOR_VERSION_UPGRADE_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabaseName_java_lang_String_() <em>Database Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabaseName_java_lang_String_() <em>Database Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String databaseName_java_lang_String_ = DATABASE_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference() <em>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference() <em>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference = INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLicenseModel_software_amazon_awscdk_services_rds_LicenseModel_() <em>License Model software amazon awscdk services rds License Model </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenseModel_software_amazon_awscdk_services_rds_LicenseModel_()
	 * @generated
	 * @ordered
	 */
	protected static final LicenseModel LICENSE_MODEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_LICENSE_MODEL__EDEFAULT = LicenseModel.LICENSE_INCLUDED;

	/**
	 * The cached value of the '{@link #getLicenseModel_software_amazon_awscdk_services_rds_LicenseModel_() <em>License Model software amazon awscdk services rds License Model </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenseModel_software_amazon_awscdk_services_rds_LicenseModel_()
	 * @generated
	 * @ordered
	 */
	protected LicenseModel licenseModel_software_amazon_awscdk_services_rds_LicenseModel_ = LICENSE_MODEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_LICENSE_MODEL__EDEFAULT;

	/**
	 * The default value of the '{@link #getMasterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference() <em>Master User Password With Secret Value software amazon awscdk core Secret Value As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String MASTER_USER_PASSWORD_WITH_SECRET_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_SECRET_VALUE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMasterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference() <em>Master User Password With Secret Value software amazon awscdk core Secret Value As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String masterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference = MASTER_USER_PASSWORD_WITH_SECRET_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_SECRET_VALUE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMasterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference() <em>Master User Password Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String MASTER_USER_PASSWORD_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMasterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference() <em>Master User Password Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String masterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference = MASTER_USER_PASSWORD_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReference() <em>Parameter Group With IParameter Group software amazon awscdk services rds IParameter Group As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_GROUP_WITH_IPARAMETER_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IPARAMETER_GROUP_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReference() <em>Parameter Group With IParameter Group software amazon awscdk services rds IParameter Group As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String parameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReference = PARAMETER_GROUP_WITH_IPARAMETER_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IPARAMETER_GROUP_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimezone_java_lang_String_() <em>Timezone java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimezone_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEZONE_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimezone_java_lang_String_() <em>Timezone java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimezone_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String timezone_java_lang_String_ = TIMEZONE_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getMasterUsername_java_lang_String_() <em>Master Username java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterUsername_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String MASTER_USERNAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMasterUsername_java_lang_String_() <em>Master Username java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterUsername_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String masterUsername_java_lang_String_ = MASTER_USERNAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getCharacterSetName_java_lang_String_() <em>Character Set Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterSetName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String CHARACTER_SET_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharacterSetName_java_lang_String_() <em>Character Set Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterSetName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String characterSetName_java_lang_String_ = CHARACTER_SET_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getStorageEncrypted_java_lang_Boolean_() <em>Storage Encrypted java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageEncrypted_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean STORAGE_ENCRYPTED_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStorageEncrypted_java_lang_Boolean_() <em>Storage Encrypted java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageEncrypted_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean storageEncrypted_java_lang_Boolean_ = STORAGE_ENCRYPTED_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getStorageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference() <em>Storage Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String STORAGE_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStorageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference() <em>Storage Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String storageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference = STORAGE_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.rds.DatabaseInstance";

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
	protected DatabaseInstanceBuilder_rdsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() {
		return vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(
			String newVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference) {
		String oldVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference = vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference;
		vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference = newVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE,
					oldVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference,
					vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAutoMinorVersionUpgrade_java_lang_Boolean_() {
		return autoMinorVersionUpgrade_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoMinorVersionUpgrade_java_lang_Boolean_(Boolean newAutoMinorVersionUpgrade_java_lang_Boolean_) {
		Boolean oldAutoMinorVersionUpgrade_java_lang_Boolean_ = autoMinorVersionUpgrade_java_lang_Boolean_;
		autoMinorVersionUpgrade_java_lang_Boolean_ = newAutoMinorVersionUpgrade_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__AUTO_MINOR_VERSION_UPGRADE_JAVA_LANG_BOOLEAN_,
					oldAutoMinorVersionUpgrade_java_lang_Boolean_, autoMinorVersionUpgrade_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAvailabilityZone_java_lang_String_() {
		return availabilityZone_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailabilityZone_java_lang_String_(String newAvailabilityZone_java_lang_String_) {
		String oldAvailabilityZone_java_lang_String_ = availabilityZone_java_lang_String_;
		availabilityZone_java_lang_String_ = newAvailabilityZone_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__AVAILABILITY_ZONE_JAVA_LANG_STRING_,
					oldAvailabilityZone_java_lang_String_, availabilityZone_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBackupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return backupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newBackupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldBackupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReference = backupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		backupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReference = newBackupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__BACKUP_RETENTION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldBackupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					backupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCloudwatchLogsExports_java_lang_String_AsList() {
		return cloudwatchLogsExports_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCloudwatchLogsExports_java_lang_String_AsList(
			String newCloudwatchLogsExports_java_lang_String_AsList) {
		String oldCloudwatchLogsExports_java_lang_String_AsList = cloudwatchLogsExports_java_lang_String_AsList;
		cloudwatchLogsExports_java_lang_String_AsList = newCloudwatchLogsExports_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__CLOUDWATCH_LOGS_EXPORTS_JAVA_LANG_STRING_AS_LIST,
					oldCloudwatchLogsExports_java_lang_String_AsList, cloudwatchLogsExports_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RetentionDays getCloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays_() {
		return cloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays_(
			RetentionDays newCloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays_) {
		RetentionDays oldCloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays_ = cloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays_;
		cloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays_ = newCloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays_ == null
				? CLOUDWATCH_LOGS_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS__EDEFAULT
				: newCloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__CLOUDWATCH_LOGS_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS_,
					oldCloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays_,
					cloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() {
		return cloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(
			String newCloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference) {
		String oldCloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference = cloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference;
		cloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference = newCloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__CLOUDWATCH_LOGS_RETENTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE,
					oldCloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference,
					cloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCopyTagsToSnapshot_java_lang_Boolean_() {
		return copyTagsToSnapshot_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCopyTagsToSnapshot_java_lang_Boolean_(Boolean newCopyTagsToSnapshot_java_lang_Boolean_) {
		Boolean oldCopyTagsToSnapshot_java_lang_Boolean_ = copyTagsToSnapshot_java_lang_Boolean_;
		copyTagsToSnapshot_java_lang_Boolean_ = newCopyTagsToSnapshot_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__COPY_TAGS_TO_SNAPSHOT_JAVA_LANG_BOOLEAN_,
					oldCopyTagsToSnapshot_java_lang_Boolean_, copyTagsToSnapshot_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDeleteAutomatedBackups_java_lang_Boolean_() {
		return deleteAutomatedBackups_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeleteAutomatedBackups_java_lang_Boolean_(Boolean newDeleteAutomatedBackups_java_lang_Boolean_) {
		Boolean oldDeleteAutomatedBackups_java_lang_Boolean_ = deleteAutomatedBackups_java_lang_Boolean_;
		deleteAutomatedBackups_java_lang_Boolean_ = newDeleteAutomatedBackups_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__DELETE_AUTOMATED_BACKUPS_JAVA_LANG_BOOLEAN_,
					oldDeleteAutomatedBackups_java_lang_Boolean_, deleteAutomatedBackups_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDeletionProtection_java_lang_Boolean_() {
		return deletionProtection_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeletionProtection_java_lang_Boolean_(Boolean newDeletionProtection_java_lang_Boolean_) {
		Boolean oldDeletionProtection_java_lang_Boolean_ = deletionProtection_java_lang_Boolean_;
		deletionProtection_java_lang_Boolean_ = newDeletionProtection_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__DELETION_PROTECTION_JAVA_LANG_BOOLEAN_,
					oldDeletionProtection_java_lang_Boolean_, deletionProtection_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getEnablePerformanceInsights_java_lang_Boolean_() {
		return enablePerformanceInsights_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnablePerformanceInsights_java_lang_Boolean_(
			Boolean newEnablePerformanceInsights_java_lang_Boolean_) {
		Boolean oldEnablePerformanceInsights_java_lang_Boolean_ = enablePerformanceInsights_java_lang_Boolean_;
		enablePerformanceInsights_java_lang_Boolean_ = newEnablePerformanceInsights_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__ENABLE_PERFORMANCE_INSIGHTS_JAVA_LANG_BOOLEAN_,
					oldEnablePerformanceInsights_java_lang_Boolean_, enablePerformanceInsights_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIamAuthentication_java_lang_Boolean_() {
		return iamAuthentication_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIamAuthentication_java_lang_Boolean_(Boolean newIamAuthentication_java_lang_Boolean_) {
		Boolean oldIamAuthentication_java_lang_Boolean_ = iamAuthentication_java_lang_Boolean_;
		iamAuthentication_java_lang_Boolean_ = newIamAuthentication_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__IAM_AUTHENTICATION_JAVA_LANG_BOOLEAN_,
					oldIamAuthentication_java_lang_Boolean_, iamAuthentication_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstanceIdentifier_java_lang_String_() {
		return instanceIdentifier_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstanceIdentifier_java_lang_String_(String newInstanceIdentifier_java_lang_String_) {
		String oldInstanceIdentifier_java_lang_String_ = instanceIdentifier_java_lang_String_;
		instanceIdentifier_java_lang_String_ = newInstanceIdentifier_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__INSTANCE_IDENTIFIER_JAVA_LANG_STRING_,
					oldInstanceIdentifier_java_lang_String_, instanceIdentifier_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIops_java_lang_Number_() {
		return iops_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIops_java_lang_Number_(int newIops_java_lang_Number_) {
		int oldIops_java_lang_Number_ = iops_java_lang_Number_;
		iops_java_lang_Number_ = newIops_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__IOPS_JAVA_LANG_NUMBER_,
					oldIops_java_lang_Number_, iops_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxAllocatedStorage_java_lang_Number_() {
		return maxAllocatedStorage_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxAllocatedStorage_java_lang_Number_(int newMaxAllocatedStorage_java_lang_Number_) {
		int oldMaxAllocatedStorage_java_lang_Number_ = maxAllocatedStorage_java_lang_Number_;
		maxAllocatedStorage_java_lang_Number_ = newMaxAllocatedStorage_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MAX_ALLOCATED_STORAGE_JAVA_LANG_NUMBER_,
					oldMaxAllocatedStorage_java_lang_Number_, maxAllocatedStorage_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMonitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return monitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newMonitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldMonitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference = monitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		monitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference = newMonitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MONITORING_INTERVAL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldMonitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					monitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMonitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() {
		return monitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(
			String newMonitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference) {
		String oldMonitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference = monitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference;
		monitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference = newMonitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MONITORING_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE,
					oldMonitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference,
					monitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getMultiAz_java_lang_Boolean_() {
		return multiAz_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiAz_java_lang_Boolean_(Boolean newMultiAz_java_lang_Boolean_) {
		Boolean oldMultiAz_java_lang_Boolean_ = multiAz_java_lang_Boolean_;
		multiAz_java_lang_Boolean_ = newMultiAz_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MULTI_AZ_JAVA_LANG_BOOLEAN_,
					oldMultiAz_java_lang_Boolean_, multiAz_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOptionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReference() {
		return optionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReference(
			String newOptionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReference) {
		String oldOptionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReference = optionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReference;
		optionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReference = newOptionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__OPTION_GROUP_WITH_IOPTION_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IOPTION_GROUP_AS_REFERENCE,
					oldOptionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReference,
					optionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPerformanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference() {
		return performanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerformanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(
			String newPerformanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference) {
		String oldPerformanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference = performanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference;
		performanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference = newPerformanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PERFORMANCE_INSIGHT_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE,
					oldPerformanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference,
					performanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerformanceInsightRetention getPerformanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention_() {
		return performanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerformanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention_(
			PerformanceInsightRetention newPerformanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention_) {
		PerformanceInsightRetention oldPerformanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention_ = performanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention_;
		performanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention_ = newPerformanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention_ == null
				? PERFORMANCE_INSIGHT_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_PERFORMANCE_INSIGHT_RETENTION__EDEFAULT
				: newPerformanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PERFORMANCE_INSIGHT_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_PERFORMANCE_INSIGHT_RETENTION_,
					oldPerformanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention_,
					performanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPort_java_lang_Number_() {
		return port_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPort_java_lang_Number_(int newPort_java_lang_Number_) {
		int oldPort_java_lang_Number_ = port_java_lang_Number_;
		port_java_lang_Number_ = newPort_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PORT_JAVA_LANG_NUMBER_,
					oldPort_java_lang_Number_, port_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPreferredBackupWindow_java_lang_String_() {
		return preferredBackupWindow_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreferredBackupWindow_java_lang_String_(String newPreferredBackupWindow_java_lang_String_) {
		String oldPreferredBackupWindow_java_lang_String_ = preferredBackupWindow_java_lang_String_;
		preferredBackupWindow_java_lang_String_ = newPreferredBackupWindow_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PREFERRED_BACKUP_WINDOW_JAVA_LANG_STRING_,
					oldPreferredBackupWindow_java_lang_String_, preferredBackupWindow_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPreferredMaintenanceWindow_java_lang_String_() {
		return preferredMaintenanceWindow_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreferredMaintenanceWindow_java_lang_String_(
			String newPreferredMaintenanceWindow_java_lang_String_) {
		String oldPreferredMaintenanceWindow_java_lang_String_ = preferredMaintenanceWindow_java_lang_String_;
		preferredMaintenanceWindow_java_lang_String_ = newPreferredMaintenanceWindow_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PREFERRED_MAINTENANCE_WINDOW_JAVA_LANG_STRING_,
					oldPreferredMaintenanceWindow_java_lang_String_, preferredMaintenanceWindow_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProcessorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReference() {
		return processorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReference(
			String newProcessorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReference) {
		String oldProcessorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReference = processorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReference;
		processorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReference = newProcessorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PROCESSOR_FEATURES_WITH_PROCESSOR_FEATURES_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_PROCESSOR_FEATURES_AS_REFERENCE,
					oldProcessorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReference,
					processorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReference));
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
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_,
					oldRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_,
					removalPolicy_software_amazon_awscdk_core_RemovalPolicy_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList() {
		return securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList(
			String newSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList) {
		String oldSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList = securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList;
		securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList = newSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST,
					oldSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList,
					securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StorageType getStorageType_software_amazon_awscdk_services_rds_StorageType_() {
		return storageType_software_amazon_awscdk_services_rds_StorageType_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorageType_software_amazon_awscdk_services_rds_StorageType_(
			StorageType newStorageType_software_amazon_awscdk_services_rds_StorageType_) {
		StorageType oldStorageType_software_amazon_awscdk_services_rds_StorageType_ = storageType_software_amazon_awscdk_services_rds_StorageType_;
		storageType_software_amazon_awscdk_services_rds_StorageType_ = newStorageType_software_amazon_awscdk_services_rds_StorageType_ == null
				? STORAGE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_STORAGE_TYPE__EDEFAULT
				: newStorageType_software_amazon_awscdk_services_rds_StorageType_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__STORAGE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_STORAGE_TYPE_,
					oldStorageType_software_amazon_awscdk_services_rds_StorageType_,
					storageType_software_amazon_awscdk_services_rds_StorageType_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() {
		return vpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(
			String newVpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference) {
		String oldVpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference = vpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference;
		vpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference = newVpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__VPC_PLACEMENT_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE,
					oldVpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference,
					vpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference() {
		return engineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference(
			String newEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference) {
		String oldEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference = engineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference;
		engineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference = newEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__ENGINE_WITH_IINSTANCE_ENGINE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IINSTANCE_ENGINE_AS_REFERENCE,
					oldEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference,
					engineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAllocatedStorage_java_lang_Number_() {
		return allocatedStorage_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllocatedStorage_java_lang_Number_(int newAllocatedStorage_java_lang_Number_) {
		int oldAllocatedStorage_java_lang_Number_ = allocatedStorage_java_lang_Number_;
		allocatedStorage_java_lang_Number_ = newAllocatedStorage_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__ALLOCATED_STORAGE_JAVA_LANG_NUMBER_,
					oldAllocatedStorage_java_lang_Number_, allocatedStorage_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAllowMajorVersionUpgrade_java_lang_Boolean_() {
		return allowMajorVersionUpgrade_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowMajorVersionUpgrade_java_lang_Boolean_(Boolean newAllowMajorVersionUpgrade_java_lang_Boolean_) {
		Boolean oldAllowMajorVersionUpgrade_java_lang_Boolean_ = allowMajorVersionUpgrade_java_lang_Boolean_;
		allowMajorVersionUpgrade_java_lang_Boolean_ = newAllowMajorVersionUpgrade_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__ALLOW_MAJOR_VERSION_UPGRADE_JAVA_LANG_BOOLEAN_,
					oldAllowMajorVersionUpgrade_java_lang_Boolean_, allowMajorVersionUpgrade_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDatabaseName_java_lang_String_() {
		return databaseName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatabaseName_java_lang_String_(String newDatabaseName_java_lang_String_) {
		String oldDatabaseName_java_lang_String_ = databaseName_java_lang_String_;
		databaseName_java_lang_String_ = newDatabaseName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__DATABASE_NAME_JAVA_LANG_STRING_,
					oldDatabaseName_java_lang_String_, databaseName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference() {
		return instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference(
			String newInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference) {
		String oldInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference = instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference;
		instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference = newInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE,
					oldInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference,
					instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LicenseModel getLicenseModel_software_amazon_awscdk_services_rds_LicenseModel_() {
		return licenseModel_software_amazon_awscdk_services_rds_LicenseModel_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLicenseModel_software_amazon_awscdk_services_rds_LicenseModel_(
			LicenseModel newLicenseModel_software_amazon_awscdk_services_rds_LicenseModel_) {
		LicenseModel oldLicenseModel_software_amazon_awscdk_services_rds_LicenseModel_ = licenseModel_software_amazon_awscdk_services_rds_LicenseModel_;
		licenseModel_software_amazon_awscdk_services_rds_LicenseModel_ = newLicenseModel_software_amazon_awscdk_services_rds_LicenseModel_ == null
				? LICENSE_MODEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_LICENSE_MODEL__EDEFAULT
				: newLicenseModel_software_amazon_awscdk_services_rds_LicenseModel_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__LICENSE_MODEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_LICENSE_MODEL_,
					oldLicenseModel_software_amazon_awscdk_services_rds_LicenseModel_,
					licenseModel_software_amazon_awscdk_services_rds_LicenseModel_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMasterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference() {
		return masterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMasterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference(
			String newMasterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference) {
		String oldMasterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference = masterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference;
		masterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference = newMasterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MASTER_USER_PASSWORD_WITH_SECRET_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_SECRET_VALUE_AS_REFERENCE,
					oldMasterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference,
					masterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMasterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference() {
		return masterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMasterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(
			String newMasterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference) {
		String oldMasterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference = masterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference;
		masterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference = newMasterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MASTER_USER_PASSWORD_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE,
					oldMasterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference,
					masterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReference() {
		return parameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReference(
			String newParameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReference) {
		String oldParameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReference = parameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReference;
		parameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReference = newParameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PARAMETER_GROUP_WITH_IPARAMETER_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IPARAMETER_GROUP_AS_REFERENCE,
					oldParameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReference,
					parameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimezone_java_lang_String_() {
		return timezone_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimezone_java_lang_String_(String newTimezone_java_lang_String_) {
		String oldTimezone_java_lang_String_ = timezone_java_lang_String_;
		timezone_java_lang_String_ = newTimezone_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__TIMEZONE_JAVA_LANG_STRING_,
					oldTimezone_java_lang_String_, timezone_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMasterUsername_java_lang_String_() {
		return masterUsername_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMasterUsername_java_lang_String_(String newMasterUsername_java_lang_String_) {
		String oldMasterUsername_java_lang_String_ = masterUsername_java_lang_String_;
		masterUsername_java_lang_String_ = newMasterUsername_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MASTER_USERNAME_JAVA_LANG_STRING_,
					oldMasterUsername_java_lang_String_, masterUsername_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCharacterSetName_java_lang_String_() {
		return characterSetName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCharacterSetName_java_lang_String_(String newCharacterSetName_java_lang_String_) {
		String oldCharacterSetName_java_lang_String_ = characterSetName_java_lang_String_;
		characterSetName_java_lang_String_ = newCharacterSetName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__CHARACTER_SET_NAME_JAVA_LANG_STRING_,
					oldCharacterSetName_java_lang_String_, characterSetName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getStorageEncrypted_java_lang_Boolean_() {
		return storageEncrypted_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorageEncrypted_java_lang_Boolean_(Boolean newStorageEncrypted_java_lang_Boolean_) {
		Boolean oldStorageEncrypted_java_lang_Boolean_ = storageEncrypted_java_lang_Boolean_;
		storageEncrypted_java_lang_Boolean_ = newStorageEncrypted_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__STORAGE_ENCRYPTED_JAVA_LANG_BOOLEAN_,
					oldStorageEncrypted_java_lang_Boolean_, storageEncrypted_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStorageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference() {
		return storageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(
			String newStorageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference) {
		String oldStorageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference = storageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference;
		storageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference = newStorageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__STORAGE_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE,
					oldStorageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference,
					storageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference));
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
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			return getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__AUTO_MINOR_VERSION_UPGRADE_JAVA_LANG_BOOLEAN_:
			return getAutoMinorVersionUpgrade_java_lang_Boolean_();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__AVAILABILITY_ZONE_JAVA_LANG_STRING_:
			return getAvailabilityZone_java_lang_String_();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__BACKUP_RETENTION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getBackupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__CLOUDWATCH_LOGS_EXPORTS_JAVA_LANG_STRING_AS_LIST:
			return getCloudwatchLogsExports_java_lang_String_AsList();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__CLOUDWATCH_LOGS_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS_:
			return getCloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays_();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__CLOUDWATCH_LOGS_RETENTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			return getCloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__COPY_TAGS_TO_SNAPSHOT_JAVA_LANG_BOOLEAN_:
			return getCopyTagsToSnapshot_java_lang_Boolean_();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__DELETE_AUTOMATED_BACKUPS_JAVA_LANG_BOOLEAN_:
			return getDeleteAutomatedBackups_java_lang_Boolean_();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__DELETION_PROTECTION_JAVA_LANG_BOOLEAN_:
			return getDeletionProtection_java_lang_Boolean_();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__ENABLE_PERFORMANCE_INSIGHTS_JAVA_LANG_BOOLEAN_:
			return getEnablePerformanceInsights_java_lang_Boolean_();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__IAM_AUTHENTICATION_JAVA_LANG_BOOLEAN_:
			return getIamAuthentication_java_lang_Boolean_();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__INSTANCE_IDENTIFIER_JAVA_LANG_STRING_:
			return getInstanceIdentifier_java_lang_String_();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__IOPS_JAVA_LANG_NUMBER_:
			return getIops_java_lang_Number_();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MAX_ALLOCATED_STORAGE_JAVA_LANG_NUMBER_:
			return getMaxAllocatedStorage_java_lang_Number_();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MONITORING_INTERVAL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getMonitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MONITORING_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			return getMonitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MULTI_AZ_JAVA_LANG_BOOLEAN_:
			return getMultiAz_java_lang_Boolean_();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__OPTION_GROUP_WITH_IOPTION_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IOPTION_GROUP_AS_REFERENCE:
			return getOptionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReference();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PERFORMANCE_INSIGHT_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			return getPerformanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PERFORMANCE_INSIGHT_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_PERFORMANCE_INSIGHT_RETENTION_:
			return getPerformanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention_();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PORT_JAVA_LANG_NUMBER_:
			return getPort_java_lang_Number_();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PREFERRED_BACKUP_WINDOW_JAVA_LANG_STRING_:
			return getPreferredBackupWindow_java_lang_String_();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PREFERRED_MAINTENANCE_WINDOW_JAVA_LANG_STRING_:
			return getPreferredMaintenanceWindow_java_lang_String_();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PROCESSOR_FEATURES_WITH_PROCESSOR_FEATURES_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_PROCESSOR_FEATURES_AS_REFERENCE:
			return getProcessorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReference();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
			return getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST:
			return getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__STORAGE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_STORAGE_TYPE_:
			return getStorageType_software_amazon_awscdk_services_rds_StorageType_();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__VPC_PLACEMENT_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
			return getVpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__ENGINE_WITH_IINSTANCE_ENGINE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IINSTANCE_ENGINE_AS_REFERENCE:
			return getEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__ALLOCATED_STORAGE_JAVA_LANG_NUMBER_:
			return getAllocatedStorage_java_lang_Number_();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__ALLOW_MAJOR_VERSION_UPGRADE_JAVA_LANG_BOOLEAN_:
			return getAllowMajorVersionUpgrade_java_lang_Boolean_();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__DATABASE_NAME_JAVA_LANG_STRING_:
			return getDatabaseName_java_lang_String_();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE:
			return getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__LICENSE_MODEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_LICENSE_MODEL_:
			return getLicenseModel_software_amazon_awscdk_services_rds_LicenseModel_();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MASTER_USER_PASSWORD_WITH_SECRET_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_SECRET_VALUE_AS_REFERENCE:
			return getMasterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MASTER_USER_PASSWORD_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			return getMasterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PARAMETER_GROUP_WITH_IPARAMETER_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IPARAMETER_GROUP_AS_REFERENCE:
			return getParameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReference();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__TIMEZONE_JAVA_LANG_STRING_:
			return getTimezone_java_lang_String_();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MASTER_USERNAME_JAVA_LANG_STRING_:
			return getMasterUsername_java_lang_String_();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__CHARACTER_SET_NAME_JAVA_LANG_STRING_:
			return getCharacterSetName_java_lang_String_();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__STORAGE_ENCRYPTED_JAVA_LANG_BOOLEAN_:
			return getStorageEncrypted_java_lang_Boolean_();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__STORAGE_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			return getStorageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__AUTO_MINOR_VERSION_UPGRADE_JAVA_LANG_BOOLEAN_:
			setAutoMinorVersionUpgrade_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__AVAILABILITY_ZONE_JAVA_LANG_STRING_:
			setAvailabilityZone_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__BACKUP_RETENTION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setBackupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__CLOUDWATCH_LOGS_EXPORTS_JAVA_LANG_STRING_AS_LIST:
			setCloudwatchLogsExports_java_lang_String_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__CLOUDWATCH_LOGS_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS_:
			setCloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays_((RetentionDays) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__CLOUDWATCH_LOGS_RETENTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			setCloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__COPY_TAGS_TO_SNAPSHOT_JAVA_LANG_BOOLEAN_:
			setCopyTagsToSnapshot_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__DELETE_AUTOMATED_BACKUPS_JAVA_LANG_BOOLEAN_:
			setDeleteAutomatedBackups_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__DELETION_PROTECTION_JAVA_LANG_BOOLEAN_:
			setDeletionProtection_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__ENABLE_PERFORMANCE_INSIGHTS_JAVA_LANG_BOOLEAN_:
			setEnablePerformanceInsights_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__IAM_AUTHENTICATION_JAVA_LANG_BOOLEAN_:
			setIamAuthentication_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__INSTANCE_IDENTIFIER_JAVA_LANG_STRING_:
			setInstanceIdentifier_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__IOPS_JAVA_LANG_NUMBER_:
			setIops_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MAX_ALLOCATED_STORAGE_JAVA_LANG_NUMBER_:
			setMaxAllocatedStorage_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MONITORING_INTERVAL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setMonitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MONITORING_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			setMonitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MULTI_AZ_JAVA_LANG_BOOLEAN_:
			setMultiAz_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__OPTION_GROUP_WITH_IOPTION_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IOPTION_GROUP_AS_REFERENCE:
			setOptionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PERFORMANCE_INSIGHT_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			setPerformanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PERFORMANCE_INSIGHT_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_PERFORMANCE_INSIGHT_RETENTION_:
			setPerformanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention_(
					(PerformanceInsightRetention) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PORT_JAVA_LANG_NUMBER_:
			setPort_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PREFERRED_BACKUP_WINDOW_JAVA_LANG_STRING_:
			setPreferredBackupWindow_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PREFERRED_MAINTENANCE_WINDOW_JAVA_LANG_STRING_:
			setPreferredMaintenanceWindow_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PROCESSOR_FEATURES_WITH_PROCESSOR_FEATURES_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_PROCESSOR_FEATURES_AS_REFERENCE:
			setProcessorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
			setRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_((RemovalPolicy) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST:
			setSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__STORAGE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_STORAGE_TYPE_:
			setStorageType_software_amazon_awscdk_services_rds_StorageType_((StorageType) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__VPC_PLACEMENT_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
			setVpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__ENGINE_WITH_IINSTANCE_ENGINE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IINSTANCE_ENGINE_AS_REFERENCE:
			setEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__ALLOCATED_STORAGE_JAVA_LANG_NUMBER_:
			setAllocatedStorage_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__ALLOW_MAJOR_VERSION_UPGRADE_JAVA_LANG_BOOLEAN_:
			setAllowMajorVersionUpgrade_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__DATABASE_NAME_JAVA_LANG_STRING_:
			setDatabaseName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE:
			setInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__LICENSE_MODEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_LICENSE_MODEL_:
			setLicenseModel_software_amazon_awscdk_services_rds_LicenseModel_((LicenseModel) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MASTER_USER_PASSWORD_WITH_SECRET_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_SECRET_VALUE_AS_REFERENCE:
			setMasterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MASTER_USER_PASSWORD_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			setMasterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PARAMETER_GROUP_WITH_IPARAMETER_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IPARAMETER_GROUP_AS_REFERENCE:
			setParameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__TIMEZONE_JAVA_LANG_STRING_:
			setTimezone_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MASTER_USERNAME_JAVA_LANG_STRING_:
			setMasterUsername_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__CHARACTER_SET_NAME_JAVA_LANG_STRING_:
			setCharacterSetName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__STORAGE_ENCRYPTED_JAVA_LANG_BOOLEAN_:
			setStorageEncrypted_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__STORAGE_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			setStorageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(
					VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__AUTO_MINOR_VERSION_UPGRADE_JAVA_LANG_BOOLEAN_:
			setAutoMinorVersionUpgrade_java_lang_Boolean_(AUTO_MINOR_VERSION_UPGRADE_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__AVAILABILITY_ZONE_JAVA_LANG_STRING_:
			setAvailabilityZone_java_lang_String_(AVAILABILITY_ZONE_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__BACKUP_RETENTION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setBackupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					BACKUP_RETENTION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__CLOUDWATCH_LOGS_EXPORTS_JAVA_LANG_STRING_AS_LIST:
			setCloudwatchLogsExports_java_lang_String_AsList(CLOUDWATCH_LOGS_EXPORTS_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__CLOUDWATCH_LOGS_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS_:
			setCloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays_(
					CLOUDWATCH_LOGS_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS__EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__CLOUDWATCH_LOGS_RETENTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			setCloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(
					CLOUDWATCH_LOGS_RETENTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__COPY_TAGS_TO_SNAPSHOT_JAVA_LANG_BOOLEAN_:
			setCopyTagsToSnapshot_java_lang_Boolean_(COPY_TAGS_TO_SNAPSHOT_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__DELETE_AUTOMATED_BACKUPS_JAVA_LANG_BOOLEAN_:
			setDeleteAutomatedBackups_java_lang_Boolean_(DELETE_AUTOMATED_BACKUPS_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__DELETION_PROTECTION_JAVA_LANG_BOOLEAN_:
			setDeletionProtection_java_lang_Boolean_(DELETION_PROTECTION_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__ENABLE_PERFORMANCE_INSIGHTS_JAVA_LANG_BOOLEAN_:
			setEnablePerformanceInsights_java_lang_Boolean_(ENABLE_PERFORMANCE_INSIGHTS_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__IAM_AUTHENTICATION_JAVA_LANG_BOOLEAN_:
			setIamAuthentication_java_lang_Boolean_(IAM_AUTHENTICATION_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__INSTANCE_IDENTIFIER_JAVA_LANG_STRING_:
			setInstanceIdentifier_java_lang_String_(INSTANCE_IDENTIFIER_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__IOPS_JAVA_LANG_NUMBER_:
			setIops_java_lang_Number_(IOPS_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MAX_ALLOCATED_STORAGE_JAVA_LANG_NUMBER_:
			setMaxAllocatedStorage_java_lang_Number_(MAX_ALLOCATED_STORAGE_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MONITORING_INTERVAL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setMonitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					MONITORING_INTERVAL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MONITORING_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			setMonitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(
					MONITORING_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MULTI_AZ_JAVA_LANG_BOOLEAN_:
			setMultiAz_java_lang_Boolean_(MULTI_AZ_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__OPTION_GROUP_WITH_IOPTION_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IOPTION_GROUP_AS_REFERENCE:
			setOptionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReference(
					OPTION_GROUP_WITH_IOPTION_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IOPTION_GROUP_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PERFORMANCE_INSIGHT_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			setPerformanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(
					PERFORMANCE_INSIGHT_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PERFORMANCE_INSIGHT_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_PERFORMANCE_INSIGHT_RETENTION_:
			setPerformanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention_(
					PERFORMANCE_INSIGHT_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_PERFORMANCE_INSIGHT_RETENTION__EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PORT_JAVA_LANG_NUMBER_:
			setPort_java_lang_Number_(PORT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PREFERRED_BACKUP_WINDOW_JAVA_LANG_STRING_:
			setPreferredBackupWindow_java_lang_String_(PREFERRED_BACKUP_WINDOW_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PREFERRED_MAINTENANCE_WINDOW_JAVA_LANG_STRING_:
			setPreferredMaintenanceWindow_java_lang_String_(PREFERRED_MAINTENANCE_WINDOW_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PROCESSOR_FEATURES_WITH_PROCESSOR_FEATURES_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_PROCESSOR_FEATURES_AS_REFERENCE:
			setProcessorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReference(
					PROCESSOR_FEATURES_WITH_PROCESSOR_FEATURES_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_PROCESSOR_FEATURES_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
			setRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_(
					REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY__EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST:
			setSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList(
					SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__STORAGE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_STORAGE_TYPE_:
			setStorageType_software_amazon_awscdk_services_rds_StorageType_(
					STORAGE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_STORAGE_TYPE__EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__VPC_PLACEMENT_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
			setVpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(
					VPC_PLACEMENT_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__ENGINE_WITH_IINSTANCE_ENGINE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IINSTANCE_ENGINE_AS_REFERENCE:
			setEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference(
					ENGINE_WITH_IINSTANCE_ENGINE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IINSTANCE_ENGINE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__ALLOCATED_STORAGE_JAVA_LANG_NUMBER_:
			setAllocatedStorage_java_lang_Number_(ALLOCATED_STORAGE_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__ALLOW_MAJOR_VERSION_UPGRADE_JAVA_LANG_BOOLEAN_:
			setAllowMajorVersionUpgrade_java_lang_Boolean_(ALLOW_MAJOR_VERSION_UPGRADE_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__DATABASE_NAME_JAVA_LANG_STRING_:
			setDatabaseName_java_lang_String_(DATABASE_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE:
			setInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference(
					INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__LICENSE_MODEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_LICENSE_MODEL_:
			setLicenseModel_software_amazon_awscdk_services_rds_LicenseModel_(
					LICENSE_MODEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_LICENSE_MODEL__EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MASTER_USER_PASSWORD_WITH_SECRET_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_SECRET_VALUE_AS_REFERENCE:
			setMasterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference(
					MASTER_USER_PASSWORD_WITH_SECRET_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_SECRET_VALUE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MASTER_USER_PASSWORD_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			setMasterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(
					MASTER_USER_PASSWORD_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PARAMETER_GROUP_WITH_IPARAMETER_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IPARAMETER_GROUP_AS_REFERENCE:
			setParameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReference(
					PARAMETER_GROUP_WITH_IPARAMETER_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IPARAMETER_GROUP_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__TIMEZONE_JAVA_LANG_STRING_:
			setTimezone_java_lang_String_(TIMEZONE_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MASTER_USERNAME_JAVA_LANG_STRING_:
			setMasterUsername_java_lang_String_(MASTER_USERNAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__CHARACTER_SET_NAME_JAVA_LANG_STRING_:
			setCharacterSetName_java_lang_String_(CHARACTER_SET_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__STORAGE_ENCRYPTED_JAVA_LANG_BOOLEAN_:
			setStorageEncrypted_java_lang_Boolean_(STORAGE_ENCRYPTED_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__STORAGE_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			setStorageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(
					STORAGE_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			return VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT == null
					? vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference != null
					: !VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT
							.equals(vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__AUTO_MINOR_VERSION_UPGRADE_JAVA_LANG_BOOLEAN_:
			return AUTO_MINOR_VERSION_UPGRADE_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? autoMinorVersionUpgrade_java_lang_Boolean_ != null
					: !AUTO_MINOR_VERSION_UPGRADE_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(autoMinorVersionUpgrade_java_lang_Boolean_);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__AVAILABILITY_ZONE_JAVA_LANG_STRING_:
			return AVAILABILITY_ZONE_JAVA_LANG_STRING__EDEFAULT == null ? availabilityZone_java_lang_String_ != null
					: !AVAILABILITY_ZONE_JAVA_LANG_STRING__EDEFAULT.equals(availabilityZone_java_lang_String_);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__BACKUP_RETENTION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return BACKUP_RETENTION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? backupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !BACKUP_RETENTION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(backupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__CLOUDWATCH_LOGS_EXPORTS_JAVA_LANG_STRING_AS_LIST:
			return CLOUDWATCH_LOGS_EXPORTS_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? cloudwatchLogsExports_java_lang_String_AsList != null
					: !CLOUDWATCH_LOGS_EXPORTS_JAVA_LANG_STRING_AS_LIST_EDEFAULT
							.equals(cloudwatchLogsExports_java_lang_String_AsList);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__CLOUDWATCH_LOGS_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS_:
			return cloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays_ != CLOUDWATCH_LOGS_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS__EDEFAULT;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__CLOUDWATCH_LOGS_RETENTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			return CLOUDWATCH_LOGS_RETENTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT == null
					? cloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference != null
					: !CLOUDWATCH_LOGS_RETENTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT
							.equals(cloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__COPY_TAGS_TO_SNAPSHOT_JAVA_LANG_BOOLEAN_:
			return COPY_TAGS_TO_SNAPSHOT_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? copyTagsToSnapshot_java_lang_Boolean_ != null
					: !COPY_TAGS_TO_SNAPSHOT_JAVA_LANG_BOOLEAN__EDEFAULT.equals(copyTagsToSnapshot_java_lang_Boolean_);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__DELETE_AUTOMATED_BACKUPS_JAVA_LANG_BOOLEAN_:
			return DELETE_AUTOMATED_BACKUPS_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? deleteAutomatedBackups_java_lang_Boolean_ != null
					: !DELETE_AUTOMATED_BACKUPS_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(deleteAutomatedBackups_java_lang_Boolean_);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__DELETION_PROTECTION_JAVA_LANG_BOOLEAN_:
			return DELETION_PROTECTION_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? deletionProtection_java_lang_Boolean_ != null
					: !DELETION_PROTECTION_JAVA_LANG_BOOLEAN__EDEFAULT.equals(deletionProtection_java_lang_Boolean_);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__ENABLE_PERFORMANCE_INSIGHTS_JAVA_LANG_BOOLEAN_:
			return ENABLE_PERFORMANCE_INSIGHTS_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? enablePerformanceInsights_java_lang_Boolean_ != null
					: !ENABLE_PERFORMANCE_INSIGHTS_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(enablePerformanceInsights_java_lang_Boolean_);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__IAM_AUTHENTICATION_JAVA_LANG_BOOLEAN_:
			return IAM_AUTHENTICATION_JAVA_LANG_BOOLEAN__EDEFAULT == null ? iamAuthentication_java_lang_Boolean_ != null
					: !IAM_AUTHENTICATION_JAVA_LANG_BOOLEAN__EDEFAULT.equals(iamAuthentication_java_lang_Boolean_);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__INSTANCE_IDENTIFIER_JAVA_LANG_STRING_:
			return INSTANCE_IDENTIFIER_JAVA_LANG_STRING__EDEFAULT == null ? instanceIdentifier_java_lang_String_ != null
					: !INSTANCE_IDENTIFIER_JAVA_LANG_STRING__EDEFAULT.equals(instanceIdentifier_java_lang_String_);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__IOPS_JAVA_LANG_NUMBER_:
			return iops_java_lang_Number_ != IOPS_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MAX_ALLOCATED_STORAGE_JAVA_LANG_NUMBER_:
			return maxAllocatedStorage_java_lang_Number_ != MAX_ALLOCATED_STORAGE_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MONITORING_INTERVAL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return MONITORING_INTERVAL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? monitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !MONITORING_INTERVAL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(monitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MONITORING_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			return MONITORING_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT == null
					? monitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference != null
					: !MONITORING_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT
							.equals(monitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MULTI_AZ_JAVA_LANG_BOOLEAN_:
			return MULTI_AZ_JAVA_LANG_BOOLEAN__EDEFAULT == null ? multiAz_java_lang_Boolean_ != null
					: !MULTI_AZ_JAVA_LANG_BOOLEAN__EDEFAULT.equals(multiAz_java_lang_Boolean_);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__OPTION_GROUP_WITH_IOPTION_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IOPTION_GROUP_AS_REFERENCE:
			return OPTION_GROUP_WITH_IOPTION_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IOPTION_GROUP_AS_REFERENCE_EDEFAULT == null
					? optionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReference != null
					: !OPTION_GROUP_WITH_IOPTION_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IOPTION_GROUP_AS_REFERENCE_EDEFAULT
							.equals(optionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReference);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PERFORMANCE_INSIGHT_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			return PERFORMANCE_INSIGHT_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT == null
					? performanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference != null
					: !PERFORMANCE_INSIGHT_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT
							.equals(performanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PERFORMANCE_INSIGHT_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_PERFORMANCE_INSIGHT_RETENTION_:
			return performanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention_ != PERFORMANCE_INSIGHT_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_PERFORMANCE_INSIGHT_RETENTION__EDEFAULT;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PORT_JAVA_LANG_NUMBER_:
			return port_java_lang_Number_ != PORT_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PREFERRED_BACKUP_WINDOW_JAVA_LANG_STRING_:
			return PREFERRED_BACKUP_WINDOW_JAVA_LANG_STRING__EDEFAULT == null
					? preferredBackupWindow_java_lang_String_ != null
					: !PREFERRED_BACKUP_WINDOW_JAVA_LANG_STRING__EDEFAULT
							.equals(preferredBackupWindow_java_lang_String_);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PREFERRED_MAINTENANCE_WINDOW_JAVA_LANG_STRING_:
			return PREFERRED_MAINTENANCE_WINDOW_JAVA_LANG_STRING__EDEFAULT == null
					? preferredMaintenanceWindow_java_lang_String_ != null
					: !PREFERRED_MAINTENANCE_WINDOW_JAVA_LANG_STRING__EDEFAULT
							.equals(preferredMaintenanceWindow_java_lang_String_);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PROCESSOR_FEATURES_WITH_PROCESSOR_FEATURES_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_PROCESSOR_FEATURES_AS_REFERENCE:
			return PROCESSOR_FEATURES_WITH_PROCESSOR_FEATURES_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_PROCESSOR_FEATURES_AS_REFERENCE_EDEFAULT == null
					? processorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReference != null
					: !PROCESSOR_FEATURES_WITH_PROCESSOR_FEATURES_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_PROCESSOR_FEATURES_AS_REFERENCE_EDEFAULT
							.equals(processorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReference);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
			return removalPolicy_software_amazon_awscdk_core_RemovalPolicy_ != REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY__EDEFAULT;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST:
			return SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST_EDEFAULT == null
					? securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList != null
					: !SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST_EDEFAULT
							.equals(securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__STORAGE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_STORAGE_TYPE_:
			return storageType_software_amazon_awscdk_services_rds_StorageType_ != STORAGE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_STORAGE_TYPE__EDEFAULT;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__VPC_PLACEMENT_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
			return VPC_PLACEMENT_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT == null
					? vpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference != null
					: !VPC_PLACEMENT_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT
							.equals(vpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__ENGINE_WITH_IINSTANCE_ENGINE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IINSTANCE_ENGINE_AS_REFERENCE:
			return ENGINE_WITH_IINSTANCE_ENGINE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IINSTANCE_ENGINE_AS_REFERENCE_EDEFAULT == null
					? engineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference != null
					: !ENGINE_WITH_IINSTANCE_ENGINE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IINSTANCE_ENGINE_AS_REFERENCE_EDEFAULT
							.equals(engineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__ALLOCATED_STORAGE_JAVA_LANG_NUMBER_:
			return allocatedStorage_java_lang_Number_ != ALLOCATED_STORAGE_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__ALLOW_MAJOR_VERSION_UPGRADE_JAVA_LANG_BOOLEAN_:
			return ALLOW_MAJOR_VERSION_UPGRADE_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? allowMajorVersionUpgrade_java_lang_Boolean_ != null
					: !ALLOW_MAJOR_VERSION_UPGRADE_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(allowMajorVersionUpgrade_java_lang_Boolean_);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__DATABASE_NAME_JAVA_LANG_STRING_:
			return DATABASE_NAME_JAVA_LANG_STRING__EDEFAULT == null ? databaseName_java_lang_String_ != null
					: !DATABASE_NAME_JAVA_LANG_STRING__EDEFAULT.equals(databaseName_java_lang_String_);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE:
			return INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE_EDEFAULT == null
					? instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference != null
					: !INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE_EDEFAULT
							.equals(instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__LICENSE_MODEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_LICENSE_MODEL_:
			return licenseModel_software_amazon_awscdk_services_rds_LicenseModel_ != LICENSE_MODEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_LICENSE_MODEL__EDEFAULT;
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MASTER_USER_PASSWORD_WITH_SECRET_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_SECRET_VALUE_AS_REFERENCE:
			return MASTER_USER_PASSWORD_WITH_SECRET_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_SECRET_VALUE_AS_REFERENCE_EDEFAULT == null
					? masterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference != null
					: !MASTER_USER_PASSWORD_WITH_SECRET_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_SECRET_VALUE_AS_REFERENCE_EDEFAULT
							.equals(masterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MASTER_USER_PASSWORD_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			return MASTER_USER_PASSWORD_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT == null
					? masterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference != null
					: !MASTER_USER_PASSWORD_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT
							.equals(masterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PARAMETER_GROUP_WITH_IPARAMETER_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IPARAMETER_GROUP_AS_REFERENCE:
			return PARAMETER_GROUP_WITH_IPARAMETER_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IPARAMETER_GROUP_AS_REFERENCE_EDEFAULT == null
					? parameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReference != null
					: !PARAMETER_GROUP_WITH_IPARAMETER_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IPARAMETER_GROUP_AS_REFERENCE_EDEFAULT
							.equals(parameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReference);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__TIMEZONE_JAVA_LANG_STRING_:
			return TIMEZONE_JAVA_LANG_STRING__EDEFAULT == null ? timezone_java_lang_String_ != null
					: !TIMEZONE_JAVA_LANG_STRING__EDEFAULT.equals(timezone_java_lang_String_);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MASTER_USERNAME_JAVA_LANG_STRING_:
			return MASTER_USERNAME_JAVA_LANG_STRING__EDEFAULT == null ? masterUsername_java_lang_String_ != null
					: !MASTER_USERNAME_JAVA_LANG_STRING__EDEFAULT.equals(masterUsername_java_lang_String_);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__CHARACTER_SET_NAME_JAVA_LANG_STRING_:
			return CHARACTER_SET_NAME_JAVA_LANG_STRING__EDEFAULT == null ? characterSetName_java_lang_String_ != null
					: !CHARACTER_SET_NAME_JAVA_LANG_STRING__EDEFAULT.equals(characterSetName_java_lang_String_);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__STORAGE_ENCRYPTED_JAVA_LANG_BOOLEAN_:
			return STORAGE_ENCRYPTED_JAVA_LANG_BOOLEAN__EDEFAULT == null ? storageEncrypted_java_lang_Boolean_ != null
					: !STORAGE_ENCRYPTED_JAVA_LANG_BOOLEAN__EDEFAULT.equals(storageEncrypted_java_lang_Boolean_);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__STORAGE_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			return STORAGE_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT == null
					? storageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference != null
					: !STORAGE_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT
							.equals(storageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__ADDITIONAL_CODE:
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
		result.append(" (vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference: ");
		result.append(vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference);
		result.append(", autoMinorVersionUpgrade_java_lang_Boolean_: ");
		result.append(autoMinorVersionUpgrade_java_lang_Boolean_);
		result.append(", availabilityZone_java_lang_String_: ");
		result.append(availabilityZone_java_lang_String_);
		result.append(", backupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(backupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		result.append(", cloudwatchLogsExports_java_lang_String_AsList: ");
		result.append(cloudwatchLogsExports_java_lang_String_AsList);
		result.append(", cloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays_: ");
		result.append(cloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays_);
		result.append(", cloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference: ");
		result.append(cloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference);
		result.append(", copyTagsToSnapshot_java_lang_Boolean_: ");
		result.append(copyTagsToSnapshot_java_lang_Boolean_);
		result.append(", deleteAutomatedBackups_java_lang_Boolean_: ");
		result.append(deleteAutomatedBackups_java_lang_Boolean_);
		result.append(", deletionProtection_java_lang_Boolean_: ");
		result.append(deletionProtection_java_lang_Boolean_);
		result.append(", enablePerformanceInsights_java_lang_Boolean_: ");
		result.append(enablePerformanceInsights_java_lang_Boolean_);
		result.append(", iamAuthentication_java_lang_Boolean_: ");
		result.append(iamAuthentication_java_lang_Boolean_);
		result.append(", instanceIdentifier_java_lang_String_: ");
		result.append(instanceIdentifier_java_lang_String_);
		result.append(", iops_java_lang_Number_: ");
		result.append(iops_java_lang_Number_);
		result.append(", maxAllocatedStorage_java_lang_Number_: ");
		result.append(maxAllocatedStorage_java_lang_Number_);
		result.append(", monitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(monitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		result.append(", monitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference: ");
		result.append(monitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference);
		result.append(", multiAz_java_lang_Boolean_: ");
		result.append(multiAz_java_lang_Boolean_);
		result.append(", optionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReference: ");
		result.append(optionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReference);
		result.append(
				", performanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference: ");
		result.append(performanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference);
		result.append(
				", performanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention_: ");
		result.append(performanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention_);
		result.append(", port_java_lang_Number_: ");
		result.append(port_java_lang_Number_);
		result.append(", preferredBackupWindow_java_lang_String_: ");
		result.append(preferredBackupWindow_java_lang_String_);
		result.append(", preferredMaintenanceWindow_java_lang_String_: ");
		result.append(preferredMaintenanceWindow_java_lang_String_);
		result.append(
				", processorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReference: ");
		result.append(
				processorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReference);
		result.append(", removalPolicy_software_amazon_awscdk_core_RemovalPolicy_: ");
		result.append(removalPolicy_software_amazon_awscdk_core_RemovalPolicy_);
		result.append(", securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList: ");
		result.append(securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList);
		result.append(", storageType_software_amazon_awscdk_services_rds_StorageType_: ");
		result.append(storageType_software_amazon_awscdk_services_rds_StorageType_);
		result.append(
				", vpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference: ");
		result.append(vpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference);
		result.append(", engineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference: ");
		result.append(engineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference);
		result.append(", allocatedStorage_java_lang_Number_: ");
		result.append(allocatedStorage_java_lang_Number_);
		result.append(", allowMajorVersionUpgrade_java_lang_Boolean_: ");
		result.append(allowMajorVersionUpgrade_java_lang_Boolean_);
		result.append(", databaseName_java_lang_String_: ");
		result.append(databaseName_java_lang_String_);
		result.append(", instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference: ");
		result.append(instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference);
		result.append(", licenseModel_software_amazon_awscdk_services_rds_LicenseModel_: ");
		result.append(licenseModel_software_amazon_awscdk_services_rds_LicenseModel_);
		result.append(", masterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference: ");
		result.append(masterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference);
		result.append(
				", masterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference: ");
		result.append(masterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference);
		result.append(
				", parameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReference: ");
		result.append(
				parameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReference);
		result.append(", timezone_java_lang_String_: ");
		result.append(timezone_java_lang_String_);
		result.append(", masterUsername_java_lang_String_: ");
		result.append(masterUsername_java_lang_String_);
		result.append(", characterSetName_java_lang_String_: ");
		result.append(characterSetName_java_lang_String_);
		result.append(", storageEncrypted_java_lang_Boolean_: ");
		result.append(storageEncrypted_java_lang_Boolean_);
		result.append(", storageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference: ");
		result.append(storageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference);
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

} //DatabaseInstanceBuilder_rdsImpl
