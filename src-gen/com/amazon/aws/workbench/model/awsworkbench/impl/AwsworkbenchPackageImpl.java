/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchFactory;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.DefaultInstanceTenancy;
import com.amazon.aws.workbench.model.awsworkbench.ServiceResources;
import com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core;
import com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AwsworkbenchPackageImpl extends EPackageImpl implements AwsworkbenchPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stackBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vpcBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceResourcesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum defaultInstanceTenancyEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AwsworkbenchPackageImpl() {
		super(eNS_URI, AwsworkbenchFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AwsworkbenchPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AwsworkbenchPackage init() {
		if (isInited)
			return (AwsworkbenchPackage) EPackage.Registry.INSTANCE.getEPackage(AwsworkbenchPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAwsworkbenchPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AwsworkbenchPackageImpl theAwsworkbenchPackage = registeredAwsworkbenchPackage instanceof AwsworkbenchPackageImpl
				? (AwsworkbenchPackageImpl) registeredAwsworkbenchPackage
				: new AwsworkbenchPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theAwsworkbenchPackage.createPackageContents();

		// Initialize created meta-data
		theAwsworkbenchPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAwsworkbenchPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AwsworkbenchPackage.eNS_URI, theAwsworkbenchPackage);
		return theAwsworkbenchPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAppBuilder_core() {
		return appBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_core_AutoSynth() {
		return (EAttribute) appBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_core_ContextAsMap() {
		return (EAttribute) appBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_core_Outdir() {
		return (EAttribute) appBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_core_RuntimeInfo() {
		return (EAttribute) appBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_core_StackTraces() {
		return (EAttribute) appBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_core_TreeMetadata() {
		return (EAttribute) appBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_core_GeneratedClassName() {
		return (EAttribute) appBuilder_coreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_core_VarName() {
		return (EAttribute) appBuilder_coreEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_core_Identifier() {
		return (EAttribute) appBuilder_coreEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_core_AdditionalCode() {
		return (EAttribute) appBuilder_coreEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAppBuilder_core_Stackbuilder_core() {
		return (EReference) appBuilder_coreEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStackBuilder_core() {
		return stackBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackBuilder_core_Description() {
		return (EAttribute) stackBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackBuilder_core_EnvWithEnvironmentAsReference() {
		return (EAttribute) stackBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackBuilder_core_StackName() {
		return (EAttribute) stackBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackBuilder_core_SynthesizerWithIStackSynthesizerAsReference() {
		return (EAttribute) stackBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackBuilder_core_TagsAsMap() {
		return (EAttribute) stackBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackBuilder_core_TerminationProtection() {
		return (EAttribute) stackBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackBuilder_core_GeneratedClassName() {
		return (EAttribute) stackBuilder_coreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackBuilder_core_VarName() {
		return (EAttribute) stackBuilder_coreEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackBuilder_core_Identifier() {
		return (EAttribute) stackBuilder_coreEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackBuilder_core_AdditionalCode() {
		return (EAttribute) stackBuilder_coreEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStackBuilder_core_Serviceresources() {
		return (EReference) stackBuilder_coreEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVpcBuilder_ec2() {
		return vpcBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_Cidr() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_DefaultInstanceTenancy() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_EnableDnsHostnames() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_EnableDnsSupport() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_FlowLogsAsMap() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_GatewayEndpointsAsMap() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_MaxAzs() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_NatGatewayProviderWithNatProviderAsReference() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_NatGateways() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_NatGatewaySubnetsWithSubnetSelectionAsReference() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_SubnetConfigurationAsList() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_VpnConnectionsAsMap() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_VpnGateway() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_VpnGatewayAsn() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_VpnRoutePropagationAsList() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_GeneratedClassName() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_VarName() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_Identifier() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_AdditionalCode() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceResources() {
		return serviceResourcesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDefaultInstanceTenancy() {
		return defaultInstanceTenancyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AwsworkbenchFactory getAwsworkbenchFactory() {
		return (AwsworkbenchFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		appBuilder_coreEClass = createEClass(APP_BUILDER_CORE);
		createEAttribute(appBuilder_coreEClass, APP_BUILDER_CORE__AUTO_SYNTH);
		createEAttribute(appBuilder_coreEClass, APP_BUILDER_CORE__CONTEXT_AS_MAP);
		createEAttribute(appBuilder_coreEClass, APP_BUILDER_CORE__OUTDIR);
		createEAttribute(appBuilder_coreEClass, APP_BUILDER_CORE__RUNTIME_INFO);
		createEAttribute(appBuilder_coreEClass, APP_BUILDER_CORE__STACK_TRACES);
		createEAttribute(appBuilder_coreEClass, APP_BUILDER_CORE__TREE_METADATA);
		createEAttribute(appBuilder_coreEClass, APP_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(appBuilder_coreEClass, APP_BUILDER_CORE__VAR_NAME);
		createEAttribute(appBuilder_coreEClass, APP_BUILDER_CORE__IDENTIFIER);
		createEAttribute(appBuilder_coreEClass, APP_BUILDER_CORE__ADDITIONAL_CODE);
		createEReference(appBuilder_coreEClass, APP_BUILDER_CORE__STACKBUILDER_CORE);

		stackBuilder_coreEClass = createEClass(STACK_BUILDER_CORE);
		createEAttribute(stackBuilder_coreEClass, STACK_BUILDER_CORE__DESCRIPTION);
		createEAttribute(stackBuilder_coreEClass, STACK_BUILDER_CORE__ENV_WITH_ENVIRONMENT_AS_REFERENCE);
		createEAttribute(stackBuilder_coreEClass, STACK_BUILDER_CORE__STACK_NAME);
		createEAttribute(stackBuilder_coreEClass, STACK_BUILDER_CORE__SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_AS_REFERENCE);
		createEAttribute(stackBuilder_coreEClass, STACK_BUILDER_CORE__TAGS_AS_MAP);
		createEAttribute(stackBuilder_coreEClass, STACK_BUILDER_CORE__TERMINATION_PROTECTION);
		createEAttribute(stackBuilder_coreEClass, STACK_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(stackBuilder_coreEClass, STACK_BUILDER_CORE__VAR_NAME);
		createEAttribute(stackBuilder_coreEClass, STACK_BUILDER_CORE__IDENTIFIER);
		createEAttribute(stackBuilder_coreEClass, STACK_BUILDER_CORE__ADDITIONAL_CODE);
		createEReference(stackBuilder_coreEClass, STACK_BUILDER_CORE__SERVICERESOURCES);

		vpcBuilder_ec2EClass = createEClass(VPC_BUILDER_EC2);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__CIDR);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__DEFAULT_INSTANCE_TENANCY);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__ENABLE_DNS_HOSTNAMES);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__ENABLE_DNS_SUPPORT);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__FLOW_LOGS_AS_MAP);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__GATEWAY_ENDPOINTS_AS_MAP);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__MAX_AZS);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_AS_REFERENCE);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__NAT_GATEWAYS);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_AS_REFERENCE);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__SUBNET_CONFIGURATION_AS_LIST);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__VPN_CONNECTIONS_AS_MAP);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__VPN_GATEWAY);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__VPN_GATEWAY_ASN);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__VPN_ROUTE_PROPAGATION_AS_LIST);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__VAR_NAME);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__IDENTIFIER);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__ADDITIONAL_CODE);

		serviceResourcesEClass = createEClass(SERVICE_RESOURCES);

		// Create enums
		defaultInstanceTenancyEEnum = createEEnum(DEFAULT_INSTANCE_TENANCY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vpcBuilder_ec2EClass.getESuperTypes().add(this.getServiceResources());

		// Initialize classes, features, and operations; add parameters
		initEClass(appBuilder_coreEClass, AppBuilder_core.class, "AppBuilder_core", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppBuilder_core_AutoSynth(), ecorePackage.getEBooleanObject(), "autoSynth", null, 0, 1,
				AppBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppBuilder_core_ContextAsMap(), ecorePackage.getEString(), "contextAsMap", null, 0, 1,
				AppBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppBuilder_core_Outdir(), ecorePackage.getEString(), "outdir", null, 0, 1,
				AppBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppBuilder_core_RuntimeInfo(), ecorePackage.getEBooleanObject(), "runtimeInfo", null, 0, 1,
				AppBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppBuilder_core_StackTraces(), ecorePackage.getEBooleanObject(), "stackTraces", null, 0, 1,
				AppBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppBuilder_core_TreeMetadata(), ecorePackage.getEBooleanObject(), "treeMetadata", null, 0, 1,
				AppBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppBuilder_core_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.core.App", 0, 1, AppBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				AppBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				AppBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0, 1,
				AppBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAppBuilder_core_Stackbuilder_core(), this.getStackBuilder_core(), null, "stackbuilder_core",
				null, 0, -1, AppBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stackBuilder_coreEClass, StackBuilder_core.class, "StackBuilder_core", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStackBuilder_core_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				StackBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackBuilder_core_EnvWithEnvironmentAsReference(), ecorePackage.getEString(),
				"envWithEnvironmentAsReference", null, 0, 1, StackBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackBuilder_core_StackName(), ecorePackage.getEString(), "stackName", null, 0, 1,
				StackBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackBuilder_core_SynthesizerWithIStackSynthesizerAsReference(), ecorePackage.getEString(),
				"synthesizerWithIStackSynthesizerAsReference", null, 0, 1, StackBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackBuilder_core_TagsAsMap(), ecorePackage.getEString(), "tagsAsMap", null, 0, 1,
				StackBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackBuilder_core_TerminationProtection(), ecorePackage.getEBooleanObject(),
				"terminationProtection", null, 0, 1, StackBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackBuilder_core_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.core.Stack", 0, 1, StackBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				StackBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				StackBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0, 1,
				StackBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getStackBuilder_core_Serviceresources(), this.getServiceResources(), null, "serviceresources",
				null, 0, -1, StackBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vpcBuilder_ec2EClass, VpcBuilder_ec2.class, "VpcBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVpcBuilder_ec2_Cidr(), ecorePackage.getEString(), "cidr", null, 0, 1, VpcBuilder_ec2.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_DefaultInstanceTenancy(), this.getDefaultInstanceTenancy(),
				"defaultInstanceTenancy", null, 0, 1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_EnableDnsHostnames(), ecorePackage.getEBooleanObject(), "enableDnsHostnames",
				null, 0, 1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_EnableDnsSupport(), ecorePackage.getEBooleanObject(), "enableDnsSupport", null,
				0, 1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_FlowLogsAsMap(), ecorePackage.getEString(), "flowLogsAsMap", null, 0, 1,
				VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_GatewayEndpointsAsMap(), ecorePackage.getEString(), "gatewayEndpointsAsMap",
				null, 0, 1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_MaxAzs(), ecorePackage.getEInt(), "maxAzs", null, 0, 1, VpcBuilder_ec2.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_NatGatewayProviderWithNatProviderAsReference(), ecorePackage.getEString(),
				"natGatewayProviderWithNatProviderAsReference", null, 0, 1, VpcBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_NatGateways(), ecorePackage.getEInt(), "natGateways", null, 0, 1,
				VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_NatGatewaySubnetsWithSubnetSelectionAsReference(), ecorePackage.getEString(),
				"natGatewaySubnetsWithSubnetSelectionAsReference", null, 0, 1, VpcBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_SubnetConfigurationAsList(), ecorePackage.getEString(),
				"subnetConfigurationAsList", null, 0, 1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_VpnConnectionsAsMap(), ecorePackage.getEString(), "vpnConnectionsAsMap", null,
				0, 1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_VpnGateway(), ecorePackage.getEBooleanObject(), "vpnGateway", null, 0, 1,
				VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_VpnGatewayAsn(), ecorePackage.getEInt(), "vpnGatewayAsn", null, 0, 1,
				VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_VpnRoutePropagationAsList(), ecorePackage.getEString(),
				"vpnRoutePropagationAsList", null, 0, 1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.ec2.Vpc", 0, 1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0, 1,
				VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(serviceResourcesEClass, ServiceResources.class, "ServiceResources", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(defaultInstanceTenancyEEnum, DefaultInstanceTenancy.class, "DefaultInstanceTenancy");
		addEEnumLiteral(defaultInstanceTenancyEEnum, DefaultInstanceTenancy.DEFAULT);
		addEEnumLiteral(defaultInstanceTenancyEEnum, DefaultInstanceTenancy.DEDICATED);

		// Create resource
		createResource(eNS_URI);
	}

} //AwsworkbenchPackageImpl
