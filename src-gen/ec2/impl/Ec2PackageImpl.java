/**
 */
package ec2.impl;

import apigateway.ApigatewayPackage;

import apigateway.impl.ApigatewayPackageImpl;

import certificatemanager.CertificatemanagerPackage;

import certificatemanager.impl.CertificatemanagerPackageImpl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;

import com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl;

import core.CorePackage;

import core.impl.CorePackageImpl;

import dynamodb.DynamodbPackage;

import dynamodb.impl.DynamodbPackageImpl;

import ec2.AclCidrConfigBuilder_ec2;
import ec2.AclIcmpBuilder_ec2;
import ec2.AclPortRangeBuilder_ec2;
import ec2.AclTrafficConfigBuilder_ec2;
import ec2.Action;
import ec2.AddRouteOptionsBuilder_ec2;
import ec2.AmazonLinuxEdition;
import ec2.AmazonLinuxGeneration;
import ec2.AmazonLinuxImageBuilder_ec2;
import ec2.AmazonLinuxImagePropsBuilder_ec2;
import ec2.AmazonLinuxStorage;
import ec2.AmazonLinuxVirt;
import ec2.BastionHostLinuxBuilder_ec2;
import ec2.BastionHostLinuxPropsBuilder_ec2;
import ec2.BlockDeviceBuilder_ec2;
import ec2.CommonNetworkAclEntryOptionsBuilder_ec2;
import ec2.ConfigureNatOptionsBuilder_ec2;
import ec2.ConnectionRuleBuilder_ec2;
import ec2.ConnectionsBuilder_ec2;
import ec2.ConnectionsPropsBuilder_ec2;
import ec2.DefaultInstanceTenancy;
import ec2.EbsDeviceOptionsBaseBuilder_ec2;
import ec2.EbsDeviceOptionsBuilder_ec2;
import ec2.EbsDevicePropsBuilder_ec2;
import ec2.EbsDeviceSnapshotOptionsBuilder_ec2;
import ec2.EbsDeviceVolumeType;
import ec2.Ec2Factory;
import ec2.Ec2Package;
import ec2.EnableVpnGatewayOptionsBuilder_ec2;
import ec2.ExecuteFileOptionsBuilder_ec2;
import ec2.FlowLogBuilder_ec2;
import ec2.FlowLogDestinationConfigBuilder_ec2;
import ec2.FlowLogDestinationType;
import ec2.FlowLogOptionsBuilder_ec2;
import ec2.FlowLogPropsBuilder_ec2;
import ec2.FlowLogTrafficType;
import ec2.GatewayConfigBuilder_ec2;
import ec2.GatewayVpcEndpointBuilder_ec2;
import ec2.GatewayVpcEndpointOptionsBuilder_ec2;
import ec2.GatewayVpcEndpointPropsBuilder_ec2;
import ec2.GenericLinuxImageBuilder_ec2;
import ec2.GenericLinuxImagePropsBuilder_ec2;
import ec2.GenericWindowsImageBuilder_ec2;
import ec2.GenericWindowsImagePropsBuilder_ec2;
import ec2.InstanceBuilder_ec2;
import ec2.InstanceClass;
import ec2.InstancePropsBuilder_ec2;
import ec2.InstanceSize;
import ec2.InterfaceVpcEndpointAttributesBuilder_ec2;
import ec2.InterfaceVpcEndpointBuilder_ec2;
import ec2.InterfaceVpcEndpointOptionsBuilder_ec2;
import ec2.InterfaceVpcEndpointPropsBuilder_ec2;
import ec2.LinuxUserDataOptionsBuilder_ec2;
import ec2.LookupMachineImageBuilder_ec2;
import ec2.LookupMachineImagePropsBuilder_ec2;
import ec2.MachineImageConfigBuilder_ec2;
import ec2.NatInstancePropsBuilder_ec2;
import ec2.NatInstanceProviderBuilder_ec2;
import ec2.NetworkAclBuilder_ec2;
import ec2.NetworkAclEntryBuilder_ec2;
import ec2.NetworkAclEntryPropsBuilder_ec2;
import ec2.NetworkAclPropsBuilder_ec2;
import ec2.OperatingSystemType;
import ec2.PortBuilder_ec2;
import ec2.PortPropsBuilder_ec2;
import ec2.PrivateSubnetAttributesBuilder_ec2;
import ec2.PrivateSubnetBuilder_ec2;
import ec2.PrivateSubnetPropsBuilder_ec2;
import ec2.Protocol;
import ec2.PublicSubnetAttributesBuilder_ec2;
import ec2.PublicSubnetBuilder_ec2;
import ec2.PublicSubnetPropsBuilder_ec2;
import ec2.RouterType;
import ec2.S3DownloadOptionsBuilder_ec2;
import ec2.SecurityGroupBuilder_ec2;
import ec2.SecurityGroupImportOptionsBuilder_ec2;
import ec2.SecurityGroupPropsBuilder_ec2;
import ec2.SelectedSubnetsBuilder_ec2;
import ec2.SubnetAttributesBuilder_ec2;
import ec2.SubnetBuilder_ec2;
import ec2.SubnetConfigurationBuilder_ec2;
import ec2.SubnetNetworkAclAssociationBuilder_ec2;
import ec2.SubnetNetworkAclAssociationPropsBuilder_ec2;
import ec2.SubnetPropsBuilder_ec2;
import ec2.SubnetSelectionBuilder_ec2;
import ec2.SubnetType;
import ec2.TrafficDirection;
import ec2.VpcAttributesBuilder_ec2;
import ec2.VpcBuilder_ec2;
import ec2.VpcEndpointServiceBuilder_ec2;
import ec2.VpcEndpointServicePropsBuilder_ec2;
import ec2.VpcEndpointType;
import ec2.VpcLookupOptionsBuilder_ec2;
import ec2.VpcPropsBuilder_ec2;
import ec2.VpnConnectionBuilder_ec2;
import ec2.VpnConnectionOptionsBuilder_ec2;
import ec2.VpnConnectionPropsBuilder_ec2;
import ec2.VpnConnectionType;
import ec2.VpnGatewayBuilder_ec2;
import ec2.VpnGatewayPropsBuilder_ec2;
import ec2.VpnTunnelOptionBuilder_ec2;
import ec2.WindowsImageBuilder_ec2;
import ec2.WindowsImagePropsBuilder_ec2;
import ec2.WindowsVersion;

import iam.IamPackage;

