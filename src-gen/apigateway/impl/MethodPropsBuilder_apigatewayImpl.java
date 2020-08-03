/**
 */
package apigateway.impl;

import apigateway.ApigatewayPackage;
import apigateway.MethodPropsBuilder_apigateway;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Props Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apigateway.impl.MethodPropsBuilder_apigatewayImpl#getHttpMethod_java_lang_String_ <em>Http Method java lang String </em>}</li>
 *   <li>{@link apigateway.impl.MethodPropsBuilder_apigatewayImpl#getResourceWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference <em>Resource With IResource software amazon awscdk services apigateway IResource As Reference</em>}</li>
 *   <li>{@link apigateway.impl.MethodPropsBuilder_apigatewayImpl#getIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference <em>Integration With Integration software amazon awscdk services apigateway Integration As Reference</em>}</li>
 *   <li>{@link apigateway.impl.MethodPropsBuilder_apigatewayImpl#getOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference <em>Options With Method Options software amazon awscdk services apigateway Method Options As Reference</em>}</li>
 *   <li>{@link apigateway.impl.MethodPropsBuilder_apigatewayImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.impl.MethodPropsBuilder_apigatewayImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.impl.MethodPropsBuilder_apigatewayImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.impl.MethodPropsBuilder_apigatewayImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodPropsBuilder_apigatewayImpl extends MinimalEObjectImpl.Container
		implements MethodPropsBuilder_apigateway {
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
	 * The default value of the '{@link #getResourceWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference() <em>Resource With IResource software amazon awscdk services apigateway IResource As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_WITH_IRESOURCE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IRESOURCE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference() <em>Resource With IResource software amazon awscdk services apigateway IResource As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String resourceWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference = RESOURCE_WITH_IRESOURCE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IRESOURCE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference() <em>Integration With Integration software amazon awscdk services apigateway Integration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference() <em>Integration With Integration software amazon awscdk services apigateway Integration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String integrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference = INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference() <em>Options With Method Options software amazon awscdk services apigateway Method Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference() <em>Options With Method Options software amazon awscdk services apigateway Method Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String optionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference = OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.apigateway.MethodProps";

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
	protected MethodPropsBuilder_apigatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApigatewayPackage.Literals.METHOD_PROPS_BUILDER_APIGATEWAY;
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
					ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__HTTP_METHOD_JAVA_LANG_STRING_,
					oldHttpMethod_java_lang_String_, httpMethod_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResourceWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference() {
		return resourceWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference(
			String newResourceWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference) {
		String oldResourceWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference = resourceWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference;
		resourceWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference = newResourceWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__RESOURCE_WITH_IRESOURCE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IRESOURCE_AS_REFERENCE,
					oldResourceWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference,
					resourceWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference() {
		return integrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference(
			String newIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference) {
		String oldIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference = integrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference;
		integrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference = newIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE,
					oldIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference,
					integrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference() {
		return optionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(
			String newOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference) {
		String oldOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference = optionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference;
		optionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference = newOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE,
					oldOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference,
					optionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference));
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
					ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__VAR_NAME, oldVarName, varName));
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
					ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__IDENTIFIER, oldIdentifier, identifier));
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
					ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE, oldAdditionalCode,
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
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__HTTP_METHOD_JAVA_LANG_STRING_:
			return getHttpMethod_java_lang_String_();
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__RESOURCE_WITH_IRESOURCE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IRESOURCE_AS_REFERENCE:
			return getResourceWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference();
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE:
			return getIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference();
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE:
			return getOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference();
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__VAR_NAME:
			return getVarName();
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__IDENTIFIER:
			return getIdentifier();
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__HTTP_METHOD_JAVA_LANG_STRING_:
			setHttpMethod_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__RESOURCE_WITH_IRESOURCE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IRESOURCE_AS_REFERENCE:
			setResourceWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference(
					(String) newValue);
			return;
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE:
			setIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference(
					(String) newValue);
			return;
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE:
			setOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(
					(String) newValue);
			return;
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName((String) newValue);
			return;
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__HTTP_METHOD_JAVA_LANG_STRING_:
			setHttpMethod_java_lang_String_(HTTP_METHOD_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__RESOURCE_WITH_IRESOURCE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IRESOURCE_AS_REFERENCE:
			setResourceWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference(
					RESOURCE_WITH_IRESOURCE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IRESOURCE_AS_REFERENCE_EDEFAULT);
			return;
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE:
			setIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference(
					INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE_EDEFAULT);
			return;
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE:
			setOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(
					OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE_EDEFAULT);
			return;
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__HTTP_METHOD_JAVA_LANG_STRING_:
			return HTTP_METHOD_JAVA_LANG_STRING__EDEFAULT == null ? httpMethod_java_lang_String_ != null
					: !HTTP_METHOD_JAVA_LANG_STRING__EDEFAULT.equals(httpMethod_java_lang_String_);
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__RESOURCE_WITH_IRESOURCE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IRESOURCE_AS_REFERENCE:
			return RESOURCE_WITH_IRESOURCE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IRESOURCE_AS_REFERENCE_EDEFAULT == null
					? resourceWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference != null
					: !RESOURCE_WITH_IRESOURCE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IRESOURCE_AS_REFERENCE_EDEFAULT
							.equals(resourceWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference);
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE:
			return INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE_EDEFAULT == null
					? integrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference != null
					: !INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE_EDEFAULT
							.equals(integrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference);
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE:
			return OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE_EDEFAULT == null
					? optionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference != null
					: !OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE_EDEFAULT
							.equals(optionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference);
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		result.append(", resourceWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference: ");
		result.append(resourceWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference);
		result.append(
				", integrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference: ");
		result.append(integrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference);
		result.append(
				", optionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference: ");
		result.append(optionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference);
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

} //MethodPropsBuilder_apigatewayImpl
