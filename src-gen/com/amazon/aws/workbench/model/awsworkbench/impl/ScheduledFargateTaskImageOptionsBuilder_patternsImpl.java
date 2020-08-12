/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.ScheduledFargateTaskImageOptionsBuilder_patterns;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduled Fargate Task Image Options Builder patterns</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ScheduledFargateTaskImageOptionsBuilder_patternsImpl#getCpu_java_lang_Number_ <em>Cpu java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ScheduledFargateTaskImageOptionsBuilder_patternsImpl#getMemoryLimitMiB_java_lang_Number_ <em>Memory Limit Mi Bjava lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ScheduledFargateTaskImageOptionsBuilder_patternsImpl#getImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference <em>Image With Container Image software amazon awscdk services ecs Container Image As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ScheduledFargateTaskImageOptionsBuilder_patternsImpl#getCommand_java_lang_String_AsList <em>Command java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ScheduledFargateTaskImageOptionsBuilder_patternsImpl#getEnvironment_java_lang_String__java_lang_String_AsMap <em>Environment java lang String java lang String As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ScheduledFargateTaskImageOptionsBuilder_patternsImpl#getLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference <em>Log Driver With Log Driver software amazon awscdk services ecs Log Driver As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ScheduledFargateTaskImageOptionsBuilder_patternsImpl#getSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap <em>Secrets java lang String software amazon awscdk services ecs Secret As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ScheduledFargateTaskImageOptionsBuilder_patternsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ScheduledFargateTaskImageOptionsBuilder_patternsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ScheduledFargateTaskImageOptionsBuilder_patternsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ScheduledFargateTaskImageOptionsBuilder_patternsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScheduledFargateTaskImageOptionsBuilder_patternsImpl extends MinimalEObjectImpl.Container
		implements ScheduledFargateTaskImageOptionsBuilder_patterns {
	/**
	 * The default value of the '{@link #getCpu_java_lang_Number_() <em>Cpu java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int CPU_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCpu_java_lang_Number_() <em>Cpu java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int cpu_java_lang_Number_ = CPU_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getMemoryLimitMiB_java_lang_Number_() <em>Memory Limit Mi Bjava lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryLimitMiB_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemoryLimitMiB_java_lang_Number_() <em>Memory Limit Mi Bjava lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryLimitMiB_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int memoryLimitMiB_java_lang_Number_ = MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER__EDEFAULT;

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
	 * The default value of the '{@link #getCommand_java_lang_String_AsList() <em>Command java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommand_java_lang_String_AsList() <em>Command java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String command_java_lang_String_AsList = COMMAND_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

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
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskImageOptions";

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
	protected ScheduledFargateTaskImageOptionsBuilder_patternsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCpu_java_lang_Number_() {
		return cpu_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCpu_java_lang_Number_(int newCpu_java_lang_Number_) {
		int oldCpu_java_lang_Number_ = cpu_java_lang_Number_;
		cpu_java_lang_Number_ = newCpu_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__CPU_JAVA_LANG_NUMBER_,
					oldCpu_java_lang_Number_, cpu_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMemoryLimitMiB_java_lang_Number_() {
		return memoryLimitMiB_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemoryLimitMiB_java_lang_Number_(int newMemoryLimitMiB_java_lang_Number_) {
		int oldMemoryLimitMiB_java_lang_Number_ = memoryLimitMiB_java_lang_Number_;
		memoryLimitMiB_java_lang_Number_ = newMemoryLimitMiB_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER_,
					oldMemoryLimitMiB_java_lang_Number_, memoryLimitMiB_java_lang_Number_));
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
					AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__IMAGE_WITH_CONTAINER_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CONTAINER_IMAGE_AS_REFERENCE,
					oldImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference,
					imageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommand_java_lang_String_AsList() {
		return command_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommand_java_lang_String_AsList(String newCommand_java_lang_String_AsList) {
		String oldCommand_java_lang_String_AsList = command_java_lang_String_AsList;
		command_java_lang_String_AsList = newCommand_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__COMMAND_JAVA_LANG_STRING_AS_LIST,
					oldCommand_java_lang_String_AsList, command_java_lang_String_AsList));
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
					AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
					oldEnvironment_java_lang_String__java_lang_String_AsMap,
					environment_java_lang_String__java_lang_String_AsMap));
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
					AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__LOG_DRIVER_WITH_LOG_DRIVER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_LOG_DRIVER_AS_REFERENCE,
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
					AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__SECRETS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SECRET_AS_MAP,
					oldSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap,
					secrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap));
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
					AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__VAR_NAME, oldVarName,
					varName));
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
					AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__IDENTIFIER,
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
					AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__ADDITIONAL_CODE,
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
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__CPU_JAVA_LANG_NUMBER_:
			return getCpu_java_lang_Number_();
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER_:
			return getMemoryLimitMiB_java_lang_Number_();
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__IMAGE_WITH_CONTAINER_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CONTAINER_IMAGE_AS_REFERENCE:
			return getImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference();
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__COMMAND_JAVA_LANG_STRING_AS_LIST:
			return getCommand_java_lang_String_AsList();
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return getEnvironment_java_lang_String__java_lang_String_AsMap();
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__LOG_DRIVER_WITH_LOG_DRIVER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_LOG_DRIVER_AS_REFERENCE:
			return getLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference();
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__SECRETS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SECRET_AS_MAP:
			return getSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap();
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__CPU_JAVA_LANG_NUMBER_:
			setCpu_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER_:
			setMemoryLimitMiB_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__IMAGE_WITH_CONTAINER_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CONTAINER_IMAGE_AS_REFERENCE:
			setImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__COMMAND_JAVA_LANG_STRING_AS_LIST:
			setCommand_java_lang_String_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setEnvironment_java_lang_String__java_lang_String_AsMap((String) newValue);
			return;
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__LOG_DRIVER_WITH_LOG_DRIVER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_LOG_DRIVER_AS_REFERENCE:
			setLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__SECRETS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SECRET_AS_MAP:
			setSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap((String) newValue);
			return;
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__CPU_JAVA_LANG_NUMBER_:
			setCpu_java_lang_Number_(CPU_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER_:
			setMemoryLimitMiB_java_lang_Number_(MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__IMAGE_WITH_CONTAINER_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CONTAINER_IMAGE_AS_REFERENCE:
			setImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference(
					IMAGE_WITH_CONTAINER_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CONTAINER_IMAGE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__COMMAND_JAVA_LANG_STRING_AS_LIST:
			setCommand_java_lang_String_AsList(COMMAND_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setEnvironment_java_lang_String__java_lang_String_AsMap(
					ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT);
			return;
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__LOG_DRIVER_WITH_LOG_DRIVER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_LOG_DRIVER_AS_REFERENCE:
			setLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference(
					LOG_DRIVER_WITH_LOG_DRIVER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_LOG_DRIVER_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__SECRETS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SECRET_AS_MAP:
			setSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap(
					SECRETS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SECRET_AS_MAP_EDEFAULT);
			return;
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__CPU_JAVA_LANG_NUMBER_:
			return cpu_java_lang_Number_ != CPU_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER_:
			return memoryLimitMiB_java_lang_Number_ != MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__IMAGE_WITH_CONTAINER_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CONTAINER_IMAGE_AS_REFERENCE:
			return IMAGE_WITH_CONTAINER_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CONTAINER_IMAGE_AS_REFERENCE_EDEFAULT == null
					? imageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference != null
					: !IMAGE_WITH_CONTAINER_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CONTAINER_IMAGE_AS_REFERENCE_EDEFAULT
							.equals(imageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference);
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__COMMAND_JAVA_LANG_STRING_AS_LIST:
			return COMMAND_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null ? command_java_lang_String_AsList != null
					: !COMMAND_JAVA_LANG_STRING_AS_LIST_EDEFAULT.equals(command_java_lang_String_AsList);
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT == null
					? environment_java_lang_String__java_lang_String_AsMap != null
					: !ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT
							.equals(environment_java_lang_String__java_lang_String_AsMap);
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__LOG_DRIVER_WITH_LOG_DRIVER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_LOG_DRIVER_AS_REFERENCE:
			return LOG_DRIVER_WITH_LOG_DRIVER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_LOG_DRIVER_AS_REFERENCE_EDEFAULT == null
					? logDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference != null
					: !LOG_DRIVER_WITH_LOG_DRIVER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_LOG_DRIVER_AS_REFERENCE_EDEFAULT
							.equals(logDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference);
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__SECRETS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SECRET_AS_MAP:
			return SECRETS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SECRET_AS_MAP_EDEFAULT == null
					? secrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap != null
					: !SECRETS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SECRET_AS_MAP_EDEFAULT
							.equals(secrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap);
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
		result.append(" (cpu_java_lang_Number_: ");
		result.append(cpu_java_lang_Number_);
		result.append(", memoryLimitMiB_java_lang_Number_: ");
		result.append(memoryLimitMiB_java_lang_Number_);
		result.append(", imageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference: ");
		result.append(imageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference);
		result.append(", command_java_lang_String_AsList: ");
		result.append(command_java_lang_String_AsList);
		result.append(", environment_java_lang_String__java_lang_String_AsMap: ");
		result.append(environment_java_lang_String__java_lang_String_AsMap);
		result.append(", logDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference: ");
		result.append(logDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference);
		result.append(", secrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap: ");
		result.append(secrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap);
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

} //ScheduledFargateTaskImageOptionsBuilder_patternsImpl
