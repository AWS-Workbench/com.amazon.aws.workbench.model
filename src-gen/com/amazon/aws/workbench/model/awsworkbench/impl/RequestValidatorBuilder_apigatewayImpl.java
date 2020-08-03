/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.RequestValidatorBuilder_apigateway;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request Validator Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RequestValidatorBuilder_apigatewayImpl#getRequestValidatorName_java_lang_String_ <em>Request Validator Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RequestValidatorBuilder_apigatewayImpl#getValidateRequestBody_java_lang_Boolean_ <em>Validate Request Body java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RequestValidatorBuilder_apigatewayImpl#getValidateRequestParameters_java_lang_Boolean_ <em>Validate Request Parameters java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RequestValidatorBuilder_apigatewayImpl#getRestApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference <em>Rest Api With IRest Api software amazon awscdk services apigateway IRest Api As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RequestValidatorBuilder_apigatewayImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RequestValidatorBuilder_apigatewayImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RequestValidatorBuilder_apigatewayImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RequestValidatorBuilder_apigatewayImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestValidatorBuilder_apigatewayImpl extends MinimalEObjectImpl.Container
		implements RequestValidatorBuilder_apigateway {
	/**
	 * The default value of the '{@link #getRequestValidatorName_java_lang_String_() <em>Request Validator Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestValidatorName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_VALIDATOR_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestValidatorName_java_lang_String_() <em>Request Validator Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestValidatorName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String requestValidatorName_java_lang_String_ = REQUEST_VALIDATOR_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getValidateRequestBody_java_lang_Boolean_() <em>Validate Request Body java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidateRequestBody_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean VALIDATE_REQUEST_BODY_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidateRequestBody_java_lang_Boolean_() <em>Validate Request Body java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidateRequestBody_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean validateRequestBody_java_lang_Boolean_ = VALIDATE_REQUEST_BODY_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getValidateRequestParameters_java_lang_Boolean_() <em>Validate Request Parameters java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidateRequestParameters_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean VALIDATE_REQUEST_PARAMETERS_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidateRequestParameters_java_lang_Boolean_() <em>Validate Request Parameters java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidateRequestParameters_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean validateRequestParameters_java_lang_Boolean_ = VALIDATE_REQUEST_PARAMETERS_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getRestApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference() <em>Rest Api With IRest Api software amazon awscdk services apigateway IRest Api As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String REST_API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRestApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference() <em>Rest Api With IRest Api software amazon awscdk services apigateway IRest Api As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String restApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference = REST_API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.apigateway.RequestValidator";

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
	protected RequestValidatorBuilder_apigatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.REQUEST_VALIDATOR_BUILDER_APIGATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequestValidatorName_java_lang_String_() {
		return requestValidatorName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestValidatorName_java_lang_String_(String newRequestValidatorName_java_lang_String_) {
		String oldRequestValidatorName_java_lang_String_ = requestValidatorName_java_lang_String_;
		requestValidatorName_java_lang_String_ = newRequestValidatorName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__REQUEST_VALIDATOR_NAME_JAVA_LANG_STRING_,
					oldRequestValidatorName_java_lang_String_, requestValidatorName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getValidateRequestBody_java_lang_Boolean_() {
		return validateRequestBody_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidateRequestBody_java_lang_Boolean_(Boolean newValidateRequestBody_java_lang_Boolean_) {
		Boolean oldValidateRequestBody_java_lang_Boolean_ = validateRequestBody_java_lang_Boolean_;
		validateRequestBody_java_lang_Boolean_ = newValidateRequestBody_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__VALIDATE_REQUEST_BODY_JAVA_LANG_BOOLEAN_,
					oldValidateRequestBody_java_lang_Boolean_, validateRequestBody_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getValidateRequestParameters_java_lang_Boolean_() {
		return validateRequestParameters_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidateRequestParameters_java_lang_Boolean_(
			Boolean newValidateRequestParameters_java_lang_Boolean_) {
		Boolean oldValidateRequestParameters_java_lang_Boolean_ = validateRequestParameters_java_lang_Boolean_;
		validateRequestParameters_java_lang_Boolean_ = newValidateRequestParameters_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__VALIDATE_REQUEST_PARAMETERS_JAVA_LANG_BOOLEAN_,
					oldValidateRequestParameters_java_lang_Boolean_, validateRequestParameters_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRestApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference() {
		return restApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRestApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference(
			String newRestApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference) {
		String oldRestApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference = restApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference;
		restApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference = newRestApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__REST_API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE,
					oldRestApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference,
					restApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference));
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
					AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__REQUEST_VALIDATOR_NAME_JAVA_LANG_STRING_:
			return getRequestValidatorName_java_lang_String_();
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__VALIDATE_REQUEST_BODY_JAVA_LANG_BOOLEAN_:
			return getValidateRequestBody_java_lang_Boolean_();
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__VALIDATE_REQUEST_PARAMETERS_JAVA_LANG_BOOLEAN_:
			return getValidateRequestParameters_java_lang_Boolean_();
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__REST_API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE:
			return getRestApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference();
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__REQUEST_VALIDATOR_NAME_JAVA_LANG_STRING_:
			setRequestValidatorName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__VALIDATE_REQUEST_BODY_JAVA_LANG_BOOLEAN_:
			setValidateRequestBody_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__VALIDATE_REQUEST_PARAMETERS_JAVA_LANG_BOOLEAN_:
			setValidateRequestParameters_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__REST_API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE:
			setRestApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__REQUEST_VALIDATOR_NAME_JAVA_LANG_STRING_:
			setRequestValidatorName_java_lang_String_(REQUEST_VALIDATOR_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__VALIDATE_REQUEST_BODY_JAVA_LANG_BOOLEAN_:
			setValidateRequestBody_java_lang_Boolean_(VALIDATE_REQUEST_BODY_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__VALIDATE_REQUEST_PARAMETERS_JAVA_LANG_BOOLEAN_:
			setValidateRequestParameters_java_lang_Boolean_(VALIDATE_REQUEST_PARAMETERS_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__REST_API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE:
			setRestApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference(
					REST_API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__REQUEST_VALIDATOR_NAME_JAVA_LANG_STRING_:
			return REQUEST_VALIDATOR_NAME_JAVA_LANG_STRING__EDEFAULT == null
					? requestValidatorName_java_lang_String_ != null
					: !REQUEST_VALIDATOR_NAME_JAVA_LANG_STRING__EDEFAULT.equals(requestValidatorName_java_lang_String_);
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__VALIDATE_REQUEST_BODY_JAVA_LANG_BOOLEAN_:
			return VALIDATE_REQUEST_BODY_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? validateRequestBody_java_lang_Boolean_ != null
					: !VALIDATE_REQUEST_BODY_JAVA_LANG_BOOLEAN__EDEFAULT.equals(validateRequestBody_java_lang_Boolean_);
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__VALIDATE_REQUEST_PARAMETERS_JAVA_LANG_BOOLEAN_:
			return VALIDATE_REQUEST_PARAMETERS_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? validateRequestParameters_java_lang_Boolean_ != null
					: !VALIDATE_REQUEST_PARAMETERS_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(validateRequestParameters_java_lang_Boolean_);
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__REST_API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE:
			return REST_API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE_EDEFAULT == null
					? restApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference != null
					: !REST_API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE_EDEFAULT
							.equals(restApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference);
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		result.append(" (requestValidatorName_java_lang_String_: ");
		result.append(requestValidatorName_java_lang_String_);
		result.append(", validateRequestBody_java_lang_Boolean_: ");
		result.append(validateRequestBody_java_lang_Boolean_);
		result.append(", validateRequestParameters_java_lang_Boolean_: ");
		result.append(validateRequestParameters_java_lang_Boolean_);
		result.append(", restApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference: ");
		result.append(restApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference);
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

} //RequestValidatorBuilder_apigatewayImpl
