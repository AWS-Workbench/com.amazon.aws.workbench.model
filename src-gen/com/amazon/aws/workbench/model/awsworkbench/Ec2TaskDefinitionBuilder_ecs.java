/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ec2 Task Definition Builder ecs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.Ec2TaskDefinitionBuilder_ecs#getExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Execution Role With IRole software amazon awscdk services iam IRole As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.Ec2TaskDefinitionBuilder_ecs#getFamily_java_lang_String_ <em>Family java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.Ec2TaskDefinitionBuilder_ecs#getProxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference <em>Proxy Configuration With Proxy Configuration software amazon awscdk services ecs Proxy Configuration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.Ec2TaskDefinitionBuilder_ecs#getTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Task Role With IRole software amazon awscdk services iam IRole As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.Ec2TaskDefinitionBuilder_ecs#getVolumes_software_amazon_awscdk_services_ecs_Volume_AsList <em>Volumes software amazon awscdk services ecs Volume As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.Ec2TaskDefinitionBuilder_ecs#getIpcMode_software_amazon_awscdk_services_ecs_IpcMode_ <em>Ipc Mode software amazon awscdk services ecs Ipc Mode </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.Ec2TaskDefinitionBuilder_ecs#getNetworkMode_software_amazon_awscdk_services_ecs_NetworkMode_ <em>Network Mode software amazon awscdk services ecs Network Mode </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.Ec2TaskDefinitionBuilder_ecs#getPidMode_software_amazon_awscdk_services_ecs_PidMode_ <em>Pid Mode software amazon awscdk services ecs Pid Mode </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.Ec2TaskDefinitionBuilder_ecs#getPlacementConstraints_software_amazon_awscdk_services_ecs_PlacementConstraint_AsList <em>Placement Constraints software amazon awscdk services ecs Placement Constraint As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.Ec2TaskDefinitionBuilder_ecs#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.Ec2TaskDefinitionBuilder_ecs#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.Ec2TaskDefinitionBuilder_ecs#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.Ec2TaskDefinitionBuilder_ecs#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getEc2TaskDefinitionBuilder_ecs()
 * @model
 * @generated
 */
