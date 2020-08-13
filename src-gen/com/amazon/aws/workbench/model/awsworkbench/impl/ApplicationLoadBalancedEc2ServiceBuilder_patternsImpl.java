/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancedEc2ServiceBuilder_patterns;
import com.amazon.aws.workbench.model.awsworkbench.ApplicationProtocol;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.PropagatedTagSource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Load Balanced Ec2 Service Builder patterns</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedEc2ServiceBuilder_patternsImpl#getCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference <em>Certificate With ICertificate software amazon awscdk services certificatemanager ICertificate As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedEc2ServiceBuilder_patternsImpl#getCloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReference <em>Cloud Map Options With Cloud Map Options software amazon awscdk services ecs Cloud Map Options As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedEc2ServiceBuilder_patternsImpl#getClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference <em>Cluster With ICluster software amazon awscdk services ecs ICluster As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedEc2ServiceBuilder_patternsImpl#getDesiredCount_java_lang_Number_ <em>Desired Count java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedEc2ServiceBuilder_patternsImpl#getDomainName_java_lang_String_ <em>Domain Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedEc2ServiceBuilder_patternsImpl#getDomainZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference <em>Domain Zone With IHosted Zone software amazon awscdk services route53 IHosted Zone As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedEc2ServiceBuilder_patternsImpl#getEnableEcsManagedTags_java_lang_Boolean_ <em>Enable Ecs Managed Tags java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedEc2ServiceBuilder_patternsImpl#getHealthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Health Check Grace Period With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedEc2ServiceBuilder_patternsImpl#getListenerPort_java_lang_Number_ <em>Listener Port java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedEc2ServiceBuilder_patternsImpl#getLoadBalancerWithIApplicationLoadBalancer_software_amazon_awscdk_services_elasticloadbalancingv2_IApplicationLoadBalancer_AsReference <em>Load Balancer With IApplication Load Balancer software amazon awscdk services elasticloadbalancingv2 IApplication Load Balancer As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedEc2ServiceBuilder_patternsImpl#getMaxHealthyPercent_java_lang_Number_ <em>Max Healthy Percent java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedEc2ServiceBuilder_patternsImpl#getMinHealthyPercent_java_lang_Number_ <em>Min Healthy Percent java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedEc2ServiceBuilder_patternsImpl#getPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_ <em>Propagate Tags software amazon awscdk services ecs Propagated Tag Source </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedEc2ServiceBuilder_patternsImpl#getProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_ <em>Protocol software amazon awscdk services elasticloadbalancingv2 Application Protocol </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedEc2ServiceBuilder_patternsImpl#getPublicLoadBalancer_java_lang_Boolean_ <em>Public Load Balancer java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedEc2ServiceBuilder_patternsImpl#getServiceName_java_lang_String_ <em>Service Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedEc2ServiceBuilder_patternsImpl#getTaskImageOptionsWithApplicationLoadBalancedTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageOptions_AsReference <em>Task Image Options With Application Load Balanced Task Image Options software amazon awscdk services ecs patterns Application Load Balanced Task Image Options As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedEc2ServiceBuilder_patternsImpl#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedEc2ServiceBuilder_patternsImpl#getCpu_java_lang_Number_ <em>Cpu java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedEc2ServiceBuilder_patternsImpl#getMemoryLimitMiB_java_lang_Number_ <em>Memory Limit Mi Bjava lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedEc2ServiceBuilder_patternsImpl#getMemoryReservationMiB_java_lang_Number_ <em>Memory Reservation Mi Bjava lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedEc2ServiceBuilder_patternsImpl#getTaskDefinitionWithEc2TaskDefinition_software_amazon_awscdk_services_ecs_Ec2TaskDefinition_AsReference <em>Task Definition With Ec2 Task Definition software amazon awscdk services ecs Ec2 Task Definition As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedEc2ServiceBuilder_patternsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedEc2ServiceBuilder_patternsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedEc2ServiceBuilder_patternsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedEc2ServiceBuilder_patternsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationLoadBalancedEc2ServiceBuilder_patternsImpl extends ServiceResourcesImpl
		implements ApplicationLoadBalancedEc2ServiceBuilder_patterns {
	/**
	 * The default value of the '{@link #getCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference() <em>Certificate With ICertificate software amazon awscdk services certificatemanager ICertificate As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String CERTIFICATE_WITH_ICERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_ICERTIFICATE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference() <em>Certificate With ICertificate software amazon awscdk services certificatemanager ICertificate As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String certificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference = CERTIFICATE_WITH_ICERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_ICERTIFICATE_AS_REFERENCE_EDEFAULT;

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
	 * The default value of the '{@link #getDomainName_java_lang_String_() <em>Domain Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainName_java_lang_String_() <em>Domain Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String domainName_java_lang_String_ = DOMAIN_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference() <em>Domain Zone With IHosted Zone software amazon awscdk services route53 IHosted Zone As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_ZONE_WITH_IHOSTED_ZONE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ROUTE53_IHOSTED_ZONE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference() <em>Domain Zone With IHosted Zone software amazon awscdk services route53 IHosted Zone As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String domainZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference = DOMAIN_ZONE_WITH_IHOSTED_ZONE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ROUTE53_IHOSTED_ZONE_AS_REFERENCE_EDEFAULT;

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
	 * The default value of the '{@link #getListenerPort_java_lang_Number_() <em>Listener Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListenerPort_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int LISTENER_PORT_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getListenerPort_java_lang_Number_() <em>Listener Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListenerPort_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int listenerPort_java_lang_Number_ = LISTENER_PORT_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getLoadBalancerWithIApplicationLoadBalancer_software_amazon_awscdk_services_elasticloadbalancingv2_IApplicationLoadBalancer_AsReference() <em>Load Balancer With IApplication Load Balancer software amazon awscdk services elasticloadbalancingv2 IApplication Load Balancer As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadBalancerWithIApplicationLoadBalancer_software_amazon_awscdk_services_elasticloadbalancingv2_IApplicationLoadBalancer_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String LOAD_BALANCER_WITH_IAPPLICATION_LOAD_BALANCER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_IAPPLICATION_LOAD_BALANCER_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoadBalancerWithIApplicationLoadBalancer_software_amazon_awscdk_services_elasticloadbalancingv2_IApplicationLoadBalancer_AsReference() <em>Load Balancer With IApplication Load Balancer software amazon awscdk services elasticloadbalancingv2 IApplication Load Balancer As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadBalancerWithIApplicationLoadBalancer_software_amazon_awscdk_services_elasticloadbalancingv2_IApplicationLoadBalancer_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String loadBalancerWithIApplicationLoadBalancer_software_amazon_awscdk_services_elasticloadbalancingv2_IApplicationLoadBalancer_AsReference = LOAD_BALANCER_WITH_IAPPLICATION_LOAD_BALANCER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_IAPPLICATION_LOAD_BALANCER_AS_REFERENCE_EDEFAULT;

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
	 * The default value of the '{@link #getProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_() <em>Protocol software amazon awscdk services elasticloadbalancingv2 Application Protocol </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_()
	 * @generated
	 * @ordered
	 */
	protected static final ApplicationProtocol PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_APPLICATION_PROTOCOL__EDEFAULT = ApplicationProtocol.HTTP;

	/**
	 * The cached value of the '{@link #getProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_() <em>Protocol software amazon awscdk services elasticloadbalancingv2 Application Protocol </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_()
	 * @generated
	 * @ordered
	 */
	protected ApplicationProtocol protocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_ = PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_APPLICATION_PROTOCOL__EDEFAULT;

	/**
	 * The default value of the '{@link #getPublicLoadBalancer_java_lang_Boolean_() <em>Public Load Balancer java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicLoadBalancer_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PUBLIC_LOAD_BALANCER_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicLoadBalancer_java_lang_Boolean_() <em>Public Load Balancer java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicLoadBalancer_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean publicLoadBalancer_java_lang_Boolean_ = PUBLIC_LOAD_BALANCER_JAVA_LANG_BOOLEAN__EDEFAULT;

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
	 * The default value of the '{@link #getTaskImageOptionsWithApplicationLoadBalancedTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageOptions_AsReference() <em>Task Image Options With Application Load Balanced Task Image Options software amazon awscdk services ecs patterns Application Load Balanced Task Image Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskImageOptionsWithApplicationLoadBalancedTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageOptions_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String TASK_IMAGE_OPTIONS_WITH_APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaskImageOptionsWithApplicationLoadBalancedTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageOptions_AsReference() <em>Task Image Options With Application Load Balanced Task Image Options software amazon awscdk services ecs patterns Application Load Balanced Task Image Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskImageOptionsWithApplicationLoadBalancedTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageOptions_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String taskImageOptionsWithApplicationLoadBalancedTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageOptions_AsReference = TASK_IMAGE_OPTIONS_WITH_APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_AS_REFERENCE_EDEFAULT;

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
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedEc2Service";

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
	protected ApplicationLoadBalancedEc2ServiceBuilder_patternsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference() {
		return certificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference(
			String newCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference) {
		String oldCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference = certificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference;
		certificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference = newCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__CERTIFICATE_WITH_ICERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_ICERTIFICATE_AS_REFERENCE,
					oldCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference,
					certificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference));
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
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__CLOUD_MAP_OPTIONS_WITH_CLOUD_MAP_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CLOUD_MAP_OPTIONS_AS_REFERENCE,
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
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__CLUSTER_WITH_ICLUSTER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ICLUSTER_AS_REFERENCE,
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
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__DESIRED_COUNT_JAVA_LANG_NUMBER_,
					oldDesiredCount_java_lang_Number_, desiredCount_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDomainName_java_lang_String_() {
		return domainName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainName_java_lang_String_(String newDomainName_java_lang_String_) {
		String oldDomainName_java_lang_String_ = domainName_java_lang_String_;
		domainName_java_lang_String_ = newDomainName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__DOMAIN_NAME_JAVA_LANG_STRING_,
					oldDomainName_java_lang_String_, domainName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDomainZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference() {
		return domainZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference(
			String newDomainZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference) {
		String oldDomainZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference = domainZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference;
		domainZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference = newDomainZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__DOMAIN_ZONE_WITH_IHOSTED_ZONE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ROUTE53_IHOSTED_ZONE_AS_REFERENCE,
					oldDomainZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference,
					domainZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference));
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
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__ENABLE_ECS_MANAGED_TAGS_JAVA_LANG_BOOLEAN_,
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
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__HEALTH_CHECK_GRACE_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldHealthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					healthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getListenerPort_java_lang_Number_() {
		return listenerPort_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListenerPort_java_lang_Number_(int newListenerPort_java_lang_Number_) {
		int oldListenerPort_java_lang_Number_ = listenerPort_java_lang_Number_;
		listenerPort_java_lang_Number_ = newListenerPort_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__LISTENER_PORT_JAVA_LANG_NUMBER_,
					oldListenerPort_java_lang_Number_, listenerPort_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLoadBalancerWithIApplicationLoadBalancer_software_amazon_awscdk_services_elasticloadbalancingv2_IApplicationLoadBalancer_AsReference() {
		return loadBalancerWithIApplicationLoadBalancer_software_amazon_awscdk_services_elasticloadbalancingv2_IApplicationLoadBalancer_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoadBalancerWithIApplicationLoadBalancer_software_amazon_awscdk_services_elasticloadbalancingv2_IApplicationLoadBalancer_AsReference(
			String newLoadBalancerWithIApplicationLoadBalancer_software_amazon_awscdk_services_elasticloadbalancingv2_IApplicationLoadBalancer_AsReference) {
		String oldLoadBalancerWithIApplicationLoadBalancer_software_amazon_awscdk_services_elasticloadbalancingv2_IApplicationLoadBalancer_AsReference = loadBalancerWithIApplicationLoadBalancer_software_amazon_awscdk_services_elasticloadbalancingv2_IApplicationLoadBalancer_AsReference;
		loadBalancerWithIApplicationLoadBalancer_software_amazon_awscdk_services_elasticloadbalancingv2_IApplicationLoadBalancer_AsReference = newLoadBalancerWithIApplicationLoadBalancer_software_amazon_awscdk_services_elasticloadbalancingv2_IApplicationLoadBalancer_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__LOAD_BALANCER_WITH_IAPPLICATION_LOAD_BALANCER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_IAPPLICATION_LOAD_BALANCER_AS_REFERENCE,
					oldLoadBalancerWithIApplicationLoadBalancer_software_amazon_awscdk_services_elasticloadbalancingv2_IApplicationLoadBalancer_AsReference,
					loadBalancerWithIApplicationLoadBalancer_software_amazon_awscdk_services_elasticloadbalancingv2_IApplicationLoadBalancer_AsReference));
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
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__MAX_HEALTHY_PERCENT_JAVA_LANG_NUMBER_,
					oldMaxHealthyPercent_java_lang_Number_, maxHealthyPercent_java_lang_Number_));
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
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__MIN_HEALTHY_PERCENT_JAVA_LANG_NUMBER_,
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
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__PROPAGATE_TAGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROPAGATED_TAG_SOURCE_,
					oldPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_,
					propagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationProtocol getProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_() {
		return protocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_(
			ApplicationProtocol newProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_) {
		ApplicationProtocol oldProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_ = protocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_;
		protocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_ = newProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_ == null
				? PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_APPLICATION_PROTOCOL__EDEFAULT
				: newProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_APPLICATION_PROTOCOL_,
					oldProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_,
					protocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPublicLoadBalancer_java_lang_Boolean_() {
		return publicLoadBalancer_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicLoadBalancer_java_lang_Boolean_(Boolean newPublicLoadBalancer_java_lang_Boolean_) {
		Boolean oldPublicLoadBalancer_java_lang_Boolean_ = publicLoadBalancer_java_lang_Boolean_;
		publicLoadBalancer_java_lang_Boolean_ = newPublicLoadBalancer_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__PUBLIC_LOAD_BALANCER_JAVA_LANG_BOOLEAN_,
					oldPublicLoadBalancer_java_lang_Boolean_, publicLoadBalancer_java_lang_Boolean_));
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
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__SERVICE_NAME_JAVA_LANG_STRING_,
					oldServiceName_java_lang_String_, serviceName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaskImageOptionsWithApplicationLoadBalancedTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageOptions_AsReference() {
		return taskImageOptionsWithApplicationLoadBalancedTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageOptions_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaskImageOptionsWithApplicationLoadBalancedTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageOptions_AsReference(
			String newTaskImageOptionsWithApplicationLoadBalancedTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageOptions_AsReference) {
		String oldTaskImageOptionsWithApplicationLoadBalancedTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageOptions_AsReference = taskImageOptionsWithApplicationLoadBalancedTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageOptions_AsReference;
		taskImageOptionsWithApplicationLoadBalancedTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageOptions_AsReference = newTaskImageOptionsWithApplicationLoadBalancedTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageOptions_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__TASK_IMAGE_OPTIONS_WITH_APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_AS_REFERENCE,
					oldTaskImageOptionsWithApplicationLoadBalancedTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageOptions_AsReference,
					taskImageOptionsWithApplicationLoadBalancedTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageOptions_AsReference));
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
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE,
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
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__CPU_JAVA_LANG_NUMBER_,
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
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER_,
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
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__MEMORY_RESERVATION_MI_BJAVA_LANG_NUMBER_,
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
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__TASK_DEFINITION_WITH_EC2_TASK_DEFINITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_EC2_TASK_DEFINITION_AS_REFERENCE,
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
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__VAR_NAME, oldVarName,
					varName));
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
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__IDENTIFIER,
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
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__ADDITIONAL_CODE,
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
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__CERTIFICATE_WITH_ICERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_ICERTIFICATE_AS_REFERENCE:
			return getCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__CLOUD_MAP_OPTIONS_WITH_CLOUD_MAP_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CLOUD_MAP_OPTIONS_AS_REFERENCE:
			return getCloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReference();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__CLUSTER_WITH_ICLUSTER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ICLUSTER_AS_REFERENCE:
			return getClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__DESIRED_COUNT_JAVA_LANG_NUMBER_:
			return getDesiredCount_java_lang_Number_();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__DOMAIN_NAME_JAVA_LANG_STRING_:
			return getDomainName_java_lang_String_();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__DOMAIN_ZONE_WITH_IHOSTED_ZONE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ROUTE53_IHOSTED_ZONE_AS_REFERENCE:
			return getDomainZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__ENABLE_ECS_MANAGED_TAGS_JAVA_LANG_BOOLEAN_:
			return getEnableEcsManagedTags_java_lang_Boolean_();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__HEALTH_CHECK_GRACE_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getHealthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__LISTENER_PORT_JAVA_LANG_NUMBER_:
			return getListenerPort_java_lang_Number_();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__LOAD_BALANCER_WITH_IAPPLICATION_LOAD_BALANCER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_IAPPLICATION_LOAD_BALANCER_AS_REFERENCE:
			return getLoadBalancerWithIApplicationLoadBalancer_software_amazon_awscdk_services_elasticloadbalancingv2_IApplicationLoadBalancer_AsReference();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__MAX_HEALTHY_PERCENT_JAVA_LANG_NUMBER_:
			return getMaxHealthyPercent_java_lang_Number_();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__MIN_HEALTHY_PERCENT_JAVA_LANG_NUMBER_:
			return getMinHealthyPercent_java_lang_Number_();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__PROPAGATE_TAGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROPAGATED_TAG_SOURCE_:
			return getPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_APPLICATION_PROTOCOL_:
			return getProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__PUBLIC_LOAD_BALANCER_JAVA_LANG_BOOLEAN_:
			return getPublicLoadBalancer_java_lang_Boolean_();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__SERVICE_NAME_JAVA_LANG_STRING_:
			return getServiceName_java_lang_String_();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__TASK_IMAGE_OPTIONS_WITH_APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_AS_REFERENCE:
			return getTaskImageOptionsWithApplicationLoadBalancedTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageOptions_AsReference();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			return getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__CPU_JAVA_LANG_NUMBER_:
			return getCpu_java_lang_Number_();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER_:
			return getMemoryLimitMiB_java_lang_Number_();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__MEMORY_RESERVATION_MI_BJAVA_LANG_NUMBER_:
			return getMemoryReservationMiB_java_lang_Number_();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__TASK_DEFINITION_WITH_EC2_TASK_DEFINITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_EC2_TASK_DEFINITION_AS_REFERENCE:
			return getTaskDefinitionWithEc2TaskDefinition_software_amazon_awscdk_services_ecs_Ec2TaskDefinition_AsReference();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__CERTIFICATE_WITH_ICERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_ICERTIFICATE_AS_REFERENCE:
			setCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__CLOUD_MAP_OPTIONS_WITH_CLOUD_MAP_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CLOUD_MAP_OPTIONS_AS_REFERENCE:
			setCloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__CLUSTER_WITH_ICLUSTER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ICLUSTER_AS_REFERENCE:
			setClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__DESIRED_COUNT_JAVA_LANG_NUMBER_:
			setDesiredCount_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__DOMAIN_NAME_JAVA_LANG_STRING_:
			setDomainName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__DOMAIN_ZONE_WITH_IHOSTED_ZONE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ROUTE53_IHOSTED_ZONE_AS_REFERENCE:
			setDomainZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__ENABLE_ECS_MANAGED_TAGS_JAVA_LANG_BOOLEAN_:
			setEnableEcsManagedTags_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__HEALTH_CHECK_GRACE_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setHealthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__LISTENER_PORT_JAVA_LANG_NUMBER_:
			setListenerPort_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__LOAD_BALANCER_WITH_IAPPLICATION_LOAD_BALANCER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_IAPPLICATION_LOAD_BALANCER_AS_REFERENCE:
			setLoadBalancerWithIApplicationLoadBalancer_software_amazon_awscdk_services_elasticloadbalancingv2_IApplicationLoadBalancer_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__MAX_HEALTHY_PERCENT_JAVA_LANG_NUMBER_:
			setMaxHealthyPercent_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__MIN_HEALTHY_PERCENT_JAVA_LANG_NUMBER_:
			setMinHealthyPercent_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__PROPAGATE_TAGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROPAGATED_TAG_SOURCE_:
			setPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_((PropagatedTagSource) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_APPLICATION_PROTOCOL_:
			setProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_(
					(ApplicationProtocol) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__PUBLIC_LOAD_BALANCER_JAVA_LANG_BOOLEAN_:
			setPublicLoadBalancer_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__SERVICE_NAME_JAVA_LANG_STRING_:
			setServiceName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__TASK_IMAGE_OPTIONS_WITH_APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_AS_REFERENCE:
			setTaskImageOptionsWithApplicationLoadBalancedTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageOptions_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__CPU_JAVA_LANG_NUMBER_:
			setCpu_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER_:
			setMemoryLimitMiB_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__MEMORY_RESERVATION_MI_BJAVA_LANG_NUMBER_:
			setMemoryReservationMiB_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__TASK_DEFINITION_WITH_EC2_TASK_DEFINITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_EC2_TASK_DEFINITION_AS_REFERENCE:
			setTaskDefinitionWithEc2TaskDefinition_software_amazon_awscdk_services_ecs_Ec2TaskDefinition_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__CERTIFICATE_WITH_ICERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_ICERTIFICATE_AS_REFERENCE:
			setCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference(
					CERTIFICATE_WITH_ICERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_ICERTIFICATE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__CLOUD_MAP_OPTIONS_WITH_CLOUD_MAP_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CLOUD_MAP_OPTIONS_AS_REFERENCE:
			setCloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReference(
					CLOUD_MAP_OPTIONS_WITH_CLOUD_MAP_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CLOUD_MAP_OPTIONS_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__CLUSTER_WITH_ICLUSTER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ICLUSTER_AS_REFERENCE:
			setClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference(
					CLUSTER_WITH_ICLUSTER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ICLUSTER_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__DESIRED_COUNT_JAVA_LANG_NUMBER_:
			setDesiredCount_java_lang_Number_(DESIRED_COUNT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__DOMAIN_NAME_JAVA_LANG_STRING_:
			setDomainName_java_lang_String_(DOMAIN_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__DOMAIN_ZONE_WITH_IHOSTED_ZONE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ROUTE53_IHOSTED_ZONE_AS_REFERENCE:
			setDomainZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference(
					DOMAIN_ZONE_WITH_IHOSTED_ZONE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ROUTE53_IHOSTED_ZONE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__ENABLE_ECS_MANAGED_TAGS_JAVA_LANG_BOOLEAN_:
			setEnableEcsManagedTags_java_lang_Boolean_(ENABLE_ECS_MANAGED_TAGS_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__HEALTH_CHECK_GRACE_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setHealthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					HEALTH_CHECK_GRACE_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__LISTENER_PORT_JAVA_LANG_NUMBER_:
			setListenerPort_java_lang_Number_(LISTENER_PORT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__LOAD_BALANCER_WITH_IAPPLICATION_LOAD_BALANCER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_IAPPLICATION_LOAD_BALANCER_AS_REFERENCE:
			setLoadBalancerWithIApplicationLoadBalancer_software_amazon_awscdk_services_elasticloadbalancingv2_IApplicationLoadBalancer_AsReference(
					LOAD_BALANCER_WITH_IAPPLICATION_LOAD_BALANCER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_IAPPLICATION_LOAD_BALANCER_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__MAX_HEALTHY_PERCENT_JAVA_LANG_NUMBER_:
			setMaxHealthyPercent_java_lang_Number_(MAX_HEALTHY_PERCENT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__MIN_HEALTHY_PERCENT_JAVA_LANG_NUMBER_:
			setMinHealthyPercent_java_lang_Number_(MIN_HEALTHY_PERCENT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__PROPAGATE_TAGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROPAGATED_TAG_SOURCE_:
			setPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_(
					PROPAGATE_TAGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROPAGATED_TAG_SOURCE__EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_APPLICATION_PROTOCOL_:
			setProtocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_(
					PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_APPLICATION_PROTOCOL__EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__PUBLIC_LOAD_BALANCER_JAVA_LANG_BOOLEAN_:
			setPublicLoadBalancer_java_lang_Boolean_(PUBLIC_LOAD_BALANCER_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__SERVICE_NAME_JAVA_LANG_STRING_:
			setServiceName_java_lang_String_(SERVICE_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__TASK_IMAGE_OPTIONS_WITH_APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_AS_REFERENCE:
			setTaskImageOptionsWithApplicationLoadBalancedTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageOptions_AsReference(
					TASK_IMAGE_OPTIONS_WITH_APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(
					VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__CPU_JAVA_LANG_NUMBER_:
			setCpu_java_lang_Number_(CPU_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER_:
			setMemoryLimitMiB_java_lang_Number_(MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__MEMORY_RESERVATION_MI_BJAVA_LANG_NUMBER_:
			setMemoryReservationMiB_java_lang_Number_(MEMORY_RESERVATION_MI_BJAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__TASK_DEFINITION_WITH_EC2_TASK_DEFINITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_EC2_TASK_DEFINITION_AS_REFERENCE:
			setTaskDefinitionWithEc2TaskDefinition_software_amazon_awscdk_services_ecs_Ec2TaskDefinition_AsReference(
					TASK_DEFINITION_WITH_EC2_TASK_DEFINITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_EC2_TASK_DEFINITION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__CERTIFICATE_WITH_ICERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_ICERTIFICATE_AS_REFERENCE:
			return CERTIFICATE_WITH_ICERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_ICERTIFICATE_AS_REFERENCE_EDEFAULT == null
					? certificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference != null
					: !CERTIFICATE_WITH_ICERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_ICERTIFICATE_AS_REFERENCE_EDEFAULT
							.equals(certificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference);
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__CLOUD_MAP_OPTIONS_WITH_CLOUD_MAP_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CLOUD_MAP_OPTIONS_AS_REFERENCE:
			return CLOUD_MAP_OPTIONS_WITH_CLOUD_MAP_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CLOUD_MAP_OPTIONS_AS_REFERENCE_EDEFAULT == null
					? cloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReference != null
					: !CLOUD_MAP_OPTIONS_WITH_CLOUD_MAP_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CLOUD_MAP_OPTIONS_AS_REFERENCE_EDEFAULT
							.equals(cloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReference);
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__CLUSTER_WITH_ICLUSTER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ICLUSTER_AS_REFERENCE:
			return CLUSTER_WITH_ICLUSTER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ICLUSTER_AS_REFERENCE_EDEFAULT == null
					? clusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference != null
					: !CLUSTER_WITH_ICLUSTER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ICLUSTER_AS_REFERENCE_EDEFAULT
							.equals(clusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference);
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__DESIRED_COUNT_JAVA_LANG_NUMBER_:
			return desiredCount_java_lang_Number_ != DESIRED_COUNT_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__DOMAIN_NAME_JAVA_LANG_STRING_:
			return DOMAIN_NAME_JAVA_LANG_STRING__EDEFAULT == null ? domainName_java_lang_String_ != null
					: !DOMAIN_NAME_JAVA_LANG_STRING__EDEFAULT.equals(domainName_java_lang_String_);
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__DOMAIN_ZONE_WITH_IHOSTED_ZONE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ROUTE53_IHOSTED_ZONE_AS_REFERENCE:
			return DOMAIN_ZONE_WITH_IHOSTED_ZONE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ROUTE53_IHOSTED_ZONE_AS_REFERENCE_EDEFAULT == null
					? domainZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference != null
					: !DOMAIN_ZONE_WITH_IHOSTED_ZONE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ROUTE53_IHOSTED_ZONE_AS_REFERENCE_EDEFAULT
							.equals(domainZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference);
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__ENABLE_ECS_MANAGED_TAGS_JAVA_LANG_BOOLEAN_:
			return ENABLE_ECS_MANAGED_TAGS_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? enableEcsManagedTags_java_lang_Boolean_ != null
					: !ENABLE_ECS_MANAGED_TAGS_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(enableEcsManagedTags_java_lang_Boolean_);
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__HEALTH_CHECK_GRACE_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return HEALTH_CHECK_GRACE_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? healthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !HEALTH_CHECK_GRACE_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(healthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__LISTENER_PORT_JAVA_LANG_NUMBER_:
			return listenerPort_java_lang_Number_ != LISTENER_PORT_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__LOAD_BALANCER_WITH_IAPPLICATION_LOAD_BALANCER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_IAPPLICATION_LOAD_BALANCER_AS_REFERENCE:
			return LOAD_BALANCER_WITH_IAPPLICATION_LOAD_BALANCER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_IAPPLICATION_LOAD_BALANCER_AS_REFERENCE_EDEFAULT == null
					? loadBalancerWithIApplicationLoadBalancer_software_amazon_awscdk_services_elasticloadbalancingv2_IApplicationLoadBalancer_AsReference != null
					: !LOAD_BALANCER_WITH_IAPPLICATION_LOAD_BALANCER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_IAPPLICATION_LOAD_BALANCER_AS_REFERENCE_EDEFAULT
							.equals(loadBalancerWithIApplicationLoadBalancer_software_amazon_awscdk_services_elasticloadbalancingv2_IApplicationLoadBalancer_AsReference);
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__MAX_HEALTHY_PERCENT_JAVA_LANG_NUMBER_:
			return maxHealthyPercent_java_lang_Number_ != MAX_HEALTHY_PERCENT_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__MIN_HEALTHY_PERCENT_JAVA_LANG_NUMBER_:
			return minHealthyPercent_java_lang_Number_ != MIN_HEALTHY_PERCENT_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__PROPAGATE_TAGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROPAGATED_TAG_SOURCE_:
			return propagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_ != PROPAGATE_TAGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROPAGATED_TAG_SOURCE__EDEFAULT;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_APPLICATION_PROTOCOL_:
			return protocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_ != PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_APPLICATION_PROTOCOL__EDEFAULT;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__PUBLIC_LOAD_BALANCER_JAVA_LANG_BOOLEAN_:
			return PUBLIC_LOAD_BALANCER_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? publicLoadBalancer_java_lang_Boolean_ != null
					: !PUBLIC_LOAD_BALANCER_JAVA_LANG_BOOLEAN__EDEFAULT.equals(publicLoadBalancer_java_lang_Boolean_);
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__SERVICE_NAME_JAVA_LANG_STRING_:
			return SERVICE_NAME_JAVA_LANG_STRING__EDEFAULT == null ? serviceName_java_lang_String_ != null
					: !SERVICE_NAME_JAVA_LANG_STRING__EDEFAULT.equals(serviceName_java_lang_String_);
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__TASK_IMAGE_OPTIONS_WITH_APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_AS_REFERENCE:
			return TASK_IMAGE_OPTIONS_WITH_APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_AS_REFERENCE_EDEFAULT == null
					? taskImageOptionsWithApplicationLoadBalancedTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageOptions_AsReference != null
					: !TASK_IMAGE_OPTIONS_WITH_APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_AS_REFERENCE_EDEFAULT
							.equals(taskImageOptionsWithApplicationLoadBalancedTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageOptions_AsReference);
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			return VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT == null
					? vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference != null
					: !VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT
							.equals(vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference);
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__CPU_JAVA_LANG_NUMBER_:
			return cpu_java_lang_Number_ != CPU_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER_:
			return memoryLimitMiB_java_lang_Number_ != MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__MEMORY_RESERVATION_MI_BJAVA_LANG_NUMBER_:
			return memoryReservationMiB_java_lang_Number_ != MEMORY_RESERVATION_MI_BJAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__TASK_DEFINITION_WITH_EC2_TASK_DEFINITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_EC2_TASK_DEFINITION_AS_REFERENCE:
			return TASK_DEFINITION_WITH_EC2_TASK_DEFINITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_EC2_TASK_DEFINITION_AS_REFERENCE_EDEFAULT == null
					? taskDefinitionWithEc2TaskDefinition_software_amazon_awscdk_services_ecs_Ec2TaskDefinition_AsReference != null
					: !TASK_DEFINITION_WITH_EC2_TASK_DEFINITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_EC2_TASK_DEFINITION_AS_REFERENCE_EDEFAULT
							.equals(taskDefinitionWithEc2TaskDefinition_software_amazon_awscdk_services_ecs_Ec2TaskDefinition_AsReference);
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
				" (certificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference: ");
		result.append(
				certificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference);
		result.append(
				", cloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReference: ");
		result.append(
				cloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReference);
		result.append(", clusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference: ");
		result.append(clusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference);
		result.append(", desiredCount_java_lang_Number_: ");
		result.append(desiredCount_java_lang_Number_);
		result.append(", domainName_java_lang_String_: ");
		result.append(domainName_java_lang_String_);
		result.append(", domainZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference: ");
		result.append(domainZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference);
		result.append(", enableEcsManagedTags_java_lang_Boolean_: ");
		result.append(enableEcsManagedTags_java_lang_Boolean_);
		result.append(", healthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(healthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		result.append(", listenerPort_java_lang_Number_: ");
		result.append(listenerPort_java_lang_Number_);
		result.append(
				", loadBalancerWithIApplicationLoadBalancer_software_amazon_awscdk_services_elasticloadbalancingv2_IApplicationLoadBalancer_AsReference: ");
		result.append(
				loadBalancerWithIApplicationLoadBalancer_software_amazon_awscdk_services_elasticloadbalancingv2_IApplicationLoadBalancer_AsReference);
		result.append(", maxHealthyPercent_java_lang_Number_: ");
		result.append(maxHealthyPercent_java_lang_Number_);
		result.append(", minHealthyPercent_java_lang_Number_: ");
		result.append(minHealthyPercent_java_lang_Number_);
		result.append(", propagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_: ");
		result.append(propagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_);
		result.append(", protocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_: ");
		result.append(protocol_software_amazon_awscdk_services_elasticloadbalancingv2_ApplicationProtocol_);
		result.append(", publicLoadBalancer_java_lang_Boolean_: ");
		result.append(publicLoadBalancer_java_lang_Boolean_);
		result.append(", serviceName_java_lang_String_: ");
		result.append(serviceName_java_lang_String_);
		result.append(
				", taskImageOptionsWithApplicationLoadBalancedTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageOptions_AsReference: ");
		result.append(
				taskImageOptionsWithApplicationLoadBalancedTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ApplicationLoadBalancedTaskImageOptions_AsReference);
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

} //ApplicationLoadBalancedEc2ServiceBuilder_patternsImpl
