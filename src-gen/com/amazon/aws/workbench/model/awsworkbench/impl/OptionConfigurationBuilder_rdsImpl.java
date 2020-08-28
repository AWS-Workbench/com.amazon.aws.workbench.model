/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.OptionConfigurationBuilder_rds;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Option Configuration Builder rds</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OptionConfigurationBuilder_rdsImpl#getName_java_lang_String_ <em>Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OptionConfigurationBuilder_rdsImpl#getPort_java_lang_Number_ <em>Port java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OptionConfigurationBuilder_rdsImpl#getSettings_java_lang_String__java_lang_String_AsMap <em>Settings java lang String java lang String As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OptionConfigurationBuilder_rdsImpl#getVersion_java_lang_String_ <em>Version java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OptionConfigurationBuilder_rdsImpl#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OptionConfigurationBuilder_rdsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OptionConfigurationBuilder_rdsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OptionConfigurationBuilder_rdsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OptionConfigurationBuilder_rdsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionConfigurationBuilder_rdsImpl extends ServiceResourcesImpl implements OptionConfigurationBuilder_rds {
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
	 * The default value of the '{@link #getPort_java_lang_Number_() <em>Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPort_java_lang_Number_() <em>Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int port_java_lang_Number_ = PORT_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getSettings_java_lang_String__java_lang_String_AsMap() <em>Settings java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettings_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String SETTINGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSettings_java_lang_String__java_lang_String_AsMap() <em>Settings java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettings_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String settings_java_lang_String__java_lang_String_AsMap = SETTINGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion_java_lang_String_() <em>Version java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion_java_lang_String_() <em>Version java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String version_java_lang_String_ = VERSION_JAVA_LANG_STRING__EDEFAULT;

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
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.rds.OptionConfiguration";

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
	protected OptionConfigurationBuilder_rdsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.OPTION_CONFIGURATION_BUILDER_RDS;
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
					AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__NAME_JAVA_LANG_STRING_,
					oldName_java_lang_String_, name_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPort_java_lang_Number_() {
		return port_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPort_java_lang_Number_(int newPort_java_lang_Number_) {
		int oldPort_java_lang_Number_ = port_java_lang_Number_;
		port_java_lang_Number_ = newPort_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__PORT_JAVA_LANG_NUMBER_,
					oldPort_java_lang_Number_, port_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSettings_java_lang_String__java_lang_String_AsMap() {
		return settings_java_lang_String__java_lang_String_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSettings_java_lang_String__java_lang_String_AsMap(
			String newSettings_java_lang_String__java_lang_String_AsMap) {
		String oldSettings_java_lang_String__java_lang_String_AsMap = settings_java_lang_String__java_lang_String_AsMap;
		settings_java_lang_String__java_lang_String_AsMap = newSettings_java_lang_String__java_lang_String_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__SETTINGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
					oldSettings_java_lang_String__java_lang_String_AsMap,
					settings_java_lang_String__java_lang_String_AsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion_java_lang_String_() {
		return version_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion_java_lang_String_(String newVersion_java_lang_String_) {
		String oldVersion_java_lang_String_ = version_java_lang_String_;
		version_java_lang_String_ = newVersion_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__VERSION_JAVA_LANG_STRING_,
					oldVersion_java_lang_String_, version_java_lang_String_));
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
					AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE,
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
					AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__NAME_JAVA_LANG_STRING_:
			return getName_java_lang_String_();
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__PORT_JAVA_LANG_NUMBER_:
			return getPort_java_lang_Number_();
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__SETTINGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return getSettings_java_lang_String__java_lang_String_AsMap();
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__VERSION_JAVA_LANG_STRING_:
			return getVersion_java_lang_String_();
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			return getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__NAME_JAVA_LANG_STRING_:
			setName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__PORT_JAVA_LANG_NUMBER_:
			setPort_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__SETTINGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setSettings_java_lang_String__java_lang_String_AsMap((String) newValue);
			return;
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__VERSION_JAVA_LANG_STRING_:
			setVersion_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__NAME_JAVA_LANG_STRING_:
			setName_java_lang_String_(NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__PORT_JAVA_LANG_NUMBER_:
			setPort_java_lang_Number_(PORT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__SETTINGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setSettings_java_lang_String__java_lang_String_AsMap(
					SETTINGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT);
			return;
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__VERSION_JAVA_LANG_STRING_:
			setVersion_java_lang_String_(VERSION_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(
					VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__NAME_JAVA_LANG_STRING_:
			return NAME_JAVA_LANG_STRING__EDEFAULT == null ? name_java_lang_String_ != null
					: !NAME_JAVA_LANG_STRING__EDEFAULT.equals(name_java_lang_String_);
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__PORT_JAVA_LANG_NUMBER_:
			return port_java_lang_Number_ != PORT_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__SETTINGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return SETTINGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT == null
					? settings_java_lang_String__java_lang_String_AsMap != null
					: !SETTINGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT
							.equals(settings_java_lang_String__java_lang_String_AsMap);
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__VERSION_JAVA_LANG_STRING_:
			return VERSION_JAVA_LANG_STRING__EDEFAULT == null ? version_java_lang_String_ != null
					: !VERSION_JAVA_LANG_STRING__EDEFAULT.equals(version_java_lang_String_);
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			return VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT == null
					? vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference != null
					: !VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT
							.equals(vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference);
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS__ADDITIONAL_CODE:
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
		result.append(", port_java_lang_Number_: ");
		result.append(port_java_lang_Number_);
		result.append(", settings_java_lang_String__java_lang_String_AsMap: ");
		result.append(settings_java_lang_String__java_lang_String_AsMap);
		result.append(", version_java_lang_String_: ");
		result.append(version_java_lang_String_);
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

} //OptionConfigurationBuilder_rdsImpl
