/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchFactory;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.DefaultInstanceTenancy;
import com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2;
import com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2;
import com.amazon.aws.workbench.model.awsworkbench.PrivateSubnetBuilder_ec2;
import com.amazon.aws.workbench.model.awsworkbench.Protocol;
import com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2;
import com.amazon.aws.workbench.model.awsworkbench.SecurityGroupBuilder_ec2;
import com.amazon.aws.workbench.model.awsworkbench.ServiceResources;
import com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core;
import com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2;
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
	private EClass subnetBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityGroupBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privateSubnetBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicSubnetBuilder_ec2EClass = null;

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
	private EEnum protocolEEnum = null;

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
	public EReference getVpcBuilder_ec2_Subnetbuilder_ec2() {
		return (EReference) vpcBuilder_ec2EClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVpcBuilder_ec2_Securitygroupbuilder_ec2() {
		return (EReference) vpcBuilder_ec2EClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVpcBuilder_ec2_Privatesubnetbuilder_ec2() {
		return (EReference) vpcBuilder_ec2EClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVpcBuilder_ec2_Publicsubnetbuilder_ec2() {
		return (EReference) vpcBuilder_ec2EClass.getEStructuralFeatures().get(22);
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
	public EClass getSubnetBuilder_ec2() {
		return subnetBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetBuilder_ec2_AvailabilityZone() {
		return (EAttribute) subnetBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetBuilder_ec2_CidrBlock() {
		return (EAttribute) subnetBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetBuilder_ec2_VpcId() {
		return (EAttribute) subnetBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetBuilder_ec2_MapPublicIpOnLaunch() {
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
	public EReference getSubnetBuilder_ec2_Instancebuilder_ec2() {
		return (EReference) subnetBuilder_ec2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstanceBuilder_ec2() {
		return instanceBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceBuilder_ec2_InstanceTypeWithInstanceTypeAsReference() {
		return (EAttribute) instanceBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceBuilder_ec2_MachineImageWithIMachineImageAsReference() {
		return (EAttribute) instanceBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceBuilder_ec2_VpcWithIVpcAsReference() {
		return (EAttribute) instanceBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceBuilder_ec2_AllowAllOutbound() {
		return (EAttribute) instanceBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceBuilder_ec2_AvailabilityZone() {
		return (EAttribute) instanceBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceBuilder_ec2_BlockDevicesAsList() {
		return (EAttribute) instanceBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceBuilder_ec2_InstanceName() {
		return (EAttribute) instanceBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceBuilder_ec2_KeyName() {
		return (EAttribute) instanceBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceBuilder_ec2_PrivateIpAddress() {
		return (EAttribute) instanceBuilder_ec2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceBuilder_ec2_ResourceSignalTimeoutWithDurationAsReference() {
		return (EAttribute) instanceBuilder_ec2EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceBuilder_ec2_RoleWithIRoleAsReference() {
		return (EAttribute) instanceBuilder_ec2EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceBuilder_ec2_SecurityGroupWithISecurityGroupAsReference() {
		return (EAttribute) instanceBuilder_ec2EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceBuilder_ec2_SourceDestCheck() {
		return (EAttribute) instanceBuilder_ec2EClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceBuilder_ec2_UserDataWithUserDataAsReference() {
		return (EAttribute) instanceBuilder_ec2EClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceBuilder_ec2_VpcSubnetsWithSubnetSelectionAsReference() {
		return (EAttribute) instanceBuilder_ec2EClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceBuilder_ec2_GeneratedClassName() {
		return (EAttribute) instanceBuilder_ec2EClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceBuilder_ec2_VarName() {
		return (EAttribute) instanceBuilder_ec2EClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceBuilder_ec2_Identifier() {
		return (EAttribute) instanceBuilder_ec2EClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceBuilder_ec2_AdditionalCode() {
		return (EAttribute) instanceBuilder_ec2EClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecurityGroupBuilder_ec2() {
		return securityGroupBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroupBuilder_ec2_VpcWithIVpcAsReference() {
		return (EAttribute) securityGroupBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroupBuilder_ec2_AllowAllOutbound() {
		return (EAttribute) securityGroupBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroupBuilder_ec2_Description() {
		return (EAttribute) securityGroupBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroupBuilder_ec2_SecurityGroupName() {
		return (EAttribute) securityGroupBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroupBuilder_ec2_GeneratedClassName() {
		return (EAttribute) securityGroupBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroupBuilder_ec2_VarName() {
		return (EAttribute) securityGroupBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroupBuilder_ec2_Identifier() {
		return (EAttribute) securityGroupBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroupBuilder_ec2_AdditionalCode() {
		return (EAttribute) securityGroupBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPortBuilder_ec2() {
		return portBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortBuilder_ec2_Protocol() {
		return (EAttribute) portBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortBuilder_ec2_StringRepresentation() {
		return (EAttribute) portBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortBuilder_ec2_FromPort() {
		return (EAttribute) portBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortBuilder_ec2_ToPort() {
		return (EAttribute) portBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortBuilder_ec2_GeneratedClassName() {
		return (EAttribute) portBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortBuilder_ec2_VarName() {
		return (EAttribute) portBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortBuilder_ec2_Identifier() {
		return (EAttribute) portBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortBuilder_ec2_AdditionalCode() {
		return (EAttribute) portBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrivateSubnetBuilder_ec2() {
		return privateSubnetBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrivateSubnetBuilder_ec2_AvailabilityZone() {
		return (EAttribute) privateSubnetBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrivateSubnetBuilder_ec2_CidrBlock() {
		return (EAttribute) privateSubnetBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrivateSubnetBuilder_ec2_VpcId() {
		return (EAttribute) privateSubnetBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrivateSubnetBuilder_ec2_MapPublicIpOnLaunch() {
		return (EAttribute) privateSubnetBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrivateSubnetBuilder_ec2_GeneratedClassName() {
		return (EAttribute) privateSubnetBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrivateSubnetBuilder_ec2_VarName() {
		return (EAttribute) privateSubnetBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrivateSubnetBuilder_ec2_Identifier() {
		return (EAttribute) privateSubnetBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrivateSubnetBuilder_ec2_AdditionalCode() {
		return (EAttribute) privateSubnetBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrivateSubnetBuilder_ec2_Instancebuilder_ec2() {
		return (EReference) privateSubnetBuilder_ec2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublicSubnetBuilder_ec2() {
		return publicSubnetBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicSubnetBuilder_ec2_AvailabilityZone() {
		return (EAttribute) publicSubnetBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicSubnetBuilder_ec2_CidrBlock() {
		return (EAttribute) publicSubnetBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicSubnetBuilder_ec2_VpcId() {
		return (EAttribute) publicSubnetBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicSubnetBuilder_ec2_MapPublicIpOnLaunch() {
		return (EAttribute) publicSubnetBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicSubnetBuilder_ec2_GeneratedClassName() {
		return (EAttribute) publicSubnetBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicSubnetBuilder_ec2_VarName() {
		return (EAttribute) publicSubnetBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicSubnetBuilder_ec2_Identifier() {
		return (EAttribute) publicSubnetBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicSubnetBuilder_ec2_AdditionalCode() {
		return (EAttribute) publicSubnetBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPublicSubnetBuilder_ec2_Instancebuilder_ec2() {
		return (EReference) publicSubnetBuilder_ec2EClass.getEStructuralFeatures().get(8);
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
	public EEnum getProtocol() {
		return protocolEEnum;
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
		createEReference(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__SUBNETBUILDER_EC2);
		createEReference(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__SECURITYGROUPBUILDER_EC2);
		createEReference(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__PRIVATESUBNETBUILDER_EC2);
		createEReference(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__PUBLICSUBNETBUILDER_EC2);

		serviceResourcesEClass = createEClass(SERVICE_RESOURCES);

		subnetBuilder_ec2EClass = createEClass(SUBNET_BUILDER_EC2);
		createEAttribute(subnetBuilder_ec2EClass, SUBNET_BUILDER_EC2__AVAILABILITY_ZONE);
		createEAttribute(subnetBuilder_ec2EClass, SUBNET_BUILDER_EC2__CIDR_BLOCK);
		createEAttribute(subnetBuilder_ec2EClass, SUBNET_BUILDER_EC2__VPC_ID);
		createEAttribute(subnetBuilder_ec2EClass, SUBNET_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH);
		createEAttribute(subnetBuilder_ec2EClass, SUBNET_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(subnetBuilder_ec2EClass, SUBNET_BUILDER_EC2__VAR_NAME);
		createEAttribute(subnetBuilder_ec2EClass, SUBNET_BUILDER_EC2__IDENTIFIER);
		createEAttribute(subnetBuilder_ec2EClass, SUBNET_BUILDER_EC2__ADDITIONAL_CODE);
		createEReference(subnetBuilder_ec2EClass, SUBNET_BUILDER_EC2__INSTANCEBUILDER_EC2);

		instanceBuilder_ec2EClass = createEClass(INSTANCE_BUILDER_EC2);
		createEAttribute(instanceBuilder_ec2EClass,
				INSTANCE_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_AS_REFERENCE);
		createEAttribute(instanceBuilder_ec2EClass,
				INSTANCE_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_AS_REFERENCE);
		createEAttribute(instanceBuilder_ec2EClass, INSTANCE_BUILDER_EC2__VPC_WITH_IVPC_AS_REFERENCE);
		createEAttribute(instanceBuilder_ec2EClass, INSTANCE_BUILDER_EC2__ALLOW_ALL_OUTBOUND);
		createEAttribute(instanceBuilder_ec2EClass, INSTANCE_BUILDER_EC2__AVAILABILITY_ZONE);
		createEAttribute(instanceBuilder_ec2EClass, INSTANCE_BUILDER_EC2__BLOCK_DEVICES_AS_LIST);
		createEAttribute(instanceBuilder_ec2EClass, INSTANCE_BUILDER_EC2__INSTANCE_NAME);
		createEAttribute(instanceBuilder_ec2EClass, INSTANCE_BUILDER_EC2__KEY_NAME);
		createEAttribute(instanceBuilder_ec2EClass, INSTANCE_BUILDER_EC2__PRIVATE_IP_ADDRESS);
		createEAttribute(instanceBuilder_ec2EClass,
				INSTANCE_BUILDER_EC2__RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_AS_REFERENCE);
		createEAttribute(instanceBuilder_ec2EClass, INSTANCE_BUILDER_EC2__ROLE_WITH_IROLE_AS_REFERENCE);
		createEAttribute(instanceBuilder_ec2EClass,
				INSTANCE_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_AS_REFERENCE);
		createEAttribute(instanceBuilder_ec2EClass, INSTANCE_BUILDER_EC2__SOURCE_DEST_CHECK);
		createEAttribute(instanceBuilder_ec2EClass, INSTANCE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_AS_REFERENCE);
		createEAttribute(instanceBuilder_ec2EClass,
				INSTANCE_BUILDER_EC2__VPC_SUBNETS_WITH_SUBNET_SELECTION_AS_REFERENCE);
		createEAttribute(instanceBuilder_ec2EClass, INSTANCE_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(instanceBuilder_ec2EClass, INSTANCE_BUILDER_EC2__VAR_NAME);
		createEAttribute(instanceBuilder_ec2EClass, INSTANCE_BUILDER_EC2__IDENTIFIER);
		createEAttribute(instanceBuilder_ec2EClass, INSTANCE_BUILDER_EC2__ADDITIONAL_CODE);

		securityGroupBuilder_ec2EClass = createEClass(SECURITY_GROUP_BUILDER_EC2);
		createEAttribute(securityGroupBuilder_ec2EClass, SECURITY_GROUP_BUILDER_EC2__VPC_WITH_IVPC_AS_REFERENCE);
		createEAttribute(securityGroupBuilder_ec2EClass, SECURITY_GROUP_BUILDER_EC2__ALLOW_ALL_OUTBOUND);
		createEAttribute(securityGroupBuilder_ec2EClass, SECURITY_GROUP_BUILDER_EC2__DESCRIPTION);
		createEAttribute(securityGroupBuilder_ec2EClass, SECURITY_GROUP_BUILDER_EC2__SECURITY_GROUP_NAME);
		createEAttribute(securityGroupBuilder_ec2EClass, SECURITY_GROUP_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(securityGroupBuilder_ec2EClass, SECURITY_GROUP_BUILDER_EC2__VAR_NAME);
		createEAttribute(securityGroupBuilder_ec2EClass, SECURITY_GROUP_BUILDER_EC2__IDENTIFIER);
		createEAttribute(securityGroupBuilder_ec2EClass, SECURITY_GROUP_BUILDER_EC2__ADDITIONAL_CODE);

		portBuilder_ec2EClass = createEClass(PORT_BUILDER_EC2);
		createEAttribute(portBuilder_ec2EClass, PORT_BUILDER_EC2__PROTOCOL);
		createEAttribute(portBuilder_ec2EClass, PORT_BUILDER_EC2__STRING_REPRESENTATION);
		createEAttribute(portBuilder_ec2EClass, PORT_BUILDER_EC2__FROM_PORT);
		createEAttribute(portBuilder_ec2EClass, PORT_BUILDER_EC2__TO_PORT);
		createEAttribute(portBuilder_ec2EClass, PORT_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(portBuilder_ec2EClass, PORT_BUILDER_EC2__VAR_NAME);
		createEAttribute(portBuilder_ec2EClass, PORT_BUILDER_EC2__IDENTIFIER);
		createEAttribute(portBuilder_ec2EClass, PORT_BUILDER_EC2__ADDITIONAL_CODE);

		privateSubnetBuilder_ec2EClass = createEClass(PRIVATE_SUBNET_BUILDER_EC2);
		createEAttribute(privateSubnetBuilder_ec2EClass, PRIVATE_SUBNET_BUILDER_EC2__AVAILABILITY_ZONE);
		createEAttribute(privateSubnetBuilder_ec2EClass, PRIVATE_SUBNET_BUILDER_EC2__CIDR_BLOCK);
		createEAttribute(privateSubnetBuilder_ec2EClass, PRIVATE_SUBNET_BUILDER_EC2__VPC_ID);
		createEAttribute(privateSubnetBuilder_ec2EClass, PRIVATE_SUBNET_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH);
		createEAttribute(privateSubnetBuilder_ec2EClass, PRIVATE_SUBNET_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(privateSubnetBuilder_ec2EClass, PRIVATE_SUBNET_BUILDER_EC2__VAR_NAME);
		createEAttribute(privateSubnetBuilder_ec2EClass, PRIVATE_SUBNET_BUILDER_EC2__IDENTIFIER);
		createEAttribute(privateSubnetBuilder_ec2EClass, PRIVATE_SUBNET_BUILDER_EC2__ADDITIONAL_CODE);
		createEReference(privateSubnetBuilder_ec2EClass, PRIVATE_SUBNET_BUILDER_EC2__INSTANCEBUILDER_EC2);

		publicSubnetBuilder_ec2EClass = createEClass(PUBLIC_SUBNET_BUILDER_EC2);
		createEAttribute(publicSubnetBuilder_ec2EClass, PUBLIC_SUBNET_BUILDER_EC2__AVAILABILITY_ZONE);
		createEAttribute(publicSubnetBuilder_ec2EClass, PUBLIC_SUBNET_BUILDER_EC2__CIDR_BLOCK);
		createEAttribute(publicSubnetBuilder_ec2EClass, PUBLIC_SUBNET_BUILDER_EC2__VPC_ID);
		createEAttribute(publicSubnetBuilder_ec2EClass, PUBLIC_SUBNET_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH);
		createEAttribute(publicSubnetBuilder_ec2EClass, PUBLIC_SUBNET_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(publicSubnetBuilder_ec2EClass, PUBLIC_SUBNET_BUILDER_EC2__VAR_NAME);
		createEAttribute(publicSubnetBuilder_ec2EClass, PUBLIC_SUBNET_BUILDER_EC2__IDENTIFIER);
		createEAttribute(publicSubnetBuilder_ec2EClass, PUBLIC_SUBNET_BUILDER_EC2__ADDITIONAL_CODE);
		createEReference(publicSubnetBuilder_ec2EClass, PUBLIC_SUBNET_BUILDER_EC2__INSTANCEBUILDER_EC2);

		// Create enums
		defaultInstanceTenancyEEnum = createEEnum(DEFAULT_INSTANCE_TENANCY);
		protocolEEnum = createEEnum(PROTOCOL);
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
		subnetBuilder_ec2EClass.getESuperTypes().add(this.getServiceResources());
		instanceBuilder_ec2EClass.getESuperTypes().add(this.getServiceResources());
		securityGroupBuilder_ec2EClass.getESuperTypes().add(this.getServiceResources());
		portBuilder_ec2EClass.getESuperTypes().add(this.getServiceResources());
		privateSubnetBuilder_ec2EClass.getESuperTypes().add(this.getServiceResources());
		publicSubnetBuilder_ec2EClass.getESuperTypes().add(this.getServiceResources());

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
		initEReference(getVpcBuilder_ec2_Subnetbuilder_ec2(), this.getSubnetBuilder_ec2(), null, "subnetbuilder_ec2",
				null, 0, -1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVpcBuilder_ec2_Securitygroupbuilder_ec2(), this.getSecurityGroupBuilder_ec2(), null,
				"securitygroupbuilder_ec2", null, 0, -1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVpcBuilder_ec2_Privatesubnetbuilder_ec2(), this.getPrivateSubnetBuilder_ec2(), null,
				"privatesubnetbuilder_ec2", null, 0, -1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVpcBuilder_ec2_Publicsubnetbuilder_ec2(), this.getPublicSubnetBuilder_ec2(), null,
				"publicsubnetbuilder_ec2", null, 0, -1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceResourcesEClass, ServiceResources.class, "ServiceResources", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(subnetBuilder_ec2EClass, SubnetBuilder_ec2.class, "SubnetBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubnetBuilder_ec2_AvailabilityZone(), ecorePackage.getEString(), "availabilityZone", null, 0,
				1, SubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetBuilder_ec2_CidrBlock(), ecorePackage.getEString(), "cidrBlock", null, 0, 1,
				SubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetBuilder_ec2_VpcId(), ecorePackage.getEString(), "vpcId", null, 0, 1,
				SubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetBuilder_ec2_MapPublicIpOnLaunch(), ecorePackage.getEBooleanObject(),
				"mapPublicIpOnLaunch", null, 0, 1, SubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEReference(getSubnetBuilder_ec2_Instancebuilder_ec2(), this.getInstanceBuilder_ec2(), null,
				"instancebuilder_ec2", null, 0, -1, SubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceBuilder_ec2EClass, InstanceBuilder_ec2.class, "InstanceBuilder_ec2", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstanceBuilder_ec2_InstanceTypeWithInstanceTypeAsReference(), ecorePackage.getEString(),
				"instanceTypeWithInstanceTypeAsReference", null, 0, 1, InstanceBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceBuilder_ec2_MachineImageWithIMachineImageAsReference(), ecorePackage.getEString(),
				"machineImageWithIMachineImageAsReference", null, 0, 1, InstanceBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceBuilder_ec2_VpcWithIVpcAsReference(), ecorePackage.getEString(),
				"vpcWithIVpcAsReference", null, 0, 1, InstanceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceBuilder_ec2_AllowAllOutbound(), ecorePackage.getEBooleanObject(), "allowAllOutbound",
				null, 0, 1, InstanceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceBuilder_ec2_AvailabilityZone(), ecorePackage.getEString(), "availabilityZone", null,
				0, 1, InstanceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceBuilder_ec2_BlockDevicesAsList(), ecorePackage.getEString(), "blockDevicesAsList",
				null, 0, 1, InstanceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceBuilder_ec2_InstanceName(), ecorePackage.getEString(), "instanceName", null, 0, 1,
				InstanceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceBuilder_ec2_KeyName(), ecorePackage.getEString(), "keyName", null, 0, 1,
				InstanceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceBuilder_ec2_PrivateIpAddress(), ecorePackage.getEString(), "privateIpAddress", null,
				0, 1, InstanceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceBuilder_ec2_ResourceSignalTimeoutWithDurationAsReference(), ecorePackage.getEString(),
				"resourceSignalTimeoutWithDurationAsReference", null, 0, 1, InstanceBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceBuilder_ec2_RoleWithIRoleAsReference(), ecorePackage.getEString(),
				"roleWithIRoleAsReference", null, 0, 1, InstanceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceBuilder_ec2_SecurityGroupWithISecurityGroupAsReference(), ecorePackage.getEString(),
				"securityGroupWithISecurityGroupAsReference", null, 0, 1, InstanceBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceBuilder_ec2_SourceDestCheck(), ecorePackage.getEBooleanObject(), "sourceDestCheck",
				null, 0, 1, InstanceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceBuilder_ec2_UserDataWithUserDataAsReference(), ecorePackage.getEString(),
				"userDataWithUserDataAsReference", null, 0, 1, InstanceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceBuilder_ec2_VpcSubnetsWithSubnetSelectionAsReference(), ecorePackage.getEString(),
				"vpcSubnetsWithSubnetSelectionAsReference", null, 0, 1, InstanceBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.ec2.Instance", 0, 1, InstanceBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				InstanceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				InstanceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0, 1,
				InstanceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityGroupBuilder_ec2EClass, SecurityGroupBuilder_ec2.class, "SecurityGroupBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityGroupBuilder_ec2_VpcWithIVpcAsReference(), ecorePackage.getEString(),
				"vpcWithIVpcAsReference", null, 0, 1, SecurityGroupBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroupBuilder_ec2_AllowAllOutbound(), ecorePackage.getEBooleanObject(),
				"allowAllOutbound", null, 0, 1, SecurityGroupBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroupBuilder_ec2_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				SecurityGroupBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroupBuilder_ec2_SecurityGroupName(), ecorePackage.getEString(), "securityGroupName",
				null, 0, 1, SecurityGroupBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroupBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.SecurityGroup", 0, 1,
				SecurityGroupBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroupBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				SecurityGroupBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroupBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				SecurityGroupBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroupBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, SecurityGroupBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portBuilder_ec2EClass, PortBuilder_ec2.class, "PortBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortBuilder_ec2_Protocol(), this.getProtocol(), "protocol", null, 0, 1, PortBuilder_ec2.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortBuilder_ec2_StringRepresentation(), ecorePackage.getEString(), "stringRepresentation",
				null, 0, 1, PortBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortBuilder_ec2_FromPort(), ecorePackage.getEInt(), "fromPort", null, 0, 1,
				PortBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortBuilder_ec2_ToPort(), ecorePackage.getEInt(), "toPort", null, 0, 1, PortBuilder_ec2.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.ec2.Port", 0, 1, PortBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				PortBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				PortBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0, 1,
				PortBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(privateSubnetBuilder_ec2EClass, PrivateSubnetBuilder_ec2.class, "PrivateSubnetBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrivateSubnetBuilder_ec2_AvailabilityZone(), ecorePackage.getEString(), "availabilityZone",
				null, 0, 1, PrivateSubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrivateSubnetBuilder_ec2_CidrBlock(), ecorePackage.getEString(), "cidrBlock", null, 0, 1,
				PrivateSubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrivateSubnetBuilder_ec2_VpcId(), ecorePackage.getEString(), "vpcId", null, 0, 1,
				PrivateSubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrivateSubnetBuilder_ec2_MapPublicIpOnLaunch(), ecorePackage.getEBooleanObject(),
				"mapPublicIpOnLaunch", null, 0, 1, PrivateSubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrivateSubnetBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.PrivateSubnet", 0, 1,
				PrivateSubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrivateSubnetBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				PrivateSubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrivateSubnetBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				PrivateSubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrivateSubnetBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, PrivateSubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrivateSubnetBuilder_ec2_Instancebuilder_ec2(), this.getInstanceBuilder_ec2(), null,
				"instancebuilder_ec2", null, 0, -1, PrivateSubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicSubnetBuilder_ec2EClass, PublicSubnetBuilder_ec2.class, "PublicSubnetBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPublicSubnetBuilder_ec2_AvailabilityZone(), ecorePackage.getEString(), "availabilityZone",
				null, 0, 1, PublicSubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicSubnetBuilder_ec2_CidrBlock(), ecorePackage.getEString(), "cidrBlock", null, 0, 1,
				PublicSubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicSubnetBuilder_ec2_VpcId(), ecorePackage.getEString(), "vpcId", null, 0, 1,
				PublicSubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicSubnetBuilder_ec2_MapPublicIpOnLaunch(), ecorePackage.getEBooleanObject(),
				"mapPublicIpOnLaunch", null, 0, 1, PublicSubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicSubnetBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.ec2.PublicSubnet", 0, 1, PublicSubnetBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicSubnetBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				PublicSubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicSubnetBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				PublicSubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicSubnetBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, PublicSubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPublicSubnetBuilder_ec2_Instancebuilder_ec2(), this.getInstanceBuilder_ec2(), null,
				"instancebuilder_ec2", null, 0, -1, PublicSubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(defaultInstanceTenancyEEnum, DefaultInstanceTenancy.class, "DefaultInstanceTenancy");
		addEEnumLiteral(defaultInstanceTenancyEEnum, DefaultInstanceTenancy.DEFAULT);
		addEEnumLiteral(defaultInstanceTenancyEEnum, DefaultInstanceTenancy.DEDICATED);

		initEEnum(protocolEEnum, Protocol.class, "Protocol");
		addEEnumLiteral(protocolEEnum, Protocol.ALL);
		addEEnumLiteral(protocolEEnum, Protocol.TCP);
		addEEnumLiteral(protocolEEnum, Protocol.UDP);
		addEEnumLiteral(protocolEEnum, Protocol.ICMP);
		addEEnumLiteral(protocolEEnum, Protocol.ICMPV6);

		// Create resource
		createResource(eNS_URI);
	}

} //AwsworkbenchPackageImpl
