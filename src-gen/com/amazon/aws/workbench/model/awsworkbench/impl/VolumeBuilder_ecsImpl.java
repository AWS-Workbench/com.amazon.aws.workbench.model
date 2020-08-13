/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.VolumeBuilder_ecs;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Volume Builder ecs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VolumeBuilder_ecsImpl#getName_java_lang_String_ <em>Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VolumeBuilder_ecsImpl#getDockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReference <em>Docker Volume Configuration With Docker Volume Configuration software amazon awscdk services ecs Docker Volume Configuration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VolumeBuilder_ecsImpl#getHostWithHost_software_amazon_awscdk_services_ecs_Host_AsReference <em>Host With Host software amazon awscdk services ecs Host As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VolumeBuilder_ecsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VolumeBuilder_ecsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VolumeBuilder_ecsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.VolumeBuilder_ecsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VolumeBuilder_ecsImpl extends ServiceResourcesImpl implements VolumeBuilder_ecs {
	/**
	 * The default value of the '{@link #getName_java_lang_String_() <em>Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName_java_lang_String_() <em>Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String name_java_lang_String_ = NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getDockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReference() <em>Docker Volume Configuration With Docker Volume Configuration software amazon awscdk services ecs Docker Volume Configuration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCKER_VOLUME_CONFIGURATION_WITH_DOCKER_VOLUME_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_DOCKER_VOLUME_CONFIGURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReference() <em>Docker Volume Configuration With Docker Volume Configuration software amazon awscdk services ecs Docker Volume Configuration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String dockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReference = DOCKER_VOLUME_CONFIGURATION_WITH_DOCKER_VOLUME_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_DOCKER_VOLUME_CONFIGURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostWithHost_software_amazon_awscdk_services_ecs_Host_AsReference() <em>Host With Host software amazon awscdk services ecs Host As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostWithHost_software_amazon_awscdk_services_ecs_Host_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_WITH_HOST_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_HOST_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostWithHost_software_amazon_awscdk_services_ecs_Host_AsReference() <em>Host With Host software amazon awscdk services ecs Host As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostWithHost_software_amazon_awscdk_services_ecs_Host_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String hostWithHost_software_amazon_awscdk_services_ecs_Host_AsReference = HOST_WITH_HOST_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_HOST_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ecs.Volume";

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
	protected VolumeBuilder_ecsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.VOLUME_BUILDER_ECS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName_java_lang_String_() {
		return name_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName_java_lang_String_(String newName_java_lang_String_) {
		String oldName_java_lang_String_ = name_java_lang_String_;
		name_java_lang_String_ = newName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.VOLUME_BUILDER_ECS__NAME_JAVA_LANG_STRING_, oldName_java_lang_String_,
					name_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReference() {
		return dockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReference(
			String newDockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReference) {
		String oldDockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReference = dockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReference;
		dockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReference = newDockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.VOLUME_BUILDER_ECS__DOCKER_VOLUME_CONFIGURATION_WITH_DOCKER_VOLUME_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_DOCKER_VOLUME_CONFIGURATION_AS_REFERENCE,
					oldDockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReference,
					dockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHostWithHost_software_amazon_awscdk_services_ecs_Host_AsReference() {
		return hostWithHost_software_amazon_awscdk_services_ecs_Host_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostWithHost_software_amazon_awscdk_services_ecs_Host_AsReference(
			String newHostWithHost_software_amazon_awscdk_services_ecs_Host_AsReference) {
		String oldHostWithHost_software_amazon_awscdk_services_ecs_Host_AsReference = hostWithHost_software_amazon_awscdk_services_ecs_Host_AsReference;
		hostWithHost_software_amazon_awscdk_services_ecs_Host_AsReference = newHostWithHost_software_amazon_awscdk_services_ecs_Host_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.VOLUME_BUILDER_ECS__HOST_WITH_HOST_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_HOST_AS_REFERENCE,
					oldHostWithHost_software_amazon_awscdk_services_ecs_Host_AsReference,
					hostWithHost_software_amazon_awscdk_services_ecs_Host_AsReference));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.VOLUME_BUILDER_ECS__VAR_NAME,
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
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.VOLUME_BUILDER_ECS__IDENTIFIER,
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
					AwsworkbenchPackage.VOLUME_BUILDER_ECS__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS__NAME_JAVA_LANG_STRING_:
			return getName_java_lang_String_();
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS__DOCKER_VOLUME_CONFIGURATION_WITH_DOCKER_VOLUME_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_DOCKER_VOLUME_CONFIGURATION_AS_REFERENCE:
			return getDockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReference();
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS__HOST_WITH_HOST_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_HOST_AS_REFERENCE:
			return getHostWithHost_software_amazon_awscdk_services_ecs_Host_AsReference();
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS__NAME_JAVA_LANG_STRING_:
			setName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS__DOCKER_VOLUME_CONFIGURATION_WITH_DOCKER_VOLUME_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_DOCKER_VOLUME_CONFIGURATION_AS_REFERENCE:
			setDockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS__HOST_WITH_HOST_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_HOST_AS_REFERENCE:
			setHostWithHost_software_amazon_awscdk_services_ecs_Host_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS__NAME_JAVA_LANG_STRING_:
			setName_java_lang_String_(NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS__DOCKER_VOLUME_CONFIGURATION_WITH_DOCKER_VOLUME_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_DOCKER_VOLUME_CONFIGURATION_AS_REFERENCE:
			setDockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReference(
					DOCKER_VOLUME_CONFIGURATION_WITH_DOCKER_VOLUME_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_DOCKER_VOLUME_CONFIGURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS__HOST_WITH_HOST_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_HOST_AS_REFERENCE:
			setHostWithHost_software_amazon_awscdk_services_ecs_Host_AsReference(
					HOST_WITH_HOST_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_HOST_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS__NAME_JAVA_LANG_STRING_:
			return NAME_JAVA_LANG_STRING__EDEFAULT == null ? name_java_lang_String_ != null
					: !NAME_JAVA_LANG_STRING__EDEFAULT.equals(name_java_lang_String_);
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS__DOCKER_VOLUME_CONFIGURATION_WITH_DOCKER_VOLUME_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_DOCKER_VOLUME_CONFIGURATION_AS_REFERENCE:
			return DOCKER_VOLUME_CONFIGURATION_WITH_DOCKER_VOLUME_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_DOCKER_VOLUME_CONFIGURATION_AS_REFERENCE_EDEFAULT == null
					? dockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReference != null
					: !DOCKER_VOLUME_CONFIGURATION_WITH_DOCKER_VOLUME_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_DOCKER_VOLUME_CONFIGURATION_AS_REFERENCE_EDEFAULT
							.equals(dockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReference);
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS__HOST_WITH_HOST_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_HOST_AS_REFERENCE:
			return HOST_WITH_HOST_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_HOST_AS_REFERENCE_EDEFAULT == null
					? hostWithHost_software_amazon_awscdk_services_ecs_Host_AsReference != null
					: !HOST_WITH_HOST_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_HOST_AS_REFERENCE_EDEFAULT
							.equals(hostWithHost_software_amazon_awscdk_services_ecs_Host_AsReference);
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS__ADDITIONAL_CODE:
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
		result.append(" (name_java_lang_String_: ");
		result.append(name_java_lang_String_);
		result.append(
				", dockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReference: ");
		result.append(
				dockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReference);
		result.append(", hostWithHost_software_amazon_awscdk_services_ecs_Host_AsReference: ");
		result.append(hostWithHost_software_amazon_awscdk_services_ecs_Host_AsReference);
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

} //VolumeBuilder_ecsImpl
