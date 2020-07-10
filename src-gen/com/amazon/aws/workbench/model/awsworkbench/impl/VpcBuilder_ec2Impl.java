/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.DefaultInstanceTenancy;
import com.amazon.aws.workbench.model.awsworkbench.PrivateSubnetBuilder_ec2;
import com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2;
import com.amazon.aws.workbench.model.awsworkbench.SecurityGroupBuilder_ec2;
import com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2;
import com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2;
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
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getCidr <em>Cidr</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getDefaultInstanceTenancy <em>Default Instance Tenancy</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getEnableDnsHostnames <em>Enable Dns Hostnames</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getEnableDnsSupport <em>Enable Dns Support</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getFlowLogsAsMap <em>Flow Logs As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getGatewayEndpointsAsMap <em>Gateway Endpoints As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getMaxAzs <em>Max Azs</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getNatGatewayProviderWithNatProviderAsReference <em>Nat Gateway Provider With Nat Provider As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getNatGateways <em>Nat Gateways</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getNatGatewaySubnetsWithSubnetSelectionAsReference <em>Nat Gateway Subnets With Subnet Selection As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getSubnetConfigurationAsList <em>Subnet Configuration As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getVpnConnectionsAsMap <em>Vpn Connections As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getVpnGateway <em>Vpn Gateway</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getVpnGatewayAsn <em>Vpn Gateway Asn</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getVpnRoutePropagationAsList <em>Vpn Route Propagation As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getSubnetbuilder_ec2 <em>Subnetbuilder ec2</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getSecuritygroupbuilder_ec2 <em>Securitygroupbuilder ec2</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getPrivatesubnetbuilder_ec2 <em>Privatesubnetbuilder ec2</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VpcBuilder_ec2Impl#getPublicsubnetbuilder_ec2 <em>Publicsubnetbuilder ec2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VpcBuilder_ec2Impl extends ServiceResourcesImpl implements VpcBuilder_ec2 {
	/**
	 * The default value of the '{@link #getCidr() <em>Cidr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidr()
	 * @generated
	 * @ordered
	 */
	protected static final String CIDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCidr() <em>Cidr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidr()
	 * @generated
	 * @ordered
	 */
	protected String cidr = CIDR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultInstanceTenancy() <em>Default Instance Tenancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultInstanceTenancy()
	 * @generated
	 * @ordered
	 */
	protected static final DefaultInstanceTenancy DEFAULT_INSTANCE_TENANCY_EDEFAULT = DefaultInstanceTenancy.DEFAULT;

	/**
	 * The cached value of the '{@link #getDefaultInstanceTenancy() <em>Default Instance Tenancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultInstanceTenancy()
	 * @generated
	 * @ordered
	 */
	protected DefaultInstanceTenancy defaultInstanceTenancy = DEFAULT_INSTANCE_TENANCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnableDnsHostnames() <em>Enable Dns Hostnames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableDnsHostnames()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ENABLE_DNS_HOSTNAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnableDnsHostnames() <em>Enable Dns Hostnames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableDnsHostnames()
	 * @generated
	 * @ordered
	 */
	protected Boolean enableDnsHostnames = ENABLE_DNS_HOSTNAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnableDnsSupport() <em>Enable Dns Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableDnsSupport()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ENABLE_DNS_SUPPORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnableDnsSupport() <em>Enable Dns Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableDnsSupport()
	 * @generated
	 * @ordered
	 */
	protected Boolean enableDnsSupport = ENABLE_DNS_SUPPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlowLogsAsMap() <em>Flow Logs As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowLogsAsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String FLOW_LOGS_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlowLogsAsMap() <em>Flow Logs As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowLogsAsMap()
	 * @generated
	 * @ordered
	 */
	protected String flowLogsAsMap = FLOW_LOGS_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getGatewayEndpointsAsMap() <em>Gateway Endpoints As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayEndpointsAsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String GATEWAY_ENDPOINTS_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGatewayEndpointsAsMap() <em>Gateway Endpoints As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayEndpointsAsMap()
	 * @generated
	 * @ordered
	 */
	protected String gatewayEndpointsAsMap = GATEWAY_ENDPOINTS_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxAzs() <em>Max Azs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAzs()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_AZS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxAzs() <em>Max Azs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAzs()
	 * @generated
	 * @ordered
	 */
	protected int maxAzs = MAX_AZS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNatGatewayProviderWithNatProviderAsReference() <em>Nat Gateway Provider With Nat Provider As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatGatewayProviderWithNatProviderAsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNatGatewayProviderWithNatProviderAsReference() <em>Nat Gateway Provider With Nat Provider As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatGatewayProviderWithNatProviderAsReference()
	 * @generated
	 * @ordered
	 */
	protected String natGatewayProviderWithNatProviderAsReference = NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNatGateways() <em>Nat Gateways</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatGateways()
	 * @generated
	 * @ordered
	 */
	protected static final int NAT_GATEWAYS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNatGateways() <em>Nat Gateways</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatGateways()
	 * @generated
	 * @ordered
	 */
	protected int natGateways = NAT_GATEWAYS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNatGatewaySubnetsWithSubnetSelectionAsReference() <em>Nat Gateway Subnets With Subnet Selection As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatGatewaySubnetsWithSubnetSelectionAsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNatGatewaySubnetsWithSubnetSelectionAsReference() <em>Nat Gateway Subnets With Subnet Selection As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatGatewaySubnetsWithSubnetSelectionAsReference()
	 * @generated
	 * @ordered
	 */
	protected String natGatewaySubnetsWithSubnetSelectionAsReference = NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubnetConfigurationAsList() <em>Subnet Configuration As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetConfigurationAsList()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNET_CONFIGURATION_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubnetConfigurationAsList() <em>Subnet Configuration As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetConfigurationAsList()
	 * @generated
	 * @ordered
	 */
	protected String subnetConfigurationAsList = SUBNET_CONFIGURATION_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getVpnConnectionsAsMap() <em>Vpn Connections As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpnConnectionsAsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String VPN_CONNECTIONS_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpnConnectionsAsMap() <em>Vpn Connections As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpnConnectionsAsMap()
	 * @generated
	 * @ordered
	 */
	protected String vpnConnectionsAsMap = VPN_CONNECTIONS_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getVpnGateway() <em>Vpn Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpnGateway()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean VPN_GATEWAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpnGateway() <em>Vpn Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpnGateway()
	 * @generated
	 * @ordered
	 */
	protected Boolean vpnGateway = VPN_GATEWAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getVpnGatewayAsn() <em>Vpn Gateway Asn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpnGatewayAsn()
	 * @generated
	 * @ordered
	 */
	protected static final int VPN_GATEWAY_ASN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVpnGatewayAsn() <em>Vpn Gateway Asn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpnGatewayAsn()
	 * @generated
	 * @ordered
	 */
	protected int vpnGatewayAsn = VPN_GATEWAY_ASN_EDEFAULT;

	/**
	 * The default value of the '{@link #getVpnRoutePropagationAsList() <em>Vpn Route Propagation As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpnRoutePropagationAsList()
	 * @generated
	 * @ordered
	 */
	protected static final String VPN_ROUTE_PROPAGATION_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpnRoutePropagationAsList() <em>Vpn Route Propagation As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpnRoutePropagationAsList()
	 * @generated
	 * @ordered
	 */
	protected String vpnRoutePropagationAsList = VPN_ROUTE_PROPAGATION_AS_LIST_EDEFAULT;

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
	 * The cached value of the '{@link #getSecuritygroupbuilder_ec2() <em>Securitygroupbuilder ec2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritygroupbuilder_ec2()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityGroupBuilder_ec2> securitygroupbuilder_ec2;

	/**
	 * The cached value of the '{@link #getPrivatesubnetbuilder_ec2() <em>Privatesubnetbuilder ec2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivatesubnetbuilder_ec2()
	 * @generated
	 * @ordered
	 */
	protected EList<PrivateSubnetBuilder_ec2> privatesubnetbuilder_ec2;

	/**
	 * The cached value of the '{@link #getPublicsubnetbuilder_ec2() <em>Publicsubnetbuilder ec2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicsubnetbuilder_ec2()
	 * @generated
	 * @ordered
	 */
	protected EList<PublicSubnetBuilder_ec2> publicsubnetbuilder_ec2;

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
	public String getCidr() {
		return cidr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCidr(String newCidr) {
		String oldCidr = cidr;
		cidr = newCidr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.VPC_BUILDER_EC2__CIDR, oldCidr,
					cidr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefaultInstanceTenancy getDefaultInstanceTenancy() {
		return defaultInstanceTenancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultInstanceTenancy(DefaultInstanceTenancy newDefaultInstanceTenancy) {
		DefaultInstanceTenancy oldDefaultInstanceTenancy = defaultInstanceTenancy;
		defaultInstanceTenancy = newDefaultInstanceTenancy == null ? DEFAULT_INSTANCE_TENANCY_EDEFAULT
				: newDefaultInstanceTenancy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.VPC_BUILDER_EC2__DEFAULT_INSTANCE_TENANCY, oldDefaultInstanceTenancy,
					defaultInstanceTenancy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getEnableDnsHostnames() {
		return enableDnsHostnames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableDnsHostnames(Boolean newEnableDnsHostnames) {
		Boolean oldEnableDnsHostnames = enableDnsHostnames;
		enableDnsHostnames = newEnableDnsHostnames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.VPC_BUILDER_EC2__ENABLE_DNS_HOSTNAMES, oldEnableDnsHostnames,
					enableDnsHostnames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getEnableDnsSupport() {
		return enableDnsSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableDnsSupport(Boolean newEnableDnsSupport) {
		Boolean oldEnableDnsSupport = enableDnsSupport;
		enableDnsSupport = newEnableDnsSupport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.VPC_BUILDER_EC2__ENABLE_DNS_SUPPORT, oldEnableDnsSupport, enableDnsSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFlowLogsAsMap() {
		return flowLogsAsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlowLogsAsMap(String newFlowLogsAsMap) {
		String oldFlowLogsAsMap = flowLogsAsMap;
		flowLogsAsMap = newFlowLogsAsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.VPC_BUILDER_EC2__FLOW_LOGS_AS_MAP,
					oldFlowLogsAsMap, flowLogsAsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGatewayEndpointsAsMap() {
		return gatewayEndpointsAsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGatewayEndpointsAsMap(String newGatewayEndpointsAsMap) {
		String oldGatewayEndpointsAsMap = gatewayEndpointsAsMap;
		gatewayEndpointsAsMap = newGatewayEndpointsAsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.VPC_BUILDER_EC2__GATEWAY_ENDPOINTS_AS_MAP, oldGatewayEndpointsAsMap,
					gatewayEndpointsAsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxAzs() {
		return maxAzs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxAzs(int newMaxAzs) {
		int oldMaxAzs = maxAzs;
		maxAzs = newMaxAzs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.VPC_BUILDER_EC2__MAX_AZS,
					oldMaxAzs, maxAzs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNatGatewayProviderWithNatProviderAsReference() {
		return natGatewayProviderWithNatProviderAsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNatGatewayProviderWithNatProviderAsReference(
			String newNatGatewayProviderWithNatProviderAsReference) {
		String oldNatGatewayProviderWithNatProviderAsReference = natGatewayProviderWithNatProviderAsReference;
		natGatewayProviderWithNatProviderAsReference = newNatGatewayProviderWithNatProviderAsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_AS_REFERENCE,
					oldNatGatewayProviderWithNatProviderAsReference, natGatewayProviderWithNatProviderAsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNatGateways() {
		return natGateways;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNatGateways(int newNatGateways) {
		int oldNatGateways = natGateways;
		natGateways = newNatGateways;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAYS,
					oldNatGateways, natGateways));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNatGatewaySubnetsWithSubnetSelectionAsReference() {
		return natGatewaySubnetsWithSubnetSelectionAsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNatGatewaySubnetsWithSubnetSelectionAsReference(
			String newNatGatewaySubnetsWithSubnetSelectionAsReference) {
		String oldNatGatewaySubnetsWithSubnetSelectionAsReference = natGatewaySubnetsWithSubnetSelectionAsReference;
		natGatewaySubnetsWithSubnetSelectionAsReference = newNatGatewaySubnetsWithSubnetSelectionAsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_AS_REFERENCE,
					oldNatGatewaySubnetsWithSubnetSelectionAsReference,
					natGatewaySubnetsWithSubnetSelectionAsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubnetConfigurationAsList() {
		return subnetConfigurationAsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubnetConfigurationAsList(String newSubnetConfigurationAsList) {
		String oldSubnetConfigurationAsList = subnetConfigurationAsList;
		subnetConfigurationAsList = newSubnetConfigurationAsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNET_CONFIGURATION_AS_LIST, oldSubnetConfigurationAsList,
					subnetConfigurationAsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVpnConnectionsAsMap() {
		return vpnConnectionsAsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpnConnectionsAsMap(String newVpnConnectionsAsMap) {
		String oldVpnConnectionsAsMap = vpnConnectionsAsMap;
		vpnConnectionsAsMap = newVpnConnectionsAsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_CONNECTIONS_AS_MAP, oldVpnConnectionsAsMap,
					vpnConnectionsAsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getVpnGateway() {
		return vpnGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpnGateway(Boolean newVpnGateway) {
		Boolean oldVpnGateway = vpnGateway;
		vpnGateway = newVpnGateway;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_GATEWAY,
					oldVpnGateway, vpnGateway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getVpnGatewayAsn() {
		return vpnGatewayAsn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpnGatewayAsn(int newVpnGatewayAsn) {
		int oldVpnGatewayAsn = vpnGatewayAsn;
		vpnGatewayAsn = newVpnGatewayAsn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_GATEWAY_ASN,
					oldVpnGatewayAsn, vpnGatewayAsn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVpnRoutePropagationAsList() {
		return vpnRoutePropagationAsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpnRoutePropagationAsList(String newVpnRoutePropagationAsList) {
		String oldVpnRoutePropagationAsList = vpnRoutePropagationAsList;
		vpnRoutePropagationAsList = newVpnRoutePropagationAsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_ROUTE_PROPAGATION_AS_LIST, oldVpnRoutePropagationAsList,
					vpnRoutePropagationAsList));
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
	public EList<SecurityGroupBuilder_ec2> getSecuritygroupbuilder_ec2() {
		if (securitygroupbuilder_ec2 == null) {
			securitygroupbuilder_ec2 = new EObjectContainmentEList<SecurityGroupBuilder_ec2>(
					SecurityGroupBuilder_ec2.class, this,
					AwsworkbenchPackage.VPC_BUILDER_EC2__SECURITYGROUPBUILDER_EC2);
		}
		return securitygroupbuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrivateSubnetBuilder_ec2> getPrivatesubnetbuilder_ec2() {
		if (privatesubnetbuilder_ec2 == null) {
			privatesubnetbuilder_ec2 = new EObjectContainmentEList<PrivateSubnetBuilder_ec2>(
					PrivateSubnetBuilder_ec2.class, this,
					AwsworkbenchPackage.VPC_BUILDER_EC2__PRIVATESUBNETBUILDER_EC2);
		}
		return privatesubnetbuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PublicSubnetBuilder_ec2> getPublicsubnetbuilder_ec2() {
		if (publicsubnetbuilder_ec2 == null) {
			publicsubnetbuilder_ec2 = new EObjectContainmentEList<PublicSubnetBuilder_ec2>(
					PublicSubnetBuilder_ec2.class, this, AwsworkbenchPackage.VPC_BUILDER_EC2__PUBLICSUBNETBUILDER_EC2);
		}
		return publicsubnetbuilder_ec2;
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
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SECURITYGROUPBUILDER_EC2:
			return ((InternalEList<?>) getSecuritygroupbuilder_ec2()).basicRemove(otherEnd, msgs);
		case AwsworkbenchPackage.VPC_BUILDER_EC2__PRIVATESUBNETBUILDER_EC2:
			return ((InternalEList<?>) getPrivatesubnetbuilder_ec2()).basicRemove(otherEnd, msgs);
		case AwsworkbenchPackage.VPC_BUILDER_EC2__PUBLICSUBNETBUILDER_EC2:
			return ((InternalEList<?>) getPublicsubnetbuilder_ec2()).basicRemove(otherEnd, msgs);
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
		case AwsworkbenchPackage.VPC_BUILDER_EC2__CIDR:
			return getCidr();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__DEFAULT_INSTANCE_TENANCY:
			return getDefaultInstanceTenancy();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__ENABLE_DNS_HOSTNAMES:
			return getEnableDnsHostnames();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__ENABLE_DNS_SUPPORT:
			return getEnableDnsSupport();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__FLOW_LOGS_AS_MAP:
			return getFlowLogsAsMap();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__GATEWAY_ENDPOINTS_AS_MAP:
			return getGatewayEndpointsAsMap();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__MAX_AZS:
			return getMaxAzs();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_AS_REFERENCE:
			return getNatGatewayProviderWithNatProviderAsReference();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAYS:
			return getNatGateways();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_AS_REFERENCE:
			return getNatGatewaySubnetsWithSubnetSelectionAsReference();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNET_CONFIGURATION_AS_LIST:
			return getSubnetConfigurationAsList();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_CONNECTIONS_AS_MAP:
			return getVpnConnectionsAsMap();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_GATEWAY:
			return getVpnGateway();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_GATEWAY_ASN:
			return getVpnGatewayAsn();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_ROUTE_PROPAGATION_AS_LIST:
			return getVpnRoutePropagationAsList();
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
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SECURITYGROUPBUILDER_EC2:
			return getSecuritygroupbuilder_ec2();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__PRIVATESUBNETBUILDER_EC2:
			return getPrivatesubnetbuilder_ec2();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__PUBLICSUBNETBUILDER_EC2:
			return getPublicsubnetbuilder_ec2();
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
		case AwsworkbenchPackage.VPC_BUILDER_EC2__CIDR:
			setCidr((String) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__DEFAULT_INSTANCE_TENANCY:
			setDefaultInstanceTenancy((DefaultInstanceTenancy) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__ENABLE_DNS_HOSTNAMES:
			setEnableDnsHostnames((Boolean) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__ENABLE_DNS_SUPPORT:
			setEnableDnsSupport((Boolean) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__FLOW_LOGS_AS_MAP:
			setFlowLogsAsMap((String) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__GATEWAY_ENDPOINTS_AS_MAP:
			setGatewayEndpointsAsMap((String) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__MAX_AZS:
			setMaxAzs((Integer) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_AS_REFERENCE:
			setNatGatewayProviderWithNatProviderAsReference((String) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAYS:
			setNatGateways((Integer) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_AS_REFERENCE:
			setNatGatewaySubnetsWithSubnetSelectionAsReference((String) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNET_CONFIGURATION_AS_LIST:
			setSubnetConfigurationAsList((String) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_CONNECTIONS_AS_MAP:
			setVpnConnectionsAsMap((String) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_GATEWAY:
			setVpnGateway((Boolean) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_GATEWAY_ASN:
			setVpnGatewayAsn((Integer) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_ROUTE_PROPAGATION_AS_LIST:
			setVpnRoutePropagationAsList((String) newValue);
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
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SECURITYGROUPBUILDER_EC2:
			getSecuritygroupbuilder_ec2().clear();
			getSecuritygroupbuilder_ec2().addAll((Collection<? extends SecurityGroupBuilder_ec2>) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__PRIVATESUBNETBUILDER_EC2:
			getPrivatesubnetbuilder_ec2().clear();
			getPrivatesubnetbuilder_ec2().addAll((Collection<? extends PrivateSubnetBuilder_ec2>) newValue);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__PUBLICSUBNETBUILDER_EC2:
			getPublicsubnetbuilder_ec2().clear();
			getPublicsubnetbuilder_ec2().addAll((Collection<? extends PublicSubnetBuilder_ec2>) newValue);
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
		case AwsworkbenchPackage.VPC_BUILDER_EC2__CIDR:
			setCidr(CIDR_EDEFAULT);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__DEFAULT_INSTANCE_TENANCY:
			setDefaultInstanceTenancy(DEFAULT_INSTANCE_TENANCY_EDEFAULT);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__ENABLE_DNS_HOSTNAMES:
			setEnableDnsHostnames(ENABLE_DNS_HOSTNAMES_EDEFAULT);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__ENABLE_DNS_SUPPORT:
			setEnableDnsSupport(ENABLE_DNS_SUPPORT_EDEFAULT);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__FLOW_LOGS_AS_MAP:
			setFlowLogsAsMap(FLOW_LOGS_AS_MAP_EDEFAULT);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__GATEWAY_ENDPOINTS_AS_MAP:
			setGatewayEndpointsAsMap(GATEWAY_ENDPOINTS_AS_MAP_EDEFAULT);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__MAX_AZS:
			setMaxAzs(MAX_AZS_EDEFAULT);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_AS_REFERENCE:
			setNatGatewayProviderWithNatProviderAsReference(
					NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAYS:
			setNatGateways(NAT_GATEWAYS_EDEFAULT);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_AS_REFERENCE:
			setNatGatewaySubnetsWithSubnetSelectionAsReference(
					NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNET_CONFIGURATION_AS_LIST:
			setSubnetConfigurationAsList(SUBNET_CONFIGURATION_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_CONNECTIONS_AS_MAP:
			setVpnConnectionsAsMap(VPN_CONNECTIONS_AS_MAP_EDEFAULT);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_GATEWAY:
			setVpnGateway(VPN_GATEWAY_EDEFAULT);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_GATEWAY_ASN:
			setVpnGatewayAsn(VPN_GATEWAY_ASN_EDEFAULT);
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_ROUTE_PROPAGATION_AS_LIST:
			setVpnRoutePropagationAsList(VPN_ROUTE_PROPAGATION_AS_LIST_EDEFAULT);
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
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SECURITYGROUPBUILDER_EC2:
			getSecuritygroupbuilder_ec2().clear();
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__PRIVATESUBNETBUILDER_EC2:
			getPrivatesubnetbuilder_ec2().clear();
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__PUBLICSUBNETBUILDER_EC2:
			getPublicsubnetbuilder_ec2().clear();
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
		case AwsworkbenchPackage.VPC_BUILDER_EC2__CIDR:
			return CIDR_EDEFAULT == null ? cidr != null : !CIDR_EDEFAULT.equals(cidr);
		case AwsworkbenchPackage.VPC_BUILDER_EC2__DEFAULT_INSTANCE_TENANCY:
			return defaultInstanceTenancy != DEFAULT_INSTANCE_TENANCY_EDEFAULT;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__ENABLE_DNS_HOSTNAMES:
			return ENABLE_DNS_HOSTNAMES_EDEFAULT == null ? enableDnsHostnames != null
					: !ENABLE_DNS_HOSTNAMES_EDEFAULT.equals(enableDnsHostnames);
		case AwsworkbenchPackage.VPC_BUILDER_EC2__ENABLE_DNS_SUPPORT:
			return ENABLE_DNS_SUPPORT_EDEFAULT == null ? enableDnsSupport != null
					: !ENABLE_DNS_SUPPORT_EDEFAULT.equals(enableDnsSupport);
		case AwsworkbenchPackage.VPC_BUILDER_EC2__FLOW_LOGS_AS_MAP:
			return FLOW_LOGS_AS_MAP_EDEFAULT == null ? flowLogsAsMap != null
					: !FLOW_LOGS_AS_MAP_EDEFAULT.equals(flowLogsAsMap);
		case AwsworkbenchPackage.VPC_BUILDER_EC2__GATEWAY_ENDPOINTS_AS_MAP:
			return GATEWAY_ENDPOINTS_AS_MAP_EDEFAULT == null ? gatewayEndpointsAsMap != null
					: !GATEWAY_ENDPOINTS_AS_MAP_EDEFAULT.equals(gatewayEndpointsAsMap);
		case AwsworkbenchPackage.VPC_BUILDER_EC2__MAX_AZS:
			return maxAzs != MAX_AZS_EDEFAULT;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_AS_REFERENCE:
			return NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_AS_REFERENCE_EDEFAULT == null
					? natGatewayProviderWithNatProviderAsReference != null
					: !NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_AS_REFERENCE_EDEFAULT
							.equals(natGatewayProviderWithNatProviderAsReference);
		case AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAYS:
			return natGateways != NAT_GATEWAYS_EDEFAULT;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_AS_REFERENCE:
			return NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT == null
					? natGatewaySubnetsWithSubnetSelectionAsReference != null
					: !NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT
							.equals(natGatewaySubnetsWithSubnetSelectionAsReference);
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNET_CONFIGURATION_AS_LIST:
			return SUBNET_CONFIGURATION_AS_LIST_EDEFAULT == null ? subnetConfigurationAsList != null
					: !SUBNET_CONFIGURATION_AS_LIST_EDEFAULT.equals(subnetConfigurationAsList);
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_CONNECTIONS_AS_MAP:
			return VPN_CONNECTIONS_AS_MAP_EDEFAULT == null ? vpnConnectionsAsMap != null
					: !VPN_CONNECTIONS_AS_MAP_EDEFAULT.equals(vpnConnectionsAsMap);
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_GATEWAY:
			return VPN_GATEWAY_EDEFAULT == null ? vpnGateway != null : !VPN_GATEWAY_EDEFAULT.equals(vpnGateway);
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_GATEWAY_ASN:
			return vpnGatewayAsn != VPN_GATEWAY_ASN_EDEFAULT;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_ROUTE_PROPAGATION_AS_LIST:
			return VPN_ROUTE_PROPAGATION_AS_LIST_EDEFAULT == null ? vpnRoutePropagationAsList != null
					: !VPN_ROUTE_PROPAGATION_AS_LIST_EDEFAULT.equals(vpnRoutePropagationAsList);
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
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SECURITYGROUPBUILDER_EC2:
			return securitygroupbuilder_ec2 != null && !securitygroupbuilder_ec2.isEmpty();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__PRIVATESUBNETBUILDER_EC2:
			return privatesubnetbuilder_ec2 != null && !privatesubnetbuilder_ec2.isEmpty();
		case AwsworkbenchPackage.VPC_BUILDER_EC2__PUBLICSUBNETBUILDER_EC2:
			return publicsubnetbuilder_ec2 != null && !publicsubnetbuilder_ec2.isEmpty();
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
		result.append(" (cidr: ");
		result.append(cidr);
		result.append(", defaultInstanceTenancy: ");
		result.append(defaultInstanceTenancy);
		result.append(", enableDnsHostnames: ");
		result.append(enableDnsHostnames);
		result.append(", enableDnsSupport: ");
		result.append(enableDnsSupport);
		result.append(", flowLogsAsMap: ");
		result.append(flowLogsAsMap);
		result.append(", gatewayEndpointsAsMap: ");
		result.append(gatewayEndpointsAsMap);
		result.append(", maxAzs: ");
		result.append(maxAzs);
		result.append(", natGatewayProviderWithNatProviderAsReference: ");
		result.append(natGatewayProviderWithNatProviderAsReference);
		result.append(", natGateways: ");
		result.append(natGateways);
		result.append(", natGatewaySubnetsWithSubnetSelectionAsReference: ");
		result.append(natGatewaySubnetsWithSubnetSelectionAsReference);
		result.append(", subnetConfigurationAsList: ");
		result.append(subnetConfigurationAsList);
		result.append(", vpnConnectionsAsMap: ");
		result.append(vpnConnectionsAsMap);
		result.append(", vpnGateway: ");
		result.append(vpnGateway);
		result.append(", vpnGatewayAsn: ");
		result.append(vpnGatewayAsn);
		result.append(", vpnRoutePropagationAsList: ");
		result.append(vpnRoutePropagationAsList);
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
