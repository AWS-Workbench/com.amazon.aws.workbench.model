/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchFactory;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.DefaultInstanceTenancy;
import com.amazon.aws.workbench.model.awsworkbench.DefaultStackSynthesizerBuilder_core;
import com.amazon.aws.workbench.model.awsworkbench.EnvironmentBuilder_core;
import com.amazon.aws.workbench.model.awsworkbench.FlowLogOptionsBuilder_ec2;
import com.amazon.aws.workbench.model.awsworkbench.ServiceResources;
import com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core;
import com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2;
import com.amazon.aws.workbench.model.awsworkbench.SubnetConfigurationBuilder_ec2;
import com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2;
import com.amazon.aws.workbench.model.awsworkbench.SubnetType;
import com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2;
import com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2;
import com.amazon.aws.workbench.model.awsworkbench.VpnTunnelOptionBuilder_ec2;

import ec2.Ec2Package;

import ec2.impl.Ec2PackageImpl;

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
	private EClass serviceResourcesEClass = null;

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
	private EClass defaultStackSynthesizerBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowLogOptionsBuilder_ec2EClass = null;

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
	private EClass subnetBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subnetSelectionBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subnetConfigurationBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vpnConnectionOptionsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vpnTunnelOptionBuilder_ec2EClass = null;

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
	private EEnum subnetTypeEEnum = null;

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

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI);
		Ec2PackageImpl theEc2Package = (Ec2PackageImpl) (registeredPackage instanceof Ec2PackageImpl ? registeredPackage
				: Ec2Package.eINSTANCE);

		// Create package meta-data objects
		theAwsworkbenchPackage.createPackageContents();
		theEc2Package.createPackageContents();

		// Initialize created meta-data
		theAwsworkbenchPackage.initializePackageContents();
		theEc2Package.initializePackageContents();

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
	public EClass getServiceResources() {
		return serviceResourcesEClass;
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
	public EAttribute getAppBuilder_core_AutoSynth_java_lang_Boolean_() {
		return (EAttribute) appBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_core_Context_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) appBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_core_Outdir_java_lang_String_() {
		return (EAttribute) appBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_core_RuntimeInfo_java_lang_Boolean_() {
		return (EAttribute) appBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_core_StackTraces_java_lang_Boolean_() {
		return (EAttribute) appBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_core_TreeMetadata_java_lang_Boolean_() {
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
	public EReference getAppBuilder_core_Environmentbuilder_core() {
		return (EReference) appBuilder_coreEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAppBuilder_core_Defaultstacksynthesizerbuilder_core() {
		return (EReference) appBuilder_coreEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAppBuilder_core_Stackbuilder_core() {
		return (EReference) appBuilder_coreEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefaultStackSynthesizerBuilder_core() {
		return defaultStackSynthesizerBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultStackSynthesizerBuilder_core_AssetPublishingExternalId_java_lang_String_() {
		return (EAttribute) defaultStackSynthesizerBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultStackSynthesizerBuilder_core_AssetPublishingRoleArn_java_lang_String_() {
		return (EAttribute) defaultStackSynthesizerBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultStackSynthesizerBuilder_core_CloudFormationExecutionRole_java_lang_String_() {
		return (EAttribute) defaultStackSynthesizerBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultStackSynthesizerBuilder_core_DeployRoleArn_java_lang_String_() {
		return (EAttribute) defaultStackSynthesizerBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultStackSynthesizerBuilder_core_FileAssetsBucketName_java_lang_String_() {
		return (EAttribute) defaultStackSynthesizerBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultStackSynthesizerBuilder_core_ImageAssetsRepositoryName_java_lang_String_() {
		return (EAttribute) defaultStackSynthesizerBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultStackSynthesizerBuilder_core_Qualifier_java_lang_String_() {
		return (EAttribute) defaultStackSynthesizerBuilder_coreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultStackSynthesizerBuilder_core_GeneratedClassName() {
		return (EAttribute) defaultStackSynthesizerBuilder_coreEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultStackSynthesizerBuilder_core_VarName() {
		return (EAttribute) defaultStackSynthesizerBuilder_coreEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultStackSynthesizerBuilder_core_Identifier() {
		return (EAttribute) defaultStackSynthesizerBuilder_coreEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultStackSynthesizerBuilder_core_AdditionalCode() {
		return (EAttribute) defaultStackSynthesizerBuilder_coreEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvironmentBuilder_core() {
		return environmentBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironmentBuilder_core_Account_java_lang_String_() {
		return (EAttribute) environmentBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironmentBuilder_core_Region_java_lang_String_() {
		return (EAttribute) environmentBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironmentBuilder_core_GeneratedClassName() {
		return (EAttribute) environmentBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironmentBuilder_core_VarName() {
		return (EAttribute) environmentBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironmentBuilder_core_Identifier() {
		return (EAttribute) environmentBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironmentBuilder_core_AdditionalCode() {
		return (EAttribute) environmentBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlowLogOptionsBuilder_ec2() {
		return flowLogOptionsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogOptionsBuilder_ec2_DestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference() {
		return (EAttribute) flowLogOptionsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogOptionsBuilder_ec2_TrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_() {
		return (EAttribute) flowLogOptionsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogOptionsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) flowLogOptionsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogOptionsBuilder_ec2_VarName() {
		return (EAttribute) flowLogOptionsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogOptionsBuilder_ec2_Identifier() {
		return (EAttribute) flowLogOptionsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogOptionsBuilder_ec2_AdditionalCode() {
		return (EAttribute) flowLogOptionsBuilder_ec2EClass.getEStructuralFeatures().get(5);
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
	public EAttribute getStackBuilder_core_Description_java_lang_String_() {
		return (EAttribute) stackBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackBuilder_core_EnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference() {
		return (EAttribute) stackBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackBuilder_core_StackName_java_lang_String_() {
		return (EAttribute) stackBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackBuilder_core_SynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference() {
		return (EAttribute) stackBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackBuilder_core_Tags_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) stackBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackBuilder_core_TerminationProtection_java_lang_Boolean_() {
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
	public EAttribute getVpcBuilder_ec2_Cidr_java_lang_String_() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_DefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_EnableDnsHostnames_java_lang_Boolean_() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_EnableDnsSupport_java_lang_Boolean_() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_FlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_GatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_MaxAzs_java_lang_Number_() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_NatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_NatGateways_java_lang_Number_() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_NatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_SubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_VpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_VpnGateway_java_lang_Boolean_() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_VpnGatewayAsn_java_lang_Number_() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_VpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList() {
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
	public EReference getVpcBuilder_ec2_Subnetbuilder_ec2() {
		return (EReference) vpcBuilder_ec2EClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVpcBuilder_ec2_Subnetselectionbuilder_ec2() {
		return (EReference) vpcBuilder_ec2EClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVpcBuilder_ec2_Subnetconfigurationbuilder_ec2() {
		return (EReference) vpcBuilder_ec2EClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVpcBuilder_ec2_Vpntunneloptionbuilder_ec2() {
		return (EReference) vpcBuilder_ec2EClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVpcBuilder_ec2_Vpnconnectionoptionsbuilder_ec2() {
		return (EReference) vpcBuilder_ec2EClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubnetBuilder_ec2() {
		return subnetBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetBuilder_ec2_AvailabilityZone_java_lang_String_() {
		return (EAttribute) subnetBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetBuilder_ec2_CidrBlock_java_lang_String_() {
		return (EAttribute) subnetBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetBuilder_ec2_VpcId_java_lang_String_() {
		return (EAttribute) subnetBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetBuilder_ec2_MapPublicIpOnLaunch_java_lang_Boolean_() {
		return (EAttribute) subnetBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetBuilder_ec2_GeneratedClassName() {
		return (EAttribute) subnetBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetBuilder_ec2_VarName() {
		return (EAttribute) subnetBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetBuilder_ec2_Identifier() {
		return (EAttribute) subnetBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetBuilder_ec2_AdditionalCode() {
		return (EAttribute) subnetBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubnetSelectionBuilder_ec2() {
		return subnetSelectionBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetSelectionBuilder_ec2_AvailabilityZones_java_lang_String_AsList() {
		return (EAttribute) subnetSelectionBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetSelectionBuilder_ec2_OnePerAz_java_lang_Boolean_() {
		return (EAttribute) subnetSelectionBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetSelectionBuilder_ec2_SubnetGroupName_java_lang_String_() {
		return (EAttribute) subnetSelectionBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetSelectionBuilder_ec2_SubnetName_java_lang_String_() {
		return (EAttribute) subnetSelectionBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetSelectionBuilder_ec2_Subnets_software_amazon_awscdk_services_ec2_ISubnet_AsList() {
		return (EAttribute) subnetSelectionBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetSelectionBuilder_ec2_SubnetType_software_amazon_awscdk_services_ec2_SubnetType_() {
		return (EAttribute) subnetSelectionBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetSelectionBuilder_ec2_GeneratedClassName() {
		return (EAttribute) subnetSelectionBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetSelectionBuilder_ec2_VarName() {
		return (EAttribute) subnetSelectionBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetSelectionBuilder_ec2_Identifier() {
		return (EAttribute) subnetSelectionBuilder_ec2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetSelectionBuilder_ec2_AdditionalCode() {
		return (EAttribute) subnetSelectionBuilder_ec2EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubnetConfigurationBuilder_ec2() {
		return subnetConfigurationBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetConfigurationBuilder_ec2_Name_java_lang_String_() {
		return (EAttribute) subnetConfigurationBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetConfigurationBuilder_ec2_SubnetType_software_amazon_awscdk_services_ec2_SubnetType_() {
		return (EAttribute) subnetConfigurationBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetConfigurationBuilder_ec2_CidrMask_java_lang_Number_() {
		return (EAttribute) subnetConfigurationBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetConfigurationBuilder_ec2_Reserved_java_lang_Boolean_() {
		return (EAttribute) subnetConfigurationBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetConfigurationBuilder_ec2_GeneratedClassName() {
		return (EAttribute) subnetConfigurationBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetConfigurationBuilder_ec2_VarName() {
		return (EAttribute) subnetConfigurationBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetConfigurationBuilder_ec2_Identifier() {
		return (EAttribute) subnetConfigurationBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetConfigurationBuilder_ec2_AdditionalCode() {
		return (EAttribute) subnetConfigurationBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVpnConnectionOptionsBuilder_ec2() {
		return vpnConnectionOptionsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnConnectionOptionsBuilder_ec2_Ip_java_lang_String_() {
		return (EAttribute) vpnConnectionOptionsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnConnectionOptionsBuilder_ec2_Asn_java_lang_Number_() {
		return (EAttribute) vpnConnectionOptionsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnConnectionOptionsBuilder_ec2_StaticRoutes_java_lang_String_AsList() {
		return (EAttribute) vpnConnectionOptionsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnConnectionOptionsBuilder_ec2_TunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList() {
		return (EAttribute) vpnConnectionOptionsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnConnectionOptionsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) vpnConnectionOptionsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnConnectionOptionsBuilder_ec2_VarName() {
		return (EAttribute) vpnConnectionOptionsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnConnectionOptionsBuilder_ec2_Identifier() {
		return (EAttribute) vpnConnectionOptionsBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnConnectionOptionsBuilder_ec2_AdditionalCode() {
		return (EAttribute) vpnConnectionOptionsBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVpnTunnelOptionBuilder_ec2() {
		return vpnTunnelOptionBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnTunnelOptionBuilder_ec2_PreSharedKey_java_lang_String_() {
		return (EAttribute) vpnTunnelOptionBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnTunnelOptionBuilder_ec2_TunnelInsideCidr_java_lang_String_() {
		return (EAttribute) vpnTunnelOptionBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnTunnelOptionBuilder_ec2_GeneratedClassName() {
		return (EAttribute) vpnTunnelOptionBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnTunnelOptionBuilder_ec2_VarName() {
		return (EAttribute) vpnTunnelOptionBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnTunnelOptionBuilder_ec2_Identifier() {
		return (EAttribute) vpnTunnelOptionBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnTunnelOptionBuilder_ec2_AdditionalCode() {
		return (EAttribute) vpnTunnelOptionBuilder_ec2EClass.getEStructuralFeatures().get(5);
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
	public EEnum getSubnetType() {
		return subnetTypeEEnum;
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
		serviceResourcesEClass = createEClass(SERVICE_RESOURCES);

		appBuilder_coreEClass = createEClass(APP_BUILDER_CORE);
		createEAttribute(appBuilder_coreEClass, APP_BUILDER_CORE__AUTO_SYNTH_JAVA_LANG_BOOLEAN_);
		createEAttribute(appBuilder_coreEClass, APP_BUILDER_CORE__CONTEXT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(appBuilder_coreEClass, APP_BUILDER_CORE__OUTDIR_JAVA_LANG_STRING_);
		createEAttribute(appBuilder_coreEClass, APP_BUILDER_CORE__RUNTIME_INFO_JAVA_LANG_BOOLEAN_);
		createEAttribute(appBuilder_coreEClass, APP_BUILDER_CORE__STACK_TRACES_JAVA_LANG_BOOLEAN_);
		createEAttribute(appBuilder_coreEClass, APP_BUILDER_CORE__TREE_METADATA_JAVA_LANG_BOOLEAN_);
		createEAttribute(appBuilder_coreEClass, APP_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(appBuilder_coreEClass, APP_BUILDER_CORE__VAR_NAME);
		createEAttribute(appBuilder_coreEClass, APP_BUILDER_CORE__IDENTIFIER);
		createEAttribute(appBuilder_coreEClass, APP_BUILDER_CORE__ADDITIONAL_CODE);
		createEReference(appBuilder_coreEClass, APP_BUILDER_CORE__ENVIRONMENTBUILDER_CORE);
		createEReference(appBuilder_coreEClass, APP_BUILDER_CORE__DEFAULTSTACKSYNTHESIZERBUILDER_CORE);
		createEReference(appBuilder_coreEClass, APP_BUILDER_CORE__STACKBUILDER_CORE);

		defaultStackSynthesizerBuilder_coreEClass = createEClass(DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE);
		createEAttribute(defaultStackSynthesizerBuilder_coreEClass,
				DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__ASSET_PUBLISHING_EXTERNAL_ID_JAVA_LANG_STRING_);
		createEAttribute(defaultStackSynthesizerBuilder_coreEClass,
				DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__ASSET_PUBLISHING_ROLE_ARN_JAVA_LANG_STRING_);
		createEAttribute(defaultStackSynthesizerBuilder_coreEClass,
				DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__CLOUD_FORMATION_EXECUTION_ROLE_JAVA_LANG_STRING_);
		createEAttribute(defaultStackSynthesizerBuilder_coreEClass,
				DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__DEPLOY_ROLE_ARN_JAVA_LANG_STRING_);
		createEAttribute(defaultStackSynthesizerBuilder_coreEClass,
				DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__FILE_ASSETS_BUCKET_NAME_JAVA_LANG_STRING_);
		createEAttribute(defaultStackSynthesizerBuilder_coreEClass,
				DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__IMAGE_ASSETS_REPOSITORY_NAME_JAVA_LANG_STRING_);
		createEAttribute(defaultStackSynthesizerBuilder_coreEClass,
				DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__QUALIFIER_JAVA_LANG_STRING_);
		createEAttribute(defaultStackSynthesizerBuilder_coreEClass,
				DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(defaultStackSynthesizerBuilder_coreEClass, DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__VAR_NAME);
		createEAttribute(defaultStackSynthesizerBuilder_coreEClass, DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__IDENTIFIER);
		createEAttribute(defaultStackSynthesizerBuilder_coreEClass,
				DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__ADDITIONAL_CODE);

		environmentBuilder_coreEClass = createEClass(ENVIRONMENT_BUILDER_CORE);
		createEAttribute(environmentBuilder_coreEClass, ENVIRONMENT_BUILDER_CORE__ACCOUNT_JAVA_LANG_STRING_);
		createEAttribute(environmentBuilder_coreEClass, ENVIRONMENT_BUILDER_CORE__REGION_JAVA_LANG_STRING_);
		createEAttribute(environmentBuilder_coreEClass, ENVIRONMENT_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(environmentBuilder_coreEClass, ENVIRONMENT_BUILDER_CORE__VAR_NAME);
		createEAttribute(environmentBuilder_coreEClass, ENVIRONMENT_BUILDER_CORE__IDENTIFIER);
		createEAttribute(environmentBuilder_coreEClass, ENVIRONMENT_BUILDER_CORE__ADDITIONAL_CODE);

		flowLogOptionsBuilder_ec2EClass = createEClass(FLOW_LOG_OPTIONS_BUILDER_EC2);
		createEAttribute(flowLogOptionsBuilder_ec2EClass,
				FLOW_LOG_OPTIONS_BUILDER_EC2__DESTINATION_WITH_FLOW_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_AS_REFERENCE);
		createEAttribute(flowLogOptionsBuilder_ec2EClass,
				FLOW_LOG_OPTIONS_BUILDER_EC2__TRAFFIC_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_TRAFFIC_TYPE_);
		createEAttribute(flowLogOptionsBuilder_ec2EClass, FLOW_LOG_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(flowLogOptionsBuilder_ec2EClass, FLOW_LOG_OPTIONS_BUILDER_EC2__VAR_NAME);
		createEAttribute(flowLogOptionsBuilder_ec2EClass, FLOW_LOG_OPTIONS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(flowLogOptionsBuilder_ec2EClass, FLOW_LOG_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE);

		stackBuilder_coreEClass = createEClass(STACK_BUILDER_CORE);
		createEAttribute(stackBuilder_coreEClass, STACK_BUILDER_CORE__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(stackBuilder_coreEClass,
				STACK_BUILDER_CORE__ENV_WITH_ENVIRONMENT_SOFTWARE_AMAZON_AWSCDK_CORE_ENVIRONMENT_AS_REFERENCE);
		createEAttribute(stackBuilder_coreEClass, STACK_BUILDER_CORE__STACK_NAME_JAVA_LANG_STRING_);
		createEAttribute(stackBuilder_coreEClass,
				STACK_BUILDER_CORE__SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_SOFTWARE_AMAZON_AWSCDK_CORE_ISTACK_SYNTHESIZER_AS_REFERENCE);
		createEAttribute(stackBuilder_coreEClass, STACK_BUILDER_CORE__TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(stackBuilder_coreEClass, STACK_BUILDER_CORE__TERMINATION_PROTECTION_JAVA_LANG_BOOLEAN_);
		createEAttribute(stackBuilder_coreEClass, STACK_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(stackBuilder_coreEClass, STACK_BUILDER_CORE__VAR_NAME);
		createEAttribute(stackBuilder_coreEClass, STACK_BUILDER_CORE__IDENTIFIER);
		createEAttribute(stackBuilder_coreEClass, STACK_BUILDER_CORE__ADDITIONAL_CODE);
		createEReference(stackBuilder_coreEClass, STACK_BUILDER_CORE__SERVICERESOURCES);

		vpcBuilder_ec2EClass = createEClass(VPC_BUILDER_EC2);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__CIDR_JAVA_LANG_STRING_);
		createEAttribute(vpcBuilder_ec2EClass,
				VPC_BUILDER_EC2__DEFAULT_INSTANCE_TENANCY_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_DEFAULT_INSTANCE_TENANCY_);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__ENABLE_DNS_HOSTNAMES_JAVA_LANG_BOOLEAN_);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__ENABLE_DNS_SUPPORT_JAVA_LANG_BOOLEAN_);
		createEAttribute(vpcBuilder_ec2EClass,
				VPC_BUILDER_EC2__FLOW_LOGS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_OPTIONS_AS_MAP);
		createEAttribute(vpcBuilder_ec2EClass,
				VPC_BUILDER_EC2__GATEWAY_ENDPOINTS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_GATEWAY_VPC_ENDPOINT_OPTIONS_AS_MAP);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__MAX_AZS_JAVA_LANG_NUMBER_);
		createEAttribute(vpcBuilder_ec2EClass,
				VPC_BUILDER_EC2__NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_NAT_PROVIDER_AS_REFERENCE);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__NAT_GATEWAYS_JAVA_LANG_NUMBER_);
		createEAttribute(vpcBuilder_ec2EClass,
				VPC_BUILDER_EC2__NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE);
		createEAttribute(vpcBuilder_ec2EClass,
				VPC_BUILDER_EC2__SUBNET_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_CONFIGURATION_AS_LIST);
		createEAttribute(vpcBuilder_ec2EClass,
				VPC_BUILDER_EC2__VPN_CONNECTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_CONNECTION_OPTIONS_AS_MAP);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__VPN_GATEWAY_JAVA_LANG_BOOLEAN_);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__VPN_GATEWAY_ASN_JAVA_LANG_NUMBER_);
		createEAttribute(vpcBuilder_ec2EClass,
				VPC_BUILDER_EC2__VPN_ROUTE_PROPAGATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__VAR_NAME);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__IDENTIFIER);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__ADDITIONAL_CODE);
		createEReference(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__SUBNETBUILDER_EC2);
		createEReference(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__SUBNETSELECTIONBUILDER_EC2);
		createEReference(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__SUBNETCONFIGURATIONBUILDER_EC2);
		createEReference(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__VPNTUNNELOPTIONBUILDER_EC2);
		createEReference(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__VPNCONNECTIONOPTIONSBUILDER_EC2);

		subnetBuilder_ec2EClass = createEClass(SUBNET_BUILDER_EC2);
		createEAttribute(subnetBuilder_ec2EClass, SUBNET_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_);
		createEAttribute(subnetBuilder_ec2EClass, SUBNET_BUILDER_EC2__CIDR_BLOCK_JAVA_LANG_STRING_);
		createEAttribute(subnetBuilder_ec2EClass, SUBNET_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_);
		createEAttribute(subnetBuilder_ec2EClass, SUBNET_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH_JAVA_LANG_BOOLEAN_);
		createEAttribute(subnetBuilder_ec2EClass, SUBNET_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(subnetBuilder_ec2EClass, SUBNET_BUILDER_EC2__VAR_NAME);
		createEAttribute(subnetBuilder_ec2EClass, SUBNET_BUILDER_EC2__IDENTIFIER);
		createEAttribute(subnetBuilder_ec2EClass, SUBNET_BUILDER_EC2__ADDITIONAL_CODE);

		subnetSelectionBuilder_ec2EClass = createEClass(SUBNET_SELECTION_BUILDER_EC2);
		createEAttribute(subnetSelectionBuilder_ec2EClass,
				SUBNET_SELECTION_BUILDER_EC2__AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(subnetSelectionBuilder_ec2EClass, SUBNET_SELECTION_BUILDER_EC2__ONE_PER_AZ_JAVA_LANG_BOOLEAN_);
		createEAttribute(subnetSelectionBuilder_ec2EClass,
				SUBNET_SELECTION_BUILDER_EC2__SUBNET_GROUP_NAME_JAVA_LANG_STRING_);
		createEAttribute(subnetSelectionBuilder_ec2EClass, SUBNET_SELECTION_BUILDER_EC2__SUBNET_NAME_JAVA_LANG_STRING_);
		createEAttribute(subnetSelectionBuilder_ec2EClass,
				SUBNET_SELECTION_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_LIST);
		createEAttribute(subnetSelectionBuilder_ec2EClass,
				SUBNET_SELECTION_BUILDER_EC2__SUBNET_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_TYPE_);
		createEAttribute(subnetSelectionBuilder_ec2EClass, SUBNET_SELECTION_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(subnetSelectionBuilder_ec2EClass, SUBNET_SELECTION_BUILDER_EC2__VAR_NAME);
		createEAttribute(subnetSelectionBuilder_ec2EClass, SUBNET_SELECTION_BUILDER_EC2__IDENTIFIER);
		createEAttribute(subnetSelectionBuilder_ec2EClass, SUBNET_SELECTION_BUILDER_EC2__ADDITIONAL_CODE);

		subnetConfigurationBuilder_ec2EClass = createEClass(SUBNET_CONFIGURATION_BUILDER_EC2);
		createEAttribute(subnetConfigurationBuilder_ec2EClass,
				SUBNET_CONFIGURATION_BUILDER_EC2__NAME_JAVA_LANG_STRING_);
		createEAttribute(subnetConfigurationBuilder_ec2EClass,
				SUBNET_CONFIGURATION_BUILDER_EC2__SUBNET_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_TYPE_);
		createEAttribute(subnetConfigurationBuilder_ec2EClass,
				SUBNET_CONFIGURATION_BUILDER_EC2__CIDR_MASK_JAVA_LANG_NUMBER_);
		createEAttribute(subnetConfigurationBuilder_ec2EClass,
				SUBNET_CONFIGURATION_BUILDER_EC2__RESERVED_JAVA_LANG_BOOLEAN_);
		createEAttribute(subnetConfigurationBuilder_ec2EClass, SUBNET_CONFIGURATION_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(subnetConfigurationBuilder_ec2EClass, SUBNET_CONFIGURATION_BUILDER_EC2__VAR_NAME);
		createEAttribute(subnetConfigurationBuilder_ec2EClass, SUBNET_CONFIGURATION_BUILDER_EC2__IDENTIFIER);
		createEAttribute(subnetConfigurationBuilder_ec2EClass, SUBNET_CONFIGURATION_BUILDER_EC2__ADDITIONAL_CODE);

		vpnConnectionOptionsBuilder_ec2EClass = createEClass(VPN_CONNECTION_OPTIONS_BUILDER_EC2);
		createEAttribute(vpnConnectionOptionsBuilder_ec2EClass,
				VPN_CONNECTION_OPTIONS_BUILDER_EC2__IP_JAVA_LANG_STRING_);
		createEAttribute(vpnConnectionOptionsBuilder_ec2EClass,
				VPN_CONNECTION_OPTIONS_BUILDER_EC2__ASN_JAVA_LANG_NUMBER_);
		createEAttribute(vpnConnectionOptionsBuilder_ec2EClass,
				VPN_CONNECTION_OPTIONS_BUILDER_EC2__STATIC_ROUTES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(vpnConnectionOptionsBuilder_ec2EClass,
				VPN_CONNECTION_OPTIONS_BUILDER_EC2__TUNNEL_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_TUNNEL_OPTION_AS_LIST);
		createEAttribute(vpnConnectionOptionsBuilder_ec2EClass,
				VPN_CONNECTION_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(vpnConnectionOptionsBuilder_ec2EClass, VPN_CONNECTION_OPTIONS_BUILDER_EC2__VAR_NAME);
		createEAttribute(vpnConnectionOptionsBuilder_ec2EClass, VPN_CONNECTION_OPTIONS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(vpnConnectionOptionsBuilder_ec2EClass, VPN_CONNECTION_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE);

		vpnTunnelOptionBuilder_ec2EClass = createEClass(VPN_TUNNEL_OPTION_BUILDER_EC2);
		createEAttribute(vpnTunnelOptionBuilder_ec2EClass,
				VPN_TUNNEL_OPTION_BUILDER_EC2__PRE_SHARED_KEY_JAVA_LANG_STRING_);
		createEAttribute(vpnTunnelOptionBuilder_ec2EClass,
				VPN_TUNNEL_OPTION_BUILDER_EC2__TUNNEL_INSIDE_CIDR_JAVA_LANG_STRING_);
		createEAttribute(vpnTunnelOptionBuilder_ec2EClass, VPN_TUNNEL_OPTION_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(vpnTunnelOptionBuilder_ec2EClass, VPN_TUNNEL_OPTION_BUILDER_EC2__VAR_NAME);
		createEAttribute(vpnTunnelOptionBuilder_ec2EClass, VPN_TUNNEL_OPTION_BUILDER_EC2__IDENTIFIER);
		createEAttribute(vpnTunnelOptionBuilder_ec2EClass, VPN_TUNNEL_OPTION_BUILDER_EC2__ADDITIONAL_CODE);

		// Create enums
		defaultInstanceTenancyEEnum = createEEnum(DEFAULT_INSTANCE_TENANCY);
		subnetTypeEEnum = createEEnum(SUBNET_TYPE);
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
		Ec2Package theEc2Package = (Ec2Package) EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vpcBuilder_ec2EClass.getESuperTypes().add(this.getServiceResources());
		subnetBuilder_ec2EClass.getESuperTypes().add(this.getServiceResources());
		subnetSelectionBuilder_ec2EClass.getESuperTypes().add(this.getServiceResources());
		subnetConfigurationBuilder_ec2EClass.getESuperTypes().add(this.getServiceResources());
		vpnConnectionOptionsBuilder_ec2EClass.getESuperTypes().add(this.getServiceResources());
		vpnTunnelOptionBuilder_ec2EClass.getESuperTypes().add(this.getServiceResources());

		// Initialize classes, features, and operations; add parameters
		initEClass(serviceResourcesEClass, ServiceResources.class, "ServiceResources", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(appBuilder_coreEClass, AppBuilder_core.class, "AppBuilder_core", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppBuilder_core_AutoSynth_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"autoSynth_java_lang_Boolean_", null, 0, 1, AppBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppBuilder_core_Context_java_lang_String__java_lang_String_AsMap(), ecorePackage.getEString(),
				"context_java_lang_String__java_lang_String_AsMap", null, 0, 1, AppBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppBuilder_core_Outdir_java_lang_String_(), ecorePackage.getEString(),
				"outdir_java_lang_String_", null, 0, 1, AppBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppBuilder_core_RuntimeInfo_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"runtimeInfo_java_lang_Boolean_", null, 0, 1, AppBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppBuilder_core_StackTraces_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"stackTraces_java_lang_Boolean_", null, 0, 1, AppBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppBuilder_core_TreeMetadata_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"treeMetadata_java_lang_Boolean_", null, 0, 1, AppBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEReference(getAppBuilder_core_Environmentbuilder_core(), this.getEnvironmentBuilder_core(), null,
				"environmentbuilder_core", null, 0, -1, AppBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppBuilder_core_Defaultstacksynthesizerbuilder_core(),
				this.getDefaultStackSynthesizerBuilder_core(), null, "defaultstacksynthesizerbuilder_core", null, 0, -1,
				AppBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppBuilder_core_Stackbuilder_core(), this.getStackBuilder_core(), null, "stackbuilder_core",
				null, 0, -1, AppBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultStackSynthesizerBuilder_coreEClass, DefaultStackSynthesizerBuilder_core.class,
				"DefaultStackSynthesizerBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefaultStackSynthesizerBuilder_core_AssetPublishingExternalId_java_lang_String_(),
				ecorePackage.getEString(), "assetPublishingExternalId_java_lang_String_", null, 0, 1,
				DefaultStackSynthesizerBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultStackSynthesizerBuilder_core_AssetPublishingRoleArn_java_lang_String_(),
				ecorePackage.getEString(), "assetPublishingRoleArn_java_lang_String_", null, 0, 1,
				DefaultStackSynthesizerBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultStackSynthesizerBuilder_core_CloudFormationExecutionRole_java_lang_String_(),
				ecorePackage.getEString(), "cloudFormationExecutionRole_java_lang_String_", null, 0, 1,
				DefaultStackSynthesizerBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultStackSynthesizerBuilder_core_DeployRoleArn_java_lang_String_(),
				ecorePackage.getEString(), "deployRoleArn_java_lang_String_", null, 0, 1,
				DefaultStackSynthesizerBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultStackSynthesizerBuilder_core_FileAssetsBucketName_java_lang_String_(),
				ecorePackage.getEString(), "fileAssetsBucketName_java_lang_String_", null, 0, 1,
				DefaultStackSynthesizerBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultStackSynthesizerBuilder_core_ImageAssetsRepositoryName_java_lang_String_(),
				ecorePackage.getEString(), "imageAssetsRepositoryName_java_lang_String_", null, 0, 1,
				DefaultStackSynthesizerBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultStackSynthesizerBuilder_core_Qualifier_java_lang_String_(), ecorePackage.getEString(),
				"qualifier_java_lang_String_", null, 0, 1, DefaultStackSynthesizerBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultStackSynthesizerBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.DefaultStackSynthesizer", 0, 1,
				DefaultStackSynthesizerBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultStackSynthesizerBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, DefaultStackSynthesizerBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultStackSynthesizerBuilder_core_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, DefaultStackSynthesizerBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultStackSynthesizerBuilder_core_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, DefaultStackSynthesizerBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentBuilder_coreEClass, EnvironmentBuilder_core.class, "EnvironmentBuilder_core",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvironmentBuilder_core_Account_java_lang_String_(), ecorePackage.getEString(),
				"account_java_lang_String_", null, 0, 1, EnvironmentBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentBuilder_core_Region_java_lang_String_(), ecorePackage.getEString(),
				"region_java_lang_String_", null, 0, 1, EnvironmentBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentBuilder_core_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.core.Environment", 0, 1, EnvironmentBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				EnvironmentBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				EnvironmentBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, EnvironmentBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowLogOptionsBuilder_ec2EClass, FlowLogOptionsBuilder_ec2.class, "FlowLogOptionsBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getFlowLogOptionsBuilder_ec2_DestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference(),
				ecorePackage.getEString(),
				"destinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference",
				null, 0, 1, FlowLogOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getFlowLogOptionsBuilder_ec2_TrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_(),
				theEc2Package.getFlowLogTrafficType(),
				"trafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_", null, 0, 1,
				FlowLogOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowLogOptionsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.FlowLogOptions", 0, 1,
				FlowLogOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowLogOptionsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				FlowLogOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowLogOptionsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				FlowLogOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowLogOptionsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, FlowLogOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stackBuilder_coreEClass, StackBuilder_core.class, "StackBuilder_core", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStackBuilder_core_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, StackBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackBuilder_core_EnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference(),
				ecorePackage.getEString(), "envWithEnvironment_software_amazon_awscdk_core_Environment_AsReference",
				null, 0, 1, StackBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackBuilder_core_StackName_java_lang_String_(), ecorePackage.getEString(),
				"stackName_java_lang_String_", null, 0, 1, StackBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getStackBuilder_core_SynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference(),
				ecorePackage.getEString(),
				"synthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference", null, 0,
				1, StackBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackBuilder_core_Tags_java_lang_String__java_lang_String_AsMap(), ecorePackage.getEString(),
				"tags_java_lang_String__java_lang_String_AsMap", null, 0, 1, StackBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackBuilder_core_TerminationProtection_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "terminationProtection_java_lang_Boolean_", null, 0, 1,
				StackBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
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
		initEAttribute(getVpcBuilder_ec2_Cidr_java_lang_String_(), ecorePackage.getEString(), "cidr_java_lang_String_",
				null, 0, 1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVpcBuilder_ec2_DefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_(),
				this.getDefaultInstanceTenancy(),
				"defaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_", null, 0, 1,
				VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_EnableDnsHostnames_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"enableDnsHostnames_java_lang_Boolean_", null, 0, 1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_EnableDnsSupport_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"enableDnsSupport_java_lang_Boolean_", null, 0, 1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVpcBuilder_ec2_FlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap(),
				ecorePackage.getEString(),
				"flowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap", null, 0, 1,
				VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVpcBuilder_ec2_GatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap(),
				ecorePackage.getEString(),
				"gatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap",
				null, 0, 1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_MaxAzs_java_lang_Number_(), ecorePackage.getEInt(), "maxAzs_java_lang_Number_",
				null, 0, 1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVpcBuilder_ec2_NatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference(),
				ecorePackage.getEString(),
				"natGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference", null,
				0, 1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_NatGateways_java_lang_Number_(), ecorePackage.getEInt(),
				"natGateways_java_lang_Number_", null, 0, 1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVpcBuilder_ec2_NatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(),
				ecorePackage.getEString(),
				"natGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference",
				null, 0, 1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVpcBuilder_ec2_SubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList(),
				ecorePackage.getEString(),
				"subnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList", null, 0, 1,
				VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVpcBuilder_ec2_VpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap(),
				ecorePackage.getEString(),
				"vpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap", null,
				0, 1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_VpnGateway_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"vpnGateway_java_lang_Boolean_", null, 0, 1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_VpnGatewayAsn_java_lang_Number_(), ecorePackage.getEInt(),
				"vpnGatewayAsn_java_lang_Number_", null, 0, 1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVpcBuilder_ec2_VpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList(),
				ecorePackage.getEString(),
				"vpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList", null, 0, 1,
				VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
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
		initEReference(getVpcBuilder_ec2_Subnetbuilder_ec2(), this.getSubnetBuilder_ec2(), null, "subnetbuilder_ec2",
				null, 0, -1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVpcBuilder_ec2_Subnetselectionbuilder_ec2(), this.getSubnetSelectionBuilder_ec2(), null,
				"subnetselectionbuilder_ec2", null, 0, -1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVpcBuilder_ec2_Subnetconfigurationbuilder_ec2(), this.getSubnetConfigurationBuilder_ec2(),
				null, "subnetconfigurationbuilder_ec2", null, 0, -1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVpcBuilder_ec2_Vpntunneloptionbuilder_ec2(), this.getVpnTunnelOptionBuilder_ec2(), null,
				"vpntunneloptionbuilder_ec2", null, 0, -1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVpcBuilder_ec2_Vpnconnectionoptionsbuilder_ec2(), this.getVpnConnectionOptionsBuilder_ec2(),
				null, "vpnconnectionoptionsbuilder_ec2", null, 0, -1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subnetBuilder_ec2EClass, SubnetBuilder_ec2.class, "SubnetBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubnetBuilder_ec2_AvailabilityZone_java_lang_String_(), ecorePackage.getEString(),
				"availabilityZone_java_lang_String_", null, 0, 1, SubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetBuilder_ec2_CidrBlock_java_lang_String_(), ecorePackage.getEString(),
				"cidrBlock_java_lang_String_", null, 0, 1, SubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetBuilder_ec2_VpcId_java_lang_String_(), ecorePackage.getEString(),
				"vpcId_java_lang_String_", null, 0, 1, SubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetBuilder_ec2_MapPublicIpOnLaunch_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"mapPublicIpOnLaunch_java_lang_Boolean_", null, 0, 1, SubnetBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.ec2.Subnet", 0, 1, SubnetBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				SubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				SubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0, 1,
				SubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(subnetSelectionBuilder_ec2EClass, SubnetSelectionBuilder_ec2.class, "SubnetSelectionBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubnetSelectionBuilder_ec2_AvailabilityZones_java_lang_String_AsList(),
				ecorePackage.getEString(), "availabilityZones_java_lang_String_AsList", null, 0, 1,
				SubnetSelectionBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetSelectionBuilder_ec2_OnePerAz_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"onePerAz_java_lang_Boolean_", null, 0, 1, SubnetSelectionBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetSelectionBuilder_ec2_SubnetGroupName_java_lang_String_(), ecorePackage.getEString(),
				"subnetGroupName_java_lang_String_", null, 0, 1, SubnetSelectionBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetSelectionBuilder_ec2_SubnetName_java_lang_String_(), ecorePackage.getEString(),
				"subnetName_java_lang_String_", null, 0, 1, SubnetSelectionBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetSelectionBuilder_ec2_Subnets_software_amazon_awscdk_services_ec2_ISubnet_AsList(),
				ecorePackage.getEString(), "subnets_software_amazon_awscdk_services_ec2_ISubnet_AsList", null, 0, 1,
				SubnetSelectionBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetSelectionBuilder_ec2_SubnetType_software_amazon_awscdk_services_ec2_SubnetType_(),
				theEc2Package.getSubnetType(), "subnetType_software_amazon_awscdk_services_ec2_SubnetType_", null, 0, 1,
				SubnetSelectionBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetSelectionBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.SubnetSelection", 0, 1,
				SubnetSelectionBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetSelectionBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				SubnetSelectionBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetSelectionBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				SubnetSelectionBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetSelectionBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, SubnetSelectionBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subnetConfigurationBuilder_ec2EClass, SubnetConfigurationBuilder_ec2.class,
				"SubnetConfigurationBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubnetConfigurationBuilder_ec2_Name_java_lang_String_(), ecorePackage.getEString(),
				"name_java_lang_String_", null, 0, 1, SubnetConfigurationBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetConfigurationBuilder_ec2_SubnetType_software_amazon_awscdk_services_ec2_SubnetType_(),
				theEc2Package.getSubnetType(), "subnetType_software_amazon_awscdk_services_ec2_SubnetType_", null, 0, 1,
				SubnetConfigurationBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetConfigurationBuilder_ec2_CidrMask_java_lang_Number_(), ecorePackage.getEInt(),
				"cidrMask_java_lang_Number_", null, 0, 1, SubnetConfigurationBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetConfigurationBuilder_ec2_Reserved_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "reserved_java_lang_Boolean_", null, 0, 1,
				SubnetConfigurationBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetConfigurationBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.SubnetConfiguration", 0, 1,
				SubnetConfigurationBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetConfigurationBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				SubnetConfigurationBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetConfigurationBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, SubnetConfigurationBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetConfigurationBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, SubnetConfigurationBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vpnConnectionOptionsBuilder_ec2EClass, VpnConnectionOptionsBuilder_ec2.class,
				"VpnConnectionOptionsBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVpnConnectionOptionsBuilder_ec2_Ip_java_lang_String_(), ecorePackage.getEString(),
				"ip_java_lang_String_", null, 0, 1, VpnConnectionOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnConnectionOptionsBuilder_ec2_Asn_java_lang_Number_(), ecorePackage.getEInt(),
				"asn_java_lang_Number_", null, 0, 1, VpnConnectionOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnConnectionOptionsBuilder_ec2_StaticRoutes_java_lang_String_AsList(),
				ecorePackage.getEString(), "staticRoutes_java_lang_String_AsList", null, 0, 1,
				VpnConnectionOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVpnConnectionOptionsBuilder_ec2_TunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList(),
				ecorePackage.getEString(), "tunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList",
				null, 0, 1, VpnConnectionOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnConnectionOptionsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.VpnConnectionOptions", 0, 1,
				VpnConnectionOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnConnectionOptionsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				VpnConnectionOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnConnectionOptionsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, VpnConnectionOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnConnectionOptionsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, VpnConnectionOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vpnTunnelOptionBuilder_ec2EClass, VpnTunnelOptionBuilder_ec2.class, "VpnTunnelOptionBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVpnTunnelOptionBuilder_ec2_PreSharedKey_java_lang_String_(), ecorePackage.getEString(),
				"preSharedKey_java_lang_String_", null, 0, 1, VpnTunnelOptionBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnTunnelOptionBuilder_ec2_TunnelInsideCidr_java_lang_String_(), ecorePackage.getEString(),
				"tunnelInsideCidr_java_lang_String_", null, 0, 1, VpnTunnelOptionBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnTunnelOptionBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.VpnTunnelOption", 0, 1,
				VpnTunnelOptionBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnTunnelOptionBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				VpnTunnelOptionBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnTunnelOptionBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				VpnTunnelOptionBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnTunnelOptionBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, VpnTunnelOptionBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(defaultInstanceTenancyEEnum, DefaultInstanceTenancy.class, "DefaultInstanceTenancy");
		addEEnumLiteral(defaultInstanceTenancyEEnum, DefaultInstanceTenancy.DEFAULT);
		addEEnumLiteral(defaultInstanceTenancyEEnum, DefaultInstanceTenancy.DEDICATED);

		initEEnum(subnetTypeEEnum, SubnetType.class, "SubnetType");
		addEEnumLiteral(subnetTypeEEnum, SubnetType.ISOLATED);
		addEEnumLiteral(subnetTypeEEnum, SubnetType.PRIVATE);
		addEEnumLiteral(subnetTypeEEnum, SubnetType.PUBLIC);

		// Create resource
		createResource(eNS_URI);
	}

} //AwsworkbenchPackageImpl
