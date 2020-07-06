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
	 * The number of structural features of the '<em>Vpc Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2_FEATURE_COUNT = SERVICE_RESOURCES_FEATURE_COUNT + 19;

	/**
	 * The number of operations of the '<em>Vpc Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2_OPERATION_COUNT = SERVICE_RESOURCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.DefaultInstanceTenancy <em>Default Instance Tenancy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.DefaultInstanceTenancy
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getDefaultInstanceTenancy()
	 * @generated
	 */
	int DEFAULT_INSTANCE_TENANCY = 4;

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
	 * Returns the meta object for class '{@link com.amazon.aws.workbench.model.awsworkbench.ServiceResources <em>Service Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Resources</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ServiceResources
	 * @generated
	 */
	EClass getServiceResources();

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
		 * The meta object literal for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.ServiceResourcesImpl <em>Service Resources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.ServiceResourcesImpl
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getServiceResources()
		 * @generated
		 */
		EClass SERVICE_RESOURCES = eINSTANCE.getServiceResources();

		/**
		 * The meta object literal for the '{@link com.amazon.aws.workbench.model.awsworkbench.DefaultInstanceTenancy <em>Default Instance Tenancy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.amazon.aws.workbench.model.awsworkbench.DefaultInstanceTenancy
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getDefaultInstanceTenancy()
		 * @generated
		 */
		EEnum DEFAULT_INSTANCE_TENANCY = eINSTANCE.getDefaultInstanceTenancy();

	}

} //AwsworkbenchPackage
