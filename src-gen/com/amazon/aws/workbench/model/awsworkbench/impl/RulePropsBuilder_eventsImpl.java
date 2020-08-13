/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.RulePropsBuilder_events;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Props Builder events</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RulePropsBuilder_eventsImpl#getDescription_java_lang_String_ <em>Description java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RulePropsBuilder_eventsImpl#getEnabled_java_lang_Boolean_ <em>Enabled java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RulePropsBuilder_eventsImpl#getEventBusWithIEventBus_software_amazon_awscdk_services_events_IEventBus_AsReference <em>Event Bus With IEvent Bus software amazon awscdk services events IEvent Bus As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RulePropsBuilder_eventsImpl#getEventPatternWithEventPattern_software_amazon_awscdk_services_events_EventPattern_AsReference <em>Event Pattern With Event Pattern software amazon awscdk services events Event Pattern As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RulePropsBuilder_eventsImpl#getRuleName_java_lang_String_ <em>Rule Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RulePropsBuilder_eventsImpl#getScheduleWithSchedule_software_amazon_awscdk_services_events_Schedule_AsReference <em>Schedule With Schedule software amazon awscdk services events Schedule As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RulePropsBuilder_eventsImpl#getTargets_software_amazon_awscdk_services_events_IRuleTarget_AsList <em>Targets software amazon awscdk services events IRule Target As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RulePropsBuilder_eventsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RulePropsBuilder_eventsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RulePropsBuilder_eventsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RulePropsBuilder_eventsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RulePropsBuilder_eventsImpl extends ServiceResourcesImpl implements RulePropsBuilder_events {
	/**
	 * The default value of the '{@link #getDescription_java_lang_String_() <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription_java_lang_String_() <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String description_java_lang_String_ = DESCRIPTION_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getEnabled_java_lang_Boolean_() <em>Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnabled_java_lang_Boolean_() <em>Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean enabled_java_lang_Boolean_ = ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getEventBusWithIEventBus_software_amazon_awscdk_services_events_IEventBus_AsReference() <em>Event Bus With IEvent Bus software amazon awscdk services events IEvent Bus As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventBusWithIEventBus_software_amazon_awscdk_services_events_IEventBus_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_BUS_WITH_IEVENT_BUS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_IEVENT_BUS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventBusWithIEventBus_software_amazon_awscdk_services_events_IEventBus_AsReference() <em>Event Bus With IEvent Bus software amazon awscdk services events IEvent Bus As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventBusWithIEventBus_software_amazon_awscdk_services_events_IEventBus_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String eventBusWithIEventBus_software_amazon_awscdk_services_events_IEventBus_AsReference = EVENT_BUS_WITH_IEVENT_BUS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_IEVENT_BUS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEventPatternWithEventPattern_software_amazon_awscdk_services_events_EventPattern_AsReference() <em>Event Pattern With Event Pattern software amazon awscdk services events Event Pattern As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventPatternWithEventPattern_software_amazon_awscdk_services_events_EventPattern_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_PATTERN_WITH_EVENT_PATTERN_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_EVENT_PATTERN_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventPatternWithEventPattern_software_amazon_awscdk_services_events_EventPattern_AsReference() <em>Event Pattern With Event Pattern software amazon awscdk services events Event Pattern As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventPatternWithEventPattern_software_amazon_awscdk_services_events_EventPattern_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String eventPatternWithEventPattern_software_amazon_awscdk_services_events_EventPattern_AsReference = EVENT_PATTERN_WITH_EVENT_PATTERN_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_EVENT_PATTERN_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuleName_java_lang_String_() <em>Rule Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String RULE_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuleName_java_lang_String_() <em>Rule Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String ruleName_java_lang_String_ = RULE_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getScheduleWithSchedule_software_amazon_awscdk_services_events_Schedule_AsReference() <em>Schedule With Schedule software amazon awscdk services events Schedule As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleWithSchedule_software_amazon_awscdk_services_events_Schedule_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEDULE_WITH_SCHEDULE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_SCHEDULE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScheduleWithSchedule_software_amazon_awscdk_services_events_Schedule_AsReference() <em>Schedule With Schedule software amazon awscdk services events Schedule As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleWithSchedule_software_amazon_awscdk_services_events_Schedule_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String scheduleWithSchedule_software_amazon_awscdk_services_events_Schedule_AsReference = SCHEDULE_WITH_SCHEDULE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_SCHEDULE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargets_software_amazon_awscdk_services_events_IRuleTarget_AsList() <em>Targets software amazon awscdk services events IRule Target As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets_software_amazon_awscdk_services_events_IRuleTarget_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_IRULE_TARGET_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargets_software_amazon_awscdk_services_events_IRuleTarget_AsList() <em>Targets software amazon awscdk services events IRule Target As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets_software_amazon_awscdk_services_events_IRuleTarget_AsList()
	 * @generated
	 * @ordered
	 */
	protected String targets_software_amazon_awscdk_services_events_IRuleTarget_AsList = TARGETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_IRULE_TARGET_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.events.RuleProps";

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
	protected RulePropsBuilder_eventsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.RULE_PROPS_BUILDER_EVENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription_java_lang_String_() {
		return description_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription_java_lang_String_(String newDescription_java_lang_String_) {
		String oldDescription_java_lang_String_ = description_java_lang_String_;
		description_java_lang_String_ = newDescription_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__DESCRIPTION_JAVA_LANG_STRING_,
					oldDescription_java_lang_String_, description_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getEnabled_java_lang_Boolean_() {
		return enabled_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnabled_java_lang_Boolean_(Boolean newEnabled_java_lang_Boolean_) {
		Boolean oldEnabled_java_lang_Boolean_ = enabled_java_lang_Boolean_;
		enabled_java_lang_Boolean_ = newEnabled_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__ENABLED_JAVA_LANG_BOOLEAN_,
					oldEnabled_java_lang_Boolean_, enabled_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEventBusWithIEventBus_software_amazon_awscdk_services_events_IEventBus_AsReference() {
		return eventBusWithIEventBus_software_amazon_awscdk_services_events_IEventBus_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventBusWithIEventBus_software_amazon_awscdk_services_events_IEventBus_AsReference(
			String newEventBusWithIEventBus_software_amazon_awscdk_services_events_IEventBus_AsReference) {
		String oldEventBusWithIEventBus_software_amazon_awscdk_services_events_IEventBus_AsReference = eventBusWithIEventBus_software_amazon_awscdk_services_events_IEventBus_AsReference;
		eventBusWithIEventBus_software_amazon_awscdk_services_events_IEventBus_AsReference = newEventBusWithIEventBus_software_amazon_awscdk_services_events_IEventBus_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__EVENT_BUS_WITH_IEVENT_BUS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_IEVENT_BUS_AS_REFERENCE,
					oldEventBusWithIEventBus_software_amazon_awscdk_services_events_IEventBus_AsReference,
					eventBusWithIEventBus_software_amazon_awscdk_services_events_IEventBus_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEventPatternWithEventPattern_software_amazon_awscdk_services_events_EventPattern_AsReference() {
		return eventPatternWithEventPattern_software_amazon_awscdk_services_events_EventPattern_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventPatternWithEventPattern_software_amazon_awscdk_services_events_EventPattern_AsReference(
			String newEventPatternWithEventPattern_software_amazon_awscdk_services_events_EventPattern_AsReference) {
		String oldEventPatternWithEventPattern_software_amazon_awscdk_services_events_EventPattern_AsReference = eventPatternWithEventPattern_software_amazon_awscdk_services_events_EventPattern_AsReference;
		eventPatternWithEventPattern_software_amazon_awscdk_services_events_EventPattern_AsReference = newEventPatternWithEventPattern_software_amazon_awscdk_services_events_EventPattern_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__EVENT_PATTERN_WITH_EVENT_PATTERN_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_EVENT_PATTERN_AS_REFERENCE,
					oldEventPatternWithEventPattern_software_amazon_awscdk_services_events_EventPattern_AsReference,
					eventPatternWithEventPattern_software_amazon_awscdk_services_events_EventPattern_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRuleName_java_lang_String_() {
		return ruleName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuleName_java_lang_String_(String newRuleName_java_lang_String_) {
		String oldRuleName_java_lang_String_ = ruleName_java_lang_String_;
		ruleName_java_lang_String_ = newRuleName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__RULE_NAME_JAVA_LANG_STRING_,
					oldRuleName_java_lang_String_, ruleName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScheduleWithSchedule_software_amazon_awscdk_services_events_Schedule_AsReference() {
		return scheduleWithSchedule_software_amazon_awscdk_services_events_Schedule_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScheduleWithSchedule_software_amazon_awscdk_services_events_Schedule_AsReference(
			String newScheduleWithSchedule_software_amazon_awscdk_services_events_Schedule_AsReference) {
		String oldScheduleWithSchedule_software_amazon_awscdk_services_events_Schedule_AsReference = scheduleWithSchedule_software_amazon_awscdk_services_events_Schedule_AsReference;
		scheduleWithSchedule_software_amazon_awscdk_services_events_Schedule_AsReference = newScheduleWithSchedule_software_amazon_awscdk_services_events_Schedule_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__SCHEDULE_WITH_SCHEDULE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_SCHEDULE_AS_REFERENCE,
					oldScheduleWithSchedule_software_amazon_awscdk_services_events_Schedule_AsReference,
					scheduleWithSchedule_software_amazon_awscdk_services_events_Schedule_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargets_software_amazon_awscdk_services_events_IRuleTarget_AsList() {
		return targets_software_amazon_awscdk_services_events_IRuleTarget_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargets_software_amazon_awscdk_services_events_IRuleTarget_AsList(
			String newTargets_software_amazon_awscdk_services_events_IRuleTarget_AsList) {
		String oldTargets_software_amazon_awscdk_services_events_IRuleTarget_AsList = targets_software_amazon_awscdk_services_events_IRuleTarget_AsList;
		targets_software_amazon_awscdk_services_events_IRuleTarget_AsList = newTargets_software_amazon_awscdk_services_events_IRuleTarget_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__TARGETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_IRULE_TARGET_AS_LIST,
					oldTargets_software_amazon_awscdk_services_events_IRuleTarget_AsList,
					targets_software_amazon_awscdk_services_events_IRuleTarget_AsList));
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
					AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__DESCRIPTION_JAVA_LANG_STRING_:
			return getDescription_java_lang_String_();
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__ENABLED_JAVA_LANG_BOOLEAN_:
			return getEnabled_java_lang_Boolean_();
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__EVENT_BUS_WITH_IEVENT_BUS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_IEVENT_BUS_AS_REFERENCE:
			return getEventBusWithIEventBus_software_amazon_awscdk_services_events_IEventBus_AsReference();
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__EVENT_PATTERN_WITH_EVENT_PATTERN_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_EVENT_PATTERN_AS_REFERENCE:
			return getEventPatternWithEventPattern_software_amazon_awscdk_services_events_EventPattern_AsReference();
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__RULE_NAME_JAVA_LANG_STRING_:
			return getRuleName_java_lang_String_();
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__SCHEDULE_WITH_SCHEDULE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_SCHEDULE_AS_REFERENCE:
			return getScheduleWithSchedule_software_amazon_awscdk_services_events_Schedule_AsReference();
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__TARGETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_IRULE_TARGET_AS_LIST:
			return getTargets_software_amazon_awscdk_services_events_IRuleTarget_AsList();
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__DESCRIPTION_JAVA_LANG_STRING_:
			setDescription_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__ENABLED_JAVA_LANG_BOOLEAN_:
			setEnabled_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__EVENT_BUS_WITH_IEVENT_BUS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_IEVENT_BUS_AS_REFERENCE:
			setEventBusWithIEventBus_software_amazon_awscdk_services_events_IEventBus_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__EVENT_PATTERN_WITH_EVENT_PATTERN_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_EVENT_PATTERN_AS_REFERENCE:
			setEventPatternWithEventPattern_software_amazon_awscdk_services_events_EventPattern_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__RULE_NAME_JAVA_LANG_STRING_:
			setRuleName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__SCHEDULE_WITH_SCHEDULE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_SCHEDULE_AS_REFERENCE:
			setScheduleWithSchedule_software_amazon_awscdk_services_events_Schedule_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__TARGETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_IRULE_TARGET_AS_LIST:
			setTargets_software_amazon_awscdk_services_events_IRuleTarget_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__DESCRIPTION_JAVA_LANG_STRING_:
			setDescription_java_lang_String_(DESCRIPTION_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__ENABLED_JAVA_LANG_BOOLEAN_:
			setEnabled_java_lang_Boolean_(ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__EVENT_BUS_WITH_IEVENT_BUS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_IEVENT_BUS_AS_REFERENCE:
			setEventBusWithIEventBus_software_amazon_awscdk_services_events_IEventBus_AsReference(
					EVENT_BUS_WITH_IEVENT_BUS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_IEVENT_BUS_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__EVENT_PATTERN_WITH_EVENT_PATTERN_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_EVENT_PATTERN_AS_REFERENCE:
			setEventPatternWithEventPattern_software_amazon_awscdk_services_events_EventPattern_AsReference(
					EVENT_PATTERN_WITH_EVENT_PATTERN_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_EVENT_PATTERN_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__RULE_NAME_JAVA_LANG_STRING_:
			setRuleName_java_lang_String_(RULE_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__SCHEDULE_WITH_SCHEDULE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_SCHEDULE_AS_REFERENCE:
			setScheduleWithSchedule_software_amazon_awscdk_services_events_Schedule_AsReference(
					SCHEDULE_WITH_SCHEDULE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_SCHEDULE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__TARGETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_IRULE_TARGET_AS_LIST:
			setTargets_software_amazon_awscdk_services_events_IRuleTarget_AsList(
					TARGETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_IRULE_TARGET_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__DESCRIPTION_JAVA_LANG_STRING_:
			return DESCRIPTION_JAVA_LANG_STRING__EDEFAULT == null ? description_java_lang_String_ != null
					: !DESCRIPTION_JAVA_LANG_STRING__EDEFAULT.equals(description_java_lang_String_);
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__ENABLED_JAVA_LANG_BOOLEAN_:
			return ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT == null ? enabled_java_lang_Boolean_ != null
					: !ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT.equals(enabled_java_lang_Boolean_);
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__EVENT_BUS_WITH_IEVENT_BUS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_IEVENT_BUS_AS_REFERENCE:
			return EVENT_BUS_WITH_IEVENT_BUS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_IEVENT_BUS_AS_REFERENCE_EDEFAULT == null
					? eventBusWithIEventBus_software_amazon_awscdk_services_events_IEventBus_AsReference != null
					: !EVENT_BUS_WITH_IEVENT_BUS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_IEVENT_BUS_AS_REFERENCE_EDEFAULT
							.equals(eventBusWithIEventBus_software_amazon_awscdk_services_events_IEventBus_AsReference);
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__EVENT_PATTERN_WITH_EVENT_PATTERN_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_EVENT_PATTERN_AS_REFERENCE:
			return EVENT_PATTERN_WITH_EVENT_PATTERN_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_EVENT_PATTERN_AS_REFERENCE_EDEFAULT == null
					? eventPatternWithEventPattern_software_amazon_awscdk_services_events_EventPattern_AsReference != null
					: !EVENT_PATTERN_WITH_EVENT_PATTERN_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_EVENT_PATTERN_AS_REFERENCE_EDEFAULT
							.equals(eventPatternWithEventPattern_software_amazon_awscdk_services_events_EventPattern_AsReference);
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__RULE_NAME_JAVA_LANG_STRING_:
			return RULE_NAME_JAVA_LANG_STRING__EDEFAULT == null ? ruleName_java_lang_String_ != null
					: !RULE_NAME_JAVA_LANG_STRING__EDEFAULT.equals(ruleName_java_lang_String_);
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__SCHEDULE_WITH_SCHEDULE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_SCHEDULE_AS_REFERENCE:
			return SCHEDULE_WITH_SCHEDULE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_SCHEDULE_AS_REFERENCE_EDEFAULT == null
					? scheduleWithSchedule_software_amazon_awscdk_services_events_Schedule_AsReference != null
					: !SCHEDULE_WITH_SCHEDULE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_SCHEDULE_AS_REFERENCE_EDEFAULT
							.equals(scheduleWithSchedule_software_amazon_awscdk_services_events_Schedule_AsReference);
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__TARGETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_IRULE_TARGET_AS_LIST:
			return TARGETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_IRULE_TARGET_AS_LIST_EDEFAULT == null
					? targets_software_amazon_awscdk_services_events_IRuleTarget_AsList != null
					: !TARGETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_IRULE_TARGET_AS_LIST_EDEFAULT
							.equals(targets_software_amazon_awscdk_services_events_IRuleTarget_AsList);
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__ADDITIONAL_CODE:
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
		result.append(" (description_java_lang_String_: ");
		result.append(description_java_lang_String_);
		result.append(", enabled_java_lang_Boolean_: ");
		result.append(enabled_java_lang_Boolean_);
		result.append(", eventBusWithIEventBus_software_amazon_awscdk_services_events_IEventBus_AsReference: ");
		result.append(eventBusWithIEventBus_software_amazon_awscdk_services_events_IEventBus_AsReference);
		result.append(
				", eventPatternWithEventPattern_software_amazon_awscdk_services_events_EventPattern_AsReference: ");
		result.append(eventPatternWithEventPattern_software_amazon_awscdk_services_events_EventPattern_AsReference);
		result.append(", ruleName_java_lang_String_: ");
		result.append(ruleName_java_lang_String_);
		result.append(", scheduleWithSchedule_software_amazon_awscdk_services_events_Schedule_AsReference: ");
		result.append(scheduleWithSchedule_software_amazon_awscdk_services_events_Schedule_AsReference);
		result.append(", targets_software_amazon_awscdk_services_events_IRuleTarget_AsList: ");
		result.append(targets_software_amazon_awscdk_services_events_IRuleTarget_AsList);
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

} //RulePropsBuilder_eventsImpl
