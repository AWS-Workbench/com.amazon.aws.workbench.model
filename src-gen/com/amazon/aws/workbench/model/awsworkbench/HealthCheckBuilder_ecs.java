/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Health Check Builder ecs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.HealthCheckBuilder_ecs#getCommand_java_lang_String_AsList <em>Command java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.HealthCheckBuilder_ecs#getIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Interval With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.HealthCheckBuilder_ecs#getRetries_java_lang_Number_ <em>Retries java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.HealthCheckBuilder_ecs#getStartPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Start Period With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.HealthCheckBuilder_ecs#getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Timeout With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.HealthCheckBuilder_ecs#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.HealthCheckBuilder_ecs#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.HealthCheckBuilder_ecs#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.HealthCheckBuilder_ecs#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getHealthCheckBuilder_ecs()
 * @model
 * @generated
 */
public interface HealthCheckBuilder_ecs extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Command java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command java lang String As List</em>' attribute.
	 * @see #setCommand_java_lang_String_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getHealthCheckBuilder_ecs_Command_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getCommand_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.HealthCheckBuilder_ecs#getCommand_java_lang_String_AsList <em>Command java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command java lang String As List</em>' attribute.
	 * @see #getCommand_java_lang_String_AsList()
	 * @generated
	 */
	void setCommand_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Interval With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getHealthCheckBuilder_ecs_IntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.HealthCheckBuilder_ecs#getIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Interval With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Retries java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retries java lang Number </em>' attribute.
	 * @see #setRetries_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getHealthCheckBuilder_ecs_Retries_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getRetries_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.HealthCheckBuilder_ecs#getRetries_java_lang_Number_ <em>Retries java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retries java lang Number </em>' attribute.
	 * @see #getRetries_java_lang_Number_()
	 * @generated
	 */
	void setRetries_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Start Period With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Period With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setStartPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getHealthCheckBuilder_ecs_StartPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getStartPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.HealthCheckBuilder_ecs#getStartPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Start Period With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Period With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getStartPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setStartPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Timeout With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getHealthCheckBuilder_ecs_TimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.HealthCheckBuilder_ecs#getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Timeout With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ecs.HealthCheck"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getHealthCheckBuilder_ecs_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ecs.HealthCheck" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getHealthCheckBuilder_ecs_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.HealthCheckBuilder_ecs#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getHealthCheckBuilder_ecs_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.HealthCheckBuilder_ecs#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getHealthCheckBuilder_ecs_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.HealthCheckBuilder_ecs#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // HealthCheckBuilder_ecs
