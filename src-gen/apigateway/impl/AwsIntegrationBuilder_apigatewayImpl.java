/**
 */
package apigateway.impl;

import apigateway.ApigatewayPackage;
import apigateway.AwsIntegrationBuilder_apigateway;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aws Integration Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apigateway.impl.AwsIntegrationBuilder_apigatewayImpl#getService_java_lang_String_ <em>Service java lang String </em>}</li>
 *   <li>{@link apigateway.impl.AwsIntegrationBuilder_apigatewayImpl#getAction_java_lang_String_ <em>Action java lang String </em>}</li>
 *   <li>{@link apigateway.impl.AwsIntegrationBuilder_apigatewayImpl#getActionParameters_java_lang_String__java_lang_String_AsMap <em>Action Parameters java lang String java lang String As Map</em>}</li>
 *   <li>{@link apigateway.impl.AwsIntegrationBuilder_apigatewayImpl#getIntegrationHttpMethod_java_lang_String_ <em>Integration Http Method java lang String </em>}</li>
 *   <li>{@link apigateway.impl.AwsIntegrationBuilder_apigatewayImpl#getOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference <em>Options With Integration Options software amazon awscdk services apigateway Integration Options As Reference</em>}</li>
 *   <li>{@link apigateway.impl.AwsIntegrationBuilder_apigatewayImpl#getPath_java_lang_String_ <em>Path java lang String </em>}</li>
 *   <li>{@link apigateway.impl.AwsIntegrationBuilder_apigatewayImpl#getProxy_java_lang_Boolean_ <em>Proxy java lang Boolean </em>}</li>
 *   <li>{@link apigateway.impl.AwsIntegrationBuilder_apigatewayImpl#getSubdomain_java_lang_String_ <em>Subdomain java lang String </em>}</li>
 *   <li>{@link apigateway.impl.AwsIntegrationBuilder_apigatewayImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.impl.AwsIntegrationBuilder_apigatewayImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.impl.AwsIntegrationBuilder_apigatewayImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.impl.AwsIntegrationBuilder_apigatewayImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AwsIntegrationBuilder_apigatewayImpl extends MinimalEObjectImpl.Container
		implements AwsIntegrationBuilder_apigateway {
	/**
	 * The default value of the '{@link #getService_java_lang_String_() <em>Service java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getService_java_lang_String_() <em>Service java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String service_java_lang_String_ = SERVICE_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getAction_java_lang_String_() <em>Action java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAction_java_lang_String_() <em>Action java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String action_java_lang_String_ = ACTION_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getActionParameters_java_lang_String__java_lang_String_AsMap() <em>Action Parameters java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionParameters_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionParameters_java_lang_String__java_lang_String_AsMap() <em>Action Parameters java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionParameters_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String actionParameters_java_lang_String__java_lang_String_AsMap = ACTION_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT;

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
	 * The default value of the '{@link #getPath_java_lang_String_() <em>Path java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath_java_lang_String_() <em>Path java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String path_java_lang_String_ = PATH_JAVA_LANG_STRING__EDEFAULT;

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
	 * The default value of the '{@link #getSubdomain_java_lang_String_() <em>Subdomain java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubdomain_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBDOMAIN_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubdomain_java_lang_String_() <em>Subdomain java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubdomain_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String subdomain_java_lang_String_ = SUBDOMAIN_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.apigateway.AwsIntegration";

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
	protected AwsIntegrationBuilder_apigatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApigatewayPackage.Literals.AWS_INTEGRATION_BUILDER_APIGATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getService_java_lang_String_() {
		return service_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setService_java_lang_String_(String newService_java_lang_String_) {
		String oldService_java_lang_String_ = service_java_lang_String_;
		service_java_lang_String_ = newService_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__SERVICE_JAVA_LANG_STRING_,
					oldService_java_lang_String_, service_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAction_java_lang_String_() {
		return action_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAction_java_lang_String_(String newAction_java_lang_String_) {
		String oldAction_java_lang_String_ = action_java_lang_String_;
		action_java_lang_String_ = newAction_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__ACTION_JAVA_LANG_STRING_,
					oldAction_java_lang_String_, action_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getActionParameters_java_lang_String__java_lang_String_AsMap() {
		return actionParameters_java_lang_String__java_lang_String_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActionParameters_java_lang_String__java_lang_String_AsMap(
			String newActionParameters_java_lang_String__java_lang_String_AsMap) {
		String oldActionParameters_java_lang_String__java_lang_String_AsMap = actionParameters_java_lang_String__java_lang_String_AsMap;
		actionParameters_java_lang_String__java_lang_String_AsMap = newActionParameters_java_lang_String__java_lang_String_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__ACTION_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
					oldActionParameters_java_lang_String__java_lang_String_AsMap,
					actionParameters_java_lang_String__java_lang_String_AsMap));
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
					ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__INTEGRATION_HTTP_METHOD_JAVA_LANG_STRING_,
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
					ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__OPTIONS_WITH_INTEGRATION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_OPTIONS_AS_REFERENCE,
					oldOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference,
					optionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath_java_lang_String_() {
		return path_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath_java_lang_String_(String newPath_java_lang_String_) {
		String oldPath_java_lang_String_ = path_java_lang_String_;
		path_java_lang_String_ = newPath_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__PATH_JAVA_LANG_STRING_,
					oldPath_java_lang_String_, path_java_lang_String_));
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
					ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__PROXY_JAVA_LANG_BOOLEAN_,
					oldProxy_java_lang_Boolean_, proxy_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubdomain_java_lang_String_() {
		return subdomain_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubdomain_java_lang_String_(String newSubdomain_java_lang_String_) {
		String oldSubdomain_java_lang_String_ = subdomain_java_lang_String_;
		subdomain_java_lang_String_ = newSubdomain_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__SUBDOMAIN_JAVA_LANG_STRING_,
					oldSubdomain_java_lang_String_, subdomain_java_lang_String_));
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
					ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__VAR_NAME, oldVarName, varName));
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
					ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__IDENTIFIER, oldIdentifier, identifier));
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
					ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__ADDITIONAL_CODE, oldAdditionalCode,
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
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__SERVICE_JAVA_LANG_STRING_:
			return getService_java_lang_String_();
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__ACTION_JAVA_LANG_STRING_:
			return getAction_java_lang_String_();
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__ACTION_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return getActionParameters_java_lang_String__java_lang_String_AsMap();
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__INTEGRATION_HTTP_METHOD_JAVA_LANG_STRING_:
			return getIntegrationHttpMethod_java_lang_String_();
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__OPTIONS_WITH_INTEGRATION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_OPTIONS_AS_REFERENCE:
			return getOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference();
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__PATH_JAVA_LANG_STRING_:
			return getPath_java_lang_String_();
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__PROXY_JAVA_LANG_BOOLEAN_:
			return getProxy_java_lang_Boolean_();
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__SUBDOMAIN_JAVA_LANG_STRING_:
			return getSubdomain_java_lang_String_();
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__VAR_NAME:
			return getVarName();
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__IDENTIFIER:
			return getIdentifier();
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__SERVICE_JAVA_LANG_STRING_:
			setService_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__ACTION_JAVA_LANG_STRING_:
			setAction_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__ACTION_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setActionParameters_java_lang_String__java_lang_String_AsMap((String) newValue);
			return;
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__INTEGRATION_HTTP_METHOD_JAVA_LANG_STRING_:
			setIntegrationHttpMethod_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__OPTIONS_WITH_INTEGRATION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_OPTIONS_AS_REFERENCE:
			setOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference(
					(String) newValue);
			return;
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__PATH_JAVA_LANG_STRING_:
			setPath_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__PROXY_JAVA_LANG_BOOLEAN_:
			setProxy_java_lang_Boolean_((Boolean) newValue);
			return;
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__SUBDOMAIN_JAVA_LANG_STRING_:
			setSubdomain_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName((String) newValue);
			return;
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__SERVICE_JAVA_LANG_STRING_:
			setService_java_lang_String_(SERVICE_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__ACTION_JAVA_LANG_STRING_:
			setAction_java_lang_String_(ACTION_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__ACTION_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setActionParameters_java_lang_String__java_lang_String_AsMap(
					ACTION_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT);
			return;
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__INTEGRATION_HTTP_METHOD_JAVA_LANG_STRING_:
			setIntegrationHttpMethod_java_lang_String_(INTEGRATION_HTTP_METHOD_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__OPTIONS_WITH_INTEGRATION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_OPTIONS_AS_REFERENCE:
			setOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference(
					OPTIONS_WITH_INTEGRATION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_OPTIONS_AS_REFERENCE_EDEFAULT);
			return;
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__PATH_JAVA_LANG_STRING_:
			setPath_java_lang_String_(PATH_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__PROXY_JAVA_LANG_BOOLEAN_:
			setProxy_java_lang_Boolean_(PROXY_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__SUBDOMAIN_JAVA_LANG_STRING_:
			setSubdomain_java_lang_String_(SUBDOMAIN_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__SERVICE_JAVA_LANG_STRING_:
			return SERVICE_JAVA_LANG_STRING__EDEFAULT == null ? service_java_lang_String_ != null
					: !SERVICE_JAVA_LANG_STRING__EDEFAULT.equals(service_java_lang_String_);
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__ACTION_JAVA_LANG_STRING_:
			return ACTION_JAVA_LANG_STRING__EDEFAULT == null ? action_java_lang_String_ != null
					: !ACTION_JAVA_LANG_STRING__EDEFAULT.equals(action_java_lang_String_);
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__ACTION_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return ACTION_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT == null
					? actionParameters_java_lang_String__java_lang_String_AsMap != null
					: !ACTION_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT
							.equals(actionParameters_java_lang_String__java_lang_String_AsMap);
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__INTEGRATION_HTTP_METHOD_JAVA_LANG_STRING_:
			return INTEGRATION_HTTP_METHOD_JAVA_LANG_STRING__EDEFAULT == null
					? integrationHttpMethod_java_lang_String_ != null
					: !INTEGRATION_HTTP_METHOD_JAVA_LANG_STRING__EDEFAULT
							.equals(integrationHttpMethod_java_lang_String_);
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__OPTIONS_WITH_INTEGRATION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_OPTIONS_AS_REFERENCE:
			return OPTIONS_WITH_INTEGRATION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_OPTIONS_AS_REFERENCE_EDEFAULT == null
					? optionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference != null
					: !OPTIONS_WITH_INTEGRATION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_OPTIONS_AS_REFERENCE_EDEFAULT
							.equals(optionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference);
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__PATH_JAVA_LANG_STRING_:
			return PATH_JAVA_LANG_STRING__EDEFAULT == null ? path_java_lang_String_ != null
					: !PATH_JAVA_LANG_STRING__EDEFAULT.equals(path_java_lang_String_);
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__PROXY_JAVA_LANG_BOOLEAN_:
			return PROXY_JAVA_LANG_BOOLEAN__EDEFAULT == null ? proxy_java_lang_Boolean_ != null
					: !PROXY_JAVA_LANG_BOOLEAN__EDEFAULT.equals(proxy_java_lang_Boolean_);
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__SUBDOMAIN_JAVA_LANG_STRING_:
			return SUBDOMAIN_JAVA_LANG_STRING__EDEFAULT == null ? subdomain_java_lang_String_ != null
					: !SUBDOMAIN_JAVA_LANG_STRING__EDEFAULT.equals(subdomain_java_lang_String_);
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		result.append(" (service_java_lang_String_: ");
		result.append(service_java_lang_String_);
		result.append(", action_java_lang_String_: ");
		result.append(action_java_lang_String_);
		result.append(", actionParameters_java_lang_String__java_lang_String_AsMap: ");
		result.append(actionParameters_java_lang_String__java_lang_String_AsMap);
		result.append(", integrationHttpMethod_java_lang_String_: ");
		result.append(integrationHttpMethod_java_lang_String_);
		result.append(
				", optionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference: ");
		result.append(
				optionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference);
		result.append(", path_java_lang_String_: ");
		result.append(path_java_lang_String_);
		result.append(", proxy_java_lang_Boolean_: ");
		result.append(proxy_java_lang_Boolean_);
		result.append(", subdomain_java_lang_String_: ");
		result.append(subdomain_java_lang_String_);
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

} //AwsIntegrationBuilder_apigatewayImpl
