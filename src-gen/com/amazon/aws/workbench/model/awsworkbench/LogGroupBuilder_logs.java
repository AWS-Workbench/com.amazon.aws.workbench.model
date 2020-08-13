/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log Group Builder logs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LogGroupBuilder_logs#getLogGroupName_java_lang_String_ <em>Log Group Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LogGroupBuilder_logs#getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ <em>Removal Policy software amazon awscdk core Removal Policy </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LogGroupBuilder_logs#getRetention_software_amazon_awscdk_services_logs_RetentionDays_ <em>Retention software amazon awscdk services logs Retention Days </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LogGroupBuilder_logs#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LogGroupBuilder_logs#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LogGroupBuilder_logs#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LogGroupBuilder_logs#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLogGroupBuilder_logs()
 * @model
 * @generated
 */
public interface LogGroupBuilder_logs extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Log Group Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Group Name java lang String </em>' attribute.
	 * @see #setLogGroupName_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLogGroupBuilder_logs_LogGroupName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getLogGroupName_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LogGroupBuilder_logs#getLogGroupName_java_lang_String_ <em>Log Group Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Group Name java lang String </em>' attribute.
	 * @see #getLogGroupName_java_lang_String_()
	 * @generated
	 */
	void setLogGroupName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Removal Policy software amazon awscdk core Removal Policy </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.RemovalPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removal Policy software amazon awscdk core Removal Policy </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RemovalPolicy
	 * @see #setRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_(RemovalPolicy)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLogGroupBuilder_logs_RemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.RemovalPolicy"
	 * @generated
	 */
	RemovalPolicy getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LogGroupBuilder_logs#getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ <em>Removal Policy software amazon awscdk core Removal Policy </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removal Policy software amazon awscdk core Removal Policy </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RemovalPolicy
	 * @see #getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_()
	 * @generated
	 */
	void setRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_(RemovalPolicy value);

	/**
	 * Returns the value of the '<em><b>Retention software amazon awscdk services logs Retention Days </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.RetentionDays}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retention software amazon awscdk services logs Retention Days </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RetentionDays
	 * @see #setRetention_software_amazon_awscdk_services_logs_RetentionDays_(RetentionDays)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLogGroupBuilder_logs_Retention_software_amazon_awscdk_services_logs_RetentionDays_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.RetentionDays"
	 * @generated
	 */
	RetentionDays getRetention_software_amazon_awscdk_services_logs_RetentionDays_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LogGroupBuilder_logs#getRetention_software_amazon_awscdk_services_logs_RetentionDays_ <em>Retention software amazon awscdk services logs Retention Days </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retention software amazon awscdk services logs Retention Days </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RetentionDays
	 * @see #getRetention_software_amazon_awscdk_services_logs_RetentionDays_()
	 * @generated
	 */
	void setRetention_software_amazon_awscdk_services_logs_RetentionDays_(RetentionDays value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.logs.LogGroup"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLogGroupBuilder_logs_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.logs.LogGroup" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLogGroupBuilder_logs_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LogGroupBuilder_logs#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLogGroupBuilder_logs_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LogGroupBuilder_logs#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLogGroupBuilder_logs_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LogGroupBuilder_logs#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // LogGroupBuilder_logs
