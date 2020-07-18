/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2;

import ec2.SubnetType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subnet Selection Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SubnetSelectionBuilder_ec2Impl#getAvailabilityZones_java_lang_String_AsList <em>Availability Zones java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SubnetSelectionBuilder_ec2Impl#getOnePerAz_java_lang_Boolean_ <em>One Per Az java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SubnetSelectionBuilder_ec2Impl#getSubnetGroupName_java_lang_String_ <em>Subnet Group Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SubnetSelectionBuilder_ec2Impl#getSubnetName_java_lang_String_ <em>Subnet Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SubnetSelectionBuilder_ec2Impl#getSubnets_software_amazon_awscdk_services_ec2_ISubnet_AsList <em>Subnets software amazon awscdk services ec2 ISubnet As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SubnetSelectionBuilder_ec2Impl#getSubnetType_software_amazon_awscdk_services_ec2_SubnetType_ <em>Subnet Type software amazon awscdk services ec2 Subnet Type </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SubnetSelectionBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SubnetSelectionBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SubnetSelectionBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SubnetSelectionBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubnetSelectionBuilder_ec2Impl extends ServiceResourcesImpl implements SubnetSelectionBuilder_ec2 {
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
	 * The default value of the '{@link #getOnePerAz_java_lang_Boolean_() <em>One Per Az java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnePerAz_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ONE_PER_AZ_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnePerAz_java_lang_Boolean_() <em>One Per Az java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnePerAz_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean onePerAz_java_lang_Boolean_ = ONE_PER_AZ_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getSubnetGroupName_java_lang_String_() <em>Subnet Group Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetGroupName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNET_GROUP_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubnetGroupName_java_lang_String_() <em>Subnet Group Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetGroupName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String subnetGroupName_java_lang_String_ = SUBNET_GROUP_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getSubnetName_java_lang_String_() <em>Subnet Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNET_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubnetName_java_lang_String_() <em>Subnet Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String subnetName_java_lang_String_ = SUBNET_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getSubnets_software_amazon_awscdk_services_ec2_ISubnet_AsList() <em>Subnets software amazon awscdk services ec2 ISubnet As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnets_software_amazon_awscdk_services_ec2_ISubnet_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubnets_software_amazon_awscdk_services_ec2_ISubnet_AsList() <em>Subnets software amazon awscdk services ec2 ISubnet As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnets_software_amazon_awscdk_services_ec2_ISubnet_AsList()
	 * @generated
	 * @ordered
	 */
	protected String subnets_software_amazon_awscdk_services_ec2_ISubnet_AsList = SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_LIST_EDEFAULT;

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
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.SubnetSelection";

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
	protected SubnetSelectionBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.SUBNET_SELECTION_BUILDER_EC2;
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
					AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST,
					oldAvailabilityZones_java_lang_String_AsList, availabilityZones_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getOnePerAz_java_lang_Boolean_() {
		return onePerAz_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnePerAz_java_lang_Boolean_(Boolean newOnePerAz_java_lang_Boolean_) {
		Boolean oldOnePerAz_java_lang_Boolean_ = onePerAz_java_lang_Boolean_;
		onePerAz_java_lang_Boolean_ = newOnePerAz_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__ONE_PER_AZ_JAVA_LANG_BOOLEAN_,
					oldOnePerAz_java_lang_Boolean_, onePerAz_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubnetGroupName_java_lang_String_() {
		return subnetGroupName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubnetGroupName_java_lang_String_(String newSubnetGroupName_java_lang_String_) {
		String oldSubnetGroupName_java_lang_String_ = subnetGroupName_java_lang_String_;
		subnetGroupName_java_lang_String_ = newSubnetGroupName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__SUBNET_GROUP_NAME_JAVA_LANG_STRING_,
					oldSubnetGroupName_java_lang_String_, subnetGroupName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubnetName_java_lang_String_() {
		return subnetName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubnetName_java_lang_String_(String newSubnetName_java_lang_String_) {
		String oldSubnetName_java_lang_String_ = subnetName_java_lang_String_;
		subnetName_java_lang_String_ = newSubnetName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__SUBNET_NAME_JAVA_LANG_STRING_,
					oldSubnetName_java_lang_String_, subnetName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubnets_software_amazon_awscdk_services_ec2_ISubnet_AsList() {
		return subnets_software_amazon_awscdk_services_ec2_ISubnet_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubnets_software_amazon_awscdk_services_ec2_ISubnet_AsList(
			String newSubnets_software_amazon_awscdk_services_ec2_ISubnet_AsList) {
		String oldSubnets_software_amazon_awscdk_services_ec2_ISubnet_AsList = subnets_software_amazon_awscdk_services_ec2_ISubnet_AsList;
		subnets_software_amazon_awscdk_services_ec2_ISubnet_AsList = newSubnets_software_amazon_awscdk_services_ec2_ISubnet_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_LIST,
					oldSubnets_software_amazon_awscdk_services_ec2_ISubnet_AsList,
					subnets_software_amazon_awscdk_services_ec2_ISubnet_AsList));
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
					AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__SUBNET_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_TYPE_,
					oldSubnetType_software_amazon_awscdk_services_ec2_SubnetType_,
					subnetType_software_amazon_awscdk_services_ec2_SubnetType_));
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
					AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST:
			return getAvailabilityZones_java_lang_String_AsList();
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__ONE_PER_AZ_JAVA_LANG_BOOLEAN_:
			return getOnePerAz_java_lang_Boolean_();
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__SUBNET_GROUP_NAME_JAVA_LANG_STRING_:
			return getSubnetGroupName_java_lang_String_();
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__SUBNET_NAME_JAVA_LANG_STRING_:
			return getSubnetName_java_lang_String_();
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_LIST:
			return getSubnets_software_amazon_awscdk_services_ec2_ISubnet_AsList();
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__SUBNET_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_TYPE_:
			return getSubnetType_software_amazon_awscdk_services_ec2_SubnetType_();
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST:
			setAvailabilityZones_java_lang_String_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__ONE_PER_AZ_JAVA_LANG_BOOLEAN_:
			setOnePerAz_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__SUBNET_GROUP_NAME_JAVA_LANG_STRING_:
			setSubnetGroupName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__SUBNET_NAME_JAVA_LANG_STRING_:
			setSubnetName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_LIST:
			setSubnets_software_amazon_awscdk_services_ec2_ISubnet_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__SUBNET_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_TYPE_:
			setSubnetType_software_amazon_awscdk_services_ec2_SubnetType_((SubnetType) newValue);
			return;
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST:
			setAvailabilityZones_java_lang_String_AsList(AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__ONE_PER_AZ_JAVA_LANG_BOOLEAN_:
			setOnePerAz_java_lang_Boolean_(ONE_PER_AZ_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__SUBNET_GROUP_NAME_JAVA_LANG_STRING_:
			setSubnetGroupName_java_lang_String_(SUBNET_GROUP_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__SUBNET_NAME_JAVA_LANG_STRING_:
			setSubnetName_java_lang_String_(SUBNET_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_LIST:
			setSubnets_software_amazon_awscdk_services_ec2_ISubnet_AsList(
					SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__SUBNET_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_TYPE_:
			setSubnetType_software_amazon_awscdk_services_ec2_SubnetType_(
					SUBNET_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_TYPE__EDEFAULT);
			return;
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST:
			return AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? availabilityZones_java_lang_String_AsList != null
					: !AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST_EDEFAULT
							.equals(availabilityZones_java_lang_String_AsList);
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__ONE_PER_AZ_JAVA_LANG_BOOLEAN_:
			return ONE_PER_AZ_JAVA_LANG_BOOLEAN__EDEFAULT == null ? onePerAz_java_lang_Boolean_ != null
					: !ONE_PER_AZ_JAVA_LANG_BOOLEAN__EDEFAULT.equals(onePerAz_java_lang_Boolean_);
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__SUBNET_GROUP_NAME_JAVA_LANG_STRING_:
			return SUBNET_GROUP_NAME_JAVA_LANG_STRING__EDEFAULT == null ? subnetGroupName_java_lang_String_ != null
					: !SUBNET_GROUP_NAME_JAVA_LANG_STRING__EDEFAULT.equals(subnetGroupName_java_lang_String_);
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__SUBNET_NAME_JAVA_LANG_STRING_:
			return SUBNET_NAME_JAVA_LANG_STRING__EDEFAULT == null ? subnetName_java_lang_String_ != null
					: !SUBNET_NAME_JAVA_LANG_STRING__EDEFAULT.equals(subnetName_java_lang_String_);
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_LIST:
			return SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_LIST_EDEFAULT == null
					? subnets_software_amazon_awscdk_services_ec2_ISubnet_AsList != null
					: !SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_LIST_EDEFAULT
							.equals(subnets_software_amazon_awscdk_services_ec2_ISubnet_AsList);
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__SUBNET_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_TYPE_:
			return subnetType_software_amazon_awscdk_services_ec2_SubnetType_ != SUBNET_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_TYPE__EDEFAULT;
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2__ADDITIONAL_CODE:
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
		result.append(", onePerAz_java_lang_Boolean_: ");
		result.append(onePerAz_java_lang_Boolean_);
		result.append(", subnetGroupName_java_lang_String_: ");
		result.append(subnetGroupName_java_lang_String_);
		result.append(", subnetName_java_lang_String_: ");
		result.append(subnetName_java_lang_String_);
		result.append(", subnets_software_amazon_awscdk_services_ec2_ISubnet_AsList: ");
		result.append(subnets_software_amazon_awscdk_services_ec2_ISubnet_AsList);
		result.append(", subnetType_software_amazon_awscdk_services_ec2_SubnetType_: ");
		result.append(subnetType_software_amazon_awscdk_services_ec2_SubnetType_);
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

} //SubnetSelectionBuilder_ec2Impl
