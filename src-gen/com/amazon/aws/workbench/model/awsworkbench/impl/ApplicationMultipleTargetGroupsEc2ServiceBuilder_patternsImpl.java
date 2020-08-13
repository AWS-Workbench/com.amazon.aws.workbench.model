/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.ApplicationMultipleTargetGroupsEc2ServiceBuilder_patterns;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.PropagatedTagSource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Multiple Target Groups Ec2 Service Builder patterns</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationMultipleTargetGroupsEc2ServiceBuilder_patternsImpl#getCloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReference <em>Cloud Map Options With Cloud Map Options software amazon awscdk services ecs Cloud Map Options As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationMultipleTargetGroupsEc2ServiceBuilder_patternsImpl#getClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference <em>Cluster With ICluster software amazon awscdk services ecs ICluster As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationMultipleTargetGroupsEc2ServiceBuilder_patternsImpl#getDesiredCount_java_lang_Number_ <em>Desired Count java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationMultipleTargetGroupsEc2ServiceBuilder_patternsImpl#getEnableEcsManagedTags_java_lang_Boolean_ <em>Enable Ecs Managed Tags java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationMultipleTargetGroupsEc2ServiceBuilder_patternsImpl#getHealthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Health Check Grace Period With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationMultipleTargetGroupsEc2ServiceBuilder_patternsImpl#getLoadBalancers_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancerProps_AsList <em>Load Balancers software amazon awscdk services ecs patterns Application Load Balancer Props As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationMultipleTargetGroupsEc2ServiceBuilder_patternsImpl#getPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_ <em>Propagate Tags software amazon awscdk services ecs Propagated Tag Source </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationMultipleTargetGroupsEc2ServiceBuilder_patternsImpl#getServiceName_java_lang_String_ <em>Service Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationMultipleTargetGroupsEc2ServiceBuilder_patternsImpl#getTargetGroups_software_amazon_awscdk_services_ecs_patterns_ApplicationTargetProps_AsList <em>Target Groups software amazon awscdk services ecs patterns Application Target Props As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationMultipleTargetGroupsEc2ServiceBuilder_patternsImpl#getTaskImageOptionsWithApplicationLoadBalancedTaskImageProps_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageProps_AsReference <em>Task Image Options With Application Load Balanced Task Image Props software amazon awscdk services ecs patterns Application Load Balanced Task Image Props As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationMultipleTargetGroupsEc2ServiceBuilder_patternsImpl#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationMultipleTargetGroupsEc2ServiceBuilder_patternsImpl#getCpu_java_lang_Number_ <em>Cpu java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationMultipleTargetGroupsEc2ServiceBuilder_patternsImpl#getMemoryLimitMiB_java_lang_Number_ <em>Memory Limit Mi Bjava lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationMultipleTargetGroupsEc2ServiceBuilder_patternsImpl#getMemoryReservationMiB_java_lang_Number_ <em>Memory Reservation Mi Bjava lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationMultipleTargetGroupsEc2ServiceBuilder_patternsImpl#getTaskDefinitionWithEc2TaskDefinition_software_amazon_awscdk_services_ecs_Ec2TaskDefinition_AsReference <em>Task Definition With Ec2 Task Definition software amazon awscdk services ecs Ec2 Task Definition As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationMultipleTargetGroupsEc2ServiceBuilder_patternsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationMultipleTargetGroupsEc2ServiceBuilder_patternsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationMultipleTargetGroupsEc2ServiceBuilder_patternsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationMultipleTargetGroupsEc2ServiceBuilder_patternsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationMultipleTargetGroupsEc2ServiceBuilder_patternsImpl extends ServiceResourcesImpl
		implements ApplicationMultipleTargetGroupsEc2ServiceBuilder_patterns {
	/**
	 * The default value of the '{@link #getCloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReference() <em>Cloud Map Options With Cloud Map Options software amazon awscdk services ecs Cloud Map Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOUD_MAP_OPTIONS_WITH_CLOUD_MAP_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CLOUD_MAP_OPTIONS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReference() <em>Cloud Map Options With Cloud Map Options software amazon awscdk services ecs Cloud Map Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String cloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReference = CLOUD_MAP_OPTIONS_WITH_CLOUD_MAP_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CLOUD_MAP_OPTIONS_AS_REFERENCE_EDEFAULT;

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
	 * The default value of the '{@link #getDesiredCount_java_lang_Number_() <em>Desired Count java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredCount_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int DESIRED_COUNT_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDesiredCount_java_lang_Number_() <em>Desired Count java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredCount_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int desiredCount_java_lang_Number_ = DESIRED_COUNT_JAVA_LANG_NUMBER__EDEFAULT;

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
	 * The default value of the '{@link #getHealthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Health Check Grace Period With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String HEALTH_CHECK_GRACE_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHealthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Health Check Grace Period With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String healthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference = HEALTH_CHECK_GRACE_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoadBalancers_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancerProps_AsList() <em>Load Balancers software amazon awscdk services ecs patterns Application Load Balancer Props As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadBalancers_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancerProps_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String LOAD_BALANCERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_LOAD_BALANCER_PROPS_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoadBalancers_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancerProps_AsList() <em>Load Balancers software amazon awscdk services ecs patterns Application Load Balancer Props As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadBalancers_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancerProps_AsList()
	 * @generated
	 * @ordered
	 */
	protected String loadBalancers_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancerProps_AsList = LOAD_BALANCERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_LOAD_BALANCER_PROPS_AS_LIST_EDEFAULT;

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
	 * The default value of the '{@link #getTargetGroups_software_amazon_awscdk_services_ecs_patterns_ApplicationTargetProps_AsList() <em>Target Groups software amazon awscdk services ecs patterns Application Target Props As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetGroups_software_amazon_awscdk_services_ecs_patterns_ApplicationTargetProps_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_TARGET_PROPS_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetGroups_software_amazon_awscdk_services_ecs_patterns_ApplicationTargetProps_AsList() <em>Target Groups software amazon awscdk services ecs patterns Application Target Props As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetGroups_software_amazon_awscdk_services_ecs_patterns_ApplicationTargetProps_AsList()
	 * @generated
	 * @ordered
	 */
	protected String targetGroups_software_amazon_awscdk_services_ecs_patterns_ApplicationTargetProps_AsList = TARGET_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_TARGET_PROPS_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaskImageOptionsWithApplicationLoadBalancedTaskImageProps_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageProps_AsReference() <em>Task Image Options With Application Load Balanced Task Image Props software amazon awscdk services ecs patterns Application Load Balanced Task Image Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskImageOptionsWithApplicationLoadBalancedTaskImageProps_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageProps_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String TASK_IMAGE_OPTIONS_WITH_APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaskImageOptionsWithApplicationLoadBalancedTaskImageProps_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageProps_AsReference() <em>Task Image Options With Application Load Balanced Task Image Props software amazon awscdk services ecs patterns Application Load Balanced Task Image Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskImageOptionsWithApplicationLoadBalancedTaskImageProps_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageProps_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String taskImageOptionsWithApplicationLoadBalancedTaskImageProps_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageProps_AsReference = TASK_IMAGE_OPTIONS_WITH_APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_AS_REFERENCE_EDEFAULT;

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
	 * The default value of the '{@link #getTaskDefinitionWithEc2TaskDefinition_software_amazon_awscdk_services_ecs_Ec2TaskDefinition_AsReference() <em>Task Definition With Ec2 Task Definition software amazon awscdk services ecs Ec2 Task Definition As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskDefinitionWithEc2TaskDefinition_software_amazon_awscdk_services_ecs_Ec2TaskDefinition_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String TASK_DEFINITION_WITH_EC2_TASK_DEFINITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_EC2_TASK_DEFINITION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaskDefinitionWithEc2TaskDefinition_software_amazon_awscdk_services_ecs_Ec2TaskDefinition_AsReference() <em>Task Definition With Ec2 Task Definition software amazon awscdk services ecs Ec2 Task Definition As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskDefinitionWithEc2TaskDefinition_software_amazon_awscdk_services_ecs_Ec2TaskDefinition_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String taskDefinitionWithEc2TaskDefinition_software_amazon_awscdk_services_ecs_Ec2TaskDefinition_AsReference = TASK_DEFINITION_WITH_EC2_TASK_DEFINITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_EC2_TASK_DEFINITION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsEc2Service";

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
	protected ApplicationMultipleTargetGroupsEc2ServiceBuilder_patternsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReference() {
		return cloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReference(
			String newCloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReference) {
		String oldCloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReference = cloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReference;
		cloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReference = newCloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__CLOUD_MAP_OPTIONS_WITH_CLOUD_MAP_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CLOUD_MAP_OPTIONS_AS_REFERENCE,
					oldCloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReference,
					cloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReference));
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
					AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__CLUSTER_WITH_ICLUSTER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ICLUSTER_AS_REFERENCE,
					oldClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference,
					clusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDesiredCount_java_lang_Number_() {
		return desiredCount_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesiredCount_java_lang_Number_(int newDesiredCount_java_lang_Number_) {
		int oldDesiredCount_java_lang_Number_ = desiredCount_java_lang_Number_;
		desiredCount_java_lang_Number_ = newDesiredCount_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__DESIRED_COUNT_JAVA_LANG_NUMBER_,
					oldDesiredCount_java_lang_Number_, desiredCount_java_lang_Number_));
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
					AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__ENABLE_ECS_MANAGED_TAGS_JAVA_LANG_BOOLEAN_,
					oldEnableEcsManagedTags_java_lang_Boolean_, enableEcsManagedTags_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHealthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return healthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHealthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newHealthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldHealthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference = healthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		healthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference = newHealthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__HEALTH_CHECK_GRACE_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldHealthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					healthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLoadBalancers_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancerProps_AsList() {
		return loadBalancers_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancerProps_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoadBalancers_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancerProps_AsList(
			String newLoadBalancers_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancerProps_AsList) {
		String oldLoadBalancers_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancerProps_AsList = loadBalancers_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancerProps_AsList;
		loadBalancers_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancerProps_AsList = newLoadBalancers_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancerProps_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__LOAD_BALANCERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_LOAD_BALANCER_PROPS_AS_LIST,
					oldLoadBalancers_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancerProps_AsList,
					loadBalancers_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancerProps_AsList));
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
					AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__PROPAGATE_TAGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROPAGATED_TAG_SOURCE_,
					oldPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_,
					propagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_));
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
					AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__SERVICE_NAME_JAVA_LANG_STRING_,
					oldServiceName_java_lang_String_, serviceName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetGroups_software_amazon_awscdk_services_ecs_patterns_ApplicationTargetProps_AsList() {
		return targetGroups_software_amazon_awscdk_services_ecs_patterns_ApplicationTargetProps_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetGroups_software_amazon_awscdk_services_ecs_patterns_ApplicationTargetProps_AsList(
			String newTargetGroups_software_amazon_awscdk_services_ecs_patterns_ApplicationTargetProps_AsList) {
		String oldTargetGroups_software_amazon_awscdk_services_ecs_patterns_ApplicationTargetProps_AsList = targetGroups_software_amazon_awscdk_services_ecs_patterns_ApplicationTargetProps_AsList;
		targetGroups_software_amazon_awscdk_services_ecs_patterns_ApplicationTargetProps_AsList = newTargetGroups_software_amazon_awscdk_services_ecs_patterns_ApplicationTargetProps_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__TARGET_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_TARGET_PROPS_AS_LIST,
					oldTargetGroups_software_amazon_awscdk_services_ecs_patterns_ApplicationTargetProps_AsList,
					targetGroups_software_amazon_awscdk_services_ecs_patterns_ApplicationTargetProps_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaskImageOptionsWithApplicationLoadBalancedTaskImageProps_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageProps_AsReference() {
		return taskImageOptionsWithApplicationLoadBalancedTaskImageProps_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageProps_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaskImageOptionsWithApplicationLoadBalancedTaskImageProps_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageProps_AsReference(
			String newTaskImageOptionsWithApplicationLoadBalancedTaskImageProps_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageProps_AsReference) {
		String oldTaskImageOptionsWithApplicationLoadBalancedTaskImageProps_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageProps_AsReference = taskImageOptionsWithApplicationLoadBalancedTaskImageProps_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageProps_AsReference;
		taskImageOptionsWithApplicationLoadBalancedTaskImageProps_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageProps_AsReference = newTaskImageOptionsWithApplicationLoadBalancedTaskImageProps_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageProps_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__TASK_IMAGE_OPTIONS_WITH_APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_AS_REFERENCE,
					oldTaskImageOptionsWithApplicationLoadBalancedTaskImageProps_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageProps_AsReference,
					taskImageOptionsWithApplicationLoadBalancedTaskImageProps_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageProps_AsReference));
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
					AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE,
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
					AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__CPU_JAVA_LANG_NUMBER_,
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
					AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER_,
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
					AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__MEMORY_RESERVATION_MI_BJAVA_LANG_NUMBER_,
					oldMemoryReservationMiB_java_lang_Number_, memoryReservationMiB_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaskDefinitionWithEc2TaskDefinition_software_amazon_awscdk_services_ecs_Ec2TaskDefinition_AsReference() {
		return taskDefinitionWithEc2TaskDefinition_software_amazon_awscdk_services_ecs_Ec2TaskDefinition_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaskDefinitionWithEc2TaskDefinition_software_amazon_awscdk_services_ecs_Ec2TaskDefinition_AsReference(
			String newTaskDefinitionWithEc2TaskDefinition_software_amazon_awscdk_services_ecs_Ec2TaskDefinition_AsReference) {
		String oldTaskDefinitionWithEc2TaskDefinition_software_amazon_awscdk_services_ecs_Ec2TaskDefinition_AsReference = taskDefinitionWithEc2TaskDefinition_software_amazon_awscdk_services_ecs_Ec2TaskDefinition_AsReference;
		taskDefinitionWithEc2TaskDefinition_software_amazon_awscdk_services_ecs_Ec2TaskDefinition_AsReference = newTaskDefinitionWithEc2TaskDefinition_software_amazon_awscdk_services_ecs_Ec2TaskDefinition_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__TASK_DEFINITION_WITH_EC2_TASK_DEFINITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_EC2_TASK_DEFINITION_AS_REFERENCE,
					oldTaskDefinitionWithEc2TaskDefinition_software_amazon_awscdk_services_ecs_Ec2TaskDefinition_AsReference,
					taskDefinitionWithEc2TaskDefinition_software_amazon_awscdk_services_ecs_Ec2TaskDefinition_AsReference));
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
					AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__VAR_NAME,
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
					AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__IDENTIFIER,
					oldIdentifier, identifier));
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
					AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__ADDITIONAL_CODE,
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
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__CLOUD_MAP_OPTIONS_WITH_CLOUD_MAP_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CLOUD_MAP_OPTIONS_AS_REFERENCE:
			return getCloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReference();
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__CLUSTER_WITH_ICLUSTER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ICLUSTER_AS_REFERENCE:
			return getClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference();
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__DESIRED_COUNT_JAVA_LANG_NUMBER_:
			return getDesiredCount_java_lang_Number_();
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__ENABLE_ECS_MANAGED_TAGS_JAVA_LANG_BOOLEAN_:
			return getEnableEcsManagedTags_java_lang_Boolean_();
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__HEALTH_CHECK_GRACE_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getHealthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__LOAD_BALANCERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_LOAD_BALANCER_PROPS_AS_LIST:
			return getLoadBalancers_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancerProps_AsList();
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__PROPAGATE_TAGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROPAGATED_TAG_SOURCE_:
			return getPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_();
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__SERVICE_NAME_JAVA_LANG_STRING_:
			return getServiceName_java_lang_String_();
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__TARGET_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_TARGET_PROPS_AS_LIST:
			return getTargetGroups_software_amazon_awscdk_services_ecs_patterns_ApplicationTargetProps_AsList();
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__TASK_IMAGE_OPTIONS_WITH_APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_AS_REFERENCE:
			return getTaskImageOptionsWithApplicationLoadBalancedTaskImageProps_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageProps_AsReference();
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			return getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__CPU_JAVA_LANG_NUMBER_:
			return getCpu_java_lang_Number_();
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER_:
			return getMemoryLimitMiB_java_lang_Number_();
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__MEMORY_RESERVATION_MI_BJAVA_LANG_NUMBER_:
			return getMemoryReservationMiB_java_lang_Number_();
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__TASK_DEFINITION_WITH_EC2_TASK_DEFINITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_EC2_TASK_DEFINITION_AS_REFERENCE:
			return getTaskDefinitionWithEc2TaskDefinition_software_amazon_awscdk_services_ecs_Ec2TaskDefinition_AsReference();
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__CLOUD_MAP_OPTIONS_WITH_CLOUD_MAP_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CLOUD_MAP_OPTIONS_AS_REFERENCE:
			setCloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__CLUSTER_WITH_ICLUSTER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ICLUSTER_AS_REFERENCE:
			setClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__DESIRED_COUNT_JAVA_LANG_NUMBER_:
			setDesiredCount_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__ENABLE_ECS_MANAGED_TAGS_JAVA_LANG_BOOLEAN_:
			setEnableEcsManagedTags_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__HEALTH_CHECK_GRACE_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setHealthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__LOAD_BALANCERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_LOAD_BALANCER_PROPS_AS_LIST:
			setLoadBalancers_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancerProps_AsList(
					(String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__PROPAGATE_TAGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROPAGATED_TAG_SOURCE_:
			setPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_((PropagatedTagSource) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__SERVICE_NAME_JAVA_LANG_STRING_:
			setServiceName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__TARGET_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_TARGET_PROPS_AS_LIST:
			setTargetGroups_software_amazon_awscdk_services_ecs_patterns_ApplicationTargetProps_AsList(
					(String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__TASK_IMAGE_OPTIONS_WITH_APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_AS_REFERENCE:
			setTaskImageOptionsWithApplicationLoadBalancedTaskImageProps_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageProps_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__CPU_JAVA_LANG_NUMBER_:
			setCpu_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER_:
			setMemoryLimitMiB_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__MEMORY_RESERVATION_MI_BJAVA_LANG_NUMBER_:
			setMemoryReservationMiB_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__TASK_DEFINITION_WITH_EC2_TASK_DEFINITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_EC2_TASK_DEFINITION_AS_REFERENCE:
			setTaskDefinitionWithEc2TaskDefinition_software_amazon_awscdk_services_ecs_Ec2TaskDefinition_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__CLOUD_MAP_OPTIONS_WITH_CLOUD_MAP_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CLOUD_MAP_OPTIONS_AS_REFERENCE:
			setCloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReference(
					CLOUD_MAP_OPTIONS_WITH_CLOUD_MAP_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CLOUD_MAP_OPTIONS_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__CLUSTER_WITH_ICLUSTER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ICLUSTER_AS_REFERENCE:
			setClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference(
					CLUSTER_WITH_ICLUSTER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ICLUSTER_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__DESIRED_COUNT_JAVA_LANG_NUMBER_:
			setDesiredCount_java_lang_Number_(DESIRED_COUNT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__ENABLE_ECS_MANAGED_TAGS_JAVA_LANG_BOOLEAN_:
			setEnableEcsManagedTags_java_lang_Boolean_(ENABLE_ECS_MANAGED_TAGS_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__HEALTH_CHECK_GRACE_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setHealthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					HEALTH_CHECK_GRACE_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__LOAD_BALANCERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_LOAD_BALANCER_PROPS_AS_LIST:
			setLoadBalancers_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancerProps_AsList(
					LOAD_BALANCERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_LOAD_BALANCER_PROPS_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__PROPAGATE_TAGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROPAGATED_TAG_SOURCE_:
			setPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_(
					PROPAGATE_TAGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROPAGATED_TAG_SOURCE__EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__SERVICE_NAME_JAVA_LANG_STRING_:
			setServiceName_java_lang_String_(SERVICE_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__TARGET_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_TARGET_PROPS_AS_LIST:
			setTargetGroups_software_amazon_awscdk_services_ecs_patterns_ApplicationTargetProps_AsList(
					TARGET_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_TARGET_PROPS_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__TASK_IMAGE_OPTIONS_WITH_APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_AS_REFERENCE:
			setTaskImageOptionsWithApplicationLoadBalancedTaskImageProps_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageProps_AsReference(
					TASK_IMAGE_OPTIONS_WITH_APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(
					VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__CPU_JAVA_LANG_NUMBER_:
			setCpu_java_lang_Number_(CPU_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER_:
			setMemoryLimitMiB_java_lang_Number_(MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__MEMORY_RESERVATION_MI_BJAVA_LANG_NUMBER_:
			setMemoryReservationMiB_java_lang_Number_(MEMORY_RESERVATION_MI_BJAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__TASK_DEFINITION_WITH_EC2_TASK_DEFINITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_EC2_TASK_DEFINITION_AS_REFERENCE:
			setTaskDefinitionWithEc2TaskDefinition_software_amazon_awscdk_services_ecs_Ec2TaskDefinition_AsReference(
					TASK_DEFINITION_WITH_EC2_TASK_DEFINITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_EC2_TASK_DEFINITION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__CLOUD_MAP_OPTIONS_WITH_CLOUD_MAP_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CLOUD_MAP_OPTIONS_AS_REFERENCE:
			return CLOUD_MAP_OPTIONS_WITH_CLOUD_MAP_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CLOUD_MAP_OPTIONS_AS_REFERENCE_EDEFAULT == null
					? cloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReference != null
					: !CLOUD_MAP_OPTIONS_WITH_CLOUD_MAP_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CLOUD_MAP_OPTIONS_AS_REFERENCE_EDEFAULT
							.equals(cloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReference);
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__CLUSTER_WITH_ICLUSTER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ICLUSTER_AS_REFERENCE:
			return CLUSTER_WITH_ICLUSTER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ICLUSTER_AS_REFERENCE_EDEFAULT == null
					? clusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference != null
					: !CLUSTER_WITH_ICLUSTER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ICLUSTER_AS_REFERENCE_EDEFAULT
							.equals(clusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference);
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__DESIRED_COUNT_JAVA_LANG_NUMBER_:
			return desiredCount_java_lang_Number_ != DESIRED_COUNT_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__ENABLE_ECS_MANAGED_TAGS_JAVA_LANG_BOOLEAN_:
			return ENABLE_ECS_MANAGED_TAGS_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? enableEcsManagedTags_java_lang_Boolean_ != null
					: !ENABLE_ECS_MANAGED_TAGS_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(enableEcsManagedTags_java_lang_Boolean_);
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__HEALTH_CHECK_GRACE_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return HEALTH_CHECK_GRACE_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? healthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !HEALTH_CHECK_GRACE_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(healthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__LOAD_BALANCERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_LOAD_BALANCER_PROPS_AS_LIST:
			return LOAD_BALANCERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_LOAD_BALANCER_PROPS_AS_LIST_EDEFAULT == null
					? loadBalancers_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancerProps_AsList != null
					: !LOAD_BALANCERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_LOAD_BALANCER_PROPS_AS_LIST_EDEFAULT
							.equals(loadBalancers_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancerProps_AsList);
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__PROPAGATE_TAGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROPAGATED_TAG_SOURCE_:
			return propagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_ != PROPAGATE_TAGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROPAGATED_TAG_SOURCE__EDEFAULT;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__SERVICE_NAME_JAVA_LANG_STRING_:
			return SERVICE_NAME_JAVA_LANG_STRING__EDEFAULT == null ? serviceName_java_lang_String_ != null
					: !SERVICE_NAME_JAVA_LANG_STRING__EDEFAULT.equals(serviceName_java_lang_String_);
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__TARGET_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_TARGET_PROPS_AS_LIST:
			return TARGET_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_TARGET_PROPS_AS_LIST_EDEFAULT == null
					? targetGroups_software_amazon_awscdk_services_ecs_patterns_ApplicationTargetProps_AsList != null
					: !TARGET_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_TARGET_PROPS_AS_LIST_EDEFAULT
							.equals(targetGroups_software_amazon_awscdk_services_ecs_patterns_ApplicationTargetProps_AsList);
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__TASK_IMAGE_OPTIONS_WITH_APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_AS_REFERENCE:
			return TASK_IMAGE_OPTIONS_WITH_APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_AS_REFERENCE_EDEFAULT == null
					? taskImageOptionsWithApplicationLoadBalancedTaskImageProps_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageProps_AsReference != null
					: !TASK_IMAGE_OPTIONS_WITH_APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_AS_REFERENCE_EDEFAULT
							.equals(taskImageOptionsWithApplicationLoadBalancedTaskImageProps_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageProps_AsReference);
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			return VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT == null
					? vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference != null
					: !VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT
							.equals(vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference);
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__CPU_JAVA_LANG_NUMBER_:
			return cpu_java_lang_Number_ != CPU_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER_:
			return memoryLimitMiB_java_lang_Number_ != MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__MEMORY_RESERVATION_MI_BJAVA_LANG_NUMBER_:
			return memoryReservationMiB_java_lang_Number_ != MEMORY_RESERVATION_MI_BJAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__TASK_DEFINITION_WITH_EC2_TASK_DEFINITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_EC2_TASK_DEFINITION_AS_REFERENCE:
			return TASK_DEFINITION_WITH_EC2_TASK_DEFINITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_EC2_TASK_DEFINITION_AS_REFERENCE_EDEFAULT == null
					? taskDefinitionWithEc2TaskDefinition_software_amazon_awscdk_services_ecs_Ec2TaskDefinition_AsReference != null
					: !TASK_DEFINITION_WITH_EC2_TASK_DEFINITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_EC2_TASK_DEFINITION_AS_REFERENCE_EDEFAULT
							.equals(taskDefinitionWithEc2TaskDefinition_software_amazon_awscdk_services_ecs_Ec2TaskDefinition_AsReference);
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
		result.append(
				" (cloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReference: ");
		result.append(
				cloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReference);
		result.append(", clusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference: ");
		result.append(clusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference);
		result.append(", desiredCount_java_lang_Number_: ");
		result.append(desiredCount_java_lang_Number_);
		result.append(", enableEcsManagedTags_java_lang_Boolean_: ");
		result.append(enableEcsManagedTags_java_lang_Boolean_);
		result.append(", healthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(healthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		result.append(
				", loadBalancers_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancerProps_AsList: ");
		result.append(loadBalancers_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancerProps_AsList);
		result.append(", propagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_: ");
		result.append(propagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_);
		result.append(", serviceName_java_lang_String_: ");
		result.append(serviceName_java_lang_String_);
		result.append(", targetGroups_software_amazon_awscdk_services_ecs_patterns_ApplicationTargetProps_AsList: ");
		result.append(targetGroups_software_amazon_awscdk_services_ecs_patterns_ApplicationTargetProps_AsList);
		result.append(
				", taskImageOptionsWithApplicationLoadBalancedTaskImageProps_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageProps_AsReference: ");
		result.append(
				taskImageOptionsWithApplicationLoadBalancedTaskImageProps_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageProps_AsReference);
		result.append(", vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference: ");
		result.append(vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference);
		result.append(", cpu_java_lang_Number_: ");
		result.append(cpu_java_lang_Number_);
		result.append(", memoryLimitMiB_java_lang_Number_: ");
		result.append(memoryLimitMiB_java_lang_Number_);
		result.append(", memoryReservationMiB_java_lang_Number_: ");
		result.append(memoryReservationMiB_java_lang_Number_);
		result.append(
				", taskDefinitionWithEc2TaskDefinition_software_amazon_awscdk_services_ecs_Ec2TaskDefinition_AsReference: ");
		result.append(
				taskDefinitionWithEc2TaskDefinition_software_amazon_awscdk_services_ecs_Ec2TaskDefinition_AsReference);
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

} //ApplicationMultipleTargetGroupsEc2ServiceBuilder_patternsImpl
