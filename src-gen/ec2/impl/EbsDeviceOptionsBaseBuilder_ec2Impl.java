/**
 */
package ec2.impl;

import ec2.EbsDeviceOptionsBaseBuilder_ec2;
import ec2.EbsDeviceVolumeType;
import ec2.Ec2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ebs Device Options Base Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ec2.impl.EbsDeviceOptionsBaseBuilder_ec2Impl#getDeleteOnTermination_java_lang_Boolean_ <em>Delete On Termination java lang Boolean </em>}</li>
 *   <li>{@link ec2.impl.EbsDeviceOptionsBaseBuilder_ec2Impl#getIops_java_lang_Number_ <em>Iops java lang Number </em>}</li>
 *   <li>{@link ec2.impl.EbsDeviceOptionsBaseBuilder_ec2Impl#getVolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_ <em>Volume Type software amazon awscdk services ec2 Ebs Device Volume Type </em>}</li>
 *   <li>{@link ec2.impl.EbsDeviceOptionsBaseBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.impl.EbsDeviceOptionsBaseBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.impl.EbsDeviceOptionsBaseBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.impl.EbsDeviceOptionsBaseBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EbsDeviceOptionsBaseBuilder_ec2Impl extends MinimalEObjectImpl.Container
		implements EbsDeviceOptionsBaseBuilder_ec2 {
	/**
	 * The default value of the '{@link #getDeleteOnTermination_java_lang_Boolean_() <em>Delete On Termination java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteOnTermination_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DELETE_ON_TERMINATION_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeleteOnTermination_java_lang_Boolean_() <em>Delete On Termination java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteOnTermination_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean deleteOnTermination_java_lang_Boolean_ = DELETE_ON_TERMINATION_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getIops_java_lang_Number_() <em>Iops java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIops_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int IOPS_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIops_java_lang_Number_() <em>Iops java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIops_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int iops_java_lang_Number_ = IOPS_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getVolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_() <em>Volume Type software amazon awscdk services ec2 Ebs Device Volume Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_()
	 * @generated
	 * @ordered
	 */
	protected static final EbsDeviceVolumeType VOLUME_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_EBS_DEVICE_VOLUME_TYPE__EDEFAULT = EbsDeviceVolumeType.STANDARD;

	/**
	 * The cached value of the '{@link #getVolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_() <em>Volume Type software amazon awscdk services ec2 Ebs Device Volume Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_()
	 * @generated
	 * @ordered
	 */
	protected EbsDeviceVolumeType volumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_ = VOLUME_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_EBS_DEVICE_VOLUME_TYPE__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.EbsDeviceOptionsBase";

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
	protected EbsDeviceOptionsBaseBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.Literals.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDeleteOnTermination_java_lang_Boolean_() {
		return deleteOnTermination_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeleteOnTermination_java_lang_Boolean_(Boolean newDeleteOnTermination_java_lang_Boolean_) {
		Boolean oldDeleteOnTermination_java_lang_Boolean_ = deleteOnTermination_java_lang_Boolean_;
		deleteOnTermination_java_lang_Boolean_ = newDeleteOnTermination_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__DELETE_ON_TERMINATION_JAVA_LANG_BOOLEAN_,
					oldDeleteOnTermination_java_lang_Boolean_, deleteOnTermination_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIops_java_lang_Number_() {
		return iops_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIops_java_lang_Number_(int newIops_java_lang_Number_) {
		int oldIops_java_lang_Number_ = iops_java_lang_Number_;
		iops_java_lang_Number_ = newIops_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__IOPS_JAVA_LANG_NUMBER_, oldIops_java_lang_Number_,
					iops_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EbsDeviceVolumeType getVolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_() {
		return volumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_(
			EbsDeviceVolumeType newVolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_) {
		EbsDeviceVolumeType oldVolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_ = volumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_;
		volumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_ = newVolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_ == null
				? VOLUME_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_EBS_DEVICE_VOLUME_TYPE__EDEFAULT
				: newVolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__VOLUME_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_EBS_DEVICE_VOLUME_TYPE_,
					oldVolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_,
					volumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_));
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
					Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__VAR_NAME, oldVarName, varName));
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
					Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__IDENTIFIER, oldIdentifier, identifier));
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
					Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__ADDITIONAL_CODE, oldAdditionalCode,
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
		case Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__DELETE_ON_TERMINATION_JAVA_LANG_BOOLEAN_:
			return getDeleteOnTermination_java_lang_Boolean_();
		case Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__IOPS_JAVA_LANG_NUMBER_:
			return getIops_java_lang_Number_();
		case Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__VOLUME_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_EBS_DEVICE_VOLUME_TYPE_:
			return getVolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_();
		case Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__DELETE_ON_TERMINATION_JAVA_LANG_BOOLEAN_:
			setDeleteOnTermination_java_lang_Boolean_((Boolean) newValue);
			return;
		case Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__IOPS_JAVA_LANG_NUMBER_:
			setIops_java_lang_Number_((Integer) newValue);
			return;
		case Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__VOLUME_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_EBS_DEVICE_VOLUME_TYPE_:
			setVolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_((EbsDeviceVolumeType) newValue);
			return;
		case Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__DELETE_ON_TERMINATION_JAVA_LANG_BOOLEAN_:
			setDeleteOnTermination_java_lang_Boolean_(DELETE_ON_TERMINATION_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__IOPS_JAVA_LANG_NUMBER_:
			setIops_java_lang_Number_(IOPS_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__VOLUME_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_EBS_DEVICE_VOLUME_TYPE_:
			setVolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_(
					VOLUME_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_EBS_DEVICE_VOLUME_TYPE__EDEFAULT);
			return;
		case Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__DELETE_ON_TERMINATION_JAVA_LANG_BOOLEAN_:
			return DELETE_ON_TERMINATION_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? deleteOnTermination_java_lang_Boolean_ != null
					: !DELETE_ON_TERMINATION_JAVA_LANG_BOOLEAN__EDEFAULT.equals(deleteOnTermination_java_lang_Boolean_);
		case Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__IOPS_JAVA_LANG_NUMBER_:
			return iops_java_lang_Number_ != IOPS_JAVA_LANG_NUMBER__EDEFAULT;
		case Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__VOLUME_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_EBS_DEVICE_VOLUME_TYPE_:
			return volumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_ != VOLUME_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_EBS_DEVICE_VOLUME_TYPE__EDEFAULT;
		case Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case Ec2Package.EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__ADDITIONAL_CODE:
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
		result.append(" (deleteOnTermination_java_lang_Boolean_: ");
		result.append(deleteOnTermination_java_lang_Boolean_);
		result.append(", iops_java_lang_Number_: ");
		result.append(iops_java_lang_Number_);
		result.append(", volumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_: ");
		result.append(volumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_);
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

} //EbsDeviceOptionsBaseBuilder_ec2Impl
