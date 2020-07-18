/**
 */
package ec2.impl;

import ec2.Ec2Package;
import ec2.GatewayConfigBuilder_ec2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gateway Config Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ec2.impl.GatewayConfigBuilder_ec2Impl#getAz_java_lang_String_ <em>Az java lang String </em>}</li>
 *   <li>{@link ec2.impl.GatewayConfigBuilder_ec2Impl#getGatewayId_java_lang_String_ <em>Gateway Id java lang String </em>}</li>
 *   <li>{@link ec2.impl.GatewayConfigBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.impl.GatewayConfigBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.impl.GatewayConfigBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.impl.GatewayConfigBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GatewayConfigBuilder_ec2Impl extends MinimalEObjectImpl.Container implements GatewayConfigBuilder_ec2 {
	/**
	 * The default value of the '{@link #getAz_java_lang_String_() <em>Az java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAz_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String AZ_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAz_java_lang_String_() <em>Az java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAz_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String az_java_lang_String_ = AZ_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGatewayId_java_lang_String_() <em>Gateway Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String GATEWAY_ID_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGatewayId_java_lang_String_() <em>Gateway Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String gatewayId_java_lang_String_ = GATEWAY_ID_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.GatewayConfig";

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
	protected GatewayConfigBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.Literals.GATEWAY_CONFIG_BUILDER_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAz_java_lang_String_() {
		return az_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAz_java_lang_String_(String newAz_java_lang_String_) {
		String oldAz_java_lang_String_ = az_java_lang_String_;
		az_java_lang_String_ = newAz_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.GATEWAY_CONFIG_BUILDER_EC2__AZ_JAVA_LANG_STRING_, oldAz_java_lang_String_,
					az_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGatewayId_java_lang_String_() {
		return gatewayId_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGatewayId_java_lang_String_(String newGatewayId_java_lang_String_) {
		String oldGatewayId_java_lang_String_ = gatewayId_java_lang_String_;
		gatewayId_java_lang_String_ = newGatewayId_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.GATEWAY_CONFIG_BUILDER_EC2__GATEWAY_ID_JAVA_LANG_STRING_, oldGatewayId_java_lang_String_,
					gatewayId_java_lang_String_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.GATEWAY_CONFIG_BUILDER_EC2__VAR_NAME,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.GATEWAY_CONFIG_BUILDER_EC2__IDENTIFIER,
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
					Ec2Package.GATEWAY_CONFIG_BUILDER_EC2__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ec2Package.GATEWAY_CONFIG_BUILDER_EC2__AZ_JAVA_LANG_STRING_:
			return getAz_java_lang_String_();
		case Ec2Package.GATEWAY_CONFIG_BUILDER_EC2__GATEWAY_ID_JAVA_LANG_STRING_:
			return getGatewayId_java_lang_String_();
		case Ec2Package.GATEWAY_CONFIG_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case Ec2Package.GATEWAY_CONFIG_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case Ec2Package.GATEWAY_CONFIG_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case Ec2Package.GATEWAY_CONFIG_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.GATEWAY_CONFIG_BUILDER_EC2__AZ_JAVA_LANG_STRING_:
			setAz_java_lang_String_((String) newValue);
			return;
		case Ec2Package.GATEWAY_CONFIG_BUILDER_EC2__GATEWAY_ID_JAVA_LANG_STRING_:
			setGatewayId_java_lang_String_((String) newValue);
			return;
		case Ec2Package.GATEWAY_CONFIG_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case Ec2Package.GATEWAY_CONFIG_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case Ec2Package.GATEWAY_CONFIG_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.GATEWAY_CONFIG_BUILDER_EC2__AZ_JAVA_LANG_STRING_:
			setAz_java_lang_String_(AZ_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.GATEWAY_CONFIG_BUILDER_EC2__GATEWAY_ID_JAVA_LANG_STRING_:
			setGatewayId_java_lang_String_(GATEWAY_ID_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.GATEWAY_CONFIG_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case Ec2Package.GATEWAY_CONFIG_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case Ec2Package.GATEWAY_CONFIG_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.GATEWAY_CONFIG_BUILDER_EC2__AZ_JAVA_LANG_STRING_:
			return AZ_JAVA_LANG_STRING__EDEFAULT == null ? az_java_lang_String_ != null
					: !AZ_JAVA_LANG_STRING__EDEFAULT.equals(az_java_lang_String_);
		case Ec2Package.GATEWAY_CONFIG_BUILDER_EC2__GATEWAY_ID_JAVA_LANG_STRING_:
			return GATEWAY_ID_JAVA_LANG_STRING__EDEFAULT == null ? gatewayId_java_lang_String_ != null
					: !GATEWAY_ID_JAVA_LANG_STRING__EDEFAULT.equals(gatewayId_java_lang_String_);
		case Ec2Package.GATEWAY_CONFIG_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case Ec2Package.GATEWAY_CONFIG_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case Ec2Package.GATEWAY_CONFIG_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case Ec2Package.GATEWAY_CONFIG_BUILDER_EC2__ADDITIONAL_CODE:
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
		result.append(" (az_java_lang_String_: ");
		result.append(az_java_lang_String_);
		result.append(", gatewayId_java_lang_String_: ");
		result.append(gatewayId_java_lang_String_);
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

} //GatewayConfigBuilder_ec2Impl
