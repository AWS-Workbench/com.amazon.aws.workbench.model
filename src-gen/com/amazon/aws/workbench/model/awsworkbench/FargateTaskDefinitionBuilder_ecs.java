/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fargate Task Definition Builder ecs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FargateTaskDefinitionBuilder_ecs#getExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Execution Role With IRole software amazon awscdk services iam IRole As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FargateTaskDefinitionBuilder_ecs#getFamily_java_lang_String_ <em>Family java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FargateTaskDefinitionBuilder_ecs#getProxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference <em>Proxy Configuration With Proxy Configuration software amazon awscdk services ecs Proxy Configuration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FargateTaskDefinitionBuilder_ecs#getTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Task Role With IRole software amazon awscdk services iam IRole As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FargateTaskDefinitionBuilder_ecs#getVolumes_software_amazon_awscdk_services_ecs_Volume_AsList <em>Volumes software amazon awscdk services ecs Volume As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FargateTaskDefinitionBuilder_ecs#getCpu_java_lang_Number_ <em>Cpu java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FargateTaskDefinitionBuilder_ecs#getMemoryLimitMiB_java_lang_Number_ <em>Memory Limit Mi Bjava lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FargateTaskDefinitionBuilder_ecs#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FargateTaskDefinitionBuilder_ecs#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FargateTaskDefinitionBuilder_ecs#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FargateTaskDefinitionBuilder_ecs#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFargateTaskDefinitionBuilder_ecs()
 * @model
 * @generated
 */
public interface FargateTaskDefinitionBuilder_ecs extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Execution Role With IRole software amazon awscdk services iam IRole As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Role With IRole software amazon awscdk services iam IRole As Reference</em>' attribute.
	 * @see #setExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFargateTaskDefinitionBuilder_ecs_ExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @model
	 * @generated
	 */
	String getExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FargateTaskDefinitionBuilder_ecs#getExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Execution Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFargateTaskDefinitionBuilder_ecs_Family_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getFamily_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FargateTaskDefinitionBuilder_ecs#getFamily_java_lang_String_ <em>Family java lang String </em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFargateTaskDefinitionBuilder_ecs_ProxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference()
	 * @model
	 * @generated
	 */
	String getProxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FargateTaskDefinitionBuilder_ecs#getProxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference <em>Proxy Configuration With Proxy Configuration software amazon awscdk services ecs Proxy Configuration As Reference</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFargateTaskDefinitionBuilder_ecs_TaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @model
	 * @generated
	 */
	String getTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FargateTaskDefinitionBuilder_ecs#getTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Task Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFargateTaskDefinitionBuilder_ecs_Volumes_software_amazon_awscdk_services_ecs_Volume_AsList()
	 * @model
	 * @generated
	 */
	String getVolumes_software_amazon_awscdk_services_ecs_Volume_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FargateTaskDefinitionBuilder_ecs#getVolumes_software_amazon_awscdk_services_ecs_Volume_AsList <em>Volumes software amazon awscdk services ecs Volume As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volumes software amazon awscdk services ecs Volume As List</em>' attribute.
	 * @see #getVolumes_software_amazon_awscdk_services_ecs_Volume_AsList()
	 * @generated
	 */
	void setVolumes_software_amazon_awscdk_services_ecs_Volume_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Cpu java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu java lang Number </em>' attribute.
	 * @see #setCpu_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFargateTaskDefinitionBuilder_ecs_Cpu_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getCpu_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FargateTaskDefinitionBuilder_ecs#getCpu_java_lang_Number_ <em>Cpu java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu java lang Number </em>' attribute.
	 * @see #getCpu_java_lang_Number_()
	 * @generated
	 */
	void setCpu_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Memory Limit Mi Bjava lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Limit Mi Bjava lang Number </em>' attribute.
	 * @see #setMemoryLimitMiB_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFargateTaskDefinitionBuilder_ecs_MemoryLimitMiB_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getMemoryLimitMiB_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FargateTaskDefinitionBuilder_ecs#getMemoryLimitMiB_java_lang_Number_ <em>Memory Limit Mi Bjava lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Limit Mi Bjava lang Number </em>' attribute.
	 * @see #getMemoryLimitMiB_java_lang_Number_()
	 * @generated
	 */
	void setMemoryLimitMiB_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ecs.FargateTaskDefinition"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFargateTaskDefinitionBuilder_ecs_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ecs.FargateTaskDefinition" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFargateTaskDefinitionBuilder_ecs_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FargateTaskDefinitionBuilder_ecs#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFargateTaskDefinitionBuilder_ecs_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FargateTaskDefinitionBuilder_ecs#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFargateTaskDefinitionBuilder_ecs_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FargateTaskDefinitionBuilder_ecs#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // FargateTaskDefinitionBuilder_ecs
