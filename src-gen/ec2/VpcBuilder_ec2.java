/**
 */
package ec2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vpc Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ec2.VpcBuilder_ec2#getCidr_java_lang_String_ <em>Cidr java lang String </em>}</li>
 *   <li>{@link ec2.VpcBuilder_ec2#getDefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_ <em>Default Instance Tenancy software amazon awscdk services ec2 Default Instance Tenancy </em>}</li>
 *   <li>{@link ec2.VpcBuilder_ec2#getEnableDnsHostnames_java_lang_Boolean_ <em>Enable Dns Hostnames java lang Boolean </em>}</li>
 *   <li>{@link ec2.VpcBuilder_ec2#getEnableDnsSupport_java_lang_Boolean_ <em>Enable Dns Support java lang Boolean </em>}</li>
 *   <li>{@link ec2.VpcBuilder_ec2#getFlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap <em>Flow Logs java lang String software amazon awscdk services ec2 Flow Log Options As Map</em>}</li>
 *   <li>{@link ec2.VpcBuilder_ec2#getGatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap <em>Gateway Endpoints java lang String software amazon awscdk services ec2 Gateway Vpc Endpoint Options As Map</em>}</li>
 *   <li>{@link ec2.VpcBuilder_ec2#getMaxAzs_java_lang_Number_ <em>Max Azs java lang Number </em>}</li>
 *   <li>{@link ec2.VpcBuilder_ec2#getNatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference <em>Nat Gateway Provider With Nat Provider software amazon awscdk services ec2 Nat Provider As Reference</em>}</li>
 *   <li>{@link ec2.VpcBuilder_ec2#getNatGateways_java_lang_Number_ <em>Nat Gateways java lang Number </em>}</li>
 *   <li>{@link ec2.VpcBuilder_ec2#getNatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Nat Gateway Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}</li>
 *   <li>{@link ec2.VpcBuilder_ec2#getSubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList <em>Subnet Configuration software amazon awscdk services ec2 Subnet Configuration As List</em>}</li>
 *   <li>{@link ec2.VpcBuilder_ec2#getVpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap <em>Vpn Connections java lang String software amazon awscdk services ec2 Vpn Connection Options As Map</em>}</li>
 *   <li>{@link ec2.VpcBuilder_ec2#getVpnGateway_java_lang_Boolean_ <em>Vpn Gateway java lang Boolean </em>}</li>
 *   <li>{@link ec2.VpcBuilder_ec2#getVpnGatewayAsn_java_lang_Number_ <em>Vpn Gateway Asn java lang Number </em>}</li>
 *   <li>{@link ec2.VpcBuilder_ec2#getVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList <em>Vpn Route Propagation software amazon awscdk services ec2 Subnet Selection As List</em>}</li>
 *   <li>{@link ec2.VpcBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.VpcBuilder_ec2#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.VpcBuilder_ec2#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.VpcBuilder_ec2#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see ec2.Ec2Package#getVpcBuilder_ec2()
 * @model
 * @generated
 */
public interface VpcBuilder_ec2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Cidr java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cidr java lang String </em>' attribute.
	 * @see #setCidr_java_lang_String_(String)
	 * @see ec2.Ec2Package#getVpcBuilder_ec2_Cidr_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getCidr_java_lang_String_();

	/**
	 * Sets the value of the '{@link ec2.VpcBuilder_ec2#getCidr_java_lang_String_ <em>Cidr java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cidr java lang String </em>' attribute.
	 * @see #getCidr_java_lang_String_()
	 * @generated
	 */
	void setCidr_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Default Instance Tenancy software amazon awscdk services ec2 Default Instance Tenancy </b></em>' attribute.
	 * The literals are from the enumeration {@link ec2.DefaultInstanceTenancy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Instance Tenancy software amazon awscdk services ec2 Default Instance Tenancy </em>' attribute.
	 * @see ec2.DefaultInstanceTenancy
	 * @see #setDefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_(DefaultInstanceTenancy)
	 * @see ec2.Ec2Package#getVpcBuilder_ec2_DefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_()
	 * @model dataType="ec2.DefaultInstanceTenancy"
	 * @generated
	 */
	DefaultInstanceTenancy getDefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_();

	/**
	 * Sets the value of the '{@link ec2.VpcBuilder_ec2#getDefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_ <em>Default Instance Tenancy software amazon awscdk services ec2 Default Instance Tenancy </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Instance Tenancy software amazon awscdk services ec2 Default Instance Tenancy </em>' attribute.
	 * @see ec2.DefaultInstanceTenancy
	 * @see #getDefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_()
	 * @generated
	 */
	void setDefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_(
			DefaultInstanceTenancy value);

	/**
	 * Returns the value of the '<em><b>Enable Dns Hostnames java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Dns Hostnames java lang Boolean </em>' attribute.
	 * @see #setEnableDnsHostnames_java_lang_Boolean_(Boolean)
	 * @see ec2.Ec2Package#getVpcBuilder_ec2_EnableDnsHostnames_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getEnableDnsHostnames_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link ec2.VpcBuilder_ec2#getEnableDnsHostnames_java_lang_Boolean_ <em>Enable Dns Hostnames java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Dns Hostnames java lang Boolean </em>' attribute.
	 * @see #getEnableDnsHostnames_java_lang_Boolean_()
	 * @generated
	 */
	void setEnableDnsHostnames_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Enable Dns Support java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Dns Support java lang Boolean </em>' attribute.
	 * @see #setEnableDnsSupport_java_lang_Boolean_(Boolean)
	 * @see ec2.Ec2Package#getVpcBuilder_ec2_EnableDnsSupport_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getEnableDnsSupport_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link ec2.VpcBuilder_ec2#getEnableDnsSupport_java_lang_Boolean_ <em>Enable Dns Support java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Dns Support java lang Boolean </em>' attribute.
	 * @see #getEnableDnsSupport_java_lang_Boolean_()
	 * @generated
	 */
	void setEnableDnsSupport_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Flow Logs java lang String software amazon awscdk services ec2 Flow Log Options As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Logs java lang String software amazon awscdk services ec2 Flow Log Options As Map</em>' attribute.
	 * @see #setFlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap(String)
	 * @see ec2.Ec2Package#getVpcBuilder_ec2_FlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap()
	 * @model
	 * @generated
	 */
	String getFlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap();

	/**
	 * Sets the value of the '{@link ec2.VpcBuilder_ec2#getFlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap <em>Flow Logs java lang String software amazon awscdk services ec2 Flow Log Options As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Logs java lang String software amazon awscdk services ec2 Flow Log Options As Map</em>' attribute.
	 * @see #getFlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap()
	 * @generated
	 */
	void setFlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap(String value);

	/**
	 * Returns the value of the '<em><b>Gateway Endpoints java lang String software amazon awscdk services ec2 Gateway Vpc Endpoint Options As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway Endpoints java lang String software amazon awscdk services ec2 Gateway Vpc Endpoint Options As Map</em>' attribute.
	 * @see #setGatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap(String)
	 * @see ec2.Ec2Package#getVpcBuilder_ec2_GatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap()
	 * @model
	 * @generated
	 */
	String getGatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap();

	/**
	 * Sets the value of the '{@link ec2.VpcBuilder_ec2#getGatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap <em>Gateway Endpoints java lang String software amazon awscdk services ec2 Gateway Vpc Endpoint Options As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway Endpoints java lang String software amazon awscdk services ec2 Gateway Vpc Endpoint Options As Map</em>' attribute.
	 * @see #getGatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap()
	 * @generated
	 */
	void setGatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap(
			String value);

	/**
	 * Returns the value of the '<em><b>Max Azs java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Azs java lang Number </em>' attribute.
	 * @see #setMaxAzs_java_lang_Number_(int)
	 * @see ec2.Ec2Package#getVpcBuilder_ec2_MaxAzs_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getMaxAzs_java_lang_Number_();

	/**
	 * Sets the value of the '{@link ec2.VpcBuilder_ec2#getMaxAzs_java_lang_Number_ <em>Max Azs java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Azs java lang Number </em>' attribute.
	 * @see #getMaxAzs_java_lang_Number_()
	 * @generated
	 */
	void setMaxAzs_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Nat Gateway Provider With Nat Provider software amazon awscdk services ec2 Nat Provider As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nat Gateway Provider With Nat Provider software amazon awscdk services ec2 Nat Provider As Reference</em>' attribute.
	 * @see #setNatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference(String)
	 * @see ec2.Ec2Package#getVpcBuilder_ec2_NatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference()
	 * @model
	 * @generated
	 */
	String getNatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference();

	/**
	 * Sets the value of the '{@link ec2.VpcBuilder_ec2#getNatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference <em>Nat Gateway Provider With Nat Provider software amazon awscdk services ec2 Nat Provider As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nat Gateway Provider With Nat Provider software amazon awscdk services ec2 Nat Provider As Reference</em>' attribute.
	 * @see #getNatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference()
	 * @generated
	 */
	void setNatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Nat Gateways java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nat Gateways java lang Number </em>' attribute.
	 * @see #setNatGateways_java_lang_Number_(int)
	 * @see ec2.Ec2Package#getVpcBuilder_ec2_NatGateways_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getNatGateways_java_lang_Number_();

	/**
	 * Sets the value of the '{@link ec2.VpcBuilder_ec2#getNatGateways_java_lang_Number_ <em>Nat Gateways java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nat Gateways java lang Number </em>' attribute.
	 * @see #getNatGateways_java_lang_Number_()
	 * @generated
	 */
	void setNatGateways_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Nat Gateway Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nat Gateway Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>' attribute.
	 * @see #setNatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(String)
	 * @see ec2.Ec2Package#getVpcBuilder_ec2_NatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @model
	 * @generated
	 */
	String getNatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();

	/**
	 * Sets the value of the '{@link ec2.VpcBuilder_ec2#getNatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Nat Gateway Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nat Gateway Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>' attribute.
	 * @see #getNatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @generated
	 */
	void setNatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Subnet Configuration software amazon awscdk services ec2 Subnet Configuration As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnet Configuration software amazon awscdk services ec2 Subnet Configuration As List</em>' attribute.
	 * @see #setSubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList(String)
	 * @see ec2.Ec2Package#getVpcBuilder_ec2_SubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList()
	 * @model
	 * @generated
	 */
	String getSubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList();

	/**
	 * Sets the value of the '{@link ec2.VpcBuilder_ec2#getSubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList <em>Subnet Configuration software amazon awscdk services ec2 Subnet Configuration As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnet Configuration software amazon awscdk services ec2 Subnet Configuration As List</em>' attribute.
	 * @see #getSubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList()
	 * @generated
	 */
	void setSubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Vpn Connections java lang String software amazon awscdk services ec2 Vpn Connection Options As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpn Connections java lang String software amazon awscdk services ec2 Vpn Connection Options As Map</em>' attribute.
	 * @see #setVpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap(String)
	 * @see ec2.Ec2Package#getVpcBuilder_ec2_VpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap()
	 * @model
	 * @generated
	 */
	String getVpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap();

	/**
	 * Sets the value of the '{@link ec2.VpcBuilder_ec2#getVpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap <em>Vpn Connections java lang String software amazon awscdk services ec2 Vpn Connection Options As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpn Connections java lang String software amazon awscdk services ec2 Vpn Connection Options As Map</em>' attribute.
	 * @see #getVpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap()
	 * @generated
	 */
	void setVpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap(
			String value);

	/**
	 * Returns the value of the '<em><b>Vpn Gateway java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpn Gateway java lang Boolean </em>' attribute.
	 * @see #setVpnGateway_java_lang_Boolean_(Boolean)
	 * @see ec2.Ec2Package#getVpcBuilder_ec2_VpnGateway_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getVpnGateway_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link ec2.VpcBuilder_ec2#getVpnGateway_java_lang_Boolean_ <em>Vpn Gateway java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpn Gateway java lang Boolean </em>' attribute.
	 * @see #getVpnGateway_java_lang_Boolean_()
	 * @generated
	 */
	void setVpnGateway_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Vpn Gateway Asn java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpn Gateway Asn java lang Number </em>' attribute.
	 * @see #setVpnGatewayAsn_java_lang_Number_(int)
	 * @see ec2.Ec2Package#getVpcBuilder_ec2_VpnGatewayAsn_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getVpnGatewayAsn_java_lang_Number_();

	/**
	 * Sets the value of the '{@link ec2.VpcBuilder_ec2#getVpnGatewayAsn_java_lang_Number_ <em>Vpn Gateway Asn java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpn Gateway Asn java lang Number </em>' attribute.
	 * @see #getVpnGatewayAsn_java_lang_Number_()
	 * @generated
	 */
	void setVpnGatewayAsn_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Vpn Route Propagation software amazon awscdk services ec2 Subnet Selection As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpn Route Propagation software amazon awscdk services ec2 Subnet Selection As List</em>' attribute.
	 * @see #setVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList(String)
	 * @see ec2.Ec2Package#getVpcBuilder_ec2_VpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList()
	 * @model
	 * @generated
	 */
	String getVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList();

	/**
	 * Sets the value of the '{@link ec2.VpcBuilder_ec2#getVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList <em>Vpn Route Propagation software amazon awscdk services ec2 Subnet Selection As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpn Route Propagation software amazon awscdk services ec2 Subnet Selection As List</em>' attribute.
	 * @see #getVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList()
	 * @generated
	 */
	void setVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ec2.Vpc"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see ec2.Ec2Package#getVpcBuilder_ec2_GeneratedClassName()
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
	 * @see ec2.Ec2Package#getVpcBuilder_ec2_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link ec2.VpcBuilder_ec2#getVarName <em>Var Name</em>}' attribute.
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
	 * @see ec2.Ec2Package#getVpcBuilder_ec2_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link ec2.VpcBuilder_ec2#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see ec2.Ec2Package#getVpcBuilder_ec2_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link ec2.VpcBuilder_ec2#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // VpcBuilder_ec2
