/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Instance Builder rds</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getAutoMinorVersionUpgrade_java_lang_Boolean_ <em>Auto Minor Version Upgrade java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getAvailabilityZone_java_lang_String_ <em>Availability Zone java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getBackupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Backup Retention With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getCloudwatchLogsExports_java_lang_String_AsList <em>Cloudwatch Logs Exports java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getCloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays_ <em>Cloudwatch Logs Retention software amazon awscdk services logs Retention Days </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getCloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Cloudwatch Logs Retention Role With IRole software amazon awscdk services iam IRole As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getCopyTagsToSnapshot_java_lang_Boolean_ <em>Copy Tags To Snapshot java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getDeleteAutomatedBackups_java_lang_Boolean_ <em>Delete Automated Backups java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getDeletionProtection_java_lang_Boolean_ <em>Deletion Protection java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getEnablePerformanceInsights_java_lang_Boolean_ <em>Enable Performance Insights java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getIamAuthentication_java_lang_Boolean_ <em>Iam Authentication java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getInstanceIdentifier_java_lang_String_ <em>Instance Identifier java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getIops_java_lang_Number_ <em>Iops java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getMaxAllocatedStorage_java_lang_Number_ <em>Max Allocated Storage java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getMonitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Monitoring Interval With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getMonitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Monitoring Role With IRole software amazon awscdk services iam IRole As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getMultiAz_java_lang_Boolean_ <em>Multi Az java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getOptionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReference <em>Option Group With IOption Group software amazon awscdk services rds IOption Group As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getPerformanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference <em>Performance Insight Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getPerformanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention_ <em>Performance Insight Retention software amazon awscdk services rds Performance Insight Retention </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getPort_java_lang_Number_ <em>Port java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getPreferredBackupWindow_java_lang_String_ <em>Preferred Backup Window java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getPreferredMaintenanceWindow_java_lang_String_ <em>Preferred Maintenance Window java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getProcessorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReference <em>Processor Features With Processor Features software amazon awscdk services rds Processor Features As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ <em>Removal Policy software amazon awscdk core Removal Policy </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList <em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getStorageType_software_amazon_awscdk_services_rds_StorageType_ <em>Storage Type software amazon awscdk services rds Storage Type </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getVpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Vpc Placement With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference <em>Engine With IInstance Engine software amazon awscdk services rds IInstance Engine As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getAllocatedStorage_java_lang_Number_ <em>Allocated Storage java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getAllowMajorVersionUpgrade_java_lang_Boolean_ <em>Allow Major Version Upgrade java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getDatabaseName_java_lang_String_ <em>Database Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference <em>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getLicenseModel_software_amazon_awscdk_services_rds_LicenseModel_ <em>License Model software amazon awscdk services rds License Model </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getMasterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference <em>Master User Password With Secret Value software amazon awscdk core Secret Value As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getMasterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference <em>Master User Password Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getParameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReference <em>Parameter Group With IParameter Group software amazon awscdk services rds IParameter Group As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getTimezone_java_lang_String_ <em>Timezone java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getMasterUsername_java_lang_String_ <em>Master Username java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getCharacterSetName_java_lang_String_ <em>Character Set Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getStorageEncrypted_java_lang_Boolean_ <em>Storage Encrypted java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getStorageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference <em>Storage Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds()
 * @model
 * @generated
 */
public interface DatabaseInstanceBuilder_rds extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>' attribute.
	 * @see #setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @model
	 * @generated
	 */
	String getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>' attribute.
	 * @see #getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @generated
	 */
	void setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Auto Minor Version Upgrade java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Minor Version Upgrade java lang Boolean </em>' attribute.
	 * @see #setAutoMinorVersionUpgrade_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_AutoMinorVersionUpgrade_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getAutoMinorVersionUpgrade_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getAutoMinorVersionUpgrade_java_lang_Boolean_ <em>Auto Minor Version Upgrade java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Minor Version Upgrade java lang Boolean </em>' attribute.
	 * @see #getAutoMinorVersionUpgrade_java_lang_Boolean_()
	 * @generated
	 */
	void setAutoMinorVersionUpgrade_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Availability Zone java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability Zone java lang String </em>' attribute.
	 * @see #setAvailabilityZone_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_AvailabilityZone_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getAvailabilityZone_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getAvailabilityZone_java_lang_String_ <em>Availability Zone java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability Zone java lang String </em>' attribute.
	 * @see #getAvailabilityZone_java_lang_String_()
	 * @generated
	 */
	void setAvailabilityZone_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Backup Retention With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backup Retention With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setBackupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_BackupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getBackupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getBackupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Backup Retention With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backup Retention With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getBackupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setBackupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Cloudwatch Logs Exports java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloudwatch Logs Exports java lang String As List</em>' attribute.
	 * @see #setCloudwatchLogsExports_java_lang_String_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_CloudwatchLogsExports_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getCloudwatchLogsExports_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getCloudwatchLogsExports_java_lang_String_AsList <em>Cloudwatch Logs Exports java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudwatch Logs Exports java lang String As List</em>' attribute.
	 * @see #getCloudwatchLogsExports_java_lang_String_AsList()
	 * @generated
	 */
	void setCloudwatchLogsExports_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Cloudwatch Logs Retention software amazon awscdk services logs Retention Days </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.RetentionDays}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloudwatch Logs Retention software amazon awscdk services logs Retention Days </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RetentionDays
	 * @see #setCloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays_(RetentionDays)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_CloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.RetentionDays"
	 * @generated
	 */
	RetentionDays getCloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getCloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays_ <em>Cloudwatch Logs Retention software amazon awscdk services logs Retention Days </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudwatch Logs Retention software amazon awscdk services logs Retention Days </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RetentionDays
	 * @see #getCloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays_()
	 * @generated
	 */
	void setCloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays_(RetentionDays value);

	/**
	 * Returns the value of the '<em><b>Cloudwatch Logs Retention Role With IRole software amazon awscdk services iam IRole As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloudwatch Logs Retention Role With IRole software amazon awscdk services iam IRole As Reference</em>' attribute.
	 * @see #setCloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_CloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @model
	 * @generated
	 */
	String getCloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getCloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Cloudwatch Logs Retention Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudwatch Logs Retention Role With IRole software amazon awscdk services iam IRole As Reference</em>' attribute.
	 * @see #getCloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 */
	void setCloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Copy Tags To Snapshot java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy Tags To Snapshot java lang Boolean </em>' attribute.
	 * @see #setCopyTagsToSnapshot_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_CopyTagsToSnapshot_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getCopyTagsToSnapshot_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getCopyTagsToSnapshot_java_lang_Boolean_ <em>Copy Tags To Snapshot java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Tags To Snapshot java lang Boolean </em>' attribute.
	 * @see #getCopyTagsToSnapshot_java_lang_Boolean_()
	 * @generated
	 */
	void setCopyTagsToSnapshot_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Delete Automated Backups java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Automated Backups java lang Boolean </em>' attribute.
	 * @see #setDeleteAutomatedBackups_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_DeleteAutomatedBackups_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getDeleteAutomatedBackups_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getDeleteAutomatedBackups_java_lang_Boolean_ <em>Delete Automated Backups java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Automated Backups java lang Boolean </em>' attribute.
	 * @see #getDeleteAutomatedBackups_java_lang_Boolean_()
	 * @generated
	 */
	void setDeleteAutomatedBackups_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Deletion Protection java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deletion Protection java lang Boolean </em>' attribute.
	 * @see #setDeletionProtection_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_DeletionProtection_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getDeletionProtection_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getDeletionProtection_java_lang_Boolean_ <em>Deletion Protection java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deletion Protection java lang Boolean </em>' attribute.
	 * @see #getDeletionProtection_java_lang_Boolean_()
	 * @generated
	 */
	void setDeletionProtection_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Enable Performance Insights java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Performance Insights java lang Boolean </em>' attribute.
	 * @see #setEnablePerformanceInsights_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_EnablePerformanceInsights_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getEnablePerformanceInsights_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getEnablePerformanceInsights_java_lang_Boolean_ <em>Enable Performance Insights java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Performance Insights java lang Boolean </em>' attribute.
	 * @see #getEnablePerformanceInsights_java_lang_Boolean_()
	 * @generated
	 */
	void setEnablePerformanceInsights_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Iam Authentication java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iam Authentication java lang Boolean </em>' attribute.
	 * @see #setIamAuthentication_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_IamAuthentication_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getIamAuthentication_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getIamAuthentication_java_lang_Boolean_ <em>Iam Authentication java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iam Authentication java lang Boolean </em>' attribute.
	 * @see #getIamAuthentication_java_lang_Boolean_()
	 * @generated
	 */
	void setIamAuthentication_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Instance Identifier java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Identifier java lang String </em>' attribute.
	 * @see #setInstanceIdentifier_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_InstanceIdentifier_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getInstanceIdentifier_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getInstanceIdentifier_java_lang_String_ <em>Instance Identifier java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Identifier java lang String </em>' attribute.
	 * @see #getInstanceIdentifier_java_lang_String_()
	 * @generated
	 */
	void setInstanceIdentifier_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Iops java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iops java lang Number </em>' attribute.
	 * @see #setIops_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_Iops_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getIops_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getIops_java_lang_Number_ <em>Iops java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iops java lang Number </em>' attribute.
	 * @see #getIops_java_lang_Number_()
	 * @generated
	 */
	void setIops_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Max Allocated Storage java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Allocated Storage java lang Number </em>' attribute.
	 * @see #setMaxAllocatedStorage_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_MaxAllocatedStorage_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getMaxAllocatedStorage_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getMaxAllocatedStorage_java_lang_Number_ <em>Max Allocated Storage java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Allocated Storage java lang Number </em>' attribute.
	 * @see #getMaxAllocatedStorage_java_lang_Number_()
	 * @generated
	 */
	void setMaxAllocatedStorage_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Monitoring Interval With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitoring Interval With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setMonitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_MonitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getMonitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getMonitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Monitoring Interval With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitoring Interval With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getMonitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setMonitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Monitoring Role With IRole software amazon awscdk services iam IRole As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitoring Role With IRole software amazon awscdk services iam IRole As Reference</em>' attribute.
	 * @see #setMonitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_MonitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @model
	 * @generated
	 */
	String getMonitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getMonitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Monitoring Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitoring Role With IRole software amazon awscdk services iam IRole As Reference</em>' attribute.
	 * @see #getMonitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 */
	void setMonitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Multi Az java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Az java lang Boolean </em>' attribute.
	 * @see #setMultiAz_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_MultiAz_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getMultiAz_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getMultiAz_java_lang_Boolean_ <em>Multi Az java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Az java lang Boolean </em>' attribute.
	 * @see #getMultiAz_java_lang_Boolean_()
	 * @generated
	 */
	void setMultiAz_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Option Group With IOption Group software amazon awscdk services rds IOption Group As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Group With IOption Group software amazon awscdk services rds IOption Group As Reference</em>' attribute.
	 * @see #setOptionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_OptionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReference()
	 * @model
	 * @generated
	 */
	String getOptionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getOptionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReference <em>Option Group With IOption Group software amazon awscdk services rds IOption Group As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option Group With IOption Group software amazon awscdk services rds IOption Group As Reference</em>' attribute.
	 * @see #getOptionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReference()
	 * @generated
	 */
	void setOptionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Performance Insight Encryption Key With IKey software amazon awscdk services kms IKey As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance Insight Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>' attribute.
	 * @see #setPerformanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_PerformanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @model
	 * @generated
	 */
	String getPerformanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getPerformanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference <em>Performance Insight Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance Insight Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>' attribute.
	 * @see #getPerformanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @generated
	 */
	void setPerformanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Performance Insight Retention software amazon awscdk services rds Performance Insight Retention </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.PerformanceInsightRetention}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance Insight Retention software amazon awscdk services rds Performance Insight Retention </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PerformanceInsightRetention
	 * @see #setPerformanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention_(PerformanceInsightRetention)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_PerformanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.PerformanceInsightRetention"
	 * @generated
	 */
	PerformanceInsightRetention getPerformanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getPerformanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention_ <em>Performance Insight Retention software amazon awscdk services rds Performance Insight Retention </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance Insight Retention software amazon awscdk services rds Performance Insight Retention </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PerformanceInsightRetention
	 * @see #getPerformanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention_()
	 * @generated
	 */
	void setPerformanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention_(
			PerformanceInsightRetention value);

	/**
	 * Returns the value of the '<em><b>Port java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port java lang Number </em>' attribute.
	 * @see #setPort_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_Port_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getPort_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getPort_java_lang_Number_ <em>Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port java lang Number </em>' attribute.
	 * @see #getPort_java_lang_Number_()
	 * @generated
	 */
	void setPort_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Preferred Backup Window java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Backup Window java lang String </em>' attribute.
	 * @see #setPreferredBackupWindow_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_PreferredBackupWindow_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getPreferredBackupWindow_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getPreferredBackupWindow_java_lang_String_ <em>Preferred Backup Window java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Backup Window java lang String </em>' attribute.
	 * @see #getPreferredBackupWindow_java_lang_String_()
	 * @generated
	 */
	void setPreferredBackupWindow_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Preferred Maintenance Window java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Maintenance Window java lang String </em>' attribute.
	 * @see #setPreferredMaintenanceWindow_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_PreferredMaintenanceWindow_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getPreferredMaintenanceWindow_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getPreferredMaintenanceWindow_java_lang_String_ <em>Preferred Maintenance Window java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Maintenance Window java lang String </em>' attribute.
	 * @see #getPreferredMaintenanceWindow_java_lang_String_()
	 * @generated
	 */
	void setPreferredMaintenanceWindow_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Processor Features With Processor Features software amazon awscdk services rds Processor Features As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor Features With Processor Features software amazon awscdk services rds Processor Features As Reference</em>' attribute.
	 * @see #setProcessorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_ProcessorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReference()
	 * @model
	 * @generated
	 */
	String getProcessorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getProcessorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReference <em>Processor Features With Processor Features software amazon awscdk services rds Processor Features As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor Features With Processor Features software amazon awscdk services rds Processor Features As Reference</em>' attribute.
	 * @see #getProcessorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReference()
	 * @generated
	 */
	void setProcessorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Removal Policy software amazon awscdk core Removal Policy </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.RemovalPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removal Policy software amazon awscdk core Removal Policy </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RemovalPolicy
	 * @see #setRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_(RemovalPolicy)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_RemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.RemovalPolicy"
	 * @generated
	 */
	RemovalPolicy getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ <em>Removal Policy software amazon awscdk core Removal Policy </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removal Policy software amazon awscdk core Removal Policy </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RemovalPolicy
	 * @see #getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_()
	 * @generated
	 */
	void setRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_(RemovalPolicy value);

	/**
	 * Returns the value of the '<em><b>Security Groups software amazon awscdk services ec2 ISecurity Group As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>' attribute.
	 * @see #setSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_SecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList()
	 * @model
	 * @generated
	 */
	String getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList <em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>' attribute.
	 * @see #getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList()
	 * @generated
	 */
	void setSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Storage Type software amazon awscdk services rds Storage Type </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.StorageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Type software amazon awscdk services rds Storage Type </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StorageType
	 * @see #setStorageType_software_amazon_awscdk_services_rds_StorageType_(StorageType)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_StorageType_software_amazon_awscdk_services_rds_StorageType_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.StorageType"
	 * @generated
	 */
	StorageType getStorageType_software_amazon_awscdk_services_rds_StorageType_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getStorageType_software_amazon_awscdk_services_rds_StorageType_ <em>Storage Type software amazon awscdk services rds Storage Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Type software amazon awscdk services rds Storage Type </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StorageType
	 * @see #getStorageType_software_amazon_awscdk_services_rds_StorageType_()
	 * @generated
	 */
	void setStorageType_software_amazon_awscdk_services_rds_StorageType_(StorageType value);

	/**
	 * Returns the value of the '<em><b>Vpc Placement With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc Placement With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>' attribute.
	 * @see #setVpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_VpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @model
	 * @generated
	 */
	String getVpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getVpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Vpc Placement With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc Placement With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>' attribute.
	 * @see #getVpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @generated
	 */
	void setVpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Engine With IInstance Engine software amazon awscdk services rds IInstance Engine As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine With IInstance Engine software amazon awscdk services rds IInstance Engine As Reference</em>' attribute.
	 * @see #setEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_EngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference()
	 * @model
	 * @generated
	 */
	String getEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference <em>Engine With IInstance Engine software amazon awscdk services rds IInstance Engine As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine With IInstance Engine software amazon awscdk services rds IInstance Engine As Reference</em>' attribute.
	 * @see #getEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference()
	 * @generated
	 */
	void setEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Allocated Storage java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Storage java lang Number </em>' attribute.
	 * @see #setAllocatedStorage_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_AllocatedStorage_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getAllocatedStorage_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getAllocatedStorage_java_lang_Number_ <em>Allocated Storage java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocated Storage java lang Number </em>' attribute.
	 * @see #getAllocatedStorage_java_lang_Number_()
	 * @generated
	 */
	void setAllocatedStorage_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Allow Major Version Upgrade java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Major Version Upgrade java lang Boolean </em>' attribute.
	 * @see #setAllowMajorVersionUpgrade_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_AllowMajorVersionUpgrade_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getAllowMajorVersionUpgrade_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getAllowMajorVersionUpgrade_java_lang_Boolean_ <em>Allow Major Version Upgrade java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Major Version Upgrade java lang Boolean </em>' attribute.
	 * @see #getAllowMajorVersionUpgrade_java_lang_Boolean_()
	 * @generated
	 */
	void setAllowMajorVersionUpgrade_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Database Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Name java lang String </em>' attribute.
	 * @see #setDatabaseName_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_DatabaseName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDatabaseName_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getDatabaseName_java_lang_String_ <em>Database Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Name java lang String </em>' attribute.
	 * @see #getDatabaseName_java_lang_String_()
	 * @generated
	 */
	void setDatabaseName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</em>' attribute.
	 * @see #setInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_InstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference()
	 * @model
	 * @generated
	 */
	String getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference <em>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</em>' attribute.
	 * @see #getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference()
	 * @generated
	 */
	void setInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>License Model software amazon awscdk services rds License Model </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.LicenseModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License Model software amazon awscdk services rds License Model </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.LicenseModel
	 * @see #setLicenseModel_software_amazon_awscdk_services_rds_LicenseModel_(LicenseModel)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_LicenseModel_software_amazon_awscdk_services_rds_LicenseModel_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.LicenseModel"
	 * @generated
	 */
	LicenseModel getLicenseModel_software_amazon_awscdk_services_rds_LicenseModel_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getLicenseModel_software_amazon_awscdk_services_rds_LicenseModel_ <em>License Model software amazon awscdk services rds License Model </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License Model software amazon awscdk services rds License Model </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.LicenseModel
	 * @see #getLicenseModel_software_amazon_awscdk_services_rds_LicenseModel_()
	 * @generated
	 */
	void setLicenseModel_software_amazon_awscdk_services_rds_LicenseModel_(LicenseModel value);

	/**
	 * Returns the value of the '<em><b>Master User Password With Secret Value software amazon awscdk core Secret Value As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master User Password With Secret Value software amazon awscdk core Secret Value As Reference</em>' attribute.
	 * @see #setMasterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_MasterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference()
	 * @model
	 * @generated
	 */
	String getMasterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getMasterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference <em>Master User Password With Secret Value software amazon awscdk core Secret Value As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master User Password With Secret Value software amazon awscdk core Secret Value As Reference</em>' attribute.
	 * @see #getMasterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference()
	 * @generated
	 */
	void setMasterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Master User Password Encryption Key With IKey software amazon awscdk services kms IKey As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master User Password Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>' attribute.
	 * @see #setMasterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_MasterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @model
	 * @generated
	 */
	String getMasterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getMasterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference <em>Master User Password Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master User Password Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>' attribute.
	 * @see #getMasterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @generated
	 */
	void setMasterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Parameter Group With IParameter Group software amazon awscdk services rds IParameter Group As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Group With IParameter Group software amazon awscdk services rds IParameter Group As Reference</em>' attribute.
	 * @see #setParameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_ParameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReference()
	 * @model
	 * @generated
	 */
	String getParameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getParameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReference <em>Parameter Group With IParameter Group software amazon awscdk services rds IParameter Group As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Group With IParameter Group software amazon awscdk services rds IParameter Group As Reference</em>' attribute.
	 * @see #getParameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReference()
	 * @generated
	 */
	void setParameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Timezone java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timezone java lang String </em>' attribute.
	 * @see #setTimezone_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_Timezone_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getTimezone_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getTimezone_java_lang_String_ <em>Timezone java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timezone java lang String </em>' attribute.
	 * @see #getTimezone_java_lang_String_()
	 * @generated
	 */
	void setTimezone_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Master Username java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Username java lang String </em>' attribute.
	 * @see #setMasterUsername_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_MasterUsername_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getMasterUsername_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getMasterUsername_java_lang_String_ <em>Master Username java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Username java lang String </em>' attribute.
	 * @see #getMasterUsername_java_lang_String_()
	 * @generated
	 */
	void setMasterUsername_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Character Set Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character Set Name java lang String </em>' attribute.
	 * @see #setCharacterSetName_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_CharacterSetName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getCharacterSetName_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getCharacterSetName_java_lang_String_ <em>Character Set Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character Set Name java lang String </em>' attribute.
	 * @see #getCharacterSetName_java_lang_String_()
	 * @generated
	 */
	void setCharacterSetName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Storage Encrypted java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Encrypted java lang Boolean </em>' attribute.
	 * @see #setStorageEncrypted_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_StorageEncrypted_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getStorageEncrypted_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getStorageEncrypted_java_lang_Boolean_ <em>Storage Encrypted java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Encrypted java lang Boolean </em>' attribute.
	 * @see #getStorageEncrypted_java_lang_Boolean_()
	 * @generated
	 */
	void setStorageEncrypted_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Storage Encryption Key With IKey software amazon awscdk services kms IKey As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>' attribute.
	 * @see #setStorageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_StorageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @model
	 * @generated
	 */
	String getStorageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getStorageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference <em>Storage Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>' attribute.
	 * @see #getStorageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @generated
	 */
	void setStorageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.rds.DatabaseInstance"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.rds.DatabaseInstance" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getVarName <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Name</em>' attribute.
	 * @see #getVarName()
	 * @generated
	 */
	void setVarName(String value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Code</em>' attribute.
	 * @see #setAdditionalCode(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDatabaseInstanceBuilder_rds_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // DatabaseInstanceBuilder_rds
