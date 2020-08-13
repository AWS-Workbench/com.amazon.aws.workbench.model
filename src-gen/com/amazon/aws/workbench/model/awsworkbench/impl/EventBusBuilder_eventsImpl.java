/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.EventBusBuilder_events;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Bus Builder events</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.EventBusBuilder_eventsImpl#getEventBusName_java_lang_String_ <em>Event Bus Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.EventBusBuilder_eventsImpl#getEventSourceName_java_lang_String_ <em>Event Source Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.EventBusBuilder_eventsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.EventBusBuilder_eventsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.EventBusBuilder_eventsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.EventBusBuilder_eventsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventBusBuilder_eventsImpl extends ServiceResourcesImpl implements EventBusBuilder_events {
	/**
	 * The default value of the '{@link #getEventBusName_java_lang_String_() <em>Event Bus Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventBusName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_BUS_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventBusName_java_lang_String_() <em>Event Bus Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventBusName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String eventBusName_java_lang_String_ = EVENT_BUS_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getEventSourceName_java_lang_String_() <em>Event Source Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventSourceName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_SOURCE_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventSourceName_java_lang_String_() <em>Event Source Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventSourceName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String eventSourceName_java_lang_String_ = EVENT_SOURCE_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.events.EventBus";

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
	protected EventBusBuilder_eventsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.EVENT_BUS_BUILDER_EVENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEventBusName_java_lang_String_() {
		return eventBusName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventBusName_java_lang_String_(String newEventBusName_java_lang_String_) {
		String oldEventBusName_java_lang_String_ = eventBusName_java_lang_String_;
		eventBusName_java_lang_String_ = newEventBusName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.EVENT_BUS_BUILDER_EVENTS__EVENT_BUS_NAME_JAVA_LANG_STRING_,
					oldEventBusName_java_lang_String_, eventBusName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEventSourceName_java_lang_String_() {
		return eventSourceName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventSourceName_java_lang_String_(String newEventSourceName_java_lang_String_) {
		String oldEventSourceName_java_lang_String_ = eventSourceName_java_lang_String_;
		eventSourceName_java_lang_String_ = newEventSourceName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.EVENT_BUS_BUILDER_EVENTS__EVENT_SOURCE_NAME_JAVA_LANG_STRING_,
					oldEventSourceName_java_lang_String_, eventSourceName_java_lang_String_));
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
					AwsworkbenchPackage.EVENT_BUS_BUILDER_EVENTS__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.EVENT_BUS_BUILDER_EVENTS__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.EVENT_BUS_BUILDER_EVENTS__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.EVENT_BUS_BUILDER_EVENTS__EVENT_BUS_NAME_JAVA_LANG_STRING_:
			return getEventBusName_java_lang_String_();
		case AwsworkbenchPackage.EVENT_BUS_BUILDER_EVENTS__EVENT_SOURCE_NAME_JAVA_LANG_STRING_:
			return getEventSourceName_java_lang_String_();
		case AwsworkbenchPackage.EVENT_BUS_BUILDER_EVENTS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.EVENT_BUS_BUILDER_EVENTS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.EVENT_BUS_BUILDER_EVENTS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.EVENT_BUS_BUILDER_EVENTS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.EVENT_BUS_BUILDER_EVENTS__EVENT_BUS_NAME_JAVA_LANG_STRING_:
			setEventBusName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.EVENT_BUS_BUILDER_EVENTS__EVENT_SOURCE_NAME_JAVA_LANG_STRING_:
			setEventSourceName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.EVENT_BUS_BUILDER_EVENTS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.EVENT_BUS_BUILDER_EVENTS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.EVENT_BUS_BUILDER_EVENTS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.EVENT_BUS_BUILDER_EVENTS__EVENT_BUS_NAME_JAVA_LANG_STRING_:
			setEventBusName_java_lang_String_(EVENT_BUS_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.EVENT_BUS_BUILDER_EVENTS__EVENT_SOURCE_NAME_JAVA_LANG_STRING_:
			setEventSourceName_java_lang_String_(EVENT_SOURCE_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.EVENT_BUS_BUILDER_EVENTS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.EVENT_BUS_BUILDER_EVENTS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.EVENT_BUS_BUILDER_EVENTS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.EVENT_BUS_BUILDER_EVENTS__EVENT_BUS_NAME_JAVA_LANG_STRING_:
			return EVENT_BUS_NAME_JAVA_LANG_STRING__EDEFAULT == null ? eventBusName_java_lang_String_ != null
					: !EVENT_BUS_NAME_JAVA_LANG_STRING__EDEFAULT.equals(eventBusName_java_lang_String_);
		case AwsworkbenchPackage.EVENT_BUS_BUILDER_EVENTS__EVENT_SOURCE_NAME_JAVA_LANG_STRING_:
			return EVENT_SOURCE_NAME_JAVA_LANG_STRING__EDEFAULT == null ? eventSourceName_java_lang_String_ != null
					: !EVENT_SOURCE_NAME_JAVA_LANG_STRING__EDEFAULT.equals(eventSourceName_java_lang_String_);
		case AwsworkbenchPackage.EVENT_BUS_BUILDER_EVENTS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.EVENT_BUS_BUILDER_EVENTS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.EVENT_BUS_BUILDER_EVENTS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.EVENT_BUS_BUILDER_EVENTS__ADDITIONAL_CODE:
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
		result.append(" (eventBusName_java_lang_String_: ");
		result.append(eventBusName_java_lang_String_);
		result.append(", eventSourceName_java_lang_String_: ");
		result.append(eventSourceName_java_lang_String_);
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

} //EventBusBuilder_eventsImpl
