/**
 */
package ec2.impl;

import ec2.AclIcmpBuilder_ec2;
import ec2.Ec2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acl Icmp Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ec2.impl.AclIcmpBuilder_ec2Impl#getCode_java_lang_Number_ <em>Code java lang Number </em>}</li>
 *   <li>{@link ec2.impl.AclIcmpBuilder_ec2Impl#getType_java_lang_Number_ <em>Type java lang Number </em>}</li>
 *   <li>{@link ec2.impl.AclIcmpBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.impl.AclIcmpBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.impl.AclIcmpBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.impl.AclIcmpBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AclIcmpBuilder_ec2Impl extends MinimalEObjectImpl.Container implements AclIcmpBuilder_ec2 {
	/**
	 * The default value of the '{@link #getCode_java_lang_Number_() <em>Code java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int CODE_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCode_java_lang_Number_() <em>Code java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int code_java_lang_Number_ = CODE_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getType_java_lang_Number_() <em>Type java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int TYPE_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getType_java_lang_Number_() <em>Type java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int type_java_lang_Number_ = TYPE_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.AclIcmp";

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
	protected AclIcmpBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.Literals.ACL_ICMP_BUILDER_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCode_java_lang_Number_() {
		return code_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode_java_lang_Number_(int newCode_java_lang_Number_) {
		int oldCode_java_lang_Number_ = code_java_lang_Number_;
		code_java_lang_Number_ = newCode_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.ACL_ICMP_BUILDER_EC2__CODE_JAVA_LANG_NUMBER_, oldCode_java_lang_Number_,
					code_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getType_java_lang_Number_() {
		return type_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType_java_lang_Number_(int newType_java_lang_Number_) {
		int oldType_java_lang_Number_ = type_java_lang_Number_;
		type_java_lang_Number_ = newType_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.ACL_ICMP_BUILDER_EC2__TYPE_JAVA_LANG_NUMBER_, oldType_java_lang_Number_,
					type_java_lang_Number_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.ACL_ICMP_BUILDER_EC2__VAR_NAME, oldVarName,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.ACL_ICMP_BUILDER_EC2__IDENTIFIER,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.ACL_ICMP_BUILDER_EC2__ADDITIONAL_CODE,
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
		case Ec2Package.ACL_ICMP_BUILDER_EC2__CODE_JAVA_LANG_NUMBER_:
			return getCode_java_lang_Number_();
		case Ec2Package.ACL_ICMP_BUILDER_EC2__TYPE_JAVA_LANG_NUMBER_:
			return getType_java_lang_Number_();
		case Ec2Package.ACL_ICMP_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case Ec2Package.ACL_ICMP_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case Ec2Package.ACL_ICMP_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case Ec2Package.ACL_ICMP_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.ACL_ICMP_BUILDER_EC2__CODE_JAVA_LANG_NUMBER_:
			setCode_java_lang_Number_((Integer) newValue);
			return;
		case Ec2Package.ACL_ICMP_BUILDER_EC2__TYPE_JAVA_LANG_NUMBER_:
			setType_java_lang_Number_((Integer) newValue);
			return;
		case Ec2Package.ACL_ICMP_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case Ec2Package.ACL_ICMP_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case Ec2Package.ACL_ICMP_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.ACL_ICMP_BUILDER_EC2__CODE_JAVA_LANG_NUMBER_:
			setCode_java_lang_Number_(CODE_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case Ec2Package.ACL_ICMP_BUILDER_EC2__TYPE_JAVA_LANG_NUMBER_:
			setType_java_lang_Number_(TYPE_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case Ec2Package.ACL_ICMP_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case Ec2Package.ACL_ICMP_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case Ec2Package.ACL_ICMP_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.ACL_ICMP_BUILDER_EC2__CODE_JAVA_LANG_NUMBER_:
			return code_java_lang_Number_ != CODE_JAVA_LANG_NUMBER__EDEFAULT;
		case Ec2Package.ACL_ICMP_BUILDER_EC2__TYPE_JAVA_LANG_NUMBER_:
			return type_java_lang_Number_ != TYPE_JAVA_LANG_NUMBER__EDEFAULT;
		case Ec2Package.ACL_ICMP_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case Ec2Package.ACL_ICMP_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case Ec2Package.ACL_ICMP_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case Ec2Package.ACL_ICMP_BUILDER_EC2__ADDITIONAL_CODE:
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
		result.append(" (code_java_lang_Number_: ");
		result.append(code_java_lang_Number_);
		result.append(", type_java_lang_Number_: ");
		result.append(type_java_lang_Number_);
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

} //AclIcmpBuilder_ec2Impl
