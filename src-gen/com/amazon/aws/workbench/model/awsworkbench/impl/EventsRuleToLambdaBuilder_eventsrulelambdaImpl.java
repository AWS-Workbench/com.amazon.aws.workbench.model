/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.EventsRuleToLambdaBuilder_eventsrulelambda;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Events Rule To Lambda Builder eventsrulelambda</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.EventsRuleToLambdaBuilder_eventsrulelambdaImpl#getEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference <em>Event Rule Props With Rule Props software amazon awscdk services events Rule Props As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.EventsRuleToLambdaBuilder_eventsrulelambdaImpl#getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference <em>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.EventsRuleToLambdaBuilder_eventsrulelambdaImpl#getLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference <em>Lambda Function Props With Function Props software amazon awscdk services lambda Function Props As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.EventsRuleToLambdaBuilder_eventsrulelambdaImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.EventsRuleToLambdaBuilder_eventsrulelambdaImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.EventsRuleToLambdaBuilder_eventsrulelambdaImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.EventsRuleToLambdaBuilder_eventsrulelambdaImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventsRuleToLambdaBuilder_eventsrulelambdaImpl extends ServiceResourcesImpl
		implements EventsRuleToLambdaBuilder_eventsrulelambda {
	/**
	 * The default value of the '{@link #getEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference() <em>Event Rule Props With Rule Props software amazon awscdk services events Rule Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_RULE_PROPS_WITH_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_RULE_PROPS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference() <em>Event Rule Props With Rule Props software amazon awscdk services events Rule Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String eventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference = EVENT_RULE_PROPS_WITH_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_RULE_PROPS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference() <em>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference() <em>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference = EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference() <em>Lambda Function Props With Function Props software amazon awscdk services lambda Function Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference() <em>Lambda Function Props With Function Props software amazon awscdk services lambda Function Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference = LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awsconstructs.services.eventsrulelambda.EventsRuleToLambda";

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
	protected EventsRuleToLambdaBuilder_eventsrulelambdaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference() {
		return eventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference(
			String newEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference) {
		String oldEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference = eventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference;
		eventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference = newEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__EVENT_RULE_PROPS_WITH_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_RULE_PROPS_AS_REFERENCE,
					oldEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference,
					eventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference() {
		return existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(
			String newExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference) {
		String oldExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference = existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference;
		existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference = newExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE,
					oldExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference,
					existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference() {
		return lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference(
			String newLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference) {
		String oldLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference = lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference;
		lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference = newLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE,
					oldLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference,
					lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference));
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
					AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__IDENTIFIER, oldIdentifier,
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
					AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__ADDITIONAL_CODE,
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
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__EVENT_RULE_PROPS_WITH_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_RULE_PROPS_AS_REFERENCE:
			return getEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference();
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE:
			return getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference();
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE:
			return getLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference();
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__EVENT_RULE_PROPS_WITH_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_RULE_PROPS_AS_REFERENCE:
			setEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE:
			setExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE:
			setLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__EVENT_RULE_PROPS_WITH_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_RULE_PROPS_AS_REFERENCE:
			setEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference(
					EVENT_RULE_PROPS_WITH_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_RULE_PROPS_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE:
			setExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(
					EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE:
			setLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference(
					LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__EVENT_RULE_PROPS_WITH_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_RULE_PROPS_AS_REFERENCE:
			return EVENT_RULE_PROPS_WITH_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_RULE_PROPS_AS_REFERENCE_EDEFAULT == null
					? eventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference != null
					: !EVENT_RULE_PROPS_WITH_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_RULE_PROPS_AS_REFERENCE_EDEFAULT
							.equals(eventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference);
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE:
			return EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE_EDEFAULT == null
					? existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference != null
					: !EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE_EDEFAULT
							.equals(existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference);
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE:
			return LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE_EDEFAULT == null
					? lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference != null
					: !LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE_EDEFAULT
							.equals(lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference);
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__ADDITIONAL_CODE:
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
		result.append(" (eventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference: ");
		result.append(eventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference);
		result.append(", existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference: ");
		result.append(existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference);
		result.append(
				", lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference: ");
		result.append(
				lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference);
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

} //EventsRuleToLambdaBuilder_eventsrulelambdaImpl
