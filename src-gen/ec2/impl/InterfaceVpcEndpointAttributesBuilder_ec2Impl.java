/**
 */
package ec2.impl;

import ec2.Ec2Package;
import ec2.InterfaceVpcEndpointAttributesBuilder_ec2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Vpc Endpoint Attributes Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ec2.impl.InterfaceVpcEndpointAttributesBuilder_ec2Impl#getPort_java_lang_Number_ <em>Port java lang Number </em>}</li>
 *   <li>{@link ec2.impl.InterfaceVpcEndpointAttributesBuilder_ec2Impl#getVpcEndpointId_java_lang_String_ <em>Vpc Endpoint Id java lang String </em>}</li>
 *   <li>{@link ec2.impl.InterfaceVpcEndpointAttributesBuilder_ec2Impl#getSecurityGroupId_java_lang_String_ <em>Security Group Id java lang String </em>}</li>
 *   <li>{@link ec2.impl.InterfaceVpcEndpointAttributesBuilder_ec2Impl#getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList <em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>}</li>
 *   <li>{@link ec2.impl.InterfaceVpcEndpointAttributesBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.impl.InterfaceVpcEndpointAttributesBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.impl.InterfaceVpcEndpointAttributesBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.impl.InterfaceVpcEndpointAttributesBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceVpcEndpointAttributesBuilder_ec2Impl extends MinimalEObjectImpl.Container
		implements InterfaceVpcEndpointAttributesBuilder_ec2 {
	/**
	 * The default value of the '{@link #getPort_java_lang_Number_() <em>Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPort_java_lang_Number_() <em>Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int port_java_lang_Number_ = PORT_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getVpcEndpointId_java_lang_String_() <em>Vpc Endpoint Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcEndpointId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String VPC_ENDPOINT_ID_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpcEndpointId_java_lang_String_() <em>Vpc Endpoint Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcEndpointId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String vpcEndpointId_java_lang_String_ = VPC_ENDPOINT_ID_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurityGroupId_java_lang_String_() <em>Security Group Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroupId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_GROUP_ID_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityGroupId_java_lang_String_() <em>Security Group Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroupId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String securityGroupId_java_lang_String_ = SECURITY_GROUP_ID_JAVA_LANG_STRING__EDEFAULT;

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
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAttributes";

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
	protected InterfaceVpcEndpointAttributesBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.Literals.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPort_java_lang_Number_() {
		return port_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPort_java_lang_Number_(int newPort_java_lang_Number_) {
		int oldPort_java_lang_Number_ = port_java_lang_Number_;
		port_java_lang_Number_ = newPort_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__PORT_JAVA_LANG_NUMBER_,
					oldPort_java_lang_Number_, port_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVpcEndpointId_java_lang_String_() {
		return vpcEndpointId_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpcEndpointId_java_lang_String_(String newVpcEndpointId_java_lang_String_) {
		String oldVpcEndpointId_java_lang_String_ = vpcEndpointId_java_lang_String_;
		vpcEndpointId_java_lang_String_ = newVpcEndpointId_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__VPC_ENDPOINT_ID_JAVA_LANG_STRING_,
					oldVpcEndpointId_java_lang_String_, vpcEndpointId_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecurityGroupId_java_lang_String_() {
		return securityGroupId_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityGroupId_java_lang_String_(String newSecurityGroupId_java_lang_String_) {
		String oldSecurityGroupId_java_lang_String_ = securityGroupId_java_lang_String_;
		securityGroupId_java_lang_String_ = newSecurityGroupId_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__SECURITY_GROUP_ID_JAVA_LANG_STRING_,
					oldSecurityGroupId_java_lang_String_, securityGroupId_java_lang_String_));
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
					Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST,
					oldSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList,
					securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList));
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
					Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__VAR_NAME, oldVarName, varName));
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
					Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__IDENTIFIER, oldIdentifier, identifier));
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
					Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__ADDITIONAL_CODE, oldAdditionalCode,
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
		case Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__PORT_JAVA_LANG_NUMBER_:
			return getPort_java_lang_Number_();
		case Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__VPC_ENDPOINT_ID_JAVA_LANG_STRING_:
			return getVpcEndpointId_java_lang_String_();
		case Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__SECURITY_GROUP_ID_JAVA_LANG_STRING_:
			return getSecurityGroupId_java_lang_String_();
		case Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST:
			return getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList();
		case Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__PORT_JAVA_LANG_NUMBER_:
			setPort_java_lang_Number_((Integer) newValue);
			return;
		case Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__VPC_ENDPOINT_ID_JAVA_LANG_STRING_:
			setVpcEndpointId_java_lang_String_((String) newValue);
			return;
		case Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__SECURITY_GROUP_ID_JAVA_LANG_STRING_:
			setSecurityGroupId_java_lang_String_((String) newValue);
			return;
		case Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST:
			setSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList((String) newValue);
			return;
		case Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__PORT_JAVA_LANG_NUMBER_:
			setPort_java_lang_Number_(PORT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__VPC_ENDPOINT_ID_JAVA_LANG_STRING_:
			setVpcEndpointId_java_lang_String_(VPC_ENDPOINT_ID_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__SECURITY_GROUP_ID_JAVA_LANG_STRING_:
			setSecurityGroupId_java_lang_String_(SECURITY_GROUP_ID_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST:
			setSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList(
					SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST_EDEFAULT);
			return;
		case Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__PORT_JAVA_LANG_NUMBER_:
			return port_java_lang_Number_ != PORT_JAVA_LANG_NUMBER__EDEFAULT;
		case Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__VPC_ENDPOINT_ID_JAVA_LANG_STRING_:
			return VPC_ENDPOINT_ID_JAVA_LANG_STRING__EDEFAULT == null ? vpcEndpointId_java_lang_String_ != null
					: !VPC_ENDPOINT_ID_JAVA_LANG_STRING__EDEFAULT.equals(vpcEndpointId_java_lang_String_);
		case Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__SECURITY_GROUP_ID_JAVA_LANG_STRING_:
			return SECURITY_GROUP_ID_JAVA_LANG_STRING__EDEFAULT == null ? securityGroupId_java_lang_String_ != null
					: !SECURITY_GROUP_ID_JAVA_LANG_STRING__EDEFAULT.equals(securityGroupId_java_lang_String_);
		case Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST:
			return SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST_EDEFAULT == null
					? securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList != null
					: !SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST_EDEFAULT
							.equals(securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList);
		case Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case Ec2Package.INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__ADDITIONAL_CODE:
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
		result.append(" (port_java_lang_Number_: ");
		result.append(port_java_lang_Number_);
		result.append(", vpcEndpointId_java_lang_String_: ");
		result.append(vpcEndpointId_java_lang_String_);
		result.append(", securityGroupId_java_lang_String_: ");
		result.append(securityGroupId_java_lang_String_);
		result.append(", securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList: ");
		result.append(securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList);
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

} //InterfaceVpcEndpointAttributesBuilder_ec2Impl
