/**
 */
package ec2.impl;

import ec2.ConfigureNatOptionsBuilder_ec2;
import ec2.Ec2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configure Nat Options Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ec2.impl.ConfigureNatOptionsBuilder_ec2Impl#getNatSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList <em>Nat Subnets software amazon awscdk services ec2 Public Subnet As List</em>}</li>
 *   <li>{@link ec2.impl.ConfigureNatOptionsBuilder_ec2Impl#getPrivateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList <em>Private Subnets software amazon awscdk services ec2 Private Subnet As List</em>}</li>
 *   <li>{@link ec2.impl.ConfigureNatOptionsBuilder_ec2Impl#getVpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference <em>Vpc With Vpc software amazon awscdk services ec2 Vpc As Reference</em>}</li>
 *   <li>{@link ec2.impl.ConfigureNatOptionsBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.impl.ConfigureNatOptionsBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.impl.ConfigureNatOptionsBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.impl.ConfigureNatOptionsBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigureNatOptionsBuilder_ec2Impl extends MinimalEObjectImpl.Container
		implements ConfigureNatOptionsBuilder_ec2 {
	/**
	 * The default value of the '{@link #getNatSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList() <em>Nat Subnets software amazon awscdk services ec2 Public Subnet As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String NAT_SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PUBLIC_SUBNET_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNatSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList() <em>Nat Subnets software amazon awscdk services ec2 Public Subnet As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList()
	 * @generated
	 * @ordered
	 */
	protected String natSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList = NAT_SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PUBLIC_SUBNET_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList() <em>Private Subnets software amazon awscdk services ec2 Private Subnet As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVATE_SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PRIVATE_SUBNET_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList() <em>Private Subnets software amazon awscdk services ec2 Private Subnet As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList()
	 * @generated
	 * @ordered
	 */
	protected String privateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList = PRIVATE_SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PRIVATE_SUBNET_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getVpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference() <em>Vpc With Vpc software amazon awscdk services ec2 Vpc As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String VPC_WITH_VPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPC_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference() <em>Vpc With Vpc software amazon awscdk services ec2 Vpc As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String vpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference = VPC_WITH_VPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPC_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.ConfigureNatOptions";

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
	protected ConfigureNatOptionsBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.Literals.CONFIGURE_NAT_OPTIONS_BUILDER_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNatSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList() {
		return natSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNatSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList(
			String newNatSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList) {
		String oldNatSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList = natSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList;
		natSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList = newNatSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2__NAT_SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PUBLIC_SUBNET_AS_LIST,
					oldNatSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList,
					natSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrivateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList() {
		return privateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList(
			String newPrivateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList) {
		String oldPrivateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList = privateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList;
		privateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList = newPrivateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2__PRIVATE_SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PRIVATE_SUBNET_AS_LIST,
					oldPrivateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList,
					privateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference() {
		return vpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference(
			String newVpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference) {
		String oldVpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference = vpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference;
		vpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference = newVpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2__VPC_WITH_VPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPC_AS_REFERENCE,
					oldVpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference,
					vpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference));
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
					Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2__VAR_NAME, oldVarName, varName));
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
					Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2__IDENTIFIER, oldIdentifier, identifier));
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
					Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2__NAT_SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PUBLIC_SUBNET_AS_LIST:
			return getNatSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList();
		case Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2__PRIVATE_SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PRIVATE_SUBNET_AS_LIST:
			return getPrivateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList();
		case Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2__VPC_WITH_VPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPC_AS_REFERENCE:
			return getVpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference();
		case Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2__NAT_SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PUBLIC_SUBNET_AS_LIST:
			setNatSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList((String) newValue);
			return;
		case Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2__PRIVATE_SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PRIVATE_SUBNET_AS_LIST:
			setPrivateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList((String) newValue);
			return;
		case Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2__VPC_WITH_VPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPC_AS_REFERENCE:
			setVpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference((String) newValue);
			return;
		case Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2__NAT_SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PUBLIC_SUBNET_AS_LIST:
			setNatSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList(
					NAT_SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PUBLIC_SUBNET_AS_LIST_EDEFAULT);
			return;
		case Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2__PRIVATE_SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PRIVATE_SUBNET_AS_LIST:
			setPrivateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList(
					PRIVATE_SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PRIVATE_SUBNET_AS_LIST_EDEFAULT);
			return;
		case Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2__VPC_WITH_VPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPC_AS_REFERENCE:
			setVpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference(
					VPC_WITH_VPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPC_AS_REFERENCE_EDEFAULT);
			return;
		case Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2__NAT_SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PUBLIC_SUBNET_AS_LIST:
			return NAT_SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PUBLIC_SUBNET_AS_LIST_EDEFAULT == null
					? natSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList != null
					: !NAT_SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PUBLIC_SUBNET_AS_LIST_EDEFAULT
							.equals(natSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList);
		case Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2__PRIVATE_SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PRIVATE_SUBNET_AS_LIST:
			return PRIVATE_SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PRIVATE_SUBNET_AS_LIST_EDEFAULT == null
					? privateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList != null
					: !PRIVATE_SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PRIVATE_SUBNET_AS_LIST_EDEFAULT
							.equals(privateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList);
		case Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2__VPC_WITH_VPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPC_AS_REFERENCE:
			return VPC_WITH_VPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPC_AS_REFERENCE_EDEFAULT == null
					? vpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference != null
					: !VPC_WITH_VPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPC_AS_REFERENCE_EDEFAULT
							.equals(vpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference);
		case Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case Ec2Package.CONFIGURE_NAT_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE:
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
		result.append(" (natSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList: ");
		result.append(natSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList);
		result.append(", privateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList: ");
		result.append(privateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList);
		result.append(", vpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference: ");
		result.append(vpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference);
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

} //ConfigureNatOptionsBuilder_ec2Impl
