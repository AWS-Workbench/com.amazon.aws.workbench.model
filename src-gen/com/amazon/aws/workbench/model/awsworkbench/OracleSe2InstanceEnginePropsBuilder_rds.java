/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Oracle Se2 Instance Engine Props Builder rds</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OracleSe2InstanceEnginePropsBuilder_rds#getVersionWithOracleEngineVersion_software_amazon_awscdk_services_rds_OracleEngineVersion_AsReference <em>Version With Oracle Engine Version software amazon awscdk services rds Oracle Engine Version As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OracleSe2InstanceEnginePropsBuilder_rds#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OracleSe2InstanceEnginePropsBuilder_rds#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OracleSe2InstanceEnginePropsBuilder_rds#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.OracleSe2InstanceEnginePropsBuilder_rds#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOracleSe2InstanceEnginePropsBuilder_rds()
 * @model
 * @generated
 */
public interface OracleSe2InstanceEnginePropsBuilder_rds extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Version With Oracle Engine Version software amazon awscdk services rds Oracle Engine Version As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version With Oracle Engine Version software amazon awscdk services rds Oracle Engine Version As Reference</em>' attribute.
	 * @see #setVersionWithOracleEngineVersion_software_amazon_awscdk_services_rds_OracleEngineVersion_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOracleSe2InstanceEnginePropsBuilder_rds_VersionWithOracleEngineVersion_software_amazon_awscdk_services_rds_OracleEngineVersion_AsReference()
	 * @model
	 * @generated
	 */
	String getVersionWithOracleEngineVersion_software_amazon_awscdk_services_rds_OracleEngineVersion_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.OracleSe2InstanceEnginePropsBuilder_rds#getVersionWithOracleEngineVersion_software_amazon_awscdk_services_rds_OracleEngineVersion_AsReference <em>Version With Oracle Engine Version software amazon awscdk services rds Oracle Engine Version As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version With Oracle Engine Version software amazon awscdk services rds Oracle Engine Version As Reference</em>' attribute.
	 * @see #getVersionWithOracleEngineVersion_software_amazon_awscdk_services_rds_OracleEngineVersion_AsReference()
	 * @generated
	 */
	void setVersionWithOracleEngineVersion_software_amazon_awscdk_services_rds_OracleEngineVersion_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.rds.OracleSe2InstanceEngineProps"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOracleSe2InstanceEnginePropsBuilder_rds_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.rds.OracleSe2InstanceEngineProps" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOracleSe2InstanceEnginePropsBuilder_rds_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.OracleSe2InstanceEnginePropsBuilder_rds#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOracleSe2InstanceEnginePropsBuilder_rds_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.OracleSe2InstanceEnginePropsBuilder_rds#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getOracleSe2InstanceEnginePropsBuilder_rds_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.OracleSe2InstanceEnginePropsBuilder_rds#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // OracleSe2InstanceEnginePropsBuilder_rds
