/**
 */
package apigateway.impl;

import apigateway.ApigatewayPackage;
import apigateway.HttpIntegrationPropsBuilder_apigateway;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Http Integration Props Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apigateway.impl.HttpIntegrationPropsBuilder_apigatewayImpl#getHttpMethod_java_lang_String_ <em>Http Method java lang String </em>}</li>
 *   <li>{@link apigateway.impl.HttpIntegrationPropsBuilder_apigatewayImpl#getOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference <em>Options With Integration Options software amazon awscdk services apigateway Integration Options As Reference</em>}</li>
 *   <li>{@link apigateway.impl.HttpIntegrationPropsBuilder_apigatewayImpl#getProxy_java_lang_Boolean_ <em>Proxy java lang Boolean </em>}</li>
 *   <li>{@link apigateway.impl.HttpIntegrationPropsBuilder_apigatewayImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.impl.HttpIntegrationPropsBuilder_apigatewayImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.impl.HttpIntegrationPropsBuilder_apigatewayImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.impl.HttpIntegrationPropsBuilder_apigatewayImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HttpIntegrationPropsBuilder_apigatewayImpl extends MinimalEObjectImpl.Container
		implements HttpIntegrationPropsBuilder_apigateway {
	/**
	 * The default value of the '{@link #getHttpMethod_java_lang_String_() <em>Http Method java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpMethod_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String HTTP_METHOD_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHttpMethod_java_lang_String_() <em>Http Method java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpMethod_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String httpMethod_java_lang_String_ = HTTP_METHOD_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference() <em>Options With Integration Options software amazon awscdk services apigateway Integration Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String OPTIONS_WITH_INTEGRATION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_OPTIONS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference() <em>Options With Integration Options software amazon awscdk services apigateway Integration Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String optionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference = OPTIONS_WITH_INTEGRATION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_OPTIONS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProxy_java_lang_Boolean_() <em>Proxy java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxy_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PROXY_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProxy_java_lang_Boolean_() <em>Proxy java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxy_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean proxy_java_lang_Boolean_ = PROXY_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.apigateway.HttpIntegrationProps";

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
	protected HttpIntegrationPropsBuilder_apigatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApigatewayPackage.Literals.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHttpMethod_java_lang_String_() {
		return httpMethod_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHttpMethod_java_lang_String_(String newHttpMethod_java_lang_String_) {
		String oldHttpMethod_java_lang_String_ = httpMethod_java_lang_String_;
		httpMethod_java_lang_String_ = newHttpMethod_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__HTTP_METHOD_JAVA_LANG_STRING_,
					oldHttpMethod_java_lang_String_, httpMethod_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference() {
		return optionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference(
			String newOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference) {
		String oldOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference = optionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference;
		optionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference = newOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__OPTIONS_WITH_INTEGRATION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_OPTIONS_AS_REFERENCE,
					oldOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference,
					optionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getProxy_java_lang_Boolean_() {
		return proxy_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProxy_java_lang_Boolean_(Boolean newProxy_java_lang_Boolean_) {
		Boolean oldProxy_java_lang_Boolean_ = proxy_java_lang_Boolean_;
		proxy_java_lang_Boolean_ = newProxy_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__PROXY_JAVA_LANG_BOOLEAN_,
					oldProxy_java_lang_Boolean_, proxy_java_lang_Boolean_));
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
					ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__VAR_NAME, oldVarName, varName));
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
					ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__IDENTIFIER, oldIdentifier,
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
					ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE, oldAdditionalCode,
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
		case ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__HTTP_METHOD_JAVA_LANG_STRING_:
			return getHttpMethod_java_lang_String_();
		case ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__OPTIONS_WITH_INTEGRATION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_OPTIONS_AS_REFERENCE:
			return getOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference();
		case ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__PROXY_JAVA_LANG_BOOLEAN_:
			return getProxy_java_lang_Boolean_();
		case ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__VAR_NAME:
			return getVarName();
		case ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__IDENTIFIER:
			return getIdentifier();
		case ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__HTTP_METHOD_JAVA_LANG_STRING_:
			setHttpMethod_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__OPTIONS_WITH_INTEGRATION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_OPTIONS_AS_REFERENCE:
			setOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference(
					(String) newValue);
			return;
		case ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__PROXY_JAVA_LANG_BOOLEAN_:
			setProxy_java_lang_Boolean_((Boolean) newValue);
			return;
		case ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName((String) newValue);
			return;
		case ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__HTTP_METHOD_JAVA_LANG_STRING_:
			setHttpMethod_java_lang_String_(HTTP_METHOD_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__OPTIONS_WITH_INTEGRATION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_OPTIONS_AS_REFERENCE:
			setOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference(
					OPTIONS_WITH_INTEGRATION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_OPTIONS_AS_REFERENCE_EDEFAULT);
			return;
		case ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__PROXY_JAVA_LANG_BOOLEAN_:
			setProxy_java_lang_Boolean_(PROXY_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__HTTP_METHOD_JAVA_LANG_STRING_:
			return HTTP_METHOD_JAVA_LANG_STRING__EDEFAULT == null ? httpMethod_java_lang_String_ != null
					: !HTTP_METHOD_JAVA_LANG_STRING__EDEFAULT.equals(httpMethod_java_lang_String_);
		case ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__OPTIONS_WITH_INTEGRATION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_OPTIONS_AS_REFERENCE:
			return OPTIONS_WITH_INTEGRATION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_OPTIONS_AS_REFERENCE_EDEFAULT == null
					? optionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference != null
					: !OPTIONS_WITH_INTEGRATION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_OPTIONS_AS_REFERENCE_EDEFAULT
							.equals(optionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference);
		case ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__PROXY_JAVA_LANG_BOOLEAN_:
			return PROXY_JAVA_LANG_BOOLEAN__EDEFAULT == null ? proxy_java_lang_Boolean_ != null
					: !PROXY_JAVA_LANG_BOOLEAN__EDEFAULT.equals(proxy_java_lang_Boolean_);
		case ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		result.append(" (httpMethod_java_lang_String_: ");
		result.append(httpMethod_java_lang_String_);
		result.append(
				", optionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference: ");
		result.append(
				optionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference);
		result.append(", proxy_java_lang_Boolean_: ");
		result.append(proxy_java_lang_Boolean_);
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

} //HttpIntegrationPropsBuilder_apigatewayImpl
