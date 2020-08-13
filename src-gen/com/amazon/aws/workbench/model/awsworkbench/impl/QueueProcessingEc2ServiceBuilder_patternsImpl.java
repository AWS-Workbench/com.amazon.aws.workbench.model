/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.PropagatedTagSource;
import com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Queue Processing Ec2 Service Builder patterns</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueProcessingEc2ServiceBuilder_patternsImpl#getImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference <em>Image With Container Image software amazon awscdk services ecs Container Image As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueProcessingEc2ServiceBuilder_patternsImpl#getClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference <em>Cluster With ICluster software amazon awscdk services ecs ICluster As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueProcessingEc2ServiceBuilder_patternsImpl#getCommand_java_lang_String_AsList <em>Command java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueProcessingEc2ServiceBuilder_patternsImpl#getDesiredTaskCount_java_lang_Number_ <em>Desired Task Count java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueProcessingEc2ServiceBuilder_patternsImpl#getEnableEcsManagedTags_java_lang_Boolean_ <em>Enable Ecs Managed Tags java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueProcessingEc2ServiceBuilder_patternsImpl#getEnableLogging_java_lang_Boolean_ <em>Enable Logging java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueProcessingEc2ServiceBuilder_patternsImpl#getEnvironment_java_lang_String__java_lang_String_AsMap <em>Environment java lang String java lang String As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueProcessingEc2ServiceBuilder_patternsImpl#getFamily_java_lang_String_ <em>Family java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueProcessingEc2ServiceBuilder_patternsImpl#getLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference <em>Log Driver With Log Driver software amazon awscdk services ecs Log Driver As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueProcessingEc2ServiceBuilder_patternsImpl#getMaxHealthyPercent_java_lang_Number_ <em>Max Healthy Percent java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueProcessingEc2ServiceBuilder_patternsImpl#getMaxReceiveCount_java_lang_Number_ <em>Max Receive Count java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueProcessingEc2ServiceBuilder_patternsImpl#getMaxScalingCapacity_java_lang_Number_ <em>Max Scaling Capacity java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueProcessingEc2ServiceBuilder_patternsImpl#getMinHealthyPercent_java_lang_Number_ <em>Min Healthy Percent java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueProcessingEc2ServiceBuilder_patternsImpl#getPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_ <em>Propagate Tags software amazon awscdk services ecs Propagated Tag Source </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueProcessingEc2ServiceBuilder_patternsImpl#getQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference <em>Queue With IQueue software amazon awscdk services sqs IQueue As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueProcessingEc2ServiceBuilder_patternsImpl#getRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Retention Period With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueProcessingEc2ServiceBuilder_patternsImpl#getScalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsList <em>Scaling Steps software amazon awscdk services applicationautoscaling Scaling Interval As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueProcessingEc2ServiceBuilder_patternsImpl#getSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap <em>Secrets java lang String software amazon awscdk services ecs Secret As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueProcessingEc2ServiceBuilder_patternsImpl#getServiceName_java_lang_String_ <em>Service Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueProcessingEc2ServiceBuilder_patternsImpl#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueProcessingEc2ServiceBuilder_patternsImpl#getCpu_java_lang_Number_ <em>Cpu java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueProcessingEc2ServiceBuilder_patternsImpl#getMemoryLimitMiB_java_lang_Number_ <em>Memory Limit Mi Bjava lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueProcessingEc2ServiceBuilder_patternsImpl#getMemoryReservationMiB_java_lang_Number_ <em>Memory Reservation Mi Bjava lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueProcessingEc2ServiceBuilder_patternsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueProcessingEc2ServiceBuilder_patternsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueProcessingEc2ServiceBuilder_patternsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueProcessingEc2ServiceBuilder_patternsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueueProcessingEc2ServiceBuilder_patternsImpl extends ServiceResourcesImpl
		implements QueueProcessingEc2ServiceBuilder_patterns {
	/**
	 * The default value of the '{@link #getImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference() <em>Image With Container Image software amazon awscdk services ecs Container Image As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_WITH_CONTAINER_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CONTAINER_IMAGE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference() <em>Image With Container Image software amazon awscdk services ecs Container Image As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String imageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference = IMAGE_WITH_CONTAINER_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CONTAINER_IMAGE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference() <em>Cluster With ICluster software amazon awscdk services ecs ICluster As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String CLUSTER_WITH_ICLUSTER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ICLUSTER_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference() <em>Cluster With ICluster software amazon awscdk services ecs ICluster As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String clusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference = CLUSTER_WITH_ICLUSTER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ICLUSTER_AS_REFERENCE_EDEFAULT;

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
	 * The default value of the '{@link #getDesiredTaskCount_java_lang_Number_() <em>Desired Task Count java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredTaskCount_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int DESIRED_TASK_COUNT_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDesiredTaskCount_java_lang_Number_() <em>Desired Task Count java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredTaskCount_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int desiredTaskCount_java_lang_Number_ = DESIRED_TASK_COUNT_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getEnableEcsManagedTags_java_lang_Boolean_() <em>Enable Ecs Managed Tags java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableEcsManagedTags_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ENABLE_ECS_MANAGED_TAGS_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnableEcsManagedTags_java_lang_Boolean_() <em>Enable Ecs Managed Tags java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableEcsManagedTags_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean enableEcsManagedTags_java_lang_Boolean_ = ENABLE_ECS_MANAGED_TAGS_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getEnableLogging_java_lang_Boolean_() <em>Enable Logging java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableLogging_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ENABLE_LOGGING_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnableLogging_java_lang_Boolean_() <em>Enable Logging java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableLogging_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean enableLogging_java_lang_Boolean_ = ENABLE_LOGGING_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getEnvironment_java_lang_String__java_lang_String_AsMap() <em>Environment java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnvironment_java_lang_String__java_lang_String_AsMap() <em>Environment java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String environment_java_lang_String__java_lang_String_AsMap = ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getFamily_java_lang_String_() <em>Family java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String FAMILY_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFamily_java_lang_String_() <em>Family java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String family_java_lang_String_ = FAMILY_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference() <em>Log Driver With Log Driver software amazon awscdk services ecs Log Driver As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_DRIVER_WITH_LOG_DRIVER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_LOG_DRIVER_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference() <em>Log Driver With Log Driver software amazon awscdk services ecs Log Driver As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String logDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference = LOG_DRIVER_WITH_LOG_DRIVER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_LOG_DRIVER_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxHealthyPercent_java_lang_Number_() <em>Max Healthy Percent java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHealthyPercent_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_HEALTHY_PERCENT_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxHealthyPercent_java_lang_Number_() <em>Max Healthy Percent java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHealthyPercent_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int maxHealthyPercent_java_lang_Number_ = MAX_HEALTHY_PERCENT_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxReceiveCount_java_lang_Number_() <em>Max Receive Count java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxReceiveCount_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxReceiveCount_java_lang_Number_() <em>Max Receive Count java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxReceiveCount_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int maxReceiveCount_java_lang_Number_ = MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxScalingCapacity_java_lang_Number_() <em>Max Scaling Capacity java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxScalingCapacity_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_SCALING_CAPACITY_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxScalingCapacity_java_lang_Number_() <em>Max Scaling Capacity java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxScalingCapacity_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int maxScalingCapacity_java_lang_Number_ = MAX_SCALING_CAPACITY_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getMinHealthyPercent_java_lang_Number_() <em>Min Healthy Percent java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinHealthyPercent_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_HEALTHY_PERCENT_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinHealthyPercent_java_lang_Number_() <em>Min Healthy Percent java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinHealthyPercent_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int minHealthyPercent_java_lang_Number_ = MIN_HEALTHY_PERCENT_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_() <em>Propagate Tags software amazon awscdk services ecs Propagated Tag Source </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_()
	 * @generated
	 * @ordered
	 */
	protected static final PropagatedTagSource PROPAGATE_TAGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROPAGATED_TAG_SOURCE__EDEFAULT = PropagatedTagSource.SERVICE;

	/**
	 * The cached value of the '{@link #getPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_() <em>Propagate Tags software amazon awscdk services ecs Propagated Tag Source </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_()
	 * @generated
	 * @ordered
	 */
	protected PropagatedTagSource propagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_ = PROPAGATE_TAGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROPAGATED_TAG_SOURCE__EDEFAULT;

	/**
	 * The default value of the '{@link #getQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference() <em>Queue With IQueue software amazon awscdk services sqs IQueue As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference() <em>Queue With IQueue software amazon awscdk services sqs IQueue As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String queueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference = QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Retention Period With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String RETENTION_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Retention Period With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String retentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference = RETENTION_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsList() <em>Scaling Steps software amazon awscdk services applicationautoscaling Scaling Interval As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALING_STEPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APPLICATIONAUTOSCALING_SCALING_INTERVAL_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsList() <em>Scaling Steps software amazon awscdk services applicationautoscaling Scaling Interval As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsList()
	 * @generated
	 * @ordered
	 */
	protected String scalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsList = SCALING_STEPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APPLICATIONAUTOSCALING_SCALING_INTERVAL_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap() <em>Secrets java lang String software amazon awscdk services ecs Secret As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String SECRETS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SECRET_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap() <em>Secrets java lang String software amazon awscdk services ecs Secret As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String secrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap = SECRETS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SECRET_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceName_java_lang_String_() <em>Service Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceName_java_lang_String_() <em>Service Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String serviceName_java_lang_String_ = SERVICE_NAME_JAVA_LANG_STRING__EDEFAULT;

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
	 * The default value of the '{@link #getCpu_java_lang_Number_() <em>Cpu java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int CPU_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCpu_java_lang_Number_() <em>Cpu java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int cpu_java_lang_Number_ = CPU_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getMemoryLimitMiB_java_lang_Number_() <em>Memory Limit Mi Bjava lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryLimitMiB_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemoryLimitMiB_java_lang_Number_() <em>Memory Limit Mi Bjava lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryLimitMiB_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int memoryLimitMiB_java_lang_Number_ = MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getMemoryReservationMiB_java_lang_Number_() <em>Memory Reservation Mi Bjava lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryReservationMiB_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_RESERVATION_MI_BJAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemoryReservationMiB_java_lang_Number_() <em>Memory Reservation Mi Bjava lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryReservationMiB_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int memoryReservationMiB_java_lang_Number_ = MEMORY_RESERVATION_MI_BJAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ecs.patterns.QueueProcessingEc2Service";

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
	protected QueueProcessingEc2ServiceBuilder_patternsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference() {
		return imageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference(
			String newImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference) {
		String oldImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference = imageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference;
		imageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference = newImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__IMAGE_WITH_CONTAINER_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CONTAINER_IMAGE_AS_REFERENCE,
					oldImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference,
					imageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference() {
		return clusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference(
			String newClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference) {
		String oldClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference = clusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference;
		clusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference = newClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__CLUSTER_WITH_ICLUSTER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ICLUSTER_AS_REFERENCE,
					oldClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference,
					clusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference));
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
					AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__COMMAND_JAVA_LANG_STRING_AS_LIST,
					oldCommand_java_lang_String_AsList, command_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDesiredTaskCount_java_lang_Number_() {
		return desiredTaskCount_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesiredTaskCount_java_lang_Number_(int newDesiredTaskCount_java_lang_Number_) {
		int oldDesiredTaskCount_java_lang_Number_ = desiredTaskCount_java_lang_Number_;
		desiredTaskCount_java_lang_Number_ = newDesiredTaskCount_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__DESIRED_TASK_COUNT_JAVA_LANG_NUMBER_,
					oldDesiredTaskCount_java_lang_Number_, desiredTaskCount_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getEnableEcsManagedTags_java_lang_Boolean_() {
		return enableEcsManagedTags_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableEcsManagedTags_java_lang_Boolean_(Boolean newEnableEcsManagedTags_java_lang_Boolean_) {
		Boolean oldEnableEcsManagedTags_java_lang_Boolean_ = enableEcsManagedTags_java_lang_Boolean_;
		enableEcsManagedTags_java_lang_Boolean_ = newEnableEcsManagedTags_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__ENABLE_ECS_MANAGED_TAGS_JAVA_LANG_BOOLEAN_,
					oldEnableEcsManagedTags_java_lang_Boolean_, enableEcsManagedTags_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getEnableLogging_java_lang_Boolean_() {
		return enableLogging_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableLogging_java_lang_Boolean_(Boolean newEnableLogging_java_lang_Boolean_) {
		Boolean oldEnableLogging_java_lang_Boolean_ = enableLogging_java_lang_Boolean_;
		enableLogging_java_lang_Boolean_ = newEnableLogging_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__ENABLE_LOGGING_JAVA_LANG_BOOLEAN_,
					oldEnableLogging_java_lang_Boolean_, enableLogging_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnvironment_java_lang_String__java_lang_String_AsMap() {
		return environment_java_lang_String__java_lang_String_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnvironment_java_lang_String__java_lang_String_AsMap(
			String newEnvironment_java_lang_String__java_lang_String_AsMap) {
		String oldEnvironment_java_lang_String__java_lang_String_AsMap = environment_java_lang_String__java_lang_String_AsMap;
		environment_java_lang_String__java_lang_String_AsMap = newEnvironment_java_lang_String__java_lang_String_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
					oldEnvironment_java_lang_String__java_lang_String_AsMap,
					environment_java_lang_String__java_lang_String_AsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFamily_java_lang_String_() {
		return family_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFamily_java_lang_String_(String newFamily_java_lang_String_) {
		String oldFamily_java_lang_String_ = family_java_lang_String_;
		family_java_lang_String_ = newFamily_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__FAMILY_JAVA_LANG_STRING_,
					oldFamily_java_lang_String_, family_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference() {
		return logDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference(
			String newLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference) {
		String oldLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference = logDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference;
		logDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference = newLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__LOG_DRIVER_WITH_LOG_DRIVER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_LOG_DRIVER_AS_REFERENCE,
					oldLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference,
					logDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxHealthyPercent_java_lang_Number_() {
		return maxHealthyPercent_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxHealthyPercent_java_lang_Number_(int newMaxHealthyPercent_java_lang_Number_) {
		int oldMaxHealthyPercent_java_lang_Number_ = maxHealthyPercent_java_lang_Number_;
		maxHealthyPercent_java_lang_Number_ = newMaxHealthyPercent_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__MAX_HEALTHY_PERCENT_JAVA_LANG_NUMBER_,
					oldMaxHealthyPercent_java_lang_Number_, maxHealthyPercent_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxReceiveCount_java_lang_Number_() {
		return maxReceiveCount_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxReceiveCount_java_lang_Number_(int newMaxReceiveCount_java_lang_Number_) {
		int oldMaxReceiveCount_java_lang_Number_ = maxReceiveCount_java_lang_Number_;
		maxReceiveCount_java_lang_Number_ = newMaxReceiveCount_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_,
					oldMaxReceiveCount_java_lang_Number_, maxReceiveCount_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxScalingCapacity_java_lang_Number_() {
		return maxScalingCapacity_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxScalingCapacity_java_lang_Number_(int newMaxScalingCapacity_java_lang_Number_) {
		int oldMaxScalingCapacity_java_lang_Number_ = maxScalingCapacity_java_lang_Number_;
		maxScalingCapacity_java_lang_Number_ = newMaxScalingCapacity_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__MAX_SCALING_CAPACITY_JAVA_LANG_NUMBER_,
					oldMaxScalingCapacity_java_lang_Number_, maxScalingCapacity_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinHealthyPercent_java_lang_Number_() {
		return minHealthyPercent_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinHealthyPercent_java_lang_Number_(int newMinHealthyPercent_java_lang_Number_) {
		int oldMinHealthyPercent_java_lang_Number_ = minHealthyPercent_java_lang_Number_;
		minHealthyPercent_java_lang_Number_ = newMinHealthyPercent_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__MIN_HEALTHY_PERCENT_JAVA_LANG_NUMBER_,
					oldMinHealthyPercent_java_lang_Number_, minHealthyPercent_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropagatedTagSource getPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_() {
		return propagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_(
			PropagatedTagSource newPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_) {
		PropagatedTagSource oldPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_ = propagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_;
		propagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_ = newPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_ == null
				? PROPAGATE_TAGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROPAGATED_TAG_SOURCE__EDEFAULT
				: newPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__PROPAGATE_TAGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROPAGATED_TAG_SOURCE_,
					oldPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_,
					propagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference() {
		return queueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference(
			String newQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference) {
		String oldQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference = queueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference;
		queueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference = newQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE,
					oldQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference,
					queueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return retentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference = retentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		retentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference = newRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__RETENTION_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					retentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsList() {
		return scalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsList(
			String newScalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsList) {
		String oldScalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsList = scalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsList;
		scalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsList = newScalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__SCALING_STEPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APPLICATIONAUTOSCALING_SCALING_INTERVAL_AS_LIST,
					oldScalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsList,
					scalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap() {
		return secrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap(
			String newSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap) {
		String oldSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap = secrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap;
		secrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap = newSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__SECRETS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SECRET_AS_MAP,
					oldSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap,
					secrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceName_java_lang_String_() {
		return serviceName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceName_java_lang_String_(String newServiceName_java_lang_String_) {
		String oldServiceName_java_lang_String_ = serviceName_java_lang_String_;
		serviceName_java_lang_String_ = newServiceName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__SERVICE_NAME_JAVA_LANG_STRING_,
					oldServiceName_java_lang_String_, serviceName_java_lang_String_));
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
					AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE,
					oldVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference,
					vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCpu_java_lang_Number_() {
		return cpu_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCpu_java_lang_Number_(int newCpu_java_lang_Number_) {
		int oldCpu_java_lang_Number_ = cpu_java_lang_Number_;
		cpu_java_lang_Number_ = newCpu_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__CPU_JAVA_LANG_NUMBER_,
					oldCpu_java_lang_Number_, cpu_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMemoryLimitMiB_java_lang_Number_() {
		return memoryLimitMiB_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemoryLimitMiB_java_lang_Number_(int newMemoryLimitMiB_java_lang_Number_) {
		int oldMemoryLimitMiB_java_lang_Number_ = memoryLimitMiB_java_lang_Number_;
		memoryLimitMiB_java_lang_Number_ = newMemoryLimitMiB_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER_,
					oldMemoryLimitMiB_java_lang_Number_, memoryLimitMiB_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMemoryReservationMiB_java_lang_Number_() {
		return memoryReservationMiB_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemoryReservationMiB_java_lang_Number_(int newMemoryReservationMiB_java_lang_Number_) {
		int oldMemoryReservationMiB_java_lang_Number_ = memoryReservationMiB_java_lang_Number_;
		memoryReservationMiB_java_lang_Number_ = newMemoryReservationMiB_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__MEMORY_RESERVATION_MI_BJAVA_LANG_NUMBER_,
					oldMemoryReservationMiB_java_lang_Number_, memoryReservationMiB_java_lang_Number_));
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
					AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__IDENTIFIER, oldIdentifier,
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
					AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__ADDITIONAL_CODE,
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
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__IMAGE_WITH_CONTAINER_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CONTAINER_IMAGE_AS_REFERENCE:
			return getImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference();
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__CLUSTER_WITH_ICLUSTER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ICLUSTER_AS_REFERENCE:
			return getClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference();
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__COMMAND_JAVA_LANG_STRING_AS_LIST:
			return getCommand_java_lang_String_AsList();
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__DESIRED_TASK_COUNT_JAVA_LANG_NUMBER_:
			return getDesiredTaskCount_java_lang_Number_();
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__ENABLE_ECS_MANAGED_TAGS_JAVA_LANG_BOOLEAN_:
			return getEnableEcsManagedTags_java_lang_Boolean_();
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__ENABLE_LOGGING_JAVA_LANG_BOOLEAN_:
			return getEnableLogging_java_lang_Boolean_();
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return getEnvironment_java_lang_String__java_lang_String_AsMap();
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__FAMILY_JAVA_LANG_STRING_:
			return getFamily_java_lang_String_();
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__LOG_DRIVER_WITH_LOG_DRIVER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_LOG_DRIVER_AS_REFERENCE:
			return getLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference();
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__MAX_HEALTHY_PERCENT_JAVA_LANG_NUMBER_:
			return getMaxHealthyPercent_java_lang_Number_();
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_:
			return getMaxReceiveCount_java_lang_Number_();
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__MAX_SCALING_CAPACITY_JAVA_LANG_NUMBER_:
			return getMaxScalingCapacity_java_lang_Number_();
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__MIN_HEALTHY_PERCENT_JAVA_LANG_NUMBER_:
			return getMinHealthyPercent_java_lang_Number_();
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__PROPAGATE_TAGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROPAGATED_TAG_SOURCE_:
			return getPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_();
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE:
			return getQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference();
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__RETENTION_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__SCALING_STEPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APPLICATIONAUTOSCALING_SCALING_INTERVAL_AS_LIST:
			return getScalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsList();
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__SECRETS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SECRET_AS_MAP:
			return getSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap();
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__SERVICE_NAME_JAVA_LANG_STRING_:
			return getServiceName_java_lang_String_();
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			return getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__CPU_JAVA_LANG_NUMBER_:
			return getCpu_java_lang_Number_();
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER_:
			return getMemoryLimitMiB_java_lang_Number_();
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__MEMORY_RESERVATION_MI_BJAVA_LANG_NUMBER_:
			return getMemoryReservationMiB_java_lang_Number_();
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__IMAGE_WITH_CONTAINER_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CONTAINER_IMAGE_AS_REFERENCE:
			setImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__CLUSTER_WITH_ICLUSTER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ICLUSTER_AS_REFERENCE:
			setClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__COMMAND_JAVA_LANG_STRING_AS_LIST:
			setCommand_java_lang_String_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__DESIRED_TASK_COUNT_JAVA_LANG_NUMBER_:
			setDesiredTaskCount_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__ENABLE_ECS_MANAGED_TAGS_JAVA_LANG_BOOLEAN_:
			setEnableEcsManagedTags_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__ENABLE_LOGGING_JAVA_LANG_BOOLEAN_:
			setEnableLogging_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setEnvironment_java_lang_String__java_lang_String_AsMap((String) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__FAMILY_JAVA_LANG_STRING_:
			setFamily_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__LOG_DRIVER_WITH_LOG_DRIVER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_LOG_DRIVER_AS_REFERENCE:
			setLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__MAX_HEALTHY_PERCENT_JAVA_LANG_NUMBER_:
			setMaxHealthyPercent_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_:
			setMaxReceiveCount_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__MAX_SCALING_CAPACITY_JAVA_LANG_NUMBER_:
			setMaxScalingCapacity_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__MIN_HEALTHY_PERCENT_JAVA_LANG_NUMBER_:
			setMinHealthyPercent_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__PROPAGATE_TAGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROPAGATED_TAG_SOURCE_:
			setPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_((PropagatedTagSource) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE:
			setQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__RETENTION_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__SCALING_STEPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APPLICATIONAUTOSCALING_SCALING_INTERVAL_AS_LIST:
			setScalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsList(
					(String) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__SECRETS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SECRET_AS_MAP:
			setSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap((String) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__SERVICE_NAME_JAVA_LANG_STRING_:
			setServiceName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__CPU_JAVA_LANG_NUMBER_:
			setCpu_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER_:
			setMemoryLimitMiB_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__MEMORY_RESERVATION_MI_BJAVA_LANG_NUMBER_:
			setMemoryReservationMiB_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__IMAGE_WITH_CONTAINER_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CONTAINER_IMAGE_AS_REFERENCE:
			setImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference(
					IMAGE_WITH_CONTAINER_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CONTAINER_IMAGE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__CLUSTER_WITH_ICLUSTER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ICLUSTER_AS_REFERENCE:
			setClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference(
					CLUSTER_WITH_ICLUSTER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ICLUSTER_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__COMMAND_JAVA_LANG_STRING_AS_LIST:
			setCommand_java_lang_String_AsList(COMMAND_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__DESIRED_TASK_COUNT_JAVA_LANG_NUMBER_:
			setDesiredTaskCount_java_lang_Number_(DESIRED_TASK_COUNT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__ENABLE_ECS_MANAGED_TAGS_JAVA_LANG_BOOLEAN_:
			setEnableEcsManagedTags_java_lang_Boolean_(ENABLE_ECS_MANAGED_TAGS_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__ENABLE_LOGGING_JAVA_LANG_BOOLEAN_:
			setEnableLogging_java_lang_Boolean_(ENABLE_LOGGING_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setEnvironment_java_lang_String__java_lang_String_AsMap(
					ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__FAMILY_JAVA_LANG_STRING_:
			setFamily_java_lang_String_(FAMILY_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__LOG_DRIVER_WITH_LOG_DRIVER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_LOG_DRIVER_AS_REFERENCE:
			setLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference(
					LOG_DRIVER_WITH_LOG_DRIVER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_LOG_DRIVER_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__MAX_HEALTHY_PERCENT_JAVA_LANG_NUMBER_:
			setMaxHealthyPercent_java_lang_Number_(MAX_HEALTHY_PERCENT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_:
			setMaxReceiveCount_java_lang_Number_(MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__MAX_SCALING_CAPACITY_JAVA_LANG_NUMBER_:
			setMaxScalingCapacity_java_lang_Number_(MAX_SCALING_CAPACITY_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__MIN_HEALTHY_PERCENT_JAVA_LANG_NUMBER_:
			setMinHealthyPercent_java_lang_Number_(MIN_HEALTHY_PERCENT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__PROPAGATE_TAGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROPAGATED_TAG_SOURCE_:
			setPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_(
					PROPAGATE_TAGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROPAGATED_TAG_SOURCE__EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE:
			setQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference(
					QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__RETENTION_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					RETENTION_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__SCALING_STEPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APPLICATIONAUTOSCALING_SCALING_INTERVAL_AS_LIST:
			setScalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsList(
					SCALING_STEPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APPLICATIONAUTOSCALING_SCALING_INTERVAL_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__SECRETS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SECRET_AS_MAP:
			setSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap(
					SECRETS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SECRET_AS_MAP_EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__SERVICE_NAME_JAVA_LANG_STRING_:
			setServiceName_java_lang_String_(SERVICE_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(
					VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__CPU_JAVA_LANG_NUMBER_:
			setCpu_java_lang_Number_(CPU_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER_:
			setMemoryLimitMiB_java_lang_Number_(MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__MEMORY_RESERVATION_MI_BJAVA_LANG_NUMBER_:
			setMemoryReservationMiB_java_lang_Number_(MEMORY_RESERVATION_MI_BJAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__IMAGE_WITH_CONTAINER_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CONTAINER_IMAGE_AS_REFERENCE:
			return IMAGE_WITH_CONTAINER_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CONTAINER_IMAGE_AS_REFERENCE_EDEFAULT == null
					? imageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference != null
					: !IMAGE_WITH_CONTAINER_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CONTAINER_IMAGE_AS_REFERENCE_EDEFAULT
							.equals(imageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference);
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__CLUSTER_WITH_ICLUSTER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ICLUSTER_AS_REFERENCE:
			return CLUSTER_WITH_ICLUSTER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ICLUSTER_AS_REFERENCE_EDEFAULT == null
					? clusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference != null
					: !CLUSTER_WITH_ICLUSTER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ICLUSTER_AS_REFERENCE_EDEFAULT
							.equals(clusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference);
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__COMMAND_JAVA_LANG_STRING_AS_LIST:
			return COMMAND_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null ? command_java_lang_String_AsList != null
					: !COMMAND_JAVA_LANG_STRING_AS_LIST_EDEFAULT.equals(command_java_lang_String_AsList);
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__DESIRED_TASK_COUNT_JAVA_LANG_NUMBER_:
			return desiredTaskCount_java_lang_Number_ != DESIRED_TASK_COUNT_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__ENABLE_ECS_MANAGED_TAGS_JAVA_LANG_BOOLEAN_:
			return ENABLE_ECS_MANAGED_TAGS_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? enableEcsManagedTags_java_lang_Boolean_ != null
					: !ENABLE_ECS_MANAGED_TAGS_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(enableEcsManagedTags_java_lang_Boolean_);
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__ENABLE_LOGGING_JAVA_LANG_BOOLEAN_:
			return ENABLE_LOGGING_JAVA_LANG_BOOLEAN__EDEFAULT == null ? enableLogging_java_lang_Boolean_ != null
					: !ENABLE_LOGGING_JAVA_LANG_BOOLEAN__EDEFAULT.equals(enableLogging_java_lang_Boolean_);
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT == null
					? environment_java_lang_String__java_lang_String_AsMap != null
					: !ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT
							.equals(environment_java_lang_String__java_lang_String_AsMap);
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__FAMILY_JAVA_LANG_STRING_:
			return FAMILY_JAVA_LANG_STRING__EDEFAULT == null ? family_java_lang_String_ != null
					: !FAMILY_JAVA_LANG_STRING__EDEFAULT.equals(family_java_lang_String_);
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__LOG_DRIVER_WITH_LOG_DRIVER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_LOG_DRIVER_AS_REFERENCE:
			return LOG_DRIVER_WITH_LOG_DRIVER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_LOG_DRIVER_AS_REFERENCE_EDEFAULT == null
					? logDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference != null
					: !LOG_DRIVER_WITH_LOG_DRIVER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_LOG_DRIVER_AS_REFERENCE_EDEFAULT
							.equals(logDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference);
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__MAX_HEALTHY_PERCENT_JAVA_LANG_NUMBER_:
			return maxHealthyPercent_java_lang_Number_ != MAX_HEALTHY_PERCENT_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_:
			return maxReceiveCount_java_lang_Number_ != MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__MAX_SCALING_CAPACITY_JAVA_LANG_NUMBER_:
			return maxScalingCapacity_java_lang_Number_ != MAX_SCALING_CAPACITY_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__MIN_HEALTHY_PERCENT_JAVA_LANG_NUMBER_:
			return minHealthyPercent_java_lang_Number_ != MIN_HEALTHY_PERCENT_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__PROPAGATE_TAGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROPAGATED_TAG_SOURCE_:
			return propagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_ != PROPAGATE_TAGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROPAGATED_TAG_SOURCE__EDEFAULT;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE:
			return QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE_EDEFAULT == null
					? queueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference != null
					: !QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE_EDEFAULT
							.equals(queueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference);
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__RETENTION_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return RETENTION_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? retentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !RETENTION_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(retentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__SCALING_STEPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APPLICATIONAUTOSCALING_SCALING_INTERVAL_AS_LIST:
			return SCALING_STEPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APPLICATIONAUTOSCALING_SCALING_INTERVAL_AS_LIST_EDEFAULT == null
					? scalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsList != null
					: !SCALING_STEPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APPLICATIONAUTOSCALING_SCALING_INTERVAL_AS_LIST_EDEFAULT
							.equals(scalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsList);
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__SECRETS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SECRET_AS_MAP:
			return SECRETS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SECRET_AS_MAP_EDEFAULT == null
					? secrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap != null
					: !SECRETS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SECRET_AS_MAP_EDEFAULT
							.equals(secrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap);
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__SERVICE_NAME_JAVA_LANG_STRING_:
			return SERVICE_NAME_JAVA_LANG_STRING__EDEFAULT == null ? serviceName_java_lang_String_ != null
					: !SERVICE_NAME_JAVA_LANG_STRING__EDEFAULT.equals(serviceName_java_lang_String_);
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			return VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT == null
					? vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference != null
					: !VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT
							.equals(vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference);
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__CPU_JAVA_LANG_NUMBER_:
			return cpu_java_lang_Number_ != CPU_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER_:
			return memoryLimitMiB_java_lang_Number_ != MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__MEMORY_RESERVATION_MI_BJAVA_LANG_NUMBER_:
			return memoryReservationMiB_java_lang_Number_ != MEMORY_RESERVATION_MI_BJAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
		result.append(" (imageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference: ");
		result.append(imageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference);
		result.append(", clusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference: ");
		result.append(clusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference);
		result.append(", command_java_lang_String_AsList: ");
		result.append(command_java_lang_String_AsList);
		result.append(", desiredTaskCount_java_lang_Number_: ");
		result.append(desiredTaskCount_java_lang_Number_);
		result.append(", enableEcsManagedTags_java_lang_Boolean_: ");
		result.append(enableEcsManagedTags_java_lang_Boolean_);
		result.append(", enableLogging_java_lang_Boolean_: ");
		result.append(enableLogging_java_lang_Boolean_);
		result.append(", environment_java_lang_String__java_lang_String_AsMap: ");
		result.append(environment_java_lang_String__java_lang_String_AsMap);
		result.append(", family_java_lang_String_: ");
		result.append(family_java_lang_String_);
		result.append(", logDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference: ");
		result.append(logDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference);
		result.append(", maxHealthyPercent_java_lang_Number_: ");
		result.append(maxHealthyPercent_java_lang_Number_);
		result.append(", maxReceiveCount_java_lang_Number_: ");
		result.append(maxReceiveCount_java_lang_Number_);
		result.append(", maxScalingCapacity_java_lang_Number_: ");
		result.append(maxScalingCapacity_java_lang_Number_);
		result.append(", minHealthyPercent_java_lang_Number_: ");
		result.append(minHealthyPercent_java_lang_Number_);
		result.append(", propagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_: ");
		result.append(propagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_);
		result.append(", queueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference: ");
		result.append(queueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference);
		result.append(", retentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(retentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		result.append(", scalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsList: ");
		result.append(scalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsList);
		result.append(", secrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap: ");
		result.append(secrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap);
		result.append(", serviceName_java_lang_String_: ");
		result.append(serviceName_java_lang_String_);
		result.append(", vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference: ");
		result.append(vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference);
		result.append(", cpu_java_lang_Number_: ");
		result.append(cpu_java_lang_Number_);
		result.append(", memoryLimitMiB_java_lang_Number_: ");
		result.append(memoryLimitMiB_java_lang_Number_);
		result.append(", memoryReservationMiB_java_lang_Number_: ");
		result.append(memoryReservationMiB_java_lang_Number_);
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

} //QueueProcessingEc2ServiceBuilder_patternsImpl
