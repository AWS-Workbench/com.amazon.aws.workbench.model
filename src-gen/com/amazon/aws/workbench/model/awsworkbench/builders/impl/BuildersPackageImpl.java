/**
 */
package com.amazon.aws.workbench.model.awsworkbench.builders.impl;

import com.amazon.aws.workbench.model.awsworkbench.builders.AppBuilder;
import com.amazon.aws.workbench.model.awsworkbench.builders.BuildersFactory;
import com.amazon.aws.workbench.model.awsworkbench.builders.BuildersPackage;
import com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder;

import com.amazon.aws.workbench.model.awsworkbench.datatypes.java.lang.LangPackage;

import com.amazon.aws.workbench.model.awsworkbench.datatypes.java.lang.impl.LangPackageImpl;

import com.amazon.aws.workbench.model.awsworkbench.enums.EnumsPackage;
import com.amazon.aws.workbench.model.awsworkbench.enums.impl.EnumsPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BuildersPackageImpl extends EPackageImpl implements BuildersPackage {
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
	private EClass appBuilderEClass = null;

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
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.BuildersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BuildersPackageImpl() {
		super(eNS_URI, BuildersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BuildersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BuildersPackage init() {
		if (isInited)
			return (BuildersPackage) EPackage.Registry.INSTANCE.getEPackage(BuildersPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBuildersPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BuildersPackageImpl theBuildersPackage = registeredBuildersPackage instanceof BuildersPackageImpl
				? (BuildersPackageImpl) registeredBuildersPackage
				: new BuildersPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI);
		LangPackageImpl theLangPackage = (LangPackageImpl) (registeredPackage instanceof LangPackageImpl
				? registeredPackage
				: LangPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI);
		EnumsPackageImpl theEnumsPackage = (EnumsPackageImpl) (registeredPackage instanceof EnumsPackageImpl
				? registeredPackage
				: EnumsPackage.eINSTANCE);

		// Create package meta-data objects
		theBuildersPackage.createPackageContents();
		theLangPackage.createPackageContents();
		theEnumsPackage.createPackageContents();

		// Initialize created meta-data
		theBuildersPackage.initializePackageContents();
		theLangPackage.initializePackageContents();
		theEnumsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBuildersPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BuildersPackage.eNS_URI, theBuildersPackage);
		return theBuildersPackage;
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
	public EReference getAppBuilder_Vpcbuilder() {
		return (EReference) appBuilderEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BuildersFactory getBuildersFactory() {
		return (BuildersFactory) getEFactoryInstance();
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
		createEReference(appBuilderEClass, APP_BUILDER__VPCBUILDER);
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

		// Obtain other dependent packages
		LangPackage theLangPackage = (LangPackage) EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI);
		EnumsPackage theEnumsPackage = (EnumsPackage) EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
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
		initEAttribute(getVpcBuilder_MaxAzs(), theLangPackage.getNumber(), "maxAzs", null, 0, 1, VpcBuilder.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_NatGateways(), theLangPackage.getNumber(), "natGateways", null, 0, 1,
				VpcBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_VpnGateway(), ecorePackage.getEBooleanObject(), "vpnGateway", null, 0, 1,
				VpcBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_VpnGatewayAsn(), theLangPackage.getNumber(), "vpnGatewayAsn", null, 0, 1,
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
		initEAttribute(getVpcBuilder_DefaultInstanceTenancy(), theEnumsPackage.getDefaultInstanceTenancy(),
				"defaultInstanceTenancy", null, 0, 1, VpcBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getAppBuilder_Vpcbuilder(), this.getVpcBuilder(), null, "vpcbuilder", null, 0, -1,
				AppBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BuildersPackageImpl
