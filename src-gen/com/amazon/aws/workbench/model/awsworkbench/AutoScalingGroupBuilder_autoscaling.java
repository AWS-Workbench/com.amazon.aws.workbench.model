/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auto Scaling Group Builder autoscaling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getAllowAllOutbound_java_lang_Boolean_ <em>Allow All Outbound java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getAssociatePublicIpAddress_java_lang_Boolean_ <em>Associate Public Ip Address java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getBlockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList <em>Block Devices software amazon awscdk services autoscaling Block Device As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Cooldown With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getDesiredCapacity_java_lang_Number_ <em>Desired Capacity java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getHealthCheckWithHealthCheck_software_amazon_awscdk_services_autoscaling_HealthCheck_AsReference <em>Health Check With Health Check software amazon awscdk services autoscaling Health Check As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getIgnoreUnmodifiedSizeProperties_java_lang_Boolean_ <em>Ignore Unmodified Size Properties java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getKeyName_java_lang_String_ <em>Key Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getMaxCapacity_java_lang_Number_ <em>Max Capacity java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getMaxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Max Instance Lifetime With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getMinCapacity_java_lang_Number_ <em>Min Capacity java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getNotificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference <em>Notifications Topic With ITopic software amazon awscdk services sns ITopic As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getReplacingUpdateMinSuccessfulInstancesPercent_java_lang_Number_ <em>Replacing Update Min Successful Instances Percent java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getResourceSignalCount_java_lang_Number_ <em>Resource Signal Count java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Resource Signal Timeout With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getRollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference <em>Rolling Update Configuration With Rolling Update Configuration software amazon awscdk services autoscaling Rolling Update Configuration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getSpotPrice_java_lang_String_ <em>Spot Price java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getUpdateType_software_amazon_awscdk_services_autoscaling_UpdateType_ <em>Update Type software amazon awscdk services autoscaling Update Type </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference <em>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference <em>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Role With IRole software amazon awscdk services iam IRole As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference <em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAutoScalingGroupBuilder_autoscaling()
 * @model
 * @generated
 */
