/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Builder lambda</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getMaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Max Event Age With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getOnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference <em>On Failure With IDestination software amazon awscdk services lambda IDestination As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getOnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference <em>On Success With IDestination software amazon awscdk services lambda IDestination As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getRetryAttempts_java_lang_Number_ <em>Retry Attempts java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getAllowAllOutbound_java_lang_Boolean_ <em>Allow All Outbound java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getCurrentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference <em>Current Version Options With Version Options software amazon awscdk services lambda Version Options As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getDeadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference <em>Dead Letter Queue With IQueue software amazon awscdk services sqs IQueue As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getDeadLetterQueueEnabled_java_lang_Boolean_ <em>Dead Letter Queue Enabled java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getDescription_java_lang_String_ <em>Description java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getEnvironment_java_lang_String__java_lang_String_AsMap <em>Environment java lang String java lang String As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getEvents_software_amazon_awscdk_services_lambda_IEventSource_AsList <em>Events software amazon awscdk services lambda IEvent Source As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getFunctionName_java_lang_String_ <em>Function Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getInitialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList <em>Initial Policy software amazon awscdk services iam Policy Statement As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getLayers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList <em>Layers software amazon awscdk services lambda ILayer Version As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getLogRetention_software_amazon_awscdk_services_logs_RetentionDays_ <em>Log Retention software amazon awscdk services logs Retention Days </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getLogRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Log Retention Role With IRole software amazon awscdk services iam IRole As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getMemorySize_java_lang_Number_ <em>Memory Size java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getReservedConcurrentExecutions_java_lang_Number_ <em>Reserved Concurrent Executions java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Role With IRole software amazon awscdk services iam IRole As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference <em>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList <em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Timeout With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getTracing_software_amazon_awscdk_services_lambda_Tracing_ <em>Tracing software amazon awscdk services lambda Tracing </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference <em>Code With Code software amazon awscdk services lambda Code As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getHandler_java_lang_String_ <em>Handler java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getRuntimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference <em>Runtime With Runtime software amazon awscdk services lambda Runtime As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFunctionBuilder_lambda()
 * @model
 * @generated
 */
