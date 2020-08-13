/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volume Builder ecs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VolumeBuilder_ecs#getName_java_lang_String_ <em>Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VolumeBuilder_ecs#getDockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReference <em>Docker Volume Configuration With Docker Volume Configuration software amazon awscdk services ecs Docker Volume Configuration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VolumeBuilder_ecs#getHostWithHost_software_amazon_awscdk_services_ecs_Host_AsReference <em>Host With Host software amazon awscdk services ecs Host As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VolumeBuilder_ecs#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VolumeBuilder_ecs#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VolumeBuilder_ecs#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.VolumeBuilder_ecs#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVolumeBuilder_ecs()
 * @model
 * @generated
 */
public interface VolumeBuilder_ecs extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name java lang String </em>' attribute.
	 * @see #setName_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVolumeBuilder_ecs_Name_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getName_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VolumeBuilder_ecs#getName_java_lang_String_ <em>Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name java lang String </em>' attribute.
	 * @see #getName_java_lang_String_()
	 * @generated
	 */
	void setName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Docker Volume Configuration With Docker Volume Configuration software amazon awscdk services ecs Docker Volume Configuration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docker Volume Configuration With Docker Volume Configuration software amazon awscdk services ecs Docker Volume Configuration As Reference</em>' attribute.
	 * @see #setDockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVolumeBuilder_ecs_DockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReference()
	 * @model
	 * @generated
	 */
	String getDockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VolumeBuilder_ecs#getDockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReference <em>Docker Volume Configuration With Docker Volume Configuration software amazon awscdk services ecs Docker Volume Configuration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docker Volume Configuration With Docker Volume Configuration software amazon awscdk services ecs Docker Volume Configuration As Reference</em>' attribute.
	 * @see #getDockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReference()
	 * @generated
	 */
	void setDockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Host With Host software amazon awscdk services ecs Host As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host With Host software amazon awscdk services ecs Host As Reference</em>' attribute.
	 * @see #setHostWithHost_software_amazon_awscdk_services_ecs_Host_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVolumeBuilder_ecs_HostWithHost_software_amazon_awscdk_services_ecs_Host_AsReference()
	 * @model
	 * @generated
	 */
	String getHostWithHost_software_amazon_awscdk_services_ecs_Host_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VolumeBuilder_ecs#getHostWithHost_software_amazon_awscdk_services_ecs_Host_AsReference <em>Host With Host software amazon awscdk services ecs Host As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host With Host software amazon awscdk services ecs Host As Reference</em>' attribute.
	 * @see #getHostWithHost_software_amazon_awscdk_services_ecs_Host_AsReference()
	 * @generated
	 */
	void setHostWithHost_software_amazon_awscdk_services_ecs_Host_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ecs.Volume"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVolumeBuilder_ecs_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ecs.Volume" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVolumeBuilder_ecs_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VolumeBuilder_ecs#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVolumeBuilder_ecs_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VolumeBuilder_ecs#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getVolumeBuilder_ecs_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.VolumeBuilder_ecs#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // VolumeBuilder_ecs