public interface AutoScalingGroupBuilder_autoscaling extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Allow All Outbound java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow All Outbound java lang Boolean </em>' attribute.
	 * @see #setAllowAllOutbound_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAutoScalingGroupBuilder_autoscaling_AllowAllOutbound_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getAllowAllOutbound_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getAllowAllOutbound_java_lang_Boolean_ <em>Allow All Outbound java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow All Outbound java lang Boolean </em>' attribute.
	 * @see #getAllowAllOutbound_java_lang_Boolean_()
	 * @generated
	 */
	void setAllowAllOutbound_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Associate Public Ip Address java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associate Public Ip Address java lang Boolean </em>' attribute.
	 * @see #setAssociatePublicIpAddress_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAutoScalingGroupBuilder_autoscaling_AssociatePublicIpAddress_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getAssociatePublicIpAddress_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getAssociatePublicIpAddress_java_lang_Boolean_ <em>Associate Public Ip Address java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associate Public Ip Address java lang Boolean </em>' attribute.
	 * @see #getAssociatePublicIpAddress_java_lang_Boolean_()
	 * @generated
	 */
	void setAssociatePublicIpAddress_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Block Devices software amazon awscdk services autoscaling Block Device As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Devices software amazon awscdk services autoscaling Block Device As List</em>' attribute.
	 * @see #setBlockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAutoScalingGroupBuilder_autoscaling_BlockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList()
	 * @model
	 * @generated
	 */
	String getBlockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getBlockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList <em>Block Devices software amazon awscdk services autoscaling Block Device As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Devices software amazon awscdk services autoscaling Block Device As List</em>' attribute.
	 * @see #getBlockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList()
	 * @generated
	 */
	void setBlockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Cooldown With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cooldown With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAutoScalingGroupBuilder_autoscaling_CooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Cooldown With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cooldown With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Desired Capacity java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desired Capacity java lang Number </em>' attribute.
	 * @see #setDesiredCapacity_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAutoScalingGroupBuilder_autoscaling_DesiredCapacity_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getDesiredCapacity_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getDesiredCapacity_java_lang_Number_ <em>Desired Capacity java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desired Capacity java lang Number </em>' attribute.
	 * @see #getDesiredCapacity_java_lang_Number_()
	 * @generated
	 */
	void setDesiredCapacity_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Health Check With Health Check software amazon awscdk services autoscaling Health Check As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Health Check With Health Check software amazon awscdk services autoscaling Health Check As Reference</em>' attribute.
	 * @see #setHealthCheckWithHealthCheck_software_amazon_awscdk_services_autoscaling_HealthCheck_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAutoScalingGroupBuilder_autoscaling_HealthCheckWithHealthCheck_software_amazon_awscdk_services_autoscaling_HealthCheck_AsReference()
	 * @model
	 * @generated
	 */
	String getHealthCheckWithHealthCheck_software_amazon_awscdk_services_autoscaling_HealthCheck_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getHealthCheckWithHealthCheck_software_amazon_awscdk_services_autoscaling_HealthCheck_AsReference <em>Health Check With Health Check software amazon awscdk services autoscaling Health Check As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Health Check With Health Check software amazon awscdk services autoscaling Health Check As Reference</em>' attribute.
	 * @see #getHealthCheckWithHealthCheck_software_amazon_awscdk_services_autoscaling_HealthCheck_AsReference()
	 * @generated
	 */
	void setHealthCheckWithHealthCheck_software_amazon_awscdk_services_autoscaling_HealthCheck_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Ignore Unmodified Size Properties java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Unmodified Size Properties java lang Boolean </em>' attribute.
	 * @see #setIgnoreUnmodifiedSizeProperties_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAutoScalingGroupBuilder_autoscaling_IgnoreUnmodifiedSizeProperties_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getIgnoreUnmodifiedSizeProperties_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getIgnoreUnmodifiedSizeProperties_java_lang_Boolean_ <em>Ignore Unmodified Size Properties java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Unmodified Size Properties java lang Boolean </em>' attribute.
	 * @see #getIgnoreUnmodifiedSizeProperties_java_lang_Boolean_()
	 * @generated
	 */
	void setIgnoreUnmodifiedSizeProperties_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Key Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Name java lang String </em>' attribute.
	 * @see #setKeyName_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAutoScalingGroupBuilder_autoscaling_KeyName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getKeyName_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getKeyName_java_lang_String_ <em>Key Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Name java lang String </em>' attribute.
	 * @see #getKeyName_java_lang_String_()
	 * @generated
	 */
	void setKeyName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Max Capacity java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Capacity java lang Number </em>' attribute.
	 * @see #setMaxCapacity_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAutoScalingGroupBuilder_autoscaling_MaxCapacity_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getMaxCapacity_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getMaxCapacity_java_lang_Number_ <em>Max Capacity java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Capacity java lang Number </em>' attribute.
	 * @see #getMaxCapacity_java_lang_Number_()
	 * @generated
	 */
	void setMaxCapacity_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Max Instance Lifetime With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Instance Lifetime With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setMaxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAutoScalingGroupBuilder_autoscaling_MaxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getMaxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getMaxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Max Instance Lifetime With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Instance Lifetime With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getMaxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setMaxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Min Capacity java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Capacity java lang Number </em>' attribute.
	 * @see #setMinCapacity_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAutoScalingGroupBuilder_autoscaling_MinCapacity_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getMinCapacity_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getMinCapacity_java_lang_Number_ <em>Min Capacity java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Capacity java lang Number </em>' attribute.
	 * @see #getMinCapacity_java_lang_Number_()
	 * @generated
	 */
	void setMinCapacity_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Notifications Topic With ITopic software amazon awscdk services sns ITopic As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notifications Topic With ITopic software amazon awscdk services sns ITopic As Reference</em>' attribute.
	 * @see #setNotificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAutoScalingGroupBuilder_autoscaling_NotificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference()
	 * @model
	 * @generated
	 */
	String getNotificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getNotificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference <em>Notifications Topic With ITopic software amazon awscdk services sns ITopic As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notifications Topic With ITopic software amazon awscdk services sns ITopic As Reference</em>' attribute.
	 * @see #getNotificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference()
	 * @generated
	 */
	void setNotificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Replacing Update Min Successful Instances Percent java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replacing Update Min Successful Instances Percent java lang Number </em>' attribute.
	 * @see #setReplacingUpdateMinSuccessfulInstancesPercent_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAutoScalingGroupBuilder_autoscaling_ReplacingUpdateMinSuccessfulInstancesPercent_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getReplacingUpdateMinSuccessfulInstancesPercent_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getReplacingUpdateMinSuccessfulInstancesPercent_java_lang_Number_ <em>Replacing Update Min Successful Instances Percent java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replacing Update Min Successful Instances Percent java lang Number </em>' attribute.
	 * @see #getReplacingUpdateMinSuccessfulInstancesPercent_java_lang_Number_()
	 * @generated
	 */
	void setReplacingUpdateMinSuccessfulInstancesPercent_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Resource Signal Count java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Signal Count java lang Number </em>' attribute.
	 * @see #setResourceSignalCount_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAutoScalingGroupBuilder_autoscaling_ResourceSignalCount_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getResourceSignalCount_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getResourceSignalCount_java_lang_Number_ <em>Resource Signal Count java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Signal Count java lang Number </em>' attribute.
	 * @see #getResourceSignalCount_java_lang_Number_()
	 * @generated
	 */
	void setResourceSignalCount_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Resource Signal Timeout With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Signal Timeout With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAutoScalingGroupBuilder_autoscaling_ResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Resource Signal Timeout With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Signal Timeout With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Rolling Update Configuration With Rolling Update Configuration software amazon awscdk services autoscaling Rolling Update Configuration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rolling Update Configuration With Rolling Update Configuration software amazon awscdk services autoscaling Rolling Update Configuration As Reference</em>' attribute.
	 * @see #setRollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAutoScalingGroupBuilder_autoscaling_RollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference()
	 * @model
	 * @generated
	 */
	String getRollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getRollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference <em>Rolling Update Configuration With Rolling Update Configuration software amazon awscdk services autoscaling Rolling Update Configuration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolling Update Configuration With Rolling Update Configuration software amazon awscdk services autoscaling Rolling Update Configuration As Reference</em>' attribute.
	 * @see #getRollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference()
	 * @generated
	 */
	void setRollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Spot Price java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spot Price java lang String </em>' attribute.
	 * @see #setSpotPrice_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAutoScalingGroupBuilder_autoscaling_SpotPrice_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getSpotPrice_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getSpotPrice_java_lang_String_ <em>Spot Price java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spot Price java lang String </em>' attribute.
	 * @see #getSpotPrice_java_lang_String_()
	 * @generated
	 */
	void setSpotPrice_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Update Type software amazon awscdk services autoscaling Update Type </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.UpdateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Type software amazon awscdk services autoscaling Update Type </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.UpdateType
	 * @see #setUpdateType_software_amazon_awscdk_services_autoscaling_UpdateType_(UpdateType)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAutoScalingGroupBuilder_autoscaling_UpdateType_software_amazon_awscdk_services_autoscaling_UpdateType_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.UpdateType"
	 * @generated
	 */
	UpdateType getUpdateType_software_amazon_awscdk_services_autoscaling_UpdateType_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getUpdateType_software_amazon_awscdk_services_autoscaling_UpdateType_ <em>Update Type software amazon awscdk services autoscaling Update Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Type software amazon awscdk services autoscaling Update Type </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.UpdateType
	 * @see #getUpdateType_software_amazon_awscdk_services_autoscaling_UpdateType_()
	 * @generated
	 */
	void setUpdateType_software_amazon_awscdk_services_autoscaling_UpdateType_(UpdateType value);

	/**
	 * Returns the value of the '<em><b>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>' attribute.
	 * @see #setVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAutoScalingGroupBuilder_autoscaling_VpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @model
	 * @generated
	 */
	String getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>' attribute.
	 * @see #getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @generated
	 */
	void setVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</em>' attribute.
	 * @see #setInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAutoScalingGroupBuilder_autoscaling_InstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference()
	 * @model
	 * @generated
	 */
	String getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference <em>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</em>' attribute.
	 * @see #getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference()
	 * @generated
	 */
	void setInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</em>' attribute.
	 * @see #setMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAutoScalingGroupBuilder_autoscaling_MachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference()
	 * @model
	 * @generated
	 */
	String getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference <em>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</em>' attribute.
	 * @see #getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference()
	 * @generated
	 */
	void setMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>' attribute.
	 * @see #setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAutoScalingGroupBuilder_autoscaling_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @model
	 * @generated
	 */
	String getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>' attribute.
	 * @see #getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @generated
	 */
	void setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Role With IRole software amazon awscdk services iam IRole As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role With IRole software amazon awscdk services iam IRole As Reference</em>' attribute.
	 * @see #setRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAutoScalingGroupBuilder_autoscaling_RoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @model
	 * @generated
	 */
	String getRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role With IRole software amazon awscdk services iam IRole As Reference</em>' attribute.
	 * @see #getRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 */
	void setRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>User Data With User Data software amazon awscdk services ec2 User Data As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>' attribute.
	 * @see #setUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAutoScalingGroupBuilder_autoscaling_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference()
	 * @model
	 * @generated
	 */
	String getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference <em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>' attribute.
	 * @see #getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference()
	 * @generated
	 */
	void setUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.autoscaling.AutoScalingGroup"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAutoScalingGroupBuilder_autoscaling_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.autoscaling.AutoScalingGroup" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAutoScalingGroupBuilder_autoscaling_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAutoScalingGroupBuilder_autoscaling_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAutoScalingGroupBuilder_autoscaling_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // AutoScalingGroupBuilder_autoscaling
