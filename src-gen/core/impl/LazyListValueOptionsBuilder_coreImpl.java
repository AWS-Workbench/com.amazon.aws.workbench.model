/**
 */
package core.impl;

import core.CorePackage;
import core.LazyListValueOptionsBuilder_core;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lazy List Value Options Builder core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link core.impl.LazyListValueOptionsBuilder_coreImpl#getDisplayHint_java_lang_String_ <em>Display Hint java lang String </em>}</li>
 *   <li>{@link core.impl.LazyListValueOptionsBuilder_coreImpl#getOmitEmpty_java_lang_Boolean_ <em>Omit Empty java lang Boolean </em>}</li>
 *   <li>{@link core.impl.LazyListValueOptionsBuilder_coreImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.impl.LazyListValueOptionsBuilder_coreImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.impl.LazyListValueOptionsBuilder_coreImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.impl.LazyListValueOptionsBuilder_coreImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LazyListValueOptionsBuilder_coreImpl extends MinimalEObjectImpl.Container
		implements LazyListValueOptionsBuilder_core {
	/**
	 * The default value of the '{@link #getDisplayHint_java_lang_String_() <em>Display Hint java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayHint_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_HINT_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayHint_java_lang_String_() <em>Display Hint java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayHint_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String displayHint_java_lang_String_ = DISPLAY_HINT_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getOmitEmpty_java_lang_Boolean_() <em>Omit Empty java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOmitEmpty_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean OMIT_EMPTY_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOmitEmpty_java_lang_Boolean_() <em>Omit Empty java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOmitEmpty_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean omitEmpty_java_lang_Boolean_ = OMIT_EMPTY_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.core.LazyListValueOptions";

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
	protected LazyListValueOptionsBuilder_coreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDisplayHint_java_lang_String_() {
		return displayHint_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayHint_java_lang_String_(String newDisplayHint_java_lang_String_) {
		String oldDisplayHint_java_lang_String_ = displayHint_java_lang_String_;
		displayHint_java_lang_String_ = newDisplayHint_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__DISPLAY_HINT_JAVA_LANG_STRING_,
					oldDisplayHint_java_lang_String_, displayHint_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getOmitEmpty_java_lang_Boolean_() {
		return omitEmpty_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOmitEmpty_java_lang_Boolean_(Boolean newOmitEmpty_java_lang_Boolean_) {
		Boolean oldOmitEmpty_java_lang_Boolean_ = omitEmpty_java_lang_Boolean_;
		omitEmpty_java_lang_Boolean_ = newOmitEmpty_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__OMIT_EMPTY_JAVA_LANG_BOOLEAN_,
					oldOmitEmpty_java_lang_Boolean_, omitEmpty_java_lang_Boolean_));
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
					CorePackage.LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__VAR_NAME, oldVarName, varName));
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
					CorePackage.LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__IDENTIFIER, oldIdentifier, identifier));
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
					CorePackage.LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE, oldAdditionalCode,
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
		case CorePackage.LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__DISPLAY_HINT_JAVA_LANG_STRING_:
			return getDisplayHint_java_lang_String_();
		case CorePackage.LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__OMIT_EMPTY_JAVA_LANG_BOOLEAN_:
			return getOmitEmpty_java_lang_Boolean_();
		case CorePackage.LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case CorePackage.LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__VAR_NAME:
			return getVarName();
		case CorePackage.LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__IDENTIFIER:
			return getIdentifier();
		case CorePackage.LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__DISPLAY_HINT_JAVA_LANG_STRING_:
			setDisplayHint_java_lang_String_((String) newValue);
			return;
		case CorePackage.LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__OMIT_EMPTY_JAVA_LANG_BOOLEAN_:
			setOmitEmpty_java_lang_Boolean_((Boolean) newValue);
			return;
		case CorePackage.LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__VAR_NAME:
			setVarName((String) newValue);
			return;
		case CorePackage.LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case CorePackage.LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__DISPLAY_HINT_JAVA_LANG_STRING_:
			setDisplayHint_java_lang_String_(DISPLAY_HINT_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__OMIT_EMPTY_JAVA_LANG_BOOLEAN_:
			setOmitEmpty_java_lang_Boolean_(OMIT_EMPTY_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case CorePackage.LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case CorePackage.LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case CorePackage.LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__DISPLAY_HINT_JAVA_LANG_STRING_:
			return DISPLAY_HINT_JAVA_LANG_STRING__EDEFAULT == null ? displayHint_java_lang_String_ != null
					: !DISPLAY_HINT_JAVA_LANG_STRING__EDEFAULT.equals(displayHint_java_lang_String_);
		case CorePackage.LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__OMIT_EMPTY_JAVA_LANG_BOOLEAN_:
			return OMIT_EMPTY_JAVA_LANG_BOOLEAN__EDEFAULT == null ? omitEmpty_java_lang_Boolean_ != null
					: !OMIT_EMPTY_JAVA_LANG_BOOLEAN__EDEFAULT.equals(omitEmpty_java_lang_Boolean_);
		case CorePackage.LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case CorePackage.LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case CorePackage.LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case CorePackage.LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
		result.append(" (displayHint_java_lang_String_: ");
		result.append(displayHint_java_lang_String_);
		result.append(", omitEmpty_java_lang_Boolean_: ");
		result.append(omitEmpty_java_lang_Boolean_);
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

} //LazyListValueOptionsBuilder_coreImpl
