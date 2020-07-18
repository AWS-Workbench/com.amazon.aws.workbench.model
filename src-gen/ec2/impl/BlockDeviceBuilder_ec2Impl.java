/**
 */
package ec2.impl;

import ec2.BlockDeviceBuilder_ec2;
import ec2.Ec2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Device Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ec2.impl.BlockDeviceBuilder_ec2Impl#getDeviceName_java_lang_String_ <em>Device Name java lang String </em>}</li>
 *   <li>{@link ec2.impl.BlockDeviceBuilder_ec2Impl#getVolumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference <em>Volume With Block Device Volume software amazon awscdk services ec2 Block Device Volume As Reference</em>}</li>
 *   <li>{@link ec2.impl.BlockDeviceBuilder_ec2Impl#getMappingEnabled_java_lang_Boolean_ <em>Mapping Enabled java lang Boolean </em>}</li>
 *   <li>{@link ec2.impl.BlockDeviceBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.impl.BlockDeviceBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.impl.BlockDeviceBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.impl.BlockDeviceBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockDeviceBuilder_ec2Impl extends MinimalEObjectImpl.Container implements BlockDeviceBuilder_ec2 {
	/**
	 * The default value of the '{@link #getDeviceName_java_lang_String_() <em>Device Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceName_java_lang_String_() <em>Device Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String deviceName_java_lang_String_ = DEVICE_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getVolumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference() <em>Volume With Block Device Volume software amazon awscdk services ec2 Block Device Volume As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLUME_WITH_BLOCK_DEVICE_VOLUME_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_VOLUME_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVolumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference() <em>Volume With Block Device Volume software amazon awscdk services ec2 Block Device Volume As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String volumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference = VOLUME_WITH_BLOCK_DEVICE_VOLUME_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_VOLUME_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMappingEnabled_java_lang_Boolean_() <em>Mapping Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingEnabled_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MAPPING_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMappingEnabled_java_lang_Boolean_() <em>Mapping Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingEnabled_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean mappingEnabled_java_lang_Boolean_ = MAPPING_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.BlockDevice";

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
	protected BlockDeviceBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.Literals.BLOCK_DEVICE_BUILDER_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeviceName_java_lang_String_() {
		return deviceName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceName_java_lang_String_(String newDeviceName_java_lang_String_) {
		String oldDeviceName_java_lang_String_ = deviceName_java_lang_String_;
		deviceName_java_lang_String_ = newDeviceName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.BLOCK_DEVICE_BUILDER_EC2__DEVICE_NAME_JAVA_LANG_STRING_, oldDeviceName_java_lang_String_,
					deviceName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVolumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference() {
		return volumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference(
			String newVolumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference) {
		String oldVolumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference = volumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference;
		volumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference = newVolumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.BLOCK_DEVICE_BUILDER_EC2__VOLUME_WITH_BLOCK_DEVICE_VOLUME_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_VOLUME_AS_REFERENCE,
					oldVolumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference,
					volumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getMappingEnabled_java_lang_Boolean_() {
		return mappingEnabled_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMappingEnabled_java_lang_Boolean_(Boolean newMappingEnabled_java_lang_Boolean_) {
		Boolean oldMappingEnabled_java_lang_Boolean_ = mappingEnabled_java_lang_Boolean_;
		mappingEnabled_java_lang_Boolean_ = newMappingEnabled_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.BLOCK_DEVICE_BUILDER_EC2__MAPPING_ENABLED_JAVA_LANG_BOOLEAN_,
					oldMappingEnabled_java_lang_Boolean_, mappingEnabled_java_lang_Boolean_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.BLOCK_DEVICE_BUILDER_EC2__VAR_NAME,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.BLOCK_DEVICE_BUILDER_EC2__IDENTIFIER,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.BLOCK_DEVICE_BUILDER_EC2__ADDITIONAL_CODE,
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
		case Ec2Package.BLOCK_DEVICE_BUILDER_EC2__DEVICE_NAME_JAVA_LANG_STRING_:
			return getDeviceName_java_lang_String_();
		case Ec2Package.BLOCK_DEVICE_BUILDER_EC2__VOLUME_WITH_BLOCK_DEVICE_VOLUME_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_VOLUME_AS_REFERENCE:
			return getVolumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference();
		case Ec2Package.BLOCK_DEVICE_BUILDER_EC2__MAPPING_ENABLED_JAVA_LANG_BOOLEAN_:
			return getMappingEnabled_java_lang_Boolean_();
		case Ec2Package.BLOCK_DEVICE_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case Ec2Package.BLOCK_DEVICE_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case Ec2Package.BLOCK_DEVICE_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case Ec2Package.BLOCK_DEVICE_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.BLOCK_DEVICE_BUILDER_EC2__DEVICE_NAME_JAVA_LANG_STRING_:
			setDeviceName_java_lang_String_((String) newValue);
			return;
		case Ec2Package.BLOCK_DEVICE_BUILDER_EC2__VOLUME_WITH_BLOCK_DEVICE_VOLUME_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_VOLUME_AS_REFERENCE:
			setVolumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference(
					(String) newValue);
			return;
		case Ec2Package.BLOCK_DEVICE_BUILDER_EC2__MAPPING_ENABLED_JAVA_LANG_BOOLEAN_:
			setMappingEnabled_java_lang_Boolean_((Boolean) newValue);
			return;
		case Ec2Package.BLOCK_DEVICE_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case Ec2Package.BLOCK_DEVICE_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case Ec2Package.BLOCK_DEVICE_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.BLOCK_DEVICE_BUILDER_EC2__DEVICE_NAME_JAVA_LANG_STRING_:
			setDeviceName_java_lang_String_(DEVICE_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.BLOCK_DEVICE_BUILDER_EC2__VOLUME_WITH_BLOCK_DEVICE_VOLUME_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_VOLUME_AS_REFERENCE:
			setVolumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference(
					VOLUME_WITH_BLOCK_DEVICE_VOLUME_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_VOLUME_AS_REFERENCE_EDEFAULT);
			return;
		case Ec2Package.BLOCK_DEVICE_BUILDER_EC2__MAPPING_ENABLED_JAVA_LANG_BOOLEAN_:
			setMappingEnabled_java_lang_Boolean_(MAPPING_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case Ec2Package.BLOCK_DEVICE_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case Ec2Package.BLOCK_DEVICE_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case Ec2Package.BLOCK_DEVICE_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.BLOCK_DEVICE_BUILDER_EC2__DEVICE_NAME_JAVA_LANG_STRING_:
			return DEVICE_NAME_JAVA_LANG_STRING__EDEFAULT == null ? deviceName_java_lang_String_ != null
					: !DEVICE_NAME_JAVA_LANG_STRING__EDEFAULT.equals(deviceName_java_lang_String_);
		case Ec2Package.BLOCK_DEVICE_BUILDER_EC2__VOLUME_WITH_BLOCK_DEVICE_VOLUME_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_VOLUME_AS_REFERENCE:
			return VOLUME_WITH_BLOCK_DEVICE_VOLUME_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_VOLUME_AS_REFERENCE_EDEFAULT == null
					? volumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference != null
					: !VOLUME_WITH_BLOCK_DEVICE_VOLUME_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_VOLUME_AS_REFERENCE_EDEFAULT
							.equals(volumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference);
		case Ec2Package.BLOCK_DEVICE_BUILDER_EC2__MAPPING_ENABLED_JAVA_LANG_BOOLEAN_:
			return MAPPING_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT == null ? mappingEnabled_java_lang_Boolean_ != null
					: !MAPPING_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT.equals(mappingEnabled_java_lang_Boolean_);
		case Ec2Package.BLOCK_DEVICE_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case Ec2Package.BLOCK_DEVICE_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case Ec2Package.BLOCK_DEVICE_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case Ec2Package.BLOCK_DEVICE_BUILDER_EC2__ADDITIONAL_CODE:
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
		result.append(" (deviceName_java_lang_String_: ");
		result.append(deviceName_java_lang_String_);
		result.append(
				", volumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference: ");
		result.append(volumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference);
		result.append(", mappingEnabled_java_lang_Boolean_: ");
		result.append(mappingEnabled_java_lang_Boolean_);
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

} //BlockDeviceBuilder_ec2Impl
