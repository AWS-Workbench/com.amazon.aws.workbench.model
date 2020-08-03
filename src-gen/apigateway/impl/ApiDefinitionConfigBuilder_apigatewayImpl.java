/**
 */
package apigateway.impl;

import apigateway.ApiDefinitionConfigBuilder_apigateway;
import apigateway.ApigatewayPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Api Definition Config Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apigateway.impl.ApiDefinitionConfigBuilder_apigatewayImpl#getInlineDefinition_java_lang_Object_ <em>Inline Definition java lang Object </em>}</li>
 *   <li>{@link apigateway.impl.ApiDefinitionConfigBuilder_apigatewayImpl#getS3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference <em>S3 Location With Api Definition S3 Location software amazon awscdk services apigateway Api Definition S3 Location As Reference</em>}</li>
 *   <li>{@link apigateway.impl.ApiDefinitionConfigBuilder_apigatewayImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.impl.ApiDefinitionConfigBuilder_apigatewayImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.impl.ApiDefinitionConfigBuilder_apigatewayImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.impl.ApiDefinitionConfigBuilder_apigatewayImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApiDefinitionConfigBuilder_apigatewayImpl extends MinimalEObjectImpl.Container
		implements ApiDefinitionConfigBuilder_apigateway {
	/**
	 * The default value of the '{@link #getInlineDefinition_java_lang_Object_() <em>Inline Definition java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInlineDefinition_java_lang_Object_()
	 * @generated
	 * @ordered
	 */
	protected static final Object INLINE_DEFINITION_JAVA_LANG_OBJECT__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInlineDefinition_java_lang_Object_() <em>Inline Definition java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInlineDefinition_java_lang_Object_()
	 * @generated
	 * @ordered
	 */
	protected Object inlineDefinition_java_lang_Object_ = INLINE_DEFINITION_JAVA_LANG_OBJECT__EDEFAULT;

	/**
	 * The default value of the '{@link #getS3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference() <em>S3 Location With Api Definition S3 Location software amazon awscdk services apigateway Api Definition S3 Location As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String S3_LOCATION_WITH_API_DEFINITION_S3_LOCATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_API_DEFINITION_S3_LOCATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getS3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference() <em>S3 Location With Api Definition S3 Location software amazon awscdk services apigateway Api Definition S3 Location As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String s3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference = S3_LOCATION_WITH_API_DEFINITION_S3_LOCATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_API_DEFINITION_S3_LOCATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.apigateway.ApiDefinitionConfig";

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
	protected ApiDefinitionConfigBuilder_apigatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApigatewayPackage.Literals.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getInlineDefinition_java_lang_Object_() {
		return inlineDefinition_java_lang_Object_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInlineDefinition_java_lang_Object_(Object newInlineDefinition_java_lang_Object_) {
		Object oldInlineDefinition_java_lang_Object_ = inlineDefinition_java_lang_Object_;
		inlineDefinition_java_lang_Object_ = newInlineDefinition_java_lang_Object_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__INLINE_DEFINITION_JAVA_LANG_OBJECT_,
					oldInlineDefinition_java_lang_Object_, inlineDefinition_java_lang_Object_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getS3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference() {
		return s3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setS3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference(
			String newS3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference) {
		String oldS3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference = s3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference;
		s3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference = newS3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__S3_LOCATION_WITH_API_DEFINITION_S3_LOCATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_API_DEFINITION_S3_LOCATION_AS_REFERENCE,
					oldS3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference,
					s3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference));
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
					ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__VAR_NAME, oldVarName, varName));
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
					ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__IDENTIFIER, oldIdentifier, identifier));
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
					ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__ADDITIONAL_CODE, oldAdditionalCode,
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
		case ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__INLINE_DEFINITION_JAVA_LANG_OBJECT_:
			return getInlineDefinition_java_lang_Object_();
		case ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__S3_LOCATION_WITH_API_DEFINITION_S3_LOCATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_API_DEFINITION_S3_LOCATION_AS_REFERENCE:
			return getS3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference();
		case ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__VAR_NAME:
			return getVarName();
		case ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__IDENTIFIER:
			return getIdentifier();
		case ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__INLINE_DEFINITION_JAVA_LANG_OBJECT_:
			setInlineDefinition_java_lang_Object_(newValue);
			return;
		case ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__S3_LOCATION_WITH_API_DEFINITION_S3_LOCATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_API_DEFINITION_S3_LOCATION_AS_REFERENCE:
			setS3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference(
					(String) newValue);
			return;
		case ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName((String) newValue);
			return;
		case ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__INLINE_DEFINITION_JAVA_LANG_OBJECT_:
			setInlineDefinition_java_lang_Object_(INLINE_DEFINITION_JAVA_LANG_OBJECT__EDEFAULT);
			return;
		case ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__S3_LOCATION_WITH_API_DEFINITION_S3_LOCATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_API_DEFINITION_S3_LOCATION_AS_REFERENCE:
			setS3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference(
					S3_LOCATION_WITH_API_DEFINITION_S3_LOCATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_API_DEFINITION_S3_LOCATION_AS_REFERENCE_EDEFAULT);
			return;
		case ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__INLINE_DEFINITION_JAVA_LANG_OBJECT_:
			return INLINE_DEFINITION_JAVA_LANG_OBJECT__EDEFAULT == null ? inlineDefinition_java_lang_Object_ != null
					: !INLINE_DEFINITION_JAVA_LANG_OBJECT__EDEFAULT.equals(inlineDefinition_java_lang_Object_);
		case ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__S3_LOCATION_WITH_API_DEFINITION_S3_LOCATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_API_DEFINITION_S3_LOCATION_AS_REFERENCE:
			return S3_LOCATION_WITH_API_DEFINITION_S3_LOCATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_API_DEFINITION_S3_LOCATION_AS_REFERENCE_EDEFAULT == null
					? s3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference != null
					: !S3_LOCATION_WITH_API_DEFINITION_S3_LOCATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_API_DEFINITION_S3_LOCATION_AS_REFERENCE_EDEFAULT
							.equals(s3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference);
		case ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		result.append(" (inlineDefinition_java_lang_Object_: ");
		result.append(inlineDefinition_java_lang_Object_);
		result.append(
				", s3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference: ");
		result.append(
				s3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference);
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

} //ApiDefinitionConfigBuilder_apigatewayImpl
