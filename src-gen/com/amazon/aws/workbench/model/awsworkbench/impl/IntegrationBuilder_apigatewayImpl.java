/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.IntegrationBuilder_apigateway;
import com.amazon.aws.workbench.model.awsworkbench.IntegrationType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integration Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.IntegrationBuilder_apigatewayImpl#getType_software_amazon_awscdk_services_apigateway_IntegrationType_ <em>Type software amazon awscdk services apigateway Integration Type </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.IntegrationBuilder_apigatewayImpl#getIntegrationHttpMethod_java_lang_String_ <em>Integration Http Method java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.IntegrationBuilder_apigatewayImpl#getOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference <em>Options With Integration Options software amazon awscdk services apigateway Integration Options As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.IntegrationBuilder_apigatewayImpl#getUri_java_lang_Object_ <em>Uri java lang Object </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.IntegrationBuilder_apigatewayImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.IntegrationBuilder_apigatewayImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.IntegrationBuilder_apigatewayImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.IntegrationBuilder_apigatewayImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegrationBuilder_apigatewayImpl extends ServiceResourcesImpl implements IntegrationBuilder_apigateway {
	/**
	 * The default value of the '{@link #getType_software_amazon_awscdk_services_apigateway_IntegrationType_() <em>Type software amazon awscdk services apigateway Integration Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_software_amazon_awscdk_services_apigateway_IntegrationType_()
	 * @generated
	 * @ordered
	 */
	protected static final IntegrationType TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_TYPE__EDEFAULT = IntegrationType.AWS;

	/**
	 * The cached value of the '{@link #getType_software_amazon_awscdk_services_apigateway_IntegrationType_() <em>Type software amazon awscdk services apigateway Integration Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_software_amazon_awscdk_services_apigateway_IntegrationType_()
	 * @generated
	 * @ordered
	 */
	protected IntegrationType type_software_amazon_awscdk_services_apigateway_IntegrationType_ = TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_TYPE__EDEFAULT;

	/**
	 * The default value of the '{@link #getIntegrationHttpMethod_java_lang_String_() <em>Integration Http Method java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrationHttpMethod_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String INTEGRATION_HTTP_METHOD_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntegrationHttpMethod_java_lang_String_() <em>Integration Http Method java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrationHttpMethod_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String integrationHttpMethod_java_lang_String_ = INTEGRATION_HTTP_METHOD_JAVA_LANG_STRING__EDEFAULT;

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
	 * The default value of the '{@link #getUri_java_lang_Object_() <em>Uri java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri_java_lang_Object_()
	 * @generated
	 * @ordered
	 */
	protected static final Object URI_JAVA_LANG_OBJECT__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri_java_lang_Object_() <em>Uri java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri_java_lang_Object_()
	 * @generated
	 * @ordered
	 */
	protected Object uri_java_lang_Object_ = URI_JAVA_LANG_OBJECT__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.apigateway.Integration";

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
	protected IntegrationBuilder_apigatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.INTEGRATION_BUILDER_APIGATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegrationType getType_software_amazon_awscdk_services_apigateway_IntegrationType_() {
		return type_software_amazon_awscdk_services_apigateway_IntegrationType_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType_software_amazon_awscdk_services_apigateway_IntegrationType_(
			IntegrationType newType_software_amazon_awscdk_services_apigateway_IntegrationType_) {
		IntegrationType oldType_software_amazon_awscdk_services_apigateway_IntegrationType_ = type_software_amazon_awscdk_services_apigateway_IntegrationType_;
		type_software_amazon_awscdk_services_apigateway_IntegrationType_ = newType_software_amazon_awscdk_services_apigateway_IntegrationType_ == null
				? TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_TYPE__EDEFAULT
				: newType_software_amazon_awscdk_services_apigateway_IntegrationType_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_TYPE_,
					oldType_software_amazon_awscdk_services_apigateway_IntegrationType_,
					type_software_amazon_awscdk_services_apigateway_IntegrationType_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIntegrationHttpMethod_java_lang_String_() {
		return integrationHttpMethod_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntegrationHttpMethod_java_lang_String_(String newIntegrationHttpMethod_java_lang_String_) {
		String oldIntegrationHttpMethod_java_lang_String_ = integrationHttpMethod_java_lang_String_;
		integrationHttpMethod_java_lang_String_ = newIntegrationHttpMethod_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__INTEGRATION_HTTP_METHOD_JAVA_LANG_STRING_,
					oldIntegrationHttpMethod_java_lang_String_, integrationHttpMethod_java_lang_String_));
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
					AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__OPTIONS_WITH_INTEGRATION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_OPTIONS_AS_REFERENCE,
					oldOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference,
					optionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getUri_java_lang_Object_() {
		return uri_java_lang_Object_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUri_java_lang_Object_(Object newUri_java_lang_Object_) {
		Object oldUri_java_lang_Object_ = uri_java_lang_Object_;
		uri_java_lang_Object_ = newUri_java_lang_Object_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__URI_JAVA_LANG_OBJECT_, oldUri_java_lang_Object_,
					uri_java_lang_Object_));
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
					AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_TYPE_:
			return getType_software_amazon_awscdk_services_apigateway_IntegrationType_();
		case AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__INTEGRATION_HTTP_METHOD_JAVA_LANG_STRING_:
			return getIntegrationHttpMethod_java_lang_String_();
		case AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__OPTIONS_WITH_INTEGRATION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_OPTIONS_AS_REFERENCE:
			return getOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference();
		case AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__URI_JAVA_LANG_OBJECT_:
			return getUri_java_lang_Object_();
		case AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_TYPE_:
			setType_software_amazon_awscdk_services_apigateway_IntegrationType_((IntegrationType) newValue);
			return;
		case AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__INTEGRATION_HTTP_METHOD_JAVA_LANG_STRING_:
			setIntegrationHttpMethod_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__OPTIONS_WITH_INTEGRATION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_OPTIONS_AS_REFERENCE:
			setOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__URI_JAVA_LANG_OBJECT_:
			setUri_java_lang_Object_(newValue);
			return;
		case AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_TYPE_:
			setType_software_amazon_awscdk_services_apigateway_IntegrationType_(
					TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_TYPE__EDEFAULT);
			return;
		case AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__INTEGRATION_HTTP_METHOD_JAVA_LANG_STRING_:
			setIntegrationHttpMethod_java_lang_String_(INTEGRATION_HTTP_METHOD_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__OPTIONS_WITH_INTEGRATION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_OPTIONS_AS_REFERENCE:
			setOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference(
					OPTIONS_WITH_INTEGRATION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_OPTIONS_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__URI_JAVA_LANG_OBJECT_:
			setUri_java_lang_Object_(URI_JAVA_LANG_OBJECT__EDEFAULT);
			return;
		case AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_TYPE_:
			return type_software_amazon_awscdk_services_apigateway_IntegrationType_ != TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_TYPE__EDEFAULT;
		case AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__INTEGRATION_HTTP_METHOD_JAVA_LANG_STRING_:
			return INTEGRATION_HTTP_METHOD_JAVA_LANG_STRING__EDEFAULT == null
					? integrationHttpMethod_java_lang_String_ != null
					: !INTEGRATION_HTTP_METHOD_JAVA_LANG_STRING__EDEFAULT
							.equals(integrationHttpMethod_java_lang_String_);
		case AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__OPTIONS_WITH_INTEGRATION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_OPTIONS_AS_REFERENCE:
			return OPTIONS_WITH_INTEGRATION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_OPTIONS_AS_REFERENCE_EDEFAULT == null
					? optionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference != null
					: !OPTIONS_WITH_INTEGRATION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_OPTIONS_AS_REFERENCE_EDEFAULT
							.equals(optionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference);
		case AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__URI_JAVA_LANG_OBJECT_:
			return URI_JAVA_LANG_OBJECT__EDEFAULT == null ? uri_java_lang_Object_ != null
					: !URI_JAVA_LANG_OBJECT__EDEFAULT.equals(uri_java_lang_Object_);
		case AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		result.append(" (type_software_amazon_awscdk_services_apigateway_IntegrationType_: ");
		result.append(type_software_amazon_awscdk_services_apigateway_IntegrationType_);
		result.append(", integrationHttpMethod_java_lang_String_: ");
		result.append(integrationHttpMethod_java_lang_String_);
		result.append(
				", optionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference: ");
		result.append(
				optionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference);
		result.append(", uri_java_lang_Object_: ");
		result.append(uri_java_lang_Object_);
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

} //IntegrationBuilder_apigatewayImpl
