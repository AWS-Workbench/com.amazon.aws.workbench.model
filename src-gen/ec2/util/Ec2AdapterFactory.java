/**
 */
package ec2.util;

import ec2.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ec2.Ec2Package
 * @generated
 */
public class Ec2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Ec2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ec2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Ec2Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ec2Switch<Adapter> modelSwitch = new Ec2Switch<Adapter>() {
		@Override
		public Adapter caseGenericLinuxImageBuilder_ec2(GenericLinuxImageBuilder_ec2 object) {
			return createGenericLinuxImageBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseAclTrafficConfigBuilder_ec2(AclTrafficConfigBuilder_ec2 object) {
			return createAclTrafficConfigBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseGenericWindowsImageBuilder_ec2(GenericWindowsImageBuilder_ec2 object) {
			return createGenericWindowsImageBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseInterfaceVpcEndpointAttributesBuilder_ec2(InterfaceVpcEndpointAttributesBuilder_ec2 object) {
			return createInterfaceVpcEndpointAttributesBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseVpcAttributesBuilder_ec2(VpcAttributesBuilder_ec2 object) {
			return createVpcAttributesBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseExecuteFileOptionsBuilder_ec2(ExecuteFileOptionsBuilder_ec2 object) {
			return createExecuteFileOptionsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseEbsDeviceOptionsBuilder_ec2(EbsDeviceOptionsBuilder_ec2 object) {
			return createEbsDeviceOptionsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseEnableVpnGatewayOptionsBuilder_ec2(EnableVpnGatewayOptionsBuilder_ec2 object) {
			return createEnableVpnGatewayOptionsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseVpcLookupOptionsBuilder_ec2(VpcLookupOptionsBuilder_ec2 object) {
			return createVpcLookupOptionsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseInstanceBuilder_ec2(InstanceBuilder_ec2 object) {
			return createInstanceBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseSubnetSelectionBuilder_ec2(SubnetSelectionBuilder_ec2 object) {
			return createSubnetSelectionBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseSecurityGroupPropsBuilder_ec2(SecurityGroupPropsBuilder_ec2 object) {
			return createSecurityGroupPropsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseAclPortRangeBuilder_ec2(AclPortRangeBuilder_ec2 object) {
			return createAclPortRangeBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseGenericWindowsImagePropsBuilder_ec2(GenericWindowsImagePropsBuilder_ec2 object) {
			return createGenericWindowsImagePropsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseVpcEndpointServicePropsBuilder_ec2(VpcEndpointServicePropsBuilder_ec2 object) {
			return createVpcEndpointServicePropsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseWindowsImageBuilder_ec2(WindowsImageBuilder_ec2 object) {
			return createWindowsImageBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseFlowLogOptionsBuilder_ec2(FlowLogOptionsBuilder_ec2 object) {
			return createFlowLogOptionsBuilder_ec2Adapter();
		}

		@Override
		public Adapter casePrivateSubnetBuilder_ec2(PrivateSubnetBuilder_ec2 object) {
			return createPrivateSubnetBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseBastionHostLinuxBuilder_ec2(BastionHostLinuxBuilder_ec2 object) {
			return createBastionHostLinuxBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseSelectedSubnetsBuilder_ec2(SelectedSubnetsBuilder_ec2 object) {
			return createSelectedSubnetsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseVpnGatewayPropsBuilder_ec2(VpnGatewayPropsBuilder_ec2 object) {
			return createVpnGatewayPropsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseSubnetConfigurationBuilder_ec2(SubnetConfigurationBuilder_ec2 object) {
			return createSubnetConfigurationBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseVpnTunnelOptionBuilder_ec2(VpnTunnelOptionBuilder_ec2 object) {
			return createVpnTunnelOptionBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseAclCidrConfigBuilder_ec2(AclCidrConfigBuilder_ec2 object) {
			return createAclCidrConfigBuilder_ec2Adapter();
		}

		@Override
		public Adapter casePublicSubnetPropsBuilder_ec2(PublicSubnetPropsBuilder_ec2 object) {
			return createPublicSubnetPropsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseNatInstanceProviderBuilder_ec2(NatInstanceProviderBuilder_ec2 object) {
			return createNatInstanceProviderBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseGatewayConfigBuilder_ec2(GatewayConfigBuilder_ec2 object) {
			return createGatewayConfigBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseGenericLinuxImagePropsBuilder_ec2(GenericLinuxImagePropsBuilder_ec2 object) {
			return createGenericLinuxImagePropsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseVpcPropsBuilder_ec2(VpcPropsBuilder_ec2 object) {
			return createVpcPropsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseBastionHostLinuxPropsBuilder_ec2(BastionHostLinuxPropsBuilder_ec2 object) {
			return createBastionHostLinuxPropsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseSubnetNetworkAclAssociationPropsBuilder_ec2(
				SubnetNetworkAclAssociationPropsBuilder_ec2 object) {
			return createSubnetNetworkAclAssociationPropsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseVpnGatewayBuilder_ec2(VpnGatewayBuilder_ec2 object) {
			return createVpnGatewayBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseAmazonLinuxImageBuilder_ec2(AmazonLinuxImageBuilder_ec2 object) {
			return createAmazonLinuxImageBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseFlowLogPropsBuilder_ec2(FlowLogPropsBuilder_ec2 object) {
			return createFlowLogPropsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseInterfaceVpcEndpointPropsBuilder_ec2(InterfaceVpcEndpointPropsBuilder_ec2 object) {
			return createInterfaceVpcEndpointPropsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseVpnConnectionOptionsBuilder_ec2(VpnConnectionOptionsBuilder_ec2 object) {
			return createVpnConnectionOptionsBuilder_ec2Adapter();
		}

		@Override
		public Adapter casePortBuilder_ec2(PortBuilder_ec2 object) {
			return createPortBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseFlowLogDestinationConfigBuilder_ec2(FlowLogDestinationConfigBuilder_ec2 object) {
			return createFlowLogDestinationConfigBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseAmazonLinuxImagePropsBuilder_ec2(AmazonLinuxImagePropsBuilder_ec2 object) {
			return createAmazonLinuxImagePropsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseLookupMachineImagePropsBuilder_ec2(LookupMachineImagePropsBuilder_ec2 object) {
			return createLookupMachineImagePropsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseEbsDeviceSnapshotOptionsBuilder_ec2(EbsDeviceSnapshotOptionsBuilder_ec2 object) {
			return createEbsDeviceSnapshotOptionsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseVpnConnectionPropsBuilder_ec2(VpnConnectionPropsBuilder_ec2 object) {
			return createVpnConnectionPropsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseVpnConnectionBuilder_ec2(VpnConnectionBuilder_ec2 object) {
			return createVpnConnectionBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseBlockDeviceBuilder_ec2(BlockDeviceBuilder_ec2 object) {
			return createBlockDeviceBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseEbsDevicePropsBuilder_ec2(EbsDevicePropsBuilder_ec2 object) {
			return createEbsDevicePropsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseNetworkAclEntryPropsBuilder_ec2(NetworkAclEntryPropsBuilder_ec2 object) {
			return createNetworkAclEntryPropsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseAddRouteOptionsBuilder_ec2(AddRouteOptionsBuilder_ec2 object) {
			return createAddRouteOptionsBuilder_ec2Adapter();
		}

		@Override
		public Adapter casePublicSubnetBuilder_ec2(PublicSubnetBuilder_ec2 object) {
			return createPublicSubnetBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseInterfaceVpcEndpointOptionsBuilder_ec2(InterfaceVpcEndpointOptionsBuilder_ec2 object) {
			return createInterfaceVpcEndpointOptionsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseLinuxUserDataOptionsBuilder_ec2(LinuxUserDataOptionsBuilder_ec2 object) {
			return createLinuxUserDataOptionsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseNetworkAclPropsBuilder_ec2(NetworkAclPropsBuilder_ec2 object) {
			return createNetworkAclPropsBuilder_ec2Adapter();
		}

		@Override
		public Adapter casePublicSubnetAttributesBuilder_ec2(PublicSubnetAttributesBuilder_ec2 object) {
			return createPublicSubnetAttributesBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseS3DownloadOptionsBuilder_ec2(S3DownloadOptionsBuilder_ec2 object) {
			return createS3DownloadOptionsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseFlowLogBuilder_ec2(FlowLogBuilder_ec2 object) {
			return createFlowLogBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseConnectionsBuilder_ec2(ConnectionsBuilder_ec2 object) {
			return createConnectionsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseVpcBuilder_ec2(VpcBuilder_ec2 object) {
			return createVpcBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseVpcEndpointServiceBuilder_ec2(VpcEndpointServiceBuilder_ec2 object) {
			return createVpcEndpointServiceBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseConnectionRuleBuilder_ec2(ConnectionRuleBuilder_ec2 object) {
			return createConnectionRuleBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseSubnetPropsBuilder_ec2(SubnetPropsBuilder_ec2 object) {
			return createSubnetPropsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseSubnetNetworkAclAssociationBuilder_ec2(SubnetNetworkAclAssociationBuilder_ec2 object) {
			return createSubnetNetworkAclAssociationBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseMachineImageConfigBuilder_ec2(MachineImageConfigBuilder_ec2 object) {
			return createMachineImageConfigBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseWindowsImagePropsBuilder_ec2(WindowsImagePropsBuilder_ec2 object) {
			return createWindowsImagePropsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseInstancePropsBuilder_ec2(InstancePropsBuilder_ec2 object) {
			return createInstancePropsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseNatInstancePropsBuilder_ec2(NatInstancePropsBuilder_ec2 object) {
			return createNatInstancePropsBuilder_ec2Adapter();
		}

		@Override
		public Adapter casePrivateSubnetPropsBuilder_ec2(PrivateSubnetPropsBuilder_ec2 object) {
			return createPrivateSubnetPropsBuilder_ec2Adapter();
		}

		@Override
		public Adapter casePrivateSubnetAttributesBuilder_ec2(PrivateSubnetAttributesBuilder_ec2 object) {
			return createPrivateSubnetAttributesBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseInterfaceVpcEndpointBuilder_ec2(InterfaceVpcEndpointBuilder_ec2 object) {
			return createInterfaceVpcEndpointBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseConfigureNatOptionsBuilder_ec2(ConfigureNatOptionsBuilder_ec2 object) {
			return createConfigureNatOptionsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseSubnetBuilder_ec2(SubnetBuilder_ec2 object) {
			return createSubnetBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseAclIcmpBuilder_ec2(AclIcmpBuilder_ec2 object) {
			return createAclIcmpBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseNetworkAclBuilder_ec2(NetworkAclBuilder_ec2 object) {
			return createNetworkAclBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseCommonNetworkAclEntryOptionsBuilder_ec2(CommonNetworkAclEntryOptionsBuilder_ec2 object) {
			return createCommonNetworkAclEntryOptionsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseGatewayVpcEndpointOptionsBuilder_ec2(GatewayVpcEndpointOptionsBuilder_ec2 object) {
			return createGatewayVpcEndpointOptionsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseLookupMachineImageBuilder_ec2(LookupMachineImageBuilder_ec2 object) {
			return createLookupMachineImageBuilder_ec2Adapter();
		}

		@Override
		public Adapter casePortPropsBuilder_ec2(PortPropsBuilder_ec2 object) {
			return createPortPropsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseSecurityGroupImportOptionsBuilder_ec2(SecurityGroupImportOptionsBuilder_ec2 object) {
			return createSecurityGroupImportOptionsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseConnectionsPropsBuilder_ec2(ConnectionsPropsBuilder_ec2 object) {
			return createConnectionsPropsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseEbsDeviceOptionsBaseBuilder_ec2(EbsDeviceOptionsBaseBuilder_ec2 object) {
			return createEbsDeviceOptionsBaseBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseSubnetAttributesBuilder_ec2(SubnetAttributesBuilder_ec2 object) {
			return createSubnetAttributesBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseSecurityGroupBuilder_ec2(SecurityGroupBuilder_ec2 object) {
			return createSecurityGroupBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseGatewayVpcEndpointBuilder_ec2(GatewayVpcEndpointBuilder_ec2 object) {
			return createGatewayVpcEndpointBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseNetworkAclEntryBuilder_ec2(NetworkAclEntryBuilder_ec2 object) {
			return createNetworkAclEntryBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseGatewayVpcEndpointPropsBuilder_ec2(GatewayVpcEndpointPropsBuilder_ec2 object) {
			return createGatewayVpcEndpointPropsBuilder_ec2Adapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.GenericLinuxImageBuilder_ec2 <em>Generic Linux Image Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.GenericLinuxImageBuilder_ec2
	 * @generated
	 */
	public Adapter createGenericLinuxImageBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.AclTrafficConfigBuilder_ec2 <em>Acl Traffic Config Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.AclTrafficConfigBuilder_ec2
	 * @generated
	 */
	public Adapter createAclTrafficConfigBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.GenericWindowsImageBuilder_ec2 <em>Generic Windows Image Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.GenericWindowsImageBuilder_ec2
	 * @generated
	 */
	public Adapter createGenericWindowsImageBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.InterfaceVpcEndpointAttributesBuilder_ec2 <em>Interface Vpc Endpoint Attributes Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.InterfaceVpcEndpointAttributesBuilder_ec2
	 * @generated
	 */
	public Adapter createInterfaceVpcEndpointAttributesBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.VpcAttributesBuilder_ec2 <em>Vpc Attributes Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.VpcAttributesBuilder_ec2
	 * @generated
	 */
	public Adapter createVpcAttributesBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.ExecuteFileOptionsBuilder_ec2 <em>Execute File Options Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.ExecuteFileOptionsBuilder_ec2
	 * @generated
	 */
	public Adapter createExecuteFileOptionsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.EbsDeviceOptionsBuilder_ec2 <em>Ebs Device Options Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.EbsDeviceOptionsBuilder_ec2
	 * @generated
	 */
	public Adapter createEbsDeviceOptionsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.EnableVpnGatewayOptionsBuilder_ec2 <em>Enable Vpn Gateway Options Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.EnableVpnGatewayOptionsBuilder_ec2
	 * @generated
	 */
	public Adapter createEnableVpnGatewayOptionsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.VpcLookupOptionsBuilder_ec2 <em>Vpc Lookup Options Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.VpcLookupOptionsBuilder_ec2
	 * @generated
	 */
	public Adapter createVpcLookupOptionsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.InstanceBuilder_ec2 <em>Instance Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.InstanceBuilder_ec2
	 * @generated
	 */
	public Adapter createInstanceBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.SubnetSelectionBuilder_ec2 <em>Subnet Selection Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.SubnetSelectionBuilder_ec2
	 * @generated
	 */
	public Adapter createSubnetSelectionBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.SecurityGroupPropsBuilder_ec2 <em>Security Group Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.SecurityGroupPropsBuilder_ec2
	 * @generated
	 */
	public Adapter createSecurityGroupPropsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.AclPortRangeBuilder_ec2 <em>Acl Port Range Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.AclPortRangeBuilder_ec2
	 * @generated
	 */
	public Adapter createAclPortRangeBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.GenericWindowsImagePropsBuilder_ec2 <em>Generic Windows Image Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.GenericWindowsImagePropsBuilder_ec2
	 * @generated
	 */
	public Adapter createGenericWindowsImagePropsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.VpcEndpointServicePropsBuilder_ec2 <em>Vpc Endpoint Service Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.VpcEndpointServicePropsBuilder_ec2
	 * @generated
	 */
	public Adapter createVpcEndpointServicePropsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.WindowsImageBuilder_ec2 <em>Windows Image Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.WindowsImageBuilder_ec2
	 * @generated
	 */
	public Adapter createWindowsImageBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.FlowLogOptionsBuilder_ec2 <em>Flow Log Options Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.FlowLogOptionsBuilder_ec2
	 * @generated
	 */
	public Adapter createFlowLogOptionsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.PrivateSubnetBuilder_ec2 <em>Private Subnet Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.PrivateSubnetBuilder_ec2
	 * @generated
	 */
	public Adapter createPrivateSubnetBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.BastionHostLinuxBuilder_ec2 <em>Bastion Host Linux Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.BastionHostLinuxBuilder_ec2
	 * @generated
	 */
	public Adapter createBastionHostLinuxBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.SelectedSubnetsBuilder_ec2 <em>Selected Subnets Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.SelectedSubnetsBuilder_ec2
	 * @generated
	 */
	public Adapter createSelectedSubnetsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.VpnGatewayPropsBuilder_ec2 <em>Vpn Gateway Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.VpnGatewayPropsBuilder_ec2
	 * @generated
	 */
	public Adapter createVpnGatewayPropsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.SubnetConfigurationBuilder_ec2 <em>Subnet Configuration Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.SubnetConfigurationBuilder_ec2
	 * @generated
	 */
	public Adapter createSubnetConfigurationBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.VpnTunnelOptionBuilder_ec2 <em>Vpn Tunnel Option Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.VpnTunnelOptionBuilder_ec2
	 * @generated
	 */
	public Adapter createVpnTunnelOptionBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.AclCidrConfigBuilder_ec2 <em>Acl Cidr Config Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.AclCidrConfigBuilder_ec2
	 * @generated
	 */
	public Adapter createAclCidrConfigBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.PublicSubnetPropsBuilder_ec2 <em>Public Subnet Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.PublicSubnetPropsBuilder_ec2
	 * @generated
	 */
	public Adapter createPublicSubnetPropsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.NatInstanceProviderBuilder_ec2 <em>Nat Instance Provider Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.NatInstanceProviderBuilder_ec2
	 * @generated
	 */
	public Adapter createNatInstanceProviderBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.GatewayConfigBuilder_ec2 <em>Gateway Config Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.GatewayConfigBuilder_ec2
	 * @generated
	 */
	public Adapter createGatewayConfigBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.GenericLinuxImagePropsBuilder_ec2 <em>Generic Linux Image Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.GenericLinuxImagePropsBuilder_ec2
	 * @generated
	 */
	public Adapter createGenericLinuxImagePropsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.VpcPropsBuilder_ec2 <em>Vpc Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.VpcPropsBuilder_ec2
	 * @generated
	 */
	public Adapter createVpcPropsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.BastionHostLinuxPropsBuilder_ec2 <em>Bastion Host Linux Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.BastionHostLinuxPropsBuilder_ec2
	 * @generated
	 */
	public Adapter createBastionHostLinuxPropsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.SubnetNetworkAclAssociationPropsBuilder_ec2 <em>Subnet Network Acl Association Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.SubnetNetworkAclAssociationPropsBuilder_ec2
	 * @generated
	 */
	public Adapter createSubnetNetworkAclAssociationPropsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.VpnGatewayBuilder_ec2 <em>Vpn Gateway Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.VpnGatewayBuilder_ec2
	 * @generated
	 */
	public Adapter createVpnGatewayBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.AmazonLinuxImageBuilder_ec2 <em>Amazon Linux Image Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.AmazonLinuxImageBuilder_ec2
	 * @generated
	 */
	public Adapter createAmazonLinuxImageBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.FlowLogPropsBuilder_ec2 <em>Flow Log Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.FlowLogPropsBuilder_ec2
	 * @generated
	 */
	public Adapter createFlowLogPropsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2 <em>Interface Vpc Endpoint Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.InterfaceVpcEndpointPropsBuilder_ec2
	 * @generated
	 */
	public Adapter createInterfaceVpcEndpointPropsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.VpnConnectionOptionsBuilder_ec2 <em>Vpn Connection Options Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.VpnConnectionOptionsBuilder_ec2
	 * @generated
	 */
	public Adapter createVpnConnectionOptionsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.PortBuilder_ec2 <em>Port Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.PortBuilder_ec2
	 * @generated
	 */
	public Adapter createPortBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.FlowLogDestinationConfigBuilder_ec2 <em>Flow Log Destination Config Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.FlowLogDestinationConfigBuilder_ec2
	 * @generated
	 */
	public Adapter createFlowLogDestinationConfigBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.AmazonLinuxImagePropsBuilder_ec2 <em>Amazon Linux Image Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.AmazonLinuxImagePropsBuilder_ec2
	 * @generated
	 */
	public Adapter createAmazonLinuxImagePropsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.LookupMachineImagePropsBuilder_ec2 <em>Lookup Machine Image Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.LookupMachineImagePropsBuilder_ec2
	 * @generated
	 */
	public Adapter createLookupMachineImagePropsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.EbsDeviceSnapshotOptionsBuilder_ec2 <em>Ebs Device Snapshot Options Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.EbsDeviceSnapshotOptionsBuilder_ec2
	 * @generated
	 */
	public Adapter createEbsDeviceSnapshotOptionsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.VpnConnectionPropsBuilder_ec2 <em>Vpn Connection Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.VpnConnectionPropsBuilder_ec2
	 * @generated
	 */
	public Adapter createVpnConnectionPropsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.VpnConnectionBuilder_ec2 <em>Vpn Connection Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.VpnConnectionBuilder_ec2
	 * @generated
	 */
	public Adapter createVpnConnectionBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.BlockDeviceBuilder_ec2 <em>Block Device Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.BlockDeviceBuilder_ec2
	 * @generated
	 */
	public Adapter createBlockDeviceBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.EbsDevicePropsBuilder_ec2 <em>Ebs Device Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.EbsDevicePropsBuilder_ec2
	 * @generated
	 */
	public Adapter createEbsDevicePropsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.NetworkAclEntryPropsBuilder_ec2 <em>Network Acl Entry Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.NetworkAclEntryPropsBuilder_ec2
	 * @generated
	 */
	public Adapter createNetworkAclEntryPropsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.AddRouteOptionsBuilder_ec2 <em>Add Route Options Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.AddRouteOptionsBuilder_ec2
	 * @generated
	 */
	public Adapter createAddRouteOptionsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.PublicSubnetBuilder_ec2 <em>Public Subnet Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.PublicSubnetBuilder_ec2
	 * @generated
	 */
	public Adapter createPublicSubnetBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.InterfaceVpcEndpointOptionsBuilder_ec2 <em>Interface Vpc Endpoint Options Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.InterfaceVpcEndpointOptionsBuilder_ec2
	 * @generated
	 */
	public Adapter createInterfaceVpcEndpointOptionsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.LinuxUserDataOptionsBuilder_ec2 <em>Linux User Data Options Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.LinuxUserDataOptionsBuilder_ec2
	 * @generated
	 */
	public Adapter createLinuxUserDataOptionsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.NetworkAclPropsBuilder_ec2 <em>Network Acl Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.NetworkAclPropsBuilder_ec2
	 * @generated
	 */
	public Adapter createNetworkAclPropsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.PublicSubnetAttributesBuilder_ec2 <em>Public Subnet Attributes Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.PublicSubnetAttributesBuilder_ec2
	 * @generated
	 */
	public Adapter createPublicSubnetAttributesBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.S3DownloadOptionsBuilder_ec2 <em>S3 Download Options Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.S3DownloadOptionsBuilder_ec2
	 * @generated
	 */
	public Adapter createS3DownloadOptionsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.FlowLogBuilder_ec2 <em>Flow Log Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.FlowLogBuilder_ec2
	 * @generated
	 */
	public Adapter createFlowLogBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.ConnectionsBuilder_ec2 <em>Connections Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.ConnectionsBuilder_ec2
	 * @generated
	 */
	public Adapter createConnectionsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.VpcBuilder_ec2 <em>Vpc Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.VpcBuilder_ec2
	 * @generated
	 */
	public Adapter createVpcBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.VpcEndpointServiceBuilder_ec2 <em>Vpc Endpoint Service Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.VpcEndpointServiceBuilder_ec2
	 * @generated
	 */
	public Adapter createVpcEndpointServiceBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.ConnectionRuleBuilder_ec2 <em>Connection Rule Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.ConnectionRuleBuilder_ec2
	 * @generated
	 */
	public Adapter createConnectionRuleBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.SubnetPropsBuilder_ec2 <em>Subnet Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.SubnetPropsBuilder_ec2
	 * @generated
	 */
	public Adapter createSubnetPropsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.SubnetNetworkAclAssociationBuilder_ec2 <em>Subnet Network Acl Association Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.SubnetNetworkAclAssociationBuilder_ec2
	 * @generated
	 */
	public Adapter createSubnetNetworkAclAssociationBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.MachineImageConfigBuilder_ec2 <em>Machine Image Config Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.MachineImageConfigBuilder_ec2
	 * @generated
	 */
	public Adapter createMachineImageConfigBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.WindowsImagePropsBuilder_ec2 <em>Windows Image Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.WindowsImagePropsBuilder_ec2
	 * @generated
	 */
	public Adapter createWindowsImagePropsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.InstancePropsBuilder_ec2 <em>Instance Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.InstancePropsBuilder_ec2
	 * @generated
	 */
	public Adapter createInstancePropsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.NatInstancePropsBuilder_ec2 <em>Nat Instance Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.NatInstancePropsBuilder_ec2
	 * @generated
	 */
	public Adapter createNatInstancePropsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.PrivateSubnetPropsBuilder_ec2 <em>Private Subnet Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.PrivateSubnetPropsBuilder_ec2
	 * @generated
	 */
	public Adapter createPrivateSubnetPropsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.PrivateSubnetAttributesBuilder_ec2 <em>Private Subnet Attributes Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.PrivateSubnetAttributesBuilder_ec2
	 * @generated
	 */
	public Adapter createPrivateSubnetAttributesBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.InterfaceVpcEndpointBuilder_ec2 <em>Interface Vpc Endpoint Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.InterfaceVpcEndpointBuilder_ec2
	 * @generated
	 */
	public Adapter createInterfaceVpcEndpointBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.ConfigureNatOptionsBuilder_ec2 <em>Configure Nat Options Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.ConfigureNatOptionsBuilder_ec2
	 * @generated
	 */
	public Adapter createConfigureNatOptionsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.SubnetBuilder_ec2 <em>Subnet Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.SubnetBuilder_ec2
	 * @generated
	 */
	public Adapter createSubnetBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.AclIcmpBuilder_ec2 <em>Acl Icmp Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.AclIcmpBuilder_ec2
	 * @generated
	 */
	public Adapter createAclIcmpBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.NetworkAclBuilder_ec2 <em>Network Acl Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.NetworkAclBuilder_ec2
	 * @generated
	 */
	public Adapter createNetworkAclBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.CommonNetworkAclEntryOptionsBuilder_ec2 <em>Common Network Acl Entry Options Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.CommonNetworkAclEntryOptionsBuilder_ec2
	 * @generated
	 */
	public Adapter createCommonNetworkAclEntryOptionsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.GatewayVpcEndpointOptionsBuilder_ec2 <em>Gateway Vpc Endpoint Options Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.GatewayVpcEndpointOptionsBuilder_ec2
	 * @generated
	 */
	public Adapter createGatewayVpcEndpointOptionsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.LookupMachineImageBuilder_ec2 <em>Lookup Machine Image Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.LookupMachineImageBuilder_ec2
	 * @generated
	 */
	public Adapter createLookupMachineImageBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.PortPropsBuilder_ec2 <em>Port Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.PortPropsBuilder_ec2
	 * @generated
	 */
	public Adapter createPortPropsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.SecurityGroupImportOptionsBuilder_ec2 <em>Security Group Import Options Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.SecurityGroupImportOptionsBuilder_ec2
	 * @generated
	 */
	public Adapter createSecurityGroupImportOptionsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.ConnectionsPropsBuilder_ec2 <em>Connections Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.ConnectionsPropsBuilder_ec2
	 * @generated
	 */
	public Adapter createConnectionsPropsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.EbsDeviceOptionsBaseBuilder_ec2 <em>Ebs Device Options Base Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.EbsDeviceOptionsBaseBuilder_ec2
	 * @generated
	 */
	public Adapter createEbsDeviceOptionsBaseBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.SubnetAttributesBuilder_ec2 <em>Subnet Attributes Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.SubnetAttributesBuilder_ec2
	 * @generated
	 */
	public Adapter createSubnetAttributesBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.SecurityGroupBuilder_ec2 <em>Security Group Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.SecurityGroupBuilder_ec2
	 * @generated
	 */
	public Adapter createSecurityGroupBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.GatewayVpcEndpointBuilder_ec2 <em>Gateway Vpc Endpoint Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.GatewayVpcEndpointBuilder_ec2
	 * @generated
	 */
	public Adapter createGatewayVpcEndpointBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.NetworkAclEntryBuilder_ec2 <em>Network Acl Entry Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.NetworkAclEntryBuilder_ec2
	 * @generated
	 */
	public Adapter createNetworkAclEntryBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ec2.GatewayVpcEndpointPropsBuilder_ec2 <em>Gateway Vpc Endpoint Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ec2.GatewayVpcEndpointPropsBuilder_ec2
	 * @generated
	 */
	public Adapter createGatewayVpcEndpointPropsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Ec2AdapterFactory
