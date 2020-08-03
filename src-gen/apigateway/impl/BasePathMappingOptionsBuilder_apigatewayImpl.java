/**
 */
package apigateway.impl;

import apigateway.ApigatewayPackage;
import apigateway.BasePathMappingOptionsBuilder_apigateway;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Path Mapping Options Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apigateway.impl.BasePathMappingOptionsBuilder_apigatewayImpl#getBasePath_java_lang_String_ <em>Base Path java lang String </em>}</li>
 *   <li>{@link apigateway.impl.BasePathMappingOptionsBuilder_apigatewayImpl#getStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference <em>Stage With Stage software amazon awscdk services apigateway Stage As Reference</em>}</li>
 *   <li>{@link apigateway.impl.BasePathMappingOptionsBuilder_apigatewayImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.impl.BasePathMappingOptionsBuilder_apigatewayImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.impl.BasePathMappingOptionsBuilder_apigatewayImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.impl.BasePathMappingOptionsBuilder_apigatewayImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasePathMappingOptionsBuilder_apigatewayImpl extends MinimalEObjectImpl.Container
		implements BasePathMappingOptionsBuilder_apigateway {
	/**
	 * The default value of the '{@link #getBasePath_java_lang_String_() <em>Base Path java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePath_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PATH_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePath_java_lang_String_() <em>Base Path java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePath_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String basePath_java_lang_String_ = BASE_PATH_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference() <em>Stage With Stage software amazon awscdk services apigateway Stage As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String STAGE_WITH_STAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference() <em>Stage With Stage software amazon awscdk services apigateway Stage As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String stageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference = STAGE_WITH_STAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.apigateway.BasePathMappingOptions";

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
	protected BasePathMappingOptionsBuilder_apigatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApigatewayPackage.Literals.BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBasePath_java_lang_String_() {
		return basePath_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBasePath_java_lang_String_(String newBasePath_java_lang_String_) {
		String oldBasePath_java_lang_String_ = basePath_java_lang_String_;
		basePath_java_lang_String_ = newBasePath_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY__BASE_PATH_JAVA_LANG_STRING_,
					oldBasePath_java_lang_String_, basePath_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference() {
		return stageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference(
			String newStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference) {
		String oldStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference = stageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference;
		stageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference = newStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY__STAGE_WITH_STAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_AS_REFERENCE,
					oldStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference,
					stageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference));
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
					ApigatewayPackage.BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME, oldVarName, varName));
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
					ApigatewayPackage.BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER, oldIdentifier,
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
					ApigatewayPackage.BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE, oldAdditionalCode,
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
		case ApigatewayPackage.BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY__BASE_PATH_JAVA_LANG_STRING_:
			return getBasePath_java_lang_String_();
		case ApigatewayPackage.BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY__STAGE_WITH_STAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_AS_REFERENCE:
			return getStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference();
		case ApigatewayPackage.BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case ApigatewayPackage.BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
			return getVarName();
		case ApigatewayPackage.BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
			return getIdentifier();
		case ApigatewayPackage.BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY__BASE_PATH_JAVA_LANG_STRING_:
			setBasePath_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY__STAGE_WITH_STAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_AS_REFERENCE:
			setStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference((String) newValue);
			return;
		case ApigatewayPackage.BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName((String) newValue);
			return;
		case ApigatewayPackage.BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case ApigatewayPackage.BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY__BASE_PATH_JAVA_LANG_STRING_:
			setBasePath_java_lang_String_(BASE_PATH_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY__STAGE_WITH_STAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_AS_REFERENCE:
			setStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference(
					STAGE_WITH_STAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_AS_REFERENCE_EDEFAULT);
			return;
		case ApigatewayPackage.BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case ApigatewayPackage.BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case ApigatewayPackage.BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY__BASE_PATH_JAVA_LANG_STRING_:
			return BASE_PATH_JAVA_LANG_STRING__EDEFAULT == null ? basePath_java_lang_String_ != null
					: !BASE_PATH_JAVA_LANG_STRING__EDEFAULT.equals(basePath_java_lang_String_);
		case ApigatewayPackage.BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY__STAGE_WITH_STAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_AS_REFERENCE:
			return STAGE_WITH_STAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_AS_REFERENCE_EDEFAULT == null
					? stageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference != null
					: !STAGE_WITH_STAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_AS_REFERENCE_EDEFAULT
							.equals(stageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference);
		case ApigatewayPackage.BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case ApigatewayPackage.BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case ApigatewayPackage.BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case ApigatewayPackage.BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		result.append(" (basePath_java_lang_String_: ");
		result.append(basePath_java_lang_String_);
		result.append(", stageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference: ");
		result.append(stageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference);
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

} //BasePathMappingOptionsBuilder_apigatewayImpl
