/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Docker Volume Configuration Builder ecs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DockerVolumeConfigurationBuilder_ecs#getDriver_java_lang_String_ <em>Driver java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DockerVolumeConfigurationBuilder_ecs#getScope_software_amazon_awscdk_services_ecs_Scope_ <em>Scope software amazon awscdk services ecs Scope </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DockerVolumeConfigurationBuilder_ecs#getAutoprovision_java_lang_Boolean_ <em>Autoprovision java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DockerVolumeConfigurationBuilder_ecs#getDriverOpts_java_lang_String__java_lang_String_AsMap <em>Driver Opts java lang String java lang String As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DockerVolumeConfigurationBuilder_ecs#getLabels_java_lang_String_AsList <em>Labels java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DockerVolumeConfigurationBuilder_ecs#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DockerVolumeConfigurationBuilder_ecs#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DockerVolumeConfigurationBuilder_ecs#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DockerVolumeConfigurationBuilder_ecs#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDockerVolumeConfigurationBuilder_ecs()
 * @model
 * @generated
 */
public interface DockerVolumeConfigurationBuilder_ecs extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Driver java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver java lang String </em>' attribute.
	 * @see #setDriver_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDockerVolumeConfigurationBuilder_ecs_Driver_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDriver_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DockerVolumeConfigurationBuilder_ecs#getDriver_java_lang_String_ <em>Driver java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver java lang String </em>' attribute.
	 * @see #getDriver_java_lang_String_()
	 * @generated
	 */
	void setDriver_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Scope software amazon awscdk services ecs Scope </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.Scope}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope software amazon awscdk services ecs Scope </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.Scope
	 * @see #setScope_software_amazon_awscdk_services_ecs_Scope_(Scope)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDockerVolumeConfigurationBuilder_ecs_Scope_software_amazon_awscdk_services_ecs_Scope_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.Scope"
	 * @generated
	 */
	Scope getScope_software_amazon_awscdk_services_ecs_Scope_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DockerVolumeConfigurationBuilder_ecs#getScope_software_amazon_awscdk_services_ecs_Scope_ <em>Scope software amazon awscdk services ecs Scope </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope software amazon awscdk services ecs Scope </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.Scope
	 * @see #getScope_software_amazon_awscdk_services_ecs_Scope_()
	 * @generated
	 */
	void setScope_software_amazon_awscdk_services_ecs_Scope_(Scope value);

	/**
	 * Returns the value of the '<em><b>Autoprovision java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autoprovision java lang Boolean </em>' attribute.
	 * @see #setAutoprovision_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDockerVolumeConfigurationBuilder_ecs_Autoprovision_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getAutoprovision_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DockerVolumeConfigurationBuilder_ecs#getAutoprovision_java_lang_Boolean_ <em>Autoprovision java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autoprovision java lang Boolean </em>' attribute.
	 * @see #getAutoprovision_java_lang_Boolean_()
	 * @generated
	 */
	void setAutoprovision_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Driver Opts java lang String java lang String As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver Opts java lang String java lang String As Map</em>' attribute.
	 * @see #setDriverOpts_java_lang_String__java_lang_String_AsMap(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDockerVolumeConfigurationBuilder_ecs_DriverOpts_java_lang_String__java_lang_String_AsMap()
	 * @model
	 * @generated
	 */
	String getDriverOpts_java_lang_String__java_lang_String_AsMap();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DockerVolumeConfigurationBuilder_ecs#getDriverOpts_java_lang_String__java_lang_String_AsMap <em>Driver Opts java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver Opts java lang String java lang String As Map</em>' attribute.
	 * @see #getDriverOpts_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 */
	void setDriverOpts_java_lang_String__java_lang_String_AsMap(String value);

	/**
	 * Returns the value of the '<em><b>Labels java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels java lang String As List</em>' attribute.
	 * @see #setLabels_java_lang_String_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDockerVolumeConfigurationBuilder_ecs_Labels_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getLabels_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DockerVolumeConfigurationBuilder_ecs#getLabels_java_lang_String_AsList <em>Labels java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labels java lang String As List</em>' attribute.
	 * @see #getLabels_java_lang_String_AsList()
	 * @generated
	 */
	void setLabels_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ecs.DockerVolumeConfiguration"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDockerVolumeConfigurationBuilder_ecs_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ecs.DockerVolumeConfiguration" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDockerVolumeConfigurationBuilder_ecs_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DockerVolumeConfigurationBuilder_ecs#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDockerVolumeConfigurationBuilder_ecs_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DockerVolumeConfigurationBuilder_ecs#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDockerVolumeConfigurationBuilder_ecs_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DockerVolumeConfigurationBuilder_ecs#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // DockerVolumeConfigurationBuilder_ecs
