/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getInstanceTypeWithInstanceTypeAsReference <em>Instance Type With Instance Type As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getMachineImageWithIMachineImageAsReference <em>Machine Image With IMachine Image As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getVpcWithIVpcAsReference <em>Vpc With IVpc As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getAllowAllOutbound <em>Allow All Outbound</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getAvailabilityZone <em>Availability Zone</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getBlockDevicesAsList <em>Block Devices As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getInstanceName <em>Instance Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getKeyName <em>Key Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getPrivateIpAddress <em>Private Ip Address</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getResourceSignalTimeoutWithDurationAsReference <em>Resource Signal Timeout With Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getRoleWithIRoleAsReference <em>Role With IRole As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getSecurityGroupWithISecurityGroupAsReference <em>Security Group With ISecurity Group As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getSourceDestCheck <em>Source Dest Check</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getUserDataWithUserDataAsReference <em>User Data With User Data As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getVpcSubnetsWithSubnetSelectionAsReference <em>Vpc Subnets With Subnet Selection As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getInstanceBuilder_ec2()
 * @model
 * @generated
 */
public interface InstanceBuilder_ec2 extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Instance Type With Instance Type As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Type With Instance Type As Reference</em>' attribute.
	 * @see #setInstanceTypeWithInstanceTypeAsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getInstanceBuilder_ec2_InstanceTypeWithInstanceTypeAsReference()
	 * @model
	 * @generated
	 */
	String getInstanceTypeWithInstanceTypeAsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getInstanceTypeWithInstanceTypeAsReference <em>Instance Type With Instance Type As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Type With Instance Type As Reference</em>' attribute.
	 * @see #getInstanceTypeWithInstanceTypeAsReference()
	 * @generated
	 */
	void setInstanceTypeWithInstanceTypeAsReference(String value);

	/**
	 * Returns the value of the '<em><b>Machine Image With IMachine Image As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Image With IMachine Image As Reference</em>' attribute.
	 * @see #setMachineImageWithIMachineImageAsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getInstanceBuilder_ec2_MachineImageWithIMachineImageAsReference()
	 * @model
	 * @generated
	 */
	String getMachineImageWithIMachineImageAsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getMachineImageWithIMachineImageAsReference <em>Machine Image With IMachine Image As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machine Image With IMachine Image As Reference</em>' attribute.
	 * @see #getMachineImageWithIMachineImageAsReference()
	 * @generated
	 */
	void setMachineImageWithIMachineImageAsReference(String value);

	/**
	 * Returns the value of the '<em><b>Vpc With IVpc As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc With IVpc As Reference</em>' attribute.
	 * @see #setVpcWithIVpcAsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getInstanceBuilder_ec2_VpcWithIVpcAsReference()
	 * @model
	 * @generated
	 */
	String getVpcWithIVpcAsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getVpcWithIVpcAsReference <em>Vpc With IVpc As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc With IVpc As Reference</em>' attribute.
	 * @see #getVpcWithIVpcAsReference()
	 * @generated
	 */
	void setVpcWithIVpcAsReference(String value);

	/**
	 * Returns the value of the '<em><b>Allow All Outbound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow All Outbound</em>' attribute.
	 * @see #setAllowAllOutbound(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getInstanceBuilder_ec2_AllowAllOutbound()
	 * @model
	 * @generated
	 */
	Boolean getAllowAllOutbound();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getAllowAllOutbound <em>Allow All Outbound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow All Outbound</em>' attribute.
	 * @see #getAllowAllOutbound()
	 * @generated
	 */
	void setAllowAllOutbound(Boolean value);

	/**
	 * Returns the value of the '<em><b>Availability Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability Zone</em>' attribute.
	 * @see #setAvailabilityZone(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getInstanceBuilder_ec2_AvailabilityZone()
	 * @model
	 * @generated
	 */
	String getAvailabilityZone();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getAvailabilityZone <em>Availability Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability Zone</em>' attribute.
	 * @see #getAvailabilityZone()
	 * @generated
	 */
	void setAvailabilityZone(String value);

	/**
	 * Returns the value of the '<em><b>Block Devices As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Devices As List</em>' attribute.
	 * @see #setBlockDevicesAsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getInstanceBuilder_ec2_BlockDevicesAsList()
	 * @model
	 * @generated
	 */
	String getBlockDevicesAsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getBlockDevicesAsList <em>Block Devices As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Devices As List</em>' attribute.
	 * @see #getBlockDevicesAsList()
	 * @generated
	 */
	void setBlockDevicesAsList(String value);

	/**
	 * Returns the value of the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Name</em>' attribute.
	 * @see #setInstanceName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getInstanceBuilder_ec2_InstanceName()
	 * @model
	 * @generated
	 */
	String getInstanceName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getInstanceName <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Name</em>' attribute.
	 * @see #getInstanceName()
	 * @generated
	 */
	void setInstanceName(String value);

	/**
	 * Returns the value of the '<em><b>Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Name</em>' attribute.
	 * @see #setKeyName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getInstanceBuilder_ec2_KeyName()
	 * @model
	 * @generated
	 */
	String getKeyName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getKeyName <em>Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Name</em>' attribute.
	 * @see #getKeyName()
	 * @generated
	 */
	void setKeyName(String value);

	/**
	 * Returns the value of the '<em><b>Private Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private Ip Address</em>' attribute.
	 * @see #setPrivateIpAddress(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getInstanceBuilder_ec2_PrivateIpAddress()
	 * @model
	 * @generated
	 */
	String getPrivateIpAddress();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getPrivateIpAddress <em>Private Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Ip Address</em>' attribute.
	 * @see #getPrivateIpAddress()
	 * @generated
	 */
	void setPrivateIpAddress(String value);

	/**
	 * Returns the value of the '<em><b>Resource Signal Timeout With Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Signal Timeout With Duration As Reference</em>' attribute.
	 * @see #setResourceSignalTimeoutWithDurationAsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getInstanceBuilder_ec2_ResourceSignalTimeoutWithDurationAsReference()
	 * @model
	 * @generated
	 */
	String getResourceSignalTimeoutWithDurationAsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getResourceSignalTimeoutWithDurationAsReference <em>Resource Signal Timeout With Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Signal Timeout With Duration As Reference</em>' attribute.
	 * @see #getResourceSignalTimeoutWithDurationAsReference()
	 * @generated
	 */
	void setResourceSignalTimeoutWithDurationAsReference(String value);

	/**
	 * Returns the value of the '<em><b>Role With IRole As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role With IRole As Reference</em>' attribute.
	 * @see #setRoleWithIRoleAsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getInstanceBuilder_ec2_RoleWithIRoleAsReference()
	 * @model
	 * @generated
	 */
	String getRoleWithIRoleAsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getRoleWithIRoleAsReference <em>Role With IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role With IRole As Reference</em>' attribute.
	 * @see #getRoleWithIRoleAsReference()
	 * @generated
	 */
	void setRoleWithIRoleAsReference(String value);

	/**
	 * Returns the value of the '<em><b>Security Group With ISecurity Group As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Group With ISecurity Group As Reference</em>' attribute.
	 * @see #setSecurityGroupWithISecurityGroupAsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getInstanceBuilder_ec2_SecurityGroupWithISecurityGroupAsReference()
	 * @model
	 * @generated
	 */
	String getSecurityGroupWithISecurityGroupAsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getSecurityGroupWithISecurityGroupAsReference <em>Security Group With ISecurity Group As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Group With ISecurity Group As Reference</em>' attribute.
	 * @see #getSecurityGroupWithISecurityGroupAsReference()
	 * @generated
	 */
	void setSecurityGroupWithISecurityGroupAsReference(String value);

	/**
	 * Returns the value of the '<em><b>Source Dest Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Dest Check</em>' attribute.
	 * @see #setSourceDestCheck(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getInstanceBuilder_ec2_SourceDestCheck()
	 * @model
	 * @generated
	 */
	Boolean getSourceDestCheck();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getSourceDestCheck <em>Source Dest Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Dest Check</em>' attribute.
	 * @see #getSourceDestCheck()
	 * @generated
	 */
	void setSourceDestCheck(Boolean value);

	/**
	 * Returns the value of the '<em><b>User Data With User Data As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Data With User Data As Reference</em>' attribute.
	 * @see #setUserDataWithUserDataAsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getInstanceBuilder_ec2_UserDataWithUserDataAsReference()
	 * @model
	 * @generated
	 */
	String getUserDataWithUserDataAsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getUserDataWithUserDataAsReference <em>User Data With User Data As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Data With User Data As Reference</em>' attribute.
	 * @see #getUserDataWithUserDataAsReference()
	 * @generated
	 */
	void setUserDataWithUserDataAsReference(String value);

	/**
	 * Returns the value of the '<em><b>Vpc Subnets With Subnet Selection As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc Subnets With Subnet Selection As Reference</em>' attribute.
	 * @see #setVpcSubnetsWithSubnetSelectionAsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getInstanceBuilder_ec2_VpcSubnetsWithSubnetSelectionAsReference()
	 * @model
	 * @generated
	 */
	String getVpcSubnetsWithSubnetSelectionAsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getVpcSubnetsWithSubnetSelectionAsReference <em>Vpc Subnets With Subnet Selection As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc Subnets With Subnet Selection As Reference</em>' attribute.
	 * @see #getVpcSubnetsWithSubnetSelectionAsReference()
	 * @generated
	 */
	void setVpcSubnetsWithSubnetSelectionAsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ec2.Instance"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getInstanceBuilder_ec2_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ec2.Instance" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getInstanceBuilder_ec2_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getVarName <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Name</em>' attribute.
	 * @see #getVarName()
	 * @generated
	 */
	void setVarName(String value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getInstanceBuilder_ec2_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Code</em>' attribute.
	 * @see #setAdditionalCode(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getInstanceBuilder_ec2_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // InstanceBuilder_ec2