import iam.impl.IamPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ec2PackageImpl extends EPackageImpl implements Ec2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericLinuxImageBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aclTrafficConfigBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericWindowsImageBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceVpcEndpointAttributesBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vpcAttributesBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executeFileOptionsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ebsDeviceOptionsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enableVpnGatewayOptionsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vpcLookupOptionsBuilder_ec2EClass = null;

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
	private EClass subnetSelectionBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityGroupPropsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aclPortRangeBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericWindowsImagePropsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vpcEndpointServicePropsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass windowsImageBuilder_ec2EClass = null;

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
	private EClass privateSubnetBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bastionHostLinuxBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectedSubnetsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vpnGatewayPropsBuilder_ec2EClass = null;

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
	private EClass vpnTunnelOptionBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aclCidrConfigBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicSubnetPropsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass natInstanceProviderBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gatewayConfigBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericLinuxImagePropsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vpcPropsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bastionHostLinuxPropsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subnetNetworkAclAssociationPropsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vpnGatewayBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amazonLinuxImageBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowLogPropsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceVpcEndpointPropsBuilder_ec2EClass = null;

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
	private EClass portBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowLogDestinationConfigBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amazonLinuxImagePropsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lookupMachineImagePropsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ebsDeviceSnapshotOptionsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vpnConnectionPropsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vpnConnectionBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockDeviceBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ebsDevicePropsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkAclEntryPropsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addRouteOptionsBuilder_ec2EClass = null;

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
	private EClass interfaceVpcEndpointOptionsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linuxUserDataOptionsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkAclPropsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicSubnetAttributesBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass s3DownloadOptionsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowLogBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionsBuilder_ec2EClass = null;

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
	private EClass vpcEndpointServiceBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionRuleBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subnetPropsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subnetNetworkAclAssociationBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machineImageConfigBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass windowsImagePropsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instancePropsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass natInstancePropsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privateSubnetPropsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privateSubnetAttributesBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceVpcEndpointBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configureNatOptionsBuilder_ec2EClass = null;

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
	private EClass aclIcmpBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkAclBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonNetworkAclEntryOptionsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gatewayVpcEndpointOptionsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lookupMachineImageBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portPropsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityGroupImportOptionsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionsPropsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ebsDeviceOptionsBaseBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subnetAttributesBuilder_ec2EClass = null;

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
	private EClass gatewayVpcEndpointBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkAclEntryBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gatewayVpcEndpointPropsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum instanceSizeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vpcEndpointTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatingSystemTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum amazonLinuxGenerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum amazonLinuxStorageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subnetTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum amazonLinuxEditionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum instanceClassEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum windowsVersionEEnum = null;

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
	private EEnum routerTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum flowLogTrafficTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum amazonLinuxVirtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ebsDeviceVolumeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum flowLogDestinationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vpnConnectionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum protocolEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum trafficDirectionEEnum = null;

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
	 * @see ec2.Ec2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Ec2PackageImpl() {
		super(eNS_URI, Ec2Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Ec2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Ec2Package init() {
		if (isInited)
			return (Ec2Package) EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI);

		// Obtain or create and register package
		Object registeredEc2Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Ec2PackageImpl theEc2Package = registeredEc2Package instanceof Ec2PackageImpl
				? (Ec2PackageImpl) registeredEc2Package
				: new Ec2PackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AwsworkbenchPackage.eNS_URI);
		AwsworkbenchPackageImpl theAwsworkbenchPackage = (AwsworkbenchPackageImpl) (registeredPackage instanceof AwsworkbenchPackageImpl
				? registeredPackage
				: AwsworkbenchPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ApigatewayPackage.eNS_URI);
		ApigatewayPackageImpl theApigatewayPackage = (ApigatewayPackageImpl) (registeredPackage instanceof ApigatewayPackageImpl
				? registeredPackage
				: ApigatewayPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CertificatemanagerPackage.eNS_URI);
		CertificatemanagerPackageImpl theCertificatemanagerPackage = (CertificatemanagerPackageImpl) (registeredPackage instanceof CertificatemanagerPackageImpl
				? registeredPackage
				: CertificatemanagerPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(IamPackage.eNS_URI);
		IamPackageImpl theIamPackage = (IamPackageImpl) (registeredPackage instanceof IamPackageImpl ? registeredPackage
				: IamPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		CorePackageImpl theCorePackage = (CorePackageImpl) (registeredPackage instanceof CorePackageImpl
				? registeredPackage
				: CorePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DynamodbPackage.eNS_URI);
		DynamodbPackageImpl theDynamodbPackage = (DynamodbPackageImpl) (registeredPackage instanceof DynamodbPackageImpl
				? registeredPackage
				: DynamodbPackage.eINSTANCE);

		// Create package meta-data objects
		theEc2Package.createPackageContents();
		theAwsworkbenchPackage.createPackageContents();
		theApigatewayPackage.createPackageContents();
		theCertificatemanagerPackage.createPackageContents();
		theIamPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theDynamodbPackage.createPackageContents();

		// Initialize created meta-data
		theEc2Package.initializePackageContents();
		theAwsworkbenchPackage.initializePackageContents();
		theApigatewayPackage.initializePackageContents();
		theCertificatemanagerPackage.initializePackageContents();
		theIamPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theDynamodbPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEc2Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Ec2Package.eNS_URI, theEc2Package);
		return theEc2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGenericLinuxImageBuilder_ec2() {
		return genericLinuxImageBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenericLinuxImageBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference() {
		return (EAttribute) genericLinuxImageBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenericLinuxImageBuilder_ec2_GeneratedClassName() {
		return (EAttribute) genericLinuxImageBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenericLinuxImageBuilder_ec2_VarName() {
		return (EAttribute) genericLinuxImageBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenericLinuxImageBuilder_ec2_Identifier() {
		return (EAttribute) genericLinuxImageBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenericLinuxImageBuilder_ec2_AdditionalCode() {
		return (EAttribute) genericLinuxImageBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAclTrafficConfigBuilder_ec2() {
		return aclTrafficConfigBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAclTrafficConfigBuilder_ec2_Protocol_java_lang_Number_() {
		return (EAttribute) aclTrafficConfigBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAclTrafficConfigBuilder_ec2_IcmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference() {
		return (EAttribute) aclTrafficConfigBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAclTrafficConfigBuilder_ec2_PortRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference() {
		return (EAttribute) aclTrafficConfigBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAclTrafficConfigBuilder_ec2_GeneratedClassName() {
		return (EAttribute) aclTrafficConfigBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAclTrafficConfigBuilder_ec2_VarName() {
		return (EAttribute) aclTrafficConfigBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAclTrafficConfigBuilder_ec2_Identifier() {
		return (EAttribute) aclTrafficConfigBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAclTrafficConfigBuilder_ec2_AdditionalCode() {
		return (EAttribute) aclTrafficConfigBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGenericWindowsImageBuilder_ec2() {
		return genericWindowsImageBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenericWindowsImageBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference() {
		return (EAttribute) genericWindowsImageBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenericWindowsImageBuilder_ec2_GeneratedClassName() {
		return (EAttribute) genericWindowsImageBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenericWindowsImageBuilder_ec2_VarName() {
		return (EAttribute) genericWindowsImageBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenericWindowsImageBuilder_ec2_Identifier() {
		return (EAttribute) genericWindowsImageBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenericWindowsImageBuilder_ec2_AdditionalCode() {
		return (EAttribute) genericWindowsImageBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterfaceVpcEndpointAttributesBuilder_ec2() {
		return interfaceVpcEndpointAttributesBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointAttributesBuilder_ec2_Port_java_lang_Number_() {
		return (EAttribute) interfaceVpcEndpointAttributesBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointAttributesBuilder_ec2_VpcEndpointId_java_lang_String_() {
		return (EAttribute) interfaceVpcEndpointAttributesBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointAttributesBuilder_ec2_SecurityGroupId_java_lang_String_() {
		return (EAttribute) interfaceVpcEndpointAttributesBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointAttributesBuilder_ec2_SecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList() {
		return (EAttribute) interfaceVpcEndpointAttributesBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointAttributesBuilder_ec2_GeneratedClassName() {
		return (EAttribute) interfaceVpcEndpointAttributesBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointAttributesBuilder_ec2_VarName() {
		return (EAttribute) interfaceVpcEndpointAttributesBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointAttributesBuilder_ec2_Identifier() {
		return (EAttribute) interfaceVpcEndpointAttributesBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointAttributesBuilder_ec2_AdditionalCode() {
		return (EAttribute) interfaceVpcEndpointAttributesBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVpcAttributesBuilder_ec2() {
		return vpcAttributesBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcAttributesBuilder_ec2_AvailabilityZones_java_lang_String_AsList() {
		return (EAttribute) vpcAttributesBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcAttributesBuilder_ec2_VpcId_java_lang_String_() {
		return (EAttribute) vpcAttributesBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcAttributesBuilder_ec2_IsolatedSubnetIds_java_lang_String_AsList() {
		return (EAttribute) vpcAttributesBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcAttributesBuilder_ec2_IsolatedSubnetNames_java_lang_String_AsList() {
		return (EAttribute) vpcAttributesBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcAttributesBuilder_ec2_IsolatedSubnetRouteTableIds_java_lang_String_AsList() {
		return (EAttribute) vpcAttributesBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcAttributesBuilder_ec2_PrivateSubnetIds_java_lang_String_AsList() {
		return (EAttribute) vpcAttributesBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcAttributesBuilder_ec2_PrivateSubnetNames_java_lang_String_AsList() {
		return (EAttribute) vpcAttributesBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcAttributesBuilder_ec2_PrivateSubnetRouteTableIds_java_lang_String_AsList() {
		return (EAttribute) vpcAttributesBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcAttributesBuilder_ec2_PublicSubnetIds_java_lang_String_AsList() {
		return (EAttribute) vpcAttributesBuilder_ec2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcAttributesBuilder_ec2_PublicSubnetNames_java_lang_String_AsList() {
		return (EAttribute) vpcAttributesBuilder_ec2EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcAttributesBuilder_ec2_PublicSubnetRouteTableIds_java_lang_String_AsList() {
		return (EAttribute) vpcAttributesBuilder_ec2EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcAttributesBuilder_ec2_VpcCidrBlock_java_lang_String_() {
		return (EAttribute) vpcAttributesBuilder_ec2EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcAttributesBuilder_ec2_VpnGatewayId_java_lang_String_() {
		return (EAttribute) vpcAttributesBuilder_ec2EClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcAttributesBuilder_ec2_GeneratedClassName() {
		return (EAttribute) vpcAttributesBuilder_ec2EClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcAttributesBuilder_ec2_VarName() {
		return (EAttribute) vpcAttributesBuilder_ec2EClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcAttributesBuilder_ec2_Identifier() {
		return (EAttribute) vpcAttributesBuilder_ec2EClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcAttributesBuilder_ec2_AdditionalCode() {
		return (EAttribute) vpcAttributesBuilder_ec2EClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExecuteFileOptionsBuilder_ec2() {
		return executeFileOptionsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecuteFileOptionsBuilder_ec2_FilePath_java_lang_String_() {
		return (EAttribute) executeFileOptionsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecuteFileOptionsBuilder_ec2_Arguments_java_lang_String_() {
		return (EAttribute) executeFileOptionsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecuteFileOptionsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) executeFileOptionsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecuteFileOptionsBuilder_ec2_VarName() {
		return (EAttribute) executeFileOptionsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecuteFileOptionsBuilder_ec2_Identifier() {
		return (EAttribute) executeFileOptionsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecuteFileOptionsBuilder_ec2_AdditionalCode() {
		return (EAttribute) executeFileOptionsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEbsDeviceOptionsBuilder_ec2() {
		return ebsDeviceOptionsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEbsDeviceOptionsBuilder_ec2_Encrypted_java_lang_Boolean_() {
		return (EAttribute) ebsDeviceOptionsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEbsDeviceOptionsBuilder_ec2_DeleteOnTermination_java_lang_Boolean_() {
		return (EAttribute) ebsDeviceOptionsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEbsDeviceOptionsBuilder_ec2_Iops_java_lang_Number_() {
		return (EAttribute) ebsDeviceOptionsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEbsDeviceOptionsBuilder_ec2_VolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_() {
		return (EAttribute) ebsDeviceOptionsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEbsDeviceOptionsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) ebsDeviceOptionsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEbsDeviceOptionsBuilder_ec2_VarName() {
		return (EAttribute) ebsDeviceOptionsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEbsDeviceOptionsBuilder_ec2_Identifier() {
		return (EAttribute) ebsDeviceOptionsBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEbsDeviceOptionsBuilder_ec2_AdditionalCode() {
		return (EAttribute) ebsDeviceOptionsBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnableVpnGatewayOptionsBuilder_ec2() {
		return enableVpnGatewayOptionsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnableVpnGatewayOptionsBuilder_ec2_VpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList() {
		return (EAttribute) enableVpnGatewayOptionsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnableVpnGatewayOptionsBuilder_ec2_Type_java_lang_String_() {
		return (EAttribute) enableVpnGatewayOptionsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnableVpnGatewayOptionsBuilder_ec2_AmazonSideAsn_java_lang_Number_() {
		return (EAttribute) enableVpnGatewayOptionsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnableVpnGatewayOptionsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) enableVpnGatewayOptionsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnableVpnGatewayOptionsBuilder_ec2_VarName() {
		return (EAttribute) enableVpnGatewayOptionsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnableVpnGatewayOptionsBuilder_ec2_Identifier() {
		return (EAttribute) enableVpnGatewayOptionsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnableVpnGatewayOptionsBuilder_ec2_AdditionalCode() {
		return (EAttribute) enableVpnGatewayOptionsBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVpcLookupOptionsBuilder_ec2() {
		return vpcLookupOptionsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcLookupOptionsBuilder_ec2_IsDefault_java_lang_Boolean_() {
		return (EAttribute) vpcLookupOptionsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcLookupOptionsBuilder_ec2_SubnetGroupNameTag_java_lang_String_() {
		return (EAttribute) vpcLookupOptionsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcLookupOptionsBuilder_ec2_Tags_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) vpcLookupOptionsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcLookupOptionsBuilder_ec2_VpcId_java_lang_String_() {
		return (EAttribute) vpcLookupOptionsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcLookupOptionsBuilder_ec2_VpcName_java_lang_String_() {
		return (EAttribute) vpcLookupOptionsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcLookupOptionsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) vpcLookupOptionsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcLookupOptionsBuilder_ec2_VarName() {
		return (EAttribute) vpcLookupOptionsBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcLookupOptionsBuilder_ec2_Identifier() {
		return (EAttribute) vpcLookupOptionsBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcLookupOptionsBuilder_ec2_AdditionalCode() {
		return (EAttribute) vpcLookupOptionsBuilder_ec2EClass.getEStructuralFeatures().get(8);
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
	public EAttribute getInstanceBuilder_ec2_InstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference() {
		return (EAttribute) instanceBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceBuilder_ec2_MachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference() {
		return (EAttribute) instanceBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() {
		return (EAttribute) instanceBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceBuilder_ec2_AllowAllOutbound_java_lang_Boolean_() {
		return (EAttribute) instanceBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceBuilder_ec2_AvailabilityZone_java_lang_String_() {
		return (EAttribute) instanceBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceBuilder_ec2_BlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList() {
		return (EAttribute) instanceBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceBuilder_ec2_InstanceName_java_lang_String_() {
		return (EAttribute) instanceBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceBuilder_ec2_KeyName_java_lang_String_() {
		return (EAttribute) instanceBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceBuilder_ec2_PrivateIpAddress_java_lang_String_() {
		return (EAttribute) instanceBuilder_ec2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceBuilder_ec2_ResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return (EAttribute) instanceBuilder_ec2EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceBuilder_ec2_RoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() {
		return (EAttribute) instanceBuilder_ec2EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceBuilder_ec2_SecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference() {
		return (EAttribute) instanceBuilder_ec2EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceBuilder_ec2_SourceDestCheck_java_lang_Boolean_() {
		return (EAttribute) instanceBuilder_ec2EClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference() {
		return (EAttribute) instanceBuilder_ec2EClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceBuilder_ec2_VpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() {
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
	public EClass getSecurityGroupPropsBuilder_ec2() {
		return securityGroupPropsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroupPropsBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() {
		return (EAttribute) securityGroupPropsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroupPropsBuilder_ec2_AllowAllOutbound_java_lang_Boolean_() {
		return (EAttribute) securityGroupPropsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroupPropsBuilder_ec2_Description_java_lang_String_() {
		return (EAttribute) securityGroupPropsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroupPropsBuilder_ec2_SecurityGroupName_java_lang_String_() {
		return (EAttribute) securityGroupPropsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroupPropsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) securityGroupPropsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroupPropsBuilder_ec2_VarName() {
		return (EAttribute) securityGroupPropsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroupPropsBuilder_ec2_Identifier() {
		return (EAttribute) securityGroupPropsBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroupPropsBuilder_ec2_AdditionalCode() {
		return (EAttribute) securityGroupPropsBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAclPortRangeBuilder_ec2() {
		return aclPortRangeBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAclPortRangeBuilder_ec2_From_java_lang_Number_() {
		return (EAttribute) aclPortRangeBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAclPortRangeBuilder_ec2_To_java_lang_Number_() {
		return (EAttribute) aclPortRangeBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAclPortRangeBuilder_ec2_GeneratedClassName() {
		return (EAttribute) aclPortRangeBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAclPortRangeBuilder_ec2_VarName() {
		return (EAttribute) aclPortRangeBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAclPortRangeBuilder_ec2_Identifier() {
		return (EAttribute) aclPortRangeBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAclPortRangeBuilder_ec2_AdditionalCode() {
		return (EAttribute) aclPortRangeBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGenericWindowsImagePropsBuilder_ec2() {
		return genericWindowsImagePropsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenericWindowsImagePropsBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference() {
		return (EAttribute) genericWindowsImagePropsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenericWindowsImagePropsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) genericWindowsImagePropsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenericWindowsImagePropsBuilder_ec2_VarName() {
		return (EAttribute) genericWindowsImagePropsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenericWindowsImagePropsBuilder_ec2_Identifier() {
		return (EAttribute) genericWindowsImagePropsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenericWindowsImagePropsBuilder_ec2_AdditionalCode() {
		return (EAttribute) genericWindowsImagePropsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVpcEndpointServicePropsBuilder_ec2() {
		return vpcEndpointServicePropsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcEndpointServicePropsBuilder_ec2_VpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList() {
		return (EAttribute) vpcEndpointServicePropsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcEndpointServicePropsBuilder_ec2_AcceptanceRequired_java_lang_Boolean_() {
		return (EAttribute) vpcEndpointServicePropsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcEndpointServicePropsBuilder_ec2_VpcEndpointServiceName_java_lang_String_() {
		return (EAttribute) vpcEndpointServicePropsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcEndpointServicePropsBuilder_ec2_WhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList() {
		return (EAttribute) vpcEndpointServicePropsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcEndpointServicePropsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) vpcEndpointServicePropsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcEndpointServicePropsBuilder_ec2_VarName() {
		return (EAttribute) vpcEndpointServicePropsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcEndpointServicePropsBuilder_ec2_Identifier() {
		return (EAttribute) vpcEndpointServicePropsBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcEndpointServicePropsBuilder_ec2_AdditionalCode() {
		return (EAttribute) vpcEndpointServicePropsBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWindowsImageBuilder_ec2() {
		return windowsImageBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWindowsImageBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference() {
		return (EAttribute) windowsImageBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWindowsImageBuilder_ec2_GeneratedClassName() {
		return (EAttribute) windowsImageBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWindowsImageBuilder_ec2_VarName() {
		return (EAttribute) windowsImageBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWindowsImageBuilder_ec2_Identifier() {
		return (EAttribute) windowsImageBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWindowsImageBuilder_ec2_AdditionalCode() {
		return (EAttribute) windowsImageBuilder_ec2EClass.getEStructuralFeatures().get(4);
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
	public EClass getPrivateSubnetBuilder_ec2() {
		return privateSubnetBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrivateSubnetBuilder_ec2_AvailabilityZone_java_lang_String_() {
		return (EAttribute) privateSubnetBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrivateSubnetBuilder_ec2_CidrBlock_java_lang_String_() {
		return (EAttribute) privateSubnetBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrivateSubnetBuilder_ec2_VpcId_java_lang_String_() {
		return (EAttribute) privateSubnetBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrivateSubnetBuilder_ec2_MapPublicIpOnLaunch_java_lang_Boolean_() {
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
	public EClass getBastionHostLinuxBuilder_ec2() {
		return bastionHostLinuxBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBastionHostLinuxBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() {
		return (EAttribute) bastionHostLinuxBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBastionHostLinuxBuilder_ec2_AvailabilityZone_java_lang_String_() {
		return (EAttribute) bastionHostLinuxBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBastionHostLinuxBuilder_ec2_BlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList() {
		return (EAttribute) bastionHostLinuxBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBastionHostLinuxBuilder_ec2_InstanceName_java_lang_String_() {
		return (EAttribute) bastionHostLinuxBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBastionHostLinuxBuilder_ec2_InstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference() {
		return (EAttribute) bastionHostLinuxBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBastionHostLinuxBuilder_ec2_MachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference() {
		return (EAttribute) bastionHostLinuxBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBastionHostLinuxBuilder_ec2_SecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference() {
		return (EAttribute) bastionHostLinuxBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBastionHostLinuxBuilder_ec2_SubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() {
		return (EAttribute) bastionHostLinuxBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBastionHostLinuxBuilder_ec2_GeneratedClassName() {
		return (EAttribute) bastionHostLinuxBuilder_ec2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBastionHostLinuxBuilder_ec2_VarName() {
		return (EAttribute) bastionHostLinuxBuilder_ec2EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBastionHostLinuxBuilder_ec2_Identifier() {
		return (EAttribute) bastionHostLinuxBuilder_ec2EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBastionHostLinuxBuilder_ec2_AdditionalCode() {
		return (EAttribute) bastionHostLinuxBuilder_ec2EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSelectedSubnetsBuilder_ec2() {
		return selectedSubnetsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelectedSubnetsBuilder_ec2_AvailabilityZones_java_lang_String_AsList() {
		return (EAttribute) selectedSubnetsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelectedSubnetsBuilder_ec2_HasPublic_java_lang_Boolean_() {
		return (EAttribute) selectedSubnetsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelectedSubnetsBuilder_ec2_InternetConnectivityEstablishedWithIDependable_software_amazon_awscdk_core_IDependable_AsReference() {
		return (EAttribute) selectedSubnetsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelectedSubnetsBuilder_ec2_SubnetIds_java_lang_String_AsList() {
		return (EAttribute) selectedSubnetsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelectedSubnetsBuilder_ec2_Subnets_software_amazon_awscdk_services_ec2_ISubnet_AsList() {
		return (EAttribute) selectedSubnetsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelectedSubnetsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) selectedSubnetsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelectedSubnetsBuilder_ec2_VarName() {
		return (EAttribute) selectedSubnetsBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelectedSubnetsBuilder_ec2_Identifier() {
		return (EAttribute) selectedSubnetsBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelectedSubnetsBuilder_ec2_AdditionalCode() {
		return (EAttribute) selectedSubnetsBuilder_ec2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVpnGatewayPropsBuilder_ec2() {
		return vpnGatewayPropsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnGatewayPropsBuilder_ec2_Type_java_lang_String_() {
		return (EAttribute) vpnGatewayPropsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnGatewayPropsBuilder_ec2_AmazonSideAsn_java_lang_Number_() {
		return (EAttribute) vpnGatewayPropsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnGatewayPropsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) vpnGatewayPropsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnGatewayPropsBuilder_ec2_VarName() {
		return (EAttribute) vpnGatewayPropsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnGatewayPropsBuilder_ec2_Identifier() {
		return (EAttribute) vpnGatewayPropsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnGatewayPropsBuilder_ec2_AdditionalCode() {
		return (EAttribute) vpnGatewayPropsBuilder_ec2EClass.getEStructuralFeatures().get(5);
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
	public EClass getAclCidrConfigBuilder_ec2() {
		return aclCidrConfigBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAclCidrConfigBuilder_ec2_CidrBlock_java_lang_String_() {
		return (EAttribute) aclCidrConfigBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAclCidrConfigBuilder_ec2_Ipv6CidrBlock_java_lang_String_() {
		return (EAttribute) aclCidrConfigBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAclCidrConfigBuilder_ec2_GeneratedClassName() {
		return (EAttribute) aclCidrConfigBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAclCidrConfigBuilder_ec2_VarName() {
		return (EAttribute) aclCidrConfigBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAclCidrConfigBuilder_ec2_Identifier() {
		return (EAttribute) aclCidrConfigBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAclCidrConfigBuilder_ec2_AdditionalCode() {
		return (EAttribute) aclCidrConfigBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublicSubnetPropsBuilder_ec2() {
		return publicSubnetPropsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicSubnetPropsBuilder_ec2_AvailabilityZone_java_lang_String_() {
		return (EAttribute) publicSubnetPropsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicSubnetPropsBuilder_ec2_CidrBlock_java_lang_String_() {
		return (EAttribute) publicSubnetPropsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicSubnetPropsBuilder_ec2_VpcId_java_lang_String_() {
		return (EAttribute) publicSubnetPropsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicSubnetPropsBuilder_ec2_MapPublicIpOnLaunch_java_lang_Boolean_() {
		return (EAttribute) publicSubnetPropsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicSubnetPropsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) publicSubnetPropsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicSubnetPropsBuilder_ec2_VarName() {
		return (EAttribute) publicSubnetPropsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicSubnetPropsBuilder_ec2_Identifier() {
		return (EAttribute) publicSubnetPropsBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicSubnetPropsBuilder_ec2_AdditionalCode() {
		return (EAttribute) publicSubnetPropsBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNatInstanceProviderBuilder_ec2() {
		return natInstanceProviderBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNatInstanceProviderBuilder_ec2_InstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference() {
		return (EAttribute) natInstanceProviderBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNatInstanceProviderBuilder_ec2_AllowAllTraffic_java_lang_Boolean_() {
		return (EAttribute) natInstanceProviderBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNatInstanceProviderBuilder_ec2_KeyName_java_lang_String_() {
		return (EAttribute) natInstanceProviderBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNatInstanceProviderBuilder_ec2_MachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference() {
		return (EAttribute) natInstanceProviderBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNatInstanceProviderBuilder_ec2_SecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference() {
		return (EAttribute) natInstanceProviderBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNatInstanceProviderBuilder_ec2_GeneratedClassName() {
		return (EAttribute) natInstanceProviderBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNatInstanceProviderBuilder_ec2_VarName() {
		return (EAttribute) natInstanceProviderBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNatInstanceProviderBuilder_ec2_Identifier() {
		return (EAttribute) natInstanceProviderBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNatInstanceProviderBuilder_ec2_AdditionalCode() {
		return (EAttribute) natInstanceProviderBuilder_ec2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGatewayConfigBuilder_ec2() {
		return gatewayConfigBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayConfigBuilder_ec2_Az_java_lang_String_() {
		return (EAttribute) gatewayConfigBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayConfigBuilder_ec2_GatewayId_java_lang_String_() {
		return (EAttribute) gatewayConfigBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayConfigBuilder_ec2_GeneratedClassName() {
		return (EAttribute) gatewayConfigBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayConfigBuilder_ec2_VarName() {
		return (EAttribute) gatewayConfigBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayConfigBuilder_ec2_Identifier() {
		return (EAttribute) gatewayConfigBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayConfigBuilder_ec2_AdditionalCode() {
		return (EAttribute) gatewayConfigBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGenericLinuxImagePropsBuilder_ec2() {
		return genericLinuxImagePropsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenericLinuxImagePropsBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference() {
		return (EAttribute) genericLinuxImagePropsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenericLinuxImagePropsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) genericLinuxImagePropsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenericLinuxImagePropsBuilder_ec2_VarName() {
		return (EAttribute) genericLinuxImagePropsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenericLinuxImagePropsBuilder_ec2_Identifier() {
		return (EAttribute) genericLinuxImagePropsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenericLinuxImagePropsBuilder_ec2_AdditionalCode() {
		return (EAttribute) genericLinuxImagePropsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVpcPropsBuilder_ec2() {
		return vpcPropsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcPropsBuilder_ec2_Cidr_java_lang_String_() {
		return (EAttribute) vpcPropsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcPropsBuilder_ec2_DefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_() {
		return (EAttribute) vpcPropsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcPropsBuilder_ec2_EnableDnsHostnames_java_lang_Boolean_() {
		return (EAttribute) vpcPropsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcPropsBuilder_ec2_EnableDnsSupport_java_lang_Boolean_() {
		return (EAttribute) vpcPropsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcPropsBuilder_ec2_FlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap() {
		return (EAttribute) vpcPropsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcPropsBuilder_ec2_GatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap() {
		return (EAttribute) vpcPropsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcPropsBuilder_ec2_MaxAzs_java_lang_Number_() {
		return (EAttribute) vpcPropsBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcPropsBuilder_ec2_NatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference() {
		return (EAttribute) vpcPropsBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcPropsBuilder_ec2_NatGateways_java_lang_Number_() {
		return (EAttribute) vpcPropsBuilder_ec2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcPropsBuilder_ec2_NatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() {
		return (EAttribute) vpcPropsBuilder_ec2EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcPropsBuilder_ec2_SubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList() {
		return (EAttribute) vpcPropsBuilder_ec2EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcPropsBuilder_ec2_VpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap() {
		return (EAttribute) vpcPropsBuilder_ec2EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcPropsBuilder_ec2_VpnGateway_java_lang_Boolean_() {
		return (EAttribute) vpcPropsBuilder_ec2EClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcPropsBuilder_ec2_VpnGatewayAsn_java_lang_Number_() {
		return (EAttribute) vpcPropsBuilder_ec2EClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcPropsBuilder_ec2_VpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList() {
		return (EAttribute) vpcPropsBuilder_ec2EClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcPropsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) vpcPropsBuilder_ec2EClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcPropsBuilder_ec2_VarName() {
		return (EAttribute) vpcPropsBuilder_ec2EClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcPropsBuilder_ec2_Identifier() {
		return (EAttribute) vpcPropsBuilder_ec2EClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcPropsBuilder_ec2_AdditionalCode() {
		return (EAttribute) vpcPropsBuilder_ec2EClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBastionHostLinuxPropsBuilder_ec2() {
		return bastionHostLinuxPropsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBastionHostLinuxPropsBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() {
		return (EAttribute) bastionHostLinuxPropsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBastionHostLinuxPropsBuilder_ec2_AvailabilityZone_java_lang_String_() {
		return (EAttribute) bastionHostLinuxPropsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBastionHostLinuxPropsBuilder_ec2_BlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList() {
		return (EAttribute) bastionHostLinuxPropsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBastionHostLinuxPropsBuilder_ec2_InstanceName_java_lang_String_() {
		return (EAttribute) bastionHostLinuxPropsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBastionHostLinuxPropsBuilder_ec2_InstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference() {
		return (EAttribute) bastionHostLinuxPropsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBastionHostLinuxPropsBuilder_ec2_MachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference() {
		return (EAttribute) bastionHostLinuxPropsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBastionHostLinuxPropsBuilder_ec2_SecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference() {
		return (EAttribute) bastionHostLinuxPropsBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBastionHostLinuxPropsBuilder_ec2_SubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() {
		return (EAttribute) bastionHostLinuxPropsBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBastionHostLinuxPropsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) bastionHostLinuxPropsBuilder_ec2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBastionHostLinuxPropsBuilder_ec2_VarName() {
		return (EAttribute) bastionHostLinuxPropsBuilder_ec2EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBastionHostLinuxPropsBuilder_ec2_Identifier() {
		return (EAttribute) bastionHostLinuxPropsBuilder_ec2EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBastionHostLinuxPropsBuilder_ec2_AdditionalCode() {
		return (EAttribute) bastionHostLinuxPropsBuilder_ec2EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubnetNetworkAclAssociationPropsBuilder_ec2() {
		return subnetNetworkAclAssociationPropsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetNetworkAclAssociationPropsBuilder_ec2_NetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference() {
		return (EAttribute) subnetNetworkAclAssociationPropsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetNetworkAclAssociationPropsBuilder_ec2_SubnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference() {
		return (EAttribute) subnetNetworkAclAssociationPropsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetNetworkAclAssociationPropsBuilder_ec2_SubnetNetworkAclAssociationName_java_lang_String_() {
		return (EAttribute) subnetNetworkAclAssociationPropsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetNetworkAclAssociationPropsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) subnetNetworkAclAssociationPropsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetNetworkAclAssociationPropsBuilder_ec2_VarName() {
		return (EAttribute) subnetNetworkAclAssociationPropsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetNetworkAclAssociationPropsBuilder_ec2_Identifier() {
		return (EAttribute) subnetNetworkAclAssociationPropsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetNetworkAclAssociationPropsBuilder_ec2_AdditionalCode() {
		return (EAttribute) subnetNetworkAclAssociationPropsBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVpnGatewayBuilder_ec2() {
		return vpnGatewayBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnGatewayBuilder_ec2_Type_java_lang_String_() {
		return (EAttribute) vpnGatewayBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnGatewayBuilder_ec2_AmazonSideAsn_java_lang_Number_() {
		return (EAttribute) vpnGatewayBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnGatewayBuilder_ec2_GeneratedClassName() {
		return (EAttribute) vpnGatewayBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnGatewayBuilder_ec2_VarName() {
		return (EAttribute) vpnGatewayBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnGatewayBuilder_ec2_Identifier() {
		return (EAttribute) vpnGatewayBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnGatewayBuilder_ec2_AdditionalCode() {
		return (EAttribute) vpnGatewayBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAmazonLinuxImageBuilder_ec2() {
		return amazonLinuxImageBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAmazonLinuxImageBuilder_ec2_Edition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_() {
		return (EAttribute) amazonLinuxImageBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAmazonLinuxImageBuilder_ec2_Generation_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_() {
		return (EAttribute) amazonLinuxImageBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAmazonLinuxImageBuilder_ec2_Storage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_() {
		return (EAttribute) amazonLinuxImageBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAmazonLinuxImageBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference() {
		return (EAttribute) amazonLinuxImageBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAmazonLinuxImageBuilder_ec2_Virtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_() {
		return (EAttribute) amazonLinuxImageBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAmazonLinuxImageBuilder_ec2_GeneratedClassName() {
		return (EAttribute) amazonLinuxImageBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAmazonLinuxImageBuilder_ec2_VarName() {
		return (EAttribute) amazonLinuxImageBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAmazonLinuxImageBuilder_ec2_Identifier() {
		return (EAttribute) amazonLinuxImageBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAmazonLinuxImageBuilder_ec2_AdditionalCode() {
		return (EAttribute) amazonLinuxImageBuilder_ec2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlowLogPropsBuilder_ec2() {
		return flowLogPropsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogPropsBuilder_ec2_ResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference() {
		return (EAttribute) flowLogPropsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogPropsBuilder_ec2_FlowLogName_java_lang_String_() {
		return (EAttribute) flowLogPropsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogPropsBuilder_ec2_DestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference() {
		return (EAttribute) flowLogPropsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogPropsBuilder_ec2_TrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_() {
		return (EAttribute) flowLogPropsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogPropsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) flowLogPropsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogPropsBuilder_ec2_VarName() {
		return (EAttribute) flowLogPropsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogPropsBuilder_ec2_Identifier() {
		return (EAttribute) flowLogPropsBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogPropsBuilder_ec2_AdditionalCode() {
		return (EAttribute) flowLogPropsBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterfaceVpcEndpointPropsBuilder_ec2() {
		return interfaceVpcEndpointPropsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointPropsBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() {
		return (EAttribute) interfaceVpcEndpointPropsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointPropsBuilder_ec2_ServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference() {
		return (EAttribute) interfaceVpcEndpointPropsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointPropsBuilder_ec2_LookupSupportedAzs_java_lang_Boolean_() {
		return (EAttribute) interfaceVpcEndpointPropsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointPropsBuilder_ec2_Open_java_lang_Boolean_() {
		return (EAttribute) interfaceVpcEndpointPropsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointPropsBuilder_ec2_PrivateDnsEnabled_java_lang_Boolean_() {
		return (EAttribute) interfaceVpcEndpointPropsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointPropsBuilder_ec2_SecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList() {
		return (EAttribute) interfaceVpcEndpointPropsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointPropsBuilder_ec2_SubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() {
		return (EAttribute) interfaceVpcEndpointPropsBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointPropsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) interfaceVpcEndpointPropsBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointPropsBuilder_ec2_VarName() {
		return (EAttribute) interfaceVpcEndpointPropsBuilder_ec2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointPropsBuilder_ec2_Identifier() {
		return (EAttribute) interfaceVpcEndpointPropsBuilder_ec2EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointPropsBuilder_ec2_AdditionalCode() {
		return (EAttribute) interfaceVpcEndpointPropsBuilder_ec2EClass.getEStructuralFeatures().get(10);
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
	public EClass getPortBuilder_ec2() {
		return portBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortBuilder_ec2_Protocol_software_amazon_awscdk_services_ec2_Protocol_() {
		return (EAttribute) portBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortBuilder_ec2_StringRepresentation_java_lang_String_() {
		return (EAttribute) portBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortBuilder_ec2_FromPort_java_lang_Number_() {
		return (EAttribute) portBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortBuilder_ec2_ToPort_java_lang_Number_() {
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
	public EClass getFlowLogDestinationConfigBuilder_ec2() {
		return flowLogDestinationConfigBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogDestinationConfigBuilder_ec2_LogDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_() {
		return (EAttribute) flowLogDestinationConfigBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogDestinationConfigBuilder_ec2_IamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() {
		return (EAttribute) flowLogDestinationConfigBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogDestinationConfigBuilder_ec2_LogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference() {
		return (EAttribute) flowLogDestinationConfigBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogDestinationConfigBuilder_ec2_S3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference() {
		return (EAttribute) flowLogDestinationConfigBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogDestinationConfigBuilder_ec2_GeneratedClassName() {
		return (EAttribute) flowLogDestinationConfigBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogDestinationConfigBuilder_ec2_VarName() {
		return (EAttribute) flowLogDestinationConfigBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogDestinationConfigBuilder_ec2_Identifier() {
		return (EAttribute) flowLogDestinationConfigBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogDestinationConfigBuilder_ec2_AdditionalCode() {
		return (EAttribute) flowLogDestinationConfigBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAmazonLinuxImagePropsBuilder_ec2() {
		return amazonLinuxImagePropsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAmazonLinuxImagePropsBuilder_ec2_Edition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_() {
		return (EAttribute) amazonLinuxImagePropsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAmazonLinuxImagePropsBuilder_ec2_Generation_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_() {
		return (EAttribute) amazonLinuxImagePropsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAmazonLinuxImagePropsBuilder_ec2_Storage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_() {
		return (EAttribute) amazonLinuxImagePropsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAmazonLinuxImagePropsBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference() {
		return (EAttribute) amazonLinuxImagePropsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAmazonLinuxImagePropsBuilder_ec2_Virtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_() {
		return (EAttribute) amazonLinuxImagePropsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAmazonLinuxImagePropsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) amazonLinuxImagePropsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAmazonLinuxImagePropsBuilder_ec2_VarName() {
		return (EAttribute) amazonLinuxImagePropsBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAmazonLinuxImagePropsBuilder_ec2_Identifier() {
		return (EAttribute) amazonLinuxImagePropsBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAmazonLinuxImagePropsBuilder_ec2_AdditionalCode() {
		return (EAttribute) amazonLinuxImagePropsBuilder_ec2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLookupMachineImagePropsBuilder_ec2() {
		return lookupMachineImagePropsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLookupMachineImagePropsBuilder_ec2_Name_java_lang_String_() {
		return (EAttribute) lookupMachineImagePropsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLookupMachineImagePropsBuilder_ec2_Owners_java_lang_String_AsList() {
		return (EAttribute) lookupMachineImagePropsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLookupMachineImagePropsBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference() {
		return (EAttribute) lookupMachineImagePropsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLookupMachineImagePropsBuilder_ec2_Windows_java_lang_Boolean_() {
		return (EAttribute) lookupMachineImagePropsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLookupMachineImagePropsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) lookupMachineImagePropsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLookupMachineImagePropsBuilder_ec2_VarName() {
		return (EAttribute) lookupMachineImagePropsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLookupMachineImagePropsBuilder_ec2_Identifier() {
		return (EAttribute) lookupMachineImagePropsBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLookupMachineImagePropsBuilder_ec2_AdditionalCode() {
		return (EAttribute) lookupMachineImagePropsBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEbsDeviceSnapshotOptionsBuilder_ec2() {
		return ebsDeviceSnapshotOptionsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEbsDeviceSnapshotOptionsBuilder_ec2_VolumeSize_java_lang_Number_() {
		return (EAttribute) ebsDeviceSnapshotOptionsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEbsDeviceSnapshotOptionsBuilder_ec2_DeleteOnTermination_java_lang_Boolean_() {
		return (EAttribute) ebsDeviceSnapshotOptionsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEbsDeviceSnapshotOptionsBuilder_ec2_Iops_java_lang_Number_() {
		return (EAttribute) ebsDeviceSnapshotOptionsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEbsDeviceSnapshotOptionsBuilder_ec2_VolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_() {
		return (EAttribute) ebsDeviceSnapshotOptionsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEbsDeviceSnapshotOptionsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) ebsDeviceSnapshotOptionsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEbsDeviceSnapshotOptionsBuilder_ec2_VarName() {
		return (EAttribute) ebsDeviceSnapshotOptionsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEbsDeviceSnapshotOptionsBuilder_ec2_Identifier() {
		return (EAttribute) ebsDeviceSnapshotOptionsBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEbsDeviceSnapshotOptionsBuilder_ec2_AdditionalCode() {
		return (EAttribute) ebsDeviceSnapshotOptionsBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVpnConnectionPropsBuilder_ec2() {
		return vpnConnectionPropsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnConnectionPropsBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() {
		return (EAttribute) vpnConnectionPropsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnConnectionPropsBuilder_ec2_Ip_java_lang_String_() {
		return (EAttribute) vpnConnectionPropsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnConnectionPropsBuilder_ec2_Asn_java_lang_Number_() {
		return (EAttribute) vpnConnectionPropsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnConnectionPropsBuilder_ec2_StaticRoutes_java_lang_String_AsList() {
		return (EAttribute) vpnConnectionPropsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnConnectionPropsBuilder_ec2_TunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList() {
		return (EAttribute) vpnConnectionPropsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnConnectionPropsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) vpnConnectionPropsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnConnectionPropsBuilder_ec2_VarName() {
		return (EAttribute) vpnConnectionPropsBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnConnectionPropsBuilder_ec2_Identifier() {
		return (EAttribute) vpnConnectionPropsBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnConnectionPropsBuilder_ec2_AdditionalCode() {
		return (EAttribute) vpnConnectionPropsBuilder_ec2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVpnConnectionBuilder_ec2() {
		return vpnConnectionBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnConnectionBuilder_ec2_Ip_java_lang_String_() {
		return (EAttribute) vpnConnectionBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnConnectionBuilder_ec2_Asn_java_lang_Number_() {
		return (EAttribute) vpnConnectionBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnConnectionBuilder_ec2_StaticRoutes_java_lang_String_AsList() {
		return (EAttribute) vpnConnectionBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnConnectionBuilder_ec2_TunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList() {
		return (EAttribute) vpnConnectionBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnConnectionBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() {
		return (EAttribute) vpnConnectionBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnConnectionBuilder_ec2_GeneratedClassName() {
		return (EAttribute) vpnConnectionBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnConnectionBuilder_ec2_VarName() {
		return (EAttribute) vpnConnectionBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnConnectionBuilder_ec2_Identifier() {
		return (EAttribute) vpnConnectionBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpnConnectionBuilder_ec2_AdditionalCode() {
		return (EAttribute) vpnConnectionBuilder_ec2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlockDeviceBuilder_ec2() {
		return blockDeviceBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlockDeviceBuilder_ec2_DeviceName_java_lang_String_() {
		return (EAttribute) blockDeviceBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlockDeviceBuilder_ec2_VolumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference() {
		return (EAttribute) blockDeviceBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlockDeviceBuilder_ec2_MappingEnabled_java_lang_Boolean_() {
		return (EAttribute) blockDeviceBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlockDeviceBuilder_ec2_GeneratedClassName() {
		return (EAttribute) blockDeviceBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlockDeviceBuilder_ec2_VarName() {
		return (EAttribute) blockDeviceBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlockDeviceBuilder_ec2_Identifier() {
		return (EAttribute) blockDeviceBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlockDeviceBuilder_ec2_AdditionalCode() {
		return (EAttribute) blockDeviceBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEbsDevicePropsBuilder_ec2() {
		return ebsDevicePropsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEbsDevicePropsBuilder_ec2_SnapshotId_java_lang_String_() {
		return (EAttribute) ebsDevicePropsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEbsDevicePropsBuilder_ec2_VolumeSize_java_lang_Number_() {
		return (EAttribute) ebsDevicePropsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEbsDevicePropsBuilder_ec2_DeleteOnTermination_java_lang_Boolean_() {
		return (EAttribute) ebsDevicePropsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEbsDevicePropsBuilder_ec2_Iops_java_lang_Number_() {
		return (EAttribute) ebsDevicePropsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEbsDevicePropsBuilder_ec2_VolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_() {
		return (EAttribute) ebsDevicePropsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEbsDevicePropsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) ebsDevicePropsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEbsDevicePropsBuilder_ec2_VarName() {
		return (EAttribute) ebsDevicePropsBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEbsDevicePropsBuilder_ec2_Identifier() {
		return (EAttribute) ebsDevicePropsBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEbsDevicePropsBuilder_ec2_AdditionalCode() {
		return (EAttribute) ebsDevicePropsBuilder_ec2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkAclEntryPropsBuilder_ec2() {
		return networkAclEntryPropsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclEntryPropsBuilder_ec2_NetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference() {
		return (EAttribute) networkAclEntryPropsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclEntryPropsBuilder_ec2_CidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference() {
		return (EAttribute) networkAclEntryPropsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclEntryPropsBuilder_ec2_RuleNumber_java_lang_Number_() {
		return (EAttribute) networkAclEntryPropsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclEntryPropsBuilder_ec2_TrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference() {
		return (EAttribute) networkAclEntryPropsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclEntryPropsBuilder_ec2_Direction_software_amazon_awscdk_services_ec2_TrafficDirection_() {
		return (EAttribute) networkAclEntryPropsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclEntryPropsBuilder_ec2_NetworkAclEntryName_java_lang_String_() {
		return (EAttribute) networkAclEntryPropsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclEntryPropsBuilder_ec2_RuleAction_software_amazon_awscdk_services_ec2_Action_() {
		return (EAttribute) networkAclEntryPropsBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclEntryPropsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) networkAclEntryPropsBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclEntryPropsBuilder_ec2_VarName() {
		return (EAttribute) networkAclEntryPropsBuilder_ec2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclEntryPropsBuilder_ec2_Identifier() {
		return (EAttribute) networkAclEntryPropsBuilder_ec2EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclEntryPropsBuilder_ec2_AdditionalCode() {
		return (EAttribute) networkAclEntryPropsBuilder_ec2EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddRouteOptionsBuilder_ec2() {
		return addRouteOptionsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddRouteOptionsBuilder_ec2_RouterId_java_lang_String_() {
		return (EAttribute) addRouteOptionsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddRouteOptionsBuilder_ec2_RouterType_software_amazon_awscdk_services_ec2_RouterType_() {
		return (EAttribute) addRouteOptionsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddRouteOptionsBuilder_ec2_DestinationCidrBlock_java_lang_String_() {
		return (EAttribute) addRouteOptionsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddRouteOptionsBuilder_ec2_DestinationIpv6CidrBlock_java_lang_String_() {
		return (EAttribute) addRouteOptionsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddRouteOptionsBuilder_ec2_EnablesInternetConnectivity_java_lang_Boolean_() {
		return (EAttribute) addRouteOptionsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddRouteOptionsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) addRouteOptionsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddRouteOptionsBuilder_ec2_VarName() {
		return (EAttribute) addRouteOptionsBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddRouteOptionsBuilder_ec2_Identifier() {
		return (EAttribute) addRouteOptionsBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddRouteOptionsBuilder_ec2_AdditionalCode() {
		return (EAttribute) addRouteOptionsBuilder_ec2EClass.getEStructuralFeatures().get(8);
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
	public EAttribute getPublicSubnetBuilder_ec2_AvailabilityZone_java_lang_String_() {
		return (EAttribute) publicSubnetBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicSubnetBuilder_ec2_CidrBlock_java_lang_String_() {
		return (EAttribute) publicSubnetBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicSubnetBuilder_ec2_VpcId_java_lang_String_() {
		return (EAttribute) publicSubnetBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicSubnetBuilder_ec2_MapPublicIpOnLaunch_java_lang_Boolean_() {
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
	public EClass getInterfaceVpcEndpointOptionsBuilder_ec2() {
		return interfaceVpcEndpointOptionsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointOptionsBuilder_ec2_ServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference() {
		return (EAttribute) interfaceVpcEndpointOptionsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointOptionsBuilder_ec2_LookupSupportedAzs_java_lang_Boolean_() {
		return (EAttribute) interfaceVpcEndpointOptionsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointOptionsBuilder_ec2_Open_java_lang_Boolean_() {
		return (EAttribute) interfaceVpcEndpointOptionsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointOptionsBuilder_ec2_PrivateDnsEnabled_java_lang_Boolean_() {
		return (EAttribute) interfaceVpcEndpointOptionsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointOptionsBuilder_ec2_SecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList() {
		return (EAttribute) interfaceVpcEndpointOptionsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointOptionsBuilder_ec2_SubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() {
		return (EAttribute) interfaceVpcEndpointOptionsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointOptionsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) interfaceVpcEndpointOptionsBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointOptionsBuilder_ec2_VarName() {
		return (EAttribute) interfaceVpcEndpointOptionsBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointOptionsBuilder_ec2_Identifier() {
		return (EAttribute) interfaceVpcEndpointOptionsBuilder_ec2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointOptionsBuilder_ec2_AdditionalCode() {
		return (EAttribute) interfaceVpcEndpointOptionsBuilder_ec2EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinuxUserDataOptionsBuilder_ec2() {
		return linuxUserDataOptionsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinuxUserDataOptionsBuilder_ec2_Shebang_java_lang_String_() {
		return (EAttribute) linuxUserDataOptionsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinuxUserDataOptionsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) linuxUserDataOptionsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinuxUserDataOptionsBuilder_ec2_VarName() {
		return (EAttribute) linuxUserDataOptionsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinuxUserDataOptionsBuilder_ec2_Identifier() {
		return (EAttribute) linuxUserDataOptionsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinuxUserDataOptionsBuilder_ec2_AdditionalCode() {
		return (EAttribute) linuxUserDataOptionsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkAclPropsBuilder_ec2() {
		return networkAclPropsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclPropsBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() {
		return (EAttribute) networkAclPropsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclPropsBuilder_ec2_NetworkAclName_java_lang_String_() {
		return (EAttribute) networkAclPropsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclPropsBuilder_ec2_SubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() {
		return (EAttribute) networkAclPropsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclPropsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) networkAclPropsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclPropsBuilder_ec2_VarName() {
		return (EAttribute) networkAclPropsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclPropsBuilder_ec2_Identifier() {
		return (EAttribute) networkAclPropsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclPropsBuilder_ec2_AdditionalCode() {
		return (EAttribute) networkAclPropsBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublicSubnetAttributesBuilder_ec2() {
		return publicSubnetAttributesBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicSubnetAttributesBuilder_ec2_SubnetId_java_lang_String_() {
		return (EAttribute) publicSubnetAttributesBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicSubnetAttributesBuilder_ec2_AvailabilityZone_java_lang_String_() {
		return (EAttribute) publicSubnetAttributesBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicSubnetAttributesBuilder_ec2_RouteTableId_java_lang_String_() {
		return (EAttribute) publicSubnetAttributesBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicSubnetAttributesBuilder_ec2_GeneratedClassName() {
		return (EAttribute) publicSubnetAttributesBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicSubnetAttributesBuilder_ec2_VarName() {
		return (EAttribute) publicSubnetAttributesBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicSubnetAttributesBuilder_ec2_Identifier() {
		return (EAttribute) publicSubnetAttributesBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicSubnetAttributesBuilder_ec2_AdditionalCode() {
		return (EAttribute) publicSubnetAttributesBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getS3DownloadOptionsBuilder_ec2() {
		return s3DownloadOptionsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getS3DownloadOptionsBuilder_ec2_BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference() {
		return (EAttribute) s3DownloadOptionsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getS3DownloadOptionsBuilder_ec2_BucketKey_java_lang_String_() {
		return (EAttribute) s3DownloadOptionsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getS3DownloadOptionsBuilder_ec2_LocalFile_java_lang_String_() {
		return (EAttribute) s3DownloadOptionsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getS3DownloadOptionsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) s3DownloadOptionsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getS3DownloadOptionsBuilder_ec2_VarName() {
		return (EAttribute) s3DownloadOptionsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getS3DownloadOptionsBuilder_ec2_Identifier() {
		return (EAttribute) s3DownloadOptionsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getS3DownloadOptionsBuilder_ec2_AdditionalCode() {
		return (EAttribute) s3DownloadOptionsBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlowLogBuilder_ec2() {
		return flowLogBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogBuilder_ec2_DestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference() {
		return (EAttribute) flowLogBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogBuilder_ec2_TrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_() {
		return (EAttribute) flowLogBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogBuilder_ec2_ResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference() {
		return (EAttribute) flowLogBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogBuilder_ec2_FlowLogName_java_lang_String_() {
		return (EAttribute) flowLogBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogBuilder_ec2_GeneratedClassName() {
		return (EAttribute) flowLogBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogBuilder_ec2_VarName() {
		return (EAttribute) flowLogBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogBuilder_ec2_Identifier() {
		return (EAttribute) flowLogBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogBuilder_ec2_AdditionalCode() {
		return (EAttribute) flowLogBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectionsBuilder_ec2() {
		return connectionsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionsBuilder_ec2_DefaultPortWithPort_software_amazon_awscdk_services_ec2_Port_AsReference() {
		return (EAttribute) connectionsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionsBuilder_ec2_PeerWithIPeer_software_amazon_awscdk_services_ec2_IPeer_AsReference() {
		return (EAttribute) connectionsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionsBuilder_ec2_SecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList() {
		return (EAttribute) connectionsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) connectionsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionsBuilder_ec2_VarName() {
		return (EAttribute) connectionsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionsBuilder_ec2_Identifier() {
		return (EAttribute) connectionsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionsBuilder_ec2_AdditionalCode() {
		return (EAttribute) connectionsBuilder_ec2EClass.getEStructuralFeatures().get(6);
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
	public EClass getVpcEndpointServiceBuilder_ec2() {
		return vpcEndpointServiceBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcEndpointServiceBuilder_ec2_VpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList() {
		return (EAttribute) vpcEndpointServiceBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcEndpointServiceBuilder_ec2_AcceptanceRequired_java_lang_Boolean_() {
		return (EAttribute) vpcEndpointServiceBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcEndpointServiceBuilder_ec2_VpcEndpointServiceName_java_lang_String_() {
		return (EAttribute) vpcEndpointServiceBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcEndpointServiceBuilder_ec2_WhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList() {
		return (EAttribute) vpcEndpointServiceBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcEndpointServiceBuilder_ec2_GeneratedClassName() {
		return (EAttribute) vpcEndpointServiceBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcEndpointServiceBuilder_ec2_VarName() {
		return (EAttribute) vpcEndpointServiceBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcEndpointServiceBuilder_ec2_Identifier() {
		return (EAttribute) vpcEndpointServiceBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcEndpointServiceBuilder_ec2_AdditionalCode() {
		return (EAttribute) vpcEndpointServiceBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectionRuleBuilder_ec2() {
		return connectionRuleBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionRuleBuilder_ec2_FromPort_java_lang_Number_() {
		return (EAttribute) connectionRuleBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionRuleBuilder_ec2_Description_java_lang_String_() {
		return (EAttribute) connectionRuleBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionRuleBuilder_ec2_Protocol_java_lang_String_() {
		return (EAttribute) connectionRuleBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionRuleBuilder_ec2_ToPort_java_lang_Number_() {
		return (EAttribute) connectionRuleBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionRuleBuilder_ec2_GeneratedClassName() {
		return (EAttribute) connectionRuleBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionRuleBuilder_ec2_VarName() {
		return (EAttribute) connectionRuleBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionRuleBuilder_ec2_Identifier() {
		return (EAttribute) connectionRuleBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionRuleBuilder_ec2_AdditionalCode() {
		return (EAttribute) connectionRuleBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubnetPropsBuilder_ec2() {
		return subnetPropsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetPropsBuilder_ec2_AvailabilityZone_java_lang_String_() {
		return (EAttribute) subnetPropsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetPropsBuilder_ec2_CidrBlock_java_lang_String_() {
		return (EAttribute) subnetPropsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetPropsBuilder_ec2_VpcId_java_lang_String_() {
		return (EAttribute) subnetPropsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetPropsBuilder_ec2_MapPublicIpOnLaunch_java_lang_Boolean_() {
		return (EAttribute) subnetPropsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetPropsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) subnetPropsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetPropsBuilder_ec2_VarName() {
		return (EAttribute) subnetPropsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetPropsBuilder_ec2_Identifier() {
		return (EAttribute) subnetPropsBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetPropsBuilder_ec2_AdditionalCode() {
		return (EAttribute) subnetPropsBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubnetNetworkAclAssociationBuilder_ec2() {
		return subnetNetworkAclAssociationBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetNetworkAclAssociationBuilder_ec2_NetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference() {
		return (EAttribute) subnetNetworkAclAssociationBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetNetworkAclAssociationBuilder_ec2_SubnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference() {
		return (EAttribute) subnetNetworkAclAssociationBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetNetworkAclAssociationBuilder_ec2_SubnetNetworkAclAssociationName_java_lang_String_() {
		return (EAttribute) subnetNetworkAclAssociationBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetNetworkAclAssociationBuilder_ec2_GeneratedClassName() {
		return (EAttribute) subnetNetworkAclAssociationBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetNetworkAclAssociationBuilder_ec2_VarName() {
		return (EAttribute) subnetNetworkAclAssociationBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetNetworkAclAssociationBuilder_ec2_Identifier() {
		return (EAttribute) subnetNetworkAclAssociationBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetNetworkAclAssociationBuilder_ec2_AdditionalCode() {
		return (EAttribute) subnetNetworkAclAssociationBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMachineImageConfigBuilder_ec2() {
		return machineImageConfigBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineImageConfigBuilder_ec2_ImageId_java_lang_String_() {
		return (EAttribute) machineImageConfigBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineImageConfigBuilder_ec2_OsType_software_amazon_awscdk_services_ec2_OperatingSystemType_() {
		return (EAttribute) machineImageConfigBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineImageConfigBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference() {
		return (EAttribute) machineImageConfigBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineImageConfigBuilder_ec2_GeneratedClassName() {
		return (EAttribute) machineImageConfigBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineImageConfigBuilder_ec2_VarName() {
		return (EAttribute) machineImageConfigBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineImageConfigBuilder_ec2_Identifier() {
		return (EAttribute) machineImageConfigBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineImageConfigBuilder_ec2_AdditionalCode() {
		return (EAttribute) machineImageConfigBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWindowsImagePropsBuilder_ec2() {
		return windowsImagePropsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWindowsImagePropsBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference() {
		return (EAttribute) windowsImagePropsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWindowsImagePropsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) windowsImagePropsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWindowsImagePropsBuilder_ec2_VarName() {
		return (EAttribute) windowsImagePropsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWindowsImagePropsBuilder_ec2_Identifier() {
		return (EAttribute) windowsImagePropsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWindowsImagePropsBuilder_ec2_AdditionalCode() {
		return (EAttribute) windowsImagePropsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstancePropsBuilder_ec2() {
		return instancePropsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstancePropsBuilder_ec2_InstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference() {
		return (EAttribute) instancePropsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstancePropsBuilder_ec2_MachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference() {
		return (EAttribute) instancePropsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstancePropsBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() {
		return (EAttribute) instancePropsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstancePropsBuilder_ec2_AllowAllOutbound_java_lang_Boolean_() {
		return (EAttribute) instancePropsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstancePropsBuilder_ec2_AvailabilityZone_java_lang_String_() {
		return (EAttribute) instancePropsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstancePropsBuilder_ec2_BlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList() {
		return (EAttribute) instancePropsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstancePropsBuilder_ec2_InstanceName_java_lang_String_() {
		return (EAttribute) instancePropsBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstancePropsBuilder_ec2_KeyName_java_lang_String_() {
		return (EAttribute) instancePropsBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstancePropsBuilder_ec2_PrivateIpAddress_java_lang_String_() {
		return (EAttribute) instancePropsBuilder_ec2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstancePropsBuilder_ec2_ResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return (EAttribute) instancePropsBuilder_ec2EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstancePropsBuilder_ec2_RoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() {
		return (EAttribute) instancePropsBuilder_ec2EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstancePropsBuilder_ec2_SecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference() {
		return (EAttribute) instancePropsBuilder_ec2EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstancePropsBuilder_ec2_SourceDestCheck_java_lang_Boolean_() {
		return (EAttribute) instancePropsBuilder_ec2EClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstancePropsBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference() {
		return (EAttribute) instancePropsBuilder_ec2EClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstancePropsBuilder_ec2_VpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() {
		return (EAttribute) instancePropsBuilder_ec2EClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstancePropsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) instancePropsBuilder_ec2EClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstancePropsBuilder_ec2_VarName() {
		return (EAttribute) instancePropsBuilder_ec2EClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstancePropsBuilder_ec2_Identifier() {
		return (EAttribute) instancePropsBuilder_ec2EClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstancePropsBuilder_ec2_AdditionalCode() {
		return (EAttribute) instancePropsBuilder_ec2EClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNatInstancePropsBuilder_ec2() {
		return natInstancePropsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNatInstancePropsBuilder_ec2_InstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference() {
		return (EAttribute) natInstancePropsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNatInstancePropsBuilder_ec2_AllowAllTraffic_java_lang_Boolean_() {
		return (EAttribute) natInstancePropsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNatInstancePropsBuilder_ec2_KeyName_java_lang_String_() {
		return (EAttribute) natInstancePropsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNatInstancePropsBuilder_ec2_MachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference() {
		return (EAttribute) natInstancePropsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNatInstancePropsBuilder_ec2_SecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference() {
		return (EAttribute) natInstancePropsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNatInstancePropsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) natInstancePropsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNatInstancePropsBuilder_ec2_VarName() {
		return (EAttribute) natInstancePropsBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNatInstancePropsBuilder_ec2_Identifier() {
		return (EAttribute) natInstancePropsBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNatInstancePropsBuilder_ec2_AdditionalCode() {
		return (EAttribute) natInstancePropsBuilder_ec2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrivateSubnetPropsBuilder_ec2() {
		return privateSubnetPropsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrivateSubnetPropsBuilder_ec2_AvailabilityZone_java_lang_String_() {
		return (EAttribute) privateSubnetPropsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrivateSubnetPropsBuilder_ec2_CidrBlock_java_lang_String_() {
		return (EAttribute) privateSubnetPropsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrivateSubnetPropsBuilder_ec2_VpcId_java_lang_String_() {
		return (EAttribute) privateSubnetPropsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrivateSubnetPropsBuilder_ec2_MapPublicIpOnLaunch_java_lang_Boolean_() {
		return (EAttribute) privateSubnetPropsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrivateSubnetPropsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) privateSubnetPropsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrivateSubnetPropsBuilder_ec2_VarName() {
		return (EAttribute) privateSubnetPropsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrivateSubnetPropsBuilder_ec2_Identifier() {
		return (EAttribute) privateSubnetPropsBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrivateSubnetPropsBuilder_ec2_AdditionalCode() {
		return (EAttribute) privateSubnetPropsBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrivateSubnetAttributesBuilder_ec2() {
		return privateSubnetAttributesBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrivateSubnetAttributesBuilder_ec2_SubnetId_java_lang_String_() {
		return (EAttribute) privateSubnetAttributesBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrivateSubnetAttributesBuilder_ec2_AvailabilityZone_java_lang_String_() {
		return (EAttribute) privateSubnetAttributesBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrivateSubnetAttributesBuilder_ec2_RouteTableId_java_lang_String_() {
		return (EAttribute) privateSubnetAttributesBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrivateSubnetAttributesBuilder_ec2_GeneratedClassName() {
		return (EAttribute) privateSubnetAttributesBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrivateSubnetAttributesBuilder_ec2_VarName() {
		return (EAttribute) privateSubnetAttributesBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrivateSubnetAttributesBuilder_ec2_Identifier() {
		return (EAttribute) privateSubnetAttributesBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrivateSubnetAttributesBuilder_ec2_AdditionalCode() {
		return (EAttribute) privateSubnetAttributesBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterfaceVpcEndpointBuilder_ec2() {
		return interfaceVpcEndpointBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointBuilder_ec2_ServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference() {
		return (EAttribute) interfaceVpcEndpointBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointBuilder_ec2_LookupSupportedAzs_java_lang_Boolean_() {
		return (EAttribute) interfaceVpcEndpointBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointBuilder_ec2_Open_java_lang_Boolean_() {
		return (EAttribute) interfaceVpcEndpointBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointBuilder_ec2_PrivateDnsEnabled_java_lang_Boolean_() {
		return (EAttribute) interfaceVpcEndpointBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointBuilder_ec2_SecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList() {
		return (EAttribute) interfaceVpcEndpointBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointBuilder_ec2_SubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() {
		return (EAttribute) interfaceVpcEndpointBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() {
		return (EAttribute) interfaceVpcEndpointBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointBuilder_ec2_GeneratedClassName() {
		return (EAttribute) interfaceVpcEndpointBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointBuilder_ec2_VarName() {
		return (EAttribute) interfaceVpcEndpointBuilder_ec2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointBuilder_ec2_Identifier() {
		return (EAttribute) interfaceVpcEndpointBuilder_ec2EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceVpcEndpointBuilder_ec2_AdditionalCode() {
		return (EAttribute) interfaceVpcEndpointBuilder_ec2EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigureNatOptionsBuilder_ec2() {
		return configureNatOptionsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfigureNatOptionsBuilder_ec2_NatSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList() {
		return (EAttribute) configureNatOptionsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfigureNatOptionsBuilder_ec2_PrivateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList() {
		return (EAttribute) configureNatOptionsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfigureNatOptionsBuilder_ec2_VpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference() {
		return (EAttribute) configureNatOptionsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfigureNatOptionsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) configureNatOptionsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfigureNatOptionsBuilder_ec2_VarName() {
		return (EAttribute) configureNatOptionsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfigureNatOptionsBuilder_ec2_Identifier() {
		return (EAttribute) configureNatOptionsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfigureNatOptionsBuilder_ec2_AdditionalCode() {
		return (EAttribute) configureNatOptionsBuilder_ec2EClass.getEStructuralFeatures().get(6);
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
	public EClass getAclIcmpBuilder_ec2() {
		return aclIcmpBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAclIcmpBuilder_ec2_Code_java_lang_Number_() {
		return (EAttribute) aclIcmpBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAclIcmpBuilder_ec2_Type_java_lang_Number_() {
		return (EAttribute) aclIcmpBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAclIcmpBuilder_ec2_GeneratedClassName() {
		return (EAttribute) aclIcmpBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAclIcmpBuilder_ec2_VarName() {
		return (EAttribute) aclIcmpBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAclIcmpBuilder_ec2_Identifier() {
		return (EAttribute) aclIcmpBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAclIcmpBuilder_ec2_AdditionalCode() {
		return (EAttribute) aclIcmpBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkAclBuilder_ec2() {
		return networkAclBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() {
		return (EAttribute) networkAclBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclBuilder_ec2_NetworkAclName_java_lang_String_() {
		return (EAttribute) networkAclBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclBuilder_ec2_SubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() {
		return (EAttribute) networkAclBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclBuilder_ec2_GeneratedClassName() {
		return (EAttribute) networkAclBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclBuilder_ec2_VarName() {
		return (EAttribute) networkAclBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclBuilder_ec2_Identifier() {
		return (EAttribute) networkAclBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclBuilder_ec2_AdditionalCode() {
		return (EAttribute) networkAclBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommonNetworkAclEntryOptionsBuilder_ec2() {
		return commonNetworkAclEntryOptionsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommonNetworkAclEntryOptionsBuilder_ec2_CidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference() {
		return (EAttribute) commonNetworkAclEntryOptionsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommonNetworkAclEntryOptionsBuilder_ec2_RuleNumber_java_lang_Number_() {
		return (EAttribute) commonNetworkAclEntryOptionsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommonNetworkAclEntryOptionsBuilder_ec2_TrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference() {
		return (EAttribute) commonNetworkAclEntryOptionsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommonNetworkAclEntryOptionsBuilder_ec2_Direction_software_amazon_awscdk_services_ec2_TrafficDirection_() {
		return (EAttribute) commonNetworkAclEntryOptionsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommonNetworkAclEntryOptionsBuilder_ec2_NetworkAclEntryName_java_lang_String_() {
		return (EAttribute) commonNetworkAclEntryOptionsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommonNetworkAclEntryOptionsBuilder_ec2_RuleAction_software_amazon_awscdk_services_ec2_Action_() {
		return (EAttribute) commonNetworkAclEntryOptionsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommonNetworkAclEntryOptionsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) commonNetworkAclEntryOptionsBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommonNetworkAclEntryOptionsBuilder_ec2_VarName() {
		return (EAttribute) commonNetworkAclEntryOptionsBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommonNetworkAclEntryOptionsBuilder_ec2_Identifier() {
		return (EAttribute) commonNetworkAclEntryOptionsBuilder_ec2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommonNetworkAclEntryOptionsBuilder_ec2_AdditionalCode() {
		return (EAttribute) commonNetworkAclEntryOptionsBuilder_ec2EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGatewayVpcEndpointOptionsBuilder_ec2() {
		return gatewayVpcEndpointOptionsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayVpcEndpointOptionsBuilder_ec2_ServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference() {
		return (EAttribute) gatewayVpcEndpointOptionsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayVpcEndpointOptionsBuilder_ec2_Subnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList() {
		return (EAttribute) gatewayVpcEndpointOptionsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayVpcEndpointOptionsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) gatewayVpcEndpointOptionsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayVpcEndpointOptionsBuilder_ec2_VarName() {
		return (EAttribute) gatewayVpcEndpointOptionsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayVpcEndpointOptionsBuilder_ec2_Identifier() {
		return (EAttribute) gatewayVpcEndpointOptionsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayVpcEndpointOptionsBuilder_ec2_AdditionalCode() {
		return (EAttribute) gatewayVpcEndpointOptionsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLookupMachineImageBuilder_ec2() {
		return lookupMachineImageBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLookupMachineImageBuilder_ec2_Name_java_lang_String_() {
		return (EAttribute) lookupMachineImageBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLookupMachineImageBuilder_ec2_Owners_java_lang_String_AsList() {
		return (EAttribute) lookupMachineImageBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLookupMachineImageBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference() {
		return (EAttribute) lookupMachineImageBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLookupMachineImageBuilder_ec2_Windows_java_lang_Boolean_() {
		return (EAttribute) lookupMachineImageBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLookupMachineImageBuilder_ec2_GeneratedClassName() {
		return (EAttribute) lookupMachineImageBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLookupMachineImageBuilder_ec2_VarName() {
		return (EAttribute) lookupMachineImageBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLookupMachineImageBuilder_ec2_Identifier() {
		return (EAttribute) lookupMachineImageBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLookupMachineImageBuilder_ec2_AdditionalCode() {
		return (EAttribute) lookupMachineImageBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPortPropsBuilder_ec2() {
		return portPropsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortPropsBuilder_ec2_Protocol_software_amazon_awscdk_services_ec2_Protocol_() {
		return (EAttribute) portPropsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortPropsBuilder_ec2_StringRepresentation_java_lang_String_() {
		return (EAttribute) portPropsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortPropsBuilder_ec2_FromPort_java_lang_Number_() {
		return (EAttribute) portPropsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortPropsBuilder_ec2_ToPort_java_lang_Number_() {
		return (EAttribute) portPropsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortPropsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) portPropsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortPropsBuilder_ec2_VarName() {
		return (EAttribute) portPropsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortPropsBuilder_ec2_Identifier() {
		return (EAttribute) portPropsBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortPropsBuilder_ec2_AdditionalCode() {
		return (EAttribute) portPropsBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecurityGroupImportOptionsBuilder_ec2() {
		return securityGroupImportOptionsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroupImportOptionsBuilder_ec2_AllowAllOutbound_java_lang_Boolean_() {
		return (EAttribute) securityGroupImportOptionsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroupImportOptionsBuilder_ec2_Mutable_java_lang_Boolean_() {
		return (EAttribute) securityGroupImportOptionsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroupImportOptionsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) securityGroupImportOptionsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroupImportOptionsBuilder_ec2_VarName() {
		return (EAttribute) securityGroupImportOptionsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroupImportOptionsBuilder_ec2_Identifier() {
		return (EAttribute) securityGroupImportOptionsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroupImportOptionsBuilder_ec2_AdditionalCode() {
		return (EAttribute) securityGroupImportOptionsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectionsPropsBuilder_ec2() {
		return connectionsPropsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionsPropsBuilder_ec2_DefaultPortWithPort_software_amazon_awscdk_services_ec2_Port_AsReference() {
		return (EAttribute) connectionsPropsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionsPropsBuilder_ec2_PeerWithIPeer_software_amazon_awscdk_services_ec2_IPeer_AsReference() {
		return (EAttribute) connectionsPropsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionsPropsBuilder_ec2_SecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList() {
		return (EAttribute) connectionsPropsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionsPropsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) connectionsPropsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionsPropsBuilder_ec2_VarName() {
		return (EAttribute) connectionsPropsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionsPropsBuilder_ec2_Identifier() {
		return (EAttribute) connectionsPropsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionsPropsBuilder_ec2_AdditionalCode() {
		return (EAttribute) connectionsPropsBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEbsDeviceOptionsBaseBuilder_ec2() {
		return ebsDeviceOptionsBaseBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEbsDeviceOptionsBaseBuilder_ec2_DeleteOnTermination_java_lang_Boolean_() {
		return (EAttribute) ebsDeviceOptionsBaseBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEbsDeviceOptionsBaseBuilder_ec2_Iops_java_lang_Number_() {
		return (EAttribute) ebsDeviceOptionsBaseBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEbsDeviceOptionsBaseBuilder_ec2_VolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_() {
		return (EAttribute) ebsDeviceOptionsBaseBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEbsDeviceOptionsBaseBuilder_ec2_GeneratedClassName() {
		return (EAttribute) ebsDeviceOptionsBaseBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEbsDeviceOptionsBaseBuilder_ec2_VarName() {
		return (EAttribute) ebsDeviceOptionsBaseBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEbsDeviceOptionsBaseBuilder_ec2_Identifier() {
		return (EAttribute) ebsDeviceOptionsBaseBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEbsDeviceOptionsBaseBuilder_ec2_AdditionalCode() {
		return (EAttribute) ebsDeviceOptionsBaseBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubnetAttributesBuilder_ec2() {
		return subnetAttributesBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetAttributesBuilder_ec2_SubnetId_java_lang_String_() {
		return (EAttribute) subnetAttributesBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetAttributesBuilder_ec2_AvailabilityZone_java_lang_String_() {
		return (EAttribute) subnetAttributesBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetAttributesBuilder_ec2_RouteTableId_java_lang_String_() {
		return (EAttribute) subnetAttributesBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetAttributesBuilder_ec2_GeneratedClassName() {
		return (EAttribute) subnetAttributesBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetAttributesBuilder_ec2_VarName() {
		return (EAttribute) subnetAttributesBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetAttributesBuilder_ec2_Identifier() {
		return (EAttribute) subnetAttributesBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetAttributesBuilder_ec2_AdditionalCode() {
		return (EAttribute) subnetAttributesBuilder_ec2EClass.getEStructuralFeatures().get(6);
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
	public EAttribute getSecurityGroupBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() {
		return (EAttribute) securityGroupBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroupBuilder_ec2_AllowAllOutbound_java_lang_Boolean_() {
		return (EAttribute) securityGroupBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroupBuilder_ec2_Description_java_lang_String_() {
		return (EAttribute) securityGroupBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroupBuilder_ec2_SecurityGroupName_java_lang_String_() {
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
	public EClass getGatewayVpcEndpointBuilder_ec2() {
		return gatewayVpcEndpointBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayVpcEndpointBuilder_ec2_ServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference() {
		return (EAttribute) gatewayVpcEndpointBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayVpcEndpointBuilder_ec2_Subnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList() {
		return (EAttribute) gatewayVpcEndpointBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayVpcEndpointBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() {
		return (EAttribute) gatewayVpcEndpointBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayVpcEndpointBuilder_ec2_GeneratedClassName() {
		return (EAttribute) gatewayVpcEndpointBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayVpcEndpointBuilder_ec2_VarName() {
		return (EAttribute) gatewayVpcEndpointBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayVpcEndpointBuilder_ec2_Identifier() {
		return (EAttribute) gatewayVpcEndpointBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayVpcEndpointBuilder_ec2_AdditionalCode() {
		return (EAttribute) gatewayVpcEndpointBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkAclEntryBuilder_ec2() {
		return networkAclEntryBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclEntryBuilder_ec2_CidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference() {
		return (EAttribute) networkAclEntryBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclEntryBuilder_ec2_RuleNumber_java_lang_Number_() {
		return (EAttribute) networkAclEntryBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclEntryBuilder_ec2_TrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference() {
		return (EAttribute) networkAclEntryBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclEntryBuilder_ec2_Direction_software_amazon_awscdk_services_ec2_TrafficDirection_() {
		return (EAttribute) networkAclEntryBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclEntryBuilder_ec2_NetworkAclEntryName_java_lang_String_() {
		return (EAttribute) networkAclEntryBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclEntryBuilder_ec2_RuleAction_software_amazon_awscdk_services_ec2_Action_() {
		return (EAttribute) networkAclEntryBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclEntryBuilder_ec2_NetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference() {
		return (EAttribute) networkAclEntryBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclEntryBuilder_ec2_GeneratedClassName() {
		return (EAttribute) networkAclEntryBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclEntryBuilder_ec2_VarName() {
		return (EAttribute) networkAclEntryBuilder_ec2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclEntryBuilder_ec2_Identifier() {
		return (EAttribute) networkAclEntryBuilder_ec2EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAclEntryBuilder_ec2_AdditionalCode() {
		return (EAttribute) networkAclEntryBuilder_ec2EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGatewayVpcEndpointPropsBuilder_ec2() {
		return gatewayVpcEndpointPropsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayVpcEndpointPropsBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() {
		return (EAttribute) gatewayVpcEndpointPropsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayVpcEndpointPropsBuilder_ec2_ServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference() {
		return (EAttribute) gatewayVpcEndpointPropsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayVpcEndpointPropsBuilder_ec2_Subnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList() {
		return (EAttribute) gatewayVpcEndpointPropsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayVpcEndpointPropsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) gatewayVpcEndpointPropsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayVpcEndpointPropsBuilder_ec2_VarName() {
		return (EAttribute) gatewayVpcEndpointPropsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayVpcEndpointPropsBuilder_ec2_Identifier() {
		return (EAttribute) gatewayVpcEndpointPropsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayVpcEndpointPropsBuilder_ec2_AdditionalCode() {
		return (EAttribute) gatewayVpcEndpointPropsBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getInstanceSize() {
		return instanceSizeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVpcEndpointType() {
		return vpcEndpointTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOperatingSystemType() {
		return operatingSystemTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAmazonLinuxGeneration() {
		return amazonLinuxGenerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAmazonLinuxStorage() {
		return amazonLinuxStorageEEnum;
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
	public EEnum getAmazonLinuxEdition() {
		return amazonLinuxEditionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getInstanceClass() {
		return instanceClassEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAction() {
		return actionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getWindowsVersion() {
		return windowsVersionEEnum;
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
	public EEnum getRouterType() {
		return routerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFlowLogTrafficType() {
		return flowLogTrafficTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAmazonLinuxVirt() {
		return amazonLinuxVirtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEbsDeviceVolumeType() {
		return ebsDeviceVolumeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFlowLogDestinationType() {
		return flowLogDestinationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVpnConnectionType() {
		return vpnConnectionTypeEEnum;
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
	public EEnum getTrafficDirection() {
		return trafficDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ec2Factory getEc2Factory() {
		return (Ec2Factory) getEFactoryInstance();
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
		genericLinuxImageBuilder_ec2EClass = createEClass(GENERIC_LINUX_IMAGE_BUILDER_EC2);
		createEAttribute(genericLinuxImageBuilder_ec2EClass,
				GENERIC_LINUX_IMAGE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE);
		createEAttribute(genericLinuxImageBuilder_ec2EClass, GENERIC_LINUX_IMAGE_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(genericLinuxImageBuilder_ec2EClass, GENERIC_LINUX_IMAGE_BUILDER_EC2__VAR_NAME);
		createEAttribute(genericLinuxImageBuilder_ec2EClass, GENERIC_LINUX_IMAGE_BUILDER_EC2__IDENTIFIER);
		createEAttribute(genericLinuxImageBuilder_ec2EClass, GENERIC_LINUX_IMAGE_BUILDER_EC2__ADDITIONAL_CODE);

		aclTrafficConfigBuilder_ec2EClass = createEClass(ACL_TRAFFIC_CONFIG_BUILDER_EC2);
		createEAttribute(aclTrafficConfigBuilder_ec2EClass, ACL_TRAFFIC_CONFIG_BUILDER_EC2__PROTOCOL_JAVA_LANG_NUMBER_);
		createEAttribute(aclTrafficConfigBuilder_ec2EClass,
				ACL_TRAFFIC_CONFIG_BUILDER_EC2__ICMP_WITH_ACL_ICMP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_ICMP_AS_REFERENCE);
		createEAttribute(aclTrafficConfigBuilder_ec2EClass,
				ACL_TRAFFIC_CONFIG_BUILDER_EC2__PORT_RANGE_WITH_ACL_PORT_RANGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_PORT_RANGE_AS_REFERENCE);
		createEAttribute(aclTrafficConfigBuilder_ec2EClass, ACL_TRAFFIC_CONFIG_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(aclTrafficConfigBuilder_ec2EClass, ACL_TRAFFIC_CONFIG_BUILDER_EC2__VAR_NAME);
		createEAttribute(aclTrafficConfigBuilder_ec2EClass, ACL_TRAFFIC_CONFIG_BUILDER_EC2__IDENTIFIER);
		createEAttribute(aclTrafficConfigBuilder_ec2EClass, ACL_TRAFFIC_CONFIG_BUILDER_EC2__ADDITIONAL_CODE);

		genericWindowsImageBuilder_ec2EClass = createEClass(GENERIC_WINDOWS_IMAGE_BUILDER_EC2);
		createEAttribute(genericWindowsImageBuilder_ec2EClass,
				GENERIC_WINDOWS_IMAGE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE);
		createEAttribute(genericWindowsImageBuilder_ec2EClass, GENERIC_WINDOWS_IMAGE_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(genericWindowsImageBuilder_ec2EClass, GENERIC_WINDOWS_IMAGE_BUILDER_EC2__VAR_NAME);
		createEAttribute(genericWindowsImageBuilder_ec2EClass, GENERIC_WINDOWS_IMAGE_BUILDER_EC2__IDENTIFIER);
		createEAttribute(genericWindowsImageBuilder_ec2EClass, GENERIC_WINDOWS_IMAGE_BUILDER_EC2__ADDITIONAL_CODE);

		interfaceVpcEndpointAttributesBuilder_ec2EClass = createEClass(INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2);
		createEAttribute(interfaceVpcEndpointAttributesBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__PORT_JAVA_LANG_NUMBER_);
		createEAttribute(interfaceVpcEndpointAttributesBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__VPC_ENDPOINT_ID_JAVA_LANG_STRING_);
		createEAttribute(interfaceVpcEndpointAttributesBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__SECURITY_GROUP_ID_JAVA_LANG_STRING_);
		createEAttribute(interfaceVpcEndpointAttributesBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST);
		createEAttribute(interfaceVpcEndpointAttributesBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(interfaceVpcEndpointAttributesBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__VAR_NAME);
		createEAttribute(interfaceVpcEndpointAttributesBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__IDENTIFIER);
		createEAttribute(interfaceVpcEndpointAttributesBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__ADDITIONAL_CODE);

		vpcAttributesBuilder_ec2EClass = createEClass(VPC_ATTRIBUTES_BUILDER_EC2);
		createEAttribute(vpcAttributesBuilder_ec2EClass,
				VPC_ATTRIBUTES_BUILDER_EC2__AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(vpcAttributesBuilder_ec2EClass, VPC_ATTRIBUTES_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_);
		createEAttribute(vpcAttributesBuilder_ec2EClass,
				VPC_ATTRIBUTES_BUILDER_EC2__ISOLATED_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(vpcAttributesBuilder_ec2EClass,
				VPC_ATTRIBUTES_BUILDER_EC2__ISOLATED_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(vpcAttributesBuilder_ec2EClass,
				VPC_ATTRIBUTES_BUILDER_EC2__ISOLATED_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(vpcAttributesBuilder_ec2EClass,
				VPC_ATTRIBUTES_BUILDER_EC2__PRIVATE_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(vpcAttributesBuilder_ec2EClass,
				VPC_ATTRIBUTES_BUILDER_EC2__PRIVATE_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(vpcAttributesBuilder_ec2EClass,
				VPC_ATTRIBUTES_BUILDER_EC2__PRIVATE_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(vpcAttributesBuilder_ec2EClass,
				VPC_ATTRIBUTES_BUILDER_EC2__PUBLIC_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(vpcAttributesBuilder_ec2EClass,
				VPC_ATTRIBUTES_BUILDER_EC2__PUBLIC_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(vpcAttributesBuilder_ec2EClass,
				VPC_ATTRIBUTES_BUILDER_EC2__PUBLIC_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(vpcAttributesBuilder_ec2EClass, VPC_ATTRIBUTES_BUILDER_EC2__VPC_CIDR_BLOCK_JAVA_LANG_STRING_);
		createEAttribute(vpcAttributesBuilder_ec2EClass, VPC_ATTRIBUTES_BUILDER_EC2__VPN_GATEWAY_ID_JAVA_LANG_STRING_);
		createEAttribute(vpcAttributesBuilder_ec2EClass, VPC_ATTRIBUTES_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(vpcAttributesBuilder_ec2EClass, VPC_ATTRIBUTES_BUILDER_EC2__VAR_NAME);
		createEAttribute(vpcAttributesBuilder_ec2EClass, VPC_ATTRIBUTES_BUILDER_EC2__IDENTIFIER);
		createEAttribute(vpcAttributesBuilder_ec2EClass, VPC_ATTRIBUTES_BUILDER_EC2__ADDITIONAL_CODE);

		executeFileOptionsBuilder_ec2EClass = createEClass(EXECUTE_FILE_OPTIONS_BUILDER_EC2);
		createEAttribute(executeFileOptionsBuilder_ec2EClass,
				EXECUTE_FILE_OPTIONS_BUILDER_EC2__FILE_PATH_JAVA_LANG_STRING_);
		createEAttribute(executeFileOptionsBuilder_ec2EClass,
				EXECUTE_FILE_OPTIONS_BUILDER_EC2__ARGUMENTS_JAVA_LANG_STRING_);
		createEAttribute(executeFileOptionsBuilder_ec2EClass, EXECUTE_FILE_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(executeFileOptionsBuilder_ec2EClass, EXECUTE_FILE_OPTIONS_BUILDER_EC2__VAR_NAME);
		createEAttribute(executeFileOptionsBuilder_ec2EClass, EXECUTE_FILE_OPTIONS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(executeFileOptionsBuilder_ec2EClass, EXECUTE_FILE_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE);

		ebsDeviceOptionsBuilder_ec2EClass = createEClass(EBS_DEVICE_OPTIONS_BUILDER_EC2);
		createEAttribute(ebsDeviceOptionsBuilder_ec2EClass,
				EBS_DEVICE_OPTIONS_BUILDER_EC2__ENCRYPTED_JAVA_LANG_BOOLEAN_);
		createEAttribute(ebsDeviceOptionsBuilder_ec2EClass,
				EBS_DEVICE_OPTIONS_BUILDER_EC2__DELETE_ON_TERMINATION_JAVA_LANG_BOOLEAN_);
		createEAttribute(ebsDeviceOptionsBuilder_ec2EClass, EBS_DEVICE_OPTIONS_BUILDER_EC2__IOPS_JAVA_LANG_NUMBER_);
		createEAttribute(ebsDeviceOptionsBuilder_ec2EClass,
				EBS_DEVICE_OPTIONS_BUILDER_EC2__VOLUME_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_EBS_DEVICE_VOLUME_TYPE_);
		createEAttribute(ebsDeviceOptionsBuilder_ec2EClass, EBS_DEVICE_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(ebsDeviceOptionsBuilder_ec2EClass, EBS_DEVICE_OPTIONS_BUILDER_EC2__VAR_NAME);
		createEAttribute(ebsDeviceOptionsBuilder_ec2EClass, EBS_DEVICE_OPTIONS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(ebsDeviceOptionsBuilder_ec2EClass, EBS_DEVICE_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE);

		enableVpnGatewayOptionsBuilder_ec2EClass = createEClass(ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2);
		createEAttribute(enableVpnGatewayOptionsBuilder_ec2EClass,
				ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__VPN_ROUTE_PROPAGATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST);
		createEAttribute(enableVpnGatewayOptionsBuilder_ec2EClass,
				ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__TYPE_JAVA_LANG_STRING_);
		createEAttribute(enableVpnGatewayOptionsBuilder_ec2EClass,
				ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__AMAZON_SIDE_ASN_JAVA_LANG_NUMBER_);
		createEAttribute(enableVpnGatewayOptionsBuilder_ec2EClass,
				ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(enableVpnGatewayOptionsBuilder_ec2EClass, ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__VAR_NAME);
		createEAttribute(enableVpnGatewayOptionsBuilder_ec2EClass, ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(enableVpnGatewayOptionsBuilder_ec2EClass,
				ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE);

		vpcLookupOptionsBuilder_ec2EClass = createEClass(VPC_LOOKUP_OPTIONS_BUILDER_EC2);
		createEAttribute(vpcLookupOptionsBuilder_ec2EClass,
				VPC_LOOKUP_OPTIONS_BUILDER_EC2__IS_DEFAULT_JAVA_LANG_BOOLEAN_);
		createEAttribute(vpcLookupOptionsBuilder_ec2EClass,
				VPC_LOOKUP_OPTIONS_BUILDER_EC2__SUBNET_GROUP_NAME_TAG_JAVA_LANG_STRING_);
		createEAttribute(vpcLookupOptionsBuilder_ec2EClass,
				VPC_LOOKUP_OPTIONS_BUILDER_EC2__TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(vpcLookupOptionsBuilder_ec2EClass, VPC_LOOKUP_OPTIONS_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_);
		createEAttribute(vpcLookupOptionsBuilder_ec2EClass, VPC_LOOKUP_OPTIONS_BUILDER_EC2__VPC_NAME_JAVA_LANG_STRING_);
		createEAttribute(vpcLookupOptionsBuilder_ec2EClass, VPC_LOOKUP_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(vpcLookupOptionsBuilder_ec2EClass, VPC_LOOKUP_OPTIONS_BUILDER_EC2__VAR_NAME);
		createEAttribute(vpcLookupOptionsBuilder_ec2EClass, VPC_LOOKUP_OPTIONS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(vpcLookupOptionsBuilder_ec2EClass, VPC_LOOKUP_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE);

		instanceBuilder_ec2EClass = createEClass(INSTANCE_BUILDER_EC2);
		createEAttribute(instanceBuilder_ec2EClass,
				INSTANCE_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE);
		createEAttribute(instanceBuilder_ec2EClass,
				INSTANCE_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE);
		createEAttribute(instanceBuilder_ec2EClass,
				INSTANCE_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE);
		createEAttribute(instanceBuilder_ec2EClass, INSTANCE_BUILDER_EC2__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_);
		createEAttribute(instanceBuilder_ec2EClass, INSTANCE_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_);
		createEAttribute(instanceBuilder_ec2EClass,
				INSTANCE_BUILDER_EC2__BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_AS_LIST);
		createEAttribute(instanceBuilder_ec2EClass, INSTANCE_BUILDER_EC2__INSTANCE_NAME_JAVA_LANG_STRING_);
		createEAttribute(instanceBuilder_ec2EClass, INSTANCE_BUILDER_EC2__KEY_NAME_JAVA_LANG_STRING_);
		createEAttribute(instanceBuilder_ec2EClass, INSTANCE_BUILDER_EC2__PRIVATE_IP_ADDRESS_JAVA_LANG_STRING_);
		createEAttribute(instanceBuilder_ec2EClass,
				INSTANCE_BUILDER_EC2__RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE);
		createEAttribute(instanceBuilder_ec2EClass,
				INSTANCE_BUILDER_EC2__ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE);
		createEAttribute(instanceBuilder_ec2EClass,
				INSTANCE_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE);
		createEAttribute(instanceBuilder_ec2EClass, INSTANCE_BUILDER_EC2__SOURCE_DEST_CHECK_JAVA_LANG_BOOLEAN_);
		createEAttribute(instanceBuilder_ec2EClass,
				INSTANCE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE);
		createEAttribute(instanceBuilder_ec2EClass,
				INSTANCE_BUILDER_EC2__VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE);
		createEAttribute(instanceBuilder_ec2EClass, INSTANCE_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(instanceBuilder_ec2EClass, INSTANCE_BUILDER_EC2__VAR_NAME);
		createEAttribute(instanceBuilder_ec2EClass, INSTANCE_BUILDER_EC2__IDENTIFIER);
		createEAttribute(instanceBuilder_ec2EClass, INSTANCE_BUILDER_EC2__ADDITIONAL_CODE);

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

		securityGroupPropsBuilder_ec2EClass = createEClass(SECURITY_GROUP_PROPS_BUILDER_EC2);
		createEAttribute(securityGroupPropsBuilder_ec2EClass,
				SECURITY_GROUP_PROPS_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE);
		createEAttribute(securityGroupPropsBuilder_ec2EClass,
				SECURITY_GROUP_PROPS_BUILDER_EC2__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_);
		createEAttribute(securityGroupPropsBuilder_ec2EClass,
				SECURITY_GROUP_PROPS_BUILDER_EC2__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(securityGroupPropsBuilder_ec2EClass,
				SECURITY_GROUP_PROPS_BUILDER_EC2__SECURITY_GROUP_NAME_JAVA_LANG_STRING_);
		createEAttribute(securityGroupPropsBuilder_ec2EClass, SECURITY_GROUP_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(securityGroupPropsBuilder_ec2EClass, SECURITY_GROUP_PROPS_BUILDER_EC2__VAR_NAME);
		createEAttribute(securityGroupPropsBuilder_ec2EClass, SECURITY_GROUP_PROPS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(securityGroupPropsBuilder_ec2EClass, SECURITY_GROUP_PROPS_BUILDER_EC2__ADDITIONAL_CODE);

		aclPortRangeBuilder_ec2EClass = createEClass(ACL_PORT_RANGE_BUILDER_EC2);
		createEAttribute(aclPortRangeBuilder_ec2EClass, ACL_PORT_RANGE_BUILDER_EC2__FROM_JAVA_LANG_NUMBER_);
		createEAttribute(aclPortRangeBuilder_ec2EClass, ACL_PORT_RANGE_BUILDER_EC2__TO_JAVA_LANG_NUMBER_);
		createEAttribute(aclPortRangeBuilder_ec2EClass, ACL_PORT_RANGE_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(aclPortRangeBuilder_ec2EClass, ACL_PORT_RANGE_BUILDER_EC2__VAR_NAME);
		createEAttribute(aclPortRangeBuilder_ec2EClass, ACL_PORT_RANGE_BUILDER_EC2__IDENTIFIER);
		createEAttribute(aclPortRangeBuilder_ec2EClass, ACL_PORT_RANGE_BUILDER_EC2__ADDITIONAL_CODE);

		genericWindowsImagePropsBuilder_ec2EClass = createEClass(GENERIC_WINDOWS_IMAGE_PROPS_BUILDER_EC2);
		createEAttribute(genericWindowsImagePropsBuilder_ec2EClass,
				GENERIC_WINDOWS_IMAGE_PROPS_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE);
		createEAttribute(genericWindowsImagePropsBuilder_ec2EClass,
				GENERIC_WINDOWS_IMAGE_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(genericWindowsImagePropsBuilder_ec2EClass, GENERIC_WINDOWS_IMAGE_PROPS_BUILDER_EC2__VAR_NAME);
		createEAttribute(genericWindowsImagePropsBuilder_ec2EClass,
				GENERIC_WINDOWS_IMAGE_PROPS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(genericWindowsImagePropsBuilder_ec2EClass,
				GENERIC_WINDOWS_IMAGE_PROPS_BUILDER_EC2__ADDITIONAL_CODE);

		vpcEndpointServicePropsBuilder_ec2EClass = createEClass(VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2);
		createEAttribute(vpcEndpointServicePropsBuilder_ec2EClass,
				VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__VPC_ENDPOINT_SERVICE_LOAD_BALANCERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_ENDPOINT_SERVICE_LOAD_BALANCER_AS_LIST);
		createEAttribute(vpcEndpointServicePropsBuilder_ec2EClass,
				VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__ACCEPTANCE_REQUIRED_JAVA_LANG_BOOLEAN_);
		createEAttribute(vpcEndpointServicePropsBuilder_ec2EClass,
				VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__VPC_ENDPOINT_SERVICE_NAME_JAVA_LANG_STRING_);
		createEAttribute(vpcEndpointServicePropsBuilder_ec2EClass,
				VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__WHITELISTED_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_ARN_PRINCIPAL_AS_LIST);
		createEAttribute(vpcEndpointServicePropsBuilder_ec2EClass,
				VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(vpcEndpointServicePropsBuilder_ec2EClass, VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__VAR_NAME);
		createEAttribute(vpcEndpointServicePropsBuilder_ec2EClass, VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(vpcEndpointServicePropsBuilder_ec2EClass,
				VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__ADDITIONAL_CODE);

		windowsImageBuilder_ec2EClass = createEClass(WINDOWS_IMAGE_BUILDER_EC2);
		createEAttribute(windowsImageBuilder_ec2EClass,
				WINDOWS_IMAGE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE);
		createEAttribute(windowsImageBuilder_ec2EClass, WINDOWS_IMAGE_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(windowsImageBuilder_ec2EClass, WINDOWS_IMAGE_BUILDER_EC2__VAR_NAME);
		createEAttribute(windowsImageBuilder_ec2EClass, WINDOWS_IMAGE_BUILDER_EC2__IDENTIFIER);
		createEAttribute(windowsImageBuilder_ec2EClass, WINDOWS_IMAGE_BUILDER_EC2__ADDITIONAL_CODE);

		flowLogOptionsBuilder_ec2EClass = createEClass(FLOW_LOG_OPTIONS_BUILDER_EC2);
		createEAttribute(flowLogOptionsBuilder_ec2EClass,
				FLOW_LOG_OPTIONS_BUILDER_EC2__DESTINATION_WITH_FLOW_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_AS_REFERENCE);
		createEAttribute(flowLogOptionsBuilder_ec2EClass,
				FLOW_LOG_OPTIONS_BUILDER_EC2__TRAFFIC_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_TRAFFIC_TYPE_);
		createEAttribute(flowLogOptionsBuilder_ec2EClass, FLOW_LOG_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(flowLogOptionsBuilder_ec2EClass, FLOW_LOG_OPTIONS_BUILDER_EC2__VAR_NAME);
		createEAttribute(flowLogOptionsBuilder_ec2EClass, FLOW_LOG_OPTIONS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(flowLogOptionsBuilder_ec2EClass, FLOW_LOG_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE);

		privateSubnetBuilder_ec2EClass = createEClass(PRIVATE_SUBNET_BUILDER_EC2);
		createEAttribute(privateSubnetBuilder_ec2EClass,
				PRIVATE_SUBNET_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_);
		createEAttribute(privateSubnetBuilder_ec2EClass, PRIVATE_SUBNET_BUILDER_EC2__CIDR_BLOCK_JAVA_LANG_STRING_);
		createEAttribute(privateSubnetBuilder_ec2EClass, PRIVATE_SUBNET_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_);
		createEAttribute(privateSubnetBuilder_ec2EClass,
				PRIVATE_SUBNET_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH_JAVA_LANG_BOOLEAN_);
		createEAttribute(privateSubnetBuilder_ec2EClass, PRIVATE_SUBNET_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(privateSubnetBuilder_ec2EClass, PRIVATE_SUBNET_BUILDER_EC2__VAR_NAME);
		createEAttribute(privateSubnetBuilder_ec2EClass, PRIVATE_SUBNET_BUILDER_EC2__IDENTIFIER);
		createEAttribute(privateSubnetBuilder_ec2EClass, PRIVATE_SUBNET_BUILDER_EC2__ADDITIONAL_CODE);

		bastionHostLinuxBuilder_ec2EClass = createEClass(BASTION_HOST_LINUX_BUILDER_EC2);
		createEAttribute(bastionHostLinuxBuilder_ec2EClass,
				BASTION_HOST_LINUX_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE);
		createEAttribute(bastionHostLinuxBuilder_ec2EClass,
				BASTION_HOST_LINUX_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_);
		createEAttribute(bastionHostLinuxBuilder_ec2EClass,
				BASTION_HOST_LINUX_BUILDER_EC2__BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_AS_LIST);
		createEAttribute(bastionHostLinuxBuilder_ec2EClass,
				BASTION_HOST_LINUX_BUILDER_EC2__INSTANCE_NAME_JAVA_LANG_STRING_);
		createEAttribute(bastionHostLinuxBuilder_ec2EClass,
				BASTION_HOST_LINUX_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE);
		createEAttribute(bastionHostLinuxBuilder_ec2EClass,
				BASTION_HOST_LINUX_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE);
		createEAttribute(bastionHostLinuxBuilder_ec2EClass,
				BASTION_HOST_LINUX_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE);
		createEAttribute(bastionHostLinuxBuilder_ec2EClass,
				BASTION_HOST_LINUX_BUILDER_EC2__SUBNET_SELECTION_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE);
		createEAttribute(bastionHostLinuxBuilder_ec2EClass, BASTION_HOST_LINUX_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(bastionHostLinuxBuilder_ec2EClass, BASTION_HOST_LINUX_BUILDER_EC2__VAR_NAME);
		createEAttribute(bastionHostLinuxBuilder_ec2EClass, BASTION_HOST_LINUX_BUILDER_EC2__IDENTIFIER);
		createEAttribute(bastionHostLinuxBuilder_ec2EClass, BASTION_HOST_LINUX_BUILDER_EC2__ADDITIONAL_CODE);

		selectedSubnetsBuilder_ec2EClass = createEClass(SELECTED_SUBNETS_BUILDER_EC2);
		createEAttribute(selectedSubnetsBuilder_ec2EClass,
				SELECTED_SUBNETS_BUILDER_EC2__AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(selectedSubnetsBuilder_ec2EClass, SELECTED_SUBNETS_BUILDER_EC2__HAS_PUBLIC_JAVA_LANG_BOOLEAN_);
		createEAttribute(selectedSubnetsBuilder_ec2EClass,
				SELECTED_SUBNETS_BUILDER_EC2__INTERNET_CONNECTIVITY_ESTABLISHED_WITH_IDEPENDABLE_SOFTWARE_AMAZON_AWSCDK_CORE_IDEPENDABLE_AS_REFERENCE);
		createEAttribute(selectedSubnetsBuilder_ec2EClass,
				SELECTED_SUBNETS_BUILDER_EC2__SUBNET_IDS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(selectedSubnetsBuilder_ec2EClass,
				SELECTED_SUBNETS_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_LIST);
		createEAttribute(selectedSubnetsBuilder_ec2EClass, SELECTED_SUBNETS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(selectedSubnetsBuilder_ec2EClass, SELECTED_SUBNETS_BUILDER_EC2__VAR_NAME);
		createEAttribute(selectedSubnetsBuilder_ec2EClass, SELECTED_SUBNETS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(selectedSubnetsBuilder_ec2EClass, SELECTED_SUBNETS_BUILDER_EC2__ADDITIONAL_CODE);

		vpnGatewayPropsBuilder_ec2EClass = createEClass(VPN_GATEWAY_PROPS_BUILDER_EC2);
		createEAttribute(vpnGatewayPropsBuilder_ec2EClass, VPN_GATEWAY_PROPS_BUILDER_EC2__TYPE_JAVA_LANG_STRING_);
		createEAttribute(vpnGatewayPropsBuilder_ec2EClass,
				VPN_GATEWAY_PROPS_BUILDER_EC2__AMAZON_SIDE_ASN_JAVA_LANG_NUMBER_);
		createEAttribute(vpnGatewayPropsBuilder_ec2EClass, VPN_GATEWAY_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(vpnGatewayPropsBuilder_ec2EClass, VPN_GATEWAY_PROPS_BUILDER_EC2__VAR_NAME);
		createEAttribute(vpnGatewayPropsBuilder_ec2EClass, VPN_GATEWAY_PROPS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(vpnGatewayPropsBuilder_ec2EClass, VPN_GATEWAY_PROPS_BUILDER_EC2__ADDITIONAL_CODE);

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

		vpnTunnelOptionBuilder_ec2EClass = createEClass(VPN_TUNNEL_OPTION_BUILDER_EC2);
		createEAttribute(vpnTunnelOptionBuilder_ec2EClass,
				VPN_TUNNEL_OPTION_BUILDER_EC2__PRE_SHARED_KEY_JAVA_LANG_STRING_);
		createEAttribute(vpnTunnelOptionBuilder_ec2EClass,
				VPN_TUNNEL_OPTION_BUILDER_EC2__TUNNEL_INSIDE_CIDR_JAVA_LANG_STRING_);
		createEAttribute(vpnTunnelOptionBuilder_ec2EClass, VPN_TUNNEL_OPTION_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(vpnTunnelOptionBuilder_ec2EClass, VPN_TUNNEL_OPTION_BUILDER_EC2__VAR_NAME);
		createEAttribute(vpnTunnelOptionBuilder_ec2EClass, VPN_TUNNEL_OPTION_BUILDER_EC2__IDENTIFIER);
		createEAttribute(vpnTunnelOptionBuilder_ec2EClass, VPN_TUNNEL_OPTION_BUILDER_EC2__ADDITIONAL_CODE);

		aclCidrConfigBuilder_ec2EClass = createEClass(ACL_CIDR_CONFIG_BUILDER_EC2);
		createEAttribute(aclCidrConfigBuilder_ec2EClass, ACL_CIDR_CONFIG_BUILDER_EC2__CIDR_BLOCK_JAVA_LANG_STRING_);
		createEAttribute(aclCidrConfigBuilder_ec2EClass,
				ACL_CIDR_CONFIG_BUILDER_EC2__IPV6_CIDR_BLOCK_JAVA_LANG_STRING_);
		createEAttribute(aclCidrConfigBuilder_ec2EClass, ACL_CIDR_CONFIG_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(aclCidrConfigBuilder_ec2EClass, ACL_CIDR_CONFIG_BUILDER_EC2__VAR_NAME);
		createEAttribute(aclCidrConfigBuilder_ec2EClass, ACL_CIDR_CONFIG_BUILDER_EC2__IDENTIFIER);
		createEAttribute(aclCidrConfigBuilder_ec2EClass, ACL_CIDR_CONFIG_BUILDER_EC2__ADDITIONAL_CODE);

		publicSubnetPropsBuilder_ec2EClass = createEClass(PUBLIC_SUBNET_PROPS_BUILDER_EC2);
		createEAttribute(publicSubnetPropsBuilder_ec2EClass,
				PUBLIC_SUBNET_PROPS_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_);
		createEAttribute(publicSubnetPropsBuilder_ec2EClass,
				PUBLIC_SUBNET_PROPS_BUILDER_EC2__CIDR_BLOCK_JAVA_LANG_STRING_);
		createEAttribute(publicSubnetPropsBuilder_ec2EClass, PUBLIC_SUBNET_PROPS_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_);
		createEAttribute(publicSubnetPropsBuilder_ec2EClass,
				PUBLIC_SUBNET_PROPS_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH_JAVA_LANG_BOOLEAN_);
		createEAttribute(publicSubnetPropsBuilder_ec2EClass, PUBLIC_SUBNET_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(publicSubnetPropsBuilder_ec2EClass, PUBLIC_SUBNET_PROPS_BUILDER_EC2__VAR_NAME);
		createEAttribute(publicSubnetPropsBuilder_ec2EClass, PUBLIC_SUBNET_PROPS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(publicSubnetPropsBuilder_ec2EClass, PUBLIC_SUBNET_PROPS_BUILDER_EC2__ADDITIONAL_CODE);

		natInstanceProviderBuilder_ec2EClass = createEClass(NAT_INSTANCE_PROVIDER_BUILDER_EC2);
		createEAttribute(natInstanceProviderBuilder_ec2EClass,
				NAT_INSTANCE_PROVIDER_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE);
		createEAttribute(natInstanceProviderBuilder_ec2EClass,
				NAT_INSTANCE_PROVIDER_BUILDER_EC2__ALLOW_ALL_TRAFFIC_JAVA_LANG_BOOLEAN_);
		createEAttribute(natInstanceProviderBuilder_ec2EClass,
				NAT_INSTANCE_PROVIDER_BUILDER_EC2__KEY_NAME_JAVA_LANG_STRING_);
		createEAttribute(natInstanceProviderBuilder_ec2EClass,
				NAT_INSTANCE_PROVIDER_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE);
		createEAttribute(natInstanceProviderBuilder_ec2EClass,
				NAT_INSTANCE_PROVIDER_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE);
		createEAttribute(natInstanceProviderBuilder_ec2EClass, NAT_INSTANCE_PROVIDER_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(natInstanceProviderBuilder_ec2EClass, NAT_INSTANCE_PROVIDER_BUILDER_EC2__VAR_NAME);
		createEAttribute(natInstanceProviderBuilder_ec2EClass, NAT_INSTANCE_PROVIDER_BUILDER_EC2__IDENTIFIER);
		createEAttribute(natInstanceProviderBuilder_ec2EClass, NAT_INSTANCE_PROVIDER_BUILDER_EC2__ADDITIONAL_CODE);

		gatewayConfigBuilder_ec2EClass = createEClass(GATEWAY_CONFIG_BUILDER_EC2);
		createEAttribute(gatewayConfigBuilder_ec2EClass, GATEWAY_CONFIG_BUILDER_EC2__AZ_JAVA_LANG_STRING_);
		createEAttribute(gatewayConfigBuilder_ec2EClass, GATEWAY_CONFIG_BUILDER_EC2__GATEWAY_ID_JAVA_LANG_STRING_);
		createEAttribute(gatewayConfigBuilder_ec2EClass, GATEWAY_CONFIG_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(gatewayConfigBuilder_ec2EClass, GATEWAY_CONFIG_BUILDER_EC2__VAR_NAME);
		createEAttribute(gatewayConfigBuilder_ec2EClass, GATEWAY_CONFIG_BUILDER_EC2__IDENTIFIER);
		createEAttribute(gatewayConfigBuilder_ec2EClass, GATEWAY_CONFIG_BUILDER_EC2__ADDITIONAL_CODE);

		genericLinuxImagePropsBuilder_ec2EClass = createEClass(GENERIC_LINUX_IMAGE_PROPS_BUILDER_EC2);
		createEAttribute(genericLinuxImagePropsBuilder_ec2EClass,
				GENERIC_LINUX_IMAGE_PROPS_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE);
		createEAttribute(genericLinuxImagePropsBuilder_ec2EClass,
				GENERIC_LINUX_IMAGE_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(genericLinuxImagePropsBuilder_ec2EClass, GENERIC_LINUX_IMAGE_PROPS_BUILDER_EC2__VAR_NAME);
		createEAttribute(genericLinuxImagePropsBuilder_ec2EClass, GENERIC_LINUX_IMAGE_PROPS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(genericLinuxImagePropsBuilder_ec2EClass,
				GENERIC_LINUX_IMAGE_PROPS_BUILDER_EC2__ADDITIONAL_CODE);

		vpcPropsBuilder_ec2EClass = createEClass(VPC_PROPS_BUILDER_EC2);
		createEAttribute(vpcPropsBuilder_ec2EClass, VPC_PROPS_BUILDER_EC2__CIDR_JAVA_LANG_STRING_);
		createEAttribute(vpcPropsBuilder_ec2EClass,
				VPC_PROPS_BUILDER_EC2__DEFAULT_INSTANCE_TENANCY_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_DEFAULT_INSTANCE_TENANCY_);
		createEAttribute(vpcPropsBuilder_ec2EClass, VPC_PROPS_BUILDER_EC2__ENABLE_DNS_HOSTNAMES_JAVA_LANG_BOOLEAN_);
		createEAttribute(vpcPropsBuilder_ec2EClass, VPC_PROPS_BUILDER_EC2__ENABLE_DNS_SUPPORT_JAVA_LANG_BOOLEAN_);
		createEAttribute(vpcPropsBuilder_ec2EClass,
				VPC_PROPS_BUILDER_EC2__FLOW_LOGS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_OPTIONS_AS_MAP);
		createEAttribute(vpcPropsBuilder_ec2EClass,
				VPC_PROPS_BUILDER_EC2__GATEWAY_ENDPOINTS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_GATEWAY_VPC_ENDPOINT_OPTIONS_AS_MAP);
		createEAttribute(vpcPropsBuilder_ec2EClass, VPC_PROPS_BUILDER_EC2__MAX_AZS_JAVA_LANG_NUMBER_);
		createEAttribute(vpcPropsBuilder_ec2EClass,
				VPC_PROPS_BUILDER_EC2__NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_NAT_PROVIDER_AS_REFERENCE);
		createEAttribute(vpcPropsBuilder_ec2EClass, VPC_PROPS_BUILDER_EC2__NAT_GATEWAYS_JAVA_LANG_NUMBER_);
		createEAttribute(vpcPropsBuilder_ec2EClass,
				VPC_PROPS_BUILDER_EC2__NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE);
		createEAttribute(vpcPropsBuilder_ec2EClass,
				VPC_PROPS_BUILDER_EC2__SUBNET_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_CONFIGURATION_AS_LIST);
		createEAttribute(vpcPropsBuilder_ec2EClass,
				VPC_PROPS_BUILDER_EC2__VPN_CONNECTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_CONNECTION_OPTIONS_AS_MAP);
		createEAttribute(vpcPropsBuilder_ec2EClass, VPC_PROPS_BUILDER_EC2__VPN_GATEWAY_JAVA_LANG_BOOLEAN_);
		createEAttribute(vpcPropsBuilder_ec2EClass, VPC_PROPS_BUILDER_EC2__VPN_GATEWAY_ASN_JAVA_LANG_NUMBER_);
		createEAttribute(vpcPropsBuilder_ec2EClass,
				VPC_PROPS_BUILDER_EC2__VPN_ROUTE_PROPAGATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST);
		createEAttribute(vpcPropsBuilder_ec2EClass, VPC_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(vpcPropsBuilder_ec2EClass, VPC_PROPS_BUILDER_EC2__VAR_NAME);
		createEAttribute(vpcPropsBuilder_ec2EClass, VPC_PROPS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(vpcPropsBuilder_ec2EClass, VPC_PROPS_BUILDER_EC2__ADDITIONAL_CODE);

		bastionHostLinuxPropsBuilder_ec2EClass = createEClass(BASTION_HOST_LINUX_PROPS_BUILDER_EC2);
		createEAttribute(bastionHostLinuxPropsBuilder_ec2EClass,
				BASTION_HOST_LINUX_PROPS_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE);
		createEAttribute(bastionHostLinuxPropsBuilder_ec2EClass,
				BASTION_HOST_LINUX_PROPS_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_);
		createEAttribute(bastionHostLinuxPropsBuilder_ec2EClass,
				BASTION_HOST_LINUX_PROPS_BUILDER_EC2__BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_AS_LIST);
		createEAttribute(bastionHostLinuxPropsBuilder_ec2EClass,
				BASTION_HOST_LINUX_PROPS_BUILDER_EC2__INSTANCE_NAME_JAVA_LANG_STRING_);
		createEAttribute(bastionHostLinuxPropsBuilder_ec2EClass,
				BASTION_HOST_LINUX_PROPS_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE);
		createEAttribute(bastionHostLinuxPropsBuilder_ec2EClass,
				BASTION_HOST_LINUX_PROPS_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE);
		createEAttribute(bastionHostLinuxPropsBuilder_ec2EClass,
				BASTION_HOST_LINUX_PROPS_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE);
		createEAttribute(bastionHostLinuxPropsBuilder_ec2EClass,
				BASTION_HOST_LINUX_PROPS_BUILDER_EC2__SUBNET_SELECTION_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE);
		createEAttribute(bastionHostLinuxPropsBuilder_ec2EClass,
				BASTION_HOST_LINUX_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(bastionHostLinuxPropsBuilder_ec2EClass, BASTION_HOST_LINUX_PROPS_BUILDER_EC2__VAR_NAME);
		createEAttribute(bastionHostLinuxPropsBuilder_ec2EClass, BASTION_HOST_LINUX_PROPS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(bastionHostLinuxPropsBuilder_ec2EClass, BASTION_HOST_LINUX_PROPS_BUILDER_EC2__ADDITIONAL_CODE);

		subnetNetworkAclAssociationPropsBuilder_ec2EClass = createEClass(
				SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2);
		createEAttribute(subnetNetworkAclAssociationPropsBuilder_ec2EClass,
				SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__NETWORK_ACL_WITH_INETWORK_ACL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INETWORK_ACL_AS_REFERENCE);
		createEAttribute(subnetNetworkAclAssociationPropsBuilder_ec2EClass,
				SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__SUBNET_WITH_ISUBNET_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_REFERENCE);
		createEAttribute(subnetNetworkAclAssociationPropsBuilder_ec2EClass,
				SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__SUBNET_NETWORK_ACL_ASSOCIATION_NAME_JAVA_LANG_STRING_);
		createEAttribute(subnetNetworkAclAssociationPropsBuilder_ec2EClass,
				SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(subnetNetworkAclAssociationPropsBuilder_ec2EClass,
				SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__VAR_NAME);
		createEAttribute(subnetNetworkAclAssociationPropsBuilder_ec2EClass,
				SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(subnetNetworkAclAssociationPropsBuilder_ec2EClass,
				SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__ADDITIONAL_CODE);

		vpnGatewayBuilder_ec2EClass = createEClass(VPN_GATEWAY_BUILDER_EC2);
		createEAttribute(vpnGatewayBuilder_ec2EClass, VPN_GATEWAY_BUILDER_EC2__TYPE_JAVA_LANG_STRING_);
		createEAttribute(vpnGatewayBuilder_ec2EClass, VPN_GATEWAY_BUILDER_EC2__AMAZON_SIDE_ASN_JAVA_LANG_NUMBER_);
		createEAttribute(vpnGatewayBuilder_ec2EClass, VPN_GATEWAY_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(vpnGatewayBuilder_ec2EClass, VPN_GATEWAY_BUILDER_EC2__VAR_NAME);
		createEAttribute(vpnGatewayBuilder_ec2EClass, VPN_GATEWAY_BUILDER_EC2__IDENTIFIER);
		createEAttribute(vpnGatewayBuilder_ec2EClass, VPN_GATEWAY_BUILDER_EC2__ADDITIONAL_CODE);

		amazonLinuxImageBuilder_ec2EClass = createEClass(AMAZON_LINUX_IMAGE_BUILDER_EC2);
		createEAttribute(amazonLinuxImageBuilder_ec2EClass,
				AMAZON_LINUX_IMAGE_BUILDER_EC2__EDITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_EDITION_);
		createEAttribute(amazonLinuxImageBuilder_ec2EClass,
				AMAZON_LINUX_IMAGE_BUILDER_EC2__GENERATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_GENERATION_);
		createEAttribute(amazonLinuxImageBuilder_ec2EClass,
				AMAZON_LINUX_IMAGE_BUILDER_EC2__STORAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_STORAGE_);
		createEAttribute(amazonLinuxImageBuilder_ec2EClass,
				AMAZON_LINUX_IMAGE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE);
		createEAttribute(amazonLinuxImageBuilder_ec2EClass,
				AMAZON_LINUX_IMAGE_BUILDER_EC2__VIRTUALIZATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_VIRT_);
		createEAttribute(amazonLinuxImageBuilder_ec2EClass, AMAZON_LINUX_IMAGE_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(amazonLinuxImageBuilder_ec2EClass, AMAZON_LINUX_IMAGE_BUILDER_EC2__VAR_NAME);
		createEAttribute(amazonLinuxImageBuilder_ec2EClass, AMAZON_LINUX_IMAGE_BUILDER_EC2__IDENTIFIER);
		createEAttribute(amazonLinuxImageBuilder_ec2EClass, AMAZON_LINUX_IMAGE_BUILDER_EC2__ADDITIONAL_CODE);

		flowLogPropsBuilder_ec2EClass = createEClass(FLOW_LOG_PROPS_BUILDER_EC2);
		createEAttribute(flowLogPropsBuilder_ec2EClass,
				FLOW_LOG_PROPS_BUILDER_EC2__RESOURCE_TYPE_WITH_FLOW_LOG_RESOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_RESOURCE_TYPE_AS_REFERENCE);
		createEAttribute(flowLogPropsBuilder_ec2EClass, FLOW_LOG_PROPS_BUILDER_EC2__FLOW_LOG_NAME_JAVA_LANG_STRING_);
		createEAttribute(flowLogPropsBuilder_ec2EClass,
				FLOW_LOG_PROPS_BUILDER_EC2__DESTINATION_WITH_FLOW_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_AS_REFERENCE);
		createEAttribute(flowLogPropsBuilder_ec2EClass,
				FLOW_LOG_PROPS_BUILDER_EC2__TRAFFIC_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_TRAFFIC_TYPE_);
		createEAttribute(flowLogPropsBuilder_ec2EClass, FLOW_LOG_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(flowLogPropsBuilder_ec2EClass, FLOW_LOG_PROPS_BUILDER_EC2__VAR_NAME);
		createEAttribute(flowLogPropsBuilder_ec2EClass, FLOW_LOG_PROPS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(flowLogPropsBuilder_ec2EClass, FLOW_LOG_PROPS_BUILDER_EC2__ADDITIONAL_CODE);

		interfaceVpcEndpointPropsBuilder_ec2EClass = createEClass(INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2);
		createEAttribute(interfaceVpcEndpointPropsBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE);
		createEAttribute(interfaceVpcEndpointPropsBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2__SERVICE_WITH_IINTERFACE_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IINTERFACE_VPC_ENDPOINT_SERVICE_AS_REFERENCE);
		createEAttribute(interfaceVpcEndpointPropsBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2__LOOKUP_SUPPORTED_AZS_JAVA_LANG_BOOLEAN_);
		createEAttribute(interfaceVpcEndpointPropsBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2__OPEN_JAVA_LANG_BOOLEAN_);
		createEAttribute(interfaceVpcEndpointPropsBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2__PRIVATE_DNS_ENABLED_JAVA_LANG_BOOLEAN_);
		createEAttribute(interfaceVpcEndpointPropsBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST);
		createEAttribute(interfaceVpcEndpointPropsBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2__SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE);
		createEAttribute(interfaceVpcEndpointPropsBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(interfaceVpcEndpointPropsBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2__VAR_NAME);
		createEAttribute(interfaceVpcEndpointPropsBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(interfaceVpcEndpointPropsBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2__ADDITIONAL_CODE);

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

		portBuilder_ec2EClass = createEClass(PORT_BUILDER_EC2);
		createEAttribute(portBuilder_ec2EClass,
				PORT_BUILDER_EC2__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PROTOCOL_);
		createEAttribute(portBuilder_ec2EClass, PORT_BUILDER_EC2__STRING_REPRESENTATION_JAVA_LANG_STRING_);
		createEAttribute(portBuilder_ec2EClass, PORT_BUILDER_EC2__FROM_PORT_JAVA_LANG_NUMBER_);
		createEAttribute(portBuilder_ec2EClass, PORT_BUILDER_EC2__TO_PORT_JAVA_LANG_NUMBER_);
		createEAttribute(portBuilder_ec2EClass, PORT_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(portBuilder_ec2EClass, PORT_BUILDER_EC2__VAR_NAME);
		createEAttribute(portBuilder_ec2EClass, PORT_BUILDER_EC2__IDENTIFIER);
		createEAttribute(portBuilder_ec2EClass, PORT_BUILDER_EC2__ADDITIONAL_CODE);

		flowLogDestinationConfigBuilder_ec2EClass = createEClass(FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2);
		createEAttribute(flowLogDestinationConfigBuilder_ec2EClass,
				FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__LOG_DESTINATION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_TYPE_);
		createEAttribute(flowLogDestinationConfigBuilder_ec2EClass,
				FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__IAM_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE);
		createEAttribute(flowLogDestinationConfigBuilder_ec2EClass,
				FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__LOG_GROUP_WITH_ILOG_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_ILOG_GROUP_AS_REFERENCE);
		createEAttribute(flowLogDestinationConfigBuilder_ec2EClass,
				FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__S3_BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE);
		createEAttribute(flowLogDestinationConfigBuilder_ec2EClass,
				FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(flowLogDestinationConfigBuilder_ec2EClass, FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__VAR_NAME);
		createEAttribute(flowLogDestinationConfigBuilder_ec2EClass,
				FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__IDENTIFIER);
		createEAttribute(flowLogDestinationConfigBuilder_ec2EClass,
				FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__ADDITIONAL_CODE);

		amazonLinuxImagePropsBuilder_ec2EClass = createEClass(AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2);
		createEAttribute(amazonLinuxImagePropsBuilder_ec2EClass,
				AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2__EDITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_EDITION_);
		createEAttribute(amazonLinuxImagePropsBuilder_ec2EClass,
				AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2__GENERATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_GENERATION_);
		createEAttribute(amazonLinuxImagePropsBuilder_ec2EClass,
				AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2__STORAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_STORAGE_);
		createEAttribute(amazonLinuxImagePropsBuilder_ec2EClass,
				AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE);
		createEAttribute(amazonLinuxImagePropsBuilder_ec2EClass,
				AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2__VIRTUALIZATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_VIRT_);
		createEAttribute(amazonLinuxImagePropsBuilder_ec2EClass,
				AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(amazonLinuxImagePropsBuilder_ec2EClass, AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2__VAR_NAME);
		createEAttribute(amazonLinuxImagePropsBuilder_ec2EClass, AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(amazonLinuxImagePropsBuilder_ec2EClass, AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2__ADDITIONAL_CODE);

		lookupMachineImagePropsBuilder_ec2EClass = createEClass(LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2);
		createEAttribute(lookupMachineImagePropsBuilder_ec2EClass,
				LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__NAME_JAVA_LANG_STRING_);
		createEAttribute(lookupMachineImagePropsBuilder_ec2EClass,
				LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__OWNERS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(lookupMachineImagePropsBuilder_ec2EClass,
				LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE);
		createEAttribute(lookupMachineImagePropsBuilder_ec2EClass,
				LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__WINDOWS_JAVA_LANG_BOOLEAN_);
		createEAttribute(lookupMachineImagePropsBuilder_ec2EClass,
				LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(lookupMachineImagePropsBuilder_ec2EClass, LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__VAR_NAME);
		createEAttribute(lookupMachineImagePropsBuilder_ec2EClass, LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(lookupMachineImagePropsBuilder_ec2EClass,
				LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__ADDITIONAL_CODE);

		ebsDeviceSnapshotOptionsBuilder_ec2EClass = createEClass(EBS_DEVICE_SNAPSHOT_OPTIONS_BUILDER_EC2);
		createEAttribute(ebsDeviceSnapshotOptionsBuilder_ec2EClass,
				EBS_DEVICE_SNAPSHOT_OPTIONS_BUILDER_EC2__VOLUME_SIZE_JAVA_LANG_NUMBER_);
		createEAttribute(ebsDeviceSnapshotOptionsBuilder_ec2EClass,
				EBS_DEVICE_SNAPSHOT_OPTIONS_BUILDER_EC2__DELETE_ON_TERMINATION_JAVA_LANG_BOOLEAN_);
		createEAttribute(ebsDeviceSnapshotOptionsBuilder_ec2EClass,
				EBS_DEVICE_SNAPSHOT_OPTIONS_BUILDER_EC2__IOPS_JAVA_LANG_NUMBER_);
		createEAttribute(ebsDeviceSnapshotOptionsBuilder_ec2EClass,
				EBS_DEVICE_SNAPSHOT_OPTIONS_BUILDER_EC2__VOLUME_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_EBS_DEVICE_VOLUME_TYPE_);
		createEAttribute(ebsDeviceSnapshotOptionsBuilder_ec2EClass,
				EBS_DEVICE_SNAPSHOT_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(ebsDeviceSnapshotOptionsBuilder_ec2EClass, EBS_DEVICE_SNAPSHOT_OPTIONS_BUILDER_EC2__VAR_NAME);
		createEAttribute(ebsDeviceSnapshotOptionsBuilder_ec2EClass,
				EBS_DEVICE_SNAPSHOT_OPTIONS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(ebsDeviceSnapshotOptionsBuilder_ec2EClass,
				EBS_DEVICE_SNAPSHOT_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE);

		vpnConnectionPropsBuilder_ec2EClass = createEClass(VPN_CONNECTION_PROPS_BUILDER_EC2);
		createEAttribute(vpnConnectionPropsBuilder_ec2EClass,
				VPN_CONNECTION_PROPS_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE);
		createEAttribute(vpnConnectionPropsBuilder_ec2EClass, VPN_CONNECTION_PROPS_BUILDER_EC2__IP_JAVA_LANG_STRING_);
		createEAttribute(vpnConnectionPropsBuilder_ec2EClass, VPN_CONNECTION_PROPS_BUILDER_EC2__ASN_JAVA_LANG_NUMBER_);
		createEAttribute(vpnConnectionPropsBuilder_ec2EClass,
				VPN_CONNECTION_PROPS_BUILDER_EC2__STATIC_ROUTES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(vpnConnectionPropsBuilder_ec2EClass,
				VPN_CONNECTION_PROPS_BUILDER_EC2__TUNNEL_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_TUNNEL_OPTION_AS_LIST);
		createEAttribute(vpnConnectionPropsBuilder_ec2EClass, VPN_CONNECTION_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(vpnConnectionPropsBuilder_ec2EClass, VPN_CONNECTION_PROPS_BUILDER_EC2__VAR_NAME);
		createEAttribute(vpnConnectionPropsBuilder_ec2EClass, VPN_CONNECTION_PROPS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(vpnConnectionPropsBuilder_ec2EClass, VPN_CONNECTION_PROPS_BUILDER_EC2__ADDITIONAL_CODE);

		vpnConnectionBuilder_ec2EClass = createEClass(VPN_CONNECTION_BUILDER_EC2);
		createEAttribute(vpnConnectionBuilder_ec2EClass, VPN_CONNECTION_BUILDER_EC2__IP_JAVA_LANG_STRING_);
		createEAttribute(vpnConnectionBuilder_ec2EClass, VPN_CONNECTION_BUILDER_EC2__ASN_JAVA_LANG_NUMBER_);
		createEAttribute(vpnConnectionBuilder_ec2EClass,
				VPN_CONNECTION_BUILDER_EC2__STATIC_ROUTES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(vpnConnectionBuilder_ec2EClass,
				VPN_CONNECTION_BUILDER_EC2__TUNNEL_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_TUNNEL_OPTION_AS_LIST);
		createEAttribute(vpnConnectionBuilder_ec2EClass,
				VPN_CONNECTION_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE);
		createEAttribute(vpnConnectionBuilder_ec2EClass, VPN_CONNECTION_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(vpnConnectionBuilder_ec2EClass, VPN_CONNECTION_BUILDER_EC2__VAR_NAME);
		createEAttribute(vpnConnectionBuilder_ec2EClass, VPN_CONNECTION_BUILDER_EC2__IDENTIFIER);
		createEAttribute(vpnConnectionBuilder_ec2EClass, VPN_CONNECTION_BUILDER_EC2__ADDITIONAL_CODE);

		blockDeviceBuilder_ec2EClass = createEClass(BLOCK_DEVICE_BUILDER_EC2);
		createEAttribute(blockDeviceBuilder_ec2EClass, BLOCK_DEVICE_BUILDER_EC2__DEVICE_NAME_JAVA_LANG_STRING_);
		createEAttribute(blockDeviceBuilder_ec2EClass,
				BLOCK_DEVICE_BUILDER_EC2__VOLUME_WITH_BLOCK_DEVICE_VOLUME_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_VOLUME_AS_REFERENCE);
		createEAttribute(blockDeviceBuilder_ec2EClass, BLOCK_DEVICE_BUILDER_EC2__MAPPING_ENABLED_JAVA_LANG_BOOLEAN_);
		createEAttribute(blockDeviceBuilder_ec2EClass, BLOCK_DEVICE_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(blockDeviceBuilder_ec2EClass, BLOCK_DEVICE_BUILDER_EC2__VAR_NAME);
		createEAttribute(blockDeviceBuilder_ec2EClass, BLOCK_DEVICE_BUILDER_EC2__IDENTIFIER);
		createEAttribute(blockDeviceBuilder_ec2EClass, BLOCK_DEVICE_BUILDER_EC2__ADDITIONAL_CODE);

		ebsDevicePropsBuilder_ec2EClass = createEClass(EBS_DEVICE_PROPS_BUILDER_EC2);
		createEAttribute(ebsDevicePropsBuilder_ec2EClass, EBS_DEVICE_PROPS_BUILDER_EC2__SNAPSHOT_ID_JAVA_LANG_STRING_);
		createEAttribute(ebsDevicePropsBuilder_ec2EClass, EBS_DEVICE_PROPS_BUILDER_EC2__VOLUME_SIZE_JAVA_LANG_NUMBER_);
		createEAttribute(ebsDevicePropsBuilder_ec2EClass,
				EBS_DEVICE_PROPS_BUILDER_EC2__DELETE_ON_TERMINATION_JAVA_LANG_BOOLEAN_);
		createEAttribute(ebsDevicePropsBuilder_ec2EClass, EBS_DEVICE_PROPS_BUILDER_EC2__IOPS_JAVA_LANG_NUMBER_);
		createEAttribute(ebsDevicePropsBuilder_ec2EClass,
				EBS_DEVICE_PROPS_BUILDER_EC2__VOLUME_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_EBS_DEVICE_VOLUME_TYPE_);
		createEAttribute(ebsDevicePropsBuilder_ec2EClass, EBS_DEVICE_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(ebsDevicePropsBuilder_ec2EClass, EBS_DEVICE_PROPS_BUILDER_EC2__VAR_NAME);
		createEAttribute(ebsDevicePropsBuilder_ec2EClass, EBS_DEVICE_PROPS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(ebsDevicePropsBuilder_ec2EClass, EBS_DEVICE_PROPS_BUILDER_EC2__ADDITIONAL_CODE);

		networkAclEntryPropsBuilder_ec2EClass = createEClass(NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2);
		createEAttribute(networkAclEntryPropsBuilder_ec2EClass,
				NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__NETWORK_ACL_WITH_INETWORK_ACL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INETWORK_ACL_AS_REFERENCE);
		createEAttribute(networkAclEntryPropsBuilder_ec2EClass,
				NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__CIDR_WITH_ACL_CIDR_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_CIDR_AS_REFERENCE);
		createEAttribute(networkAclEntryPropsBuilder_ec2EClass,
				NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__RULE_NUMBER_JAVA_LANG_NUMBER_);
		createEAttribute(networkAclEntryPropsBuilder_ec2EClass,
				NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__TRAFFIC_WITH_ACL_TRAFFIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_TRAFFIC_AS_REFERENCE);
		createEAttribute(networkAclEntryPropsBuilder_ec2EClass,
				NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__DIRECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_TRAFFIC_DIRECTION_);
		createEAttribute(networkAclEntryPropsBuilder_ec2EClass,
				NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__NETWORK_ACL_ENTRY_NAME_JAVA_LANG_STRING_);
		createEAttribute(networkAclEntryPropsBuilder_ec2EClass,
				NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__RULE_ACTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACTION_);
		createEAttribute(networkAclEntryPropsBuilder_ec2EClass,
				NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(networkAclEntryPropsBuilder_ec2EClass, NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__VAR_NAME);
		createEAttribute(networkAclEntryPropsBuilder_ec2EClass, NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(networkAclEntryPropsBuilder_ec2EClass, NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__ADDITIONAL_CODE);

		addRouteOptionsBuilder_ec2EClass = createEClass(ADD_ROUTE_OPTIONS_BUILDER_EC2);
		createEAttribute(addRouteOptionsBuilder_ec2EClass, ADD_ROUTE_OPTIONS_BUILDER_EC2__ROUTER_ID_JAVA_LANG_STRING_);
		createEAttribute(addRouteOptionsBuilder_ec2EClass,
				ADD_ROUTE_OPTIONS_BUILDER_EC2__ROUTER_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ROUTER_TYPE_);
		createEAttribute(addRouteOptionsBuilder_ec2EClass,
				ADD_ROUTE_OPTIONS_BUILDER_EC2__DESTINATION_CIDR_BLOCK_JAVA_LANG_STRING_);
		createEAttribute(addRouteOptionsBuilder_ec2EClass,
				ADD_ROUTE_OPTIONS_BUILDER_EC2__DESTINATION_IPV6_CIDR_BLOCK_JAVA_LANG_STRING_);
		createEAttribute(addRouteOptionsBuilder_ec2EClass,
				ADD_ROUTE_OPTIONS_BUILDER_EC2__ENABLES_INTERNET_CONNECTIVITY_JAVA_LANG_BOOLEAN_);
		createEAttribute(addRouteOptionsBuilder_ec2EClass, ADD_ROUTE_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(addRouteOptionsBuilder_ec2EClass, ADD_ROUTE_OPTIONS_BUILDER_EC2__VAR_NAME);
		createEAttribute(addRouteOptionsBuilder_ec2EClass, ADD_ROUTE_OPTIONS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(addRouteOptionsBuilder_ec2EClass, ADD_ROUTE_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE);

		publicSubnetBuilder_ec2EClass = createEClass(PUBLIC_SUBNET_BUILDER_EC2);
		createEAttribute(publicSubnetBuilder_ec2EClass, PUBLIC_SUBNET_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_);
		createEAttribute(publicSubnetBuilder_ec2EClass, PUBLIC_SUBNET_BUILDER_EC2__CIDR_BLOCK_JAVA_LANG_STRING_);
		createEAttribute(publicSubnetBuilder_ec2EClass, PUBLIC_SUBNET_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_);
		createEAttribute(publicSubnetBuilder_ec2EClass,
				PUBLIC_SUBNET_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH_JAVA_LANG_BOOLEAN_);
		createEAttribute(publicSubnetBuilder_ec2EClass, PUBLIC_SUBNET_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(publicSubnetBuilder_ec2EClass, PUBLIC_SUBNET_BUILDER_EC2__VAR_NAME);
		createEAttribute(publicSubnetBuilder_ec2EClass, PUBLIC_SUBNET_BUILDER_EC2__IDENTIFIER);
		createEAttribute(publicSubnetBuilder_ec2EClass, PUBLIC_SUBNET_BUILDER_EC2__ADDITIONAL_CODE);

		interfaceVpcEndpointOptionsBuilder_ec2EClass = createEClass(INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2);
		createEAttribute(interfaceVpcEndpointOptionsBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__SERVICE_WITH_IINTERFACE_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IINTERFACE_VPC_ENDPOINT_SERVICE_AS_REFERENCE);
		createEAttribute(interfaceVpcEndpointOptionsBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__LOOKUP_SUPPORTED_AZS_JAVA_LANG_BOOLEAN_);
		createEAttribute(interfaceVpcEndpointOptionsBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__OPEN_JAVA_LANG_BOOLEAN_);
		createEAttribute(interfaceVpcEndpointOptionsBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__PRIVATE_DNS_ENABLED_JAVA_LANG_BOOLEAN_);
		createEAttribute(interfaceVpcEndpointOptionsBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST);
		createEAttribute(interfaceVpcEndpointOptionsBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE);
		createEAttribute(interfaceVpcEndpointOptionsBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(interfaceVpcEndpointOptionsBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__VAR_NAME);
		createEAttribute(interfaceVpcEndpointOptionsBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(interfaceVpcEndpointOptionsBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE);

		linuxUserDataOptionsBuilder_ec2EClass = createEClass(LINUX_USER_DATA_OPTIONS_BUILDER_EC2);
		createEAttribute(linuxUserDataOptionsBuilder_ec2EClass,
				LINUX_USER_DATA_OPTIONS_BUILDER_EC2__SHEBANG_JAVA_LANG_STRING_);
		createEAttribute(linuxUserDataOptionsBuilder_ec2EClass,
				LINUX_USER_DATA_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(linuxUserDataOptionsBuilder_ec2EClass, LINUX_USER_DATA_OPTIONS_BUILDER_EC2__VAR_NAME);
		createEAttribute(linuxUserDataOptionsBuilder_ec2EClass, LINUX_USER_DATA_OPTIONS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(linuxUserDataOptionsBuilder_ec2EClass, LINUX_USER_DATA_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE);

		networkAclPropsBuilder_ec2EClass = createEClass(NETWORK_ACL_PROPS_BUILDER_EC2);
		createEAttribute(networkAclPropsBuilder_ec2EClass,
				NETWORK_ACL_PROPS_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE);
		createEAttribute(networkAclPropsBuilder_ec2EClass,
				NETWORK_ACL_PROPS_BUILDER_EC2__NETWORK_ACL_NAME_JAVA_LANG_STRING_);
		createEAttribute(networkAclPropsBuilder_ec2EClass,
				NETWORK_ACL_PROPS_BUILDER_EC2__SUBNET_SELECTION_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE);
		createEAttribute(networkAclPropsBuilder_ec2EClass, NETWORK_ACL_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(networkAclPropsBuilder_ec2EClass, NETWORK_ACL_PROPS_BUILDER_EC2__VAR_NAME);
		createEAttribute(networkAclPropsBuilder_ec2EClass, NETWORK_ACL_PROPS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(networkAclPropsBuilder_ec2EClass, NETWORK_ACL_PROPS_BUILDER_EC2__ADDITIONAL_CODE);

		publicSubnetAttributesBuilder_ec2EClass = createEClass(PUBLIC_SUBNET_ATTRIBUTES_BUILDER_EC2);
		createEAttribute(publicSubnetAttributesBuilder_ec2EClass,
				PUBLIC_SUBNET_ATTRIBUTES_BUILDER_EC2__SUBNET_ID_JAVA_LANG_STRING_);
		createEAttribute(publicSubnetAttributesBuilder_ec2EClass,
				PUBLIC_SUBNET_ATTRIBUTES_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_);
		createEAttribute(publicSubnetAttributesBuilder_ec2EClass,
				PUBLIC_SUBNET_ATTRIBUTES_BUILDER_EC2__ROUTE_TABLE_ID_JAVA_LANG_STRING_);
		createEAttribute(publicSubnetAttributesBuilder_ec2EClass,
				PUBLIC_SUBNET_ATTRIBUTES_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(publicSubnetAttributesBuilder_ec2EClass, PUBLIC_SUBNET_ATTRIBUTES_BUILDER_EC2__VAR_NAME);
		createEAttribute(publicSubnetAttributesBuilder_ec2EClass, PUBLIC_SUBNET_ATTRIBUTES_BUILDER_EC2__IDENTIFIER);
		createEAttribute(publicSubnetAttributesBuilder_ec2EClass,
				PUBLIC_SUBNET_ATTRIBUTES_BUILDER_EC2__ADDITIONAL_CODE);

		s3DownloadOptionsBuilder_ec2EClass = createEClass(S3_DOWNLOAD_OPTIONS_BUILDER_EC2);
		createEAttribute(s3DownloadOptionsBuilder_ec2EClass,
				S3_DOWNLOAD_OPTIONS_BUILDER_EC2__BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE);
		createEAttribute(s3DownloadOptionsBuilder_ec2EClass,
				S3_DOWNLOAD_OPTIONS_BUILDER_EC2__BUCKET_KEY_JAVA_LANG_STRING_);
		createEAttribute(s3DownloadOptionsBuilder_ec2EClass,
				S3_DOWNLOAD_OPTIONS_BUILDER_EC2__LOCAL_FILE_JAVA_LANG_STRING_);
		createEAttribute(s3DownloadOptionsBuilder_ec2EClass, S3_DOWNLOAD_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(s3DownloadOptionsBuilder_ec2EClass, S3_DOWNLOAD_OPTIONS_BUILDER_EC2__VAR_NAME);
		createEAttribute(s3DownloadOptionsBuilder_ec2EClass, S3_DOWNLOAD_OPTIONS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(s3DownloadOptionsBuilder_ec2EClass, S3_DOWNLOAD_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE);

		flowLogBuilder_ec2EClass = createEClass(FLOW_LOG_BUILDER_EC2);
		createEAttribute(flowLogBuilder_ec2EClass,
				FLOW_LOG_BUILDER_EC2__DESTINATION_WITH_FLOW_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_AS_REFERENCE);
		createEAttribute(flowLogBuilder_ec2EClass,
				FLOW_LOG_BUILDER_EC2__TRAFFIC_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_TRAFFIC_TYPE_);
		createEAttribute(flowLogBuilder_ec2EClass,
				FLOW_LOG_BUILDER_EC2__RESOURCE_TYPE_WITH_FLOW_LOG_RESOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_RESOURCE_TYPE_AS_REFERENCE);
		createEAttribute(flowLogBuilder_ec2EClass, FLOW_LOG_BUILDER_EC2__FLOW_LOG_NAME_JAVA_LANG_STRING_);
		createEAttribute(flowLogBuilder_ec2EClass, FLOW_LOG_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(flowLogBuilder_ec2EClass, FLOW_LOG_BUILDER_EC2__VAR_NAME);
		createEAttribute(flowLogBuilder_ec2EClass, FLOW_LOG_BUILDER_EC2__IDENTIFIER);
		createEAttribute(flowLogBuilder_ec2EClass, FLOW_LOG_BUILDER_EC2__ADDITIONAL_CODE);

		connectionsBuilder_ec2EClass = createEClass(CONNECTIONS_BUILDER_EC2);
		createEAttribute(connectionsBuilder_ec2EClass,
				CONNECTIONS_BUILDER_EC2__DEFAULT_PORT_WITH_PORT_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PORT_AS_REFERENCE);
		createEAttribute(connectionsBuilder_ec2EClass,
				CONNECTIONS_BUILDER_EC2__PEER_WITH_IPEER_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IPEER_AS_REFERENCE);
		createEAttribute(connectionsBuilder_ec2EClass,
				CONNECTIONS_BUILDER_EC2__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST);
		createEAttribute(connectionsBuilder_ec2EClass, CONNECTIONS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(connectionsBuilder_ec2EClass, CONNECTIONS_BUILDER_EC2__VAR_NAME);
		createEAttribute(connectionsBuilder_ec2EClass, CONNECTIONS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(connectionsBuilder_ec2EClass, CONNECTIONS_BUILDER_EC2__ADDITIONAL_CODE);

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

		vpcEndpointServiceBuilder_ec2EClass = createEClass(VPC_ENDPOINT_SERVICE_BUILDER_EC2);
		createEAttribute(vpcEndpointServiceBuilder_ec2EClass,
				VPC_ENDPOINT_SERVICE_BUILDER_EC2__VPC_ENDPOINT_SERVICE_LOAD_BALANCERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_ENDPOINT_SERVICE_LOAD_BALANCER_AS_LIST);
		createEAttribute(vpcEndpointServiceBuilder_ec2EClass,
				VPC_ENDPOINT_SERVICE_BUILDER_EC2__ACCEPTANCE_REQUIRED_JAVA_LANG_BOOLEAN_);
		createEAttribute(vpcEndpointServiceBuilder_ec2EClass,
				VPC_ENDPOINT_SERVICE_BUILDER_EC2__VPC_ENDPOINT_SERVICE_NAME_JAVA_LANG_STRING_);
		createEAttribute(vpcEndpointServiceBuilder_ec2EClass,
				VPC_ENDPOINT_SERVICE_BUILDER_EC2__WHITELISTED_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_ARN_PRINCIPAL_AS_LIST);
		createEAttribute(vpcEndpointServiceBuilder_ec2EClass, VPC_ENDPOINT_SERVICE_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(vpcEndpointServiceBuilder_ec2EClass, VPC_ENDPOINT_SERVICE_BUILDER_EC2__VAR_NAME);
		createEAttribute(vpcEndpointServiceBuilder_ec2EClass, VPC_ENDPOINT_SERVICE_BUILDER_EC2__IDENTIFIER);
		createEAttribute(vpcEndpointServiceBuilder_ec2EClass, VPC_ENDPOINT_SERVICE_BUILDER_EC2__ADDITIONAL_CODE);

		connectionRuleBuilder_ec2EClass = createEClass(CONNECTION_RULE_BUILDER_EC2);
		createEAttribute(connectionRuleBuilder_ec2EClass, CONNECTION_RULE_BUILDER_EC2__FROM_PORT_JAVA_LANG_NUMBER_);
		createEAttribute(connectionRuleBuilder_ec2EClass, CONNECTION_RULE_BUILDER_EC2__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(connectionRuleBuilder_ec2EClass, CONNECTION_RULE_BUILDER_EC2__PROTOCOL_JAVA_LANG_STRING_);
		createEAttribute(connectionRuleBuilder_ec2EClass, CONNECTION_RULE_BUILDER_EC2__TO_PORT_JAVA_LANG_NUMBER_);
		createEAttribute(connectionRuleBuilder_ec2EClass, CONNECTION_RULE_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(connectionRuleBuilder_ec2EClass, CONNECTION_RULE_BUILDER_EC2__VAR_NAME);
		createEAttribute(connectionRuleBuilder_ec2EClass, CONNECTION_RULE_BUILDER_EC2__IDENTIFIER);
		createEAttribute(connectionRuleBuilder_ec2EClass, CONNECTION_RULE_BUILDER_EC2__ADDITIONAL_CODE);

		subnetPropsBuilder_ec2EClass = createEClass(SUBNET_PROPS_BUILDER_EC2);
		createEAttribute(subnetPropsBuilder_ec2EClass, SUBNET_PROPS_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_);
		createEAttribute(subnetPropsBuilder_ec2EClass, SUBNET_PROPS_BUILDER_EC2__CIDR_BLOCK_JAVA_LANG_STRING_);
		createEAttribute(subnetPropsBuilder_ec2EClass, SUBNET_PROPS_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_);
		createEAttribute(subnetPropsBuilder_ec2EClass,
				SUBNET_PROPS_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH_JAVA_LANG_BOOLEAN_);
		createEAttribute(subnetPropsBuilder_ec2EClass, SUBNET_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(subnetPropsBuilder_ec2EClass, SUBNET_PROPS_BUILDER_EC2__VAR_NAME);
		createEAttribute(subnetPropsBuilder_ec2EClass, SUBNET_PROPS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(subnetPropsBuilder_ec2EClass, SUBNET_PROPS_BUILDER_EC2__ADDITIONAL_CODE);

		subnetNetworkAclAssociationBuilder_ec2EClass = createEClass(SUBNET_NETWORK_ACL_ASSOCIATION_BUILDER_EC2);
		createEAttribute(subnetNetworkAclAssociationBuilder_ec2EClass,
				SUBNET_NETWORK_ACL_ASSOCIATION_BUILDER_EC2__NETWORK_ACL_WITH_INETWORK_ACL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INETWORK_ACL_AS_REFERENCE);
		createEAttribute(subnetNetworkAclAssociationBuilder_ec2EClass,
				SUBNET_NETWORK_ACL_ASSOCIATION_BUILDER_EC2__SUBNET_WITH_ISUBNET_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_REFERENCE);
		createEAttribute(subnetNetworkAclAssociationBuilder_ec2EClass,
				SUBNET_NETWORK_ACL_ASSOCIATION_BUILDER_EC2__SUBNET_NETWORK_ACL_ASSOCIATION_NAME_JAVA_LANG_STRING_);
		createEAttribute(subnetNetworkAclAssociationBuilder_ec2EClass,
				SUBNET_NETWORK_ACL_ASSOCIATION_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(subnetNetworkAclAssociationBuilder_ec2EClass,
				SUBNET_NETWORK_ACL_ASSOCIATION_BUILDER_EC2__VAR_NAME);
		createEAttribute(subnetNetworkAclAssociationBuilder_ec2EClass,
				SUBNET_NETWORK_ACL_ASSOCIATION_BUILDER_EC2__IDENTIFIER);
		createEAttribute(subnetNetworkAclAssociationBuilder_ec2EClass,
				SUBNET_NETWORK_ACL_ASSOCIATION_BUILDER_EC2__ADDITIONAL_CODE);

		machineImageConfigBuilder_ec2EClass = createEClass(MACHINE_IMAGE_CONFIG_BUILDER_EC2);
		createEAttribute(machineImageConfigBuilder_ec2EClass,
				MACHINE_IMAGE_CONFIG_BUILDER_EC2__IMAGE_ID_JAVA_LANG_STRING_);
		createEAttribute(machineImageConfigBuilder_ec2EClass,
				MACHINE_IMAGE_CONFIG_BUILDER_EC2__OS_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_OPERATING_SYSTEM_TYPE_);
		createEAttribute(machineImageConfigBuilder_ec2EClass,
				MACHINE_IMAGE_CONFIG_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE);
		createEAttribute(machineImageConfigBuilder_ec2EClass, MACHINE_IMAGE_CONFIG_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(machineImageConfigBuilder_ec2EClass, MACHINE_IMAGE_CONFIG_BUILDER_EC2__VAR_NAME);
		createEAttribute(machineImageConfigBuilder_ec2EClass, MACHINE_IMAGE_CONFIG_BUILDER_EC2__IDENTIFIER);
		createEAttribute(machineImageConfigBuilder_ec2EClass, MACHINE_IMAGE_CONFIG_BUILDER_EC2__ADDITIONAL_CODE);

		windowsImagePropsBuilder_ec2EClass = createEClass(WINDOWS_IMAGE_PROPS_BUILDER_EC2);
		createEAttribute(windowsImagePropsBuilder_ec2EClass,
				WINDOWS_IMAGE_PROPS_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE);
		createEAttribute(windowsImagePropsBuilder_ec2EClass, WINDOWS_IMAGE_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(windowsImagePropsBuilder_ec2EClass, WINDOWS_IMAGE_PROPS_BUILDER_EC2__VAR_NAME);
		createEAttribute(windowsImagePropsBuilder_ec2EClass, WINDOWS_IMAGE_PROPS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(windowsImagePropsBuilder_ec2EClass, WINDOWS_IMAGE_PROPS_BUILDER_EC2__ADDITIONAL_CODE);

		instancePropsBuilder_ec2EClass = createEClass(INSTANCE_PROPS_BUILDER_EC2);
		createEAttribute(instancePropsBuilder_ec2EClass,
				INSTANCE_PROPS_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE);
		createEAttribute(instancePropsBuilder_ec2EClass,
				INSTANCE_PROPS_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE);
		createEAttribute(instancePropsBuilder_ec2EClass,
				INSTANCE_PROPS_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE);
		createEAttribute(instancePropsBuilder_ec2EClass,
				INSTANCE_PROPS_BUILDER_EC2__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_);
		createEAttribute(instancePropsBuilder_ec2EClass,
				INSTANCE_PROPS_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_);
		createEAttribute(instancePropsBuilder_ec2EClass,
				INSTANCE_PROPS_BUILDER_EC2__BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_AS_LIST);
		createEAttribute(instancePropsBuilder_ec2EClass, INSTANCE_PROPS_BUILDER_EC2__INSTANCE_NAME_JAVA_LANG_STRING_);
		createEAttribute(instancePropsBuilder_ec2EClass, INSTANCE_PROPS_BUILDER_EC2__KEY_NAME_JAVA_LANG_STRING_);
		createEAttribute(instancePropsBuilder_ec2EClass,
				INSTANCE_PROPS_BUILDER_EC2__PRIVATE_IP_ADDRESS_JAVA_LANG_STRING_);
		createEAttribute(instancePropsBuilder_ec2EClass,
				INSTANCE_PROPS_BUILDER_EC2__RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE);
		createEAttribute(instancePropsBuilder_ec2EClass,
				INSTANCE_PROPS_BUILDER_EC2__ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE);
		createEAttribute(instancePropsBuilder_ec2EClass,
				INSTANCE_PROPS_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE);
		createEAttribute(instancePropsBuilder_ec2EClass,
				INSTANCE_PROPS_BUILDER_EC2__SOURCE_DEST_CHECK_JAVA_LANG_BOOLEAN_);
		createEAttribute(instancePropsBuilder_ec2EClass,
				INSTANCE_PROPS_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE);
		createEAttribute(instancePropsBuilder_ec2EClass,
				INSTANCE_PROPS_BUILDER_EC2__VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE);
		createEAttribute(instancePropsBuilder_ec2EClass, INSTANCE_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(instancePropsBuilder_ec2EClass, INSTANCE_PROPS_BUILDER_EC2__VAR_NAME);
		createEAttribute(instancePropsBuilder_ec2EClass, INSTANCE_PROPS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(instancePropsBuilder_ec2EClass, INSTANCE_PROPS_BUILDER_EC2__ADDITIONAL_CODE);

		natInstancePropsBuilder_ec2EClass = createEClass(NAT_INSTANCE_PROPS_BUILDER_EC2);
		createEAttribute(natInstancePropsBuilder_ec2EClass,
				NAT_INSTANCE_PROPS_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE);
		createEAttribute(natInstancePropsBuilder_ec2EClass,
				NAT_INSTANCE_PROPS_BUILDER_EC2__ALLOW_ALL_TRAFFIC_JAVA_LANG_BOOLEAN_);
		createEAttribute(natInstancePropsBuilder_ec2EClass, NAT_INSTANCE_PROPS_BUILDER_EC2__KEY_NAME_JAVA_LANG_STRING_);
		createEAttribute(natInstancePropsBuilder_ec2EClass,
				NAT_INSTANCE_PROPS_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE);
		createEAttribute(natInstancePropsBuilder_ec2EClass,
				NAT_INSTANCE_PROPS_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE);
		createEAttribute(natInstancePropsBuilder_ec2EClass, NAT_INSTANCE_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(natInstancePropsBuilder_ec2EClass, NAT_INSTANCE_PROPS_BUILDER_EC2__VAR_NAME);
		createEAttribute(natInstancePropsBuilder_ec2EClass, NAT_INSTANCE_PROPS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(natInstancePropsBuilder_ec2EClass, NAT_INSTANCE_PROPS_BUILDER_EC2__ADDITIONAL_CODE);

		privateSubnetPropsBuilder_ec2EClass = createEClass(PRIVATE_SUBNET_PROPS_BUILDER_EC2);
		createEAttribute(privateSubnetPropsBuilder_ec2EClass,
				PRIVATE_SUBNET_PROPS_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_);
		createEAttribute(privateSubnetPropsBuilder_ec2EClass,
				PRIVATE_SUBNET_PROPS_BUILDER_EC2__CIDR_BLOCK_JAVA_LANG_STRING_);
		createEAttribute(privateSubnetPropsBuilder_ec2EClass,
				PRIVATE_SUBNET_PROPS_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_);
		createEAttribute(privateSubnetPropsBuilder_ec2EClass,
				PRIVATE_SUBNET_PROPS_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH_JAVA_LANG_BOOLEAN_);
		createEAttribute(privateSubnetPropsBuilder_ec2EClass, PRIVATE_SUBNET_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(privateSubnetPropsBuilder_ec2EClass, PRIVATE_SUBNET_PROPS_BUILDER_EC2__VAR_NAME);
		createEAttribute(privateSubnetPropsBuilder_ec2EClass, PRIVATE_SUBNET_PROPS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(privateSubnetPropsBuilder_ec2EClass, PRIVATE_SUBNET_PROPS_BUILDER_EC2__ADDITIONAL_CODE);

		privateSubnetAttributesBuilder_ec2EClass = createEClass(PRIVATE_SUBNET_ATTRIBUTES_BUILDER_EC2);
		createEAttribute(privateSubnetAttributesBuilder_ec2EClass,
				PRIVATE_SUBNET_ATTRIBUTES_BUILDER_EC2__SUBNET_ID_JAVA_LANG_STRING_);
		createEAttribute(privateSubnetAttributesBuilder_ec2EClass,
				PRIVATE_SUBNET_ATTRIBUTES_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_);
		createEAttribute(privateSubnetAttributesBuilder_ec2EClass,
				PRIVATE_SUBNET_ATTRIBUTES_BUILDER_EC2__ROUTE_TABLE_ID_JAVA_LANG_STRING_);
		createEAttribute(privateSubnetAttributesBuilder_ec2EClass,
				PRIVATE_SUBNET_ATTRIBUTES_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(privateSubnetAttributesBuilder_ec2EClass, PRIVATE_SUBNET_ATTRIBUTES_BUILDER_EC2__VAR_NAME);
		createEAttribute(privateSubnetAttributesBuilder_ec2EClass, PRIVATE_SUBNET_ATTRIBUTES_BUILDER_EC2__IDENTIFIER);
		createEAttribute(privateSubnetAttributesBuilder_ec2EClass,
				PRIVATE_SUBNET_ATTRIBUTES_BUILDER_EC2__ADDITIONAL_CODE);

		interfaceVpcEndpointBuilder_ec2EClass = createEClass(INTERFACE_VPC_ENDPOINT_BUILDER_EC2);
		createEAttribute(interfaceVpcEndpointBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_BUILDER_EC2__SERVICE_WITH_IINTERFACE_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IINTERFACE_VPC_ENDPOINT_SERVICE_AS_REFERENCE);
		createEAttribute(interfaceVpcEndpointBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_BUILDER_EC2__LOOKUP_SUPPORTED_AZS_JAVA_LANG_BOOLEAN_);
		createEAttribute(interfaceVpcEndpointBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_BUILDER_EC2__OPEN_JAVA_LANG_BOOLEAN_);
		createEAttribute(interfaceVpcEndpointBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_BUILDER_EC2__PRIVATE_DNS_ENABLED_JAVA_LANG_BOOLEAN_);
		createEAttribute(interfaceVpcEndpointBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_BUILDER_EC2__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST);
		createEAttribute(interfaceVpcEndpointBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_BUILDER_EC2__SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE);
		createEAttribute(interfaceVpcEndpointBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE);
		createEAttribute(interfaceVpcEndpointBuilder_ec2EClass,
				INTERFACE_VPC_ENDPOINT_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(interfaceVpcEndpointBuilder_ec2EClass, INTERFACE_VPC_ENDPOINT_BUILDER_EC2__VAR_NAME);
		createEAttribute(interfaceVpcEndpointBuilder_ec2EClass, INTERFACE_VPC_ENDPOINT_BUILDER_EC2__IDENTIFIER);
		createEAttribute(interfaceVpcEndpointBuilder_ec2EClass, INTERFACE_VPC_ENDPOINT_BUILDER_EC2__ADDITIONAL_CODE);

		configureNatOptionsBuilder_ec2EClass = createEClass(CONFIGURE_NAT_OPTIONS_BUILDER_EC2);
		createEAttribute(configureNatOptionsBuilder_ec2EClass,
				CONFIGURE_NAT_OPTIONS_BUILDER_EC2__NAT_SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PUBLIC_SUBNET_AS_LIST);
		createEAttribute(configureNatOptionsBuilder_ec2EClass,
				CONFIGURE_NAT_OPTIONS_BUILDER_EC2__PRIVATE_SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PRIVATE_SUBNET_AS_LIST);
		createEAttribute(configureNatOptionsBuilder_ec2EClass,
				CONFIGURE_NAT_OPTIONS_BUILDER_EC2__VPC_WITH_VPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPC_AS_REFERENCE);
		createEAttribute(configureNatOptionsBuilder_ec2EClass, CONFIGURE_NAT_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(configureNatOptionsBuilder_ec2EClass, CONFIGURE_NAT_OPTIONS_BUILDER_EC2__VAR_NAME);
		createEAttribute(configureNatOptionsBuilder_ec2EClass, CONFIGURE_NAT_OPTIONS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(configureNatOptionsBuilder_ec2EClass, CONFIGURE_NAT_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE);

		subnetBuilder_ec2EClass = createEClass(SUBNET_BUILDER_EC2);
		createEAttribute(subnetBuilder_ec2EClass, SUBNET_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_);
		createEAttribute(subnetBuilder_ec2EClass, SUBNET_BUILDER_EC2__CIDR_BLOCK_JAVA_LANG_STRING_);
		createEAttribute(subnetBuilder_ec2EClass, SUBNET_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_);
		createEAttribute(subnetBuilder_ec2EClass, SUBNET_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH_JAVA_LANG_BOOLEAN_);
		createEAttribute(subnetBuilder_ec2EClass, SUBNET_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(subnetBuilder_ec2EClass, SUBNET_BUILDER_EC2__VAR_NAME);
		createEAttribute(subnetBuilder_ec2EClass, SUBNET_BUILDER_EC2__IDENTIFIER);
		createEAttribute(subnetBuilder_ec2EClass, SUBNET_BUILDER_EC2__ADDITIONAL_CODE);

		aclIcmpBuilder_ec2EClass = createEClass(ACL_ICMP_BUILDER_EC2);
		createEAttribute(aclIcmpBuilder_ec2EClass, ACL_ICMP_BUILDER_EC2__CODE_JAVA_LANG_NUMBER_);
		createEAttribute(aclIcmpBuilder_ec2EClass, ACL_ICMP_BUILDER_EC2__TYPE_JAVA_LANG_NUMBER_);
		createEAttribute(aclIcmpBuilder_ec2EClass, ACL_ICMP_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(aclIcmpBuilder_ec2EClass, ACL_ICMP_BUILDER_EC2__VAR_NAME);
		createEAttribute(aclIcmpBuilder_ec2EClass, ACL_ICMP_BUILDER_EC2__IDENTIFIER);
		createEAttribute(aclIcmpBuilder_ec2EClass, ACL_ICMP_BUILDER_EC2__ADDITIONAL_CODE);

		networkAclBuilder_ec2EClass = createEClass(NETWORK_ACL_BUILDER_EC2);
		createEAttribute(networkAclBuilder_ec2EClass,
				NETWORK_ACL_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE);
		createEAttribute(networkAclBuilder_ec2EClass, NETWORK_ACL_BUILDER_EC2__NETWORK_ACL_NAME_JAVA_LANG_STRING_);
		createEAttribute(networkAclBuilder_ec2EClass,
				NETWORK_ACL_BUILDER_EC2__SUBNET_SELECTION_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE);
		createEAttribute(networkAclBuilder_ec2EClass, NETWORK_ACL_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(networkAclBuilder_ec2EClass, NETWORK_ACL_BUILDER_EC2__VAR_NAME);
		createEAttribute(networkAclBuilder_ec2EClass, NETWORK_ACL_BUILDER_EC2__IDENTIFIER);
		createEAttribute(networkAclBuilder_ec2EClass, NETWORK_ACL_BUILDER_EC2__ADDITIONAL_CODE);

		commonNetworkAclEntryOptionsBuilder_ec2EClass = createEClass(COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2);
		createEAttribute(commonNetworkAclEntryOptionsBuilder_ec2EClass,
				COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__CIDR_WITH_ACL_CIDR_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_CIDR_AS_REFERENCE);
		createEAttribute(commonNetworkAclEntryOptionsBuilder_ec2EClass,
				COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__RULE_NUMBER_JAVA_LANG_NUMBER_);
		createEAttribute(commonNetworkAclEntryOptionsBuilder_ec2EClass,
				COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__TRAFFIC_WITH_ACL_TRAFFIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_TRAFFIC_AS_REFERENCE);
		createEAttribute(commonNetworkAclEntryOptionsBuilder_ec2EClass,
				COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__DIRECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_TRAFFIC_DIRECTION_);
		createEAttribute(commonNetworkAclEntryOptionsBuilder_ec2EClass,
				COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__NETWORK_ACL_ENTRY_NAME_JAVA_LANG_STRING_);
		createEAttribute(commonNetworkAclEntryOptionsBuilder_ec2EClass,
				COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__RULE_ACTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACTION_);
		createEAttribute(commonNetworkAclEntryOptionsBuilder_ec2EClass,
				COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(commonNetworkAclEntryOptionsBuilder_ec2EClass,
				COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__VAR_NAME);
		createEAttribute(commonNetworkAclEntryOptionsBuilder_ec2EClass,
				COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(commonNetworkAclEntryOptionsBuilder_ec2EClass,
				COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE);

		gatewayVpcEndpointOptionsBuilder_ec2EClass = createEClass(GATEWAY_VPC_ENDPOINT_OPTIONS_BUILDER_EC2);
		createEAttribute(gatewayVpcEndpointOptionsBuilder_ec2EClass,
				GATEWAY_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__SERVICE_WITH_IGATEWAY_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IGATEWAY_VPC_ENDPOINT_SERVICE_AS_REFERENCE);
		createEAttribute(gatewayVpcEndpointOptionsBuilder_ec2EClass,
				GATEWAY_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST);
		createEAttribute(gatewayVpcEndpointOptionsBuilder_ec2EClass,
				GATEWAY_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(gatewayVpcEndpointOptionsBuilder_ec2EClass,
				GATEWAY_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__VAR_NAME);
		createEAttribute(gatewayVpcEndpointOptionsBuilder_ec2EClass,
				GATEWAY_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(gatewayVpcEndpointOptionsBuilder_ec2EClass,
				GATEWAY_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE);

		lookupMachineImageBuilder_ec2EClass = createEClass(LOOKUP_MACHINE_IMAGE_BUILDER_EC2);
		createEAttribute(lookupMachineImageBuilder_ec2EClass, LOOKUP_MACHINE_IMAGE_BUILDER_EC2__NAME_JAVA_LANG_STRING_);
		createEAttribute(lookupMachineImageBuilder_ec2EClass,
				LOOKUP_MACHINE_IMAGE_BUILDER_EC2__OWNERS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(lookupMachineImageBuilder_ec2EClass,
				LOOKUP_MACHINE_IMAGE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE);
		createEAttribute(lookupMachineImageBuilder_ec2EClass,
				LOOKUP_MACHINE_IMAGE_BUILDER_EC2__WINDOWS_JAVA_LANG_BOOLEAN_);
		createEAttribute(lookupMachineImageBuilder_ec2EClass, LOOKUP_MACHINE_IMAGE_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(lookupMachineImageBuilder_ec2EClass, LOOKUP_MACHINE_IMAGE_BUILDER_EC2__VAR_NAME);
		createEAttribute(lookupMachineImageBuilder_ec2EClass, LOOKUP_MACHINE_IMAGE_BUILDER_EC2__IDENTIFIER);
		createEAttribute(lookupMachineImageBuilder_ec2EClass, LOOKUP_MACHINE_IMAGE_BUILDER_EC2__ADDITIONAL_CODE);

		portPropsBuilder_ec2EClass = createEClass(PORT_PROPS_BUILDER_EC2);
		createEAttribute(portPropsBuilder_ec2EClass,
				PORT_PROPS_BUILDER_EC2__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PROTOCOL_);
		createEAttribute(portPropsBuilder_ec2EClass, PORT_PROPS_BUILDER_EC2__STRING_REPRESENTATION_JAVA_LANG_STRING_);
		createEAttribute(portPropsBuilder_ec2EClass, PORT_PROPS_BUILDER_EC2__FROM_PORT_JAVA_LANG_NUMBER_);
		createEAttribute(portPropsBuilder_ec2EClass, PORT_PROPS_BUILDER_EC2__TO_PORT_JAVA_LANG_NUMBER_);
		createEAttribute(portPropsBuilder_ec2EClass, PORT_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(portPropsBuilder_ec2EClass, PORT_PROPS_BUILDER_EC2__VAR_NAME);
		createEAttribute(portPropsBuilder_ec2EClass, PORT_PROPS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(portPropsBuilder_ec2EClass, PORT_PROPS_BUILDER_EC2__ADDITIONAL_CODE);

		securityGroupImportOptionsBuilder_ec2EClass = createEClass(SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2);
		createEAttribute(securityGroupImportOptionsBuilder_ec2EClass,
				SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_);
		createEAttribute(securityGroupImportOptionsBuilder_ec2EClass,
				SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__MUTABLE_JAVA_LANG_BOOLEAN_);
		createEAttribute(securityGroupImportOptionsBuilder_ec2EClass,
				SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(securityGroupImportOptionsBuilder_ec2EClass,
				SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__VAR_NAME);
		createEAttribute(securityGroupImportOptionsBuilder_ec2EClass,
				SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(securityGroupImportOptionsBuilder_ec2EClass,
				SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE);

		connectionsPropsBuilder_ec2EClass = createEClass(CONNECTIONS_PROPS_BUILDER_EC2);
		createEAttribute(connectionsPropsBuilder_ec2EClass,
				CONNECTIONS_PROPS_BUILDER_EC2__DEFAULT_PORT_WITH_PORT_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PORT_AS_REFERENCE);
		createEAttribute(connectionsPropsBuilder_ec2EClass,
				CONNECTIONS_PROPS_BUILDER_EC2__PEER_WITH_IPEER_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IPEER_AS_REFERENCE);
		createEAttribute(connectionsPropsBuilder_ec2EClass,
				CONNECTIONS_PROPS_BUILDER_EC2__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST);
		createEAttribute(connectionsPropsBuilder_ec2EClass, CONNECTIONS_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(connectionsPropsBuilder_ec2EClass, CONNECTIONS_PROPS_BUILDER_EC2__VAR_NAME);
		createEAttribute(connectionsPropsBuilder_ec2EClass, CONNECTIONS_PROPS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(connectionsPropsBuilder_ec2EClass, CONNECTIONS_PROPS_BUILDER_EC2__ADDITIONAL_CODE);

		ebsDeviceOptionsBaseBuilder_ec2EClass = createEClass(EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2);
		createEAttribute(ebsDeviceOptionsBaseBuilder_ec2EClass,
				EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__DELETE_ON_TERMINATION_JAVA_LANG_BOOLEAN_);
		createEAttribute(ebsDeviceOptionsBaseBuilder_ec2EClass,
				EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__IOPS_JAVA_LANG_NUMBER_);
		createEAttribute(ebsDeviceOptionsBaseBuilder_ec2EClass,
				EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__VOLUME_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_EBS_DEVICE_VOLUME_TYPE_);
		createEAttribute(ebsDeviceOptionsBaseBuilder_ec2EClass,
				EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(ebsDeviceOptionsBaseBuilder_ec2EClass, EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__VAR_NAME);
		createEAttribute(ebsDeviceOptionsBaseBuilder_ec2EClass, EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__IDENTIFIER);
		createEAttribute(ebsDeviceOptionsBaseBuilder_ec2EClass, EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__ADDITIONAL_CODE);

		subnetAttributesBuilder_ec2EClass = createEClass(SUBNET_ATTRIBUTES_BUILDER_EC2);
		createEAttribute(subnetAttributesBuilder_ec2EClass, SUBNET_ATTRIBUTES_BUILDER_EC2__SUBNET_ID_JAVA_LANG_STRING_);
		createEAttribute(subnetAttributesBuilder_ec2EClass,
				SUBNET_ATTRIBUTES_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_);
		createEAttribute(subnetAttributesBuilder_ec2EClass,
				SUBNET_ATTRIBUTES_BUILDER_EC2__ROUTE_TABLE_ID_JAVA_LANG_STRING_);
		createEAttribute(subnetAttributesBuilder_ec2EClass, SUBNET_ATTRIBUTES_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(subnetAttributesBuilder_ec2EClass, SUBNET_ATTRIBUTES_BUILDER_EC2__VAR_NAME);
		createEAttribute(subnetAttributesBuilder_ec2EClass, SUBNET_ATTRIBUTES_BUILDER_EC2__IDENTIFIER);
		createEAttribute(subnetAttributesBuilder_ec2EClass, SUBNET_ATTRIBUTES_BUILDER_EC2__ADDITIONAL_CODE);

		securityGroupBuilder_ec2EClass = createEClass(SECURITY_GROUP_BUILDER_EC2);
		createEAttribute(securityGroupBuilder_ec2EClass,
				SECURITY_GROUP_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE);
		createEAttribute(securityGroupBuilder_ec2EClass,
				SECURITY_GROUP_BUILDER_EC2__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_);
		createEAttribute(securityGroupBuilder_ec2EClass, SECURITY_GROUP_BUILDER_EC2__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(securityGroupBuilder_ec2EClass,
				SECURITY_GROUP_BUILDER_EC2__SECURITY_GROUP_NAME_JAVA_LANG_STRING_);
		createEAttribute(securityGroupBuilder_ec2EClass, SECURITY_GROUP_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(securityGroupBuilder_ec2EClass, SECURITY_GROUP_BUILDER_EC2__VAR_NAME);
		createEAttribute(securityGroupBuilder_ec2EClass, SECURITY_GROUP_BUILDER_EC2__IDENTIFIER);
		createEAttribute(securityGroupBuilder_ec2EClass, SECURITY_GROUP_BUILDER_EC2__ADDITIONAL_CODE);

		gatewayVpcEndpointBuilder_ec2EClass = createEClass(GATEWAY_VPC_ENDPOINT_BUILDER_EC2);
		createEAttribute(gatewayVpcEndpointBuilder_ec2EClass,
				GATEWAY_VPC_ENDPOINT_BUILDER_EC2__SERVICE_WITH_IGATEWAY_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IGATEWAY_VPC_ENDPOINT_SERVICE_AS_REFERENCE);
		createEAttribute(gatewayVpcEndpointBuilder_ec2EClass,
				GATEWAY_VPC_ENDPOINT_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST);
		createEAttribute(gatewayVpcEndpointBuilder_ec2EClass,
				GATEWAY_VPC_ENDPOINT_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE);
		createEAttribute(gatewayVpcEndpointBuilder_ec2EClass, GATEWAY_VPC_ENDPOINT_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(gatewayVpcEndpointBuilder_ec2EClass, GATEWAY_VPC_ENDPOINT_BUILDER_EC2__VAR_NAME);
		createEAttribute(gatewayVpcEndpointBuilder_ec2EClass, GATEWAY_VPC_ENDPOINT_BUILDER_EC2__IDENTIFIER);
		createEAttribute(gatewayVpcEndpointBuilder_ec2EClass, GATEWAY_VPC_ENDPOINT_BUILDER_EC2__ADDITIONAL_CODE);

		networkAclEntryBuilder_ec2EClass = createEClass(NETWORK_ACL_ENTRY_BUILDER_EC2);
		createEAttribute(networkAclEntryBuilder_ec2EClass,
				NETWORK_ACL_ENTRY_BUILDER_EC2__CIDR_WITH_ACL_CIDR_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_CIDR_AS_REFERENCE);
		createEAttribute(networkAclEntryBuilder_ec2EClass,
				NETWORK_ACL_ENTRY_BUILDER_EC2__RULE_NUMBER_JAVA_LANG_NUMBER_);
		createEAttribute(networkAclEntryBuilder_ec2EClass,
				NETWORK_ACL_ENTRY_BUILDER_EC2__TRAFFIC_WITH_ACL_TRAFFIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_TRAFFIC_AS_REFERENCE);
		createEAttribute(networkAclEntryBuilder_ec2EClass,
				NETWORK_ACL_ENTRY_BUILDER_EC2__DIRECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_TRAFFIC_DIRECTION_);
		createEAttribute(networkAclEntryBuilder_ec2EClass,
				NETWORK_ACL_ENTRY_BUILDER_EC2__NETWORK_ACL_ENTRY_NAME_JAVA_LANG_STRING_);
		createEAttribute(networkAclEntryBuilder_ec2EClass,
				NETWORK_ACL_ENTRY_BUILDER_EC2__RULE_ACTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACTION_);
		createEAttribute(networkAclEntryBuilder_ec2EClass,
				NETWORK_ACL_ENTRY_BUILDER_EC2__NETWORK_ACL_WITH_INETWORK_ACL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INETWORK_ACL_AS_REFERENCE);
		createEAttribute(networkAclEntryBuilder_ec2EClass, NETWORK_ACL_ENTRY_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(networkAclEntryBuilder_ec2EClass, NETWORK_ACL_ENTRY_BUILDER_EC2__VAR_NAME);
		createEAttribute(networkAclEntryBuilder_ec2EClass, NETWORK_ACL_ENTRY_BUILDER_EC2__IDENTIFIER);
		createEAttribute(networkAclEntryBuilder_ec2EClass, NETWORK_ACL_ENTRY_BUILDER_EC2__ADDITIONAL_CODE);

		gatewayVpcEndpointPropsBuilder_ec2EClass = createEClass(GATEWAY_VPC_ENDPOINT_PROPS_BUILDER_EC2);
		createEAttribute(gatewayVpcEndpointPropsBuilder_ec2EClass,
				GATEWAY_VPC_ENDPOINT_PROPS_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE);
		createEAttribute(gatewayVpcEndpointPropsBuilder_ec2EClass,
				GATEWAY_VPC_ENDPOINT_PROPS_BUILDER_EC2__SERVICE_WITH_IGATEWAY_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IGATEWAY_VPC_ENDPOINT_SERVICE_AS_REFERENCE);
		createEAttribute(gatewayVpcEndpointPropsBuilder_ec2EClass,
				GATEWAY_VPC_ENDPOINT_PROPS_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST);
		createEAttribute(gatewayVpcEndpointPropsBuilder_ec2EClass,
				GATEWAY_VPC_ENDPOINT_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(gatewayVpcEndpointPropsBuilder_ec2EClass, GATEWAY_VPC_ENDPOINT_PROPS_BUILDER_EC2__VAR_NAME);
		createEAttribute(gatewayVpcEndpointPropsBuilder_ec2EClass, GATEWAY_VPC_ENDPOINT_PROPS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(gatewayVpcEndpointPropsBuilder_ec2EClass,
				GATEWAY_VPC_ENDPOINT_PROPS_BUILDER_EC2__ADDITIONAL_CODE);

		// Create enums
		instanceSizeEEnum = createEEnum(INSTANCE_SIZE);
		vpcEndpointTypeEEnum = createEEnum(VPC_ENDPOINT_TYPE);
		operatingSystemTypeEEnum = createEEnum(OPERATING_SYSTEM_TYPE);
		amazonLinuxGenerationEEnum = createEEnum(AMAZON_LINUX_GENERATION);
		amazonLinuxStorageEEnum = createEEnum(AMAZON_LINUX_STORAGE);
		subnetTypeEEnum = createEEnum(SUBNET_TYPE);
		amazonLinuxEditionEEnum = createEEnum(AMAZON_LINUX_EDITION);
		instanceClassEEnum = createEEnum(INSTANCE_CLASS);
		actionEEnum = createEEnum(ACTION);
		windowsVersionEEnum = createEEnum(WINDOWS_VERSION);
		defaultInstanceTenancyEEnum = createEEnum(DEFAULT_INSTANCE_TENANCY);
		routerTypeEEnum = createEEnum(ROUTER_TYPE);
		flowLogTrafficTypeEEnum = createEEnum(FLOW_LOG_TRAFFIC_TYPE);
		amazonLinuxVirtEEnum = createEEnum(AMAZON_LINUX_VIRT);
		ebsDeviceVolumeTypeEEnum = createEEnum(EBS_DEVICE_VOLUME_TYPE);
		flowLogDestinationTypeEEnum = createEEnum(FLOW_LOG_DESTINATION_TYPE);
		vpnConnectionTypeEEnum = createEEnum(VPN_CONNECTION_TYPE);
		protocolEEnum = createEEnum(PROTOCOL);
		trafficDirectionEEnum = createEEnum(TRAFFIC_DIRECTION);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(genericLinuxImageBuilder_ec2EClass, GenericLinuxImageBuilder_ec2.class,
				"GenericLinuxImageBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getGenericLinuxImageBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference(),
				ecorePackage.getEString(),
				"userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference", null, 0, 1,
				GenericLinuxImageBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericLinuxImageBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.GenericLinuxImage", 0, 1,
				GenericLinuxImageBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericLinuxImageBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				GenericLinuxImageBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericLinuxImageBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, GenericLinuxImageBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericLinuxImageBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, GenericLinuxImageBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aclTrafficConfigBuilder_ec2EClass, AclTrafficConfigBuilder_ec2.class, "AclTrafficConfigBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAclTrafficConfigBuilder_ec2_Protocol_java_lang_Number_(), ecorePackage.getEInt(),
				"protocol_java_lang_Number_", null, 0, 1, AclTrafficConfigBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getAclTrafficConfigBuilder_ec2_IcmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference(),
				ecorePackage.getEString(), "icmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference",
				null, 0, 1, AclTrafficConfigBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getAclTrafficConfigBuilder_ec2_PortRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference(),
				ecorePackage.getEString(),
				"portRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference", null, 0, 1,
				AclTrafficConfigBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAclTrafficConfigBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.AclTrafficConfig", 0, 1,
				AclTrafficConfigBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAclTrafficConfigBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				AclTrafficConfigBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAclTrafficConfigBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				AclTrafficConfigBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAclTrafficConfigBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, AclTrafficConfigBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericWindowsImageBuilder_ec2EClass, GenericWindowsImageBuilder_ec2.class,
				"GenericWindowsImageBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getGenericWindowsImageBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference(),
				ecorePackage.getEString(),
				"userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference", null, 0, 1,
				GenericWindowsImageBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericWindowsImageBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.GenericWindowsImage", 0, 1,
				GenericWindowsImageBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericWindowsImageBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				GenericWindowsImageBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericWindowsImageBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, GenericWindowsImageBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericWindowsImageBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, GenericWindowsImageBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceVpcEndpointAttributesBuilder_ec2EClass, InterfaceVpcEndpointAttributesBuilder_ec2.class,
				"InterfaceVpcEndpointAttributesBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterfaceVpcEndpointAttributesBuilder_ec2_Port_java_lang_Number_(), ecorePackage.getEInt(),
				"port_java_lang_Number_", null, 0, 1, InterfaceVpcEndpointAttributesBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceVpcEndpointAttributesBuilder_ec2_VpcEndpointId_java_lang_String_(),
				ecorePackage.getEString(), "vpcEndpointId_java_lang_String_", null, 0, 1,
				InterfaceVpcEndpointAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceVpcEndpointAttributesBuilder_ec2_SecurityGroupId_java_lang_String_(),
				ecorePackage.getEString(), "securityGroupId_java_lang_String_", null, 0, 1,
				InterfaceVpcEndpointAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getInterfaceVpcEndpointAttributesBuilder_ec2_SecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList(),
				ecorePackage.getEString(), "securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList",
				null, 0, 1, InterfaceVpcEndpointAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceVpcEndpointAttributesBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAttributes", 0, 1,
				InterfaceVpcEndpointAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceVpcEndpointAttributesBuilder_ec2_VarName(), ecorePackage.getEString(), "varName",
				null, 0, 1, InterfaceVpcEndpointAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceVpcEndpointAttributesBuilder_ec2_Identifier(), ecorePackage.getEString(),
				"identifier", null, 0, 1, InterfaceVpcEndpointAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceVpcEndpointAttributesBuilder_ec2_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, InterfaceVpcEndpointAttributesBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vpcAttributesBuilder_ec2EClass, VpcAttributesBuilder_ec2.class, "VpcAttributesBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVpcAttributesBuilder_ec2_AvailabilityZones_java_lang_String_AsList(),
				ecorePackage.getEString(), "availabilityZones_java_lang_String_AsList", null, 0, 1,
				VpcAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcAttributesBuilder_ec2_VpcId_java_lang_String_(), ecorePackage.getEString(),
				"vpcId_java_lang_String_", null, 0, 1, VpcAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcAttributesBuilder_ec2_IsolatedSubnetIds_java_lang_String_AsList(),
				ecorePackage.getEString(), "isolatedSubnetIds_java_lang_String_AsList", null, 0, 1,
				VpcAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcAttributesBuilder_ec2_IsolatedSubnetNames_java_lang_String_AsList(),
				ecorePackage.getEString(), "isolatedSubnetNames_java_lang_String_AsList", null, 0, 1,
				VpcAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcAttributesBuilder_ec2_IsolatedSubnetRouteTableIds_java_lang_String_AsList(),
				ecorePackage.getEString(), "isolatedSubnetRouteTableIds_java_lang_String_AsList", null, 0, 1,
				VpcAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcAttributesBuilder_ec2_PrivateSubnetIds_java_lang_String_AsList(),
				ecorePackage.getEString(), "privateSubnetIds_java_lang_String_AsList", null, 0, 1,
				VpcAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcAttributesBuilder_ec2_PrivateSubnetNames_java_lang_String_AsList(),
				ecorePackage.getEString(), "privateSubnetNames_java_lang_String_AsList", null, 0, 1,
				VpcAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcAttributesBuilder_ec2_PrivateSubnetRouteTableIds_java_lang_String_AsList(),
				ecorePackage.getEString(), "privateSubnetRouteTableIds_java_lang_String_AsList", null, 0, 1,
				VpcAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcAttributesBuilder_ec2_PublicSubnetIds_java_lang_String_AsList(), ecorePackage.getEString(),
				"publicSubnetIds_java_lang_String_AsList", null, 0, 1, VpcAttributesBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcAttributesBuilder_ec2_PublicSubnetNames_java_lang_String_AsList(),
				ecorePackage.getEString(), "publicSubnetNames_java_lang_String_AsList", null, 0, 1,
				VpcAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcAttributesBuilder_ec2_PublicSubnetRouteTableIds_java_lang_String_AsList(),
				ecorePackage.getEString(), "publicSubnetRouteTableIds_java_lang_String_AsList", null, 0, 1,
				VpcAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcAttributesBuilder_ec2_VpcCidrBlock_java_lang_String_(), ecorePackage.getEString(),
				"vpcCidrBlock_java_lang_String_", null, 0, 1, VpcAttributesBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcAttributesBuilder_ec2_VpnGatewayId_java_lang_String_(), ecorePackage.getEString(),
				"vpnGatewayId_java_lang_String_", null, 0, 1, VpcAttributesBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcAttributesBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.VpcAttributes", 0, 1,
				VpcAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcAttributesBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				VpcAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcAttributesBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				VpcAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcAttributesBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, VpcAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executeFileOptionsBuilder_ec2EClass, ExecuteFileOptionsBuilder_ec2.class,
				"ExecuteFileOptionsBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecuteFileOptionsBuilder_ec2_FilePath_java_lang_String_(), ecorePackage.getEString(),
				"filePath_java_lang_String_", null, 0, 1, ExecuteFileOptionsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecuteFileOptionsBuilder_ec2_Arguments_java_lang_String_(), ecorePackage.getEString(),
				"arguments_java_lang_String_", null, 0, 1, ExecuteFileOptionsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecuteFileOptionsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.ExecuteFileOptions", 0, 1,
				ExecuteFileOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecuteFileOptionsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				ExecuteFileOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecuteFileOptionsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, ExecuteFileOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecuteFileOptionsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, ExecuteFileOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ebsDeviceOptionsBuilder_ec2EClass, EbsDeviceOptionsBuilder_ec2.class, "EbsDeviceOptionsBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEbsDeviceOptionsBuilder_ec2_Encrypted_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"encrypted_java_lang_Boolean_", null, 0, 1, EbsDeviceOptionsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEbsDeviceOptionsBuilder_ec2_DeleteOnTermination_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "deleteOnTermination_java_lang_Boolean_", null, 0, 1,
				EbsDeviceOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEbsDeviceOptionsBuilder_ec2_Iops_java_lang_Number_(), ecorePackage.getEInt(),
				"iops_java_lang_Number_", null, 0, 1, EbsDeviceOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getEbsDeviceOptionsBuilder_ec2_VolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_(),
				this.getEbsDeviceVolumeType(), "volumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_",
				null, 0, 1, EbsDeviceOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEbsDeviceOptionsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.EbsDeviceOptions", 0, 1,
				EbsDeviceOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEbsDeviceOptionsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				EbsDeviceOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEbsDeviceOptionsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				EbsDeviceOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEbsDeviceOptionsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, EbsDeviceOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enableVpnGatewayOptionsBuilder_ec2EClass, EnableVpnGatewayOptionsBuilder_ec2.class,
				"EnableVpnGatewayOptionsBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getEnableVpnGatewayOptionsBuilder_ec2_VpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList(),
				ecorePackage.getEString(),
				"vpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList", null, 0, 1,
				EnableVpnGatewayOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnableVpnGatewayOptionsBuilder_ec2_Type_java_lang_String_(), ecorePackage.getEString(),
				"type_java_lang_String_", null, 0, 1, EnableVpnGatewayOptionsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnableVpnGatewayOptionsBuilder_ec2_AmazonSideAsn_java_lang_Number_(), ecorePackage.getEInt(),
				"amazonSideAsn_java_lang_Number_", null, 0, 1, EnableVpnGatewayOptionsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnableVpnGatewayOptionsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.EnableVpnGatewayOptions", 0, 1,
				EnableVpnGatewayOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnableVpnGatewayOptionsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, EnableVpnGatewayOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnableVpnGatewayOptionsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, EnableVpnGatewayOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnableVpnGatewayOptionsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, EnableVpnGatewayOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vpcLookupOptionsBuilder_ec2EClass, VpcLookupOptionsBuilder_ec2.class, "VpcLookupOptionsBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVpcLookupOptionsBuilder_ec2_IsDefault_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"isDefault_java_lang_Boolean_", null, 0, 1, VpcLookupOptionsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcLookupOptionsBuilder_ec2_SubnetGroupNameTag_java_lang_String_(), ecorePackage.getEString(),
				"subnetGroupNameTag_java_lang_String_", null, 0, 1, VpcLookupOptionsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcLookupOptionsBuilder_ec2_Tags_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "tags_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				VpcLookupOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcLookupOptionsBuilder_ec2_VpcId_java_lang_String_(), ecorePackage.getEString(),
				"vpcId_java_lang_String_", null, 0, 1, VpcLookupOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcLookupOptionsBuilder_ec2_VpcName_java_lang_String_(), ecorePackage.getEString(),
				"vpcName_java_lang_String_", null, 0, 1, VpcLookupOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcLookupOptionsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.VpcLookupOptions", 0, 1,
				VpcLookupOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcLookupOptionsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				VpcLookupOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcLookupOptionsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				VpcLookupOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcLookupOptionsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, VpcLookupOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceBuilder_ec2EClass, InstanceBuilder_ec2.class, "InstanceBuilder_ec2", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getInstanceBuilder_ec2_InstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference(),
				ecorePackage.getEString(),
				"instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference", null, 0, 1,
				InstanceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getInstanceBuilder_ec2_MachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference(),
				ecorePackage.getEString(),
				"machineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference", null, 0,
				1, InstanceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(),
				ecorePackage.getEString(), "vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference", null, 0,
				1, InstanceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceBuilder_ec2_AllowAllOutbound_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"allowAllOutbound_java_lang_Boolean_", null, 0, 1, InstanceBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceBuilder_ec2_AvailabilityZone_java_lang_String_(), ecorePackage.getEString(),
				"availabilityZone_java_lang_String_", null, 0, 1, InstanceBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceBuilder_ec2_BlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList(),
				ecorePackage.getEString(), "blockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList", null,
				0, 1, InstanceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceBuilder_ec2_InstanceName_java_lang_String_(), ecorePackage.getEString(),
				"instanceName_java_lang_String_", null, 0, 1, InstanceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceBuilder_ec2_KeyName_java_lang_String_(), ecorePackage.getEString(),
				"keyName_java_lang_String_", null, 0, 1, InstanceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceBuilder_ec2_PrivateIpAddress_java_lang_String_(), ecorePackage.getEString(),
				"privateIpAddress_java_lang_String_", null, 0, 1, InstanceBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getInstanceBuilder_ec2_ResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(),
				ecorePackage.getEString(),
				"resourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference", null, 0, 1,
				InstanceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceBuilder_ec2_RoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(),
				ecorePackage.getEString(), "roleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference", null,
				0, 1, InstanceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getInstanceBuilder_ec2_SecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference(),
				ecorePackage.getEString(),
				"securityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference", null,
				0, 1, InstanceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceBuilder_ec2_SourceDestCheck_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"sourceDestCheck_java_lang_Boolean_", null, 0, 1, InstanceBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getInstanceBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference(),
				ecorePackage.getEString(),
				"userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference", null, 0, 1,
				InstanceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getInstanceBuilder_ec2_VpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(),
				ecorePackage.getEString(),
				"vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference", null,
				0, 1, InstanceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
				this.getSubnetType(), "subnetType_software_amazon_awscdk_services_ec2_SubnetType_", null, 0, 1,
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

		initEClass(securityGroupPropsBuilder_ec2EClass, SecurityGroupPropsBuilder_ec2.class,
				"SecurityGroupPropsBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getSecurityGroupPropsBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(),
				ecorePackage.getEString(), "vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference", null, 0,
				1, SecurityGroupPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroupPropsBuilder_ec2_AllowAllOutbound_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "allowAllOutbound_java_lang_Boolean_", null, 0, 1,
				SecurityGroupPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroupPropsBuilder_ec2_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, SecurityGroupPropsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroupPropsBuilder_ec2_SecurityGroupName_java_lang_String_(),
				ecorePackage.getEString(), "securityGroupName_java_lang_String_", null, 0, 1,
				SecurityGroupPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroupPropsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.SecurityGroupProps", 0, 1,
				SecurityGroupPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroupPropsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				SecurityGroupPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroupPropsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, SecurityGroupPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroupPropsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, SecurityGroupPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aclPortRangeBuilder_ec2EClass, AclPortRangeBuilder_ec2.class, "AclPortRangeBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAclPortRangeBuilder_ec2_From_java_lang_Number_(), ecorePackage.getEInt(),
				"from_java_lang_Number_", null, 0, 1, AclPortRangeBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAclPortRangeBuilder_ec2_To_java_lang_Number_(), ecorePackage.getEInt(),
				"to_java_lang_Number_", null, 0, 1, AclPortRangeBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAclPortRangeBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.ec2.AclPortRange", 0, 1, AclPortRangeBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAclPortRangeBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				AclPortRangeBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAclPortRangeBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				AclPortRangeBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAclPortRangeBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, AclPortRangeBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericWindowsImagePropsBuilder_ec2EClass, GenericWindowsImagePropsBuilder_ec2.class,
				"GenericWindowsImagePropsBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getGenericWindowsImagePropsBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference(),
				ecorePackage.getEString(),
				"userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference", null, 0, 1,
				GenericWindowsImagePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericWindowsImagePropsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.GenericWindowsImageProps", 0, 1,
				GenericWindowsImagePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericWindowsImagePropsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, GenericWindowsImagePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericWindowsImagePropsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, GenericWindowsImagePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericWindowsImagePropsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, GenericWindowsImagePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vpcEndpointServicePropsBuilder_ec2EClass, VpcEndpointServicePropsBuilder_ec2.class,
				"VpcEndpointServicePropsBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getVpcEndpointServicePropsBuilder_ec2_VpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList(),
				ecorePackage.getEString(),
				"vpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList",
				null, 0, 1, VpcEndpointServicePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcEndpointServicePropsBuilder_ec2_AcceptanceRequired_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "acceptanceRequired_java_lang_Boolean_", null, 0, 1,
				VpcEndpointServicePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcEndpointServicePropsBuilder_ec2_VpcEndpointServiceName_java_lang_String_(),
				ecorePackage.getEString(), "vpcEndpointServiceName_java_lang_String_", null, 0, 1,
				VpcEndpointServicePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVpcEndpointServicePropsBuilder_ec2_WhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList(),
				ecorePackage.getEString(),
				"whitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList", null, 0, 1,
				VpcEndpointServicePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcEndpointServicePropsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.VpcEndpointServiceProps", 0, 1,
				VpcEndpointServicePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcEndpointServicePropsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, VpcEndpointServicePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcEndpointServicePropsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, VpcEndpointServicePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcEndpointServicePropsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, VpcEndpointServicePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(windowsImageBuilder_ec2EClass, WindowsImageBuilder_ec2.class, "WindowsImageBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getWindowsImageBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference(),
				ecorePackage.getEString(),
				"userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference", null, 0, 1,
				WindowsImageBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindowsImageBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.ec2.WindowsImage", 0, 1, WindowsImageBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindowsImageBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				WindowsImageBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindowsImageBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				WindowsImageBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindowsImageBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, WindowsImageBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
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
				this.getFlowLogTrafficType(), "trafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_",
				null, 0, 1, FlowLogOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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

		initEClass(privateSubnetBuilder_ec2EClass, PrivateSubnetBuilder_ec2.class, "PrivateSubnetBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrivateSubnetBuilder_ec2_AvailabilityZone_java_lang_String_(), ecorePackage.getEString(),
				"availabilityZone_java_lang_String_", null, 0, 1, PrivateSubnetBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrivateSubnetBuilder_ec2_CidrBlock_java_lang_String_(), ecorePackage.getEString(),
				"cidrBlock_java_lang_String_", null, 0, 1, PrivateSubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrivateSubnetBuilder_ec2_VpcId_java_lang_String_(), ecorePackage.getEString(),
				"vpcId_java_lang_String_", null, 0, 1, PrivateSubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrivateSubnetBuilder_ec2_MapPublicIpOnLaunch_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "mapPublicIpOnLaunch_java_lang_Boolean_", null, 0, 1,
				PrivateSubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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

		initEClass(bastionHostLinuxBuilder_ec2EClass, BastionHostLinuxBuilder_ec2.class, "BastionHostLinuxBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getBastionHostLinuxBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(),
				ecorePackage.getEString(), "vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference", null, 0,
				1, BastionHostLinuxBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBastionHostLinuxBuilder_ec2_AvailabilityZone_java_lang_String_(), ecorePackage.getEString(),
				"availabilityZone_java_lang_String_", null, 0, 1, BastionHostLinuxBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getBastionHostLinuxBuilder_ec2_BlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList(),
				ecorePackage.getEString(), "blockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList", null,
				0, 1, BastionHostLinuxBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBastionHostLinuxBuilder_ec2_InstanceName_java_lang_String_(), ecorePackage.getEString(),
				"instanceName_java_lang_String_", null, 0, 1, BastionHostLinuxBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getBastionHostLinuxBuilder_ec2_InstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference(),
				ecorePackage.getEString(),
				"instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference", null, 0, 1,
				BastionHostLinuxBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getBastionHostLinuxBuilder_ec2_MachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference(),
				ecorePackage.getEString(),
				"machineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference", null, 0,
				1, BastionHostLinuxBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getBastionHostLinuxBuilder_ec2_SecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference(),
				ecorePackage.getEString(),
				"securityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference", null,
				0, 1, BastionHostLinuxBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getBastionHostLinuxBuilder_ec2_SubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(),
				ecorePackage.getEString(),
				"subnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference",
				null, 0, 1, BastionHostLinuxBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBastionHostLinuxBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.BastionHostLinux", 0, 1,
				BastionHostLinuxBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBastionHostLinuxBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				BastionHostLinuxBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBastionHostLinuxBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				BastionHostLinuxBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBastionHostLinuxBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, BastionHostLinuxBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectedSubnetsBuilder_ec2EClass, SelectedSubnetsBuilder_ec2.class, "SelectedSubnetsBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelectedSubnetsBuilder_ec2_AvailabilityZones_java_lang_String_AsList(),
				ecorePackage.getEString(), "availabilityZones_java_lang_String_AsList", null, 0, 1,
				SelectedSubnetsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectedSubnetsBuilder_ec2_HasPublic_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"hasPublic_java_lang_Boolean_", null, 0, 1, SelectedSubnetsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getSelectedSubnetsBuilder_ec2_InternetConnectivityEstablishedWithIDependable_software_amazon_awscdk_core_IDependable_AsReference(),
				ecorePackage.getEString(),
				"internetConnectivityEstablishedWithIDependable_software_amazon_awscdk_core_IDependable_AsReference",
				null, 0, 1, SelectedSubnetsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectedSubnetsBuilder_ec2_SubnetIds_java_lang_String_AsList(), ecorePackage.getEString(),
				"subnetIds_java_lang_String_AsList", null, 0, 1, SelectedSubnetsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectedSubnetsBuilder_ec2_Subnets_software_amazon_awscdk_services_ec2_ISubnet_AsList(),
				ecorePackage.getEString(), "subnets_software_amazon_awscdk_services_ec2_ISubnet_AsList", null, 0, 1,
				SelectedSubnetsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectedSubnetsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.SelectedSubnets", 0, 1,
				SelectedSubnetsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectedSubnetsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				SelectedSubnetsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectedSubnetsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				SelectedSubnetsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectedSubnetsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, SelectedSubnetsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vpnGatewayPropsBuilder_ec2EClass, VpnGatewayPropsBuilder_ec2.class, "VpnGatewayPropsBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVpnGatewayPropsBuilder_ec2_Type_java_lang_String_(), ecorePackage.getEString(),
				"type_java_lang_String_", null, 0, 1, VpnGatewayPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnGatewayPropsBuilder_ec2_AmazonSideAsn_java_lang_Number_(), ecorePackage.getEInt(),
				"amazonSideAsn_java_lang_Number_", null, 0, 1, VpnGatewayPropsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnGatewayPropsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.VpnGatewayProps", 0, 1,
				VpnGatewayPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnGatewayPropsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				VpnGatewayPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnGatewayPropsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				VpnGatewayPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnGatewayPropsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, VpnGatewayPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subnetConfigurationBuilder_ec2EClass, SubnetConfigurationBuilder_ec2.class,
				"SubnetConfigurationBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubnetConfigurationBuilder_ec2_Name_java_lang_String_(), ecorePackage.getEString(),
				"name_java_lang_String_", null, 0, 1, SubnetConfigurationBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetConfigurationBuilder_ec2_SubnetType_software_amazon_awscdk_services_ec2_SubnetType_(),
				this.getSubnetType(), "subnetType_software_amazon_awscdk_services_ec2_SubnetType_", null, 0, 1,
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

		initEClass(aclCidrConfigBuilder_ec2EClass, AclCidrConfigBuilder_ec2.class, "AclCidrConfigBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAclCidrConfigBuilder_ec2_CidrBlock_java_lang_String_(), ecorePackage.getEString(),
				"cidrBlock_java_lang_String_", null, 0, 1, AclCidrConfigBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAclCidrConfigBuilder_ec2_Ipv6CidrBlock_java_lang_String_(), ecorePackage.getEString(),
				"ipv6CidrBlock_java_lang_String_", null, 0, 1, AclCidrConfigBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAclCidrConfigBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.AclCidrConfig", 0, 1,
				AclCidrConfigBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAclCidrConfigBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				AclCidrConfigBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAclCidrConfigBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				AclCidrConfigBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAclCidrConfigBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, AclCidrConfigBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicSubnetPropsBuilder_ec2EClass, PublicSubnetPropsBuilder_ec2.class,
				"PublicSubnetPropsBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPublicSubnetPropsBuilder_ec2_AvailabilityZone_java_lang_String_(), ecorePackage.getEString(),
				"availabilityZone_java_lang_String_", null, 0, 1, PublicSubnetPropsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicSubnetPropsBuilder_ec2_CidrBlock_java_lang_String_(), ecorePackage.getEString(),
				"cidrBlock_java_lang_String_", null, 0, 1, PublicSubnetPropsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicSubnetPropsBuilder_ec2_VpcId_java_lang_String_(), ecorePackage.getEString(),
				"vpcId_java_lang_String_", null, 0, 1, PublicSubnetPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicSubnetPropsBuilder_ec2_MapPublicIpOnLaunch_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "mapPublicIpOnLaunch_java_lang_Boolean_", null, 0, 1,
				PublicSubnetPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicSubnetPropsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.PublicSubnetProps", 0, 1,
				PublicSubnetPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicSubnetPropsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				PublicSubnetPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicSubnetPropsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, PublicSubnetPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicSubnetPropsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, PublicSubnetPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(natInstanceProviderBuilder_ec2EClass, NatInstanceProviderBuilder_ec2.class,
				"NatInstanceProviderBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getNatInstanceProviderBuilder_ec2_InstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference(),
				ecorePackage.getEString(),
				"instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference", null, 0, 1,
				NatInstanceProviderBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNatInstanceProviderBuilder_ec2_AllowAllTraffic_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "allowAllTraffic_java_lang_Boolean_", null, 0, 1,
				NatInstanceProviderBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNatInstanceProviderBuilder_ec2_KeyName_java_lang_String_(), ecorePackage.getEString(),
				"keyName_java_lang_String_", null, 0, 1, NatInstanceProviderBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getNatInstanceProviderBuilder_ec2_MachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference(),
				ecorePackage.getEString(),
				"machineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference", null, 0,
				1, NatInstanceProviderBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getNatInstanceProviderBuilder_ec2_SecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference(),
				ecorePackage.getEString(),
				"securityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference", null,
				0, 1, NatInstanceProviderBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNatInstanceProviderBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.NatInstanceProvider", 0, 1,
				NatInstanceProviderBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNatInstanceProviderBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				NatInstanceProviderBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNatInstanceProviderBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, NatInstanceProviderBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNatInstanceProviderBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, NatInstanceProviderBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gatewayConfigBuilder_ec2EClass, GatewayConfigBuilder_ec2.class, "GatewayConfigBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGatewayConfigBuilder_ec2_Az_java_lang_String_(), ecorePackage.getEString(),
				"az_java_lang_String_", null, 0, 1, GatewayConfigBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayConfigBuilder_ec2_GatewayId_java_lang_String_(), ecorePackage.getEString(),
				"gatewayId_java_lang_String_", null, 0, 1, GatewayConfigBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayConfigBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.GatewayConfig", 0, 1,
				GatewayConfigBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayConfigBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				GatewayConfigBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayConfigBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				GatewayConfigBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayConfigBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, GatewayConfigBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericLinuxImagePropsBuilder_ec2EClass, GenericLinuxImagePropsBuilder_ec2.class,
				"GenericLinuxImagePropsBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getGenericLinuxImagePropsBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference(),
				ecorePackage.getEString(),
				"userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference", null, 0, 1,
				GenericLinuxImagePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericLinuxImagePropsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.GenericLinuxImageProps", 0, 1,
				GenericLinuxImagePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericLinuxImagePropsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				GenericLinuxImagePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericLinuxImagePropsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, GenericLinuxImagePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericLinuxImagePropsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, GenericLinuxImagePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vpcPropsBuilder_ec2EClass, VpcPropsBuilder_ec2.class, "VpcPropsBuilder_ec2", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVpcPropsBuilder_ec2_Cidr_java_lang_String_(), ecorePackage.getEString(),
				"cidr_java_lang_String_", null, 0, 1, VpcPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVpcPropsBuilder_ec2_DefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_(),
				this.getDefaultInstanceTenancy(),
				"defaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_", null, 0, 1,
				VpcPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcPropsBuilder_ec2_EnableDnsHostnames_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"enableDnsHostnames_java_lang_Boolean_", null, 0, 1, VpcPropsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcPropsBuilder_ec2_EnableDnsSupport_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"enableDnsSupport_java_lang_Boolean_", null, 0, 1, VpcPropsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVpcPropsBuilder_ec2_FlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap(),
				ecorePackage.getEString(),
				"flowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap", null, 0, 1,
				VpcPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVpcPropsBuilder_ec2_GatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap(),
				ecorePackage.getEString(),
				"gatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap",
				null, 0, 1, VpcPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcPropsBuilder_ec2_MaxAzs_java_lang_Number_(), ecorePackage.getEInt(),
				"maxAzs_java_lang_Number_", null, 0, 1, VpcPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVpcPropsBuilder_ec2_NatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference(),
				ecorePackage.getEString(),
				"natGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference", null,
				0, 1, VpcPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcPropsBuilder_ec2_NatGateways_java_lang_Number_(), ecorePackage.getEInt(),
				"natGateways_java_lang_Number_", null, 0, 1, VpcPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVpcPropsBuilder_ec2_NatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(),
				ecorePackage.getEString(),
				"natGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference",
				null, 0, 1, VpcPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVpcPropsBuilder_ec2_SubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList(),
				ecorePackage.getEString(),
				"subnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList", null, 0, 1,
				VpcPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVpcPropsBuilder_ec2_VpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap(),
				ecorePackage.getEString(),
				"vpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap", null,
				0, 1, VpcPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcPropsBuilder_ec2_VpnGateway_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"vpnGateway_java_lang_Boolean_", null, 0, 1, VpcPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcPropsBuilder_ec2_VpnGatewayAsn_java_lang_Number_(), ecorePackage.getEInt(),
				"vpnGatewayAsn_java_lang_Number_", null, 0, 1, VpcPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVpcPropsBuilder_ec2_VpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList(),
				ecorePackage.getEString(),
				"vpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList", null, 0, 1,
				VpcPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcPropsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.ec2.VpcProps", 0, 1, VpcPropsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcPropsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				VpcPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcPropsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				VpcPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcPropsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0, 1,
				VpcPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bastionHostLinuxPropsBuilder_ec2EClass, BastionHostLinuxPropsBuilder_ec2.class,
				"BastionHostLinuxPropsBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getBastionHostLinuxPropsBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(),
				ecorePackage.getEString(), "vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference", null, 0,
				1, BastionHostLinuxPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBastionHostLinuxPropsBuilder_ec2_AvailabilityZone_java_lang_String_(),
				ecorePackage.getEString(), "availabilityZone_java_lang_String_", null, 0, 1,
				BastionHostLinuxPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getBastionHostLinuxPropsBuilder_ec2_BlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList(),
				ecorePackage.getEString(), "blockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList", null,
				0, 1, BastionHostLinuxPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBastionHostLinuxPropsBuilder_ec2_InstanceName_java_lang_String_(), ecorePackage.getEString(),
				"instanceName_java_lang_String_", null, 0, 1, BastionHostLinuxPropsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getBastionHostLinuxPropsBuilder_ec2_InstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference(),
				ecorePackage.getEString(),
				"instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference", null, 0, 1,
				BastionHostLinuxPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getBastionHostLinuxPropsBuilder_ec2_MachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference(),
				ecorePackage.getEString(),
				"machineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference", null, 0,
				1, BastionHostLinuxPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getBastionHostLinuxPropsBuilder_ec2_SecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference(),
				ecorePackage.getEString(),
				"securityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference", null,
				0, 1, BastionHostLinuxPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getBastionHostLinuxPropsBuilder_ec2_SubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(),
				ecorePackage.getEString(),
				"subnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference",
				null, 0, 1, BastionHostLinuxPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBastionHostLinuxPropsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.BastionHostLinuxProps", 0, 1,
				BastionHostLinuxPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBastionHostLinuxPropsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				BastionHostLinuxPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBastionHostLinuxPropsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, BastionHostLinuxPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBastionHostLinuxPropsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, BastionHostLinuxPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subnetNetworkAclAssociationPropsBuilder_ec2EClass, SubnetNetworkAclAssociationPropsBuilder_ec2.class,
				"SubnetNetworkAclAssociationPropsBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getSubnetNetworkAclAssociationPropsBuilder_ec2_NetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference(),
				ecorePackage.getEString(),
				"networkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference", null, 0, 1,
				SubnetNetworkAclAssociationPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getSubnetNetworkAclAssociationPropsBuilder_ec2_SubnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference(),
				ecorePackage.getEString(), "subnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference",
				null, 0, 1, SubnetNetworkAclAssociationPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getSubnetNetworkAclAssociationPropsBuilder_ec2_SubnetNetworkAclAssociationName_java_lang_String_(),
				ecorePackage.getEString(), "subnetNetworkAclAssociationName_java_lang_String_", null, 0, 1,
				SubnetNetworkAclAssociationPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetNetworkAclAssociationPropsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociationProps", 0, 1,
				SubnetNetworkAclAssociationPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetNetworkAclAssociationPropsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName",
				null, 0, 1, SubnetNetworkAclAssociationPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetNetworkAclAssociationPropsBuilder_ec2_Identifier(), ecorePackage.getEString(),
				"identifier", null, 0, 1, SubnetNetworkAclAssociationPropsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetNetworkAclAssociationPropsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, SubnetNetworkAclAssociationPropsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vpnGatewayBuilder_ec2EClass, VpnGatewayBuilder_ec2.class, "VpnGatewayBuilder_ec2", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVpnGatewayBuilder_ec2_Type_java_lang_String_(), ecorePackage.getEString(),
				"type_java_lang_String_", null, 0, 1, VpnGatewayBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnGatewayBuilder_ec2_AmazonSideAsn_java_lang_Number_(), ecorePackage.getEInt(),
				"amazonSideAsn_java_lang_Number_", null, 0, 1, VpnGatewayBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnGatewayBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.ec2.VpnGateway", 0, 1, VpnGatewayBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnGatewayBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				VpnGatewayBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnGatewayBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				VpnGatewayBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnGatewayBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0,
				1, VpnGatewayBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(amazonLinuxImageBuilder_ec2EClass, AmazonLinuxImageBuilder_ec2.class, "AmazonLinuxImageBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAmazonLinuxImageBuilder_ec2_Edition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_(),
				this.getAmazonLinuxEdition(), "edition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_", null,
				0, 1, AmazonLinuxImageBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getAmazonLinuxImageBuilder_ec2_Generation_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_(),
				this.getAmazonLinuxGeneration(),
				"generation_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_", null, 0, 1,
				AmazonLinuxImageBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAmazonLinuxImageBuilder_ec2_Storage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_(),
				this.getAmazonLinuxStorage(), "storage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_", null,
				0, 1, AmazonLinuxImageBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getAmazonLinuxImageBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference(),
				ecorePackage.getEString(),
				"userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference", null, 0, 1,
				AmazonLinuxImageBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getAmazonLinuxImageBuilder_ec2_Virtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_(),
				this.getAmazonLinuxVirt(), "virtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_", null,
				0, 1, AmazonLinuxImageBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAmazonLinuxImageBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.AmazonLinuxImage", 0, 1,
				AmazonLinuxImageBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAmazonLinuxImageBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				AmazonLinuxImageBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAmazonLinuxImageBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				AmazonLinuxImageBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAmazonLinuxImageBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, AmazonLinuxImageBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowLogPropsBuilder_ec2EClass, FlowLogPropsBuilder_ec2.class, "FlowLogPropsBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getFlowLogPropsBuilder_ec2_ResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference(),
				ecorePackage.getEString(),
				"resourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference",
				null, 0, 1, FlowLogPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowLogPropsBuilder_ec2_FlowLogName_java_lang_String_(), ecorePackage.getEString(),
				"flowLogName_java_lang_String_", null, 0, 1, FlowLogPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getFlowLogPropsBuilder_ec2_DestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference(),
				ecorePackage.getEString(),
				"destinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference",
				null, 0, 1, FlowLogPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowLogPropsBuilder_ec2_TrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_(),
				this.getFlowLogTrafficType(), "trafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_",
				null, 0, 1, FlowLogPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowLogPropsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.ec2.FlowLogProps", 0, 1, FlowLogPropsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowLogPropsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				FlowLogPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowLogPropsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				FlowLogPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowLogPropsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, FlowLogPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceVpcEndpointPropsBuilder_ec2EClass, InterfaceVpcEndpointPropsBuilder_ec2.class,
				"InterfaceVpcEndpointPropsBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getInterfaceVpcEndpointPropsBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(),
				ecorePackage.getEString(), "vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference", null, 0,
				1, InterfaceVpcEndpointPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getInterfaceVpcEndpointPropsBuilder_ec2_ServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference(),
				ecorePackage.getEString(),
				"serviceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference",
				null, 0, 1, InterfaceVpcEndpointPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceVpcEndpointPropsBuilder_ec2_LookupSupportedAzs_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "lookupSupportedAzs_java_lang_Boolean_", null, 0, 1,
				InterfaceVpcEndpointPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceVpcEndpointPropsBuilder_ec2_Open_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "open_java_lang_Boolean_", null, 0, 1,
				InterfaceVpcEndpointPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceVpcEndpointPropsBuilder_ec2_PrivateDnsEnabled_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "privateDnsEnabled_java_lang_Boolean_", null, 0, 1,
				InterfaceVpcEndpointPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getInterfaceVpcEndpointPropsBuilder_ec2_SecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList(),
				ecorePackage.getEString(), "securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList",
				null, 0, 1, InterfaceVpcEndpointPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getInterfaceVpcEndpointPropsBuilder_ec2_SubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(),
				ecorePackage.getEString(),
				"subnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference", null, 0,
				1, InterfaceVpcEndpointPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceVpcEndpointPropsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.InterfaceVpcEndpointProps", 0, 1,
				InterfaceVpcEndpointPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceVpcEndpointPropsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, InterfaceVpcEndpointPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceVpcEndpointPropsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, InterfaceVpcEndpointPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceVpcEndpointPropsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, InterfaceVpcEndpointPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(portBuilder_ec2EClass, PortBuilder_ec2.class, "PortBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortBuilder_ec2_Protocol_software_amazon_awscdk_services_ec2_Protocol_(), this.getProtocol(),
				"protocol_software_amazon_awscdk_services_ec2_Protocol_", null, 0, 1, PortBuilder_ec2.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortBuilder_ec2_StringRepresentation_java_lang_String_(), ecorePackage.getEString(),
				"stringRepresentation_java_lang_String_", null, 0, 1, PortBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortBuilder_ec2_FromPort_java_lang_Number_(), ecorePackage.getEInt(),
				"fromPort_java_lang_Number_", null, 0, 1, PortBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortBuilder_ec2_ToPort_java_lang_Number_(), ecorePackage.getEInt(),
				"toPort_java_lang_Number_", null, 0, 1, PortBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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

		initEClass(flowLogDestinationConfigBuilder_ec2EClass, FlowLogDestinationConfigBuilder_ec2.class,
				"FlowLogDestinationConfigBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getFlowLogDestinationConfigBuilder_ec2_LogDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_(),
				this.getFlowLogDestinationType(),
				"logDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_", null, 0, 1,
				FlowLogDestinationConfigBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getFlowLogDestinationConfigBuilder_ec2_IamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(),
				ecorePackage.getEString(), "iamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference",
				null, 0, 1, FlowLogDestinationConfigBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getFlowLogDestinationConfigBuilder_ec2_LogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference(),
				ecorePackage.getEString(),
				"logGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference", null, 0, 1,
				FlowLogDestinationConfigBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getFlowLogDestinationConfigBuilder_ec2_S3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference(),
				ecorePackage.getEString(), "s3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference",
				null, 0, 1, FlowLogDestinationConfigBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowLogDestinationConfigBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.FlowLogDestinationConfig", 0, 1,
				FlowLogDestinationConfigBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowLogDestinationConfigBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, FlowLogDestinationConfigBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowLogDestinationConfigBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, FlowLogDestinationConfigBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowLogDestinationConfigBuilder_ec2_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, FlowLogDestinationConfigBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(amazonLinuxImagePropsBuilder_ec2EClass, AmazonLinuxImagePropsBuilder_ec2.class,
				"AmazonLinuxImagePropsBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getAmazonLinuxImagePropsBuilder_ec2_Edition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_(),
				this.getAmazonLinuxEdition(), "edition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_", null,
				0, 1, AmazonLinuxImagePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getAmazonLinuxImagePropsBuilder_ec2_Generation_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_(),
				this.getAmazonLinuxGeneration(),
				"generation_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_", null, 0, 1,
				AmazonLinuxImagePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getAmazonLinuxImagePropsBuilder_ec2_Storage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_(),
				this.getAmazonLinuxStorage(), "storage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_", null,
				0, 1, AmazonLinuxImagePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getAmazonLinuxImagePropsBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference(),
				ecorePackage.getEString(),
				"userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference", null, 0, 1,
				AmazonLinuxImagePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getAmazonLinuxImagePropsBuilder_ec2_Virtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_(),
				this.getAmazonLinuxVirt(), "virtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_", null,
				0, 1, AmazonLinuxImagePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAmazonLinuxImagePropsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.AmazonLinuxImageProps", 0, 1,
				AmazonLinuxImagePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAmazonLinuxImagePropsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				AmazonLinuxImagePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAmazonLinuxImagePropsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, AmazonLinuxImagePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAmazonLinuxImagePropsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, AmazonLinuxImagePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lookupMachineImagePropsBuilder_ec2EClass, LookupMachineImagePropsBuilder_ec2.class,
				"LookupMachineImagePropsBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLookupMachineImagePropsBuilder_ec2_Name_java_lang_String_(), ecorePackage.getEString(),
				"name_java_lang_String_", null, 0, 1, LookupMachineImagePropsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLookupMachineImagePropsBuilder_ec2_Owners_java_lang_String_AsList(),
				ecorePackage.getEString(), "owners_java_lang_String_AsList", null, 0, 1,
				LookupMachineImagePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLookupMachineImagePropsBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference(),
				ecorePackage.getEString(),
				"userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference", null, 0, 1,
				LookupMachineImagePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLookupMachineImagePropsBuilder_ec2_Windows_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "windows_java_lang_Boolean_", null, 0, 1,
				LookupMachineImagePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLookupMachineImagePropsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.LookupMachineImageProps", 0, 1,
				LookupMachineImagePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLookupMachineImagePropsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, LookupMachineImagePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLookupMachineImagePropsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, LookupMachineImagePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLookupMachineImagePropsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, LookupMachineImagePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ebsDeviceSnapshotOptionsBuilder_ec2EClass, EbsDeviceSnapshotOptionsBuilder_ec2.class,
				"EbsDeviceSnapshotOptionsBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEbsDeviceSnapshotOptionsBuilder_ec2_VolumeSize_java_lang_Number_(), ecorePackage.getEInt(),
				"volumeSize_java_lang_Number_", null, 0, 1, EbsDeviceSnapshotOptionsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEbsDeviceSnapshotOptionsBuilder_ec2_DeleteOnTermination_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "deleteOnTermination_java_lang_Boolean_", null, 0, 1,
				EbsDeviceSnapshotOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEbsDeviceSnapshotOptionsBuilder_ec2_Iops_java_lang_Number_(), ecorePackage.getEInt(),
				"iops_java_lang_Number_", null, 0, 1, EbsDeviceSnapshotOptionsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getEbsDeviceSnapshotOptionsBuilder_ec2_VolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_(),
				this.getEbsDeviceVolumeType(), "volumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_",
				null, 0, 1, EbsDeviceSnapshotOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEbsDeviceSnapshotOptionsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.EbsDeviceSnapshotOptions", 0, 1,
				EbsDeviceSnapshotOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEbsDeviceSnapshotOptionsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, EbsDeviceSnapshotOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEbsDeviceSnapshotOptionsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, EbsDeviceSnapshotOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEbsDeviceSnapshotOptionsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, EbsDeviceSnapshotOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vpnConnectionPropsBuilder_ec2EClass, VpnConnectionPropsBuilder_ec2.class,
				"VpnConnectionPropsBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getVpnConnectionPropsBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(),
				ecorePackage.getEString(), "vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference", null, 0,
				1, VpnConnectionPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnConnectionPropsBuilder_ec2_Ip_java_lang_String_(), ecorePackage.getEString(),
				"ip_java_lang_String_", null, 0, 1, VpnConnectionPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnConnectionPropsBuilder_ec2_Asn_java_lang_Number_(), ecorePackage.getEInt(),
				"asn_java_lang_Number_", null, 0, 1, VpnConnectionPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnConnectionPropsBuilder_ec2_StaticRoutes_java_lang_String_AsList(),
				ecorePackage.getEString(), "staticRoutes_java_lang_String_AsList", null, 0, 1,
				VpnConnectionPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVpnConnectionPropsBuilder_ec2_TunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList(),
				ecorePackage.getEString(), "tunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList",
				null, 0, 1, VpnConnectionPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnConnectionPropsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.VpnConnectionProps", 0, 1,
				VpnConnectionPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnConnectionPropsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				VpnConnectionPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnConnectionPropsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, VpnConnectionPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnConnectionPropsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, VpnConnectionPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vpnConnectionBuilder_ec2EClass, VpnConnectionBuilder_ec2.class, "VpnConnectionBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVpnConnectionBuilder_ec2_Ip_java_lang_String_(), ecorePackage.getEString(),
				"ip_java_lang_String_", null, 0, 1, VpnConnectionBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnConnectionBuilder_ec2_Asn_java_lang_Number_(), ecorePackage.getEInt(),
				"asn_java_lang_Number_", null, 0, 1, VpnConnectionBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnConnectionBuilder_ec2_StaticRoutes_java_lang_String_AsList(), ecorePackage.getEString(),
				"staticRoutes_java_lang_String_AsList", null, 0, 1, VpnConnectionBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVpnConnectionBuilder_ec2_TunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList(),
				ecorePackage.getEString(), "tunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList",
				null, 0, 1, VpnConnectionBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnConnectionBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(),
				ecorePackage.getEString(), "vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference", null, 0,
				1, VpnConnectionBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnConnectionBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.VpnConnection", 0, 1,
				VpnConnectionBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnConnectionBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				VpnConnectionBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnConnectionBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				VpnConnectionBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpnConnectionBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, VpnConnectionBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockDeviceBuilder_ec2EClass, BlockDeviceBuilder_ec2.class, "BlockDeviceBuilder_ec2", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlockDeviceBuilder_ec2_DeviceName_java_lang_String_(), ecorePackage.getEString(),
				"deviceName_java_lang_String_", null, 0, 1, BlockDeviceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getBlockDeviceBuilder_ec2_VolumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference(),
				ecorePackage.getEString(),
				"volumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference", null,
				0, 1, BlockDeviceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockDeviceBuilder_ec2_MappingEnabled_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"mappingEnabled_java_lang_Boolean_", null, 0, 1, BlockDeviceBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockDeviceBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.ec2.BlockDevice", 0, 1, BlockDeviceBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockDeviceBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				BlockDeviceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockDeviceBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				BlockDeviceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockDeviceBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0,
				1, BlockDeviceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ebsDevicePropsBuilder_ec2EClass, EbsDevicePropsBuilder_ec2.class, "EbsDevicePropsBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEbsDevicePropsBuilder_ec2_SnapshotId_java_lang_String_(), ecorePackage.getEString(),
				"snapshotId_java_lang_String_", null, 0, 1, EbsDevicePropsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEbsDevicePropsBuilder_ec2_VolumeSize_java_lang_Number_(), ecorePackage.getEInt(),
				"volumeSize_java_lang_Number_", null, 0, 1, EbsDevicePropsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEbsDevicePropsBuilder_ec2_DeleteOnTermination_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "deleteOnTermination_java_lang_Boolean_", null, 0, 1,
				EbsDevicePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEbsDevicePropsBuilder_ec2_Iops_java_lang_Number_(), ecorePackage.getEInt(),
				"iops_java_lang_Number_", null, 0, 1, EbsDevicePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getEbsDevicePropsBuilder_ec2_VolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_(),
				this.getEbsDeviceVolumeType(), "volumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_",
				null, 0, 1, EbsDevicePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEbsDevicePropsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.EbsDeviceProps", 0, 1,
				EbsDevicePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEbsDevicePropsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				EbsDevicePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEbsDevicePropsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				EbsDevicePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEbsDevicePropsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, EbsDevicePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkAclEntryPropsBuilder_ec2EClass, NetworkAclEntryPropsBuilder_ec2.class,
				"NetworkAclEntryPropsBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getNetworkAclEntryPropsBuilder_ec2_NetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference(),
				ecorePackage.getEString(),
				"networkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference", null, 0, 1,
				NetworkAclEntryPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getNetworkAclEntryPropsBuilder_ec2_CidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference(),
				ecorePackage.getEString(), "cidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference",
				null, 0, 1, NetworkAclEntryPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkAclEntryPropsBuilder_ec2_RuleNumber_java_lang_Number_(), ecorePackage.getEInt(),
				"ruleNumber_java_lang_Number_", null, 0, 1, NetworkAclEntryPropsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getNetworkAclEntryPropsBuilder_ec2_TrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference(),
				ecorePackage.getEString(),
				"trafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference", null, 0, 1,
				NetworkAclEntryPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getNetworkAclEntryPropsBuilder_ec2_Direction_software_amazon_awscdk_services_ec2_TrafficDirection_(),
				this.getTrafficDirection(), "direction_software_amazon_awscdk_services_ec2_TrafficDirection_", null, 0,
				1, NetworkAclEntryPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkAclEntryPropsBuilder_ec2_NetworkAclEntryName_java_lang_String_(),
				ecorePackage.getEString(), "networkAclEntryName_java_lang_String_", null, 0, 1,
				NetworkAclEntryPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkAclEntryPropsBuilder_ec2_RuleAction_software_amazon_awscdk_services_ec2_Action_(),
				this.getAction(), "ruleAction_software_amazon_awscdk_services_ec2_Action_", null, 0, 1,
				NetworkAclEntryPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkAclEntryPropsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.NetworkAclEntryProps", 0, 1,
				NetworkAclEntryPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkAclEntryPropsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				NetworkAclEntryPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkAclEntryPropsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, NetworkAclEntryPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkAclEntryPropsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, NetworkAclEntryPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addRouteOptionsBuilder_ec2EClass, AddRouteOptionsBuilder_ec2.class, "AddRouteOptionsBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddRouteOptionsBuilder_ec2_RouterId_java_lang_String_(), ecorePackage.getEString(),
				"routerId_java_lang_String_", null, 0, 1, AddRouteOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddRouteOptionsBuilder_ec2_RouterType_software_amazon_awscdk_services_ec2_RouterType_(),
				this.getRouterType(), "routerType_software_amazon_awscdk_services_ec2_RouterType_", null, 0, 1,
				AddRouteOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddRouteOptionsBuilder_ec2_DestinationCidrBlock_java_lang_String_(),
				ecorePackage.getEString(), "destinationCidrBlock_java_lang_String_", null, 0, 1,
				AddRouteOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddRouteOptionsBuilder_ec2_DestinationIpv6CidrBlock_java_lang_String_(),
				ecorePackage.getEString(), "destinationIpv6CidrBlock_java_lang_String_", null, 0, 1,
				AddRouteOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddRouteOptionsBuilder_ec2_EnablesInternetConnectivity_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "enablesInternetConnectivity_java_lang_Boolean_", null, 0, 1,
				AddRouteOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddRouteOptionsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.AddRouteOptions", 0, 1,
				AddRouteOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddRouteOptionsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				AddRouteOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddRouteOptionsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				AddRouteOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddRouteOptionsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, AddRouteOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicSubnetBuilder_ec2EClass, PublicSubnetBuilder_ec2.class, "PublicSubnetBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPublicSubnetBuilder_ec2_AvailabilityZone_java_lang_String_(), ecorePackage.getEString(),
				"availabilityZone_java_lang_String_", null, 0, 1, PublicSubnetBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicSubnetBuilder_ec2_CidrBlock_java_lang_String_(), ecorePackage.getEString(),
				"cidrBlock_java_lang_String_", null, 0, 1, PublicSubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicSubnetBuilder_ec2_VpcId_java_lang_String_(), ecorePackage.getEString(),
				"vpcId_java_lang_String_", null, 0, 1, PublicSubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicSubnetBuilder_ec2_MapPublicIpOnLaunch_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "mapPublicIpOnLaunch_java_lang_Boolean_", null, 0, 1,
				PublicSubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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

		initEClass(interfaceVpcEndpointOptionsBuilder_ec2EClass, InterfaceVpcEndpointOptionsBuilder_ec2.class,
				"InterfaceVpcEndpointOptionsBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getInterfaceVpcEndpointOptionsBuilder_ec2_ServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference(),
				ecorePackage.getEString(),
				"serviceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference",
				null, 0, 1, InterfaceVpcEndpointOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceVpcEndpointOptionsBuilder_ec2_LookupSupportedAzs_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "lookupSupportedAzs_java_lang_Boolean_", null, 0, 1,
				InterfaceVpcEndpointOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceVpcEndpointOptionsBuilder_ec2_Open_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "open_java_lang_Boolean_", null, 0, 1,
				InterfaceVpcEndpointOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceVpcEndpointOptionsBuilder_ec2_PrivateDnsEnabled_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "privateDnsEnabled_java_lang_Boolean_", null, 0, 1,
				InterfaceVpcEndpointOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getInterfaceVpcEndpointOptionsBuilder_ec2_SecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList(),
				ecorePackage.getEString(), "securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList",
				null, 0, 1, InterfaceVpcEndpointOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getInterfaceVpcEndpointOptionsBuilder_ec2_SubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(),
				ecorePackage.getEString(),
				"subnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference", null, 0,
				1, InterfaceVpcEndpointOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceVpcEndpointOptionsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.InterfaceVpcEndpointOptions", 0, 1,
				InterfaceVpcEndpointOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceVpcEndpointOptionsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null,
				0, 1, InterfaceVpcEndpointOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceVpcEndpointOptionsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, InterfaceVpcEndpointOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceVpcEndpointOptionsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, InterfaceVpcEndpointOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linuxUserDataOptionsBuilder_ec2EClass, LinuxUserDataOptionsBuilder_ec2.class,
				"LinuxUserDataOptionsBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinuxUserDataOptionsBuilder_ec2_Shebang_java_lang_String_(), ecorePackage.getEString(),
				"shebang_java_lang_String_", null, 0, 1, LinuxUserDataOptionsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinuxUserDataOptionsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.LinuxUserDataOptions", 0, 1,
				LinuxUserDataOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinuxUserDataOptionsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				LinuxUserDataOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinuxUserDataOptionsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, LinuxUserDataOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinuxUserDataOptionsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, LinuxUserDataOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkAclPropsBuilder_ec2EClass, NetworkAclPropsBuilder_ec2.class, "NetworkAclPropsBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkAclPropsBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(),
				ecorePackage.getEString(), "vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference", null, 0,
				1, NetworkAclPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkAclPropsBuilder_ec2_NetworkAclName_java_lang_String_(), ecorePackage.getEString(),
				"networkAclName_java_lang_String_", null, 0, 1, NetworkAclPropsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getNetworkAclPropsBuilder_ec2_SubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(),
				ecorePackage.getEString(),
				"subnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference",
				null, 0, 1, NetworkAclPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkAclPropsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.NetworkAclProps", 0, 1,
				NetworkAclPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkAclPropsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				NetworkAclPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkAclPropsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				NetworkAclPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkAclPropsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, NetworkAclPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicSubnetAttributesBuilder_ec2EClass, PublicSubnetAttributesBuilder_ec2.class,
				"PublicSubnetAttributesBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPublicSubnetAttributesBuilder_ec2_SubnetId_java_lang_String_(), ecorePackage.getEString(),
				"subnetId_java_lang_String_", null, 0, 1, PublicSubnetAttributesBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicSubnetAttributesBuilder_ec2_AvailabilityZone_java_lang_String_(),
				ecorePackage.getEString(), "availabilityZone_java_lang_String_", null, 0, 1,
				PublicSubnetAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicSubnetAttributesBuilder_ec2_RouteTableId_java_lang_String_(), ecorePackage.getEString(),
				"routeTableId_java_lang_String_", null, 0, 1, PublicSubnetAttributesBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicSubnetAttributesBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.PublicSubnetAttributes", 0, 1,
				PublicSubnetAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicSubnetAttributesBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				PublicSubnetAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicSubnetAttributesBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, PublicSubnetAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicSubnetAttributesBuilder_ec2_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, PublicSubnetAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(s3DownloadOptionsBuilder_ec2EClass, S3DownloadOptionsBuilder_ec2.class,
				"S3DownloadOptionsBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getS3DownloadOptionsBuilder_ec2_BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference(),
				ecorePackage.getEString(), "bucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference",
				null, 0, 1, S3DownloadOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getS3DownloadOptionsBuilder_ec2_BucketKey_java_lang_String_(), ecorePackage.getEString(),
				"bucketKey_java_lang_String_", null, 0, 1, S3DownloadOptionsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getS3DownloadOptionsBuilder_ec2_LocalFile_java_lang_String_(), ecorePackage.getEString(),
				"localFile_java_lang_String_", null, 0, 1, S3DownloadOptionsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getS3DownloadOptionsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.S3DownloadOptions", 0, 1,
				S3DownloadOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getS3DownloadOptionsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				S3DownloadOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getS3DownloadOptionsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, S3DownloadOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getS3DownloadOptionsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, S3DownloadOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowLogBuilder_ec2EClass, FlowLogBuilder_ec2.class, "FlowLogBuilder_ec2", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getFlowLogBuilder_ec2_DestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference(),
				ecorePackage.getEString(),
				"destinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference",
				null, 0, 1, FlowLogBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowLogBuilder_ec2_TrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_(),
				this.getFlowLogTrafficType(), "trafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_",
				null, 0, 1, FlowLogBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getFlowLogBuilder_ec2_ResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference(),
				ecorePackage.getEString(),
				"resourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference",
				null, 0, 1, FlowLogBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowLogBuilder_ec2_FlowLogName_java_lang_String_(), ecorePackage.getEString(),
				"flowLogName_java_lang_String_", null, 0, 1, FlowLogBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowLogBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.ec2.FlowLog", 0, 1, FlowLogBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowLogBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				FlowLogBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowLogBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				FlowLogBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowLogBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0, 1,
				FlowLogBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(connectionsBuilder_ec2EClass, ConnectionsBuilder_ec2.class, "ConnectionsBuilder_ec2", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getConnectionsBuilder_ec2_DefaultPortWithPort_software_amazon_awscdk_services_ec2_Port_AsReference(),
				ecorePackage.getEString(), "defaultPortWithPort_software_amazon_awscdk_services_ec2_Port_AsReference",
				null, 0, 1, ConnectionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionsBuilder_ec2_PeerWithIPeer_software_amazon_awscdk_services_ec2_IPeer_AsReference(),
				ecorePackage.getEString(), "peerWithIPeer_software_amazon_awscdk_services_ec2_IPeer_AsReference", null,
				0, 1, ConnectionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getConnectionsBuilder_ec2_SecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList(),
				ecorePackage.getEString(), "securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList",
				null, 0, 1, ConnectionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.ec2.Connections", 0, 1, ConnectionsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				ConnectionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				ConnectionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0,
				1, ConnectionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(vpcEndpointServiceBuilder_ec2EClass, VpcEndpointServiceBuilder_ec2.class,
				"VpcEndpointServiceBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getVpcEndpointServiceBuilder_ec2_VpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList(),
				ecorePackage.getEString(),
				"vpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList",
				null, 0, 1, VpcEndpointServiceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcEndpointServiceBuilder_ec2_AcceptanceRequired_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "acceptanceRequired_java_lang_Boolean_", null, 0, 1,
				VpcEndpointServiceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcEndpointServiceBuilder_ec2_VpcEndpointServiceName_java_lang_String_(),
				ecorePackage.getEString(), "vpcEndpointServiceName_java_lang_String_", null, 0, 1,
				VpcEndpointServiceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVpcEndpointServiceBuilder_ec2_WhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList(),
				ecorePackage.getEString(),
				"whitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList", null, 0, 1,
				VpcEndpointServiceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcEndpointServiceBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.VpcEndpointService", 0, 1,
				VpcEndpointServiceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcEndpointServiceBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				VpcEndpointServiceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcEndpointServiceBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, VpcEndpointServiceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcEndpointServiceBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, VpcEndpointServiceBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionRuleBuilder_ec2EClass, ConnectionRuleBuilder_ec2.class, "ConnectionRuleBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnectionRuleBuilder_ec2_FromPort_java_lang_Number_(), ecorePackage.getEInt(),
				"fromPort_java_lang_Number_", null, 0, 1, ConnectionRuleBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionRuleBuilder_ec2_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, ConnectionRuleBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionRuleBuilder_ec2_Protocol_java_lang_String_(), ecorePackage.getEString(),
				"protocol_java_lang_String_", null, 0, 1, ConnectionRuleBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionRuleBuilder_ec2_ToPort_java_lang_Number_(), ecorePackage.getEInt(),
				"toPort_java_lang_Number_", null, 0, 1, ConnectionRuleBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionRuleBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.ConnectionRule", 0, 1,
				ConnectionRuleBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionRuleBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				ConnectionRuleBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionRuleBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				ConnectionRuleBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionRuleBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, ConnectionRuleBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subnetPropsBuilder_ec2EClass, SubnetPropsBuilder_ec2.class, "SubnetPropsBuilder_ec2", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubnetPropsBuilder_ec2_AvailabilityZone_java_lang_String_(), ecorePackage.getEString(),
				"availabilityZone_java_lang_String_", null, 0, 1, SubnetPropsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetPropsBuilder_ec2_CidrBlock_java_lang_String_(), ecorePackage.getEString(),
				"cidrBlock_java_lang_String_", null, 0, 1, SubnetPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetPropsBuilder_ec2_VpcId_java_lang_String_(), ecorePackage.getEString(),
				"vpcId_java_lang_String_", null, 0, 1, SubnetPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetPropsBuilder_ec2_MapPublicIpOnLaunch_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "mapPublicIpOnLaunch_java_lang_Boolean_", null, 0, 1,
				SubnetPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetPropsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.ec2.SubnetProps", 0, 1, SubnetPropsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetPropsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				SubnetPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetPropsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				SubnetPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetPropsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0,
				1, SubnetPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subnetNetworkAclAssociationBuilder_ec2EClass, SubnetNetworkAclAssociationBuilder_ec2.class,
				"SubnetNetworkAclAssociationBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getSubnetNetworkAclAssociationBuilder_ec2_NetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference(),
				ecorePackage.getEString(),
				"networkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference", null, 0, 1,
				SubnetNetworkAclAssociationBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getSubnetNetworkAclAssociationBuilder_ec2_SubnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference(),
				ecorePackage.getEString(), "subnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference",
				null, 0, 1, SubnetNetworkAclAssociationBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetNetworkAclAssociationBuilder_ec2_SubnetNetworkAclAssociationName_java_lang_String_(),
				ecorePackage.getEString(), "subnetNetworkAclAssociationName_java_lang_String_", null, 0, 1,
				SubnetNetworkAclAssociationBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetNetworkAclAssociationBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociation", 0, 1,
				SubnetNetworkAclAssociationBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetNetworkAclAssociationBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null,
				0, 1, SubnetNetworkAclAssociationBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetNetworkAclAssociationBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, SubnetNetworkAclAssociationBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetNetworkAclAssociationBuilder_ec2_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, SubnetNetworkAclAssociationBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machineImageConfigBuilder_ec2EClass, MachineImageConfigBuilder_ec2.class,
				"MachineImageConfigBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachineImageConfigBuilder_ec2_ImageId_java_lang_String_(), ecorePackage.getEString(),
				"imageId_java_lang_String_", null, 0, 1, MachineImageConfigBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getMachineImageConfigBuilder_ec2_OsType_software_amazon_awscdk_services_ec2_OperatingSystemType_(),
				this.getOperatingSystemType(), "osType_software_amazon_awscdk_services_ec2_OperatingSystemType_", null,
				0, 1, MachineImageConfigBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getMachineImageConfigBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference(),
				ecorePackage.getEString(),
				"userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference", null, 0, 1,
				MachineImageConfigBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineImageConfigBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.MachineImageConfig", 0, 1,
				MachineImageConfigBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineImageConfigBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				MachineImageConfigBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineImageConfigBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, MachineImageConfigBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineImageConfigBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, MachineImageConfigBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(windowsImagePropsBuilder_ec2EClass, WindowsImagePropsBuilder_ec2.class,
				"WindowsImagePropsBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getWindowsImagePropsBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference(),
				ecorePackage.getEString(),
				"userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference", null, 0, 1,
				WindowsImagePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindowsImagePropsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.WindowsImageProps", 0, 1,
				WindowsImagePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindowsImagePropsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				WindowsImagePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindowsImagePropsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, WindowsImagePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindowsImagePropsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, WindowsImagePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instancePropsBuilder_ec2EClass, InstancePropsBuilder_ec2.class, "InstancePropsBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getInstancePropsBuilder_ec2_InstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference(),
				ecorePackage.getEString(),
				"instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference", null, 0, 1,
				InstancePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getInstancePropsBuilder_ec2_MachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference(),
				ecorePackage.getEString(),
				"machineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference", null, 0,
				1, InstancePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstancePropsBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(),
				ecorePackage.getEString(), "vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference", null, 0,
				1, InstancePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstancePropsBuilder_ec2_AllowAllOutbound_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "allowAllOutbound_java_lang_Boolean_", null, 0, 1,
				InstancePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstancePropsBuilder_ec2_AvailabilityZone_java_lang_String_(), ecorePackage.getEString(),
				"availabilityZone_java_lang_String_", null, 0, 1, InstancePropsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getInstancePropsBuilder_ec2_BlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList(),
				ecorePackage.getEString(), "blockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList", null,
				0, 1, InstancePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstancePropsBuilder_ec2_InstanceName_java_lang_String_(), ecorePackage.getEString(),
				"instanceName_java_lang_String_", null, 0, 1, InstancePropsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstancePropsBuilder_ec2_KeyName_java_lang_String_(), ecorePackage.getEString(),
				"keyName_java_lang_String_", null, 0, 1, InstancePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstancePropsBuilder_ec2_PrivateIpAddress_java_lang_String_(), ecorePackage.getEString(),
				"privateIpAddress_java_lang_String_", null, 0, 1, InstancePropsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getInstancePropsBuilder_ec2_ResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(),
				ecorePackage.getEString(),
				"resourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference", null, 0, 1,
				InstancePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getInstancePropsBuilder_ec2_RoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(),
				ecorePackage.getEString(), "roleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference", null,
				0, 1, InstancePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getInstancePropsBuilder_ec2_SecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference(),
				ecorePackage.getEString(),
				"securityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference", null,
				0, 1, InstancePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstancePropsBuilder_ec2_SourceDestCheck_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "sourceDestCheck_java_lang_Boolean_", null, 0, 1,
				InstancePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getInstancePropsBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference(),
				ecorePackage.getEString(),
				"userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference", null, 0, 1,
				InstancePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getInstancePropsBuilder_ec2_VpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(),
				ecorePackage.getEString(),
				"vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference", null,
				0, 1, InstancePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstancePropsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.InstanceProps", 0, 1,
				InstancePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstancePropsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				InstancePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstancePropsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				InstancePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstancePropsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, InstancePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(natInstancePropsBuilder_ec2EClass, NatInstancePropsBuilder_ec2.class, "NatInstancePropsBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getNatInstancePropsBuilder_ec2_InstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference(),
				ecorePackage.getEString(),
				"instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference", null, 0, 1,
				NatInstancePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNatInstancePropsBuilder_ec2_AllowAllTraffic_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "allowAllTraffic_java_lang_Boolean_", null, 0, 1,
				NatInstancePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNatInstancePropsBuilder_ec2_KeyName_java_lang_String_(), ecorePackage.getEString(),
				"keyName_java_lang_String_", null, 0, 1, NatInstancePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getNatInstancePropsBuilder_ec2_MachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference(),
				ecorePackage.getEString(),
				"machineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference", null, 0,
				1, NatInstancePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getNatInstancePropsBuilder_ec2_SecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference(),
				ecorePackage.getEString(),
				"securityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference", null,
				0, 1, NatInstancePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNatInstancePropsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.NatInstanceProps", 0, 1,
				NatInstancePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNatInstancePropsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				NatInstancePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNatInstancePropsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				NatInstancePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNatInstancePropsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, NatInstancePropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(privateSubnetPropsBuilder_ec2EClass, PrivateSubnetPropsBuilder_ec2.class,
				"PrivateSubnetPropsBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrivateSubnetPropsBuilder_ec2_AvailabilityZone_java_lang_String_(), ecorePackage.getEString(),
				"availabilityZone_java_lang_String_", null, 0, 1, PrivateSubnetPropsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrivateSubnetPropsBuilder_ec2_CidrBlock_java_lang_String_(), ecorePackage.getEString(),
				"cidrBlock_java_lang_String_", null, 0, 1, PrivateSubnetPropsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrivateSubnetPropsBuilder_ec2_VpcId_java_lang_String_(), ecorePackage.getEString(),
				"vpcId_java_lang_String_", null, 0, 1, PrivateSubnetPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrivateSubnetPropsBuilder_ec2_MapPublicIpOnLaunch_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "mapPublicIpOnLaunch_java_lang_Boolean_", null, 0, 1,
				PrivateSubnetPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrivateSubnetPropsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.PrivateSubnetProps", 0, 1,
				PrivateSubnetPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrivateSubnetPropsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				PrivateSubnetPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrivateSubnetPropsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, PrivateSubnetPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrivateSubnetPropsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, PrivateSubnetPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(privateSubnetAttributesBuilder_ec2EClass, PrivateSubnetAttributesBuilder_ec2.class,
				"PrivateSubnetAttributesBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrivateSubnetAttributesBuilder_ec2_SubnetId_java_lang_String_(), ecorePackage.getEString(),
				"subnetId_java_lang_String_", null, 0, 1, PrivateSubnetAttributesBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrivateSubnetAttributesBuilder_ec2_AvailabilityZone_java_lang_String_(),
				ecorePackage.getEString(), "availabilityZone_java_lang_String_", null, 0, 1,
				PrivateSubnetAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrivateSubnetAttributesBuilder_ec2_RouteTableId_java_lang_String_(),
				ecorePackage.getEString(), "routeTableId_java_lang_String_", null, 0, 1,
				PrivateSubnetAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrivateSubnetAttributesBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.PrivateSubnetAttributes", 0, 1,
				PrivateSubnetAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrivateSubnetAttributesBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, PrivateSubnetAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrivateSubnetAttributesBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, PrivateSubnetAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrivateSubnetAttributesBuilder_ec2_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, PrivateSubnetAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceVpcEndpointBuilder_ec2EClass, InterfaceVpcEndpointBuilder_ec2.class,
				"InterfaceVpcEndpointBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getInterfaceVpcEndpointBuilder_ec2_ServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference(),
				ecorePackage.getEString(),
				"serviceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference",
				null, 0, 1, InterfaceVpcEndpointBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceVpcEndpointBuilder_ec2_LookupSupportedAzs_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "lookupSupportedAzs_java_lang_Boolean_", null, 0, 1,
				InterfaceVpcEndpointBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceVpcEndpointBuilder_ec2_Open_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"open_java_lang_Boolean_", null, 0, 1, InterfaceVpcEndpointBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceVpcEndpointBuilder_ec2_PrivateDnsEnabled_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "privateDnsEnabled_java_lang_Boolean_", null, 0, 1,
				InterfaceVpcEndpointBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getInterfaceVpcEndpointBuilder_ec2_SecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList(),
				ecorePackage.getEString(), "securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList",
				null, 0, 1, InterfaceVpcEndpointBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getInterfaceVpcEndpointBuilder_ec2_SubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(),
				ecorePackage.getEString(),
				"subnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference", null, 0,
				1, InterfaceVpcEndpointBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getInterfaceVpcEndpointBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(),
				ecorePackage.getEString(), "vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference", null, 0,
				1, InterfaceVpcEndpointBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceVpcEndpointBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.InterfaceVpcEndpoint", 0, 1,
				InterfaceVpcEndpointBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceVpcEndpointBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				InterfaceVpcEndpointBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceVpcEndpointBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, InterfaceVpcEndpointBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceVpcEndpointBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, InterfaceVpcEndpointBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configureNatOptionsBuilder_ec2EClass, ConfigureNatOptionsBuilder_ec2.class,
				"ConfigureNatOptionsBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getConfigureNatOptionsBuilder_ec2_NatSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList(),
				ecorePackage.getEString(), "natSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList", null,
				0, 1, ConfigureNatOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getConfigureNatOptionsBuilder_ec2_PrivateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList(),
				ecorePackage.getEString(), "privateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList",
				null, 0, 1, ConfigureNatOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getConfigureNatOptionsBuilder_ec2_VpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference(),
				ecorePackage.getEString(), "vpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference", null, 0, 1,
				ConfigureNatOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigureNatOptionsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.ConfigureNatOptions", 0, 1,
				ConfigureNatOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigureNatOptionsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				ConfigureNatOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigureNatOptionsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, ConfigureNatOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigureNatOptionsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, ConfigureNatOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(aclIcmpBuilder_ec2EClass, AclIcmpBuilder_ec2.class, "AclIcmpBuilder_ec2", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAclIcmpBuilder_ec2_Code_java_lang_Number_(), ecorePackage.getEInt(), "code_java_lang_Number_",
				null, 0, 1, AclIcmpBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAclIcmpBuilder_ec2_Type_java_lang_Number_(), ecorePackage.getEInt(), "type_java_lang_Number_",
				null, 0, 1, AclIcmpBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAclIcmpBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.ec2.AclIcmp", 0, 1, AclIcmpBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAclIcmpBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				AclIcmpBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAclIcmpBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				AclIcmpBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAclIcmpBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0, 1,
				AclIcmpBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(networkAclBuilder_ec2EClass, NetworkAclBuilder_ec2.class, "NetworkAclBuilder_ec2", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkAclBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(),
				ecorePackage.getEString(), "vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference", null, 0,
				1, NetworkAclBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkAclBuilder_ec2_NetworkAclName_java_lang_String_(), ecorePackage.getEString(),
				"networkAclName_java_lang_String_", null, 0, 1, NetworkAclBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getNetworkAclBuilder_ec2_SubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(),
				ecorePackage.getEString(),
				"subnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference",
				null, 0, 1, NetworkAclBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkAclBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.ec2.NetworkAcl", 0, 1, NetworkAclBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkAclBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				NetworkAclBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkAclBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				NetworkAclBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkAclBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0,
				1, NetworkAclBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commonNetworkAclEntryOptionsBuilder_ec2EClass, CommonNetworkAclEntryOptionsBuilder_ec2.class,
				"CommonNetworkAclEntryOptionsBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getCommonNetworkAclEntryOptionsBuilder_ec2_CidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference(),
				ecorePackage.getEString(), "cidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference",
				null, 0, 1, CommonNetworkAclEntryOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommonNetworkAclEntryOptionsBuilder_ec2_RuleNumber_java_lang_Number_(),
				ecorePackage.getEInt(), "ruleNumber_java_lang_Number_", null, 0, 1,
				CommonNetworkAclEntryOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getCommonNetworkAclEntryOptionsBuilder_ec2_TrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference(),
				ecorePackage.getEString(),
				"trafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference", null, 0, 1,
				CommonNetworkAclEntryOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getCommonNetworkAclEntryOptionsBuilder_ec2_Direction_software_amazon_awscdk_services_ec2_TrafficDirection_(),
				this.getTrafficDirection(), "direction_software_amazon_awscdk_services_ec2_TrafficDirection_", null, 0,
				1, CommonNetworkAclEntryOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommonNetworkAclEntryOptionsBuilder_ec2_NetworkAclEntryName_java_lang_String_(),
				ecorePackage.getEString(), "networkAclEntryName_java_lang_String_", null, 0, 1,
				CommonNetworkAclEntryOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getCommonNetworkAclEntryOptionsBuilder_ec2_RuleAction_software_amazon_awscdk_services_ec2_Action_(),
				this.getAction(), "ruleAction_software_amazon_awscdk_services_ec2_Action_", null, 0, 1,
				CommonNetworkAclEntryOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommonNetworkAclEntryOptionsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.CommonNetworkAclEntryOptions", 0, 1,
				CommonNetworkAclEntryOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommonNetworkAclEntryOptionsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null,
				0, 1, CommonNetworkAclEntryOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommonNetworkAclEntryOptionsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, CommonNetworkAclEntryOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommonNetworkAclEntryOptionsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, CommonNetworkAclEntryOptionsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gatewayVpcEndpointOptionsBuilder_ec2EClass, GatewayVpcEndpointOptionsBuilder_ec2.class,
				"GatewayVpcEndpointOptionsBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getGatewayVpcEndpointOptionsBuilder_ec2_ServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference(),
				ecorePackage.getEString(),
				"serviceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference",
				null, 0, 1, GatewayVpcEndpointOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getGatewayVpcEndpointOptionsBuilder_ec2_Subnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList(),
				ecorePackage.getEString(), "subnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList", null,
				0, 1, GatewayVpcEndpointOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayVpcEndpointOptionsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.GatewayVpcEndpointOptions", 0, 1,
				GatewayVpcEndpointOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayVpcEndpointOptionsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, GatewayVpcEndpointOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayVpcEndpointOptionsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, GatewayVpcEndpointOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayVpcEndpointOptionsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, GatewayVpcEndpointOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lookupMachineImageBuilder_ec2EClass, LookupMachineImageBuilder_ec2.class,
				"LookupMachineImageBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLookupMachineImageBuilder_ec2_Name_java_lang_String_(), ecorePackage.getEString(),
				"name_java_lang_String_", null, 0, 1, LookupMachineImageBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLookupMachineImageBuilder_ec2_Owners_java_lang_String_AsList(), ecorePackage.getEString(),
				"owners_java_lang_String_AsList", null, 0, 1, LookupMachineImageBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLookupMachineImageBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference(),
				ecorePackage.getEString(),
				"userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference", null, 0, 1,
				LookupMachineImageBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLookupMachineImageBuilder_ec2_Windows_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"windows_java_lang_Boolean_", null, 0, 1, LookupMachineImageBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLookupMachineImageBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.LookupMachineImage", 0, 1,
				LookupMachineImageBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLookupMachineImageBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				LookupMachineImageBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLookupMachineImageBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, LookupMachineImageBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLookupMachineImageBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, LookupMachineImageBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portPropsBuilder_ec2EClass, PortPropsBuilder_ec2.class, "PortPropsBuilder_ec2", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortPropsBuilder_ec2_Protocol_software_amazon_awscdk_services_ec2_Protocol_(),
				this.getProtocol(), "protocol_software_amazon_awscdk_services_ec2_Protocol_", null, 0, 1,
				PortPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortPropsBuilder_ec2_StringRepresentation_java_lang_String_(), ecorePackage.getEString(),
				"stringRepresentation_java_lang_String_", null, 0, 1, PortPropsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortPropsBuilder_ec2_FromPort_java_lang_Number_(), ecorePackage.getEInt(),
				"fromPort_java_lang_Number_", null, 0, 1, PortPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortPropsBuilder_ec2_ToPort_java_lang_Number_(), ecorePackage.getEInt(),
				"toPort_java_lang_Number_", null, 0, 1, PortPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortPropsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.ec2.PortProps", 0, 1, PortPropsBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortPropsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				PortPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortPropsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				PortPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortPropsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0,
				1, PortPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityGroupImportOptionsBuilder_ec2EClass, SecurityGroupImportOptionsBuilder_ec2.class,
				"SecurityGroupImportOptionsBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityGroupImportOptionsBuilder_ec2_AllowAllOutbound_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "allowAllOutbound_java_lang_Boolean_", null, 0, 1,
				SecurityGroupImportOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroupImportOptionsBuilder_ec2_Mutable_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "mutable_java_lang_Boolean_", null, 0, 1,
				SecurityGroupImportOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroupImportOptionsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.SecurityGroupImportOptions", 0, 1,
				SecurityGroupImportOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroupImportOptionsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null,
				0, 1, SecurityGroupImportOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroupImportOptionsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, SecurityGroupImportOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroupImportOptionsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, SecurityGroupImportOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionsPropsBuilder_ec2EClass, ConnectionsPropsBuilder_ec2.class, "ConnectionsPropsBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getConnectionsPropsBuilder_ec2_DefaultPortWithPort_software_amazon_awscdk_services_ec2_Port_AsReference(),
				ecorePackage.getEString(), "defaultPortWithPort_software_amazon_awscdk_services_ec2_Port_AsReference",
				null, 0, 1, ConnectionsPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getConnectionsPropsBuilder_ec2_PeerWithIPeer_software_amazon_awscdk_services_ec2_IPeer_AsReference(),
				ecorePackage.getEString(), "peerWithIPeer_software_amazon_awscdk_services_ec2_IPeer_AsReference", null,
				0, 1, ConnectionsPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getConnectionsPropsBuilder_ec2_SecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList(),
				ecorePackage.getEString(), "securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList",
				null, 0, 1, ConnectionsPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionsPropsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.ConnectionsProps", 0, 1,
				ConnectionsPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionsPropsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				ConnectionsPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionsPropsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				ConnectionsPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionsPropsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, ConnectionsPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ebsDeviceOptionsBaseBuilder_ec2EClass, EbsDeviceOptionsBaseBuilder_ec2.class,
				"EbsDeviceOptionsBaseBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEbsDeviceOptionsBaseBuilder_ec2_DeleteOnTermination_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "deleteOnTermination_java_lang_Boolean_", null, 0, 1,
				EbsDeviceOptionsBaseBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEbsDeviceOptionsBaseBuilder_ec2_Iops_java_lang_Number_(), ecorePackage.getEInt(),
				"iops_java_lang_Number_", null, 0, 1, EbsDeviceOptionsBaseBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getEbsDeviceOptionsBaseBuilder_ec2_VolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_(),
				this.getEbsDeviceVolumeType(), "volumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_",
				null, 0, 1, EbsDeviceOptionsBaseBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEbsDeviceOptionsBaseBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.EbsDeviceOptionsBase", 0, 1,
				EbsDeviceOptionsBaseBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEbsDeviceOptionsBaseBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				EbsDeviceOptionsBaseBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEbsDeviceOptionsBaseBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, EbsDeviceOptionsBaseBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEbsDeviceOptionsBaseBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, EbsDeviceOptionsBaseBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subnetAttributesBuilder_ec2EClass, SubnetAttributesBuilder_ec2.class, "SubnetAttributesBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubnetAttributesBuilder_ec2_SubnetId_java_lang_String_(), ecorePackage.getEString(),
				"subnetId_java_lang_String_", null, 0, 1, SubnetAttributesBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetAttributesBuilder_ec2_AvailabilityZone_java_lang_String_(), ecorePackage.getEString(),
				"availabilityZone_java_lang_String_", null, 0, 1, SubnetAttributesBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetAttributesBuilder_ec2_RouteTableId_java_lang_String_(), ecorePackage.getEString(),
				"routeTableId_java_lang_String_", null, 0, 1, SubnetAttributesBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetAttributesBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.SubnetAttributes", 0, 1,
				SubnetAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetAttributesBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				SubnetAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetAttributesBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				SubnetAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetAttributesBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, SubnetAttributesBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityGroupBuilder_ec2EClass, SecurityGroupBuilder_ec2.class, "SecurityGroupBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityGroupBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(),
				ecorePackage.getEString(), "vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference", null, 0,
				1, SecurityGroupBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroupBuilder_ec2_AllowAllOutbound_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "allowAllOutbound_java_lang_Boolean_", null, 0, 1,
				SecurityGroupBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroupBuilder_ec2_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, SecurityGroupBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroupBuilder_ec2_SecurityGroupName_java_lang_String_(), ecorePackage.getEString(),
				"securityGroupName_java_lang_String_", null, 0, 1, SecurityGroupBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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

		initEClass(gatewayVpcEndpointBuilder_ec2EClass, GatewayVpcEndpointBuilder_ec2.class,
				"GatewayVpcEndpointBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getGatewayVpcEndpointBuilder_ec2_ServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference(),
				ecorePackage.getEString(),
				"serviceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference",
				null, 0, 1, GatewayVpcEndpointBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getGatewayVpcEndpointBuilder_ec2_Subnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList(),
				ecorePackage.getEString(), "subnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList", null,
				0, 1, GatewayVpcEndpointBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getGatewayVpcEndpointBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(),
				ecorePackage.getEString(), "vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference", null, 0,
				1, GatewayVpcEndpointBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayVpcEndpointBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.GatewayVpcEndpoint", 0, 1,
				GatewayVpcEndpointBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayVpcEndpointBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				GatewayVpcEndpointBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayVpcEndpointBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, GatewayVpcEndpointBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayVpcEndpointBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, GatewayVpcEndpointBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkAclEntryBuilder_ec2EClass, NetworkAclEntryBuilder_ec2.class, "NetworkAclEntryBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getNetworkAclEntryBuilder_ec2_CidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference(),
				ecorePackage.getEString(), "cidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference",
				null, 0, 1, NetworkAclEntryBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkAclEntryBuilder_ec2_RuleNumber_java_lang_Number_(), ecorePackage.getEInt(),
				"ruleNumber_java_lang_Number_", null, 0, 1, NetworkAclEntryBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getNetworkAclEntryBuilder_ec2_TrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference(),
				ecorePackage.getEString(),
				"trafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference", null, 0, 1,
				NetworkAclEntryBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkAclEntryBuilder_ec2_Direction_software_amazon_awscdk_services_ec2_TrafficDirection_(),
				this.getTrafficDirection(), "direction_software_amazon_awscdk_services_ec2_TrafficDirection_", null, 0,
				1, NetworkAclEntryBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkAclEntryBuilder_ec2_NetworkAclEntryName_java_lang_String_(), ecorePackage.getEString(),
				"networkAclEntryName_java_lang_String_", null, 0, 1, NetworkAclEntryBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkAclEntryBuilder_ec2_RuleAction_software_amazon_awscdk_services_ec2_Action_(),
				this.getAction(), "ruleAction_software_amazon_awscdk_services_ec2_Action_", null, 0, 1,
				NetworkAclEntryBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getNetworkAclEntryBuilder_ec2_NetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference(),
				ecorePackage.getEString(),
				"networkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference", null, 0, 1,
				NetworkAclEntryBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkAclEntryBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.NetworkAclEntry", 0, 1,
				NetworkAclEntryBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkAclEntryBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				NetworkAclEntryBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkAclEntryBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				NetworkAclEntryBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkAclEntryBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, NetworkAclEntryBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gatewayVpcEndpointPropsBuilder_ec2EClass, GatewayVpcEndpointPropsBuilder_ec2.class,
				"GatewayVpcEndpointPropsBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getGatewayVpcEndpointPropsBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(),
				ecorePackage.getEString(), "vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference", null, 0,
				1, GatewayVpcEndpointPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getGatewayVpcEndpointPropsBuilder_ec2_ServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference(),
				ecorePackage.getEString(),
				"serviceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference",
				null, 0, 1, GatewayVpcEndpointPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getGatewayVpcEndpointPropsBuilder_ec2_Subnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList(),
				ecorePackage.getEString(), "subnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList", null,
				0, 1, GatewayVpcEndpointPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayVpcEndpointPropsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.GatewayVpcEndpointProps", 0, 1,
				GatewayVpcEndpointPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayVpcEndpointPropsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, GatewayVpcEndpointPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayVpcEndpointPropsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, GatewayVpcEndpointPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayVpcEndpointPropsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, GatewayVpcEndpointPropsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(instanceSizeEEnum, InstanceSize.class, "InstanceSize");
		addEEnumLiteral(instanceSizeEEnum, InstanceSize.NANO);
		addEEnumLiteral(instanceSizeEEnum, InstanceSize.MICRO);
		addEEnumLiteral(instanceSizeEEnum, InstanceSize.SMALL);
		addEEnumLiteral(instanceSizeEEnum, InstanceSize.MEDIUM);
		addEEnumLiteral(instanceSizeEEnum, InstanceSize.LARGE);
		addEEnumLiteral(instanceSizeEEnum, InstanceSize.XLARGE);
		addEEnumLiteral(instanceSizeEEnum, InstanceSize.XLARGE2);
		addEEnumLiteral(instanceSizeEEnum, InstanceSize.XLARGE4);
		addEEnumLiteral(instanceSizeEEnum, InstanceSize.XLARGE8);
		addEEnumLiteral(instanceSizeEEnum, InstanceSize.XLARGE9);
		addEEnumLiteral(instanceSizeEEnum, InstanceSize.XLARGE10);
		addEEnumLiteral(instanceSizeEEnum, InstanceSize.XLARGE12);
		addEEnumLiteral(instanceSizeEEnum, InstanceSize.XLARGE16);
		addEEnumLiteral(instanceSizeEEnum, InstanceSize.XLARGE18);
		addEEnumLiteral(instanceSizeEEnum, InstanceSize.XLARGE24);
		addEEnumLiteral(instanceSizeEEnum, InstanceSize.XLARGE32);
		addEEnumLiteral(instanceSizeEEnum, InstanceSize.METAL);

		initEEnum(vpcEndpointTypeEEnum, VpcEndpointType.class, "VpcEndpointType");
		addEEnumLiteral(vpcEndpointTypeEEnum, VpcEndpointType.INTERFACE);
		addEEnumLiteral(vpcEndpointTypeEEnum, VpcEndpointType.GATEWAY);

		initEEnum(operatingSystemTypeEEnum, OperatingSystemType.class, "OperatingSystemType");
		addEEnumLiteral(operatingSystemTypeEEnum, OperatingSystemType.LINUX);
		addEEnumLiteral(operatingSystemTypeEEnum, OperatingSystemType.WINDOWS);

		initEEnum(amazonLinuxGenerationEEnum, AmazonLinuxGeneration.class, "AmazonLinuxGeneration");
		addEEnumLiteral(amazonLinuxGenerationEEnum, AmazonLinuxGeneration.AMAZON_LINUX);
		addEEnumLiteral(amazonLinuxGenerationEEnum, AmazonLinuxGeneration.AMAZON_LINUX_2);

		initEEnum(amazonLinuxStorageEEnum, AmazonLinuxStorage.class, "AmazonLinuxStorage");
		addEEnumLiteral(amazonLinuxStorageEEnum, AmazonLinuxStorage.EBS);
		addEEnumLiteral(amazonLinuxStorageEEnum, AmazonLinuxStorage.GENERAL_PURPOSE);

		initEEnum(subnetTypeEEnum, SubnetType.class, "SubnetType");
		addEEnumLiteral(subnetTypeEEnum, SubnetType.ISOLATED);
		addEEnumLiteral(subnetTypeEEnum, SubnetType.PRIVATE);
		addEEnumLiteral(subnetTypeEEnum, SubnetType.PUBLIC);

		initEEnum(amazonLinuxEditionEEnum, AmazonLinuxEdition.class, "AmazonLinuxEdition");
		addEEnumLiteral(amazonLinuxEditionEEnum, AmazonLinuxEdition.STANDARD);
		addEEnumLiteral(amazonLinuxEditionEEnum, AmazonLinuxEdition.MINIMAL);

		initEEnum(instanceClassEEnum, InstanceClass.class, "InstanceClass");
		addEEnumLiteral(instanceClassEEnum, InstanceClass.STANDARD3);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.STANDARD4);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.STANDARD5);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.STANDARD5_NVME_DRIVE);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.STANDARD5_AMD);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.STANDARD5_AMD_NVME_DRIVE);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.MEMORY3);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.MEMORY4);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.MEMORY5);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.MEMORY5_HIGH_PERFORMANCE);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.MEMORY5_NVME_DRIVE);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.MEMORY5_NVME_DRIVE_HIGH_PERFORMANCE);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.MEMORY5_AMD);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.COMPUTE3);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.COMPUTE4);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.COMPUTE5);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.COMPUTE5_NVME_DRIVE);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.COMPUTE5_HIGH_PERFORMANCE);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.STORAGE2);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.STORAGE_COMPUTE_1);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.IO3);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.IO3_DENSE_NVME_DRIVE);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.BURSTABLE2);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.BURSTABLE3);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.BURSTABLE3_AMD);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.MEMORY_INTENSIVE_1);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.MEMORY_INTENSIVE_1EXTENDED);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.FPGA1);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.GRAPHICS3);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.GRAPHICS4_NVME_DRIVE_HIGH_PERFORMANCE);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.PARALLEL2);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.PARALLEL3);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.ARM1);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.STANDARD6_GRAVITON);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.HIGH_COMPUTE_MEMORY1);
		addEEnumLiteral(instanceClassEEnum, InstanceClass.INFERENCE1);

		initEEnum(actionEEnum, Action.class, "Action");
		addEEnumLiteral(actionEEnum, Action.ALLOW);
		addEEnumLiteral(actionEEnum, Action.DENY);

		initEEnum(windowsVersionEEnum, WindowsVersion.class, "WindowsVersion");
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2008_SP2_ENGLISH_64BIT_SQL_2008_SP4_EXPRESS);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_CHINESE_SIMPLIFIED_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_CHINESE_TRADITIONAL_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_DUTCH_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2014_SP2_ENTERPRISE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_HUNGARIAN_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_CORE_CONTAINERS);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP1_WEB);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_GERMAL_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2003_R2_SP2_LANGUAGE_PACKS_32BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_SQL_2008_R2_SP3_WEB);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_SQL_2012_SP4_EXPRESS);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_R2_SP1_PORTUGESE_BRAZIL_64BIT_CORE);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP2_STANDARD);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2014_SP2_EXPRESS);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_RTM_ITALIAN_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP1_EXPRESS);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_DEEP_LEARNING);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2019_ITALIAN_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_KOREAN_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP1_EXPRESS);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP2_WEB);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_JAPANESE_FULL_FQL_2016_SP2_WEB);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_KOREAN_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_KOREAN_FULL_SQL_2016_SP2_STANDARD);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_PORTUGESE_PORTUGAL_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2017_WEB);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2019_FRENCH_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2019_KOREAN_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_CHINESE_HONG_KONG_SAR_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_CHINESE_PRC_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_RTM_FRENCH_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_FULL_CONTAINERS);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP1_STANDARD);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_RUSSIAN_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2019_CHINESE_SIMPLIFIED_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2016_SP2_STANDARD);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2019_HUNGARIAN_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_SQL_2008_R2_SP3_EXPRESS);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2007_R2_SP1_LANGUAGE_PACKS_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2008_SP2_ENGLISH_32BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2012_SP4_ENTERPRISE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_RTM_CHINESE_TRADITIONAL_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2008_R2_SP3_EXPRESS);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2014_SP2_STANDARD);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2014_SP2_EXPRESS);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_POLISH_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2016_SP2_WEB);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2014_SP3_STANDARD);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP2_EXPRESS);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_DEEP_LEARNING);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_GERMAN_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP1_EXPRESS);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_RUSSIAN_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_RTM_CHINESE_TRADITIONAL_HONG_KONG_SAR_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_RTM_HUNGARIAN_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2014_SP3_STANDARD);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_FULL_HYPERV);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2003_R2_SP2_ENGLISH_64BIT_SQL_2005_SP4_EXPRESS);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_JAPANESE_64BIT_SQL_2012_SP4_EXPRESS);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_RTM_GERMAN_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2008_R2_SP3_STANDARD);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP2_STANDARD);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2017_EXPRESS);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2019_JAPANESE_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2019_RUSSIAN_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2014_SP2_STANDARD);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ITALIAN_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2008_R2_SP3_STANDARD);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_FULL_HYPERV);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP2_ENTERPRISE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2019_CHINESE_TRADITIONAL_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_CORE_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_CORE_CONTAINERSLATEST);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2008_SP2_ENGLISH_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_FRENCH_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_POLISH_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2012_SP4_EXPRESS);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2014_SP3_STANDARD);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_2012_SP4_STANDARD);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_CORE_CONTAINERSLATEST);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2016_SP2_EXPRESS);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2019_TURKISH_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2014_SP2_EXPRESS);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2014_SP3_WEB);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP1_WEB);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_PORTUGESE_BRAZIL_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_PORTUGESE_PORTUGAL_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_SWEDISH_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP1_EXPRESS);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_ITALIAN_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_SPANISH_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2017_STANDARD);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2003_R2_SP2_LANGUAGE_PACKS_64BIT_SQL_2005_SP4_STANDARD);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_JAPANESE_64BIT_SQL_2008_R2_SP3_STANDARD);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP1_STANDARD);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2007_R2_SP3_WEB);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2014_SP2_WEB);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP2_ENTERPRISE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_PORTUGESE_BRAZIL_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2003_R2_SP2_ENGLISH_32BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_CZECH_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP1_STANDARD);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2014_SP2_EXPRESS);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2012_SP4_STANDARD);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP1_ENTERPRISE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP1_WEB);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_SWEDISH_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_TURKISH_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_CORE_SQL_2012_SP4_STANDARD);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_LANGUAGE_PACKS_64BIT_SQL_2008_R2_SP3_STANDARD);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_RTM_CZECH_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_RTM_TURKISH_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_DUTCH_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP2_EXPRESS);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2017_ENTERPRISE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_HUNGARIAN_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_KOREAN_FULL_SQL_2016_SP1_STANDARD);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2019_SPANISH_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2003_R2_SP2_ENGLISH_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_LANGUAGE_PACKS_64BIT_SQL_2008_R2_SP3_EXPRESS);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_SP2_PORTUGESE_BRAZIL_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP1_WEB);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2014_SP3_EXPRESS);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP2_ENTERPRISE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_FULL_CONTAINERSLATEST);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2017_ENTERPRISE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_1709_ENGLISH_CORE_CONTAINERSLATEST);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_1803_ENGLISH_CORE_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_SQL_2012_SP4_WEB);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_JAPANESE_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2008_SP2_ENGLISH_64BIT_SQL_2008_SP4_STANDARD);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_RTM_PORTUGESE_BRAZIL_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP1_WEB);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_P3);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP1_ENTERPRISE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2003_R2_SP2_LANGUAGE_PACKS_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_CHINESE_TRADITIONAL_HONG_KONG_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2014_SP3_EXPRESS);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP2_ENTERPRISE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_RTM_CHINESE_SIMPLIFIED_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2012_SP4_WEB);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2014_SP3_WEB);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_JAPANESE_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP1_EXPRESS);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_1803_ENGLISH_CORE_CONTAINERSLATEST);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_JAPANESE_64BIT_SQL_2012_SP4_STANDARD);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_CORE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2014_SP2_WEB);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2014_SP3_ENTERPRISE);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP2_STANDARD);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_2014_SP3_WEB);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_RTM_SWEDISH_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_CHINESE_SIMPLIFIED_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2019_POLISH_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_JAPANESE_64BIT_SQL_2008_R2_SP3_WEB);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_PORTUGESE_BRAZIL_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP1_ENTERPRISE);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2016_SP2_EXPRESS);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2014_SP3_EXPRESS);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2014_SP2_STANDARD);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_CORE_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2017_WEB);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2019_GERMAN_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2003_R2_SP2_ENGLISH_64BIT_SQL_2005_SP4_STANDARD);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_SQL_2012_SP4_ENTERPRISE);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_JAPANESE_64BIT_SQL_2008_R2_SP3_EXPRESS);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP1_ENTERPRISE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2014_SP2_WEB);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2008_R2_SP3_EXPRESS);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_FRENCH_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP2_ENTERPRISE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2019_CZECH_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_1809_ENGLISH_CORE_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_1809_ENGLISH_CORE_CONTAINERSLATEST);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2003_R2_SP2_LANGUAGE_PACKS_64BIT_SQL_2005_SP4_EXPRESS);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_TURKISH_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2012_SP4_WEB);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_RTM_POLISH_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_RTM_SPANISH_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP1_ENTERPRISE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP2_EXPRESS);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2016_SP2_ENTERPRISE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_1709_ENGLISH_CORE_BASE);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_ENGLISH_61BIT_SQL_2012_RTM_SP2_ENTERPRISE);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_SQL_2012_SP4_STANDARD);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2008_SP2_PORTUGESE_BRAZIL_32BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2014_SP2_STANDARD);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2012_SP4_EXPRESS);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_RTM_PORTUGESE_PORTUGAL_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_CZECH_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP1_STANDARD);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2019_DUTCH_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_CORE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP2_WEB);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_KOREAN_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_RTM_DUTCH_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_64BIT_SQL_2012_SP4_ENTERPRISE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP1_STANDARD);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP2_EXPRESS);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP2_WEB);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2017_STANDARD);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2019_PORTUGESE_BRAZIL_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_SQL_2008_R2_SP3_STANDARD);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_SHAREPOINT_2010_SP2_FOUNDATION);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_P3);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2014_SP3_STANDARD);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_SPANISH_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum,
				WindowsVersion.WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2014_SP3_EXPRESS);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP2_STANDARD);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP2_STANDARD);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2019_PORTUGESE_PORTUGAL_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2019_SWEDISH_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_HYPERV);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_RTM_KOREAN_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2012_RTM_RUSSIAN_64BIT_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_CHINESE_TRADITIONAL_FULL_BASE);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP2_WEB);
		addEEnumLiteral(windowsVersionEEnum, WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2017_EXPRESS);

		initEEnum(defaultInstanceTenancyEEnum, DefaultInstanceTenancy.class, "DefaultInstanceTenancy");
		addEEnumLiteral(defaultInstanceTenancyEEnum, DefaultInstanceTenancy.DEFAULT);
		addEEnumLiteral(defaultInstanceTenancyEEnum, DefaultInstanceTenancy.DEDICATED);

		initEEnum(routerTypeEEnum, RouterType.class, "RouterType");
		addEEnumLiteral(routerTypeEEnum, RouterType.EGRESS_ONLY_INTERNET_GATEWAY);
		addEEnumLiteral(routerTypeEEnum, RouterType.GATEWAY);
		addEEnumLiteral(routerTypeEEnum, RouterType.INSTANCE);
		addEEnumLiteral(routerTypeEEnum, RouterType.NAT_GATEWAY);
		addEEnumLiteral(routerTypeEEnum, RouterType.NETWORK_INTERFACE);
		addEEnumLiteral(routerTypeEEnum, RouterType.VPC_PEERING_CONNECTION);

		initEEnum(flowLogTrafficTypeEEnum, FlowLogTrafficType.class, "FlowLogTrafficType");
		addEEnumLiteral(flowLogTrafficTypeEEnum, FlowLogTrafficType.ACCEPT);
		addEEnumLiteral(flowLogTrafficTypeEEnum, FlowLogTrafficType.ALL);
		addEEnumLiteral(flowLogTrafficTypeEEnum, FlowLogTrafficType.REJECT);

		initEEnum(amazonLinuxVirtEEnum, AmazonLinuxVirt.class, "AmazonLinuxVirt");
		addEEnumLiteral(amazonLinuxVirtEEnum, AmazonLinuxVirt.HVM);
		addEEnumLiteral(amazonLinuxVirtEEnum, AmazonLinuxVirt.PV);

		initEEnum(ebsDeviceVolumeTypeEEnum, EbsDeviceVolumeType.class, "EbsDeviceVolumeType");
		addEEnumLiteral(ebsDeviceVolumeTypeEEnum, EbsDeviceVolumeType.STANDARD);
		addEEnumLiteral(ebsDeviceVolumeTypeEEnum, EbsDeviceVolumeType.IO1);
		addEEnumLiteral(ebsDeviceVolumeTypeEEnum, EbsDeviceVolumeType.GP2);
		addEEnumLiteral(ebsDeviceVolumeTypeEEnum, EbsDeviceVolumeType.ST1);
		addEEnumLiteral(ebsDeviceVolumeTypeEEnum, EbsDeviceVolumeType.SC1);

		initEEnum(flowLogDestinationTypeEEnum, FlowLogDestinationType.class, "FlowLogDestinationType");
		addEEnumLiteral(flowLogDestinationTypeEEnum, FlowLogDestinationType.CLOUD_WATCH_LOGS);
		addEEnumLiteral(flowLogDestinationTypeEEnum, FlowLogDestinationType.S3);

		initEEnum(vpnConnectionTypeEEnum, VpnConnectionType.class, "VpnConnectionType");
		addEEnumLiteral(vpnConnectionTypeEEnum, VpnConnectionType.IPSEC_1);
		addEEnumLiteral(vpnConnectionTypeEEnum, VpnConnectionType.DUMMY);

		initEEnum(protocolEEnum, Protocol.class, "Protocol");
		addEEnumLiteral(protocolEEnum, Protocol.ALL);
		addEEnumLiteral(protocolEEnum, Protocol.TCP);
		addEEnumLiteral(protocolEEnum, Protocol.UDP);
		addEEnumLiteral(protocolEEnum, Protocol.ICMP);
		addEEnumLiteral(protocolEEnum, Protocol.ICMPV6);

		initEEnum(trafficDirectionEEnum, TrafficDirection.class, "TrafficDirection");
		addEEnumLiteral(trafficDirectionEEnum, TrafficDirection.EGRESS);
		addEEnumLiteral(trafficDirectionEEnum, TrafficDirection.INGRESS);

		// Create resource
		createResource(eNS_URI);
	}

} //Ec2PackageImpl
