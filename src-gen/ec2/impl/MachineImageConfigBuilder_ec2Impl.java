/**
 */
package ec2.impl;

import ec2.Ec2Package;
import ec2.MachineImageConfigBuilder_ec2;
import ec2.OperatingSystemType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine Image Config Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ec2.impl.MachineImageConfigBuilder_ec2Impl#getImageId_java_lang_String_ <em>Image Id java lang String </em>}</li>
 *   <li>{@link ec2.impl.MachineImageConfigBuilder_ec2Impl#getOsType_software_amazon_awscdk_services_ec2_OperatingSystemType_ <em>Os Type software amazon awscdk services ec2 Operating System Type </em>}</li>
 *   <li>{@link ec2.impl.MachineImageConfigBuilder_ec2Impl#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference <em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>}</li>
 *   <li>{@link ec2.impl.MachineImageConfigBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.impl.MachineImageConfigBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.impl.MachineImageConfigBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.impl.MachineImageConfigBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MachineImageConfigBuilder_ec2Impl extends MinimalEObjectImpl.Container
		implements MachineImageConfigBuilder_ec2 {
	/**
	 * The default value of the '{@link #getImageId_java_lang_String_() <em>Image Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_ID_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageId_java_lang_String_() <em>Image Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String imageId_java_lang_String_ = IMAGE_ID_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getOsType_software_amazon_awscdk_services_ec2_OperatingSystemType_() <em>Os Type software amazon awscdk services ec2 Operating System Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsType_software_amazon_awscdk_services_ec2_OperatingSystemType_()
	 * @generated
	 * @ordered
	 */
	protected static final OperatingSystemType OS_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_OPERATING_SYSTEM_TYPE__EDEFAULT = OperatingSystemType.LINUX;

	/**
	 * The cached value of the '{@link #getOsType_software_amazon_awscdk_services_ec2_OperatingSystemType_() <em>Os Type software amazon awscdk services ec2 Operating System Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsType_software_amazon_awscdk_services_ec2_OperatingSystemType_()
	 * @generated
	 * @ordered
	 */
	protected OperatingSystemType osType_software_amazon_awscdk_services_ec2_OperatingSystemType_ = OS_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_OPERATING_SYSTEM_TYPE__EDEFAULT;

	/**
	 * The default value of the '{@link #getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference() <em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference() <em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference = USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.MachineImageConfig";

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
	protected MachineImageConfigBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.Literals.MACHINE_IMAGE_CONFIG_BUILDER_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImageId_java_lang_String_() {
		return imageId_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageId_java_lang_String_(String newImageId_java_lang_String_) {
		String oldImageId_java_lang_String_ = imageId_java_lang_String_;
		imageId_java_lang_String_ = newImageId_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2__IMAGE_ID_JAVA_LANG_STRING_,
					oldImageId_java_lang_String_, imageId_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperatingSystemType getOsType_software_amazon_awscdk_services_ec2_OperatingSystemType_() {
		return osType_software_amazon_awscdk_services_ec2_OperatingSystemType_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOsType_software_amazon_awscdk_services_ec2_OperatingSystemType_(
			OperatingSystemType newOsType_software_amazon_awscdk_services_ec2_OperatingSystemType_) {
		OperatingSystemType oldOsType_software_amazon_awscdk_services_ec2_OperatingSystemType_ = osType_software_amazon_awscdk_services_ec2_OperatingSystemType_;
		osType_software_amazon_awscdk_services_ec2_OperatingSystemType_ = newOsType_software_amazon_awscdk_services_ec2_OperatingSystemType_ == null
				? OS_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_OPERATING_SYSTEM_TYPE__EDEFAULT
				: newOsType_software_amazon_awscdk_services_ec2_OperatingSystemType_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2__OS_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_OPERATING_SYSTEM_TYPE_,
					oldOsType_software_amazon_awscdk_services_ec2_OperatingSystemType_,
					osType_software_amazon_awscdk_services_ec2_OperatingSystemType_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference() {
		return userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference(
			String newUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference) {
		String oldUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference = userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference;
		userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference = newUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE,
					oldUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference,
					userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2__VAR_NAME,
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
					Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2__IDENTIFIER, oldIdentifier, identifier));
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
					Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2__IMAGE_ID_JAVA_LANG_STRING_:
			return getImageId_java_lang_String_();
		case Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2__OS_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_OPERATING_SYSTEM_TYPE_:
			return getOsType_software_amazon_awscdk_services_ec2_OperatingSystemType_();
		case Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE:
			return getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference();
		case Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2__IMAGE_ID_JAVA_LANG_STRING_:
			setImageId_java_lang_String_((String) newValue);
			return;
		case Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2__OS_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_OPERATING_SYSTEM_TYPE_:
			setOsType_software_amazon_awscdk_services_ec2_OperatingSystemType_((OperatingSystemType) newValue);
			return;
		case Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE:
			setUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference((String) newValue);
			return;
		case Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2__IMAGE_ID_JAVA_LANG_STRING_:
			setImageId_java_lang_String_(IMAGE_ID_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2__OS_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_OPERATING_SYSTEM_TYPE_:
			setOsType_software_amazon_awscdk_services_ec2_OperatingSystemType_(
					OS_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_OPERATING_SYSTEM_TYPE__EDEFAULT);
			return;
		case Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE:
			setUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference(
					USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE_EDEFAULT);
			return;
		case Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2__IMAGE_ID_JAVA_LANG_STRING_:
			return IMAGE_ID_JAVA_LANG_STRING__EDEFAULT == null ? imageId_java_lang_String_ != null
					: !IMAGE_ID_JAVA_LANG_STRING__EDEFAULT.equals(imageId_java_lang_String_);
		case Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2__OS_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_OPERATING_SYSTEM_TYPE_:
			return osType_software_amazon_awscdk_services_ec2_OperatingSystemType_ != OS_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_OPERATING_SYSTEM_TYPE__EDEFAULT;
		case Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE:
			return USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE_EDEFAULT == null
					? userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference != null
					: !USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE_EDEFAULT
							.equals(userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference);
		case Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case Ec2Package.MACHINE_IMAGE_CONFIG_BUILDER_EC2__ADDITIONAL_CODE:
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
		result.append(" (imageId_java_lang_String_: ");
		result.append(imageId_java_lang_String_);
		result.append(", osType_software_amazon_awscdk_services_ec2_OperatingSystemType_: ");
		result.append(osType_software_amazon_awscdk_services_ec2_OperatingSystemType_);
		result.append(", userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference: ");
		result.append(userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference);
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

} //MachineImageConfigBuilder_ec2Impl
