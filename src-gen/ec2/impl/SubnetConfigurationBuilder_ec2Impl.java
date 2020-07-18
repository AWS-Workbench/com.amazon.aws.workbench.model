/**
 */
package ec2.impl;

import ec2.Ec2Package;
import ec2.SubnetConfigurationBuilder_ec2;
import ec2.SubnetType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subnet Configuration Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ec2.impl.SubnetConfigurationBuilder_ec2Impl#getName_java_lang_String_ <em>Name java lang String </em>}</li>
 *   <li>{@link ec2.impl.SubnetConfigurationBuilder_ec2Impl#getSubnetType_software_amazon_awscdk_services_ec2_SubnetType_ <em>Subnet Type software amazon awscdk services ec2 Subnet Type </em>}</li>
 *   <li>{@link ec2.impl.SubnetConfigurationBuilder_ec2Impl#getCidrMask_java_lang_Number_ <em>Cidr Mask java lang Number </em>}</li>
 *   <li>{@link ec2.impl.SubnetConfigurationBuilder_ec2Impl#getReserved_java_lang_Boolean_ <em>Reserved java lang Boolean </em>}</li>
 *   <li>{@link ec2.impl.SubnetConfigurationBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.impl.SubnetConfigurationBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.impl.SubnetConfigurationBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.impl.SubnetConfigurationBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubnetConfigurationBuilder_ec2Impl extends MinimalEObjectImpl.Container
		implements SubnetConfigurationBuilder_ec2 {
	/**
	 * The default value of the '{@link #getName_java_lang_String_() <em>Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName_java_lang_String_() <em>Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String name_java_lang_String_ = NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getSubnetType_software_amazon_awscdk_services_ec2_SubnetType_() <em>Subnet Type software amazon awscdk services ec2 Subnet Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetType_software_amazon_awscdk_services_ec2_SubnetType_()
	 * @generated
	 * @ordered
	 */
	protected static final SubnetType SUBNET_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_TYPE__EDEFAULT = SubnetType.ISOLATED;

	/**
	 * The cached value of the '{@link #getSubnetType_software_amazon_awscdk_services_ec2_SubnetType_() <em>Subnet Type software amazon awscdk services ec2 Subnet Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetType_software_amazon_awscdk_services_ec2_SubnetType_()
	 * @generated
	 * @ordered
	 */
	protected SubnetType subnetType_software_amazon_awscdk_services_ec2_SubnetType_ = SUBNET_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_TYPE__EDEFAULT;

	/**
	 * The default value of the '{@link #getCidrMask_java_lang_Number_() <em>Cidr Mask java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidrMask_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int CIDR_MASK_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCidrMask_java_lang_Number_() <em>Cidr Mask java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidrMask_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int cidrMask_java_lang_Number_ = CIDR_MASK_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getReserved_java_lang_Boolean_() <em>Reserved java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RESERVED_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserved_java_lang_Boolean_() <em>Reserved java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean reserved_java_lang_Boolean_ = RESERVED_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.SubnetConfiguration";

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
	protected SubnetConfigurationBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.Literals.SUBNET_CONFIGURATION_BUILDER_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName_java_lang_String_() {
		return name_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName_java_lang_String_(String newName_java_lang_String_) {
		String oldName_java_lang_String_ = name_java_lang_String_;
		name_java_lang_String_ = newName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__NAME_JAVA_LANG_STRING_, oldName_java_lang_String_,
					name_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubnetType getSubnetType_software_amazon_awscdk_services_ec2_SubnetType_() {
		return subnetType_software_amazon_awscdk_services_ec2_SubnetType_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubnetType_software_amazon_awscdk_services_ec2_SubnetType_(
			SubnetType newSubnetType_software_amazon_awscdk_services_ec2_SubnetType_) {
		SubnetType oldSubnetType_software_amazon_awscdk_services_ec2_SubnetType_ = subnetType_software_amazon_awscdk_services_ec2_SubnetType_;
		subnetType_software_amazon_awscdk_services_ec2_SubnetType_ = newSubnetType_software_amazon_awscdk_services_ec2_SubnetType_ == null
				? SUBNET_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_TYPE__EDEFAULT
				: newSubnetType_software_amazon_awscdk_services_ec2_SubnetType_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__SUBNET_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_TYPE_,
					oldSubnetType_software_amazon_awscdk_services_ec2_SubnetType_,
					subnetType_software_amazon_awscdk_services_ec2_SubnetType_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCidrMask_java_lang_Number_() {
		return cidrMask_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCidrMask_java_lang_Number_(int newCidrMask_java_lang_Number_) {
		int oldCidrMask_java_lang_Number_ = cidrMask_java_lang_Number_;
		cidrMask_java_lang_Number_ = newCidrMask_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__CIDR_MASK_JAVA_LANG_NUMBER_,
					oldCidrMask_java_lang_Number_, cidrMask_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getReserved_java_lang_Boolean_() {
		return reserved_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReserved_java_lang_Boolean_(Boolean newReserved_java_lang_Boolean_) {
		Boolean oldReserved_java_lang_Boolean_ = reserved_java_lang_Boolean_;
		reserved_java_lang_Boolean_ = newReserved_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__RESERVED_JAVA_LANG_BOOLEAN_,
					oldReserved_java_lang_Boolean_, reserved_java_lang_Boolean_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__VAR_NAME,
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__IDENTIFIER, oldIdentifier, identifier));
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
					Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__NAME_JAVA_LANG_STRING_:
			return getName_java_lang_String_();
		case Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__SUBNET_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_TYPE_:
			return getSubnetType_software_amazon_awscdk_services_ec2_SubnetType_();
		case Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__CIDR_MASK_JAVA_LANG_NUMBER_:
			return getCidrMask_java_lang_Number_();
		case Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__RESERVED_JAVA_LANG_BOOLEAN_:
			return getReserved_java_lang_Boolean_();
		case Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__NAME_JAVA_LANG_STRING_:
			setName_java_lang_String_((String) newValue);
			return;
		case Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__SUBNET_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_TYPE_:
			setSubnetType_software_amazon_awscdk_services_ec2_SubnetType_((SubnetType) newValue);
			return;
		case Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__CIDR_MASK_JAVA_LANG_NUMBER_:
			setCidrMask_java_lang_Number_((Integer) newValue);
			return;
		case Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__RESERVED_JAVA_LANG_BOOLEAN_:
			setReserved_java_lang_Boolean_((Boolean) newValue);
			return;
		case Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__NAME_JAVA_LANG_STRING_:
			setName_java_lang_String_(NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__SUBNET_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_TYPE_:
			setSubnetType_software_amazon_awscdk_services_ec2_SubnetType_(
					SUBNET_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_TYPE__EDEFAULT);
			return;
		case Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__CIDR_MASK_JAVA_LANG_NUMBER_:
			setCidrMask_java_lang_Number_(CIDR_MASK_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__RESERVED_JAVA_LANG_BOOLEAN_:
			setReserved_java_lang_Boolean_(RESERVED_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__NAME_JAVA_LANG_STRING_:
			return NAME_JAVA_LANG_STRING__EDEFAULT == null ? name_java_lang_String_ != null
					: !NAME_JAVA_LANG_STRING__EDEFAULT.equals(name_java_lang_String_);
		case Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__SUBNET_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_TYPE_:
			return subnetType_software_amazon_awscdk_services_ec2_SubnetType_ != SUBNET_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_TYPE__EDEFAULT;
		case Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__CIDR_MASK_JAVA_LANG_NUMBER_:
			return cidrMask_java_lang_Number_ != CIDR_MASK_JAVA_LANG_NUMBER__EDEFAULT;
		case Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__RESERVED_JAVA_LANG_BOOLEAN_:
			return RESERVED_JAVA_LANG_BOOLEAN__EDEFAULT == null ? reserved_java_lang_Boolean_ != null
					: !RESERVED_JAVA_LANG_BOOLEAN__EDEFAULT.equals(reserved_java_lang_Boolean_);
		case Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case Ec2Package.SUBNET_CONFIGURATION_BUILDER_EC2__ADDITIONAL_CODE:
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
		result.append(" (name_java_lang_String_: ");
		result.append(name_java_lang_String_);
		result.append(", subnetType_software_amazon_awscdk_services_ec2_SubnetType_: ");
		result.append(subnetType_software_amazon_awscdk_services_ec2_SubnetType_);
		result.append(", cidrMask_java_lang_Number_: ");
		result.append(cidrMask_java_lang_Number_);
		result.append(", reserved_java_lang_Boolean_: ");
		result.append(reserved_java_lang_Boolean_);
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

} //SubnetConfigurationBuilder_ec2Impl
