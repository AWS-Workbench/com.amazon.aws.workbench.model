/**
 */
package core.impl;

import core.CorePackage;
import core.GetContextValueOptionsBuilder_core;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Context Value Options Builder core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link core.impl.GetContextValueOptionsBuilder_coreImpl#getDummyValue_java_lang_Object_ <em>Dummy Value java lang Object </em>}</li>
 *   <li>{@link core.impl.GetContextValueOptionsBuilder_coreImpl#getProvider_java_lang_String_ <em>Provider java lang String </em>}</li>
 *   <li>{@link core.impl.GetContextValueOptionsBuilder_coreImpl#getProps_java_lang_String__java_lang_Object_AsMap <em>Props java lang String java lang Object As Map</em>}</li>
 *   <li>{@link core.impl.GetContextValueOptionsBuilder_coreImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.impl.GetContextValueOptionsBuilder_coreImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.impl.GetContextValueOptionsBuilder_coreImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.impl.GetContextValueOptionsBuilder_coreImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetContextValueOptionsBuilder_coreImpl extends MinimalEObjectImpl.Container
		implements GetContextValueOptionsBuilder_core {
	/**
	 * The default value of the '{@link #getDummyValue_java_lang_Object_() <em>Dummy Value java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDummyValue_java_lang_Object_()
	 * @generated
	 * @ordered
	 */
	protected static final Object DUMMY_VALUE_JAVA_LANG_OBJECT__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDummyValue_java_lang_Object_() <em>Dummy Value java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDummyValue_java_lang_Object_()
	 * @generated
	 * @ordered
	 */
	protected Object dummyValue_java_lang_Object_ = DUMMY_VALUE_JAVA_LANG_OBJECT__EDEFAULT;

	/**
	 * The default value of the '{@link #getProvider_java_lang_String_() <em>Provider java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProvider_java_lang_String_() <em>Provider java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String provider_java_lang_String_ = PROVIDER_JAVA_LANG_STRING__EDEFAULT;

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
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.core.GetContextValueOptions";

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
	protected GetContextValueOptionsBuilder_coreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getDummyValue_java_lang_Object_() {
		return dummyValue_java_lang_Object_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDummyValue_java_lang_Object_(Object newDummyValue_java_lang_Object_) {
		Object oldDummyValue_java_lang_Object_ = dummyValue_java_lang_Object_;
		dummyValue_java_lang_Object_ = newDummyValue_java_lang_Object_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__DUMMY_VALUE_JAVA_LANG_OBJECT_,
					oldDummyValue_java_lang_Object_, dummyValue_java_lang_Object_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProvider_java_lang_String_() {
		return provider_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProvider_java_lang_String_(String newProvider_java_lang_String_) {
		String oldProvider_java_lang_String_ = provider_java_lang_String_;
		provider_java_lang_String_ = newProvider_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__PROVIDER_JAVA_LANG_STRING_,
					oldProvider_java_lang_String_, provider_java_lang_String_));
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
					CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__PROPS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP,
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
					CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__VAR_NAME, oldVarName, varName));
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
					CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__IDENTIFIER, oldIdentifier, identifier));
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
					CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE, oldAdditionalCode,
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
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__DUMMY_VALUE_JAVA_LANG_OBJECT_:
			return getDummyValue_java_lang_Object_();
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__PROVIDER_JAVA_LANG_STRING_:
			return getProvider_java_lang_String_();
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__PROPS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
			return getProps_java_lang_String__java_lang_Object_AsMap();
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__VAR_NAME:
			return getVarName();
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__IDENTIFIER:
			return getIdentifier();
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__DUMMY_VALUE_JAVA_LANG_OBJECT_:
			setDummyValue_java_lang_Object_(newValue);
			return;
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__PROVIDER_JAVA_LANG_STRING_:
			setProvider_java_lang_String_((String) newValue);
			return;
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__PROPS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
			setProps_java_lang_String__java_lang_Object_AsMap((String) newValue);
			return;
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__VAR_NAME:
			setVarName((String) newValue);
			return;
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__DUMMY_VALUE_JAVA_LANG_OBJECT_:
			setDummyValue_java_lang_Object_(DUMMY_VALUE_JAVA_LANG_OBJECT__EDEFAULT);
			return;
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__PROVIDER_JAVA_LANG_STRING_:
			setProvider_java_lang_String_(PROVIDER_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__PROPS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
			setProps_java_lang_String__java_lang_Object_AsMap(PROPS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP_EDEFAULT);
			return;
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__DUMMY_VALUE_JAVA_LANG_OBJECT_:
			return DUMMY_VALUE_JAVA_LANG_OBJECT__EDEFAULT == null ? dummyValue_java_lang_Object_ != null
					: !DUMMY_VALUE_JAVA_LANG_OBJECT__EDEFAULT.equals(dummyValue_java_lang_Object_);
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__PROVIDER_JAVA_LANG_STRING_:
			return PROVIDER_JAVA_LANG_STRING__EDEFAULT == null ? provider_java_lang_String_ != null
					: !PROVIDER_JAVA_LANG_STRING__EDEFAULT.equals(provider_java_lang_String_);
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__PROPS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
			return PROPS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP_EDEFAULT == null
					? props_java_lang_String__java_lang_Object_AsMap != null
					: !PROPS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP_EDEFAULT
							.equals(props_java_lang_String__java_lang_Object_AsMap);
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
		result.append(" (dummyValue_java_lang_Object_: ");
		result.append(dummyValue_java_lang_Object_);
		result.append(", provider_java_lang_String_: ");
		result.append(provider_java_lang_String_);
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

} //GetContextValueOptionsBuilder_coreImpl
