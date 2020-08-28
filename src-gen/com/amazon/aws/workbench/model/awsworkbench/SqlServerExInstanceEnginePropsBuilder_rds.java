/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sql Server Ex Instance Engine Props Builder rds</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SqlServerExInstanceEnginePropsBuilder_rds#getVersionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReference <em>Version With Sql Server Engine Version software amazon awscdk services rds Sql Server Engine Version As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SqlServerExInstanceEnginePropsBuilder_rds#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SqlServerExInstanceEnginePropsBuilder_rds#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SqlServerExInstanceEnginePropsBuilder_rds#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.SqlServerExInstanceEnginePropsBuilder_rds#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSqlServerExInstanceEnginePropsBuilder_rds()
 * @model
 * @generated
 */
public interface SqlServerExInstanceEnginePropsBuilder_rds extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Version With Sql Server Engine Version software amazon awscdk services rds Sql Server Engine Version As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version With Sql Server Engine Version software amazon awscdk services rds Sql Server Engine Version As Reference</em>' attribute.
	 * @see #setVersionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSqlServerExInstanceEnginePropsBuilder_rds_VersionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReference()
	 * @model
	 * @generated
	 */
	String getVersionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SqlServerExInstanceEnginePropsBuilder_rds#getVersionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReference <em>Version With Sql Server Engine Version software amazon awscdk services rds Sql Server Engine Version As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version With Sql Server Engine Version software amazon awscdk services rds Sql Server Engine Version As Reference</em>' attribute.
	 * @see #getVersionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReference()
	 * @generated
	 */
	void setVersionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.rds.SqlServerExInstanceEngineProps"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSqlServerExInstanceEnginePropsBuilder_rds_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.rds.SqlServerExInstanceEngineProps" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSqlServerExInstanceEnginePropsBuilder_rds_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SqlServerExInstanceEnginePropsBuilder_rds#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSqlServerExInstanceEnginePropsBuilder_rds_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SqlServerExInstanceEnginePropsBuilder_rds#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getSqlServerExInstanceEnginePropsBuilder_rds_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.SqlServerExInstanceEnginePropsBuilder_rds#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // SqlServerExInstanceEnginePropsBuilder_rds
