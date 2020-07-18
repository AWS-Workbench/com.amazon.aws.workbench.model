/**
 */
package ec2.impl;

import ec2.Ec2Package;
import ec2.SubnetAttributesBuilder_ec2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subnet Attributes Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ec2.impl.SubnetAttributesBuilder_ec2Impl#getSubnetId_java_lang_String_ <em>Subnet Id java lang String </em>}</li>
 *   <li>{@link ec2.impl.SubnetAttributesBuilder_ec2Impl#getAvailabilityZone_java_lang_String_ <em>Availability Zone java lang String </em>}</li>
 *   <li>{@link ec2.impl.SubnetAttributesBuilder_ec2Impl#getRouteTableId_java_lang_String_ <em>Route Table Id java lang String </em>}</li>
 *   <li>{@link ec2.impl.SubnetAttributesBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.impl.SubnetAttributesBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.impl.SubnetAttributesBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.impl.SubnetAttributesBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubnetAttributesBuilder_ec2Impl extends MinimalEObjectImpl.Container
		implements SubnetAttributesBuilder_ec2 {
	/**
	 * The default value of the '{@link #getSubnetId_java_lang_String_() <em>Subnet Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNET_ID_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubnetId_java_lang_String_() <em>Subnet Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String subnetId_java_lang_String_ = SUBNET_ID_JAVA_LANG_STRING__EDEFAULT;

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
	 * The default value of the '{@link #getRouteTableId_java_lang_String_() <em>Route Table Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteTableId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUTE_TABLE_ID_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRouteTableId_java_lang_String_() <em>Route Table Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteTableId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String routeTableId_java_lang_String_ = ROUTE_TABLE_ID_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.SubnetAttributes";

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
	protected SubnetAttributesBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.Literals.SUBNET_ATTRIBUTES_BUILDER_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubnetId_java_lang_String_() {
		return subnetId_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubnetId_java_lang_String_(String newSubnetId_java_lang_String_) {
		String oldSubnetId_java_lang_String_ = subnetId_java_lang_String_;
		subnetId_java_lang_String_ = newSubnetId_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2__SUBNET_ID_JAVA_LANG_STRING_,
					oldSubnetId_java_lang_String_, subnetId_java_lang_String_));
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
					Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_,
					oldAvailabilityZone_java_lang_String_, availabilityZone_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRouteTableId_java_lang_String_() {
		return routeTableId_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouteTableId_java_lang_String_(String newRouteTableId_java_lang_String_) {
		String oldRouteTableId_java_lang_String_ = routeTableId_java_lang_String_;
		routeTableId_java_lang_String_ = newRouteTableId_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2__ROUTE_TABLE_ID_JAVA_LANG_STRING_,
					oldRouteTableId_java_lang_String_, routeTableId_java_lang_String_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2__VAR_NAME,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2__IDENTIFIER,
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
					Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2__SUBNET_ID_JAVA_LANG_STRING_:
			return getSubnetId_java_lang_String_();
		case Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_:
			return getAvailabilityZone_java_lang_String_();
		case Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2__ROUTE_TABLE_ID_JAVA_LANG_STRING_:
			return getRouteTableId_java_lang_String_();
		case Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2__SUBNET_ID_JAVA_LANG_STRING_:
			setSubnetId_java_lang_String_((String) newValue);
			return;
		case Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_:
			setAvailabilityZone_java_lang_String_((String) newValue);
			return;
		case Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2__ROUTE_TABLE_ID_JAVA_LANG_STRING_:
			setRouteTableId_java_lang_String_((String) newValue);
			return;
		case Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2__SUBNET_ID_JAVA_LANG_STRING_:
			setSubnetId_java_lang_String_(SUBNET_ID_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_:
			setAvailabilityZone_java_lang_String_(AVAILABILITY_ZONE_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2__ROUTE_TABLE_ID_JAVA_LANG_STRING_:
			setRouteTableId_java_lang_String_(ROUTE_TABLE_ID_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2__SUBNET_ID_JAVA_LANG_STRING_:
			return SUBNET_ID_JAVA_LANG_STRING__EDEFAULT == null ? subnetId_java_lang_String_ != null
					: !SUBNET_ID_JAVA_LANG_STRING__EDEFAULT.equals(subnetId_java_lang_String_);
		case Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_:
			return AVAILABILITY_ZONE_JAVA_LANG_STRING__EDEFAULT == null ? availabilityZone_java_lang_String_ != null
					: !AVAILABILITY_ZONE_JAVA_LANG_STRING__EDEFAULT.equals(availabilityZone_java_lang_String_);
		case Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2__ROUTE_TABLE_ID_JAVA_LANG_STRING_:
			return ROUTE_TABLE_ID_JAVA_LANG_STRING__EDEFAULT == null ? routeTableId_java_lang_String_ != null
					: !ROUTE_TABLE_ID_JAVA_LANG_STRING__EDEFAULT.equals(routeTableId_java_lang_String_);
		case Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case Ec2Package.SUBNET_ATTRIBUTES_BUILDER_EC2__ADDITIONAL_CODE:
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
		result.append(" (subnetId_java_lang_String_: ");
		result.append(subnetId_java_lang_String_);
		result.append(", availabilityZone_java_lang_String_: ");
		result.append(availabilityZone_java_lang_String_);
		result.append(", routeTableId_java_lang_String_: ");
		result.append(routeTableId_java_lang_String_);
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

} //SubnetAttributesBuilder_ec2Impl
