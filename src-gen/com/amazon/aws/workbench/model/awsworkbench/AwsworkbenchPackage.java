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
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.ServiceResourcesImpl <em>Service Resources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.ServiceResourcesImpl
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getServiceResources()
	 * @generated
	 */
	int SERVICE_RESOURCES = 0;

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
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilder_coreImpl <em>App Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilder_coreImpl
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getAppBuilder_core()
	 * @generated
	 */
	int APP_BUILDER_CORE = 1;

	/**
	 * The feature id for the '<em><b>Auto Synth java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE__AUTO_SYNTH_JAVA_LANG_BOOLEAN_ = 0;

	/**
	 * The feature id for the '<em><b>Context java lang String java lang String As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE__CONTEXT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP = 1;

	/**
	 * The feature id for the '<em><b>Outdir java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE__OUTDIR_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Runtime Info java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE__RUNTIME_INFO_JAVA_LANG_BOOLEAN_ = 3;

	/**
	 * The feature id for the '<em><b>Stack Traces java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE__STACK_TRACES_JAVA_LANG_BOOLEAN_ = 4;

	/**
	 * The feature id for the '<em><b>Tree Metadata java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE__TREE_METADATA_JAVA_LANG_BOOLEAN_ = 5;

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
	 * The feature id for the '<em><b>Environmentbuilder core</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE__ENVIRONMENTBUILDER_CORE = 10;

	/**
	 * The feature id for the '<em><b>Defaultstacksynthesizerbuilder core</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE__DEFAULTSTACKSYNTHESIZERBUILDER_CORE = 11;

	/**
	 * The feature id for the '<em><b>Stackbuilder core</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE__STACKBUILDER_CORE = 12;

	/**
	 * The number of structural features of the '<em>App Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>App Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.DefaultStackSynthesizerBuilder_coreImpl <em>Default Stack Synthesizer Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.DefaultStackSynthesizerBuilder_coreImpl
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getDefaultStackSynthesizerBuilder_core()
	 * @generated
	 */
	int DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE = 2;

	/**
	 * The feature id for the '<em><b>Asset Publishing External Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__ASSET_PUBLISHING_EXTERNAL_ID_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Asset Publishing Role Arn java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__ASSET_PUBLISHING_ROLE_ARN_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Cloud Formation Execution Role java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__CLOUD_FORMATION_EXECUTION_ROLE_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Deploy Role Arn java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__DEPLOY_ROLE_ARN_JAVA_LANG_STRING_ = 3;

	/**
	 * The feature id for the '<em><b>File Assets Bucket Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__FILE_ASSETS_BUCKET_NAME_JAVA_LANG_STRING_ = 4;

	/**
	 * The feature id for the '<em><b>Image Assets Repository Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__IMAGE_ASSETS_REPOSITORY_NAME_JAVA_LANG_STRING_ = 5;

	/**
	 * The feature id for the '<em><b>Qualifier java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__QUALIFIER_JAVA_LANG_STRING_ = 6;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__GENERATED_CLASS_NAME = 7;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__VAR_NAME = 8;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__IDENTIFIER = 9;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__ADDITIONAL_CODE = 10;

	/**
	 * The number of structural features of the '<em>Default Stack Synthesizer Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Default Stack Synthesizer Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.EnvironmentBuilder_coreImpl <em>Environment Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.EnvironmentBuilder_coreImpl
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getEnvironmentBuilder_core()
	 * @generated
	 */
	int ENVIRONMENT_BUILDER_CORE = 3;

	/**
	 * The feature id for the '<em><b>Account java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_BUILDER_CORE__ACCOUNT_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Region java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_BUILDER_CORE__REGION_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_BUILDER_CORE__GENERATED_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_BUILDER_CORE__VAR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_BUILDER_CORE__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_BUILDER_CORE__ADDITIONAL_CODE = 5;

	/**
	 * The number of structural features of the '<em>Environment Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_BUILDER_CORE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Environment Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.FlowLogOptionsBuilder_ec2Impl <em>Flow Log Options Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.FlowLogOptionsBuilder_ec2Impl
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getFlowLogOptionsBuilder_ec2()
	 * @generated
	 */
	int FLOW_LOG_OPTIONS_BUILDER_EC2 = 4;

	/**
	 * The feature id for the '<em><b>Destination With Flow Log Destination software amazon awscdk services ec2 Flow Log Destination As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_OPTIONS_BUILDER_EC2__DESTINATION_WITH_FLOW_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Traffic Type software amazon awscdk services ec2 Flow Log Traffic Type </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_OPTIONS_BUILDER_EC2__TRAFFIC_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_TRAFFIC_TYPE_ = 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_OPTIONS_BUILDER_EC2__VAR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_OPTIONS_BUILDER_EC2__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = 5;

	/**
	 * The number of structural features of the '<em>Flow Log Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_OPTIONS_BUILDER_EC2_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Flow Log Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_OPTIONS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.StackBuilder_coreImpl <em>Stack Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.StackBuilder_coreImpl
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getStackBuilder_core()
	 * @generated
	 */
	int STACK_BUILDER_CORE = 5;

	/**
	 * The feature id for the '<em><b>Description java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_CORE__DESCRIPTION_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Env With Environment software amazon awscdk core Environment As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_CORE__ENV_WITH_ENVIRONMENT_SOFTWARE_AMAZON_AWSCDK_CORE_ENVIRONMENT_AS_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Stack Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_CORE__STACK_NAME_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Synthesizer With IStack Synthesizer software amazon awscdk core IStack Synthesizer As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_CORE__SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_SOFTWARE_AMAZON_AWSCDK_CORE_ISTACK_SYNTHESIZER_AS_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Tags java lang String java lang String As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_CORE__TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP = 4;

	/**
	 * The feature id for the '<em><b>Termination Protection java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_CORE__TERMINATION_PROTECTION_JAVA_LANG_BOOLEAN_ = 5;

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
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl <em>Vpc Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getVpcBuilder_ec2()
	 * @generated
	 */
	int VPC_BUILDER_EC2 = 6;

	/**
	 * The feature id for the '<em><b>Cidr java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__CIDR_JAVA_LANG_STRING_ = SERVICE_RESOURCES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Instance Tenancy software amazon awscdk services ec2 Default Instance Tenancy </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__DEFAULT_INSTANCE_TENANCY_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_DEFAULT_INSTANCE_TENANCY_ = SERVICE_RESOURCES_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Enable Dns Hostnames java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__ENABLE_DNS_HOSTNAMES_JAVA_LANG_BOOLEAN_ = SERVICE_RESOURCES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enable Dns Support java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__ENABLE_DNS_SUPPORT_JAVA_LANG_BOOLEAN_ = SERVICE_RESOURCES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Flow Logs java lang String software amazon awscdk services ec2 Flow Log Options As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__FLOW_LOGS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_OPTIONS_AS_MAP = SERVICE_RESOURCES_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Gateway Endpoints java lang String software amazon awscdk services ec2 Gateway Vpc Endpoint Options As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__GATEWAY_ENDPOINTS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_GATEWAY_VPC_ENDPOINT_OPTIONS_AS_MAP = SERVICE_RESOURCES_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Max Azs java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__MAX_AZS_JAVA_LANG_NUMBER_ = SERVICE_RESOURCES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Nat Gateway Provider With Nat Provider software amazon awscdk services ec2 Nat Provider As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_NAT_PROVIDER_AS_REFERENCE = SERVICE_RESOURCES_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Nat Gateways java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__NAT_GATEWAYS_JAVA_LANG_NUMBER_ = SERVICE_RESOURCES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Nat Gateway Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE = SERVICE_RESOURCES_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Subnet Configuration software amazon awscdk services ec2 Subnet Configuration As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__SUBNET_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_CONFIGURATION_AS_LIST = SERVICE_RESOURCES_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Vpn Connections java lang String software amazon awscdk services ec2 Vpn Connection Options As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__VPN_CONNECTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_CONNECTION_OPTIONS_AS_MAP = SERVICE_RESOURCES_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Vpn Gateway java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__VPN_GATEWAY_JAVA_LANG_BOOLEAN_ = SERVICE_RESOURCES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Vpn Gateway Asn java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__VPN_GATEWAY_ASN_JAVA_LANG_NUMBER_ = SERVICE_RESOURCES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Vpn Route Propagation software amazon awscdk services ec2 Subnet Selection As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__VPN_ROUTE_PROPAGATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST = SERVICE_RESOURCES_FEATURE_COUNT
			+ 14;

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
	 * The feature id for the '<em><b>Subnetselectionbuilder ec2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__SUBNETSELECTIONBUILDER_EC2 = SERVICE_RESOURCES_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Subnetconfigurationbuilder ec2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__SUBNETCONFIGURATIONBUILDER_EC2 = SERVICE_RESOURCES_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Vpntunneloptionbuilder ec2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__VPNTUNNELOPTIONBUILDER_EC2 = SERVICE_RESOURCES_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Vpnconnectionoptionsbuilder ec2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__VPNCONNECTIONOPTIONSBUILDER_EC2 = SERVICE_RESOURCES_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>Vpc Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2_FEATURE_COUNT = SERVICE_RESOURCES_FEATURE_COUNT + 24;

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
	int SUBNET_BUILDER_EC2 = 7;

	/**
	 * The feature id for the '<em><b>Availability Zone java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_ = SERVICE_RESOURCES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cidr Block java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_BUILDER_EC2__CIDR_BLOCK_JAVA_LANG_STRING_ = SERVICE_RESOURCES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vpc Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_ = SERVICE_RESOURCES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Map Public Ip On Launch java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH_JAVA_LANG_BOOLEAN_ = SERVICE_RESOURCES_FEATURE_COUNT + 3;

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
	 * The number of structural features of the '<em>Subnet Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_BUILDER_EC2_FEATURE_COUNT = SERVICE_RESOURCES_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Subnet Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_BUILDER_EC2_OPERATION_COUNT = SERVICE_RESOURCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.SubnetSelectionBuilder_ec2Impl <em>Subnet Selection Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.SubnetSelectionBuilder_ec2Impl
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getSubnetSelectionBuilder_ec2()
	 * @generated
	 */
	int SUBNET_SELECTION_BUILDER_EC2 = 8;

	/**
	 * The feature id for the '<em><b>Availability Zones java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_SELECTION_BUILDER_EC2__AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST = SERVICE_RESOURCES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>One Per Az java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_SELECTION_BUILDER_EC2__ONE_PER_AZ_JAVA_LANG_BOOLEAN_ = SERVICE_RESOURCES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subnet Group Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_SELECTION_BUILDER_EC2__SUBNET_GROUP_NAME_JAVA_LANG_STRING_ = SERVICE_RESOURCES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subnet Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_SELECTION_BUILDER_EC2__SUBNET_NAME_JAVA_LANG_STRING_ = SERVICE_RESOURCES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Subnets software amazon awscdk services ec2 ISubnet As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_SELECTION_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_LIST = SERVICE_RESOURCES_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Subnet Type software amazon awscdk services ec2 Subnet Type </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_SELECTION_BUILDER_EC2__SUBNET_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_TYPE_ = SERVICE_RESOURCES_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_SELECTION_BUILDER_EC2__GENERATED_CLASS_NAME = SERVICE_RESOURCES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_SELECTION_BUILDER_EC2__VAR_NAME = SERVICE_RESOURCES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_SELECTION_BUILDER_EC2__IDENTIFIER = SERVICE_RESOURCES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_SELECTION_BUILDER_EC2__ADDITIONAL_CODE = SERVICE_RESOURCES_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Subnet Selection Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_SELECTION_BUILDER_EC2_FEATURE_COUNT = SERVICE_RESOURCES_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Subnet Selection Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_SELECTION_BUILDER_EC2_OPERATION_COUNT = SERVICE_RESOURCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.SubnetConfigurationBuilder_ec2Impl <em>Subnet Configuration Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.SubnetConfigurationBuilder_ec2Impl
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getSubnetConfigurationBuilder_ec2()
	 * @generated
	 */
	int SUBNET_CONFIGURATION_BUILDER_EC2 = 9;

	/**
	 * The feature id for the '<em><b>Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_CONFIGURATION_BUILDER_EC2__NAME_JAVA_LANG_STRING_ = SERVICE_RESOURCES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subnet Type software amazon awscdk services ec2 Subnet Type </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_CONFIGURATION_BUILDER_EC2__SUBNET_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_TYPE_ = SERVICE_RESOURCES_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Cidr Mask java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_CONFIGURATION_BUILDER_EC2__CIDR_MASK_JAVA_LANG_NUMBER_ = SERVICE_RESOURCES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reserved java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_CONFIGURATION_BUILDER_EC2__RESERVED_JAVA_LANG_BOOLEAN_ = SERVICE_RESOURCES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_CONFIGURATION_BUILDER_EC2__GENERATED_CLASS_NAME = SERVICE_RESOURCES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_CONFIGURATION_BUILDER_EC2__VAR_NAME = SERVICE_RESOURCES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_CONFIGURATION_BUILDER_EC2__IDENTIFIER = SERVICE_RESOURCES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_CONFIGURATION_BUILDER_EC2__ADDITIONAL_CODE = SERVICE_RESOURCES_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Subnet Configuration Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_CONFIGURATION_BUILDER_EC2_FEATURE_COUNT = SERVICE_RESOURCES_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Subnet Configuration Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_CONFIGURATION_BUILDER_EC2_OPERATION_COUNT = SERVICE_RESOURCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpnConnectionOptionsBuilder_ec2Impl <em>Vpn Connection Options Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.VpnConnectionOptionsBuilder_ec2Impl
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getVpnConnectionOptionsBuilder_ec2()
	 * @generated
	 */
	int VPN_CONNECTION_OPTIONS_BUILDER_EC2 = 10;

	/**
	 * The feature id for the '<em><b>Ip java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_OPTIONS_BUILDER_EC2__IP_JAVA_LANG_STRING_ = SERVICE_RESOURCES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Asn java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_OPTIONS_BUILDER_EC2__ASN_JAVA_LANG_NUMBER_ = SERVICE_RESOURCES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Static Routes java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_OPTIONS_BUILDER_EC2__STATIC_ROUTES_JAVA_LANG_STRING_AS_LIST = SERVICE_RESOURCES_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Tunnel Options software amazon awscdk services ec2 Vpn Tunnel Option As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_OPTIONS_BUILDER_EC2__TUNNEL_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_TUNNEL_OPTION_AS_LIST = SERVICE_RESOURCES_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = SERVICE_RESOURCES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_OPTIONS_BUILDER_EC2__VAR_NAME = SERVICE_RESOURCES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_OPTIONS_BUILDER_EC2__IDENTIFIER = SERVICE_RESOURCES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = SERVICE_RESOURCES_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Vpn Connection Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_OPTIONS_BUILDER_EC2_FEATURE_COUNT = SERVICE_RESOURCES_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Vpn Connection Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_OPTIONS_BUILDER_EC2_OPERATION_COUNT = SERVICE_RESOURCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpnTunnelOptionBuilder_ec2Impl <em>Vpn Tunnel Option Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.VpnTunnelOptionBuilder_ec2Impl
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getVpnTunnelOptionBuilder_ec2()
	 * @generated
	 */
	int VPN_TUNNEL_OPTION_BUILDER_EC2 = 11;

	/**
	 * The feature id for the '<em><b>Pre Shared Key java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_TUNNEL_OPTION_BUILDER_EC2__PRE_SHARED_KEY_JAVA_LANG_STRING_ = SERVICE_RESOURCES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tunnel Inside Cidr java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_TUNNEL_OPTION_BUILDER_EC2__TUNNEL_INSIDE_CIDR_JAVA_LANG_STRING_ = SERVICE_RESOURCES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_TUNNEL_OPTION_BUILDER_EC2__GENERATED_CLASS_NAME = SERVICE_RESOURCES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_TUNNEL_OPTION_BUILDER_EC2__VAR_NAME = SERVICE_RESOURCES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_TUNNEL_OPTION_BUILDER_EC2__IDENTIFIER = SERVICE_RESOURCES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_TUNNEL_OPTION_BUILDER_EC2__ADDITIONAL_CODE = SERVICE_RESOURCES_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Vpn Tunnel Option Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_TUNNEL_OPTION_BUILDER_EC2_FEATURE_COUNT = SERVICE_RESOURCES_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Vpn Tunnel Option Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_TUNNEL_OPTION_BUILDER_EC2_OPERATION_COUNT = SERVICE_RESOURCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.DefaultInstanceTenancy <em>Default Instance Tenancy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.DefaultInstanceTenancy
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getDefaultInstanceTenancy()
	 * @generated
	 */
	int DEFAULT_INSTANCE_TENANCY = 12;

	/**
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetType <em>Subnet Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetType
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getSubnetType()
	 * @generated
	 */
	int SUBNET_TYPE = 13;

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
	 * Returns the meta object for class '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core <em>App Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Builder core</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core
	 * @generated
	 */
	EClass getAppBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getAutoSynth_java_lang_Boolean_ <em>Auto Synth java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Synth java lang Boolean </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getAutoSynth_java_lang_Boolean_()
	 * @see #getAppBuilder_core()
	 * @generated
	 */
	EAttribute getAppBuilder_core_AutoSynth_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getContext_java_lang_String__java_lang_String_AsMap <em>Context java lang String java lang String As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context java lang String java lang String As Map</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getContext_java_lang_String__java_lang_String_AsMap()
	 * @see #getAppBuilder_core()
	 * @generated
	 */
	EAttribute getAppBuilder_core_Context_java_lang_String__java_lang_String_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getOutdir_java_lang_String_ <em>Outdir java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outdir java lang String </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getOutdir_java_lang_String_()
	 * @see #getAppBuilder_core()
	 * @generated
	 */
	EAttribute getAppBuilder_core_Outdir_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getRuntimeInfo_java_lang_Boolean_ <em>Runtime Info java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtime Info java lang Boolean </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getRuntimeInfo_java_lang_Boolean_()
	 * @see #getAppBuilder_core()
	 * @generated
	 */
	EAttribute getAppBuilder_core_RuntimeInfo_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getStackTraces_java_lang_Boolean_ <em>Stack Traces java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stack Traces java lang Boolean </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getStackTraces_java_lang_Boolean_()
	 * @see #getAppBuilder_core()
	 * @generated
	 */
	EAttribute getAppBuilder_core_StackTraces_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getTreeMetadata_java_lang_Boolean_ <em>Tree Metadata java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tree Metadata java lang Boolean </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getTreeMetadata_java_lang_Boolean_()
	 * @see #getAppBuilder_core()
	 * @generated
	 */
	EAttribute getAppBuilder_core_TreeMetadata_java_lang_Boolean_();

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
	 * Returns the meta object for the containment reference list '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getEnvironmentbuilder_core <em>Environmentbuilder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environmentbuilder core</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getEnvironmentbuilder_core()
	 * @see #getAppBuilder_core()
	 * @generated
	 */
	EReference getAppBuilder_core_Environmentbuilder_core();

	/**
	 * Returns the meta object for the containment reference list '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getDefaultstacksynthesizerbuilder_core <em>Defaultstacksynthesizerbuilder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defaultstacksynthesizerbuilder core</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core#getDefaultstacksynthesizerbuilder_core()
	 * @see #getAppBuilder_core()
	 * @generated
	 */
	EReference getAppBuilder_core_Defaultstacksynthesizerbuilder_core();

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
	 * Returns the meta object for class '{@link com.amazon.aws.workbench.model.awsworkbench.DefaultStackSynthesizerBuilder_core <em>Default Stack Synthesizer Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Stack Synthesizer Builder core</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.DefaultStackSynthesizerBuilder_core
	 * @generated
	 */
	EClass getDefaultStackSynthesizerBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.DefaultStackSynthesizerBuilder_core#getAssetPublishingExternalId_java_lang_String_ <em>Asset Publishing External Id java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asset Publishing External Id java lang String </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.DefaultStackSynthesizerBuilder_core#getAssetPublishingExternalId_java_lang_String_()
	 * @see #getDefaultStackSynthesizerBuilder_core()
	 * @generated
	 */
	EAttribute getDefaultStackSynthesizerBuilder_core_AssetPublishingExternalId_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.DefaultStackSynthesizerBuilder_core#getAssetPublishingRoleArn_java_lang_String_ <em>Asset Publishing Role Arn java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asset Publishing Role Arn java lang String </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.DefaultStackSynthesizerBuilder_core#getAssetPublishingRoleArn_java_lang_String_()
	 * @see #getDefaultStackSynthesizerBuilder_core()
	 * @generated
	 */
	EAttribute getDefaultStackSynthesizerBuilder_core_AssetPublishingRoleArn_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.DefaultStackSynthesizerBuilder_core#getCloudFormationExecutionRole_java_lang_String_ <em>Cloud Formation Execution Role java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloud Formation Execution Role java lang String </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.DefaultStackSynthesizerBuilder_core#getCloudFormationExecutionRole_java_lang_String_()
	 * @see #getDefaultStackSynthesizerBuilder_core()
	 * @generated
	 */
	EAttribute getDefaultStackSynthesizerBuilder_core_CloudFormationExecutionRole_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.DefaultStackSynthesizerBuilder_core#getDeployRoleArn_java_lang_String_ <em>Deploy Role Arn java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deploy Role Arn java lang String </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.DefaultStackSynthesizerBuilder_core#getDeployRoleArn_java_lang_String_()
	 * @see #getDefaultStackSynthesizerBuilder_core()
	 * @generated
	 */
	EAttribute getDefaultStackSynthesizerBuilder_core_DeployRoleArn_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.DefaultStackSynthesizerBuilder_core#getFileAssetsBucketName_java_lang_String_ <em>File Assets Bucket Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Assets Bucket Name java lang String </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.DefaultStackSynthesizerBuilder_core#getFileAssetsBucketName_java_lang_String_()
	 * @see #getDefaultStackSynthesizerBuilder_core()
	 * @generated
	 */
	EAttribute getDefaultStackSynthesizerBuilder_core_FileAssetsBucketName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.DefaultStackSynthesizerBuilder_core#getImageAssetsRepositoryName_java_lang_String_ <em>Image Assets Repository Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Assets Repository Name java lang String </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.DefaultStackSynthesizerBuilder_core#getImageAssetsRepositoryName_java_lang_String_()
	 * @see #getDefaultStackSynthesizerBuilder_core()
	 * @generated
	 */
	EAttribute getDefaultStackSynthesizerBuilder_core_ImageAssetsRepositoryName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.DefaultStackSynthesizerBuilder_core#getQualifier_java_lang_String_ <em>Qualifier java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifier java lang String </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.DefaultStackSynthesizerBuilder_core#getQualifier_java_lang_String_()
	 * @see #getDefaultStackSynthesizerBuilder_core()
	 * @generated
	 */
	EAttribute getDefaultStackSynthesizerBuilder_core_Qualifier_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.DefaultStackSynthesizerBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.DefaultStackSynthesizerBuilder_core#getGeneratedClassName()
	 * @see #getDefaultStackSynthesizerBuilder_core()
	 * @generated
	 */
	EAttribute getDefaultStackSynthesizerBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.DefaultStackSynthesizerBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.DefaultStackSynthesizerBuilder_core#getVarName()
	 * @see #getDefaultStackSynthesizerBuilder_core()
	 * @generated
	 */
	EAttribute getDefaultStackSynthesizerBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.DefaultStackSynthesizerBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.DefaultStackSynthesizerBuilder_core#getIdentifier()
	 * @see #getDefaultStackSynthesizerBuilder_core()
	 * @generated
	 */
	EAttribute getDefaultStackSynthesizerBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.DefaultStackSynthesizerBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.DefaultStackSynthesizerBuilder_core#getAdditionalCode()
	 * @see #getDefaultStackSynthesizerBuilder_core()
	 * @generated
	 */
	EAttribute getDefaultStackSynthesizerBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link com.amazon.aws.workbench.model.awsworkbench.EnvironmentBuilder_core <em>Environment Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Builder core</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.EnvironmentBuilder_core
	 * @generated
	 */
	EClass getEnvironmentBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.EnvironmentBuilder_core#getAccount_java_lang_String_ <em>Account java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account java lang String </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.EnvironmentBuilder_core#getAccount_java_lang_String_()
	 * @see #getEnvironmentBuilder_core()
	 * @generated
	 */
	EAttribute getEnvironmentBuilder_core_Account_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.EnvironmentBuilder_core#getRegion_java_lang_String_ <em>Region java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region java lang String </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.EnvironmentBuilder_core#getRegion_java_lang_String_()
	 * @see #getEnvironmentBuilder_core()
	 * @generated
	 */
	EAttribute getEnvironmentBuilder_core_Region_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.EnvironmentBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.EnvironmentBuilder_core#getGeneratedClassName()
	 * @see #getEnvironmentBuilder_core()
	 * @generated
	 */
	EAttribute getEnvironmentBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.EnvironmentBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.EnvironmentBuilder_core#getVarName()
	 * @see #getEnvironmentBuilder_core()
	 * @generated
	 */
	EAttribute getEnvironmentBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.EnvironmentBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.EnvironmentBuilder_core#getIdentifier()
	 * @see #getEnvironmentBuilder_core()
	 * @generated
	 */
	EAttribute getEnvironmentBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.EnvironmentBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.EnvironmentBuilder_core#getAdditionalCode()
	 * @see #getEnvironmentBuilder_core()
	 * @generated
	 */
	EAttribute getEnvironmentBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link com.amazon.aws.workbench.model.awsworkbench.FlowLogOptionsBuilder_ec2 <em>Flow Log Options Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Log Options Builder ec2</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.FlowLogOptionsBuilder_ec2
	 * @generated
	 */
	EClass getFlowLogOptionsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.FlowLogOptionsBuilder_ec2#getDestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference <em>Destination With Flow Log Destination software amazon awscdk services ec2 Flow Log Destination As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination With Flow Log Destination software amazon awscdk services ec2 Flow Log Destination As Reference</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.FlowLogOptionsBuilder_ec2#getDestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference()
	 * @see #getFlowLogOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogOptionsBuilder_ec2_DestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.FlowLogOptionsBuilder_ec2#getTrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_ <em>Traffic Type software amazon awscdk services ec2 Flow Log Traffic Type </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Traffic Type software amazon awscdk services ec2 Flow Log Traffic Type </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.FlowLogOptionsBuilder_ec2#getTrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_()
	 * @see #getFlowLogOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogOptionsBuilder_ec2_TrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.FlowLogOptionsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.FlowLogOptionsBuilder_ec2#getGeneratedClassName()
	 * @see #getFlowLogOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogOptionsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.FlowLogOptionsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.FlowLogOptionsBuilder_ec2#getVarName()
	 * @see #getFlowLogOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogOptionsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.FlowLogOptionsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.FlowLogOptionsBuilder_ec2#getIdentifier()
	 * @see #getFlowLogOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogOptionsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.FlowLogOptionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.FlowLogOptionsBuilder_ec2#getAdditionalCode()
	 * @see #getFlowLogOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogOptionsBuilder_ec2_AdditionalCode();

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
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getDescription_java_lang_String_ <em>Description java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description java lang String </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getDescription_java_lang_String_()
	 * @see #getStackBuilder_core()
	 * @generated
	 */
	EAttribute getStackBuilder_core_Description_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getEnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference <em>Env With Environment software amazon awscdk core Environment As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Env With Environment software amazon awscdk core Environment As Reference</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getEnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference()
	 * @see #getStackBuilder_core()
	 * @generated
	 */
	EAttribute getStackBuilder_core_EnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getStackName_java_lang_String_ <em>Stack Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stack Name java lang String </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getStackName_java_lang_String_()
	 * @see #getStackBuilder_core()
	 * @generated
	 */
	EAttribute getStackBuilder_core_StackName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getSynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference <em>Synthesizer With IStack Synthesizer software amazon awscdk core IStack Synthesizer As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synthesizer With IStack Synthesizer software amazon awscdk core IStack Synthesizer As Reference</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getSynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference()
	 * @see #getStackBuilder_core()
	 * @generated
	 */
	EAttribute getStackBuilder_core_SynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getTags_java_lang_String__java_lang_String_AsMap <em>Tags java lang String java lang String As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tags java lang String java lang String As Map</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getTags_java_lang_String__java_lang_String_AsMap()
	 * @see #getStackBuilder_core()
	 * @generated
	 */
	EAttribute getStackBuilder_core_Tags_java_lang_String__java_lang_String_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getTerminationProtection_java_lang_Boolean_ <em>Termination Protection java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Termination Protection java lang Boolean </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getTerminationProtection_java_lang_Boolean_()
	 * @see #getStackBuilder_core()
	 * @generated
	 */
	EAttribute getStackBuilder_core_TerminationProtection_java_lang_Boolean_();

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
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getCidr_java_lang_String_ <em>Cidr java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr java lang String </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getCidr_java_lang_String_()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_Cidr_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getDefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_ <em>Default Instance Tenancy software amazon awscdk services ec2 Default Instance Tenancy </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Instance Tenancy software amazon awscdk services ec2 Default Instance Tenancy </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getDefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_DefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getEnableDnsHostnames_java_lang_Boolean_ <em>Enable Dns Hostnames java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Dns Hostnames java lang Boolean </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getEnableDnsHostnames_java_lang_Boolean_()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_EnableDnsHostnames_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getEnableDnsSupport_java_lang_Boolean_ <em>Enable Dns Support java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Dns Support java lang Boolean </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getEnableDnsSupport_java_lang_Boolean_()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_EnableDnsSupport_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getFlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap <em>Flow Logs java lang String software amazon awscdk services ec2 Flow Log Options As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow Logs java lang String software amazon awscdk services ec2 Flow Log Options As Map</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getFlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_FlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getGatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap <em>Gateway Endpoints java lang String software amazon awscdk services ec2 Gateway Vpc Endpoint Options As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway Endpoints java lang String software amazon awscdk services ec2 Gateway Vpc Endpoint Options As Map</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getGatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_GatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getMaxAzs_java_lang_Number_ <em>Max Azs java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Azs java lang Number </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getMaxAzs_java_lang_Number_()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_MaxAzs_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getNatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference <em>Nat Gateway Provider With Nat Provider software amazon awscdk services ec2 Nat Provider As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nat Gateway Provider With Nat Provider software amazon awscdk services ec2 Nat Provider As Reference</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getNatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_NatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getNatGateways_java_lang_Number_ <em>Nat Gateways java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nat Gateways java lang Number </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getNatGateways_java_lang_Number_()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_NatGateways_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getNatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Nat Gateway Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nat Gateway Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getNatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_NatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getSubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList <em>Subnet Configuration software amazon awscdk services ec2 Subnet Configuration As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet Configuration software amazon awscdk services ec2 Subnet Configuration As List</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getSubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_SubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getVpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap <em>Vpn Connections java lang String software amazon awscdk services ec2 Vpn Connection Options As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpn Connections java lang String software amazon awscdk services ec2 Vpn Connection Options As Map</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getVpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_VpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getVpnGateway_java_lang_Boolean_ <em>Vpn Gateway java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpn Gateway java lang Boolean </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getVpnGateway_java_lang_Boolean_()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_VpnGateway_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getVpnGatewayAsn_java_lang_Number_ <em>Vpn Gateway Asn java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpn Gateway Asn java lang Number </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getVpnGatewayAsn_java_lang_Number_()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_VpnGatewayAsn_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList <em>Vpn Route Propagation software amazon awscdk services ec2 Subnet Selection As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpn Route Propagation software amazon awscdk services ec2 Subnet Selection As List</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_VpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList();

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
	 * Returns the meta object for the containment reference list '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getSubnetselectionbuilder_ec2 <em>Subnetselectionbuilder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subnetselectionbuilder ec2</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getSubnetselectionbuilder_ec2()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EReference getVpcBuilder_ec2_Subnetselectionbuilder_ec2();

	/**
	 * Returns the meta object for the containment reference list '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getSubnetconfigurationbuilder_ec2 <em>Subnetconfigurationbuilder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subnetconfigurationbuilder ec2</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getSubnetconfigurationbuilder_ec2()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EReference getVpcBuilder_ec2_Subnetconfigurationbuilder_ec2();

	/**
	 * Returns the meta object for the containment reference list '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getVpntunneloptionbuilder_ec2 <em>Vpntunneloptionbuilder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vpntunneloptionbuilder ec2</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getVpntunneloptionbuilder_ec2()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EReference getVpcBuilder_ec2_Vpntunneloptionbuilder_ec2();

	/**
	 * Returns the meta object for the containment reference list '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getVpnconnectionoptionsbuilder_ec2 <em>Vpnconnectionoptionsbuilder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vpnconnectionoptionsbuilder ec2</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getVpnconnectionoptionsbuilder_ec2()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EReference getVpcBuilder_ec2_Vpnconnectionoptionsbuilder_ec2();

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
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2#getAvailabilityZone_java_lang_String_ <em>Availability Zone java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Zone java lang String </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2#getAvailabilityZone_java_lang_String_()
	 * @see #getSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetBuilder_ec2_AvailabilityZone_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2#getCidrBlock_java_lang_String_ <em>Cidr Block java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr Block java lang String </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2#getCidrBlock_java_lang_String_()
	 * @see #getSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetBuilder_ec2_CidrBlock_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2#getVpcId_java_lang_String_ <em>Vpc Id java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc Id java lang String </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2#getVpcId_java_lang_String_()
	 * @see #getSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetBuilder_ec2_VpcId_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2#getMapPublicIpOnLaunch_java_lang_Boolean_ <em>Map Public Ip On Launch java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Public Ip On Launch java lang Boolean </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2#getMapPublicIpOnLaunch_java_lang_Boolean_()
	 * @see #getSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetBuilder_ec2_MapPublicIpOnLaunch_java_lang_Boolean_();

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
	 * Returns the meta object for class '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2 <em>Subnet Selection Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subnet Selection Builder ec2</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2
	 * @generated
	 */
	EClass getSubnetSelectionBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getAvailabilityZones_java_lang_String_AsList <em>Availability Zones java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Zones java lang String As List</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getAvailabilityZones_java_lang_String_AsList()
	 * @see #getSubnetSelectionBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetSelectionBuilder_ec2_AvailabilityZones_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getOnePerAz_java_lang_Boolean_ <em>One Per Az java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>One Per Az java lang Boolean </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getOnePerAz_java_lang_Boolean_()
	 * @see #getSubnetSelectionBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetSelectionBuilder_ec2_OnePerAz_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getSubnetGroupName_java_lang_String_ <em>Subnet Group Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet Group Name java lang String </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getSubnetGroupName_java_lang_String_()
	 * @see #getSubnetSelectionBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetSelectionBuilder_ec2_SubnetGroupName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getSubnetName_java_lang_String_ <em>Subnet Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet Name java lang String </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getSubnetName_java_lang_String_()
	 * @see #getSubnetSelectionBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetSelectionBuilder_ec2_SubnetName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getSubnets_software_amazon_awscdk_services_ec2_ISubnet_AsList <em>Subnets software amazon awscdk services ec2 ISubnet As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnets software amazon awscdk services ec2 ISubnet As List</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getSubnets_software_amazon_awscdk_services_ec2_ISubnet_AsList()
	 * @see #getSubnetSelectionBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetSelectionBuilder_ec2_Subnets_software_amazon_awscdk_services_ec2_ISubnet_AsList();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getSubnetType_software_amazon_awscdk_services_ec2_SubnetType_ <em>Subnet Type software amazon awscdk services ec2 Subnet Type </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet Type software amazon awscdk services ec2 Subnet Type </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getSubnetType_software_amazon_awscdk_services_ec2_SubnetType_()
	 * @see #getSubnetSelectionBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetSelectionBuilder_ec2_SubnetType_software_amazon_awscdk_services_ec2_SubnetType_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getGeneratedClassName()
	 * @see #getSubnetSelectionBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetSelectionBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getVarName()
	 * @see #getSubnetSelectionBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetSelectionBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getIdentifier()
	 * @see #getSubnetSelectionBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetSelectionBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2#getAdditionalCode()
	 * @see #getSubnetSelectionBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetSelectionBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetConfigurationBuilder_ec2 <em>Subnet Configuration Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subnet Configuration Builder ec2</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetConfigurationBuilder_ec2
	 * @generated
	 */
	EClass getSubnetConfigurationBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetConfigurationBuilder_ec2#getName_java_lang_String_ <em>Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name java lang String </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetConfigurationBuilder_ec2#getName_java_lang_String_()
	 * @see #getSubnetConfigurationBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetConfigurationBuilder_ec2_Name_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetConfigurationBuilder_ec2#getSubnetType_software_amazon_awscdk_services_ec2_SubnetType_ <em>Subnet Type software amazon awscdk services ec2 Subnet Type </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet Type software amazon awscdk services ec2 Subnet Type </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetConfigurationBuilder_ec2#getSubnetType_software_amazon_awscdk_services_ec2_SubnetType_()
	 * @see #getSubnetConfigurationBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetConfigurationBuilder_ec2_SubnetType_software_amazon_awscdk_services_ec2_SubnetType_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetConfigurationBuilder_ec2#getCidrMask_java_lang_Number_ <em>Cidr Mask java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr Mask java lang Number </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetConfigurationBuilder_ec2#getCidrMask_java_lang_Number_()
	 * @see #getSubnetConfigurationBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetConfigurationBuilder_ec2_CidrMask_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetConfigurationBuilder_ec2#getReserved_java_lang_Boolean_ <em>Reserved java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserved java lang Boolean </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetConfigurationBuilder_ec2#getReserved_java_lang_Boolean_()
	 * @see #getSubnetConfigurationBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetConfigurationBuilder_ec2_Reserved_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetConfigurationBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetConfigurationBuilder_ec2#getGeneratedClassName()
	 * @see #getSubnetConfigurationBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetConfigurationBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetConfigurationBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetConfigurationBuilder_ec2#getVarName()
	 * @see #getSubnetConfigurationBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetConfigurationBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetConfigurationBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetConfigurationBuilder_ec2#getIdentifier()
	 * @see #getSubnetConfigurationBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetConfigurationBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetConfigurationBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetConfigurationBuilder_ec2#getAdditionalCode()
	 * @see #getSubnetConfigurationBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetConfigurationBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2 <em>Vpn Connection Options Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vpn Connection Options Builder ec2</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2
	 * @generated
	 */
	EClass getVpnConnectionOptionsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2#getIp_java_lang_String_ <em>Ip java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip java lang String </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2#getIp_java_lang_String_()
	 * @see #getVpnConnectionOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionOptionsBuilder_ec2_Ip_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2#getAsn_java_lang_Number_ <em>Asn java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asn java lang Number </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2#getAsn_java_lang_Number_()
	 * @see #getVpnConnectionOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionOptionsBuilder_ec2_Asn_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2#getStaticRoutes_java_lang_String_AsList <em>Static Routes java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static Routes java lang String As List</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2#getStaticRoutes_java_lang_String_AsList()
	 * @see #getVpnConnectionOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionOptionsBuilder_ec2_StaticRoutes_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2#getTunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList <em>Tunnel Options software amazon awscdk services ec2 Vpn Tunnel Option As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tunnel Options software amazon awscdk services ec2 Vpn Tunnel Option As List</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2#getTunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList()
	 * @see #getVpnConnectionOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionOptionsBuilder_ec2_TunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2#getGeneratedClassName()
	 * @see #getVpnConnectionOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionOptionsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2#getVarName()
	 * @see #getVpnConnectionOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionOptionsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2#getIdentifier()
	 * @see #getVpnConnectionOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionOptionsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2#getAdditionalCode()
	 * @see #getVpnConnectionOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionOptionsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link com.amazon.aws.workbench.model.awsworkbench.VpnTunnelOptionBuilder_ec2 <em>Vpn Tunnel Option Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vpn Tunnel Option Builder ec2</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpnTunnelOptionBuilder_ec2
	 * @generated
	 */
	EClass getVpnTunnelOptionBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpnTunnelOptionBuilder_ec2#getPreSharedKey_java_lang_String_ <em>Pre Shared Key java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pre Shared Key java lang String </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpnTunnelOptionBuilder_ec2#getPreSharedKey_java_lang_String_()
	 * @see #getVpnTunnelOptionBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnTunnelOptionBuilder_ec2_PreSharedKey_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpnTunnelOptionBuilder_ec2#getTunnelInsideCidr_java_lang_String_ <em>Tunnel Inside Cidr java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tunnel Inside Cidr java lang String </em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpnTunnelOptionBuilder_ec2#getTunnelInsideCidr_java_lang_String_()
	 * @see #getVpnTunnelOptionBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnTunnelOptionBuilder_ec2_TunnelInsideCidr_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpnTunnelOptionBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpnTunnelOptionBuilder_ec2#getGeneratedClassName()
	 * @see #getVpnTunnelOptionBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnTunnelOptionBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpnTunnelOptionBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpnTunnelOptionBuilder_ec2#getVarName()
	 * @see #getVpnTunnelOptionBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnTunnelOptionBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpnTunnelOptionBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpnTunnelOptionBuilder_ec2#getIdentifier()
	 * @see #getVpnTunnelOptionBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnTunnelOptionBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpnTunnelOptionBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpnTunnelOptionBuilder_ec2#getAdditionalCode()
	 * @see #getVpnTunnelOptionBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnTunnelOptionBuilder_ec2_AdditionalCode();

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
	 * Returns the meta object for enum '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetType <em>Subnet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Subnet Type</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetType
	 * @generated
	 */
	EEnum getSubnetType();

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
		 * The meta object literal for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.ServiceResourcesImpl <em>Service Resources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.ServiceResourcesImpl
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getServiceResources()
		 * @generated
		 */
		EClass SERVICE_RESOURCES = eINSTANCE.getServiceResources();

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
		 * The meta object literal for the '<em><b>Auto Synth java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER_CORE__AUTO_SYNTH_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getAppBuilder_core_AutoSynth_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Context java lang String java lang String As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER_CORE__CONTEXT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP = eINSTANCE
				.getAppBuilder_core_Context_java_lang_String__java_lang_String_AsMap();

		/**
		 * The meta object literal for the '<em><b>Outdir java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER_CORE__OUTDIR_JAVA_LANG_STRING_ = eINSTANCE.getAppBuilder_core_Outdir_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Runtime Info java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER_CORE__RUNTIME_INFO_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getAppBuilder_core_RuntimeInfo_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Stack Traces java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER_CORE__STACK_TRACES_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getAppBuilder_core_StackTraces_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Tree Metadata java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER_CORE__TREE_METADATA_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getAppBuilder_core_TreeMetadata_java_lang_Boolean_();

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
		 * The meta object literal for the '<em><b>Environmentbuilder core</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_BUILDER_CORE__ENVIRONMENTBUILDER_CORE = eINSTANCE.getAppBuilder_core_Environmentbuilder_core();

		/**
		 * The meta object literal for the '<em><b>Defaultstacksynthesizerbuilder core</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_BUILDER_CORE__DEFAULTSTACKSYNTHESIZERBUILDER_CORE = eINSTANCE
				.getAppBuilder_core_Defaultstacksynthesizerbuilder_core();

		/**
		 * The meta object literal for the '<em><b>Stackbuilder core</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_BUILDER_CORE__STACKBUILDER_CORE = eINSTANCE.getAppBuilder_core_Stackbuilder_core();

		/**
		 * The meta object literal for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.DefaultStackSynthesizerBuilder_coreImpl <em>Default Stack Synthesizer Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.DefaultStackSynthesizerBuilder_coreImpl
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getDefaultStackSynthesizerBuilder_core()
		 * @generated
		 */
		EClass DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE = eINSTANCE.getDefaultStackSynthesizerBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Asset Publishing External Id java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__ASSET_PUBLISHING_EXTERNAL_ID_JAVA_LANG_STRING_ = eINSTANCE
				.getDefaultStackSynthesizerBuilder_core_AssetPublishingExternalId_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Asset Publishing Role Arn java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__ASSET_PUBLISHING_ROLE_ARN_JAVA_LANG_STRING_ = eINSTANCE
				.getDefaultStackSynthesizerBuilder_core_AssetPublishingRoleArn_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Cloud Formation Execution Role java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__CLOUD_FORMATION_EXECUTION_ROLE_JAVA_LANG_STRING_ = eINSTANCE
				.getDefaultStackSynthesizerBuilder_core_CloudFormationExecutionRole_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Deploy Role Arn java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__DEPLOY_ROLE_ARN_JAVA_LANG_STRING_ = eINSTANCE
				.getDefaultStackSynthesizerBuilder_core_DeployRoleArn_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>File Assets Bucket Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__FILE_ASSETS_BUCKET_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getDefaultStackSynthesizerBuilder_core_FileAssetsBucketName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Image Assets Repository Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__IMAGE_ASSETS_REPOSITORY_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getDefaultStackSynthesizerBuilder_core_ImageAssetsRepositoryName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Qualifier java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__QUALIFIER_JAVA_LANG_STRING_ = eINSTANCE
				.getDefaultStackSynthesizerBuilder_core_Qualifier_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getDefaultStackSynthesizerBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__VAR_NAME = eINSTANCE
				.getDefaultStackSynthesizerBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__IDENTIFIER = eINSTANCE
				.getDefaultStackSynthesizerBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getDefaultStackSynthesizerBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.EnvironmentBuilder_coreImpl <em>Environment Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.EnvironmentBuilder_coreImpl
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getEnvironmentBuilder_core()
		 * @generated
		 */
		EClass ENVIRONMENT_BUILDER_CORE = eINSTANCE.getEnvironmentBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Account java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_BUILDER_CORE__ACCOUNT_JAVA_LANG_STRING_ = eINSTANCE
				.getEnvironmentBuilder_core_Account_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Region java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_BUILDER_CORE__REGION_JAVA_LANG_STRING_ = eINSTANCE
				.getEnvironmentBuilder_core_Region_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getEnvironmentBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_BUILDER_CORE__VAR_NAME = eINSTANCE.getEnvironmentBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_BUILDER_CORE__IDENTIFIER = eINSTANCE.getEnvironmentBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE.getEnvironmentBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.FlowLogOptionsBuilder_ec2Impl <em>Flow Log Options Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.FlowLogOptionsBuilder_ec2Impl
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getFlowLogOptionsBuilder_ec2()
		 * @generated
		 */
		EClass FLOW_LOG_OPTIONS_BUILDER_EC2 = eINSTANCE.getFlowLogOptionsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Destination With Flow Log Destination software amazon awscdk services ec2 Flow Log Destination As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_OPTIONS_BUILDER_EC2__DESTINATION_WITH_FLOW_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_AS_REFERENCE = eINSTANCE
				.getFlowLogOptionsBuilder_ec2_DestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference();

		/**
		 * The meta object literal for the '<em><b>Traffic Type software amazon awscdk services ec2 Flow Log Traffic Type </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_OPTIONS_BUILDER_EC2__TRAFFIC_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_TRAFFIC_TYPE_ = eINSTANCE
				.getFlowLogOptionsBuilder_ec2_TrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getFlowLogOptionsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_OPTIONS_BUILDER_EC2__VAR_NAME = eINSTANCE.getFlowLogOptionsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_OPTIONS_BUILDER_EC2__IDENTIFIER = eINSTANCE.getFlowLogOptionsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getFlowLogOptionsBuilder_ec2_AdditionalCode();

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
		 * The meta object literal for the '<em><b>Description java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER_CORE__DESCRIPTION_JAVA_LANG_STRING_ = eINSTANCE
				.getStackBuilder_core_Description_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Env With Environment software amazon awscdk core Environment As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER_CORE__ENV_WITH_ENVIRONMENT_SOFTWARE_AMAZON_AWSCDK_CORE_ENVIRONMENT_AS_REFERENCE = eINSTANCE
				.getStackBuilder_core_EnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference();

		/**
		 * The meta object literal for the '<em><b>Stack Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER_CORE__STACK_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getStackBuilder_core_StackName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Synthesizer With IStack Synthesizer software amazon awscdk core IStack Synthesizer As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER_CORE__SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_SOFTWARE_AMAZON_AWSCDK_CORE_ISTACK_SYNTHESIZER_AS_REFERENCE = eINSTANCE
				.getStackBuilder_core_SynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference();

		/**
		 * The meta object literal for the '<em><b>Tags java lang String java lang String As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER_CORE__TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP = eINSTANCE
				.getStackBuilder_core_Tags_java_lang_String__java_lang_String_AsMap();

		/**
		 * The meta object literal for the '<em><b>Termination Protection java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER_CORE__TERMINATION_PROTECTION_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getStackBuilder_core_TerminationProtection_java_lang_Boolean_();

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
		 * The meta object literal for the '<em><b>Cidr java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__CIDR_JAVA_LANG_STRING_ = eINSTANCE.getVpcBuilder_ec2_Cidr_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Default Instance Tenancy software amazon awscdk services ec2 Default Instance Tenancy </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__DEFAULT_INSTANCE_TENANCY_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_DEFAULT_INSTANCE_TENANCY_ = eINSTANCE
				.getVpcBuilder_ec2_DefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_();

		/**
		 * The meta object literal for the '<em><b>Enable Dns Hostnames java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__ENABLE_DNS_HOSTNAMES_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getVpcBuilder_ec2_EnableDnsHostnames_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Enable Dns Support java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__ENABLE_DNS_SUPPORT_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getVpcBuilder_ec2_EnableDnsSupport_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Flow Logs java lang String software amazon awscdk services ec2 Flow Log Options As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__FLOW_LOGS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_OPTIONS_AS_MAP = eINSTANCE
				.getVpcBuilder_ec2_FlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap();

		/**
		 * The meta object literal for the '<em><b>Gateway Endpoints java lang String software amazon awscdk services ec2 Gateway Vpc Endpoint Options As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__GATEWAY_ENDPOINTS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_GATEWAY_VPC_ENDPOINT_OPTIONS_AS_MAP = eINSTANCE
				.getVpcBuilder_ec2_GatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap();

		/**
		 * The meta object literal for the '<em><b>Max Azs java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__MAX_AZS_JAVA_LANG_NUMBER_ = eINSTANCE.getVpcBuilder_ec2_MaxAzs_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Nat Gateway Provider With Nat Provider software amazon awscdk services ec2 Nat Provider As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_NAT_PROVIDER_AS_REFERENCE = eINSTANCE
				.getVpcBuilder_ec2_NatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference();

		/**
		 * The meta object literal for the '<em><b>Nat Gateways java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__NAT_GATEWAYS_JAVA_LANG_NUMBER_ = eINSTANCE
				.getVpcBuilder_ec2_NatGateways_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Nat Gateway Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE = eINSTANCE
				.getVpcBuilder_ec2_NatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();

		/**
		 * The meta object literal for the '<em><b>Subnet Configuration software amazon awscdk services ec2 Subnet Configuration As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__SUBNET_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_CONFIGURATION_AS_LIST = eINSTANCE
				.getVpcBuilder_ec2_SubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList();

		/**
		 * The meta object literal for the '<em><b>Vpn Connections java lang String software amazon awscdk services ec2 Vpn Connection Options As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__VPN_CONNECTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_CONNECTION_OPTIONS_AS_MAP = eINSTANCE
				.getVpcBuilder_ec2_VpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap();

		/**
		 * The meta object literal for the '<em><b>Vpn Gateway java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__VPN_GATEWAY_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getVpcBuilder_ec2_VpnGateway_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Vpn Gateway Asn java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__VPN_GATEWAY_ASN_JAVA_LANG_NUMBER_ = eINSTANCE
				.getVpcBuilder_ec2_VpnGatewayAsn_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Vpn Route Propagation software amazon awscdk services ec2 Subnet Selection As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__VPN_ROUTE_PROPAGATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST = eINSTANCE
				.getVpcBuilder_ec2_VpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList();

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
		 * The meta object literal for the '<em><b>Subnetselectionbuilder ec2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VPC_BUILDER_EC2__SUBNETSELECTIONBUILDER_EC2 = eINSTANCE
				.getVpcBuilder_ec2_Subnetselectionbuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Subnetconfigurationbuilder ec2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VPC_BUILDER_EC2__SUBNETCONFIGURATIONBUILDER_EC2 = eINSTANCE
				.getVpcBuilder_ec2_Subnetconfigurationbuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Vpntunneloptionbuilder ec2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VPC_BUILDER_EC2__VPNTUNNELOPTIONBUILDER_EC2 = eINSTANCE
				.getVpcBuilder_ec2_Vpntunneloptionbuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Vpnconnectionoptionsbuilder ec2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VPC_BUILDER_EC2__VPNCONNECTIONOPTIONSBUILDER_EC2 = eINSTANCE
				.getVpcBuilder_ec2_Vpnconnectionoptionsbuilder_ec2();

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
		 * The meta object literal for the '<em><b>Availability Zone java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_ = eINSTANCE
				.getSubnetBuilder_ec2_AvailabilityZone_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Cidr Block java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_BUILDER_EC2__CIDR_BLOCK_JAVA_LANG_STRING_ = eINSTANCE
				.getSubnetBuilder_ec2_CidrBlock_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Vpc Id java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_ = eINSTANCE
				.getSubnetBuilder_ec2_VpcId_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Map Public Ip On Launch java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getSubnetBuilder_ec2_MapPublicIpOnLaunch_java_lang_Boolean_();

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
		 * The meta object literal for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.SubnetSelectionBuilder_ec2Impl <em>Subnet Selection Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.SubnetSelectionBuilder_ec2Impl
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getSubnetSelectionBuilder_ec2()
		 * @generated
		 */
		EClass SUBNET_SELECTION_BUILDER_EC2 = eINSTANCE.getSubnetSelectionBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Availability Zones java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_SELECTION_BUILDER_EC2__AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getSubnetSelectionBuilder_ec2_AvailabilityZones_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>One Per Az java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_SELECTION_BUILDER_EC2__ONE_PER_AZ_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getSubnetSelectionBuilder_ec2_OnePerAz_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Subnet Group Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_SELECTION_BUILDER_EC2__SUBNET_GROUP_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getSubnetSelectionBuilder_ec2_SubnetGroupName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Subnet Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_SELECTION_BUILDER_EC2__SUBNET_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getSubnetSelectionBuilder_ec2_SubnetName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Subnets software amazon awscdk services ec2 ISubnet As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_SELECTION_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_LIST = eINSTANCE
				.getSubnetSelectionBuilder_ec2_Subnets_software_amazon_awscdk_services_ec2_ISubnet_AsList();

		/**
		 * The meta object literal for the '<em><b>Subnet Type software amazon awscdk services ec2 Subnet Type </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_SELECTION_BUILDER_EC2__SUBNET_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_TYPE_ = eINSTANCE
				.getSubnetSelectionBuilder_ec2_SubnetType_software_amazon_awscdk_services_ec2_SubnetType_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_SELECTION_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getSubnetSelectionBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_SELECTION_BUILDER_EC2__VAR_NAME = eINSTANCE.getSubnetSelectionBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_SELECTION_BUILDER_EC2__IDENTIFIER = eINSTANCE.getSubnetSelectionBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_SELECTION_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getSubnetSelectionBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.SubnetConfigurationBuilder_ec2Impl <em>Subnet Configuration Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.SubnetConfigurationBuilder_ec2Impl
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getSubnetConfigurationBuilder_ec2()
		 * @generated
		 */
		EClass SUBNET_CONFIGURATION_BUILDER_EC2 = eINSTANCE.getSubnetConfigurationBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_CONFIGURATION_BUILDER_EC2__NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getSubnetConfigurationBuilder_ec2_Name_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Subnet Type software amazon awscdk services ec2 Subnet Type </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_CONFIGURATION_BUILDER_EC2__SUBNET_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_TYPE_ = eINSTANCE
				.getSubnetConfigurationBuilder_ec2_SubnetType_software_amazon_awscdk_services_ec2_SubnetType_();

		/**
		 * The meta object literal for the '<em><b>Cidr Mask java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_CONFIGURATION_BUILDER_EC2__CIDR_MASK_JAVA_LANG_NUMBER_ = eINSTANCE
				.getSubnetConfigurationBuilder_ec2_CidrMask_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Reserved java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_CONFIGURATION_BUILDER_EC2__RESERVED_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getSubnetConfigurationBuilder_ec2_Reserved_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_CONFIGURATION_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getSubnetConfigurationBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_CONFIGURATION_BUILDER_EC2__VAR_NAME = eINSTANCE.getSubnetConfigurationBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_CONFIGURATION_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getSubnetConfigurationBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_CONFIGURATION_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getSubnetConfigurationBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpnConnectionOptionsBuilder_ec2Impl <em>Vpn Connection Options Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.VpnConnectionOptionsBuilder_ec2Impl
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getVpnConnectionOptionsBuilder_ec2()
		 * @generated
		 */
		EClass VPN_CONNECTION_OPTIONS_BUILDER_EC2 = eINSTANCE.getVpnConnectionOptionsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Ip java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_OPTIONS_BUILDER_EC2__IP_JAVA_LANG_STRING_ = eINSTANCE
				.getVpnConnectionOptionsBuilder_ec2_Ip_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Asn java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_OPTIONS_BUILDER_EC2__ASN_JAVA_LANG_NUMBER_ = eINSTANCE
				.getVpnConnectionOptionsBuilder_ec2_Asn_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Static Routes java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_OPTIONS_BUILDER_EC2__STATIC_ROUTES_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getVpnConnectionOptionsBuilder_ec2_StaticRoutes_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Tunnel Options software amazon awscdk services ec2 Vpn Tunnel Option As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_OPTIONS_BUILDER_EC2__TUNNEL_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_TUNNEL_OPTION_AS_LIST = eINSTANCE
				.getVpnConnectionOptionsBuilder_ec2_TunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getVpnConnectionOptionsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_OPTIONS_BUILDER_EC2__VAR_NAME = eINSTANCE
				.getVpnConnectionOptionsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_OPTIONS_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getVpnConnectionOptionsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getVpnConnectionOptionsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpnTunnelOptionBuilder_ec2Impl <em>Vpn Tunnel Option Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.VpnTunnelOptionBuilder_ec2Impl
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getVpnTunnelOptionBuilder_ec2()
		 * @generated
		 */
		EClass VPN_TUNNEL_OPTION_BUILDER_EC2 = eINSTANCE.getVpnTunnelOptionBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Pre Shared Key java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_TUNNEL_OPTION_BUILDER_EC2__PRE_SHARED_KEY_JAVA_LANG_STRING_ = eINSTANCE
				.getVpnTunnelOptionBuilder_ec2_PreSharedKey_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Tunnel Inside Cidr java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_TUNNEL_OPTION_BUILDER_EC2__TUNNEL_INSIDE_CIDR_JAVA_LANG_STRING_ = eINSTANCE
				.getVpnTunnelOptionBuilder_ec2_TunnelInsideCidr_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_TUNNEL_OPTION_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getVpnTunnelOptionBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_TUNNEL_OPTION_BUILDER_EC2__VAR_NAME = eINSTANCE.getVpnTunnelOptionBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_TUNNEL_OPTION_BUILDER_EC2__IDENTIFIER = eINSTANCE.getVpnTunnelOptionBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_TUNNEL_OPTION_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getVpnTunnelOptionBuilder_ec2_AdditionalCode();

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
		 * The meta object literal for the '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetType <em>Subnet Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetType
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getSubnetType()
		 * @generated
		 */
		EEnum SUBNET_TYPE = eINSTANCE.getSubnetType();

	}

} //AwsworkbenchPackage
