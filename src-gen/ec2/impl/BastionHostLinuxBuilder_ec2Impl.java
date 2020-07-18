/**
 */
package ec2.impl;

import ec2.BastionHostLinuxBuilder_ec2;
import ec2.Ec2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bastion Host Linux Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ec2.impl.BastionHostLinuxBuilder_ec2Impl#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}</li>
 *   <li>{@link ec2.impl.BastionHostLinuxBuilder_ec2Impl#getAvailabilityZone_java_lang_String_ <em>Availability Zone java lang String </em>}</li>
 *   <li>{@link ec2.impl.BastionHostLinuxBuilder_ec2Impl#getBlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList <em>Block Devices software amazon awscdk services ec2 Block Device As List</em>}</li>
 *   <li>{@link ec2.impl.BastionHostLinuxBuilder_ec2Impl#getInstanceName_java_lang_String_ <em>Instance Name java lang String </em>}</li>
 *   <li>{@link ec2.impl.BastionHostLinuxBuilder_ec2Impl#getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference <em>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</em>}</li>
 *   <li>{@link ec2.impl.BastionHostLinuxBuilder_ec2Impl#getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference <em>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</em>}</li>
 *   <li>{@link ec2.impl.BastionHostLinuxBuilder_ec2Impl#getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference <em>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</em>}</li>
 *   <li>{@link ec2.impl.BastionHostLinuxBuilder_ec2Impl#getSubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Subnet Selection With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}</li>
 *   <li>{@link ec2.impl.BastionHostLinuxBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.impl.BastionHostLinuxBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.impl.BastionHostLinuxBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.impl.BastionHostLinuxBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BastionHostLinuxBuilder_ec2Impl extends MinimalEObjectImpl.Container
		implements BastionHostLinuxBuilder_ec2 {
	/**
	 * The default value of the '{@link #getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference = VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT;

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
	 * The default value of the '{@link #getBlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList() <em>Block Devices software amazon awscdk services ec2 Block Device As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList() <em>Block Devices software amazon awscdk services ec2 Block Device As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList()
	 * @generated
	 * @ordered
	 */
	protected String blockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList = BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceName_java_lang_String_() <em>Instance Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceName_java_lang_String_() <em>Instance Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String instanceName_java_lang_String_ = INSTANCE_NAME_JAVA_LANG_STRING__EDEFAULT;

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
	 * The default value of the '{@link #getSubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() <em>Subnet Selection With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNET_SELECTION_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() <em>Subnet Selection With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String subnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference = SUBNET_SELECTION_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.BastionHostLinux";

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
	protected BastionHostLinuxBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.Literals.BASTION_HOST_LINUX_BUILDER_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() {
		return vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(
			String newVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference) {
		String oldVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference = vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference;
		vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference = newVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE,
					oldVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference,
					vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference));
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
					Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_,
					oldAvailabilityZone_java_lang_String_, availabilityZone_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList() {
		return blockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList(
			String newBlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList) {
		String oldBlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList = blockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList;
		blockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList = newBlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_AS_LIST,
					oldBlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList,
					blockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstanceName_java_lang_String_() {
		return instanceName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstanceName_java_lang_String_(String newInstanceName_java_lang_String_) {
		String oldInstanceName_java_lang_String_ = instanceName_java_lang_String_;
		instanceName_java_lang_String_ = newInstanceName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__INSTANCE_NAME_JAVA_LANG_STRING_,
					oldInstanceName_java_lang_String_, instanceName_java_lang_String_));
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
					Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE,
					oldInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference,
					instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference));
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
					Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE,
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
					Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE,
					oldSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference,
					securityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() {
		return subnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(
			String newSubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference) {
		String oldSubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference = subnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference;
		subnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference = newSubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__SUBNET_SELECTION_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE,
					oldSubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference,
					subnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__VAR_NAME,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__IDENTIFIER,
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
					Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			return getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_:
			return getAvailabilityZone_java_lang_String_();
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_AS_LIST:
			return getBlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList();
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__INSTANCE_NAME_JAVA_LANG_STRING_:
			return getInstanceName_java_lang_String_();
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE:
			return getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference();
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE:
			return getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference();
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE:
			return getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference();
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__SUBNET_SELECTION_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
			return getSubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference((String) newValue);
			return;
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_:
			setAvailabilityZone_java_lang_String_((String) newValue);
			return;
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_AS_LIST:
			setBlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList((String) newValue);
			return;
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__INSTANCE_NAME_JAVA_LANG_STRING_:
			setInstanceName_java_lang_String_((String) newValue);
			return;
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE:
			setInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference(
					(String) newValue);
			return;
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE:
			setMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference(
					(String) newValue);
			return;
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE:
			setSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference(
					(String) newValue);
			return;
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__SUBNET_SELECTION_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
			setSubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(
					(String) newValue);
			return;
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(
					VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT);
			return;
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_:
			setAvailabilityZone_java_lang_String_(AVAILABILITY_ZONE_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_AS_LIST:
			setBlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList(
					BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_AS_LIST_EDEFAULT);
			return;
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__INSTANCE_NAME_JAVA_LANG_STRING_:
			setInstanceName_java_lang_String_(INSTANCE_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE:
			setInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference(
					INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE_EDEFAULT);
			return;
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE:
			setMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference(
					MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE_EDEFAULT);
			return;
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE:
			setSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference(
					SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE_EDEFAULT);
			return;
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__SUBNET_SELECTION_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
			setSubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(
					SUBNET_SELECTION_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT);
			return;
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			return VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT == null
					? vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference != null
					: !VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT
							.equals(vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference);
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_:
			return AVAILABILITY_ZONE_JAVA_LANG_STRING__EDEFAULT == null ? availabilityZone_java_lang_String_ != null
					: !AVAILABILITY_ZONE_JAVA_LANG_STRING__EDEFAULT.equals(availabilityZone_java_lang_String_);
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_AS_LIST:
			return BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_AS_LIST_EDEFAULT == null
					? blockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList != null
					: !BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_AS_LIST_EDEFAULT
							.equals(blockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList);
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__INSTANCE_NAME_JAVA_LANG_STRING_:
			return INSTANCE_NAME_JAVA_LANG_STRING__EDEFAULT == null ? instanceName_java_lang_String_ != null
					: !INSTANCE_NAME_JAVA_LANG_STRING__EDEFAULT.equals(instanceName_java_lang_String_);
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE:
			return INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE_EDEFAULT == null
					? instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference != null
					: !INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE_EDEFAULT
							.equals(instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference);
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE:
			return MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE_EDEFAULT == null
					? machineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference != null
					: !MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE_EDEFAULT
							.equals(machineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference);
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE:
			return SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE_EDEFAULT == null
					? securityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference != null
					: !SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE_EDEFAULT
							.equals(securityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference);
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__SUBNET_SELECTION_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
			return SUBNET_SELECTION_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT == null
					? subnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference != null
					: !SUBNET_SELECTION_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT
							.equals(subnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference);
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case Ec2Package.BASTION_HOST_LINUX_BUILDER_EC2__ADDITIONAL_CODE:
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
		result.append(" (vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference: ");
		result.append(vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference);
		result.append(", availabilityZone_java_lang_String_: ");
		result.append(availabilityZone_java_lang_String_);
		result.append(", blockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList: ");
		result.append(blockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList);
		result.append(", instanceName_java_lang_String_: ");
		result.append(instanceName_java_lang_String_);
		result.append(", instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference: ");
		result.append(instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference);
		result.append(
				", machineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference: ");
		result.append(machineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference);
		result.append(
				", securityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference: ");
		result.append(securityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference);
		result.append(
				", subnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference: ");
		result.append(
				subnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference);
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

} //BastionHostLinuxBuilder_ec2Impl
