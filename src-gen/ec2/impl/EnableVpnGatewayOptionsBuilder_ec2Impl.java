/**
 */
package ec2.impl;

import ec2.Ec2Package;
import ec2.EnableVpnGatewayOptionsBuilder_ec2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enable Vpn Gateway Options Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ec2.impl.EnableVpnGatewayOptionsBuilder_ec2Impl#getVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList <em>Vpn Route Propagation software amazon awscdk services ec2 Subnet Selection As List</em>}</li>
 *   <li>{@link ec2.impl.EnableVpnGatewayOptionsBuilder_ec2Impl#getType_java_lang_String_ <em>Type java lang String </em>}</li>
 *   <li>{@link ec2.impl.EnableVpnGatewayOptionsBuilder_ec2Impl#getAmazonSideAsn_java_lang_Number_ <em>Amazon Side Asn java lang Number </em>}</li>
 *   <li>{@link ec2.impl.EnableVpnGatewayOptionsBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.impl.EnableVpnGatewayOptionsBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.impl.EnableVpnGatewayOptionsBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.impl.EnableVpnGatewayOptionsBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnableVpnGatewayOptionsBuilder_ec2Impl extends MinimalEObjectImpl.Container
		implements EnableVpnGatewayOptionsBuilder_ec2 {
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
	 * The default value of the '{@link #getType_java_lang_String_() <em>Type java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType_java_lang_String_() <em>Type java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String type_java_lang_String_ = TYPE_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getAmazonSideAsn_java_lang_Number_() <em>Amazon Side Asn java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmazonSideAsn_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int AMAZON_SIDE_ASN_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAmazonSideAsn_java_lang_Number_() <em>Amazon Side Asn java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmazonSideAsn_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int amazonSideAsn_java_lang_Number_ = AMAZON_SIDE_ASN_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.EnableVpnGatewayOptions";

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
	protected EnableVpnGatewayOptionsBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.Literals.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2;
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
					Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__VPN_ROUTE_PROPAGATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST,
					oldVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList,
					vpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType_java_lang_String_() {
		return type_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType_java_lang_String_(String newType_java_lang_String_) {
		String oldType_java_lang_String_ = type_java_lang_String_;
		type_java_lang_String_ = newType_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__TYPE_JAVA_LANG_STRING_,
					oldType_java_lang_String_, type_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAmazonSideAsn_java_lang_Number_() {
		return amazonSideAsn_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmazonSideAsn_java_lang_Number_(int newAmazonSideAsn_java_lang_Number_) {
		int oldAmazonSideAsn_java_lang_Number_ = amazonSideAsn_java_lang_Number_;
		amazonSideAsn_java_lang_Number_ = newAmazonSideAsn_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__AMAZON_SIDE_ASN_JAVA_LANG_NUMBER_,
					oldAmazonSideAsn_java_lang_Number_, amazonSideAsn_java_lang_Number_));
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
					Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__VAR_NAME, oldVarName, varName));
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
					Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__IDENTIFIER, oldIdentifier, identifier));
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
					Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE, oldAdditionalCode,
					additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__VPN_ROUTE_PROPAGATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST:
			return getVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList();
		case Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__TYPE_JAVA_LANG_STRING_:
			return getType_java_lang_String_();
		case Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__AMAZON_SIDE_ASN_JAVA_LANG_NUMBER_:
			return getAmazonSideAsn_java_lang_Number_();
		case Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__VPN_ROUTE_PROPAGATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST:
			setVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList((String) newValue);
			return;
		case Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__TYPE_JAVA_LANG_STRING_:
			setType_java_lang_String_((String) newValue);
			return;
		case Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__AMAZON_SIDE_ASN_JAVA_LANG_NUMBER_:
			setAmazonSideAsn_java_lang_Number_((Integer) newValue);
			return;
		case Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__VPN_ROUTE_PROPAGATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST:
			setVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList(
					VPN_ROUTE_PROPAGATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST_EDEFAULT);
			return;
		case Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__TYPE_JAVA_LANG_STRING_:
			setType_java_lang_String_(TYPE_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__AMAZON_SIDE_ASN_JAVA_LANG_NUMBER_:
			setAmazonSideAsn_java_lang_Number_(AMAZON_SIDE_ASN_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__VPN_ROUTE_PROPAGATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST:
			return VPN_ROUTE_PROPAGATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST_EDEFAULT == null
					? vpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList != null
					: !VPN_ROUTE_PROPAGATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST_EDEFAULT
							.equals(vpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList);
		case Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__TYPE_JAVA_LANG_STRING_:
			return TYPE_JAVA_LANG_STRING__EDEFAULT == null ? type_java_lang_String_ != null
					: !TYPE_JAVA_LANG_STRING__EDEFAULT.equals(type_java_lang_String_);
		case Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__AMAZON_SIDE_ASN_JAVA_LANG_NUMBER_:
			return amazonSideAsn_java_lang_Number_ != AMAZON_SIDE_ASN_JAVA_LANG_NUMBER__EDEFAULT;
		case Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case Ec2Package.ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE:
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
		result.append(" (vpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList: ");
		result.append(vpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList);
		result.append(", type_java_lang_String_: ");
		result.append(type_java_lang_String_);
		result.append(", amazonSideAsn_java_lang_Number_: ");
		result.append(amazonSideAsn_java_lang_Number_);
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

} //EnableVpnGatewayOptionsBuilder_ec2Impl
