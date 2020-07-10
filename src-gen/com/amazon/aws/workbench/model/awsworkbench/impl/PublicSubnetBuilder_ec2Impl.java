/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2;
import com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Public Subnet Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.PublicSubnetBuilder_ec2Impl#getAvailabilityZone <em>Availability Zone</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.PublicSubnetBuilder_ec2Impl#getCidrBlock <em>Cidr Block</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.PublicSubnetBuilder_ec2Impl#getVpcId <em>Vpc Id</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.PublicSubnetBuilder_ec2Impl#getMapPublicIpOnLaunch <em>Map Public Ip On Launch</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.PublicSubnetBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.PublicSubnetBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.PublicSubnetBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.PublicSubnetBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.PublicSubnetBuilder_ec2Impl#getInstancebuilder_ec2 <em>Instancebuilder ec2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PublicSubnetBuilder_ec2Impl extends ServiceResourcesImpl implements PublicSubnetBuilder_ec2 {
	/**
	 * The default value of the '{@link #getAvailabilityZone() <em>Availability Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityZone()
	 * @generated
	 * @ordered
	 */
	protected static final String AVAILABILITY_ZONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailabilityZone() <em>Availability Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityZone()
	 * @generated
	 * @ordered
	 */
	protected String availabilityZone = AVAILABILITY_ZONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCidrBlock() <em>Cidr Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidrBlock()
	 * @generated
	 * @ordered
	 */
	protected static final String CIDR_BLOCK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCidrBlock() <em>Cidr Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidrBlock()
	 * @generated
	 * @ordered
	 */
	protected String cidrBlock = CIDR_BLOCK_EDEFAULT;

	/**
	 * The default value of the '{@link #getVpcId() <em>Vpc Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcId()
	 * @generated
	 * @ordered
	 */
	protected static final String VPC_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpcId() <em>Vpc Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcId()
	 * @generated
	 * @ordered
	 */
	protected String vpcId = VPC_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMapPublicIpOnLaunch() <em>Map Public Ip On Launch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapPublicIpOnLaunch()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MAP_PUBLIC_IP_ON_LAUNCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMapPublicIpOnLaunch() <em>Map Public Ip On Launch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapPublicIpOnLaunch()
	 * @generated
	 * @ordered
	 */
	protected Boolean mapPublicIpOnLaunch = MAP_PUBLIC_IP_ON_LAUNCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.PublicSubnet";

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
	 * The cached value of the '{@link #getInstancebuilder_ec2() <em>Instancebuilder ec2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstancebuilder_ec2()
	 * @generated
	 * @ordered
	 */
	protected EList<InstanceBuilder_ec2> instancebuilder_ec2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicSubnetBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.PUBLIC_SUBNET_BUILDER_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAvailabilityZone() {
		return availabilityZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailabilityZone(String newAvailabilityZone) {
		String oldAvailabilityZone = availabilityZone;
		availabilityZone = newAvailabilityZone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__AVAILABILITY_ZONE, oldAvailabilityZone,
					availabilityZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCidrBlock() {
		return cidrBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCidrBlock(String newCidrBlock) {
		String oldCidrBlock = cidrBlock;
		cidrBlock = newCidrBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__CIDR_BLOCK, oldCidrBlock, cidrBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVpcId() {
		return vpcId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpcId(String newVpcId) {
		String oldVpcId = vpcId;
		vpcId = newVpcId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__VPC_ID,
					oldVpcId, vpcId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getMapPublicIpOnLaunch() {
		return mapPublicIpOnLaunch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMapPublicIpOnLaunch(Boolean newMapPublicIpOnLaunch) {
		Boolean oldMapPublicIpOnLaunch = mapPublicIpOnLaunch;
		mapPublicIpOnLaunch = newMapPublicIpOnLaunch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH, oldMapPublicIpOnLaunch,
					mapPublicIpOnLaunch));
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
					AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InstanceBuilder_ec2> getInstancebuilder_ec2() {
		if (instancebuilder_ec2 == null) {
			instancebuilder_ec2 = new EObjectContainmentEList<InstanceBuilder_ec2>(InstanceBuilder_ec2.class, this,
					AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__INSTANCEBUILDER_EC2);
		}
		return instancebuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__INSTANCEBUILDER_EC2:
			return ((InternalEList<?>) getInstancebuilder_ec2()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__AVAILABILITY_ZONE:
			return getAvailabilityZone();
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__CIDR_BLOCK:
			return getCidrBlock();
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__VPC_ID:
			return getVpcId();
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH:
			return getMapPublicIpOnLaunch();
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__ADDITIONAL_CODE:
			return getAdditionalCode();
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__INSTANCEBUILDER_EC2:
			return getInstancebuilder_ec2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__AVAILABILITY_ZONE:
			setAvailabilityZone((String) newValue);
			return;
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__CIDR_BLOCK:
			setCidrBlock((String) newValue);
			return;
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__VPC_ID:
			setVpcId((String) newValue);
			return;
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH:
			setMapPublicIpOnLaunch((Boolean) newValue);
			return;
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__ADDITIONAL_CODE:
			setAdditionalCode((String) newValue);
			return;
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__INSTANCEBUILDER_EC2:
			getInstancebuilder_ec2().clear();
			getInstancebuilder_ec2().addAll((Collection<? extends InstanceBuilder_ec2>) newValue);
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
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__AVAILABILITY_ZONE:
			setAvailabilityZone(AVAILABILITY_ZONE_EDEFAULT);
			return;
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__CIDR_BLOCK:
			setCidrBlock(CIDR_BLOCK_EDEFAULT);
			return;
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__VPC_ID:
			setVpcId(VPC_ID_EDEFAULT);
			return;
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH:
			setMapPublicIpOnLaunch(MAP_PUBLIC_IP_ON_LAUNCH_EDEFAULT);
			return;
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__ADDITIONAL_CODE:
			setAdditionalCode(ADDITIONAL_CODE_EDEFAULT);
			return;
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__INSTANCEBUILDER_EC2:
			getInstancebuilder_ec2().clear();
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
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__AVAILABILITY_ZONE:
			return AVAILABILITY_ZONE_EDEFAULT == null ? availabilityZone != null
					: !AVAILABILITY_ZONE_EDEFAULT.equals(availabilityZone);
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__CIDR_BLOCK:
			return CIDR_BLOCK_EDEFAULT == null ? cidrBlock != null : !CIDR_BLOCK_EDEFAULT.equals(cidrBlock);
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__VPC_ID:
			return VPC_ID_EDEFAULT == null ? vpcId != null : !VPC_ID_EDEFAULT.equals(vpcId);
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH:
			return MAP_PUBLIC_IP_ON_LAUNCH_EDEFAULT == null ? mapPublicIpOnLaunch != null
					: !MAP_PUBLIC_IP_ON_LAUNCH_EDEFAULT.equals(mapPublicIpOnLaunch);
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__ADDITIONAL_CODE:
			return ADDITIONAL_CODE_EDEFAULT == null ? additionalCode != null
					: !ADDITIONAL_CODE_EDEFAULT.equals(additionalCode);
		case AwsworkbenchPackage.PUBLIC_SUBNET_BUILDER_EC2__INSTANCEBUILDER_EC2:
			return instancebuilder_ec2 != null && !instancebuilder_ec2.isEmpty();
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
		result.append(" (availabilityZone: ");
		result.append(availabilityZone);
		result.append(", cidrBlock: ");
		result.append(cidrBlock);
		result.append(", vpcId: ");
		result.append(vpcId);
		result.append(", mapPublicIpOnLaunch: ");
		result.append(mapPublicIpOnLaunch);
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

} //PublicSubnetBuilder_ec2Impl
