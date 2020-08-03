/**
 */
package core.impl;

import core.CorePackage;
import core.SynthesisOptionsBuilder_core;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synthesis Options Builder core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link core.impl.SynthesisOptionsBuilder_coreImpl#getOutdir_java_lang_String_ <em>Outdir java lang String </em>}</li>
 *   <li>{@link core.impl.SynthesisOptionsBuilder_coreImpl#getSkipValidation_java_lang_Boolean_ <em>Skip Validation java lang Boolean </em>}</li>
 *   <li>{@link core.impl.SynthesisOptionsBuilder_coreImpl#getRuntimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference <em>Runtime Info With Runtime Info software amazon awscdk cxapi Runtime Info As Reference</em>}</li>
 *   <li>{@link core.impl.SynthesisOptionsBuilder_coreImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.impl.SynthesisOptionsBuilder_coreImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.impl.SynthesisOptionsBuilder_coreImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.impl.SynthesisOptionsBuilder_coreImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SynthesisOptionsBuilder_coreImpl extends MinimalEObjectImpl.Container
		implements SynthesisOptionsBuilder_core {
	/**
	 * The default value of the '{@link #getOutdir_java_lang_String_() <em>Outdir java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutdir_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTDIR_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutdir_java_lang_String_() <em>Outdir java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutdir_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String outdir_java_lang_String_ = OUTDIR_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getSkipValidation_java_lang_Boolean_() <em>Skip Validation java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkipValidation_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SKIP_VALIDATION_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSkipValidation_java_lang_Boolean_() <em>Skip Validation java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkipValidation_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean skipValidation_java_lang_Boolean_ = SKIP_VALIDATION_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getRuntimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference() <em>Runtime Info With Runtime Info software amazon awscdk cxapi Runtime Info As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String RUNTIME_INFO_WITH_RUNTIME_INFO_SOFTWARE_AMAZON_AWSCDK_CXAPI_RUNTIME_INFO_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuntimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference() <em>Runtime Info With Runtime Info software amazon awscdk cxapi Runtime Info As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String runtimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference = RUNTIME_INFO_WITH_RUNTIME_INFO_SOFTWARE_AMAZON_AWSCDK_CXAPI_RUNTIME_INFO_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.core.SynthesisOptions";

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
	protected SynthesisOptionsBuilder_coreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.SYNTHESIS_OPTIONS_BUILDER_CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutdir_java_lang_String_() {
		return outdir_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutdir_java_lang_String_(String newOutdir_java_lang_String_) {
		String oldOutdir_java_lang_String_ = outdir_java_lang_String_;
		outdir_java_lang_String_ = newOutdir_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE__OUTDIR_JAVA_LANG_STRING_, oldOutdir_java_lang_String_,
					outdir_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSkipValidation_java_lang_Boolean_() {
		return skipValidation_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkipValidation_java_lang_Boolean_(Boolean newSkipValidation_java_lang_Boolean_) {
		Boolean oldSkipValidation_java_lang_Boolean_ = skipValidation_java_lang_Boolean_;
		skipValidation_java_lang_Boolean_ = newSkipValidation_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE__SKIP_VALIDATION_JAVA_LANG_BOOLEAN_,
					oldSkipValidation_java_lang_Boolean_, skipValidation_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRuntimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference() {
		return runtimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuntimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference(
			String newRuntimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference) {
		String oldRuntimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference = runtimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference;
		runtimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference = newRuntimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE__RUNTIME_INFO_WITH_RUNTIME_INFO_SOFTWARE_AMAZON_AWSCDK_CXAPI_RUNTIME_INFO_AS_REFERENCE,
					oldRuntimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference,
					runtimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE__VAR_NAME,
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
					CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE__IDENTIFIER, oldIdentifier, identifier));
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
					CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE__OUTDIR_JAVA_LANG_STRING_:
			return getOutdir_java_lang_String_();
		case CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE__SKIP_VALIDATION_JAVA_LANG_BOOLEAN_:
			return getSkipValidation_java_lang_Boolean_();
		case CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE__RUNTIME_INFO_WITH_RUNTIME_INFO_SOFTWARE_AMAZON_AWSCDK_CXAPI_RUNTIME_INFO_AS_REFERENCE:
			return getRuntimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference();
		case CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE__VAR_NAME:
			return getVarName();
		case CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE__IDENTIFIER:
			return getIdentifier();
		case CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE__OUTDIR_JAVA_LANG_STRING_:
			setOutdir_java_lang_String_((String) newValue);
			return;
		case CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE__SKIP_VALIDATION_JAVA_LANG_BOOLEAN_:
			setSkipValidation_java_lang_Boolean_((Boolean) newValue);
			return;
		case CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE__RUNTIME_INFO_WITH_RUNTIME_INFO_SOFTWARE_AMAZON_AWSCDK_CXAPI_RUNTIME_INFO_AS_REFERENCE:
			setRuntimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference((String) newValue);
			return;
		case CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE__VAR_NAME:
			setVarName((String) newValue);
			return;
		case CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE__OUTDIR_JAVA_LANG_STRING_:
			setOutdir_java_lang_String_(OUTDIR_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE__SKIP_VALIDATION_JAVA_LANG_BOOLEAN_:
			setSkipValidation_java_lang_Boolean_(SKIP_VALIDATION_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE__RUNTIME_INFO_WITH_RUNTIME_INFO_SOFTWARE_AMAZON_AWSCDK_CXAPI_RUNTIME_INFO_AS_REFERENCE:
			setRuntimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference(
					RUNTIME_INFO_WITH_RUNTIME_INFO_SOFTWARE_AMAZON_AWSCDK_CXAPI_RUNTIME_INFO_AS_REFERENCE_EDEFAULT);
			return;
		case CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE__OUTDIR_JAVA_LANG_STRING_:
			return OUTDIR_JAVA_LANG_STRING__EDEFAULT == null ? outdir_java_lang_String_ != null
					: !OUTDIR_JAVA_LANG_STRING__EDEFAULT.equals(outdir_java_lang_String_);
		case CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE__SKIP_VALIDATION_JAVA_LANG_BOOLEAN_:
			return SKIP_VALIDATION_JAVA_LANG_BOOLEAN__EDEFAULT == null ? skipValidation_java_lang_Boolean_ != null
					: !SKIP_VALIDATION_JAVA_LANG_BOOLEAN__EDEFAULT.equals(skipValidation_java_lang_Boolean_);
		case CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE__RUNTIME_INFO_WITH_RUNTIME_INFO_SOFTWARE_AMAZON_AWSCDK_CXAPI_RUNTIME_INFO_AS_REFERENCE:
			return RUNTIME_INFO_WITH_RUNTIME_INFO_SOFTWARE_AMAZON_AWSCDK_CXAPI_RUNTIME_INFO_AS_REFERENCE_EDEFAULT == null
					? runtimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference != null
					: !RUNTIME_INFO_WITH_RUNTIME_INFO_SOFTWARE_AMAZON_AWSCDK_CXAPI_RUNTIME_INFO_AS_REFERENCE_EDEFAULT
							.equals(runtimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference);
		case CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
		result.append(" (outdir_java_lang_String_: ");
		result.append(outdir_java_lang_String_);
		result.append(", skipValidation_java_lang_Boolean_: ");
		result.append(skipValidation_java_lang_Boolean_);
		result.append(", runtimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference: ");
		result.append(runtimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference);
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

} //SynthesisOptionsBuilder_coreImpl
