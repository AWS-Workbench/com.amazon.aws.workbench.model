/**
 */
package ec2.util;

import ec2.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ec2.Ec2Package
 * @generated
 */
public class Ec2Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Ec2Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ec2Switch() {
		if (modelPackage == null) {
			modelPackage = Ec2Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Ec2Package.GENERIC_LINUX_IMAGE_BUILDER_EC2: {
			GenericLinuxImageBuilder_ec2 genericLinuxImageBuilder_ec2 = (GenericLinuxImageBuilder_ec2) theEObject;
			T result = caseGenericLinuxImageBuilder_ec2(genericLinuxImageBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2: {
			AclTrafficConfigBuilder_ec2 aclTrafficConfigBuilder_ec2 = (AclTrafficConfigBuilder_ec2) theEObject;
			T result = caseAclTrafficConfigBuilder_ec2(aclTrafficConfigBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.GENERIC_WINDOWS_IMAGE_BUILDER_EC2: {
			GenericWindowsImageBuilder_ec2 genericWindowsImageBuilder_ec2 = (GenericWindowsImageBuilder_ec2) theEObject;
			T result = caseGenericWindowsImageBuilder_ec2(genericWindowsImageBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2: {
			InterfaceVpcEndpointAttributesBuilder_ec2 interfaceVpcEndpointAttributesBuilder_ec2 = (InterfaceVpcEndpointAttributesBuilder_ec2) theEObject;
			T result = caseInterfaceVpcEndpointAttributesBuilder_ec2(interfaceVpcEndpointAttributesBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2: {
			VpcAttributesBuilder_ec2 vpcAttributesBuilder_ec2 = (VpcAttributesBuilder_ec2) theEObject;
			T result = caseVpcAttributesBuilder_ec2(vpcAttributesBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.EXECUTE_FILE_OPTIONS_BUILDER_EC2: {
			ExecuteFileOptionsBuilder_ec2 executeFileOptionsBuilder_ec2 = (ExecuteFileOptionsBuilder_ec2) theEObject;
			T result = caseExecuteFileOptionsBuilder_ec2(executeFileOptionsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.EBS_DEVICE_OPTIONS_BUILDER_EC2: {
			EbsDeviceOptionsBuilder_ec2 ebsDeviceOptionsBuilder_ec2 = (EbsDeviceOptionsBuilder_ec2) theEObject;
			T result = caseEbsDeviceOptionsBuilder_ec2(ebsDeviceOptionsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2: {
			EnableVpnGatewayOptionsBuilder_ec2 enableVpnGatewayOptionsBuilder_ec2 = (EnableVpnGatewayOptionsBuilder_ec2) theEObject;
			T result = caseEnableVpnGatewayOptionsBuilder_ec2(enableVpnGatewayOptionsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2: {
			VpcLookupOptionsBuilder_ec2 vpcLookupOptionsBuilder_ec2 = (VpcLookupOptionsBuilder_ec2) theEObject;
			T result = caseVpcLookupOptionsBuilder_ec2(vpcLookupOptionsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.INSTANCE_BUILDER_EC2: {
			InstanceBuilder_ec2 instanceBuilder_ec2 = (InstanceBuilder_ec2) theEObject;
			T result = caseInstanceBuilder_ec2(instanceBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.SUBNET_SELECTION_BUILDER_EC2: {
			SubnetSelectionBuilder_ec2 subnetSelectionBuilder_ec2 = (SubnetSelectionBuilder_ec2) theEObject;
			T result = caseSubnetSelectionBuilder_ec2(subnetSelectionBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.SECURITY_GROUP_PROPS_BUILDER_EC2: {
			SecurityGroupPropsBuilder_ec2 securityGroupPropsBuilder_ec2 = (SecurityGroupPropsBuilder_ec2) theEObject;
			T result = caseSecurityGroupPropsBuilder_ec2(securityGroupPropsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.ACL_PORT_RANGE_BUILDER_EC2: {
			AclPortRangeBuilder_ec2 aclPortRangeBuilder_ec2 = (AclPortRangeBuilder_ec2) theEObject;
			T result = caseAclPortRangeBuilder_ec2(aclPortRangeBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.GENERIC_WINDOWS_IMAGE_PROPS_BUILDER_EC2: {
			GenericWindowsImagePropsBuilder_ec2 genericWindowsImagePropsBuilder_ec2 = (GenericWindowsImagePropsBuilder_ec2) theEObject;
			T result = caseGenericWindowsImagePropsBuilder_ec2(genericWindowsImagePropsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2: {
			VpcEndpointServicePropsBuilder_ec2 vpcEndpointServicePropsBuilder_ec2 = (VpcEndpointServicePropsBuilder_ec2) theEObject;
			T result = caseVpcEndpointServicePropsBuilder_ec2(vpcEndpointServicePropsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.WINDOWS_IMAGE_BUILDER_EC2: {
			WindowsImageBuilder_ec2 windowsImageBuilder_ec2 = (WindowsImageBuilder_ec2) theEObject;
			T result = caseWindowsImageBuilder_ec2(windowsImageBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.FLOW_LOG_OPTIONS_BUILDER_EC2: {
			FlowLogOptionsBuilder_ec2 flowLogOptionsBuilder_ec2 = (FlowLogOptionsBuilder_ec2) theEObject;
			T result = caseFlowLogOptionsBuilder_ec2(flowLogOptionsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.PRIVATE_SUBNET_BUILDER_EC2: {
			PrivateSubnetBuilder_ec2 privateSubnetBuilder_ec2 = (PrivateSubnetBuilder_ec2) theEObject;
			T result = casePrivateSubnetBuilder_ec2(privateSubnetBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2: {
			BastionHostLinuxBuilder_ec2 bastionHostLinuxBuilder_ec2 = (BastionHostLinuxBuilder_ec2) theEObject;
			T result = caseBastionHostLinuxBuilder_ec2(bastionHostLinuxBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2: {
			SelectedSubnetsBuilder_ec2 selectedSubnetsBuilder_ec2 = (SelectedSubnetsBuilder_ec2) theEObject;
			T result = caseSelectedSubnetsBuilder_ec2(selectedSubnetsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.VPN_GATEWAY_PROPS_BUILDER_EC2: {
			VpnGatewayPropsBuilder_ec2 vpnGatewayPropsBuilder_ec2 = (VpnGatewayPropsBuilder_ec2) theEObject;
			T result = caseVpnGatewayPropsBuilder_ec2(vpnGatewayPropsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2: {
			SubnetConfigurationBuilder_ec2 subnetConfigurationBuilder_ec2 = (SubnetConfigurationBuilder_ec2) theEObject;
			T result = caseSubnetConfigurationBuilder_ec2(subnetConfigurationBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.VPN_TUNNEL_OPTION_BUILDER_EC2: {
			VpnTunnelOptionBuilder_ec2 vpnTunnelOptionBuilder_ec2 = (VpnTunnelOptionBuilder_ec2) theEObject;
			T result = caseVpnTunnelOptionBuilder_ec2(vpnTunnelOptionBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.ACL_CIDR_CONFIG_BUILDER_EC2: {
			AclCidrConfigBuilder_ec2 aclCidrConfigBuilder_ec2 = (AclCidrConfigBuilder_ec2) theEObject;
			T result = caseAclCidrConfigBuilder_ec2(aclCidrConfigBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.PUBLIC_SUBNET_PROPS_BUILDER_EC2: {
			PublicSubnetPropsBuilder_ec2 publicSubnetPropsBuilder_ec2 = (PublicSubnetPropsBuilder_ec2) theEObject;
			T result = casePublicSubnetPropsBuilder_ec2(publicSubnetPropsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2: {
			NatInstanceProviderBuilder_ec2 natInstanceProviderBuilder_ec2 = (NatInstanceProviderBuilder_ec2) theEObject;
			T result = caseNatInstanceProviderBuilder_ec2(natInstanceProviderBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.GATEWAY_CONFIG_BUILDER_EC2: {
			GatewayConfigBuilder_ec2 gatewayConfigBuilder_ec2 = (GatewayConfigBuilder_ec2) theEObject;
			T result = caseGatewayConfigBuilder_ec2(gatewayConfigBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.GENERIC_LINUX_IMAGE_PROPS_BUILDER_EC2: {
			GenericLinuxImagePropsBuilder_ec2 genericLinuxImagePropsBuilder_ec2 = (GenericLinuxImagePropsBuilder_ec2) theEObject;
			T result = caseGenericLinuxImagePropsBuilder_ec2(genericLinuxImagePropsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.VPC_PROPS_BUILDER_EC2: {
			VpcPropsBuilder_ec2 vpcPropsBuilder_ec2 = (VpcPropsBuilder_ec2) theEObject;
			T result = caseVpcPropsBuilder_ec2(vpcPropsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.BASTION_HOST_LINUX_PROPS_BUILDER_EC2: {
			BastionHostLinuxPropsBuilder_ec2 bastionHostLinuxPropsBuilder_ec2 = (BastionHostLinuxPropsBuilder_ec2) theEObject;
			T result = caseBastionHostLinuxPropsBuilder_ec2(bastionHostLinuxPropsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2: {
			SubnetNetworkAclAssociationPropsBuilder_ec2 subnetNetworkAclAssociationPropsBuilder_ec2 = (SubnetNetworkAclAssociationPropsBuilder_ec2) theEObject;
			T result = caseSubnetNetworkAclAssociationPropsBuilder_ec2(subnetNetworkAclAssociationPropsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.VPN_GATEWAY_BUILDER_EC2: {
			VpnGatewayBuilder_ec2 vpnGatewayBuilder_ec2 = (VpnGatewayBuilder_ec2) theEObject;
			T result = caseVpnGatewayBuilder_ec2(vpnGatewayBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.AMAZON_LINUX_IMAGE_BUILDER_EC2: {
			AmazonLinuxImageBuilder_ec2 amazonLinuxImageBuilder_ec2 = (AmazonLinuxImageBuilder_ec2) theEObject;
			T result = caseAmazonLinuxImageBuilder_ec2(amazonLinuxImageBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.FLOW_LOG_PROPS_BUILDER_EC2: {
			FlowLogPropsBuilder_ec2 flowLogPropsBuilder_ec2 = (FlowLogPropsBuilder_ec2) theEObject;
			T result = caseFlowLogPropsBuilder_ec2(flowLogPropsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2: {
			InterfaceVpcEndpointPropsBuilder_ec2 interfaceVpcEndpointPropsBuilder_ec2 = (InterfaceVpcEndpointPropsBuilder_ec2) theEObject;
			T result = caseInterfaceVpcEndpointPropsBuilder_ec2(interfaceVpcEndpointPropsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2: {
			VpnConnectionOptionsBuilder_ec2 vpnConnectionOptionsBuilder_ec2 = (VpnConnectionOptionsBuilder_ec2) theEObject;
			T result = caseVpnConnectionOptionsBuilder_ec2(vpnConnectionOptionsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.PORT_BUILDER_EC2: {
			PortBuilder_ec2 portBuilder_ec2 = (PortBuilder_ec2) theEObject;
			T result = casePortBuilder_ec2(portBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2: {
			FlowLogDestinationConfigBuilder_ec2 flowLogDestinationConfigBuilder_ec2 = (FlowLogDestinationConfigBuilder_ec2) theEObject;
			T result = caseFlowLogDestinationConfigBuilder_ec2(flowLogDestinationConfigBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2: {
			AmazonLinuxImagePropsBuilder_ec2 amazonLinuxImagePropsBuilder_ec2 = (AmazonLinuxImagePropsBuilder_ec2) theEObject;
			T result = caseAmazonLinuxImagePropsBuilder_ec2(amazonLinuxImagePropsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2: {
			LookupMachineImagePropsBuilder_ec2 lookupMachineImagePropsBuilder_ec2 = (LookupMachineImagePropsBuilder_ec2) theEObject;
			T result = caseLookupMachineImagePropsBuilder_ec2(lookupMachineImagePropsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.EBS_DEVICE_SNAPSHOT_OPTIONS_BUILDER_EC2: {
			EbsDeviceSnapshotOptionsBuilder_ec2 ebsDeviceSnapshotOptionsBuilder_ec2 = (EbsDeviceSnapshotOptionsBuilder_ec2) theEObject;
			T result = caseEbsDeviceSnapshotOptionsBuilder_ec2(ebsDeviceSnapshotOptionsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.VPN_CONNECTION_PROPS_BUILDER_EC2: {
			VpnConnectionPropsBuilder_ec2 vpnConnectionPropsBuilder_ec2 = (VpnConnectionPropsBuilder_ec2) theEObject;
			T result = caseVpnConnectionPropsBuilder_ec2(vpnConnectionPropsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.VPN_CONNECTION_BUILDER_EC2: {
			VpnConnectionBuilder_ec2 vpnConnectionBuilder_ec2 = (VpnConnectionBuilder_ec2) theEObject;
			T result = caseVpnConnectionBuilder_ec2(vpnConnectionBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.BLOCK_DEVICE_BUILDER_EC2: {
			BlockDeviceBuilder_ec2 blockDeviceBuilder_ec2 = (BlockDeviceBuilder_ec2) theEObject;
			T result = caseBlockDeviceBuilder_ec2(blockDeviceBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.EBS_DEVICE_PROPS_BUILDER_EC2: {
			EbsDevicePropsBuilder_ec2 ebsDevicePropsBuilder_ec2 = (EbsDevicePropsBuilder_ec2) theEObject;
			T result = caseEbsDevicePropsBuilder_ec2(ebsDevicePropsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2: {
			NetworkAclEntryPropsBuilder_ec2 networkAclEntryPropsBuilder_ec2 = (NetworkAclEntryPropsBuilder_ec2) theEObject;
			T result = caseNetworkAclEntryPropsBuilder_ec2(networkAclEntryPropsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2: {
			AddRouteOptionsBuilder_ec2 addRouteOptionsBuilder_ec2 = (AddRouteOptionsBuilder_ec2) theEObject;
			T result = caseAddRouteOptionsBuilder_ec2(addRouteOptionsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.PUBLIC_SUBNET_BUILDER_EC2: {
			PublicSubnetBuilder_ec2 publicSubnetBuilder_ec2 = (PublicSubnetBuilder_ec2) theEObject;
			T result = casePublicSubnetBuilder_ec2(publicSubnetBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2: {
			InterfaceVpcEndpointOptionsBuilder_ec2 interfaceVpcEndpointOptionsBuilder_ec2 = (InterfaceVpcEndpointOptionsBuilder_ec2) theEObject;
			T result = caseInterfaceVpcEndpointOptionsBuilder_ec2(interfaceVpcEndpointOptionsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.LINUX_USER_DATA_OPTIONS_BUILDER_EC2: {
			LinuxUserDataOptionsBuilder_ec2 linuxUserDataOptionsBuilder_ec2 = (LinuxUserDataOptionsBuilder_ec2) theEObject;
			T result = caseLinuxUserDataOptionsBuilder_ec2(linuxUserDataOptionsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.NETWORK_ACL_PROPS_BUILDER_EC2: {
			NetworkAclPropsBuilder_ec2 networkAclPropsBuilder_ec2 = (NetworkAclPropsBuilder_ec2) theEObject;
			T result = caseNetworkAclPropsBuilder_ec2(networkAclPropsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.PUBLIC_SUBNET_ATTRIBUTES_BUILDER_EC2: {
			PublicSubnetAttributesBuilder_ec2 publicSubnetAttributesBuilder_ec2 = (PublicSubnetAttributesBuilder_ec2) theEObject;
			T result = casePublicSubnetAttributesBuilder_ec2(publicSubnetAttributesBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2: {
			S3DownloadOptionsBuilder_ec2 s3DownloadOptionsBuilder_ec2 = (S3DownloadOptionsBuilder_ec2) theEObject;
			T result = caseS3DownloadOptionsBuilder_ec2(s3DownloadOptionsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.FLOW_LOG_BUILDER_EC2: {
			FlowLogBuilder_ec2 flowLogBuilder_ec2 = (FlowLogBuilder_ec2) theEObject;
			T result = caseFlowLogBuilder_ec2(flowLogBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.CONNECTIONS_BUILDER_EC2: {
			ConnectionsBuilder_ec2 connectionsBuilder_ec2 = (ConnectionsBuilder_ec2) theEObject;
			T result = caseConnectionsBuilder_ec2(connectionsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.VPC_BUILDER_EC2: {
			VpcBuilder_ec2 vpcBuilder_ec2 = (VpcBuilder_ec2) theEObject;
			T result = caseVpcBuilder_ec2(vpcBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2: {
			VpcEndpointServiceBuilder_ec2 vpcEndpointServiceBuilder_ec2 = (VpcEndpointServiceBuilder_ec2) theEObject;
			T result = caseVpcEndpointServiceBuilder_ec2(vpcEndpointServiceBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.CONNECTION_RULE_BUILDER_EC2: {
			ConnectionRuleBuilder_ec2 connectionRuleBuilder_ec2 = (ConnectionRuleBuilder_ec2) theEObject;
			T result = caseConnectionRuleBuilder_ec2(connectionRuleBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.SUBNET_PROPS_BUILDER_EC2: {
			SubnetPropsBuilder_ec2 subnetPropsBuilder_ec2 = (SubnetPropsBuilder_ec2) theEObject;
			T result = caseSubnetPropsBuilder_ec2(subnetPropsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_BUILDER_EC2: {
			SubnetNetworkAclAssociationBuilder_ec2 subnetNetworkAclAssociationBuilder_ec2 = (SubnetNetworkAclAssociationBuilder_ec2) theEObject;
			T result = caseSubnetNetworkAclAssociationBuilder_ec2(subnetNetworkAclAssociationBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2: {
			MachineImageConfigBuilder_ec2 machineImageConfigBuilder_ec2 = (MachineImageConfigBuilder_ec2) theEObject;
			T result = caseMachineImageConfigBuilder_ec2(machineImageConfigBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.WINDOWS_IMAGE_PROPS_BUILDER_EC2: {
			WindowsImagePropsBuilder_ec2 windowsImagePropsBuilder_ec2 = (WindowsImagePropsBuilder_ec2) theEObject;
			T result = caseWindowsImagePropsBuilder_ec2(windowsImagePropsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.INSTANCE_PROPS_BUILDER_EC2: {
			InstancePropsBuilder_ec2 instancePropsBuilder_ec2 = (InstancePropsBuilder_ec2) theEObject;
			T result = caseInstancePropsBuilder_ec2(instancePropsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.NAT_INSTANCE_PROPS_BUILDER_EC2: {
			NatInstancePropsBuilder_ec2 natInstancePropsBuilder_ec2 = (NatInstancePropsBuilder_ec2) theEObject;
			T result = caseNatInstancePropsBuilder_ec2(natInstancePropsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.PRIVATE_SUBNET_PROPS_BUILDER_EC2: {
			PrivateSubnetPropsBuilder_ec2 privateSubnetPropsBuilder_ec2 = (PrivateSubnetPropsBuilder_ec2) theEObject;
			T result = casePrivateSubnetPropsBuilder_ec2(privateSubnetPropsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.PRIVATE_SUBNET_ATTRIBUTES_BUILDER_EC2: {
			PrivateSubnetAttributesBuilder_ec2 privateSubnetAttributesBuilder_ec2 = (PrivateSubnetAttributesBuilder_ec2) theEObject;
			T result = casePrivateSubnetAttributesBuilder_ec2(privateSubnetAttributesBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2: {
			InterfaceVpcEndpointBuilder_ec2 interfaceVpcEndpointBuilder_ec2 = (InterfaceVpcEndpointBuilder_ec2) theEObject;
			T result = caseInterfaceVpcEndpointBuilder_ec2(interfaceVpcEndpointBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2: {
			ConfigureNatOptionsBuilder_ec2 configureNatOptionsBuilder_ec2 = (ConfigureNatOptionsBuilder_ec2) theEObject;
			T result = caseConfigureNatOptionsBuilder_ec2(configureNatOptionsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.SUBNET_BUILDER_EC2: {
			SubnetBuilder_ec2 subnetBuilder_ec2 = (SubnetBuilder_ec2) theEObject;
			T result = caseSubnetBuilder_ec2(subnetBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.ACL_ICMP_BUILDER_EC2: {
			AclIcmpBuilder_ec2 aclIcmpBuilder_ec2 = (AclIcmpBuilder_ec2) theEObject;
			T result = caseAclIcmpBuilder_ec2(aclIcmpBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.NETWORK_ACL_BUILDER_EC2: {
			NetworkAclBuilder_ec2 networkAclBuilder_ec2 = (NetworkAclBuilder_ec2) theEObject;
			T result = caseNetworkAclBuilder_ec2(networkAclBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2: {
			CommonNetworkAclEntryOptionsBuilder_ec2 commonNetworkAclEntryOptionsBuilder_ec2 = (CommonNetworkAclEntryOptionsBuilder_ec2) theEObject;
			T result = caseCommonNetworkAclEntryOptionsBuilder_ec2(commonNetworkAclEntryOptionsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.GATEWAY_VPC_ENDPOINT_OPTIONS_BUILDER_EC2: {
			GatewayVpcEndpointOptionsBuilder_ec2 gatewayVpcEndpointOptionsBuilder_ec2 = (GatewayVpcEndpointOptionsBuilder_ec2) theEObject;
			T result = caseGatewayVpcEndpointOptionsBuilder_ec2(gatewayVpcEndpointOptionsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.LOOKUP_MACHINE_IMAGE_BUILDER_EC2: {
			LookupMachineImageBuilder_ec2 lookupMachineImageBuilder_ec2 = (LookupMachineImageBuilder_ec2) theEObject;
			T result = caseLookupMachineImageBuilder_ec2(lookupMachineImageBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.PORT_PROPS_BUILDER_EC2: {
			PortPropsBuilder_ec2 portPropsBuilder_ec2 = (PortPropsBuilder_ec2) theEObject;
			T result = casePortPropsBuilder_ec2(portPropsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2: {
			SecurityGroupImportOptionsBuilder_ec2 securityGroupImportOptionsBuilder_ec2 = (SecurityGroupImportOptionsBuilder_ec2) theEObject;
			T result = caseSecurityGroupImportOptionsBuilder_ec2(securityGroupImportOptionsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.CONNECTIONS_PROPS_BUILDER_EC2: {
			ConnectionsPropsBuilder_ec2 connectionsPropsBuilder_ec2 = (ConnectionsPropsBuilder_ec2) theEObject;
			T result = caseConnectionsPropsBuilder_ec2(connectionsPropsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2: {
			EbsDeviceOptionsBaseBuilder_ec2 ebsDeviceOptionsBaseBuilder_ec2 = (EbsDeviceOptionsBaseBuilder_ec2) theEObject;
			T result = caseEbsDeviceOptionsBaseBuilder_ec2(ebsDeviceOptionsBaseBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2: {
			SubnetAttributesBuilder_ec2 subnetAttributesBuilder_ec2 = (SubnetAttributesBuilder_ec2) theEObject;
			T result = caseSubnetAttributesBuilder_ec2(subnetAttributesBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.SECURITY_GROUP_BUILDER_EC2: {
			SecurityGroupBuilder_ec2 securityGroupBuilder_ec2 = (SecurityGroupBuilder_ec2) theEObject;
			T result = caseSecurityGroupBuilder_ec2(securityGroupBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2: {
			GatewayVpcEndpointBuilder_ec2 gatewayVpcEndpointBuilder_ec2 = (GatewayVpcEndpointBuilder_ec2) theEObject;
			T result = caseGatewayVpcEndpointBuilder_ec2(gatewayVpcEndpointBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.NETWORK_ACL_ENTRY_BUILDER_EC2: {
			NetworkAclEntryBuilder_ec2 networkAclEntryBuilder_ec2 = (NetworkAclEntryBuilder_ec2) theEObject;
			T result = caseNetworkAclEntryBuilder_ec2(networkAclEntryBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ec2Package.GATEWAY_VPC_ENDPOINT_PROPS_BUILDER_EC2: {
			GatewayVpcEndpointPropsBuilder_ec2 gatewayVpcEndpointPropsBuilder_ec2 = (GatewayVpcEndpointPropsBuilder_ec2) theEObject;
			T result = caseGatewayVpcEndpointPropsBuilder_ec2(gatewayVpcEndpointPropsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Linux Image Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Linux Image Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericLinuxImageBuilder_ec2(GenericLinuxImageBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acl Traffic Config Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acl Traffic Config Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAclTrafficConfigBuilder_ec2(AclTrafficConfigBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Windows Image Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Windows Image Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericWindowsImageBuilder_ec2(GenericWindowsImageBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Vpc Endpoint Attributes Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Vpc Endpoint Attributes Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceVpcEndpointAttributesBuilder_ec2(InterfaceVpcEndpointAttributesBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vpc Attributes Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vpc Attributes Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVpcAttributesBuilder_ec2(VpcAttributesBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execute File Options Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execute File Options Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecuteFileOptionsBuilder_ec2(ExecuteFileOptionsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ebs Device Options Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ebs Device Options Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEbsDeviceOptionsBuilder_ec2(EbsDeviceOptionsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enable Vpn Gateway Options Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enable Vpn Gateway Options Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnableVpnGatewayOptionsBuilder_ec2(EnableVpnGatewayOptionsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vpc Lookup Options Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vpc Lookup Options Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVpcLookupOptionsBuilder_ec2(VpcLookupOptionsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceBuilder_ec2(InstanceBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subnet Selection Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subnet Selection Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubnetSelectionBuilder_ec2(SubnetSelectionBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Group Props Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Group Props Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityGroupPropsBuilder_ec2(SecurityGroupPropsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acl Port Range Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acl Port Range Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAclPortRangeBuilder_ec2(AclPortRangeBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Windows Image Props Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Windows Image Props Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericWindowsImagePropsBuilder_ec2(GenericWindowsImagePropsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vpc Endpoint Service Props Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vpc Endpoint Service Props Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVpcEndpointServicePropsBuilder_ec2(VpcEndpointServicePropsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Windows Image Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Windows Image Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWindowsImageBuilder_ec2(WindowsImageBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Log Options Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Log Options Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowLogOptionsBuilder_ec2(FlowLogOptionsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Private Subnet Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Private Subnet Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivateSubnetBuilder_ec2(PrivateSubnetBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bastion Host Linux Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bastion Host Linux Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBastionHostLinuxBuilder_ec2(BastionHostLinuxBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selected Subnets Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selected Subnets Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectedSubnetsBuilder_ec2(SelectedSubnetsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vpn Gateway Props Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vpn Gateway Props Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVpnGatewayPropsBuilder_ec2(VpnGatewayPropsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subnet Configuration Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subnet Configuration Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubnetConfigurationBuilder_ec2(SubnetConfigurationBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vpn Tunnel Option Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vpn Tunnel Option Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVpnTunnelOptionBuilder_ec2(VpnTunnelOptionBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acl Cidr Config Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acl Cidr Config Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAclCidrConfigBuilder_ec2(AclCidrConfigBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public Subnet Props Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public Subnet Props Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicSubnetPropsBuilder_ec2(PublicSubnetPropsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nat Instance Provider Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nat Instance Provider Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNatInstanceProviderBuilder_ec2(NatInstanceProviderBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway Config Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway Config Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGatewayConfigBuilder_ec2(GatewayConfigBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Linux Image Props Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Linux Image Props Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericLinuxImagePropsBuilder_ec2(GenericLinuxImagePropsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vpc Props Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vpc Props Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVpcPropsBuilder_ec2(VpcPropsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bastion Host Linux Props Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bastion Host Linux Props Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBastionHostLinuxPropsBuilder_ec2(BastionHostLinuxPropsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subnet Network Acl Association Props Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subnet Network Acl Association Props Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubnetNetworkAclAssociationPropsBuilder_ec2(SubnetNetworkAclAssociationPropsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vpn Gateway Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vpn Gateway Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVpnGatewayBuilder_ec2(VpnGatewayBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Amazon Linux Image Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Amazon Linux Image Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmazonLinuxImageBuilder_ec2(AmazonLinuxImageBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Log Props Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Log Props Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowLogPropsBuilder_ec2(FlowLogPropsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Vpc Endpoint Props Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Vpc Endpoint Props Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceVpcEndpointPropsBuilder_ec2(InterfaceVpcEndpointPropsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vpn Connection Options Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vpn Connection Options Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVpnConnectionOptionsBuilder_ec2(VpnConnectionOptionsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortBuilder_ec2(PortBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Log Destination Config Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Log Destination Config Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowLogDestinationConfigBuilder_ec2(FlowLogDestinationConfigBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Amazon Linux Image Props Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Amazon Linux Image Props Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmazonLinuxImagePropsBuilder_ec2(AmazonLinuxImagePropsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lookup Machine Image Props Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lookup Machine Image Props Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLookupMachineImagePropsBuilder_ec2(LookupMachineImagePropsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ebs Device Snapshot Options Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ebs Device Snapshot Options Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEbsDeviceSnapshotOptionsBuilder_ec2(EbsDeviceSnapshotOptionsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vpn Connection Props Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vpn Connection Props Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVpnConnectionPropsBuilder_ec2(VpnConnectionPropsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vpn Connection Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vpn Connection Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVpnConnectionBuilder_ec2(VpnConnectionBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Device Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Device Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockDeviceBuilder_ec2(BlockDeviceBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ebs Device Props Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ebs Device Props Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEbsDevicePropsBuilder_ec2(EbsDevicePropsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Acl Entry Props Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Acl Entry Props Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkAclEntryPropsBuilder_ec2(NetworkAclEntryPropsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Route Options Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Route Options Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddRouteOptionsBuilder_ec2(AddRouteOptionsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public Subnet Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public Subnet Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicSubnetBuilder_ec2(PublicSubnetBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Vpc Endpoint Options Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Vpc Endpoint Options Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceVpcEndpointOptionsBuilder_ec2(InterfaceVpcEndpointOptionsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linux User Data Options Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linux User Data Options Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinuxUserDataOptionsBuilder_ec2(LinuxUserDataOptionsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Acl Props Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Acl Props Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkAclPropsBuilder_ec2(NetworkAclPropsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public Subnet Attributes Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public Subnet Attributes Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicSubnetAttributesBuilder_ec2(PublicSubnetAttributesBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>S3 Download Options Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>S3 Download Options Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseS3DownloadOptionsBuilder_ec2(S3DownloadOptionsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Log Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Log Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowLogBuilder_ec2(FlowLogBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connections Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connections Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionsBuilder_ec2(ConnectionsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vpc Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vpc Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVpcBuilder_ec2(VpcBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vpc Endpoint Service Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vpc Endpoint Service Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVpcEndpointServiceBuilder_ec2(VpcEndpointServiceBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Rule Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Rule Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionRuleBuilder_ec2(ConnectionRuleBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subnet Props Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subnet Props Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubnetPropsBuilder_ec2(SubnetPropsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subnet Network Acl Association Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subnet Network Acl Association Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubnetNetworkAclAssociationBuilder_ec2(SubnetNetworkAclAssociationBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine Image Config Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine Image Config Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachineImageConfigBuilder_ec2(MachineImageConfigBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Windows Image Props Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Windows Image Props Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWindowsImagePropsBuilder_ec2(WindowsImagePropsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Props Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Props Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstancePropsBuilder_ec2(InstancePropsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nat Instance Props Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nat Instance Props Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNatInstancePropsBuilder_ec2(NatInstancePropsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Private Subnet Props Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Private Subnet Props Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivateSubnetPropsBuilder_ec2(PrivateSubnetPropsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Private Subnet Attributes Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Private Subnet Attributes Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivateSubnetAttributesBuilder_ec2(PrivateSubnetAttributesBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Vpc Endpoint Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Vpc Endpoint Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceVpcEndpointBuilder_ec2(InterfaceVpcEndpointBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configure Nat Options Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configure Nat Options Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigureNatOptionsBuilder_ec2(ConfigureNatOptionsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subnet Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subnet Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubnetBuilder_ec2(SubnetBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acl Icmp Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acl Icmp Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAclIcmpBuilder_ec2(AclIcmpBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Acl Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Acl Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkAclBuilder_ec2(NetworkAclBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Common Network Acl Entry Options Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Common Network Acl Entry Options Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommonNetworkAclEntryOptionsBuilder_ec2(CommonNetworkAclEntryOptionsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway Vpc Endpoint Options Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway Vpc Endpoint Options Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGatewayVpcEndpointOptionsBuilder_ec2(GatewayVpcEndpointOptionsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lookup Machine Image Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lookup Machine Image Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLookupMachineImageBuilder_ec2(LookupMachineImageBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Props Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Props Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortPropsBuilder_ec2(PortPropsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Group Import Options Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Group Import Options Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityGroupImportOptionsBuilder_ec2(SecurityGroupImportOptionsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connections Props Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connections Props Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionsPropsBuilder_ec2(ConnectionsPropsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ebs Device Options Base Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ebs Device Options Base Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEbsDeviceOptionsBaseBuilder_ec2(EbsDeviceOptionsBaseBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subnet Attributes Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subnet Attributes Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubnetAttributesBuilder_ec2(SubnetAttributesBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Group Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Group Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityGroupBuilder_ec2(SecurityGroupBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway Vpc Endpoint Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway Vpc Endpoint Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGatewayVpcEndpointBuilder_ec2(GatewayVpcEndpointBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Acl Entry Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Acl Entry Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkAclEntryBuilder_ec2(NetworkAclEntryBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway Vpc Endpoint Props Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway Vpc Endpoint Props Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGatewayVpcEndpointPropsBuilder_ec2(GatewayVpcEndpointPropsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Ec2Switch