public interface FunctionBuilder_lambda extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Max Event Age With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Event Age With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setMaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFunctionBuilder_lambda_MaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getMaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getMaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Max Event Age With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Event Age With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getMaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setMaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>On Failure With IDestination software amazon awscdk services lambda IDestination As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Failure With IDestination software amazon awscdk services lambda IDestination As Reference</em>' attribute.
	 * @see #setOnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFunctionBuilder_lambda_OnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference()
	 * @model
	 * @generated
	 */
	String getOnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getOnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference <em>On Failure With IDestination software amazon awscdk services lambda IDestination As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Failure With IDestination software amazon awscdk services lambda IDestination As Reference</em>' attribute.
	 * @see #getOnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference()
	 * @generated
	 */
	void setOnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>On Success With IDestination software amazon awscdk services lambda IDestination As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Success With IDestination software amazon awscdk services lambda IDestination As Reference</em>' attribute.
	 * @see #setOnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFunctionBuilder_lambda_OnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference()
	 * @model
	 * @generated
	 */
	String getOnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getOnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference <em>On Success With IDestination software amazon awscdk services lambda IDestination As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Success With IDestination software amazon awscdk services lambda IDestination As Reference</em>' attribute.
	 * @see #getOnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference()
	 * @generated
	 */
	void setOnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Retry Attempts java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retry Attempts java lang Number </em>' attribute.
	 * @see #setRetryAttempts_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFunctionBuilder_lambda_RetryAttempts_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getRetryAttempts_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getRetryAttempts_java_lang_Number_ <em>Retry Attempts java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry Attempts java lang Number </em>' attribute.
	 * @see #getRetryAttempts_java_lang_Number_()
	 * @generated
	 */
	void setRetryAttempts_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Allow All Outbound java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow All Outbound java lang Boolean </em>' attribute.
	 * @see #setAllowAllOutbound_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFunctionBuilder_lambda_AllowAllOutbound_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getAllowAllOutbound_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getAllowAllOutbound_java_lang_Boolean_ <em>Allow All Outbound java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow All Outbound java lang Boolean </em>' attribute.
	 * @see #getAllowAllOutbound_java_lang_Boolean_()
	 * @generated
	 */
	void setAllowAllOutbound_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Current Version Options With Version Options software amazon awscdk services lambda Version Options As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Version Options With Version Options software amazon awscdk services lambda Version Options As Reference</em>' attribute.
	 * @see #setCurrentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFunctionBuilder_lambda_CurrentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference()
	 * @model
	 * @generated
	 */
	String getCurrentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getCurrentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference <em>Current Version Options With Version Options software amazon awscdk services lambda Version Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Version Options With Version Options software amazon awscdk services lambda Version Options As Reference</em>' attribute.
	 * @see #getCurrentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference()
	 * @generated
	 */
	void setCurrentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Dead Letter Queue With IQueue software amazon awscdk services sqs IQueue As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dead Letter Queue With IQueue software amazon awscdk services sqs IQueue As Reference</em>' attribute.
	 * @see #setDeadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFunctionBuilder_lambda_DeadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference()
	 * @model
	 * @generated
	 */
	String getDeadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getDeadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference <em>Dead Letter Queue With IQueue software amazon awscdk services sqs IQueue As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dead Letter Queue With IQueue software amazon awscdk services sqs IQueue As Reference</em>' attribute.
	 * @see #getDeadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference()
	 * @generated
	 */
	void setDeadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Dead Letter Queue Enabled java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dead Letter Queue Enabled java lang Boolean </em>' attribute.
	 * @see #setDeadLetterQueueEnabled_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFunctionBuilder_lambda_DeadLetterQueueEnabled_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getDeadLetterQueueEnabled_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getDeadLetterQueueEnabled_java_lang_Boolean_ <em>Dead Letter Queue Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dead Letter Queue Enabled java lang Boolean </em>' attribute.
	 * @see #getDeadLetterQueueEnabled_java_lang_Boolean_()
	 * @generated
	 */
	void setDeadLetterQueueEnabled_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Description java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description java lang String </em>' attribute.
	 * @see #setDescription_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFunctionBuilder_lambda_Description_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDescription_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getDescription_java_lang_String_ <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description java lang String </em>' attribute.
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 */
	void setDescription_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Environment java lang String java lang String As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment java lang String java lang String As Map</em>' attribute.
	 * @see #setEnvironment_java_lang_String__java_lang_String_AsMap(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFunctionBuilder_lambda_Environment_java_lang_String__java_lang_String_AsMap()
	 * @model
	 * @generated
	 */
	String getEnvironment_java_lang_String__java_lang_String_AsMap();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getEnvironment_java_lang_String__java_lang_String_AsMap <em>Environment java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment java lang String java lang String As Map</em>' attribute.
	 * @see #getEnvironment_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 */
	void setEnvironment_java_lang_String__java_lang_String_AsMap(String value);

	/**
	 * Returns the value of the '<em><b>Events software amazon awscdk services lambda IEvent Source As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events software amazon awscdk services lambda IEvent Source As List</em>' attribute.
	 * @see #setEvents_software_amazon_awscdk_services_lambda_IEventSource_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFunctionBuilder_lambda_Events_software_amazon_awscdk_services_lambda_IEventSource_AsList()
	 * @model
	 * @generated
	 */
	String getEvents_software_amazon_awscdk_services_lambda_IEventSource_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getEvents_software_amazon_awscdk_services_lambda_IEventSource_AsList <em>Events software amazon awscdk services lambda IEvent Source As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Events software amazon awscdk services lambda IEvent Source As List</em>' attribute.
	 * @see #getEvents_software_amazon_awscdk_services_lambda_IEventSource_AsList()
	 * @generated
	 */
	void setEvents_software_amazon_awscdk_services_lambda_IEventSource_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Function Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Name java lang String </em>' attribute.
	 * @see #setFunctionName_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFunctionBuilder_lambda_FunctionName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getFunctionName_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getFunctionName_java_lang_String_ <em>Function Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Name java lang String </em>' attribute.
	 * @see #getFunctionName_java_lang_String_()
	 * @generated
	 */
	void setFunctionName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Initial Policy software amazon awscdk services iam Policy Statement As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Policy software amazon awscdk services iam Policy Statement As List</em>' attribute.
	 * @see #setInitialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFunctionBuilder_lambda_InitialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList()
	 * @model
	 * @generated
	 */
	String getInitialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getInitialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList <em>Initial Policy software amazon awscdk services iam Policy Statement As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Policy software amazon awscdk services iam Policy Statement As List</em>' attribute.
	 * @see #getInitialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList()
	 * @generated
	 */
	void setInitialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Layers software amazon awscdk services lambda ILayer Version As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layers software amazon awscdk services lambda ILayer Version As List</em>' attribute.
	 * @see #setLayers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFunctionBuilder_lambda_Layers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList()
	 * @model
	 * @generated
	 */
	String getLayers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getLayers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList <em>Layers software amazon awscdk services lambda ILayer Version As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layers software amazon awscdk services lambda ILayer Version As List</em>' attribute.
	 * @see #getLayers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList()
	 * @generated
	 */
	void setLayers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Log Retention software amazon awscdk services logs Retention Days </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.RetentionDays}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Retention software amazon awscdk services logs Retention Days </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RetentionDays
	 * @see #setLogRetention_software_amazon_awscdk_services_logs_RetentionDays_(RetentionDays)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFunctionBuilder_lambda_LogRetention_software_amazon_awscdk_services_logs_RetentionDays_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.RetentionDays"
	 * @generated
	 */
	RetentionDays getLogRetention_software_amazon_awscdk_services_logs_RetentionDays_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getLogRetention_software_amazon_awscdk_services_logs_RetentionDays_ <em>Log Retention software amazon awscdk services logs Retention Days </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Retention software amazon awscdk services logs Retention Days </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RetentionDays
	 * @see #getLogRetention_software_amazon_awscdk_services_logs_RetentionDays_()
	 * @generated
	 */
	void setLogRetention_software_amazon_awscdk_services_logs_RetentionDays_(RetentionDays value);

	/**
	 * Returns the value of the '<em><b>Log Retention Role With IRole software amazon awscdk services iam IRole As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Retention Role With IRole software amazon awscdk services iam IRole As Reference</em>' attribute.
	 * @see #setLogRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFunctionBuilder_lambda_LogRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @model
	 * @generated
	 */
	String getLogRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getLogRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Log Retention Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Retention Role With IRole software amazon awscdk services iam IRole As Reference</em>' attribute.
	 * @see #getLogRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 */
	void setLogRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Memory Size java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Size java lang Number </em>' attribute.
	 * @see #setMemorySize_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFunctionBuilder_lambda_MemorySize_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getMemorySize_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getMemorySize_java_lang_Number_ <em>Memory Size java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Size java lang Number </em>' attribute.
	 * @see #getMemorySize_java_lang_Number_()
	 * @generated
	 */
	void setMemorySize_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Reserved Concurrent Executions java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserved Concurrent Executions java lang Number </em>' attribute.
	 * @see #setReservedConcurrentExecutions_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFunctionBuilder_lambda_ReservedConcurrentExecutions_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getReservedConcurrentExecutions_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getReservedConcurrentExecutions_java_lang_Number_ <em>Reserved Concurrent Executions java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved Concurrent Executions java lang Number </em>' attribute.
	 * @see #getReservedConcurrentExecutions_java_lang_Number_()
	 * @generated
	 */
	void setReservedConcurrentExecutions_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Role With IRole software amazon awscdk services iam IRole As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role With IRole software amazon awscdk services iam IRole As Reference</em>' attribute.
	 * @see #setRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFunctionBuilder_lambda_RoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @model
	 * @generated
	 */
	String getRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role With IRole software amazon awscdk services iam IRole As Reference</em>' attribute.
	 * @see #getRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 */
	void setRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</em>' attribute.
	 * @see #setSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFunctionBuilder_lambda_SecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference()
	 * @model
	 * @generated
	 */
	String getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference <em>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</em>' attribute.
	 * @see #getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference()
	 * @generated
	 */
	void setSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Security Groups software amazon awscdk services ec2 ISecurity Group As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>' attribute.
	 * @see #setSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFunctionBuilder_lambda_SecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList()
	 * @model
	 * @generated
	 */
	String getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList <em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>' attribute.
	 * @see #getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList()
	 * @generated
	 */
	void setSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Timeout With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFunctionBuilder_lambda_TimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Timeout With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Tracing software amazon awscdk services lambda Tracing </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.Tracing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracing software amazon awscdk services lambda Tracing </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.Tracing
	 * @see #setTracing_software_amazon_awscdk_services_lambda_Tracing_(Tracing)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFunctionBuilder_lambda_Tracing_software_amazon_awscdk_services_lambda_Tracing_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.Tracing"
	 * @generated
	 */
	Tracing getTracing_software_amazon_awscdk_services_lambda_Tracing_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getTracing_software_amazon_awscdk_services_lambda_Tracing_ <em>Tracing software amazon awscdk services lambda Tracing </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracing software amazon awscdk services lambda Tracing </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.Tracing
	 * @see #getTracing_software_amazon_awscdk_services_lambda_Tracing_()
	 * @generated
	 */
	void setTracing_software_amazon_awscdk_services_lambda_Tracing_(Tracing value);

	/**
	 * Returns the value of the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>' attribute.
	 * @see #setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFunctionBuilder_lambda_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @model
	 * @generated
	 */
	String getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>' attribute.
	 * @see #getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @generated
	 */
	void setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>' attribute.
	 * @see #setVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFunctionBuilder_lambda_VpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @model
	 * @generated
	 */
	String getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>' attribute.
	 * @see #getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @generated
	 */
	void setVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Code With Code software amazon awscdk services lambda Code As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code With Code software amazon awscdk services lambda Code As Reference</em>' attribute.
	 * @see #setCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFunctionBuilder_lambda_CodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference()
	 * @model
	 * @generated
	 */
	String getCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference <em>Code With Code software amazon awscdk services lambda Code As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code With Code software amazon awscdk services lambda Code As Reference</em>' attribute.
	 * @see #getCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference()
	 * @generated
	 */
	void setCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Handler java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler java lang String </em>' attribute.
	 * @see #setHandler_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFunctionBuilder_lambda_Handler_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getHandler_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getHandler_java_lang_String_ <em>Handler java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler java lang String </em>' attribute.
	 * @see #getHandler_java_lang_String_()
	 * @generated
	 */
	void setHandler_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Runtime With Runtime software amazon awscdk services lambda Runtime As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime With Runtime software amazon awscdk services lambda Runtime As Reference</em>' attribute.
	 * @see #setRuntimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFunctionBuilder_lambda_RuntimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference()
	 * @model
	 * @generated
	 */
	String getRuntimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getRuntimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference <em>Runtime With Runtime software amazon awscdk services lambda Runtime As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime With Runtime software amazon awscdk services lambda Runtime As Reference</em>' attribute.
	 * @see #getRuntimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference()
	 * @generated
	 */
	void setRuntimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.lambda.Function"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFunctionBuilder_lambda_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.lambda.Function" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFunctionBuilder_lambda_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFunctionBuilder_lambda_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getFunctionBuilder_lambda_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // FunctionBuilder_lambda
