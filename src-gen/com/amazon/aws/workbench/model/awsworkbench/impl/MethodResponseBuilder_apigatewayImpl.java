/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.MethodResponseBuilder_apigateway;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Response Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.MethodResponseBuilder_apigatewayImpl#getStatusCode_java_lang_String_ <em>Status Code java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.MethodResponseBuilder_apigatewayImpl#getResponseModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap <em>Response Models java lang String software amazon awscdk services apigateway IModel As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.MethodResponseBuilder_apigatewayImpl#getResponseParameters_java_lang_String__java_lang_Boolean_AsMap <em>Response Parameters java lang String java lang Boolean As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.MethodResponseBuilder_apigatewayImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.MethodResponseBuilder_apigatewayImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.MethodResponseBuilder_apigatewayImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.MethodResponseBuilder_apigatewayImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodResponseBuilder_apigatewayImpl extends ServiceResourcesImpl
		implements MethodResponseBuilder_apigateway {
	/**
	 * The default value of the '{@link #getStatusCode_java_lang_String_() <em>Status Code java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusCode_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_CODE_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusCode_java_lang_String_() <em>Status Code java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusCode_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String statusCode_java_lang_String_ = STATUS_CODE_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getResponseModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap() <em>Response Models java lang String software amazon awscdk services apigateway IModel As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSE_MODELS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IMODEL_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponseModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap() <em>Response Models java lang String software amazon awscdk services apigateway IModel As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String responseModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap = RESPONSE_MODELS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IMODEL_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponseParameters_java_lang_String__java_lang_Boolean_AsMap() <em>Response Parameters java lang String java lang Boolean As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseParameters_java_lang_String__java_lang_Boolean_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSE_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_BOOLEAN_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponseParameters_java_lang_String__java_lang_Boolean_AsMap() <em>Response Parameters java lang String java lang Boolean As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseParameters_java_lang_String__java_lang_Boolean_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String responseParameters_java_lang_String__java_lang_Boolean_AsMap = RESPONSE_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_BOOLEAN_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.apigateway.MethodResponse";

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
	protected MethodResponseBuilder_apigatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.METHOD_RESPONSE_BUILDER_APIGATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatusCode_java_lang_String_() {
		return statusCode_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusCode_java_lang_String_(String newStatusCode_java_lang_String_) {
		String oldStatusCode_java_lang_String_ = statusCode_java_lang_String_;
		statusCode_java_lang_String_ = newStatusCode_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY__STATUS_CODE_JAVA_LANG_STRING_,
					oldStatusCode_java_lang_String_, statusCode_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResponseModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap() {
		return responseModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap(
			String newResponseModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap) {
		String oldResponseModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap = responseModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap;
		responseModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap = newResponseModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY__RESPONSE_MODELS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IMODEL_AS_MAP,
					oldResponseModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap,
					responseModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResponseParameters_java_lang_String__java_lang_Boolean_AsMap() {
		return responseParameters_java_lang_String__java_lang_Boolean_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseParameters_java_lang_String__java_lang_Boolean_AsMap(
			String newResponseParameters_java_lang_String__java_lang_Boolean_AsMap) {
		String oldResponseParameters_java_lang_String__java_lang_Boolean_AsMap = responseParameters_java_lang_String__java_lang_Boolean_AsMap;
		responseParameters_java_lang_String__java_lang_Boolean_AsMap = newResponseParameters_java_lang_String__java_lang_Boolean_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY__RESPONSE_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_BOOLEAN_AS_MAP,
					oldResponseParameters_java_lang_String__java_lang_Boolean_AsMap,
					responseParameters_java_lang_String__java_lang_Boolean_AsMap));
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
					AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY__STATUS_CODE_JAVA_LANG_STRING_:
			return getStatusCode_java_lang_String_();
		case AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY__RESPONSE_MODELS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IMODEL_AS_MAP:
			return getResponseModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap();
		case AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY__RESPONSE_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_BOOLEAN_AS_MAP:
			return getResponseParameters_java_lang_String__java_lang_Boolean_AsMap();
		case AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY__STATUS_CODE_JAVA_LANG_STRING_:
			setStatusCode_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY__RESPONSE_MODELS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IMODEL_AS_MAP:
			setResponseModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap(
					(String) newValue);
			return;
		case AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY__RESPONSE_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_BOOLEAN_AS_MAP:
			setResponseParameters_java_lang_String__java_lang_Boolean_AsMap((String) newValue);
			return;
		case AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY__STATUS_CODE_JAVA_LANG_STRING_:
			setStatusCode_java_lang_String_(STATUS_CODE_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY__RESPONSE_MODELS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IMODEL_AS_MAP:
			setResponseModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap(
					RESPONSE_MODELS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IMODEL_AS_MAP_EDEFAULT);
			return;
		case AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY__RESPONSE_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_BOOLEAN_AS_MAP:
			setResponseParameters_java_lang_String__java_lang_Boolean_AsMap(
					RESPONSE_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_BOOLEAN_AS_MAP_EDEFAULT);
			return;
		case AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY__STATUS_CODE_JAVA_LANG_STRING_:
			return STATUS_CODE_JAVA_LANG_STRING__EDEFAULT == null ? statusCode_java_lang_String_ != null
					: !STATUS_CODE_JAVA_LANG_STRING__EDEFAULT.equals(statusCode_java_lang_String_);
		case AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY__RESPONSE_MODELS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IMODEL_AS_MAP:
			return RESPONSE_MODELS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IMODEL_AS_MAP_EDEFAULT == null
					? responseModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap != null
					: !RESPONSE_MODELS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IMODEL_AS_MAP_EDEFAULT
							.equals(responseModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap);
		case AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY__RESPONSE_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_BOOLEAN_AS_MAP:
			return RESPONSE_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_BOOLEAN_AS_MAP_EDEFAULT == null
					? responseParameters_java_lang_String__java_lang_Boolean_AsMap != null
					: !RESPONSE_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_BOOLEAN_AS_MAP_EDEFAULT
							.equals(responseParameters_java_lang_String__java_lang_Boolean_AsMap);
		case AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		result.append(" (statusCode_java_lang_String_: ");
		result.append(statusCode_java_lang_String_);
		result.append(", responseModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap: ");
		result.append(responseModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap);
		result.append(", responseParameters_java_lang_String__java_lang_Boolean_AsMap: ");
		result.append(responseParameters_java_lang_String__java_lang_Boolean_AsMap);
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

} //MethodResponseBuilder_apigatewayImpl
