/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AddCapacityOptionsBuilder_ecs;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.UpdateType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Capacity Options Builder ecs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AddCapacityOptionsBuilder_ecsImpl#getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference <em>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AddCapacityOptionsBuilder_ecsImpl#getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference <em>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AddCapacityOptionsBuilder_ecsImpl#getCanContainersAccessInstanceRole_java_lang_Boolean_ <em>Can Containers Access Instance Role java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AddCapacityOptionsBuilder_ecsImpl#getSpotInstanceDraining_java_lang_Boolean_ <em>Spot Instance Draining java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AddCapacityOptionsBuilder_ecsImpl#getTaskDrainTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Task Drain Time With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AddCapacityOptionsBuilder_ecsImpl#getAllowAllOutbound_java_lang_Boolean_ <em>Allow All Outbound java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AddCapacityOptionsBuilder_ecsImpl#getAssociatePublicIpAddress_java_lang_Boolean_ <em>Associate Public Ip Address java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AddCapacityOptionsBuilder_ecsImpl#getBlockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList <em>Block Devices software amazon awscdk services autoscaling Block Device As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AddCapacityOptionsBuilder_ecsImpl#getCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Cooldown With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AddCapacityOptionsBuilder_ecsImpl#getDesiredCapacity_java_lang_Number_ <em>Desired Capacity java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AddCapacityOptionsBuilder_ecsImpl#getHealthCheckWithHealthCheck_software_amazon_awscdk_services_ecs_HealthCheck_AsReference <em>Health Check With Health Check software amazon awscdk services ecs Health Check As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AddCapacityOptionsBuilder_ecsImpl#getIgnoreUnmodifiedSizeProperties_java_lang_Boolean_ <em>Ignore Unmodified Size Properties java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AddCapacityOptionsBuilder_ecsImpl#getKeyName_java_lang_String_ <em>Key Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AddCapacityOptionsBuilder_ecsImpl#getMaxCapacity_java_lang_Number_ <em>Max Capacity java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AddCapacityOptionsBuilder_ecsImpl#getMaxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Max Instance Lifetime With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AddCapacityOptionsBuilder_ecsImpl#getMinCapacity_java_lang_Number_ <em>Min Capacity java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AddCapacityOptionsBuilder_ecsImpl#getNotificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference <em>Notifications Topic With ITopic software amazon awscdk services sns ITopic As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AddCapacityOptionsBuilder_ecsImpl#getReplacingUpdateMinSuccessfulInstancesPercent_java_lang_Number_ <em>Replacing Update Min Successful Instances Percent java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AddCapacityOptionsBuilder_ecsImpl#getResourceSignalCount_java_lang_Number_ <em>Resource Signal Count java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AddCapacityOptionsBuilder_ecsImpl#getResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Resource Signal Timeout With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AddCapacityOptionsBuilder_ecsImpl#getRollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference <em>Rolling Update Configuration With Rolling Update Configuration software amazon awscdk services autoscaling Rolling Update Configuration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AddCapacityOptionsBuilder_ecsImpl#getSpotPrice_java_lang_String_ <em>Spot Price java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AddCapacityOptionsBuilder_ecsImpl#getUpdateType_software_amazon_awscdk_services_autoscaling_UpdateType_ <em>Update Type software amazon awscdk services autoscaling Update Type </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AddCapacityOptionsBuilder_ecsImpl#getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AddCapacityOptionsBuilder_ecsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AddCapacityOptionsBuilder_ecsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AddCapacityOptionsBuilder_ecsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AddCapacityOptionsBuilder_ecsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddCapacityOptionsBuilder_ecsImpl extends ServiceResourcesImpl implements AddCapacityOptionsBuilder_ecs {
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
	 * The default value of the '{@link #getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference() <em>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference() <em>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String machineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference = MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCanContainersAccessInstanceRole_java_lang_Boolean_() <em>Can Containers Access Instance Role java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanContainersAccessInstanceRole_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CAN_CONTAINERS_ACCESS_INSTANCE_ROLE_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCanContainersAccessInstanceRole_java_lang_Boolean_() <em>Can Containers Access Instance Role java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanContainersAccessInstanceRole_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean canContainersAccessInstanceRole_java_lang_Boolean_ = CAN_CONTAINERS_ACCESS_INSTANCE_ROLE_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getSpotInstanceDraining_java_lang_Boolean_() <em>Spot Instance Draining java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpotInstanceDraining_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SPOT_INSTANCE_DRAINING_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpotInstanceDraining_java_lang_Boolean_() <em>Spot Instance Draining java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpotInstanceDraining_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean spotInstanceDraining_java_lang_Boolean_ = SPOT_INSTANCE_DRAINING_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getTaskDrainTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Task Drain Time With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskDrainTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String TASK_DRAIN_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaskDrainTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Task Drain Time With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskDrainTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String taskDrainTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference = TASK_DRAIN_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowAllOutbound_java_lang_Boolean_() <em>Allow All Outbound java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowAllOutbound_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowAllOutbound_java_lang_Boolean_() <em>Allow All Outbound java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowAllOutbound_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowAllOutbound_java_lang_Boolean_ = ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getAssociatePublicIpAddress_java_lang_Boolean_() <em>Associate Public Ip Address java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatePublicIpAddress_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ASSOCIATE_PUBLIC_IP_ADDRESS_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssociatePublicIpAddress_java_lang_Boolean_() <em>Associate Public Ip Address java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatePublicIpAddress_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean associatePublicIpAddress_java_lang_Boolean_ = ASSOCIATE_PUBLIC_IP_ADDRESS_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getBlockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList() <em>Block Devices software amazon awscdk services autoscaling Block Device As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_BLOCK_DEVICE_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList() <em>Block Devices software amazon awscdk services autoscaling Block Device As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList()
	 * @generated
	 * @ordered
	 */
	protected String blockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList = BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_BLOCK_DEVICE_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Cooldown With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Cooldown With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String cooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference = COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesiredCapacity_java_lang_Number_() <em>Desired Capacity java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredCapacity_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int DESIRED_CAPACITY_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDesiredCapacity_java_lang_Number_() <em>Desired Capacity java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredCapacity_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int desiredCapacity_java_lang_Number_ = DESIRED_CAPACITY_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getHealthCheckWithHealthCheck_software_amazon_awscdk_services_ecs_HealthCheck_AsReference() <em>Health Check With Health Check software amazon awscdk services ecs Health Check As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthCheckWithHealthCheck_software_amazon_awscdk_services_ecs_HealthCheck_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String HEALTH_CHECK_WITH_HEALTH_CHECK_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_HEALTH_CHECK_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHealthCheckWithHealthCheck_software_amazon_awscdk_services_ecs_HealthCheck_AsReference() <em>Health Check With Health Check software amazon awscdk services ecs Health Check As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthCheckWithHealthCheck_software_amazon_awscdk_services_ecs_HealthCheck_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String healthCheckWithHealthCheck_software_amazon_awscdk_services_ecs_HealthCheck_AsReference = HEALTH_CHECK_WITH_HEALTH_CHECK_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_HEALTH_CHECK_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIgnoreUnmodifiedSizeProperties_java_lang_Boolean_() <em>Ignore Unmodified Size Properties java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreUnmodifiedSizeProperties_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IGNORE_UNMODIFIED_SIZE_PROPERTIES_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIgnoreUnmodifiedSizeProperties_java_lang_Boolean_() <em>Ignore Unmodified Size Properties java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreUnmodifiedSizeProperties_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean ignoreUnmodifiedSizeProperties_java_lang_Boolean_ = IGNORE_UNMODIFIED_SIZE_PROPERTIES_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyName_java_lang_String_() <em>Key Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyName_java_lang_String_() <em>Key Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String keyName_java_lang_String_ = KEY_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxCapacity_java_lang_Number_() <em>Max Capacity java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCapacity_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_CAPACITY_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxCapacity_java_lang_Number_() <em>Max Capacity java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCapacity_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int maxCapacity_java_lang_Number_ = MAX_CAPACITY_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Max Instance Lifetime With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_INSTANCE_LIFETIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Max Instance Lifetime With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String maxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference = MAX_INSTANCE_LIFETIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinCapacity_java_lang_Number_() <em>Min Capacity java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCapacity_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_CAPACITY_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinCapacity_java_lang_Number_() <em>Min Capacity java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCapacity_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int minCapacity_java_lang_Number_ = MIN_CAPACITY_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getNotificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference() <em>Notifications Topic With ITopic software amazon awscdk services sns ITopic As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTIFICATIONS_TOPIC_WITH_ITOPIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_SNS_ITOPIC_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference() <em>Notifications Topic With ITopic software amazon awscdk services sns ITopic As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String notificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference = NOTIFICATIONS_TOPIC_WITH_ITOPIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_SNS_ITOPIC_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplacingUpdateMinSuccessfulInstancesPercent_java_lang_Number_() <em>Replacing Update Min Successful Instances Percent java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacingUpdateMinSuccessfulInstancesPercent_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int REPLACING_UPDATE_MIN_SUCCESSFUL_INSTANCES_PERCENT_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReplacingUpdateMinSuccessfulInstancesPercent_java_lang_Number_() <em>Replacing Update Min Successful Instances Percent java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacingUpdateMinSuccessfulInstancesPercent_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int replacingUpdateMinSuccessfulInstancesPercent_java_lang_Number_ = REPLACING_UPDATE_MIN_SUCCESSFUL_INSTANCES_PERCENT_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceSignalCount_java_lang_Number_() <em>Resource Signal Count java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceSignalCount_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int RESOURCE_SIGNAL_COUNT_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResourceSignalCount_java_lang_Number_() <em>Resource Signal Count java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceSignalCount_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int resourceSignalCount_java_lang_Number_ = RESOURCE_SIGNAL_COUNT_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Resource Signal Timeout With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Resource Signal Timeout With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String resourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference = RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference() <em>Rolling Update Configuration With Rolling Update Configuration software amazon awscdk services autoscaling Rolling Update Configuration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLLING_UPDATE_CONFIGURATION_WITH_ROLLING_UPDATE_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_ROLLING_UPDATE_CONFIGURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference() <em>Rolling Update Configuration With Rolling Update Configuration software amazon awscdk services autoscaling Rolling Update Configuration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String rollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference = ROLLING_UPDATE_CONFIGURATION_WITH_ROLLING_UPDATE_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_ROLLING_UPDATE_CONFIGURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpotPrice_java_lang_String_() <em>Spot Price java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpotPrice_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String SPOT_PRICE_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpotPrice_java_lang_String_() <em>Spot Price java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpotPrice_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String spotPrice_java_lang_String_ = SPOT_PRICE_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdateType_software_amazon_awscdk_services_autoscaling_UpdateType_() <em>Update Type software amazon awscdk services autoscaling Update Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateType_software_amazon_awscdk_services_autoscaling_UpdateType_()
	 * @generated
	 * @ordered
	 */
	protected static final UpdateType UPDATE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_UPDATE_TYPE__EDEFAULT = UpdateType.NONE;

	/**
	 * The cached value of the '{@link #getUpdateType_software_amazon_awscdk_services_autoscaling_UpdateType_() <em>Update Type software amazon awscdk services autoscaling Update Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateType_software_amazon_awscdk_services_autoscaling_UpdateType_()
	 * @generated
	 * @ordered
	 */
	protected UpdateType updateType_software_amazon_awscdk_services_autoscaling_UpdateType_ = UPDATE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_UPDATE_TYPE__EDEFAULT;

	/**
	 * The default value of the '{@link #getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() <em>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() <em>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference = VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ecs.AddCapacityOptions";

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
	protected AddCapacityOptionsBuilder_ecsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.ADD_CAPACITY_OPTIONS_BUILDER_ECS;
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
					AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE,
					oldInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference,
					instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference() {
		return machineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference(
			String newMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference) {
		String oldMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference = machineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference;
		machineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference = newMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE,
					oldMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference,
					machineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCanContainersAccessInstanceRole_java_lang_Boolean_() {
		return canContainersAccessInstanceRole_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanContainersAccessInstanceRole_java_lang_Boolean_(
			Boolean newCanContainersAccessInstanceRole_java_lang_Boolean_) {
		Boolean oldCanContainersAccessInstanceRole_java_lang_Boolean_ = canContainersAccessInstanceRole_java_lang_Boolean_;
		canContainersAccessInstanceRole_java_lang_Boolean_ = newCanContainersAccessInstanceRole_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__CAN_CONTAINERS_ACCESS_INSTANCE_ROLE_JAVA_LANG_BOOLEAN_,
					oldCanContainersAccessInstanceRole_java_lang_Boolean_,
					canContainersAccessInstanceRole_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSpotInstanceDraining_java_lang_Boolean_() {
		return spotInstanceDraining_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpotInstanceDraining_java_lang_Boolean_(Boolean newSpotInstanceDraining_java_lang_Boolean_) {
		Boolean oldSpotInstanceDraining_java_lang_Boolean_ = spotInstanceDraining_java_lang_Boolean_;
		spotInstanceDraining_java_lang_Boolean_ = newSpotInstanceDraining_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__SPOT_INSTANCE_DRAINING_JAVA_LANG_BOOLEAN_,
					oldSpotInstanceDraining_java_lang_Boolean_, spotInstanceDraining_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaskDrainTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return taskDrainTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaskDrainTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newTaskDrainTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldTaskDrainTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference = taskDrainTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		taskDrainTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference = newTaskDrainTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__TASK_DRAIN_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldTaskDrainTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					taskDrainTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAllowAllOutbound_java_lang_Boolean_() {
		return allowAllOutbound_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowAllOutbound_java_lang_Boolean_(Boolean newAllowAllOutbound_java_lang_Boolean_) {
		Boolean oldAllowAllOutbound_java_lang_Boolean_ = allowAllOutbound_java_lang_Boolean_;
		allowAllOutbound_java_lang_Boolean_ = newAllowAllOutbound_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_,
					oldAllowAllOutbound_java_lang_Boolean_, allowAllOutbound_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAssociatePublicIpAddress_java_lang_Boolean_() {
		return associatePublicIpAddress_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssociatePublicIpAddress_java_lang_Boolean_(Boolean newAssociatePublicIpAddress_java_lang_Boolean_) {
		Boolean oldAssociatePublicIpAddress_java_lang_Boolean_ = associatePublicIpAddress_java_lang_Boolean_;
		associatePublicIpAddress_java_lang_Boolean_ = newAssociatePublicIpAddress_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__ASSOCIATE_PUBLIC_IP_ADDRESS_JAVA_LANG_BOOLEAN_,
					oldAssociatePublicIpAddress_java_lang_Boolean_, associatePublicIpAddress_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBlockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList() {
		return blockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList(
			String newBlockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList) {
		String oldBlockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList = blockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList;
		blockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList = newBlockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_BLOCK_DEVICE_AS_LIST,
					oldBlockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList,
					blockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return cooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference = cooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		cooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference = newCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					cooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDesiredCapacity_java_lang_Number_() {
		return desiredCapacity_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesiredCapacity_java_lang_Number_(int newDesiredCapacity_java_lang_Number_) {
		int oldDesiredCapacity_java_lang_Number_ = desiredCapacity_java_lang_Number_;
		desiredCapacity_java_lang_Number_ = newDesiredCapacity_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__DESIRED_CAPACITY_JAVA_LANG_NUMBER_,
					oldDesiredCapacity_java_lang_Number_, desiredCapacity_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHealthCheckWithHealthCheck_software_amazon_awscdk_services_ecs_HealthCheck_AsReference() {
		return healthCheckWithHealthCheck_software_amazon_awscdk_services_ecs_HealthCheck_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHealthCheckWithHealthCheck_software_amazon_awscdk_services_ecs_HealthCheck_AsReference(
			String newHealthCheckWithHealthCheck_software_amazon_awscdk_services_ecs_HealthCheck_AsReference) {
		String oldHealthCheckWithHealthCheck_software_amazon_awscdk_services_ecs_HealthCheck_AsReference = healthCheckWithHealthCheck_software_amazon_awscdk_services_ecs_HealthCheck_AsReference;
		healthCheckWithHealthCheck_software_amazon_awscdk_services_ecs_HealthCheck_AsReference = newHealthCheckWithHealthCheck_software_amazon_awscdk_services_ecs_HealthCheck_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__HEALTH_CHECK_WITH_HEALTH_CHECK_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_HEALTH_CHECK_AS_REFERENCE,
					oldHealthCheckWithHealthCheck_software_amazon_awscdk_services_ecs_HealthCheck_AsReference,
					healthCheckWithHealthCheck_software_amazon_awscdk_services_ecs_HealthCheck_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIgnoreUnmodifiedSizeProperties_java_lang_Boolean_() {
		return ignoreUnmodifiedSizeProperties_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIgnoreUnmodifiedSizeProperties_java_lang_Boolean_(
			Boolean newIgnoreUnmodifiedSizeProperties_java_lang_Boolean_) {
		Boolean oldIgnoreUnmodifiedSizeProperties_java_lang_Boolean_ = ignoreUnmodifiedSizeProperties_java_lang_Boolean_;
		ignoreUnmodifiedSizeProperties_java_lang_Boolean_ = newIgnoreUnmodifiedSizeProperties_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__IGNORE_UNMODIFIED_SIZE_PROPERTIES_JAVA_LANG_BOOLEAN_,
					oldIgnoreUnmodifiedSizeProperties_java_lang_Boolean_,
					ignoreUnmodifiedSizeProperties_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKeyName_java_lang_String_() {
		return keyName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeyName_java_lang_String_(String newKeyName_java_lang_String_) {
		String oldKeyName_java_lang_String_ = keyName_java_lang_String_;
		keyName_java_lang_String_ = newKeyName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__KEY_NAME_JAVA_LANG_STRING_,
					oldKeyName_java_lang_String_, keyName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxCapacity_java_lang_Number_() {
		return maxCapacity_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxCapacity_java_lang_Number_(int newMaxCapacity_java_lang_Number_) {
		int oldMaxCapacity_java_lang_Number_ = maxCapacity_java_lang_Number_;
		maxCapacity_java_lang_Number_ = newMaxCapacity_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__MAX_CAPACITY_JAVA_LANG_NUMBER_,
					oldMaxCapacity_java_lang_Number_, maxCapacity_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return maxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newMaxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldMaxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference = maxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		maxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference = newMaxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__MAX_INSTANCE_LIFETIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldMaxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					maxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinCapacity_java_lang_Number_() {
		return minCapacity_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinCapacity_java_lang_Number_(int newMinCapacity_java_lang_Number_) {
		int oldMinCapacity_java_lang_Number_ = minCapacity_java_lang_Number_;
		minCapacity_java_lang_Number_ = newMinCapacity_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__MIN_CAPACITY_JAVA_LANG_NUMBER_,
					oldMinCapacity_java_lang_Number_, minCapacity_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNotificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference() {
		return notificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference(
			String newNotificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference) {
		String oldNotificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference = notificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference;
		notificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference = newNotificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__NOTIFICATIONS_TOPIC_WITH_ITOPIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_SNS_ITOPIC_AS_REFERENCE,
					oldNotificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference,
					notificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getReplacingUpdateMinSuccessfulInstancesPercent_java_lang_Number_() {
		return replacingUpdateMinSuccessfulInstancesPercent_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplacingUpdateMinSuccessfulInstancesPercent_java_lang_Number_(
			int newReplacingUpdateMinSuccessfulInstancesPercent_java_lang_Number_) {
		int oldReplacingUpdateMinSuccessfulInstancesPercent_java_lang_Number_ = replacingUpdateMinSuccessfulInstancesPercent_java_lang_Number_;
		replacingUpdateMinSuccessfulInstancesPercent_java_lang_Number_ = newReplacingUpdateMinSuccessfulInstancesPercent_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__REPLACING_UPDATE_MIN_SUCCESSFUL_INSTANCES_PERCENT_JAVA_LANG_NUMBER_,
					oldReplacingUpdateMinSuccessfulInstancesPercent_java_lang_Number_,
					replacingUpdateMinSuccessfulInstancesPercent_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getResourceSignalCount_java_lang_Number_() {
		return resourceSignalCount_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceSignalCount_java_lang_Number_(int newResourceSignalCount_java_lang_Number_) {
		int oldResourceSignalCount_java_lang_Number_ = resourceSignalCount_java_lang_Number_;
		resourceSignalCount_java_lang_Number_ = newResourceSignalCount_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__RESOURCE_SIGNAL_COUNT_JAVA_LANG_NUMBER_,
					oldResourceSignalCount_java_lang_Number_, resourceSignalCount_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return resourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference = resourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		resourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference = newResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					resourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference() {
		return rollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference(
			String newRollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference) {
		String oldRollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference = rollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference;
		rollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference = newRollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__ROLLING_UPDATE_CONFIGURATION_WITH_ROLLING_UPDATE_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_ROLLING_UPDATE_CONFIGURATION_AS_REFERENCE,
					oldRollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference,
					rollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpotPrice_java_lang_String_() {
		return spotPrice_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpotPrice_java_lang_String_(String newSpotPrice_java_lang_String_) {
		String oldSpotPrice_java_lang_String_ = spotPrice_java_lang_String_;
		spotPrice_java_lang_String_ = newSpotPrice_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__SPOT_PRICE_JAVA_LANG_STRING_,
					oldSpotPrice_java_lang_String_, spotPrice_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateType getUpdateType_software_amazon_awscdk_services_autoscaling_UpdateType_() {
		return updateType_software_amazon_awscdk_services_autoscaling_UpdateType_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdateType_software_amazon_awscdk_services_autoscaling_UpdateType_(
			UpdateType newUpdateType_software_amazon_awscdk_services_autoscaling_UpdateType_) {
		UpdateType oldUpdateType_software_amazon_awscdk_services_autoscaling_UpdateType_ = updateType_software_amazon_awscdk_services_autoscaling_UpdateType_;
		updateType_software_amazon_awscdk_services_autoscaling_UpdateType_ = newUpdateType_software_amazon_awscdk_services_autoscaling_UpdateType_ == null
				? UPDATE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_UPDATE_TYPE__EDEFAULT
				: newUpdateType_software_amazon_awscdk_services_autoscaling_UpdateType_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__UPDATE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_UPDATE_TYPE_,
					oldUpdateType_software_amazon_awscdk_services_autoscaling_UpdateType_,
					updateType_software_amazon_awscdk_services_autoscaling_UpdateType_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() {
		return vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(
			String newVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference) {
		String oldVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference = vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference;
		vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference = newVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE,
					oldVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference,
					vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference));
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
					AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE:
			return getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference();
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE:
			return getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference();
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__CAN_CONTAINERS_ACCESS_INSTANCE_ROLE_JAVA_LANG_BOOLEAN_:
			return getCanContainersAccessInstanceRole_java_lang_Boolean_();
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__SPOT_INSTANCE_DRAINING_JAVA_LANG_BOOLEAN_:
			return getSpotInstanceDraining_java_lang_Boolean_();
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__TASK_DRAIN_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getTaskDrainTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_:
			return getAllowAllOutbound_java_lang_Boolean_();
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__ASSOCIATE_PUBLIC_IP_ADDRESS_JAVA_LANG_BOOLEAN_:
			return getAssociatePublicIpAddress_java_lang_Boolean_();
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_BLOCK_DEVICE_AS_LIST:
			return getBlockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList();
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__DESIRED_CAPACITY_JAVA_LANG_NUMBER_:
			return getDesiredCapacity_java_lang_Number_();
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__HEALTH_CHECK_WITH_HEALTH_CHECK_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_HEALTH_CHECK_AS_REFERENCE:
			return getHealthCheckWithHealthCheck_software_amazon_awscdk_services_ecs_HealthCheck_AsReference();
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__IGNORE_UNMODIFIED_SIZE_PROPERTIES_JAVA_LANG_BOOLEAN_:
			return getIgnoreUnmodifiedSizeProperties_java_lang_Boolean_();
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__KEY_NAME_JAVA_LANG_STRING_:
			return getKeyName_java_lang_String_();
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__MAX_CAPACITY_JAVA_LANG_NUMBER_:
			return getMaxCapacity_java_lang_Number_();
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__MAX_INSTANCE_LIFETIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getMaxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__MIN_CAPACITY_JAVA_LANG_NUMBER_:
			return getMinCapacity_java_lang_Number_();
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__NOTIFICATIONS_TOPIC_WITH_ITOPIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_SNS_ITOPIC_AS_REFERENCE:
			return getNotificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference();
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__REPLACING_UPDATE_MIN_SUCCESSFUL_INSTANCES_PERCENT_JAVA_LANG_NUMBER_:
			return getReplacingUpdateMinSuccessfulInstancesPercent_java_lang_Number_();
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__RESOURCE_SIGNAL_COUNT_JAVA_LANG_NUMBER_:
			return getResourceSignalCount_java_lang_Number_();
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__ROLLING_UPDATE_CONFIGURATION_WITH_ROLLING_UPDATE_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_ROLLING_UPDATE_CONFIGURATION_AS_REFERENCE:
			return getRollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference();
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__SPOT_PRICE_JAVA_LANG_STRING_:
			return getSpotPrice_java_lang_String_();
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__UPDATE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_UPDATE_TYPE_:
			return getUpdateType_software_amazon_awscdk_services_autoscaling_UpdateType_();
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
			return getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE:
			setInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE:
			setMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__CAN_CONTAINERS_ACCESS_INSTANCE_ROLE_JAVA_LANG_BOOLEAN_:
			setCanContainersAccessInstanceRole_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__SPOT_INSTANCE_DRAINING_JAVA_LANG_BOOLEAN_:
			setSpotInstanceDraining_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__TASK_DRAIN_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setTaskDrainTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_:
			setAllowAllOutbound_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__ASSOCIATE_PUBLIC_IP_ADDRESS_JAVA_LANG_BOOLEAN_:
			setAssociatePublicIpAddress_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_BLOCK_DEVICE_AS_LIST:
			setBlockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__DESIRED_CAPACITY_JAVA_LANG_NUMBER_:
			setDesiredCapacity_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__HEALTH_CHECK_WITH_HEALTH_CHECK_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_HEALTH_CHECK_AS_REFERENCE:
			setHealthCheckWithHealthCheck_software_amazon_awscdk_services_ecs_HealthCheck_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__IGNORE_UNMODIFIED_SIZE_PROPERTIES_JAVA_LANG_BOOLEAN_:
			setIgnoreUnmodifiedSizeProperties_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__KEY_NAME_JAVA_LANG_STRING_:
			setKeyName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__MAX_CAPACITY_JAVA_LANG_NUMBER_:
			setMaxCapacity_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__MAX_INSTANCE_LIFETIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setMaxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__MIN_CAPACITY_JAVA_LANG_NUMBER_:
			setMinCapacity_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__NOTIFICATIONS_TOPIC_WITH_ITOPIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_SNS_ITOPIC_AS_REFERENCE:
			setNotificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__REPLACING_UPDATE_MIN_SUCCESSFUL_INSTANCES_PERCENT_JAVA_LANG_NUMBER_:
			setReplacingUpdateMinSuccessfulInstancesPercent_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__RESOURCE_SIGNAL_COUNT_JAVA_LANG_NUMBER_:
			setResourceSignalCount_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__ROLLING_UPDATE_CONFIGURATION_WITH_ROLLING_UPDATE_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_ROLLING_UPDATE_CONFIGURATION_AS_REFERENCE:
			setRollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__SPOT_PRICE_JAVA_LANG_STRING_:
			setSpotPrice_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__UPDATE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_UPDATE_TYPE_:
			setUpdateType_software_amazon_awscdk_services_autoscaling_UpdateType_((UpdateType) newValue);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
			setVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE:
			setInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference(
					INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE:
			setMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference(
					MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__CAN_CONTAINERS_ACCESS_INSTANCE_ROLE_JAVA_LANG_BOOLEAN_:
			setCanContainersAccessInstanceRole_java_lang_Boolean_(
					CAN_CONTAINERS_ACCESS_INSTANCE_ROLE_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__SPOT_INSTANCE_DRAINING_JAVA_LANG_BOOLEAN_:
			setSpotInstanceDraining_java_lang_Boolean_(SPOT_INSTANCE_DRAINING_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__TASK_DRAIN_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setTaskDrainTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					TASK_DRAIN_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_:
			setAllowAllOutbound_java_lang_Boolean_(ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__ASSOCIATE_PUBLIC_IP_ADDRESS_JAVA_LANG_BOOLEAN_:
			setAssociatePublicIpAddress_java_lang_Boolean_(ASSOCIATE_PUBLIC_IP_ADDRESS_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_BLOCK_DEVICE_AS_LIST:
			setBlockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList(
					BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_BLOCK_DEVICE_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__DESIRED_CAPACITY_JAVA_LANG_NUMBER_:
			setDesiredCapacity_java_lang_Number_(DESIRED_CAPACITY_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__HEALTH_CHECK_WITH_HEALTH_CHECK_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_HEALTH_CHECK_AS_REFERENCE:
			setHealthCheckWithHealthCheck_software_amazon_awscdk_services_ecs_HealthCheck_AsReference(
					HEALTH_CHECK_WITH_HEALTH_CHECK_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_HEALTH_CHECK_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__IGNORE_UNMODIFIED_SIZE_PROPERTIES_JAVA_LANG_BOOLEAN_:
			setIgnoreUnmodifiedSizeProperties_java_lang_Boolean_(
					IGNORE_UNMODIFIED_SIZE_PROPERTIES_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__KEY_NAME_JAVA_LANG_STRING_:
			setKeyName_java_lang_String_(KEY_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__MAX_CAPACITY_JAVA_LANG_NUMBER_:
			setMaxCapacity_java_lang_Number_(MAX_CAPACITY_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__MAX_INSTANCE_LIFETIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setMaxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					MAX_INSTANCE_LIFETIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__MIN_CAPACITY_JAVA_LANG_NUMBER_:
			setMinCapacity_java_lang_Number_(MIN_CAPACITY_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__NOTIFICATIONS_TOPIC_WITH_ITOPIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_SNS_ITOPIC_AS_REFERENCE:
			setNotificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference(
					NOTIFICATIONS_TOPIC_WITH_ITOPIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_SNS_ITOPIC_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__REPLACING_UPDATE_MIN_SUCCESSFUL_INSTANCES_PERCENT_JAVA_LANG_NUMBER_:
			setReplacingUpdateMinSuccessfulInstancesPercent_java_lang_Number_(
					REPLACING_UPDATE_MIN_SUCCESSFUL_INSTANCES_PERCENT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__RESOURCE_SIGNAL_COUNT_JAVA_LANG_NUMBER_:
			setResourceSignalCount_java_lang_Number_(RESOURCE_SIGNAL_COUNT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__ROLLING_UPDATE_CONFIGURATION_WITH_ROLLING_UPDATE_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_ROLLING_UPDATE_CONFIGURATION_AS_REFERENCE:
			setRollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference(
					ROLLING_UPDATE_CONFIGURATION_WITH_ROLLING_UPDATE_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_ROLLING_UPDATE_CONFIGURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__SPOT_PRICE_JAVA_LANG_STRING_:
			setSpotPrice_java_lang_String_(SPOT_PRICE_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__UPDATE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_UPDATE_TYPE_:
			setUpdateType_software_amazon_awscdk_services_autoscaling_UpdateType_(
					UPDATE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_UPDATE_TYPE__EDEFAULT);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
			setVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(
					VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE:
			return INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE_EDEFAULT == null
					? instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference != null
					: !INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE_EDEFAULT
							.equals(instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference);
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE:
			return MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE_EDEFAULT == null
					? machineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference != null
					: !MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE_EDEFAULT
							.equals(machineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference);
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__CAN_CONTAINERS_ACCESS_INSTANCE_ROLE_JAVA_LANG_BOOLEAN_:
			return CAN_CONTAINERS_ACCESS_INSTANCE_ROLE_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? canContainersAccessInstanceRole_java_lang_Boolean_ != null
					: !CAN_CONTAINERS_ACCESS_INSTANCE_ROLE_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(canContainersAccessInstanceRole_java_lang_Boolean_);
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__SPOT_INSTANCE_DRAINING_JAVA_LANG_BOOLEAN_:
			return SPOT_INSTANCE_DRAINING_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? spotInstanceDraining_java_lang_Boolean_ != null
					: !SPOT_INSTANCE_DRAINING_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(spotInstanceDraining_java_lang_Boolean_);
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__TASK_DRAIN_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return TASK_DRAIN_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? taskDrainTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !TASK_DRAIN_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(taskDrainTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_:
			return ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN__EDEFAULT == null ? allowAllOutbound_java_lang_Boolean_ != null
					: !ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN__EDEFAULT.equals(allowAllOutbound_java_lang_Boolean_);
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__ASSOCIATE_PUBLIC_IP_ADDRESS_JAVA_LANG_BOOLEAN_:
			return ASSOCIATE_PUBLIC_IP_ADDRESS_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? associatePublicIpAddress_java_lang_Boolean_ != null
					: !ASSOCIATE_PUBLIC_IP_ADDRESS_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(associatePublicIpAddress_java_lang_Boolean_);
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_BLOCK_DEVICE_AS_LIST:
			return BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_BLOCK_DEVICE_AS_LIST_EDEFAULT == null
					? blockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList != null
					: !BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_BLOCK_DEVICE_AS_LIST_EDEFAULT
							.equals(blockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList);
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? cooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(cooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__DESIRED_CAPACITY_JAVA_LANG_NUMBER_:
			return desiredCapacity_java_lang_Number_ != DESIRED_CAPACITY_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__HEALTH_CHECK_WITH_HEALTH_CHECK_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_HEALTH_CHECK_AS_REFERENCE:
			return HEALTH_CHECK_WITH_HEALTH_CHECK_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_HEALTH_CHECK_AS_REFERENCE_EDEFAULT == null
					? healthCheckWithHealthCheck_software_amazon_awscdk_services_ecs_HealthCheck_AsReference != null
					: !HEALTH_CHECK_WITH_HEALTH_CHECK_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_HEALTH_CHECK_AS_REFERENCE_EDEFAULT
							.equals(healthCheckWithHealthCheck_software_amazon_awscdk_services_ecs_HealthCheck_AsReference);
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__IGNORE_UNMODIFIED_SIZE_PROPERTIES_JAVA_LANG_BOOLEAN_:
			return IGNORE_UNMODIFIED_SIZE_PROPERTIES_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? ignoreUnmodifiedSizeProperties_java_lang_Boolean_ != null
					: !IGNORE_UNMODIFIED_SIZE_PROPERTIES_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(ignoreUnmodifiedSizeProperties_java_lang_Boolean_);
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__KEY_NAME_JAVA_LANG_STRING_:
			return KEY_NAME_JAVA_LANG_STRING__EDEFAULT == null ? keyName_java_lang_String_ != null
					: !KEY_NAME_JAVA_LANG_STRING__EDEFAULT.equals(keyName_java_lang_String_);
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__MAX_CAPACITY_JAVA_LANG_NUMBER_:
			return maxCapacity_java_lang_Number_ != MAX_CAPACITY_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__MAX_INSTANCE_LIFETIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return MAX_INSTANCE_LIFETIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? maxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !MAX_INSTANCE_LIFETIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(maxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__MIN_CAPACITY_JAVA_LANG_NUMBER_:
			return minCapacity_java_lang_Number_ != MIN_CAPACITY_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__NOTIFICATIONS_TOPIC_WITH_ITOPIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_SNS_ITOPIC_AS_REFERENCE:
			return NOTIFICATIONS_TOPIC_WITH_ITOPIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_SNS_ITOPIC_AS_REFERENCE_EDEFAULT == null
					? notificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference != null
					: !NOTIFICATIONS_TOPIC_WITH_ITOPIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_SNS_ITOPIC_AS_REFERENCE_EDEFAULT
							.equals(notificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference);
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__REPLACING_UPDATE_MIN_SUCCESSFUL_INSTANCES_PERCENT_JAVA_LANG_NUMBER_:
			return replacingUpdateMinSuccessfulInstancesPercent_java_lang_Number_ != REPLACING_UPDATE_MIN_SUCCESSFUL_INSTANCES_PERCENT_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__RESOURCE_SIGNAL_COUNT_JAVA_LANG_NUMBER_:
			return resourceSignalCount_java_lang_Number_ != RESOURCE_SIGNAL_COUNT_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? resourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(resourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__ROLLING_UPDATE_CONFIGURATION_WITH_ROLLING_UPDATE_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_ROLLING_UPDATE_CONFIGURATION_AS_REFERENCE:
			return ROLLING_UPDATE_CONFIGURATION_WITH_ROLLING_UPDATE_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_ROLLING_UPDATE_CONFIGURATION_AS_REFERENCE_EDEFAULT == null
					? rollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference != null
					: !ROLLING_UPDATE_CONFIGURATION_WITH_ROLLING_UPDATE_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_ROLLING_UPDATE_CONFIGURATION_AS_REFERENCE_EDEFAULT
							.equals(rollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference);
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__SPOT_PRICE_JAVA_LANG_STRING_:
			return SPOT_PRICE_JAVA_LANG_STRING__EDEFAULT == null ? spotPrice_java_lang_String_ != null
					: !SPOT_PRICE_JAVA_LANG_STRING__EDEFAULT.equals(spotPrice_java_lang_String_);
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__UPDATE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_UPDATE_TYPE_:
			return updateType_software_amazon_awscdk_services_autoscaling_UpdateType_ != UPDATE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_UPDATE_TYPE__EDEFAULT;
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
			return VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT == null
					? vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference != null
					: !VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT
							.equals(vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference);
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__ADDITIONAL_CODE:
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
		result.append(" (instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference: ");
		result.append(instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference);
		result.append(
				", machineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference: ");
		result.append(machineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference);
		result.append(", canContainersAccessInstanceRole_java_lang_Boolean_: ");
		result.append(canContainersAccessInstanceRole_java_lang_Boolean_);
		result.append(", spotInstanceDraining_java_lang_Boolean_: ");
		result.append(spotInstanceDraining_java_lang_Boolean_);
		result.append(", taskDrainTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(taskDrainTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		result.append(", allowAllOutbound_java_lang_Boolean_: ");
		result.append(allowAllOutbound_java_lang_Boolean_);
		result.append(", associatePublicIpAddress_java_lang_Boolean_: ");
		result.append(associatePublicIpAddress_java_lang_Boolean_);
		result.append(", blockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList: ");
		result.append(blockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList);
		result.append(", cooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(cooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		result.append(", desiredCapacity_java_lang_Number_: ");
		result.append(desiredCapacity_java_lang_Number_);
		result.append(", healthCheckWithHealthCheck_software_amazon_awscdk_services_ecs_HealthCheck_AsReference: ");
		result.append(healthCheckWithHealthCheck_software_amazon_awscdk_services_ecs_HealthCheck_AsReference);
		result.append(", ignoreUnmodifiedSizeProperties_java_lang_Boolean_: ");
		result.append(ignoreUnmodifiedSizeProperties_java_lang_Boolean_);
		result.append(", keyName_java_lang_String_: ");
		result.append(keyName_java_lang_String_);
		result.append(", maxCapacity_java_lang_Number_: ");
		result.append(maxCapacity_java_lang_Number_);
		result.append(", maxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(maxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		result.append(", minCapacity_java_lang_Number_: ");
		result.append(minCapacity_java_lang_Number_);
		result.append(", notificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference: ");
		result.append(notificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference);
		result.append(", replacingUpdateMinSuccessfulInstancesPercent_java_lang_Number_: ");
		result.append(replacingUpdateMinSuccessfulInstancesPercent_java_lang_Number_);
		result.append(", resourceSignalCount_java_lang_Number_: ");
		result.append(resourceSignalCount_java_lang_Number_);
		result.append(", resourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(resourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		result.append(
				", rollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference: ");
		result.append(
				rollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference);
		result.append(", spotPrice_java_lang_String_: ");
		result.append(spotPrice_java_lang_String_);
		result.append(", updateType_software_amazon_awscdk_services_autoscaling_UpdateType_: ");
		result.append(updateType_software_amazon_awscdk_services_autoscaling_UpdateType_);
		result.append(
				", vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference: ");
		result.append(vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference);
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

} //AddCapacityOptionsBuilder_ecsImpl
