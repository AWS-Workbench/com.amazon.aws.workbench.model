/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.BuildEncryptionKeyPropsBuilder_core;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Build Encryption Key Props Builder core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BuildEncryptionKeyPropsBuilder_coreImpl#getEncryptionKeyProps_java_lang_Object_ <em>Encryption Key Props java lang Object </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BuildEncryptionKeyPropsBuilder_coreImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BuildEncryptionKeyPropsBuilder_coreImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BuildEncryptionKeyPropsBuilder_coreImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BuildEncryptionKeyPropsBuilder_coreImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BuildEncryptionKeyPropsBuilder_coreImpl extends ServiceResourcesImpl
		implements BuildEncryptionKeyPropsBuilder_core {
	/**
	 * The default value of the '{@link #getEncryptionKeyProps_java_lang_Object_() <em>Encryption Key Props java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptionKeyProps_java_lang_Object_()
	 * @generated
	 * @ordered
	 */
	protected static final Object ENCRYPTION_KEY_PROPS_JAVA_LANG_OBJECT__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncryptionKeyProps_java_lang_Object_() <em>Encryption Key Props java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptionKeyProps_java_lang_Object_()
	 * @generated
	 * @ordered
	 */
	protected Object encryptionKeyProps_java_lang_Object_ = ENCRYPTION_KEY_PROPS_JAVA_LANG_OBJECT__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.awsconstructs.services.core.BuildEncryptionKeyProps";

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
	protected BuildEncryptionKeyPropsBuilder_coreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.BUILD_ENCRYPTION_KEY_PROPS_BUILDER_CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getEncryptionKeyProps_java_lang_Object_() {
		return encryptionKeyProps_java_lang_Object_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncryptionKeyProps_java_lang_Object_(Object newEncryptionKeyProps_java_lang_Object_) {
		Object oldEncryptionKeyProps_java_lang_Object_ = encryptionKeyProps_java_lang_Object_;
		encryptionKeyProps_java_lang_Object_ = newEncryptionKeyProps_java_lang_Object_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BUILD_ENCRYPTION_KEY_PROPS_BUILDER_CORE__ENCRYPTION_KEY_PROPS_JAVA_LANG_OBJECT_,
					oldEncryptionKeyProps_java_lang_Object_, encryptionKeyProps_java_lang_Object_));
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
					AwsworkbenchPackage.BUILD_ENCRYPTION_KEY_PROPS_BUILDER_CORE__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.BUILD_ENCRYPTION_KEY_PROPS_BUILDER_CORE__IDENTIFIER, oldIdentifier,
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
					AwsworkbenchPackage.BUILD_ENCRYPTION_KEY_PROPS_BUILDER_CORE__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.BUILD_ENCRYPTION_KEY_PROPS_BUILDER_CORE__ENCRYPTION_KEY_PROPS_JAVA_LANG_OBJECT_:
			return getEncryptionKeyProps_java_lang_Object_();
		case AwsworkbenchPackage.BUILD_ENCRYPTION_KEY_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.BUILD_ENCRYPTION_KEY_PROPS_BUILDER_CORE__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.BUILD_ENCRYPTION_KEY_PROPS_BUILDER_CORE__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.BUILD_ENCRYPTION_KEY_PROPS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.BUILD_ENCRYPTION_KEY_PROPS_BUILDER_CORE__ENCRYPTION_KEY_PROPS_JAVA_LANG_OBJECT_:
			setEncryptionKeyProps_java_lang_Object_(newValue);
			return;
		case AwsworkbenchPackage.BUILD_ENCRYPTION_KEY_PROPS_BUILDER_CORE__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.BUILD_ENCRYPTION_KEY_PROPS_BUILDER_CORE__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.BUILD_ENCRYPTION_KEY_PROPS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.BUILD_ENCRYPTION_KEY_PROPS_BUILDER_CORE__ENCRYPTION_KEY_PROPS_JAVA_LANG_OBJECT_:
			setEncryptionKeyProps_java_lang_Object_(ENCRYPTION_KEY_PROPS_JAVA_LANG_OBJECT__EDEFAULT);
			return;
		case AwsworkbenchPackage.BUILD_ENCRYPTION_KEY_PROPS_BUILDER_CORE__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.BUILD_ENCRYPTION_KEY_PROPS_BUILDER_CORE__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.BUILD_ENCRYPTION_KEY_PROPS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.BUILD_ENCRYPTION_KEY_PROPS_BUILDER_CORE__ENCRYPTION_KEY_PROPS_JAVA_LANG_OBJECT_:
			return ENCRYPTION_KEY_PROPS_JAVA_LANG_OBJECT__EDEFAULT == null
					? encryptionKeyProps_java_lang_Object_ != null
					: !ENCRYPTION_KEY_PROPS_JAVA_LANG_OBJECT__EDEFAULT.equals(encryptionKeyProps_java_lang_Object_);
		case AwsworkbenchPackage.BUILD_ENCRYPTION_KEY_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.BUILD_ENCRYPTION_KEY_PROPS_BUILDER_CORE__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.BUILD_ENCRYPTION_KEY_PROPS_BUILDER_CORE__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.BUILD_ENCRYPTION_KEY_PROPS_BUILDER_CORE__ADDITIONAL_CODE:
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
		result.append(" (encryptionKeyProps_java_lang_Object_: ");
		result.append(encryptionKeyProps_java_lang_Object_);
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

} //BuildEncryptionKeyPropsBuilder_coreImpl
