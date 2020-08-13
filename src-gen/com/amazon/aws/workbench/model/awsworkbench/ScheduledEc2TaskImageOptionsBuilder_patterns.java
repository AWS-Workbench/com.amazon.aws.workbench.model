/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduled Ec2 Task Image Options Builder patterns</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledEc2TaskImageOptionsBuilder_patterns#getCpu_java_lang_Number_ <em>Cpu java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledEc2TaskImageOptionsBuilder_patterns#getMemoryLimitMiB_java_lang_Number_ <em>Memory Limit Mi Bjava lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledEc2TaskImageOptionsBuilder_patterns#getMemoryReservationMiB_java_lang_Number_ <em>Memory Reservation Mi Bjava lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledEc2TaskImageOptionsBuilder_patterns#getImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference <em>Image With Container Image software amazon awscdk services ecs Container Image As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledEc2TaskImageOptionsBuilder_patterns#getCommand_java_lang_String_AsList <em>Command java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledEc2TaskImageOptionsBuilder_patterns#getEnvironment_java_lang_String__java_lang_String_AsMap <em>Environment java lang String java lang String As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledEc2TaskImageOptionsBuilder_patterns#getLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference <em>Log Driver With Log Driver software amazon awscdk services ecs Log Driver As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledEc2TaskImageOptionsBuilder_patterns#getSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap <em>Secrets java lang String software amazon awscdk services ecs Secret As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledEc2TaskImageOptionsBuilder_patterns#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledEc2TaskImageOptionsBuilder_patterns#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledEc2TaskImageOptionsBuilder_patterns#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledEc2TaskImageOptionsBuilder_patterns#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScheduledEc2TaskImageOptionsBuilder_patterns()
 * @model
 * @generated
 */
public interface ScheduledEc2TaskImageOptionsBuilder_patterns extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Cpu java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu java lang Number </em>' attribute.
	 * @see #setCpu_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScheduledEc2TaskImageOptionsBuilder_patterns_Cpu_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getCpu_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledEc2TaskImageOptionsBuilder_patterns#getCpu_java_lang_Number_ <em>Cpu java lang Number </em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScheduledEc2TaskImageOptionsBuilder_patterns_MemoryLimitMiB_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getMemoryLimitMiB_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledEc2TaskImageOptionsBuilder_patterns#getMemoryLimitMiB_java_lang_Number_ <em>Memory Limit Mi Bjava lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Limit Mi Bjava lang Number </em>' attribute.
	 * @see #getMemoryLimitMiB_java_lang_Number_()
	 * @generated
	 */
	void setMemoryLimitMiB_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Memory Reservation Mi Bjava lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Reservation Mi Bjava lang Number </em>' attribute.
	 * @see #setMemoryReservationMiB_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScheduledEc2TaskImageOptionsBuilder_patterns_MemoryReservationMiB_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getMemoryReservationMiB_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledEc2TaskImageOptionsBuilder_patterns#getMemoryReservationMiB_java_lang_Number_ <em>Memory Reservation Mi Bjava lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Reservation Mi Bjava lang Number </em>' attribute.
	 * @see #getMemoryReservationMiB_java_lang_Number_()
	 * @generated
	 */
	void setMemoryReservationMiB_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Image With Container Image software amazon awscdk services ecs Container Image As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image With Container Image software amazon awscdk services ecs Container Image As Reference</em>' attribute.
	 * @see #setImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScheduledEc2TaskImageOptionsBuilder_patterns_ImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference()
	 * @model
	 * @generated
	 */
	String getImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledEc2TaskImageOptionsBuilder_patterns#getImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference <em>Image With Container Image software amazon awscdk services ecs Container Image As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image With Container Image software amazon awscdk services ecs Container Image As Reference</em>' attribute.
	 * @see #getImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference()
	 * @generated
	 */
	void setImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Command java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command java lang String As List</em>' attribute.
	 * @see #setCommand_java_lang_String_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScheduledEc2TaskImageOptionsBuilder_patterns_Command_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getCommand_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledEc2TaskImageOptionsBuilder_patterns#getCommand_java_lang_String_AsList <em>Command java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command java lang String As List</em>' attribute.
	 * @see #getCommand_java_lang_String_AsList()
	 * @generated
	 */
	void setCommand_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Environment java lang String java lang String As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment java lang String java lang String As Map</em>' attribute.
	 * @see #setEnvironment_java_lang_String__java_lang_String_AsMap(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScheduledEc2TaskImageOptionsBuilder_patterns_Environment_java_lang_String__java_lang_String_AsMap()
	 * @model
	 * @generated
	 */
	String getEnvironment_java_lang_String__java_lang_String_AsMap();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledEc2TaskImageOptionsBuilder_patterns#getEnvironment_java_lang_String__java_lang_String_AsMap <em>Environment java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment java lang String java lang String As Map</em>' attribute.
	 * @see #getEnvironment_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 */
	void setEnvironment_java_lang_String__java_lang_String_AsMap(String value);

	/**
	 * Returns the value of the '<em><b>Log Driver With Log Driver software amazon awscdk services ecs Log Driver As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Driver With Log Driver software amazon awscdk services ecs Log Driver As Reference</em>' attribute.
	 * @see #setLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScheduledEc2TaskImageOptionsBuilder_patterns_LogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference()
	 * @model
	 * @generated
	 */
	String getLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledEc2TaskImageOptionsBuilder_patterns#getLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference <em>Log Driver With Log Driver software amazon awscdk services ecs Log Driver As Reference</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScheduledEc2TaskImageOptionsBuilder_patterns_Secrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap()
	 * @model
	 * @generated
	 */
	String getSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledEc2TaskImageOptionsBuilder_patterns#getSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap <em>Secrets java lang String software amazon awscdk services ecs Secret As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secrets java lang String software amazon awscdk services ecs Secret As Map</em>' attribute.
	 * @see #getSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap()
	 * @generated
	 */
	void setSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskImageOptions"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScheduledEc2TaskImageOptionsBuilder_patterns_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskImageOptions" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScheduledEc2TaskImageOptionsBuilder_patterns_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledEc2TaskImageOptionsBuilder_patterns#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScheduledEc2TaskImageOptionsBuilder_patterns_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledEc2TaskImageOptionsBuilder_patterns#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScheduledEc2TaskImageOptionsBuilder_patterns_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledEc2TaskImageOptionsBuilder_patterns#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // ScheduledEc2TaskImageOptionsBuilder_patterns
