/**
 */
package ec2.impl;

import ec2.Action;
import ec2.Ec2Package;
import ec2.NetworkAclEntryPropsBuilder_ec2;
import ec2.TrafficDirection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Acl Entry Props Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ec2.impl.NetworkAclEntryPropsBuilder_ec2Impl#getNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference <em>Network Acl With INetwork Acl software amazon awscdk services ec2 INetwork Acl As Reference</em>}</li>
 *   <li>{@link ec2.impl.NetworkAclEntryPropsBuilder_ec2Impl#getCidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference <em>Cidr With Acl Cidr software amazon awscdk services ec2 Acl Cidr As Reference</em>}</li>
 *   <li>{@link ec2.impl.NetworkAclEntryPropsBuilder_ec2Impl#getRuleNumber_java_lang_Number_ <em>Rule Number java lang Number </em>}</li>
 *   <li>{@link ec2.impl.NetworkAclEntryPropsBuilder_ec2Impl#getTrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference <em>Traffic With Acl Traffic software amazon awscdk services ec2 Acl Traffic As Reference</em>}</li>
 *   <li>{@link ec2.impl.NetworkAclEntryPropsBuilder_ec2Impl#getDirection_software_amazon_awscdk_services_ec2_TrafficDirection_ <em>Direction software amazon awscdk services ec2 Traffic Direction </em>}</li>
 *   <li>{@link ec2.impl.NetworkAclEntryPropsBuilder_ec2Impl#getNetworkAclEntryName_java_lang_String_ <em>Network Acl Entry Name java lang String </em>}</li>
 *   <li>{@link ec2.impl.NetworkAclEntryPropsBuilder_ec2Impl#getRuleAction_software_amazon_awscdk_services_ec2_Action_ <em>Rule Action software amazon awscdk services ec2 Action </em>}</li>
 *   <li>{@link ec2.impl.NetworkAclEntryPropsBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.impl.NetworkAclEntryPropsBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.impl.NetworkAclEntryPropsBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.impl.NetworkAclEntryPropsBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkAclEntryPropsBuilder_ec2Impl extends MinimalEObjectImpl.Container
		implements NetworkAclEntryPropsBuilder_ec2 {
	/**
	 * The default value of the '{@link #getNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference() <em>Network Acl With INetwork Acl software amazon awscdk services ec2 INetwork Acl As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_ACL_WITH_INETWORK_ACL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INETWORK_ACL_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference() <em>Network Acl With INetwork Acl software amazon awscdk services ec2 INetwork Acl As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String networkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference = NETWORK_ACL_WITH_INETWORK_ACL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INETWORK_ACL_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference() <em>Cidr With Acl Cidr software amazon awscdk services ec2 Acl Cidr As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String CIDR_WITH_ACL_CIDR_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_CIDR_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference() <em>Cidr With Acl Cidr software amazon awscdk services ec2 Acl Cidr As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String cidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference = CIDR_WITH_ACL_CIDR_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_CIDR_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuleNumber_java_lang_Number_() <em>Rule Number java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleNumber_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int RULE_NUMBER_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRuleNumber_java_lang_Number_() <em>Rule Number java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleNumber_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int ruleNumber_java_lang_Number_ = RULE_NUMBER_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getTrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference() <em>Traffic With Acl Traffic software amazon awscdk services ec2 Acl Traffic As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String TRAFFIC_WITH_ACL_TRAFFIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_TRAFFIC_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference() <em>Traffic With Acl Traffic software amazon awscdk services ec2 Acl Traffic As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String trafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference = TRAFFIC_WITH_ACL_TRAFFIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_TRAFFIC_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection_software_amazon_awscdk_services_ec2_TrafficDirection_() <em>Direction software amazon awscdk services ec2 Traffic Direction </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection_software_amazon_awscdk_services_ec2_TrafficDirection_()
	 * @generated
	 * @ordered
	 */
	protected static final TrafficDirection DIRECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_TRAFFIC_DIRECTION__EDEFAULT = TrafficDirection.EGRESS;

	/**
	 * The cached value of the '{@link #getDirection_software_amazon_awscdk_services_ec2_TrafficDirection_() <em>Direction software amazon awscdk services ec2 Traffic Direction </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection_software_amazon_awscdk_services_ec2_TrafficDirection_()
	 * @generated
	 * @ordered
	 */
	protected TrafficDirection direction_software_amazon_awscdk_services_ec2_TrafficDirection_ = DIRECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_TRAFFIC_DIRECTION__EDEFAULT;

	/**
	 * The default value of the '{@link #getNetworkAclEntryName_java_lang_String_() <em>Network Acl Entry Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkAclEntryName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_ACL_ENTRY_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetworkAclEntryName_java_lang_String_() <em>Network Acl Entry Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkAclEntryName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String networkAclEntryName_java_lang_String_ = NETWORK_ACL_ENTRY_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getRuleAction_software_amazon_awscdk_services_ec2_Action_() <em>Rule Action software amazon awscdk services ec2 Action </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleAction_software_amazon_awscdk_services_ec2_Action_()
	 * @generated
	 * @ordered
	 */
	protected static final Action RULE_ACTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACTION__EDEFAULT = Action.ALLOW;

	/**
	 * The cached value of the '{@link #getRuleAction_software_amazon_awscdk_services_ec2_Action_() <em>Rule Action software amazon awscdk services ec2 Action </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleAction_software_amazon_awscdk_services_ec2_Action_()
	 * @generated
	 * @ordered
	 */
	protected Action ruleAction_software_amazon_awscdk_services_ec2_Action_ = RULE_ACTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACTION__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.NetworkAclEntryProps";

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
	protected NetworkAclEntryPropsBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.Literals.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference() {
		return networkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference(
			String newNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference) {
		String oldNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference = networkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference;
		networkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference = newNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__NETWORK_ACL_WITH_INETWORK_ACL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INETWORK_ACL_AS_REFERENCE,
					oldNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference,
					networkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference() {
		return cidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference(
			String newCidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference) {
		String oldCidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference = cidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference;
		cidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference = newCidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__CIDR_WITH_ACL_CIDR_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_CIDR_AS_REFERENCE,
					oldCidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference,
					cidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRuleNumber_java_lang_Number_() {
		return ruleNumber_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuleNumber_java_lang_Number_(int newRuleNumber_java_lang_Number_) {
		int oldRuleNumber_java_lang_Number_ = ruleNumber_java_lang_Number_;
		ruleNumber_java_lang_Number_ = newRuleNumber_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__RULE_NUMBER_JAVA_LANG_NUMBER_,
					oldRuleNumber_java_lang_Number_, ruleNumber_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference() {
		return trafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference(
			String newTrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference) {
		String oldTrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference = trafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference;
		trafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference = newTrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__TRAFFIC_WITH_ACL_TRAFFIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_TRAFFIC_AS_REFERENCE,
					oldTrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference,
					trafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrafficDirection getDirection_software_amazon_awscdk_services_ec2_TrafficDirection_() {
		return direction_software_amazon_awscdk_services_ec2_TrafficDirection_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirection_software_amazon_awscdk_services_ec2_TrafficDirection_(
			TrafficDirection newDirection_software_amazon_awscdk_services_ec2_TrafficDirection_) {
		TrafficDirection oldDirection_software_amazon_awscdk_services_ec2_TrafficDirection_ = direction_software_amazon_awscdk_services_ec2_TrafficDirection_;
		direction_software_amazon_awscdk_services_ec2_TrafficDirection_ = newDirection_software_amazon_awscdk_services_ec2_TrafficDirection_ == null
				? DIRECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_TRAFFIC_DIRECTION__EDEFAULT
				: newDirection_software_amazon_awscdk_services_ec2_TrafficDirection_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__DIRECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_TRAFFIC_DIRECTION_,
					oldDirection_software_amazon_awscdk_services_ec2_TrafficDirection_,
					direction_software_amazon_awscdk_services_ec2_TrafficDirection_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNetworkAclEntryName_java_lang_String_() {
		return networkAclEntryName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetworkAclEntryName_java_lang_String_(String newNetworkAclEntryName_java_lang_String_) {
		String oldNetworkAclEntryName_java_lang_String_ = networkAclEntryName_java_lang_String_;
		networkAclEntryName_java_lang_String_ = newNetworkAclEntryName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__NETWORK_ACL_ENTRY_NAME_JAVA_LANG_STRING_,
					oldNetworkAclEntryName_java_lang_String_, networkAclEntryName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action getRuleAction_software_amazon_awscdk_services_ec2_Action_() {
		return ruleAction_software_amazon_awscdk_services_ec2_Action_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuleAction_software_amazon_awscdk_services_ec2_Action_(
			Action newRuleAction_software_amazon_awscdk_services_ec2_Action_) {
		Action oldRuleAction_software_amazon_awscdk_services_ec2_Action_ = ruleAction_software_amazon_awscdk_services_ec2_Action_;
		ruleAction_software_amazon_awscdk_services_ec2_Action_ = newRuleAction_software_amazon_awscdk_services_ec2_Action_ == null
				? RULE_ACTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACTION__EDEFAULT
				: newRuleAction_software_amazon_awscdk_services_ec2_Action_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__RULE_ACTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACTION_,
					oldRuleAction_software_amazon_awscdk_services_ec2_Action_,
					ruleAction_software_amazon_awscdk_services_ec2_Action_));
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
					Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__VAR_NAME, oldVarName, varName));
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
					Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__IDENTIFIER, oldIdentifier, identifier));
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
					Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__ADDITIONAL_CODE, oldAdditionalCode,
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
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__NETWORK_ACL_WITH_INETWORK_ACL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INETWORK_ACL_AS_REFERENCE:
			return getNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference();
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__CIDR_WITH_ACL_CIDR_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_CIDR_AS_REFERENCE:
			return getCidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference();
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__RULE_NUMBER_JAVA_LANG_NUMBER_:
			return getRuleNumber_java_lang_Number_();
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__TRAFFIC_WITH_ACL_TRAFFIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_TRAFFIC_AS_REFERENCE:
			return getTrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference();
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__DIRECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_TRAFFIC_DIRECTION_:
			return getDirection_software_amazon_awscdk_services_ec2_TrafficDirection_();
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__NETWORK_ACL_ENTRY_NAME_JAVA_LANG_STRING_:
			return getNetworkAclEntryName_java_lang_String_();
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__RULE_ACTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACTION_:
			return getRuleAction_software_amazon_awscdk_services_ec2_Action_();
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__NETWORK_ACL_WITH_INETWORK_ACL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INETWORK_ACL_AS_REFERENCE:
			setNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference((String) newValue);
			return;
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__CIDR_WITH_ACL_CIDR_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_CIDR_AS_REFERENCE:
			setCidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference((String) newValue);
			return;
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__RULE_NUMBER_JAVA_LANG_NUMBER_:
			setRuleNumber_java_lang_Number_((Integer) newValue);
			return;
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__TRAFFIC_WITH_ACL_TRAFFIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_TRAFFIC_AS_REFERENCE:
			setTrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference((String) newValue);
			return;
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__DIRECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_TRAFFIC_DIRECTION_:
			setDirection_software_amazon_awscdk_services_ec2_TrafficDirection_((TrafficDirection) newValue);
			return;
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__NETWORK_ACL_ENTRY_NAME_JAVA_LANG_STRING_:
			setNetworkAclEntryName_java_lang_String_((String) newValue);
			return;
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__RULE_ACTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACTION_:
			setRuleAction_software_amazon_awscdk_services_ec2_Action_((Action) newValue);
			return;
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__NETWORK_ACL_WITH_INETWORK_ACL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INETWORK_ACL_AS_REFERENCE:
			setNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference(
					NETWORK_ACL_WITH_INETWORK_ACL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INETWORK_ACL_AS_REFERENCE_EDEFAULT);
			return;
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__CIDR_WITH_ACL_CIDR_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_CIDR_AS_REFERENCE:
			setCidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference(
					CIDR_WITH_ACL_CIDR_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_CIDR_AS_REFERENCE_EDEFAULT);
			return;
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__RULE_NUMBER_JAVA_LANG_NUMBER_:
			setRuleNumber_java_lang_Number_(RULE_NUMBER_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__TRAFFIC_WITH_ACL_TRAFFIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_TRAFFIC_AS_REFERENCE:
			setTrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference(
					TRAFFIC_WITH_ACL_TRAFFIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_TRAFFIC_AS_REFERENCE_EDEFAULT);
			return;
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__DIRECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_TRAFFIC_DIRECTION_:
			setDirection_software_amazon_awscdk_services_ec2_TrafficDirection_(
					DIRECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_TRAFFIC_DIRECTION__EDEFAULT);
			return;
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__NETWORK_ACL_ENTRY_NAME_JAVA_LANG_STRING_:
			setNetworkAclEntryName_java_lang_String_(NETWORK_ACL_ENTRY_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__RULE_ACTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACTION_:
			setRuleAction_software_amazon_awscdk_services_ec2_Action_(
					RULE_ACTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACTION__EDEFAULT);
			return;
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__NETWORK_ACL_WITH_INETWORK_ACL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INETWORK_ACL_AS_REFERENCE:
			return NETWORK_ACL_WITH_INETWORK_ACL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INETWORK_ACL_AS_REFERENCE_EDEFAULT == null
					? networkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference != null
					: !NETWORK_ACL_WITH_INETWORK_ACL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INETWORK_ACL_AS_REFERENCE_EDEFAULT
							.equals(networkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference);
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__CIDR_WITH_ACL_CIDR_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_CIDR_AS_REFERENCE:
			return CIDR_WITH_ACL_CIDR_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_CIDR_AS_REFERENCE_EDEFAULT == null
					? cidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference != null
					: !CIDR_WITH_ACL_CIDR_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_CIDR_AS_REFERENCE_EDEFAULT
							.equals(cidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference);
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__RULE_NUMBER_JAVA_LANG_NUMBER_:
			return ruleNumber_java_lang_Number_ != RULE_NUMBER_JAVA_LANG_NUMBER__EDEFAULT;
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__TRAFFIC_WITH_ACL_TRAFFIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_TRAFFIC_AS_REFERENCE:
			return TRAFFIC_WITH_ACL_TRAFFIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_TRAFFIC_AS_REFERENCE_EDEFAULT == null
					? trafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference != null
					: !TRAFFIC_WITH_ACL_TRAFFIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_TRAFFIC_AS_REFERENCE_EDEFAULT
							.equals(trafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference);
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__DIRECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_TRAFFIC_DIRECTION_:
			return direction_software_amazon_awscdk_services_ec2_TrafficDirection_ != DIRECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_TRAFFIC_DIRECTION__EDEFAULT;
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__NETWORK_ACL_ENTRY_NAME_JAVA_LANG_STRING_:
			return NETWORK_ACL_ENTRY_NAME_JAVA_LANG_STRING__EDEFAULT == null
					? networkAclEntryName_java_lang_String_ != null
					: !NETWORK_ACL_ENTRY_NAME_JAVA_LANG_STRING__EDEFAULT.equals(networkAclEntryName_java_lang_String_);
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__RULE_ACTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACTION_:
			return ruleAction_software_amazon_awscdk_services_ec2_Action_ != RULE_ACTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACTION__EDEFAULT;
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case Ec2Package.NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__ADDITIONAL_CODE:
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
		result.append(" (networkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference: ");
		result.append(networkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference);
		result.append(", cidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference: ");
		result.append(cidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference);
		result.append(", ruleNumber_java_lang_Number_: ");
		result.append(ruleNumber_java_lang_Number_);
		result.append(", trafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference: ");
		result.append(trafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference);
		result.append(", direction_software_amazon_awscdk_services_ec2_TrafficDirection_: ");
		result.append(direction_software_amazon_awscdk_services_ec2_TrafficDirection_);
		result.append(", networkAclEntryName_java_lang_String_: ");
		result.append(networkAclEntryName_java_lang_String_);
		result.append(", ruleAction_software_amazon_awscdk_services_ec2_Action_: ");
		result.append(ruleAction_software_amazon_awscdk_services_ec2_Action_);
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

} //NetworkAclEntryPropsBuilder_ec2Impl
