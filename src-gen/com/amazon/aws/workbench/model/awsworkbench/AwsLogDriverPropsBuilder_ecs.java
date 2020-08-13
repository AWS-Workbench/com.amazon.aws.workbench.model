/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aws Log Driver Props Builder ecs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AwsLogDriverPropsBuilder_ecs#getStreamPrefix_java_lang_String_ <em>Stream Prefix java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AwsLogDriverPropsBuilder_ecs#getDatetimeFormat_java_lang_String_ <em>Datetime Format java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AwsLogDriverPropsBuilder_ecs#getLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference <em>Log Group With ILog Group software amazon awscdk services logs ILog Group As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AwsLogDriverPropsBuilder_ecs#getLogRetention_software_amazon_awscdk_services_logs_RetentionDays_ <em>Log Retention software amazon awscdk services logs Retention Days </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AwsLogDriverPropsBuilder_ecs#getMultilinePattern_java_lang_String_ <em>Multiline Pattern java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AwsLogDriverPropsBuilder_ecs#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AwsLogDriverPropsBuilder_ecs#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AwsLogDriverPropsBuilder_ecs#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AwsLogDriverPropsBuilder_ecs#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAwsLogDriverPropsBuilder_ecs()
 * @model
 * @generated
 */
public interface AwsLogDriverPropsBuilder_ecs extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Stream Prefix java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stream Prefix java lang String </em>' attribute.
	 * @see #setStreamPrefix_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAwsLogDriverPropsBuilder_ecs_StreamPrefix_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getStreamPrefix_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AwsLogDriverPropsBuilder_ecs#getStreamPrefix_java_lang_String_ <em>Stream Prefix java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stream Prefix java lang String </em>' attribute.
	 * @see #getStreamPrefix_java_lang_String_()
	 * @generated
	 */
	void setStreamPrefix_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Datetime Format java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datetime Format java lang String </em>' attribute.
	 * @see #setDatetimeFormat_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAwsLogDriverPropsBuilder_ecs_DatetimeFormat_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDatetimeFormat_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AwsLogDriverPropsBuilder_ecs#getDatetimeFormat_java_lang_String_ <em>Datetime Format java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datetime Format java lang String </em>' attribute.
	 * @see #getDatetimeFormat_java_lang_String_()
	 * @generated
	 */
	void setDatetimeFormat_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Log Group With ILog Group software amazon awscdk services logs ILog Group As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Group With ILog Group software amazon awscdk services logs ILog Group As Reference</em>' attribute.
	 * @see #setLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAwsLogDriverPropsBuilder_ecs_LogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference()
	 * @model
	 * @generated
	 */
	String getLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AwsLogDriverPropsBuilder_ecs#getLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference <em>Log Group With ILog Group software amazon awscdk services logs ILog Group As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Group With ILog Group software amazon awscdk services logs ILog Group As Reference</em>' attribute.
	 * @see #getLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference()
	 * @generated
	 */
	void setLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Log Retention software amazon awscdk services logs Retention Days </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.RetentionDays}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Retention software amazon awscdk services logs Retention Days </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RetentionDays
	 * @see #setLogRetention_software_amazon_awscdk_services_logs_RetentionDays_(RetentionDays)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAwsLogDriverPropsBuilder_ecs_LogRetention_software_amazon_awscdk_services_logs_RetentionDays_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.RetentionDays"
	 * @generated
	 */
	RetentionDays getLogRetention_software_amazon_awscdk_services_logs_RetentionDays_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AwsLogDriverPropsBuilder_ecs#getLogRetention_software_amazon_awscdk_services_logs_RetentionDays_ <em>Log Retention software amazon awscdk services logs Retention Days </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Retention software amazon awscdk services logs Retention Days </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RetentionDays
	 * @see #getLogRetention_software_amazon_awscdk_services_logs_RetentionDays_()
	 * @generated
	 */
	void setLogRetention_software_amazon_awscdk_services_logs_RetentionDays_(RetentionDays value);

	/**
	 * Returns the value of the '<em><b>Multiline Pattern java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiline Pattern java lang String </em>' attribute.
	 * @see #setMultilinePattern_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAwsLogDriverPropsBuilder_ecs_MultilinePattern_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getMultilinePattern_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AwsLogDriverPropsBuilder_ecs#getMultilinePattern_java_lang_String_ <em>Multiline Pattern java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiline Pattern java lang String </em>' attribute.
	 * @see #getMultilinePattern_java_lang_String_()
	 * @generated
	 */
	void setMultilinePattern_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ecs.AwsLogDriverProps"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAwsLogDriverPropsBuilder_ecs_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ecs.AwsLogDriverProps" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAwsLogDriverPropsBuilder_ecs_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AwsLogDriverPropsBuilder_ecs#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAwsLogDriverPropsBuilder_ecs_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AwsLogDriverPropsBuilder_ecs#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAwsLogDriverPropsBuilder_ecs_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AwsLogDriverPropsBuilder_ecs#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // AwsLogDriverPropsBuilder_ecs
