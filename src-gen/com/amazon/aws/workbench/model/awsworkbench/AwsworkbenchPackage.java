/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchFactory
 * @model kind="package"
 * @generated
 */
public interface AwsworkbenchPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "awsworkbench";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.amazon.com/awsworkbench";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "awsworkbench";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AwsworkbenchPackage eINSTANCE = com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilder_coreImpl <em>App Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilder_coreImpl
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getAppBuilder_core()
	 * @generated
	 */
	int APP_BUILDER_CORE = 0;

	/**
	 * The feature id for the '<em><b>Auto Synth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE__AUTO_SYNTH = 0;

	/**
	 * The feature id for the '<em><b>Context As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE__CONTEXT_AS_MAP = 1;

	/**
	 * The feature id for the '<em><b>Outdir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE__OUTDIR = 2;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE__RUNTIME_INFO = 3;

	/**
	 * The feature id for the '<em><b>Stack Traces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE__STACK_TRACES = 4;

	/**
	 * The feature id for the '<em><b>Tree Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE__TREE_METADATA = 5;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE__GENERATED_CLASS_NAME = 6;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE__VAR_NAME = 7;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE__IDENTIFIER = 8;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE__ADDITIONAL_CODE = 9;

	/**
	 * The feature id for the '<em><b>Stackbuilder core</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE__STACKBUILDER_CORE = 10;

	/**
	 * The number of structural features of the '<em>App Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>App Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.StackBuilder_coreImpl <em>Stack Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.StackBuilder_coreImpl
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getStackBuilder_core()
	 * @generated
	 */
	int STACK_BUILDER_CORE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_CORE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Env With Environment As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_CORE__ENV_WITH_ENVIRONMENT_AS_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Stack Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_CORE__STACK_NAME = 2;

	/**
	 * The feature id for the '<em><b>Synthesizer With IStack Synthesizer As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_CORE__SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_AS_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Tags As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_CORE__TAGS_AS_MAP = 4;

	/**
	 * The feature id for the '<em><b>Termination Protection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_CORE__TERMINATION_PROTECTION = 5;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_CORE__GENERATED_CLASS_NAME = 6;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_CORE__VAR_NAME = 7;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_CORE__IDENTIFIER = 8;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_CORE__ADDITIONAL_CODE = 9;

	/**
	 * The feature id for the '<em><b>Serviceresources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_CORE__SERVICERESOURCES = 10;

	/**
	 * The number of structural features of the '<em>Stack Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_CORE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Stack Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.ServiceResourcesImpl <em>Service Resources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.ServiceResourcesImpl
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getServiceResources()
	 * @generated
	 */
	int SERVICE_RESOURCES = 3;

	/**
	 * The number of structural features of the '<em>Service Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Service Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl <em>Vpc Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getVpcBuilder_ec2()
	 * @generated
	 */
	int VPC_BUILDER_EC2 = 2;

	/**
	 * The feature id for the '<em><b>Cidr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__CIDR = SERVICE_RESOURCES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Instance Tenancy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__DEFAULT_INSTANCE_TENANCY = SERVICE_RESOURCES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enable Dns Hostnames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__ENABLE_DNS_HOSTNAMES = SERVICE_RESOURCES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enable Dns Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__ENABLE_DNS_SUPPORT = SERVICE_RESOURCES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Flow Logs As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__FLOW_LOGS_AS_MAP = SERVICE_RESOURCES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gateway Endpoints As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__GATEWAY_ENDPOINTS_AS_MAP = SERVICE_RESOURCES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Max Azs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__MAX_AZS = SERVICE_RESOURCES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Nat Gateway Provider With Nat Provider As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_AS_REFERENCE = SERVICE_RESOURCES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Nat Gateways</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__NAT_GATEWAYS = SERVICE_RESOURCES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Nat Gateway Subnets With Subnet Selection As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_AS_REFERENCE = SERVICE_RESOURCES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Subnet Configuration As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__SUBNET_CONFIGURATION_AS_LIST = SERVICE_RESOURCES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Vpn Connections As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__VPN_CONNECTIONS_AS_MAP = SERVICE_RESOURCES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Vpn Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__VPN_GATEWAY = SERVICE_RESOURCES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Vpn Gateway Asn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__VPN_GATEWAY_ASN = SERVICE_RESOURCES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Vpn Route Propagation As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__VPN_ROUTE_PROPAGATION_AS_LIST = SERVICE_RESOURCES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__GENERATED_CLASS_NAME = SERVICE_RESOURCES_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__VAR_NAME = SERVICE_RESOURCES_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__IDENTIFIER = SERVICE_RESOURCES_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__ADDITIONAL_CODE = SERVICE_RESOURCES_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Subnetbuilder ec2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__SUBNETBUILDER_EC2 = SERVICE_RESOURCES_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Securitygroupbuilder ec2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__SECURITYGROUPBUILDER_EC2 = SERVICE_RESOURCES_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Privatesubnetbuilder ec2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__PRIVATESUBNETBUILDER_EC2 = SERVICE_RESOURCES_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Publicsubnetbuilder ec2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__PUBLICSUBNETBUILDER_EC2 = SERVICE_RESOURCES_FEATURE_COUNT + 22;

	/**
	 * The number of structural features of the '<em>Vpc Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2_FEATURE_COUNT = SERVICE_RESOURCES_FEATURE_COUNT + 23;

	/**
	 * The number of operations of the '<em>Vpc Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2_OPERATION_COUNT = SERVICE_RESOURCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.SubnetBuilder_ec2Impl <em>Subnet Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.SubnetBuilder_ec2Impl
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getSubnetBuilder_ec2()
	 * @generated
	 */
	int SUBNET_BUILDER_EC2 = 4;

	/**
	 * The feature id for the '<em><b>Availability Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_BUILDER_EC2__AVAILABILITY_ZONE = SERVICE_RESOURCES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cidr Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_BUILDER_EC2__CIDR_BLOCK = SERVICE_RESOURCES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vpc Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_BUILDER_EC2__VPC_ID = SERVICE_RESOURCES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Map Public Ip On Launch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH = SERVICE_RESOURCES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_BUILDER_EC2__GENERATED_CLASS_NAME = SERVICE_RESOURCES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_BUILDER_EC2__VAR_NAME = SERVICE_RESOURCES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_BUILDER_EC2__IDENTIFIER = SERVICE_RESOURCES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_BUILDER_EC2__ADDITIONAL_CODE = SERVICE_RESOURCES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Instancebuilder ec2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_BUILDER_EC2__INSTANCEBUILDER_EC2 = SERVICE_RESOURCES_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Subnet Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_BUILDER_EC2_FEATURE_COUNT = SERVICE_RESOURCES_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Subnet Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_BUILDER_EC2_OPERATION_COUNT = SERVICE_RESOURCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.InstanceBuilder_ec2Impl <em>Instance Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.InstanceBuilder_ec2Impl
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getInstanceBuilder_ec2()
	 * @generated
	 */
	int INSTANCE_BUILDER_EC2 = 5;

	/**
	 * The feature id for the '<em><b>Instance Type With Instance Type As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_AS_REFERENCE = SERVICE_RESOURCES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Machine Image With IMachine Image As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_AS_REFERENCE = SERVICE_RESOURCES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vpc With IVpc As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__VPC_WITH_IVPC_AS_REFERENCE = SERVICE_RESOURCES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Allow All Outbound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__ALLOW_ALL_OUTBOUND = SERVICE_RESOURCES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Availability Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__AVAILABILITY_ZONE = SERVICE_RESOURCES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Block Devices As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__BLOCK_DEVICES_AS_LIST = SERVICE_RESOURCES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__INSTANCE_NAME = SERVICE_RESOURCES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__KEY_NAME = SERVICE_RESOURCES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Private Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__PRIVATE_IP_ADDRESS = SERVICE_RESOURCES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Resource Signal Timeout With Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_AS_REFERENCE = SERVICE_RESOURCES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Role With IRole As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__ROLE_WITH_IROLE_AS_REFERENCE = SERVICE_RESOURCES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Security Group With ISecurity Group As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_AS_REFERENCE = SERVICE_RESOURCES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Source Dest Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__SOURCE_DEST_CHECK = SERVICE_RESOURCES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>User Data With User Data As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_AS_REFERENCE = SERVICE_RESOURCES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Vpc Subnets With Subnet Selection As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__VPC_SUBNETS_WITH_SUBNET_SELECTION_AS_REFERENCE = SERVICE_RESOURCES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__GENERATED_CLASS_NAME = SERVICE_RESOURCES_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__VAR_NAME = SERVICE_RESOURCES_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__IDENTIFIER = SERVICE_RESOURCES_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__ADDITIONAL_CODE = SERVICE_RESOURCES_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Instance Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2_FEATURE_COUNT = SERVICE_RESOURCES_FEATURE_COUNT + 19;

	/**
	 * The number of operations of the '<em>Instance Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2_OPERATION_COUNT = SERVICE_RESOURCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.SecurityGroupBuilder_ec2Impl <em>Security Group Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.SecurityGroupBuilder_ec2Impl
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getSecurityGroupBuilder_ec2()
	 * @generated
	 */
	int SECURITY_GROUP_BUILDER_EC2 = 6;

	/**
	 * The feature id for the '<em><b>Vpc With IVpc As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_BUILDER_EC2__VPC_WITH_IVPC_AS_REFERENCE = SERVICE_RESOURCES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allow All Outbound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_BUILDER_EC2__ALLOW_ALL_OUTBOUND = SERVICE_RESOURCES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_BUILDER_EC2__DESCRIPTION = SERVICE_RESOURCES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Security Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_BUILDER_EC2__SECURITY_GROUP_NAME = SERVICE_RESOURCES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_BUILDER_EC2__GENERATED_CLASS_NAME = SERVICE_RESOURCES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_BUILDER_EC2__VAR_NAME = SERVICE_RESOURCES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_BUILDER_EC2__IDENTIFIER = SERVICE_RESOURCES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_BUILDER_EC2__ADDITIONAL_CODE = SERVICE_RESOURCES_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Security Group Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_BUILDER_EC2_FEATURE_COUNT = SERVICE_RESOURCES_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Security Group Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_BUILDER_EC2_OPERATION_COUNT = SERVICE_RESOURCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.PortBuilder_ec2Impl <em>Port Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.PortBuilder_ec2Impl
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getPortBuilder_ec2()
	 * @generated
	 */
	int PORT_BUILDER_EC2 = 7;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BUILDER_EC2__PROTOCOL = SERVICE_RESOURCES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>String Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BUILDER_EC2__STRING_REPRESENTATION = SERVICE_RESOURCES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BUILDER_EC2__FROM_PORT = SERVICE_RESOURCES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BUILDER_EC2__TO_PORT = SERVICE_RESOURCES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BUILDER_EC2__GENERATED_CLASS_NAME = SERVICE_RESOURCES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BUILDER_EC2__VAR_NAME = SERVICE_RESOURCES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BUILDER_EC2__IDENTIFIER = SERVICE_RESOURCES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BUILDER_EC2__ADDITIONAL_CODE = SERVICE_RESOURCES_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Port Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BUILDER_EC2_FEATURE_COUNT = SERVICE_RESOURCES_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Port Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BUILDER_EC2_OPERATION_COUNT = SERVICE_RESOURCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.PrivateSubnetBuilder_ec2Impl <em>Private Subnet Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.PrivateSubnetBuilder_ec2Impl
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getPrivateSubnetBuilder_ec2()
	 * @generated
	 */
	int PRIVATE_SUBNET_BUILDER_EC2 = 8;

	/**
	 * The feature id for the '<em><b>Availability Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_BUILDER_EC2__AVAILABILITY_ZONE = SERVICE_RESOURCES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cidr Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_BUILDER_EC2__CIDR_BLOCK = SERVICE_RESOURCES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vpc Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_BUILDER_EC2__VPC_ID = SERVICE_RESOURCES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Map Public Ip On Launch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH = SERVICE_RESOURCES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_BUILDER_EC2__GENERATED_CLASS_NAME = SERVICE_RESOURCES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_BUILDER_EC2__VAR_NAME = SERVICE_RESOURCES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_BUILDER_EC2__IDENTIFIER = SERVICE_RESOURCES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_BUILDER_EC2__ADDITIONAL_CODE = SERVICE_RESOURCES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Instancebuilder ec2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_BUILDER_EC2__INSTANCEBUILDER_EC2 = SERVICE_RESOURCES_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Private Subnet Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_BUILDER_EC2_FEATURE_COUNT = SERVICE_RESOURCES_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Private Subnet Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_BUILDER_EC2_OPERATION_COUNT = SERVICE_RESOURCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.PublicSubnetBuilder_ec2Impl <em>Public Subnet Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.PublicSubnetBuilder_ec2Impl
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getPublicSubnetBuilder_ec2()
	 * @generated
	 */
	int PUBLIC_SUBNET_BUILDER_EC2 = 9;

	/**
	 * The feature id for the '<em><b>Availability Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_BUILDER_EC2__AVAILABILITY_ZONE = SERVICE_RESOURCES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cidr Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_BUILDER_EC2__CIDR_BLOCK = SERVICE_RESOURCES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vpc Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_BUILDER_EC2__VPC_ID = SERVICE_RESOURCES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Map Public Ip On Launch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH = SERVICE_RESOURCES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_BUILDER_EC2__GENERATED_CLASS_NAME = SERVICE_RESOURCES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_BUILDER_EC2__VAR_NAME = SERVICE_RESOURCES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_BUILDER_EC2__IDENTIFIER = SERVICE_RESOURCES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_BUILDER_EC2__ADDITIONAL_CODE = SERVICE_RESOURCES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Instancebuilder ec2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_BUILDER_EC2__INSTANCEBUILDER_EC2 = SERVICE_RESOURCES_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Public Subnet Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_BUILDER_EC2_FEATURE_COUNT = SERVICE_RESOURCES_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Public Subnet Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_BUILDER_EC2_OPERATION_COUNT = SERVICE_RESOURCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.DefaultInstanceTenancy <em>Default Instance Tenancy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.DefaultInstanceTenancy
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getDefaultInstanceTenancy()
	 * @generated
	 */
	int DEFAULT_INSTANCE_TENANCY = 10;

	/**
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.Protocol <em>Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.Protocol
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 11;

	/**
	 * Returns the meta object for class '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core <em>App Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Builder core</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core
	 * @generated
	 */
	EClass getAppBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getAutoSynth <em>Auto Synth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Synth</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getAutoSynth()
	 * @see #getAppBuilder_core()
	 * @generated
	 */
	EAttribute getAppBuilder_core_AutoSynth();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getContextAsMap <em>Context As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context As Map</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getContextAsMap()
	 * @see #getAppBuilder_core()
	 * @generated
	 */
	EAttribute getAppBuilder_core_ContextAsMap();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getOutdir <em>Outdir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outdir</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getOutdir()
	 * @see #getAppBuilder_core()
	 * @generated
	 */
	EAttribute getAppBuilder_core_Outdir();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getRuntimeInfo <em>Runtime Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtime Info</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getRuntimeInfo()
	 * @see #getAppBuilder_core()
	 * @generated
	 */
	EAttribute getAppBuilder_core_RuntimeInfo();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getStackTraces <em>Stack Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stack Traces</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getStackTraces()
	 * @see #getAppBuilder_core()
	 * @generated
	 */
	EAttribute getAppBuilder_core_StackTraces();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getTreeMetadata <em>Tree Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tree Metadata</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getTreeMetadata()
	 * @see #getAppBuilder_core()
	 * @generated
	 */
	EAttribute getAppBuilder_core_TreeMetadata();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getGeneratedClassName()
	 * @see #getAppBuilder_core()
	 * @generated
	 */
	EAttribute getAppBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getVarName()
	 * @see #getAppBuilder_core()
	 * @generated
	 */
	EAttribute getAppBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getIdentifier()
	 * @see #getAppBuilder_core()
	 * @generated
	 */
	EAttribute getAppBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getAdditionalCode()
	 * @see #getAppBuilder_core()
	 * @generated
	 */
	EAttribute getAppBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for the containment reference list '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getStackbuilder_core <em>Stackbuilder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stackbuilder core</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getStackbuilder_core()
	 * @see #getAppBuilder_core()
	 * @generated
	 */
	EReference getAppBuilder_core_Stackbuilder_core();

	/**
	 * Returns the meta object for class '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core <em>Stack Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stack Builder core</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core
	 * @generated
	 */
	EClass getStackBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getDescription()
	 * @see #getStackBuilder_core()
	 * @generated
	 */
	EAttribute getStackBuilder_core_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getEnvWithEnvironmentAsReference <em>Env With Environment As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Env With Environment As Reference</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getEnvWithEnvironmentAsReference()
	 * @see #getStackBuilder_core()
	 * @generated
	 */
	EAttribute getStackBuilder_core_EnvWithEnvironmentAsReference();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getStackName <em>Stack Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stack Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getStackName()
	 * @see #getStackBuilder_core()
	 * @generated
	 */
	EAttribute getStackBuilder_core_StackName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getSynthesizerWithIStackSynthesizerAsReference <em>Synthesizer With IStack Synthesizer As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synthesizer With IStack Synthesizer As Reference</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getSynthesizerWithIStackSynthesizerAsReference()
	 * @see #getStackBuilder_core()
	 * @generated
	 */
	EAttribute getStackBuilder_core_SynthesizerWithIStackSynthesizerAsReference();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getTagsAsMap <em>Tags As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tags As Map</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getTagsAsMap()
	 * @see #getStackBuilder_core()
	 * @generated
	 */
	EAttribute getStackBuilder_core_TagsAsMap();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getTerminationProtection <em>Termination Protection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Termination Protection</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getTerminationProtection()
	 * @see #getStackBuilder_core()
	 * @generated
	 */
	EAttribute getStackBuilder_core_TerminationProtection();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getGeneratedClassName()
	 * @see #getStackBuilder_core()
	 * @generated
	 */
	EAttribute getStackBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getVarName()
	 * @see #getStackBuilder_core()
	 * @generated
	 */
	EAttribute getStackBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getIdentifier()
	 * @see #getStackBuilder_core()
	 * @generated
	 */
	EAttribute getStackBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getAdditionalCode()
	 * @see #getStackBuilder_core()
	 * @generated
	 */
	EAttribute getStackBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for the containment reference list '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getServiceresources <em>Serviceresources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Serviceresources</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getServiceresources()
	 * @see #getStackBuilder_core()
	 * @generated
	 */
	EReference getStackBuilder_core_Serviceresources();

	/**
	 * Returns the meta object for class '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2 <em>Vpc Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vpc Builder ec2</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2
	 * @generated
	 */
	EClass getVpcBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getCidr <em>Cidr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getCidr()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_Cidr();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getDefaultInstanceTenancy <em>Default Instance Tenancy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Instance Tenancy</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getDefaultInstanceTenancy()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_DefaultInstanceTenancy();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getEnableDnsHostnames <em>Enable Dns Hostnames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Dns Hostnames</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getEnableDnsHostnames()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_EnableDnsHostnames();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getEnableDnsSupport <em>Enable Dns Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Dns Support</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getEnableDnsSupport()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_EnableDnsSupport();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getFlowLogsAsMap <em>Flow Logs As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow Logs As Map</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getFlowLogsAsMap()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_FlowLogsAsMap();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getGatewayEndpointsAsMap <em>Gateway Endpoints As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway Endpoints As Map</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getGatewayEndpointsAsMap()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_GatewayEndpointsAsMap();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getMaxAzs <em>Max Azs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Azs</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getMaxAzs()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_MaxAzs();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getNatGatewayProviderWithNatProviderAsReference <em>Nat Gateway Provider With Nat Provider As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nat Gateway Provider With Nat Provider As Reference</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getNatGatewayProviderWithNatProviderAsReference()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_NatGatewayProviderWithNatProviderAsReference();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getNatGateways <em>Nat Gateways</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nat Gateways</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getNatGateways()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_NatGateways();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getNatGatewaySubnetsWithSubnetSelectionAsReference <em>Nat Gateway Subnets With Subnet Selection As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nat Gateway Subnets With Subnet Selection As Reference</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getNatGatewaySubnetsWithSubnetSelectionAsReference()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_NatGatewaySubnetsWithSubnetSelectionAsReference();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getSubnetConfigurationAsList <em>Subnet Configuration As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet Configuration As List</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getSubnetConfigurationAsList()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_SubnetConfigurationAsList();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getVpnConnectionsAsMap <em>Vpn Connections As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpn Connections As Map</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getVpnConnectionsAsMap()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_VpnConnectionsAsMap();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getVpnGateway <em>Vpn Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpn Gateway</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getVpnGateway()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_VpnGateway();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getVpnGatewayAsn <em>Vpn Gateway Asn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpn Gateway Asn</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getVpnGatewayAsn()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_VpnGatewayAsn();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getVpnRoutePropagationAsList <em>Vpn Route Propagation As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpn Route Propagation As List</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getVpnRoutePropagationAsList()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_VpnRoutePropagationAsList();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getGeneratedClassName()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getVarName()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getIdentifier()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getAdditionalCode()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for the containment reference list '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getSubnetbuilder_ec2 <em>Subnetbuilder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subnetbuilder ec2</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getSubnetbuilder_ec2()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EReference getVpcBuilder_ec2_Subnetbuilder_ec2();

	/**
	 * Returns the meta object for the containment reference list '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getSecuritygroupbuilder_ec2 <em>Securitygroupbuilder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Securitygroupbuilder ec2</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getSecuritygroupbuilder_ec2()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EReference getVpcBuilder_ec2_Securitygroupbuilder_ec2();

	/**
	 * Returns the meta object for the containment reference list '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getPrivatesubnetbuilder_ec2 <em>Privatesubnetbuilder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Privatesubnetbuilder ec2</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getPrivatesubnetbuilder_ec2()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EReference getVpcBuilder_ec2_Privatesubnetbuilder_ec2();

	/**
	 * Returns the meta object for the containment reference list '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getPublicsubnetbuilder_ec2 <em>Publicsubnetbuilder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publicsubnetbuilder ec2</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getPublicsubnetbuilder_ec2()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EReference getVpcBuilder_ec2_Publicsubnetbuilder_ec2();

	/**
	 * Returns the meta object for class '{@link com.amazon.aws.workbench.model.awsworkbench.ServiceResources <em>Service Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Resources</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ServiceResources
	 * @generated
	 */
	EClass getServiceResources();

	/**
	 * Returns the meta object for class '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2 <em>Subnet Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subnet Builder ec2</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2
	 * @generated
	 */
	EClass getSubnetBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2#getAvailabilityZone <em>Availability Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Zone</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2#getAvailabilityZone()
	 * @see #getSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetBuilder_ec2_AvailabilityZone();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2#getCidrBlock <em>Cidr Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr Block</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2#getCidrBlock()
	 * @see #getSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetBuilder_ec2_CidrBlock();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2#getVpcId <em>Vpc Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc Id</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2#getVpcId()
	 * @see #getSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetBuilder_ec2_VpcId();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2#getMapPublicIpOnLaunch <em>Map Public Ip On Launch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Public Ip On Launch</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2#getMapPublicIpOnLaunch()
	 * @see #getSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetBuilder_ec2_MapPublicIpOnLaunch();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2#getGeneratedClassName()
	 * @see #getSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2#getVarName()
	 * @see #getSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2#getIdentifier()
	 * @see #getSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2#getAdditionalCode()
	 * @see #getSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for the containment reference list '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2#getInstancebuilder_ec2 <em>Instancebuilder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instancebuilder ec2</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2#getInstancebuilder_ec2()
	 * @see #getSubnetBuilder_ec2()
	 * @generated
	 */
	EReference getSubnetBuilder_ec2_Instancebuilder_ec2();

	/**
	 * Returns the meta object for class '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2 <em>Instance Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Builder ec2</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2
	 * @generated
	 */
	EClass getInstanceBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getInstanceTypeWithInstanceTypeAsReference <em>Instance Type With Instance Type As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type With Instance Type As Reference</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getInstanceTypeWithInstanceTypeAsReference()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_InstanceTypeWithInstanceTypeAsReference();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getMachineImageWithIMachineImageAsReference <em>Machine Image With IMachine Image As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Machine Image With IMachine Image As Reference</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getMachineImageWithIMachineImageAsReference()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_MachineImageWithIMachineImageAsReference();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getVpcWithIVpcAsReference <em>Vpc With IVpc As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc With IVpc As Reference</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getVpcWithIVpcAsReference()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_VpcWithIVpcAsReference();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getAllowAllOutbound <em>Allow All Outbound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow All Outbound</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getAllowAllOutbound()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_AllowAllOutbound();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getAvailabilityZone <em>Availability Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Zone</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getAvailabilityZone()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_AvailabilityZone();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getBlockDevicesAsList <em>Block Devices As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Devices As List</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getBlockDevicesAsList()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_BlockDevicesAsList();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getInstanceName <em>Instance Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getInstanceName()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_InstanceName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getKeyName <em>Key Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getKeyName()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_KeyName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getPrivateIpAddress <em>Private Ip Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Ip Address</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getPrivateIpAddress()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_PrivateIpAddress();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getResourceSignalTimeoutWithDurationAsReference <em>Resource Signal Timeout With Duration As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Signal Timeout With Duration As Reference</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getResourceSignalTimeoutWithDurationAsReference()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_ResourceSignalTimeoutWithDurationAsReference();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getRoleWithIRoleAsReference <em>Role With IRole As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role With IRole As Reference</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getRoleWithIRoleAsReference()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_RoleWithIRoleAsReference();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getSecurityGroupWithISecurityGroupAsReference <em>Security Group With ISecurity Group As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Group With ISecurity Group As Reference</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getSecurityGroupWithISecurityGroupAsReference()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_SecurityGroupWithISecurityGroupAsReference();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getSourceDestCheck <em>Source Dest Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Dest Check</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getSourceDestCheck()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_SourceDestCheck();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getUserDataWithUserDataAsReference <em>User Data With User Data As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Data With User Data As Reference</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getUserDataWithUserDataAsReference()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_UserDataWithUserDataAsReference();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getVpcSubnetsWithSubnetSelectionAsReference <em>Vpc Subnets With Subnet Selection As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc Subnets With Subnet Selection As Reference</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getVpcSubnetsWithSubnetSelectionAsReference()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_VpcSubnetsWithSubnetSelectionAsReference();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getGeneratedClassName()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getVarName()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getIdentifier()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getAdditionalCode()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link com.amazon.aws.workbench.model.awsworkbench.SecurityGroupBuilder_ec2 <em>Security Group Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Group Builder ec2</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SecurityGroupBuilder_ec2
	 * @generated
	 */
	EClass getSecurityGroupBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SecurityGroupBuilder_ec2#getVpcWithIVpcAsReference <em>Vpc With IVpc As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc With IVpc As Reference</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SecurityGroupBuilder_ec2#getVpcWithIVpcAsReference()
	 * @see #getSecurityGroupBuilder_ec2()
	 * @generated
	 */
	EAttribute getSecurityGroupBuilder_ec2_VpcWithIVpcAsReference();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SecurityGroupBuilder_ec2#getAllowAllOutbound <em>Allow All Outbound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow All Outbound</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SecurityGroupBuilder_ec2#getAllowAllOutbound()
	 * @see #getSecurityGroupBuilder_ec2()
	 * @generated
	 */
	EAttribute getSecurityGroupBuilder_ec2_AllowAllOutbound();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SecurityGroupBuilder_ec2#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SecurityGroupBuilder_ec2#getDescription()
	 * @see #getSecurityGroupBuilder_ec2()
	 * @generated
	 */
	EAttribute getSecurityGroupBuilder_ec2_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SecurityGroupBuilder_ec2#getSecurityGroupName <em>Security Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Group Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SecurityGroupBuilder_ec2#getSecurityGroupName()
	 * @see #getSecurityGroupBuilder_ec2()
	 * @generated
	 */
	EAttribute getSecurityGroupBuilder_ec2_SecurityGroupName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SecurityGroupBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SecurityGroupBuilder_ec2#getGeneratedClassName()
	 * @see #getSecurityGroupBuilder_ec2()
	 * @generated
	 */
	EAttribute getSecurityGroupBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SecurityGroupBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SecurityGroupBuilder_ec2#getVarName()
	 * @see #getSecurityGroupBuilder_ec2()
	 * @generated
	 */
	EAttribute getSecurityGroupBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SecurityGroupBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SecurityGroupBuilder_ec2#getIdentifier()
	 * @see #getSecurityGroupBuilder_ec2()
	 * @generated
	 */
	EAttribute getSecurityGroupBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SecurityGroupBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SecurityGroupBuilder_ec2#getAdditionalCode()
	 * @see #getSecurityGroupBuilder_ec2()
	 * @generated
	 */
	EAttribute getSecurityGroupBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2 <em>Port Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Builder ec2</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2
	 * @generated
	 */
	EClass getPortBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2#getProtocol()
	 * @see #getPortBuilder_ec2()
	 * @generated
	 */
	EAttribute getPortBuilder_ec2_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2#getStringRepresentation <em>String Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Representation</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2#getStringRepresentation()
	 * @see #getPortBuilder_ec2()
	 * @generated
	 */
	EAttribute getPortBuilder_ec2_StringRepresentation();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2#getFromPort <em>From Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Port</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2#getFromPort()
	 * @see #getPortBuilder_ec2()
	 * @generated
	 */
	EAttribute getPortBuilder_ec2_FromPort();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2#getToPort <em>To Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Port</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2#getToPort()
	 * @see #getPortBuilder_ec2()
	 * @generated
	 */
	EAttribute getPortBuilder_ec2_ToPort();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2#getGeneratedClassName()
	 * @see #getPortBuilder_ec2()
	 * @generated
	 */
	EAttribute getPortBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2#getVarName()
	 * @see #getPortBuilder_ec2()
	 * @generated
	 */
	EAttribute getPortBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2#getIdentifier()
	 * @see #getPortBuilder_ec2()
	 * @generated
	 */
	EAttribute getPortBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2#getAdditionalCode()
	 * @see #getPortBuilder_ec2()
	 * @generated
	 */
	EAttribute getPortBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link com.amazon.aws.workbench.model.awsworkbench.PrivateSubnetBuilder_ec2 <em>Private Subnet Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Private Subnet Builder ec2</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PrivateSubnetBuilder_ec2
	 * @generated
	 */
	EClass getPrivateSubnetBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.PrivateSubnetBuilder_ec2#getAvailabilityZone <em>Availability Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Zone</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PrivateSubnetBuilder_ec2#getAvailabilityZone()
	 * @see #getPrivateSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getPrivateSubnetBuilder_ec2_AvailabilityZone();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.PrivateSubnetBuilder_ec2#getCidrBlock <em>Cidr Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr Block</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PrivateSubnetBuilder_ec2#getCidrBlock()
	 * @see #getPrivateSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getPrivateSubnetBuilder_ec2_CidrBlock();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.PrivateSubnetBuilder_ec2#getVpcId <em>Vpc Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc Id</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PrivateSubnetBuilder_ec2#getVpcId()
	 * @see #getPrivateSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getPrivateSubnetBuilder_ec2_VpcId();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.PrivateSubnetBuilder_ec2#getMapPublicIpOnLaunch <em>Map Public Ip On Launch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Public Ip On Launch</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PrivateSubnetBuilder_ec2#getMapPublicIpOnLaunch()
	 * @see #getPrivateSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getPrivateSubnetBuilder_ec2_MapPublicIpOnLaunch();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.PrivateSubnetBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PrivateSubnetBuilder_ec2#getGeneratedClassName()
	 * @see #getPrivateSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getPrivateSubnetBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.PrivateSubnetBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PrivateSubnetBuilder_ec2#getVarName()
	 * @see #getPrivateSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getPrivateSubnetBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.PrivateSubnetBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PrivateSubnetBuilder_ec2#getIdentifier()
	 * @see #getPrivateSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getPrivateSubnetBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.PrivateSubnetBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PrivateSubnetBuilder_ec2#getAdditionalCode()
	 * @see #getPrivateSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getPrivateSubnetBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for the containment reference list '{@link com.amazon.aws.workbench.model.awsworkbench.PrivateSubnetBuilder_ec2#getInstancebuilder_ec2 <em>Instancebuilder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instancebuilder ec2</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PrivateSubnetBuilder_ec2#getInstancebuilder_ec2()
	 * @see #getPrivateSubnetBuilder_ec2()
	 * @generated
	 */
	EReference getPrivateSubnetBuilder_ec2_Instancebuilder_ec2();

	/**
	 * Returns the meta object for class '{@link com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2 <em>Public Subnet Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Subnet Builder ec2</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2
	 * @generated
	 */
	EClass getPublicSubnetBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getAvailabilityZone <em>Availability Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Zone</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getAvailabilityZone()
	 * @see #getPublicSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getPublicSubnetBuilder_ec2_AvailabilityZone();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getCidrBlock <em>Cidr Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr Block</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getCidrBlock()
	 * @see #getPublicSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getPublicSubnetBuilder_ec2_CidrBlock();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getVpcId <em>Vpc Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc Id</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getVpcId()
	 * @see #getPublicSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getPublicSubnetBuilder_ec2_VpcId();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getMapPublicIpOnLaunch <em>Map Public Ip On Launch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Public Ip On Launch</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getMapPublicIpOnLaunch()
	 * @see #getPublicSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getPublicSubnetBuilder_ec2_MapPublicIpOnLaunch();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getGeneratedClassName()
	 * @see #getPublicSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getPublicSubnetBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getVarName()
	 * @see #getPublicSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getPublicSubnetBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getIdentifier()
	 * @see #getPublicSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getPublicSubnetBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getAdditionalCode()
	 * @see #getPublicSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getPublicSubnetBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for the containment reference list '{@link com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getInstancebuilder_ec2 <em>Instancebuilder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instancebuilder ec2</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getInstancebuilder_ec2()
	 * @see #getPublicSubnetBuilder_ec2()
	 * @generated
	 */
	EReference getPublicSubnetBuilder_ec2_Instancebuilder_ec2();

	/**
	 * Returns the meta object for enum '{@link com.amazon.aws.workbench.model.awsworkbench.DefaultInstanceTenancy <em>Default Instance Tenancy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Default Instance Tenancy</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.DefaultInstanceTenancy
	 * @generated
	 */
	EEnum getDefaultInstanceTenancy();

	/**
	 * Returns the meta object for enum '{@link com.amazon.aws.workbench.model.awsworkbench.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protocol</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.Protocol
	 * @generated
	 */
	EEnum getProtocol();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AwsworkbenchFactory getAwsworkbenchFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilder_coreImpl <em>App Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilder_coreImpl
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getAppBuilder_core()
		 * @generated
		 */
		EClass APP_BUILDER_CORE = eINSTANCE.getAppBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Auto Synth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER_CORE__AUTO_SYNTH = eINSTANCE.getAppBuilder_core_AutoSynth();

		/**
		 * The meta object literal for the '<em><b>Context As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER_CORE__CONTEXT_AS_MAP = eINSTANCE.getAppBuilder_core_ContextAsMap();

		/**
		 * The meta object literal for the '<em><b>Outdir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER_CORE__OUTDIR = eINSTANCE.getAppBuilder_core_Outdir();

		/**
		 * The meta object literal for the '<em><b>Runtime Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER_CORE__RUNTIME_INFO = eINSTANCE.getAppBuilder_core_RuntimeInfo();

		/**
		 * The meta object literal for the '<em><b>Stack Traces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER_CORE__STACK_TRACES = eINSTANCE.getAppBuilder_core_StackTraces();

		/**
		 * The meta object literal for the '<em><b>Tree Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER_CORE__TREE_METADATA = eINSTANCE.getAppBuilder_core_TreeMetadata();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE.getAppBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER_CORE__VAR_NAME = eINSTANCE.getAppBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER_CORE__IDENTIFIER = eINSTANCE.getAppBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE.getAppBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '<em><b>Stackbuilder core</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_BUILDER_CORE__STACKBUILDER_CORE = eINSTANCE.getAppBuilder_core_Stackbuilder_core();

		/**
		 * The meta object literal for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.StackBuilder_coreImpl <em>Stack Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.StackBuilder_coreImpl
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getStackBuilder_core()
		 * @generated
		 */
		EClass STACK_BUILDER_CORE = eINSTANCE.getStackBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER_CORE__DESCRIPTION = eINSTANCE.getStackBuilder_core_Description();

		/**
		 * The meta object literal for the '<em><b>Env With Environment As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER_CORE__ENV_WITH_ENVIRONMENT_AS_REFERENCE = eINSTANCE
				.getStackBuilder_core_EnvWithEnvironmentAsReference();

		/**
		 * The meta object literal for the '<em><b>Stack Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER_CORE__STACK_NAME = eINSTANCE.getStackBuilder_core_StackName();

		/**
		 * The meta object literal for the '<em><b>Synthesizer With IStack Synthesizer As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER_CORE__SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_AS_REFERENCE = eINSTANCE
				.getStackBuilder_core_SynthesizerWithIStackSynthesizerAsReference();

		/**
		 * The meta object literal for the '<em><b>Tags As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER_CORE__TAGS_AS_MAP = eINSTANCE.getStackBuilder_core_TagsAsMap();

		/**
		 * The meta object literal for the '<em><b>Termination Protection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER_CORE__TERMINATION_PROTECTION = eINSTANCE.getStackBuilder_core_TerminationProtection();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE.getStackBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER_CORE__VAR_NAME = eINSTANCE.getStackBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER_CORE__IDENTIFIER = eINSTANCE.getStackBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE.getStackBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '<em><b>Serviceresources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STACK_BUILDER_CORE__SERVICERESOURCES = eINSTANCE.getStackBuilder_core_Serviceresources();

		/**
		 * The meta object literal for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl <em>Vpc Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getVpcBuilder_ec2()
		 * @generated
		 */
		EClass VPC_BUILDER_EC2 = eINSTANCE.getVpcBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Cidr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__CIDR = eINSTANCE.getVpcBuilder_ec2_Cidr();

		/**
		 * The meta object literal for the '<em><b>Default Instance Tenancy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__DEFAULT_INSTANCE_TENANCY = eINSTANCE.getVpcBuilder_ec2_DefaultInstanceTenancy();

		/**
		 * The meta object literal for the '<em><b>Enable Dns Hostnames</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__ENABLE_DNS_HOSTNAMES = eINSTANCE.getVpcBuilder_ec2_EnableDnsHostnames();

		/**
		 * The meta object literal for the '<em><b>Enable Dns Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__ENABLE_DNS_SUPPORT = eINSTANCE.getVpcBuilder_ec2_EnableDnsSupport();

		/**
		 * The meta object literal for the '<em><b>Flow Logs As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__FLOW_LOGS_AS_MAP = eINSTANCE.getVpcBuilder_ec2_FlowLogsAsMap();

		/**
		 * The meta object literal for the '<em><b>Gateway Endpoints As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__GATEWAY_ENDPOINTS_AS_MAP = eINSTANCE.getVpcBuilder_ec2_GatewayEndpointsAsMap();

		/**
		 * The meta object literal for the '<em><b>Max Azs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__MAX_AZS = eINSTANCE.getVpcBuilder_ec2_MaxAzs();

		/**
		 * The meta object literal for the '<em><b>Nat Gateway Provider With Nat Provider As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_AS_REFERENCE = eINSTANCE
				.getVpcBuilder_ec2_NatGatewayProviderWithNatProviderAsReference();

		/**
		 * The meta object literal for the '<em><b>Nat Gateways</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__NAT_GATEWAYS = eINSTANCE.getVpcBuilder_ec2_NatGateways();

		/**
		 * The meta object literal for the '<em><b>Nat Gateway Subnets With Subnet Selection As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_AS_REFERENCE = eINSTANCE
				.getVpcBuilder_ec2_NatGatewaySubnetsWithSubnetSelectionAsReference();

		/**
		 * The meta object literal for the '<em><b>Subnet Configuration As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__SUBNET_CONFIGURATION_AS_LIST = eINSTANCE
				.getVpcBuilder_ec2_SubnetConfigurationAsList();

		/**
		 * The meta object literal for the '<em><b>Vpn Connections As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__VPN_CONNECTIONS_AS_MAP = eINSTANCE.getVpcBuilder_ec2_VpnConnectionsAsMap();

		/**
		 * The meta object literal for the '<em><b>Vpn Gateway</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__VPN_GATEWAY = eINSTANCE.getVpcBuilder_ec2_VpnGateway();

		/**
		 * The meta object literal for the '<em><b>Vpn Gateway Asn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__VPN_GATEWAY_ASN = eINSTANCE.getVpcBuilder_ec2_VpnGatewayAsn();

		/**
		 * The meta object literal for the '<em><b>Vpn Route Propagation As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__VPN_ROUTE_PROPAGATION_AS_LIST = eINSTANCE
				.getVpcBuilder_ec2_VpnRoutePropagationAsList();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE.getVpcBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__VAR_NAME = eINSTANCE.getVpcBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__IDENTIFIER = eINSTANCE.getVpcBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE.getVpcBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '<em><b>Subnetbuilder ec2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VPC_BUILDER_EC2__SUBNETBUILDER_EC2 = eINSTANCE.getVpcBuilder_ec2_Subnetbuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Securitygroupbuilder ec2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VPC_BUILDER_EC2__SECURITYGROUPBUILDER_EC2 = eINSTANCE.getVpcBuilder_ec2_Securitygroupbuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Privatesubnetbuilder ec2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VPC_BUILDER_EC2__PRIVATESUBNETBUILDER_EC2 = eINSTANCE.getVpcBuilder_ec2_Privatesubnetbuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Publicsubnetbuilder ec2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VPC_BUILDER_EC2__PUBLICSUBNETBUILDER_EC2 = eINSTANCE.getVpcBuilder_ec2_Publicsubnetbuilder_ec2();

		/**
		 * The meta object literal for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.ServiceResourcesImpl <em>Service Resources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.ServiceResourcesImpl
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getServiceResources()
		 * @generated
		 */
		EClass SERVICE_RESOURCES = eINSTANCE.getServiceResources();

		/**
		 * The meta object literal for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.SubnetBuilder_ec2Impl <em>Subnet Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.SubnetBuilder_ec2Impl
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getSubnetBuilder_ec2()
		 * @generated
		 */
		EClass SUBNET_BUILDER_EC2 = eINSTANCE.getSubnetBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Availability Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_BUILDER_EC2__AVAILABILITY_ZONE = eINSTANCE.getSubnetBuilder_ec2_AvailabilityZone();

		/**
		 * The meta object literal for the '<em><b>Cidr Block</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_BUILDER_EC2__CIDR_BLOCK = eINSTANCE.getSubnetBuilder_ec2_CidrBlock();

		/**
		 * The meta object literal for the '<em><b>Vpc Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_BUILDER_EC2__VPC_ID = eINSTANCE.getSubnetBuilder_ec2_VpcId();

		/**
		 * The meta object literal for the '<em><b>Map Public Ip On Launch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH = eINSTANCE.getSubnetBuilder_ec2_MapPublicIpOnLaunch();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE.getSubnetBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_BUILDER_EC2__VAR_NAME = eINSTANCE.getSubnetBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_BUILDER_EC2__IDENTIFIER = eINSTANCE.getSubnetBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE.getSubnetBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '<em><b>Instancebuilder ec2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBNET_BUILDER_EC2__INSTANCEBUILDER_EC2 = eINSTANCE.getSubnetBuilder_ec2_Instancebuilder_ec2();

		/**
		 * The meta object literal for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.InstanceBuilder_ec2Impl <em>Instance Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.InstanceBuilder_ec2Impl
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getInstanceBuilder_ec2()
		 * @generated
		 */
		EClass INSTANCE_BUILDER_EC2 = eINSTANCE.getInstanceBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Instance Type With Instance Type As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_AS_REFERENCE = eINSTANCE
				.getInstanceBuilder_ec2_InstanceTypeWithInstanceTypeAsReference();

		/**
		 * The meta object literal for the '<em><b>Machine Image With IMachine Image As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_AS_REFERENCE = eINSTANCE
				.getInstanceBuilder_ec2_MachineImageWithIMachineImageAsReference();

		/**
		 * The meta object literal for the '<em><b>Vpc With IVpc As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__VPC_WITH_IVPC_AS_REFERENCE = eINSTANCE
				.getInstanceBuilder_ec2_VpcWithIVpcAsReference();

		/**
		 * The meta object literal for the '<em><b>Allow All Outbound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__ALLOW_ALL_OUTBOUND = eINSTANCE.getInstanceBuilder_ec2_AllowAllOutbound();

		/**
		 * The meta object literal for the '<em><b>Availability Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__AVAILABILITY_ZONE = eINSTANCE.getInstanceBuilder_ec2_AvailabilityZone();

		/**
		 * The meta object literal for the '<em><b>Block Devices As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__BLOCK_DEVICES_AS_LIST = eINSTANCE.getInstanceBuilder_ec2_BlockDevicesAsList();

		/**
		 * The meta object literal for the '<em><b>Instance Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__INSTANCE_NAME = eINSTANCE.getInstanceBuilder_ec2_InstanceName();

		/**
		 * The meta object literal for the '<em><b>Key Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__KEY_NAME = eINSTANCE.getInstanceBuilder_ec2_KeyName();

		/**
		 * The meta object literal for the '<em><b>Private Ip Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__PRIVATE_IP_ADDRESS = eINSTANCE.getInstanceBuilder_ec2_PrivateIpAddress();

		/**
		 * The meta object literal for the '<em><b>Resource Signal Timeout With Duration As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_AS_REFERENCE = eINSTANCE
				.getInstanceBuilder_ec2_ResourceSignalTimeoutWithDurationAsReference();

		/**
		 * The meta object literal for the '<em><b>Role With IRole As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__ROLE_WITH_IROLE_AS_REFERENCE = eINSTANCE
				.getInstanceBuilder_ec2_RoleWithIRoleAsReference();

		/**
		 * The meta object literal for the '<em><b>Security Group With ISecurity Group As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_AS_REFERENCE = eINSTANCE
				.getInstanceBuilder_ec2_SecurityGroupWithISecurityGroupAsReference();

		/**
		 * The meta object literal for the '<em><b>Source Dest Check</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__SOURCE_DEST_CHECK = eINSTANCE.getInstanceBuilder_ec2_SourceDestCheck();

		/**
		 * The meta object literal for the '<em><b>User Data With User Data As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_AS_REFERENCE = eINSTANCE
				.getInstanceBuilder_ec2_UserDataWithUserDataAsReference();

		/**
		 * The meta object literal for the '<em><b>Vpc Subnets With Subnet Selection As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__VPC_SUBNETS_WITH_SUBNET_SELECTION_AS_REFERENCE = eINSTANCE
				.getInstanceBuilder_ec2_VpcSubnetsWithSubnetSelectionAsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE.getInstanceBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__VAR_NAME = eINSTANCE.getInstanceBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__IDENTIFIER = eINSTANCE.getInstanceBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE.getInstanceBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.SecurityGroupBuilder_ec2Impl <em>Security Group Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.SecurityGroupBuilder_ec2Impl
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getSecurityGroupBuilder_ec2()
		 * @generated
		 */
		EClass SECURITY_GROUP_BUILDER_EC2 = eINSTANCE.getSecurityGroupBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Vpc With IVpc As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP_BUILDER_EC2__VPC_WITH_IVPC_AS_REFERENCE = eINSTANCE
				.getSecurityGroupBuilder_ec2_VpcWithIVpcAsReference();

		/**
		 * The meta object literal for the '<em><b>Allow All Outbound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP_BUILDER_EC2__ALLOW_ALL_OUTBOUND = eINSTANCE
				.getSecurityGroupBuilder_ec2_AllowAllOutbound();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP_BUILDER_EC2__DESCRIPTION = eINSTANCE.getSecurityGroupBuilder_ec2_Description();

		/**
		 * The meta object literal for the '<em><b>Security Group Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP_BUILDER_EC2__SECURITY_GROUP_NAME = eINSTANCE
				.getSecurityGroupBuilder_ec2_SecurityGroupName();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getSecurityGroupBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP_BUILDER_EC2__VAR_NAME = eINSTANCE.getSecurityGroupBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP_BUILDER_EC2__IDENTIFIER = eINSTANCE.getSecurityGroupBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE.getSecurityGroupBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.PortBuilder_ec2Impl <em>Port Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.PortBuilder_ec2Impl
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getPortBuilder_ec2()
		 * @generated
		 */
		EClass PORT_BUILDER_EC2 = eINSTANCE.getPortBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_BUILDER_EC2__PROTOCOL = eINSTANCE.getPortBuilder_ec2_Protocol();

		/**
		 * The meta object literal for the '<em><b>String Representation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_BUILDER_EC2__STRING_REPRESENTATION = eINSTANCE.getPortBuilder_ec2_StringRepresentation();

		/**
		 * The meta object literal for the '<em><b>From Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_BUILDER_EC2__FROM_PORT = eINSTANCE.getPortBuilder_ec2_FromPort();

		/**
		 * The meta object literal for the '<em><b>To Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_BUILDER_EC2__TO_PORT = eINSTANCE.getPortBuilder_ec2_ToPort();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE.getPortBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_BUILDER_EC2__VAR_NAME = eINSTANCE.getPortBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_BUILDER_EC2__IDENTIFIER = eINSTANCE.getPortBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE.getPortBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.PrivateSubnetBuilder_ec2Impl <em>Private Subnet Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.PrivateSubnetBuilder_ec2Impl
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getPrivateSubnetBuilder_ec2()
		 * @generated
		 */
		EClass PRIVATE_SUBNET_BUILDER_EC2 = eINSTANCE.getPrivateSubnetBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Availability Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_SUBNET_BUILDER_EC2__AVAILABILITY_ZONE = eINSTANCE
				.getPrivateSubnetBuilder_ec2_AvailabilityZone();

		/**
		 * The meta object literal for the '<em><b>Cidr Block</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_SUBNET_BUILDER_EC2__CIDR_BLOCK = eINSTANCE.getPrivateSubnetBuilder_ec2_CidrBlock();

		/**
		 * The meta object literal for the '<em><b>Vpc Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_SUBNET_BUILDER_EC2__VPC_ID = eINSTANCE.getPrivateSubnetBuilder_ec2_VpcId();

		/**
		 * The meta object literal for the '<em><b>Map Public Ip On Launch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_SUBNET_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH = eINSTANCE
				.getPrivateSubnetBuilder_ec2_MapPublicIpOnLaunch();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_SUBNET_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getPrivateSubnetBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_SUBNET_BUILDER_EC2__VAR_NAME = eINSTANCE.getPrivateSubnetBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_SUBNET_BUILDER_EC2__IDENTIFIER = eINSTANCE.getPrivateSubnetBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_SUBNET_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE.getPrivateSubnetBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '<em><b>Instancebuilder ec2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVATE_SUBNET_BUILDER_EC2__INSTANCEBUILDER_EC2 = eINSTANCE
				.getPrivateSubnetBuilder_ec2_Instancebuilder_ec2();

		/**
		 * The meta object literal for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.PublicSubnetBuilder_ec2Impl <em>Public Subnet Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.PublicSubnetBuilder_ec2Impl
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getPublicSubnetBuilder_ec2()
		 * @generated
		 */
		EClass PUBLIC_SUBNET_BUILDER_EC2 = eINSTANCE.getPublicSubnetBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Availability Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SUBNET_BUILDER_EC2__AVAILABILITY_ZONE = eINSTANCE
				.getPublicSubnetBuilder_ec2_AvailabilityZone();

		/**
		 * The meta object literal for the '<em><b>Cidr Block</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SUBNET_BUILDER_EC2__CIDR_BLOCK = eINSTANCE.getPublicSubnetBuilder_ec2_CidrBlock();

		/**
		 * The meta object literal for the '<em><b>Vpc Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SUBNET_BUILDER_EC2__VPC_ID = eINSTANCE.getPublicSubnetBuilder_ec2_VpcId();

		/**
		 * The meta object literal for the '<em><b>Map Public Ip On Launch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SUBNET_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH = eINSTANCE
				.getPublicSubnetBuilder_ec2_MapPublicIpOnLaunch();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SUBNET_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getPublicSubnetBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SUBNET_BUILDER_EC2__VAR_NAME = eINSTANCE.getPublicSubnetBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SUBNET_BUILDER_EC2__IDENTIFIER = eINSTANCE.getPublicSubnetBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SUBNET_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE.getPublicSubnetBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '<em><b>Instancebuilder ec2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLIC_SUBNET_BUILDER_EC2__INSTANCEBUILDER_EC2 = eINSTANCE
				.getPublicSubnetBuilder_ec2_Instancebuilder_ec2();

		/**
		 * The meta object literal for the '{@link com.amazon.aws.workbench.model.awsworkbench.DefaultInstanceTenancy <em>Default Instance Tenancy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.amazon.aws.workbench.model.awsworkbench.DefaultInstanceTenancy
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getDefaultInstanceTenancy()
		 * @generated
		 */
		EEnum DEFAULT_INSTANCE_TENANCY = eINSTANCE.getDefaultInstanceTenancy();

		/**
		 * The meta object literal for the '{@link com.amazon.aws.workbench.model.awsworkbench.Protocol <em>Protocol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.amazon.aws.workbench.model.awsworkbench.Protocol
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getProtocol()
		 * @generated
		 */
		EEnum PROTOCOL = eINSTANCE.getProtocol();

	}

} //AwsworkbenchPackage
