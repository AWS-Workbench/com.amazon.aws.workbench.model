/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancedTaskImageOptionsBuilder_patterns;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Load Balanced Task Image Options Builder patterns</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedTaskImageOptionsBuilder_patternsImpl#getImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference <em>Image With Container Image software amazon awscdk services ecs Container Image As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedTaskImageOptionsBuilder_patternsImpl#getContainerName_java_lang_String_ <em>Container Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedTaskImageOptionsBuilder_patternsImpl#getContainerPort_java_lang_Number_ <em>Container Port java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedTaskImageOptionsBuilder_patternsImpl#getEnableLogging_java_lang_Boolean_ <em>Enable Logging java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedTaskImageOptionsBuilder_patternsImpl#getEnvironment_java_lang_String__java_lang_String_AsMap <em>Environment java lang String java lang String As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedTaskImageOptionsBuilder_patternsImpl#getExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Execution Role With IRole software amazon awscdk services iam IRole As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedTaskImageOptionsBuilder_patternsImpl#getFamily_java_lang_String_ <em>Family java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedTaskImageOptionsBuilder_patternsImpl#getLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference <em>Log Driver With Log Driver software amazon awscdk services ecs Log Driver As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedTaskImageOptionsBuilder_patternsImpl#getSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap <em>Secrets java lang String software amazon awscdk services ecs Secret As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedTaskImageOptionsBuilder_patternsImpl#getTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Task Role With IRole software amazon awscdk services iam IRole As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedTaskImageOptionsBuilder_patternsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedTaskImageOptionsBuilder_patternsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedTaskImageOptionsBuilder_patternsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationLoadBalancedTaskImageOptionsBuilder_patternsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationLoadBalancedTaskImageOptionsBuilder_patternsImpl extends ServiceResourcesImpl
		implements ApplicationLoadBalancedTaskImageOptionsBuilder_patterns {
	/**
	 * The default value of the '{@link #getImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference() <em>Image With Container Image software amazon awscdk services ecs Container Image As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_WITH_CONTAINER_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CONTAINER_IMAGE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference() <em>Image With Container Image software amazon awscdk services ecs Container Image As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String imageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference = IMAGE_WITH_CONTAINER_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CONTAINER_IMAGE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainerName_java_lang_String_() <em>Container Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainerName_java_lang_String_() <em>Container Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String containerName_java_lang_String_ = CONTAINER_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getContainerPort_java_lang_Number_() <em>Container Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerPort_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int CONTAINER_PORT_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getContainerPort_java_lang_Number_() <em>Container Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerPort_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int containerPort_java_lang_Number_ = CONTAINER_PORT_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getEnableLogging_java_lang_Boolean_() <em>Enable Logging java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableLogging_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ENABLE_LOGGING_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnableLogging_java_lang_Boolean_() <em>Enable Logging java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableLogging_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean enableLogging_java_lang_Boolean_ = ENABLE_LOGGING_JAVA_LANG_BOOLEAN__EDEFAULT;

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
	 * The default value of the '{@link #getExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() <em>Execution Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String EXECUTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() <em>Execution Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String executionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference = EXECUTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFamily_java_lang_String_() <em>Family java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String FAMILY_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFamily_java_lang_String_() <em>Family java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String family_java_lang_String_ = FAMILY_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference() <em>Log Driver With Log Driver software amazon awscdk services ecs Log Driver As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_DRIVER_WITH_LOG_DRIVER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_LOG_DRIVER_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference() <em>Log Driver With Log Driver software amazon awscdk services ecs Log Driver As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String logDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference = LOG_DRIVER_WITH_LOG_DRIVER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_LOG_DRIVER_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap() <em>Secrets java lang String software amazon awscdk services ecs Secret As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String SECRETS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SECRET_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap() <em>Secrets java lang String software amazon awscdk services ecs Secret As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String secrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap = SECRETS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SECRET_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() <em>Task Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String TASK_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() <em>Task Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String taskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference = TASK_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageOptions";

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
	protected ApplicationLoadBalancedTaskImageOptionsBuilder_patternsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference() {
		return imageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference(
			String newImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference) {
		String oldImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference = imageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference;
		imageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference = newImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__IMAGE_WITH_CONTAINER_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CONTAINER_IMAGE_AS_REFERENCE,
					oldImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference,
					imageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContainerName_java_lang_String_() {
		return containerName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerName_java_lang_String_(String newContainerName_java_lang_String_) {
		String oldContainerName_java_lang_String_ = containerName_java_lang_String_;
		containerName_java_lang_String_ = newContainerName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__CONTAINER_NAME_JAVA_LANG_STRING_,
					oldContainerName_java_lang_String_, containerName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getContainerPort_java_lang_Number_() {
		return containerPort_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerPort_java_lang_Number_(int newContainerPort_java_lang_Number_) {
		int oldContainerPort_java_lang_Number_ = containerPort_java_lang_Number_;
		containerPort_java_lang_Number_ = newContainerPort_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__CONTAINER_PORT_JAVA_LANG_NUMBER_,
					oldContainerPort_java_lang_Number_, containerPort_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getEnableLogging_java_lang_Boolean_() {
		return enableLogging_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableLogging_java_lang_Boolean_(Boolean newEnableLogging_java_lang_Boolean_) {
		Boolean oldEnableLogging_java_lang_Boolean_ = enableLogging_java_lang_Boolean_;
		enableLogging_java_lang_Boolean_ = newEnableLogging_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__ENABLE_LOGGING_JAVA_LANG_BOOLEAN_,
					oldEnableLogging_java_lang_Boolean_, enableLogging_java_lang_Boolean_));
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
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
					oldEnvironment_java_lang_String__java_lang_String_AsMap,
					environment_java_lang_String__java_lang_String_AsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() {
		return executionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(
			String newExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference) {
		String oldExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference = executionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference;
		executionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference = newExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__EXECUTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE,
					oldExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference,
					executionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFamily_java_lang_String_() {
		return family_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFamily_java_lang_String_(String newFamily_java_lang_String_) {
		String oldFamily_java_lang_String_ = family_java_lang_String_;
		family_java_lang_String_ = newFamily_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__FAMILY_JAVA_LANG_STRING_,
					oldFamily_java_lang_String_, family_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference() {
		return logDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference(
			String newLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference) {
		String oldLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference = logDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference;
		logDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference = newLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__LOG_DRIVER_WITH_LOG_DRIVER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_LOG_DRIVER_AS_REFERENCE,
					oldLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference,
					logDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap() {
		return secrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap(
			String newSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap) {
		String oldSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap = secrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap;
		secrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap = newSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__SECRETS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SECRET_AS_MAP,
					oldSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap,
					secrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() {
		return taskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(
			String newTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference) {
		String oldTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference = taskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference;
		taskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference = newTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__TASK_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE,
					oldTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference,
					taskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference));
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
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__VAR_NAME,
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
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__IDENTIFIER,
					oldIdentifier, identifier));
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
					AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__ADDITIONAL_CODE,
					oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__IMAGE_WITH_CONTAINER_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CONTAINER_IMAGE_AS_REFERENCE:
			return getImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__CONTAINER_NAME_JAVA_LANG_STRING_:
			return getContainerName_java_lang_String_();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__CONTAINER_PORT_JAVA_LANG_NUMBER_:
			return getContainerPort_java_lang_Number_();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__ENABLE_LOGGING_JAVA_LANG_BOOLEAN_:
			return getEnableLogging_java_lang_Boolean_();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return getEnvironment_java_lang_String__java_lang_String_AsMap();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__EXECUTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			return getExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__FAMILY_JAVA_LANG_STRING_:
			return getFamily_java_lang_String_();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__LOG_DRIVER_WITH_LOG_DRIVER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_LOG_DRIVER_AS_REFERENCE:
			return getLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__SECRETS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SECRET_AS_MAP:
			return getSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__TASK_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			return getTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__IMAGE_WITH_CONTAINER_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CONTAINER_IMAGE_AS_REFERENCE:
			setImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__CONTAINER_NAME_JAVA_LANG_STRING_:
			setContainerName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__CONTAINER_PORT_JAVA_LANG_NUMBER_:
			setContainerPort_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__ENABLE_LOGGING_JAVA_LANG_BOOLEAN_:
			setEnableLogging_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setEnvironment_java_lang_String__java_lang_String_AsMap((String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__EXECUTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			setExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__FAMILY_JAVA_LANG_STRING_:
			setFamily_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__LOG_DRIVER_WITH_LOG_DRIVER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_LOG_DRIVER_AS_REFERENCE:
			setLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__SECRETS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SECRET_AS_MAP:
			setSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap((String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__TASK_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			setTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__IMAGE_WITH_CONTAINER_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CONTAINER_IMAGE_AS_REFERENCE:
			setImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference(
					IMAGE_WITH_CONTAINER_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CONTAINER_IMAGE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__CONTAINER_NAME_JAVA_LANG_STRING_:
			setContainerName_java_lang_String_(CONTAINER_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__CONTAINER_PORT_JAVA_LANG_NUMBER_:
			setContainerPort_java_lang_Number_(CONTAINER_PORT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__ENABLE_LOGGING_JAVA_LANG_BOOLEAN_:
			setEnableLogging_java_lang_Boolean_(ENABLE_LOGGING_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setEnvironment_java_lang_String__java_lang_String_AsMap(
					ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__EXECUTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			setExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(
					EXECUTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__FAMILY_JAVA_LANG_STRING_:
			setFamily_java_lang_String_(FAMILY_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__LOG_DRIVER_WITH_LOG_DRIVER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_LOG_DRIVER_AS_REFERENCE:
			setLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference(
					LOG_DRIVER_WITH_LOG_DRIVER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_LOG_DRIVER_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__SECRETS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SECRET_AS_MAP:
			setSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap(
					SECRETS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SECRET_AS_MAP_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__TASK_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			setTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(
					TASK_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__IMAGE_WITH_CONTAINER_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CONTAINER_IMAGE_AS_REFERENCE:
			return IMAGE_WITH_CONTAINER_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CONTAINER_IMAGE_AS_REFERENCE_EDEFAULT == null
					? imageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference != null
					: !IMAGE_WITH_CONTAINER_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CONTAINER_IMAGE_AS_REFERENCE_EDEFAULT
							.equals(imageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference);
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__CONTAINER_NAME_JAVA_LANG_STRING_:
			return CONTAINER_NAME_JAVA_LANG_STRING__EDEFAULT == null ? containerName_java_lang_String_ != null
					: !CONTAINER_NAME_JAVA_LANG_STRING__EDEFAULT.equals(containerName_java_lang_String_);
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__CONTAINER_PORT_JAVA_LANG_NUMBER_:
			return containerPort_java_lang_Number_ != CONTAINER_PORT_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__ENABLE_LOGGING_JAVA_LANG_BOOLEAN_:
			return ENABLE_LOGGING_JAVA_LANG_BOOLEAN__EDEFAULT == null ? enableLogging_java_lang_Boolean_ != null
					: !ENABLE_LOGGING_JAVA_LANG_BOOLEAN__EDEFAULT.equals(enableLogging_java_lang_Boolean_);
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT == null
					? environment_java_lang_String__java_lang_String_AsMap != null
					: !ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT
							.equals(environment_java_lang_String__java_lang_String_AsMap);
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__EXECUTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			return EXECUTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT == null
					? executionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference != null
					: !EXECUTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT
							.equals(executionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference);
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__FAMILY_JAVA_LANG_STRING_:
			return FAMILY_JAVA_LANG_STRING__EDEFAULT == null ? family_java_lang_String_ != null
					: !FAMILY_JAVA_LANG_STRING__EDEFAULT.equals(family_java_lang_String_);
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__LOG_DRIVER_WITH_LOG_DRIVER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_LOG_DRIVER_AS_REFERENCE:
			return LOG_DRIVER_WITH_LOG_DRIVER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_LOG_DRIVER_AS_REFERENCE_EDEFAULT == null
					? logDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference != null
					: !LOG_DRIVER_WITH_LOG_DRIVER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_LOG_DRIVER_AS_REFERENCE_EDEFAULT
							.equals(logDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference);
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__SECRETS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SECRET_AS_MAP:
			return SECRETS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SECRET_AS_MAP_EDEFAULT == null
					? secrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap != null
					: !SECRETS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SECRET_AS_MAP_EDEFAULT
							.equals(secrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap);
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__TASK_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			return TASK_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT == null
					? taskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference != null
					: !TASK_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT
							.equals(taskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference);
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
		result.append(" (imageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference: ");
		result.append(imageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference);
		result.append(", containerName_java_lang_String_: ");
		result.append(containerName_java_lang_String_);
		result.append(", containerPort_java_lang_Number_: ");
		result.append(containerPort_java_lang_Number_);
		result.append(", enableLogging_java_lang_Boolean_: ");
		result.append(enableLogging_java_lang_Boolean_);
		result.append(", environment_java_lang_String__java_lang_String_AsMap: ");
		result.append(environment_java_lang_String__java_lang_String_AsMap);
		result.append(", executionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference: ");
		result.append(executionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference);
		result.append(", family_java_lang_String_: ");
		result.append(family_java_lang_String_);
		result.append(", logDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference: ");
		result.append(logDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference);
		result.append(", secrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap: ");
		result.append(secrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap);
		result.append(", taskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference: ");
		result.append(taskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference);
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

} //ApplicationLoadBalancedTaskImageOptionsBuilder_patternsImpl
