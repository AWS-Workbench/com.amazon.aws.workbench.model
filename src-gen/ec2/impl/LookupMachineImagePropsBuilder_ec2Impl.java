/**
 */
package ec2.impl;

import ec2.Ec2Package;
import ec2.LookupMachineImagePropsBuilder_ec2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lookup Machine Image Props Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ec2.impl.LookupMachineImagePropsBuilder_ec2Impl#getName_java_lang_String_ <em>Name java lang String </em>}</li>
 *   <li>{@link ec2.impl.LookupMachineImagePropsBuilder_ec2Impl#getOwners_java_lang_String_AsList <em>Owners java lang String As List</em>}</li>
 *   <li>{@link ec2.impl.LookupMachineImagePropsBuilder_ec2Impl#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference <em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>}</li>
 *   <li>{@link ec2.impl.LookupMachineImagePropsBuilder_ec2Impl#getWindows_java_lang_Boolean_ <em>Windows java lang Boolean </em>}</li>
 *   <li>{@link ec2.impl.LookupMachineImagePropsBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.impl.LookupMachineImagePropsBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.impl.LookupMachineImagePropsBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.impl.LookupMachineImagePropsBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LookupMachineImagePropsBuilder_ec2Impl extends MinimalEObjectImpl.Container
		implements LookupMachineImagePropsBuilder_ec2 {
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
	 * The default value of the '{@link #getOwners_java_lang_String_AsList() <em>Owners java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwners_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwners_java_lang_String_AsList() <em>Owners java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwners_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String owners_java_lang_String_AsList = OWNERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

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
	 * The default value of the '{@link #getWindows_java_lang_Boolean_() <em>Windows java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindows_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean WINDOWS_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWindows_java_lang_Boolean_() <em>Windows java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindows_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean windows_java_lang_Boolean_ = WINDOWS_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.LookupMachineImageProps";

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
	protected LookupMachineImagePropsBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.Literals.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2;
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
					Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__NAME_JAVA_LANG_STRING_,
					oldName_java_lang_String_, name_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOwners_java_lang_String_AsList() {
		return owners_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwners_java_lang_String_AsList(String newOwners_java_lang_String_AsList) {
		String oldOwners_java_lang_String_AsList = owners_java_lang_String_AsList;
		owners_java_lang_String_AsList = newOwners_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__OWNERS_JAVA_LANG_STRING_AS_LIST,
					oldOwners_java_lang_String_AsList, owners_java_lang_String_AsList));
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
					Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE,
					oldUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference,
					userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getWindows_java_lang_Boolean_() {
		return windows_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWindows_java_lang_Boolean_(Boolean newWindows_java_lang_Boolean_) {
		Boolean oldWindows_java_lang_Boolean_ = windows_java_lang_Boolean_;
		windows_java_lang_Boolean_ = newWindows_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__WINDOWS_JAVA_LANG_BOOLEAN_,
					oldWindows_java_lang_Boolean_, windows_java_lang_Boolean_));
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
					Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__VAR_NAME, oldVarName, varName));
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
					Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__IDENTIFIER, oldIdentifier, identifier));
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
					Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__ADDITIONAL_CODE, oldAdditionalCode,
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
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__NAME_JAVA_LANG_STRING_:
			return getName_java_lang_String_();
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__OWNERS_JAVA_LANG_STRING_AS_LIST:
			return getOwners_java_lang_String_AsList();
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE:
			return getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference();
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__WINDOWS_JAVA_LANG_BOOLEAN_:
			return getWindows_java_lang_Boolean_();
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__NAME_JAVA_LANG_STRING_:
			setName_java_lang_String_((String) newValue);
			return;
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__OWNERS_JAVA_LANG_STRING_AS_LIST:
			setOwners_java_lang_String_AsList((String) newValue);
			return;
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE:
			setUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference((String) newValue);
			return;
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__WINDOWS_JAVA_LANG_BOOLEAN_:
			setWindows_java_lang_Boolean_((Boolean) newValue);
			return;
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__NAME_JAVA_LANG_STRING_:
			setName_java_lang_String_(NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__OWNERS_JAVA_LANG_STRING_AS_LIST:
			setOwners_java_lang_String_AsList(OWNERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE:
			setUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference(
					USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE_EDEFAULT);
			return;
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__WINDOWS_JAVA_LANG_BOOLEAN_:
			setWindows_java_lang_Boolean_(WINDOWS_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__NAME_JAVA_LANG_STRING_:
			return NAME_JAVA_LANG_STRING__EDEFAULT == null ? name_java_lang_String_ != null
					: !NAME_JAVA_LANG_STRING__EDEFAULT.equals(name_java_lang_String_);
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__OWNERS_JAVA_LANG_STRING_AS_LIST:
			return OWNERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null ? owners_java_lang_String_AsList != null
					: !OWNERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT.equals(owners_java_lang_String_AsList);
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE:
			return USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE_EDEFAULT == null
					? userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference != null
					: !USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE_EDEFAULT
							.equals(userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference);
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__WINDOWS_JAVA_LANG_BOOLEAN_:
			return WINDOWS_JAVA_LANG_BOOLEAN__EDEFAULT == null ? windows_java_lang_Boolean_ != null
					: !WINDOWS_JAVA_LANG_BOOLEAN__EDEFAULT.equals(windows_java_lang_Boolean_);
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__ADDITIONAL_CODE:
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
		result.append(", owners_java_lang_String_AsList: ");
		result.append(owners_java_lang_String_AsList);
		result.append(", userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference: ");
		result.append(userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference);
		result.append(", windows_java_lang_Boolean_: ");
		result.append(windows_java_lang_Boolean_);
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

} //LookupMachineImagePropsBuilder_ec2Impl
