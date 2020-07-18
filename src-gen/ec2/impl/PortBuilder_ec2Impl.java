/**
 */
package ec2.impl;

import ec2.Ec2Package;
import ec2.PortBuilder_ec2;
import ec2.Protocol;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ec2.impl.PortBuilder_ec2Impl#getProtocol_software_amazon_awscdk_services_ec2_Protocol_ <em>Protocol software amazon awscdk services ec2 Protocol </em>}</li>
 *   <li>{@link ec2.impl.PortBuilder_ec2Impl#getStringRepresentation_java_lang_String_ <em>String Representation java lang String </em>}</li>
 *   <li>{@link ec2.impl.PortBuilder_ec2Impl#getFromPort_java_lang_Number_ <em>From Port java lang Number </em>}</li>
 *   <li>{@link ec2.impl.PortBuilder_ec2Impl#getToPort_java_lang_Number_ <em>To Port java lang Number </em>}</li>
 *   <li>{@link ec2.impl.PortBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.impl.PortBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.impl.PortBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.impl.PortBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortBuilder_ec2Impl extends MinimalEObjectImpl.Container implements PortBuilder_ec2 {
	/**
	 * The default value of the '{@link #getProtocol_software_amazon_awscdk_services_ec2_Protocol_() <em>Protocol software amazon awscdk services ec2 Protocol </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol_software_amazon_awscdk_services_ec2_Protocol_()
	 * @generated
	 * @ordered
	 */
	protected static final Protocol PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PROTOCOL__EDEFAULT = Protocol.ALL;

	/**
	 * The cached value of the '{@link #getProtocol_software_amazon_awscdk_services_ec2_Protocol_() <em>Protocol software amazon awscdk services ec2 Protocol </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol_software_amazon_awscdk_services_ec2_Protocol_()
	 * @generated
	 * @ordered
	 */
	protected Protocol protocol_software_amazon_awscdk_services_ec2_Protocol_ = PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PROTOCOL__EDEFAULT;

	/**
	 * The default value of the '{@link #getStringRepresentation_java_lang_String_() <em>String Representation java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringRepresentation_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_REPRESENTATION_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStringRepresentation_java_lang_String_() <em>String Representation java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringRepresentation_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String stringRepresentation_java_lang_String_ = STRING_REPRESENTATION_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getFromPort_java_lang_Number_() <em>From Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromPort_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int FROM_PORT_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFromPort_java_lang_Number_() <em>From Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromPort_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int fromPort_java_lang_Number_ = FROM_PORT_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getToPort_java_lang_Number_() <em>To Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToPort_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int TO_PORT_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getToPort_java_lang_Number_() <em>To Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToPort_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int toPort_java_lang_Number_ = TO_PORT_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.Port";

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
	protected PortBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.Literals.PORT_BUILDER_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Protocol getProtocol_software_amazon_awscdk_services_ec2_Protocol_() {
		return protocol_software_amazon_awscdk_services_ec2_Protocol_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocol_software_amazon_awscdk_services_ec2_Protocol_(
			Protocol newProtocol_software_amazon_awscdk_services_ec2_Protocol_) {
		Protocol oldProtocol_software_amazon_awscdk_services_ec2_Protocol_ = protocol_software_amazon_awscdk_services_ec2_Protocol_;
		protocol_software_amazon_awscdk_services_ec2_Protocol_ = newProtocol_software_amazon_awscdk_services_ec2_Protocol_ == null
				? PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PROTOCOL__EDEFAULT
				: newProtocol_software_amazon_awscdk_services_ec2_Protocol_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.PORT_BUILDER_EC2__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PROTOCOL_,
					oldProtocol_software_amazon_awscdk_services_ec2_Protocol_,
					protocol_software_amazon_awscdk_services_ec2_Protocol_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStringRepresentation_java_lang_String_() {
		return stringRepresentation_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStringRepresentation_java_lang_String_(String newStringRepresentation_java_lang_String_) {
		String oldStringRepresentation_java_lang_String_ = stringRepresentation_java_lang_String_;
		stringRepresentation_java_lang_String_ = newStringRepresentation_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.PORT_BUILDER_EC2__STRING_REPRESENTATION_JAVA_LANG_STRING_,
					oldStringRepresentation_java_lang_String_, stringRepresentation_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFromPort_java_lang_Number_() {
		return fromPort_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromPort_java_lang_Number_(int newFromPort_java_lang_Number_) {
		int oldFromPort_java_lang_Number_ = fromPort_java_lang_Number_;
		fromPort_java_lang_Number_ = newFromPort_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.PORT_BUILDER_EC2__FROM_PORT_JAVA_LANG_NUMBER_, oldFromPort_java_lang_Number_,
					fromPort_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getToPort_java_lang_Number_() {
		return toPort_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToPort_java_lang_Number_(int newToPort_java_lang_Number_) {
		int oldToPort_java_lang_Number_ = toPort_java_lang_Number_;
		toPort_java_lang_Number_ = newToPort_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.PORT_BUILDER_EC2__TO_PORT_JAVA_LANG_NUMBER_, oldToPort_java_lang_Number_,
					toPort_java_lang_Number_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.PORT_BUILDER_EC2__VAR_NAME, oldVarName,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.PORT_BUILDER_EC2__IDENTIFIER,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.PORT_BUILDER_EC2__ADDITIONAL_CODE,
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
		case Ec2Package.PORT_BUILDER_EC2__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PROTOCOL_:
			return getProtocol_software_amazon_awscdk_services_ec2_Protocol_();
		case Ec2Package.PORT_BUILDER_EC2__STRING_REPRESENTATION_JAVA_LANG_STRING_:
			return getStringRepresentation_java_lang_String_();
		case Ec2Package.PORT_BUILDER_EC2__FROM_PORT_JAVA_LANG_NUMBER_:
			return getFromPort_java_lang_Number_();
		case Ec2Package.PORT_BUILDER_EC2__TO_PORT_JAVA_LANG_NUMBER_:
			return getToPort_java_lang_Number_();
		case Ec2Package.PORT_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case Ec2Package.PORT_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case Ec2Package.PORT_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case Ec2Package.PORT_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.PORT_BUILDER_EC2__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PROTOCOL_:
			setProtocol_software_amazon_awscdk_services_ec2_Protocol_((Protocol) newValue);
			return;
		case Ec2Package.PORT_BUILDER_EC2__STRING_REPRESENTATION_JAVA_LANG_STRING_:
			setStringRepresentation_java_lang_String_((String) newValue);
			return;
		case Ec2Package.PORT_BUILDER_EC2__FROM_PORT_JAVA_LANG_NUMBER_:
			setFromPort_java_lang_Number_((Integer) newValue);
			return;
		case Ec2Package.PORT_BUILDER_EC2__TO_PORT_JAVA_LANG_NUMBER_:
			setToPort_java_lang_Number_((Integer) newValue);
			return;
		case Ec2Package.PORT_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case Ec2Package.PORT_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case Ec2Package.PORT_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.PORT_BUILDER_EC2__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PROTOCOL_:
			setProtocol_software_amazon_awscdk_services_ec2_Protocol_(
					PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PROTOCOL__EDEFAULT);
			return;
		case Ec2Package.PORT_BUILDER_EC2__STRING_REPRESENTATION_JAVA_LANG_STRING_:
			setStringRepresentation_java_lang_String_(STRING_REPRESENTATION_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.PORT_BUILDER_EC2__FROM_PORT_JAVA_LANG_NUMBER_:
			setFromPort_java_lang_Number_(FROM_PORT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case Ec2Package.PORT_BUILDER_EC2__TO_PORT_JAVA_LANG_NUMBER_:
			setToPort_java_lang_Number_(TO_PORT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case Ec2Package.PORT_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case Ec2Package.PORT_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case Ec2Package.PORT_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.PORT_BUILDER_EC2__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PROTOCOL_:
			return protocol_software_amazon_awscdk_services_ec2_Protocol_ != PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PROTOCOL__EDEFAULT;
		case Ec2Package.PORT_BUILDER_EC2__STRING_REPRESENTATION_JAVA_LANG_STRING_:
			return STRING_REPRESENTATION_JAVA_LANG_STRING__EDEFAULT == null
					? stringRepresentation_java_lang_String_ != null
					: !STRING_REPRESENTATION_JAVA_LANG_STRING__EDEFAULT.equals(stringRepresentation_java_lang_String_);
		case Ec2Package.PORT_BUILDER_EC2__FROM_PORT_JAVA_LANG_NUMBER_:
			return fromPort_java_lang_Number_ != FROM_PORT_JAVA_LANG_NUMBER__EDEFAULT;
		case Ec2Package.PORT_BUILDER_EC2__TO_PORT_JAVA_LANG_NUMBER_:
			return toPort_java_lang_Number_ != TO_PORT_JAVA_LANG_NUMBER__EDEFAULT;
		case Ec2Package.PORT_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case Ec2Package.PORT_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case Ec2Package.PORT_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case Ec2Package.PORT_BUILDER_EC2__ADDITIONAL_CODE:
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
		result.append(" (protocol_software_amazon_awscdk_services_ec2_Protocol_: ");
		result.append(protocol_software_amazon_awscdk_services_ec2_Protocol_);
		result.append(", stringRepresentation_java_lang_String_: ");
		result.append(stringRepresentation_java_lang_String_);
		result.append(", fromPort_java_lang_Number_: ");
		result.append(fromPort_java_lang_Number_);
		result.append(", toPort_java_lang_Number_: ");
		result.append(toPort_java_lang_Number_);
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

} //PortBuilder_ec2Impl
