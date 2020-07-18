/**
 */
package ec2.impl;

import ec2.Ec2Package;
import ec2.NatInstanceProviderBuilder_ec2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nat Instance Provider Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ec2.impl.NatInstanceProviderBuilder_ec2Impl#getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference <em>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</em>}</li>
 *   <li>{@link ec2.impl.NatInstanceProviderBuilder_ec2Impl#getAllowAllTraffic_java_lang_Boolean_ <em>Allow All Traffic java lang Boolean </em>}</li>
 *   <li>{@link ec2.impl.NatInstanceProviderBuilder_ec2Impl#getKeyName_java_lang_String_ <em>Key Name java lang String </em>}</li>
 *   <li>{@link ec2.impl.NatInstanceProviderBuilder_ec2Impl#getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference <em>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</em>}</li>
 *   <li>{@link ec2.impl.NatInstanceProviderBuilder_ec2Impl#getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference <em>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</em>}</li>
 *   <li>{@link ec2.impl.NatInstanceProviderBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.impl.NatInstanceProviderBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.impl.NatInstanceProviderBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.impl.NatInstanceProviderBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NatInstanceProviderBuilder_ec2Impl extends MinimalEObjectImpl.Container
		implements NatInstanceProviderBuilder_ec2 {
	/**
	 * The default value of the '{@link #getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference() <em>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference() <em>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference = INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowAllTraffic_java_lang_Boolean_() <em>Allow All Traffic java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowAllTraffic_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_ALL_TRAFFIC_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowAllTraffic_java_lang_Boolean_() <em>Allow All Traffic java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowAllTraffic_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowAllTraffic_java_lang_Boolean_ = ALLOW_ALL_TRAFFIC_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyName_java_lang_String_() <em>Key Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyName_java_lang_String_() <em>Key Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String keyName_java_lang_String_ = KEY_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference() <em>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference() <em>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String machineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference = MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference() <em>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference() <em>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String securityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference = SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.NatInstanceProvider";

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
	protected NatInstanceProviderBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.Literals.NAT_INSTANCE_PROVIDER_BUILDER_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference() {
		return instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference(
			String newInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference) {
		String oldInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference = instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference;
		instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference = newInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE,
					oldInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference,
					instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAllowAllTraffic_java_lang_Boolean_() {
		return allowAllTraffic_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowAllTraffic_java_lang_Boolean_(Boolean newAllowAllTraffic_java_lang_Boolean_) {
		Boolean oldAllowAllTraffic_java_lang_Boolean_ = allowAllTraffic_java_lang_Boolean_;
		allowAllTraffic_java_lang_Boolean_ = newAllowAllTraffic_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__ALLOW_ALL_TRAFFIC_JAVA_LANG_BOOLEAN_,
					oldAllowAllTraffic_java_lang_Boolean_, allowAllTraffic_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKeyName_java_lang_String_() {
		return keyName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeyName_java_lang_String_(String newKeyName_java_lang_String_) {
		String oldKeyName_java_lang_String_ = keyName_java_lang_String_;
		keyName_java_lang_String_ = newKeyName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__KEY_NAME_JAVA_LANG_STRING_,
					oldKeyName_java_lang_String_, keyName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference() {
		return machineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference(
			String newMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference) {
		String oldMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference = machineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference;
		machineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference = newMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE,
					oldMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference,
					machineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference() {
		return securityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference(
			String newSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference) {
		String oldSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference = securityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference;
		securityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference = newSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE,
					oldSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference,
					securityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference));
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
					Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__VAR_NAME, oldVarName, varName));
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
					Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__IDENTIFIER, oldIdentifier, identifier));
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
					Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE:
			return getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference();
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__ALLOW_ALL_TRAFFIC_JAVA_LANG_BOOLEAN_:
			return getAllowAllTraffic_java_lang_Boolean_();
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__KEY_NAME_JAVA_LANG_STRING_:
			return getKeyName_java_lang_String_();
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE:
			return getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference();
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE:
			return getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference();
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE:
			setInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference(
					(String) newValue);
			return;
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__ALLOW_ALL_TRAFFIC_JAVA_LANG_BOOLEAN_:
			setAllowAllTraffic_java_lang_Boolean_((Boolean) newValue);
			return;
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__KEY_NAME_JAVA_LANG_STRING_:
			setKeyName_java_lang_String_((String) newValue);
			return;
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE:
			setMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference(
					(String) newValue);
			return;
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE:
			setSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference(
					(String) newValue);
			return;
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE:
			setInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference(
					INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE_EDEFAULT);
			return;
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__ALLOW_ALL_TRAFFIC_JAVA_LANG_BOOLEAN_:
			setAllowAllTraffic_java_lang_Boolean_(ALLOW_ALL_TRAFFIC_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__KEY_NAME_JAVA_LANG_STRING_:
			setKeyName_java_lang_String_(KEY_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE:
			setMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference(
					MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE_EDEFAULT);
			return;
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE:
			setSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference(
					SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE_EDEFAULT);
			return;
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE:
			return INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE_EDEFAULT == null
					? instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference != null
					: !INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE_EDEFAULT
							.equals(instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference);
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__ALLOW_ALL_TRAFFIC_JAVA_LANG_BOOLEAN_:
			return ALLOW_ALL_TRAFFIC_JAVA_LANG_BOOLEAN__EDEFAULT == null ? allowAllTraffic_java_lang_Boolean_ != null
					: !ALLOW_ALL_TRAFFIC_JAVA_LANG_BOOLEAN__EDEFAULT.equals(allowAllTraffic_java_lang_Boolean_);
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__KEY_NAME_JAVA_LANG_STRING_:
			return KEY_NAME_JAVA_LANG_STRING__EDEFAULT == null ? keyName_java_lang_String_ != null
					: !KEY_NAME_JAVA_LANG_STRING__EDEFAULT.equals(keyName_java_lang_String_);
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE:
			return MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE_EDEFAULT == null
					? machineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference != null
					: !MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE_EDEFAULT
							.equals(machineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference);
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE:
			return SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE_EDEFAULT == null
					? securityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference != null
					: !SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE_EDEFAULT
							.equals(securityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference);
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case Ec2Package.NAT_INSTANCE_PROVIDER_BUILDER_EC2__ADDITIONAL_CODE:
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
		result.append(" (instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference: ");
		result.append(instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference);
		result.append(", allowAllTraffic_java_lang_Boolean_: ");
		result.append(allowAllTraffic_java_lang_Boolean_);
		result.append(", keyName_java_lang_String_: ");
		result.append(keyName_java_lang_String_);
		result.append(
				", machineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference: ");
		result.append(machineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference);
		result.append(
				", securityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference: ");
		result.append(securityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference);
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

} //NatInstanceProviderBuilder_ec2Impl
