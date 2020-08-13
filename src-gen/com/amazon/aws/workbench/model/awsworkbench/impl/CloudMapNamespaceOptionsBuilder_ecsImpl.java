/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.CloudMapNamespaceOptionsBuilder_ecs;
import com.amazon.aws.workbench.model.awsworkbench.NamespaceType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud Map Namespace Options Builder ecs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CloudMapNamespaceOptionsBuilder_ecsImpl#getName_java_lang_String_ <em>Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CloudMapNamespaceOptionsBuilder_ecsImpl#getType_software_amazon_awscdk_services_servicediscovery_NamespaceType_ <em>Type software amazon awscdk services servicediscovery Namespace Type </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CloudMapNamespaceOptionsBuilder_ecsImpl#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CloudMapNamespaceOptionsBuilder_ecsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CloudMapNamespaceOptionsBuilder_ecsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CloudMapNamespaceOptionsBuilder_ecsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CloudMapNamespaceOptionsBuilder_ecsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CloudMapNamespaceOptionsBuilder_ecsImpl extends ServiceResourcesImpl
		implements CloudMapNamespaceOptionsBuilder_ecs {
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
	 * The default value of the '{@link #getType_software_amazon_awscdk_services_servicediscovery_NamespaceType_() <em>Type software amazon awscdk services servicediscovery Namespace Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_software_amazon_awscdk_services_servicediscovery_NamespaceType_()
	 * @generated
	 * @ordered
	 */
	protected static final NamespaceType TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_NAMESPACE_TYPE__EDEFAULT = NamespaceType.HTTP;

	/**
	 * The cached value of the '{@link #getType_software_amazon_awscdk_services_servicediscovery_NamespaceType_() <em>Type software amazon awscdk services servicediscovery Namespace Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_software_amazon_awscdk_services_servicediscovery_NamespaceType_()
	 * @generated
	 * @ordered
	 */
	protected NamespaceType type_software_amazon_awscdk_services_servicediscovery_NamespaceType_ = TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_NAMESPACE_TYPE__EDEFAULT;

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
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions";

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
	protected CloudMapNamespaceOptionsBuilder_ecsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS;
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
					AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS__NAME_JAVA_LANG_STRING_,
					oldName_java_lang_String_, name_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamespaceType getType_software_amazon_awscdk_services_servicediscovery_NamespaceType_() {
		return type_software_amazon_awscdk_services_servicediscovery_NamespaceType_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType_software_amazon_awscdk_services_servicediscovery_NamespaceType_(
			NamespaceType newType_software_amazon_awscdk_services_servicediscovery_NamespaceType_) {
		NamespaceType oldType_software_amazon_awscdk_services_servicediscovery_NamespaceType_ = type_software_amazon_awscdk_services_servicediscovery_NamespaceType_;
		type_software_amazon_awscdk_services_servicediscovery_NamespaceType_ = newType_software_amazon_awscdk_services_servicediscovery_NamespaceType_ == null
				? TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_NAMESPACE_TYPE__EDEFAULT
				: newType_software_amazon_awscdk_services_servicediscovery_NamespaceType_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS__TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_NAMESPACE_TYPE_,
					oldType_software_amazon_awscdk_services_servicediscovery_NamespaceType_,
					type_software_amazon_awscdk_services_servicediscovery_NamespaceType_));
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
					AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE,
					oldVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference,
					vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference));
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
					AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS__IDENTIFIER, oldIdentifier,
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
					AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS__NAME_JAVA_LANG_STRING_:
			return getName_java_lang_String_();
		case AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS__TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_NAMESPACE_TYPE_:
			return getType_software_amazon_awscdk_services_servicediscovery_NamespaceType_();
		case AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			return getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();
		case AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS__NAME_JAVA_LANG_STRING_:
			setName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS__TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_NAMESPACE_TYPE_:
			setType_software_amazon_awscdk_services_servicediscovery_NamespaceType_((NamespaceType) newValue);
			return;
		case AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS__NAME_JAVA_LANG_STRING_:
			setName_java_lang_String_(NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS__TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_NAMESPACE_TYPE_:
			setType_software_amazon_awscdk_services_servicediscovery_NamespaceType_(
					TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_NAMESPACE_TYPE__EDEFAULT);
			return;
		case AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(
					VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS__NAME_JAVA_LANG_STRING_:
			return NAME_JAVA_LANG_STRING__EDEFAULT == null ? name_java_lang_String_ != null
					: !NAME_JAVA_LANG_STRING__EDEFAULT.equals(name_java_lang_String_);
		case AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS__TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_NAMESPACE_TYPE_:
			return type_software_amazon_awscdk_services_servicediscovery_NamespaceType_ != TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_NAMESPACE_TYPE__EDEFAULT;
		case AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			return VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT == null
					? vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference != null
					: !VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT
							.equals(vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference);
		case AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS__ADDITIONAL_CODE:
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
		result.append(", type_software_amazon_awscdk_services_servicediscovery_NamespaceType_: ");
		result.append(type_software_amazon_awscdk_services_servicediscovery_NamespaceType_);
		result.append(", vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference: ");
		result.append(vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference);
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

} //CloudMapNamespaceOptionsBuilder_ecsImpl
