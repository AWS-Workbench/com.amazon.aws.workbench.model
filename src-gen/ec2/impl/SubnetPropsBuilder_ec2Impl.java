/**
 */
package ec2.impl;

import ec2.Ec2Package;
import ec2.SubnetPropsBuilder_ec2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subnet Props Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ec2.impl.SubnetPropsBuilder_ec2Impl#getAvailabilityZone_java_lang_String_ <em>Availability Zone java lang String </em>}</li>
 *   <li>{@link ec2.impl.SubnetPropsBuilder_ec2Impl#getCidrBlock_java_lang_String_ <em>Cidr Block java lang String </em>}</li>
 *   <li>{@link ec2.impl.SubnetPropsBuilder_ec2Impl#getVpcId_java_lang_String_ <em>Vpc Id java lang String </em>}</li>
 *   <li>{@link ec2.impl.SubnetPropsBuilder_ec2Impl#getMapPublicIpOnLaunch_java_lang_Boolean_ <em>Map Public Ip On Launch java lang Boolean </em>}</li>
 *   <li>{@link ec2.impl.SubnetPropsBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.impl.SubnetPropsBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.impl.SubnetPropsBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.impl.SubnetPropsBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubnetPropsBuilder_ec2Impl extends MinimalEObjectImpl.Container implements SubnetPropsBuilder_ec2 {
	/**
	 * The default value of the '{@link #getAvailabilityZone_java_lang_String_() <em>Availability Zone java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityZone_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String AVAILABILITY_ZONE_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailabilityZone_java_lang_String_() <em>Availability Zone java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityZone_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String availabilityZone_java_lang_String_ = AVAILABILITY_ZONE_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getCidrBlock_java_lang_String_() <em>Cidr Block java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidrBlock_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String CIDR_BLOCK_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCidrBlock_java_lang_String_() <em>Cidr Block java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidrBlock_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String cidrBlock_java_lang_String_ = CIDR_BLOCK_JAVA_LANG_STRING__EDEFAULT;

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
	 * The default value of the '{@link #getMapPublicIpOnLaunch_java_lang_Boolean_() <em>Map Public Ip On Launch java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapPublicIpOnLaunch_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MAP_PUBLIC_IP_ON_LAUNCH_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMapPublicIpOnLaunch_java_lang_Boolean_() <em>Map Public Ip On Launch java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapPublicIpOnLaunch_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean mapPublicIpOnLaunch_java_lang_Boolean_ = MAP_PUBLIC_IP_ON_LAUNCH_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.SubnetProps";

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
	protected SubnetPropsBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.Literals.SUBNET_PROPS_BUILDER_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAvailabilityZone_java_lang_String_() {
		return availabilityZone_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailabilityZone_java_lang_String_(String newAvailabilityZone_java_lang_String_) {
		String oldAvailabilityZone_java_lang_String_ = availabilityZone_java_lang_String_;
		availabilityZone_java_lang_String_ = newAvailabilityZone_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.SUBNET_PROPS_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_,
					oldAvailabilityZone_java_lang_String_, availabilityZone_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCidrBlock_java_lang_String_() {
		return cidrBlock_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCidrBlock_java_lang_String_(String newCidrBlock_java_lang_String_) {
		String oldCidrBlock_java_lang_String_ = cidrBlock_java_lang_String_;
		cidrBlock_java_lang_String_ = newCidrBlock_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.SUBNET_PROPS_BUILDER_EC2__CIDR_BLOCK_JAVA_LANG_STRING_, oldCidrBlock_java_lang_String_,
					cidrBlock_java_lang_String_));
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
					Ec2Package.SUBNET_PROPS_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_, oldVpcId_java_lang_String_,
					vpcId_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getMapPublicIpOnLaunch_java_lang_Boolean_() {
		return mapPublicIpOnLaunch_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMapPublicIpOnLaunch_java_lang_Boolean_(Boolean newMapPublicIpOnLaunch_java_lang_Boolean_) {
		Boolean oldMapPublicIpOnLaunch_java_lang_Boolean_ = mapPublicIpOnLaunch_java_lang_Boolean_;
		mapPublicIpOnLaunch_java_lang_Boolean_ = newMapPublicIpOnLaunch_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.SUBNET_PROPS_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH_JAVA_LANG_BOOLEAN_,
					oldMapPublicIpOnLaunch_java_lang_Boolean_, mapPublicIpOnLaunch_java_lang_Boolean_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.SUBNET_PROPS_BUILDER_EC2__VAR_NAME,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.SUBNET_PROPS_BUILDER_EC2__IDENTIFIER,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.SUBNET_PROPS_BUILDER_EC2__ADDITIONAL_CODE,
					oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ec2Package.SUBNET_PROPS_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_:
			return getAvailabilityZone_java_lang_String_();
		case Ec2Package.SUBNET_PROPS_BUILDER_EC2__CIDR_BLOCK_JAVA_LANG_STRING_:
			return getCidrBlock_java_lang_String_();
		case Ec2Package.SUBNET_PROPS_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_:
			return getVpcId_java_lang_String_();
		case Ec2Package.SUBNET_PROPS_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH_JAVA_LANG_BOOLEAN_:
			return getMapPublicIpOnLaunch_java_lang_Boolean_();
		case Ec2Package.SUBNET_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case Ec2Package.SUBNET_PROPS_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case Ec2Package.SUBNET_PROPS_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case Ec2Package.SUBNET_PROPS_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.SUBNET_PROPS_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_:
			setAvailabilityZone_java_lang_String_((String) newValue);
			return;
		case Ec2Package.SUBNET_PROPS_BUILDER_EC2__CIDR_BLOCK_JAVA_LANG_STRING_:
			setCidrBlock_java_lang_String_((String) newValue);
			return;
		case Ec2Package.SUBNET_PROPS_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_:
			setVpcId_java_lang_String_((String) newValue);
			return;
		case Ec2Package.SUBNET_PROPS_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH_JAVA_LANG_BOOLEAN_:
			setMapPublicIpOnLaunch_java_lang_Boolean_((Boolean) newValue);
			return;
		case Ec2Package.SUBNET_PROPS_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case Ec2Package.SUBNET_PROPS_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case Ec2Package.SUBNET_PROPS_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.SUBNET_PROPS_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_:
			setAvailabilityZone_java_lang_String_(AVAILABILITY_ZONE_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.SUBNET_PROPS_BUILDER_EC2__CIDR_BLOCK_JAVA_LANG_STRING_:
			setCidrBlock_java_lang_String_(CIDR_BLOCK_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.SUBNET_PROPS_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_:
			setVpcId_java_lang_String_(VPC_ID_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.SUBNET_PROPS_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH_JAVA_LANG_BOOLEAN_:
			setMapPublicIpOnLaunch_java_lang_Boolean_(MAP_PUBLIC_IP_ON_LAUNCH_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case Ec2Package.SUBNET_PROPS_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case Ec2Package.SUBNET_PROPS_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case Ec2Package.SUBNET_PROPS_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.SUBNET_PROPS_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_:
			return AVAILABILITY_ZONE_JAVA_LANG_STRING__EDEFAULT == null ? availabilityZone_java_lang_String_ != null
					: !AVAILABILITY_ZONE_JAVA_LANG_STRING__EDEFAULT.equals(availabilityZone_java_lang_String_);
		case Ec2Package.SUBNET_PROPS_BUILDER_EC2__CIDR_BLOCK_JAVA_LANG_STRING_:
			return CIDR_BLOCK_JAVA_LANG_STRING__EDEFAULT == null ? cidrBlock_java_lang_String_ != null
					: !CIDR_BLOCK_JAVA_LANG_STRING__EDEFAULT.equals(cidrBlock_java_lang_String_);
		case Ec2Package.SUBNET_PROPS_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_:
			return VPC_ID_JAVA_LANG_STRING__EDEFAULT == null ? vpcId_java_lang_String_ != null
					: !VPC_ID_JAVA_LANG_STRING__EDEFAULT.equals(vpcId_java_lang_String_);
		case Ec2Package.SUBNET_PROPS_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH_JAVA_LANG_BOOLEAN_:
			return MAP_PUBLIC_IP_ON_LAUNCH_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? mapPublicIpOnLaunch_java_lang_Boolean_ != null
					: !MAP_PUBLIC_IP_ON_LAUNCH_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(mapPublicIpOnLaunch_java_lang_Boolean_);
		case Ec2Package.SUBNET_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case Ec2Package.SUBNET_PROPS_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case Ec2Package.SUBNET_PROPS_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case Ec2Package.SUBNET_PROPS_BUILDER_EC2__ADDITIONAL_CODE:
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
		result.append(" (availabilityZone_java_lang_String_: ");
		result.append(availabilityZone_java_lang_String_);
		result.append(", cidrBlock_java_lang_String_: ");
		result.append(cidrBlock_java_lang_String_);
		result.append(", vpcId_java_lang_String_: ");
		result.append(vpcId_java_lang_String_);
		result.append(", mapPublicIpOnLaunch_java_lang_Boolean_: ");
		result.append(mapPublicIpOnLaunch_java_lang_Boolean_);
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

} //SubnetPropsBuilder_ec2Impl
