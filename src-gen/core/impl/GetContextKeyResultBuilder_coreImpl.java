/**
 */
package core.impl;

import core.CorePackage;
import core.GetContextKeyResultBuilder_core;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Context Key Result Builder core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link core.impl.GetContextKeyResultBuilder_coreImpl#getKey_java_lang_String_ <em>Key java lang String </em>}</li>
 *   <li>{@link core.impl.GetContextKeyResultBuilder_coreImpl#getProps_java_lang_String__java_lang_Object_AsMap <em>Props java lang String java lang Object As Map</em>}</li>
 *   <li>{@link core.impl.GetContextKeyResultBuilder_coreImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.impl.GetContextKeyResultBuilder_coreImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.impl.GetContextKeyResultBuilder_coreImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.impl.GetContextKeyResultBuilder_coreImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetContextKeyResultBuilder_coreImpl extends MinimalEObjectImpl.Container
		implements GetContextKeyResultBuilder_core {
	/**
	 * The default value of the '{@link #getKey_java_lang_String_() <em>Key java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey_java_lang_String_() <em>Key java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String key_java_lang_String_ = KEY_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getProps_java_lang_String__java_lang_Object_AsMap() <em>Props java lang String java lang Object As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProps_java_lang_String__java_lang_Object_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProps_java_lang_String__java_lang_Object_AsMap() <em>Props java lang String java lang Object As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProps_java_lang_String__java_lang_Object_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String props_java_lang_String__java_lang_Object_AsMap = PROPS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.core.GetContextKeyResult";

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
	protected GetContextKeyResultBuilder_coreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.GET_CONTEXT_KEY_RESULT_BUILDER_CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKey_java_lang_String_() {
		return key_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKey_java_lang_String_(String newKey_java_lang_String_) {
		String oldKey_java_lang_String_ = key_java_lang_String_;
		key_java_lang_String_ = newKey_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.GET_CONTEXT_KEY_RESULT_BUILDER_CORE__KEY_JAVA_LANG_STRING_, oldKey_java_lang_String_,
					key_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProps_java_lang_String__java_lang_Object_AsMap() {
		return props_java_lang_String__java_lang_Object_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProps_java_lang_String__java_lang_Object_AsMap(
			String newProps_java_lang_String__java_lang_Object_AsMap) {
		String oldProps_java_lang_String__java_lang_Object_AsMap = props_java_lang_String__java_lang_Object_AsMap;
		props_java_lang_String__java_lang_Object_AsMap = newProps_java_lang_String__java_lang_Object_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.GET_CONTEXT_KEY_RESULT_BUILDER_CORE__PROPS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP,
					oldProps_java_lang_String__java_lang_Object_AsMap, props_java_lang_String__java_lang_Object_AsMap));
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
					CorePackage.GET_CONTEXT_KEY_RESULT_BUILDER_CORE__VAR_NAME, oldVarName, varName));
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
					CorePackage.GET_CONTEXT_KEY_RESULT_BUILDER_CORE__IDENTIFIER, oldIdentifier, identifier));
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
					CorePackage.GET_CONTEXT_KEY_RESULT_BUILDER_CORE__ADDITIONAL_CODE, oldAdditionalCode,
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
		case CorePackage.GET_CONTEXT_KEY_RESULT_BUILDER_CORE__KEY_JAVA_LANG_STRING_:
			return getKey_java_lang_String_();
		case CorePackage.GET_CONTEXT_KEY_RESULT_BUILDER_CORE__PROPS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
			return getProps_java_lang_String__java_lang_Object_AsMap();
		case CorePackage.GET_CONTEXT_KEY_RESULT_BUILDER_CORE__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case CorePackage.GET_CONTEXT_KEY_RESULT_BUILDER_CORE__VAR_NAME:
			return getVarName();
		case CorePackage.GET_CONTEXT_KEY_RESULT_BUILDER_CORE__IDENTIFIER:
			return getIdentifier();
		case CorePackage.GET_CONTEXT_KEY_RESULT_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.GET_CONTEXT_KEY_RESULT_BUILDER_CORE__KEY_JAVA_LANG_STRING_:
			setKey_java_lang_String_((String) newValue);
			return;
		case CorePackage.GET_CONTEXT_KEY_RESULT_BUILDER_CORE__PROPS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
			setProps_java_lang_String__java_lang_Object_AsMap((String) newValue);
			return;
		case CorePackage.GET_CONTEXT_KEY_RESULT_BUILDER_CORE__VAR_NAME:
			setVarName((String) newValue);
			return;
		case CorePackage.GET_CONTEXT_KEY_RESULT_BUILDER_CORE__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case CorePackage.GET_CONTEXT_KEY_RESULT_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.GET_CONTEXT_KEY_RESULT_BUILDER_CORE__KEY_JAVA_LANG_STRING_:
			setKey_java_lang_String_(KEY_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.GET_CONTEXT_KEY_RESULT_BUILDER_CORE__PROPS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
			setProps_java_lang_String__java_lang_Object_AsMap(PROPS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP_EDEFAULT);
			return;
		case CorePackage.GET_CONTEXT_KEY_RESULT_BUILDER_CORE__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case CorePackage.GET_CONTEXT_KEY_RESULT_BUILDER_CORE__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case CorePackage.GET_CONTEXT_KEY_RESULT_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.GET_CONTEXT_KEY_RESULT_BUILDER_CORE__KEY_JAVA_LANG_STRING_:
			return KEY_JAVA_LANG_STRING__EDEFAULT == null ? key_java_lang_String_ != null
					: !KEY_JAVA_LANG_STRING__EDEFAULT.equals(key_java_lang_String_);
		case CorePackage.GET_CONTEXT_KEY_RESULT_BUILDER_CORE__PROPS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
			return PROPS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP_EDEFAULT == null
					? props_java_lang_String__java_lang_Object_AsMap != null
					: !PROPS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP_EDEFAULT
							.equals(props_java_lang_String__java_lang_Object_AsMap);
		case CorePackage.GET_CONTEXT_KEY_RESULT_BUILDER_CORE__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case CorePackage.GET_CONTEXT_KEY_RESULT_BUILDER_CORE__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case CorePackage.GET_CONTEXT_KEY_RESULT_BUILDER_CORE__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case CorePackage.GET_CONTEXT_KEY_RESULT_BUILDER_CORE__ADDITIONAL_CODE:
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
		result.append(" (key_java_lang_String_: ");
		result.append(key_java_lang_String_);
		result.append(", props_java_lang_String__java_lang_Object_AsMap: ");
		result.append(props_java_lang_String__java_lang_Object_AsMap);
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

} //GetContextKeyResultBuilder_coreImpl
