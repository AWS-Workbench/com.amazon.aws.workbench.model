/**
 */
package ec2.impl;

import ec2.Ec2Package;
import ec2.VpcAttributesBuilder_ec2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vpc Attributes Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ec2.impl.VpcAttributesBuilder_ec2Impl#getAvailabilityZones_java_lang_String_AsList <em>Availability Zones java lang String As List</em>}</li>
 *   <li>{@link ec2.impl.VpcAttributesBuilder_ec2Impl#getVpcId_java_lang_String_ <em>Vpc Id java lang String </em>}</li>
 *   <li>{@link ec2.impl.VpcAttributesBuilder_ec2Impl#getIsolatedSubnetIds_java_lang_String_AsList <em>Isolated Subnet Ids java lang String As List</em>}</li>
 *   <li>{@link ec2.impl.VpcAttributesBuilder_ec2Impl#getIsolatedSubnetNames_java_lang_String_AsList <em>Isolated Subnet Names java lang String As List</em>}</li>
 *   <li>{@link ec2.impl.VpcAttributesBuilder_ec2Impl#getIsolatedSubnetRouteTableIds_java_lang_String_AsList <em>Isolated Subnet Route Table Ids java lang String As List</em>}</li>
 *   <li>{@link ec2.impl.VpcAttributesBuilder_ec2Impl#getPrivateSubnetIds_java_lang_String_AsList <em>Private Subnet Ids java lang String As List</em>}</li>
 *   <li>{@link ec2.impl.VpcAttributesBuilder_ec2Impl#getPrivateSubnetNames_java_lang_String_AsList <em>Private Subnet Names java lang String As List</em>}</li>
 *   <li>{@link ec2.impl.VpcAttributesBuilder_ec2Impl#getPrivateSubnetRouteTableIds_java_lang_String_AsList <em>Private Subnet Route Table Ids java lang String As List</em>}</li>
 *   <li>{@link ec2.impl.VpcAttributesBuilder_ec2Impl#getPublicSubnetIds_java_lang_String_AsList <em>Public Subnet Ids java lang String As List</em>}</li>
 *   <li>{@link ec2.impl.VpcAttributesBuilder_ec2Impl#getPublicSubnetNames_java_lang_String_AsList <em>Public Subnet Names java lang String As List</em>}</li>
 *   <li>{@link ec2.impl.VpcAttributesBuilder_ec2Impl#getPublicSubnetRouteTableIds_java_lang_String_AsList <em>Public Subnet Route Table Ids java lang String As List</em>}</li>
 *   <li>{@link ec2.impl.VpcAttributesBuilder_ec2Impl#getVpcCidrBlock_java_lang_String_ <em>Vpc Cidr Block java lang String </em>}</li>
 *   <li>{@link ec2.impl.VpcAttributesBuilder_ec2Impl#getVpnGatewayId_java_lang_String_ <em>Vpn Gateway Id java lang String </em>}</li>
 *   <li>{@link ec2.impl.VpcAttributesBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.impl.VpcAttributesBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.impl.VpcAttributesBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.impl.VpcAttributesBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VpcAttributesBuilder_ec2Impl extends MinimalEObjectImpl.Container implements VpcAttributesBuilder_ec2 {
	/**
	 * The default value of the '{@link #getAvailabilityZones_java_lang_String_AsList() <em>Availability Zones java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityZones_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailabilityZones_java_lang_String_AsList() <em>Availability Zones java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityZones_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String availabilityZones_java_lang_String_AsList = AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getVpcId_java_lang_String_() <em>Vpc Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String VPC_ID_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpcId_java_lang_String_() <em>Vpc Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String vpcId_java_lang_String_ = VPC_ID_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getIsolatedSubnetIds_java_lang_String_AsList() <em>Isolated Subnet Ids java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolatedSubnetIds_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String ISOLATED_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsolatedSubnetIds_java_lang_String_AsList() <em>Isolated Subnet Ids java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolatedSubnetIds_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String isolatedSubnetIds_java_lang_String_AsList = ISOLATED_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsolatedSubnetNames_java_lang_String_AsList() <em>Isolated Subnet Names java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolatedSubnetNames_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String ISOLATED_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsolatedSubnetNames_java_lang_String_AsList() <em>Isolated Subnet Names java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolatedSubnetNames_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String isolatedSubnetNames_java_lang_String_AsList = ISOLATED_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsolatedSubnetRouteTableIds_java_lang_String_AsList() <em>Isolated Subnet Route Table Ids java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolatedSubnetRouteTableIds_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String ISOLATED_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsolatedSubnetRouteTableIds_java_lang_String_AsList() <em>Isolated Subnet Route Table Ids java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolatedSubnetRouteTableIds_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String isolatedSubnetRouteTableIds_java_lang_String_AsList = ISOLATED_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivateSubnetIds_java_lang_String_AsList() <em>Private Subnet Ids java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateSubnetIds_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVATE_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivateSubnetIds_java_lang_String_AsList() <em>Private Subnet Ids java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateSubnetIds_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String privateSubnetIds_java_lang_String_AsList = PRIVATE_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivateSubnetNames_java_lang_String_AsList() <em>Private Subnet Names java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateSubnetNames_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVATE_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivateSubnetNames_java_lang_String_AsList() <em>Private Subnet Names java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateSubnetNames_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String privateSubnetNames_java_lang_String_AsList = PRIVATE_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivateSubnetRouteTableIds_java_lang_String_AsList() <em>Private Subnet Route Table Ids java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateSubnetRouteTableIds_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVATE_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivateSubnetRouteTableIds_java_lang_String_AsList() <em>Private Subnet Route Table Ids java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateSubnetRouteTableIds_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String privateSubnetRouteTableIds_java_lang_String_AsList = PRIVATE_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublicSubnetIds_java_lang_String_AsList() <em>Public Subnet Ids java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicSubnetIds_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLIC_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicSubnetIds_java_lang_String_AsList() <em>Public Subnet Ids java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicSubnetIds_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String publicSubnetIds_java_lang_String_AsList = PUBLIC_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublicSubnetNames_java_lang_String_AsList() <em>Public Subnet Names java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicSubnetNames_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLIC_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicSubnetNames_java_lang_String_AsList() <em>Public Subnet Names java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicSubnetNames_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String publicSubnetNames_java_lang_String_AsList = PUBLIC_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublicSubnetRouteTableIds_java_lang_String_AsList() <em>Public Subnet Route Table Ids java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicSubnetRouteTableIds_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLIC_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicSubnetRouteTableIds_java_lang_String_AsList() <em>Public Subnet Route Table Ids java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicSubnetRouteTableIds_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String publicSubnetRouteTableIds_java_lang_String_AsList = PUBLIC_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getVpcCidrBlock_java_lang_String_() <em>Vpc Cidr Block java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcCidrBlock_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String VPC_CIDR_BLOCK_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpcCidrBlock_java_lang_String_() <em>Vpc Cidr Block java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcCidrBlock_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String vpcCidrBlock_java_lang_String_ = VPC_CIDR_BLOCK_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getVpnGatewayId_java_lang_String_() <em>Vpn Gateway Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpnGatewayId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String VPN_GATEWAY_ID_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpnGatewayId_java_lang_String_() <em>Vpn Gateway Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpnGatewayId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String vpnGatewayId_java_lang_String_ = VPN_GATEWAY_ID_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.VpcAttributes";

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
	protected VpcAttributesBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.Literals.VPC_ATTRIBUTES_BUILDER_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAvailabilityZones_java_lang_String_AsList() {
		return availabilityZones_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailabilityZones_java_lang_String_AsList(String newAvailabilityZones_java_lang_String_AsList) {
		String oldAvailabilityZones_java_lang_String_AsList = availabilityZones_java_lang_String_AsList;
		availabilityZones_java_lang_String_AsList = newAvailabilityZones_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST,
					oldAvailabilityZones_java_lang_String_AsList, availabilityZones_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVpcId_java_lang_String_() {
		return vpcId_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpcId_java_lang_String_(String newVpcId_java_lang_String_) {
		String oldVpcId_java_lang_String_ = vpcId_java_lang_String_;
		vpcId_java_lang_String_ = newVpcId_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_, oldVpcId_java_lang_String_,
					vpcId_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIsolatedSubnetIds_java_lang_String_AsList() {
		return isolatedSubnetIds_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsolatedSubnetIds_java_lang_String_AsList(String newIsolatedSubnetIds_java_lang_String_AsList) {
		String oldIsolatedSubnetIds_java_lang_String_AsList = isolatedSubnetIds_java_lang_String_AsList;
		isolatedSubnetIds_java_lang_String_AsList = newIsolatedSubnetIds_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__ISOLATED_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST,
					oldIsolatedSubnetIds_java_lang_String_AsList, isolatedSubnetIds_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIsolatedSubnetNames_java_lang_String_AsList() {
		return isolatedSubnetNames_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsolatedSubnetNames_java_lang_String_AsList(String newIsolatedSubnetNames_java_lang_String_AsList) {
		String oldIsolatedSubnetNames_java_lang_String_AsList = isolatedSubnetNames_java_lang_String_AsList;
		isolatedSubnetNames_java_lang_String_AsList = newIsolatedSubnetNames_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__ISOLATED_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST,
					oldIsolatedSubnetNames_java_lang_String_AsList, isolatedSubnetNames_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIsolatedSubnetRouteTableIds_java_lang_String_AsList() {
		return isolatedSubnetRouteTableIds_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsolatedSubnetRouteTableIds_java_lang_String_AsList(
			String newIsolatedSubnetRouteTableIds_java_lang_String_AsList) {
		String oldIsolatedSubnetRouteTableIds_java_lang_String_AsList = isolatedSubnetRouteTableIds_java_lang_String_AsList;
		isolatedSubnetRouteTableIds_java_lang_String_AsList = newIsolatedSubnetRouteTableIds_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__ISOLATED_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST,
					oldIsolatedSubnetRouteTableIds_java_lang_String_AsList,
					isolatedSubnetRouteTableIds_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrivateSubnetIds_java_lang_String_AsList() {
		return privateSubnetIds_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivateSubnetIds_java_lang_String_AsList(String newPrivateSubnetIds_java_lang_String_AsList) {
		String oldPrivateSubnetIds_java_lang_String_AsList = privateSubnetIds_java_lang_String_AsList;
		privateSubnetIds_java_lang_String_AsList = newPrivateSubnetIds_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PRIVATE_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST,
					oldPrivateSubnetIds_java_lang_String_AsList, privateSubnetIds_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrivateSubnetNames_java_lang_String_AsList() {
		return privateSubnetNames_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivateSubnetNames_java_lang_String_AsList(String newPrivateSubnetNames_java_lang_String_AsList) {
		String oldPrivateSubnetNames_java_lang_String_AsList = privateSubnetNames_java_lang_String_AsList;
		privateSubnetNames_java_lang_String_AsList = newPrivateSubnetNames_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PRIVATE_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST,
					oldPrivateSubnetNames_java_lang_String_AsList, privateSubnetNames_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrivateSubnetRouteTableIds_java_lang_String_AsList() {
		return privateSubnetRouteTableIds_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivateSubnetRouteTableIds_java_lang_String_AsList(
			String newPrivateSubnetRouteTableIds_java_lang_String_AsList) {
		String oldPrivateSubnetRouteTableIds_java_lang_String_AsList = privateSubnetRouteTableIds_java_lang_String_AsList;
		privateSubnetRouteTableIds_java_lang_String_AsList = newPrivateSubnetRouteTableIds_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PRIVATE_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST,
					oldPrivateSubnetRouteTableIds_java_lang_String_AsList,
					privateSubnetRouteTableIds_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPublicSubnetIds_java_lang_String_AsList() {
		return publicSubnetIds_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicSubnetIds_java_lang_String_AsList(String newPublicSubnetIds_java_lang_String_AsList) {
		String oldPublicSubnetIds_java_lang_String_AsList = publicSubnetIds_java_lang_String_AsList;
		publicSubnetIds_java_lang_String_AsList = newPublicSubnetIds_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PUBLIC_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST,
					oldPublicSubnetIds_java_lang_String_AsList, publicSubnetIds_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPublicSubnetNames_java_lang_String_AsList() {
		return publicSubnetNames_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicSubnetNames_java_lang_String_AsList(String newPublicSubnetNames_java_lang_String_AsList) {
		String oldPublicSubnetNames_java_lang_String_AsList = publicSubnetNames_java_lang_String_AsList;
		publicSubnetNames_java_lang_String_AsList = newPublicSubnetNames_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PUBLIC_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST,
					oldPublicSubnetNames_java_lang_String_AsList, publicSubnetNames_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPublicSubnetRouteTableIds_java_lang_String_AsList() {
		return publicSubnetRouteTableIds_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicSubnetRouteTableIds_java_lang_String_AsList(
			String newPublicSubnetRouteTableIds_java_lang_String_AsList) {
		String oldPublicSubnetRouteTableIds_java_lang_String_AsList = publicSubnetRouteTableIds_java_lang_String_AsList;
		publicSubnetRouteTableIds_java_lang_String_AsList = newPublicSubnetRouteTableIds_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PUBLIC_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST,
					oldPublicSubnetRouteTableIds_java_lang_String_AsList,
					publicSubnetRouteTableIds_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVpcCidrBlock_java_lang_String_() {
		return vpcCidrBlock_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpcCidrBlock_java_lang_String_(String newVpcCidrBlock_java_lang_String_) {
		String oldVpcCidrBlock_java_lang_String_ = vpcCidrBlock_java_lang_String_;
		vpcCidrBlock_java_lang_String_ = newVpcCidrBlock_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__VPC_CIDR_BLOCK_JAVA_LANG_STRING_,
					oldVpcCidrBlock_java_lang_String_, vpcCidrBlock_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVpnGatewayId_java_lang_String_() {
		return vpnGatewayId_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpnGatewayId_java_lang_String_(String newVpnGatewayId_java_lang_String_) {
		String oldVpnGatewayId_java_lang_String_ = vpnGatewayId_java_lang_String_;
		vpnGatewayId_java_lang_String_ = newVpnGatewayId_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__VPN_GATEWAY_ID_JAVA_LANG_STRING_,
					oldVpnGatewayId_java_lang_String_, vpnGatewayId_java_lang_String_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__VAR_NAME,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__IDENTIFIER,
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
					Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST:
			return getAvailabilityZones_java_lang_String_AsList();
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_:
			return getVpcId_java_lang_String_();
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__ISOLATED_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST:
			return getIsolatedSubnetIds_java_lang_String_AsList();
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__ISOLATED_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST:
			return getIsolatedSubnetNames_java_lang_String_AsList();
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__ISOLATED_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST:
			return getIsolatedSubnetRouteTableIds_java_lang_String_AsList();
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PRIVATE_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST:
			return getPrivateSubnetIds_java_lang_String_AsList();
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PRIVATE_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST:
			return getPrivateSubnetNames_java_lang_String_AsList();
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PRIVATE_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST:
			return getPrivateSubnetRouteTableIds_java_lang_String_AsList();
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PUBLIC_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST:
			return getPublicSubnetIds_java_lang_String_AsList();
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PUBLIC_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST:
			return getPublicSubnetNames_java_lang_String_AsList();
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PUBLIC_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST:
			return getPublicSubnetRouteTableIds_java_lang_String_AsList();
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__VPC_CIDR_BLOCK_JAVA_LANG_STRING_:
			return getVpcCidrBlock_java_lang_String_();
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__VPN_GATEWAY_ID_JAVA_LANG_STRING_:
			return getVpnGatewayId_java_lang_String_();
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST:
			setAvailabilityZones_java_lang_String_AsList((String) newValue);
			return;
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_:
			setVpcId_java_lang_String_((String) newValue);
			return;
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__ISOLATED_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST:
			setIsolatedSubnetIds_java_lang_String_AsList((String) newValue);
			return;
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__ISOLATED_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST:
			setIsolatedSubnetNames_java_lang_String_AsList((String) newValue);
			return;
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__ISOLATED_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST:
			setIsolatedSubnetRouteTableIds_java_lang_String_AsList((String) newValue);
			return;
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PRIVATE_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST:
			setPrivateSubnetIds_java_lang_String_AsList((String) newValue);
			return;
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PRIVATE_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST:
			setPrivateSubnetNames_java_lang_String_AsList((String) newValue);
			return;
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PRIVATE_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST:
			setPrivateSubnetRouteTableIds_java_lang_String_AsList((String) newValue);
			return;
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PUBLIC_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST:
			setPublicSubnetIds_java_lang_String_AsList((String) newValue);
			return;
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PUBLIC_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST:
			setPublicSubnetNames_java_lang_String_AsList((String) newValue);
			return;
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PUBLIC_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST:
			setPublicSubnetRouteTableIds_java_lang_String_AsList((String) newValue);
			return;
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__VPC_CIDR_BLOCK_JAVA_LANG_STRING_:
			setVpcCidrBlock_java_lang_String_((String) newValue);
			return;
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__VPN_GATEWAY_ID_JAVA_LANG_STRING_:
			setVpnGatewayId_java_lang_String_((String) newValue);
			return;
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST:
			setAvailabilityZones_java_lang_String_AsList(AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_:
			setVpcId_java_lang_String_(VPC_ID_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__ISOLATED_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST:
			setIsolatedSubnetIds_java_lang_String_AsList(ISOLATED_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__ISOLATED_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST:
			setIsolatedSubnetNames_java_lang_String_AsList(ISOLATED_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__ISOLATED_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST:
			setIsolatedSubnetRouteTableIds_java_lang_String_AsList(
					ISOLATED_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PRIVATE_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST:
			setPrivateSubnetIds_java_lang_String_AsList(PRIVATE_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PRIVATE_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST:
			setPrivateSubnetNames_java_lang_String_AsList(PRIVATE_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PRIVATE_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST:
			setPrivateSubnetRouteTableIds_java_lang_String_AsList(
					PRIVATE_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PUBLIC_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST:
			setPublicSubnetIds_java_lang_String_AsList(PUBLIC_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PUBLIC_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST:
			setPublicSubnetNames_java_lang_String_AsList(PUBLIC_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PUBLIC_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST:
			setPublicSubnetRouteTableIds_java_lang_String_AsList(
					PUBLIC_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__VPC_CIDR_BLOCK_JAVA_LANG_STRING_:
			setVpcCidrBlock_java_lang_String_(VPC_CIDR_BLOCK_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__VPN_GATEWAY_ID_JAVA_LANG_STRING_:
			setVpnGatewayId_java_lang_String_(VPN_GATEWAY_ID_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST:
			return AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? availabilityZones_java_lang_String_AsList != null
					: !AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST_EDEFAULT
							.equals(availabilityZones_java_lang_String_AsList);
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_:
			return VPC_ID_JAVA_LANG_STRING__EDEFAULT == null ? vpcId_java_lang_String_ != null
					: !VPC_ID_JAVA_LANG_STRING__EDEFAULT.equals(vpcId_java_lang_String_);
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__ISOLATED_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST:
			return ISOLATED_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? isolatedSubnetIds_java_lang_String_AsList != null
					: !ISOLATED_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT
							.equals(isolatedSubnetIds_java_lang_String_AsList);
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__ISOLATED_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST:
			return ISOLATED_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? isolatedSubnetNames_java_lang_String_AsList != null
					: !ISOLATED_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST_EDEFAULT
							.equals(isolatedSubnetNames_java_lang_String_AsList);
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__ISOLATED_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST:
			return ISOLATED_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? isolatedSubnetRouteTableIds_java_lang_String_AsList != null
					: !ISOLATED_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT
							.equals(isolatedSubnetRouteTableIds_java_lang_String_AsList);
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PRIVATE_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST:
			return PRIVATE_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? privateSubnetIds_java_lang_String_AsList != null
					: !PRIVATE_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT
							.equals(privateSubnetIds_java_lang_String_AsList);
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PRIVATE_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST:
			return PRIVATE_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? privateSubnetNames_java_lang_String_AsList != null
					: !PRIVATE_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST_EDEFAULT
							.equals(privateSubnetNames_java_lang_String_AsList);
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PRIVATE_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST:
			return PRIVATE_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? privateSubnetRouteTableIds_java_lang_String_AsList != null
					: !PRIVATE_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT
							.equals(privateSubnetRouteTableIds_java_lang_String_AsList);
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PUBLIC_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST:
			return PUBLIC_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? publicSubnetIds_java_lang_String_AsList != null
					: !PUBLIC_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT
							.equals(publicSubnetIds_java_lang_String_AsList);
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PUBLIC_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST:
			return PUBLIC_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? publicSubnetNames_java_lang_String_AsList != null
					: !PUBLIC_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST_EDEFAULT
							.equals(publicSubnetNames_java_lang_String_AsList);
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PUBLIC_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST:
			return PUBLIC_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? publicSubnetRouteTableIds_java_lang_String_AsList != null
					: !PUBLIC_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT
							.equals(publicSubnetRouteTableIds_java_lang_String_AsList);
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__VPC_CIDR_BLOCK_JAVA_LANG_STRING_:
			return VPC_CIDR_BLOCK_JAVA_LANG_STRING__EDEFAULT == null ? vpcCidrBlock_java_lang_String_ != null
					: !VPC_CIDR_BLOCK_JAVA_LANG_STRING__EDEFAULT.equals(vpcCidrBlock_java_lang_String_);
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__VPN_GATEWAY_ID_JAVA_LANG_STRING_:
			return VPN_GATEWAY_ID_JAVA_LANG_STRING__EDEFAULT == null ? vpnGatewayId_java_lang_String_ != null
					: !VPN_GATEWAY_ID_JAVA_LANG_STRING__EDEFAULT.equals(vpnGatewayId_java_lang_String_);
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__ADDITIONAL_CODE:
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
		result.append(" (availabilityZones_java_lang_String_AsList: ");
		result.append(availabilityZones_java_lang_String_AsList);
		result.append(", vpcId_java_lang_String_: ");
		result.append(vpcId_java_lang_String_);
		result.append(", isolatedSubnetIds_java_lang_String_AsList: ");
		result.append(isolatedSubnetIds_java_lang_String_AsList);
		result.append(", isolatedSubnetNames_java_lang_String_AsList: ");
		result.append(isolatedSubnetNames_java_lang_String_AsList);
		result.append(", isolatedSubnetRouteTableIds_java_lang_String_AsList: ");
		result.append(isolatedSubnetRouteTableIds_java_lang_String_AsList);
		result.append(", privateSubnetIds_java_lang_String_AsList: ");
		result.append(privateSubnetIds_java_lang_String_AsList);
		result.append(", privateSubnetNames_java_lang_String_AsList: ");
		result.append(privateSubnetNames_java_lang_String_AsList);
		result.append(", privateSubnetRouteTableIds_java_lang_String_AsList: ");
		result.append(privateSubnetRouteTableIds_java_lang_String_AsList);
		result.append(", publicSubnetIds_java_lang_String_AsList: ");
		result.append(publicSubnetIds_java_lang_String_AsList);
		result.append(", publicSubnetNames_java_lang_String_AsList: ");
		result.append(publicSubnetNames_java_lang_String_AsList);
		result.append(", publicSubnetRouteTableIds_java_lang_String_AsList: ");
		result.append(publicSubnetRouteTableIds_java_lang_String_AsList);
		result.append(", vpcCidrBlock_java_lang_String_: ");
		result.append(vpcCidrBlock_java_lang_String_);
		result.append(", vpnGatewayId_java_lang_String_: ");
		result.append(vpnGatewayId_java_lang_String_);
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

} //VpcAttributesBuilder_ec2Impl
