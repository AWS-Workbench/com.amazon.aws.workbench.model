/**
 */
package ec2.impl;

import ec2.Ec2Package;
import ec2.InterfaceVpcEndpointBuilder_ec2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Vpc Endpoint Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ec2.impl.InterfaceVpcEndpointBuilder_ec2Impl#getServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference <em>Service With IInterface Vpc Endpoint Service software amazon awscdk services ec2 IInterface Vpc Endpoint Service As Reference</em>}</li>
 *   <li>{@link ec2.impl.InterfaceVpcEndpointBuilder_ec2Impl#getLookupSupportedAzs_java_lang_Boolean_ <em>Lookup Supported Azs java lang Boolean </em>}</li>
 *   <li>{@link ec2.impl.InterfaceVpcEndpointBuilder_ec2Impl#getOpen_java_lang_Boolean_ <em>Open java lang Boolean </em>}</li>
 *   <li>{@link ec2.impl.InterfaceVpcEndpointBuilder_ec2Impl#getPrivateDnsEnabled_java_lang_Boolean_ <em>Private Dns Enabled java lang Boolean </em>}</li>
 *   <li>{@link ec2.impl.InterfaceVpcEndpointBuilder_ec2Impl#getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList <em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>}</li>
 *   <li>{@link ec2.impl.InterfaceVpcEndpointBuilder_ec2Impl#getSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}</li>
 *   <li>{@link ec2.impl.InterfaceVpcEndpointBuilder_ec2Impl#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}</li>
 *   <li>{@link ec2.impl.InterfaceVpcEndpointBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.impl.InterfaceVpcEndpointBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.impl.InterfaceVpcEndpointBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.impl.InterfaceVpcEndpointBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceVpcEndpointBuilder_ec2Impl extends MinimalEObjectImpl.Container
		implements InterfaceVpcEndpointBuilder_ec2 {
	/**
	 * The default value of the '{@link #getServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference() <em>Service With IInterface Vpc Endpoint Service software amazon awscdk services ec2 IInterface Vpc Endpoint Service As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_WITH_IINTERFACE_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IINTERFACE_VPC_ENDPOINT_SERVICE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference() <em>Service With IInterface Vpc Endpoint Service software amazon awscdk services ec2 IInterface Vpc Endpoint Service As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String serviceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference = SERVICE_WITH_IINTERFACE_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IINTERFACE_VPC_ENDPOINT_SERVICE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLookupSupportedAzs_java_lang_Boolean_() <em>Lookup Supported Azs java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLookupSupportedAzs_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean LOOKUP_SUPPORTED_AZS_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLookupSupportedAzs_java_lang_Boolean_() <em>Lookup Supported Azs java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLookupSupportedAzs_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean lookupSupportedAzs_java_lang_Boolean_ = LOOKUP_SUPPORTED_AZS_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getOpen_java_lang_Boolean_() <em>Open java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpen_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean OPEN_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpen_java_lang_Boolean_() <em>Open java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpen_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean open_java_lang_Boolean_ = OPEN_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivateDnsEnabled_java_lang_Boolean_() <em>Private Dns Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateDnsEnabled_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PRIVATE_DNS_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivateDnsEnabled_java_lang_Boolean_() <em>Private Dns Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateDnsEnabled_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean privateDnsEnabled_java_lang_Boolean_ = PRIVATE_DNS_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList() <em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList() <em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList()
	 * @generated
	 * @ordered
	 */
	protected String securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList = SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() <em>Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() <em>Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String subnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference = SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference = VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.InterfaceVpcEndpoint";

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
	protected InterfaceVpcEndpointBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.Literals.INTERFACE_VPC_ENDPOINT_BUILDER_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference() {
		return serviceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference(
			String newServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference) {
		String oldServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference = serviceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference;
		serviceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference = newServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__SERVICE_WITH_IINTERFACE_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IINTERFACE_VPC_ENDPOINT_SERVICE_AS_REFERENCE,
					oldServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference,
					serviceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getLookupSupportedAzs_java_lang_Boolean_() {
		return lookupSupportedAzs_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLookupSupportedAzs_java_lang_Boolean_(Boolean newLookupSupportedAzs_java_lang_Boolean_) {
		Boolean oldLookupSupportedAzs_java_lang_Boolean_ = lookupSupportedAzs_java_lang_Boolean_;
		lookupSupportedAzs_java_lang_Boolean_ = newLookupSupportedAzs_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__LOOKUP_SUPPORTED_AZS_JAVA_LANG_BOOLEAN_,
					oldLookupSupportedAzs_java_lang_Boolean_, lookupSupportedAzs_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getOpen_java_lang_Boolean_() {
		return open_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpen_java_lang_Boolean_(Boolean newOpen_java_lang_Boolean_) {
		Boolean oldOpen_java_lang_Boolean_ = open_java_lang_Boolean_;
		open_java_lang_Boolean_ = newOpen_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__OPEN_JAVA_LANG_BOOLEAN_, oldOpen_java_lang_Boolean_,
					open_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPrivateDnsEnabled_java_lang_Boolean_() {
		return privateDnsEnabled_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivateDnsEnabled_java_lang_Boolean_(Boolean newPrivateDnsEnabled_java_lang_Boolean_) {
		Boolean oldPrivateDnsEnabled_java_lang_Boolean_ = privateDnsEnabled_java_lang_Boolean_;
		privateDnsEnabled_java_lang_Boolean_ = newPrivateDnsEnabled_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__PRIVATE_DNS_ENABLED_JAVA_LANG_BOOLEAN_,
					oldPrivateDnsEnabled_java_lang_Boolean_, privateDnsEnabled_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList() {
		return securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList(
			String newSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList) {
		String oldSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList = securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList;
		securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList = newSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST,
					oldSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList,
					securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() {
		return subnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(
			String newSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference) {
		String oldSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference = subnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference;
		subnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference = newSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE,
					oldSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference,
					subnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() {
		return vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(
			String newVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference) {
		String oldVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference = vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference;
		vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference = newVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE,
					oldVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference,
					vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference));
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
					Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__VAR_NAME, oldVarName, varName));
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
					Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__IDENTIFIER, oldIdentifier, identifier));
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
					Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__SERVICE_WITH_IINTERFACE_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IINTERFACE_VPC_ENDPOINT_SERVICE_AS_REFERENCE:
			return getServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference();
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__LOOKUP_SUPPORTED_AZS_JAVA_LANG_BOOLEAN_:
			return getLookupSupportedAzs_java_lang_Boolean_();
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__OPEN_JAVA_LANG_BOOLEAN_:
			return getOpen_java_lang_Boolean_();
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__PRIVATE_DNS_ENABLED_JAVA_LANG_BOOLEAN_:
			return getPrivateDnsEnabled_java_lang_Boolean_();
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST:
			return getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList();
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
			return getSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			return getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__SERVICE_WITH_IINTERFACE_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IINTERFACE_VPC_ENDPOINT_SERVICE_AS_REFERENCE:
			setServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference(
					(String) newValue);
			return;
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__LOOKUP_SUPPORTED_AZS_JAVA_LANG_BOOLEAN_:
			setLookupSupportedAzs_java_lang_Boolean_((Boolean) newValue);
			return;
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__OPEN_JAVA_LANG_BOOLEAN_:
			setOpen_java_lang_Boolean_((Boolean) newValue);
			return;
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__PRIVATE_DNS_ENABLED_JAVA_LANG_BOOLEAN_:
			setPrivateDnsEnabled_java_lang_Boolean_((Boolean) newValue);
			return;
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST:
			setSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList((String) newValue);
			return;
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
			setSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(
					(String) newValue);
			return;
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference((String) newValue);
			return;
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__SERVICE_WITH_IINTERFACE_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IINTERFACE_VPC_ENDPOINT_SERVICE_AS_REFERENCE:
			setServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference(
					SERVICE_WITH_IINTERFACE_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IINTERFACE_VPC_ENDPOINT_SERVICE_AS_REFERENCE_EDEFAULT);
			return;
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__LOOKUP_SUPPORTED_AZS_JAVA_LANG_BOOLEAN_:
			setLookupSupportedAzs_java_lang_Boolean_(LOOKUP_SUPPORTED_AZS_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__OPEN_JAVA_LANG_BOOLEAN_:
			setOpen_java_lang_Boolean_(OPEN_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__PRIVATE_DNS_ENABLED_JAVA_LANG_BOOLEAN_:
			setPrivateDnsEnabled_java_lang_Boolean_(PRIVATE_DNS_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST:
			setSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList(
					SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST_EDEFAULT);
			return;
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
			setSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(
					SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT);
			return;
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(
					VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT);
			return;
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__SERVICE_WITH_IINTERFACE_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IINTERFACE_VPC_ENDPOINT_SERVICE_AS_REFERENCE:
			return SERVICE_WITH_IINTERFACE_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IINTERFACE_VPC_ENDPOINT_SERVICE_AS_REFERENCE_EDEFAULT == null
					? serviceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference != null
					: !SERVICE_WITH_IINTERFACE_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IINTERFACE_VPC_ENDPOINT_SERVICE_AS_REFERENCE_EDEFAULT
							.equals(serviceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference);
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__LOOKUP_SUPPORTED_AZS_JAVA_LANG_BOOLEAN_:
			return LOOKUP_SUPPORTED_AZS_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? lookupSupportedAzs_java_lang_Boolean_ != null
					: !LOOKUP_SUPPORTED_AZS_JAVA_LANG_BOOLEAN__EDEFAULT.equals(lookupSupportedAzs_java_lang_Boolean_);
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__OPEN_JAVA_LANG_BOOLEAN_:
			return OPEN_JAVA_LANG_BOOLEAN__EDEFAULT == null ? open_java_lang_Boolean_ != null
					: !OPEN_JAVA_LANG_BOOLEAN__EDEFAULT.equals(open_java_lang_Boolean_);
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__PRIVATE_DNS_ENABLED_JAVA_LANG_BOOLEAN_:
			return PRIVATE_DNS_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? privateDnsEnabled_java_lang_Boolean_ != null
					: !PRIVATE_DNS_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT.equals(privateDnsEnabled_java_lang_Boolean_);
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST:
			return SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST_EDEFAULT == null
					? securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList != null
					: !SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST_EDEFAULT
							.equals(securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList);
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
			return SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT == null
					? subnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference != null
					: !SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT
							.equals(subnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference);
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			return VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT == null
					? vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference != null
					: !VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT
							.equals(vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference);
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__ADDITIONAL_CODE:
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
		result.append(
				" (serviceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference: ");
		result.append(
				serviceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference);
		result.append(", lookupSupportedAzs_java_lang_Boolean_: ");
		result.append(lookupSupportedAzs_java_lang_Boolean_);
		result.append(", open_java_lang_Boolean_: ");
		result.append(open_java_lang_Boolean_);
		result.append(", privateDnsEnabled_java_lang_Boolean_: ");
		result.append(privateDnsEnabled_java_lang_Boolean_);
		result.append(", securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList: ");
		result.append(securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList);
		result.append(", subnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference: ");
		result.append(subnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference);
		result.append(", vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference: ");
		result.append(vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference);
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

} //InterfaceVpcEndpointBuilder_ec2Impl
