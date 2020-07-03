/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilderImpl <em>App Builder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilderImpl
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getAppBuilder()
	 * @generated
	 */
	int APP_BUILDER = 0;

	/**
	 * The feature id for the '<em><b>Auto Synth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER__AUTO_SYNTH = 0;

	/**
	 * The feature id for the '<em><b>Outdir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER__OUTDIR = 1;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER__RUNTIME_INFO = 2;

	/**
	 * The feature id for the '<em><b>Stack Traces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER__STACK_TRACES = 3;

	/**
	 * The feature id for the '<em><b>Tree Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER__TREE_METADATA = 4;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER__GENERATED_CLASS_NAME = 5;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER__VAR_NAME = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER__IDENTIFIER = 7;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER__ADDITIONAL_CODE = 8;

	/**
	 * The feature id for the '<em><b>Stackbuilder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER__STACKBUILDER = 9;

	/**
	 * The number of structural features of the '<em>App Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>App Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.StackBuilderImpl <em>Stack Builder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.StackBuilderImpl
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getStackBuilder()
	 * @generated
	 */
	int STACK_BUILDER = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Stack Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER__STACK_NAME = 1;

	/**
	 * The feature id for the '<em><b>Termination Protection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER__TERMINATION_PROTECTION = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER__ADDITIONAL_CODE = 6;

	/**
	 * The feature id for the '<em><b>Serviceresources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER__SERVICERESOURCES = 7;

	/**
	 * The number of structural features of the '<em>Stack Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Stack Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Parent Stack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCES__PARENT_STACK = 0;

	/**
	 * The number of structural features of the '<em>Service Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilderImpl <em>Vpc Builder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilderImpl
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getVpcBuilder()
	 * @generated
	 */
	int VPC_BUILDER = 2;

	/**
	 * The feature id for the '<em><b>Parent Stack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER__PARENT_STACK = SERVICE_RESOURCES__PARENT_STACK;

	/**
	 * The feature id for the '<em><b>Cidr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER__CIDR = SERVICE_RESOURCES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enable Dns Hostnames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER__ENABLE_DNS_HOSTNAMES = SERVICE_RESOURCES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enable Dns Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER__ENABLE_DNS_SUPPORT = SERVICE_RESOURCES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Azs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER__MAX_AZS = SERVICE_RESOURCES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Nat Gateways</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER__NAT_GATEWAYS = SERVICE_RESOURCES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Vpn Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER__VPN_GATEWAY = SERVICE_RESOURCES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Vpn Gateway Asn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER__VPN_GATEWAY_ASN = SERVICE_RESOURCES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER__GENERATED_CLASS_NAME = SERVICE_RESOURCES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER__VAR_NAME = SERVICE_RESOURCES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER__IDENTIFIER = SERVICE_RESOURCES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER__ADDITIONAL_CODE = SERVICE_RESOURCES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Default Instance Tenancy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER__DEFAULT_INSTANCE_TENANCY = SERVICE_RESOURCES_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Vpc Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_FEATURE_COUNT = SERVICE_RESOURCES_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Vpc Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_OPERATION_COUNT = SERVICE_RESOURCES_OPERATION_COUNT + 0;

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
	 * The meta object id for the '<em>Number</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Number
	 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 5;

	/**
	 * Returns the meta object for class '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder <em>App Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Builder</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder
	 * @generated
	 */
	EClass getAppBuilder();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getAutoSynth <em>Auto Synth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Synth</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getAutoSynth()
	 * @see #getAppBuilder()
	 * @generated
	 */
	EAttribute getAppBuilder_AutoSynth();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getOutdir <em>Outdir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outdir</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getOutdir()
	 * @see #getAppBuilder()
	 * @generated
	 */
	EAttribute getAppBuilder_Outdir();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getRuntimeInfo <em>Runtime Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtime Info</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getRuntimeInfo()
	 * @see #getAppBuilder()
	 * @generated
	 */
	EAttribute getAppBuilder_RuntimeInfo();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getStackTraces <em>Stack Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stack Traces</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getStackTraces()
	 * @see #getAppBuilder()
	 * @generated
	 */
	EAttribute getAppBuilder_StackTraces();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getTreeMetadata <em>Tree Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tree Metadata</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getTreeMetadata()
	 * @see #getAppBuilder()
	 * @generated
	 */
	EAttribute getAppBuilder_TreeMetadata();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getGeneratedClassName()
	 * @see #getAppBuilder()
	 * @generated
	 */
	EAttribute getAppBuilder_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getVarName()
	 * @see #getAppBuilder()
	 * @generated
	 */
	EAttribute getAppBuilder_VarName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getIdentifier()
	 * @see #getAppBuilder()
	 * @generated
	 */
	EAttribute getAppBuilder_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getAdditionalCode()
	 * @see #getAppBuilder()
	 * @generated
	 */
	EAttribute getAppBuilder_AdditionalCode();

	/**
	 * Returns the meta object for the containment reference list '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getStackbuilder <em>Stackbuilder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stackbuilder</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getStackbuilder()
	 * @see #getAppBuilder()
	 * @generated
	 */
	EReference getAppBuilder_Stackbuilder();

	/**
	 * Returns the meta object for class '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder <em>Stack Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stack Builder</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StackBuilder
	 * @generated
	 */
	EClass getStackBuilder();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StackBuilder#getDescription()
	 * @see #getStackBuilder()
	 * @generated
	 */
	EAttribute getStackBuilder_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder#getStackName <em>Stack Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stack Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StackBuilder#getStackName()
	 * @see #getStackBuilder()
	 * @generated
	 */
	EAttribute getStackBuilder_StackName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder#getTerminationProtection <em>Termination Protection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Termination Protection</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StackBuilder#getTerminationProtection()
	 * @see #getStackBuilder()
	 * @generated
	 */
	EAttribute getStackBuilder_TerminationProtection();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StackBuilder#getGeneratedClassName()
	 * @see #getStackBuilder()
	 * @generated
	 */
	EAttribute getStackBuilder_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StackBuilder#getVarName()
	 * @see #getStackBuilder()
	 * @generated
	 */
	EAttribute getStackBuilder_VarName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StackBuilder#getIdentifier()
	 * @see #getStackBuilder()
	 * @generated
	 */
	EAttribute getStackBuilder_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StackBuilder#getAdditionalCode()
	 * @see #getStackBuilder()
	 * @generated
	 */
	EAttribute getStackBuilder_AdditionalCode();

	/**
	 * Returns the meta object for the containment reference list '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder#getServiceresources <em>Serviceresources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Serviceresources</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StackBuilder#getServiceresources()
	 * @see #getStackBuilder()
	 * @generated
	 */
	EReference getStackBuilder_Serviceresources();

	/**
	 * Returns the meta object for class '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder <em>Vpc Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vpc Builder</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder
	 * @generated
	 */
	EClass getVpcBuilder();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getCidr <em>Cidr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getCidr()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_Cidr();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getEnableDnsHostnames <em>Enable Dns Hostnames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Dns Hostnames</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getEnableDnsHostnames()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_EnableDnsHostnames();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getEnableDnsSupport <em>Enable Dns Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Dns Support</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getEnableDnsSupport()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_EnableDnsSupport();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getMaxAzs <em>Max Azs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Azs</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getMaxAzs()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_MaxAzs();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getNatGateways <em>Nat Gateways</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nat Gateways</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getNatGateways()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_NatGateways();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getVpnGateway <em>Vpn Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpn Gateway</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getVpnGateway()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_VpnGateway();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getVpnGatewayAsn <em>Vpn Gateway Asn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpn Gateway Asn</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getVpnGatewayAsn()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_VpnGatewayAsn();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getGeneratedClassName()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getVarName()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_VarName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getIdentifier()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getAdditionalCode()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_AdditionalCode();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getDefaultInstanceTenancy <em>Default Instance Tenancy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Instance Tenancy</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder#getDefaultInstanceTenancy()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_DefaultInstanceTenancy();

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
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.ServiceResources#getParentStack <em>Parent Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Stack</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ServiceResources#getParentStack()
	 * @see #getServiceResources()
	 * @generated
	 */
	EAttribute getServiceResources_ParentStack();

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
	 * Returns the meta object for data type '{@link java.lang.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number</em>'.
	 * @see java.lang.Number
	 * @model instanceClass="java.lang.Number"
	 * @generated
	 */
	EDataType getNumber();

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
		 * The meta object literal for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilderImpl <em>App Builder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilderImpl
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getAppBuilder()
		 * @generated
		 */
		EClass APP_BUILDER = eINSTANCE.getAppBuilder();

		/**
		 * The meta object literal for the '<em><b>Auto Synth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER__AUTO_SYNTH = eINSTANCE.getAppBuilder_AutoSynth();

		/**
		 * The meta object literal for the '<em><b>Outdir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER__OUTDIR = eINSTANCE.getAppBuilder_Outdir();

		/**
		 * The meta object literal for the '<em><b>Runtime Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER__RUNTIME_INFO = eINSTANCE.getAppBuilder_RuntimeInfo();

		/**
		 * The meta object literal for the '<em><b>Stack Traces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER__STACK_TRACES = eINSTANCE.getAppBuilder_StackTraces();

		/**
		 * The meta object literal for the '<em><b>Tree Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER__TREE_METADATA = eINSTANCE.getAppBuilder_TreeMetadata();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER__GENERATED_CLASS_NAME = eINSTANCE.getAppBuilder_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER__VAR_NAME = eINSTANCE.getAppBuilder_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER__IDENTIFIER = eINSTANCE.getAppBuilder_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER__ADDITIONAL_CODE = eINSTANCE.getAppBuilder_AdditionalCode();

		/**
		 * The meta object literal for the '<em><b>Stackbuilder</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_BUILDER__STACKBUILDER = eINSTANCE.getAppBuilder_Stackbuilder();

		/**
		 * The meta object literal for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.StackBuilderImpl <em>Stack Builder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.StackBuilderImpl
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getStackBuilder()
		 * @generated
		 */
		EClass STACK_BUILDER = eINSTANCE.getStackBuilder();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER__DESCRIPTION = eINSTANCE.getStackBuilder_Description();

		/**
		 * The meta object literal for the '<em><b>Stack Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER__STACK_NAME = eINSTANCE.getStackBuilder_StackName();

		/**
		 * The meta object literal for the '<em><b>Termination Protection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER__TERMINATION_PROTECTION = eINSTANCE.getStackBuilder_TerminationProtection();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER__GENERATED_CLASS_NAME = eINSTANCE.getStackBuilder_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER__VAR_NAME = eINSTANCE.getStackBuilder_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER__IDENTIFIER = eINSTANCE.getStackBuilder_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER__ADDITIONAL_CODE = eINSTANCE.getStackBuilder_AdditionalCode();

		/**
		 * The meta object literal for the '<em><b>Serviceresources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STACK_BUILDER__SERVICERESOURCES = eINSTANCE.getStackBuilder_Serviceresources();

		/**
		 * The meta object literal for the '{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilderImpl <em>Vpc Builder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilderImpl
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getVpcBuilder()
		 * @generated
		 */
		EClass VPC_BUILDER = eINSTANCE.getVpcBuilder();

		/**
		 * The meta object literal for the '<em><b>Cidr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER__CIDR = eINSTANCE.getVpcBuilder_Cidr();

		/**
		 * The meta object literal for the '<em><b>Enable Dns Hostnames</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER__ENABLE_DNS_HOSTNAMES = eINSTANCE.getVpcBuilder_EnableDnsHostnames();

		/**
		 * The meta object literal for the '<em><b>Enable Dns Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER__ENABLE_DNS_SUPPORT = eINSTANCE.getVpcBuilder_EnableDnsSupport();

		/**
		 * The meta object literal for the '<em><b>Max Azs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER__MAX_AZS = eINSTANCE.getVpcBuilder_MaxAzs();

		/**
		 * The meta object literal for the '<em><b>Nat Gateways</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER__NAT_GATEWAYS = eINSTANCE.getVpcBuilder_NatGateways();

		/**
		 * The meta object literal for the '<em><b>Vpn Gateway</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER__VPN_GATEWAY = eINSTANCE.getVpcBuilder_VpnGateway();

		/**
		 * The meta object literal for the '<em><b>Vpn Gateway Asn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER__VPN_GATEWAY_ASN = eINSTANCE.getVpcBuilder_VpnGatewayAsn();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER__GENERATED_CLASS_NAME = eINSTANCE.getVpcBuilder_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER__VAR_NAME = eINSTANCE.getVpcBuilder_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER__IDENTIFIER = eINSTANCE.getVpcBuilder_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER__ADDITIONAL_CODE = eINSTANCE.getVpcBuilder_AdditionalCode();

		/**
		 * The meta object literal for the '<em><b>Default Instance Tenancy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER__DEFAULT_INSTANCE_TENANCY = eINSTANCE.getVpcBuilder_DefaultInstanceTenancy();

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
		 * The meta object literal for the '<em><b>Parent Stack</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_RESOURCES__PARENT_STACK = eINSTANCE.getServiceResources_ParentStack();

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
		 * The meta object literal for the '<em>Number</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Number
		 * @see com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl#getNumber()
		 * @generated
		 */
		EDataType NUMBER = eINSTANCE.getNumber();

	}

} //AwsworkbenchPackage
