/**
 */
package ec2.impl;

import ec2.Ec2Package;
import ec2.VpnConnectionOptionsBuilder_ec2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vpn Connection Options Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ec2.impl.VpnConnectionOptionsBuilder_ec2Impl#getIp_java_lang_String_ <em>Ip java lang String </em>}</li>
 *   <li>{@link ec2.impl.VpnConnectionOptionsBuilder_ec2Impl#getAsn_java_lang_Number_ <em>Asn java lang Number </em>}</li>
 *   <li>{@link ec2.impl.VpnConnectionOptionsBuilder_ec2Impl#getStaticRoutes_java_lang_String_AsList <em>Static Routes java lang String As List</em>}</li>
 *   <li>{@link ec2.impl.VpnConnectionOptionsBuilder_ec2Impl#getTunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList <em>Tunnel Options software amazon awscdk services ec2 Vpn Tunnel Option As List</em>}</li>
 *   <li>{@link ec2.impl.VpnConnectionOptionsBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.impl.VpnConnectionOptionsBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.impl.VpnConnectionOptionsBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.impl.VpnConnectionOptionsBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VpnConnectionOptionsBuilder_ec2Impl extends MinimalEObjectImpl.Container
		implements VpnConnectionOptionsBuilder_ec2 {
	/**
	 * The default value of the '{@link #getIp_java_lang_String_() <em>Ip java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIp_java_lang_String_() <em>Ip java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String ip_java_lang_String_ = IP_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getAsn_java_lang_Number_() <em>Asn java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsn_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int ASN_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAsn_java_lang_Number_() <em>Asn java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsn_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int asn_java_lang_Number_ = ASN_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getStaticRoutes_java_lang_String_AsList() <em>Static Routes java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticRoutes_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String STATIC_ROUTES_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStaticRoutes_java_lang_String_AsList() <em>Static Routes java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticRoutes_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String staticRoutes_java_lang_String_AsList = STATIC_ROUTES_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getTunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList() <em>Tunnel Options software amazon awscdk services ec2 Vpn Tunnel Option As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String TUNNEL_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_TUNNEL_OPTION_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList() <em>Tunnel Options software amazon awscdk services ec2 Vpn Tunnel Option As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList()
	 * @generated
	 * @ordered
	 */
	protected String tunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList = TUNNEL_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_TUNNEL_OPTION_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.VpnConnectionOptions";

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VpnConnectionOptionsBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.Literals.VPN_CONNECTION_OPTIONS_BUILDER_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIp_java_lang_String_() {
		return ip_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIp_java_lang_String_(String newIp_java_lang_String_) {
		String oldIp_java_lang_String_ = ip_java_lang_String_;
		ip_java_lang_String_ = newIp_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__IP_JAVA_LANG_STRING_, oldIp_java_lang_String_,
					ip_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAsn_java_lang_Number_() {
		return asn_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAsn_java_lang_Number_(int newAsn_java_lang_Number_) {
		int oldAsn_java_lang_Number_ = asn_java_lang_Number_;
		asn_java_lang_Number_ = newAsn_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__ASN_JAVA_LANG_NUMBER_, oldAsn_java_lang_Number_,
					asn_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStaticRoutes_java_lang_String_AsList() {
		return staticRoutes_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStaticRoutes_java_lang_String_AsList(String newStaticRoutes_java_lang_String_AsList) {
		String oldStaticRoutes_java_lang_String_AsList = staticRoutes_java_lang_String_AsList;
		staticRoutes_java_lang_String_AsList = newStaticRoutes_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__STATIC_ROUTES_JAVA_LANG_STRING_AS_LIST,
					oldStaticRoutes_java_lang_String_AsList, staticRoutes_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList() {
		return tunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList(
			String newTunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList) {
		String oldTunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList = tunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList;
		tunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList = newTunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__TUNNEL_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_TUNNEL_OPTION_AS_LIST,
					oldTunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList,
					tunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__VAR_NAME, oldVarName, varName));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__IDENTIFIER, oldIdentifier, identifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__IP_JAVA_LANG_STRING_:
			return getIp_java_lang_String_();
		case Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__ASN_JAVA_LANG_NUMBER_:
			return getAsn_java_lang_Number_();
		case Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__STATIC_ROUTES_JAVA_LANG_STRING_AS_LIST:
			return getStaticRoutes_java_lang_String_AsList();
		case Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__TUNNEL_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_TUNNEL_OPTION_AS_LIST:
			return getTunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList();
		case Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE:
			return getAdditionalCode();
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
		case Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__IP_JAVA_LANG_STRING_:
			setIp_java_lang_String_((String) newValue);
			return;
		case Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__ASN_JAVA_LANG_NUMBER_:
			setAsn_java_lang_Number_((Integer) newValue);
			return;
		case Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__STATIC_ROUTES_JAVA_LANG_STRING_AS_LIST:
			setStaticRoutes_java_lang_String_AsList((String) newValue);
			return;
		case Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__TUNNEL_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_TUNNEL_OPTION_AS_LIST:
			setTunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList((String) newValue);
			return;
		case Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE:
			setAdditionalCode((String) newValue);
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
		case Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__IP_JAVA_LANG_STRING_:
			setIp_java_lang_String_(IP_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__ASN_JAVA_LANG_NUMBER_:
			setAsn_java_lang_Number_(ASN_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__STATIC_ROUTES_JAVA_LANG_STRING_AS_LIST:
			setStaticRoutes_java_lang_String_AsList(STATIC_ROUTES_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__TUNNEL_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_TUNNEL_OPTION_AS_LIST:
			setTunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList(
					TUNNEL_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_TUNNEL_OPTION_AS_LIST_EDEFAULT);
			return;
		case Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE:
			setAdditionalCode(ADDITIONAL_CODE_EDEFAULT);
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
		case Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__IP_JAVA_LANG_STRING_:
			return IP_JAVA_LANG_STRING__EDEFAULT == null ? ip_java_lang_String_ != null
					: !IP_JAVA_LANG_STRING__EDEFAULT.equals(ip_java_lang_String_);
		case Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__ASN_JAVA_LANG_NUMBER_:
			return asn_java_lang_Number_ != ASN_JAVA_LANG_NUMBER__EDEFAULT;
		case Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__STATIC_ROUTES_JAVA_LANG_STRING_AS_LIST:
			return STATIC_ROUTES_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? staticRoutes_java_lang_String_AsList != null
					: !STATIC_ROUTES_JAVA_LANG_STRING_AS_LIST_EDEFAULT.equals(staticRoutes_java_lang_String_AsList);
		case Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__TUNNEL_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_TUNNEL_OPTION_AS_LIST:
			return TUNNEL_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_TUNNEL_OPTION_AS_LIST_EDEFAULT == null
					? tunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList != null
					: !TUNNEL_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_TUNNEL_OPTION_AS_LIST_EDEFAULT
							.equals(tunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList);
		case Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case Ec2Package.VPN_CONNECTION_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE:
			return ADDITIONAL_CODE_EDEFAULT == null ? additionalCode != null
					: !ADDITIONAL_CODE_EDEFAULT.equals(additionalCode);
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
		result.append(" (ip_java_lang_String_: ");
		result.append(ip_java_lang_String_);
		result.append(", asn_java_lang_Number_: ");
		result.append(asn_java_lang_Number_);
		result.append(", staticRoutes_java_lang_String_AsList: ");
		result.append(staticRoutes_java_lang_String_AsList);
		result.append(", tunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList: ");
		result.append(tunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList);
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

} //VpnConnectionOptionsBuilder_ec2Impl
