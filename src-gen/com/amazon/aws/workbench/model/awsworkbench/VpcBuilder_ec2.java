/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vpc Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getCidr <em>Cidr</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getDefaultInstanceTenancy <em>Default Instance Tenancy</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getEnableDnsHostnames <em>Enable Dns Hostnames</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getEnableDnsSupport <em>Enable Dns Support</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getFlowLogsAsMap <em>Flow Logs As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getGatewayEndpointsAsMap <em>Gateway Endpoints As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getMaxAzs <em>Max Azs</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getNatGatewayProviderWithNatProviderAsReference <em>Nat Gateway Provider With Nat Provider As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getNatGateways <em>Nat Gateways</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getNatGatewaySubnetsWithSubnetSelectionAsReference <em>Nat Gateway Subnets With Subnet Selection As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getSubnetConfigurationAsList <em>Subnet Configuration As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getVpnConnectionsAsMap <em>Vpn Connections As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getVpnGateway <em>Vpn Gateway</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getVpnGatewayAsn <em>Vpn Gateway Asn</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getVpnRoutePropagationAsList <em>Vpn Route Propagation As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getAdditionalCode <em>Additional Code</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getSubnetbuilder_ec2 <em>Subnetbuilder ec2</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getSecuritygroupbuilder_ec2 <em>Securitygroupbuilder ec2</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getPrivatesubnetbuilder_ec2 <em>Privatesubnetbuilder ec2</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getPublicsubnetbuilder_ec2 <em>Publicsubnetbuilder ec2</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_ec2()
 * @model
 * @generated
 */
