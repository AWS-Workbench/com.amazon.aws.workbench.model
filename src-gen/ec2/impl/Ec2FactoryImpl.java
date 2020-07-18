/**
 */
package ec2.impl;

import ec2.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ec2FactoryImpl extends EFactoryImpl implements Ec2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Ec2Factory init() {
		try {
			Ec2Factory theEc2Factory = (Ec2Factory) EPackage.Registry.INSTANCE.getEFactory(Ec2Package.eNS_URI);
			if (theEc2Factory != null) {
				return theEc2Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Ec2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ec2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Ec2Package.GENERIC_LINUX_IMAGE_BUILDER_EC2:
			return createGenericLinuxImageBuilder_ec2();
		case Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2:
			return createAclTrafficConfigBuilder_ec2();
		case Ec2Package.GENERIC_WINDOWS_IMAGE_BUILDER_EC2:
			return createGenericWindowsImageBuilder_ec2();
		case Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2:
			return createInterfaceVpcEndpointAttributesBuilder_ec2();
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2:
			return createVpcAttributesBuilder_ec2();
		case Ec2Package.EXECUTE_FILE_OPTIONS_BUILDER_EC2:
			return createExecuteFileOptionsBuilder_ec2();
		case Ec2Package.EBS_DEVICE_OPTIONS_BUILDER_EC2:
			return createEbsDeviceOptionsBuilder_ec2();
		case Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2:
			return createEnableVpnGatewayOptionsBuilder_ec2();
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2:
			return createVpcLookupOptionsBuilder_ec2();
		case Ec2Package.INSTANCE_BUILDER_EC2:
			return createInstanceBuilder_ec2();
		case Ec2Package.SUBNET_SELECTION_BUILDER_EC2:
			return createSubnetSelectionBuilder_ec2();
		case Ec2Package.SECURITY_GROUP_PROPS_BUILDER_EC2:
			return createSecurityGroupPropsBuilder_ec2();
		case Ec2Package.ACL_PORT_RANGE_BUILDER_EC2:
			return createAclPortRangeBuilder_ec2();
		case Ec2Package.GENERIC_WINDOWS_IMAGE_PROPS_BUILDER_EC2:
			return createGenericWindowsImagePropsBuilder_ec2();
		case Ec2Package.VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2:
			return createVpcEndpointServicePropsBuilder_ec2();
		case Ec2Package.WINDOWS_IMAGE_BUILDER_EC2:
			return createWindowsImageBuilder_ec2();
		case Ec2Package.FLOW_LOG_OPTIONS_BUILDER_EC2:
			return createFlowLogOptionsBuilder_ec2();
		case Ec2Package.PRIVATE_SUBNET_BUILDER_EC2:
			return createPrivateSubnetBuilder_ec2();
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2:
			return createBastionHostLinuxBuilder_ec2();
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2:
			return createSelectedSubnetsBuilder_ec2();
		case Ec2Package.VPN_GATEWAY_PROPS_BUILDER_EC2:
			return createVpnGatewayPropsBuilder_ec2();
		case Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2:
			return createSubnetConfigurationBuilder_ec2();
		case Ec2Package.VPN_TUNNEL_OPTION_BUILDER_EC2:
			return createVpnTunnelOptionBuilder_ec2();
		case Ec2Package.ACL_CIDR_CONFIG_BUILDER_EC2:
			return createAclCidrConfigBuilder_ec2();
		case Ec2Package.PUBLIC_SUBNET_PROPS_BUILDER_EC2:
			return createPublicSubnetPropsBuilder_ec2();
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2:
			return createNatInstanceProviderBuilder_ec2();
		case Ec2Package.GATEWAY_CONFIG_BUILDER_EC2:
			return createGatewayConfigBuilder_ec2();
		case Ec2Package.GENERIC_LINUX_IMAGE_PROPS_BUILDER_EC2:
			return createGenericLinuxImagePropsBuilder_ec2();
		case Ec2Package.VPC_PROPS_BUILDER_EC2:
			return createVpcPropsBuilder_ec2();
		case Ec2Package.BASTION_HOST_LINUX_PROPS_BUILDER_EC2:
			return createBastionHostLinuxPropsBuilder_ec2();
		case Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2:
			return createSubnetNetworkAclAssociationPropsBuilder_ec2();
		case Ec2Package.VPN_GATEWAY_BUILDER_EC2:
			return createVpnGatewayBuilder_ec2();
		case Ec2Package.AMAZON_LINUX_IMAGE_BUILDER_EC2:
			return createAmazonLinuxImageBuilder_ec2();
		case Ec2Package.FLOW_LOG_PROPS_BUILDER_EC2:
			return createFlowLogPropsBuilder_ec2();
		case Ec2Package.INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2:
			return createInterfaceVpcEndpointPropsBuilder_ec2();
		case Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2:
			return createVpnConnectionOptionsBuilder_ec2();
		case Ec2Package.PORT_BUILDER_EC2:
			return createPortBuilder_ec2();
		case Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2:
			return createFlowLogDestinationConfigBuilder_ec2();
		case Ec2Package.AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2:
			return createAmazonLinuxImagePropsBuilder_ec2();
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2:
			return createLookupMachineImagePropsBuilder_ec2();
		case Ec2Package.EBS_DEVICE_SNAPSHOT_OPTIONS_BUILDER_EC2:
			return createEbsDeviceSnapshotOptionsBuilder_ec2();
		case Ec2Package.VPN_CONNECTION_PROPS_BUILDER_EC2:
			return createVpnConnectionPropsBuilder_ec2();
		case Ec2Package.VPN_CONNECTION_BUILDER_EC2:
			return createVpnConnectionBuilder_ec2();
		case Ec2Package.BLOCK_DEVICE_BUILDER_EC2:
			return createBlockDeviceBuilder_ec2();
		case Ec2Package.EBS_DEVICE_PROPS_BUILDER_EC2:
			return createEbsDevicePropsBuilder_ec2();
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2:
			return createNetworkAclEntryPropsBuilder_ec2();
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2:
			return createAddRouteOptionsBuilder_ec2();
		case Ec2Package.PUBLIC_SUBNET_BUILDER_EC2:
			return createPublicSubnetBuilder_ec2();
		case Ec2Package.INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2:
			return createInterfaceVpcEndpointOptionsBuilder_ec2();
		case Ec2Package.LINUX_USER_DATA_OPTIONS_BUILDER_EC2:
			return createLinuxUserDataOptionsBuilder_ec2();
		case Ec2Package.NETWORK_ACL_PROPS_BUILDER_EC2:
			return createNetworkAclPropsBuilder_ec2();
		case Ec2Package.PUBLIC_SUBNET_ATTRIBUTES_BUILDER_EC2:
			return createPublicSubnetAttributesBuilder_ec2();
		case Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2:
			return createS3DownloadOptionsBuilder_ec2();
		case Ec2Package.FLOW_LOG_BUILDER_EC2:
			return createFlowLogBuilder_ec2();
		case Ec2Package.CONNECTIONS_BUILDER_EC2:
			return createConnectionsBuilder_ec2();
		case Ec2Package.VPC_BUILDER_EC2:
			return createVpcBuilder_ec2();
		case Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2:
			return createVpcEndpointServiceBuilder_ec2();
		case Ec2Package.CONNECTION_RULE_BUILDER_EC2:
			return createConnectionRuleBuilder_ec2();
		case Ec2Package.SUBNET_PROPS_BUILDER_EC2:
			return createSubnetPropsBuilder_ec2();
		case Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_BUILDER_EC2:
			return createSubnetNetworkAclAssociationBuilder_ec2();
		case Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2:
			return createMachineImageConfigBuilder_ec2();
		case Ec2Package.WINDOWS_IMAGE_PROPS_BUILDER_EC2:
			return createWindowsImagePropsBuilder_ec2();
		case Ec2Package.INSTANCE_PROPS_BUILDER_EC2:
			return createInstancePropsBuilder_ec2();
		case Ec2Package.NAT_INSTANCE_PROPS_BUILDER_EC2:
			return createNatInstancePropsBuilder_ec2();
		case Ec2Package.PRIVATE_SUBNET_PROPS_BUILDER_EC2:
			return createPrivateSubnetPropsBuilder_ec2();
		case Ec2Package.PRIVATE_SUBNET_ATTRIBUTES_BUILDER_EC2:
			return createPrivateSubnetAttributesBuilder_ec2();
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2:
			return createInterfaceVpcEndpointBuilder_ec2();
		case Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2:
			return createConfigureNatOptionsBuilder_ec2();
		case Ec2Package.SUBNET_BUILDER_EC2:
			return createSubnetBuilder_ec2();
		case Ec2Package.ACL_ICMP_BUILDER_EC2:
			return createAclIcmpBuilder_ec2();
		case Ec2Package.NETWORK_ACL_BUILDER_EC2:
			return createNetworkAclBuilder_ec2();
		case Ec2Package.COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2:
			return createCommonNetworkAclEntryOptionsBuilder_ec2();
		case Ec2Package.GATEWAY_VPC_ENDPOINT_OPTIONS_BUILDER_EC2:
			return createGatewayVpcEndpointOptionsBuilder_ec2();
		case Ec2Package.LOOKUP_MACHINE_IMAGE_BUILDER_EC2:
			return createLookupMachineImageBuilder_ec2();
		case Ec2Package.PORT_PROPS_BUILDER_EC2:
			return createPortPropsBuilder_ec2();
		case Ec2Package.SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2:
			return createSecurityGroupImportOptionsBuilder_ec2();
		case Ec2Package.CONNECTIONS_PROPS_BUILDER_EC2:
			return createConnectionsPropsBuilder_ec2();
		case Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2:
			return createEbsDeviceOptionsBaseBuilder_ec2();
		case Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2:
			return createSubnetAttributesBuilder_ec2();
		case Ec2Package.SECURITY_GROUP_BUILDER_EC2:
			return createSecurityGroupBuilder_ec2();
		case Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2:
			return createGatewayVpcEndpointBuilder_ec2();
		case Ec2Package.NETWORK_ACL_ENTRY_BUILDER_EC2:
			return createNetworkAclEntryBuilder_ec2();
		case Ec2Package.GATEWAY_VPC_ENDPOINT_PROPS_BUILDER_EC2:
			return createGatewayVpcEndpointPropsBuilder_ec2();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case Ec2Package.INSTANCE_SIZE:
			return createInstanceSizeFromString(eDataType, initialValue);
		case Ec2Package.VPC_ENDPOINT_TYPE:
			return createVpcEndpointTypeFromString(eDataType, initialValue);
		case Ec2Package.OPERATING_SYSTEM_TYPE:
			return createOperatingSystemTypeFromString(eDataType, initialValue);
		case Ec2Package.AMAZON_LINUX_GENERATION:
			return createAmazonLinuxGenerationFromString(eDataType, initialValue);
		case Ec2Package.AMAZON_LINUX_STORAGE:
			return createAmazonLinuxStorageFromString(eDataType, initialValue);
		case Ec2Package.SUBNET_TYPE:
			return createSubnetTypeFromString(eDataType, initialValue);
		case Ec2Package.AMAZON_LINUX_EDITION:
			return createAmazonLinuxEditionFromString(eDataType, initialValue);
		case Ec2Package.INSTANCE_CLASS:
			return createInstanceClassFromString(eDataType, initialValue);
		case Ec2Package.ACTION:
			return createActionFromString(eDataType, initialValue);
		case Ec2Package.WINDOWS_VERSION:
			return createWindowsVersionFromString(eDataType, initialValue);
		case Ec2Package.DEFAULT_INSTANCE_TENANCY:
			return createDefaultInstanceTenancyFromString(eDataType, initialValue);
		case Ec2Package.ROUTER_TYPE:
			return createRouterTypeFromString(eDataType, initialValue);
		case Ec2Package.FLOW_LOG_TRAFFIC_TYPE:
			return createFlowLogTrafficTypeFromString(eDataType, initialValue);
		case Ec2Package.AMAZON_LINUX_VIRT:
			return createAmazonLinuxVirtFromString(eDataType, initialValue);
		case Ec2Package.EBS_DEVICE_VOLUME_TYPE:
			return createEbsDeviceVolumeTypeFromString(eDataType, initialValue);
		case Ec2Package.FLOW_LOG_DESTINATION_TYPE:
			return createFlowLogDestinationTypeFromString(eDataType, initialValue);
		case Ec2Package.VPN_CONNECTION_TYPE:
			return createVpnConnectionTypeFromString(eDataType, initialValue);
		case Ec2Package.PROTOCOL:
			return createProtocolFromString(eDataType, initialValue);
		case Ec2Package.TRAFFIC_DIRECTION:
			return createTrafficDirectionFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case Ec2Package.INSTANCE_SIZE:
			return convertInstanceSizeToString(eDataType, instanceValue);
		case Ec2Package.VPC_ENDPOINT_TYPE:
			return convertVpcEndpointTypeToString(eDataType, instanceValue);
		case Ec2Package.OPERATING_SYSTEM_TYPE:
			return convertOperatingSystemTypeToString(eDataType, instanceValue);
		case Ec2Package.AMAZON_LINUX_GENERATION:
			return convertAmazonLinuxGenerationToString(eDataType, instanceValue);
		case Ec2Package.AMAZON_LINUX_STORAGE:
			return convertAmazonLinuxStorageToString(eDataType, instanceValue);
		case Ec2Package.SUBNET_TYPE:
			return convertSubnetTypeToString(eDataType, instanceValue);
		case Ec2Package.AMAZON_LINUX_EDITION:
			return convertAmazonLinuxEditionToString(eDataType, instanceValue);
		case Ec2Package.INSTANCE_CLASS:
			return convertInstanceClassToString(eDataType, instanceValue);
		case Ec2Package.ACTION:
			return convertActionToString(eDataType, instanceValue);
		case Ec2Package.WINDOWS_VERSION:
			return convertWindowsVersionToString(eDataType, instanceValue);
		case Ec2Package.DEFAULT_INSTANCE_TENANCY:
			return convertDefaultInstanceTenancyToString(eDataType, instanceValue);
		case Ec2Package.ROUTER_TYPE:
			return convertRouterTypeToString(eDataType, instanceValue);
		case Ec2Package.FLOW_LOG_TRAFFIC_TYPE:
			return convertFlowLogTrafficTypeToString(eDataType, instanceValue);
		case Ec2Package.AMAZON_LINUX_VIRT:
			return convertAmazonLinuxVirtToString(eDataType, instanceValue);
		case Ec2Package.EBS_DEVICE_VOLUME_TYPE:
			return convertEbsDeviceVolumeTypeToString(eDataType, instanceValue);
		case Ec2Package.FLOW_LOG_DESTINATION_TYPE:
			return convertFlowLogDestinationTypeToString(eDataType, instanceValue);
		case Ec2Package.VPN_CONNECTION_TYPE:
			return convertVpnConnectionTypeToString(eDataType, instanceValue);
		case Ec2Package.PROTOCOL:
			return convertProtocolToString(eDataType, instanceValue);
		case Ec2Package.TRAFFIC_DIRECTION:
			return convertTrafficDirectionToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericLinuxImageBuilder_ec2 createGenericLinuxImageBuilder_ec2() {
		GenericLinuxImageBuilder_ec2Impl genericLinuxImageBuilder_ec2 = new GenericLinuxImageBuilder_ec2Impl();
		return genericLinuxImageBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AclTrafficConfigBuilder_ec2 createAclTrafficConfigBuilder_ec2() {
		AclTrafficConfigBuilder_ec2Impl aclTrafficConfigBuilder_ec2 = new AclTrafficConfigBuilder_ec2Impl();
		return aclTrafficConfigBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericWindowsImageBuilder_ec2 createGenericWindowsImageBuilder_ec2() {
		GenericWindowsImageBuilder_ec2Impl genericWindowsImageBuilder_ec2 = new GenericWindowsImageBuilder_ec2Impl();
		return genericWindowsImageBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceVpcEndpointAttributesBuilder_ec2 createInterfaceVpcEndpointAttributesBuilder_ec2() {
		InterfaceVpcEndpointAttributesBuilder_ec2Impl interfaceVpcEndpointAttributesBuilder_ec2 = new InterfaceVpcEndpointAttributesBuilder_ec2Impl();
		return interfaceVpcEndpointAttributesBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VpcAttributesBuilder_ec2 createVpcAttributesBuilder_ec2() {
		VpcAttributesBuilder_ec2Impl vpcAttributesBuilder_ec2 = new VpcAttributesBuilder_ec2Impl();
		return vpcAttributesBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecuteFileOptionsBuilder_ec2 createExecuteFileOptionsBuilder_ec2() {
		ExecuteFileOptionsBuilder_ec2Impl executeFileOptionsBuilder_ec2 = new ExecuteFileOptionsBuilder_ec2Impl();
		return executeFileOptionsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EbsDeviceOptionsBuilder_ec2 createEbsDeviceOptionsBuilder_ec2() {
		EbsDeviceOptionsBuilder_ec2Impl ebsDeviceOptionsBuilder_ec2 = new EbsDeviceOptionsBuilder_ec2Impl();
		return ebsDeviceOptionsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnableVpnGatewayOptionsBuilder_ec2 createEnableVpnGatewayOptionsBuilder_ec2() {
		EnableVpnGatewayOptionsBuilder_ec2Impl enableVpnGatewayOptionsBuilder_ec2 = new EnableVpnGatewayOptionsBuilder_ec2Impl();
		return enableVpnGatewayOptionsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VpcLookupOptionsBuilder_ec2 createVpcLookupOptionsBuilder_ec2() {
		VpcLookupOptionsBuilder_ec2Impl vpcLookupOptionsBuilder_ec2 = new VpcLookupOptionsBuilder_ec2Impl();
		return vpcLookupOptionsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstanceBuilder_ec2 createInstanceBuilder_ec2() {
		InstanceBuilder_ec2Impl instanceBuilder_ec2 = new InstanceBuilder_ec2Impl();
		return instanceBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubnetSelectionBuilder_ec2 createSubnetSelectionBuilder_ec2() {
		SubnetSelectionBuilder_ec2Impl subnetSelectionBuilder_ec2 = new SubnetSelectionBuilder_ec2Impl();
		return subnetSelectionBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityGroupPropsBuilder_ec2 createSecurityGroupPropsBuilder_ec2() {
		SecurityGroupPropsBuilder_ec2Impl securityGroupPropsBuilder_ec2 = new SecurityGroupPropsBuilder_ec2Impl();
		return securityGroupPropsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AclPortRangeBuilder_ec2 createAclPortRangeBuilder_ec2() {
		AclPortRangeBuilder_ec2Impl aclPortRangeBuilder_ec2 = new AclPortRangeBuilder_ec2Impl();
		return aclPortRangeBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericWindowsImagePropsBuilder_ec2 createGenericWindowsImagePropsBuilder_ec2() {
		GenericWindowsImagePropsBuilder_ec2Impl genericWindowsImagePropsBuilder_ec2 = new GenericWindowsImagePropsBuilder_ec2Impl();
		return genericWindowsImagePropsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VpcEndpointServicePropsBuilder_ec2 createVpcEndpointServicePropsBuilder_ec2() {
		VpcEndpointServicePropsBuilder_ec2Impl vpcEndpointServicePropsBuilder_ec2 = new VpcEndpointServicePropsBuilder_ec2Impl();
		return vpcEndpointServicePropsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WindowsImageBuilder_ec2 createWindowsImageBuilder_ec2() {
		WindowsImageBuilder_ec2Impl windowsImageBuilder_ec2 = new WindowsImageBuilder_ec2Impl();
		return windowsImageBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlowLogOptionsBuilder_ec2 createFlowLogOptionsBuilder_ec2() {
		FlowLogOptionsBuilder_ec2Impl flowLogOptionsBuilder_ec2 = new FlowLogOptionsBuilder_ec2Impl();
		return flowLogOptionsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivateSubnetBuilder_ec2 createPrivateSubnetBuilder_ec2() {
		PrivateSubnetBuilder_ec2Impl privateSubnetBuilder_ec2 = new PrivateSubnetBuilder_ec2Impl();
		return privateSubnetBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BastionHostLinuxBuilder_ec2 createBastionHostLinuxBuilder_ec2() {
		BastionHostLinuxBuilder_ec2Impl bastionHostLinuxBuilder_ec2 = new BastionHostLinuxBuilder_ec2Impl();
		return bastionHostLinuxBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectedSubnetsBuilder_ec2 createSelectedSubnetsBuilder_ec2() {
		SelectedSubnetsBuilder_ec2Impl selectedSubnetsBuilder_ec2 = new SelectedSubnetsBuilder_ec2Impl();
		return selectedSubnetsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VpnGatewayPropsBuilder_ec2 createVpnGatewayPropsBuilder_ec2() {
		VpnGatewayPropsBuilder_ec2Impl vpnGatewayPropsBuilder_ec2 = new VpnGatewayPropsBuilder_ec2Impl();
		return vpnGatewayPropsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubnetConfigurationBuilder_ec2 createSubnetConfigurationBuilder_ec2() {
		SubnetConfigurationBuilder_ec2Impl subnetConfigurationBuilder_ec2 = new SubnetConfigurationBuilder_ec2Impl();
		return subnetConfigurationBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VpnTunnelOptionBuilder_ec2 createVpnTunnelOptionBuilder_ec2() {
		VpnTunnelOptionBuilder_ec2Impl vpnTunnelOptionBuilder_ec2 = new VpnTunnelOptionBuilder_ec2Impl();
		return vpnTunnelOptionBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AclCidrConfigBuilder_ec2 createAclCidrConfigBuilder_ec2() {
		AclCidrConfigBuilder_ec2Impl aclCidrConfigBuilder_ec2 = new AclCidrConfigBuilder_ec2Impl();
		return aclCidrConfigBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicSubnetPropsBuilder_ec2 createPublicSubnetPropsBuilder_ec2() {
		PublicSubnetPropsBuilder_ec2Impl publicSubnetPropsBuilder_ec2 = new PublicSubnetPropsBuilder_ec2Impl();
		return publicSubnetPropsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NatInstanceProviderBuilder_ec2 createNatInstanceProviderBuilder_ec2() {
		NatInstanceProviderBuilder_ec2Impl natInstanceProviderBuilder_ec2 = new NatInstanceProviderBuilder_ec2Impl();
		return natInstanceProviderBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GatewayConfigBuilder_ec2 createGatewayConfigBuilder_ec2() {
		GatewayConfigBuilder_ec2Impl gatewayConfigBuilder_ec2 = new GatewayConfigBuilder_ec2Impl();
		return gatewayConfigBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericLinuxImagePropsBuilder_ec2 createGenericLinuxImagePropsBuilder_ec2() {
		GenericLinuxImagePropsBuilder_ec2Impl genericLinuxImagePropsBuilder_ec2 = new GenericLinuxImagePropsBuilder_ec2Impl();
		return genericLinuxImagePropsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VpcPropsBuilder_ec2 createVpcPropsBuilder_ec2() {
		VpcPropsBuilder_ec2Impl vpcPropsBuilder_ec2 = new VpcPropsBuilder_ec2Impl();
		return vpcPropsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BastionHostLinuxPropsBuilder_ec2 createBastionHostLinuxPropsBuilder_ec2() {
		BastionHostLinuxPropsBuilder_ec2Impl bastionHostLinuxPropsBuilder_ec2 = new BastionHostLinuxPropsBuilder_ec2Impl();
		return bastionHostLinuxPropsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubnetNetworkAclAssociationPropsBuilder_ec2 createSubnetNetworkAclAssociationPropsBuilder_ec2() {
		SubnetNetworkAclAssociationPropsBuilder_ec2Impl subnetNetworkAclAssociationPropsBuilder_ec2 = new SubnetNetworkAclAssociationPropsBuilder_ec2Impl();
		return subnetNetworkAclAssociationPropsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VpnGatewayBuilder_ec2 createVpnGatewayBuilder_ec2() {
		VpnGatewayBuilder_ec2Impl vpnGatewayBuilder_ec2 = new VpnGatewayBuilder_ec2Impl();
		return vpnGatewayBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AmazonLinuxImageBuilder_ec2 createAmazonLinuxImageBuilder_ec2() {
		AmazonLinuxImageBuilder_ec2Impl amazonLinuxImageBuilder_ec2 = new AmazonLinuxImageBuilder_ec2Impl();
		return amazonLinuxImageBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlowLogPropsBuilder_ec2 createFlowLogPropsBuilder_ec2() {
		FlowLogPropsBuilder_ec2Impl flowLogPropsBuilder_ec2 = new FlowLogPropsBuilder_ec2Impl();
		return flowLogPropsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceVpcEndpointPropsBuilder_ec2 createInterfaceVpcEndpointPropsBuilder_ec2() {
		InterfaceVpcEndpointPropsBuilder_ec2Impl interfaceVpcEndpointPropsBuilder_ec2 = new InterfaceVpcEndpointPropsBuilder_ec2Impl();
		return interfaceVpcEndpointPropsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VpnConnectionOptionsBuilder_ec2 createVpnConnectionOptionsBuilder_ec2() {
		VpnConnectionOptionsBuilder_ec2Impl vpnConnectionOptionsBuilder_ec2 = new VpnConnectionOptionsBuilder_ec2Impl();
		return vpnConnectionOptionsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortBuilder_ec2 createPortBuilder_ec2() {
		PortBuilder_ec2Impl portBuilder_ec2 = new PortBuilder_ec2Impl();
		return portBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlowLogDestinationConfigBuilder_ec2 createFlowLogDestinationConfigBuilder_ec2() {
		FlowLogDestinationConfigBuilder_ec2Impl flowLogDestinationConfigBuilder_ec2 = new FlowLogDestinationConfigBuilder_ec2Impl();
		return flowLogDestinationConfigBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AmazonLinuxImagePropsBuilder_ec2 createAmazonLinuxImagePropsBuilder_ec2() {
		AmazonLinuxImagePropsBuilder_ec2Impl amazonLinuxImagePropsBuilder_ec2 = new AmazonLinuxImagePropsBuilder_ec2Impl();
		return amazonLinuxImagePropsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LookupMachineImagePropsBuilder_ec2 createLookupMachineImagePropsBuilder_ec2() {
		LookupMachineImagePropsBuilder_ec2Impl lookupMachineImagePropsBuilder_ec2 = new LookupMachineImagePropsBuilder_ec2Impl();
		return lookupMachineImagePropsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EbsDeviceSnapshotOptionsBuilder_ec2 createEbsDeviceSnapshotOptionsBuilder_ec2() {
		EbsDeviceSnapshotOptionsBuilder_ec2Impl ebsDeviceSnapshotOptionsBuilder_ec2 = new EbsDeviceSnapshotOptionsBuilder_ec2Impl();
		return ebsDeviceSnapshotOptionsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VpnConnectionPropsBuilder_ec2 createVpnConnectionPropsBuilder_ec2() {
		VpnConnectionPropsBuilder_ec2Impl vpnConnectionPropsBuilder_ec2 = new VpnConnectionPropsBuilder_ec2Impl();
		return vpnConnectionPropsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VpnConnectionBuilder_ec2 createVpnConnectionBuilder_ec2() {
		VpnConnectionBuilder_ec2Impl vpnConnectionBuilder_ec2 = new VpnConnectionBuilder_ec2Impl();
		return vpnConnectionBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockDeviceBuilder_ec2 createBlockDeviceBuilder_ec2() {
		BlockDeviceBuilder_ec2Impl blockDeviceBuilder_ec2 = new BlockDeviceBuilder_ec2Impl();
		return blockDeviceBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EbsDevicePropsBuilder_ec2 createEbsDevicePropsBuilder_ec2() {
		EbsDevicePropsBuilder_ec2Impl ebsDevicePropsBuilder_ec2 = new EbsDevicePropsBuilder_ec2Impl();
		return ebsDevicePropsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkAclEntryPropsBuilder_ec2 createNetworkAclEntryPropsBuilder_ec2() {
		NetworkAclEntryPropsBuilder_ec2Impl networkAclEntryPropsBuilder_ec2 = new NetworkAclEntryPropsBuilder_ec2Impl();
		return networkAclEntryPropsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddRouteOptionsBuilder_ec2 createAddRouteOptionsBuilder_ec2() {
		AddRouteOptionsBuilder_ec2Impl addRouteOptionsBuilder_ec2 = new AddRouteOptionsBuilder_ec2Impl();
		return addRouteOptionsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicSubnetBuilder_ec2 createPublicSubnetBuilder_ec2() {
		PublicSubnetBuilder_ec2Impl publicSubnetBuilder_ec2 = new PublicSubnetBuilder_ec2Impl();
		return publicSubnetBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceVpcEndpointOptionsBuilder_ec2 createInterfaceVpcEndpointOptionsBuilder_ec2() {
		InterfaceVpcEndpointOptionsBuilder_ec2Impl interfaceVpcEndpointOptionsBuilder_ec2 = new InterfaceVpcEndpointOptionsBuilder_ec2Impl();
		return interfaceVpcEndpointOptionsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinuxUserDataOptionsBuilder_ec2 createLinuxUserDataOptionsBuilder_ec2() {
		LinuxUserDataOptionsBuilder_ec2Impl linuxUserDataOptionsBuilder_ec2 = new LinuxUserDataOptionsBuilder_ec2Impl();
		return linuxUserDataOptionsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkAclPropsBuilder_ec2 createNetworkAclPropsBuilder_ec2() {
		NetworkAclPropsBuilder_ec2Impl networkAclPropsBuilder_ec2 = new NetworkAclPropsBuilder_ec2Impl();
		return networkAclPropsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicSubnetAttributesBuilder_ec2 createPublicSubnetAttributesBuilder_ec2() {
		PublicSubnetAttributesBuilder_ec2Impl publicSubnetAttributesBuilder_ec2 = new PublicSubnetAttributesBuilder_ec2Impl();
		return publicSubnetAttributesBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public S3DownloadOptionsBuilder_ec2 createS3DownloadOptionsBuilder_ec2() {
		S3DownloadOptionsBuilder_ec2Impl s3DownloadOptionsBuilder_ec2 = new S3DownloadOptionsBuilder_ec2Impl();
		return s3DownloadOptionsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlowLogBuilder_ec2 createFlowLogBuilder_ec2() {
		FlowLogBuilder_ec2Impl flowLogBuilder_ec2 = new FlowLogBuilder_ec2Impl();
		return flowLogBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionsBuilder_ec2 createConnectionsBuilder_ec2() {
		ConnectionsBuilder_ec2Impl connectionsBuilder_ec2 = new ConnectionsBuilder_ec2Impl();
		return connectionsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VpcBuilder_ec2 createVpcBuilder_ec2() {
		VpcBuilder_ec2Impl vpcBuilder_ec2 = new VpcBuilder_ec2Impl();
		return vpcBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VpcEndpointServiceBuilder_ec2 createVpcEndpointServiceBuilder_ec2() {
		VpcEndpointServiceBuilder_ec2Impl vpcEndpointServiceBuilder_ec2 = new VpcEndpointServiceBuilder_ec2Impl();
		return vpcEndpointServiceBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionRuleBuilder_ec2 createConnectionRuleBuilder_ec2() {
		ConnectionRuleBuilder_ec2Impl connectionRuleBuilder_ec2 = new ConnectionRuleBuilder_ec2Impl();
		return connectionRuleBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubnetPropsBuilder_ec2 createSubnetPropsBuilder_ec2() {
		SubnetPropsBuilder_ec2Impl subnetPropsBuilder_ec2 = new SubnetPropsBuilder_ec2Impl();
		return subnetPropsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubnetNetworkAclAssociationBuilder_ec2 createSubnetNetworkAclAssociationBuilder_ec2() {
		SubnetNetworkAclAssociationBuilder_ec2Impl subnetNetworkAclAssociationBuilder_ec2 = new SubnetNetworkAclAssociationBuilder_ec2Impl();
		return subnetNetworkAclAssociationBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MachineImageConfigBuilder_ec2 createMachineImageConfigBuilder_ec2() {
		MachineImageConfigBuilder_ec2Impl machineImageConfigBuilder_ec2 = new MachineImageConfigBuilder_ec2Impl();
		return machineImageConfigBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WindowsImagePropsBuilder_ec2 createWindowsImagePropsBuilder_ec2() {
		WindowsImagePropsBuilder_ec2Impl windowsImagePropsBuilder_ec2 = new WindowsImagePropsBuilder_ec2Impl();
		return windowsImagePropsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstancePropsBuilder_ec2 createInstancePropsBuilder_ec2() {
		InstancePropsBuilder_ec2Impl instancePropsBuilder_ec2 = new InstancePropsBuilder_ec2Impl();
		return instancePropsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NatInstancePropsBuilder_ec2 createNatInstancePropsBuilder_ec2() {
		NatInstancePropsBuilder_ec2Impl natInstancePropsBuilder_ec2 = new NatInstancePropsBuilder_ec2Impl();
		return natInstancePropsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivateSubnetPropsBuilder_ec2 createPrivateSubnetPropsBuilder_ec2() {
		PrivateSubnetPropsBuilder_ec2Impl privateSubnetPropsBuilder_ec2 = new PrivateSubnetPropsBuilder_ec2Impl();
		return privateSubnetPropsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivateSubnetAttributesBuilder_ec2 createPrivateSubnetAttributesBuilder_ec2() {
		PrivateSubnetAttributesBuilder_ec2Impl privateSubnetAttributesBuilder_ec2 = new PrivateSubnetAttributesBuilder_ec2Impl();
		return privateSubnetAttributesBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceVpcEndpointBuilder_ec2 createInterfaceVpcEndpointBuilder_ec2() {
		InterfaceVpcEndpointBuilder_ec2Impl interfaceVpcEndpointBuilder_ec2 = new InterfaceVpcEndpointBuilder_ec2Impl();
		return interfaceVpcEndpointBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigureNatOptionsBuilder_ec2 createConfigureNatOptionsBuilder_ec2() {
		ConfigureNatOptionsBuilder_ec2Impl configureNatOptionsBuilder_ec2 = new ConfigureNatOptionsBuilder_ec2Impl();
		return configureNatOptionsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubnetBuilder_ec2 createSubnetBuilder_ec2() {
		SubnetBuilder_ec2Impl subnetBuilder_ec2 = new SubnetBuilder_ec2Impl();
		return subnetBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AclIcmpBuilder_ec2 createAclIcmpBuilder_ec2() {
		AclIcmpBuilder_ec2Impl aclIcmpBuilder_ec2 = new AclIcmpBuilder_ec2Impl();
		return aclIcmpBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkAclBuilder_ec2 createNetworkAclBuilder_ec2() {
		NetworkAclBuilder_ec2Impl networkAclBuilder_ec2 = new NetworkAclBuilder_ec2Impl();
		return networkAclBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommonNetworkAclEntryOptionsBuilder_ec2 createCommonNetworkAclEntryOptionsBuilder_ec2() {
		CommonNetworkAclEntryOptionsBuilder_ec2Impl commonNetworkAclEntryOptionsBuilder_ec2 = new CommonNetworkAclEntryOptionsBuilder_ec2Impl();
		return commonNetworkAclEntryOptionsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GatewayVpcEndpointOptionsBuilder_ec2 createGatewayVpcEndpointOptionsBuilder_ec2() {
		GatewayVpcEndpointOptionsBuilder_ec2Impl gatewayVpcEndpointOptionsBuilder_ec2 = new GatewayVpcEndpointOptionsBuilder_ec2Impl();
		return gatewayVpcEndpointOptionsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LookupMachineImageBuilder_ec2 createLookupMachineImageBuilder_ec2() {
		LookupMachineImageBuilder_ec2Impl lookupMachineImageBuilder_ec2 = new LookupMachineImageBuilder_ec2Impl();
		return lookupMachineImageBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortPropsBuilder_ec2 createPortPropsBuilder_ec2() {
		PortPropsBuilder_ec2Impl portPropsBuilder_ec2 = new PortPropsBuilder_ec2Impl();
		return portPropsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityGroupImportOptionsBuilder_ec2 createSecurityGroupImportOptionsBuilder_ec2() {
		SecurityGroupImportOptionsBuilder_ec2Impl securityGroupImportOptionsBuilder_ec2 = new SecurityGroupImportOptionsBuilder_ec2Impl();
		return securityGroupImportOptionsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionsPropsBuilder_ec2 createConnectionsPropsBuilder_ec2() {
		ConnectionsPropsBuilder_ec2Impl connectionsPropsBuilder_ec2 = new ConnectionsPropsBuilder_ec2Impl();
		return connectionsPropsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EbsDeviceOptionsBaseBuilder_ec2 createEbsDeviceOptionsBaseBuilder_ec2() {
		EbsDeviceOptionsBaseBuilder_ec2Impl ebsDeviceOptionsBaseBuilder_ec2 = new EbsDeviceOptionsBaseBuilder_ec2Impl();
		return ebsDeviceOptionsBaseBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubnetAttributesBuilder_ec2 createSubnetAttributesBuilder_ec2() {
		SubnetAttributesBuilder_ec2Impl subnetAttributesBuilder_ec2 = new SubnetAttributesBuilder_ec2Impl();
		return subnetAttributesBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityGroupBuilder_ec2 createSecurityGroupBuilder_ec2() {
		SecurityGroupBuilder_ec2Impl securityGroupBuilder_ec2 = new SecurityGroupBuilder_ec2Impl();
		return securityGroupBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GatewayVpcEndpointBuilder_ec2 createGatewayVpcEndpointBuilder_ec2() {
		GatewayVpcEndpointBuilder_ec2Impl gatewayVpcEndpointBuilder_ec2 = new GatewayVpcEndpointBuilder_ec2Impl();
		return gatewayVpcEndpointBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkAclEntryBuilder_ec2 createNetworkAclEntryBuilder_ec2() {
		NetworkAclEntryBuilder_ec2Impl networkAclEntryBuilder_ec2 = new NetworkAclEntryBuilder_ec2Impl();
		return networkAclEntryBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GatewayVpcEndpointPropsBuilder_ec2 createGatewayVpcEndpointPropsBuilder_ec2() {
		GatewayVpcEndpointPropsBuilder_ec2Impl gatewayVpcEndpointPropsBuilder_ec2 = new GatewayVpcEndpointPropsBuilder_ec2Impl();
		return gatewayVpcEndpointPropsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSize createInstanceSizeFromString(EDataType eDataType, String initialValue) {
		InstanceSize result = InstanceSize.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstanceSizeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VpcEndpointType createVpcEndpointTypeFromString(EDataType eDataType, String initialValue) {
		VpcEndpointType result = VpcEndpointType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVpcEndpointTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystemType createOperatingSystemTypeFromString(EDataType eDataType, String initialValue) {
		OperatingSystemType result = OperatingSystemType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperatingSystemTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmazonLinuxGeneration createAmazonLinuxGenerationFromString(EDataType eDataType, String initialValue) {
		AmazonLinuxGeneration result = AmazonLinuxGeneration.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAmazonLinuxGenerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmazonLinuxStorage createAmazonLinuxStorageFromString(EDataType eDataType, String initialValue) {
		AmazonLinuxStorage result = AmazonLinuxStorage.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAmazonLinuxStorageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubnetType createSubnetTypeFromString(EDataType eDataType, String initialValue) {
		SubnetType result = SubnetType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubnetTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmazonLinuxEdition createAmazonLinuxEditionFromString(EDataType eDataType, String initialValue) {
		AmazonLinuxEdition result = AmazonLinuxEdition.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAmazonLinuxEditionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceClass createInstanceClassFromString(EDataType eDataType, String initialValue) {
		InstanceClass result = InstanceClass.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstanceClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createActionFromString(EDataType eDataType, String initialValue) {
		Action result = Action.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindowsVersion createWindowsVersionFromString(EDataType eDataType, String initialValue) {
		WindowsVersion result = WindowsVersion.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWindowsVersionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultInstanceTenancy createDefaultInstanceTenancyFromString(EDataType eDataType, String initialValue) {
		DefaultInstanceTenancy result = DefaultInstanceTenancy.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefaultInstanceTenancyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouterType createRouterTypeFromString(EDataType eDataType, String initialValue) {
		RouterType result = RouterType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRouterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowLogTrafficType createFlowLogTrafficTypeFromString(EDataType eDataType, String initialValue) {
		FlowLogTrafficType result = FlowLogTrafficType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlowLogTrafficTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmazonLinuxVirt createAmazonLinuxVirtFromString(EDataType eDataType, String initialValue) {
		AmazonLinuxVirt result = AmazonLinuxVirt.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAmazonLinuxVirtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EbsDeviceVolumeType createEbsDeviceVolumeTypeFromString(EDataType eDataType, String initialValue) {
		EbsDeviceVolumeType result = EbsDeviceVolumeType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEbsDeviceVolumeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowLogDestinationType createFlowLogDestinationTypeFromString(EDataType eDataType, String initialValue) {
		FlowLogDestinationType result = FlowLogDestinationType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlowLogDestinationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VpnConnectionType createVpnConnectionTypeFromString(EDataType eDataType, String initialValue) {
		VpnConnectionType result = VpnConnectionType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVpnConnectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocol createProtocolFromString(EDataType eDataType, String initialValue) {
		Protocol result = Protocol.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProtocolToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrafficDirection createTrafficDirectionFromString(EDataType eDataType, String initialValue) {
		TrafficDirection result = TrafficDirection.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTrafficDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ec2Package getEc2Package() {
		return (Ec2Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Ec2Package getPackage() {
		return Ec2Package.eINSTANCE;
	}

} //Ec2FactoryImpl
