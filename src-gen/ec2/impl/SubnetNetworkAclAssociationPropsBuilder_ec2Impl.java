/**
 */
package ec2.impl;

import ec2.Ec2Package;
import ec2.SubnetNetworkAclAssociationPropsBuilder_ec2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subnet Network Acl Association Props Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ec2.impl.SubnetNetworkAclAssociationPropsBuilder_ec2Impl#getNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference <em>Network Acl With INetwork Acl software amazon awscdk services ec2 INetwork Acl As Reference</em>}</li>
 *   <li>{@link ec2.impl.SubnetNetworkAclAssociationPropsBuilder_ec2Impl#getSubnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference <em>Subnet With ISubnet software amazon awscdk services ec2 ISubnet As Reference</em>}</li>
 *   <li>{@link ec2.impl.SubnetNetworkAclAssociationPropsBuilder_ec2Impl#getSubnetNetworkAclAssociationName_java_lang_String_ <em>Subnet Network Acl Association Name java lang String </em>}</li>
 *   <li>{@link ec2.impl.SubnetNetworkAclAssociationPropsBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.impl.SubnetNetworkAclAssociationPropsBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.impl.SubnetNetworkAclAssociationPropsBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.impl.SubnetNetworkAclAssociationPropsBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubnetNetworkAclAssociationPropsBuilder_ec2Impl extends MinimalEObjectImpl.Container
		implements SubnetNetworkAclAssociationPropsBuilder_ec2 {
	/**
	 * The default value of the '{@link #getNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference() <em>Network Acl With INetwork Acl software amazon awscdk services ec2 INetwork Acl As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_ACL_WITH_INETWORK_ACL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INETWORK_ACL_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference() <em>Network Acl With INetwork Acl software amazon awscdk services ec2 INetwork Acl As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String networkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference = NETWORK_ACL_WITH_INETWORK_ACL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INETWORK_ACL_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference() <em>Subnet With ISubnet software amazon awscdk services ec2 ISubnet As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNET_WITH_ISUBNET_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference() <em>Subnet With ISubnet software amazon awscdk services ec2 ISubnet As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String subnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference = SUBNET_WITH_ISUBNET_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubnetNetworkAclAssociationName_java_lang_String_() <em>Subnet Network Acl Association Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetNetworkAclAssociationName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNET_NETWORK_ACL_ASSOCIATION_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubnetNetworkAclAssociationName_java_lang_String_() <em>Subnet Network Acl Association Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetNetworkAclAssociationName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String subnetNetworkAclAssociationName_java_lang_String_ = SUBNET_NETWORK_ACL_ASSOCIATION_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociationProps";

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
	protected SubnetNetworkAclAssociationPropsBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.Literals.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference() {
		return networkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference(
			String newNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference) {
		String oldNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference = networkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference;
		networkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference = newNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__NETWORK_ACL_WITH_INETWORK_ACL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INETWORK_ACL_AS_REFERENCE,
					oldNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference,
					networkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference() {
		return subnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference(
			String newSubnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference) {
		String oldSubnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference = subnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference;
		subnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference = newSubnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__SUBNET_WITH_ISUBNET_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_REFERENCE,
					oldSubnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference,
					subnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubnetNetworkAclAssociationName_java_lang_String_() {
		return subnetNetworkAclAssociationName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubnetNetworkAclAssociationName_java_lang_String_(
			String newSubnetNetworkAclAssociationName_java_lang_String_) {
		String oldSubnetNetworkAclAssociationName_java_lang_String_ = subnetNetworkAclAssociationName_java_lang_String_;
		subnetNetworkAclAssociationName_java_lang_String_ = newSubnetNetworkAclAssociationName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__SUBNET_NETWORK_ACL_ASSOCIATION_NAME_JAVA_LANG_STRING_,
					oldSubnetNetworkAclAssociationName_java_lang_String_,
					subnetNetworkAclAssociationName_java_lang_String_));
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
					Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__VAR_NAME, oldVarName, varName));
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
					Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__IDENTIFIER, oldIdentifier,
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__ADDITIONAL_CODE, oldAdditionalCode,
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
		case Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__NETWORK_ACL_WITH_INETWORK_ACL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INETWORK_ACL_AS_REFERENCE:
			return getNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference();
		case Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__SUBNET_WITH_ISUBNET_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_REFERENCE:
			return getSubnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference();
		case Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__SUBNET_NETWORK_ACL_ASSOCIATION_NAME_JAVA_LANG_STRING_:
			return getSubnetNetworkAclAssociationName_java_lang_String_();
		case Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__NETWORK_ACL_WITH_INETWORK_ACL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INETWORK_ACL_AS_REFERENCE:
			setNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference((String) newValue);
			return;
		case Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__SUBNET_WITH_ISUBNET_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_REFERENCE:
			setSubnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference((String) newValue);
			return;
		case Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__SUBNET_NETWORK_ACL_ASSOCIATION_NAME_JAVA_LANG_STRING_:
			setSubnetNetworkAclAssociationName_java_lang_String_((String) newValue);
			return;
		case Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__NETWORK_ACL_WITH_INETWORK_ACL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INETWORK_ACL_AS_REFERENCE:
			setNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference(
					NETWORK_ACL_WITH_INETWORK_ACL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INETWORK_ACL_AS_REFERENCE_EDEFAULT);
			return;
		case Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__SUBNET_WITH_ISUBNET_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_REFERENCE:
			setSubnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference(
					SUBNET_WITH_ISUBNET_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_REFERENCE_EDEFAULT);
			return;
		case Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__SUBNET_NETWORK_ACL_ASSOCIATION_NAME_JAVA_LANG_STRING_:
			setSubnetNetworkAclAssociationName_java_lang_String_(
					SUBNET_NETWORK_ACL_ASSOCIATION_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__NETWORK_ACL_WITH_INETWORK_ACL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INETWORK_ACL_AS_REFERENCE:
			return NETWORK_ACL_WITH_INETWORK_ACL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INETWORK_ACL_AS_REFERENCE_EDEFAULT == null
					? networkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference != null
					: !NETWORK_ACL_WITH_INETWORK_ACL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INETWORK_ACL_AS_REFERENCE_EDEFAULT
							.equals(networkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference);
		case Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__SUBNET_WITH_ISUBNET_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_REFERENCE:
			return SUBNET_WITH_ISUBNET_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_REFERENCE_EDEFAULT == null
					? subnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference != null
					: !SUBNET_WITH_ISUBNET_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_REFERENCE_EDEFAULT
							.equals(subnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference);
		case Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__SUBNET_NETWORK_ACL_ASSOCIATION_NAME_JAVA_LANG_STRING_:
			return SUBNET_NETWORK_ACL_ASSOCIATION_NAME_JAVA_LANG_STRING__EDEFAULT == null
					? subnetNetworkAclAssociationName_java_lang_String_ != null
					: !SUBNET_NETWORK_ACL_ASSOCIATION_NAME_JAVA_LANG_STRING__EDEFAULT
							.equals(subnetNetworkAclAssociationName_java_lang_String_);
		case Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case Ec2Package.SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__ADDITIONAL_CODE:
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
		result.append(" (networkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference: ");
		result.append(networkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference);
		result.append(", subnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference: ");
		result.append(subnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference);
		result.append(", subnetNetworkAclAssociationName_java_lang_String_: ");
		result.append(subnetNetworkAclAssociationName_java_lang_String_);
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

} //SubnetNetworkAclAssociationPropsBuilder_ec2Impl
