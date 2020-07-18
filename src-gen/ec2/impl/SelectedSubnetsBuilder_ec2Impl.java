/**
 */
package ec2.impl;

import ec2.Ec2Package;
import ec2.SelectedSubnetsBuilder_ec2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selected Subnets Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ec2.impl.SelectedSubnetsBuilder_ec2Impl#getAvailabilityZones_java_lang_String_AsList <em>Availability Zones java lang String As List</em>}</li>
 *   <li>{@link ec2.impl.SelectedSubnetsBuilder_ec2Impl#getHasPublic_java_lang_Boolean_ <em>Has Public java lang Boolean </em>}</li>
 *   <li>{@link ec2.impl.SelectedSubnetsBuilder_ec2Impl#getInternetConnectivityEstablishedWithIDependable_software_amazon_awscdk_core_IDependable_AsReference <em>Internet Connectivity Established With IDependable software amazon awscdk core IDependable As Reference</em>}</li>
 *   <li>{@link ec2.impl.SelectedSubnetsBuilder_ec2Impl#getSubnetIds_java_lang_String_AsList <em>Subnet Ids java lang String As List</em>}</li>
 *   <li>{@link ec2.impl.SelectedSubnetsBuilder_ec2Impl#getSubnets_software_amazon_awscdk_services_ec2_ISubnet_AsList <em>Subnets software amazon awscdk services ec2 ISubnet As List</em>}</li>
 *   <li>{@link ec2.impl.SelectedSubnetsBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.impl.SelectedSubnetsBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.impl.SelectedSubnetsBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.impl.SelectedSubnetsBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectedSubnetsBuilder_ec2Impl extends MinimalEObjectImpl.Container implements SelectedSubnetsBuilder_ec2 {
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
	 * The default value of the '{@link #getHasPublic_java_lang_Boolean_() <em>Has Public java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPublic_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HAS_PUBLIC_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHasPublic_java_lang_Boolean_() <em>Has Public java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPublic_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean hasPublic_java_lang_Boolean_ = HAS_PUBLIC_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getInternetConnectivityEstablishedWithIDependable_software_amazon_awscdk_core_IDependable_AsReference() <em>Internet Connectivity Established With IDependable software amazon awscdk core IDependable As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternetConnectivityEstablishedWithIDependable_software_amazon_awscdk_core_IDependable_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERNET_CONNECTIVITY_ESTABLISHED_WITH_IDEPENDABLE_SOFTWARE_AMAZON_AWSCDK_CORE_IDEPENDABLE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInternetConnectivityEstablishedWithIDependable_software_amazon_awscdk_core_IDependable_AsReference() <em>Internet Connectivity Established With IDependable software amazon awscdk core IDependable As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternetConnectivityEstablishedWithIDependable_software_amazon_awscdk_core_IDependable_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String internetConnectivityEstablishedWithIDependable_software_amazon_awscdk_core_IDependable_AsReference = INTERNET_CONNECTIVITY_ESTABLISHED_WITH_IDEPENDABLE_SOFTWARE_AMAZON_AWSCDK_CORE_IDEPENDABLE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubnetIds_java_lang_String_AsList() <em>Subnet Ids java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetIds_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNET_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubnetIds_java_lang_String_AsList() <em>Subnet Ids java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetIds_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String subnetIds_java_lang_String_AsList = SUBNET_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

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
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.SelectedSubnets";

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
	protected SelectedSubnetsBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.Literals.SELECTED_SUBNETS_BUILDER_EC2;
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
					Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST,
					oldAvailabilityZones_java_lang_String_AsList, availabilityZones_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getHasPublic_java_lang_Boolean_() {
		return hasPublic_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasPublic_java_lang_Boolean_(Boolean newHasPublic_java_lang_Boolean_) {
		Boolean oldHasPublic_java_lang_Boolean_ = hasPublic_java_lang_Boolean_;
		hasPublic_java_lang_Boolean_ = newHasPublic_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__HAS_PUBLIC_JAVA_LANG_BOOLEAN_,
					oldHasPublic_java_lang_Boolean_, hasPublic_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInternetConnectivityEstablishedWithIDependable_software_amazon_awscdk_core_IDependable_AsReference() {
		return internetConnectivityEstablishedWithIDependable_software_amazon_awscdk_core_IDependable_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternetConnectivityEstablishedWithIDependable_software_amazon_awscdk_core_IDependable_AsReference(
			String newInternetConnectivityEstablishedWithIDependable_software_amazon_awscdk_core_IDependable_AsReference) {
		String oldInternetConnectivityEstablishedWithIDependable_software_amazon_awscdk_core_IDependable_AsReference = internetConnectivityEstablishedWithIDependable_software_amazon_awscdk_core_IDependable_AsReference;
		internetConnectivityEstablishedWithIDependable_software_amazon_awscdk_core_IDependable_AsReference = newInternetConnectivityEstablishedWithIDependable_software_amazon_awscdk_core_IDependable_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__INTERNET_CONNECTIVITY_ESTABLISHED_WITH_IDEPENDABLE_SOFTWARE_AMAZON_AWSCDK_CORE_IDEPENDABLE_AS_REFERENCE,
					oldInternetConnectivityEstablishedWithIDependable_software_amazon_awscdk_core_IDependable_AsReference,
					internetConnectivityEstablishedWithIDependable_software_amazon_awscdk_core_IDependable_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubnetIds_java_lang_String_AsList() {
		return subnetIds_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubnetIds_java_lang_String_AsList(String newSubnetIds_java_lang_String_AsList) {
		String oldSubnetIds_java_lang_String_AsList = subnetIds_java_lang_String_AsList;
		subnetIds_java_lang_String_AsList = newSubnetIds_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__SUBNET_IDS_JAVA_LANG_STRING_AS_LIST,
					oldSubnetIds_java_lang_String_AsList, subnetIds_java_lang_String_AsList));
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
					Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_LIST,
					oldSubnets_software_amazon_awscdk_services_ec2_ISubnet_AsList,
					subnets_software_amazon_awscdk_services_ec2_ISubnet_AsList));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__VAR_NAME,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__IDENTIFIER,
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
					Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST:
			return getAvailabilityZones_java_lang_String_AsList();
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__HAS_PUBLIC_JAVA_LANG_BOOLEAN_:
			return getHasPublic_java_lang_Boolean_();
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__INTERNET_CONNECTIVITY_ESTABLISHED_WITH_IDEPENDABLE_SOFTWARE_AMAZON_AWSCDK_CORE_IDEPENDABLE_AS_REFERENCE:
			return getInternetConnectivityEstablishedWithIDependable_software_amazon_awscdk_core_IDependable_AsReference();
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__SUBNET_IDS_JAVA_LANG_STRING_AS_LIST:
			return getSubnetIds_java_lang_String_AsList();
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_LIST:
			return getSubnets_software_amazon_awscdk_services_ec2_ISubnet_AsList();
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST:
			setAvailabilityZones_java_lang_String_AsList((String) newValue);
			return;
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__HAS_PUBLIC_JAVA_LANG_BOOLEAN_:
			setHasPublic_java_lang_Boolean_((Boolean) newValue);
			return;
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__INTERNET_CONNECTIVITY_ESTABLISHED_WITH_IDEPENDABLE_SOFTWARE_AMAZON_AWSCDK_CORE_IDEPENDABLE_AS_REFERENCE:
			setInternetConnectivityEstablishedWithIDependable_software_amazon_awscdk_core_IDependable_AsReference(
					(String) newValue);
			return;
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__SUBNET_IDS_JAVA_LANG_STRING_AS_LIST:
			setSubnetIds_java_lang_String_AsList((String) newValue);
			return;
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_LIST:
			setSubnets_software_amazon_awscdk_services_ec2_ISubnet_AsList((String) newValue);
			return;
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST:
			setAvailabilityZones_java_lang_String_AsList(AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__HAS_PUBLIC_JAVA_LANG_BOOLEAN_:
			setHasPublic_java_lang_Boolean_(HAS_PUBLIC_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__INTERNET_CONNECTIVITY_ESTABLISHED_WITH_IDEPENDABLE_SOFTWARE_AMAZON_AWSCDK_CORE_IDEPENDABLE_AS_REFERENCE:
			setInternetConnectivityEstablishedWithIDependable_software_amazon_awscdk_core_IDependable_AsReference(
					INTERNET_CONNECTIVITY_ESTABLISHED_WITH_IDEPENDABLE_SOFTWARE_AMAZON_AWSCDK_CORE_IDEPENDABLE_AS_REFERENCE_EDEFAULT);
			return;
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__SUBNET_IDS_JAVA_LANG_STRING_AS_LIST:
			setSubnetIds_java_lang_String_AsList(SUBNET_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_LIST:
			setSubnets_software_amazon_awscdk_services_ec2_ISubnet_AsList(
					SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_LIST_EDEFAULT);
			return;
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST:
			return AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? availabilityZones_java_lang_String_AsList != null
					: !AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST_EDEFAULT
							.equals(availabilityZones_java_lang_String_AsList);
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__HAS_PUBLIC_JAVA_LANG_BOOLEAN_:
			return HAS_PUBLIC_JAVA_LANG_BOOLEAN__EDEFAULT == null ? hasPublic_java_lang_Boolean_ != null
					: !HAS_PUBLIC_JAVA_LANG_BOOLEAN__EDEFAULT.equals(hasPublic_java_lang_Boolean_);
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__INTERNET_CONNECTIVITY_ESTABLISHED_WITH_IDEPENDABLE_SOFTWARE_AMAZON_AWSCDK_CORE_IDEPENDABLE_AS_REFERENCE:
			return INTERNET_CONNECTIVITY_ESTABLISHED_WITH_IDEPENDABLE_SOFTWARE_AMAZON_AWSCDK_CORE_IDEPENDABLE_AS_REFERENCE_EDEFAULT == null
					? internetConnectivityEstablishedWithIDependable_software_amazon_awscdk_core_IDependable_AsReference != null
					: !INTERNET_CONNECTIVITY_ESTABLISHED_WITH_IDEPENDABLE_SOFTWARE_AMAZON_AWSCDK_CORE_IDEPENDABLE_AS_REFERENCE_EDEFAULT
							.equals(internetConnectivityEstablishedWithIDependable_software_amazon_awscdk_core_IDependable_AsReference);
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__SUBNET_IDS_JAVA_LANG_STRING_AS_LIST:
			return SUBNET_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null ? subnetIds_java_lang_String_AsList != null
					: !SUBNET_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT.equals(subnetIds_java_lang_String_AsList);
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_LIST:
			return SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_LIST_EDEFAULT == null
					? subnets_software_amazon_awscdk_services_ec2_ISubnet_AsList != null
					: !SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_LIST_EDEFAULT
							.equals(subnets_software_amazon_awscdk_services_ec2_ISubnet_AsList);
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case Ec2Package.SELECTED_SUBNETS_BUILDER_EC2__ADDITIONAL_CODE:
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
		result.append(", hasPublic_java_lang_Boolean_: ");
		result.append(hasPublic_java_lang_Boolean_);
		result.append(
				", internetConnectivityEstablishedWithIDependable_software_amazon_awscdk_core_IDependable_AsReference: ");
		result.append(
				internetConnectivityEstablishedWithIDependable_software_amazon_awscdk_core_IDependable_AsReference);
		result.append(", subnetIds_java_lang_String_AsList: ");
		result.append(subnetIds_java_lang_String_AsList);
		result.append(", subnets_software_amazon_awscdk_services_ec2_ISubnet_AsList: ");
		result.append(subnets_software_amazon_awscdk_services_ec2_ISubnet_AsList);
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

} //SelectedSubnetsBuilder_ec2Impl
