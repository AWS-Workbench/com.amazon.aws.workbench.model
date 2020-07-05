/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AppBuilder;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchFactory;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.DefaultInstanceTenancy;
import com.amazon.aws.workbench.model.awsworkbench.ServiceResources;
import com.amazon.aws.workbench.model.awsworkbench.StackBuilder;
import com.amazon.aws.workbench.model.awsworkbench.VpcBuilder;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
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
	private EClass appBuilderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stackBuilderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vpcBuilderEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType numberEDataType = null;

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
	public EClass getAppBuilder() {
		return appBuilderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_AutoSynth() {
		return (EAttribute) appBuilderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_Outdir() {
		return (EAttribute) appBuilderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_RuntimeInfo() {
		return (EAttribute) appBuilderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_StackTraces() {
		return (EAttribute) appBuilderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_TreeMetadata() {
		return (EAttribute) appBuilderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_GeneratedClassName() {
		return (EAttribute) appBuilderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_VarName() {
		return (EAttribute) appBuilderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_Identifier() {
		return (EAttribute) appBuilderEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_AdditionalCode() {
		return (EAttribute) appBuilderEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAppBuilder_Stackbuilder() {
		return (EReference) appBuilderEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStackBuilder() {
		return stackBuilderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackBuilder_Description() {
		return (EAttribute) stackBuilderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackBuilder_StackName() {
		return (EAttribute) stackBuilderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackBuilder_TerminationProtection() {
		return (EAttribute) stackBuilderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackBuilder_GeneratedClassName() {
		return (EAttribute) stackBuilderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackBuilder_VarName() {
		return (EAttribute) stackBuilderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackBuilder_Identifier() {
		return (EAttribute) stackBuilderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackBuilder_AdditionalCode() {
		return (EAttribute) stackBuilderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStackBuilder_Serviceresources() {
		return (EReference) stackBuilderEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVpcBuilder() {
		return vpcBuilderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_Cidr() {
		return (EAttribute) vpcBuilderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_EnableDnsHostnames() {
		return (EAttribute) vpcBuilderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_EnableDnsSupport() {
		return (EAttribute) vpcBuilderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_MaxAzs() {
		return (EAttribute) vpcBuilderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_NatGateways() {
		return (EAttribute) vpcBuilderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_VpnGateway() {
		return (EAttribute) vpcBuilderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_VpnGatewayAsn() {
		return (EAttribute) vpcBuilderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_GeneratedClassName() {
		return (EAttribute) vpcBuilderEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_VarName() {
		return (EAttribute) vpcBuilderEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_Identifier() {
		return (EAttribute) vpcBuilderEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_AdditionalCode() {
		return (EAttribute) vpcBuilderEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_DefaultInstanceTenancy() {
		return (EAttribute) vpcBuilderEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_Mytype() {
		return (EAttribute) vpcBuilderEClass.getEStructuralFeatures().get(12);
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
	public EAttribute getServiceResources_Mapstype() {
		return (EAttribute) serviceResourcesEClass.getEStructuralFeatures().get(0);
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
	public EDataType getNumber() {
		return numberEDataType;
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
		appBuilderEClass = createEClass(APP_BUILDER);
		createEAttribute(appBuilderEClass, APP_BUILDER__AUTO_SYNTH);
		createEAttribute(appBuilderEClass, APP_BUILDER__OUTDIR);
		createEAttribute(appBuilderEClass, APP_BUILDER__RUNTIME_INFO);
		createEAttribute(appBuilderEClass, APP_BUILDER__STACK_TRACES);
		createEAttribute(appBuilderEClass, APP_BUILDER__TREE_METADATA);
		createEAttribute(appBuilderEClass, APP_BUILDER__GENERATED_CLASS_NAME);
		createEAttribute(appBuilderEClass, APP_BUILDER__VAR_NAME);
		createEAttribute(appBuilderEClass, APP_BUILDER__IDENTIFIER);
		createEAttribute(appBuilderEClass, APP_BUILDER__ADDITIONAL_CODE);
		createEReference(appBuilderEClass, APP_BUILDER__STACKBUILDER);

		stackBuilderEClass = createEClass(STACK_BUILDER);
		createEAttribute(stackBuilderEClass, STACK_BUILDER__DESCRIPTION);
		createEAttribute(stackBuilderEClass, STACK_BUILDER__STACK_NAME);
		createEAttribute(stackBuilderEClass, STACK_BUILDER__TERMINATION_PROTECTION);
		createEAttribute(stackBuilderEClass, STACK_BUILDER__GENERATED_CLASS_NAME);
		createEAttribute(stackBuilderEClass, STACK_BUILDER__VAR_NAME);
		createEAttribute(stackBuilderEClass, STACK_BUILDER__IDENTIFIER);
		createEAttribute(stackBuilderEClass, STACK_BUILDER__ADDITIONAL_CODE);
		createEReference(stackBuilderEClass, STACK_BUILDER__SERVICERESOURCES);

		vpcBuilderEClass = createEClass(VPC_BUILDER);
		createEAttribute(vpcBuilderEClass, VPC_BUILDER__CIDR);
		createEAttribute(vpcBuilderEClass, VPC_BUILDER__ENABLE_DNS_HOSTNAMES);
		createEAttribute(vpcBuilderEClass, VPC_BUILDER__ENABLE_DNS_SUPPORT);
		createEAttribute(vpcBuilderEClass, VPC_BUILDER__MAX_AZS);
		createEAttribute(vpcBuilderEClass, VPC_BUILDER__NAT_GATEWAYS);
		createEAttribute(vpcBuilderEClass, VPC_BUILDER__VPN_GATEWAY);
		createEAttribute(vpcBuilderEClass, VPC_BUILDER__VPN_GATEWAY_ASN);
		createEAttribute(vpcBuilderEClass, VPC_BUILDER__GENERATED_CLASS_NAME);
		createEAttribute(vpcBuilderEClass, VPC_BUILDER__VAR_NAME);
		createEAttribute(vpcBuilderEClass, VPC_BUILDER__IDENTIFIER);
		createEAttribute(vpcBuilderEClass, VPC_BUILDER__ADDITIONAL_CODE);
		createEAttribute(vpcBuilderEClass, VPC_BUILDER__DEFAULT_INSTANCE_TENANCY);
		createEAttribute(vpcBuilderEClass, VPC_BUILDER__MYTYPE);

		serviceResourcesEClass = createEClass(SERVICE_RESOURCES);
		createEAttribute(serviceResourcesEClass, SERVICE_RESOURCES__MAPSTYPE);

		// Create enums
		defaultInstanceTenancyEEnum = createEEnum(DEFAULT_INSTANCE_TENANCY);

		// Create data types
		numberEDataType = createEDataType(NUMBER);
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
		vpcBuilderEClass.getESuperTypes().add(this.getServiceResources());

		// Initialize classes, features, and operations; add parameters
		initEClass(appBuilderEClass, AppBuilder.class, "AppBuilder", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppBuilder_AutoSynth(), ecorePackage.getEBooleanObject(), "autoSynth", null, 0, 1,
				AppBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppBuilder_Outdir(), ecorePackage.getEString(), "outdir", null, 0, 1, AppBuilder.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppBuilder_RuntimeInfo(), ecorePackage.getEBooleanObject(), "runtimeInfo", null, 0, 1,
				AppBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppBuilder_StackTraces(), ecorePackage.getEBooleanObject(), "stackTraces", null, 0, 1,
				AppBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppBuilder_TreeMetadata(), ecorePackage.getEBooleanObject(), "treeMetadata", null, 0, 1,
				AppBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppBuilder_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.core.App", 0, 1, AppBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppBuilder_VarName(), ecorePackage.getEString(), "varName", null, 0, 1, AppBuilder.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppBuilder_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				AppBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppBuilder_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0, 1,
				AppBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAppBuilder_Stackbuilder(), this.getStackBuilder(), null, "stackbuilder", null, 0, -1,
				AppBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stackBuilderEClass, StackBuilder.class, "StackBuilder", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStackBuilder_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				StackBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackBuilder_StackName(), ecorePackage.getEString(), "stackName", null, 0, 1,
				StackBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackBuilder_TerminationProtection(), ecorePackage.getEBooleanObject(),
				"terminationProtection", null, 0, 1, StackBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackBuilder_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.core.Stack", 0, 1, StackBuilder.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackBuilder_VarName(), ecorePackage.getEString(), "varName", null, 0, 1, StackBuilder.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackBuilder_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				StackBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackBuilder_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0, 1,
				StackBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getStackBuilder_Serviceresources(), this.getServiceResources(), null, "serviceresources", null,
				0, -1, StackBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vpcBuilderEClass, VpcBuilder.class, "VpcBuilder", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVpcBuilder_Cidr(), ecorePackage.getEString(), "cidr", null, 0, 1, VpcBuilder.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_EnableDnsHostnames(), ecorePackage.getEBooleanObject(), "enableDnsHostnames", null,
				0, 1, VpcBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_EnableDnsSupport(), ecorePackage.getEBooleanObject(), "enableDnsSupport", null, 0,
				1, VpcBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_MaxAzs(), ecorePackage.getEIntegerObject(), "maxAzs", null, 0, 1, VpcBuilder.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_NatGateways(), ecorePackage.getEIntegerObject(), "natGateways", null, 0, 1,
				VpcBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_VpnGateway(), ecorePackage.getEBooleanObject(), "vpnGateway", null, 0, 1,
				VpcBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_VpnGatewayAsn(), ecorePackage.getEIntegerObject(), "vpnGatewayAsn", null, 0, 1,
				VpcBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.ec2.Vpc", 0, 1, VpcBuilder.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_VarName(), ecorePackage.getEString(), "varName", null, 0, 1, VpcBuilder.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				VpcBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0, 1,
				VpcBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_DefaultInstanceTenancy(), this.getDefaultInstanceTenancy(),
				"defaultInstanceTenancy", null, 0, 1, VpcBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEAttribute(getVpcBuilder_Mytype(), g1, "mytype", null, 0, 1, VpcBuilder.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceResourcesEClass, ServiceResources.class, "ServiceResources", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEAttribute(getServiceResources_Mapstype(), g1, "mapstype", null, 0, 1, ServiceResources.class, IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(defaultInstanceTenancyEEnum, DefaultInstanceTenancy.class, "DefaultInstanceTenancy");
		addEEnumLiteral(defaultInstanceTenancyEEnum, DefaultInstanceTenancy.DEFAULT);
		addEEnumLiteral(defaultInstanceTenancyEEnum, DefaultInstanceTenancy.DEDICATED);

		// Initialize data types
		initEDataType(numberEDataType, Number.class, "Number", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //AwsworkbenchPackageImpl
