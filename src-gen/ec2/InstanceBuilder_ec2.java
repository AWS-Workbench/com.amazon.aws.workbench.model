/**
 */
package ec2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ec2.InstanceBuilder_ec2#getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference <em>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</em>}</li>
 *   <li>{@link ec2.InstanceBuilder_ec2#getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference <em>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</em>}</li>
 *   <li>{@link ec2.InstanceBuilder_ec2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}</li>
 *   <li>{@link ec2.InstanceBuilder_ec2#getAllowAllOutbound_java_lang_Boolean_ <em>Allow All Outbound java lang Boolean </em>}</li>
 *   <li>{@link ec2.InstanceBuilder_ec2#getAvailabilityZone_java_lang_String_ <em>Availability Zone java lang String </em>}</li>
 *   <li>{@link ec2.InstanceBuilder_ec2#getBlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList <em>Block Devices software amazon awscdk services ec2 Block Device As List</em>}</li>
 *   <li>{@link ec2.InstanceBuilder_ec2#getInstanceName_java_lang_String_ <em>Instance Name java lang String </em>}</li>
 *   <li>{@link ec2.InstanceBuilder_ec2#getKeyName_java_lang_String_ <em>Key Name java lang String </em>}</li>
 *   <li>{@link ec2.InstanceBuilder_ec2#getPrivateIpAddress_java_lang_String_ <em>Private Ip Address java lang String </em>}</li>
 *   <li>{@link ec2.InstanceBuilder_ec2#getResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Resource Signal Timeout With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link ec2.InstanceBuilder_ec2#getRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Role With IRole software amazon awscdk services iam IRole As Reference</em>}</li>
 *   <li>{@link ec2.InstanceBuilder_ec2#getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference <em>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</em>}</li>
 *   <li>{@link ec2.InstanceBuilder_ec2#getSourceDestCheck_java_lang_Boolean_ <em>Source Dest Check java lang Boolean </em>}</li>
 *   <li>{@link ec2.InstanceBuilder_ec2#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference <em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>}</li>
 *   <li>{@link ec2.InstanceBuilder_ec2#getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}</li>
 *   <li>{@link ec2.InstanceBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.InstanceBuilder_ec2#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.InstanceBuilder_ec2#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.InstanceBuilder_ec2#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see ec2.Ec2Package#getInstanceBuilder_ec2()
 * @model
 * @generated
 */
public interface InstanceBuilder_ec2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</em>' attribute.
	 * @see #setInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference(String)
	 * @see ec2.Ec2Package#getInstanceBuilder_ec2_InstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference()
	 * @model
	 * @generated
	 */
	String getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference();

	/**
	 * Sets the value of the '{@link ec2.InstanceBuilder_ec2#getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference <em>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</em>' attribute.
	 * @see #getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference()
	 * @generated
	 */
	void setInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</em>' attribute.
	 * @see #setMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference(String)
	 * @see ec2.Ec2Package#getInstanceBuilder_ec2_MachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference()
	 * @model
	 * @generated
	 */
	String getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference();

	/**
	 * Sets the value of the '{@link ec2.InstanceBuilder_ec2#getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference <em>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</em>' attribute.
	 * @see #getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference()
	 * @generated
	 */
	void setMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>' attribute.
	 * @see #setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(String)
	 * @see ec2.Ec2Package#getInstanceBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @model
	 * @generated
	 */
	String getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

	/**
	 * Sets the value of the '{@link ec2.InstanceBuilder_ec2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>' attribute.
	 * @see #getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @generated
	 */
	void setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Allow All Outbound java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow All Outbound java lang Boolean </em>' attribute.
	 * @see #setAllowAllOutbound_java_lang_Boolean_(Boolean)
	 * @see ec2.Ec2Package#getInstanceBuilder_ec2_AllowAllOutbound_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getAllowAllOutbound_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link ec2.InstanceBuilder_ec2#getAllowAllOutbound_java_lang_Boolean_ <em>Allow All Outbound java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow All Outbound java lang Boolean </em>' attribute.
	 * @see #getAllowAllOutbound_java_lang_Boolean_()
	 * @generated
	 */
	void setAllowAllOutbound_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Availability Zone java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability Zone java lang String </em>' attribute.
	 * @see #setAvailabilityZone_java_lang_String_(String)
	 * @see ec2.Ec2Package#getInstanceBuilder_ec2_AvailabilityZone_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getAvailabilityZone_java_lang_String_();

	/**
	 * Sets the value of the '{@link ec2.InstanceBuilder_ec2#getAvailabilityZone_java_lang_String_ <em>Availability Zone java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability Zone java lang String </em>' attribute.
	 * @see #getAvailabilityZone_java_lang_String_()
	 * @generated
	 */
	void setAvailabilityZone_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Block Devices software amazon awscdk services ec2 Block Device As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Devices software amazon awscdk services ec2 Block Device As List</em>' attribute.
	 * @see #setBlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList(String)
	 * @see ec2.Ec2Package#getInstanceBuilder_ec2_BlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList()
	 * @model
	 * @generated
	 */
	String getBlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList();

	/**
	 * Sets the value of the '{@link ec2.InstanceBuilder_ec2#getBlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList <em>Block Devices software amazon awscdk services ec2 Block Device As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Devices software amazon awscdk services ec2 Block Device As List</em>' attribute.
	 * @see #getBlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList()
	 * @generated
	 */
	void setBlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Instance Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Name java lang String </em>' attribute.
	 * @see #setInstanceName_java_lang_String_(String)
	 * @see ec2.Ec2Package#getInstanceBuilder_ec2_InstanceName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getInstanceName_java_lang_String_();

	/**
	 * Sets the value of the '{@link ec2.InstanceBuilder_ec2#getInstanceName_java_lang_String_ <em>Instance Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Name java lang String </em>' attribute.
	 * @see #getInstanceName_java_lang_String_()
	 * @generated
	 */
	void setInstanceName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Key Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Name java lang String </em>' attribute.
	 * @see #setKeyName_java_lang_String_(String)
	 * @see ec2.Ec2Package#getInstanceBuilder_ec2_KeyName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getKeyName_java_lang_String_();

	/**
	 * Sets the value of the '{@link ec2.InstanceBuilder_ec2#getKeyName_java_lang_String_ <em>Key Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Name java lang String </em>' attribute.
	 * @see #getKeyName_java_lang_String_()
	 * @generated
	 */
	void setKeyName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Private Ip Address java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private Ip Address java lang String </em>' attribute.
	 * @see #setPrivateIpAddress_java_lang_String_(String)
	 * @see ec2.Ec2Package#getInstanceBuilder_ec2_PrivateIpAddress_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getPrivateIpAddress_java_lang_String_();

	/**
	 * Sets the value of the '{@link ec2.InstanceBuilder_ec2#getPrivateIpAddress_java_lang_String_ <em>Private Ip Address java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Ip Address java lang String </em>' attribute.
	 * @see #getPrivateIpAddress_java_lang_String_()
	 * @generated
	 */
	void setPrivateIpAddress_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Resource Signal Timeout With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Signal Timeout With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see ec2.Ec2Package#getInstanceBuilder_ec2_ResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link ec2.InstanceBuilder_ec2#getResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Resource Signal Timeout With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Signal Timeout With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Role With IRole software amazon awscdk services iam IRole As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role With IRole software amazon awscdk services iam IRole As Reference</em>' attribute.
	 * @see #setRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(String)
	 * @see ec2.Ec2Package#getInstanceBuilder_ec2_RoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @model
	 * @generated
	 */
	String getRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();

	/**
	 * Sets the value of the '{@link ec2.InstanceBuilder_ec2#getRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role With IRole software amazon awscdk services iam IRole As Reference</em>' attribute.
	 * @see #getRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 */
	void setRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</em>' attribute.
	 * @see #setSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference(String)
	 * @see ec2.Ec2Package#getInstanceBuilder_ec2_SecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference()
	 * @model
	 * @generated
	 */
	String getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference();

	/**
	 * Sets the value of the '{@link ec2.InstanceBuilder_ec2#getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference <em>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</em>' attribute.
	 * @see #getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference()
	 * @generated
	 */
	void setSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Source Dest Check java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Dest Check java lang Boolean </em>' attribute.
	 * @see #setSourceDestCheck_java_lang_Boolean_(Boolean)
	 * @see ec2.Ec2Package#getInstanceBuilder_ec2_SourceDestCheck_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getSourceDestCheck_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link ec2.InstanceBuilder_ec2#getSourceDestCheck_java_lang_Boolean_ <em>Source Dest Check java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Dest Check java lang Boolean </em>' attribute.
	 * @see #getSourceDestCheck_java_lang_Boolean_()
	 * @generated
	 */
	void setSourceDestCheck_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>User Data With User Data software amazon awscdk services ec2 User Data As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>' attribute.
	 * @see #setUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference(String)
	 * @see ec2.Ec2Package#getInstanceBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference()
	 * @model
	 * @generated
	 */
	String getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference();

	/**
	 * Sets the value of the '{@link ec2.InstanceBuilder_ec2#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference <em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>' attribute.
	 * @see #getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference()
	 * @generated
	 */
	void setUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>' attribute.
	 * @see #setVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(String)
	 * @see ec2.Ec2Package#getInstanceBuilder_ec2_VpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @model
	 * @generated
	 */
	String getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();

	/**
	 * Sets the value of the '{@link ec2.InstanceBuilder_ec2#getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>' attribute.
	 * @see #getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @generated
	 */
	void setVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ec2.Instance"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see ec2.Ec2Package#getInstanceBuilder_ec2_GeneratedClassName()
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
	 * @see ec2.Ec2Package#getInstanceBuilder_ec2_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link ec2.InstanceBuilder_ec2#getVarName <em>Var Name</em>}' attribute.
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
	 * @see ec2.Ec2Package#getInstanceBuilder_ec2_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link ec2.InstanceBuilder_ec2#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see ec2.Ec2Package#getInstanceBuilder_ec2_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link ec2.InstanceBuilder_ec2#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // InstanceBuilder_ec2
