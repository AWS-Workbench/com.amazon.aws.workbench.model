/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Group Builder rds</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ParameterGroupBuilder_rds#getEngineWithIEngine_software_amazon_awscdk_services_rds_IEngine_AsReference <em>Engine With IEngine software amazon awscdk services rds IEngine As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ParameterGroupBuilder_rds#getDescription_java_lang_String_ <em>Description java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ParameterGroupBuilder_rds#getParameters_java_lang_String__java_lang_String_AsMap <em>Parameters java lang String java lang String As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ParameterGroupBuilder_rds#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ParameterGroupBuilder_rds#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ParameterGroupBuilder_rds#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ParameterGroupBuilder_rds#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getParameterGroupBuilder_rds()
 * @model
 * @generated
 */
public interface ParameterGroupBuilder_rds extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Engine With IEngine software amazon awscdk services rds IEngine As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine With IEngine software amazon awscdk services rds IEngine As Reference</em>' attribute.
	 * @see #setEngineWithIEngine_software_amazon_awscdk_services_rds_IEngine_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getParameterGroupBuilder_rds_EngineWithIEngine_software_amazon_awscdk_services_rds_IEngine_AsReference()
	 * @model
	 * @generated
	 */
	String getEngineWithIEngine_software_amazon_awscdk_services_rds_IEngine_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ParameterGroupBuilder_rds#getEngineWithIEngine_software_amazon_awscdk_services_rds_IEngine_AsReference <em>Engine With IEngine software amazon awscdk services rds IEngine As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine With IEngine software amazon awscdk services rds IEngine As Reference</em>' attribute.
	 * @see #getEngineWithIEngine_software_amazon_awscdk_services_rds_IEngine_AsReference()
	 * @generated
	 */
	void setEngineWithIEngine_software_amazon_awscdk_services_rds_IEngine_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Description java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description java lang String </em>' attribute.
	 * @see #setDescription_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getParameterGroupBuilder_rds_Description_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDescription_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ParameterGroupBuilder_rds#getDescription_java_lang_String_ <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description java lang String </em>' attribute.
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 */
	void setDescription_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Parameters java lang String java lang String As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters java lang String java lang String As Map</em>' attribute.
	 * @see #setParameters_java_lang_String__java_lang_String_AsMap(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getParameterGroupBuilder_rds_Parameters_java_lang_String__java_lang_String_AsMap()
	 * @model
	 * @generated
	 */
	String getParameters_java_lang_String__java_lang_String_AsMap();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ParameterGroupBuilder_rds#getParameters_java_lang_String__java_lang_String_AsMap <em>Parameters java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters java lang String java lang String As Map</em>' attribute.
	 * @see #getParameters_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 */
	void setParameters_java_lang_String__java_lang_String_AsMap(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.rds.ParameterGroup"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getParameterGroupBuilder_rds_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.rds.ParameterGroup" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getParameterGroupBuilder_rds_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ParameterGroupBuilder_rds#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getParameterGroupBuilder_rds_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ParameterGroupBuilder_rds#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getParameterGroupBuilder_rds_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ParameterGroupBuilder_rds#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // ParameterGroupBuilder_rds
