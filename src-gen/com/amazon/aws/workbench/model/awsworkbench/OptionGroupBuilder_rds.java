/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option Group Builder rds</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OptionGroupBuilder_rds#getConfigurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsList <em>Configurations software amazon awscdk services rds Option Configuration As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OptionGroupBuilder_rds#getEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference <em>Engine With IInstance Engine software amazon awscdk services rds IInstance Engine As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OptionGroupBuilder_rds#getDescription_java_lang_String_ <em>Description java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OptionGroupBuilder_rds#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OptionGroupBuilder_rds#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OptionGroupBuilder_rds#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OptionGroupBuilder_rds#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOptionGroupBuilder_rds()
 * @model
 * @generated
 */
public interface OptionGroupBuilder_rds extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Configurations software amazon awscdk services rds Option Configuration As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations software amazon awscdk services rds Option Configuration As List</em>' attribute.
	 * @see #setConfigurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOptionGroupBuilder_rds_Configurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsList()
	 * @model
	 * @generated
	 */
	String getConfigurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.OptionGroupBuilder_rds#getConfigurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsList <em>Configurations software amazon awscdk services rds Option Configuration As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configurations software amazon awscdk services rds Option Configuration As List</em>' attribute.
	 * @see #getConfigurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsList()
	 * @generated
	 */
	void setConfigurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Engine With IInstance Engine software amazon awscdk services rds IInstance Engine As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine With IInstance Engine software amazon awscdk services rds IInstance Engine As Reference</em>' attribute.
	 * @see #setEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOptionGroupBuilder_rds_EngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference()
	 * @model
	 * @generated
	 */
	String getEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.OptionGroupBuilder_rds#getEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference <em>Engine With IInstance Engine software amazon awscdk services rds IInstance Engine As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine With IInstance Engine software amazon awscdk services rds IInstance Engine As Reference</em>' attribute.
	 * @see #getEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference()
	 * @generated
	 */
	void setEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Description java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description java lang String </em>' attribute.
	 * @see #setDescription_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOptionGroupBuilder_rds_Description_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDescription_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.OptionGroupBuilder_rds#getDescription_java_lang_String_ <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description java lang String </em>' attribute.
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 */
	void setDescription_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.rds.OptionGroup"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOptionGroupBuilder_rds_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.rds.OptionGroup" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOptionGroupBuilder_rds_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.OptionGroupBuilder_rds#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOptionGroupBuilder_rds_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.OptionGroupBuilder_rds#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOptionGroupBuilder_rds_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.OptionGroupBuilder_rds#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // OptionGroupBuilder_rds
