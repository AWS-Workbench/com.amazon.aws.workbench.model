/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AppMeshProxyConfigurationPropsBuilder_ecs;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App Mesh Proxy Configuration Props Builder ecs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppMeshProxyConfigurationPropsBuilder_ecsImpl#getAppPorts_java_lang_Number_AsList <em>App Ports java lang Number As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppMeshProxyConfigurationPropsBuilder_ecsImpl#getProxyEgressPort_java_lang_Number_ <em>Proxy Egress Port java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppMeshProxyConfigurationPropsBuilder_ecsImpl#getProxyIngressPort_java_lang_Number_ <em>Proxy Ingress Port java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppMeshProxyConfigurationPropsBuilder_ecsImpl#getEgressIgnoredIPs_java_lang_String_AsList <em>Egress Ignored IPs java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppMeshProxyConfigurationPropsBuilder_ecsImpl#getEgressIgnoredPorts_java_lang_Number_AsList <em>Egress Ignored Ports java lang Number As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppMeshProxyConfigurationPropsBuilder_ecsImpl#getIgnoredGid_java_lang_Number_ <em>Ignored Gid java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppMeshProxyConfigurationPropsBuilder_ecsImpl#getIgnoredUid_java_lang_Number_ <em>Ignored Uid java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppMeshProxyConfigurationPropsBuilder_ecsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppMeshProxyConfigurationPropsBuilder_ecsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppMeshProxyConfigurationPropsBuilder_ecsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppMeshProxyConfigurationPropsBuilder_ecsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppMeshProxyConfigurationPropsBuilder_ecsImpl extends ServiceResourcesImpl
		implements AppMeshProxyConfigurationPropsBuilder_ecs {
	/**
	 * The default value of the '{@link #getAppPorts_java_lang_Number_AsList() <em>App Ports java lang Number As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppPorts_java_lang_Number_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String APP_PORTS_JAVA_LANG_NUMBER_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppPorts_java_lang_Number_AsList() <em>App Ports java lang Number As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppPorts_java_lang_Number_AsList()
	 * @generated
	 * @ordered
	 */
	protected String appPorts_java_lang_Number_AsList = APP_PORTS_JAVA_LANG_NUMBER_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getProxyEgressPort_java_lang_Number_() <em>Proxy Egress Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyEgressPort_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int PROXY_EGRESS_PORT_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProxyEgressPort_java_lang_Number_() <em>Proxy Egress Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyEgressPort_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int proxyEgressPort_java_lang_Number_ = PROXY_EGRESS_PORT_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getProxyIngressPort_java_lang_Number_() <em>Proxy Ingress Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyIngressPort_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int PROXY_INGRESS_PORT_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProxyIngressPort_java_lang_Number_() <em>Proxy Ingress Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyIngressPort_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int proxyIngressPort_java_lang_Number_ = PROXY_INGRESS_PORT_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getEgressIgnoredIPs_java_lang_String_AsList() <em>Egress Ignored IPs java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEgressIgnoredIPs_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String EGRESS_IGNORED_IPS_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEgressIgnoredIPs_java_lang_String_AsList() <em>Egress Ignored IPs java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEgressIgnoredIPs_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String egressIgnoredIPs_java_lang_String_AsList = EGRESS_IGNORED_IPS_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getEgressIgnoredPorts_java_lang_Number_AsList() <em>Egress Ignored Ports java lang Number As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEgressIgnoredPorts_java_lang_Number_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String EGRESS_IGNORED_PORTS_JAVA_LANG_NUMBER_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEgressIgnoredPorts_java_lang_Number_AsList() <em>Egress Ignored Ports java lang Number As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEgressIgnoredPorts_java_lang_Number_AsList()
	 * @generated
	 * @ordered
	 */
	protected String egressIgnoredPorts_java_lang_Number_AsList = EGRESS_IGNORED_PORTS_JAVA_LANG_NUMBER_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getIgnoredGid_java_lang_Number_() <em>Ignored Gid java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoredGid_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int IGNORED_GID_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIgnoredGid_java_lang_Number_() <em>Ignored Gid java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoredGid_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int ignoredGid_java_lang_Number_ = IGNORED_GID_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getIgnoredUid_java_lang_Number_() <em>Ignored Uid java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoredUid_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int IGNORED_UID_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIgnoredUid_java_lang_Number_() <em>Ignored Uid java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoredUid_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int ignoredUid_java_lang_Number_ = IGNORED_UID_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps";

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
	protected AppMeshProxyConfigurationPropsBuilder_ecsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAppPorts_java_lang_Number_AsList() {
		return appPorts_java_lang_Number_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAppPorts_java_lang_Number_AsList(String newAppPorts_java_lang_Number_AsList) {
		String oldAppPorts_java_lang_Number_AsList = appPorts_java_lang_Number_AsList;
		appPorts_java_lang_Number_AsList = newAppPorts_java_lang_Number_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__APP_PORTS_JAVA_LANG_NUMBER_AS_LIST,
					oldAppPorts_java_lang_Number_AsList, appPorts_java_lang_Number_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getProxyEgressPort_java_lang_Number_() {
		return proxyEgressPort_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProxyEgressPort_java_lang_Number_(int newProxyEgressPort_java_lang_Number_) {
		int oldProxyEgressPort_java_lang_Number_ = proxyEgressPort_java_lang_Number_;
		proxyEgressPort_java_lang_Number_ = newProxyEgressPort_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__PROXY_EGRESS_PORT_JAVA_LANG_NUMBER_,
					oldProxyEgressPort_java_lang_Number_, proxyEgressPort_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getProxyIngressPort_java_lang_Number_() {
		return proxyIngressPort_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProxyIngressPort_java_lang_Number_(int newProxyIngressPort_java_lang_Number_) {
		int oldProxyIngressPort_java_lang_Number_ = proxyIngressPort_java_lang_Number_;
		proxyIngressPort_java_lang_Number_ = newProxyIngressPort_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__PROXY_INGRESS_PORT_JAVA_LANG_NUMBER_,
					oldProxyIngressPort_java_lang_Number_, proxyIngressPort_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEgressIgnoredIPs_java_lang_String_AsList() {
		return egressIgnoredIPs_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEgressIgnoredIPs_java_lang_String_AsList(String newEgressIgnoredIPs_java_lang_String_AsList) {
		String oldEgressIgnoredIPs_java_lang_String_AsList = egressIgnoredIPs_java_lang_String_AsList;
		egressIgnoredIPs_java_lang_String_AsList = newEgressIgnoredIPs_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__EGRESS_IGNORED_IPS_JAVA_LANG_STRING_AS_LIST,
					oldEgressIgnoredIPs_java_lang_String_AsList, egressIgnoredIPs_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEgressIgnoredPorts_java_lang_Number_AsList() {
		return egressIgnoredPorts_java_lang_Number_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEgressIgnoredPorts_java_lang_Number_AsList(String newEgressIgnoredPorts_java_lang_Number_AsList) {
		String oldEgressIgnoredPorts_java_lang_Number_AsList = egressIgnoredPorts_java_lang_Number_AsList;
		egressIgnoredPorts_java_lang_Number_AsList = newEgressIgnoredPorts_java_lang_Number_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__EGRESS_IGNORED_PORTS_JAVA_LANG_NUMBER_AS_LIST,
					oldEgressIgnoredPorts_java_lang_Number_AsList, egressIgnoredPorts_java_lang_Number_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIgnoredGid_java_lang_Number_() {
		return ignoredGid_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIgnoredGid_java_lang_Number_(int newIgnoredGid_java_lang_Number_) {
		int oldIgnoredGid_java_lang_Number_ = ignoredGid_java_lang_Number_;
		ignoredGid_java_lang_Number_ = newIgnoredGid_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__IGNORED_GID_JAVA_LANG_NUMBER_,
					oldIgnoredGid_java_lang_Number_, ignoredGid_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIgnoredUid_java_lang_Number_() {
		return ignoredUid_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIgnoredUid_java_lang_Number_(int newIgnoredUid_java_lang_Number_) {
		int oldIgnoredUid_java_lang_Number_ = ignoredUid_java_lang_Number_;
		ignoredUid_java_lang_Number_ = newIgnoredUid_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__IGNORED_UID_JAVA_LANG_NUMBER_,
					oldIgnoredUid_java_lang_Number_, ignoredUid_java_lang_Number_));
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
					AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__IDENTIFIER, oldIdentifier,
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
					AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__ADDITIONAL_CODE,
					oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__APP_PORTS_JAVA_LANG_NUMBER_AS_LIST:
			return getAppPorts_java_lang_Number_AsList();
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__PROXY_EGRESS_PORT_JAVA_LANG_NUMBER_:
			return getProxyEgressPort_java_lang_Number_();
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__PROXY_INGRESS_PORT_JAVA_LANG_NUMBER_:
			return getProxyIngressPort_java_lang_Number_();
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__EGRESS_IGNORED_IPS_JAVA_LANG_STRING_AS_LIST:
			return getEgressIgnoredIPs_java_lang_String_AsList();
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__EGRESS_IGNORED_PORTS_JAVA_LANG_NUMBER_AS_LIST:
			return getEgressIgnoredPorts_java_lang_Number_AsList();
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__IGNORED_GID_JAVA_LANG_NUMBER_:
			return getIgnoredGid_java_lang_Number_();
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__IGNORED_UID_JAVA_LANG_NUMBER_:
			return getIgnoredUid_java_lang_Number_();
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__APP_PORTS_JAVA_LANG_NUMBER_AS_LIST:
			setAppPorts_java_lang_Number_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__PROXY_EGRESS_PORT_JAVA_LANG_NUMBER_:
			setProxyEgressPort_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__PROXY_INGRESS_PORT_JAVA_LANG_NUMBER_:
			setProxyIngressPort_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__EGRESS_IGNORED_IPS_JAVA_LANG_STRING_AS_LIST:
			setEgressIgnoredIPs_java_lang_String_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__EGRESS_IGNORED_PORTS_JAVA_LANG_NUMBER_AS_LIST:
			setEgressIgnoredPorts_java_lang_Number_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__IGNORED_GID_JAVA_LANG_NUMBER_:
			setIgnoredGid_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__IGNORED_UID_JAVA_LANG_NUMBER_:
			setIgnoredUid_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__APP_PORTS_JAVA_LANG_NUMBER_AS_LIST:
			setAppPorts_java_lang_Number_AsList(APP_PORTS_JAVA_LANG_NUMBER_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__PROXY_EGRESS_PORT_JAVA_LANG_NUMBER_:
			setProxyEgressPort_java_lang_Number_(PROXY_EGRESS_PORT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__PROXY_INGRESS_PORT_JAVA_LANG_NUMBER_:
			setProxyIngressPort_java_lang_Number_(PROXY_INGRESS_PORT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__EGRESS_IGNORED_IPS_JAVA_LANG_STRING_AS_LIST:
			setEgressIgnoredIPs_java_lang_String_AsList(EGRESS_IGNORED_IPS_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__EGRESS_IGNORED_PORTS_JAVA_LANG_NUMBER_AS_LIST:
			setEgressIgnoredPorts_java_lang_Number_AsList(EGRESS_IGNORED_PORTS_JAVA_LANG_NUMBER_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__IGNORED_GID_JAVA_LANG_NUMBER_:
			setIgnoredGid_java_lang_Number_(IGNORED_GID_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__IGNORED_UID_JAVA_LANG_NUMBER_:
			setIgnoredUid_java_lang_Number_(IGNORED_UID_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__APP_PORTS_JAVA_LANG_NUMBER_AS_LIST:
			return APP_PORTS_JAVA_LANG_NUMBER_AS_LIST_EDEFAULT == null ? appPorts_java_lang_Number_AsList != null
					: !APP_PORTS_JAVA_LANG_NUMBER_AS_LIST_EDEFAULT.equals(appPorts_java_lang_Number_AsList);
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__PROXY_EGRESS_PORT_JAVA_LANG_NUMBER_:
			return proxyEgressPort_java_lang_Number_ != PROXY_EGRESS_PORT_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__PROXY_INGRESS_PORT_JAVA_LANG_NUMBER_:
			return proxyIngressPort_java_lang_Number_ != PROXY_INGRESS_PORT_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__EGRESS_IGNORED_IPS_JAVA_LANG_STRING_AS_LIST:
			return EGRESS_IGNORED_IPS_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? egressIgnoredIPs_java_lang_String_AsList != null
					: !EGRESS_IGNORED_IPS_JAVA_LANG_STRING_AS_LIST_EDEFAULT
							.equals(egressIgnoredIPs_java_lang_String_AsList);
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__EGRESS_IGNORED_PORTS_JAVA_LANG_NUMBER_AS_LIST:
			return EGRESS_IGNORED_PORTS_JAVA_LANG_NUMBER_AS_LIST_EDEFAULT == null
					? egressIgnoredPorts_java_lang_Number_AsList != null
					: !EGRESS_IGNORED_PORTS_JAVA_LANG_NUMBER_AS_LIST_EDEFAULT
							.equals(egressIgnoredPorts_java_lang_Number_AsList);
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__IGNORED_GID_JAVA_LANG_NUMBER_:
			return ignoredGid_java_lang_Number_ != IGNORED_GID_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__IGNORED_UID_JAVA_LANG_NUMBER_:
			return ignoredUid_java_lang_Number_ != IGNORED_UID_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__ADDITIONAL_CODE:
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
		result.append(" (appPorts_java_lang_Number_AsList: ");
		result.append(appPorts_java_lang_Number_AsList);
		result.append(", proxyEgressPort_java_lang_Number_: ");
		result.append(proxyEgressPort_java_lang_Number_);
		result.append(", proxyIngressPort_java_lang_Number_: ");
		result.append(proxyIngressPort_java_lang_Number_);
		result.append(", egressIgnoredIPs_java_lang_String_AsList: ");
		result.append(egressIgnoredIPs_java_lang_String_AsList);
		result.append(", egressIgnoredPorts_java_lang_Number_AsList: ");
		result.append(egressIgnoredPorts_java_lang_Number_AsList);
		result.append(", ignoredGid_java_lang_Number_: ");
		result.append(ignoredGid_java_lang_Number_);
		result.append(", ignoredUid_java_lang_Number_: ");
		result.append(ignoredUid_java_lang_Number_);
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

} //AppMeshProxyConfigurationPropsBuilder_ecsImpl
