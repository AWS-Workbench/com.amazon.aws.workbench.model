/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.DockerVolumeConfigurationBuilder_ecs;
import com.amazon.aws.workbench.model.awsworkbench.Scope;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Docker Volume Configuration Builder ecs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DockerVolumeConfigurationBuilder_ecsImpl#getDriver_java_lang_String_ <em>Driver java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DockerVolumeConfigurationBuilder_ecsImpl#getScope_software_amazon_awscdk_services_ecs_Scope_ <em>Scope software amazon awscdk services ecs Scope </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DockerVolumeConfigurationBuilder_ecsImpl#getAutoprovision_java_lang_Boolean_ <em>Autoprovision java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DockerVolumeConfigurationBuilder_ecsImpl#getDriverOpts_java_lang_String__java_lang_String_AsMap <em>Driver Opts java lang String java lang String As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DockerVolumeConfigurationBuilder_ecsImpl#getLabels_java_lang_String_AsList <em>Labels java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DockerVolumeConfigurationBuilder_ecsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DockerVolumeConfigurationBuilder_ecsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DockerVolumeConfigurationBuilder_ecsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DockerVolumeConfigurationBuilder_ecsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DockerVolumeConfigurationBuilder_ecsImpl extends ServiceResourcesImpl
		implements DockerVolumeConfigurationBuilder_ecs {
	/**
	 * The default value of the '{@link #getDriver_java_lang_String_() <em>Driver java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String DRIVER_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDriver_java_lang_String_() <em>Driver java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String driver_java_lang_String_ = DRIVER_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getScope_software_amazon_awscdk_services_ecs_Scope_() <em>Scope software amazon awscdk services ecs Scope </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope_software_amazon_awscdk_services_ecs_Scope_()
	 * @generated
	 * @ordered
	 */
	protected static final Scope SCOPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SCOPE__EDEFAULT = Scope.TASK;

	/**
	 * The cached value of the '{@link #getScope_software_amazon_awscdk_services_ecs_Scope_() <em>Scope software amazon awscdk services ecs Scope </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope_software_amazon_awscdk_services_ecs_Scope_()
	 * @generated
	 * @ordered
	 */
	protected Scope scope_software_amazon_awscdk_services_ecs_Scope_ = SCOPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SCOPE__EDEFAULT;

	/**
	 * The default value of the '{@link #getAutoprovision_java_lang_Boolean_() <em>Autoprovision java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoprovision_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AUTOPROVISION_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutoprovision_java_lang_Boolean_() <em>Autoprovision java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoprovision_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean autoprovision_java_lang_Boolean_ = AUTOPROVISION_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getDriverOpts_java_lang_String__java_lang_String_AsMap() <em>Driver Opts java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriverOpts_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String DRIVER_OPTS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDriverOpts_java_lang_String__java_lang_String_AsMap() <em>Driver Opts java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriverOpts_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String driverOpts_java_lang_String__java_lang_String_AsMap = DRIVER_OPTS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabels_java_lang_String_AsList() <em>Labels java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String LABELS_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabels_java_lang_String_AsList() <em>Labels java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String labels_java_lang_String_AsList = LABELS_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ecs.DockerVolumeConfiguration";

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
	protected DockerVolumeConfigurationBuilder_ecsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDriver_java_lang_String_() {
		return driver_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDriver_java_lang_String_(String newDriver_java_lang_String_) {
		String oldDriver_java_lang_String_ = driver_java_lang_String_;
		driver_java_lang_String_ = newDriver_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__DRIVER_JAVA_LANG_STRING_,
					oldDriver_java_lang_String_, driver_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scope getScope_software_amazon_awscdk_services_ecs_Scope_() {
		return scope_software_amazon_awscdk_services_ecs_Scope_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScope_software_amazon_awscdk_services_ecs_Scope_(
			Scope newScope_software_amazon_awscdk_services_ecs_Scope_) {
		Scope oldScope_software_amazon_awscdk_services_ecs_Scope_ = scope_software_amazon_awscdk_services_ecs_Scope_;
		scope_software_amazon_awscdk_services_ecs_Scope_ = newScope_software_amazon_awscdk_services_ecs_Scope_ == null
				? SCOPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SCOPE__EDEFAULT
				: newScope_software_amazon_awscdk_services_ecs_Scope_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__SCOPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SCOPE_,
					oldScope_software_amazon_awscdk_services_ecs_Scope_,
					scope_software_amazon_awscdk_services_ecs_Scope_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAutoprovision_java_lang_Boolean_() {
		return autoprovision_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoprovision_java_lang_Boolean_(Boolean newAutoprovision_java_lang_Boolean_) {
		Boolean oldAutoprovision_java_lang_Boolean_ = autoprovision_java_lang_Boolean_;
		autoprovision_java_lang_Boolean_ = newAutoprovision_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__AUTOPROVISION_JAVA_LANG_BOOLEAN_,
					oldAutoprovision_java_lang_Boolean_, autoprovision_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDriverOpts_java_lang_String__java_lang_String_AsMap() {
		return driverOpts_java_lang_String__java_lang_String_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDriverOpts_java_lang_String__java_lang_String_AsMap(
			String newDriverOpts_java_lang_String__java_lang_String_AsMap) {
		String oldDriverOpts_java_lang_String__java_lang_String_AsMap = driverOpts_java_lang_String__java_lang_String_AsMap;
		driverOpts_java_lang_String__java_lang_String_AsMap = newDriverOpts_java_lang_String__java_lang_String_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__DRIVER_OPTS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
					oldDriverOpts_java_lang_String__java_lang_String_AsMap,
					driverOpts_java_lang_String__java_lang_String_AsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabels_java_lang_String_AsList() {
		return labels_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabels_java_lang_String_AsList(String newLabels_java_lang_String_AsList) {
		String oldLabels_java_lang_String_AsList = labels_java_lang_String_AsList;
		labels_java_lang_String_AsList = newLabels_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__LABELS_JAVA_LANG_STRING_AS_LIST,
					oldLabels_java_lang_String_AsList, labels_java_lang_String_AsList));
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
					AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__IDENTIFIER, oldIdentifier,
					identifier));
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
					AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__DRIVER_JAVA_LANG_STRING_:
			return getDriver_java_lang_String_();
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__SCOPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SCOPE_:
			return getScope_software_amazon_awscdk_services_ecs_Scope_();
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__AUTOPROVISION_JAVA_LANG_BOOLEAN_:
			return getAutoprovision_java_lang_Boolean_();
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__DRIVER_OPTS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return getDriverOpts_java_lang_String__java_lang_String_AsMap();
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__LABELS_JAVA_LANG_STRING_AS_LIST:
			return getLabels_java_lang_String_AsList();
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__DRIVER_JAVA_LANG_STRING_:
			setDriver_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__SCOPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SCOPE_:
			setScope_software_amazon_awscdk_services_ecs_Scope_((Scope) newValue);
			return;
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__AUTOPROVISION_JAVA_LANG_BOOLEAN_:
			setAutoprovision_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__DRIVER_OPTS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setDriverOpts_java_lang_String__java_lang_String_AsMap((String) newValue);
			return;
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__LABELS_JAVA_LANG_STRING_AS_LIST:
			setLabels_java_lang_String_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__DRIVER_JAVA_LANG_STRING_:
			setDriver_java_lang_String_(DRIVER_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__SCOPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SCOPE_:
			setScope_software_amazon_awscdk_services_ecs_Scope_(
					SCOPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SCOPE__EDEFAULT);
			return;
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__AUTOPROVISION_JAVA_LANG_BOOLEAN_:
			setAutoprovision_java_lang_Boolean_(AUTOPROVISION_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__DRIVER_OPTS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setDriverOpts_java_lang_String__java_lang_String_AsMap(
					DRIVER_OPTS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT);
			return;
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__LABELS_JAVA_LANG_STRING_AS_LIST:
			setLabels_java_lang_String_AsList(LABELS_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__DRIVER_JAVA_LANG_STRING_:
			return DRIVER_JAVA_LANG_STRING__EDEFAULT == null ? driver_java_lang_String_ != null
					: !DRIVER_JAVA_LANG_STRING__EDEFAULT.equals(driver_java_lang_String_);
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__SCOPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SCOPE_:
			return scope_software_amazon_awscdk_services_ecs_Scope_ != SCOPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SCOPE__EDEFAULT;
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__AUTOPROVISION_JAVA_LANG_BOOLEAN_:
			return AUTOPROVISION_JAVA_LANG_BOOLEAN__EDEFAULT == null ? autoprovision_java_lang_Boolean_ != null
					: !AUTOPROVISION_JAVA_LANG_BOOLEAN__EDEFAULT.equals(autoprovision_java_lang_Boolean_);
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__DRIVER_OPTS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return DRIVER_OPTS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT == null
					? driverOpts_java_lang_String__java_lang_String_AsMap != null
					: !DRIVER_OPTS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT
							.equals(driverOpts_java_lang_String__java_lang_String_AsMap);
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__LABELS_JAVA_LANG_STRING_AS_LIST:
			return LABELS_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null ? labels_java_lang_String_AsList != null
					: !LABELS_JAVA_LANG_STRING_AS_LIST_EDEFAULT.equals(labels_java_lang_String_AsList);
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__ADDITIONAL_CODE:
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
		result.append(" (driver_java_lang_String_: ");
		result.append(driver_java_lang_String_);
		result.append(", scope_software_amazon_awscdk_services_ecs_Scope_: ");
		result.append(scope_software_amazon_awscdk_services_ecs_Scope_);
		result.append(", autoprovision_java_lang_Boolean_: ");
		result.append(autoprovision_java_lang_Boolean_);
		result.append(", driverOpts_java_lang_String__java_lang_String_AsMap: ");
		result.append(driverOpts_java_lang_String__java_lang_String_AsMap);
		result.append(", labels_java_lang_String_AsList: ");
		result.append(labels_java_lang_String_AsList);
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

} //DockerVolumeConfigurationBuilder_ecsImpl
