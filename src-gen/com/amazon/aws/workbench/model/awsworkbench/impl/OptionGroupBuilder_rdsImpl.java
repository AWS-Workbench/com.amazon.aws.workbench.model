/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.OptionGroupBuilder_rds;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Option Group Builder rds</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OptionGroupBuilder_rdsImpl#getConfigurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsList <em>Configurations software amazon awscdk services rds Option Configuration As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OptionGroupBuilder_rdsImpl#getEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference <em>Engine With IInstance Engine software amazon awscdk services rds IInstance Engine As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OptionGroupBuilder_rdsImpl#getDescription_java_lang_String_ <em>Description java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OptionGroupBuilder_rdsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OptionGroupBuilder_rdsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OptionGroupBuilder_rdsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OptionGroupBuilder_rdsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionGroupBuilder_rdsImpl extends ServiceResourcesImpl implements OptionGroupBuilder_rds {
	/**
	 * The default value of the '{@link #getConfigurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsList() <em>Configurations software amazon awscdk services rds Option Configuration As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_OPTION_CONFIGURATION_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsList() <em>Configurations software amazon awscdk services rds Option Configuration As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsList()
	 * @generated
	 * @ordered
	 */
	protected String configurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsList = CONFIGURATIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_OPTION_CONFIGURATION_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference() <em>Engine With IInstance Engine software amazon awscdk services rds IInstance Engine As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String ENGINE_WITH_IINSTANCE_ENGINE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IINSTANCE_ENGINE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference() <em>Engine With IInstance Engine software amazon awscdk services rds IInstance Engine As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String engineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference = ENGINE_WITH_IINSTANCE_ENGINE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IINSTANCE_ENGINE_AS_REFERENCE_EDEFAULT;

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
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.rds.OptionGroup";

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
	protected OptionGroupBuilder_rdsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.OPTION_GROUP_BUILDER_RDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsList() {
		return configurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsList(
			String newConfigurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsList) {
		String oldConfigurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsList = configurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsList;
		configurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsList = newConfigurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__CONFIGURATIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_OPTION_CONFIGURATION_AS_LIST,
					oldConfigurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsList,
					configurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference() {
		return engineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference(
			String newEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference) {
		String oldEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference = engineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference;
		engineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference = newEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__ENGINE_WITH_IINSTANCE_ENGINE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IINSTANCE_ENGINE_AS_REFERENCE,
					oldEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference,
					engineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference));
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
					AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__DESCRIPTION_JAVA_LANG_STRING_,
					oldDescription_java_lang_String_, description_java_lang_String_));
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
					AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__CONFIGURATIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_OPTION_CONFIGURATION_AS_LIST:
			return getConfigurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsList();
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__ENGINE_WITH_IINSTANCE_ENGINE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IINSTANCE_ENGINE_AS_REFERENCE:
			return getEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference();
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__DESCRIPTION_JAVA_LANG_STRING_:
			return getDescription_java_lang_String_();
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__CONFIGURATIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_OPTION_CONFIGURATION_AS_LIST:
			setConfigurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__ENGINE_WITH_IINSTANCE_ENGINE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IINSTANCE_ENGINE_AS_REFERENCE:
			setEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__DESCRIPTION_JAVA_LANG_STRING_:
			setDescription_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__CONFIGURATIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_OPTION_CONFIGURATION_AS_LIST:
			setConfigurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsList(
					CONFIGURATIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_OPTION_CONFIGURATION_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__ENGINE_WITH_IINSTANCE_ENGINE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IINSTANCE_ENGINE_AS_REFERENCE:
			setEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference(
					ENGINE_WITH_IINSTANCE_ENGINE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IINSTANCE_ENGINE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__DESCRIPTION_JAVA_LANG_STRING_:
			setDescription_java_lang_String_(DESCRIPTION_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__CONFIGURATIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_OPTION_CONFIGURATION_AS_LIST:
			return CONFIGURATIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_OPTION_CONFIGURATION_AS_LIST_EDEFAULT == null
					? configurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsList != null
					: !CONFIGURATIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_OPTION_CONFIGURATION_AS_LIST_EDEFAULT
							.equals(configurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsList);
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__ENGINE_WITH_IINSTANCE_ENGINE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IINSTANCE_ENGINE_AS_REFERENCE:
			return ENGINE_WITH_IINSTANCE_ENGINE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IINSTANCE_ENGINE_AS_REFERENCE_EDEFAULT == null
					? engineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference != null
					: !ENGINE_WITH_IINSTANCE_ENGINE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IINSTANCE_ENGINE_AS_REFERENCE_EDEFAULT
							.equals(engineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference);
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__DESCRIPTION_JAVA_LANG_STRING_:
			return DESCRIPTION_JAVA_LANG_STRING__EDEFAULT == null ? description_java_lang_String_ != null
					: !DESCRIPTION_JAVA_LANG_STRING__EDEFAULT.equals(description_java_lang_String_);
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__ADDITIONAL_CODE:
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
		result.append(" (configurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsList: ");
		result.append(configurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsList);
		result.append(", engineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference: ");
		result.append(engineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference);
		result.append(", description_java_lang_String_: ");
		result.append(description_java_lang_String_);
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

} //OptionGroupBuilder_rdsImpl