public interface VpcBuilder_ec2 extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Cidr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cidr</em>' attribute.
	 * @see #setCidr(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_ec2_Cidr()
	 * @model
	 * @generated
	 */
	String getCidr();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getCidr <em>Cidr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cidr</em>' attribute.
	 * @see #getCidr()
	 * @generated
	 */
	void setCidr(String value);

	/**
	 * Returns the value of the '<em><b>Default Instance Tenancy</b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.DefaultInstanceTenancy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Instance Tenancy</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.DefaultInstanceTenancy
	 * @see #setDefaultInstanceTenancy(DefaultInstanceTenancy)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_ec2_DefaultInstanceTenancy()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.DefaultInstanceTenancy"
	 * @generated
	 */
	DefaultInstanceTenancy getDefaultInstanceTenancy();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getDefaultInstanceTenancy <em>Default Instance Tenancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Instance Tenancy</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.DefaultInstanceTenancy
	 * @see #getDefaultInstanceTenancy()
	 * @generated
	 */
	void setDefaultInstanceTenancy(DefaultInstanceTenancy value);

	/**
	 * Returns the value of the '<em><b>Enable Dns Hostnames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Dns Hostnames</em>' attribute.
	 * @see #setEnableDnsHostnames(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_ec2_EnableDnsHostnames()
	 * @model
	 * @generated
	 */
	Boolean getEnableDnsHostnames();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getEnableDnsHostnames <em>Enable Dns Hostnames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Dns Hostnames</em>' attribute.
	 * @see #getEnableDnsHostnames()
	 * @generated
	 */
	void setEnableDnsHostnames(Boolean value);

	/**
	 * Returns the value of the '<em><b>Enable Dns Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Dns Support</em>' attribute.
	 * @see #setEnableDnsSupport(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_ec2_EnableDnsSupport()
	 * @model
	 * @generated
	 */
	Boolean getEnableDnsSupport();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getEnableDnsSupport <em>Enable Dns Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Dns Support</em>' attribute.
	 * @see #getEnableDnsSupport()
	 * @generated
	 */
	void setEnableDnsSupport(Boolean value);

	/**
	 * Returns the value of the '<em><b>Flow Logs As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Logs As Map</em>' attribute.
	 * @see #setFlowLogsAsMap(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_ec2_FlowLogsAsMap()
	 * @model
	 * @generated
	 */
	String getFlowLogsAsMap();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getFlowLogsAsMap <em>Flow Logs As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Logs As Map</em>' attribute.
	 * @see #getFlowLogsAsMap()
	 * @generated
	 */
	void setFlowLogsAsMap(String value);

	/**
	 * Returns the value of the '<em><b>Gateway Endpoints As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway Endpoints As Map</em>' attribute.
	 * @see #setGatewayEndpointsAsMap(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_ec2_GatewayEndpointsAsMap()
	 * @model
	 * @generated
	 */
	String getGatewayEndpointsAsMap();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getGatewayEndpointsAsMap <em>Gateway Endpoints As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway Endpoints As Map</em>' attribute.
	 * @see #getGatewayEndpointsAsMap()
	 * @generated
	 */
	void setGatewayEndpointsAsMap(String value);

	/**
	 * Returns the value of the '<em><b>Max Azs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Azs</em>' attribute.
	 * @see #setMaxAzs(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_ec2_MaxAzs()
	 * @model
	 * @generated
	 */
	int getMaxAzs();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getMaxAzs <em>Max Azs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Azs</em>' attribute.
	 * @see #getMaxAzs()
	 * @generated
	 */
	void setMaxAzs(int value);

	/**
	 * Returns the value of the '<em><b>Nat Gateway Provider With Nat Provider As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nat Gateway Provider With Nat Provider As Reference</em>' attribute.
	 * @see #setNatGatewayProviderWithNatProviderAsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_ec2_NatGatewayProviderWithNatProviderAsReference()
	 * @model
	 * @generated
	 */
	String getNatGatewayProviderWithNatProviderAsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getNatGatewayProviderWithNatProviderAsReference <em>Nat Gateway Provider With Nat Provider As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nat Gateway Provider With Nat Provider As Reference</em>' attribute.
	 * @see #getNatGatewayProviderWithNatProviderAsReference()
	 * @generated
	 */
	void setNatGatewayProviderWithNatProviderAsReference(String value);

	/**
	 * Returns the value of the '<em><b>Nat Gateways</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nat Gateways</em>' attribute.
	 * @see #setNatGateways(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_ec2_NatGateways()
	 * @model
	 * @generated
	 */
	int getNatGateways();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getNatGateways <em>Nat Gateways</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nat Gateways</em>' attribute.
	 * @see #getNatGateways()
	 * @generated
	 */
	void setNatGateways(int value);

	/**
	 * Returns the value of the '<em><b>Nat Gateway Subnets With Subnet Selection As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nat Gateway Subnets With Subnet Selection As Reference</em>' attribute.
	 * @see #setNatGatewaySubnetsWithSubnetSelectionAsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_ec2_NatGatewaySubnetsWithSubnetSelectionAsReference()
	 * @model
	 * @generated
	 */
	String getNatGatewaySubnetsWithSubnetSelectionAsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getNatGatewaySubnetsWithSubnetSelectionAsReference <em>Nat Gateway Subnets With Subnet Selection As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nat Gateway Subnets With Subnet Selection As Reference</em>' attribute.
	 * @see #getNatGatewaySubnetsWithSubnetSelectionAsReference()
	 * @generated
	 */
	void setNatGatewaySubnetsWithSubnetSelectionAsReference(String value);

	/**
	 * Returns the value of the '<em><b>Subnet Configuration As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnet Configuration As List</em>' attribute.
	 * @see #setSubnetConfigurationAsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_ec2_SubnetConfigurationAsList()
	 * @model
	 * @generated
	 */
	String getSubnetConfigurationAsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getSubnetConfigurationAsList <em>Subnet Configuration As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnet Configuration As List</em>' attribute.
	 * @see #getSubnetConfigurationAsList()
	 * @generated
	 */
	void setSubnetConfigurationAsList(String value);

	/**
	 * Returns the value of the '<em><b>Vpn Connections As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpn Connections As Map</em>' attribute.
	 * @see #setVpnConnectionsAsMap(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_ec2_VpnConnectionsAsMap()
	 * @model
	 * @generated
	 */
	String getVpnConnectionsAsMap();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getVpnConnectionsAsMap <em>Vpn Connections As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpn Connections As Map</em>' attribute.
	 * @see #getVpnConnectionsAsMap()
	 * @generated
	 */
	void setVpnConnectionsAsMap(String value);

	/**
	 * Returns the value of the '<em><b>Vpn Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpn Gateway</em>' attribute.
	 * @see #setVpnGateway(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_ec2_VpnGateway()
	 * @model
	 * @generated
	 */
	Boolean getVpnGateway();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getVpnGateway <em>Vpn Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpn Gateway</em>' attribute.
	 * @see #getVpnGateway()
	 * @generated
	 */
	void setVpnGateway(Boolean value);

	/**
	 * Returns the value of the '<em><b>Vpn Gateway Asn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpn Gateway Asn</em>' attribute.
	 * @see #setVpnGatewayAsn(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_ec2_VpnGatewayAsn()
	 * @model
	 * @generated
	 */
	int getVpnGatewayAsn();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getVpnGatewayAsn <em>Vpn Gateway Asn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpn Gateway Asn</em>' attribute.
	 * @see #getVpnGatewayAsn()
	 * @generated
	 */
	void setVpnGatewayAsn(int value);

	/**
	 * Returns the value of the '<em><b>Vpn Route Propagation As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpn Route Propagation As List</em>' attribute.
	 * @see #setVpnRoutePropagationAsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_ec2_VpnRoutePropagationAsList()
	 * @model
	 * @generated
	 */
	String getVpnRoutePropagationAsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getVpnRoutePropagationAsList <em>Vpn Route Propagation As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpn Route Propagation As List</em>' attribute.
	 * @see #getVpnRoutePropagationAsList()
	 * @generated
	 */
	void setVpnRoutePropagationAsList(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ec2.Vpc"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_ec2_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ec2.Vpc" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_ec2_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getVarName <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Name</em>' attribute.
	 * @see #getVarName()
	 * @generated
	 */
	void setVarName(String value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_ec2_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Code</em>' attribute.
	 * @see #setAdditionalCode(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_ec2_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

	/**
	 * Returns the value of the '<em><b>Subnetbuilder ec2</b></em>' containment reference list.
	 * The list contents are of type {@link com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnetbuilder ec2</em>' containment reference list.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_ec2_Subnetbuilder_ec2()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubnetBuilder_ec2> getSubnetbuilder_ec2();

	/**
	 * Returns the value of the '<em><b>Securitygroupbuilder ec2</b></em>' containment reference list.
	 * The list contents are of type {@link com.amazon.aws.workbench.model.awsworkbench.SecurityGroupBuilder_ec2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securitygroupbuilder ec2</em>' containment reference list.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_ec2_Securitygroupbuilder_ec2()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityGroupBuilder_ec2> getSecuritygroupbuilder_ec2();

	/**
	 * Returns the value of the '<em><b>Privatesubnetbuilder ec2</b></em>' containment reference list.
	 * The list contents are of type {@link com.amazon.aws.workbench.model.awsworkbench.PrivateSubnetBuilder_ec2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Privatesubnetbuilder ec2</em>' containment reference list.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_ec2_Privatesubnetbuilder_ec2()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrivateSubnetBuilder_ec2> getPrivatesubnetbuilder_ec2();

	/**
	 * Returns the value of the '<em><b>Publicsubnetbuilder ec2</b></em>' containment reference list.
	 * The list contents are of type {@link com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publicsubnetbuilder ec2</em>' containment reference list.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVpcBuilder_ec2_Publicsubnetbuilder_ec2()
	 * @model containment="true"
	 * @generated
	 */
	EList<PublicSubnetBuilder_ec2> getPublicsubnetbuilder_ec2();

} // VpcBuilder_ec2
