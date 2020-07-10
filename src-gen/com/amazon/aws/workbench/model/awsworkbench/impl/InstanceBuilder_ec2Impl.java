/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.InstanceBuilder_ec2Impl#getInstanceTypeWithInstanceTypeAsReference <em>Instance Type With Instance Type As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.InstanceBuilder_ec2Impl#getMachineImageWithIMachineImageAsReference <em>Machine Image With IMachine Image As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.InstanceBuilder_ec2Impl#getVpcWithIVpcAsReference <em>Vpc With IVpc As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.InstanceBuilder_ec2Impl#getAllowAllOutbound <em>Allow All Outbound</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.InstanceBuilder_ec2Impl#getAvailabilityZone <em>Availability Zone</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.InstanceBuilder_ec2Impl#getBlockDevicesAsList <em>Block Devices As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.InstanceBuilder_ec2Impl#getInstanceName <em>Instance Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.InstanceBuilder_ec2Impl#getKeyName <em>Key Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.InstanceBuilder_ec2Impl#getPrivateIpAddress <em>Private Ip Address</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.InstanceBuilder_ec2Impl#getResourceSignalTimeoutWithDurationAsReference <em>Resource Signal Timeout With Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.InstanceBuilder_ec2Impl#getRoleWithIRoleAsReference <em>Role With IRole As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.InstanceBuilder_ec2Impl#getSecurityGroupWithISecurityGroupAsReference <em>Security Group With ISecurity Group As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.InstanceBuilder_ec2Impl#getSourceDestCheck <em>Source Dest Check</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.InstanceBuilder_ec2Impl#getUserDataWithUserDataAsReference <em>User Data With User Data As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.InstanceBuilder_ec2Impl#getVpcSubnetsWithSubnetSelectionAsReference <em>Vpc Subnets With Subnet Selection As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.InstanceBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.InstanceBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.InstanceBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.InstanceBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceBuilder_ec2Impl extends ServiceResourcesImpl implements InstanceBuilder_ec2 {
	/**
	 * The default value of the '{@link #getInstanceTypeWithInstanceTypeAsReference() <em>Instance Type With Instance Type As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceTypeWithInstanceTypeAsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_TYPE_WITH_INSTANCE_TYPE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceTypeWithInstanceTypeAsReference() <em>Instance Type With Instance Type As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceTypeWithInstanceTypeAsReference()
	 * @generated
	 * @ordered
	 */
	protected String instanceTypeWithInstanceTypeAsReference = INSTANCE_TYPE_WITH_INSTANCE_TYPE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMachineImageWithIMachineImageAsReference() <em>Machine Image With IMachine Image As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineImageWithIMachineImageAsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String MACHINE_IMAGE_WITH_IMACHINE_IMAGE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMachineImageWithIMachineImageAsReference() <em>Machine Image With IMachine Image As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineImageWithIMachineImageAsReference()
	 * @generated
	 * @ordered
	 */
	protected String machineImageWithIMachineImageAsReference = MACHINE_IMAGE_WITH_IMACHINE_IMAGE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVpcWithIVpcAsReference() <em>Vpc With IVpc As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcWithIVpcAsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String VPC_WITH_IVPC_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpcWithIVpcAsReference() <em>Vpc With IVpc As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcWithIVpcAsReference()
	 * @generated
	 * @ordered
	 */
	protected String vpcWithIVpcAsReference = VPC_WITH_IVPC_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowAllOutbound() <em>Allow All Outbound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowAllOutbound()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_ALL_OUTBOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowAllOutbound() <em>Allow All Outbound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowAllOutbound()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowAllOutbound = ALLOW_ALL_OUTBOUND_EDEFAULT;

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
	 * The default value of the '{@link #getBlockDevicesAsList() <em>Block Devices As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockDevicesAsList()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOCK_DEVICES_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockDevicesAsList() <em>Block Devices As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockDevicesAsList()
	 * @generated
	 * @ordered
	 */
	protected String blockDevicesAsList = BLOCK_DEVICES_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceName() <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceName()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceName() <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceName()
	 * @generated
	 * @ordered
	 */
	protected String instanceName = INSTANCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyName() <em>Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyName()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyName() <em>Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyName()
	 * @generated
	 * @ordered
	 */
	protected String keyName = KEY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivateIpAddress() <em>Private Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateIpAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVATE_IP_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivateIpAddress() <em>Private Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateIpAddress()
	 * @generated
	 * @ordered
	 */
	protected String privateIpAddress = PRIVATE_IP_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceSignalTimeoutWithDurationAsReference() <em>Resource Signal Timeout With Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceSignalTimeoutWithDurationAsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceSignalTimeoutWithDurationAsReference() <em>Resource Signal Timeout With Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceSignalTimeoutWithDurationAsReference()
	 * @generated
	 * @ordered
	 */
	protected String resourceSignalTimeoutWithDurationAsReference = RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoleWithIRoleAsReference() <em>Role With IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleWithIRoleAsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_WITH_IROLE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleWithIRoleAsReference() <em>Role With IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleWithIRoleAsReference()
	 * @generated
	 * @ordered
	 */
	protected String roleWithIRoleAsReference = ROLE_WITH_IROLE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurityGroupWithISecurityGroupAsReference() <em>Security Group With ISecurity Group As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroupWithISecurityGroupAsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_GROUP_WITH_ISECURITY_GROUP_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityGroupWithISecurityGroupAsReference() <em>Security Group With ISecurity Group As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroupWithISecurityGroupAsReference()
	 * @generated
	 * @ordered
	 */
	protected String securityGroupWithISecurityGroupAsReference = SECURITY_GROUP_WITH_ISECURITY_GROUP_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceDestCheck() <em>Source Dest Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDestCheck()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SOURCE_DEST_CHECK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceDestCheck() <em>Source Dest Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDestCheck()
	 * @generated
	 * @ordered
	 */
	protected Boolean sourceDestCheck = SOURCE_DEST_CHECK_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserDataWithUserDataAsReference() <em>User Data With User Data As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDataWithUserDataAsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_DATA_WITH_USER_DATA_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserDataWithUserDataAsReference() <em>User Data With User Data As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDataWithUserDataAsReference()
	 * @generated
	 * @ordered
	 */
	protected String userDataWithUserDataAsReference = USER_DATA_WITH_USER_DATA_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVpcSubnetsWithSubnetSelectionAsReference() <em>Vpc Subnets With Subnet Selection As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcSubnetsWithSubnetSelectionAsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String VPC_SUBNETS_WITH_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpcSubnetsWithSubnetSelectionAsReference() <em>Vpc Subnets With Subnet Selection As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcSubnetsWithSubnetSelectionAsReference()
	 * @generated
	 * @ordered
	 */
	protected String vpcSubnetsWithSubnetSelectionAsReference = VPC_SUBNETS_WITH_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.Instance";

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
	protected InstanceBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.INSTANCE_BUILDER_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstanceTypeWithInstanceTypeAsReference() {
		return instanceTypeWithInstanceTypeAsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstanceTypeWithInstanceTypeAsReference(String newInstanceTypeWithInstanceTypeAsReference) {
		String oldInstanceTypeWithInstanceTypeAsReference = instanceTypeWithInstanceTypeAsReference;
		instanceTypeWithInstanceTypeAsReference = newInstanceTypeWithInstanceTypeAsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.INSTANCE_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_AS_REFERENCE,
					oldInstanceTypeWithInstanceTypeAsReference, instanceTypeWithInstanceTypeAsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMachineImageWithIMachineImageAsReference() {
		return machineImageWithIMachineImageAsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMachineImageWithIMachineImageAsReference(String newMachineImageWithIMachineImageAsReference) {
		String oldMachineImageWithIMachineImageAsReference = machineImageWithIMachineImageAsReference;
		machineImageWithIMachineImageAsReference = newMachineImageWithIMachineImageAsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.INSTANCE_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_AS_REFERENCE,
					oldMachineImageWithIMachineImageAsReference, machineImageWithIMachineImageAsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVpcWithIVpcAsReference() {
		return vpcWithIVpcAsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpcWithIVpcAsReference(String newVpcWithIVpcAsReference) {
		String oldVpcWithIVpcAsReference = vpcWithIVpcAsReference;
		vpcWithIVpcAsReference = newVpcWithIVpcAsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.INSTANCE_BUILDER_EC2__VPC_WITH_IVPC_AS_REFERENCE, oldVpcWithIVpcAsReference,
					vpcWithIVpcAsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAllowAllOutbound() {
		return allowAllOutbound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowAllOutbound(Boolean newAllowAllOutbound) {
		Boolean oldAllowAllOutbound = allowAllOutbound;
		allowAllOutbound = newAllowAllOutbound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.INSTANCE_BUILDER_EC2__ALLOW_ALL_OUTBOUND, oldAllowAllOutbound,
					allowAllOutbound));
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
					AwsworkbenchPackage.INSTANCE_BUILDER_EC2__AVAILABILITY_ZONE, oldAvailabilityZone,
					availabilityZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBlockDevicesAsList() {
		return blockDevicesAsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlockDevicesAsList(String newBlockDevicesAsList) {
		String oldBlockDevicesAsList = blockDevicesAsList;
		blockDevicesAsList = newBlockDevicesAsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.INSTANCE_BUILDER_EC2__BLOCK_DEVICES_AS_LIST, oldBlockDevicesAsList,
					blockDevicesAsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstanceName() {
		return instanceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstanceName(String newInstanceName) {
		String oldInstanceName = instanceName;
		instanceName = newInstanceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.INSTANCE_BUILDER_EC2__INSTANCE_NAME, oldInstanceName, instanceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKeyName() {
		return keyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeyName(String newKeyName) {
		String oldKeyName = keyName;
		keyName = newKeyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.INSTANCE_BUILDER_EC2__KEY_NAME,
					oldKeyName, keyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrivateIpAddress() {
		return privateIpAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivateIpAddress(String newPrivateIpAddress) {
		String oldPrivateIpAddress = privateIpAddress;
		privateIpAddress = newPrivateIpAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.INSTANCE_BUILDER_EC2__PRIVATE_IP_ADDRESS, oldPrivateIpAddress,
					privateIpAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResourceSignalTimeoutWithDurationAsReference() {
		return resourceSignalTimeoutWithDurationAsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceSignalTimeoutWithDurationAsReference(
			String newResourceSignalTimeoutWithDurationAsReference) {
		String oldResourceSignalTimeoutWithDurationAsReference = resourceSignalTimeoutWithDurationAsReference;
		resourceSignalTimeoutWithDurationAsReference = newResourceSignalTimeoutWithDurationAsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.INSTANCE_BUILDER_EC2__RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_AS_REFERENCE,
					oldResourceSignalTimeoutWithDurationAsReference, resourceSignalTimeoutWithDurationAsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoleWithIRoleAsReference() {
		return roleWithIRoleAsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleWithIRoleAsReference(String newRoleWithIRoleAsReference) {
		String oldRoleWithIRoleAsReference = roleWithIRoleAsReference;
		roleWithIRoleAsReference = newRoleWithIRoleAsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.INSTANCE_BUILDER_EC2__ROLE_WITH_IROLE_AS_REFERENCE, oldRoleWithIRoleAsReference,
					roleWithIRoleAsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecurityGroupWithISecurityGroupAsReference() {
		return securityGroupWithISecurityGroupAsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityGroupWithISecurityGroupAsReference(String newSecurityGroupWithISecurityGroupAsReference) {
		String oldSecurityGroupWithISecurityGroupAsReference = securityGroupWithISecurityGroupAsReference;
		securityGroupWithISecurityGroupAsReference = newSecurityGroupWithISecurityGroupAsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.INSTANCE_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_AS_REFERENCE,
					oldSecurityGroupWithISecurityGroupAsReference, securityGroupWithISecurityGroupAsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSourceDestCheck() {
		return sourceDestCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceDestCheck(Boolean newSourceDestCheck) {
		Boolean oldSourceDestCheck = sourceDestCheck;
		sourceDestCheck = newSourceDestCheck;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.INSTANCE_BUILDER_EC2__SOURCE_DEST_CHECK, oldSourceDestCheck, sourceDestCheck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserDataWithUserDataAsReference() {
		return userDataWithUserDataAsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserDataWithUserDataAsReference(String newUserDataWithUserDataAsReference) {
		String oldUserDataWithUserDataAsReference = userDataWithUserDataAsReference;
		userDataWithUserDataAsReference = newUserDataWithUserDataAsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.INSTANCE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_AS_REFERENCE,
					oldUserDataWithUserDataAsReference, userDataWithUserDataAsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVpcSubnetsWithSubnetSelectionAsReference() {
		return vpcSubnetsWithSubnetSelectionAsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpcSubnetsWithSubnetSelectionAsReference(String newVpcSubnetsWithSubnetSelectionAsReference) {
		String oldVpcSubnetsWithSubnetSelectionAsReference = vpcSubnetsWithSubnetSelectionAsReference;
		vpcSubnetsWithSubnetSelectionAsReference = newVpcSubnetsWithSubnetSelectionAsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.INSTANCE_BUILDER_EC2__VPC_SUBNETS_WITH_SUBNET_SELECTION_AS_REFERENCE,
					oldVpcSubnetsWithSubnetSelectionAsReference, vpcSubnetsWithSubnetSelectionAsReference));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.INSTANCE_BUILDER_EC2__VAR_NAME,
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
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.INSTANCE_BUILDER_EC2__IDENTIFIER,
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
					AwsworkbenchPackage.INSTANCE_BUILDER_EC2__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_AS_REFERENCE:
			return getInstanceTypeWithInstanceTypeAsReference();
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_AS_REFERENCE:
			return getMachineImageWithIMachineImageAsReference();
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__VPC_WITH_IVPC_AS_REFERENCE:
			return getVpcWithIVpcAsReference();
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__ALLOW_ALL_OUTBOUND:
			return getAllowAllOutbound();
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__AVAILABILITY_ZONE:
			return getAvailabilityZone();
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__BLOCK_DEVICES_AS_LIST:
			return getBlockDevicesAsList();
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__INSTANCE_NAME:
			return getInstanceName();
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__KEY_NAME:
			return getKeyName();
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__PRIVATE_IP_ADDRESS:
			return getPrivateIpAddress();
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_AS_REFERENCE:
			return getResourceSignalTimeoutWithDurationAsReference();
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__ROLE_WITH_IROLE_AS_REFERENCE:
			return getRoleWithIRoleAsReference();
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_AS_REFERENCE:
			return getSecurityGroupWithISecurityGroupAsReference();
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__SOURCE_DEST_CHECK:
			return getSourceDestCheck();
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_AS_REFERENCE:
			return getUserDataWithUserDataAsReference();
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__VPC_SUBNETS_WITH_SUBNET_SELECTION_AS_REFERENCE:
			return getVpcSubnetsWithSubnetSelectionAsReference();
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_AS_REFERENCE:
			setInstanceTypeWithInstanceTypeAsReference((String) newValue);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_AS_REFERENCE:
			setMachineImageWithIMachineImageAsReference((String) newValue);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__VPC_WITH_IVPC_AS_REFERENCE:
			setVpcWithIVpcAsReference((String) newValue);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__ALLOW_ALL_OUTBOUND:
			setAllowAllOutbound((Boolean) newValue);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__AVAILABILITY_ZONE:
			setAvailabilityZone((String) newValue);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__BLOCK_DEVICES_AS_LIST:
			setBlockDevicesAsList((String) newValue);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__INSTANCE_NAME:
			setInstanceName((String) newValue);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__KEY_NAME:
			setKeyName((String) newValue);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__PRIVATE_IP_ADDRESS:
			setPrivateIpAddress((String) newValue);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_AS_REFERENCE:
			setResourceSignalTimeoutWithDurationAsReference((String) newValue);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__ROLE_WITH_IROLE_AS_REFERENCE:
			setRoleWithIRoleAsReference((String) newValue);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_AS_REFERENCE:
			setSecurityGroupWithISecurityGroupAsReference((String) newValue);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__SOURCE_DEST_CHECK:
			setSourceDestCheck((Boolean) newValue);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_AS_REFERENCE:
			setUserDataWithUserDataAsReference((String) newValue);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__VPC_SUBNETS_WITH_SUBNET_SELECTION_AS_REFERENCE:
			setVpcSubnetsWithSubnetSelectionAsReference((String) newValue);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_AS_REFERENCE:
			setInstanceTypeWithInstanceTypeAsReference(INSTANCE_TYPE_WITH_INSTANCE_TYPE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_AS_REFERENCE:
			setMachineImageWithIMachineImageAsReference(MACHINE_IMAGE_WITH_IMACHINE_IMAGE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__VPC_WITH_IVPC_AS_REFERENCE:
			setVpcWithIVpcAsReference(VPC_WITH_IVPC_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__ALLOW_ALL_OUTBOUND:
			setAllowAllOutbound(ALLOW_ALL_OUTBOUND_EDEFAULT);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__AVAILABILITY_ZONE:
			setAvailabilityZone(AVAILABILITY_ZONE_EDEFAULT);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__BLOCK_DEVICES_AS_LIST:
			setBlockDevicesAsList(BLOCK_DEVICES_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__INSTANCE_NAME:
			setInstanceName(INSTANCE_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__KEY_NAME:
			setKeyName(KEY_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__PRIVATE_IP_ADDRESS:
			setPrivateIpAddress(PRIVATE_IP_ADDRESS_EDEFAULT);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_AS_REFERENCE:
			setResourceSignalTimeoutWithDurationAsReference(
					RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__ROLE_WITH_IROLE_AS_REFERENCE:
			setRoleWithIRoleAsReference(ROLE_WITH_IROLE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_AS_REFERENCE:
			setSecurityGroupWithISecurityGroupAsReference(SECURITY_GROUP_WITH_ISECURITY_GROUP_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__SOURCE_DEST_CHECK:
			setSourceDestCheck(SOURCE_DEST_CHECK_EDEFAULT);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_AS_REFERENCE:
			setUserDataWithUserDataAsReference(USER_DATA_WITH_USER_DATA_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__VPC_SUBNETS_WITH_SUBNET_SELECTION_AS_REFERENCE:
			setVpcSubnetsWithSubnetSelectionAsReference(VPC_SUBNETS_WITH_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_AS_REFERENCE:
			return INSTANCE_TYPE_WITH_INSTANCE_TYPE_AS_REFERENCE_EDEFAULT == null
					? instanceTypeWithInstanceTypeAsReference != null
					: !INSTANCE_TYPE_WITH_INSTANCE_TYPE_AS_REFERENCE_EDEFAULT
							.equals(instanceTypeWithInstanceTypeAsReference);
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_AS_REFERENCE:
			return MACHINE_IMAGE_WITH_IMACHINE_IMAGE_AS_REFERENCE_EDEFAULT == null
					? machineImageWithIMachineImageAsReference != null
					: !MACHINE_IMAGE_WITH_IMACHINE_IMAGE_AS_REFERENCE_EDEFAULT
							.equals(machineImageWithIMachineImageAsReference);
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__VPC_WITH_IVPC_AS_REFERENCE:
			return VPC_WITH_IVPC_AS_REFERENCE_EDEFAULT == null ? vpcWithIVpcAsReference != null
					: !VPC_WITH_IVPC_AS_REFERENCE_EDEFAULT.equals(vpcWithIVpcAsReference);
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__ALLOW_ALL_OUTBOUND:
			return ALLOW_ALL_OUTBOUND_EDEFAULT == null ? allowAllOutbound != null
					: !ALLOW_ALL_OUTBOUND_EDEFAULT.equals(allowAllOutbound);
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__AVAILABILITY_ZONE:
			return AVAILABILITY_ZONE_EDEFAULT == null ? availabilityZone != null
					: !AVAILABILITY_ZONE_EDEFAULT.equals(availabilityZone);
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__BLOCK_DEVICES_AS_LIST:
			return BLOCK_DEVICES_AS_LIST_EDEFAULT == null ? blockDevicesAsList != null
					: !BLOCK_DEVICES_AS_LIST_EDEFAULT.equals(blockDevicesAsList);
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__INSTANCE_NAME:
			return INSTANCE_NAME_EDEFAULT == null ? instanceName != null : !INSTANCE_NAME_EDEFAULT.equals(instanceName);
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__KEY_NAME:
			return KEY_NAME_EDEFAULT == null ? keyName != null : !KEY_NAME_EDEFAULT.equals(keyName);
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__PRIVATE_IP_ADDRESS:
			return PRIVATE_IP_ADDRESS_EDEFAULT == null ? privateIpAddress != null
					: !PRIVATE_IP_ADDRESS_EDEFAULT.equals(privateIpAddress);
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_AS_REFERENCE:
			return RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_AS_REFERENCE_EDEFAULT == null
					? resourceSignalTimeoutWithDurationAsReference != null
					: !RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_AS_REFERENCE_EDEFAULT
							.equals(resourceSignalTimeoutWithDurationAsReference);
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__ROLE_WITH_IROLE_AS_REFERENCE:
			return ROLE_WITH_IROLE_AS_REFERENCE_EDEFAULT == null ? roleWithIRoleAsReference != null
					: !ROLE_WITH_IROLE_AS_REFERENCE_EDEFAULT.equals(roleWithIRoleAsReference);
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_AS_REFERENCE:
			return SECURITY_GROUP_WITH_ISECURITY_GROUP_AS_REFERENCE_EDEFAULT == null
					? securityGroupWithISecurityGroupAsReference != null
					: !SECURITY_GROUP_WITH_ISECURITY_GROUP_AS_REFERENCE_EDEFAULT
							.equals(securityGroupWithISecurityGroupAsReference);
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__SOURCE_DEST_CHECK:
			return SOURCE_DEST_CHECK_EDEFAULT == null ? sourceDestCheck != null
					: !SOURCE_DEST_CHECK_EDEFAULT.equals(sourceDestCheck);
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_AS_REFERENCE:
			return USER_DATA_WITH_USER_DATA_AS_REFERENCE_EDEFAULT == null ? userDataWithUserDataAsReference != null
					: !USER_DATA_WITH_USER_DATA_AS_REFERENCE_EDEFAULT.equals(userDataWithUserDataAsReference);
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__VPC_SUBNETS_WITH_SUBNET_SELECTION_AS_REFERENCE:
			return VPC_SUBNETS_WITH_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT == null
					? vpcSubnetsWithSubnetSelectionAsReference != null
					: !VPC_SUBNETS_WITH_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT
							.equals(vpcSubnetsWithSubnetSelectionAsReference);
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__ADDITIONAL_CODE:
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
		result.append(" (instanceTypeWithInstanceTypeAsReference: ");
		result.append(instanceTypeWithInstanceTypeAsReference);
		result.append(", machineImageWithIMachineImageAsReference: ");
		result.append(machineImageWithIMachineImageAsReference);
		result.append(", vpcWithIVpcAsReference: ");
		result.append(vpcWithIVpcAsReference);
		result.append(", allowAllOutbound: ");
		result.append(allowAllOutbound);
		result.append(", availabilityZone: ");
		result.append(availabilityZone);
		result.append(", blockDevicesAsList: ");
		result.append(blockDevicesAsList);
		result.append(", instanceName: ");
		result.append(instanceName);
		result.append(", keyName: ");
		result.append(keyName);
		result.append(", privateIpAddress: ");
		result.append(privateIpAddress);
		result.append(", resourceSignalTimeoutWithDurationAsReference: ");
		result.append(resourceSignalTimeoutWithDurationAsReference);
		result.append(", roleWithIRoleAsReference: ");
		result.append(roleWithIRoleAsReference);
		result.append(", securityGroupWithISecurityGroupAsReference: ");
		result.append(securityGroupWithISecurityGroupAsReference);
		result.append(", sourceDestCheck: ");
		result.append(sourceDestCheck);
		result.append(", userDataWithUserDataAsReference: ");
		result.append(userDataWithUserDataAsReference);
		result.append(", vpcSubnetsWithSubnetSelectionAsReference: ");
		result.append(vpcSubnetsWithSubnetSelectionAsReference);
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

} //InstanceBuilder_ec2Impl