public interface Ec2TaskDefinitionBuilder_ecs extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Execution Role With IRole software amazon awscdk services iam IRole As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Role With IRole software amazon awscdk services iam IRole As Reference</em>' attribute.
	 * @see #setExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getEc2TaskDefinitionBuilder_ecs_ExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @model
	 * @generated
	 */
	String getExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.Ec2TaskDefinitionBuilder_ecs#getExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Execution Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Role With IRole software amazon awscdk services iam IRole As Reference</em>' attribute.
	 * @see #getExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 */
	void setExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Family java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family java lang String </em>' attribute.
	 * @see #setFamily_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getEc2TaskDefinitionBuilder_ecs_Family_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getFamily_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.Ec2TaskDefinitionBuilder_ecs#getFamily_java_lang_String_ <em>Family java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family java lang String </em>' attribute.
	 * @see #getFamily_java_lang_String_()
	 * @generated
	 */
	void setFamily_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Proxy Configuration With Proxy Configuration software amazon awscdk services ecs Proxy Configuration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Configuration With Proxy Configuration software amazon awscdk services ecs Proxy Configuration As Reference</em>' attribute.
	 * @see #setProxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getEc2TaskDefinitionBuilder_ecs_ProxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference()
	 * @model
	 * @generated
	 */
	String getProxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.Ec2TaskDefinitionBuilder_ecs#getProxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference <em>Proxy Configuration With Proxy Configuration software amazon awscdk services ecs Proxy Configuration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy Configuration With Proxy Configuration software amazon awscdk services ecs Proxy Configuration As Reference</em>' attribute.
	 * @see #getProxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference()
	 * @generated
	 */
	void setProxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Task Role With IRole software amazon awscdk services iam IRole As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Role With IRole software amazon awscdk services iam IRole As Reference</em>' attribute.
	 * @see #setTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getEc2TaskDefinitionBuilder_ecs_TaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @model
	 * @generated
	 */
	String getTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.Ec2TaskDefinitionBuilder_ecs#getTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Task Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Role With IRole software amazon awscdk services iam IRole As Reference</em>' attribute.
	 * @see #getTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 */
	void setTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Volumes software amazon awscdk services ecs Volume As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volumes software amazon awscdk services ecs Volume As List</em>' attribute.
	 * @see #setVolumes_software_amazon_awscdk_services_ecs_Volume_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getEc2TaskDefinitionBuilder_ecs_Volumes_software_amazon_awscdk_services_ecs_Volume_AsList()
	 * @model
	 * @generated
	 */
	String getVolumes_software_amazon_awscdk_services_ecs_Volume_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.Ec2TaskDefinitionBuilder_ecs#getVolumes_software_amazon_awscdk_services_ecs_Volume_AsList <em>Volumes software amazon awscdk services ecs Volume As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volumes software amazon awscdk services ecs Volume As List</em>' attribute.
	 * @see #getVolumes_software_amazon_awscdk_services_ecs_Volume_AsList()
	 * @generated
	 */
	void setVolumes_software_amazon_awscdk_services_ecs_Volume_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Ipc Mode software amazon awscdk services ecs Ipc Mode </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.IpcMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ipc Mode software amazon awscdk services ecs Ipc Mode </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.IpcMode
	 * @see #setIpcMode_software_amazon_awscdk_services_ecs_IpcMode_(IpcMode)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getEc2TaskDefinitionBuilder_ecs_IpcMode_software_amazon_awscdk_services_ecs_IpcMode_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.IpcMode"
	 * @generated
	 */
	IpcMode getIpcMode_software_amazon_awscdk_services_ecs_IpcMode_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.Ec2TaskDefinitionBuilder_ecs#getIpcMode_software_amazon_awscdk_services_ecs_IpcMode_ <em>Ipc Mode software amazon awscdk services ecs Ipc Mode </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ipc Mode software amazon awscdk services ecs Ipc Mode </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.IpcMode
	 * @see #getIpcMode_software_amazon_awscdk_services_ecs_IpcMode_()
	 * @generated
	 */
	void setIpcMode_software_amazon_awscdk_services_ecs_IpcMode_(IpcMode value);

	/**
	 * Returns the value of the '<em><b>Network Mode software amazon awscdk services ecs Network Mode </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.NetworkMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Mode software amazon awscdk services ecs Network Mode </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.NetworkMode
	 * @see #setNetworkMode_software_amazon_awscdk_services_ecs_NetworkMode_(NetworkMode)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getEc2TaskDefinitionBuilder_ecs_NetworkMode_software_amazon_awscdk_services_ecs_NetworkMode_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.NetworkMode"
	 * @generated
	 */
	NetworkMode getNetworkMode_software_amazon_awscdk_services_ecs_NetworkMode_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.Ec2TaskDefinitionBuilder_ecs#getNetworkMode_software_amazon_awscdk_services_ecs_NetworkMode_ <em>Network Mode software amazon awscdk services ecs Network Mode </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Mode software amazon awscdk services ecs Network Mode </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.NetworkMode
	 * @see #getNetworkMode_software_amazon_awscdk_services_ecs_NetworkMode_()
	 * @generated
	 */
	void setNetworkMode_software_amazon_awscdk_services_ecs_NetworkMode_(NetworkMode value);

	/**
	 * Returns the value of the '<em><b>Pid Mode software amazon awscdk services ecs Pid Mode </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.PidMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pid Mode software amazon awscdk services ecs Pid Mode </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PidMode
	 * @see #setPidMode_software_amazon_awscdk_services_ecs_PidMode_(PidMode)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getEc2TaskDefinitionBuilder_ecs_PidMode_software_amazon_awscdk_services_ecs_PidMode_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.PidMode"
	 * @generated
	 */
	PidMode getPidMode_software_amazon_awscdk_services_ecs_PidMode_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.Ec2TaskDefinitionBuilder_ecs#getPidMode_software_amazon_awscdk_services_ecs_PidMode_ <em>Pid Mode software amazon awscdk services ecs Pid Mode </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pid Mode software amazon awscdk services ecs Pid Mode </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PidMode
	 * @see #getPidMode_software_amazon_awscdk_services_ecs_PidMode_()
	 * @generated
	 */
	void setPidMode_software_amazon_awscdk_services_ecs_PidMode_(PidMode value);

	/**
	 * Returns the value of the '<em><b>Placement Constraints software amazon awscdk services ecs Placement Constraint As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement Constraints software amazon awscdk services ecs Placement Constraint As List</em>' attribute.
	 * @see #setPlacementConstraints_software_amazon_awscdk_services_ecs_PlacementConstraint_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getEc2TaskDefinitionBuilder_ecs_PlacementConstraints_software_amazon_awscdk_services_ecs_PlacementConstraint_AsList()
	 * @model
	 * @generated
	 */
	String getPlacementConstraints_software_amazon_awscdk_services_ecs_PlacementConstraint_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.Ec2TaskDefinitionBuilder_ecs#getPlacementConstraints_software_amazon_awscdk_services_ecs_PlacementConstraint_AsList <em>Placement Constraints software amazon awscdk services ecs Placement Constraint As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement Constraints software amazon awscdk services ecs Placement Constraint As List</em>' attribute.
	 * @see #getPlacementConstraints_software_amazon_awscdk_services_ecs_PlacementConstraint_AsList()
	 * @generated
	 */
	void setPlacementConstraints_software_amazon_awscdk_services_ecs_PlacementConstraint_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ecs.Ec2TaskDefinition"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getEc2TaskDefinitionBuilder_ecs_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ecs.Ec2TaskDefinition" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getEc2TaskDefinitionBuilder_ecs_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.Ec2TaskDefinitionBuilder_ecs#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getEc2TaskDefinitionBuilder_ecs_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.Ec2TaskDefinitionBuilder_ecs#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getEc2TaskDefinitionBuilder_ecs_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.Ec2TaskDefinitionBuilder_ecs#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // Ec2TaskDefinitionBuilder_ecs
