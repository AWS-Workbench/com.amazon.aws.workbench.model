/**
 */
package ec2.impl;

import ec2.Ec2Package;
import ec2.SecurityGroupImportOptionsBuilder_ec2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Group Import Options Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ec2.impl.SecurityGroupImportOptionsBuilder_ec2Impl#getAllowAllOutbound_java_lang_Boolean_ <em>Allow All Outbound java lang Boolean </em>}</li>
 *   <li>{@link ec2.impl.SecurityGroupImportOptionsBuilder_ec2Impl#getMutable_java_lang_Boolean_ <em>Mutable java lang Boolean </em>}</li>
 *   <li>{@link ec2.impl.SecurityGroupImportOptionsBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.impl.SecurityGroupImportOptionsBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.impl.SecurityGroupImportOptionsBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.impl.SecurityGroupImportOptionsBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityGroupImportOptionsBuilder_ec2Impl extends MinimalEObjectImpl.Container
		implements SecurityGroupImportOptionsBuilder_ec2 {
	/**
	 * The default value of the '{@link #getAllowAllOutbound_java_lang_Boolean_() <em>Allow All Outbound java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowAllOutbound_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowAllOutbound_java_lang_Boolean_() <em>Allow All Outbound java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowAllOutbound_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowAllOutbound_java_lang_Boolean_ = ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getMutable_java_lang_Boolean_() <em>Mutable java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMutable_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MUTABLE_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMutable_java_lang_Boolean_() <em>Mutable java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMutable_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean mutable_java_lang_Boolean_ = MUTABLE_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.SecurityGroupImportOptions";

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
	protected SecurityGroupImportOptionsBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.Literals.SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAllowAllOutbound_java_lang_Boolean_() {
		return allowAllOutbound_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowAllOutbound_java_lang_Boolean_(Boolean newAllowAllOutbound_java_lang_Boolean_) {
		Boolean oldAllowAllOutbound_java_lang_Boolean_ = allowAllOutbound_java_lang_Boolean_;
		allowAllOutbound_java_lang_Boolean_ = newAllowAllOutbound_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_,
					oldAllowAllOutbound_java_lang_Boolean_, allowAllOutbound_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getMutable_java_lang_Boolean_() {
		return mutable_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMutable_java_lang_Boolean_(Boolean newMutable_java_lang_Boolean_) {
		Boolean oldMutable_java_lang_Boolean_ = mutable_java_lang_Boolean_;
		mutable_java_lang_Boolean_ = newMutable_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__MUTABLE_JAVA_LANG_BOOLEAN_,
					oldMutable_java_lang_Boolean_, mutable_java_lang_Boolean_));
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
					Ec2Package.SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__VAR_NAME, oldVarName, varName));
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
					Ec2Package.SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__IDENTIFIER, oldIdentifier, identifier));
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
					Ec2Package.SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE, oldAdditionalCode,
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
		case Ec2Package.SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_:
			return getAllowAllOutbound_java_lang_Boolean_();
		case Ec2Package.SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__MUTABLE_JAVA_LANG_BOOLEAN_:
			return getMutable_java_lang_Boolean_();
		case Ec2Package.SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case Ec2Package.SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case Ec2Package.SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case Ec2Package.SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_:
			setAllowAllOutbound_java_lang_Boolean_((Boolean) newValue);
			return;
		case Ec2Package.SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__MUTABLE_JAVA_LANG_BOOLEAN_:
			setMutable_java_lang_Boolean_((Boolean) newValue);
			return;
		case Ec2Package.SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case Ec2Package.SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case Ec2Package.SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_:
			setAllowAllOutbound_java_lang_Boolean_(ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case Ec2Package.SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__MUTABLE_JAVA_LANG_BOOLEAN_:
			setMutable_java_lang_Boolean_(MUTABLE_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case Ec2Package.SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case Ec2Package.SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case Ec2Package.SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_:
			return ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN__EDEFAULT == null ? allowAllOutbound_java_lang_Boolean_ != null
					: !ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN__EDEFAULT.equals(allowAllOutbound_java_lang_Boolean_);
		case Ec2Package.SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__MUTABLE_JAVA_LANG_BOOLEAN_:
			return MUTABLE_JAVA_LANG_BOOLEAN__EDEFAULT == null ? mutable_java_lang_Boolean_ != null
					: !MUTABLE_JAVA_LANG_BOOLEAN__EDEFAULT.equals(mutable_java_lang_Boolean_);
		case Ec2Package.SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case Ec2Package.SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case Ec2Package.SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case Ec2Package.SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE:
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
		result.append(" (allowAllOutbound_java_lang_Boolean_: ");
		result.append(allowAllOutbound_java_lang_Boolean_);
		result.append(", mutable_java_lang_Boolean_: ");
		result.append(mutable_java_lang_Boolean_);
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

} //SecurityGroupImportOptionsBuilder_ec2Impl
