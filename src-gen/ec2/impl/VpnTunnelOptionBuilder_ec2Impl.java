/**
 */
package ec2.impl;

import ec2.Ec2Package;
import ec2.VpnTunnelOptionBuilder_ec2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vpn Tunnel Option Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ec2.impl.VpnTunnelOptionBuilder_ec2Impl#getPreSharedKey_java_lang_String_ <em>Pre Shared Key java lang String </em>}</li>
 *   <li>{@link ec2.impl.VpnTunnelOptionBuilder_ec2Impl#getTunnelInsideCidr_java_lang_String_ <em>Tunnel Inside Cidr java lang String </em>}</li>
 *   <li>{@link ec2.impl.VpnTunnelOptionBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.impl.VpnTunnelOptionBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.impl.VpnTunnelOptionBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.impl.VpnTunnelOptionBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VpnTunnelOptionBuilder_ec2Impl extends MinimalEObjectImpl.Container implements VpnTunnelOptionBuilder_ec2 {
	/**
	 * The default value of the '{@link #getPreSharedKey_java_lang_String_() <em>Pre Shared Key java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreSharedKey_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String PRE_SHARED_KEY_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreSharedKey_java_lang_String_() <em>Pre Shared Key java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreSharedKey_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String preSharedKey_java_lang_String_ = PRE_SHARED_KEY_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getTunnelInsideCidr_java_lang_String_() <em>Tunnel Inside Cidr java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTunnelInsideCidr_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String TUNNEL_INSIDE_CIDR_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTunnelInsideCidr_java_lang_String_() <em>Tunnel Inside Cidr java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTunnelInsideCidr_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String tunnelInsideCidr_java_lang_String_ = TUNNEL_INSIDE_CIDR_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.VpnTunnelOption";

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
	protected VpnTunnelOptionBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.Literals.VPN_TUNNEL_OPTION_BUILDER_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPreSharedKey_java_lang_String_() {
		return preSharedKey_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreSharedKey_java_lang_String_(String newPreSharedKey_java_lang_String_) {
		String oldPreSharedKey_java_lang_String_ = preSharedKey_java_lang_String_;
		preSharedKey_java_lang_String_ = newPreSharedKey_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.VPN_TUNNEL_OPTION_BUILDER_EC2__PRE_SHARED_KEY_JAVA_LANG_STRING_,
					oldPreSharedKey_java_lang_String_, preSharedKey_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTunnelInsideCidr_java_lang_String_() {
		return tunnelInsideCidr_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTunnelInsideCidr_java_lang_String_(String newTunnelInsideCidr_java_lang_String_) {
		String oldTunnelInsideCidr_java_lang_String_ = tunnelInsideCidr_java_lang_String_;
		tunnelInsideCidr_java_lang_String_ = newTunnelInsideCidr_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.VPN_TUNNEL_OPTION_BUILDER_EC2__TUNNEL_INSIDE_CIDR_JAVA_LANG_STRING_,
					oldTunnelInsideCidr_java_lang_String_, tunnelInsideCidr_java_lang_String_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.VPN_TUNNEL_OPTION_BUILDER_EC2__VAR_NAME,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.VPN_TUNNEL_OPTION_BUILDER_EC2__IDENTIFIER,
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
					Ec2Package.VPN_TUNNEL_OPTION_BUILDER_EC2__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ec2Package.VPN_TUNNEL_OPTION_BUILDER_EC2__PRE_SHARED_KEY_JAVA_LANG_STRING_:
			return getPreSharedKey_java_lang_String_();
		case Ec2Package.VPN_TUNNEL_OPTION_BUILDER_EC2__TUNNEL_INSIDE_CIDR_JAVA_LANG_STRING_:
			return getTunnelInsideCidr_java_lang_String_();
		case Ec2Package.VPN_TUNNEL_OPTION_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case Ec2Package.VPN_TUNNEL_OPTION_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case Ec2Package.VPN_TUNNEL_OPTION_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case Ec2Package.VPN_TUNNEL_OPTION_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.VPN_TUNNEL_OPTION_BUILDER_EC2__PRE_SHARED_KEY_JAVA_LANG_STRING_:
			setPreSharedKey_java_lang_String_((String) newValue);
			return;
		case Ec2Package.VPN_TUNNEL_OPTION_BUILDER_EC2__TUNNEL_INSIDE_CIDR_JAVA_LANG_STRING_:
			setTunnelInsideCidr_java_lang_String_((String) newValue);
			return;
		case Ec2Package.VPN_TUNNEL_OPTION_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case Ec2Package.VPN_TUNNEL_OPTION_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case Ec2Package.VPN_TUNNEL_OPTION_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.VPN_TUNNEL_OPTION_BUILDER_EC2__PRE_SHARED_KEY_JAVA_LANG_STRING_:
			setPreSharedKey_java_lang_String_(PRE_SHARED_KEY_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.VPN_TUNNEL_OPTION_BUILDER_EC2__TUNNEL_INSIDE_CIDR_JAVA_LANG_STRING_:
			setTunnelInsideCidr_java_lang_String_(TUNNEL_INSIDE_CIDR_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.VPN_TUNNEL_OPTION_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case Ec2Package.VPN_TUNNEL_OPTION_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case Ec2Package.VPN_TUNNEL_OPTION_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.VPN_TUNNEL_OPTION_BUILDER_EC2__PRE_SHARED_KEY_JAVA_LANG_STRING_:
			return PRE_SHARED_KEY_JAVA_LANG_STRING__EDEFAULT == null ? preSharedKey_java_lang_String_ != null
					: !PRE_SHARED_KEY_JAVA_LANG_STRING__EDEFAULT.equals(preSharedKey_java_lang_String_);
		case Ec2Package.VPN_TUNNEL_OPTION_BUILDER_EC2__TUNNEL_INSIDE_CIDR_JAVA_LANG_STRING_:
			return TUNNEL_INSIDE_CIDR_JAVA_LANG_STRING__EDEFAULT == null ? tunnelInsideCidr_java_lang_String_ != null
					: !TUNNEL_INSIDE_CIDR_JAVA_LANG_STRING__EDEFAULT.equals(tunnelInsideCidr_java_lang_String_);
		case Ec2Package.VPN_TUNNEL_OPTION_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case Ec2Package.VPN_TUNNEL_OPTION_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case Ec2Package.VPN_TUNNEL_OPTION_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case Ec2Package.VPN_TUNNEL_OPTION_BUILDER_EC2__ADDITIONAL_CODE:
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
		result.append(" (preSharedKey_java_lang_String_: ");
		result.append(preSharedKey_java_lang_String_);
		result.append(", tunnelInsideCidr_java_lang_String_: ");
		result.append(tunnelInsideCidr_java_lang_String_);
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

} //VpnTunnelOptionBuilder_ec2Impl
