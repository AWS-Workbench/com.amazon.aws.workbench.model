/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Load Balanced Task Image Props Builder patterns</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedTaskImagePropsBuilder_patterns#getImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference <em>Image With Container Image software amazon awscdk services ecs Container Image As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedTaskImagePropsBuilder_patterns#getContainerName_java_lang_String_ <em>Container Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedTaskImagePropsBuilder_patterns#getContainerPorts_java_lang_Number_AsList <em>Container Ports java lang Number As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedTaskImagePropsBuilder_patterns#getEnableLogging_java_lang_Boolean_ <em>Enable Logging java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedTaskImagePropsBuilder_patterns#getEnvironment_java_lang_String__java_lang_String_AsMap <em>Environment java lang String java lang String As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedTaskImagePropsBuilder_patterns#getExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Execution Role With IRole software amazon awscdk services iam IRole As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedTaskImagePropsBuilder_patterns#getFamily_java_lang_String_ <em>Family java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedTaskImagePropsBuilder_patterns#getLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference <em>Log Driver With Log Driver software amazon awscdk services ecs Log Driver As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedTaskImagePropsBuilder_patterns#getSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap <em>Secrets java lang String software amazon awscdk services ecs Secret As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedTaskImagePropsBuilder_patterns#getTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Task Role With IRole software amazon awscdk services iam IRole As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedTaskImagePropsBuilder_patterns#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedTaskImagePropsBuilder_patterns#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedTaskImagePropsBuilder_patterns#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedTaskImagePropsBuilder_patterns#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getNetworkLoadBalancedTaskImagePropsBuilder_patterns()
 * @model
 * @generated
 */
public interface NetworkLoadBalancedTaskImagePropsBuilder_patterns extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Image With Container Image software amazon awscdk services ecs Container Image As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image With Container Image software amazon awscdk services ecs Container Image As Reference</em>' attribute.
	 * @see #setImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getNetworkLoadBalancedTaskImagePropsBuilder_patterns_ImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference()
	 * @model
	 * @generated
	 */
	String getImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedTaskImagePropsBuilder_patterns#getImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference <em>Image With Container Image software amazon awscdk services ecs Container Image As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image With Container Image software amazon awscdk services ecs Container Image As Reference</em>' attribute.
	 * @see #getImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference()
	 * @generated
	 */
	void setImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Container Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Name java lang String </em>' attribute.
	 * @see #setContainerName_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getNetworkLoadBalancedTaskImagePropsBuilder_patterns_ContainerName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getContainerName_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedTaskImagePropsBuilder_patterns#getContainerName_java_lang_String_ <em>Container Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Name java lang String </em>' attribute.
	 * @see #getContainerName_java_lang_String_()
	 * @generated
	 */
	void setContainerName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Container Ports java lang Number As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Ports java lang Number As List</em>' attribute.
	 * @see #setContainerPorts_java_lang_Number_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getNetworkLoadBalancedTaskImagePropsBuilder_patterns_ContainerPorts_java_lang_Number_AsList()
	 * @model
	 * @generated
	 */
	String getContainerPorts_java_lang_Number_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedTaskImagePropsBuilder_patterns#getContainerPorts_java_lang_Number_AsList <em>Container Ports java lang Number As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Ports java lang Number As List</em>' attribute.
	 * @see #getContainerPorts_java_lang_Number_AsList()
	 * @generated
	 */
	void setContainerPorts_java_lang_Number_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Enable Logging java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Logging java lang Boolean </em>' attribute.
	 * @see #setEnableLogging_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getNetworkLoadBalancedTaskImagePropsBuilder_patterns_EnableLogging_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getEnableLogging_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedTaskImagePropsBuilder_patterns#getEnableLogging_java_lang_Boolean_ <em>Enable Logging java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Logging java lang Boolean </em>' attribute.
	 * @see #getEnableLogging_java_lang_Boolean_()
	 * @generated
	 */
	void setEnableLogging_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Environment java lang String java lang String As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment java lang String java lang String As Map</em>' attribute.
	 * @see #setEnvironment_java_lang_String__java_lang_String_AsMap(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getNetworkLoadBalancedTaskImagePropsBuilder_patterns_Environment_java_lang_String__java_lang_String_AsMap()
	 * @model
	 * @generated
	 */
	String getEnvironment_java_lang_String__java_lang_String_AsMap();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedTaskImagePropsBuilder_patterns#getEnvironment_java_lang_String__java_lang_String_AsMap <em>Environment java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment java lang String java lang String As Map</em>' attribute.
	 * @see #getEnvironment_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 */
	void setEnvironment_java_lang_String__java_lang_String_AsMap(String value);

	/**
	 * Returns the value of the '<em><b>Execution Role With IRole software amazon awscdk services iam IRole As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Role With IRole software amazon awscdk services iam IRole As Reference</em>' attribute.
	 * @see #setExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getNetworkLoadBalancedTaskImagePropsBuilder_patterns_ExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @model
	 * @generated
	 */
	String getExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedTaskImagePropsBuilder_patterns#getExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Execution Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getNetworkLoadBalancedTaskImagePropsBuilder_patterns_Family_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getFamily_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedTaskImagePropsBuilder_patterns#getFamily_java_lang_String_ <em>Family java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family java lang String </em>' attribute.
	 * @see #getFamily_java_lang_String_()
	 * @generated
	 */
	void setFamily_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Log Driver With Log Driver software amazon awscdk services ecs Log Driver As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Driver With Log Driver software amazon awscdk services ecs Log Driver As Reference</em>' attribute.
	 * @see #setLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getNetworkLoadBalancedTaskImagePropsBuilder_patterns_LogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference()
	 * @model
	 * @generated
	 */
	String getLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedTaskImagePropsBuilder_patterns#getLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference <em>Log Driver With Log Driver software amazon awscdk services ecs Log Driver As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Driver With Log Driver software amazon awscdk services ecs Log Driver As Reference</em>' attribute.
	 * @see #getLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference()
	 * @generated
	 */
	void setLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Secrets java lang String software amazon awscdk services ecs Secret As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets java lang String software amazon awscdk services ecs Secret As Map</em>' attribute.
	 * @see #setSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getNetworkLoadBalancedTaskImagePropsBuilder_patterns_Secrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap()
	 * @model
	 * @generated
	 */
	String getSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedTaskImagePropsBuilder_patterns#getSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap <em>Secrets java lang String software amazon awscdk services ecs Secret As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secrets java lang String software amazon awscdk services ecs Secret As Map</em>' attribute.
	 * @see #getSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap()
	 * @generated
	 */
	void setSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap(String value);

	/**
	 * Returns the value of the '<em><b>Task Role With IRole software amazon awscdk services iam IRole As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Role With IRole software amazon awscdk services iam IRole As Reference</em>' attribute.
	 * @see #setTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getNetworkLoadBalancedTaskImagePropsBuilder_patterns_TaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @model
	 * @generated
	 */
	String getTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedTaskImagePropsBuilder_patterns#getTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Task Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Role With IRole software amazon awscdk services iam IRole As Reference</em>' attribute.
	 * @see #getTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 */
	void setTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageProps"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getNetworkLoadBalancedTaskImagePropsBuilder_patterns_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageProps" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getNetworkLoadBalancedTaskImagePropsBuilder_patterns_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedTaskImagePropsBuilder_patterns#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getNetworkLoadBalancedTaskImagePropsBuilder_patterns_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedTaskImagePropsBuilder_patterns#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getNetworkLoadBalancedTaskImagePropsBuilder_patterns_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedTaskImagePropsBuilder_patterns#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // NetworkLoadBalancedTaskImagePropsBuilder_patterns
