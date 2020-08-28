/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option Configuration Builder rds</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OptionConfigurationBuilder_rds#getName_java_lang_String_ <em>Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OptionConfigurationBuilder_rds#getPort_java_lang_Number_ <em>Port java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OptionConfigurationBuilder_rds#getSettings_java_lang_String__java_lang_String_AsMap <em>Settings java lang String java lang String As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OptionConfigurationBuilder_rds#getVersion_java_lang_String_ <em>Version java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OptionConfigurationBuilder_rds#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OptionConfigurationBuilder_rds#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OptionConfigurationBuilder_rds#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OptionConfigurationBuilder_rds#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OptionConfigurationBuilder_rds#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOptionConfigurationBuilder_rds()
 * @model
 * @generated
 */
public interface OptionConfigurationBuilder_rds extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name java lang String </em>' attribute.
	 * @see #setName_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOptionConfigurationBuilder_rds_Name_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getName_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.OptionConfigurationBuilder_rds#getName_java_lang_String_ <em>Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name java lang String </em>' attribute.
	 * @see #getName_java_lang_String_()
	 * @generated
	 */
	void setName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Port java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port java lang Number </em>' attribute.
	 * @see #setPort_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOptionConfigurationBuilder_rds_Port_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getPort_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.OptionConfigurationBuilder_rds#getPort_java_lang_Number_ <em>Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port java lang Number </em>' attribute.
	 * @see #getPort_java_lang_Number_()
	 * @generated
	 */
	void setPort_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Settings java lang String java lang String As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settings java lang String java lang String As Map</em>' attribute.
	 * @see #setSettings_java_lang_String__java_lang_String_AsMap(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOptionConfigurationBuilder_rds_Settings_java_lang_String__java_lang_String_AsMap()
	 * @model
	 * @generated
	 */
	String getSettings_java_lang_String__java_lang_String_AsMap();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.OptionConfigurationBuilder_rds#getSettings_java_lang_String__java_lang_String_AsMap <em>Settings java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settings java lang String java lang String As Map</em>' attribute.
	 * @see #getSettings_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 */
	void setSettings_java_lang_String__java_lang_String_AsMap(String value);

	/**
	 * Returns the value of the '<em><b>Version java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version java lang String </em>' attribute.
	 * @see #setVersion_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOptionConfigurationBuilder_rds_Version_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getVersion_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.OptionConfigurationBuilder_rds#getVersion_java_lang_String_ <em>Version java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version java lang String </em>' attribute.
	 * @see #getVersion_java_lang_String_()
	 * @generated
	 */
	void setVersion_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>' attribute.
	 * @see #setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOptionConfigurationBuilder_rds_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @model
	 * @generated
	 */
	String getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.OptionConfigurationBuilder_rds#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>' attribute.
	 * @see #getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @generated
	 */
	void setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.rds.OptionConfiguration"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOptionConfigurationBuilder_rds_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.rds.OptionConfiguration" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOptionConfigurationBuilder_rds_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.OptionConfigurationBuilder_rds#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOptionConfigurationBuilder_rds_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.OptionConfigurationBuilder_rds#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOptionConfigurationBuilder_rds_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.OptionConfigurationBuilder_rds#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // OptionConfigurationBuilder_rds
