/**
 */
package ec2.impl;

import ec2.AclTrafficConfigBuilder_ec2;
import ec2.Ec2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acl Traffic Config Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ec2.impl.AclTrafficConfigBuilder_ec2Impl#getProtocol_java_lang_Number_ <em>Protocol java lang Number </em>}</li>
 *   <li>{@link ec2.impl.AclTrafficConfigBuilder_ec2Impl#getIcmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference <em>Icmp With Acl Icmp software amazon awscdk services ec2 Acl Icmp As Reference</em>}</li>
 *   <li>{@link ec2.impl.AclTrafficConfigBuilder_ec2Impl#getPortRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference <em>Port Range With Acl Port Range software amazon awscdk services ec2 Acl Port Range As Reference</em>}</li>
 *   <li>{@link ec2.impl.AclTrafficConfigBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.impl.AclTrafficConfigBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.impl.AclTrafficConfigBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.impl.AclTrafficConfigBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AclTrafficConfigBuilder_ec2Impl extends MinimalEObjectImpl.Container
		implements AclTrafficConfigBuilder_ec2 {
	/**
	 * The default value of the '{@link #getProtocol_java_lang_Number_() <em>Protocol java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int PROTOCOL_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProtocol_java_lang_Number_() <em>Protocol java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int protocol_java_lang_Number_ = PROTOCOL_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getIcmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference() <em>Icmp With Acl Icmp software amazon awscdk services ec2 Acl Icmp As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String ICMP_WITH_ACL_ICMP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_ICMP_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIcmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference() <em>Icmp With Acl Icmp software amazon awscdk services ec2 Acl Icmp As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String icmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference = ICMP_WITH_ACL_ICMP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_ICMP_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference() <em>Port Range With Acl Port Range software amazon awscdk services ec2 Acl Port Range As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_RANGE_WITH_ACL_PORT_RANGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_PORT_RANGE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference() <em>Port Range With Acl Port Range software amazon awscdk services ec2 Acl Port Range As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String portRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference = PORT_RANGE_WITH_ACL_PORT_RANGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_PORT_RANGE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.AclTrafficConfig";

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
	protected AclTrafficConfigBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.Literals.ACL_TRAFFIC_CONFIG_BUILDER_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getProtocol_java_lang_Number_() {
		return protocol_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocol_java_lang_Number_(int newProtocol_java_lang_Number_) {
		int oldProtocol_java_lang_Number_ = protocol_java_lang_Number_;
		protocol_java_lang_Number_ = newProtocol_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2__PROTOCOL_JAVA_LANG_NUMBER_,
					oldProtocol_java_lang_Number_, protocol_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIcmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference() {
		return icmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIcmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference(
			String newIcmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference) {
		String oldIcmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference = icmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference;
		icmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference = newIcmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2__ICMP_WITH_ACL_ICMP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_ICMP_AS_REFERENCE,
					oldIcmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference,
					icmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPortRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference() {
		return portRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference(
			String newPortRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference) {
		String oldPortRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference = portRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference;
		portRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference = newPortRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2__PORT_RANGE_WITH_ACL_PORT_RANGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_PORT_RANGE_AS_REFERENCE,
					oldPortRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference,
					portRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2__VAR_NAME,
					oldVarName, varName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2__IDENTIFIER,
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2__PROTOCOL_JAVA_LANG_NUMBER_:
			return getProtocol_java_lang_Number_();
		case Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2__ICMP_WITH_ACL_ICMP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_ICMP_AS_REFERENCE:
			return getIcmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference();
		case Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2__PORT_RANGE_WITH_ACL_PORT_RANGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_PORT_RANGE_AS_REFERENCE:
			return getPortRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference();
		case Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2__PROTOCOL_JAVA_LANG_NUMBER_:
			setProtocol_java_lang_Number_((Integer) newValue);
			return;
		case Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2__ICMP_WITH_ACL_ICMP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_ICMP_AS_REFERENCE:
			setIcmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference((String) newValue);
			return;
		case Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2__PORT_RANGE_WITH_ACL_PORT_RANGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_PORT_RANGE_AS_REFERENCE:
			setPortRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference(
					(String) newValue);
			return;
		case Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2__PROTOCOL_JAVA_LANG_NUMBER_:
			setProtocol_java_lang_Number_(PROTOCOL_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2__ICMP_WITH_ACL_ICMP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_ICMP_AS_REFERENCE:
			setIcmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference(
					ICMP_WITH_ACL_ICMP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_ICMP_AS_REFERENCE_EDEFAULT);
			return;
		case Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2__PORT_RANGE_WITH_ACL_PORT_RANGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_PORT_RANGE_AS_REFERENCE:
			setPortRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference(
					PORT_RANGE_WITH_ACL_PORT_RANGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_PORT_RANGE_AS_REFERENCE_EDEFAULT);
			return;
		case Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2__PROTOCOL_JAVA_LANG_NUMBER_:
			return protocol_java_lang_Number_ != PROTOCOL_JAVA_LANG_NUMBER__EDEFAULT;
		case Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2__ICMP_WITH_ACL_ICMP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_ICMP_AS_REFERENCE:
			return ICMP_WITH_ACL_ICMP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_ICMP_AS_REFERENCE_EDEFAULT == null
					? icmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference != null
					: !ICMP_WITH_ACL_ICMP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_ICMP_AS_REFERENCE_EDEFAULT
							.equals(icmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference);
		case Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2__PORT_RANGE_WITH_ACL_PORT_RANGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_PORT_RANGE_AS_REFERENCE:
			return PORT_RANGE_WITH_ACL_PORT_RANGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_PORT_RANGE_AS_REFERENCE_EDEFAULT == null
					? portRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference != null
					: !PORT_RANGE_WITH_ACL_PORT_RANGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_PORT_RANGE_AS_REFERENCE_EDEFAULT
							.equals(portRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference);
		case Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case Ec2Package.ACL_TRAFFIC_CONFIG_BUILDER_EC2__ADDITIONAL_CODE:
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
		result.append(" (protocol_java_lang_Number_: ");
		result.append(protocol_java_lang_Number_);
		result.append(", icmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference: ");
		result.append(icmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference);
		result.append(", portRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference: ");
		result.append(portRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference);
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

} //AclTrafficConfigBuilder_ec2Impl
