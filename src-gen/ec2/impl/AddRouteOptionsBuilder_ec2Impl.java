/**
 */
package ec2.impl;

import ec2.AddRouteOptionsBuilder_ec2;
import ec2.Ec2Package;
import ec2.RouterType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Route Options Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ec2.impl.AddRouteOptionsBuilder_ec2Impl#getRouterId_java_lang_String_ <em>Router Id java lang String </em>}</li>
 *   <li>{@link ec2.impl.AddRouteOptionsBuilder_ec2Impl#getRouterType_software_amazon_awscdk_services_ec2_RouterType_ <em>Router Type software amazon awscdk services ec2 Router Type </em>}</li>
 *   <li>{@link ec2.impl.AddRouteOptionsBuilder_ec2Impl#getDestinationCidrBlock_java_lang_String_ <em>Destination Cidr Block java lang String </em>}</li>
 *   <li>{@link ec2.impl.AddRouteOptionsBuilder_ec2Impl#getDestinationIpv6CidrBlock_java_lang_String_ <em>Destination Ipv6 Cidr Block java lang String </em>}</li>
 *   <li>{@link ec2.impl.AddRouteOptionsBuilder_ec2Impl#getEnablesInternetConnectivity_java_lang_Boolean_ <em>Enables Internet Connectivity java lang Boolean </em>}</li>
 *   <li>{@link ec2.impl.AddRouteOptionsBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.impl.AddRouteOptionsBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.impl.AddRouteOptionsBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.impl.AddRouteOptionsBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddRouteOptionsBuilder_ec2Impl extends MinimalEObjectImpl.Container implements AddRouteOptionsBuilder_ec2 {
	/**
	 * The default value of the '{@link #getRouterId_java_lang_String_() <em>Router Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouterId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUTER_ID_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRouterId_java_lang_String_() <em>Router Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouterId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String routerId_java_lang_String_ = ROUTER_ID_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getRouterType_software_amazon_awscdk_services_ec2_RouterType_() <em>Router Type software amazon awscdk services ec2 Router Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouterType_software_amazon_awscdk_services_ec2_RouterType_()
	 * @generated
	 * @ordered
	 */
	protected static final RouterType ROUTER_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ROUTER_TYPE__EDEFAULT = RouterType.EGRESS_ONLY_INTERNET_GATEWAY;

	/**
	 * The cached value of the '{@link #getRouterType_software_amazon_awscdk_services_ec2_RouterType_() <em>Router Type software amazon awscdk services ec2 Router Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouterType_software_amazon_awscdk_services_ec2_RouterType_()
	 * @generated
	 * @ordered
	 */
	protected RouterType routerType_software_amazon_awscdk_services_ec2_RouterType_ = ROUTER_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ROUTER_TYPE__EDEFAULT;

	/**
	 * The default value of the '{@link #getDestinationCidrBlock_java_lang_String_() <em>Destination Cidr Block java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationCidrBlock_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_CIDR_BLOCK_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationCidrBlock_java_lang_String_() <em>Destination Cidr Block java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationCidrBlock_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String destinationCidrBlock_java_lang_String_ = DESTINATION_CIDR_BLOCK_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getDestinationIpv6CidrBlock_java_lang_String_() <em>Destination Ipv6 Cidr Block java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationIpv6CidrBlock_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_IPV6_CIDR_BLOCK_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationIpv6CidrBlock_java_lang_String_() <em>Destination Ipv6 Cidr Block java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationIpv6CidrBlock_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String destinationIpv6CidrBlock_java_lang_String_ = DESTINATION_IPV6_CIDR_BLOCK_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getEnablesInternetConnectivity_java_lang_Boolean_() <em>Enables Internet Connectivity java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnablesInternetConnectivity_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ENABLES_INTERNET_CONNECTIVITY_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnablesInternetConnectivity_java_lang_Boolean_() <em>Enables Internet Connectivity java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnablesInternetConnectivity_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean enablesInternetConnectivity_java_lang_Boolean_ = ENABLES_INTERNET_CONNECTIVITY_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.AddRouteOptions";

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
	protected AddRouteOptionsBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.Literals.ADD_ROUTE_OPTIONS_BUILDER_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRouterId_java_lang_String_() {
		return routerId_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouterId_java_lang_String_(String newRouterId_java_lang_String_) {
		String oldRouterId_java_lang_String_ = routerId_java_lang_String_;
		routerId_java_lang_String_ = newRouterId_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__ROUTER_ID_JAVA_LANG_STRING_,
					oldRouterId_java_lang_String_, routerId_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouterType getRouterType_software_amazon_awscdk_services_ec2_RouterType_() {
		return routerType_software_amazon_awscdk_services_ec2_RouterType_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouterType_software_amazon_awscdk_services_ec2_RouterType_(
			RouterType newRouterType_software_amazon_awscdk_services_ec2_RouterType_) {
		RouterType oldRouterType_software_amazon_awscdk_services_ec2_RouterType_ = routerType_software_amazon_awscdk_services_ec2_RouterType_;
		routerType_software_amazon_awscdk_services_ec2_RouterType_ = newRouterType_software_amazon_awscdk_services_ec2_RouterType_ == null
				? ROUTER_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ROUTER_TYPE__EDEFAULT
				: newRouterType_software_amazon_awscdk_services_ec2_RouterType_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__ROUTER_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ROUTER_TYPE_,
					oldRouterType_software_amazon_awscdk_services_ec2_RouterType_,
					routerType_software_amazon_awscdk_services_ec2_RouterType_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDestinationCidrBlock_java_lang_String_() {
		return destinationCidrBlock_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationCidrBlock_java_lang_String_(String newDestinationCidrBlock_java_lang_String_) {
		String oldDestinationCidrBlock_java_lang_String_ = destinationCidrBlock_java_lang_String_;
		destinationCidrBlock_java_lang_String_ = newDestinationCidrBlock_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__DESTINATION_CIDR_BLOCK_JAVA_LANG_STRING_,
					oldDestinationCidrBlock_java_lang_String_, destinationCidrBlock_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDestinationIpv6CidrBlock_java_lang_String_() {
		return destinationIpv6CidrBlock_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationIpv6CidrBlock_java_lang_String_(String newDestinationIpv6CidrBlock_java_lang_String_) {
		String oldDestinationIpv6CidrBlock_java_lang_String_ = destinationIpv6CidrBlock_java_lang_String_;
		destinationIpv6CidrBlock_java_lang_String_ = newDestinationIpv6CidrBlock_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__DESTINATION_IPV6_CIDR_BLOCK_JAVA_LANG_STRING_,
					oldDestinationIpv6CidrBlock_java_lang_String_, destinationIpv6CidrBlock_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getEnablesInternetConnectivity_java_lang_Boolean_() {
		return enablesInternetConnectivity_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnablesInternetConnectivity_java_lang_Boolean_(
			Boolean newEnablesInternetConnectivity_java_lang_Boolean_) {
		Boolean oldEnablesInternetConnectivity_java_lang_Boolean_ = enablesInternetConnectivity_java_lang_Boolean_;
		enablesInternetConnectivity_java_lang_Boolean_ = newEnablesInternetConnectivity_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__ENABLES_INTERNET_CONNECTIVITY_JAVA_LANG_BOOLEAN_,
					oldEnablesInternetConnectivity_java_lang_Boolean_, enablesInternetConnectivity_java_lang_Boolean_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__VAR_NAME,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__IDENTIFIER,
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__ROUTER_ID_JAVA_LANG_STRING_:
			return getRouterId_java_lang_String_();
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__ROUTER_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ROUTER_TYPE_:
			return getRouterType_software_amazon_awscdk_services_ec2_RouterType_();
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__DESTINATION_CIDR_BLOCK_JAVA_LANG_STRING_:
			return getDestinationCidrBlock_java_lang_String_();
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__DESTINATION_IPV6_CIDR_BLOCK_JAVA_LANG_STRING_:
			return getDestinationIpv6CidrBlock_java_lang_String_();
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__ENABLES_INTERNET_CONNECTIVITY_JAVA_LANG_BOOLEAN_:
			return getEnablesInternetConnectivity_java_lang_Boolean_();
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__ROUTER_ID_JAVA_LANG_STRING_:
			setRouterId_java_lang_String_((String) newValue);
			return;
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__ROUTER_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ROUTER_TYPE_:
			setRouterType_software_amazon_awscdk_services_ec2_RouterType_((RouterType) newValue);
			return;
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__DESTINATION_CIDR_BLOCK_JAVA_LANG_STRING_:
			setDestinationCidrBlock_java_lang_String_((String) newValue);
			return;
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__DESTINATION_IPV6_CIDR_BLOCK_JAVA_LANG_STRING_:
			setDestinationIpv6CidrBlock_java_lang_String_((String) newValue);
			return;
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__ENABLES_INTERNET_CONNECTIVITY_JAVA_LANG_BOOLEAN_:
			setEnablesInternetConnectivity_java_lang_Boolean_((Boolean) newValue);
			return;
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__ROUTER_ID_JAVA_LANG_STRING_:
			setRouterId_java_lang_String_(ROUTER_ID_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__ROUTER_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ROUTER_TYPE_:
			setRouterType_software_amazon_awscdk_services_ec2_RouterType_(
					ROUTER_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ROUTER_TYPE__EDEFAULT);
			return;
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__DESTINATION_CIDR_BLOCK_JAVA_LANG_STRING_:
			setDestinationCidrBlock_java_lang_String_(DESTINATION_CIDR_BLOCK_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__DESTINATION_IPV6_CIDR_BLOCK_JAVA_LANG_STRING_:
			setDestinationIpv6CidrBlock_java_lang_String_(DESTINATION_IPV6_CIDR_BLOCK_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__ENABLES_INTERNET_CONNECTIVITY_JAVA_LANG_BOOLEAN_:
			setEnablesInternetConnectivity_java_lang_Boolean_(
					ENABLES_INTERNET_CONNECTIVITY_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__ROUTER_ID_JAVA_LANG_STRING_:
			return ROUTER_ID_JAVA_LANG_STRING__EDEFAULT == null ? routerId_java_lang_String_ != null
					: !ROUTER_ID_JAVA_LANG_STRING__EDEFAULT.equals(routerId_java_lang_String_);
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__ROUTER_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ROUTER_TYPE_:
			return routerType_software_amazon_awscdk_services_ec2_RouterType_ != ROUTER_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ROUTER_TYPE__EDEFAULT;
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__DESTINATION_CIDR_BLOCK_JAVA_LANG_STRING_:
			return DESTINATION_CIDR_BLOCK_JAVA_LANG_STRING__EDEFAULT == null
					? destinationCidrBlock_java_lang_String_ != null
					: !DESTINATION_CIDR_BLOCK_JAVA_LANG_STRING__EDEFAULT.equals(destinationCidrBlock_java_lang_String_);
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__DESTINATION_IPV6_CIDR_BLOCK_JAVA_LANG_STRING_:
			return DESTINATION_IPV6_CIDR_BLOCK_JAVA_LANG_STRING__EDEFAULT == null
					? destinationIpv6CidrBlock_java_lang_String_ != null
					: !DESTINATION_IPV6_CIDR_BLOCK_JAVA_LANG_STRING__EDEFAULT
							.equals(destinationIpv6CidrBlock_java_lang_String_);
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__ENABLES_INTERNET_CONNECTIVITY_JAVA_LANG_BOOLEAN_:
			return ENABLES_INTERNET_CONNECTIVITY_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? enablesInternetConnectivity_java_lang_Boolean_ != null
					: !ENABLES_INTERNET_CONNECTIVITY_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(enablesInternetConnectivity_java_lang_Boolean_);
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case Ec2Package.ADD_ROUTE_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE:
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
		result.append(" (routerId_java_lang_String_: ");
		result.append(routerId_java_lang_String_);
		result.append(", routerType_software_amazon_awscdk_services_ec2_RouterType_: ");
		result.append(routerType_software_amazon_awscdk_services_ec2_RouterType_);
		result.append(", destinationCidrBlock_java_lang_String_: ");
		result.append(destinationCidrBlock_java_lang_String_);
		result.append(", destinationIpv6CidrBlock_java_lang_String_: ");
		result.append(destinationIpv6CidrBlock_java_lang_String_);
		result.append(", enablesInternetConnectivity_java_lang_Boolean_: ");
		result.append(enablesInternetConnectivity_java_lang_Boolean_);
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

} //AddRouteOptionsBuilder_ec2Impl
