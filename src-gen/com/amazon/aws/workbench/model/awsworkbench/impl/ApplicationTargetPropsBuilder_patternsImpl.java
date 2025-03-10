/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.ApplicationTargetPropsBuilder_patterns;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.Protocol;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Target Props Builder patterns</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationTargetPropsBuilder_patternsImpl#getContainerPort_java_lang_Number_ <em>Container Port java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationTargetPropsBuilder_patternsImpl#getHostHeader_java_lang_String_ <em>Host Header java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationTargetPropsBuilder_patternsImpl#getListener_java_lang_String_ <em>Listener java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationTargetPropsBuilder_patternsImpl#getPathPattern_java_lang_String_ <em>Path Pattern java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationTargetPropsBuilder_patternsImpl#getPriority_java_lang_Number_ <em>Priority java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationTargetPropsBuilder_patternsImpl#getProtocol_software_amazon_awscdk_services_ecs_Protocol_ <em>Protocol software amazon awscdk services ecs Protocol </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationTargetPropsBuilder_patternsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationTargetPropsBuilder_patternsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationTargetPropsBuilder_patternsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ApplicationTargetPropsBuilder_patternsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationTargetPropsBuilder_patternsImpl extends ServiceResourcesImpl
		implements ApplicationTargetPropsBuilder_patterns {
	/**
	 * The default value of the '{@link #getContainerPort_java_lang_Number_() <em>Container Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerPort_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int CONTAINER_PORT_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getContainerPort_java_lang_Number_() <em>Container Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerPort_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int containerPort_java_lang_Number_ = CONTAINER_PORT_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getHostHeader_java_lang_String_() <em>Host Header java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostHeader_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_HEADER_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostHeader_java_lang_String_() <em>Host Header java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostHeader_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String hostHeader_java_lang_String_ = HOST_HEADER_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getListener_java_lang_String_() <em>Listener java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListener_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String LISTENER_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListener_java_lang_String_() <em>Listener java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListener_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String listener_java_lang_String_ = LISTENER_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getPathPattern_java_lang_String_() <em>Path Pattern java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathPattern_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_PATTERN_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathPattern_java_lang_String_() <em>Path Pattern java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathPattern_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String pathPattern_java_lang_String_ = PATH_PATTERN_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority_java_lang_Number_() <em>Priority java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority_java_lang_Number_() <em>Priority java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int priority_java_lang_Number_ = PRIORITY_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocol_software_amazon_awscdk_services_ecs_Protocol_() <em>Protocol software amazon awscdk services ecs Protocol </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol_software_amazon_awscdk_services_ecs_Protocol_()
	 * @generated
	 * @ordered
	 */
	protected static final Protocol PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROTOCOL__EDEFAULT = Protocol.TCP;

	/**
	 * The cached value of the '{@link #getProtocol_software_amazon_awscdk_services_ecs_Protocol_() <em>Protocol software amazon awscdk services ecs Protocol </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol_software_amazon_awscdk_services_ecs_Protocol_()
	 * @generated
	 * @ordered
	 */
	protected Protocol protocol_software_amazon_awscdk_services_ecs_Protocol_ = PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROTOCOL__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ecs.patterns.ApplicationTargetProps";

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
	protected ApplicationTargetPropsBuilder_patternsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getContainerPort_java_lang_Number_() {
		return containerPort_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerPort_java_lang_Number_(int newContainerPort_java_lang_Number_) {
		int oldContainerPort_java_lang_Number_ = containerPort_java_lang_Number_;
		containerPort_java_lang_Number_ = newContainerPort_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__CONTAINER_PORT_JAVA_LANG_NUMBER_,
					oldContainerPort_java_lang_Number_, containerPort_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHostHeader_java_lang_String_() {
		return hostHeader_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostHeader_java_lang_String_(String newHostHeader_java_lang_String_) {
		String oldHostHeader_java_lang_String_ = hostHeader_java_lang_String_;
		hostHeader_java_lang_String_ = newHostHeader_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__HOST_HEADER_JAVA_LANG_STRING_,
					oldHostHeader_java_lang_String_, hostHeader_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getListener_java_lang_String_() {
		return listener_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListener_java_lang_String_(String newListener_java_lang_String_) {
		String oldListener_java_lang_String_ = listener_java_lang_String_;
		listener_java_lang_String_ = newListener_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__LISTENER_JAVA_LANG_STRING_,
					oldListener_java_lang_String_, listener_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPathPattern_java_lang_String_() {
		return pathPattern_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathPattern_java_lang_String_(String newPathPattern_java_lang_String_) {
		String oldPathPattern_java_lang_String_ = pathPattern_java_lang_String_;
		pathPattern_java_lang_String_ = newPathPattern_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__PATH_PATTERN_JAVA_LANG_STRING_,
					oldPathPattern_java_lang_String_, pathPattern_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPriority_java_lang_Number_() {
		return priority_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority_java_lang_Number_(int newPriority_java_lang_Number_) {
		int oldPriority_java_lang_Number_ = priority_java_lang_Number_;
		priority_java_lang_Number_ = newPriority_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__PRIORITY_JAVA_LANG_NUMBER_,
					oldPriority_java_lang_Number_, priority_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Protocol getProtocol_software_amazon_awscdk_services_ecs_Protocol_() {
		return protocol_software_amazon_awscdk_services_ecs_Protocol_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocol_software_amazon_awscdk_services_ecs_Protocol_(
			Protocol newProtocol_software_amazon_awscdk_services_ecs_Protocol_) {
		Protocol oldProtocol_software_amazon_awscdk_services_ecs_Protocol_ = protocol_software_amazon_awscdk_services_ecs_Protocol_;
		protocol_software_amazon_awscdk_services_ecs_Protocol_ = newProtocol_software_amazon_awscdk_services_ecs_Protocol_ == null
				? PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROTOCOL__EDEFAULT
				: newProtocol_software_amazon_awscdk_services_ecs_Protocol_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROTOCOL_,
					oldProtocol_software_amazon_awscdk_services_ecs_Protocol_,
					protocol_software_amazon_awscdk_services_ecs_Protocol_));
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
					AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__IDENTIFIER, oldIdentifier,
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
					AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__CONTAINER_PORT_JAVA_LANG_NUMBER_:
			return getContainerPort_java_lang_Number_();
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__HOST_HEADER_JAVA_LANG_STRING_:
			return getHostHeader_java_lang_String_();
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__LISTENER_JAVA_LANG_STRING_:
			return getListener_java_lang_String_();
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__PATH_PATTERN_JAVA_LANG_STRING_:
			return getPathPattern_java_lang_String_();
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__PRIORITY_JAVA_LANG_NUMBER_:
			return getPriority_java_lang_Number_();
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROTOCOL_:
			return getProtocol_software_amazon_awscdk_services_ecs_Protocol_();
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__CONTAINER_PORT_JAVA_LANG_NUMBER_:
			setContainerPort_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__HOST_HEADER_JAVA_LANG_STRING_:
			setHostHeader_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__LISTENER_JAVA_LANG_STRING_:
			setListener_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__PATH_PATTERN_JAVA_LANG_STRING_:
			setPathPattern_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__PRIORITY_JAVA_LANG_NUMBER_:
			setPriority_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROTOCOL_:
			setProtocol_software_amazon_awscdk_services_ecs_Protocol_((Protocol) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__CONTAINER_PORT_JAVA_LANG_NUMBER_:
			setContainerPort_java_lang_Number_(CONTAINER_PORT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__HOST_HEADER_JAVA_LANG_STRING_:
			setHostHeader_java_lang_String_(HOST_HEADER_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__LISTENER_JAVA_LANG_STRING_:
			setListener_java_lang_String_(LISTENER_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__PATH_PATTERN_JAVA_LANG_STRING_:
			setPathPattern_java_lang_String_(PATH_PATTERN_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__PRIORITY_JAVA_LANG_NUMBER_:
			setPriority_java_lang_Number_(PRIORITY_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROTOCOL_:
			setProtocol_software_amazon_awscdk_services_ecs_Protocol_(
					PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROTOCOL__EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__CONTAINER_PORT_JAVA_LANG_NUMBER_:
			return containerPort_java_lang_Number_ != CONTAINER_PORT_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__HOST_HEADER_JAVA_LANG_STRING_:
			return HOST_HEADER_JAVA_LANG_STRING__EDEFAULT == null ? hostHeader_java_lang_String_ != null
					: !HOST_HEADER_JAVA_LANG_STRING__EDEFAULT.equals(hostHeader_java_lang_String_);
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__LISTENER_JAVA_LANG_STRING_:
			return LISTENER_JAVA_LANG_STRING__EDEFAULT == null ? listener_java_lang_String_ != null
					: !LISTENER_JAVA_LANG_STRING__EDEFAULT.equals(listener_java_lang_String_);
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__PATH_PATTERN_JAVA_LANG_STRING_:
			return PATH_PATTERN_JAVA_LANG_STRING__EDEFAULT == null ? pathPattern_java_lang_String_ != null
					: !PATH_PATTERN_JAVA_LANG_STRING__EDEFAULT.equals(pathPattern_java_lang_String_);
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__PRIORITY_JAVA_LANG_NUMBER_:
			return priority_java_lang_Number_ != PRIORITY_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROTOCOL_:
			return protocol_software_amazon_awscdk_services_ecs_Protocol_ != PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROTOCOL__EDEFAULT;
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
		result.append(" (containerPort_java_lang_Number_: ");
		result.append(containerPort_java_lang_Number_);
		result.append(", hostHeader_java_lang_String_: ");
		result.append(hostHeader_java_lang_String_);
		result.append(", listener_java_lang_String_: ");
		result.append(listener_java_lang_String_);
		result.append(", pathPattern_java_lang_String_: ");
		result.append(pathPattern_java_lang_String_);
		result.append(", priority_java_lang_Number_: ");
		result.append(priority_java_lang_Number_);
		result.append(", protocol_software_amazon_awscdk_services_ecs_Protocol_: ");
		result.append(protocol_software_amazon_awscdk_services_ecs_Protocol_);
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

} //ApplicationTargetPropsBuilder_patternsImpl
