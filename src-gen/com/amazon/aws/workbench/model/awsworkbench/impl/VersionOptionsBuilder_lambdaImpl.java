/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.RemovalPolicy;
import com.amazon.aws.workbench.model.awsworkbench.VersionOptionsBuilder_lambda;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version Options Builder lambda</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VersionOptionsBuilder_lambdaImpl#getCodeSha256_java_lang_String_ <em>Code Sha256 java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VersionOptionsBuilder_lambdaImpl#getDescription_java_lang_String_ <em>Description java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VersionOptionsBuilder_lambdaImpl#getProvisionedConcurrentExecutions_java_lang_Number_ <em>Provisioned Concurrent Executions java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VersionOptionsBuilder_lambdaImpl#getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ <em>Removal Policy software amazon awscdk core Removal Policy </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VersionOptionsBuilder_lambdaImpl#getMaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Max Event Age With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VersionOptionsBuilder_lambdaImpl#getOnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference <em>On Failure With IDestination software amazon awscdk services lambda IDestination As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VersionOptionsBuilder_lambdaImpl#getOnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference <em>On Success With IDestination software amazon awscdk services lambda IDestination As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VersionOptionsBuilder_lambdaImpl#getRetryAttempts_java_lang_Number_ <em>Retry Attempts java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VersionOptionsBuilder_lambdaImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VersionOptionsBuilder_lambdaImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VersionOptionsBuilder_lambdaImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VersionOptionsBuilder_lambdaImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionOptionsBuilder_lambdaImpl extends ServiceResourcesImpl implements VersionOptionsBuilder_lambda {
	/**
	 * The default value of the '{@link #getCodeSha256_java_lang_String_() <em>Code Sha256 java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSha256_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_SHA256_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeSha256_java_lang_String_() <em>Code Sha256 java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSha256_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String codeSha256_java_lang_String_ = CODE_SHA256_JAVA_LANG_STRING__EDEFAULT;

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
	 * The default value of the '{@link #getProvisionedConcurrentExecutions_java_lang_Number_() <em>Provisioned Concurrent Executions java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvisionedConcurrentExecutions_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int PROVISIONED_CONCURRENT_EXECUTIONS_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProvisionedConcurrentExecutions_java_lang_Number_() <em>Provisioned Concurrent Executions java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvisionedConcurrentExecutions_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int provisionedConcurrentExecutions_java_lang_Number_ = PROVISIONED_CONCURRENT_EXECUTIONS_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_() <em>Removal Policy software amazon awscdk core Removal Policy </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_()
	 * @generated
	 * @ordered
	 */
	protected static final RemovalPolicy REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY__EDEFAULT = RemovalPolicy.DESTROY;

	/**
	 * The cached value of the '{@link #getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_() <em>Removal Policy software amazon awscdk core Removal Policy </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_()
	 * @generated
	 * @ordered
	 */
	protected RemovalPolicy removalPolicy_software_amazon_awscdk_core_RemovalPolicy_ = REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY__EDEFAULT;

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
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.lambda.VersionOptions";

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
	protected VersionOptionsBuilder_lambdaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.VERSION_OPTIONS_BUILDER_LAMBDA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCodeSha256_java_lang_String_() {
		return codeSha256_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCodeSha256_java_lang_String_(String newCodeSha256_java_lang_String_) {
		String oldCodeSha256_java_lang_String_ = codeSha256_java_lang_String_;
		codeSha256_java_lang_String_ = newCodeSha256_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__CODE_SHA256_JAVA_LANG_STRING_,
					oldCodeSha256_java_lang_String_, codeSha256_java_lang_String_));
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
					AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__DESCRIPTION_JAVA_LANG_STRING_,
					oldDescription_java_lang_String_, description_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getProvisionedConcurrentExecutions_java_lang_Number_() {
		return provisionedConcurrentExecutions_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProvisionedConcurrentExecutions_java_lang_Number_(
			int newProvisionedConcurrentExecutions_java_lang_Number_) {
		int oldProvisionedConcurrentExecutions_java_lang_Number_ = provisionedConcurrentExecutions_java_lang_Number_;
		provisionedConcurrentExecutions_java_lang_Number_ = newProvisionedConcurrentExecutions_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__PROVISIONED_CONCURRENT_EXECUTIONS_JAVA_LANG_NUMBER_,
					oldProvisionedConcurrentExecutions_java_lang_Number_,
					provisionedConcurrentExecutions_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemovalPolicy getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_() {
		return removalPolicy_software_amazon_awscdk_core_RemovalPolicy_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_(
			RemovalPolicy newRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_) {
		RemovalPolicy oldRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ = removalPolicy_software_amazon_awscdk_core_RemovalPolicy_;
		removalPolicy_software_amazon_awscdk_core_RemovalPolicy_ = newRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ == null
				? REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY__EDEFAULT
				: newRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_,
					oldRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_,
					removalPolicy_software_amazon_awscdk_core_RemovalPolicy_));
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
					AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__MAX_EVENT_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
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
					AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__ON_FAILURE_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE,
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
					AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__ON_SUCCESS_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE,
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
					AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__RETRY_ATTEMPTS_JAVA_LANG_NUMBER_,
					oldRetryAttempts_java_lang_Number_, retryAttempts_java_lang_Number_));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__ADDITIONAL_CODE, oldAdditionalCode,
					additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__CODE_SHA256_JAVA_LANG_STRING_:
			return getCodeSha256_java_lang_String_();
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__DESCRIPTION_JAVA_LANG_STRING_:
			return getDescription_java_lang_String_();
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__PROVISIONED_CONCURRENT_EXECUTIONS_JAVA_LANG_NUMBER_:
			return getProvisionedConcurrentExecutions_java_lang_Number_();
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
			return getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_();
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__MAX_EVENT_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getMaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__ON_FAILURE_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE:
			return getOnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference();
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__ON_SUCCESS_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE:
			return getOnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference();
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__RETRY_ATTEMPTS_JAVA_LANG_NUMBER_:
			return getRetryAttempts_java_lang_Number_();
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__CODE_SHA256_JAVA_LANG_STRING_:
			setCodeSha256_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__DESCRIPTION_JAVA_LANG_STRING_:
			setDescription_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__PROVISIONED_CONCURRENT_EXECUTIONS_JAVA_LANG_NUMBER_:
			setProvisionedConcurrentExecutions_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
			setRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_((RemovalPolicy) newValue);
			return;
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__MAX_EVENT_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setMaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__ON_FAILURE_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE:
			setOnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__ON_SUCCESS_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE:
			setOnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__RETRY_ATTEMPTS_JAVA_LANG_NUMBER_:
			setRetryAttempts_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__CODE_SHA256_JAVA_LANG_STRING_:
			setCodeSha256_java_lang_String_(CODE_SHA256_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__DESCRIPTION_JAVA_LANG_STRING_:
			setDescription_java_lang_String_(DESCRIPTION_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__PROVISIONED_CONCURRENT_EXECUTIONS_JAVA_LANG_NUMBER_:
			setProvisionedConcurrentExecutions_java_lang_Number_(
					PROVISIONED_CONCURRENT_EXECUTIONS_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
			setRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_(
					REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY__EDEFAULT);
			return;
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__MAX_EVENT_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setMaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					MAX_EVENT_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__ON_FAILURE_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE:
			setOnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference(
					ON_FAILURE_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__ON_SUCCESS_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE:
			setOnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference(
					ON_SUCCESS_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__RETRY_ATTEMPTS_JAVA_LANG_NUMBER_:
			setRetryAttempts_java_lang_Number_(RETRY_ATTEMPTS_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__CODE_SHA256_JAVA_LANG_STRING_:
			return CODE_SHA256_JAVA_LANG_STRING__EDEFAULT == null ? codeSha256_java_lang_String_ != null
					: !CODE_SHA256_JAVA_LANG_STRING__EDEFAULT.equals(codeSha256_java_lang_String_);
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__DESCRIPTION_JAVA_LANG_STRING_:
			return DESCRIPTION_JAVA_LANG_STRING__EDEFAULT == null ? description_java_lang_String_ != null
					: !DESCRIPTION_JAVA_LANG_STRING__EDEFAULT.equals(description_java_lang_String_);
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__PROVISIONED_CONCURRENT_EXECUTIONS_JAVA_LANG_NUMBER_:
			return provisionedConcurrentExecutions_java_lang_Number_ != PROVISIONED_CONCURRENT_EXECUTIONS_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
			return removalPolicy_software_amazon_awscdk_core_RemovalPolicy_ != REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY__EDEFAULT;
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__MAX_EVENT_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return MAX_EVENT_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? maxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !MAX_EVENT_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(maxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__ON_FAILURE_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE:
			return ON_FAILURE_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE_EDEFAULT == null
					? onFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference != null
					: !ON_FAILURE_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE_EDEFAULT
							.equals(onFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference);
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__ON_SUCCESS_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE:
			return ON_SUCCESS_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE_EDEFAULT == null
					? onSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference != null
					: !ON_SUCCESS_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE_EDEFAULT
							.equals(onSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference);
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__RETRY_ATTEMPTS_JAVA_LANG_NUMBER_:
			return retryAttempts_java_lang_Number_ != RETRY_ATTEMPTS_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA__ADDITIONAL_CODE:
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
		result.append(" (codeSha256_java_lang_String_: ");
		result.append(codeSha256_java_lang_String_);
		result.append(", description_java_lang_String_: ");
		result.append(description_java_lang_String_);
		result.append(", provisionedConcurrentExecutions_java_lang_Number_: ");
		result.append(provisionedConcurrentExecutions_java_lang_Number_);
		result.append(", removalPolicy_software_amazon_awscdk_core_RemovalPolicy_: ");
		result.append(removalPolicy_software_amazon_awscdk_core_RemovalPolicy_);
		result.append(", maxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(maxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		result.append(", onFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference: ");
		result.append(onFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference);
		result.append(", onSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference: ");
		result.append(onSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference);
		result.append(", retryAttempts_java_lang_Number_: ");
		result.append(retryAttempts_java_lang_Number_);
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

} //VersionOptionsBuilder_lambdaImpl
