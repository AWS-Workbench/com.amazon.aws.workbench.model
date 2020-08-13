/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda;
import com.amazon.aws.workbench.model.awsworkbench.RetentionDays;
import com.amazon.aws.workbench.model.awsworkbench.Tracing;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Builder lambda</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FunctionBuilder_lambdaImpl#getMaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Max Event Age With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FunctionBuilder_lambdaImpl#getOnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference <em>On Failure With IDestination software amazon awscdk services lambda IDestination As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FunctionBuilder_lambdaImpl#getOnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference <em>On Success With IDestination software amazon awscdk services lambda IDestination As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FunctionBuilder_lambdaImpl#getRetryAttempts_java_lang_Number_ <em>Retry Attempts java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FunctionBuilder_lambdaImpl#getAllowAllOutbound_java_lang_Boolean_ <em>Allow All Outbound java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FunctionBuilder_lambdaImpl#getCurrentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference <em>Current Version Options With Version Options software amazon awscdk services lambda Version Options As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FunctionBuilder_lambdaImpl#getDeadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference <em>Dead Letter Queue With IQueue software amazon awscdk services sqs IQueue As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FunctionBuilder_lambdaImpl#getDeadLetterQueueEnabled_java_lang_Boolean_ <em>Dead Letter Queue Enabled java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FunctionBuilder_lambdaImpl#getDescription_java_lang_String_ <em>Description java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FunctionBuilder_lambdaImpl#getEnvironment_java_lang_String__java_lang_String_AsMap <em>Environment java lang String java lang String As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FunctionBuilder_lambdaImpl#getEvents_software_amazon_awscdk_services_lambda_IEventSource_AsList <em>Events software amazon awscdk services lambda IEvent Source As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FunctionBuilder_lambdaImpl#getFunctionName_java_lang_String_ <em>Function Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FunctionBuilder_lambdaImpl#getInitialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList <em>Initial Policy software amazon awscdk services iam Policy Statement As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FunctionBuilder_lambdaImpl#getLayers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList <em>Layers software amazon awscdk services lambda ILayer Version As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FunctionBuilder_lambdaImpl#getLogRetention_software_amazon_awscdk_services_logs_RetentionDays_ <em>Log Retention software amazon awscdk services logs Retention Days </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FunctionBuilder_lambdaImpl#getLogRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Log Retention Role With IRole software amazon awscdk services iam IRole As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FunctionBuilder_lambdaImpl#getMemorySize_java_lang_Number_ <em>Memory Size java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FunctionBuilder_lambdaImpl#getReservedConcurrentExecutions_java_lang_Number_ <em>Reserved Concurrent Executions java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FunctionBuilder_lambdaImpl#getRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Role With IRole software amazon awscdk services iam IRole As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FunctionBuilder_lambdaImpl#getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference <em>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FunctionBuilder_lambdaImpl#getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList <em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FunctionBuilder_lambdaImpl#getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Timeout With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FunctionBuilder_lambdaImpl#getTracing_software_amazon_awscdk_services_lambda_Tracing_ <em>Tracing software amazon awscdk services lambda Tracing </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FunctionBuilder_lambdaImpl#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FunctionBuilder_lambdaImpl#getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FunctionBuilder_lambdaImpl#getCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference <em>Code With Code software amazon awscdk services lambda Code As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FunctionBuilder_lambdaImpl#getHandler_java_lang_String_ <em>Handler java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FunctionBuilder_lambdaImpl#getRuntimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference <em>Runtime With Runtime software amazon awscdk services lambda Runtime As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FunctionBuilder_lambdaImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FunctionBuilder_lambdaImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FunctionBuilder_lambdaImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FunctionBuilder_lambdaImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionBuilder_lambdaImpl extends ServiceResourcesImpl implements FunctionBuilder_lambda {
	/**
	 * The default value of the '{@link #getMaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Max Event Age With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_EVENT_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Max Event Age With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String maxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference = MAX_EVENT_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference() <em>On Failure With IDestination software amazon awscdk services lambda IDestination As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_FAILURE_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference() <em>On Failure With IDestination software amazon awscdk services lambda IDestination As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String onFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference = ON_FAILURE_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference() <em>On Success With IDestination software amazon awscdk services lambda IDestination As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_SUCCESS_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference() <em>On Success With IDestination software amazon awscdk services lambda IDestination As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String onSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference = ON_SUCCESS_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetryAttempts_java_lang_Number_() <em>Retry Attempts java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryAttempts_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int RETRY_ATTEMPTS_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRetryAttempts_java_lang_Number_() <em>Retry Attempts java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryAttempts_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int retryAttempts_java_lang_Number_ = RETRY_ATTEMPTS_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowAllOutbound_java_lang_Boolean_() <em>Allow All Outbound java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowAllOutbound_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowAllOutbound_java_lang_Boolean_() <em>Allow All Outbound java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowAllOutbound_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowAllOutbound_java_lang_Boolean_ = ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference() <em>Current Version Options With Version Options software amazon awscdk services lambda Version Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_VERSION_OPTIONS_WITH_VERSION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_VERSION_OPTIONS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference() <em>Current Version Options With Version Options software amazon awscdk services lambda Version Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String currentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference = CURRENT_VERSION_OPTIONS_WITH_VERSION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_VERSION_OPTIONS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference() <em>Dead Letter Queue With IQueue software amazon awscdk services sqs IQueue As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String DEAD_LETTER_QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference() <em>Dead Letter Queue With IQueue software amazon awscdk services sqs IQueue As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String deadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference = DEAD_LETTER_QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeadLetterQueueEnabled_java_lang_Boolean_() <em>Dead Letter Queue Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadLetterQueueEnabled_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DEAD_LETTER_QUEUE_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeadLetterQueueEnabled_java_lang_Boolean_() <em>Dead Letter Queue Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadLetterQueueEnabled_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean deadLetterQueueEnabled_java_lang_Boolean_ = DEAD_LETTER_QUEUE_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription_java_lang_String_() <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription_java_lang_String_() <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String description_java_lang_String_ = DESCRIPTION_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getEnvironment_java_lang_String__java_lang_String_AsMap() <em>Environment java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnvironment_java_lang_String__java_lang_String_AsMap() <em>Environment java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String environment_java_lang_String__java_lang_String_AsMap = ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getEvents_software_amazon_awscdk_services_lambda_IEventSource_AsList() <em>Events software amazon awscdk services lambda IEvent Source As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents_software_amazon_awscdk_services_lambda_IEventSource_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IEVENT_SOURCE_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEvents_software_amazon_awscdk_services_lambda_IEventSource_AsList() <em>Events software amazon awscdk services lambda IEvent Source As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents_software_amazon_awscdk_services_lambda_IEventSource_AsList()
	 * @generated
	 * @ordered
	 */
	protected String events_software_amazon_awscdk_services_lambda_IEventSource_AsList = EVENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IEVENT_SOURCE_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getFunctionName_java_lang_String_() <em>Function Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTION_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunctionName_java_lang_String_() <em>Function Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String functionName_java_lang_String_ = FUNCTION_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList() <em>Initial Policy software amazon awscdk services iam Policy Statement As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList() <em>Initial Policy software amazon awscdk services iam Policy Statement As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList()
	 * @generated
	 * @ordered
	 */
	protected String initialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList = INITIAL_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList() <em>Layers software amazon awscdk services lambda ILayer Version As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String LAYERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_ILAYER_VERSION_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLayers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList() <em>Layers software amazon awscdk services lambda ILayer Version As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList()
	 * @generated
	 * @ordered
	 */
	protected String layers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList = LAYERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_ILAYER_VERSION_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogRetention_software_amazon_awscdk_services_logs_RetentionDays_() <em>Log Retention software amazon awscdk services logs Retention Days </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogRetention_software_amazon_awscdk_services_logs_RetentionDays_()
	 * @generated
	 * @ordered
	 */
	protected static final RetentionDays LOG_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS__EDEFAULT = RetentionDays.ONE_DAY;

	/**
	 * The cached value of the '{@link #getLogRetention_software_amazon_awscdk_services_logs_RetentionDays_() <em>Log Retention software amazon awscdk services logs Retention Days </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogRetention_software_amazon_awscdk_services_logs_RetentionDays_()
	 * @generated
	 * @ordered
	 */
	protected RetentionDays logRetention_software_amazon_awscdk_services_logs_RetentionDays_ = LOG_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS__EDEFAULT;

	/**
	 * The default value of the '{@link #getLogRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() <em>Log Retention Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_RETENTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() <em>Log Retention Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String logRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference = LOG_RETENTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemorySize_java_lang_Number_() <em>Memory Size java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySize_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_SIZE_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemorySize_java_lang_Number_() <em>Memory Size java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySize_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int memorySize_java_lang_Number_ = MEMORY_SIZE_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getReservedConcurrentExecutions_java_lang_Number_() <em>Reserved Concurrent Executions java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedConcurrentExecutions_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int RESERVED_CONCURRENT_EXECUTIONS_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReservedConcurrentExecutions_java_lang_Number_() <em>Reserved Concurrent Executions java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedConcurrentExecutions_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int reservedConcurrentExecutions_java_lang_Number_ = RESERVED_CONCURRENT_EXECUTIONS_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() <em>Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() <em>Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String roleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference = ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference() <em>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference() <em>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String securityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference = SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList() <em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList() <em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList()
	 * @generated
	 * @ordered
	 */
	protected String securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList = SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Timeout With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Timeout With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference = TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTracing_software_amazon_awscdk_services_lambda_Tracing_() <em>Tracing software amazon awscdk services lambda Tracing </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracing_software_amazon_awscdk_services_lambda_Tracing_()
	 * @generated
	 * @ordered
	 */
	protected static final Tracing TRACING_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_TRACING__EDEFAULT = Tracing.ACTIVE;

	/**
	 * The cached value of the '{@link #getTracing_software_amazon_awscdk_services_lambda_Tracing_() <em>Tracing software amazon awscdk services lambda Tracing </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracing_software_amazon_awscdk_services_lambda_Tracing_()
	 * @generated
	 * @ordered
	 */
	protected Tracing tracing_software_amazon_awscdk_services_lambda_Tracing_ = TRACING_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_TRACING__EDEFAULT;

	/**
	 * The default value of the '{@link #getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference = VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() <em>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() <em>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference = VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference() <em>Code With Code software amazon awscdk services lambda Code As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_WITH_CODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_CODE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference() <em>Code With Code software amazon awscdk services lambda Code As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String codeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference = CODE_WITH_CODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_CODE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHandler_java_lang_String_() <em>Handler java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandler_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLER_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandler_java_lang_String_() <em>Handler java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandler_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String handler_java_lang_String_ = HANDLER_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getRuntimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference() <em>Runtime With Runtime software amazon awscdk services lambda Runtime As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String RUNTIME_WITH_RUNTIME_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_RUNTIME_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuntimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference() <em>Runtime With Runtime software amazon awscdk services lambda Runtime As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String runtimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference = RUNTIME_WITH_RUNTIME_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_RUNTIME_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.lambda.Function";

	/**
	 * The cached value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected String generatedClassName = GENERATED_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected String varName = VAR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalCode() <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalCode() <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCode()
	 * @generated
	 * @ordered
	 */
	protected String additionalCode = ADDITIONAL_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionBuilder_lambdaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.FUNCTION_BUILDER_LAMBDA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return maxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newMaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldMaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference = maxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		maxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference = newMaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__MAX_EVENT_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldMaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					maxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference() {
		return onFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference(
			String newOnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference) {
		String oldOnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference = onFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference;
		onFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference = newOnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ON_FAILURE_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE,
					oldOnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference,
					onFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference() {
		return onSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference(
			String newOnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference) {
		String oldOnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference = onSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference;
		onSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference = newOnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ON_SUCCESS_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE,
					oldOnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference,
					onSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRetryAttempts_java_lang_Number_() {
		return retryAttempts_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetryAttempts_java_lang_Number_(int newRetryAttempts_java_lang_Number_) {
		int oldRetryAttempts_java_lang_Number_ = retryAttempts_java_lang_Number_;
		retryAttempts_java_lang_Number_ = newRetryAttempts_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__RETRY_ATTEMPTS_JAVA_LANG_NUMBER_,
					oldRetryAttempts_java_lang_Number_, retryAttempts_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAllowAllOutbound_java_lang_Boolean_() {
		return allowAllOutbound_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowAllOutbound_java_lang_Boolean_(Boolean newAllowAllOutbound_java_lang_Boolean_) {
		Boolean oldAllowAllOutbound_java_lang_Boolean_ = allowAllOutbound_java_lang_Boolean_;
		allowAllOutbound_java_lang_Boolean_ = newAllowAllOutbound_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_,
					oldAllowAllOutbound_java_lang_Boolean_, allowAllOutbound_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference() {
		return currentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference(
			String newCurrentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference) {
		String oldCurrentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference = currentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference;
		currentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference = newCurrentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__CURRENT_VERSION_OPTIONS_WITH_VERSION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_VERSION_OPTIONS_AS_REFERENCE,
					oldCurrentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference,
					currentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference() {
		return deadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference(
			String newDeadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference) {
		String oldDeadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference = deadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference;
		deadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference = newDeadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__DEAD_LETTER_QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE,
					oldDeadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference,
					deadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDeadLetterQueueEnabled_java_lang_Boolean_() {
		return deadLetterQueueEnabled_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeadLetterQueueEnabled_java_lang_Boolean_(Boolean newDeadLetterQueueEnabled_java_lang_Boolean_) {
		Boolean oldDeadLetterQueueEnabled_java_lang_Boolean_ = deadLetterQueueEnabled_java_lang_Boolean_;
		deadLetterQueueEnabled_java_lang_Boolean_ = newDeadLetterQueueEnabled_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__DEAD_LETTER_QUEUE_ENABLED_JAVA_LANG_BOOLEAN_,
					oldDeadLetterQueueEnabled_java_lang_Boolean_, deadLetterQueueEnabled_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription_java_lang_String_() {
		return description_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription_java_lang_String_(String newDescription_java_lang_String_) {
		String oldDescription_java_lang_String_ = description_java_lang_String_;
		description_java_lang_String_ = newDescription_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__DESCRIPTION_JAVA_LANG_STRING_,
					oldDescription_java_lang_String_, description_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnvironment_java_lang_String__java_lang_String_AsMap() {
		return environment_java_lang_String__java_lang_String_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnvironment_java_lang_String__java_lang_String_AsMap(
			String newEnvironment_java_lang_String__java_lang_String_AsMap) {
		String oldEnvironment_java_lang_String__java_lang_String_AsMap = environment_java_lang_String__java_lang_String_AsMap;
		environment_java_lang_String__java_lang_String_AsMap = newEnvironment_java_lang_String__java_lang_String_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
					oldEnvironment_java_lang_String__java_lang_String_AsMap,
					environment_java_lang_String__java_lang_String_AsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEvents_software_amazon_awscdk_services_lambda_IEventSource_AsList() {
		return events_software_amazon_awscdk_services_lambda_IEventSource_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEvents_software_amazon_awscdk_services_lambda_IEventSource_AsList(
			String newEvents_software_amazon_awscdk_services_lambda_IEventSource_AsList) {
		String oldEvents_software_amazon_awscdk_services_lambda_IEventSource_AsList = events_software_amazon_awscdk_services_lambda_IEventSource_AsList;
		events_software_amazon_awscdk_services_lambda_IEventSource_AsList = newEvents_software_amazon_awscdk_services_lambda_IEventSource_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__EVENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IEVENT_SOURCE_AS_LIST,
					oldEvents_software_amazon_awscdk_services_lambda_IEventSource_AsList,
					events_software_amazon_awscdk_services_lambda_IEventSource_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFunctionName_java_lang_String_() {
		return functionName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunctionName_java_lang_String_(String newFunctionName_java_lang_String_) {
		String oldFunctionName_java_lang_String_ = functionName_java_lang_String_;
		functionName_java_lang_String_ = newFunctionName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__FUNCTION_NAME_JAVA_LANG_STRING_,
					oldFunctionName_java_lang_String_, functionName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInitialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList() {
		return initialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList(
			String newInitialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList) {
		String oldInitialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList = initialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList;
		initialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList = newInitialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__INITIAL_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST,
					oldInitialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList,
					initialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLayers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList() {
		return layers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLayers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList(
			String newLayers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList) {
		String oldLayers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList = layers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList;
		layers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList = newLayers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__LAYERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_ILAYER_VERSION_AS_LIST,
					oldLayers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList,
					layers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RetentionDays getLogRetention_software_amazon_awscdk_services_logs_RetentionDays_() {
		return logRetention_software_amazon_awscdk_services_logs_RetentionDays_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogRetention_software_amazon_awscdk_services_logs_RetentionDays_(
			RetentionDays newLogRetention_software_amazon_awscdk_services_logs_RetentionDays_) {
		RetentionDays oldLogRetention_software_amazon_awscdk_services_logs_RetentionDays_ = logRetention_software_amazon_awscdk_services_logs_RetentionDays_;
		logRetention_software_amazon_awscdk_services_logs_RetentionDays_ = newLogRetention_software_amazon_awscdk_services_logs_RetentionDays_ == null
				? LOG_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS__EDEFAULT
				: newLogRetention_software_amazon_awscdk_services_logs_RetentionDays_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__LOG_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS_,
					oldLogRetention_software_amazon_awscdk_services_logs_RetentionDays_,
					logRetention_software_amazon_awscdk_services_logs_RetentionDays_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() {
		return logRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(
			String newLogRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference) {
		String oldLogRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference = logRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference;
		logRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference = newLogRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__LOG_RETENTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE,
					oldLogRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference,
					logRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMemorySize_java_lang_Number_() {
		return memorySize_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemorySize_java_lang_Number_(int newMemorySize_java_lang_Number_) {
		int oldMemorySize_java_lang_Number_ = memorySize_java_lang_Number_;
		memorySize_java_lang_Number_ = newMemorySize_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__MEMORY_SIZE_JAVA_LANG_NUMBER_,
					oldMemorySize_java_lang_Number_, memorySize_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getReservedConcurrentExecutions_java_lang_Number_() {
		return reservedConcurrentExecutions_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservedConcurrentExecutions_java_lang_Number_(
			int newReservedConcurrentExecutions_java_lang_Number_) {
		int oldReservedConcurrentExecutions_java_lang_Number_ = reservedConcurrentExecutions_java_lang_Number_;
		reservedConcurrentExecutions_java_lang_Number_ = newReservedConcurrentExecutions_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__RESERVED_CONCURRENT_EXECUTIONS_JAVA_LANG_NUMBER_,
					oldReservedConcurrentExecutions_java_lang_Number_, reservedConcurrentExecutions_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() {
		return roleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(
			String newRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference) {
		String oldRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference = roleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference;
		roleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference = newRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE,
					oldRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference,
					roleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference() {
		return securityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference(
			String newSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference) {
		String oldSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference = securityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference;
		securityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference = newSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE,
					oldSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference,
					securityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList() {
		return securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList(
			String newSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList) {
		String oldSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList = securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList;
		securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList = newSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST,
					oldSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList,
					securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference = timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference = newTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tracing getTracing_software_amazon_awscdk_services_lambda_Tracing_() {
		return tracing_software_amazon_awscdk_services_lambda_Tracing_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTracing_software_amazon_awscdk_services_lambda_Tracing_(
			Tracing newTracing_software_amazon_awscdk_services_lambda_Tracing_) {
		Tracing oldTracing_software_amazon_awscdk_services_lambda_Tracing_ = tracing_software_amazon_awscdk_services_lambda_Tracing_;
		tracing_software_amazon_awscdk_services_lambda_Tracing_ = newTracing_software_amazon_awscdk_services_lambda_Tracing_ == null
				? TRACING_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_TRACING__EDEFAULT
				: newTracing_software_amazon_awscdk_services_lambda_Tracing_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__TRACING_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_TRACING_,
					oldTracing_software_amazon_awscdk_services_lambda_Tracing_,
					tracing_software_amazon_awscdk_services_lambda_Tracing_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() {
		return vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(
			String newVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference) {
		String oldVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference = vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference;
		vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference = newVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE,
					oldVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference,
					vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() {
		return vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(
			String newVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference) {
		String oldVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference = vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference;
		vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference = newVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE,
					oldVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference,
					vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference() {
		return codeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference(
			String newCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference) {
		String oldCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference = codeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference;
		codeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference = newCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__CODE_WITH_CODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_CODE_AS_REFERENCE,
					oldCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference,
					codeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHandler_java_lang_String_() {
		return handler_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHandler_java_lang_String_(String newHandler_java_lang_String_) {
		String oldHandler_java_lang_String_ = handler_java_lang_String_;
		handler_java_lang_String_ = newHandler_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__HANDLER_JAVA_LANG_STRING_,
					oldHandler_java_lang_String_, handler_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRuntimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference() {
		return runtimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuntimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference(
			String newRuntimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference) {
		String oldRuntimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference = runtimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference;
		runtimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference = newRuntimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__RUNTIME_WITH_RUNTIME_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_RUNTIME_AS_REFERENCE,
					oldRuntimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference,
					runtimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeneratedClassName() {
		return generatedClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVarName() {
		return varName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVarName(String newVarName) {
		String oldVarName = varName;
		varName = newVarName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__VAR_NAME,
					oldVarName, varName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdditionalCode() {
		return additionalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalCode(String newAdditionalCode) {
		String oldAdditionalCode = additionalCode;
		additionalCode = newAdditionalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__MAX_EVENT_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getMaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ON_FAILURE_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE:
			return getOnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference();
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ON_SUCCESS_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE:
			return getOnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference();
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__RETRY_ATTEMPTS_JAVA_LANG_NUMBER_:
			return getRetryAttempts_java_lang_Number_();
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_:
			return getAllowAllOutbound_java_lang_Boolean_();
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__CURRENT_VERSION_OPTIONS_WITH_VERSION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_VERSION_OPTIONS_AS_REFERENCE:
			return getCurrentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference();
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__DEAD_LETTER_QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE:
			return getDeadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference();
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__DEAD_LETTER_QUEUE_ENABLED_JAVA_LANG_BOOLEAN_:
			return getDeadLetterQueueEnabled_java_lang_Boolean_();
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__DESCRIPTION_JAVA_LANG_STRING_:
			return getDescription_java_lang_String_();
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return getEnvironment_java_lang_String__java_lang_String_AsMap();
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__EVENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IEVENT_SOURCE_AS_LIST:
			return getEvents_software_amazon_awscdk_services_lambda_IEventSource_AsList();
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__FUNCTION_NAME_JAVA_LANG_STRING_:
			return getFunctionName_java_lang_String_();
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__INITIAL_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST:
			return getInitialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList();
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__LAYERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_ILAYER_VERSION_AS_LIST:
			return getLayers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList();
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__LOG_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS_:
			return getLogRetention_software_amazon_awscdk_services_logs_RetentionDays_();
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__LOG_RETENTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			return getLogRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__MEMORY_SIZE_JAVA_LANG_NUMBER_:
			return getMemorySize_java_lang_Number_();
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__RESERVED_CONCURRENT_EXECUTIONS_JAVA_LANG_NUMBER_:
			return getReservedConcurrentExecutions_java_lang_Number_();
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			return getRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE:
			return getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference();
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST:
			return getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList();
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__TRACING_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_TRACING_:
			return getTracing_software_amazon_awscdk_services_lambda_Tracing_();
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			return getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
			return getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__CODE_WITH_CODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_CODE_AS_REFERENCE:
			return getCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference();
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__HANDLER_JAVA_LANG_STRING_:
			return getHandler_java_lang_String_();
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__RUNTIME_WITH_RUNTIME_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_RUNTIME_AS_REFERENCE:
			return getRuntimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference();
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ADDITIONAL_CODE:
			return getAdditionalCode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__MAX_EVENT_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setMaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ON_FAILURE_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE:
			setOnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ON_SUCCESS_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE:
			setOnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__RETRY_ATTEMPTS_JAVA_LANG_NUMBER_:
			setRetryAttempts_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_:
			setAllowAllOutbound_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__CURRENT_VERSION_OPTIONS_WITH_VERSION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_VERSION_OPTIONS_AS_REFERENCE:
			setCurrentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__DEAD_LETTER_QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE:
			setDeadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__DEAD_LETTER_QUEUE_ENABLED_JAVA_LANG_BOOLEAN_:
			setDeadLetterQueueEnabled_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__DESCRIPTION_JAVA_LANG_STRING_:
			setDescription_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setEnvironment_java_lang_String__java_lang_String_AsMap((String) newValue);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__EVENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IEVENT_SOURCE_AS_LIST:
			setEvents_software_amazon_awscdk_services_lambda_IEventSource_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__FUNCTION_NAME_JAVA_LANG_STRING_:
			setFunctionName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__INITIAL_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST:
			setInitialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__LAYERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_ILAYER_VERSION_AS_LIST:
			setLayers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__LOG_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS_:
			setLogRetention_software_amazon_awscdk_services_logs_RetentionDays_((RetentionDays) newValue);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__LOG_RETENTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			setLogRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__MEMORY_SIZE_JAVA_LANG_NUMBER_:
			setMemorySize_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__RESERVED_CONCURRENT_EXECUTIONS_JAVA_LANG_NUMBER_:
			setReservedConcurrentExecutions_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			setRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE:
			setSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST:
			setSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__TRACING_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_TRACING_:
			setTracing_software_amazon_awscdk_services_lambda_Tracing_((Tracing) newValue);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
			setVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__CODE_WITH_CODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_CODE_AS_REFERENCE:
			setCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__HANDLER_JAVA_LANG_STRING_:
			setHandler_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__RUNTIME_WITH_RUNTIME_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_RUNTIME_AS_REFERENCE:
			setRuntimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ADDITIONAL_CODE:
			setAdditionalCode((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__MAX_EVENT_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setMaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					MAX_EVENT_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ON_FAILURE_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE:
			setOnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference(
					ON_FAILURE_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ON_SUCCESS_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE:
			setOnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference(
					ON_SUCCESS_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__RETRY_ATTEMPTS_JAVA_LANG_NUMBER_:
			setRetryAttempts_java_lang_Number_(RETRY_ATTEMPTS_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_:
			setAllowAllOutbound_java_lang_Boolean_(ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__CURRENT_VERSION_OPTIONS_WITH_VERSION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_VERSION_OPTIONS_AS_REFERENCE:
			setCurrentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference(
					CURRENT_VERSION_OPTIONS_WITH_VERSION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_VERSION_OPTIONS_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__DEAD_LETTER_QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE:
			setDeadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference(
					DEAD_LETTER_QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__DEAD_LETTER_QUEUE_ENABLED_JAVA_LANG_BOOLEAN_:
			setDeadLetterQueueEnabled_java_lang_Boolean_(DEAD_LETTER_QUEUE_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__DESCRIPTION_JAVA_LANG_STRING_:
			setDescription_java_lang_String_(DESCRIPTION_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setEnvironment_java_lang_String__java_lang_String_AsMap(
					ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__EVENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IEVENT_SOURCE_AS_LIST:
			setEvents_software_amazon_awscdk_services_lambda_IEventSource_AsList(
					EVENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IEVENT_SOURCE_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__FUNCTION_NAME_JAVA_LANG_STRING_:
			setFunctionName_java_lang_String_(FUNCTION_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__INITIAL_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST:
			setInitialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList(
					INITIAL_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__LAYERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_ILAYER_VERSION_AS_LIST:
			setLayers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList(
					LAYERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_ILAYER_VERSION_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__LOG_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS_:
			setLogRetention_software_amazon_awscdk_services_logs_RetentionDays_(
					LOG_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS__EDEFAULT);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__LOG_RETENTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			setLogRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(
					LOG_RETENTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__MEMORY_SIZE_JAVA_LANG_NUMBER_:
			setMemorySize_java_lang_Number_(MEMORY_SIZE_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__RESERVED_CONCURRENT_EXECUTIONS_JAVA_LANG_NUMBER_:
			setReservedConcurrentExecutions_java_lang_Number_(
					RESERVED_CONCURRENT_EXECUTIONS_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			setRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(
					ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE:
			setSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference(
					SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST:
			setSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList(
					SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__TRACING_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_TRACING_:
			setTracing_software_amazon_awscdk_services_lambda_Tracing_(
					TRACING_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_TRACING__EDEFAULT);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(
					VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
			setVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(
					VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__CODE_WITH_CODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_CODE_AS_REFERENCE:
			setCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference(
					CODE_WITH_CODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_CODE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__HANDLER_JAVA_LANG_STRING_:
			setHandler_java_lang_String_(HANDLER_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__RUNTIME_WITH_RUNTIME_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_RUNTIME_AS_REFERENCE:
			setRuntimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference(
					RUNTIME_WITH_RUNTIME_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_RUNTIME_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ADDITIONAL_CODE:
			setAdditionalCode(ADDITIONAL_CODE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__MAX_EVENT_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return MAX_EVENT_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? maxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !MAX_EVENT_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(maxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ON_FAILURE_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE:
			return ON_FAILURE_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE_EDEFAULT == null
					? onFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference != null
					: !ON_FAILURE_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE_EDEFAULT
							.equals(onFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference);
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ON_SUCCESS_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE:
			return ON_SUCCESS_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE_EDEFAULT == null
					? onSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference != null
					: !ON_SUCCESS_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE_EDEFAULT
							.equals(onSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference);
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__RETRY_ATTEMPTS_JAVA_LANG_NUMBER_:
			return retryAttempts_java_lang_Number_ != RETRY_ATTEMPTS_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_:
			return ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN__EDEFAULT == null ? allowAllOutbound_java_lang_Boolean_ != null
					: !ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN__EDEFAULT.equals(allowAllOutbound_java_lang_Boolean_);
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__CURRENT_VERSION_OPTIONS_WITH_VERSION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_VERSION_OPTIONS_AS_REFERENCE:
			return CURRENT_VERSION_OPTIONS_WITH_VERSION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_VERSION_OPTIONS_AS_REFERENCE_EDEFAULT == null
					? currentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference != null
					: !CURRENT_VERSION_OPTIONS_WITH_VERSION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_VERSION_OPTIONS_AS_REFERENCE_EDEFAULT
							.equals(currentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference);
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__DEAD_LETTER_QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE:
			return DEAD_LETTER_QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE_EDEFAULT == null
					? deadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference != null
					: !DEAD_LETTER_QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE_EDEFAULT
							.equals(deadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference);
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__DEAD_LETTER_QUEUE_ENABLED_JAVA_LANG_BOOLEAN_:
			return DEAD_LETTER_QUEUE_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? deadLetterQueueEnabled_java_lang_Boolean_ != null
					: !DEAD_LETTER_QUEUE_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(deadLetterQueueEnabled_java_lang_Boolean_);
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__DESCRIPTION_JAVA_LANG_STRING_:
			return DESCRIPTION_JAVA_LANG_STRING__EDEFAULT == null ? description_java_lang_String_ != null
					: !DESCRIPTION_JAVA_LANG_STRING__EDEFAULT.equals(description_java_lang_String_);
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT == null
					? environment_java_lang_String__java_lang_String_AsMap != null
					: !ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT
							.equals(environment_java_lang_String__java_lang_String_AsMap);
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__EVENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IEVENT_SOURCE_AS_LIST:
			return EVENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IEVENT_SOURCE_AS_LIST_EDEFAULT == null
					? events_software_amazon_awscdk_services_lambda_IEventSource_AsList != null
					: !EVENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IEVENT_SOURCE_AS_LIST_EDEFAULT
							.equals(events_software_amazon_awscdk_services_lambda_IEventSource_AsList);
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__FUNCTION_NAME_JAVA_LANG_STRING_:
			return FUNCTION_NAME_JAVA_LANG_STRING__EDEFAULT == null ? functionName_java_lang_String_ != null
					: !FUNCTION_NAME_JAVA_LANG_STRING__EDEFAULT.equals(functionName_java_lang_String_);
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__INITIAL_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST:
			return INITIAL_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST_EDEFAULT == null
					? initialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList != null
					: !INITIAL_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST_EDEFAULT
							.equals(initialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList);
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__LAYERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_ILAYER_VERSION_AS_LIST:
			return LAYERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_ILAYER_VERSION_AS_LIST_EDEFAULT == null
					? layers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList != null
					: !LAYERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_ILAYER_VERSION_AS_LIST_EDEFAULT
							.equals(layers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList);
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__LOG_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS_:
			return logRetention_software_amazon_awscdk_services_logs_RetentionDays_ != LOG_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS__EDEFAULT;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__LOG_RETENTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			return LOG_RETENTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT == null
					? logRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference != null
					: !LOG_RETENTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT
							.equals(logRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference);
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__MEMORY_SIZE_JAVA_LANG_NUMBER_:
			return memorySize_java_lang_Number_ != MEMORY_SIZE_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__RESERVED_CONCURRENT_EXECUTIONS_JAVA_LANG_NUMBER_:
			return reservedConcurrentExecutions_java_lang_Number_ != RESERVED_CONCURRENT_EXECUTIONS_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			return ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT == null
					? roleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference != null
					: !ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT
							.equals(roleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference);
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE:
			return SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE_EDEFAULT == null
					? securityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference != null
					: !SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE_EDEFAULT
							.equals(securityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference);
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST:
			return SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST_EDEFAULT == null
					? securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList != null
					: !SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST_EDEFAULT
							.equals(securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList);
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__TRACING_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_TRACING_:
			return tracing_software_amazon_awscdk_services_lambda_Tracing_ != TRACING_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_TRACING__EDEFAULT;
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			return VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT == null
					? vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference != null
					: !VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT
							.equals(vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference);
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
			return VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT == null
					? vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference != null
					: !VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT
							.equals(vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference);
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__CODE_WITH_CODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_CODE_AS_REFERENCE:
			return CODE_WITH_CODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_CODE_AS_REFERENCE_EDEFAULT == null
					? codeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference != null
					: !CODE_WITH_CODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_CODE_AS_REFERENCE_EDEFAULT
							.equals(codeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference);
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__HANDLER_JAVA_LANG_STRING_:
			return HANDLER_JAVA_LANG_STRING__EDEFAULT == null ? handler_java_lang_String_ != null
					: !HANDLER_JAVA_LANG_STRING__EDEFAULT.equals(handler_java_lang_String_);
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__RUNTIME_WITH_RUNTIME_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_RUNTIME_AS_REFERENCE:
			return RUNTIME_WITH_RUNTIME_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_RUNTIME_AS_REFERENCE_EDEFAULT == null
					? runtimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference != null
					: !RUNTIME_WITH_RUNTIME_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_RUNTIME_AS_REFERENCE_EDEFAULT
							.equals(runtimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference);
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ADDITIONAL_CODE:
			return ADDITIONAL_CODE_EDEFAULT == null ? additionalCode != null
					: !ADDITIONAL_CODE_EDEFAULT.equals(additionalCode);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (maxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(maxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		result.append(", onFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference: ");
		result.append(onFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference);
		result.append(", onSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference: ");
		result.append(onSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference);
		result.append(", retryAttempts_java_lang_Number_: ");
		result.append(retryAttempts_java_lang_Number_);
		result.append(", allowAllOutbound_java_lang_Boolean_: ");
		result.append(allowAllOutbound_java_lang_Boolean_);
		result.append(
				", currentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference: ");
		result.append(
				currentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference);
		result.append(", deadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference: ");
		result.append(deadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference);
		result.append(", deadLetterQueueEnabled_java_lang_Boolean_: ");
		result.append(deadLetterQueueEnabled_java_lang_Boolean_);
		result.append(", description_java_lang_String_: ");
		result.append(description_java_lang_String_);
		result.append(", environment_java_lang_String__java_lang_String_AsMap: ");
		result.append(environment_java_lang_String__java_lang_String_AsMap);
		result.append(", events_software_amazon_awscdk_services_lambda_IEventSource_AsList: ");
		result.append(events_software_amazon_awscdk_services_lambda_IEventSource_AsList);
		result.append(", functionName_java_lang_String_: ");
		result.append(functionName_java_lang_String_);
		result.append(", initialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList: ");
		result.append(initialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList);
		result.append(", layers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList: ");
		result.append(layers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList);
		result.append(", logRetention_software_amazon_awscdk_services_logs_RetentionDays_: ");
		result.append(logRetention_software_amazon_awscdk_services_logs_RetentionDays_);
		result.append(", logRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference: ");
		result.append(logRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference);
		result.append(", memorySize_java_lang_Number_: ");
		result.append(memorySize_java_lang_Number_);
		result.append(", reservedConcurrentExecutions_java_lang_Number_: ");
		result.append(reservedConcurrentExecutions_java_lang_Number_);
		result.append(", roleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference: ");
		result.append(roleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference);
		result.append(
				", securityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference: ");
		result.append(securityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference);
		result.append(", securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList: ");
		result.append(securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList);
		result.append(", timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		result.append(", tracing_software_amazon_awscdk_services_lambda_Tracing_: ");
		result.append(tracing_software_amazon_awscdk_services_lambda_Tracing_);
		result.append(", vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference: ");
		result.append(vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference);
		result.append(
				", vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference: ");
		result.append(vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference);
		result.append(", codeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference: ");
		result.append(codeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference);
		result.append(", handler_java_lang_String_: ");
		result.append(handler_java_lang_String_);
		result.append(", runtimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference: ");
		result.append(runtimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference);
		result.append(", generatedClassName: ");
		result.append(generatedClassName);
		result.append(", varName: ");
		result.append(varName);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", additionalCode: ");
		result.append(additionalCode);
		result.append(')');
		return result.toString();
	}

} //FunctionBuilder_lambdaImpl
