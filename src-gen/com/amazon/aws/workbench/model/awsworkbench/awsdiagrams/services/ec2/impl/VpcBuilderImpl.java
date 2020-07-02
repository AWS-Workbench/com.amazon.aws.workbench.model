/**
 */
package com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.services.ec2.impl;

import com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.services.ec2.DefaultInstanceTenancy;
import com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.services.ec2.Ec2Package;
import com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.services.ec2.VpcBuilder;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vpc Builder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.services.ec2.impl.VpcBuilderImpl#getCidr <em>Cidr</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.services.ec2.impl.VpcBuilderImpl#getEnableDnsHostnames <em>Enable Dns Hostnames</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.services.ec2.impl.VpcBuilderImpl#getEnableDnsSupport <em>Enable Dns Support</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.services.ec2.impl.VpcBuilderImpl#getMaxAzs <em>Max Azs</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.services.ec2.impl.VpcBuilderImpl#getNatGateways <em>Nat Gateways</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.services.ec2.impl.VpcBuilderImpl#getVpnGateway <em>Vpn Gateway</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.services.ec2.impl.VpcBuilderImpl#getVpnGatewayAsn <em>Vpn Gateway Asn</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.services.ec2.impl.VpcBuilderImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.services.ec2.impl.VpcBuilderImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.services.ec2.impl.VpcBuilderImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.services.ec2.impl.VpcBuilderImpl#getAdditionalCode <em>Additional Code</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.services.ec2.impl.VpcBuilderImpl#getDefaultInstanceTenancy <em>Default Instance Tenancy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VpcBuilderImpl extends MinimalEObjectImpl.Container implements VpcBuilder {
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
	 * The default value of the '{@link #getMaxAzs() <em>Max Azs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAzs()
	 * @generated
	 * @ordered
	 */
	protected static final Number MAX_AZS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxAzs() <em>Max Azs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAzs()
	 * @generated
	 * @ordered
	 */
	protected Number maxAzs = MAX_AZS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNatGateways() <em>Nat Gateways</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatGateways()
	 * @generated
	 * @ordered
	 */
	protected static final Number NAT_GATEWAYS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNatGateways() <em>Nat Gateways</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatGateways()
	 * @generated
	 * @ordered
	 */
	protected Number natGateways = NAT_GATEWAYS_EDEFAULT;

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
	protected static final Number VPN_GATEWAY_ASN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpnGatewayAsn() <em>Vpn Gateway Asn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpnGatewayAsn()
	 * @generated
	 * @ordered
	 */
	protected Number vpnGatewayAsn = VPN_GATEWAY_ASN_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VpcBuilderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.Literals.VPC_BUILDER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.VPC_BUILDER__CIDR, oldCidr, cidr));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.VPC_BUILDER__ENABLE_DNS_HOSTNAMES,
					oldEnableDnsHostnames, enableDnsHostnames));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.VPC_BUILDER__ENABLE_DNS_SUPPORT,
					oldEnableDnsSupport, enableDnsSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Number getMaxAzs() {
		return maxAzs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxAzs(Number newMaxAzs) {
		Number oldMaxAzs = maxAzs;
		maxAzs = newMaxAzs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.VPC_BUILDER__MAX_AZS, oldMaxAzs, maxAzs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Number getNatGateways() {
		return natGateways;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNatGateways(Number newNatGateways) {
		Number oldNatGateways = natGateways;
		natGateways = newNatGateways;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.VPC_BUILDER__NAT_GATEWAYS, oldNatGateways,
					natGateways));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.VPC_BUILDER__VPN_GATEWAY, oldVpnGateway,
					vpnGateway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Number getVpnGatewayAsn() {
		return vpnGatewayAsn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpnGatewayAsn(Number newVpnGatewayAsn) {
		Number oldVpnGatewayAsn = vpnGatewayAsn;
		vpnGatewayAsn = newVpnGatewayAsn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.VPC_BUILDER__VPN_GATEWAY_ASN,
					oldVpnGatewayAsn, vpnGatewayAsn));
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
	public void setGeneratedClassName(String newGeneratedClassName) {
		String oldGeneratedClassName = generatedClassName;
		generatedClassName = newGeneratedClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.VPC_BUILDER__GENERATED_CLASS_NAME,
					oldGeneratedClassName, generatedClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.VPC_BUILDER__VAR_NAME, oldVarName,
					varName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.VPC_BUILDER__IDENTIFIER, oldIdentifier,
					identifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.VPC_BUILDER__ADDITIONAL_CODE,
					oldAdditionalCode, additionalCode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.VPC_BUILDER__DEFAULT_INSTANCE_TENANCY,
					oldDefaultInstanceTenancy, defaultInstanceTenancy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ec2Package.VPC_BUILDER__CIDR:
			return getCidr();
		case Ec2Package.VPC_BUILDER__ENABLE_DNS_HOSTNAMES:
			return getEnableDnsHostnames();
		case Ec2Package.VPC_BUILDER__ENABLE_DNS_SUPPORT:
			return getEnableDnsSupport();
		case Ec2Package.VPC_BUILDER__MAX_AZS:
			return getMaxAzs();
		case Ec2Package.VPC_BUILDER__NAT_GATEWAYS:
			return getNatGateways();
		case Ec2Package.VPC_BUILDER__VPN_GATEWAY:
			return getVpnGateway();
		case Ec2Package.VPC_BUILDER__VPN_GATEWAY_ASN:
			return getVpnGatewayAsn();
		case Ec2Package.VPC_BUILDER__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case Ec2Package.VPC_BUILDER__VAR_NAME:
			return getVarName();
		case Ec2Package.VPC_BUILDER__IDENTIFIER:
			return getIdentifier();
		case Ec2Package.VPC_BUILDER__ADDITIONAL_CODE:
			return getAdditionalCode();
		case Ec2Package.VPC_BUILDER__DEFAULT_INSTANCE_TENANCY:
			return getDefaultInstanceTenancy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Ec2Package.VPC_BUILDER__CIDR:
			setCidr((String) newValue);
			return;
		case Ec2Package.VPC_BUILDER__ENABLE_DNS_HOSTNAMES:
			setEnableDnsHostnames((Boolean) newValue);
			return;
		case Ec2Package.VPC_BUILDER__ENABLE_DNS_SUPPORT:
			setEnableDnsSupport((Boolean) newValue);
			return;
		case Ec2Package.VPC_BUILDER__MAX_AZS:
			setMaxAzs((Number) newValue);
			return;
		case Ec2Package.VPC_BUILDER__NAT_GATEWAYS:
			setNatGateways((Number) newValue);
			return;
		case Ec2Package.VPC_BUILDER__VPN_GATEWAY:
			setVpnGateway((Boolean) newValue);
			return;
		case Ec2Package.VPC_BUILDER__VPN_GATEWAY_ASN:
			setVpnGatewayAsn((Number) newValue);
			return;
		case Ec2Package.VPC_BUILDER__GENERATED_CLASS_NAME:
			setGeneratedClassName((String) newValue);
			return;
		case Ec2Package.VPC_BUILDER__VAR_NAME:
			setVarName((String) newValue);
			return;
		case Ec2Package.VPC_BUILDER__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case Ec2Package.VPC_BUILDER__ADDITIONAL_CODE:
			setAdditionalCode((String) newValue);
			return;
		case Ec2Package.VPC_BUILDER__DEFAULT_INSTANCE_TENANCY:
			setDefaultInstanceTenancy((DefaultInstanceTenancy) newValue);
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
		case Ec2Package.VPC_BUILDER__CIDR:
			setCidr(CIDR_EDEFAULT);
			return;
		case Ec2Package.VPC_BUILDER__ENABLE_DNS_HOSTNAMES:
			setEnableDnsHostnames(ENABLE_DNS_HOSTNAMES_EDEFAULT);
			return;
		case Ec2Package.VPC_BUILDER__ENABLE_DNS_SUPPORT:
			setEnableDnsSupport(ENABLE_DNS_SUPPORT_EDEFAULT);
			return;
		case Ec2Package.VPC_BUILDER__MAX_AZS:
			setMaxAzs(MAX_AZS_EDEFAULT);
			return;
		case Ec2Package.VPC_BUILDER__NAT_GATEWAYS:
			setNatGateways(NAT_GATEWAYS_EDEFAULT);
			return;
		case Ec2Package.VPC_BUILDER__VPN_GATEWAY:
			setVpnGateway(VPN_GATEWAY_EDEFAULT);
			return;
		case Ec2Package.VPC_BUILDER__VPN_GATEWAY_ASN:
			setVpnGatewayAsn(VPN_GATEWAY_ASN_EDEFAULT);
			return;
		case Ec2Package.VPC_BUILDER__GENERATED_CLASS_NAME:
			setGeneratedClassName(GENERATED_CLASS_NAME_EDEFAULT);
			return;
		case Ec2Package.VPC_BUILDER__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case Ec2Package.VPC_BUILDER__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case Ec2Package.VPC_BUILDER__ADDITIONAL_CODE:
			setAdditionalCode(ADDITIONAL_CODE_EDEFAULT);
			return;
		case Ec2Package.VPC_BUILDER__DEFAULT_INSTANCE_TENANCY:
			setDefaultInstanceTenancy(DEFAULT_INSTANCE_TENANCY_EDEFAULT);
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
		case Ec2Package.VPC_BUILDER__CIDR:
			return CIDR_EDEFAULT == null ? cidr != null : !CIDR_EDEFAULT.equals(cidr);
		case Ec2Package.VPC_BUILDER__ENABLE_DNS_HOSTNAMES:
			return ENABLE_DNS_HOSTNAMES_EDEFAULT == null ? enableDnsHostnames != null
					: !ENABLE_DNS_HOSTNAMES_EDEFAULT.equals(enableDnsHostnames);
		case Ec2Package.VPC_BUILDER__ENABLE_DNS_SUPPORT:
			return ENABLE_DNS_SUPPORT_EDEFAULT == null ? enableDnsSupport != null
					: !ENABLE_DNS_SUPPORT_EDEFAULT.equals(enableDnsSupport);
		case Ec2Package.VPC_BUILDER__MAX_AZS:
			return MAX_AZS_EDEFAULT == null ? maxAzs != null : !MAX_AZS_EDEFAULT.equals(maxAzs);
		case Ec2Package.VPC_BUILDER__NAT_GATEWAYS:
			return NAT_GATEWAYS_EDEFAULT == null ? natGateways != null : !NAT_GATEWAYS_EDEFAULT.equals(natGateways);
		case Ec2Package.VPC_BUILDER__VPN_GATEWAY:
			return VPN_GATEWAY_EDEFAULT == null ? vpnGateway != null : !VPN_GATEWAY_EDEFAULT.equals(vpnGateway);
		case Ec2Package.VPC_BUILDER__VPN_GATEWAY_ASN:
			return VPN_GATEWAY_ASN_EDEFAULT == null ? vpnGatewayAsn != null
					: !VPN_GATEWAY_ASN_EDEFAULT.equals(vpnGatewayAsn);
		case Ec2Package.VPC_BUILDER__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case Ec2Package.VPC_BUILDER__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case Ec2Package.VPC_BUILDER__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case Ec2Package.VPC_BUILDER__ADDITIONAL_CODE:
			return ADDITIONAL_CODE_EDEFAULT == null ? additionalCode != null
					: !ADDITIONAL_CODE_EDEFAULT.equals(additionalCode);
		case Ec2Package.VPC_BUILDER__DEFAULT_INSTANCE_TENANCY:
			return defaultInstanceTenancy != DEFAULT_INSTANCE_TENANCY_EDEFAULT;
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
		result.append(", enableDnsHostnames: ");
		result.append(enableDnsHostnames);
		result.append(", enableDnsSupport: ");
		result.append(enableDnsSupport);
		result.append(", maxAzs: ");
		result.append(maxAzs);
		result.append(", natGateways: ");
		result.append(natGateways);
		result.append(", vpnGateway: ");
		result.append(vpnGateway);
		result.append(", vpnGatewayAsn: ");
		result.append(vpnGatewayAsn);
		result.append(", generatedClassName: ");
		result.append(generatedClassName);
		result.append(", varName: ");
		result.append(varName);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", additionalCode: ");
		result.append(additionalCode);
		result.append(", defaultInstanceTenancy: ");
		result.append(defaultInstanceTenancy);
		result.append(')');
		return result.toString();
	}

} //VpcBuilderImpl
