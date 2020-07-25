/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.DefaultInstanceTenancy;
import com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2;
import com.amazon.aws.workbench.model.awsworkbench.SubnetConfigurationBuilder_ec2;
import com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2;
import com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2;
import com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2;
import com.amazon.aws.workbench.model.awsworkbench.VpnTunnelOptionBuilder_ec2;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vpc Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getCidr_java_lang_String_ <em>Cidr java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getDefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_ <em>Default Instance Tenancy software amazon awscdk services ec2 Default Instance Tenancy </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getEnableDnsHostnames_java_lang_Boolean_ <em>Enable Dns Hostnames java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getEnableDnsSupport_java_lang_Boolean_ <em>Enable Dns Support java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getFlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap <em>Flow Logs java lang String software amazon awscdk services ec2 Flow Log Options As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getGatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap <em>Gateway Endpoints java lang String software amazon awscdk services ec2 Gateway Vpc Endpoint Options As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getMaxAzs_java_lang_Number_ <em>Max Azs java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getNatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference <em>Nat Gateway Provider With Nat Provider software amazon awscdk services ec2 Nat Provider As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getNatGateways_java_lang_Number_ <em>Nat Gateways java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getNatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Nat Gateway Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getSubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList <em>Subnet Configuration software amazon awscdk services ec2 Subnet Configuration As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getVpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap <em>Vpn Connections java lang String software amazon awscdk services ec2 Vpn Connection Options As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getVpnGateway_java_lang_Boolean_ <em>Vpn Gateway java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getVpnGatewayAsn_java_lang_Number_ <em>Vpn Gateway Asn java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList <em>Vpn Route Propagation software amazon awscdk services ec2 Subnet Selection As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getSubnetbuilder_ec2 <em>Subnetbuilder ec2</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getSubnetselectionbuilder_ec2 <em>Subnetselectionbuilder ec2</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getSubnetconfigurationbuilder_ec2 <em>Subnetconfigurationbuilder ec2</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getVpntunneloptionbuilder_ec2 <em>Vpntunneloptionbuilder ec2</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getVpnconnectionoptionsbuilder_ec2 <em>Vpnconnectionoptionsbuilder ec2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VpcBuilder_ec2Impl extends ServiceResourcesImpl implements VpcBuilder_ec2 {
	/**
	 * The default value of the '{@link #getCidr_java_lang_String_() <em>Cidr java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidr_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String CIDR_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCidr_java_lang_String_() <em>Cidr java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidr_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String cidr_java_lang_String_ = CIDR_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_() <em>Default Instance Tenancy software amazon awscdk services ec2 Default Instance Tenancy </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_()
	 * @generated
	 * @ordered
	 */
	protected static final DefaultInstanceTenancy DEFAULT_INSTANCE_TENANCY_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_DEFAULT_INSTANCE_TENANCY__EDEFAULT = DefaultInstanceTenancy.DEFAULT;

	/**
	 * The cached value of the '{@link #getDefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_() <em>Default Instance Tenancy software amazon awscdk services ec2 Default Instance Tenancy </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_()
	 * @generated
	 * @ordered
	 */
	protected DefaultInstanceTenancy defaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_ = DEFAULT_INSTANCE_TENANCY_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_DEFAULT_INSTANCE_TENANCY__EDEFAULT;

	/**
	 * The default value of the '{@link #getEnableDnsHostnames_java_lang_Boolean_() <em>Enable Dns Hostnames java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableDnsHostnames_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ENABLE_DNS_HOSTNAMES_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnableDnsHostnames_java_lang_Boolean_() <em>Enable Dns Hostnames java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableDnsHostnames_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean enableDnsHostnames_java_lang_Boolean_ = ENABLE_DNS_HOSTNAMES_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getEnableDnsSupport_java_lang_Boolean_() <em>Enable Dns Support java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableDnsSupport_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ENABLE_DNS_SUPPORT_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnableDnsSupport_java_lang_Boolean_() <em>Enable Dns Support java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableDnsSupport_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean enableDnsSupport_java_lang_Boolean_ = ENABLE_DNS_SUPPORT_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getFlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap() <em>Flow Logs java lang String software amazon awscdk services ec2 Flow Log Options As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String FLOW_LOGS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_OPTIONS_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap() <em>Flow Logs java lang String software amazon awscdk services ec2 Flow Log Options As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String flowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap = FLOW_LOGS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_OPTIONS_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getGatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap() <em>Gateway Endpoints java lang String software amazon awscdk services ec2 Gateway Vpc Endpoint Options As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String GATEWAY_ENDPOINTS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_GATEWAY_VPC_ENDPOINT_OPTIONS_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap() <em>Gateway Endpoints java lang String software amazon awscdk services ec2 Gateway Vpc Endpoint Options As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String gatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap = GATEWAY_ENDPOINTS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_GATEWAY_VPC_ENDPOINT_OPTIONS_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxAzs_java_lang_Number_() <em>Max Azs java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAzs_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_AZS_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxAzs_java_lang_Number_() <em>Max Azs java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAzs_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int maxAzs_java_lang_Number_ = MAX_AZS_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getNatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference() <em>Nat Gateway Provider With Nat Provider software amazon awscdk services ec2 Nat Provider As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_NAT_PROVIDER_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference() <em>Nat Gateway Provider With Nat Provider software amazon awscdk services ec2 Nat Provider As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String natGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference = NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_NAT_PROVIDER_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNatGateways_java_lang_Number_() <em>Nat Gateways java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatGateways_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int NAT_GATEWAYS_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNatGateways_java_lang_Number_() <em>Nat Gateways java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatGateways_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int natGateways_java_lang_Number_ = NAT_GATEWAYS_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getNatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() <em>Nat Gateway Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() <em>Nat Gateway Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String natGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference = NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList() <em>Subnet Configuration software amazon awscdk services ec2 Subnet Configuration As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNET_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_CONFIGURATION_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList() <em>Subnet Configuration software amazon awscdk services ec2 Subnet Configuration As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList()
	 * @generated
	 * @ordered
	 */
	protected String subnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList = SUBNET_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_CONFIGURATION_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getVpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap() <em>Vpn Connections java lang String software amazon awscdk services ec2 Vpn Connection Options As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String VPN_CONNECTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_CONNECTION_OPTIONS_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap() <em>Vpn Connections java lang String software amazon awscdk services ec2 Vpn Connection Options As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String vpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap = VPN_CONNECTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_CONNECTION_OPTIONS_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getVpnGateway_java_lang_Boolean_() <em>Vpn Gateway java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpnGateway_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean VPN_GATEWAY_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpnGateway_java_lang_Boolean_() <em>Vpn Gateway java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpnGateway_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean vpnGateway_java_lang_Boolean_ = VPN_GATEWAY_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getVpnGatewayAsn_java_lang_Number_() <em>Vpn Gateway Asn java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpnGatewayAsn_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int VPN_GATEWAY_ASN_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVpnGatewayAsn_java_lang_Number_() <em>Vpn Gateway Asn java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpnGatewayAsn_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int vpnGatewayAsn_java_lang_Number_ = VPN_GATEWAY_ASN_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList() <em>Vpn Route Propagation software amazon awscdk services ec2 Subnet Selection As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String VPN_ROUTE_PROPAGATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList() <em>Vpn Route Propagation software amazon awscdk services ec2 Subnet Selection As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList()
	 * @generated
	 * @ordered
	 */
	protected String vpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList = VPN_ROUTE_PROPAGATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.Vpc";

	/**
	 * The cached value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected String generatedClassName = GENERATED_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected String varName = VAR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalCode() <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalCode() <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCode()
	 * @generated
	 * @ordered
	 */
	protected String additionalCode = ADDITIONAL_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubnetbuilder_ec2() <em>Subnetbuilder ec2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetbuilder_ec2()
	 * @generated
	 * @ordered
	 */
	protected EList<SubnetBuilder_ec2> subnetbuilder_ec2;

	/**
	 * The cached value of the '{@link #getSubnetselectionbuilder_ec2() <em>Subnetselectionbuilder ec2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetselectionbuilder_ec2()
	 * @generated
	 * @ordered
	 */
	protected EList<SubnetSelectionBuilder_ec2> subnetselectionbuilder_ec2;

	/**
	 * The cached value of the '{@link #getSubnetconfigurationbuilder_ec2() <em>Subnetconfigurationbuilder ec2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetconfigurationbuilder_ec2()
	 * @generated
	 * @ordered
	 */
	protected EList<SubnetConfigurationBuilder_ec2> subnetconfigurationbuilder_ec2;

	/**
	 * The cached value of the '{@link #getVpntunneloptionbuilder_ec2() <em>Vpntunneloptionbuilder ec2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpntunneloptionbuilder_ec2()
	 * @generated
	 * @ordered
	 */
	protected EList<VpnTunnelOptionBuilder_ec2> vpntunneloptionbuilder_ec2;

	/**
	 * The cached value of the '{@link #getVpnconnectionoptionsbuilder_ec2() <em>Vpnconnectionoptionsbuilder ec2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpnconnectionoptionsbuilder_ec2()
	 * @generated
	 * @ordered
	 */
	protected EList<VpnConnectionOptionsBuilder_ec2> vpnconnectionoptionsbuilder_ec2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VpcBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.VPC_BUILDER_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCidr_java_lang_String_() {
		return cidr_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCidr_java_lang_String_(String newCidr_java_lang_String_) {
		String oldCidr_java_lang_String_ = cidr_java_lang_String_;
		cidr_java_lang_String_ = newCidr_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.VPC_BUILDER_EC2__CIDR_JAVA_LANG_STRING_, oldCidr_java_lang_String_,
					cidr_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefaultInstanceTenancy getDefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_() {
		return defaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_(
			DefaultInstanceTenancy newDefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_) {
		DefaultInstanceTenancy oldDefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_ = defaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_;
		defaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_ = newDefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_ == null
				? DEFAULT_INSTANCE_TENANCY_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_DEFAULT_INSTANCE_TENANCY__EDEFAULT
				: newDefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.VPC_BUILDER_EC2__DEFAULT_INSTANCE_TENANCY_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_DEFAULT_INSTANCE_TENANCY_,
					oldDefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_,
					defaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getEnableDnsHostnames_java_lang_Boolean_() {
		return enableDnsHostnames_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableDnsHostnames_java_lang_Boolean_(Boolean newEnableDnsHostnames_java_lang_Boolean_) {
		Boolean oldEnableDnsHostnames_java_lang_Boolean_ = enableDnsHostnames_java_lang_Boolean_;
		enableDnsHostnames_java_lang_Boolean_ = newEnableDnsHostnames_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.VPC_BUILDER_EC2__ENABLE_DNS_HOSTNAMES_JAVA_LANG_BOOLEAN_,
					oldEnableDnsHostnames_java_lang_Boolean_, enableDnsHostnames_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getEnableDnsSupport_java_lang_Boolean_() {
		return enableDnsSupport_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableDnsSupport_java_lang_Boolean_(Boolean newEnableDnsSupport_java_lang_Boolean_) {
		Boolean oldEnableDnsSupport_java_lang_Boolean_ = enableDnsSupport_java_lang_Boolean_;
		enableDnsSupport_java_lang_Boolean_ = newEnableDnsSupport_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.VPC_BUILDER_EC2__ENABLE_DNS_SUPPORT_JAVA_LANG_BOOLEAN_,
					oldEnableDnsSupport_java_lang_Boolean_, enableDnsSupport_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap() {
		return flowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap(
			String newFlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap) {
		String oldFlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap = flowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap;
		flowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap = newFlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.VPC_BUILDER_EC2__FLOW_LOGS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_OPTIONS_AS_MAP,
					oldFlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap,
					flowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap() {
		return gatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap(
			String newGatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap) {
		String oldGatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap = gatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap;
		gatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap = newGatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.VPC_BUILDER_EC2__GATEWAY_ENDPOINTS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_GATEWAY_VPC_ENDPOINT_OPTIONS_AS_MAP,
					oldGatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap,
					gatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxAzs_java_lang_Number_() {
		return maxAzs_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxAzs_java_lang_Number_(int newMaxAzs_java_lang_Number_) {
		int oldMaxAzs_java_lang_Number_ = maxAzs_java_lang_Number_;
		maxAzs_java_lang_Number_ = newMaxAzs_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.VPC_BUILDER_EC2__MAX_AZS_JAVA_LANG_NUMBER_, oldMaxAzs_java_lang_Number_,
					maxAzs_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference() {
		return natGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference(
			String newNatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference) {
		String oldNatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference = natGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference;
		natGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference = newNatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_NAT_PROVIDER_AS_REFERENCE,
					oldNatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference,
					natGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNatGateways_java_lang_Number_() {
		return natGateways_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNatGateways_java_lang_Number_(int newNatGateways_java_lang_Number_) {
		int oldNatGateways_java_lang_Number_ = natGateways_java_lang_Number_;
		natGateways_java_lang_Number_ = newNatGateways_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAYS_JAVA_LANG_NUMBER_,
					oldNatGateways_java_lang_Number_, natGateways_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() {
		return natGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(
			String newNatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference) {
		String oldNatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference = natGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference;
		natGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference = newNatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE,
					oldNatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference,
					natGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList() {
		return subnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList(
			String newSubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList) {
		String oldSubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList = subnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList;
		subnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList = newSubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNET_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_CONFIGURATION_AS_LIST,
					oldSubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList,
					subnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap() {
		return vpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap(
			String newVpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap) {
		String oldVpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap = vpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap;
		vpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap = newVpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_CONNECTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_CONNECTION_OPTIONS_AS_MAP,
					oldVpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap,
					vpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getVpnGateway_java_lang_Boolean_() {
		return vpnGateway_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpnGateway_java_lang_Boolean_(Boolean newVpnGateway_java_lang_Boolean_) {
		Boolean oldVpnGateway_java_lang_Boolean_ = vpnGateway_java_lang_Boolean_;
		vpnGateway_java_lang_Boolean_ = newVpnGateway_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_GATEWAY_JAVA_LANG_BOOLEAN_,
					oldVpnGateway_java_lang_Boolean_, vpnGateway_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getVpnGatewayAsn_java_lang_Number_() {
		return vpnGatewayAsn_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpnGatewayAsn_java_lang_Number_(int newVpnGatewayAsn_java_lang_Number_) {
		int oldVpnGatewayAsn_java_lang_Number_ = vpnGatewayAsn_java_lang_Number_;
		vpnGatewayAsn_java_lang_Number_ = newVpnGatewayAsn_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_GATEWAY_ASN_JAVA_LANG_NUMBER_,
					oldVpnGatewayAsn_java_lang_Number_, vpnGatewayAsn_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList() {
		return vpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList(
			String newVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList) {
		String oldVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList = vpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList;
		vpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList = newVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_ROUTE_PROPAGATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST,
					oldVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList,
					vpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeneratedClassName() {
		return generatedClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVarName() {
		return varName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVarName(String newVarName) {
		String oldVarName = varName;
		varName = newVarName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.VPC_BUILDER_EC2__VAR_NAME,
					oldVarName, varName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.VPC_BUILDER_EC2__IDENTIFIER,
					oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdditionalCode() {
		return additionalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalCode(String newAdditionalCode) {
		String oldAdditionalCode = additionalCode;
		additionalCode = newAdditionalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.VPC_BUILDER_EC2__ADDITIONAL_CODE,
					oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubnetBuilder_ec2> getSubnetbuilder_ec2() {
		if (subnetbuilder_ec2 == null) {
			subnetbuilder_ec2 = new EObjectContainmentEList<SubnetBuilder_ec2>(SubnetBuilder_ec2.class, this,
					AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNETBUILDER_EC2);
		}
		return subnetbuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubnetSelectionBuilder_ec2> getSubnetselectionbuilder_ec2() {
		if (subnetselectionbuilder_ec2 == null) {
			subnetselectionbuilder_ec2 = new EObjectContainmentEList<SubnetSelectionBuilder_ec2>(
					SubnetSelectionBuilder_ec2.class, this,
					AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNETSELECTIONBUILDER_EC2);
		}
		return subnetselectionbuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubnetConfigurationBuilder_ec2> getSubnetconfigurationbuilder_ec2() {
		if (subnetconfigurationbuilder_ec2 == null) {
			subnetconfigurationbuilder_ec2 = new EObjectContainmentEList<SubnetConfigurationBuilder_ec2>(
					SubnetConfigurationBuilder_ec2.class, this,
					AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNETCONFIGURATIONBUILDER_EC2);
		}
		return subnetconfigurationbuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VpnTunnelOptionBuilder_ec2> getVpntunneloptionbuilder_ec2() {
		if (vpntunneloptionbuilder_ec2 == null) {
			vpntunneloptionbuilder_ec2 = new EObjectContainmentEList<VpnTunnelOptionBuilder_ec2>(
					VpnTunnelOptionBuilder_ec2.class, this,
					AwsworkbenchPackage.VPC_BUILDER_EC2__VPNTUNNELOPTIONBUILDER_EC2);
		}
		return vpntunneloptionbuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VpnConnectionOptionsBuilder_ec2> getVpnconnectionoptionsbuilder_ec2() {
		if (vpnconnectionoptionsbuilder_ec2 == null) {
			vpnconnectionoptionsbuilder_ec2 = new EObjectContainmentEList<VpnConnectionOptionsBuilder_ec2>(
					VpnConnectionOptionsBuilder_ec2.class, this,
					AwsworkbenchPackage.VPC_BUILDER_EC2__VPNCONNECTIONOPTIONSBUILDER_EC2);
		}
		return vpnconnectionoptionsbuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNETBUILDER_EC2:
			return ((InternalEList<?>) getSubnetbuilder_ec2()).basicRemove(otherEnd, msgs);
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNETSELECTIONBUILDER_EC2:
			return ((InternalEList<?>) getSubnetselectionbuilder_ec2()).basicRemove(otherEnd, msgs);
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNETCONFIGURATIONBUILDER_EC2:
			return ((InternalEList<?>) getSubnetconfigurationbuilder_ec2()).basicRemove(otherEnd, msgs);
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPNTUNNELOPTIONBUILDER_EC2:
			return ((InternalEList<?>) getVpntunneloptionbuilder_ec2()).basicRemove(otherEnd, msgs);
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPNCONNECTIONOPTIONSBUILDER_EC2:
			return ((InternalEList<?>) getVpnconnectionoptionsbuilder_ec2()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.VPC_BUILDER_EC2__CIDR_JAVA_LANG_STRING_:
			return getCidr_java_lang_String_();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__DEFAULT_INSTANCE_TENANCY_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_DEFAULT_INSTANCE_TENANCY_:
			return getDefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__ENABLE_DNS_HOSTNAMES_JAVA_LANG_BOOLEAN_:
			return getEnableDnsHostnames_java_lang_Boolean_();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__ENABLE_DNS_SUPPORT_JAVA_LANG_BOOLEAN_:
			return getEnableDnsSupport_java_lang_Boolean_();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__FLOW_LOGS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_OPTIONS_AS_MAP:
			return getFlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__GATEWAY_ENDPOINTS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_GATEWAY_VPC_ENDPOINT_OPTIONS_AS_MAP:
			return getGatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__MAX_AZS_JAVA_LANG_NUMBER_:
			return getMaxAzs_java_lang_Number_();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_NAT_PROVIDER_AS_REFERENCE:
			return getNatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAYS_JAVA_LANG_NUMBER_:
			return getNatGateways_java_lang_Number_();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
			return getNatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNET_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_CONFIGURATION_AS_LIST:
			return getSubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_CONNECTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_CONNECTION_OPTIONS_AS_MAP:
			return getVpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_GATEWAY_JAVA_LANG_BOOLEAN_:
			return getVpnGateway_java_lang_Boolean_();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_GATEWAY_ASN_JAVA_LANG_NUMBER_:
			return getVpnGatewayAsn_java_lang_Number_();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_ROUTE_PROPAGATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST:
			return getVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__ADDITIONAL_CODE:
			return getAdditionalCode();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNETBUILDER_EC2:
			return getSubnetbuilder_ec2();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNETSELECTIONBUILDER_EC2:
			return getSubnetselectionbuilder_ec2();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNETCONFIGURATIONBUILDER_EC2:
			return getSubnetconfigurationbuilder_ec2();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPNTUNNELOPTIONBUILDER_EC2:
			return getVpntunneloptionbuilder_ec2();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPNCONNECTIONOPTIONSBUILDER_EC2:
			return getVpnconnectionoptionsbuilder_ec2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AwsworkbenchPackage.VPC_BUILDER_EC2__CIDR_JAVA_LANG_STRING_:
			setCidr_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__DEFAULT_INSTANCE_TENANCY_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_DEFAULT_INSTANCE_TENANCY_:
			setDefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_(
					(DefaultInstanceTenancy) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__ENABLE_DNS_HOSTNAMES_JAVA_LANG_BOOLEAN_:
			setEnableDnsHostnames_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__ENABLE_DNS_SUPPORT_JAVA_LANG_BOOLEAN_:
			setEnableDnsSupport_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__FLOW_LOGS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_OPTIONS_AS_MAP:
			setFlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap((String) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__GATEWAY_ENDPOINTS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_GATEWAY_VPC_ENDPOINT_OPTIONS_AS_MAP:
			setGatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap(
					(String) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__MAX_AZS_JAVA_LANG_NUMBER_:
			setMaxAzs_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_NAT_PROVIDER_AS_REFERENCE:
			setNatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAYS_JAVA_LANG_NUMBER_:
			setNatGateways_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
			setNatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNET_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_CONFIGURATION_AS_LIST:
			setSubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_CONNECTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_CONNECTION_OPTIONS_AS_MAP:
			setVpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap(
					(String) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_GATEWAY_JAVA_LANG_BOOLEAN_:
			setVpnGateway_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_GATEWAY_ASN_JAVA_LANG_NUMBER_:
			setVpnGatewayAsn_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_ROUTE_PROPAGATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST:
			setVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__ADDITIONAL_CODE:
			setAdditionalCode((String) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNETBUILDER_EC2:
			getSubnetbuilder_ec2().clear();
			getSubnetbuilder_ec2().addAll((Collection<? extends SubnetBuilder_ec2>) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNETSELECTIONBUILDER_EC2:
			getSubnetselectionbuilder_ec2().clear();
			getSubnetselectionbuilder_ec2().addAll((Collection<? extends SubnetSelectionBuilder_ec2>) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNETCONFIGURATIONBUILDER_EC2:
			getSubnetconfigurationbuilder_ec2().clear();
			getSubnetconfigurationbuilder_ec2().addAll((Collection<? extends SubnetConfigurationBuilder_ec2>) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPNTUNNELOPTIONBUILDER_EC2:
			getVpntunneloptionbuilder_ec2().clear();
			getVpntunneloptionbuilder_ec2().addAll((Collection<? extends VpnTunnelOptionBuilder_ec2>) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPNCONNECTIONOPTIONSBUILDER_EC2:
			getVpnconnectionoptionsbuilder_ec2().clear();
			getVpnconnectionoptionsbuilder_ec2()
					.addAll((Collection<? extends VpnConnectionOptionsBuilder_ec2>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case AwsworkbenchPackage.VPC_BUILDER_EC2__CIDR_JAVA_LANG_STRING_:
			setCidr_java_lang_String_(CIDR_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__DEFAULT_INSTANCE_TENANCY_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_DEFAULT_INSTANCE_TENANCY_:
			setDefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_(
					DEFAULT_INSTANCE_TENANCY_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_DEFAULT_INSTANCE_TENANCY__EDEFAULT);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__ENABLE_DNS_HOSTNAMES_JAVA_LANG_BOOLEAN_:
			setEnableDnsHostnames_java_lang_Boolean_(ENABLE_DNS_HOSTNAMES_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__ENABLE_DNS_SUPPORT_JAVA_LANG_BOOLEAN_:
			setEnableDnsSupport_java_lang_Boolean_(ENABLE_DNS_SUPPORT_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__FLOW_LOGS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_OPTIONS_AS_MAP:
			setFlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap(
					FLOW_LOGS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_OPTIONS_AS_MAP_EDEFAULT);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__GATEWAY_ENDPOINTS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_GATEWAY_VPC_ENDPOINT_OPTIONS_AS_MAP:
			setGatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap(
					GATEWAY_ENDPOINTS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_GATEWAY_VPC_ENDPOINT_OPTIONS_AS_MAP_EDEFAULT);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__MAX_AZS_JAVA_LANG_NUMBER_:
			setMaxAzs_java_lang_Number_(MAX_AZS_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_NAT_PROVIDER_AS_REFERENCE:
			setNatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference(
					NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_NAT_PROVIDER_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAYS_JAVA_LANG_NUMBER_:
			setNatGateways_java_lang_Number_(NAT_GATEWAYS_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
			setNatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(
					NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNET_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_CONFIGURATION_AS_LIST:
			setSubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList(
					SUBNET_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_CONFIGURATION_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_CONNECTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_CONNECTION_OPTIONS_AS_MAP:
			setVpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap(
					VPN_CONNECTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_CONNECTION_OPTIONS_AS_MAP_EDEFAULT);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_GATEWAY_JAVA_LANG_BOOLEAN_:
			setVpnGateway_java_lang_Boolean_(VPN_GATEWAY_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_GATEWAY_ASN_JAVA_LANG_NUMBER_:
			setVpnGatewayAsn_java_lang_Number_(VPN_GATEWAY_ASN_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_ROUTE_PROPAGATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST:
			setVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList(
					VPN_ROUTE_PROPAGATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__ADDITIONAL_CODE:
			setAdditionalCode(ADDITIONAL_CODE_EDEFAULT);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNETBUILDER_EC2:
			getSubnetbuilder_ec2().clear();
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNETSELECTIONBUILDER_EC2:
			getSubnetselectionbuilder_ec2().clear();
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNETCONFIGURATIONBUILDER_EC2:
			getSubnetconfigurationbuilder_ec2().clear();
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPNTUNNELOPTIONBUILDER_EC2:
			getVpntunneloptionbuilder_ec2().clear();
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPNCONNECTIONOPTIONSBUILDER_EC2:
			getVpnconnectionoptionsbuilder_ec2().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AwsworkbenchPackage.VPC_BUILDER_EC2__CIDR_JAVA_LANG_STRING_:
			return CIDR_JAVA_LANG_STRING__EDEFAULT == null ? cidr_java_lang_String_ != null
					: !CIDR_JAVA_LANG_STRING__EDEFAULT.equals(cidr_java_lang_String_);
		case AwsworkbenchPackage.VPC_BUILDER_EC2__DEFAULT_INSTANCE_TENANCY_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_DEFAULT_INSTANCE_TENANCY_:
			return defaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_ != DEFAULT_INSTANCE_TENANCY_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_DEFAULT_INSTANCE_TENANCY__EDEFAULT;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__ENABLE_DNS_HOSTNAMES_JAVA_LANG_BOOLEAN_:
			return ENABLE_DNS_HOSTNAMES_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? enableDnsHostnames_java_lang_Boolean_ != null
					: !ENABLE_DNS_HOSTNAMES_JAVA_LANG_BOOLEAN__EDEFAULT.equals(enableDnsHostnames_java_lang_Boolean_);
		case AwsworkbenchPackage.VPC_BUILDER_EC2__ENABLE_DNS_SUPPORT_JAVA_LANG_BOOLEAN_:
			return ENABLE_DNS_SUPPORT_JAVA_LANG_BOOLEAN__EDEFAULT == null ? enableDnsSupport_java_lang_Boolean_ != null
					: !ENABLE_DNS_SUPPORT_JAVA_LANG_BOOLEAN__EDEFAULT.equals(enableDnsSupport_java_lang_Boolean_);
		case AwsworkbenchPackage.VPC_BUILDER_EC2__FLOW_LOGS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_OPTIONS_AS_MAP:
			return FLOW_LOGS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_OPTIONS_AS_MAP_EDEFAULT == null
					? flowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap != null
					: !FLOW_LOGS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_OPTIONS_AS_MAP_EDEFAULT
							.equals(flowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap);
		case AwsworkbenchPackage.VPC_BUILDER_EC2__GATEWAY_ENDPOINTS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_GATEWAY_VPC_ENDPOINT_OPTIONS_AS_MAP:
			return GATEWAY_ENDPOINTS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_GATEWAY_VPC_ENDPOINT_OPTIONS_AS_MAP_EDEFAULT == null
					? gatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap != null
					: !GATEWAY_ENDPOINTS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_GATEWAY_VPC_ENDPOINT_OPTIONS_AS_MAP_EDEFAULT
							.equals(gatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap);
		case AwsworkbenchPackage.VPC_BUILDER_EC2__MAX_AZS_JAVA_LANG_NUMBER_:
			return maxAzs_java_lang_Number_ != MAX_AZS_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_NAT_PROVIDER_AS_REFERENCE:
			return NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_NAT_PROVIDER_AS_REFERENCE_EDEFAULT == null
					? natGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference != null
					: !NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_NAT_PROVIDER_AS_REFERENCE_EDEFAULT
							.equals(natGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference);
		case AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAYS_JAVA_LANG_NUMBER_:
			return natGateways_java_lang_Number_ != NAT_GATEWAYS_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
			return NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT == null
					? natGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference != null
					: !NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT
							.equals(natGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference);
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNET_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_CONFIGURATION_AS_LIST:
			return SUBNET_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_CONFIGURATION_AS_LIST_EDEFAULT == null
					? subnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList != null
					: !SUBNET_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_CONFIGURATION_AS_LIST_EDEFAULT
							.equals(subnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList);
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_CONNECTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_CONNECTION_OPTIONS_AS_MAP:
			return VPN_CONNECTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_CONNECTION_OPTIONS_AS_MAP_EDEFAULT == null
					? vpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap != null
					: !VPN_CONNECTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_CONNECTION_OPTIONS_AS_MAP_EDEFAULT
							.equals(vpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap);
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_GATEWAY_JAVA_LANG_BOOLEAN_:
			return VPN_GATEWAY_JAVA_LANG_BOOLEAN__EDEFAULT == null ? vpnGateway_java_lang_Boolean_ != null
					: !VPN_GATEWAY_JAVA_LANG_BOOLEAN__EDEFAULT.equals(vpnGateway_java_lang_Boolean_);
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_GATEWAY_ASN_JAVA_LANG_NUMBER_:
			return vpnGatewayAsn_java_lang_Number_ != VPN_GATEWAY_ASN_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_ROUTE_PROPAGATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST:
			return VPN_ROUTE_PROPAGATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST_EDEFAULT == null
					? vpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList != null
					: !VPN_ROUTE_PROPAGATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST_EDEFAULT
							.equals(vpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList);
		case AwsworkbenchPackage.VPC_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.VPC_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.VPC_BUILDER_EC2__ADDITIONAL_CODE:
			return ADDITIONAL_CODE_EDEFAULT == null ? additionalCode != null
					: !ADDITIONAL_CODE_EDEFAULT.equals(additionalCode);
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNETBUILDER_EC2:
			return subnetbuilder_ec2 != null && !subnetbuilder_ec2.isEmpty();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNETSELECTIONBUILDER_EC2:
			return subnetselectionbuilder_ec2 != null && !subnetselectionbuilder_ec2.isEmpty();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNETCONFIGURATIONBUILDER_EC2:
			return subnetconfigurationbuilder_ec2 != null && !subnetconfigurationbuilder_ec2.isEmpty();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPNTUNNELOPTIONBUILDER_EC2:
			return vpntunneloptionbuilder_ec2 != null && !vpntunneloptionbuilder_ec2.isEmpty();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPNCONNECTIONOPTIONSBUILDER_EC2:
			return vpnconnectionoptionsbuilder_ec2 != null && !vpnconnectionoptionsbuilder_ec2.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (cidr_java_lang_String_: ");
		result.append(cidr_java_lang_String_);
		result.append(", defaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_: ");
		result.append(defaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_);
		result.append(", enableDnsHostnames_java_lang_Boolean_: ");
		result.append(enableDnsHostnames_java_lang_Boolean_);
		result.append(", enableDnsSupport_java_lang_Boolean_: ");
		result.append(enableDnsSupport_java_lang_Boolean_);
		result.append(", flowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap: ");
		result.append(flowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap);
		result.append(
				", gatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap: ");
		result.append(
				gatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap);
		result.append(", maxAzs_java_lang_Number_: ");
		result.append(maxAzs_java_lang_Number_);
		result.append(
				", natGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference: ");
		result.append(natGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference);
		result.append(", natGateways_java_lang_Number_: ");
		result.append(natGateways_java_lang_Number_);
		result.append(
				", natGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference: ");
		result.append(
				natGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference);
		result.append(", subnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList: ");
		result.append(subnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList);
		result.append(
				", vpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap: ");
		result.append(vpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap);
		result.append(", vpnGateway_java_lang_Boolean_: ");
		result.append(vpnGateway_java_lang_Boolean_);
		result.append(", vpnGatewayAsn_java_lang_Number_: ");
		result.append(vpnGatewayAsn_java_lang_Number_);
		result.append(", vpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList: ");
		result.append(vpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList);
		result.append(", generatedClassName: ");
		result.append(generatedClassName);
		result.append(", varName: ");
		result.append(varName);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", additionalCode: ");
		result.append(additionalCode);
		result.append(')');
		return result.toString();
	}

} //VpcBuilder_ec2Impl
