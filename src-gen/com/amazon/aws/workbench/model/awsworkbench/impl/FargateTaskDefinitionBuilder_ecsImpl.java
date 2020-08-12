/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.FargateTaskDefinitionBuilder_ecs;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fargate Task Definition Builder ecs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FargateTaskDefinitionBuilder_ecsImpl#getExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Execution Role With IRole software amazon awscdk services iam IRole As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FargateTaskDefinitionBuilder_ecsImpl#getFamily_java_lang_String_ <em>Family java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FargateTaskDefinitionBuilder_ecsImpl#getProxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference <em>Proxy Configuration With Proxy Configuration software amazon awscdk services ecs Proxy Configuration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FargateTaskDefinitionBuilder_ecsImpl#getTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Task Role With IRole software amazon awscdk services iam IRole As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FargateTaskDefinitionBuilder_ecsImpl#getVolumes_software_amazon_awscdk_services_ecs_Volume_AsList <em>Volumes software amazon awscdk services ecs Volume As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FargateTaskDefinitionBuilder_ecsImpl#getCpu_java_lang_Number_ <em>Cpu java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FargateTaskDefinitionBuilder_ecsImpl#getMemoryLimitMiB_java_lang_Number_ <em>Memory Limit Mi Bjava lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FargateTaskDefinitionBuilder_ecsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FargateTaskDefinitionBuilder_ecsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FargateTaskDefinitionBuilder_ecsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.FargateTaskDefinitionBuilder_ecsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FargateTaskDefinitionBuilder_ecsImpl extends MinimalEObjectImpl.Container
		implements FargateTaskDefinitionBuilder_ecs {
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
	 * The default value of the '{@link #getProxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference() <em>Proxy Configuration With Proxy Configuration software amazon awscdk services ecs Proxy Configuration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String PROXY_CONFIGURATION_WITH_PROXY_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROXY_CONFIGURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference() <em>Proxy Configuration With Proxy Configuration software amazon awscdk services ecs Proxy Configuration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String proxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference = PROXY_CONFIGURATION_WITH_PROXY_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROXY_CONFIGURATION_AS_REFERENCE_EDEFAULT;

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
	 * The default value of the '{@link #getVolumes_software_amazon_awscdk_services_ecs_Volume_AsList() <em>Volumes software amazon awscdk services ecs Volume As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumes_software_amazon_awscdk_services_ecs_Volume_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLUMES_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_VOLUME_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVolumes_software_amazon_awscdk_services_ecs_Volume_AsList() <em>Volumes software amazon awscdk services ecs Volume As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumes_software_amazon_awscdk_services_ecs_Volume_AsList()
	 * @generated
	 * @ordered
	 */
	protected String volumes_software_amazon_awscdk_services_ecs_Volume_AsList = VOLUMES_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_VOLUME_AS_LIST_EDEFAULT;

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
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ecs.FargateTaskDefinition";

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
	protected FargateTaskDefinitionBuilder_ecsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.FARGATE_TASK_DEFINITION_BUILDER_ECS;
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
					AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__EXECUTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE,
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
					AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__FAMILY_JAVA_LANG_STRING_,
					oldFamily_java_lang_String_, family_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference() {
		return proxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference(
			String newProxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference) {
		String oldProxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference = proxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference;
		proxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference = newProxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__PROXY_CONFIGURATION_WITH_PROXY_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROXY_CONFIGURATION_AS_REFERENCE,
					oldProxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference,
					proxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference));
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
					AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__TASK_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE,
					oldTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference,
					taskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVolumes_software_amazon_awscdk_services_ecs_Volume_AsList() {
		return volumes_software_amazon_awscdk_services_ecs_Volume_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolumes_software_amazon_awscdk_services_ecs_Volume_AsList(
			String newVolumes_software_amazon_awscdk_services_ecs_Volume_AsList) {
		String oldVolumes_software_amazon_awscdk_services_ecs_Volume_AsList = volumes_software_amazon_awscdk_services_ecs_Volume_AsList;
		volumes_software_amazon_awscdk_services_ecs_Volume_AsList = newVolumes_software_amazon_awscdk_services_ecs_Volume_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__VOLUMES_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_VOLUME_AS_LIST,
					oldVolumes_software_amazon_awscdk_services_ecs_Volume_AsList,
					volumes_software_amazon_awscdk_services_ecs_Volume_AsList));
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
					AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__CPU_JAVA_LANG_NUMBER_,
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
					AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER_,
					oldMemoryLimitMiB_java_lang_Number_, memoryLimitMiB_java_lang_Number_));
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
					AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__EXECUTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			return getExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__FAMILY_JAVA_LANG_STRING_:
			return getFamily_java_lang_String_();
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__PROXY_CONFIGURATION_WITH_PROXY_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROXY_CONFIGURATION_AS_REFERENCE:
			return getProxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference();
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__TASK_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			return getTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__VOLUMES_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_VOLUME_AS_LIST:
			return getVolumes_software_amazon_awscdk_services_ecs_Volume_AsList();
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__CPU_JAVA_LANG_NUMBER_:
			return getCpu_java_lang_Number_();
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER_:
			return getMemoryLimitMiB_java_lang_Number_();
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__EXECUTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			setExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__FAMILY_JAVA_LANG_STRING_:
			setFamily_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__PROXY_CONFIGURATION_WITH_PROXY_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROXY_CONFIGURATION_AS_REFERENCE:
			setProxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__TASK_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			setTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__VOLUMES_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_VOLUME_AS_LIST:
			setVolumes_software_amazon_awscdk_services_ecs_Volume_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__CPU_JAVA_LANG_NUMBER_:
			setCpu_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER_:
			setMemoryLimitMiB_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__EXECUTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			setExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(
					EXECUTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__FAMILY_JAVA_LANG_STRING_:
			setFamily_java_lang_String_(FAMILY_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__PROXY_CONFIGURATION_WITH_PROXY_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROXY_CONFIGURATION_AS_REFERENCE:
			setProxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference(
					PROXY_CONFIGURATION_WITH_PROXY_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROXY_CONFIGURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__TASK_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			setTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(
					TASK_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__VOLUMES_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_VOLUME_AS_LIST:
			setVolumes_software_amazon_awscdk_services_ecs_Volume_AsList(
					VOLUMES_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_VOLUME_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__CPU_JAVA_LANG_NUMBER_:
			setCpu_java_lang_Number_(CPU_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER_:
			setMemoryLimitMiB_java_lang_Number_(MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__EXECUTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			return EXECUTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT == null
					? executionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference != null
					: !EXECUTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT
							.equals(executionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference);
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__FAMILY_JAVA_LANG_STRING_:
			return FAMILY_JAVA_LANG_STRING__EDEFAULT == null ? family_java_lang_String_ != null
					: !FAMILY_JAVA_LANG_STRING__EDEFAULT.equals(family_java_lang_String_);
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__PROXY_CONFIGURATION_WITH_PROXY_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROXY_CONFIGURATION_AS_REFERENCE:
			return PROXY_CONFIGURATION_WITH_PROXY_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROXY_CONFIGURATION_AS_REFERENCE_EDEFAULT == null
					? proxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference != null
					: !PROXY_CONFIGURATION_WITH_PROXY_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROXY_CONFIGURATION_AS_REFERENCE_EDEFAULT
							.equals(proxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference);
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__TASK_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			return TASK_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT == null
					? taskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference != null
					: !TASK_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT
							.equals(taskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference);
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__VOLUMES_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_VOLUME_AS_LIST:
			return VOLUMES_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_VOLUME_AS_LIST_EDEFAULT == null
					? volumes_software_amazon_awscdk_services_ecs_Volume_AsList != null
					: !VOLUMES_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_VOLUME_AS_LIST_EDEFAULT
							.equals(volumes_software_amazon_awscdk_services_ecs_Volume_AsList);
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__CPU_JAVA_LANG_NUMBER_:
			return cpu_java_lang_Number_ != CPU_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER_:
			return memoryLimitMiB_java_lang_Number_ != MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__ADDITIONAL_CODE:
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
		result.append(" (executionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference: ");
		result.append(executionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference);
		result.append(", family_java_lang_String_: ");
		result.append(family_java_lang_String_);
		result.append(
				", proxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference: ");
		result.append(
				proxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference);
		result.append(", taskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference: ");
		result.append(taskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference);
		result.append(", volumes_software_amazon_awscdk_services_ecs_Volume_AsList: ");
		result.append(volumes_software_amazon_awscdk_services_ecs_Volume_AsList);
		result.append(", cpu_java_lang_Number_: ");
		result.append(cpu_java_lang_Number_);
		result.append(", memoryLimitMiB_java_lang_Number_: ");
		result.append(memoryLimitMiB_java_lang_Number_);
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

} //FargateTaskDefinitionBuilder_ecsImpl
