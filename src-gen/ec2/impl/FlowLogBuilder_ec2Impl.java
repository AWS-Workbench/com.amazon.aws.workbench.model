/**
 */
package ec2.impl;

import ec2.Ec2Package;
import ec2.FlowLogBuilder_ec2;
import ec2.FlowLogTrafficType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Log Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ec2.impl.FlowLogBuilder_ec2Impl#getDestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference <em>Destination With Flow Log Destination software amazon awscdk services ec2 Flow Log Destination As Reference</em>}</li>
 *   <li>{@link ec2.impl.FlowLogBuilder_ec2Impl#getTrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_ <em>Traffic Type software amazon awscdk services ec2 Flow Log Traffic Type </em>}</li>
 *   <li>{@link ec2.impl.FlowLogBuilder_ec2Impl#getResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference <em>Resource Type With Flow Log Resource Type software amazon awscdk services ec2 Flow Log Resource Type As Reference</em>}</li>
 *   <li>{@link ec2.impl.FlowLogBuilder_ec2Impl#getFlowLogName_java_lang_String_ <em>Flow Log Name java lang String </em>}</li>
 *   <li>{@link ec2.impl.FlowLogBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.impl.FlowLogBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.impl.FlowLogBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.impl.FlowLogBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowLogBuilder_ec2Impl extends MinimalEObjectImpl.Container implements FlowLogBuilder_ec2 {
	/**
	 * The default value of the '{@link #getDestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference() <em>Destination With Flow Log Destination software amazon awscdk services ec2 Flow Log Destination As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_WITH_FLOW_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference() <em>Destination With Flow Log Destination software amazon awscdk services ec2 Flow Log Destination As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String destinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference = DESTINATION_WITH_FLOW_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_() <em>Traffic Type software amazon awscdk services ec2 Flow Log Traffic Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_()
	 * @generated
	 * @ordered
	 */
	protected static final FlowLogTrafficType TRAFFIC_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_TRAFFIC_TYPE__EDEFAULT = FlowLogTrafficType.ACCEPT;

	/**
	 * The cached value of the '{@link #getTrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_() <em>Traffic Type software amazon awscdk services ec2 Flow Log Traffic Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_()
	 * @generated
	 * @ordered
	 */
	protected FlowLogTrafficType trafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_ = TRAFFIC_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_TRAFFIC_TYPE__EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference() <em>Resource Type With Flow Log Resource Type software amazon awscdk services ec2 Flow Log Resource Type As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_TYPE_WITH_FLOW_LOG_RESOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_RESOURCE_TYPE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference() <em>Resource Type With Flow Log Resource Type software amazon awscdk services ec2 Flow Log Resource Type As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String resourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference = RESOURCE_TYPE_WITH_FLOW_LOG_RESOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_RESOURCE_TYPE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlowLogName_java_lang_String_() <em>Flow Log Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowLogName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String FLOW_LOG_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlowLogName_java_lang_String_() <em>Flow Log Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowLogName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String flowLogName_java_lang_String_ = FLOW_LOG_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.FlowLog";

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
	protected FlowLogBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.Literals.FLOW_LOG_BUILDER_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference() {
		return destinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference(
			String newDestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference) {
		String oldDestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference = destinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference;
		destinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference = newDestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.FLOW_LOG_BUILDER_EC2__DESTINATION_WITH_FLOW_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_AS_REFERENCE,
					oldDestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference,
					destinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlowLogTrafficType getTrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_() {
		return trafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_(
			FlowLogTrafficType newTrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_) {
		FlowLogTrafficType oldTrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_ = trafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_;
		trafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_ = newTrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_ == null
				? TRAFFIC_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_TRAFFIC_TYPE__EDEFAULT
				: newTrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.FLOW_LOG_BUILDER_EC2__TRAFFIC_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_TRAFFIC_TYPE_,
					oldTrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_,
					trafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference() {
		return resourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference(
			String newResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference) {
		String oldResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference = resourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference;
		resourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference = newResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.FLOW_LOG_BUILDER_EC2__RESOURCE_TYPE_WITH_FLOW_LOG_RESOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_RESOURCE_TYPE_AS_REFERENCE,
					oldResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference,
					resourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFlowLogName_java_lang_String_() {
		return flowLogName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlowLogName_java_lang_String_(String newFlowLogName_java_lang_String_) {
		String oldFlowLogName_java_lang_String_ = flowLogName_java_lang_String_;
		flowLogName_java_lang_String_ = newFlowLogName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.FLOW_LOG_BUILDER_EC2__FLOW_LOG_NAME_JAVA_LANG_STRING_, oldFlowLogName_java_lang_String_,
					flowLogName_java_lang_String_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.FLOW_LOG_BUILDER_EC2__VAR_NAME, oldVarName,
					varName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.FLOW_LOG_BUILDER_EC2__IDENTIFIER,
					oldIdentifier, identifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.FLOW_LOG_BUILDER_EC2__ADDITIONAL_CODE,
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
		case Ec2Package.FLOW_LOG_BUILDER_EC2__DESTINATION_WITH_FLOW_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_AS_REFERENCE:
			return getDestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference();
		case Ec2Package.FLOW_LOG_BUILDER_EC2__TRAFFIC_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_TRAFFIC_TYPE_:
			return getTrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_();
		case Ec2Package.FLOW_LOG_BUILDER_EC2__RESOURCE_TYPE_WITH_FLOW_LOG_RESOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_RESOURCE_TYPE_AS_REFERENCE:
			return getResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference();
		case Ec2Package.FLOW_LOG_BUILDER_EC2__FLOW_LOG_NAME_JAVA_LANG_STRING_:
			return getFlowLogName_java_lang_String_();
		case Ec2Package.FLOW_LOG_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case Ec2Package.FLOW_LOG_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case Ec2Package.FLOW_LOG_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case Ec2Package.FLOW_LOG_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.FLOW_LOG_BUILDER_EC2__DESTINATION_WITH_FLOW_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_AS_REFERENCE:
			setDestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference(
					(String) newValue);
			return;
		case Ec2Package.FLOW_LOG_BUILDER_EC2__TRAFFIC_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_TRAFFIC_TYPE_:
			setTrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_((FlowLogTrafficType) newValue);
			return;
		case Ec2Package.FLOW_LOG_BUILDER_EC2__RESOURCE_TYPE_WITH_FLOW_LOG_RESOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_RESOURCE_TYPE_AS_REFERENCE:
			setResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference(
					(String) newValue);
			return;
		case Ec2Package.FLOW_LOG_BUILDER_EC2__FLOW_LOG_NAME_JAVA_LANG_STRING_:
			setFlowLogName_java_lang_String_((String) newValue);
			return;
		case Ec2Package.FLOW_LOG_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case Ec2Package.FLOW_LOG_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case Ec2Package.FLOW_LOG_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.FLOW_LOG_BUILDER_EC2__DESTINATION_WITH_FLOW_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_AS_REFERENCE:
			setDestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference(
					DESTINATION_WITH_FLOW_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_AS_REFERENCE_EDEFAULT);
			return;
		case Ec2Package.FLOW_LOG_BUILDER_EC2__TRAFFIC_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_TRAFFIC_TYPE_:
			setTrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_(
					TRAFFIC_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_TRAFFIC_TYPE__EDEFAULT);
			return;
		case Ec2Package.FLOW_LOG_BUILDER_EC2__RESOURCE_TYPE_WITH_FLOW_LOG_RESOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_RESOURCE_TYPE_AS_REFERENCE:
			setResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference(
					RESOURCE_TYPE_WITH_FLOW_LOG_RESOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_RESOURCE_TYPE_AS_REFERENCE_EDEFAULT);
			return;
		case Ec2Package.FLOW_LOG_BUILDER_EC2__FLOW_LOG_NAME_JAVA_LANG_STRING_:
			setFlowLogName_java_lang_String_(FLOW_LOG_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.FLOW_LOG_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case Ec2Package.FLOW_LOG_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case Ec2Package.FLOW_LOG_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.FLOW_LOG_BUILDER_EC2__DESTINATION_WITH_FLOW_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_AS_REFERENCE:
			return DESTINATION_WITH_FLOW_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_AS_REFERENCE_EDEFAULT == null
					? destinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference != null
					: !DESTINATION_WITH_FLOW_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_AS_REFERENCE_EDEFAULT
							.equals(destinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference);
		case Ec2Package.FLOW_LOG_BUILDER_EC2__TRAFFIC_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_TRAFFIC_TYPE_:
			return trafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_ != TRAFFIC_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_TRAFFIC_TYPE__EDEFAULT;
		case Ec2Package.FLOW_LOG_BUILDER_EC2__RESOURCE_TYPE_WITH_FLOW_LOG_RESOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_RESOURCE_TYPE_AS_REFERENCE:
			return RESOURCE_TYPE_WITH_FLOW_LOG_RESOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_RESOURCE_TYPE_AS_REFERENCE_EDEFAULT == null
					? resourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference != null
					: !RESOURCE_TYPE_WITH_FLOW_LOG_RESOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_RESOURCE_TYPE_AS_REFERENCE_EDEFAULT
							.equals(resourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference);
		case Ec2Package.FLOW_LOG_BUILDER_EC2__FLOW_LOG_NAME_JAVA_LANG_STRING_:
			return FLOW_LOG_NAME_JAVA_LANG_STRING__EDEFAULT == null ? flowLogName_java_lang_String_ != null
					: !FLOW_LOG_NAME_JAVA_LANG_STRING__EDEFAULT.equals(flowLogName_java_lang_String_);
		case Ec2Package.FLOW_LOG_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case Ec2Package.FLOW_LOG_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case Ec2Package.FLOW_LOG_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case Ec2Package.FLOW_LOG_BUILDER_EC2__ADDITIONAL_CODE:
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
		result.append(
				" (destinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference: ");
		result.append(
				destinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference);
		result.append(", trafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_: ");
		result.append(trafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_);
		result.append(
				", resourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference: ");
		result.append(
				resourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference);
		result.append(", flowLogName_java_lang_String_: ");
		result.append(flowLogName_java_lang_String_);
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

} //FlowLogBuilder_ec2Impl
